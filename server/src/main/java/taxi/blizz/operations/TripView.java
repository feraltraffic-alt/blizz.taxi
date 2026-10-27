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
        long discountMinor) {
}
