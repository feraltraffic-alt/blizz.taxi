package taxi.blizz.pricing.internal;

import java.time.Duration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

/**
 * Road routes from GraphHopper (owner decision: GraphHopper for routing). Either the hosted API (set {@code apiKey})
 * or an own GraphHopper server next to the backend (set {@code baseUrl}, no key) — both speak the same /route API.
 *
 * @param enabled  off: the straight-line estimate is used
 * @param baseUrl  the hosted API by default; e.g. http://graphhopper:8989 for an own server
 * @param apiKey   the hosted API's key; from the environment only
 * @param profile  the vehicle profile configured on the server
 * @param timeout  after this the straight-line estimate is used for the quote
 */
@ConfigurationProperties("blizz.routing.graphhopper")
record GraphHopperProperties(
        @DefaultValue("false") boolean enabled,
        @DefaultValue("https://graphhopper.com/api/1") String baseUrl,
        String apiKey,
        @DefaultValue("car") String profile,
        @DefaultValue("PT3S") Duration timeout) {

    @Override
    public String toString() {
        return "GraphHopperProperties[enabled=" + enabled + ", baseUrl=" + baseUrl + ", profile=" + profile
                + ", apiKey=" + (apiKey == null || apiKey.isBlank() ? "none" : "set") + "]";
    }
}
