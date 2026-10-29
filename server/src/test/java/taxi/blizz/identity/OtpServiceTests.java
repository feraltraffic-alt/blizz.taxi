package taxi.blizz.identity;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.RateLimitedException;
import taxi.blizz.platform.SubjectType;

/** REQ-AUTH-03 – REQ-AUTH-05, REQ-USR-09, REQ-USR-13, AC-03. */
@SpringBootTest
@Import({TestcontainersConfiguration.class, OtpServiceTests.Capture.class})
class OtpServiceTests {

    @Autowired
    OtpService otp;
    @Autowired
    CapturingDelivery delivery;
    @Autowired
    JdbcClient jdbc;

    private String phone;

    @BeforeEach
    void freshPhone() {
        delivery.sent.clear();
        // A unique number per test keeps rate limits and accounts independent.
        phone = "+38067" + String.format("%07d", Math.floorMod(UUID.randomUUID().hashCode(), 10_000_000));
    }

    private String lastCode() {
        return delivery.sent.getLast().code();
    }

    @Test
    void firstSignInCreatesAnActiveClient() {
        OffsetDateTime requestedAt = OffsetDateTime.now();
        ChallengeIssued issued = otp.requestChallenge(OtpAudience.CLIENT, phone, "device-1", null);
        assertThat(delivery.sent).hasSize(1);
        assertThat(issued.resendAvailableAt()).isAfter(requestedAt.minusSeconds(1));

        VerifiedSubject subject = otp.verify(issued.challengeId(), lastCode());

        assertThat(subject.actor().type()).isEqualTo(SubjectType.CLIENT);
        assertThat(subject.created()).isTrue();
        assertThat(subject.accountState()).isEqualTo("ACTIVE");
        assertThat(jdbc.sql("select count(*) from client where phone_normalized = :p").param("p", phone)
                .query(Integer.class).single()).isEqualTo(1);
    }

    @Test
    void secondSignInReturnsTheSameAccount() {
        ChallengeIssued firstChallenge = otp.requestChallenge(OtpAudience.CLIENT, phone, null, null);
        VerifiedSubject first = otp.verify(firstChallenge.challengeId(), lastCode());
        jdbc.sql("update otp_challenge set created_at = created_at - interval '2 minutes' where phone_normalized = :p")
                .param("p", phone).update();

        ChallengeIssued again = otp.requestChallenge(OtpAudience.CLIENT, phone, null, null);
        VerifiedSubject second = otp.verify(again.challengeId(), lastCode());

        assertThat(second.id()).isEqualTo(first.id());
        assertThat(second.created()).isFalse();
    }

    @Test
    void codeIsStoredOnlyAsHmac() {
        ChallengeIssued issued = otp.requestChallenge(OtpAudience.CLIENT, phone, null, null);

        byte[] stored = jdbc.sql("select code_hmac from otp_challenge where id = :id").param("id", issued.challengeId())
                .query((rs, i) -> rs.getBytes(1)).single();

        assertThat(stored).hasSize(32);
        assertThat(new String(stored, java.nio.charset.StandardCharsets.ISO_8859_1)).doesNotContain(lastCode());
    }

    @Test
    void usedCodeCannotBeReused() {
        ChallengeIssued issued = otp.requestChallenge(OtpAudience.CLIENT, phone, null, null);
        String code = lastCode();
        otp.verify(issued.challengeId(), code);

        assertInvalid(() -> otp.verify(issued.challengeId(), code));
    }

    @Test
    void wrongAttemptsAreCountedAndExhaustTheChallenge() {
        ChallengeIssued issued = otp.requestChallenge(OtpAudience.CLIENT, phone, null, null);
        String code = lastCode();
        String wrong = code.equals("000000") ? "111111" : "000000";

        for (int i = 0; i < 5; i++) {
            assertInvalid(() -> otp.verify(issued.challengeId(), wrong));
        }

        assertThat(jdbc.sql("select attempts from otp_challenge where id = :id").param("id", issued.challengeId())
                .query(Integer.class).single()).isEqualTo(5);
        assertInvalid(() -> otp.verify(issued.challengeId(), code));
    }

    @Test
    void expiredCodeIsRejected() {
        ChallengeIssued issued = otp.requestChallenge(OtpAudience.CLIENT, phone, null, null);
        jdbc.sql("update otp_challenge set expires_at = now() - interval '1 second' where id = :id")
                .param("id", issued.challengeId()).update();

        assertInvalid(() -> otp.verify(issued.challengeId(), lastCode()));
    }

    @Test
    void unknownChallengeIsRejectedLikeAWrongCode() {
        assertInvalid(() -> otp.verify(UUID.randomUUID(), "123456"));
    }

    @Test
    void resendTooSoonIsRateLimited() {
        otp.requestChallenge(OtpAudience.CLIENT, phone, null, null);

        assertThatThrownBy(() -> otp.requestChallenge(OtpAudience.CLIENT, phone, null, null))
                .isInstanceOf(RateLimitedException.class)
                .satisfies(e -> assertThat(((RateLimitedException) e).retryAfter()).isPositive());
        assertThat(delivery.sent).hasSize(1);
    }

    @Test
    void hourlyLimitPerPhoneApplies() {
        for (int i = 0; i < 5; i++) {
            otp.requestChallenge(OtpAudience.CLIENT, phone, null, null);
            jdbc.sql("update otp_challenge set created_at = created_at - interval '61 seconds' where phone_normalized = :p")
                    .param("p", phone).update();
        }

        assertThatThrownBy(() -> otp.requestChallenge(OtpAudience.CLIENT, phone, null, null))
                .isInstanceOf(RateLimitedException.class);
    }

    @Test
    void perDeviceLimitApplies() {
        String device = "device-" + UUID.randomUUID();
        for (int i = 0; i < 10; i++) {
            otp.requestChallenge(OtpAudience.CLIENT, "+4851" + String.format("%07d", i) , device, null);
        }

        assertThatThrownBy(() -> otp.requestChallenge(OtpAudience.CLIENT, phone, device, null))
                .isInstanceOf(RateLimitedException.class);
    }

    @Test
    void perIpLimitApplies() {
        String ip = "203.0.113." + Math.floorMod(UUID.randomUUID().hashCode(), 250);
        jdbc.sql("delete from otp_challenge where client_ip = :ip").param("ip", ip).update();
        for (int i = 0; i < 30; i++) {
            otp.requestChallenge(OtpAudience.DRIVER, "+4852" + String.format("%07d", Math.floorMod(UUID.randomUUID().hashCode(), 10_000_000)), null, ip);
        }

        assertThatThrownBy(() -> otp.requestChallenge(OtpAudience.CLIENT, phone, null, ip))
                .isInstanceOf(RateLimitedException.class);
    }

    @Test
    void clientAndDriverWithTheSamePhoneAreSeparateAccounts() {
        VerifiedSubject client = otp.verify(otp.requestChallenge(OtpAudience.CLIENT, phone, null, null).challengeId(), lastCode());
        VerifiedSubject driver = otp.verify(otp.requestChallenge(OtpAudience.DRIVER, phone, null, null).challengeId(), lastCode());

        assertThat(client.actor().type()).isEqualTo(SubjectType.CLIENT);
        assertThat(driver.actor().type()).isEqualTo(SubjectType.DRIVER);
        assertThat(jdbc.sql("select review_status from driver where id = :id").param("id", driver.id())
                .query(String.class).single()).isEqualTo("NOT_SUBMITTED");
    }

    @Test
    void staffCreatedUnverifiedClientBecomesActiveOnFirstSignIn() {
        UUID existing = UUID.randomUUID();
        jdbc.sql("""
                        insert into client (id, phone_normalized, account_state, has_app, created_at, updated_at)
                        values (:id, :p, 'UNVERIFIED', false, now(), now())""")
                .param("id", existing).param("p", phone).update();

        VerifiedSubject subject = otp.verify(otp.requestChallenge(OtpAudience.CLIENT, phone, null, null).challengeId(), lastCode());

        assertThat(subject.id()).isEqualTo(existing);
        assertThat(subject.accountState()).isEqualTo("ACTIVE");
        assertThat(jdbc.sql("select has_app from client where id = :id").param("id", existing)
                .query(Boolean.class).single()).isTrue();
    }

    @Test
    void blockedClientIsReportedNotUnblocked() {
        UUID blocked = UUID.randomUUID();
        jdbc.sql("""
                        insert into client (id, phone_normalized, account_state, has_app, created_at, updated_at)
                        values (:id, :p, 'BLOCKED', true, now(), now())""")
                .param("id", blocked).param("p", phone).update();

        VerifiedSubject subject = otp.verify(otp.requestChallenge(OtpAudience.CLIENT, phone, null, null).challengeId(), lastCode());

        assertThat(subject.accountState()).isEqualTo("BLOCKED");
    }

    @Test
    void codeIsNotSentWhenTheRequestFails() {
        assertThatThrownBy(() -> otp.requestChallenge(OtpAudience.CLIENT, "12345", null, null))
                .isInstanceOf(DomainException.class);
        assertThat(delivery.sent).isEmpty();
    }

    private static void assertInvalid(org.assertj.core.api.ThrowableAssert.ThrowingCallable call) {
        assertThatThrownBy(call)
                .isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code())
                .isEqualTo(ErrorCode.OTP_INVALID);
    }

    record Sent(PhoneNumber phone, String code, OtpAudience audience) {
    }

    static class CapturingDelivery implements OtpDelivery {
        final List<Sent> sent = new CopyOnWriteArrayList<>();

        @Override
        public void send(PhoneNumber phone, String code, OtpAudience audience) {
            sent.add(new Sent(phone, code, audience));
        }
    }

    @TestConfiguration(proxyBeanMethods = false)
    static class Capture {
        @Bean
        @Primary
        CapturingDelivery capturingDelivery() {
            return new CapturingDelivery();
        }
    }
}
