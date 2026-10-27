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
                        insert into audit_log (id, occurred_at, actor_type, actor_id, actor_role, action,
                                               resource_type, resource_id, reason, before, after, correlation_id)
                        values (:id, :now, :actorType, :actorId,
                                case when :actorType = 'STAFF'
                                     then (select role from staff_user where id = :actorId) end,
                                :action, :resourceType, :resourceId, :reason, cast(:before as jsonb),
                                cast(:after as jsonb), :correlationId)
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

    /** One change as stored; {@code actorRole} is the staff role at the moment of the change. */
    public record Record(UUID id, OffsetDateTime occurredAt, String actorType, UUID actorId, String actorRole,
                         String action, String resourceType, String resourceId, String reason, String before,
                         String after, UUID correlationId) {
    }

    /** Filters are optional (null); newest first, before {@code before} when given; at most 200. */
    public record Query(String actorType, UUID actorId, String actorRole, String action, String resourceType,
                        String resourceId, OffsetDateTime from, OffsetDateTime to, OffsetDateTime before, int limit) {
    }

    @Transactional(readOnly = true)
    public java.util.List<Record> find(Query q) {
        return jdbc.sql("""
                        select id, occurred_at, actor_type, actor_id, actor_role, action, resource_type, resource_id,
                               reason, before::text, after::text, correlation_id
                        from audit_log
                        where (cast(:actorType as text) is null or actor_type = :actorType)
                          and (cast(:actorId as uuid) is null or actor_id = :actorId)
                          and (cast(:actorRole as text) is null or actor_role = :actorRole)
                          and (cast(:action as text) is null or action = :action)
                          and (cast(:resourceType as text) is null or resource_type = :resourceType)
                          and (cast(:resourceId as text) is null or resource_id = :resourceId)
                          and (cast(:from as timestamptz) is null or occurred_at >= :from)
                          and (cast(:to as timestamptz) is null or occurred_at < :to)
                          and (cast(:before as timestamptz) is null or occurred_at < :before)
                        order by occurred_at desc, id desc
                        limit :limit""")
                .param("actorType", q.actorType()).param("actorId", q.actorId()).param("actorRole", q.actorRole())
                .param("action", q.action()).param("resourceType", q.resourceType())
                .param("resourceId", q.resourceId()).param("from", q.from()).param("to", q.to())
                .param("before", q.before()).param("limit", Math.max(1, Math.min(q.limit(), 200)))
                .query((rs, i) -> new Record(rs.getObject(1, UUID.class), rs.getObject(2, OffsetDateTime.class),
                        rs.getString(3), rs.getObject(4, UUID.class), rs.getString(5), rs.getString(6),
                        rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11),
                        rs.getObject(12, UUID.class)))
                .list();
    }

    private String toJson(Object value) {
        return value == null ? null : json.writeValueAsString(value);
    }
}
