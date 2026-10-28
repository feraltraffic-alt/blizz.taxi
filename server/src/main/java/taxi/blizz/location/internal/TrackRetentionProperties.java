package taxi.blizz.location.internal;

import java.time.Duration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

/**
 * GPS track retention (REQ-PRV-02, issue #81); the final numbers come with Q-19.
 *
 * @param offTrip      points outside any trip are deleted after this
 * @param trip         points of a trip are deleted after this, unless the trip is disputed
 * @param batch        rows looked at per step, so the table is never locked for long
 * @param sweepEnabled run the clean-up on a timer in this process
 */
@ConfigurationProperties("blizz.location.retention")
record TrackRetentionProperties(
        @DefaultValue("PT24H") Duration offTrip,
        @DefaultValue("P90D") Duration trip,
        @DefaultValue("5000") int batch,
        @DefaultValue("true") boolean sweepEnabled) {

    TrackRetentionProperties {
        if (offTrip.isNegative() || offTrip.isZero() || trip.compareTo(offTrip) < 0) {
            throw new IllegalArgumentException("retention: off-trip must be positive and trip at least as long");
        }
        if (batch < 1) {
            throw new IllegalArgumentException("retention: batch must be positive");
        }
    }
}
