package taxi.blizz.backoffice.internal;

import java.time.Clock;
import java.time.Duration;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.audit.AuditEntry;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.backoffice.ReportExports;
import taxi.blizz.finance.FinanceReports;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.identity.StaffPermissions;
import taxi.blizz.operations.OrderReports;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;
import taxi.blizz.platform.PageCursor;
import taxi.blizz.platform.SubjectType;

/** See {@link ReportExports}. Jobs are taken with SKIP LOCKED, so every instance may run the worker. */
@Service
class JdbcReportExports implements ReportExports {

    private static final Logger log = LoggerFactory.getLogger(JdbcReportExports.class);
    static final int MAX_DAYS = 92;
    /** A job left RUNNING longer than this (the instance stopped) is taken again. */
    static final Duration STUCK = Duration.ofMinutes(10);
    static final int MAX_ATTEMPTS = 3;

    private final JdbcClient jdbc;
    private final IdempotentCommands commands;
    private final StaffAccess staff;
    private final AuditLog audit;
    private final OrderReports orderReports;
    private final FinanceReports financeReports;
    private final TransactionTemplate tx;
    private final Clock clock;
    private final Duration keep;

    JdbcReportExports(JdbcClient jdbc, IdempotentCommands commands, StaffAccess staff, AuditLog audit,
                      OrderReports orderReports, FinanceReports financeReports, TransactionTemplate tx, Clock clock,
                      @Value("${blizz.reports.export-keep:PT24H}") Duration keep) {
        this.jdbc = jdbc;
        this.commands = commands;
        this.staff = staff;
        this.audit = audit;
        this.orderReports = orderReports;
        this.financeReports = financeReports;
        this.tx = tx;
        this.clock = clock;
        this.keep = keep;
    }

    private static final String SELECT = """
            select id, kind, city_id, date_from, date_to, state, file_name, row_count, error, created_at, ready_at,
                   expires_at
            from report_export
            """;

    record Request(Kind kind, UUID cityId, LocalDate from, LocalDate to) {
    }

    @Override
    public Export request(Actor actor, UUID commandId, Kind kind, UUID cityId, LocalDate from, LocalDate to) {
        if (kind == null || cityId == null || from == null || to == null) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "kind, city_id, from and to are required");
        }
        staff.require(actor, StaffPermissions.REPORTS_VIEW, cityId);
        if (to.isBefore(from) || ChronoUnit.DAYS.between(from, to) >= MAX_DAYS) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED,
                    "The period is from ≤ to, at most " + MAX_DAYS + " days");
        }
        return commands.execute(new CommandKey(actor, "report.export", commandId),
                new Request(kind, cityId, from, to), Export.class, () -> {
                    UUID id = UUID.randomUUID();
                    jdbc.sql("""
                                    insert into report_export (id, kind, city_id, date_from, date_to, requested_by,
                                                               state, created_at)
                                    values (:id, :kind, :city, :from, :to, :by, 'PENDING', :now)""")
                            .param("id", id).param("kind", kind.name()).param("city", cityId).param("from", from)
                            .param("to", to).param("by", actor.id()).param("now", now()).update();
                    audit.record(new AuditEntry(actor, "report.export.request", "report_export", id.toString(),
                            null, null, Map.of("kind", kind.name(), "city_id", cityId.toString(),
                            "from", from.toString(), "to", to.toString())));
                    return find(id).orElseThrow();
                });
    }

    @Override
    @Transactional(readOnly = true)
    public List<Export> mine(Actor actor, PageCursor after, int limit) {
        requireStaff(actor);
        return jdbc.sql(SELECT + """
                        where requested_by = :by
                          and (cast(:afterAt as timestamptz) is null
                               or (created_at, id) < (:afterAt, cast(:afterId as uuid)))
                        order by created_at desc, id desc limit :limit""")
                .param("by", actor.id())
                .param("afterAt", after == null ? null : after.time(0))
                .param("afterId", after == null ? null : after.id(1))
                .param("limit", Math.max(1, Math.min(limit, PageCursor.MAX_FETCH)))
                .query((rs, i) -> export(rs)).list();
    }

    @Override
    @Transactional(readOnly = true)
    public Export get(Actor actor, UUID exportId) {
        return own(actor, exportId);
    }

    @Override
    @Transactional
    public File download(Actor actor, UUID exportId) {
        Export export = own(actor, exportId);
        // The rights may have been taken away since the request (REQ-ADM-07).
        staff.require(actor, StaffPermissions.REPORTS_VIEW, export.cityId());
        if (!"READY".equals(export.state()) || !export.expiresAt().isAfter(now())) {
            throw new DomainException(ErrorCode.STATE_CONFLICT, "The export is " + ("READY".equals(export.state())
                    ? "EXPIRED" : export.state()) + ", there is no file to download");
        }
        byte[] content = jdbc.sql("select content from report_export where id = :id").param("id", exportId)
                .query(byte[].class).single();
        audit.record(new AuditEntry(actor, "report.export.download", "report_export", exportId.toString(), null,
                null, Map.of("kind", export.kind().name(), "city_id", export.cityId().toString())));
        return new File(export.fileName(), content);
    }

    // ---------------------------------------------------------------- the worker

    private record Job(UUID id, Kind kind, UUID cityId, LocalDate from, LocalDate to, UUID requestedBy) {
    }

    @Override
    public int buildPending(int max) {
        int taken = 0;
        while (taken < max) {
            Optional<Job> job = tx.execute(s -> claim());
            if (job == null || job.isEmpty()) {
                break;
            }
            taken++;
            build(job.get());
        }
        return taken;
    }

    @Scheduled(fixedDelayString = "${blizz.reports.export-poll:PT5S}",
            initialDelayString = "${blizz.reports.export-poll:PT5S}")
    void work() {
        buildPending(10);
        expire();
    }

    private Optional<Job> claim() {
        OffsetDateTime now = now();
        jdbc.sql("""
                        update report_export set state = 'FAILED', error = :error, started_at = null
                        where state = 'RUNNING' and started_at < :stuck and attempts >= :max""")
                .param("error", "Stopped after " + MAX_ATTEMPTS + " attempts").param("stuck", now.minus(STUCK))
                .param("max", MAX_ATTEMPTS).update();
        Optional<Job> job = jdbc.sql("""
                        select id, kind, city_id, date_from, date_to, requested_by from report_export
                        where state = 'PENDING' or (state = 'RUNNING' and started_at < :stuck)
                        order by created_at limit 1 for update skip locked""")
                .param("stuck", now.minus(STUCK))
                .query((rs, i) -> new Job(rs.getObject("id", UUID.class), Kind.valueOf(rs.getString("kind")),
                        rs.getObject("city_id", UUID.class), rs.getObject("date_from", LocalDate.class),
                        rs.getObject("date_to", LocalDate.class), rs.getObject("requested_by", UUID.class)))
                .optional();
        job.ifPresent(j -> jdbc.sql("""
                        update report_export set state = 'RUNNING', attempts = attempts + 1, started_at = :now
                        where id = :id""").param("now", now).param("id", j.id()).update());
        return job;
    }

    /** Built with the rights of the one who asked: a right taken away meanwhile fails the export. */
    private void build(Job job) {
        Actor requester = new Actor(SubjectType.STAFF, job.requestedBy());
        Csv csv;
        try {
            csv = job.kind() == Kind.ORDERS
                    ? orders(orderReports.orders(requester, job.cityId(), job.from(), job.to()))
                    : money(financeReports.money(requester, job.cityId(), job.from(), job.to()));
        } catch (DomainException e) {
            tx.executeWithoutResult(s -> finish(job.id(), "FAILED", null, null, 0, e.getMessage()));
            return;
        } catch (RuntimeException e) {
            // Left RUNNING: taken again after STUCK, up to MAX_ATTEMPTS.
            log.warn("Report export {} failed, will retry", job.id(), e);
            return;
        }
        String name = job.kind().name().toLowerCase() + "_" + job.from() + "_" + job.to() + ".csv";
        Csv built = csv;
        tx.executeWithoutResult(s -> finish(job.id(), "READY", name, built.bytes(), built.rows() - 1, null));
    }

    private void finish(UUID id, String state, String name, byte[] content, int rows, String error) {
        OffsetDateTime now = now();
        jdbc.sql("""
                        update report_export set state = :state, file_name = :name, content = :content,
                                                 row_count = :rows, error = :error, ready_at = :ready,
                                                 expires_at = :expires
                        where id = :id""")
                .param("state", state).param("name", name).param("content", content)
                .param("rows", "READY".equals(state) ? rows : null).param("error", error)
                .param("ready", "READY".equals(state) ? now : null)
                .param("expires", "READY".equals(state) ? now.plus(keep) : null).param("id", id).update();
    }

    @Override
    @Transactional
    public int expire() {
        return jdbc.sql("""
                        update report_export set state = 'EXPIRED', content = null
                        where state = 'READY' and expires_at <= :now""")
                .param("now", now()).update();
    }

    // ---------------------------------------------------------------- the files

    static final List<String> CHANNELS = List.of("APP", "PHONE", "WEB");
    static final List<String> PAYMENTS = List.of("CASH", "CARD", "TERMINAL", "SERVICE");
    static final List<String> CANCELLERS = List.of("RIDER", "DRIVER", "STAFF");

    static Csv orders(OrderReports.Report report) {
        List<Object> header = new ArrayList<>(List.of("date", "created", "fulfilled", "cancelled", "unfulfilled",
                "open"));
        CHANNELS.forEach(c -> header.add("channel_" + c.toLowerCase()));
        PAYMENTS.forEach(p -> header.add("payment_" + p.toLowerCase()));
        CANCELLERS.forEach(c -> header.add("cancelled_by_" + c.toLowerCase()));
        Csv csv = new Csv().row(header);
        report.days().forEach(d -> csv.row(orderRow(d.date().toString(), d.counts())));
        return csv.row(orderRow("total", report.total()));
    }

    private static List<Object> orderRow(String label, OrderReports.Counts c) {
        List<Object> row = new ArrayList<>(List.of(label, c.created(), c.fulfilled(), c.cancelled(), c.unfulfilled(),
                c.open()));
        CHANNELS.forEach(k -> row.add(c.byChannel().getOrDefault(k, 0)));
        PAYMENTS.forEach(k -> row.add(c.byPayment().getOrDefault(k, 0)));
        CANCELLERS.forEach(k -> row.add(c.cancelledBy().getOrDefault(k, 0)));
        return row;
    }

    static Csv money(FinanceReports.Report report) {
        Csv csv = new Csv().row(List.of("date", "currency", "trips", "fares", "service_rides", "commission",
                "driver_share", "discounts", "bonuses_granted", "paid_by_card", "paid_with_bonuses",
                "collected_by_drivers", "tips", "rider_debt_change"));
        report.days().forEach(d -> csv.row(moneyRow(d.date().toString(), report.currency(), d.figures())));
        return csv.row(moneyRow("total", report.currency(), report.total()));
    }

    private static List<Object> moneyRow(String label, String currency, FinanceReports.Figures f) {
        return List.of(label, currency, f.trips(), Csv.major(f.faresMinor(), currency),
                Csv.major(f.serviceRidesMinor(), currency), Csv.major(f.commissionMinor(), currency),
                Csv.major(f.driverShareMinor(), currency), Csv.major(f.discountsMinor(), currency),
                Csv.major(f.bonusesGrantedMinor(), currency), Csv.major(f.paidByCardMinor(), currency),
                Csv.major(f.paidWithBonusesMinor(), currency), Csv.major(f.collectedByDriversMinor(), currency),
                Csv.major(f.tipsMinor(), currency), Csv.major(f.riderDebtChangeMinor(), currency));
    }

    // ---------------------------------------------------------------- helpers

    private Export own(Actor actor, UUID exportId) {
        requireStaff(actor);
        return jdbc.sql(SELECT + "where id = :id and requested_by = :by").param("id", exportId)
                .param("by", actor.id()).query((rs, i) -> export(rs)).optional()
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Export not found"));
    }

    private static void requireStaff(Actor actor) {
        if (actor == null || actor.type() != SubjectType.STAFF) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Staff only");
        }
    }

    private Optional<Export> find(UUID id) {
        return jdbc.sql(SELECT + "where id = :id").param("id", id).query((rs, i) -> export(rs)).optional();
    }

    private static Export export(java.sql.ResultSet rs) throws java.sql.SQLException {
        return new Export(rs.getObject("id", UUID.class), Kind.valueOf(rs.getString("kind")),
                rs.getObject("city_id", UUID.class), rs.getObject("date_from", LocalDate.class),
                rs.getObject("date_to", LocalDate.class), rs.getString("state"), rs.getString("file_name"),
                (Integer) rs.getObject("row_count"), rs.getString("error"),
                rs.getObject("created_at", OffsetDateTime.class), rs.getObject("ready_at", OffsetDateTime.class),
                rs.getObject("expires_at", OffsetDateTime.class));
    }

    private OffsetDateTime now() {
        return clock.instant().truncatedTo(ChronoUnit.MICROS).atOffset(ZoneOffset.UTC);
    }
}
