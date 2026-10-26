package taxi.blizz.platform.internal;

import java.time.Duration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

/**
 * Outbox relay settings.
 *
 * @param enabled      run the scheduled relay in this process
 * @param pollInterval delay between polls
 * @param batchSize    events claimed per poll
 * @param lease        how long a claimed batch is reserved for this process
 * @param maxAttempts  attempts before an event is marked FAILED and needs attention
 */
@ConfigurationProperties("blizz.outbox.relay")
public record OutboxProperties(
        @DefaultValue("true") boolean enabled,
        @DefaultValue("PT1S") Duration pollInterval,
        @DefaultValue("100") int batchSize,
        @DefaultValue("PT30S") Duration lease,
        @DefaultValue("20") int maxAttempts) {
}
