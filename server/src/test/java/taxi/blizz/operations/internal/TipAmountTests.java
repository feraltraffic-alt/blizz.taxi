package taxi.blizz.operations.internal;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/** Tip amounts (ADR 0012): percents of the trip's cost rounded up to a whole unit; the cost rounded up is the top. */
class TipAmountTests {

    @Test
    void presetsRoundUpToAWholeUnit() {
        // 105.17: 10.517 → 11, 15.7755 → 16, 21.034 → 22, 26.2925 → 27
        assertThat(JdbcTips.PERCENTS.stream().map(p -> JdbcTips.preset(10_517, p)).toList())
                .containsExactly(1_100L, 1_600L, 2_200L, 2_700L);
        // exact amounts stay as they are
        assertThat(JdbcTips.preset(10_000, 10)).isEqualTo(1_000);
        assertThat(JdbcTips.preset(10_000, 25)).isEqualTo(2_500);
        // a tiny fare still gives one unit
        assertThat(JdbcTips.preset(1, 10)).isEqualTo(100);
    }

    @Test
    void theLargestTipIsTheCostRoundedUp() {
        assertThat(JdbcTips.max(10_517)).isEqualTo(10_600);
        assertThat(JdbcTips.max(10_500)).isEqualTo(10_500);
        assertThat(JdbcTips.max(0)).isZero();
    }
}
