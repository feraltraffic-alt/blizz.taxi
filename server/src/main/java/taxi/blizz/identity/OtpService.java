package taxi.blizz.identity;

import java.util.UUID;
import taxi.blizz.platform.Actor;

/** Phone sign-in for clients and drivers by one-time code (REQ-AUTH-03 – REQ-AUTH-05). */
public interface OtpService {

    /**
     * Issues a code for the phone and audience and sends it after commit.
     *
     * @param deviceRef app installation id, may be null
     * @param clientIp  caller's address as seen by the server, may be null
     *
     * @throws taxi.blizz.platform.RateLimitedException when resend delay, per-phone or global budget is exceeded
     */
    ChallengeIssued requestChallenge(OtpAudience audience, String rawPhone, String deviceRef, String clientIp);

    /**
     * As {@link #requestChallenge(OtpAudience, String, String, String)}, by the channel the person asked for
     * ("call me instead", ADR 0012 Q-18); null for the configured one. Same resend delay and limits.
     */
    ChallengeIssued requestChallenge(OtpAudience audience, String rawPhone, String deviceRef, String clientIp,
                                     OtpChannel preferred);

    /**
     * Checks the code. A wrong code still counts as an attempt even though the call fails.
     *
     * @throws taxi.blizz.platform.DomainException with {@code OTP_INVALID} for a wrong, expired,
     *         used or exhausted challenge
     */
    VerifiedSubject verify(UUID challengeId, String code);

    /**
     * Sends a code of {@code purpose} (not SIGN_IN) to the subject's current phone, to confirm an action of a
     * signed-in client or driver again. Same resend delay and budgets as sign-in.
     *
     * @throws taxi.blizz.platform.RateLimitedException as {@link #requestChallenge}
     */
    ChallengeIssued requestConfirmation(Actor subject, OtpPurpose purpose, String deviceRef, String clientIp);

    /**
     * Checks a code of {@code purpose} sent by {@link #requestConfirmation} to this subject's current phone and uses
     * it up. Never creates an account or a session. A wrong code counts as an attempt.
     *
     * @throws taxi.blizz.platform.DomainException with {@code OTP_INVALID} for a wrong, expired, used or exhausted
     *         challenge, or one of another purpose, subject or phone
     */
    void confirm(Actor subject, UUID challengeId, String code, OtpPurpose purpose);

    /**
     * Sends a {@code NEW_PHONE} code to {@code rawPhone}, which the signed-in {@code subject} wants as the new phone.
     * Says nothing about whether the number belongs to anybody. Same resend delay and budgets as sign-in.
     */
    ChallengeIssued requestForNewPhone(Actor subject, String rawPhone, String deviceRef, String clientIp);

    /**
     * Checks a {@code NEW_PHONE} code this subject asked for and uses it up; returns the phone it went to.
     *
     * @throws taxi.blizz.platform.DomainException with {@code OTP_INVALID} for a wrong, expired, used or exhausted
     *         challenge, or one of another purpose or account
     */
    PhoneNumber confirmNewPhone(Actor subject, UUID challengeId, String code);
}
