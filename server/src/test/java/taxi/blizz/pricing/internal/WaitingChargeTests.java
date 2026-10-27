package taxi.blizz.pricing.internal;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;
import org.junit.jupiter.api.Test;
import taxi.blizz.pricing.TariffService.Terms;
import taxi.blizz.pricing.TariffService.WaitingRounding;

/** Paid waiting by the tariff rule (REQ-PRC-09, Q-07 configured per tariff). */
class WaitingChargeTests {

    private static Terms terms(int freeMinutes, String perMinute, int step, WaitingRounding rounding) {
        return new Terms(0, BigDecimal.ZERO, BigDecimal.ZERO, 0, freeMinutes, new BigDecimal(perMinute), 0,
                BigDecimal.ZERO, step, rounding);
    }

    @Test
    void nothingIsChargedWithinTheFreeMinutes() {
        assertThat(WaitingCharge.of(terms(3, "200", 60, WaitingRounding.UP), 180).amountMinor()).isZero();
        assertThat(WaitingCharge.of(terms(3, "200", 60, WaitingRounding.UP), 0).amountMinor()).isZero();
    }

    @Test
    void everyStartedMinute() {
        // 3 free minutes, waited 4 min 1 s → 61 s billable → 2 started minutes × 200.
        WaitingCharge.Result r = WaitingCharge.of(terms(3, "200", 60, WaitingRounding.UP), 241);
        assertThat(r.chargedSeconds()).isEqualTo(120);
        assertThat(r.amountMinor()).isEqualTo(400);
    }

    @Test
    void onlyFullMinutes() {
        WaitingCharge.Result r = WaitingCharge.of(terms(3, "200", 60, WaitingRounding.DOWN), 299);
        assertThat(r.chargedSeconds()).isEqualTo(60);
        assertThat(r.amountMinor()).isEqualTo(200);
    }

    @Test
    void nearerMinute() {
        assertThat(WaitingCharge.of(terms(0, "200", 60, WaitingRounding.HALF_UP), 89).chargedSeconds()).isEqualTo(60);
        assertThat(WaitingCharge.of(terms(0, "200", 60, WaitingRounding.HALF_UP), 90).chargedSeconds()).isEqualTo(120);
    }

    @Test
    void perSecondWithOneFinalRounding() {
        // 100 s at 7 per minute = 11.666… → 12.
        WaitingCharge.Result r = WaitingCharge.of(terms(0, "7", 1, WaitingRounding.UP), 100);
        assertThat(r.chargedSeconds()).isEqualTo(100);
        assertThat(r.amountMinor()).isEqualTo(12);
    }

    @Test
    void aQuoteWithoutTheRuleChargesNothing() {
        assertThat(WaitingCharge.of(terms(0, "200", 0, null), 10_000).amountMinor()).isZero();
        assertThat(WaitingCharge.configured(terms(0, "200", 0, null))).isFalse();
    }
}
