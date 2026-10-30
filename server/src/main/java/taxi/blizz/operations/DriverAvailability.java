package taxi.blizz.operations;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

/**
 * The driver's state as independent axes (section 12.1). No single "status" field: whether the
 * driver may get a new order is {@code eligible}, with the reasons when not (REQ-DS-02).
 * {@code accepted} is set only in the answer to a heartbeat: whether its location became the dispatch position
 * (issue #102); null, and left out of the JSON, everywhere else.
 */
public record DriverAvailability(
        UUID driverId,
        UUID sessionId,
        long sessionVersion,
        String sessionState,
        String intent,
        String connection,
        String geolocation,
        String occupancy,
        String accountState,
        String reviewStatus,
        UUID cityId,
        UUID vehicleId,
        OffsetDateTime lastHeartbeatAt,
        OffsetDateTime lastLocationAt,
        boolean eligible,
        List<String> ineligibleReasons,
        @JsonInclude(JsonInclude.Include.NON_NULL) Boolean accepted) {

    public DriverAvailability withAccepted(boolean value) {
        return new DriverAvailability(driverId, sessionId, sessionVersion, sessionState, intent, connection,
                geolocation, occupancy, accountState, reviewStatus, cityId, vehicleId, lastHeartbeatAt, lastLocationAt,
                eligible, ineligibleReasons, value);
    }
}
