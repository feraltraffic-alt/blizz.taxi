package taxi.blizz.operations;

import java.time.OffsetDateTime;
import java.util.UUID;
import taxi.blizz.geo.GeoPoint;

/**
 * Canonical snapshot of an order (REQ-RID-* "GET /orders/active"). {@code priceMinor} is the agreed
 * price of the quote; {@code finalPriceMinor} is set when the trip is completed (REQ-PRC-10).
 */
public record OrderView(
        UUID id,
        long shortNumber,
        String status,
        String statusReason,
        long version,
        String channel,
        UUID payerClientId,
        UUID cityId,
        String vehicleClass,
        GeoPoint pickup,
        String pickupLabel,
        GeoPoint dropoff,
        String dropoffLabel,
        PaymentMethod paymentMethod,
        String paymentState,
        Long priceMinor,
        Long finalPriceMinor,
        String currency,
        String searchPhase,
        AssignmentView assignment,
        OffsetDateTime createdAt) {
}
