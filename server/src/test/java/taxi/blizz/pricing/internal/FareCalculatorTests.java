package taxi.blizz.pricing.internal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;
import taxi.blizz.platform.DomainException;
import taxi.blizz.pricing.RouteEstimator.Estimate;
import taxi.blizz.pricing.TariffService.Terms;

class FareCalculatorTests {
    private Terms terms(long pickup, String km, String minute, long minimum) {
        return new Terms(pickup, new BigDecimal(km), new BigDecimal(minute), minimum, 3,
                new BigDecimal("100"), 500, new BigDecimal("0.15"));
    }

    @Test
    void specificationExampleIsExactly11000MinorUnits() {
        var result = FareCalculator.calculate(terms(2000, "1000", "100", 5000), new Estimate(7500, 900));
        assertThat(result.amountMinor()).isEqualTo(11000);
        assertThat(result.breakdown().distance().numerator()).isEqualByComparingTo("7500000");
        assertThat(result.breakdown().duration().numerator()).isEqualByComparingTo("90000");
        assertThat(result.breakdown().demandFactor()).isEqualByComparingTo(BigDecimal.ONE);
        assertThat(result.breakdown().approvedFeesMinor()).isZero();
    }

    @Test
    void minimumAppliesBeforeTheSingleFinalRounding() {
        assertThat(FareCalculator.calculate(terms(100, "1", "1", 5000), new Estimate(1, 1)).amountMinor())
                .isEqualTo(5000);
    }

    @Test
    void roundsHalfUpAtTheBoundaryAndDoesNotRoundComponentsSeparately() {
        Terms t = terms(0, "1", "1", 0);
        assertThat(FareCalculator.calculate(t, new Estimate(499, 0)).amountMinor()).isZero();
        assertThat(FareCalculator.calculate(t, new Estimate(500, 0)).amountMinor()).isEqualTo(1);
        assertThat(FareCalculator.calculate(t, new Estimate(501, 0)).amountMinor()).isEqualTo(1);
        assertThat(FareCalculator.calculate(t, new Estimate(250, 15)).amountMinor()).isEqualTo(1);
    }

    @Test
    void repeatingTimeFractionsAndHighPrecisionRatesRemainExact() {
        var result = FareCalculator.calculate(terms(0, "0.1234567890123456789", "1", 0), new Estimate(1, 1));
        assertThat(result.breakdown().duration().numerator()).isEqualByComparingTo("1");
        assertThat(result.breakdown().duration().denominator()).isEqualTo(60);
        assertThat(result.breakdown().distance().numerator()).isEqualByComparingTo("0.1234567890123456789");
        assertThat(result.amountMinor()).isZero();
    }

    @Test
    void largeMinorUnitAmountsStayExactAndOverflowIsRefused() {
        assertThat(FareCalculator.calculate(terms(9007199254740993L, "0", "0", 0), new Estimate(0, 0)).amountMinor())
                .isEqualTo(9007199254740993L);
        assertThatThrownBy(() -> FareCalculator.calculate(terms(Long.MAX_VALUE, "1", "0", 0), new Estimate(1000, 0)))
                .isInstanceOf(DomainException.class);
    }

    @Test
    void pricingProductionSourcesContainNoInexactNumericTypesOrConversions() throws Exception {
        Pattern forbidden = Pattern.compile("\\b(?:double|float)\\b|\\.(?:doubleValue|floatValue)\\(");
        try (var paths = Files.walk(Path.of("src/main/java/taxi/blizz/pricing"))) {
            for (Path path : paths.filter(p -> p.toString().endsWith(".java")).toList()) {
                assertThat(forbidden.matcher(Files.readString(path)).find()).as(path.toString()).isFalse();
            }
        }
    }
}
