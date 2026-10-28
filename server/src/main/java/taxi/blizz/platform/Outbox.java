package taxi.blizz.platform;

import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.UUID;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronization;
import org.springframework.transaction.support.TransactionSynchronizationManager;
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
    private final ObjectProvider<MeterRegistry> meters;

    Outbox(JdbcClient jdbc, JsonMapper json, Clock clock, ObjectProvider<MeterRegistry> meters) {
        this.jdbc = jdbc;
        this.json = json;
        this.clock = clock;
        this.meters = meters;
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
        // Business events per type (REQ-OBS-02: orders created, cancelled, unfulfilled…), counted once committed.
        String type = event.type();
        if (TransactionSynchronizationManager.isSynchronizationActive()) {
            TransactionSynchronizationManager.registerSynchronization(new TransactionSynchronization() {
                @Override
                public void afterCommit() {
                    meters.ifAvailable(m -> m.counter("blizz.events", "type", type).increment());
                }
            });
        }
        return eventId;
    }
}
