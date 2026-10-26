package taxi.blizz.platform.internal;

import java.time.Clock;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.platform.CorrelationId;
import taxi.blizz.platform.OutboxHandler;
import taxi.blizz.platform.OutboxMessage;

/**
 * Delivers outbox events to {@link OutboxHandler}s.
 *
 * <p>Several replicas can run it at once: a batch is claimed with {@code FOR UPDATE SKIP LOCKED}
 * and a time-limited lease, so a crashed process only delays its batch until the lease expires
 * (REQ-DSP-09, REQ-ENG-06). Each handler runs in its own transaction together with its
 * {@code consumer_inbox} row, which makes redelivery safe. Failures are retried with exponential
 * backoff; after {@code maxAttempts} the event becomes FAILED and is logged for attention.
 */
@Component
public class OutboxRelay {

    private static final Logger log = LoggerFactory.getLogger(OutboxRelay.class);
    private static final Duration MAX_BACKOFF = Duration.ofMinutes(5);

    private final JdbcClient jdbc;
    private final TransactionTemplate tx;
    private final List<OutboxHandler> handlers;
    private final OutboxProperties properties;
    private final Clock clock;
    private final String owner = "relay-" + UUID.randomUUID();

    OutboxRelay(JdbcClient jdbc, TransactionTemplate tx, List<OutboxHandler> handlers,
                OutboxProperties properties, Clock clock) {
        this.jdbc = jdbc;
        this.tx = tx;
        this.handlers = List.copyOf(handlers);
        this.properties = properties;
        this.clock = clock;
    }

    /** Claims and processes one batch; returns the number of events claimed. */
    public int runOnce() {
        List<OutboxMessage> batch = claim();
        for (OutboxMessage message : batch) {
            process(message);
        }
        return batch.size();
    }

    private List<OutboxMessage> claim() {
        OffsetDateTime now = now();
        List<OutboxMessage> batch = tx.execute(status -> jdbc.sql("""
                        update outbox o
                        set lease_owner = :owner, lease_until = :leaseUntil
                        where o.event_id in (
                            select event_id from outbox
                            where state = 'PENDING'
                              and next_attempt_at <= :now
                              and (lease_until is null or lease_until < :now)
                            order by next_attempt_at
                            limit :limit
                            for update skip locked)
                        returning o.event_id, o.event_type, o.schema_version, o.aggregate_type, o.aggregate_id,
                                  o.aggregate_version, o.payload::text as payload, o.correlation_id,
                                  o.occurred_at, o.attempts
                        """)
                .param("owner", owner)
                .param("leaseUntil", now.plus(properties.lease()))
                .param("now", now)
                .param("limit", properties.batchSize())
                .query((rs, i) -> new OutboxMessage(
                        rs.getObject("event_id", UUID.class),
                        rs.getString("event_type"),
                        rs.getInt("schema_version"),
                        rs.getString("aggregate_type"),
                        rs.getObject("aggregate_id", UUID.class),
                        rs.getLong("aggregate_version"),
                        rs.getString("payload"),
                        rs.getObject("correlation_id", UUID.class),
                        rs.getObject("occurred_at", OffsetDateTime.class),
                        rs.getInt("attempts")))
                .list());
        return batch == null ? List.of() : batch;
    }

    private void process(OutboxMessage message) {
        try (CorrelationId.Scope ignored = CorrelationId.open(message.correlationId())) {
            for (OutboxHandler handler : handlers) {
                if (handler.supports(message.type())) {
                    deliver(handler, message);
                }
            }
            markDone(message);
        } catch (RuntimeException ex) {
            markForRetry(message, ex);
        }
    }

    private void deliver(OutboxHandler handler, OutboxMessage message) {
        tx.executeWithoutResult(status -> {
            int fresh = jdbc.sql("""
                            insert into consumer_inbox (consumer_id, event_id, completed_at)
                            values (:consumer, :eventId, :now)
                            on conflict do nothing
                            """)
                    .param("consumer", handler.consumerId())
                    .param("eventId", message.eventId())
                    .param("now", now())
                    .update();
            if (fresh == 1) {
                handler.handle(message);
            }
        });
    }

    private void markDone(OutboxMessage message) {
        jdbc.sql("""
                        update outbox
                        set state = 'DONE', completed_at = :now, lease_owner = null, lease_until = null
                        where event_id = :eventId and lease_owner = :owner
                        """)
                .param("now", now())
                .param("eventId", message.eventId())
                .param("owner", owner)
                .update();
    }

    private void markForRetry(OutboxMessage message, RuntimeException ex) {
        int attempts = message.attempts() + 1;
        boolean exhausted = attempts >= properties.maxAttempts();
        Duration backoff = backoff(attempts);
        jdbc.sql("""
                        update outbox
                        set attempts = :attempts,
                            state = :state,
                            next_attempt_at = :next,
                            last_error = :error,
                            lease_owner = null,
                            lease_until = null
                        where event_id = :eventId and lease_owner = :owner
                        """)
                .param("attempts", attempts)
                .param("state", exhausted ? "FAILED" : "PENDING")
                .param("next", now().plus(backoff))
                .param("error", truncate(String.valueOf(ex)))
                .param("eventId", message.eventId())
                .param("owner", owner)
                .update();
        if (exhausted) {
            log.error("Outbox event {} ({}) failed after {} attempts", message.eventId(), message.type(), attempts, ex);
        } else {
            log.warn("Outbox event {} ({}) failed, attempt {}; retry in {}", message.eventId(), message.type(),
                    attempts, backoff, ex);
        }
    }

    static Duration backoff(int attempts) {
        long seconds = 1L << Math.min(attempts - 1, 20);
        Duration delay = Duration.ofSeconds(seconds);
        return delay.compareTo(MAX_BACKOFF) > 0 ? MAX_BACKOFF : delay;
    }

    private OffsetDateTime now() {
        return OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
    }

    private static String truncate(String value) {
        return value.length() <= 1000 ? value : value.substring(0, 1000);
    }
}
