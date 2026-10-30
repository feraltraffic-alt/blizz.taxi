package taxi.blizz.operations.internal;

import java.time.Duration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

/**
 * Presence thresholds (section 30: presence.stale / disconnected, eligibility.gps_max_age).
 *
 * @param stale              heartbeat older than this is STALE (REQ-GEO-04)
 * @param disconnected       heartbeat older than this is DISCONNECTED
 * @param gpsMaxAge          location older than this is not FRESH and the driver is not eligible
 * @param openLocationMaxAge device time of the location used to go online may be at most this old
 * @param futureTolerance    device time may be ahead of the server by at most this much
 * @param eligibilityAccuracyMeters a fix that reports a worse accuracy keeps the driver out of new orders
 *                                  (LOCATION_INACCURATE) until an accurate one (REQ-GEO-04, issue #141); a fix
 *                                  without accuracy is taken, as the Location contract makes it optional
 */
@ConfigurationProperties("blizz.presence")
public record PresenceProperties(
        @DefaultValue("PT15S") Duration stale,
        @DefaultValue("PT30S") Duration disconnected,
        @DefaultValue("PT15S") Duration gpsMaxAge,
        @DefaultValue("PT60S") Duration openLocationMaxAge,
        @DefaultValue("PT30S") Duration futureTolerance,
        @DefaultValue("100") double eligibilityAccuracyMeters) {
}
