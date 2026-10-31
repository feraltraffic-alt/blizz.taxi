package taxi.blizz.payments.internal;

import java.time.Clock;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.audit.AuditEntry;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.payments.Chargebacks;
import taxi.blizz.payments.PaymentOperations;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.ConflictException;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;
import taxi.blizz.platform.Outbox;
import taxi.blizz.platform.OutboxEvent;

/**
 * Chargebacks recorded by hand (REQ-PAY-23). What can be charged back is what the order's card payment took — its
 * captures, charges and tips that succeeded — less the chargebacks not won back; the payment's row is locked, so two
 * at once never take more than that.
 */
@Service
class JdbcChargebacks implements Chargebacks {

    private static final String SELECT = """
            select id, order_id, amount_minor, currency, bank_reason, received_on, state, resolution_reason,
                   created_at, resolved_at, version
            from payment_chargeback""";

    private final JdbcClient jdbc;
    private final StaffAccess staff;
    private final IdempotentCommands commands;
    private final AuditLog audit;
    private final Outbox outbox;
    private final Clock clock;

    JdbcChargebacks(JdbcClient jdbc, StaffAccess staff, IdempotentCommands commands, AuditLog audit, Outbox outbox,
                    Clock clock) {
        this.jdbc = jdbc;
        this.staff = staff;
        this.commands = commands;
        this.audit = audit;
        this.outbox = outbox;
        this.clock = clock;
    }

    record RecordRequest(UUID orderId, long amountMinor, String currency, String bankReason, LocalDate receivedOn) {
    }

    record ResolveRequest(UUID orderId, UUID chargebackId, long expectedVersion, Outcome outcome, String reason) {
    }

    private record Intent(UUID id, UUID clientId, String currency, long paidMinor) {
    }

    @Override
    public Chargeback record(Actor actor, UUID commandId, UUID orderId, UUID cityId, NewChargeback input) {
        staff.require(actor, PaymentOperations.RETRY_PERMISSION, cityId);
        if (input == null || input.amountMinor() <= 0) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "The amount must be positive");
        }
        if (input.currency() == null || !input.currency().matches("^[A-Z]{3}$")) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "The currency is three capital letters");
        }
        String reason = input.bankReason() == null ? "" : input.bankReason().strip();
        if (reason.isEmpty() || reason.length() > 500) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "The bank's reason has 1 to 500 characters");
        }
        OffsetDateTime now = now();
        if (input.receivedOn() == null || input.receivedOn().isAfter(now.toLocalDate())) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "The date the bank's notice came, not in future");
        }
        RecordRequest request = new RecordRequest(orderId, input.amountMinor(), input.currency(), reason,
                input.receivedOn());
        return commands.execute(new CommandKey(actor, "payment.chargeback.record", commandId), request,
                Chargeback.class, () -> {
                    Intent intent = jdbc.sql("""
                                    select i.id, i.client_id, i.currency,
                                           coalesce((select sum(o.amount_minor) from payment_operation o
                                                     where o.intent_id = i.id and o.state = 'SUCCEEDED'
                                                       and o.type in ('SETTLE', 'CHARGE', 'TIP')), 0) as paid
                                    from payment_intent i where i.order_id = :order for update of i""")
                            .param("order", orderId)
                            .query((rs, i) -> new Intent(rs.getObject("id", UUID.class),
                                    rs.getObject("client_id", UUID.class), rs.getString("currency"),
                                    rs.getLong("paid")))
                            .optional()
                            .orElseThrow(() -> new DomainException(ErrorCode.CHARGEBACK_NOT_ALLOWED,
                                    "The order was not paid by card"));
                    if (!intent.currency().equals(input.currency())) {
                        throw new DomainException(ErrorCode.CHARGEBACK_NOT_ALLOWED,
                                "The order was paid in " + intent.currency());
                    }
                    long taken = jdbc.sql("""
                                    select coalesce(sum(amount_minor), 0) from payment_chargeback
                                    where intent_id = :intent and state in ('OPEN', 'LOST')""")
                            .param("intent", intent.id()).query(Long.class).single();
                    long left = intent.paidMinor() - taken;
                    if (input.amountMinor() > left) {
                        throw new DomainException(ErrorCode.CHARGEBACK_NOT_ALLOWED,
                                "At most " + Math.max(left, 0) + " minor units of the card payment are left");
                    }
                    UUID id = UUID.randomUUID();
                    jdbc.sql("""
                                    insert into payment_chargeback (id, order_id, intent_id, payer_client_id,
                                        amount_minor, currency, bank_reason, received_on, state, recorded_by,
                                        created_at)
                                    values (:id, :order, :intent, :payer, :amount, :currency, :reason, :received,
                                            'OPEN', :by, :now)""")
                            .param("id", id).param("order", orderId).param("intent", intent.id())
                            .param("payer", intent.clientId()).param("amount", input.amountMinor())
                            .param("currency", input.currency()).param("reason", reason)
                            .param("received", input.receivedOn()).param("by", actor.id()).param("now", now)
                            .update();
                    Map<String, Object> payload = new LinkedHashMap<>();
                    payload.put("chargeback_id", id.toString());
                    payload.put("order_id", orderId.toString());
                    payload.put("intent_id", intent.id().toString());
                    payload.put("payer_client_id", intent.clientId().toString());
                    payload.put("amount_minor", input.amountMinor());
                    payload.put("currency", input.currency());
                    outbox.publish(new OutboxEvent(RECORDED, 1, "Chargeback", id, 0, payload));
                    audit.record(new AuditEntry(actor, "payment.chargeback.record", "payment_chargeback",
                            id.toString(), reason, null, Map.of("order_id", orderId.toString(),
                                    "amount_minor", input.amountMinor(), "currency", input.currency(),
                                    "received_on", input.receivedOn().toString())));
                    return get(id);
                });
    }

    @Override
    public Chargeback resolve(Actor actor, UUID commandId, UUID orderId, UUID cityId, UUID chargebackId,
                              long expectedVersion, Outcome outcome, String reason) {
        staff.require(actor, PaymentOperations.RETRY_PERMISSION, cityId);
        if (outcome == null) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "The outcome is WON or LOST");
        }
        String why = reason == null ? "" : reason.strip();
        if (why.isEmpty() || why.length() > 500) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "A reason of 1 to 500 characters is required");
        }
        return commands.execute(new CommandKey(actor, "payment.chargeback.resolve", commandId),
                new ResolveRequest(orderId, chargebackId, expectedVersion, outcome, why), Chargeback.class, () -> {
                    Map<String, Object> row = jdbc.sql("""
                                    select state, version, payer_client_id, amount_minor, currency
                                    from payment_chargeback where id = :id and order_id = :order for update""")
                            .param("id", chargebackId).param("order", orderId)
                            .query().listOfRows().stream().findFirst()
                            .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Chargeback not found"));
                    if (!State.OPEN.name().equals(row.get("state"))) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT, "The chargeback is resolved already");
                    }
                    if (((Number) row.get("version")).longValue() != expectedVersion) {
                        throw ConflictException.version(
                                ((Number) row.get("version")).longValue(), "The chargeback changed; reload it");
                    }
                    jdbc.sql("""
                                    update payment_chargeback
                                    set state = :state, resolution_reason = :reason, resolved_by = :by,
                                        resolved_at = :now, version = version + 1
                                    where id = :id""")
                            .param("state", outcome.name()).param("reason", why).param("by", actor.id())
                            .param("now", now()).param("id", chargebackId).update();
                    Map<String, Object> payload = new LinkedHashMap<>();
                    payload.put("chargeback_id", chargebackId.toString());
                    payload.put("order_id", orderId.toString());
                    payload.put("payer_client_id", row.get("payer_client_id").toString());
                    payload.put("amount_minor", ((Number) row.get("amount_minor")).longValue());
                    payload.put("currency", row.get("currency"));
                    payload.put("outcome", outcome.name());
                    outbox.publish(new OutboxEvent(RESOLVED, 1, "Chargeback", chargebackId, expectedVersion + 1,
                            payload));
                    audit.record(new AuditEntry(actor, "payment.chargeback.resolve", "payment_chargeback",
                            chargebackId.toString(), why, Map.of("state", State.OPEN.name()),
                            Map.of("state", outcome.name())));
                    return get(chargebackId);
                });
    }

    @Override
    @Transactional(readOnly = true)
    public List<Chargeback> ofOrder(Actor actor, UUID orderId, UUID cityId) {
        staff.require(actor, PaymentOperations.RETRY_PERMISSION, cityId);
        return jdbc.sql(SELECT + " where order_id = :order order by created_at, id").param("order", orderId)
                .query((rs, i) -> map(rs)).list();
    }

    private Chargeback get(UUID id) {
        return jdbc.sql(SELECT + " where id = :id").param("id", id).query((rs, i) -> map(rs)).single();
    }

    private static Chargeback map(java.sql.ResultSet rs) throws java.sql.SQLException {
        return new Chargeback(rs.getObject("id", UUID.class), rs.getObject("order_id", UUID.class),
                rs.getLong("amount_minor"), rs.getString("currency"), rs.getString("bank_reason"),
                rs.getObject("received_on", LocalDate.class), State.valueOf(rs.getString("state")),
                rs.getString("resolution_reason"), rs.getObject("created_at", OffsetDateTime.class),
                rs.getObject("resolved_at", OffsetDateTime.class), rs.getLong("version"));
    }

    private OffsetDateTime now() {
        return OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
    }

    @Override
    public java.util.Set<UUID> disputed(java.util.Collection<UUID> orderIds) {
        return java.util.Set.of();
    }
}
