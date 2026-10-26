package taxi.blizz.platform.internal;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/** Polls the outbox; switched off with {@code blizz.outbox.relay.enabled=false}. */
@Configuration(proxyBeanMethods = false)
@EnableScheduling
@ConditionalOnProperty(prefix = "blizz.outbox.relay", name = "enabled", havingValue = "true", matchIfMissing = true)
class OutboxRelayScheduler {

    private final OutboxRelay relay;

    OutboxRelayScheduler(OutboxRelay relay) {
        this.relay = relay;
    }

    @Scheduled(fixedDelayString = "${blizz.outbox.relay.poll-interval:PT1S}")
    void poll() {
        relay.runOnce();
    }
}
