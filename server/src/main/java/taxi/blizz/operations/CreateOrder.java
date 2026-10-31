package taxi.blizz.operations;

import java.time.Instant;
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
 * (REQ-PRC-05, REQ-PRC-06). {@code pickupAt} asks for a pickup time; it must be the time the quote was made for,
 * and far enough ahead it makes a pre-order (ADR 0006). {@code terminalFallbackToCash}: with TERMINAL, the caller
 * agreed to pay cash if no car with a terminal takes the order (owner decision 27.10.2026). {@code walletMinor}: how
 * many bonuses of the rider's account pay part of the price (ADR 0009); the rest is paid in cash or by card.
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
        String sourceRef,
        CallerContact caller,
        Instant pickupAt,
        boolean terminalFallbackToCash,
        Long walletMinor,
        /** For the driver: a note (up to 500 characters) and where exactly to come (up to 100); issue #143. */
        String comment,
        String entrance) {

    public CreateOrder(UUID payerClientId, String vehicleClass, GeoPoint pickup, String pickupLabel, GeoPoint dropoff,
                       String dropoffLabel, PaymentMethod paymentMethod, UUID quoteId, OrderChannel channel,
                       String sourceRef, CallerContact caller, Instant pickupAt, boolean terminalFallbackToCash,
                       Long walletMinor) {
        this(payerClientId, vehicleClass, pickup, pickupLabel, dropoff, dropoffLabel, paymentMethod, quoteId,
                channel, sourceRef, caller, pickupAt, terminalFallbackToCash, walletMinor, null, null);
    }

    public CreateOrder(UUID payerClientId, String vehicleClass, GeoPoint pickup, String pickupLabel, GeoPoint dropoff,
                       String dropoffLabel, PaymentMethod paymentMethod, UUID quoteId, OrderChannel channel,
                       String sourceRef, CallerContact caller, Instant pickupAt, boolean terminalFallbackToCash) {
        this(payerClientId, vehicleClass, pickup, pickupLabel, dropoff, dropoffLabel, paymentMethod, quoteId,
                channel, sourceRef, caller, pickupAt, terminalFallbackToCash, null);
    }

    public CreateOrder(UUID payerClientId, String vehicleClass, GeoPoint pickup, String pickupLabel, GeoPoint dropoff,
                       String dropoffLabel, PaymentMethod paymentMethod, UUID quoteId, OrderChannel channel,
                       String sourceRef, CallerContact caller, Instant pickupAt) {
        this(payerClientId, vehicleClass, pickup, pickupLabel, dropoff, dropoffLabel, paymentMethod, quoteId,
                channel, sourceRef, caller, pickupAt, false, null);
    }

    /** An order for now; {@code pickupAt} is null. */
    public CreateOrder(UUID payerClientId, String vehicleClass, GeoPoint pickup, String pickupLabel, GeoPoint dropoff,
                       String dropoffLabel, PaymentMethod paymentMethod, UUID quoteId, OrderChannel channel,
                       String sourceRef, CallerContact caller) {
        this(payerClientId, vehicleClass, pickup, pickupLabel, dropoff, dropoffLabel, paymentMethod, quoteId,
                channel, sourceRef, caller, null);
    }

    /** A request without an explicit source; the channel is derived from the actor. */
    public CreateOrder(UUID payerClientId, String vehicleClass, GeoPoint pickup, String pickupLabel, GeoPoint dropoff,
                       String dropoffLabel, PaymentMethod paymentMethod, UUID quoteId) {
        this(payerClientId, vehicleClass, pickup, pickupLabel, dropoff, dropoffLabel, paymentMethod, quoteId,
                null, null, null);
    }

    /** Existing callers that set source/channel but have no phone-order contact. */
    public CreateOrder(UUID payerClientId, String vehicleClass, GeoPoint pickup, String pickupLabel, GeoPoint dropoff,
                       String dropoffLabel, PaymentMethod paymentMethod, UUID quoteId, OrderChannel channel,
                       String sourceRef) {
        this(payerClientId, vehicleClass, pickup, pickupLabel, dropoff, dropoffLabel, paymentMethod, quoteId,
                channel, sourceRef, null);
    }

    public CreateOrder {
        Objects.requireNonNull(vehicleClass, "vehicleClass");
        Objects.requireNonNull(pickup, "pickup");
        Objects.requireNonNull(dropoff, "dropoff");
        Objects.requireNonNull(paymentMethod, "paymentMethod");
    }
}
