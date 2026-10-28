package taxi.blizz.payments.internal;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.audit.AuditEntry;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.payments.PaymentOperations;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;

@Service
class JdbcPaymentOperations implements PaymentOperations {

    private static final String SELECT = """
            select o.id, i.order_id, o.type, o.state, o.amount_minor, i.currency, o.provider_status, o.reason,
                   o.retry_of, o.initiated_by, o.created_at, o.intent_id
            from payment_operation o join payment_intent i on i.id = o.intent_id""";

    private final JdbcClient jdbc;
    private final JdbcCardPayments payments;
    private final StaffAccess staff;
    private final IdempotentCommands commands;
    private final AuditLog audit;

    JdbcPaymentOperations(JdbcClient jdbc, JdbcCardPayments payments, StaffAccess staff, IdempotentCommands commands,
                          AuditLog audit) {
        this.jdbc = jdbc;
        this.payments = payments;
        this.staff = staff;
        this.commands = commands;
        this.audit = audit;
    }

    private record Row(Operation operation, UUID intentId) {
    }

    @Override
    @Transactional(readOnly = true)
    public List<Operation> ofOrder(Actor actor, UUID orderId) {
        staff.require(actor, RETRY_PERMISSION);
        List<Operation> ops = jdbc.sql(SELECT + " where i.order_id = :order order by o.created_at, o.id")
                .param("order", orderId).query((rs, i) -> map(rs).operation()).list();
        if (ops.isEmpty()) {
            throw new DomainException(ErrorCode.NOT_FOUND, "No card payment for this order");
        }
        return ops;
    }

    record RetryRequest(UUID operationId, String reason) {
    }

    @Override
    public Operation retry(Actor actor, UUID commandId, UUID operationId, String reason) {
        staff.require(actor, RETRY_PERMISSION);
        if (reason == null || reason.isBlank()) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "A reason is required");
        }
        String why = reason.strip();
        return commands.execute(new CommandKey(actor, "payment.retry", commandId), new RetryRequest(operationId, why),
                Operation.class, () -> {
                    Row before = jdbc.sql(SELECT + " where o.id = :id for update of o, i").param("id", operationId)
                            .query((rs, i) -> map(rs)).optional()
                            .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Operation not found"));
                    Operation old = before.operation();
                    if (!"CHARGE".equals(old.type())) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT,
                                "Only a charge is retried by hand; holds, captures and refunds follow the trip");
                    }
                    if (Set.of("CREATED", "SENDING", "PENDING", "UNKNOWN").contains(old.state())) {
                        throw new DomainException(ErrorCode.PAYMENT_UNKNOWN,
                                "The result of this charge is not known yet; it is being asked about");
                    }
                    if (!"DECLINED".equals(old.state())) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT, "Only a declined charge is retried");
                    }
                    if (jdbc.sql("select exists(select 1 from payment_operation where retry_of = :id)")
                            .param("id", operationId).query(Boolean.class).single()) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT,
                                "This charge was retried already; retry the newest one");
                    }
                    if (jdbc.sql("""
                                    select exists(select 1 from payment_operation where intent_id = :intent
                                                  and state in ('CREATED', 'SENDING', 'PENDING', 'UNKNOWN'))""")
                            .param("intent", before.intentId()).query(Boolean.class).single()) {
                        throw new DomainException(ErrorCode.PAYMENT_UNKNOWN,
                                "Another operation of this payment is still under way");
                    }
                    UUID id = UUID.randomUUID();
                    payments.createOperation(id, before.intentId(), "CHARGE", "charge-" + id, null, old.amountMinor());
                    jdbc.sql("update payment_operation set retry_of = :old, initiated_by = :by where id = :id")
                            .param("old", operationId).param("by", actor.id()).param("id", id).update();
                    Operation created = jdbc.sql(SELECT + " where o.id = :id").param("id", id)
                            .query((rs, i) -> map(rs).operation()).single();
                    audit.record(new AuditEntry(actor, "payment.retry", "payment_operation", id.toString(), why,
                            Map.of("retry_of", operationId.toString(), "state", old.state(),
                                    "amount_minor", old.amountMinor()),
                            Map.of("operation_id", id.toString(), "order_id", old.orderId().toString())));
                    return created;
                });
    }

    private static Row map(java.sql.ResultSet rs) throws java.sql.SQLException {
        return new Row(new Operation(rs.getObject("id", UUID.class), rs.getObject("order_id", UUID.class),
                rs.getString("type"), rs.getString("state"), rs.getLong("amount_minor"), rs.getString("currency"),
                rs.getString("provider_status"), rs.getString("reason"), rs.getObject("retry_of", UUID.class),
                rs.getObject("initiated_by", UUID.class), rs.getObject("created_at", OffsetDateTime.class)),
                rs.getObject("intent_id", UUID.class));
    }
}
