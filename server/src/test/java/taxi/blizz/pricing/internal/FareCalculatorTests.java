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
import taxi.blizz.pricing.TariffService;
import taxi.blizz.pricing.TariffService.Terms;

class FareCalculatorTests {
    private Terms terms(long pickup, String km, String minute, long minimum) {
        return new Terms(pickup, new BigDecimal(km), new BigDecimal(minute), minimum, 3,
                new BigDecimal("100"), 500, new BigDecimal("0.15"), 60, TariffService.WaitingRounding.UP);
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

    // ------------------------------------------------------------ city / out of city and zones (27.10.2026)

    private static final java.util.UUID AIRPORT = java.util.UUID.fromString("00000000-0000-0000-0000-0000000000a1");
    private static final java.util.UUID STATION = java.util.UUID.fromString("00000000-0000-0000-0000-0000000000b2");

    private Terms zoned(java.util.List<TariffService.ZoneSurcharge> surcharges) {
        // City: pickup 2000, 1000 per km; outside: pickup 3000, 1500 per km; minute 100; minimum 5000.
        return new Terms(2000, new BigDecimal("1000"), new BigDecimal("100"), 5000, 3, new BigDecimal("100"), 500,
                new BigDecimal("0.15"), 60, TariffService.WaitingRounding.UP, 3000, new BigDecimal("1500"), surcharges);
    }

    private static FareCalculator.Facts facts(boolean pickupOutside, long in, long out, java.util.Set<java.util.UUID> atPickup,
                                              java.util.Set<java.util.UUID> atDropoff) {
        return new FareCalculator.Facts(pickupOutside, in, out, atPickup, atDropoff);
    }

    @Test
    void kilometresOutsideTheCityAndAPickupOutsideUseTheirOwnRates() {
        // 10 km route, the straight line is 60 % inside / 40 % outside → 6 km × 1000 + 4 km × 1500 = 12000;
        // pickup outside 3000; 600 s × 100/60 = 1000 → 16000.
        var r = FareCalculator.calculate(zoned(java.util.List.of()), new Estimate(10_000, 600),
                facts(true, 600, 400, java.util.Set.of(), java.util.Set.of()));
        assertThat(r.amountMinor()).isEqualTo(16_000);
        assertThat(r.breakdown().pickupOutside()).isTrue();
        assertThat(r.breakdown().pickupMinor()).isEqualTo(3000);
        assertThat(r.breakdown().distanceOutside().numerator()).isEqualByComparingTo("6000000");
    }

    @Test
    void aFixedZoneSurchargeIsAddedAndACoefficientMultipliesOnlyWhereItApplies() {
        var surcharges = java.util.List.of(
                new TariffService.ZoneSurcharge(AIRPORT, TariffService.SurchargeMode.FIXED, 5000, null, true, true),
                new TariffService.ZoneSurcharge(STATION, TariffService.SurchargeMode.COEFFICIENT, 0,
                        new BigDecimal("1.2"), true, false));
        Terms t = zoned(surcharges);
        Estimate route = new Estimate(5000, 600); // 2000 + 5000 + 1000 = 8000 in the city

        assertThat(FareCalculator.calculate(t, route, facts(false, 1, 0, java.util.Set.of(), java.util.Set.of()))
                .amountMinor()).isEqualTo(8000);
        var toAirport = FareCalculator.calculate(t, route, facts(false, 1, 0, java.util.Set.of(), java.util.Set.of(AIRPORT)));
        assertThat(toAirport.amountMinor()).isEqualTo(13_000);
        assertThat(toAirport.breakdown().approvedFeesMinor()).isEqualTo(5000);
        assertThat(FareCalculator.calculate(t, route, facts(false, 1, 0, java.util.Set.of(STATION), java.util.Set.of()))
                .amountMinor()).as("8000 × 1.2").isEqualTo(9600);
        assertThat(FareCalculator.calculate(t, route, facts(false, 1, 0, java.util.Set.of(), java.util.Set.of(STATION)))
                .amountMinor()).as("station counts at pickup only").isEqualTo(8000);
        var both = FareCalculator.calculate(t, route,
                facts(false, 1, 0, java.util.Set.of(STATION, AIRPORT), java.util.Set.of(AIRPORT)));
        assertThat(both.amountMinor()).as("8000 × 1.2 + 5000, the airport once").isEqualTo(14_600);
        assertThat(both.breakdown().zoneFees()).hasSize(2);
    }

    @Test
    void theMinimumIsAppliedBeforeTheZoneCoefficient() {
        var t = zoned(java.util.List.of(new TariffService.ZoneSurcharge(STATION, TariffService.SurchargeMode.COEFFICIENT,
                0, new BigDecimal("1.5"), true, true)));
        assertThat(FareCalculator.calculate(t, new Estimate(100, 10),
                facts(false, 1, 0, java.util.Set.of(STATION), java.util.Set.of())).amountMinor()).isEqualTo(7500);
    }
}
