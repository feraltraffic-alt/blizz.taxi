package taxi.blizz.pricing.internal;

import java.math.BigDecimal;
import java.math.RoundingMode;
import taxi.blizz.pricing.TariffService.Terms;

/**
 * Paid waiting by the tariff's own rule (REQ-PRC-09, Q-07 set per tariff by the admin): waiting beyond the
 * free minutes is counted in steps, the steps are rounded as configured, and the charged time costs the
 * per-minute rate; only the final amount is rounded to minor units (half up). Exact arithmetic only.
 */
final class WaitingCharge {

    private WaitingCharge() {
    }

    record Result(long freeSeconds, long chargedSeconds, long amountMinor) {
    }

    static Result of(Terms terms, long waitedSeconds) {
        long free = terms.freeWaitingMinutes() * 60L;
        if (terms.waitingRounding() == null || terms.waitingStepSeconds() < 1) {
            // A quote made before the waiting rule existed: waiting is not charged.
            return new Result(free, 0, 0);
        }
        long billable = Math.max(0, waitedSeconds - free);
        long step = terms.waitingStepSeconds();
        long steps = switch (terms.waitingRounding()) {
            case UP -> Math.ceilDiv(billable, step);
            case DOWN -> Math.floorDiv(billable, step);
            case HALF_UP -> BigDecimal.valueOf(billable).divide(BigDecimal.valueOf(step), 0, RoundingMode.HALF_UP)
                    .longValueExact();
        };
        long charged = Math.multiplyExact(steps, step);
        long amount = terms.waitingPerMinuteMinor().multiply(BigDecimal.valueOf(charged))
                .divide(BigDecimal.valueOf(60), 0, RoundingMode.HALF_UP).longValueExact();
        return new Result(free, charged, amount);
    }

    static boolean configured(Terms terms) {
        return terms.waitingRounding() != null && terms.waitingStepSeconds() >= 1;
    }
}
