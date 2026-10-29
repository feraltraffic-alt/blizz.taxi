package taxi.blizz.operations;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import taxi.blizz.platform.Actor;

/**
 * Chat ("Написать") between the paying rider and the assigned driver of an order. Messages belong to the
 * assignment: a driver reads only the messages of his own assignment, so after a reassignment the new
 * driver never sees the conversation with the previous one; the rider reads the whole order. Writing opens
 * when a driver is assigned and stays open in the order history — completed, cancelled, no-show — so the
 * rider can write to the driver from the order details (owner decision 27.10.2026). A driver who withdrew
 * or was taken off is no longer the order's driver and cannot write. Staff read everything with
 * {@link #VIEW_PERMISSION} for the order's city, and every such read is audited.
 */
public interface OrderChat {

    String VIEW_PERMISSION = Orders.VIEW_PERMISSION;

    record Message(UUID id, UUID orderId, long sequence, String senderRole, String body, OffsetDateTime sentAt) {
    }

    /** Idempotent by {@code commandId}; 1 to 1000 characters. */
    Message post(Actor sender, UUID commandId, UUID orderId, String body);

    /** Messages after {@code afterSequence}, oldest first, at most {@code limit} (≤ 100). */
    List<Message> messages(Actor reader, UUID orderId, long afterSequence, int limit);

    /** The full conversation of the order for the admin's order details; audited. */
    List<Message> conversation(Actor staff, UUID orderId, String reason);

    /**
     * The whole conversation of the order, oldest first, for a chargeback's evidence (REQ-PAY-23). The caller has
     * checked the staff member's access to the order's city and recorded the look with its reason.
     */
    List<Message> transcript(UUID orderId);

    /** The order of the driver's trip, for the driver app that knows only the trip. */
    UUID orderOfTrip(Actor driver, UUID tripId);
}
