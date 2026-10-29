package taxi.blizz.promotions;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import taxi.blizz.platform.Actor;

/**
 * Promotions for riders (ADR 0009 p. 4–7), created in the admin panel. A DISCOUNT lowers the price of the quote; a
 * BONUS credits the rider's account after the trip. Every condition that is set must hold; all promotions that
 * apply are applied. The service pays for them.
 */
public interface RiderPromotions {

    String MANAGE_PERMISSION = "promotions.manage";

    enum Kind { DISCOUNT, BONUS }

    /** PERCENT: {@code value} in basis points (1000 = 10 %); FIXED: minor units of {@code currency}. */
    enum ValueType { PERCENT, FIXED }

    /**
     * Null means "any". {@code everyNthTrip}: the rider's N-th, 2N-th … completed trip, given to one order of the
     * rider at a time (the order claims it; a cancelled order gives it back); {@code daysOfWeek} and
     * {@code timeFrom}–{@code timeTo} in the city's time zone at the pickup time ({@code timeTo} may be past midnight,
     * e.g. 22:00–06:00); zones of the city at the pickup and the drop-off.
     */
    record Conditions(UUID cityId, String vehicleClass, Integer everyNthTrip, List<DayOfWeek> daysOfWeek,
                      LocalTime timeFrom, LocalTime timeTo, UUID pickupZoneId, UUID dropoffZoneId,
                      Instant startsAt, Instant endsAt) {
        public Conditions {
            daysOfWeek = daysOfWeek == null || daysOfWeek.isEmpty() ? null : List.copyOf(daysOfWeek);
        }
    }

    record Draft(String name, Kind kind, ValueType valueType, long value, String currency, Conditions conditions) {
    }

    record Promotion(UUID id, String name, Kind kind, ValueType valueType, long value, String currency,
                     Conditions conditions, String state, long version, UUID createdBy, OffsetDateTime createdAt,
                     OffsetDateTime updatedAt) {
    }

    List<Promotion> list(Actor staff, boolean includeArchived);

    Promotion create(Actor staff, UUID commandId, Draft draft, String reason);

    Promotion change(Actor staff, UUID commandId, UUID promotionId, long expectedVersion, Draft draft, String reason);

    /** Stops the promotion; quotes made before keep what they got. */
    Promotion archive(Actor staff, UUID commandId, UUID promotionId, long expectedVersion, String reason);

    // ---------------------------------------------------------------- for pricing

    /** What pricing knows when it makes a quote for a rider. */
    record Context(UUID clientId, UUID cityId, String vehicleClass, String currency, long priceMinor,
                   Set<UUID> pickupZones, Set<UUID> dropoffZones, LocalDateTime localPickupTime) {
    }

    /** {@code discountMinor}: for a DISCOUNT, what it takes off the price; 0 for a BONUS (credited after the trip). */
    record Applied(UUID promotionId, String name, Kind kind, ValueType valueType, long value, long discountMinor) {
    }

    /**
     * The promotions that apply, with the discounts capped so that their sum never exceeds the price. Records them
     * for the quote in the caller's transaction.
     */
    List<Applied> applyToQuote(UUID quoteId, Context context);

    /**
     * The order that takes the quote claims the "every N-th trip" cycles the quote counted on, in the caller's
     * transaction. QUOTE_EXPIRED when another order of the rider holds one already: the rider gets a new price.
     */
    void claimForOrder(UUID quoteId, UUID clientId, UUID orderId);
}
