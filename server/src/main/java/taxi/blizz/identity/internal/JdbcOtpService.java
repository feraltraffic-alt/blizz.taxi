package taxi.blizz.identity.internal;

import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.time.Clock;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Optional;
import java.util.UUID;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionSynchronization;
import org.springframework.transaction.support.TransactionSynchronizationManager;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.identity.ChallengeIssued;
import taxi.blizz.identity.OtpAudience;
import taxi.blizz.identity.OtpDelivery;
import taxi.blizz.identity.OtpService;
import taxi.blizz.identity.PhoneNumber;
import taxi.blizz.identity.VerifiedSubject;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.RateLimitedException;

/**
 * OTP challenges stored as HMAC with a server secret, never as the code itself (REQ-AUTH-05).
 *
 * <p>Wrong attempts are committed before the error is returned, so a challenge cannot be brute
 * forced by repeating requests (AC-03). The same response is returned whether or not an account
 * exists; accounts are looked up only after a correct code.
 */
@Service
class JdbcOtpService implements OtpService {

    private static final SecureRandom RANDOM = new SecureRandom();

    private final JdbcClient jdbc;
    private final TransactionTemplate tx;
    private final OtpDelivery delivery;
    private final OtpProperties properties;
    private final Clock clock;
    private final SecretKeySpec key;

    JdbcOtpService(JdbcClient jdbc, TransactionTemplate tx, OtpDelivery delivery, OtpProperties properties,
                   Clock clock) {
        this.jdbc = jdbc;
        this.tx = tx;
        this.delivery = delivery;
        this.properties = properties;
        this.clock = clock;
        this.key = new SecretKeySpec(properties.secret().getBytes(StandardCharsets.UTF_8), "HmacSHA256");
    }

    @Override
    public ChallengeIssued requestChallenge(OtpAudience audience, String rawPhone, String deviceRef) {
        PhoneNumber phone = PhoneNumber.parse(rawPhone);
        return tx.execute(status -> {
            OffsetDateTime now = now();
            enforceLimits(audience, phone, now);

            UUID challengeId = UUID.randomUUID();
            String code = newCode();
            OffsetDateTime expiresAt = now.plus(properties.ttl());
            jdbc.sql("""
                            insert into otp_challenge (id, audience, phone_normalized, code_hmac, expires_at,
                                                       max_attempts, device_ref, created_at)
                            values (:id, :audience, :phone, :hmac, :expiresAt, :maxAttempts, :deviceRef, :now)
                            """)
                    .param("id", challengeId)
                    .param("audience", audience.name())
                    .param("phone", phone.e164())
                    .param("hmac", hmac(challengeId, audience, phone, code))
                    .param("expiresAt", expiresAt)
                    .param("maxAttempts", properties.maxAttempts())
                    .param("deviceRef", deviceRef)
                    .param("now", now)
                    .update();

            TransactionSynchronizationManager.registerSynchronization(new TransactionSynchronization() {
                @Override
                public void afterCommit() {
                    delivery.send(phone, code, audience);
                }
            });
            return new ChallengeIssued(challengeId, expiresAt, now.plus(properties.resendAfter()));
        });
    }

    private void enforceLimits(OtpAudience audience, PhoneNumber phone, OffsetDateTime now) {
        // Serializes concurrent requests for the same phone and audience within this transaction.
        jdbc.sql("select pg_advisory_xact_lock(hashtext(:key))")
                .param("key", "otp:" + audience + ":" + phone.e164())
                .query().singleRow();

        Optional<OffsetDateTime> last = jdbc.sql("""
                        select created_at from otp_challenge
                        where audience = :audience and phone_normalized = :phone
                        order by created_at desc
                        limit 1
                        """)
                .param("audience", audience.name())
                .param("phone", phone.e164())
                .query((rs, i) -> rs.getObject(1, OffsetDateTime.class))
                .optional();
        if (last.isPresent()) {
            OffsetDateTime allowedAt = last.get().plus(properties.resendAfter());
            if (now.isBefore(allowedAt)) {
                throw new RateLimitedException("A code was sent recently", Duration.between(now, allowedAt));
            }
        }

        OffsetDateTime hourAgo = now.minusHours(1);
        int perPhone = jdbc.sql("""
                        select count(*) from otp_challenge
                        where audience = :audience and phone_normalized = :phone and created_at > :since
                        """)
                .param("audience", audience.name())
                .param("phone", phone.e164())
                .param("since", hourAgo)
                .query(Integer.class).single();
        if (perPhone >= properties.maxPerPhonePerHour()) {
            throw new RateLimitedException("Too many codes for this phone", Duration.ofHours(1));
        }

        int global = jdbc.sql("select count(*) from otp_challenge where created_at > :since")
                .param("since", hourAgo)
                .query(Integer.class).single();
        if (global >= properties.maxGlobalPerHour()) {
            throw new RateLimitedException("Code sending budget exhausted", Duration.ofMinutes(5));
        }
    }

    @Override
    public VerifiedSubject verify(UUID challengeId, String code) {
        Result result = tx.execute(status -> check(challengeId, code));
        if (result == null || result.subject() == null) {
            throw new DomainException(ErrorCode.OTP_INVALID, "The code is wrong or no longer valid");
        }
        return result.subject();
    }

    private Result check(UUID challengeId, String code) {
        OffsetDateTime now = now();
        Optional<Challenge> found = jdbc.sql("""
                        select id, audience, phone_normalized, code_hmac, expires_at, attempts, max_attempts,
                               consumed_at
                        from otp_challenge where id = :id for update
                        """)
                .param("id", challengeId)
                .query((rs, i) -> new Challenge(
                        rs.getObject("id", UUID.class),
                        OtpAudience.valueOf(rs.getString("audience")),
                        new PhoneNumber(rs.getString("phone_normalized")),
                        rs.getBytes("code_hmac"),
                        rs.getObject("expires_at", OffsetDateTime.class),
                        rs.getInt("attempts"),
                        rs.getInt("max_attempts"),
                        rs.getObject("consumed_at", OffsetDateTime.class)))
                .optional();
        if (found.isEmpty()) {
            return Result.invalid();
        }
        Challenge challenge = found.get();
        if (challenge.consumedAt() != null || !now.isBefore(challenge.expiresAt())
                || challenge.attempts() >= challenge.maxAttempts()) {
            return Result.invalid();
        }

        boolean matches = code != null
                && MessageDigest.isEqual(challenge.codeHmac(),
                hmac(challenge.id(), challenge.audience(), challenge.phone(), code.strip()));
        if (!matches) {
            jdbc.sql("update otp_challenge set attempts = attempts + 1 where id = :id")
                    .param("id", challenge.id())
                    .update();
            return Result.invalid();
        }

        jdbc.sql("update otp_challenge set consumed_at = :now where id = :id")
                .param("now", now)
                .param("id", challenge.id())
                .update();
        return new Result(challenge.audience() == OtpAudience.CLIENT
                ? signInClient(challenge.phone(), now)
                : signInDriver(challenge.phone(), now));
    }

    private VerifiedSubject signInClient(PhoneNumber phone, OffsetDateTime now) {
        Optional<Account> existing = jdbc.sql("""
                        select id, account_state from client
                        where phone_normalized = :phone and account_state <> 'ANONYMIZED'
                        for update
                        """)
                .param("phone", phone.e164())
                .query((rs, i) -> new Account(rs.getObject("id", UUID.class), rs.getString("account_state")))
                .optional();
        if (existing.isPresent()) {
            Account account = existing.get();
            // A record created by staff for a phone order becomes the caller's account once the
            // caller proves control of that number (REQ-USR-13, section 36.4).
            String state = "UNVERIFIED".equals(account.state()) ? "ACTIVE" : account.state();
            jdbc.sql("""
                            update client
                            set account_state = :state, phone_verified_at = :now, has_app = true,
                                updated_at = :now, version = version + 1
                            where id = :id
                            """)
                    .param("state", state)
                    .param("now", now)
                    .param("id", account.id())
                    .update();
            return new VerifiedSubject(new Actor(OtpAudience.CLIENT.subjectType(), account.id()), state, false);
        }
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into client (id, phone_normalized, phone_verified_at, account_state, has_app,
                                            created_at, updated_at)
                        values (:id, :phone, :now, 'ACTIVE', true, :now, :now)
                        """)
                .param("id", id)
                .param("phone", phone.e164())
                .param("now", now)
                .update();
        return new VerifiedSubject(new Actor(OtpAudience.CLIENT.subjectType(), id), "ACTIVE", true);
    }

    private VerifiedSubject signInDriver(PhoneNumber phone, OffsetDateTime now) {
        Optional<Account> existing = jdbc.sql("""
                        select id, account_state from driver
                        where phone_normalized = :phone and account_state <> 'ANONYMIZED'
                        for update
                        """)
                .param("phone", phone.e164())
                .query((rs, i) -> new Account(rs.getObject("id", UUID.class), rs.getString("account_state")))
                .optional();
        if (existing.isPresent()) {
            Account account = existing.get();
            jdbc.sql("""
                            update driver set phone_verified_at = :now, updated_at = :now, version = version + 1
                            where id = :id
                            """)
                    .param("now", now)
                    .param("id", account.id())
                    .update();
            return new VerifiedSubject(new Actor(OtpAudience.DRIVER.subjectType(), account.id()), account.state(), false);
        }
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into driver (id, phone_normalized, phone_verified_at, account_state, review_status,
                                            created_at, updated_at)
                        values (:id, :phone, :now, 'ACTIVE', 'NOT_SUBMITTED', :now, :now)
                        """)
                .param("id", id)
                .param("phone", phone.e164())
                .param("now", now)
                .update();
        return new VerifiedSubject(new Actor(OtpAudience.DRIVER.subjectType(), id), "ACTIVE", true);
    }

    private String newCode() {
        int bound = (int) Math.pow(10, properties.codeLength());
        return String.format("%0" + properties.codeLength() + "d", RANDOM.nextInt(bound));
    }

    private byte[] hmac(UUID challengeId, OtpAudience audience, PhoneNumber phone, String code) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(key);
            String message = challengeId + "|" + audience + "|" + phone.e164() + "|" + code;
            return mac.doFinal(message.getBytes(StandardCharsets.UTF_8));
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            throw new IllegalStateException("HMAC-SHA256 is not available", e);
        }
    }

    private OffsetDateTime now() {
        return OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
    }

    private record Challenge(UUID id, OtpAudience audience, PhoneNumber phone, byte[] codeHmac,
                             OffsetDateTime expiresAt, int attempts, int maxAttempts, OffsetDateTime consumedAt) {
    }

    private record Account(UUID id, String state) {
    }

    private record Result(VerifiedSubject subject) {
        static Result invalid() {
            return new Result(null);
        }
    }
}
