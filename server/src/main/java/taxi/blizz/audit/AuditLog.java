package taxi.blizz.audit;

import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.platform.CorrelationId;
import taxi.blizz.platform.PageCursor;
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

    /** Filters are optional (null); newest first, after {@code after} when given (REQ-API-09). */
    public record Query(String actorType, UUID actorId, String actorRole, String action, String resourceType,
                        String resourceId, OffsetDateTime from, OffsetDateTime to, PageCursor after, int limit) {
    }

    public static final String CHANGES = "changes";

    public static PageCursor position(Record change) {
        return PageCursor.of(CHANGES, change.occurredAt(), change.id());
    }

    @Transactional(readOnly = true)
    public java.util.List<Record> find(Query q) {
        AuditSql query = querySql(q);
        return jdbc.sql(query.sql()).params(query.params())
                .query((rs, i) -> new Record(rs.getObject(1, UUID.class), rs.getObject(2, OffsetDateTime.class),
                        rs.getString(3), rs.getObject(4, UUID.class), rs.getString(5), rs.getString(6),
                        rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11),
                        rs.getObject(12, UUID.class)))
                .list();
    }

    record AuditSql(String sql, java.util.Map<String, Object> params) {
    }

    AuditSql querySql(Query q) {
        StringBuilder sql = new StringBuilder("""
                select id, occurred_at, actor_type, actor_id, actor_role, action, resource_type, resource_id,
                       reason, before::text, after::text, correlation_id from audit_log where 1=1
                """);
        java.util.Map<String, Object> params = new java.util.LinkedHashMap<>();
        if ("STAFF".equals(q.actorType())) {
            // This fixed scope also proves the partial index's predicate in a generic prepared plan.
            sql.append(" and actor_type = 'STAFF'");
        } else equal(sql, params, "actor_type", q.actorType());
        equal(sql, params, "actor_id", q.actorId());
        equal(sql, params, "actor_role", q.actorRole());
        equal(sql, params, "action", q.action());
        equal(sql, params, "resource_type", q.resourceType());
        equal(sql, params, "resource_id", q.resourceId());
        if (q.from() != null) { sql.append(" and occurred_at >= :from"); params.put("from", q.from()); }
        if (q.to() != null) { sql.append(" and occurred_at < :to"); params.put("to", q.to()); }
        if (q.after() != null) {
            sql.append(" and (occurred_at, id) < (:afterAt, :afterId)");
            params.put("afterAt", q.after().time(0));
            params.put("afterId", q.after().id(1));
        }
        sql.append(" order by occurred_at desc, id desc limit ")
                .append(Math.max(1, Math.min(q.limit(), PageCursor.MAX_FETCH)));
        return new AuditSql(sql.toString(), java.util.Map.copyOf(params));
    }

    private static void equal(StringBuilder sql, java.util.Map<String, Object> params, String column, Object value) {
        if (value != null) {
            sql.append(" and ").append(column).append(" = :").append(column);
            params.put(column, value);
        }
    }

    private String toJson(Object value) {
        return value == null ? null : json.writeValueAsString(value);
    }
}
