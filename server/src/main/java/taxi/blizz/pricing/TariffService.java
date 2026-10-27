package taxi.blizz.pricing;

import java.math.BigDecimal;
import java.time.Instant;
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
     * Paid waiting (REQ-PRC-09, Q-07) is set per tariff by the admin: after {@code freeWaitingMinutes},
     * waiting is counted in steps of {@code waitingStepSeconds} (1 = per second, 60 = per minute), the
     * number of steps is rounded by {@code waitingRounding}, and each charged minute costs
     * {@code waitingPerMinuteMinor}.
     */
    record Terms(long pickupMinor, BigDecimal perKmMinor, BigDecimal perMinuteMinor, long minimumMinor,
                 int freeWaitingMinutes, BigDecimal waitingPerMinuteMinor, long cancellationFeeMinor,
                 BigDecimal commissionRate, int waitingStepSeconds, WaitingRounding waitingRounding) {
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
