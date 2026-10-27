package taxi.blizz.identity;

/**
 * Sends a one-time code to the phone (SMS, later voice). Called only after the challenge is
 * committed. Implementations must never log or persist the code in production.
 */
public interface OtpDelivery {

    void send(PhoneNumber phone, String code, OtpAudience audience);

    /**
     * As {@link #send(PhoneNumber, String, OtpAudience)}, for the challenge {@code challengeId}, by the channel the
     * person asked for when there is one ({@code preferred} may be null: the configured channel). A delivery that
     * chooses channels and keeps a record of attempts overrides this; the others keep their single way.
     */
    default void send(java.util.UUID challengeId, PhoneNumber phone, String code, OtpAudience audience,
                      OtpChannel preferred) {
        send(phone, code, audience);
    }
}
