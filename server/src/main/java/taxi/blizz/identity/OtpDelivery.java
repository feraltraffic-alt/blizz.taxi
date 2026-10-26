package taxi.blizz.identity;

/**
 * Sends a one-time code to the phone (SMS, later voice). Called only after the challenge is
 * committed. Implementations must never log or persist the code in production.
 */
public interface OtpDelivery {

    void send(PhoneNumber phone, String code, OtpAudience audience);
}
