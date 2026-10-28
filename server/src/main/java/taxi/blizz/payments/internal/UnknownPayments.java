package taxi.blizz.payments.internal;

import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.platform.Outbox;
import taxi.blizz.platform.OutboxEvent;

/**
 * A card operation whose result is still unknown after {@code blizz.payments.unknown-report-after} (REQ-OPS-06,
 * REQ-PAY-19): {@code PaymentResultUnknown} goes out once per operation, and the problem queue gets a task. The
 * operation keeps being asked about; it is never taken for declined.
 */
@Component
class UnknownPayments {

    private final JdbcClient jdbc;
    private final Outbox outbox;
    private final PaymentsProperties properties;
    private final Clock clock;

    UnknownPayments(JdbcClient jdbc, Outbox outbox, PaymentsProperties properties, Clock clock) {
        this.jdbc = jdbc;
        this.outbox = outbox;
        this.properties = properties;
        this.clock = clock;
    }

    private record Unknown(UUID operationId, UUID intentId, UUID orderId, String type, long amount, String currency) {
    }

    /** Reports what is new; safe on several instances. Returns how many. */
    @Transactional
    public int report() {
        OffsetDateTime now = OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
        List<Unknown> unknown = jdbc.sql("""
                        select o.id, o.intent_id, i.order_id, o.type, o.amount_minor, i.currency
                        from payment_operation o join payment_intent i on i.id = o.intent_id
                        where o.state = 'UNKNOWN' and o.unknown_reported_at is null and o.created_at < :since
                        order by o.id limit 100
                        for update of o skip locked""")
                .param("since", now.minus(properties.unknownReportAfter()))
                .query((rs, i) -> new Unknown(rs.getObject(1, UUID.class), rs.getObject(2, UUID.class),
                        rs.getObject(3, UUID.class), rs.getString(4), rs.getLong(5), rs.getString(6)))
                .list();
        for (Unknown u : unknown) {
            jdbc.sql("update payment_operation set unknown_reported_at = :now where id = :id")
                    .param("now", now).param("id", u.operationId()).update();
            outbox.publish(new OutboxEvent("PaymentResultUnknown", 1, "PaymentIntent", u.intentId(), 0, Map.of(
                    "order_id", u.orderId().toString(), "operation_id", u.operationId().toString(),
                    "type", u.type(), "amount_minor", u.amount(), "currency", u.currency())));
        }
        return unknown.size();
    }
}
