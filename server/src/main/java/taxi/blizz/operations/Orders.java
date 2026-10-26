package taxi.blizz.operations;

import java.util.Optional;
import java.util.UUID;
import taxi.blizz.platform.Actor;

/** Order lifecycle commands (section 9). Every change is a named command with a command id. */
public interface Orders {

    String CREATE_PERMISSION = "orders.create";
    String CANCEL_PERMISSION = "orders.cancel";

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

    OrderView get(UUID orderId);

    /** The payer's order that is not yet finished, if any. */
    Optional<OrderView> active(UUID payerClientId);
}
