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
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.support.TransactionSynchronization;
import org.springframework.transaction.support.TransactionSynchronizationManager;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.identity.ChallengeIssued;
import taxi.blizz.identity.OtpAudience;
import taxi.blizz.identity.OtpChannel;
import taxi.blizz.identity.OtpDelivery;
import taxi.blizz.identity.OtpPurpose;
import taxi.blizz.identity.OtpService;
import taxi.blizz.identity.PhoneNumber;
import taxi.blizz.identity.VerifiedSubject;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommittedMetrics;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.RateLimitedException;
import taxi.blizz.platform.SubjectType;

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
    /** Confirmation codes are checked in their own transaction: a wrong attempt counts even if the caller fails. */
    private final TransactionTemplate own;
    private final CommittedMetrics metrics;

    JdbcOtpService(JdbcClient jdbc, TransactionTemplate tx, OtpDelivery delivery, OtpProperties properties,
                   Clock clock, CommittedMetrics metrics) {
        this.metrics = metrics;
        this.jdbc = jdbc;
        this.tx = tx;
        this.delivery = delivery;
        this.properties = properties;
        this.clock = clock;
        this.key = new SecretKeySpec(properties.secret().getBytes(StandardCharsets.UTF_8), "HmacSHA256");
        this.own = new TransactionTemplate(tx.getTransactionManager());
        this.own.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW);
    }

    @Override
    public ChallengeIssued requestChallenge(OtpAudience audience, String rawPhone, String deviceRef,
                                            String clientIp) {
        return requestChallenge(audience, rawPhone, deviceRef, clientIp, null);
    }

    @Override
    public ChallengeIssued requestChallenge(OtpAudience audience, String rawPhone, String deviceRef, String clientIp,
                                            OtpChannel preferred) {
        return issue(audience, PhoneNumber.parse(rawPhone), OtpPurpose.SIGN_IN, deviceRef, clientIp, preferred, null);
    }

    @Override
    public ChallengeIssued requestForNewPhone(Actor subject, String rawPhone, String deviceRef, String clientIp) {
        OtpAudience audience = audienceOf(subject);
        return issue(audience, PhoneNumber.parse(rawPhone), OtpPurpose.NEW_PHONE, deviceRef, clientIp, null,
                subject.id());
    }

    @Override
    public PhoneNumber confirmNewPhone(Actor subject, UUID challengeId, String code) {
        OtpAudience audience = audienceOf(subject);
        PhoneNumber confirmed = own.execute(status -> {
            Optional<Challenge> challenge = lockValid(challengeId);
            // Another purpose, kind of account or account: as if there were no such challenge, no attempt counted.
            if (challenge.isEmpty() || challenge.get().purpose() != OtpPurpose.NEW_PHONE
                    || challenge.get().audience() != audience || !subject.id().equals(challenge.get().subjectId())) {
                return null;
            }
            return use(challenge.get(), code, now()) ? challenge.get().phone() : null;
        });
        if (confirmed == null) {
            throw new DomainException(ErrorCode.OTP_INVALID, "The code is wrong or no longer valid");
        }
        return confirmed;
    }

    @Override
    public ChallengeIssued requestConfirmation(Actor subject, OtpPurpose purpose, String deviceRef,
                                               String clientIp) {
        if (purpose == null || purpose == OtpPurpose.SIGN_IN) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "A confirmation code needs its own purpose");
        }
        OtpAudience audience = audienceOf(subject);
        PhoneNumber phone = currentPhone(subject)
                .orElseThrow(() -> new DomainException(ErrorCode.STATE_CONFLICT, "The account has no phone"));
        return issue(audience, phone, purpose, deviceRef, clientIp, null, null);
    }

    /**
     * A new challenge of the purpose; the code is sent after commit by one channel. Budgets are shared by all
     * purposes. A number outside the served countries gets nothing and leaves no challenge (issue #101, P1).
     */
    private ChallengeIssued issue(OtpAudience audience, PhoneNumber phone, OtpPurpose purpose, String deviceRef,
                                  String clientIp, OtpChannel preferred, UUID subjectId) {
        String country = properties.countryOf(phone).orElseThrow(() -> new DomainException(
                ErrorCode.PHONE_COUNTRY_NOT_SERVED, "Codes are sent only to numbers of the served countries"));
        return tx.execute(status -> {
            OffsetDateTime now = now();
            OtpChannel channel = enforceLimits(audience, phone, deviceRef, clientIp, preferred, now);

            UUID challengeId = UUID.randomUUID();
            String code = newCode();
            OffsetDateTime expiresAt = now.plus(properties.ttl());
            jdbc.sql("""
                            insert into otp_challenge (id, audience, phone_normalized, code_hmac, expires_at,
                                                       max_attempts, device_ref, client_ip, created_at, purpose,
                                                       subject_id, channel)
                            values (:id, :audience, :phone, :hmac, :expiresAt, :maxAttempts, :deviceRef, :clientIp,
                                    :now, :purpose, :subject, :channel)
                            """)
                    .param("subject", subjectId)
                    .param("channel", channel.name())
                    .param("id", challengeId)
                    .param("audience", audience.name())
                    .param("phone", phone.e164())
                    .param("purpose", purpose.name())
                    .param("hmac", hmac(challengeId, audience, phone, code, purpose))
                    .param("expiresAt", expiresAt)
                    .param("maxAttempts", properties.maxAttempts())
                    .param("deviceRef", deviceRef)
                    .param("clientIp", clientIp)
                    .param("now", now)
                    .update();

            TransactionSynchronizationManager.registerSynchronization(new TransactionSynchronization() {
                @Override
                public void afterCommit() {
                    delivery.send(challengeId, phone, code, audience, channel);
                }
            });
            // What the codes cost, by channel and country (P5): the labels are a closed set, never the number.
            metrics.counter("blizz.otp.sent", "channel", channel.name(), "country", country);
            return new ChallengeIssued(challengeId, expiresAt, now.plus(properties.resendAfter()), channel);
        });
    }

    /** Checks every budget and returns the one channel this code goes by (issue #101). */
    private OtpChannel enforceLimits(OtpAudience audience, PhoneNumber phone, String deviceRef, String clientIp,
                                     OtpChannel requested, OffsetDateTime now) {
        // Serializes concurrent requests for the same phone, riders and drivers together, within this transaction.
        jdbc.sql("select pg_advisory_xact_lock(hashtext(:key))")
                .param("key", "otp:" + phone.e164())
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
        // From one address to one number, whatever device refs it sends (P3); before the per-number budget, so the
        // refusal names the address.
        if (clientIp != null) {
            int fromHere = jdbc.sql("""
                            select count(*) from otp_challenge
                            where phone_normalized = :phone and client_ip = :ip and created_at > :since
                            """)
                    .param("phone", phone.e164()).param("ip", clientIp).param("since", hourAgo)
                    .query(Integer.class).single();
            if (fromHere >= properties.maxPerIpAndPhonePerHour()) {
                throw new RateLimitedException("Too many codes for this phone from this address", Duration.ofHours(1));
            }
        }

        // One budget for the number, as a rider and as a driver together (P4).
        int perPhone = jdbc.sql("""
                        select count(*) from otp_challenge
                        where phone_normalized = :phone and created_at > :since
                        """)
                .param("phone", phone.e164())
                .param("since", hourAgo)
                .query(Integer.class).single();
        if (perPhone >= properties.maxPerPhonePerHour()) {
            throw new RateLimitedException("Too many codes for this phone", Duration.ofHours(1));
        }

        if (clientIp != null && countSince("client_ip", clientIp, hourAgo) >= properties.maxPerIpPerHour()) {
            throw new RateLimitedException("Too many codes from this address", Duration.ofHours(1));
        }
        if (deviceRef != null && countSince("device_ref", deviceRef, hourAgo) >= properties.maxPerDevicePerHour()) {
            throw new RateLimitedException("Too many codes from this device", Duration.ofHours(1));
        }

        int global = jdbc.sql("select count(*) from otp_challenge where created_at > :since")
                .param("since", hourAgo)
                .query(Integer.class).single();
        if (global >= properties.maxGlobalPerHour()) {
            throw new RateLimitedException("Code sending budget exhausted", Duration.ofMinutes(5));
        }

        OtpChannel channel = channel(phone, requested, perPhone > 0, hourAgo);
        if (channel == OtpChannel.VOICE) {
            int calls = jdbc.sql("""
                            select count(*) from otp_challenge
                            where phone_normalized = :phone and channel = 'VOICE' and created_at > :since
                            """)
                    .param("phone", phone.e164()).param("since", hourAgo)
                    .query(Integer.class).single();
            if (calls >= properties.maxCallsPerPhonePerHour()) {
                throw new RateLimitedException("Too many calls for this phone", Duration.ofHours(1));
            }
        }
        return channel;
    }

    /**
     * The one channel of this code (P2). An SMS when asked for. A call when asked for only on a resend, a second code
     * for the number within the hour (typically after an SMS that did not arrive); a first request for a call gets the
     * configured channel. Without a request the configured channel, or its fallback when an attempt by it to this
     * number did not get through in the last hour.
     */
    private OtpChannel channel(PhoneNumber phone, OtpChannel requested, boolean resend, OffsetDateTime since) {
        OtpChannel primary = delivery.primaryChannel();
        if (requested == OtpChannel.SMS) {
            return OtpChannel.SMS;
        }
        if (requested == OtpChannel.VOICE) {
            return resend ? OtpChannel.VOICE : primary;
        }
        Optional<OtpChannel> fallback = delivery.fallbackChannel();
        if (fallback.isPresent() && fallback.get() != primary && delivery.failedSince(phone, primary, since)) {
            return fallback.get();
        }
        return primary;
    }

    private int countSince(String column, String value, OffsetDateTime since) {
        // column is one of two fixed names chosen above, never user input
        return jdbc.sql("select count(*) from otp_challenge where " + column + " = :value and created_at > :since")
                .param("value", value)
                .param("since", since)
                .query(Integer.class).single();
    }

    @Override
    public VerifiedSubject verify(UUID challengeId, String code) {
        Result result = tx.execute(status -> check(challengeId, code));
        if (result == null || result.subject() == null) {
            throw new DomainException(ErrorCode.OTP_INVALID, "The code is wrong or no longer valid");
        }
        return result.subject();
    }

    @Override
    public void confirm(Actor subject, UUID challengeId, String code, OtpPurpose purpose) {
        if (purpose == null || purpose == OtpPurpose.SIGN_IN) {
            throw new DomainException(ErrorCode.OTP_INVALID, "The code is wrong or no longer valid");
        }
        OtpAudience audience = audienceOf(subject);
        Optional<PhoneNumber> phone = currentPhone(subject);
        Boolean confirmed = own.execute(status -> {
            Optional<Challenge> challenge = lockValid(challengeId);
            // Another purpose, kind of account or phone: as if there were no such challenge, no attempt counted.
            if (challenge.isEmpty() || challenge.get().purpose() != purpose || challenge.get().audience() != audience
                    || phone.isEmpty() || !challenge.get().phone().equals(phone.get())) {
                return false;
            }
            return use(challenge.get(), code, now());
        });
        if (!Boolean.TRUE.equals(confirmed)) {
            throw new DomainException(ErrorCode.OTP_INVALID, "The code is wrong or no longer valid");
        }
    }

    private Result check(UUID challengeId, String code) {
        OffsetDateTime now = now();
        Optional<Challenge> found = lockValid(challengeId);
        // A confirmation code never signs anybody in.
        if (found.isEmpty() || found.get().purpose() != OtpPurpose.SIGN_IN) {
            return Result.invalid();
        }
        Challenge challenge = found.get();
        if (!use(challenge, code, now)) {
            return Result.invalid();
        }
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

    /** The challenge locked for the check, when it exists, is not used up, not expired and has attempts left. */
    private Optional<Challenge> lockValid(UUID challengeId) {
        OffsetDateTime now = now();
        return jdbc.sql("""
                        select id, audience, phone_normalized, code_hmac, expires_at, attempts, max_attempts,
                               consumed_at, purpose, subject_id
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
                        rs.getObject("consumed_at", OffsetDateTime.class),
                        OtpPurpose.valueOf(rs.getString("purpose")),
                        rs.getObject("subject_id", UUID.class)))
                .optional()
                .filter(c -> c.consumedAt() == null && now.isBefore(c.expiresAt()) && c.attempts() < c.maxAttempts());
    }

    /** Checks the code: a match uses the challenge up, a miss counts an attempt (committed either way). */
    private boolean use(Challenge challenge, String code, OffsetDateTime now) {
        boolean matches = code != null
                && MessageDigest.isEqual(challenge.codeHmac(),
                hmac(challenge.id(), challenge.audience(), challenge.phone(), code.strip(), challenge.purpose()));
        if (!matches) {
            jdbc.sql("update otp_challenge set attempts = attempts + 1 where id = :id")
                    .param("id", challenge.id())
                    .update();
            return false;
        }
        jdbc.sql("update otp_challenge set consumed_at = :now where id = :id")
                .param("now", now)
                .param("id", challenge.id())
                .update();
        return true;
    }

    private static OtpAudience audienceOf(Actor subject) {
        if (subject == null || (subject.type() != SubjectType.CLIENT && subject.type() != SubjectType.DRIVER)) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Only riders and drivers confirm by code");
        }
        return subject.type() == SubjectType.CLIENT ? OtpAudience.CLIENT : OtpAudience.DRIVER;
    }

    /** The phone the account has now; empty for an anonymized one. */
    private Optional<PhoneNumber> currentPhone(Actor subject) {
        String table = subject.type() == SubjectType.CLIENT ? "client" : "driver";
        return jdbc.sql("select phone_normalized from " + table + " where id = :id")
                .param("id", subject.id())
                .query(String.class)
                .optional()
                .filter(p -> p != null && !p.isBlank())
                .map(PhoneNumber::new);
    }

    /** Sign-in codes keep the original message, so challenges issued before purposes existed still verify. */
    private byte[] hmac(UUID challengeId, OtpAudience audience, PhoneNumber phone, String code, OtpPurpose purpose) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(key);
            String message = challengeId + "|" + audience + "|" + phone.e164() + "|" + code
                    + (purpose == OtpPurpose.SIGN_IN ? "" : "|" + purpose.name());
            return mac.doFinal(message.getBytes(StandardCharsets.UTF_8));
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            throw new IllegalStateException("HMAC-SHA256 is not available", e);
        }
    }

    private OffsetDateTime now() {
        return OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
    }

    private record Challenge(UUID id, OtpAudience audience, PhoneNumber phone, byte[] codeHmac,
                             OffsetDateTime expiresAt, int attempts, int maxAttempts, OffsetDateTime consumedAt,
                             OtpPurpose purpose, UUID subjectId) {
    }

    private record Account(UUID id, String state) {
    }

    private record Result(VerifiedSubject subject) {
        static Result invalid() {
            return new Result(null);
        }
    }
}
