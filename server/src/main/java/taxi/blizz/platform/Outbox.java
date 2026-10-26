package taxi.blizz.platform;

import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tools.jackson.databind.json.JsonMapper;

/**
 * Writes events into the transactional outbox (REQ-ENG-05). Requires the caller's transaction, so
 * the event exists exactly when the business change it describes is committed.
 */
@Component
public class Outbox {

    private final JdbcClient jdbc;
    private final JsonMapper json;
    private final Clock clock;

    Outbox(JdbcClient jdbc, JsonMapper json, Clock clock) {
        this.jdbc = jdbc;
        this.json = json;
        this.clock = clock;
    }

    @Transactional(propagation = Propagation.MANDATORY)
    public UUID publish(OutboxEvent event) {
        UUID eventId = UUID.randomUUID();
        OffsetDateTime now = OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
        jdbc.sql("""
                        insert into outbox (event_id, event_type, schema_version, aggregate_type, aggregate_id,
                                            aggregate_version, payload, correlation_id, occurred_at, next_attempt_at)
                        values (:eventId, :type, :schemaVersion, :aggregateType, :aggregateId,
                                :aggregateVersion, cast(:payload as jsonb), :correlationId, :now, :now)
                        """)
                .param("eventId", eventId)
                .param("type", event.type())
                .param("schemaVersion", event.schemaVersion())
                .param("aggregateType", event.aggregateType())
                .param("aggregateId", event.aggregateId())
                .param("aggregateVersion", event.aggregateVersion())
                .param("payload", json.writeValueAsString(event.payload()))
                .param("correlationId", CorrelationId.currentOrNew())
                .param("now", now)
                .update();
        return eventId;
    }
}
