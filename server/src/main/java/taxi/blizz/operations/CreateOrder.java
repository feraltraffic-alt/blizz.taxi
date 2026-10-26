package taxi.blizz.operations;

import java.util.Objects;
import java.util.UUID;
import taxi.blizz.geo.GeoPoint;

/**
 * A confirmed order request (REQ-ORD-01: the form before confirmation is not an order).
 * {@code payerClientId} is the client account paying; for a phone order without an account it is
 * null and the caller is the staff member. The price is taken from a consumed quote once pricing is
 * connected; until then it may be absent.
 */
public record CreateOrder(
        UUID payerClientId,
        String vehicleClass,
        GeoPoint pickup,
        String pickupLabel,
        GeoPoint dropoff,
        String dropoffLabel,
        PaymentMethod paymentMethod,
        Long priceMinor,
        String currency) {

    public CreateOrder {
        Objects.requireNonNull(vehicleClass, "vehicleClass");
        Objects.requireNonNull(pickup, "pickup");
        Objects.requireNonNull(dropoff, "dropoff");
        Objects.requireNonNull(paymentMethod, "paymentMethod");
    }
}
