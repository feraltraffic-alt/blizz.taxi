package taxi.blizz.operations;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.PageCursor;

/**
 * Commands of the assigned driver on the trip (sections 9, 10). Only the driver of the active
 * assignment can use them (REQ-DRV-09); each carries the trip version it acted on.
 */
public interface Trips {

    record HistoryItem(UUID id, UUID orderId, long orderShortNumber, OffsetDateTime createdAt,
                       String pickupLabel, String dropoffLabel, Long finalPriceMinor, String currency,
                       PaymentMethod paymentMethod, String phase) {
    }

    Optional<TripView> current(Actor driver);

    /** Completed and aborted trips of the signed-in driver, newest first; limit is capped at 50. */
    /** The driver's trips, newest first, after {@code after} (REQ-API-09). */
    List<HistoryItem> history(Actor driver, PageCursor after, int limit);

    String DRIVER_TRIPS = "driver-trips";

    static PageCursor position(HistoryItem item) {
        return PageCursor.of(DRIVER_TRIPS, item.createdAt(), item.id());
    }

    /**
     * TO_PICKUP → WAITING. The driver's last server-side position must be fresh, accurate enough
     * ({@code blizz.dispatch.arrival-accuracy-meters}) and near the pickup point; otherwise {@code PICKUP_TOO_FAR} / {@code LOCATION_NOT_FRESH}, unless the driver gives
     * an exception reason — then the arrival is accepted and flagged for review (REQ-ASG-06).
     */
    TripView arrive(Actor driver, UUID commandId, UUID tripId, long expectedVersion, String exceptionReason);

    /**
     * WAITING → IN_PROGRESS, order ASSIGNED → IN_SERVICE. Starting without a confirmed arrival needs
     * an exception reason and is flagged for review (REQ-ASG-05).
     */
    TripView start(Actor driver, UUID commandId, UUID tripId, long expectedVersion, String exceptionReason);

    /**
     * IN_PROGRESS → COMPLETED, order FULFILLED, driver free (REQ-ORD-04/05). {@code reportedAt} is the
     * device time of completion; the server time is recorded too and a large difference is flagged.
     * For cash and for a card at the driver's own terminal, {@code cashReceived} is the driver's statement that the
     * money came, not proof (REQ-PAY-15).
     */
    /**
     * The driver gives up the order before the start (REQ-ASG-04, REQ-CAN-05): the assignment is
     * released, the driver is free and never offered this order again, and the search resumes with
     * what is left of the passenger's search time. {@code reasonCode} is an active driver reason of the catalog whose
     * outcome is RETURN_TO_SEARCH (ADR 0007, REQ-CAN-01, issue #143), else VALIDATION_FAILED; {@code comment} is
     * optional and adds to the code, never replaces it.
     */
    TripView withdraw(Actor driver, UUID commandId, UUID tripId, long expectedVersion, String reasonCode,
                      String comment);

    /**
     * The passenger did not come out (REQ-CAN-06): allowed only after the minimum waiting time since
     * the server-side arrival; the order is cancelled with reason NO_SHOW and the driver is free.
     * No fee until the cancellation policy exists (Q-07).
     */
    TripView reportNoShow(Actor driver, UUID commandId, UUID tripId, long expectedVersion);

    /**
     * The driver cancels with a reason from the drivers' list (owner decision 27.10.2026), before the start. The
     * reason decides the outcome: RETURN_TO_SEARCH works like {@link #withdraw}; CANCEL_ORDER cancels the order by
     * the driver; NO_SHOW follows the no-show rule of {@link #reportNoShow}.
     */
    TripView cancel(Actor driver, UUID commandId, UUID tripId, long expectedVersion, String reasonCode);

    TripView complete(Actor driver, UUID commandId, UUID tripId, long expectedVersion, OffsetDateTime reportedAt,
                      Boolean cashReceived);
}
