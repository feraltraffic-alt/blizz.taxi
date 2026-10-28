package taxi.blizz.audit;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.platform.CorrelationTrail;

/** Audit records under a correlation id (issue #81); an order's id when the record is about an order. */
@Component
class AuditTrail implements CorrelationTrail {

    private final JdbcClient jdbc;

    AuditTrail(JdbcClient jdbc) {
        this.jdbc = jdbc;
    }

    @Override
    public List<Found> find(UUID correlationId, int limit) {
        return jdbc.sql("""
                        select id, resource_type, resource_id, occurred_at from audit_log where correlation_id = :id
                        order by occurred_at, id limit :limit""")
                .param("id", correlationId).param("limit", limit)
                .query((rs, i) -> new Found("AUDIT", rs.getObject(1, UUID.class).toString(),
                        order(rs.getString(2), rs.getString(3)), rs.getObject(4, OffsetDateTime.class)))
                .list();
    }

    private static UUID order(String resourceType, String resourceId) {
        if (!"ride_order".equals(resourceType) || resourceId == null) {
            return null;
        }
        try {
            return UUID.fromString(resourceId);
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}
