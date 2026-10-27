package taxi.blizz.pricing.internal;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.pricing.QuoteService.Breakdown;
import taxi.blizz.pricing.QuoteService.Component;
import taxi.blizz.pricing.QuoteService.ZoneFee;
import taxi.blizz.pricing.RouteEstimator.Estimate;
import taxi.blizz.pricing.TariffService;
import taxi.blizz.pricing.TariffService.SurchargeMode;
import taxi.blizz.pricing.TariffService.Terms;
import taxi.blizz.pricing.TariffService.ZoneSurcharge;

/**
 * REQ-PRC-03 with the owner's rules of 27.10.2026:
 * round_half_up(max(minimum, pickup + distance_in × km + distance_out × km_out + duration × minute)
 * × zone coefficients) + fixed zone surcharges. Exact arithmetic; one rounding at the end.
 */
final class FareCalculator {
    private FareCalculator() {
    }

    record Result(long amountMinor, Breakdown breakdown) {
    }

    /**
     * Where the trip is: whether the pickup is outside the city limits, how the straight pickup→drop-off line
     * splits by the city limits (used as the share of the route outside), and the zones of both points.
     */
    record Facts(boolean pickupOutside, long straightInsideMetres, long straightOutsideMetres,
                 Set<UUID> pickupZones, Set<UUID> dropoffZones, boolean preorder) {
        Facts(boolean pickupOutside, long straightInsideMetres, long straightOutsideMetres, Set<UUID> pickupZones,
              Set<UUID> dropoffZones) {
            this(pickupOutside, straightInsideMetres, straightOutsideMetres, pickupZones, dropoffZones, false);
        }

        static Facts inCity() {
            return new Facts(false, 1, 0, Set.of(), Set.of(), false);
        }
    }

    static Result calculate(Terms terms, Estimate route) {
        return calculate(terms, route, Facts.inCity());
    }

    static Result calculate(Terms terms, Estimate route, Facts facts) {
        long straight = facts.straightInsideMetres() + facts.straightOutsideMetres();
        long outside = straight == 0 ? 0 : BigDecimal.valueOf(route.distanceMetres())
                .multiply(BigDecimal.valueOf(facts.straightOutsideMetres()))
                .divide(BigDecimal.valueOf(straight), 0, RoundingMode.HALF_UP).longValueExact();
        long inside = route.distanceMetres() - outside;
        long pickup = facts.pickupOutside() ? terms.pickupOutsideMinor() : terms.pickupMinor();
        BigDecimal perKmOutside = terms.perKmOutsideMinor() == null ? terms.perKmMinor() : terms.perKmOutsideMinor();

        BigDecimal distance = terms.perKmMinor().multiply(BigDecimal.valueOf(inside));
        BigDecimal distanceOutside = perKmOutside.multiply(BigDecimal.valueOf(outside));
        BigDecimal duration = terms.perMinuteMinor().multiply(BigDecimal.valueOf(route.durationSeconds()));
        // Common denominator 3000 avoids rounding repeating decimals such as one second / 60.
        BigDecimal numerator = BigDecimal.valueOf(pickup).multiply(BigDecimal.valueOf(3000))
                .add(distance.add(distanceOutside).multiply(BigDecimal.valueOf(3)))
                .add(duration.multiply(BigDecimal.valueOf(50)))
                .max(BigDecimal.valueOf(terms.minimumMinor()).multiply(BigDecimal.valueOf(3000)));

        BigDecimal factor = BigDecimal.ONE;
        long fixed = 0;
        List<ZoneFee> fees = new ArrayList<>();
        for (ZoneSurcharge z : terms.zoneSurcharges()) {
            boolean applies = (z.onPickup() && facts.pickupZones().contains(z.zoneId()))
                    || (z.onDropoff() && facts.dropoffZones().contains(z.zoneId()));
            if (!applies) {
                continue;
            }
            if (z.mode() == SurchargeMode.COEFFICIENT) {
                factor = factor.multiply(z.coefficient());
                fees.add(new ZoneFee(z.zoneId(), z.mode().name(), 0, z.coefficient()));
            } else {
                fixed = Math.addExact(fixed, z.amountMinor());
                fees.add(new ZoneFee(z.zoneId(), z.mode().name(), z.amountMinor(), null));
            }
        }
        TariffService.PreorderSurcharge pre = terms.preorderSurcharge();
        if (facts.preorder() && pre != null) {
            if (pre.mode() == SurchargeMode.COEFFICIENT) {
                factor = factor.multiply(pre.coefficient());
                fees.add(new ZoneFee(null, "PREORDER_COEFFICIENT", 0, pre.coefficient()));
            } else {
                fixed = Math.addExact(fixed, pre.amountMinor());
                fees.add(new ZoneFee(null, "PREORDER_FIXED", pre.amountMinor(), null));
            }
        }
        try {
            long total = Math.addExact(numerator.multiply(factor)
                    .divide(BigDecimal.valueOf(3000), 0, RoundingMode.HALF_UP).longValueExact(), fixed);
            return new Result(total, new Breakdown(pickup, new Component(distance, 1000), new Component(duration, 60),
                    terms.minimumMinor(), factor, fixed, new Component(distanceOutside, 1000), facts.pickupOutside(),
                    fees, facts.preorder()));
        } catch (ArithmeticException overflow) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "Quoted amount exceeds supported minor-unit range");
        }
    }
}
