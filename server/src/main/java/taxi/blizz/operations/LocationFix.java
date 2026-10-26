package taxi.blizz.operations;

import java.time.OffsetDateTime;
import java.util.Objects;
import taxi.blizz.geo.GeoPoint;

/**
 * One GPS point from the driver app (REQ-GEO-01, REQ-GEO-02). {@code sequence} grows per app
 * session; an older sequence never moves the current position back. {@code recordedAt} is the
 * device time and is only used to discard obviously wrong points; freshness is judged by server time.
 */
public record LocationFix(GeoPoint point, Double accuracyMeters, OffsetDateTime recordedAt, long sequence) {

    public LocationFix {
        Objects.requireNonNull(point, "point");
        Objects.requireNonNull(recordedAt, "recordedAt");
        if (accuracyMeters != null && (accuracyMeters < 0 || accuracyMeters.isNaN())) {
            throw new IllegalArgumentException("accuracy must be >= 0");
        }
    }
}
