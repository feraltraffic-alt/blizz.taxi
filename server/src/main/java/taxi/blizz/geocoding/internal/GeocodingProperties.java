package taxi.blizz.geocoding.internal;

import java.time.Duration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

/**
 * The environment's defaults; the admin panel's values win (Integrations).
 *
 * @param provider          BUILT_IN, GOOGLE, VISICOM, or FAKE (tests and the sandbox only)
 * @param callsPerMinute    provider calls one requester may cause per minute on one instance (a cost guard)
 */
@ConfigurationProperties("blizz.geocoding")
record GeocodingProperties(
        @DefaultValue("BUILT_IN") String provider,
        String googleApiKey,
        String visicomApiKey,
        @DefaultValue("PT3S") Duration timeout,
        @DefaultValue("30") int callsPerMinute) {

    @Override
    public String toString() {
        return "GeocodingProperties[provider=" + provider + "]"; // never the keys
    }
}
