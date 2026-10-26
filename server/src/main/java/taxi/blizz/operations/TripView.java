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
        boolean needsReview) {
}
