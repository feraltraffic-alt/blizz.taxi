package taxi.blizz.operations;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import taxi.blizz.platform.Actor;

/** Order lifecycle commands (section 9). Every change is a named command with a command id. */
public interface Orders {

    String CREATE_PERMISSION = "orders.create";
    String VIEW_PERMISSION = "orders.view";
    String CANCEL_PERMISSION = "orders.cancel";
    String REASSIGN_PERMISSION = "orders.reassign";

    /**
     * Creates the order and starts the search. A client creates orders it pays for; staff need
     * {@link #CREATE_PERMISSION} and the pickup city in their scope (REQ-OPS-03).
     */
    OrderView create(Actor actor, UUID commandId, CreateOrder order);

    /**
     * Cancels before the trip starts: by the paying client or by staff with {@link #CANCEL_PERMISSION}.
     * Releases an assignment and the driver; no fee until the cancellation policy exists (Q-07).
     */
    OrderView cancel(Actor actor, UUID commandId, UUID orderId, long expectedVersion, String reasonCode);

    /**
     * Takes the driver off an assigned order before the start, with a reason, and searches again
     * (REQ-OPS-05). Staff with {@link #REASSIGN_PERMISSION} for the order's city.
     */
    OrderView revokeAssignment(Actor staff, UUID commandId, UUID orderId, long expectedVersion, String reason);

    OrderView get(UUID orderId);

    /** Orders of one city visible to staff, newest first; limit is capped at 100 (REQ-OPS-01). */
    List<OrderView> inCity(Actor staff, UUID cityId, boolean activeOnly, OffsetDateTime before, int limit);

    /** The payer's order that is not yet finished, if any. */
    Optional<OrderView> active(UUID payerClientId);
}
