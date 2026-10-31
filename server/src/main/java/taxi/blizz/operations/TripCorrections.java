package taxi.blizz.operations;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import taxi.blizz.platform.Actor;

/**
 * Correcting a trip's facts after the start (REQ-CAN-07, issue #142): the start pressed by mistake, or the right start
 * or completion time, as append-only records with the reason and the author beside the trip's own times, which never
 * change. No money moves — a fare correction does that. A correction made before a card trip completes holds its
 * capture until staff close the review. Commands need {@link #CORRECT_PERMISSION} in the order's city.
 */
public interface TripCorrections {

    String CORRECT_PERMISSION = "trips.correct";

    /** How long before the card hold expires a held capture starts without the review; a setting, default 6 hours. */
    String HELD_CAPTURE_MARGIN = "blizz.trips.held-capture-margin";

    /**
     * {@code kind}: START_VOID, STARTED_AT or COMPLETED_AT; {@code correctedValue} null for START_VOID.
     * {@code releasedByDeadlineAt}: when the capture it held started without the review, the card hold being about to
     * expire ({@link #HELD_CAPTURE_MARGIN} before); it still waits for the review.
     */
    record Correction(UUID id, String kind, OffsetDateTime recordedValue, OffsetDateTime correctedValue, String reason,
                      UUID authorId, OffsetDateTime createdAt, boolean holdsCapture, OffsetDateTime reviewedAt,
                      UUID reviewedBy, OffsetDateTime releasedByDeadlineAt) {
    }

    /** The trip's recorded times and, beside them, the latest correction of each. */
    record Facts(UUID orderId, UUID tripId, long version, String phase, OffsetDateTime arrivedAt,
                 OffsetDateTime startedAt, OffsetDateTime completedAt, OffsetDateTime correctedStartedAt,
                 OffsetDateTime correctedCompletedAt, boolean startVoid, boolean needsReview, boolean captureHeld,
                 List<Correction> corrections) {
    }

    /** At least one: {@code startedByMistake} true, {@code startedAt}, {@code completedAt}. */
    record Change(boolean startedByMistake, OffsetDateTime startedAt, OffsetDateTime completedAt) {
    }

    /** The order's trip facts; {@code Orders.VIEW_PERMISSION} in its city. */
    Facts facts(Actor staff, UUID orderId);

    /**
     * A command. VERSION_CONFLICT for a stale trip version; STATE_CONFLICT before the start or with nothing to
     * correct; VALIDATION_FAILED for a time in the future, before the arrival, a completion before the start, a
     * correction of the start together with "started by mistake", a completion of a trip not completed, or a bad
     * reason.
     */
    Facts correct(Actor staff, UUID commandId, UUID orderId, long expectedVersion, Change change, String reason);

    /** Closes the open corrections; a capture they held starts. STATE_CONFLICT when none is open. */
    Facts review(Actor staff, UUID commandId, UUID orderId, String reason);
}
