package taxi.blizz.operations;

import java.time.OffsetDateTime;
import java.util.UUID;
import taxi.blizz.geo.GeoPoint;

/**
 * A personal offer as the driver sees it (REQ-DRV-07): the server deadline with the server's time and the seconds
 * left, what kind of sum the price is and the driver's expected part of it, the note and the entrance; never a phone
 * number of the passenger before assignment (REQ-DRV-08).
 */
public record OfferView(UUID id, UUID orderId, OffsetDateTime expiresAt, OffsetDateTime serverTime, long secondsLeft,
                        String vehicleClass, GeoPoint pickup, String pickupLabel, String dropoffLabel,
                        PaymentMethod paymentMethod, Long priceMinor, String currency, Integer distanceM,
                        String priceKind, Long expectedEarningsMinor, String comment, String entrance) {

    /** FIXED: the fare agreed with the rider; paid waiting is added on top by the tariff. */
    public static final String PRICE_FIXED = "FIXED";
}
