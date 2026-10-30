package taxi.blizz.operations;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import taxi.blizz.platform.Actor;

/** The driver's side of matching (sections 10, 11). */
public interface Dispatch {

    /** Open personal offers of the driver (at most one in M1). */
    List<OfferView> offers(Actor driver);

    /**
     * Accepts an open offer before its server deadline (REQ-ASG-02). A late or revoked offer gets
     * OFFER_EXPIRED / OFFER_REVOKED, never a silent success. A repeated command returns the original
     * assignment (T-10). Only from {@code deviceSessionId} holding the open shift; another signed-in device of the
     * driver gets STATE_CONFLICT (issue #102, B3).
     */
    AssignmentView accept(Actor driver, UUID deviceSessionId, UUID commandId, UUID offerId);

    /** Declines an offer; the search continues with the next driver. */
    void reject(Actor driver, UUID commandId, UUID offerId);

    /** Orders in the "ALL" tab the driver may claim now; empty when the driver is not eligible. */
    default List<BroadcastOrderView> broadcast(Actor driver) {
        return broadcast(driver, null);
    }

    /**
     * The same, only with the pickup inside {@code zoneId} when given: a published zone of the driver's city, the
     * driver's own choice (REQ-DSP-07, issue #141); another zone is VALIDATION_FAILED.
     */
    List<BroadcastOrderView> broadcast(Actor driver, UUID zoneId);

    /**
     * Takes an order from the "ALL" tab; exactly one of many concurrent claims wins (T-05). Within the tab's radius
     * from the driver's current position (PICKUP_TOO_FAR otherwise), only from {@code deviceSessionId} holding the
     * open shift (STATE_CONFLICT otherwise), and within the driver's {@code broadcast-claim} budget (issue #102).
     */
    AssignmentView claim(Actor driver, UUID deviceSessionId, UUID commandId, UUID orderId);

    Optional<AssignmentView> currentAssignment(Actor driver);
}
