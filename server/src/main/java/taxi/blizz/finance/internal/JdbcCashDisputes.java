package taxi.blizz.finance.internal;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.audit.AuditEntry;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.finance.CashDisputes;
import taxi.blizz.finance.Ledger;
import taxi.blizz.finance.Ledger.Account;
import taxi.blizz.finance.Ledger.Line;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.ConflictException;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;
import taxi.blizz.platform.Outbox;
import taxi.blizz.platform.OutboxEvent;
import taxi.blizz.platform.PageCursor;

@Service
class JdbcCashDisputes implements CashDisputes {

    private static final String SELECT = """
            select order_id, driver_id, payer_client_id, currency, held_minor, rider_debt_minor, opened_at, decide_by,
                   decision, decided_by, reason, decided_at, version
            from cash_dispute""";

    private final JdbcClient jdbc;
    private final Ledger ledger;
    private final StaffAccess staff;
    private final IdempotentCommands commands;
    private final AuditLog audit;
    private final Outbox outbox;
    private final Clock clock;

    JdbcCashDisputes(JdbcClient jdbc, Ledger ledger, StaffAccess staff, IdempotentCommands commands, AuditLog audit,
                     Outbox outbox, Clock clock) {
        this.jdbc = jdbc;
        this.ledger = ledger;
        this.staff = staff;
        this.commands = commands;
        this.audit = audit;
        this.outbox = outbox;
        this.clock = clock;
    }

    /** Opens the dispute with the trip's posting, in its transaction; a redelivered trip opens nothing new. */
    @Transactional(propagation = Propagation.MANDATORY)
    void open(UUID orderId, UUID driverId, UUID payerClientId, String currency, long heldMinor, long riderDebtMinor) {
        OffsetDateTime now = now();
        jdbc.sql("""
                        insert into cash_dispute (order_id, driver_id, payer_client_id, currency, held_minor,
                                                  rider_debt_minor, opened_at, decide_by)
                        values (:order, :driver, :payer, :currency, :held, :debt, :now, :by)
                        on conflict (order_id) do nothing""")
                .param("order", orderId).param("driver", driverId).param("payer", payerClientId)
                .param("currency", currency).param("held", heldMinor).param("debt", riderDebtMinor)
                .param("now", now).param("by", now.plusDays(DECIDE_WITHIN_DAYS)).update();
    }

    @Override
    @Transactional(readOnly = true)
    public Dispute get(Actor actor, UUID orderId) {
        staff.require(actor, MANAGE_PERMISSION);
        staff.require(actor, MANAGE_PERMISSION, cityOf(orderId));
        return find(orderId, false);
    }

    /**
     * The order's city, for the staff member's city scope (audit 29.10.2026: finance of one city decided another's
     * disputes). Read from ride_order as ADR 0004 allows finance; null for an unknown order (find answers NOT_FOUND).
     */
    private UUID cityOf(UUID orderId) {
        return jdbc.sql("select city_id from ride_order where id = :id").param("id", orderId).query(UUID.class)
                .optional().orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Dispute> open(Actor actor, PageCursor after, int limit) {
        staff.require(actor, MANAGE_PERMISSION);
        StaffAccess.Scope scope = staff.scope(actor, MANAGE_PERMISSION);
        return jdbc.sql(SELECT + " " + """
                         where decision is null
                           and order_id in (select id from ride_order where city_id = any(:cities))
                           and (cast(:afterAt as timestamptz) is null
                                or (decide_by, order_id) > (:afterAt, cast(:afterId as uuid)))
                         order by decide_by, order_id limit :limit""")
                .param("cities", scope.cityIds().toArray(UUID[]::new))
                .param("afterAt", after == null ? null : after.time(0))
                .param("afterId", after == null ? null : after.id(1))
                .param("limit", Math.max(1, Math.min(limit, PageCursor.MAX_FETCH))).query((rs, i) -> map(rs)).list();
    }

    record DecideRequest(UUID orderId, long expectedVersion, Decision decision, String reason) {
    }

    @Override
    public Dispute decide(Actor actor, UUID commandId, UUID orderId, long expectedVersion, Decision decision,
                          String reason) {
        staff.require(actor, MANAGE_PERMISSION);
        staff.require(actor, MANAGE_PERMISSION, cityOf(orderId));
        if (decision == null) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "A decision is required");
        }
        if (reason == null || reason.isBlank()) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "A reason is required");
        }
        String why = reason.strip();
        return commands.execute(new CommandKey(actor, "cash-dispute.decide", commandId),
                new DecideRequest(orderId, expectedVersion, decision, why), Dispute.class, () -> {
                    Dispute d = find(orderId, true);
                    if (d.version() != expectedVersion) {
                        throw ConflictException.version(d.version(), "The dispute changed; reload it");
                    }
                    if (d.decision() != null) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT, "The dispute is decided already");
                    }
                    List<Line> lines = new ArrayList<>();
                    if (decision != Decision.KEEP_HELD && d.heldMinor() > 0) {
                        lines.add(Line.debit(Account.SUSPENSE, d.driverId(), d.heldMinor()));
                        lines.add(Line.credit(Account.DRIVER_PAYABLE, d.driverId(), d.heldMinor()));
                    }
                    if (decision == Decision.RIDER_PAID && d.riderDebtMinor() > 0) {
                        // The driver holds the rider's money, as on any cash trip reported as received.
                        lines.add(Line.debit(Account.DRIVER_PAYABLE, d.driverId(), d.riderDebtMinor()));
                        lines.add(Line.credit(Account.RIDER_RECEIVABLE, d.payerClientId(), d.riderDebtMinor()));
                    }
                    if (!lines.isEmpty()) {
                        ledger.post(new Ledger.Posting("cash-dispute:" + orderId, "CASH_DISPUTE", orderId,
                                d.currency(), "Cash dispute decided: " + decision, lines));
                    }
                    OffsetDateTime now = now();
                    jdbc.sql("""
                                    update cash_dispute set decision = :decision, decided_by = :by, reason = :reason,
                                                            decided_at = :now, version = version + 1
                                    where order_id = :order""")
                            .param("decision", decision.name()).param("by", actor.id()).param("reason", why)
                            .param("now", now).param("order", orderId).update();
                    audit.record(new AuditEntry(actor, "cash-dispute.decide", "cash_dispute", orderId.toString(), why,
                            Map.of("held_minor", d.heldMinor(), "rider_debt_minor", d.riderDebtMinor()),
                            Map.of("decision", decision.name())));
                    outbox.publish(new OutboxEvent(DECIDED, 1, "Order", orderId, 0, Map.of(
                            "order_id", orderId.toString(), "driver_id", d.driverId().toString(),
                            "decision", decision.name())));
                    return find(orderId, false);
                });
    }

    /** Disputes past their deadline, reported once each as an urgent task; moves no money. Returns how many. */
    @Transactional
    int reportOverdue() {
        OffsetDateTime now = now();
        List<Dispute> overdue = jdbc.sql(SELECT + """
                         where decision is null and overdue_reported_at is null and decide_by < :now
                        order by decide_by limit 100
                        for update skip locked""")
                .param("now", now).query((rs, i) -> map(rs)).list();
        for (Dispute d : overdue) {
            jdbc.sql("update cash_dispute set overdue_reported_at = :now where order_id = :order")
                    .param("now", now).param("order", d.orderId()).update();
            outbox.publish(new OutboxEvent(OVERDUE, 1, "Order", d.orderId(), 0, Map.of(
                    "order_id", d.orderId().toString(), "driver_id", d.driverId().toString(),
                    "held_minor", d.heldMinor(), "rider_debt_minor", d.riderDebtMinor(), "currency", d.currency(),
                    "decide_by", d.decideBy().toString())));
        }
        return overdue.size();
    }

    private Dispute find(UUID orderId, boolean lock) {
        return jdbc.sql(SELECT + " where order_id = :order" + (lock ? " for update" : ""))
                .param("order", orderId).query((rs, i) -> map(rs)).optional()
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "No cash dispute for this order"));
    }

    private static Dispute map(ResultSet rs) throws SQLException {
        String decision = rs.getString("decision");
        return new Dispute(rs.getObject("order_id", UUID.class), rs.getObject("driver_id", UUID.class),
                rs.getObject("payer_client_id", UUID.class), rs.getString("currency").trim(),
                rs.getLong("held_minor"), rs.getLong("rider_debt_minor"),
                rs.getObject("opened_at", OffsetDateTime.class), rs.getObject("decide_by", OffsetDateTime.class),
                decision == null ? null : Decision.valueOf(decision), rs.getObject("decided_by", UUID.class),
                rs.getString("reason"), rs.getObject("decided_at", OffsetDateTime.class), rs.getLong("version"));
    }

    private OffsetDateTime now() {
        return OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
    }

    @Override
    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    public int openOf(UUID driverId) {
        return jdbc.sql("select count(*) from cash_dispute where driver_id = :driver and decision is null")
                .param("driver", driverId).query(Integer.class).single();
    }
}
