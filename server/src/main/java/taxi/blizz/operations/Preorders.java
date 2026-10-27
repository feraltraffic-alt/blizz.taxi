package taxi.blizz.operations;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.platform.Actor;

/**
 * Drivers reserving pre-orders (ADR 0006, settings: pre-orders in RESERVATION mode). A driver sees the pre-orders of
 * his city and class, reserves one, and confirms "On my way" in the confirmation window before the pickup; then he is
 * the assigned driver. Not confirmed in time, the reservation expires and the order goes to the search. He may drop
 * the reservation himself until {@code driverCancelUntilMinutesBefore} before the pickup; later only a dispatcher
 * can remove him ({@link Orders#REASSIGN_PERMISSION}).
 */
public interface Preorders {

    /** A driver holds at most this many reservations at a time. */
    int MAX_RESERVATIONS_PER_DRIVER = 3;

    record Available(UUID orderId, long shortNumber, OffsetDateTime pickupAt, String vehicleClass, GeoPoint pickup,
                     String pickupLabel, String dropoffLabel, Long priceMinor, String currency,
                     PaymentMethod paymentMethod) {
    }

    /**
     * {@code confirmFrom}–{@code confirmUntil}: when "On my way" is accepted; {@code dropUntil}: until when the driver
     * may drop it himself. Times follow the settings in force.
     */
    record Reservation(UUID id, String state, Available order, OffsetDateTime reservedAt, OffsetDateTime confirmFrom,
                       OffsetDateTime confirmUntil, OffsetDateTime dropUntil) {
    }

    /** Who holds the reservation of a pre-order, for the operator's order card. */
    record Holder(UUID reservationId, UUID driverId, String driverName, OffsetDateTime reservedAt) {
    }

    /** Pre-orders the driver may reserve: his city and vehicle class, not reserved, newest pickup last. */
    List<Available> available(Actor driver);

    /** The driver's open reservations, nearest pickup first. */
    List<Reservation> mine(Actor driver);

    Reservation reserve(Actor driver, UUID commandId, UUID orderId);

    /** {@code reasonCode} from the drivers' list of cancellation reasons. */
    Reservation drop(Actor driver, UUID commandId, UUID reservationId, String reasonCode);

    /** "On my way": the reserved driver becomes the assigned driver (order ASSIGNED, trip TO_PICKUP). */
    AssignmentView confirm(Actor driver, UUID commandId, UUID reservationId);

    /** A dispatcher takes the driver off a reservation at any time; the pre-order stays SCHEDULED. */
    OrderView removeReservation(Actor staff, UUID commandId, UUID orderId, String reason);

    Optional<Holder> holder(UUID orderId);
}
