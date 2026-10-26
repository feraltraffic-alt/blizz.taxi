package taxi.blizz.operations;

import java.time.OffsetDateTime;
import java.util.Optional;
import java.util.UUID;
import taxi.blizz.platform.Actor;

/**
 * Commands of the assigned driver on the trip (sections 9, 10). Only the driver of the active
 * assignment can use them (REQ-DRV-09); each carries the trip version it acted on.
 */
public interface Trips {

    Optional<TripView> current(Actor driver);

    /**
     * TO_PICKUP → WAITING. The driver's last server-side position must be fresh and near the pickup
     * point; otherwise {@code PICKUP_TOO_FAR} / {@code LOCATION_NOT_FRESH}, unless the driver gives
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
     * For cash, {@code cashReceived} is the driver's statement, not proof (REQ-PAY-15).
     */
    /**
     * The driver gives up the order before the start (REQ-ASG-04, REQ-CAN-05): the assignment is
     * released, the driver is free and never offered this order again, and the search resumes with
     * what is left of the passenger's search time. A reason is required.
     */
    TripView withdraw(Actor driver, UUID commandId, UUID tripId, long expectedVersion, String reason);

    /**
     * The passenger did not come out (REQ-CAN-06): allowed only after the minimum waiting time since
     * the server-side arrival; the order is cancelled with reason NO_SHOW and the driver is free.
     * No fee until the cancellation policy exists (Q-07).
     */
    TripView reportNoShow(Actor driver, UUID commandId, UUID tripId, long expectedVersion);

    TripView complete(Actor driver, UUID commandId, UUID tripId, long expectedVersion, OffsetDateTime reportedAt,
                      Boolean cashReceived);
}
