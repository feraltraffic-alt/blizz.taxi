package taxi.blizz.pricing.internal;

import java.math.BigDecimal;
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
        @DefaultValue("1.3") BigDecimal detourFactor,
        @DefaultValue("25") BigDecimal averageSpeedKmh) {

    RouteProperties {
        if (detourFactor.compareTo(BigDecimal.ONE) < 0 || averageSpeedKmh.signum() <= 0) {
            throw new IllegalArgumentException("detour-factor must be >= 1 and average-speed-kmh > 0");
        }
    }
}
