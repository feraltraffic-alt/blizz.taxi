package taxi.blizz.pricing;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import java.util.UUID;
import taxi.blizz.platform.Actor;

/**
 * Staff commands require ACTIVE staff with pricing.manage for the city of the class or tariff
 * (city_scope), checked again on idempotent replays.
 */
public interface TariffService {
    String MANAGE_PERMISSION = "pricing.manage";

    Revision createVehicleClass(VehicleClassDraft command);
    Revision createDraft(Draft command);
    Revision publish(Change command);
    Revision archive(Change command);

    record Revision(UUID id, String state, long version) {
    }

    /** Rates are minor units per km/minute; commissionRate is an exact fraction from 0 to 1. */
    /**
     * In-city and out-of-city rates differ (owner decision 27.10.2026): {@code pickupMinor} and
     * {@code perKmMinor} inside the city limits, {@code pickupOutsideMinor} when the pickup is outside them and
     * {@code perKmOutsideMinor} for the route's kilometres outside them (see {@code geo.GeoZones}).
     *
     * <p>Paid waiting (REQ-PRC-09, Q-07) is set per tariff by the admin: after {@code freeWaitingMinutes},
     * waiting is counted in steps of {@code waitingStepSeconds} (1 = per second, 60 = per minute), the
     * number of steps is rounded by {@code waitingRounding}, and each charged minute costs
     * {@code waitingPerMinuteMinor}.
     */
    record Terms(long pickupMinor, BigDecimal perKmMinor, BigDecimal perMinuteMinor, long minimumMinor,
                 int freeWaitingMinutes, BigDecimal waitingPerMinuteMinor, long cancellationFeeMinor,
                 BigDecimal commissionRate, int waitingStepSeconds, WaitingRounding waitingRounding,
                 long pickupOutsideMinor, BigDecimal perKmOutsideMinor, List<ZoneSurcharge> zoneSurcharges) {

        public Terms {
            zoneSurcharges = zoneSurcharges == null ? List.of() : List.copyOf(zoneSurcharges);
        }

        /** Terms with the same rates in and out of the city and no zone surcharges. */
        public Terms(long pickupMinor, BigDecimal perKmMinor, BigDecimal perMinuteMinor, long minimumMinor,
                     int freeWaitingMinutes, BigDecimal waitingPerMinuteMinor, long cancellationFeeMinor,
                     BigDecimal commissionRate, int waitingStepSeconds, WaitingRounding waitingRounding) {
            this(pickupMinor, perKmMinor, perMinuteMinor, minimumMinor, freeWaitingMinutes, waitingPerMinuteMinor,
                    cancellationFeeMinor, commissionRate, waitingStepSeconds, waitingRounding, pickupMinor, perKmMinor,
                    List.of());
        }
    }

    /**
     * A surcharge for a published zone of the tariff's city (owner decision 27.10.2026): either a fixed amount
     * added to the fare ({@code FIXED}, {@code amountMinor}) or a coefficient multiplying it
     * ({@code COEFFICIENT}, {@code coefficient} ≥ 1), when the pickup and/or the drop-off is in the zone.
     * Each zone counts once per trip.
     */
    record ZoneSurcharge(UUID zoneId, SurchargeMode mode, long amountMinor, BigDecimal coefficient,
                         boolean onPickup, boolean onDropoff) {
    }

    enum SurchargeMode {
        FIXED, COEFFICIENT
    }

    /** How a started step of waiting is counted: every started step, only full steps, or the nearer one. */
    enum WaitingRounding {
        UP, DOWN, HALF_UP
    }

    record VehicleClassDraft(UUID commandId, Actor actor, long expectedVersion, UUID cityId,
                             String code, String name, String reason) {
    }

    record Draft(UUID commandId, Actor actor, long expectedVersion, UUID cityId, UUID classId, String currency,
                 Instant effectiveFrom, Instant effectiveTo, Terms terms, String reason) {
    }

    record Change(UUID commandId, Actor actor, UUID id, long expectedVersion, String reason) {
    }
}
