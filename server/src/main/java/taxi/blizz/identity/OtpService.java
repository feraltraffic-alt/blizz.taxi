package taxi.blizz.identity;

import java.util.UUID;

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
     * Checks the code. A wrong code still counts as an attempt even though the call fails.
     *
     * @throws taxi.blizz.platform.DomainException with {@code OTP_INVALID} for a wrong, expired,
     *         used or exhausted challenge
     */
    VerifiedSubject verify(UUID challengeId, String code);
}
