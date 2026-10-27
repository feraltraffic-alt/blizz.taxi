package taxi.blizz.operations;

import java.time.OffsetDateTime;
import java.util.Map;
import java.util.UUID;
import taxi.blizz.geo.GeoPoint;

/**
 * Canonical snapshot of an order (REQ-RID-* "GET /orders/active"). {@code priceMinor} is the agreed
 * price of the quote; {@code finalPriceMinor} is set when the trip is completed (REQ-PRC-10). {@code pickupAt} is
 * the requested pickup time of an order for later; {@code preorder} says it waits as SCHEDULED until released
 * (ADR 0006). {@code relatedOrderId}: on a follow-up, the interrupted order it continues (T-22).
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
        OffsetDateTime createdAt,
        Cancellation cancellation,
        OffsetDateTime pickupAt,
        boolean preorder,
        UUID relatedOrderId) {

    /**
     * Who cancelled the order (RIDER, STAFF, DRIVER) and why: the reason's code and its labels as they were at the
     * moment of cancellation (owner decision 27.10.2026). Null unless a person cancelled the order.
     */
    public record Cancellation(String by, String reasonCode, Map<String, String> reasonLabels) {
        public Cancellation {
            reasonLabels = reasonLabels == null ? Map.of() : Map.copyOf(reasonLabels);
        }
    }
}
