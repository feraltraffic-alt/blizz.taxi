package taxi.blizz.operations;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

/**
 * The driver's state as independent axes (section 12.1). No single "status" field: whether the
 * driver may get a new order is {@code eligible}, with the reasons when not (REQ-DS-02).
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
        List<String> ineligibleReasons) {
}
