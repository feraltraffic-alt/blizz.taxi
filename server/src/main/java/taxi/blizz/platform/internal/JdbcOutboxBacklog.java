package taxi.blizz.platform.internal;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.platform.OutboxBacklog;

/** See {@link OutboxBacklog}. Only events not DONE are looked at, and those are few. */
@Component
class JdbcOutboxBacklog implements OutboxBacklog {

    /** Kept as a constant so a test can check its plan. */
    static final String WAITING = """
            select o.event_id, o.occurred_at, o.payload::text
            from outbox o
            where o.event_type = :type and o.state <> 'DONE'
              and not exists (select 1 from consumer_inbox i
                              where i.consumer_id = :consumer and i.event_id = o.event_id)
            order by o.occurred_at, o.event_id
            limit :limit""";

    private final JdbcClient jdbc;

    JdbcOutboxBacklog(JdbcClient jdbc) {
        this.jdbc = jdbc;
    }

    @Override
    public List<Waiting> waiting(String eventType, String consumerId, int limit) {
        return jdbc.sql(WAITING)
                .param("type", eventType).param("consumer", consumerId).param("limit", limit)
                .query((rs, i) -> new Waiting(rs.getObject(1, UUID.class),
                        rs.getObject(2, OffsetDateTime.class).toInstant(), rs.getString(3)))
                .list();
    }
}
