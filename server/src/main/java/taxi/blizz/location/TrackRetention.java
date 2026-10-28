package taxi.blizz.location;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/**
 * What the GPS track clean-up must know from other modules (REQ-PRV-02, issue #81): location does not know trips or
 * disputes, so the modules that do implement this — every implementation is asked. A point inside a trip is kept for
 * the trip retention; the points of a disputed trip are evidence and are never deleted.
 */
public interface TrackRetention {

    /** A driver's trip on an order; {@code to} null while it is still going. */
    record TripWindow(UUID driverId, UUID orderId, OffsetDateTime from, OffsetDateTime to) {
    }

    /** The trips of these drivers that overlap {@code [from, to]}. */
    default List<TripWindow> trips(Set<UUID> driverIds, OffsetDateTime from, OffsetDateTime to) {
        return List.of();
    }

    /** Of these orders, those whose track must stay (an open support case, a risk flag). */
    default Set<UUID> held(Set<UUID> orderIds) {
        return Set.of();
    }
}
