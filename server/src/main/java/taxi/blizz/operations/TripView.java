package taxi.blizz.operations;

import java.time.OffsetDateTime;
import java.util.UUID;
import taxi.blizz.geo.GeoPoint;

/** The driver's current trip with server times (REQ-ASG-03, REQ-ASG-07). */
public record TripView(
        UUID id,
        UUID orderId,
        UUID assignmentId,
        String phase,
        long version,
        GeoPoint pickup,
        String pickupLabel,
        GeoPoint dropoff,
        String dropoffLabel,
        PaymentMethod paymentMethod,
        Long priceMinor,
        String currency,
        OffsetDateTime arrivedAt,
        OffsetDateTime startedAt,
        OffsetDateTime completedAt,
        boolean needsReview,
        /** Paid by the rider's bonuses (ADR 0009): the driver collects the fare minus this. */
        long walletMinor,
        /** The rider's promotions' discount (ADR 0009): collect the fare minus this and the bonuses. */
        long discountMinor,
        /**
         * Whom to pick up when it is not the payer: the recipient a rider named, or the caller of a phone order
         * (ADR 0012, REQ-OPS-02). Only on a trip, so never before assignment (REQ-DRV-08), and only until the trip
         * ends; the phone only when calls are DIRECT (otherwise calls go through the service's numbers). Null when
         * the order has no such contact.
         */
        Recipient recipient,
        /** The rider's or operator's note and where exactly to come (REQ-DRV-07, issue #143). */
        String comment,
        String entrance) {

    public record Recipient(String name, String phone) {
    }
}
