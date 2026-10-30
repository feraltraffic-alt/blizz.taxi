package taxi.blizz.payments.internal;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.audit.AuditEntry;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.payments.PaymentReconciliations;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.ConflictException;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;

@Service
class JdbcPaymentReconciliations implements PaymentReconciliations {
    private static final String LIST_SQL = """
            select r.* from payment_merchant m
            join lateral (
                select r.* from payment_reconciliation r where r.merchant_id=m.id
                    and (cast(:afterDay as date) is null
                         or (r.day,r.id)<(cast(:afterDay as date),cast(:afterId as uuid)))
                order by r.day desc,r.id desc limit :limit
            ) r on true
            where (cast(:merchant as uuid) is null or m.id=:merchant)
                and (:allCities or (
                    exists(select 1 from payment_merchant_city c where c.merchant_id=m.id)
                    and not exists(select 1 from payment_merchant_city c where c.merchant_id=m.id
                                   and c.city_id not in (:cities))))
            order by r.day desc,r.id desc limit :limit
            """;
    private final JdbcClient jdbc;
    private final StaffAccess staff;
    private final IdempotentCommands commands;
    private final AuditLog audit;
    private final Clock clock;

    JdbcPaymentReconciliations(JdbcClient jdbc, StaffAccess staff, IdempotentCommands commands, AuditLog audit, Clock clock) {
        this.jdbc=jdbc; this.staff=staff; this.commands=commands; this.audit=audit; this.clock=clock;
    }

    @Override
    @Transactional(readOnly=true)
    public Runs list(Actor actor, UUID merchantId, String cursor, int limit) {
        staff.require(actor, RESOLVE_PERMISSION);
        pageSize(limit);
        // Newest day first, as the contract says (audit 29.10.2026: the pages went by a random id). Cursor: day|id.
        java.time.LocalDate afterDay = null;
        UUID afterId = null;
        if (cursor != null) {
            String[] parts = cursor.split("\\|", -1);
            try {
                if (parts.length != 2) throw new IllegalArgumentException();
                afterDay=java.time.LocalDate.parse(parts[0]);
                afterId=UUID.fromString(parts[1]);
            } catch (RuntimeException ignored) { throw invalid("Invalid cursor"); }
        }
        if (merchantId != null) requireMerchant(actor, merchantId);
        StaffAccess.Scope scope = staff.scope(actor, RESOLVE_PERMISSION);
        if (!scope.allCities() && scope.cityIds().isEmpty()) return new Runs(List.of(),null);
        // A merchant's bank statement spans every mapped city; partial city access is insufficient.
        List<UUID> cities = scope.cityIds().isEmpty() ? List.of(new UUID(0,0)) : List.copyOf(scope.cityIds());
        var query=jdbc.sql(LIST_SQL).param("merchant", merchantId).param("afterDay", afterDay).param("afterId", afterId)
                .param("allCities", scope.allCities())
                .param("cities", cities).param("limit", limit+1).query(JdbcPaymentReconciliations::mapRun).list();
        boolean more=query.size()>limit;
        List<Run> page=more?query.subList(0,limit):query;
        return new Runs(page, more?page.getLast().day()+"|"+page.getLast().id():null);
    }

    @Override
    @Transactional(readOnly=true)
    public Detail get(Actor actor, UUID runId, UUID after, int limit) {
        staff.require(actor, RESOLVE_PERMISSION);
        pageSize(limit);
        Run run=run(runId);
        requireMerchant(actor,run.merchantId());
        List<Item> rows=jdbc.sql("""
                select * from payment_reconciliation_item where run_id=:run
                  and (cast(:after as uuid) is null or id>:after) order by id limit :limit
                """).param("run",runId).param("after",after).param("limit",limit+1)
                .query(JdbcPaymentReconciliations::mapItem).list();
        boolean more=rows.size()>limit;
        List<Item> page=more?rows.subList(0,limit):rows;
        return new Detail(run,page,more?page.getLast().id():null);
    }

    record ResolveRequest(UUID itemId, long expectedVersion, Decision decision, String reason) { }

    @Override
    public Item resolve(Actor actor, UUID commandId, UUID itemId, long expectedVersion, Decision decision, String reason) {
        staff.require(actor,RESOLVE_PERMISSION);
        UUID runId=jdbc.sql("select run_id from payment_reconciliation_item where id=:id").param("id",itemId)
                .query(UUID.class).optional().orElseThrow(()->missing("Reconciliation item not found"));
        Run run=run(runId);
        requireMerchant(actor,run.merchantId()); // Before even an idempotent replay.
        if (commandId==null || decision==null || expectedVersion<0 || reason==null || reason.isBlank() || reason.length()>500) {
            throw invalid("A decision and a reason of 1–500 characters are required");
        }
        String originalReason=reason.strip();
        return commands.execute(new CommandKey(actor,"payment-reconciliation.resolve",commandId),
                new ResolveRequest(itemId,expectedVersion,decision,originalReason),Item.class,()->{
                    // All paths lock the run before its item: concurrent last-item decisions cannot lose the count.
                    jdbc.sql("select id from payment_reconciliation where id=:id for update").param("id",runId)
                            .query(UUID.class).single();
                    Item before=jdbc.sql("select * from payment_reconciliation_item where id=:id for update")
                            .param("id",itemId).query(JdbcPaymentReconciliations::mapItem).single();
                    if (!"OPEN".equals(before.state())) throw conflict("Item was already resolved");
                    if (before.version()!=expectedVersion) throw ConflictException.version(before.version(),"Item version changed");
                    String safeReason=safeReason(originalReason);
                    OffsetDateTime now=OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
                    jdbc.sql("""
                            update payment_reconciliation_item set state='RESOLVED',decision=:decision,reason=:reason,
                                resolved_by=:actor,resolved_at=:now,version=version+1 where id=:id
                            """).param("decision",decision.name()).param("reason",safeReason).param("actor",actor.id())
                            .param("now",now).param("id",itemId).update();
                    jdbc.sql("""
                            update payment_reconciliation set open_count=open_count-1,
                                state=case when open_count=1 then 'RESOLVED' else 'OPEN' end,
                                updated_at=:now,version=version+1 where id=:id
                            """).param("now",now).param("id",runId).update();
                    Item after=jdbc.sql("select * from payment_reconciliation_item where id=:id").param("id",itemId)
                            .query(JdbcPaymentReconciliations::mapItem).single();
                    audit.record(new AuditEntry(actor,"payment-reconciliation.resolve","payment_reconciliation_item",
                            itemId.toString(),safeReason,Map.of("state",before.state(),"version",before.version()),
                            Map.of("state",after.state(),"decision",decision.name(),"run_id",runId.toString())));
                    return after;
                });
    }

    void requireMerchant(Actor actor, UUID merchantId) {
        staff.require(actor,RESOLVE_PERMISSION);
        List<UUID> cities=jdbc.sql("select city_id from payment_merchant_city where merchant_id=:id order by city_id")
                .param("id",merchantId).query(UUID.class).list();
        if (cities.isEmpty() && !staff.scope(actor,RESOLVE_PERMISSION).allCities()) {
            throw new DomainException(ErrorCode.ACCESS_DENIED,"All-city access is required for an unmapped merchant");
        }
        staff.require(actor,RESOLVE_PERMISSION,cities.toArray(UUID[]::new));
    }

    Run run(UUID id) {
        return jdbc.sql("select * from payment_reconciliation where id=:id").param("id",id)
                .query(JdbcPaymentReconciliations::mapRun).optional().orElseThrow(()->missing("Reconciliation not found"));
    }

    private static void pageSize(int size) { if (size<1 || size>200) throw invalid("Limit must be between 1 and 200"); }
    private static DomainException invalid(String message) { return new DomainException(ErrorCode.VALIDATION_FAILED,message); }
    private static DomainException missing(String message) { return new DomainException(ErrorCode.NOT_FOUND,message); }
    private static DomainException conflict(String message) { return new DomainException(ErrorCode.STATE_CONFLICT,message); }
    private static String safeReason(String reason) {
        // Reasons remain useful without retaining pasted phones, PANs or provider card masks.
        String safe=reason.replaceAll("(?i)(?<![a-z0-9])(?:\\+|00)?[0-9][0-9 ()-]{7,}[0-9](?![a-z0-9])", "[redacted]")
                .replaceAll("(?i)[0-9]{0,6}[*x•]{2,}[0-9*x•]{2,}","[redacted]");
        return safe.length()>500?safe.substring(0,500):safe;
    }

    static Run mapRun(ResultSet rs,int row) throws SQLException {
        return new Run(rs.getObject("id",UUID.class),rs.getObject("merchant_id",UUID.class),
                rs.getObject("day",java.time.LocalDate.class),time(rs,"period_from"),time(rs,"period_to"),
                time(rs,"observed_until"),rs.getBoolean("partial"),rs.getString("state"),
                rs.getObject("local_count",Integer.class),rs.getObject("provider_count",Integer.class),
                rs.getObject("item_count",Integer.class),rs.getObject("open_count",Integer.class),rs.getString("failure_code"),
                rs.getInt("attempts"),time(rs,"created_at"),time(rs,"updated_at"),time(rs,"finished_at"),rs.getLong("version"));
    }
    static Item mapItem(ResultSet rs,int row) throws SQLException {
        String decision=rs.getString("decision");
        return new Item(rs.getObject("id",UUID.class),rs.getObject("run_id",UUID.class),Kind.valueOf(rs.getString("kind")),
                rs.getString("reference_fingerprint"),rs.getString("reference_display"),rs.getObject("local_operation_id",UUID.class),rs.getObject("local_record_id",UUID.class),rs.getString("local_type"),
                rs.getString("local_state"),rs.getObject("local_amount_minor",Long.class),rs.getString("local_currency"),
                rs.getString("provider_type"),rs.getString("provider_state"),rs.getString("provider_status"),
                rs.getObject("provider_amount_minor",Long.class),rs.getString("provider_currency"),rs.getObject("fee_minor",Long.class),
                time(rs,"provider_at"),rs.getString("state"),decision==null?null:Decision.valueOf(decision),rs.getString("reason"),
                rs.getObject("resolved_by",UUID.class),time(rs,"resolved_at"),rs.getLong("version"));
    }
    private static OffsetDateTime time(ResultSet rs,String column) throws SQLException { return rs.getObject(column,OffsetDateTime.class); }
}
