package taxi.blizz.telephony.internal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.identity.OtpAudience;
import taxi.blizz.identity.OtpService;
import taxi.blizz.platform.RateLimitedException;

/**
 * A budget per range of numbers below the global one (audit 29.10.2026, #112): invented numbers of one operator's
 * prefix use up the range's codes, not the whole service's. A range is the country code and two national digits:
 * +38092 is another range than +38091. Both are used by no other test.
 */
@SpringBootTest(properties = "blizz.otp.max-per-range-per-hour=3")
@Import(TestcontainersConfiguration.class)
class OtpRangeBudgetTests {

    @Autowired
    OtpService otp;
    @Autowired
    FakeOtpSender fake;
    @Autowired
    JdbcClient jdbc;

    private static String number(String range) {
        return range + String.format("%07d", Math.floorMod(UUID.randomUUID().hashCode(), 10_000_000));
    }

    private long challenges(String phone) {
        return jdbc.sql("select count(*) from otp_challenge where phone_normalized = :p").param("p", phone)
                .query(Long.class).single();
    }

    @Test
    void newNumbersOfOneRangeRunOutOfTheirBudgetAndOtherRangesStillGetCodes() {
        for (int i = 0; i < 3; i++) {
            otp.requestChallenge(i % 2 == 0 ? OtpAudience.CLIENT : OtpAudience.DRIVER, number("+38091"),
                    "device-" + UUID.randomUUID(), "198.51.100." + (i + 1));
        }
        // A number that never had a code, from another device and address: the range's budget is used up.
        for (OtpAudience audience : OtpAudience.values()) {
            String fresh = number("+38091");
            assertThatThrownBy(() -> otp.requestChallenge(audience, fresh, "device-" + UUID.randomUUID(),
                    "203.0.113.7")).as(audience.name()).isInstanceOf(RateLimitedException.class)
                    .hasMessage("Code sending budget for these numbers exhausted");
            assertThat(challenges(fresh)).isZero();
            assertThat(fake.last(fresh)).as("nothing sent").isEmpty();
        }

        String neighbour = number("+38092");
        otp.requestChallenge(OtpAudience.CLIENT, neighbour, null, null);
        assertThat(challenges(neighbour)).isOne();
        assertThat(fake.last(neighbour)).isPresent();
    }
}
