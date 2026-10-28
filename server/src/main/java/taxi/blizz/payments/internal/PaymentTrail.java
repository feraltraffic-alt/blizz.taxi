package taxi.blizz.payments.internal;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.platform.CorrelationTrail;

/** Payment intents and operations under a correlation id (issue #81). */
@Component
class PaymentTrail implements CorrelationTrail {

    private final JdbcClient jdbc;

    PaymentTrail(JdbcClient jdbc) {
        this.jdbc = jdbc;
    }

    @Override
    public List<Found> find(UUID correlationId, int limit) {
        List<Found> found = new ArrayList<>(jdbc.sql("""
                        select id, order_id, created_at from payment_intent where correlation_id = :id
                        order by created_at, id limit :limit""")
                .param("id", correlationId).param("limit", limit)
                .query((rs, i) -> new Found("PAYMENT_INTENT", rs.getObject(1, UUID.class).toString(),
                        rs.getObject(2, UUID.class), rs.getObject(3, OffsetDateTime.class)))
                .list());
        found.addAll(jdbc.sql("""
                        select o.id, i.order_id, o.created_at
                        from payment_operation o join payment_intent i on i.id = o.intent_id
                        where o.correlation_id = :id order by o.created_at, o.id limit :limit""")
                .param("id", correlationId).param("limit", limit)
                .query((rs, i) -> new Found("PAYMENT_OPERATION", rs.getObject(1, UUID.class).toString(),
                        rs.getObject(2, UUID.class), rs.getObject(3, OffsetDateTime.class)))
                .list());
        return found;
    }
}
