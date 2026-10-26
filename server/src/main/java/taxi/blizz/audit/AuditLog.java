package taxi.blizz.audit;

import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.platform.CorrelationId;
import tools.jackson.databind.json.JsonMapper;

/**
 * Append-only audit log (REQ-AUTH-10, REQ-SEC-13). Joins the caller's transaction, so the record
 * exists exactly when the audited change is committed. The table rejects UPDATE, DELETE and
 * TRUNCATE at the database level.
 */
@Component
public class AuditLog {

    private final JdbcClient jdbc;
    private final JsonMapper json;
    private final Clock clock;

    AuditLog(JdbcClient jdbc, JsonMapper json, Clock clock) {
        this.jdbc = jdbc;
        this.json = json;
        this.clock = clock;
    }

    @Transactional
    public UUID record(AuditEntry entry) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into audit_log (id, occurred_at, actor_type, actor_id, action, resource_type,
                                               resource_id, reason, before, after, correlation_id)
                        values (:id, :now, :actorType, :actorId, :action, :resourceType,
                                :resourceId, :reason, cast(:before as jsonb), cast(:after as jsonb), :correlationId)
                        """)
                .param("id", id)
                .param("now", OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC))
                .param("actorType", entry.actor().type().name())
                .param("actorId", entry.actor().id())
                .param("action", entry.action())
                .param("resourceType", entry.resourceType())
                .param("resourceId", entry.resourceId())
                .param("reason", entry.reason())
                .param("before", toJson(entry.before()))
                .param("after", toJson(entry.after()))
                .param("correlationId", CorrelationId.currentOrNew())
                .update();
        return id;
    }

    private String toJson(Object value) {
        return value == null ? null : json.writeValueAsString(value);
    }
}
