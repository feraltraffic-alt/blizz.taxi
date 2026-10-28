package taxi.blizz.operations.internal;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.platform.CorrelationTrail;

/** Order events under a correlation id (issue #81). */
@Component
class OrderEventTrail implements CorrelationTrail {

    private final JdbcClient jdbc;

    OrderEventTrail(JdbcClient jdbc) {
        this.jdbc = jdbc;
    }

    @Override
    public List<Found> find(UUID correlationId, int limit) {
        return jdbc.sql("""
                        select order_id, sequence, occurred_at from order_event where correlation_id = :id
                        order by occurred_at, order_id, sequence limit :limit""")
                .param("id", correlationId).param("limit", limit)
                .query((rs, i) -> new Found("ORDER_EVENT", rs.getObject(1, UUID.class) + ":" + rs.getLong(2),
                        rs.getObject(1, UUID.class), rs.getObject(3, OffsetDateTime.class)))
                .list();
    }
}
