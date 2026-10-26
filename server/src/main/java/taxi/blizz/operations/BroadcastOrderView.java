package taxi.blizz.operations;

import java.util.UUID;
import taxi.blizz.geo.GeoPoint;

/** An order in the "ALL" tab: first eligible driver to claim it gets it (section 11). */
public record BroadcastOrderView(UUID orderId, String vehicleClass, GeoPoint pickup, String pickupLabel,
                                 String dropoffLabel, PaymentMethod paymentMethod, Long priceMinor, String currency,
                                 int distanceM) {
}
