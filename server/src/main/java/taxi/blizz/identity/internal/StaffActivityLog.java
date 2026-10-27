package taxi.blizz.identity.internal;

import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.platform.CorrelationId;
import tools.jackson.databind.json.JsonMapper;

/**
 * The staff activity log: every request of a staff member to the admin and operator APIs and every
 * sign-in attempt, with the role at that moment (owner decision 27.10.2026). Writes run in their own
 * transaction, so a failed request is logged too.
 */
@Component
class StaffActivityLog {

    private static final Logger log = LoggerFactory.getLogger(StaffActivityLog.class);

    private final JdbcClient jdbc;
    private final JsonMapper json;
    private final Clock clock;

    StaffActivityLog(JdbcClient jdbc, JsonMapper json, Clock clock) {
        this.jdbc = jdbc;
        this.json = json;
        this.clock = clock;
    }

    record Entry(UUID id, OffsetDateTime occurredAt, String kind, UUID staffId, String staffLogin, String role,
                 String audience, String method, String path, Map<String, Object> resourceIds, Integer status,
                 String outcome, Integer durationMs, String clientIp, UUID correlationId) {
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void request(UUID staffId, String audience, String method, String path, Map<String, String> ids,
                        int status, long durationMs, String clientIp) {
        insert("REQUEST", staffId, null, audience, method, path, ids, status,
                status < 400 ? "OK" : "HTTP_" + status, durationMs, clientIp);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void signIn(UUID staffId, String login, String audience, String outcome, String clientIp) {
        insert("SIGN_IN", staffId, login, audience, "POST", "/auth/v1/staff/sign-in", Map.of(), null, outcome,
                null, clientIp);
    }

    private void insert(String kind, UUID staffId, String login, String audience, String method, String path,
                        Map<String, String> ids, Integer status, String outcome, Long durationMs, String clientIp) {
        try {
            jdbc.sql("""
                            insert into staff_activity (id, occurred_at, kind, staff_id, staff_login, role, audience,
                                                        method, path, resource_ids, status, outcome, duration_ms,
                                                        client_ip, correlation_id)
                            select :id, :now, :kind, :staff, coalesce(s.login, :login), s.role, :audience, :method,
                                   :path, cast(:ids as jsonb), :status, :outcome, :duration, :ip, :correlation
                            from (select 1) one left join staff_user s on s.id = :staff""")
                    .param("id", UUID.randomUUID())
                    .param("now", clock.instant().atOffset(ZoneOffset.UTC))
                    .param("kind", kind).param("staff", staffId).param("login", login).param("audience", audience)
                    .param("method", method).param("path", path)
                    .param("ids", ids == null || ids.isEmpty() ? null : json.writeValueAsString(ids))
                    .param("status", status).param("outcome", outcome)
                    .param("duration", durationMs == null ? null : (int) Math.min(durationMs, Integer.MAX_VALUE))
                    .param("ip", clientIp).param("correlation", CorrelationId.current().orElse(null))
                    .update();
        } catch (RuntimeException e) {
            // The log must never break the request it describes; a failure is loud in the server log.
            log.error("Could not write the staff activity log ({} {} {})", kind, method, path, e);
        }
    }

    record Query(String role, UUID staffId, String kind, OffsetDateTime from, OffsetDateTime to,
                 OffsetDateTime before, int limit) {
    }

    @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
    public List<Entry> find(Query q) {
        return jdbc.sql("""
                        select id, occurred_at, kind, staff_id, staff_login, role, audience, method, path,
                               resource_ids::text, status, outcome, duration_ms, client_ip, correlation_id
                        from staff_activity
                        where (cast(:role as text) is null or role = :role)
                          and (cast(:staff as uuid) is null or staff_id = :staff)
                          and (cast(:kind as text) is null or kind = :kind)
                          and (cast(:from as timestamptz) is null or occurred_at >= :from)
                          and (cast(:to as timestamptz) is null or occurred_at < :to)
                          and (cast(:before as timestamptz) is null or occurred_at < :before)
                        order by occurred_at desc, id desc limit :limit""")
                .param("role", q.role()).param("staff", q.staffId()).param("kind", q.kind())
                .param("from", q.from()).param("to", q.to()).param("before", q.before())
                .param("limit", Math.max(1, Math.min(q.limit(), 200)))
                .query((rs, i) -> new Entry(rs.getObject(1, UUID.class), rs.getObject(2, OffsetDateTime.class),
                        rs.getString(3), rs.getObject(4, UUID.class), rs.getString(5), rs.getString(6), rs.getString(7),
                        rs.getString(8), rs.getString(9),
                        rs.getString(10) == null ? Map.of() : json.readValue(rs.getString(10), Map.class),
                        (Integer) rs.getObject(11), rs.getString(12), (Integer) rs.getObject(13), rs.getString(14),
                        rs.getObject(15, UUID.class)))
                .list();
    }
}
