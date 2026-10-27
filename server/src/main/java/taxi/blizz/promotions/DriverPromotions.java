package taxi.blizz.promotions;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import taxi.blizz.platform.Actor;

/**
 * Promotions for drivers (ADR 0010 p. 3–5): complete {@code ordersRequired} orders within {@code periodDays} days —
 * optionally only on some days, hours (city time, when the driver took the order) and with a payment method — and
 * get {@code rewardMinor} on the balance. Periods run from {@code startsAt}; {@code repeat} pays once or in every
 * period. Example: 50 orders in 10 days, 08:00–09:00, paid by card → 100 on the balance.
 */
public interface DriverPromotions {

    String MANAGE_PERMISSION = RiderPromotions.MANAGE_PERMISSION;

    enum Repeat { ONCE, EVERY_PERIOD }

    record Draft(String name, long rewardMinor, String currency, UUID cityId, int periodDays, int ordersRequired,
                 List<DayOfWeek> daysOfWeek, LocalTime timeFrom, LocalTime timeTo, String paymentMethod,
                 Repeat repeat, Instant startsAt, Instant endsAt) {
        public Draft {
            daysOfWeek = daysOfWeek == null || daysOfWeek.isEmpty() ? null : List.copyOf(daysOfWeek);
        }
    }

    record Promotion(UUID id, Draft terms, String state, long version, UUID createdBy, OffsetDateTime createdAt,
                     OffsetDateTime updatedAt) {
    }

    /** For the driver: the current period of an active promotion and how far the driver is in it. */
    record Progress(UUID promotionId, String name, long rewardMinor, String currency, int ordersRequired,
                    long ordersDone, OffsetDateTime periodStart, OffsetDateTime periodEnd, boolean rewarded,
                    Repeat repeat) {
    }

    List<Promotion> list(Actor staff, boolean includeArchived);

    Promotion create(Actor staff, UUID commandId, Draft draft, String reason);

    Promotion change(Actor staff, UUID commandId, UUID promotionId, long expectedVersion, Draft draft, String reason);

    Promotion archive(Actor staff, UUID commandId, UUID promotionId, long expectedVersion, String reason);

    List<Progress> progress(Actor driver);
}
