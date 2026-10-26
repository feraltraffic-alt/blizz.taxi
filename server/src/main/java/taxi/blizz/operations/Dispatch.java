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
     * assignment (T-10).
     */
    AssignmentView accept(Actor driver, UUID commandId, UUID offerId);

    /** Declines an offer; the search continues with the next driver. */
    void reject(Actor driver, UUID commandId, UUID offerId);

    /** Orders in the "ALL" tab the driver may claim now; empty when the driver is not eligible. */
    List<BroadcastOrderView> broadcast(Actor driver);

    /** Takes an order from the "ALL" tab; exactly one of many concurrent claims wins (T-05). */
    AssignmentView claim(Actor driver, UUID commandId, UUID orderId);

    Optional<AssignmentView> currentAssignment(Actor driver);
}
