package taxi.blizz.payments.internal;

import java.util.Map;
import java.util.Optional;

/**
 * One payment provider's protocol (ADR 0008). Amounts are minor units; the adapter converts them to the provider's
 * format. Every operation carries the platform's stable {@code reference}; a timeout is {@link Outcome#UNKNOWN},
 * never a failure (REQ-PAY-10).
 */
interface PaymentProvider {

    String name();

    enum Outcome {
        SUCCEEDED, DECLINED, PENDING, UNKNOWN
    }

    record Result(Outcome outcome, String providerStatus, String reasonCode, String reason) {

        static Result unknown(String reason) {
            return new Result(Outcome.UNKNOWN, null, null, reason);
        }
    }

    /** A form the rider's web view posts to add a card. */
    record Form(String url, Map<String, String> fields) {
    }

    record Customer(String phone, String firstName, String lastName, String email, String ipAddress) {
    }

    /**
     * What a notification says, after its signature was checked against the merchant's secret. {@code token} and
     * {@code maskedPan} are set for a card that was added or charged.
     */
    record Notification(String reference, String status, Outcome outcome, long amountMinor, String currency,
                        String token, String maskedPan, String cardType, String reasonCode, String reason) {
    }

    Form cardVerifyForm(Merchant merchant, String reference, String returnUrl, String serviceUrl, String clientPhone);

    /** A hold of {@code amountMinor} on a saved card. */
    Result authorize(Merchant merchant, String reference, String token, long amountMinor, Customer customer,
                     String description);

    /** Takes {@code amountMinor} of an earlier hold (at most the hold). */
    Result settle(Merchant merchant, String reference, long amountMinor);

    /** A one-step charge of a saved card, e.g. the part of a fare above the hold. */
    Result charge(Merchant merchant, String reference, String token, long amountMinor, Customer customer,
                  String description);

    /** Releases a hold or returns money taken under {@code reference}. */
    Result refund(Merchant merchant, String reference, long amountMinor, String comment);

    Result checkStatus(Merchant merchant, String reference);

    /** Empty when the signature or the merchant does not match: the notification is not trusted (REQ-PAY-11). */
    Optional<Notification> readNotification(Merchant merchant, Map<String, Object> body);

    /** The answer the provider expects so it stops repeating the notification. */
    Map<String, Object> acknowledge(Merchant merchant, String reference);
}
