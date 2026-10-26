package taxi.blizz.platform.internal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.transaction.IllegalTransactionStateException;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.platform.Outbox;
import taxi.blizz.platform.OutboxEvent;
import taxi.blizz.platform.OutboxHandler;
import taxi.blizz.platform.OutboxMessage;

/** REQ-ENG-05, REQ-ENG-06: events are durable, delivered at least once and processed once per consumer. */
@SpringBootTest
@Import({TestcontainersConfiguration.class, OutboxTests.Handlers.class})
class OutboxTests {

    @Autowired
    Outbox outbox;
    @Autowired
    OutboxRelay relay;
    @Autowired
    TransactionTemplate tx;
    @Autowired
    JdbcClient jdbc;
    @Autowired
    RecordingHandler handler;

    @BeforeEach
    void clean() {
        handler.reset();
        jdbc.sql("delete from consumer_inbox").update();
        jdbc.sql("delete from outbox").update();
    }

    private static OutboxEvent event() {
        return new OutboxEvent("AssignmentCommitted", 1, "Order", UUID.randomUUID(), 8,
                Map.of("assignment_id", UUID.randomUUID().toString()));
    }

    private String state(UUID eventId) {
        return jdbc.sql("select state from outbox where event_id = :id").param("id", eventId)
                .query(String.class).single();
    }

    @Test
    void committedEventIsDeliveredOnce() {
        UUID eventId = tx.execute(status -> outbox.publish(event()));

        relay.runOnce();
        relay.runOnce();

        assertThat(handler.received()).extracting(OutboxMessage::eventId).containsExactly(eventId);
        assertThat(handler.received().getFirst().payload()).contains("assignment_id");
        assertThat(state(eventId)).isEqualTo("DONE");
    }

    @Test
    void rolledBackTransactionPublishesNothing() {
        tx.executeWithoutResult(status -> {
            outbox.publish(event());
            status.setRollbackOnly();
        });

        assertThat(relay.runOnce()).isZero();
        assertThat(handler.received()).isEmpty();
    }

    @Test
    void publishingOutsideATransactionIsRefused() {
        assertThatThrownBy(() -> outbox.publish(event())).isInstanceOf(IllegalTransactionStateException.class);
    }

    @Test
    void failedDeliveryIsRetriedLater() {
        handler.failNext(1);
        UUID eventId = tx.execute(status -> outbox.publish(event()));

        relay.runOnce();
        assertThat(handler.received()).isEmpty();
        assertThat(state(eventId)).isEqualTo("PENDING");
        assertThat(relay.runOnce()).as("not due before backoff").isZero();

        jdbc.sql("update outbox set next_attempt_at = now() - interval '1 second'").update();
        relay.runOnce();

        assertThat(handler.received()).extracting(OutboxMessage::eventId).containsExactly(eventId);
        assertThat(state(eventId)).isEqualTo("DONE");
    }

    @Test
    void redeliveryAfterCrashDoesNotRepeatTheHandler() {
        UUID eventId = tx.execute(status -> outbox.publish(event()));
        relay.runOnce();

        // Crash after the handler committed but before the event was marked DONE.
        jdbc.sql("update outbox set state = 'PENDING', lease_owner = null, lease_until = null").update();
        relay.runOnce();

        assertThat(handler.received()).extracting(OutboxMessage::eventId).containsExactly(eventId);
        assertThat(state(eventId)).isEqualTo("DONE");
    }

    @Test
    void leasedEventIsNotClaimedByAnotherRelay() {
        UUID eventId = tx.execute(status -> outbox.publish(event()));
        jdbc.sql("update outbox set lease_owner = 'other', lease_until = now() + interval '1 minute'").update();

        assertThat(relay.runOnce()).isZero();
        assertThat(state(eventId)).isEqualTo("PENDING");
    }

    @Test
    void backoffGrowsAndIsCapped() {
        assertThat(OutboxRelay.backoff(1)).hasSeconds(1);
        assertThat(OutboxRelay.backoff(2)).hasSeconds(2);
        assertThat(OutboxRelay.backoff(5)).hasSeconds(16);
        assertThat(OutboxRelay.backoff(30)).hasMinutes(5);
    }

    static class RecordingHandler implements OutboxHandler {

        private final List<OutboxMessage> received = new CopyOnWriteArrayList<>();
        private final AtomicInteger failures = new AtomicInteger();

        void reset() {
            received.clear();
            failures.set(0);
        }

        void failNext(int times) {
            failures.set(times);
        }

        List<OutboxMessage> received() {
            return received;
        }

        @Override
        public String consumerId() {
            return "test-recorder";
        }

        @Override
        public boolean supports(String eventType) {
            return "AssignmentCommitted".equals(eventType);
        }

        @Override
        public void handle(OutboxMessage message) {
            if (failures.getAndUpdate(n -> Math.max(0, n - 1)) > 0) {
                throw new IllegalStateException("simulated consumer failure");
            }
            received.add(message);
        }
    }

    @TestConfiguration(proxyBeanMethods = false)
    static class Handlers {
        @Bean
        RecordingHandler recordingHandler() {
            return new RecordingHandler();
        }
    }
}
