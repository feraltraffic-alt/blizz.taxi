package taxi.blizz.identity;

import java.time.OffsetDateTime;
import java.util.Optional;

/**
 * Sends a one-time code to the phone (SMS, later voice). Called only after the challenge is
 * committed. Implementations must never log or persist the code in production.
 *
 * <p>Which channel a code goes by is decided by the OTP service from the facts a delivery gives (issue #101): the
 * configured channel, its fallback and whether an earlier attempt failed. A delivery sends one code by one channel
 * only, so one request never costs an SMS and a call.
 */
public interface OtpDelivery {

    void send(PhoneNumber phone, String code, OtpAudience audience);

    /**
     * As {@link #send(PhoneNumber, String, OtpAudience)}, for the challenge {@code challengeId}, by exactly
     * {@code channel} ({@code null}: the configured channel). A delivery that chooses channels and keeps a record of
     * attempts overrides this; the others keep their single way.
     */
    default void send(java.util.UUID challengeId, PhoneNumber phone, String code, OtpAudience audience,
                      OtpChannel channel) {
        send(phone, code, audience);
    }

    /** The channel codes go by when nothing else applies (the admin panel's setting). */
    default OtpChannel primaryChannel() {
        return OtpChannel.SMS;
    }

    /** The channel a resend goes by after the primary one did not get through; empty when there is none. */
    default Optional<OtpChannel> fallbackChannel() {
        return Optional.empty();
    }

    /** Whether an attempt by {@code channel} to {@code phone} since {@code since} did not get through. */
    default boolean failedSince(PhoneNumber phone, OtpChannel channel, OffsetDateTime since) {
        return false;
    }
}
