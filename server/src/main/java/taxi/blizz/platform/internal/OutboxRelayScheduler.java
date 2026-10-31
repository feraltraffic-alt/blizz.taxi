package taxi.blizz.platform.internal;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Polls the outbox; switched off with {@code blizz.outbox.relay.enabled=false}. A full batch means more is waiting,
 * so the poll claims again at once, up to {@link #MAX_ROUNDS} batches, instead of waiting for the next tick: one batch
 * a tick capped the relay at {@code batch-size} events a second (the L1 run of #146 saw a 6 s lag; issue #178).
 */
@Configuration(proxyBeanMethods = false)
@EnableScheduling
@ConditionalOnProperty(prefix = "blizz.outbox.relay", name = "enabled", havingValue = "true", matchIfMissing = true)
class OutboxRelayScheduler {

    /** Batches one tick claims at most, so a flood still lets the tick end and the lease of each batch stay short. */
    static final int MAX_ROUNDS = 10;

    private final OutboxRelay relay;
    private final OutboxProperties properties;

    OutboxRelayScheduler(OutboxRelay relay, OutboxProperties properties) {
        this.relay = relay;
        this.properties = properties;
    }

    @Scheduled(fixedDelayString = "${blizz.outbox.relay.poll-interval:PT1S}")
    void poll() {
        drain(relay, properties.batchSize());
    }

    /** Claims batches while they come back full; how many batches it claimed. */
    static int drain(OutboxRelay relay, int batchSize) {
        int rounds = 0;
        while (rounds < MAX_ROUNDS) {
            rounds++;
            if (relay.runOnce() < batchSize) {
                break;
            }
        }
        return rounds;
    }
}
