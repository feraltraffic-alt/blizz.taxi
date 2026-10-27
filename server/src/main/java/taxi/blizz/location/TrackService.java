package taxi.blizz.location;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import taxi.blizz.platform.Actor;

/** Driver GPS history owned by the location module (REQ-GEO-01, T-14). */
public interface TrackService {

    enum Flag {
        FUTURE, POOR_ACCURACY, JUMP
    }

    record InputPoint(long sequence, double lat, double lon, double accuracyM, Double speedMps,
                      Double headingDeg, OffsetDateTime recordedAt) {
    }

    record TrackPoint(UUID driverId, UUID deviceSessionId, long sequence, double lat, double lon,
                      double accuracyM, Double speedMps, Double headingDeg, OffsetDateTime recordedAt,
                      OffsetDateTime receivedAt, Set<Flag> flags) {
        public TrackPoint {
            flags = Set.copyOf(flags);
        }
    }

    record BatchResult(int accepted, int duplicates, int flagged) {
    }

    BatchResult store(Actor driver, UUID deviceSessionId, UUID commandId, List<InputPoint> points);

    /** Inclusive time window, ordered by device recorded time and sequence. */
    List<TrackPoint> points(UUID driverId, OffsetDateTime from, OffsetDateTime to);
}
