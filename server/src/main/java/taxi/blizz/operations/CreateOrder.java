package taxi.blizz.operations;

import java.util.Objects;
import java.util.UUID;
import taxi.blizz.geo.GeoPoint;

/**
 * A confirmed order request (REQ-ORD-01: the form before confirmation is not an order).
 * {@code channel} says where it came from: a client may choose APP or WEB (APP when omitted);
 * staff orders are always PHONE; PARTNER orders arrive only through the exchange protocol.
 * {@code payerClientId} is the client account paying; for a phone order without an account it is
 * null and the caller is the staff member. The price is never taken from the request: the order
 * consumes {@code quoteId}, a quote issued to the same caller for the same city, class and points
 * (REQ-PRC-05, REQ-PRC-06).
 */
public record CreateOrder(
        UUID payerClientId,
        String vehicleClass,
        GeoPoint pickup,
        String pickupLabel,
        GeoPoint dropoff,
        String dropoffLabel,
        PaymentMethod paymentMethod,
        UUID quoteId,
        OrderChannel channel,
        String sourceRef) {

    /** A request without an explicit source; the channel is derived from the actor. */
    public CreateOrder(UUID payerClientId, String vehicleClass, GeoPoint pickup, String pickupLabel, GeoPoint dropoff,
                       String dropoffLabel, PaymentMethod paymentMethod, UUID quoteId) {
        this(payerClientId, vehicleClass, pickup, pickupLabel, dropoff, dropoffLabel, paymentMethod, quoteId,
                null, null);
    }

    public CreateOrder {
        Objects.requireNonNull(vehicleClass, "vehicleClass");
        Objects.requireNonNull(pickup, "pickup");
        Objects.requireNonNull(dropoff, "dropoff");
        Objects.requireNonNull(paymentMethod, "paymentMethod");
    }
}
