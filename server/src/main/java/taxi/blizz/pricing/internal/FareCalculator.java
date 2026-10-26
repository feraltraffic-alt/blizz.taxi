package taxi.blizz.pricing.internal;

import java.math.BigDecimal;
import java.math.RoundingMode;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.pricing.QuoteService.Breakdown;
import taxi.blizz.pricing.QuoteService.Component;
import taxi.blizz.pricing.RouteEstimator.Estimate;
import taxi.blizz.pricing.TariffService.Terms;

final class FareCalculator {
    private FareCalculator() {
    }

    record Result(long amountMinor, Breakdown breakdown) {
    }

    static Result calculate(Terms terms, Estimate route) {
        BigDecimal distance = terms.perKmMinor().multiply(BigDecimal.valueOf(route.distanceMetres()));
        BigDecimal duration = terms.perMinuteMinor().multiply(BigDecimal.valueOf(route.durationSeconds()));
        // Common denominator 3000 avoids rounding repeating decimals such as one second / 60.
        BigDecimal numerator = BigDecimal.valueOf(terms.pickupMinor()).multiply(BigDecimal.valueOf(3000))
                .add(distance.multiply(BigDecimal.valueOf(3)))
                .add(duration.multiply(BigDecimal.valueOf(50)))
                .max(BigDecimal.valueOf(terms.minimumMinor()).multiply(BigDecimal.valueOf(3000)));
        try {
            long total = numerator.divide(BigDecimal.valueOf(3000), 0, RoundingMode.HALF_UP).longValueExact();
            return new Result(total, new Breakdown(terms.pickupMinor(), new Component(distance, 1000),
                    new Component(duration, 60), terms.minimumMinor(), BigDecimal.ONE, 0));
        } catch (ArithmeticException overflow) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "Quoted amount exceeds supported minor-unit range");
        }
    }
}
