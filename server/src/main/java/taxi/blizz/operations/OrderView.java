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
        UUID relatedOrderId,
        /** Bonuses of the rider's account paying part of the price (ADR 0009); the rest in cash or by card. */
        long walletMinor,
        /** Taken off the price by the rider's promotions (ADR 0009); the service pays it. */
        long discountMinor,
        /** When the driver is on the way to the pickup; null otherwise or when no position is known (REQ-RID-04). */
        PickupEta pickupEta,
        /** Who is coming: the current assignment's driver and car; null without one (REQ-RID-05, issue #143). */
        DriverCard driver,
        /** Why the driver changed before the start, in the rider's terms; null if never (REQ-RID-05). */
        DriverChange driverChange) {

    /** No phone: calls go through the order. {@code photoUrl} is null until driver photos exist (REQ-DRV-01). */
    public record DriverCard(String name, String make, String model, String color, String registrationNumber,
                             String photoUrl) {
    }

    /** DRIVER_CANCELLED — the driver withdrew; SERVICE_REASSIGNED — the service took the driver off. */
    public record DriverChange(String reasonCode, OffsetDateTime at) {
    }

    /** Source compatibility for snapshots built before the driver card existed. */
    public OrderView(UUID id, long shortNumber, String status, String statusReason, long version, String channel,
                     UUID payerClientId, UUID cityId, String vehicleClass, GeoPoint pickup, String pickupLabel,
                     GeoPoint dropoff, String dropoffLabel, PaymentMethod paymentMethod, String paymentState,
                     Long priceMinor, Long finalPriceMinor, String currency, String searchPhase,
                     AssignmentView assignment, OffsetDateTime createdAt, Cancellation cancellation,
                     OffsetDateTime pickupAt, boolean preorder, UUID relatedOrderId, long walletMinor,
                     long discountMinor, PickupEta pickupEta) {
        this(id, shortNumber, status, statusReason, version, channel, payerClientId, cityId, vehicleClass, pickup,
                pickupLabel, dropoff, dropoffLabel, paymentMethod, paymentState, priceMinor, finalPriceMinor, currency,
                searchPhase, assignment, createdAt, cancellation, pickupAt, preorder, relatedOrderId, walletMinor,
                discountMinor, pickupEta, null, null);
    }

    /** Source compatibility for snapshots built before the pickup ETA existed. */
    public OrderView(UUID id, long shortNumber, String status, String statusReason, long version, String channel,
                     UUID payerClientId, UUID cityId, String vehicleClass, GeoPoint pickup, String pickupLabel,
                     GeoPoint dropoff, String dropoffLabel, PaymentMethod paymentMethod, String paymentState,
                     Long priceMinor, Long finalPriceMinor, String currency, String searchPhase,
                     AssignmentView assignment, OffsetDateTime createdAt, Cancellation cancellation,
                     OffsetDateTime pickupAt, boolean preorder, UUID relatedOrderId, long walletMinor,
                     long discountMinor) {
        this(id, shortNumber, status, statusReason, version, channel, payerClientId, cityId, vehicleClass, pickup,
                pickupLabel, dropoff, dropoffLabel, paymentMethod, paymentState, priceMinor, finalPriceMinor, currency,
                searchPhase, assignment, createdAt, cancellation, pickupAt, preorder, relatedOrderId, walletMinor,
                discountMinor, null, null, null);
    }

    /** The same snapshot with the pickup ETA as of now. */
    public OrderView withPickupEta(PickupEta eta) {
        return new OrderView(id, shortNumber, status, statusReason, version, channel, payerClientId, cityId,
                vehicleClass, pickup, pickupLabel, dropoff, dropoffLabel, paymentMethod, paymentState, priceMinor,
                finalPriceMinor, currency, searchPhase, assignment, createdAt, cancellation, pickupAt, preorder,
                relatedOrderId, walletMinor, discountMinor, eta, driver, driverChange);
    }

    /**
     * A forecast, never a promise (REQ-RID-04): from the driver's last position on the server to the pickup.
     * {@code stale} when that position is older than the freshness limit; the forecast is still shown, marked. No
     * position means no ETA at all, never a made-up one. {@code source}: ROUTER — on the roads; STRAIGHT_LINE — from
     * the straight line, when no router answered (REQ-GEO-07/08).
     */
    public record PickupEta(long seconds, long distanceMetres, String source, OffsetDateTime locationAt,
                            boolean stale) {
    }

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
