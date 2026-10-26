package taxi.blizz.operations;

import java.time.OffsetDateTime;
import java.util.UUID;
import taxi.blizz.geo.GeoPoint;

/**
 * A personal offer as the driver sees it (REQ-DRV-07): the server deadline, never a phone number
 * of the passenger before assignment (REQ-DRV-08).
 */
public record OfferView(UUID id, UUID orderId, OffsetDateTime expiresAt, String vehicleClass, GeoPoint pickup,
                        String pickupLabel, String dropoffLabel, PaymentMethod paymentMethod, Long priceMinor,
                        String currency, Integer distanceM) {
}
