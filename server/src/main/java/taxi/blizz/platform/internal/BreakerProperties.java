package taxi.blizz.platform.internal;

import java.time.Duration;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.boot.context.properties.ConfigurationProperties;
import taxi.blizz.platform.ProviderBreakers.Provider;

/**
 * Per provider, names from {@link Provider} in lower case (REQ-ENG-07):
 * <ul>
 *     <li>{@code blizz.providers.<name>.failure-threshold} (default 5) and {@code .open-for} (default PT30S): the
 *     breaker;</li>
 *     <li>{@code .max-concurrent} (default 16): the bulkhead, callers in the provider at once;</li>
 *     <li>{@code .retry-ratio} (default 0.2) and {@code .retry-burst} (default 10): the retry budget, retries earned
 *     per call and the most that can be saved up;</li>
 *     <li>{@code .timeout} (default PT10S): how long one call may take.</li>
 * </ul>
 * An unknown name stops the start: a misspelt key never silently keeps defaults.
 */
@ConfigurationProperties("blizz")
record BreakerProperties(Map<String, Settings> providers) {

    record Settings(Integer failureThreshold, Duration openFor, Integer maxConcurrent, Double retryRatio,
                    Integer retryBurst, Duration timeout) {

        Settings(Integer failureThreshold, Duration openFor) {
            this(failureThreshold, openFor, null, null, null, null);
        }
    }

    BreakerProperties {
        providers = providers == null ? Map.of() : Map.copyOf(providers);
        String known = Arrays.stream(Provider.values()).map(BreakerProperties::key).sorted()
                .collect(Collectors.joining(", "));
        for (var entry : providers.entrySet()) {
            if (Arrays.stream(Provider.values()).noneMatch(p -> key(p).equals(entry.getKey()))) {
                throw new IllegalStateException("blizz.providers." + entry.getKey() + " is not a provider; known: "
                        + known);
            }
            Settings s = entry.getValue();
            if (s != null && (below(s.failureThreshold(), 1) || notPositive(s.openFor())
                    || below(s.maxConcurrent(), 1) || (s.retryRatio() != null && s.retryRatio() < 0)
                    || below(s.retryBurst(), 1) || notPositive(s.timeout()))) {
                throw new IllegalStateException("blizz.providers." + entry.getKey() + ": failure-threshold, "
                        + "max-concurrent and retry-burst >= 1, retry-ratio >= 0, a positive open-for and timeout");
            }
        }
    }

    private static boolean below(Integer value, int least) {
        return value != null && value < least;
    }

    private static boolean notPositive(Duration value) {
        return value != null && (value.isNegative() || value.isZero());
    }

    static String key(Provider provider) {
        return provider.name().toLowerCase(Locale.ROOT);
    }

    private Settings settings(Provider provider) {
        Settings s = providers.get(key(provider));
        return s == null ? new Settings(null, null) : s;
    }

    int threshold(Provider provider) {
        Integer value = settings(provider).failureThreshold();
        return value == null ? 5 : value;
    }

    Duration openFor(Provider provider) {
        Duration value = settings(provider).openFor();
        return value == null ? Duration.ofSeconds(30) : value;
    }

    int maxConcurrent(Provider provider) {
        Integer value = settings(provider).maxConcurrent();
        return value == null ? 16 : value;
    }

    double retryRatio(Provider provider) {
        Double value = settings(provider).retryRatio();
        return value == null ? 0.2 : value;
    }

    int retryBurst(Provider provider) {
        Integer value = settings(provider).retryBurst();
        return value == null ? 10 : value;
    }

    Duration timeout(Provider provider) {
        Duration value = settings(provider).timeout();
        return value == null ? Duration.ofSeconds(10) : value;
    }
}
