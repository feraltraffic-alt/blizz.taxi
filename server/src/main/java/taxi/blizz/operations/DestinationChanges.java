package taxi.blizz.operations;

import java.util.UUID;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.platform.Actor;

/**
 * Support changes where a trip in progress ends (REQ-RID-06, the M1 agreed procedure; issue #142). The new price is a
 * new quote from the same pickup with the terms of the order's own tariff version; it becomes the order's quote, so the
 * fare at completion comes from it. A card order whose card part is now above the hold is marked as needing
 * attention ({@link #EVENT} with {@code above_hold}, a payment problem case): at completion the hold is taken and
 * the rest charged once, and what fails stays the rider's debt.
 */
public interface DestinationChanges {

    String PERMISSION = Orders.REASSIGN_PERMISSION;
    String EVENT = "DestinationChanged";

    record Change(GeoPoint dropoff, String dropoffLabel, String reason) {
    }

    /** {@code holdMinor}: the card hold, null when the order has none. */
    record Changed(OrderView order, long previousPriceMinor, long priceMinor, String currency, Long holdMinor,
                   boolean aboveHold) {
    }

    /**
     * Staff with {@link #PERMISSION} in the order's city; the order IN_SERVICE with its trip in progress, else
     * STATE_CONFLICT; a stale {@code expectedVersion} is a version conflict. A repeated {@code commandId} replays the
     * first result.
     */
    Changed change(Actor staff, UUID commandId, UUID orderId, long expectedVersion, Change change);
}
