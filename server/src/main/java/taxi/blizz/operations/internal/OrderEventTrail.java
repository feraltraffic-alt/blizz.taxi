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
    private final taxi.blizz.geo.CityCatalog cities;

    OrderEventTrail(JdbcClient jdbc, taxi.blizz.geo.CityCatalog cities) {
        this.jdbc = jdbc;
        this.cities = cities;
    }

    /** Events of orders in the cities of the service only (ADR 0016). */
    @Override
    public List<Found> find(UUID serviceId, UUID correlationId, int limit) {
        record Row(Found found, UUID city) {
        }
        java.util.Map<UUID, Boolean> own = new java.util.HashMap<>();
        return jdbc.sql("""
                        select e.order_id, e.sequence, e.occurred_at, o.city_id
                        from order_event e join ride_order o on o.id = e.order_id
                        where e.correlation_id = :id
                        order by e.occurred_at, e.order_id, e.sequence limit :limit""")
                .param("id", correlationId).param("limit", limit)
                .query((rs, i) -> new Row(new Found("ORDER_EVENT", rs.getObject(1, UUID.class) + ":" + rs.getLong(2),
                        rs.getObject(1, UUID.class), rs.getObject(3, OffsetDateTime.class)),
                        rs.getObject(4, UUID.class)))
                .list().stream()
                .filter(r -> own.computeIfAbsent(r.city(),
                        city -> cities.serviceOf(city).map(serviceId::equals).orElse(false)))
                .map(Row::found).toList();
    }
}
