package taxi.blizz.platform.internal;

import java.time.Duration;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.boot.context.properties.ConfigurationProperties;
import taxi.blizz.platform.ProviderBreakers.Provider;

/**
 * {@code blizz.providers.<name>.failure-threshold} (default 5) and {@code .open-for} (default PT30S), names from
 * {@link Provider} in lower case. An unknown name stops the start: a misspelt key never silently keeps defaults.
 */
@ConfigurationProperties("blizz")
record BreakerProperties(Map<String, Settings> providers) {

    record Settings(Integer failureThreshold, Duration openFor) {
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
            if (s != null && ((s.failureThreshold() != null && s.failureThreshold() < 1)
                    || (s.openFor() != null && (s.openFor().isNegative() || s.openFor().isZero())))) {
                throw new IllegalStateException("blizz.providers." + entry.getKey() + ": failure-threshold >= 1 and "
                        + "a positive open-for");
            }
        }
    }

    static String key(Provider provider) {
        return provider.name().toLowerCase(Locale.ROOT);
    }

    int threshold(Provider provider) {
        Settings s = providers.get(key(provider));
        return s == null || s.failureThreshold() == null ? 5 : s.failureThreshold();
    }

    Duration openFor(Provider provider) {
        Settings s = providers.get(key(provider));
        return s == null || s.openFor() == null ? Duration.ofSeconds(30) : s.openFor();
    }
}
