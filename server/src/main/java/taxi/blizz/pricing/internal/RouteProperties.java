package taxi.blizz.pricing.internal;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

/**
 * Straight-line route estimate used until a routing provider is connected.
 *
 * @param detourFactor     road distance per straight-line metre
 * @param averageSpeedKmh  average city speed for the duration
 */
@ConfigurationProperties("blizz.pricing.route")
record RouteProperties(
        @DefaultValue("1.3") double detourFactor,
        @DefaultValue("25") double averageSpeedKmh) {

    RouteProperties {
        if (detourFactor < 1 || averageSpeedKmh <= 0) {
            throw new IllegalArgumentException("detour-factor must be >= 1 and average-speed-kmh > 0");
        }
    }
}
