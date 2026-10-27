package taxi.blizz.geo.internal;

import java.time.Duration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

/** Per-rider server-side search budget (REQ-SEC-03). */
@ConfigurationProperties("blizz.geo.address-search")
record AddressSearchProperties(
        @DefaultValue("60") int maxRequests,
        @DefaultValue("PT1M") Duration window) {

    AddressSearchProperties {
        if (maxRequests < 1) {
            throw new IllegalArgumentException("blizz.geo.address-search.max-requests must be positive");
        }
        if (window.isZero() || window.isNegative()) {
            throw new IllegalArgumentException("blizz.geo.address-search.window must be positive");
        }
    }
}
