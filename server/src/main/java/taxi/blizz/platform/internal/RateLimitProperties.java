package taxi.blizz.platform.internal;

import java.time.Duration;
import java.util.Map;
import org.springframework.boot.context.properties.ConfigurationProperties;

/** {@code blizz.rate-limits.buckets.<bucket>}: at most {@code max} actions per {@code window} per rider or driver. */
@ConfigurationProperties("blizz.rate-limits")
record RateLimitProperties(Map<String, Limit> buckets) {

    record Limit(int max, Duration window) {
    }

    /** The defaults when the configuration says nothing: generous for a person, tight for a bot. */
    static final Map<String, Limit> DEFAULTS = Map.of(
            "quote", new Limit(60, Duration.ofMinutes(10)),
            "order", new Limit(20, Duration.ofHours(1)),
            "offer-accept", new Limit(60, Duration.ofMinutes(10)),
            "file-upload", new Limit(30, Duration.ofHours(1)),
            "broadcast-claim", new Limit(30, Duration.ofMinutes(10)),
            "broadcast-list", new Limit(120, Duration.ofMinutes(1)));

    RateLimitProperties {
        buckets = buckets == null ? Map.of() : Map.copyOf(buckets);
    }

    Limit of(String bucket) {
        Limit limit = buckets.getOrDefault(bucket, DEFAULTS.get(bucket));
        if (limit == null) {
            throw new IllegalArgumentException("Unknown rate limit bucket " + bucket);
        }
        return limit;
    }
}
