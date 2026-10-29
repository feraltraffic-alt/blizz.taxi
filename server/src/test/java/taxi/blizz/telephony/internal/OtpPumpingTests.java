package taxi.blizz.telephony.internal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import io.micrometer.core.instrument.Meter;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Tag;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.Bindable;
import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.boot.context.properties.source.MapConfigurationPropertySource;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.identity.ChallengeIssued;
import taxi.blizz.identity.OtpAudience;
import taxi.blizz.identity.OtpChannel;
import taxi.blizz.identity.OtpService;
import taxi.blizz.identity.internal.OtpProperties;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.RateLimitedException;
import taxi.blizz.platform.SubjectType;

/**
 * One-time codes cannot run up the SMS and call bill (SMS pumping, IRSF; threat model §2 P1–P5, issue #101): codes
 * only to numbers of the served countries, one channel per request and calls only on a resend within a budget, a
 * budget per address and number, one per number for riders and drivers together, and a cost metric without numbers.
 * Runs on the fake provider of the test profile and the real delivery record.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class OtpPumpingTests {

    @Autowired
    OtpService otp;
    @Autowired
    FakeOtpSender fake;
    @Autowired
    JdbcClient jdbc;
    @Autowired
    MeterRegistry meters;

    @BeforeEach
    void setUp() {
        fake.reset();
    }

    private static String ukrainian() {
        return "+38066" + String.format("%07d", Math.floorMod(UUID.randomUUID().hashCode(), 10_000_000));
    }

    private static String polish() {
        return "+4869" + String.format("%07d", Math.floorMod(UUID.randomUUID().hashCode(), 10_000_000));
    }

    /** Moves the number's codes back past the resend delay, inside the hour. */
    private void rewind(String phone) {
        jdbc.sql("update otp_challenge set created_at = created_at - interval '2 minutes' where phone_normalized = :p")
                .param("p", phone).update();
    }

    private long challenges(String phone) {
        return jdbc.sql("select count(*) from otp_challenge where phone_normalized = :p").param("p", phone)
                .query(Long.class).single();
    }

    private List<String> attempts(String phone) {
        return jdbc.sql("select channel || ' ' || state from otp_delivery where phone = :p order by attempted_at")
                .param("p", phone).query(String.class).list();
    }

    private static void assertRefused(ErrorCode code, org.assertj.core.api.ThrowableAssert.ThrowingCallable call) {
        assertThatThrownBy(call).isInstanceOfSatisfying(DomainException.class,
                e -> assertThat(e.code()).isEqualTo(code));
    }

    // ------------------------------------------------------------ E1, P1: countries

    @Test
    void onlyNumbersOfTheServedCountriesGetACode() {
        for (String foreign : List.of("+447911123456", "+12025550123", "+881612345678", "+38163123456")) {
            assertRefused(ErrorCode.PHONE_COUNTRY_NOT_SERVED,
                    () -> otp.requestChallenge(OtpAudience.CLIENT, foreign, "device-" + UUID.randomUUID(), null));
            assertRefused(ErrorCode.PHONE_COUNTRY_NOT_SERVED,
                    () -> otp.requestForNewPhone(new Actor(SubjectType.CLIENT, UUID.randomUUID()), foreign, null,
                            null));
            assertThat(challenges(foreign)).as("no challenge for %s", foreign).isZero();
            assertThat(attempts(foreign)).as("nothing sent to %s", foreign).isEmpty();
            assertThat(fake.last(foreign)).isEmpty();
        }
        assertThat(ErrorCode.PHONE_COUNTRY_NOT_SERVED.httpStatus()).isEqualTo(422);

        for (String served : List.of(ukrainian(), polish())) {
            otp.requestChallenge(OtpAudience.CLIENT, served, null, null);
            assertThat(challenges(served)).isOne();
            assertThat(attempts(served)).containsExactly("SMS SENT");
            assertThat(fake.last(served)).isPresent();
        }
    }

    // ------------------------------------------------------------ E2, P2: one channel, calls on a resend only

    @Test
    void aFirstRequestForACallGetsAnSmsAndNoRequestMakesBoth() {
        String phone = ukrainian();
        ChallengeIssued first = otp.requestChallenge(OtpAudience.CLIENT, phone, null, null, OtpChannel.VOICE);
        assertThat(first.channel()).isEqualTo(OtpChannel.SMS);
        assertThat(attempts(phone)).containsExactly("SMS SENT");

        String unlucky = ukrainian();
        fake.next(OtpSender.State.FAILED);
        assertThat(otp.requestChallenge(OtpAudience.CLIENT, unlucky, null, null).channel()).isEqualTo(OtpChannel.SMS);
        assertThat(attempts(unlucky)).as("a failed SMS is not followed by a call in the same request")
                .containsExactly("SMS FAILED");
    }

    @Test
    void aResendAfterAFailedSmsIsACallAndTheThirdCallInAnHourIsRefused() {
        String phone = ukrainian();
        fake.next(OtpSender.State.FAILED);
        otp.requestChallenge(OtpAudience.CLIENT, phone, null, null);

        rewind(phone);
        assertThat(otp.requestChallenge(OtpAudience.CLIENT, phone, null, null).channel())
                .as("the fallback of the admin panel after the SMS did not get through").isEqualTo(OtpChannel.VOICE);
        rewind(phone);
        assertThat(otp.requestChallenge(OtpAudience.CLIENT, phone, null, null, OtpChannel.VOICE).channel())
                .isEqualTo(OtpChannel.VOICE);
        assertThat(attempts(phone)).containsExactly("SMS FAILED", "VOICE SENT", "VOICE SENT");

        rewind(phone);
        assertThatThrownBy(() -> otp.requestChallenge(OtpAudience.CLIENT, phone, null, null, OtpChannel.VOICE))
                .isInstanceOf(RateLimitedException.class).hasMessageContaining("calls");
        assertThat(challenges(phone)).isEqualTo(3);
        // An SMS is still possible when asked for.
        assertThat(otp.requestChallenge(OtpAudience.CLIENT, phone, null, null, OtpChannel.SMS).channel())
                .isEqualTo(OtpChannel.SMS);
        assertThat(jdbc.sql("""
                        select count(*) from (select challenge_id from otp_delivery where phone = :p
                                              group by challenge_id having count(*) > 1) twice""")
                .param("p", phone).query(Long.class).single()).as("one attempt per code").isZero();
    }

    // ------------------------------------------------------------ E3, P3: an address and a number

    @Test
    void rotatingDeviceRefsFromOneAddressDoesNotGetMoreCodesForANumber() {
        String phone = polish();
        String ip = "198.51.100." + Math.floorMod(UUID.randomUUID().hashCode(), 250);
        for (int i = 0; i < 5; i++) {
            otp.requestChallenge(OtpAudience.CLIENT, phone, "device-" + UUID.randomUUID(), ip);
            rewind(phone);
        }
        assertThatThrownBy(() -> otp.requestChallenge(OtpAudience.CLIENT, phone, "device-" + UUID.randomUUID(), ip))
                .isInstanceOf(RateLimitedException.class).hasMessageContaining("from this address");
        assertThat(challenges(phone)).isEqualTo(5);
    }

    /** Audit 29.10.2026: invented numbers of any length after +48/+380, and IPv6 address rotation. */
    @Test
    void onlyFullNumbersOfTheMarketsAndOneBudgetPerIpv6Block() {
        for (String wrong : List.of("+4812345", "+48123456789012", "+38066123456", "+3806612345678")) {
            assertRefused(ErrorCode.VALIDATION_FAILED, () -> otp.requestChallenge(OtpAudience.CLIENT, wrong, null, null));
            assertThat(challenges(wrong)).isZero();
        }
        String phone = ukrainian();
        String block = "2001:db8:" + Integer.toHexString(Math.floorMod(UUID.randomUUID().hashCode(), 0xffff)) + ":7::";
        for (int i = 1; i <= 5; i++) {
            otp.requestChallenge(OtpAudience.CLIENT, phone, "device-" + UUID.randomUUID(), block + Integer.toHexString(i));
            rewind(phone);
        }
        assertThatThrownBy(() -> otp.requestChallenge(OtpAudience.CLIENT, phone, "device-" + UUID.randomUUID(),
                block + "abcd")).isInstanceOf(RateLimitedException.class).hasMessageContaining("from this address");
    }

    // ------------------------------------------------------------ E4, P4: riders and drivers together

    @Test
    void theNumbersBudgetCountsRiderAndDriverCodesTogether() {
        String phone = ukrainian();
        for (int i = 0; i < 5; i++) {
            otp.requestChallenge(i % 2 == 0 ? OtpAudience.CLIENT : OtpAudience.DRIVER, phone, null, null);
            rewind(phone);
        }
        for (OtpAudience audience : OtpAudience.values()) {
            assertThatThrownBy(() -> otp.requestChallenge(audience, phone, null, null))
                    .as(audience.name()).isInstanceOf(RateLimitedException.class)
                    .hasMessage("Too many codes for this phone");
        }
    }

    @Test
    void concurrentRequestsAsRiderAndDriverShareOneBudgetForTheNumber() throws Exception {
        String phone = polish();
        // Four codes so far: one more is allowed, whichever app asks first.
        for (int i = 0; i < 4; i++) {
            otp.requestChallenge(i % 2 == 0 ? OtpAudience.CLIENT : OtpAudience.DRIVER, phone, null, null);
            rewind(phone);
        }
        int threads = 8;
        var start = new java.util.concurrent.CountDownLatch(1);
        try (var pool = java.util.concurrent.Executors.newFixedThreadPool(threads)) {
            List<java.util.concurrent.Future<Boolean>> results = new java.util.ArrayList<>();
            for (int i = 0; i < threads; i++) {
                OtpAudience audience = i % 2 == 0 ? OtpAudience.CLIENT : OtpAudience.DRIVER;
                results.add(pool.submit(() -> {
                    start.await();
                    try {
                        otp.requestChallenge(audience, phone, null, null);
                        return true;
                    } catch (RateLimitedException e) {
                        return false;
                    }
                }));
            }
            start.countDown();
            long issued = 0;
            for (var result : results) {
                issued += result.get() ? 1 : 0;
            }
            assertThat(issued).isOne();
        }
        assertThat(challenges(phone)).isEqualTo(5);
    }

    // ------------------------------------------------------------ E5: settings

    @Test
    void wrongCountrySettingsStopTheStartWithTheSettingsName() {
        String secret = "a-test-secret-of-at-least-32-bytes-0123";
        for (String wrong : List.of("", " ", "48,abc", "+48", "4800", "0,380")) {
            Binder binder = new Binder(new MapConfigurationPropertySource(Map.of(
                    "blizz.otp.secret", secret, "blizz.otp.allowed-country-codes", wrong)));
            assertThatThrownBy(() -> binder.bind("blizz.otp", Bindable.of(OtpProperties.class)))
                    .as("'%s'", wrong)
                    .rootCause().hasMessageContaining("blizz.otp.allowed-country-codes");
        }
        OtpProperties defaults = new Binder(new MapConfigurationPropertySource(Map.of("blizz.otp.secret", secret)))
                .bind("blizz.otp", Bindable.of(OtpProperties.class)).get();
        assertThat(defaults.allowedCountryCodes()).containsExactly("48", "380");
        assertThat(defaults.maxPerIpAndPhonePerHour()).isEqualTo(5);
        assertThat(defaults.maxCallsPerPhonePerHour()).isEqualTo(2);
        assertThat(defaults.hourlyAlarm()).isEqualTo(500);
        assertThat(defaults.resendAfter()).isEqualTo(Duration.ofSeconds(60));
    }

    // ------------------------------------------------------------ E6, P5: the cost metric

    @Test
    void theCostMetricCountsByChannelAndCountryAndNoTagCarriesTheNumber() {
        double before = count("SMS", "48");
        String polish = polish();
        String ukrainian = ukrainian();
        otp.requestChallenge(OtpAudience.CLIENT, polish, null, null);
        otp.requestChallenge(OtpAudience.DRIVER, ukrainian, null, null);
        assertThat(count("SMS", "48")).isEqualTo(before + 1);
        assertThat(meters.get("blizz.otp.sent").tags("channel", "SMS", "country", "380").counter().count())
                .isPositive();
        assertThat(meters.get("blizz.otp.hourly.alarm").gauge().value()).isEqualTo(500);

        List<Meter> otpMeters = meters.getMeters().stream()
                .filter(m -> m.getId().getName().startsWith("blizz.otp") || m.getId().getName().startsWith("blizz.sms"))
                .toList();
        assertThat(otpMeters).isNotEmpty();
        for (Meter meter : otpMeters) {
            for (Tag tag : meter.getId().getTags()) {
                assertThat(tag.getValue()).as("%s %s", meter.getId().getName(), tag.getKey())
                        .doesNotContain(polish.substring(3)).doesNotContain(ukrainian.substring(4))
                        .doesNotContainPattern("[0-9]{4,}");
            }
            if (meter.getId().getName().equals("blizz.otp.sent")) {
                assertThat(meter.getId().getTag("country")).isIn("48", "380");
                assertThat(meter.getId().getTag("channel")).isIn("SMS", "VOICE");
            }
        }
    }

    private double count(String channel, String country) {
        var counter = meters.find("blizz.otp.sent").tags("channel", channel, "country", country).counter();
        return counter == null ? 0 : counter.count();
    }
}
