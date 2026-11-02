package taxi.blizz.identity.internal;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.platform.CorrelationTrail;

/** Staff requests under a correlation id (issue #81). */
@Component
class StaffActivityTrail implements CorrelationTrail {

    private final JdbcClient jdbc;

    StaffActivityTrail(JdbcClient jdbc) {
        this.jdbc = jdbc;
    }

    @Override
    public List<Found> find(UUID serviceId, UUID correlationId, int limit) {
        return jdbc.sql("""
                        select id, occurred_at from staff_activity where correlation_id = :id and service_id = :service
                        order by occurred_at, id limit :limit""")
                .param("id", correlationId).param("service", serviceId).param("limit", limit)
                .query((rs, i) -> new Found("STAFF_ACTIVITY", rs.getObject(1, UUID.class).toString(), null,
                        rs.getObject(2, OffsetDateTime.class)))
                .list();
    }
}
