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

    /** WayForPay's reason code "Order Not Found": the bank never saw the reference (wiki.wayforpay.com/en/view/852131). */
    String ORDER_NOT_FOUND = "1127";

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

    /**
     * The provider's payment page for a one-time payment of {@code amountMinor} (a top-up): the card is entered
     * there; the result comes to {@code serviceUrl}. The page stops taking the payment after {@code lifetimeSeconds}.
     */
    Form purchaseForm(Merchant merchant, String reference, long amountMinor, String description, String returnUrl,
                      String serviceUrl, String clientPhone, String language, long lifetimeSeconds);

    /**
     * A hold of {@code amountMinor} on a saved card, kept {@code holdSeconds}; the provider reports late results to
     * {@code serviceUrl}.
     */
    Result authorize(Merchant merchant, String reference, String token, long amountMinor, Customer customer,
                     String description, long holdSeconds, String serviceUrl);

    /** Takes {@code amountMinor} of an earlier hold (at most the hold). */
    Result settle(Merchant merchant, String reference, long amountMinor);

    /** A one-step charge of a saved card, e.g. the part of a fare above the hold. */
    Result charge(Merchant merchant, String reference, String token, long amountMinor, Customer customer,
                  String description, String serviceUrl);

    /** Releases a hold or returns money taken under {@code reference}. */
    Result refund(Merchant merchant, String reference, long amountMinor, String comment);

    /** Accounting-only bank projection; no customer fields or raw response are retained. */
    record ProviderTransaction(String reference, String type, String status, long amountMinor, String currency,
                               Long feeMinor, java.time.Instant createdAt, java.time.Instant processedAt) {
    }

    /** A failed or unclassifiable statement throws a safe fixed-code exception; it is never an empty statement. */
    java.util.List<ProviderTransaction> transactions(Merchant merchant, java.time.Instant from, java.time.Instant to);

    Result checkStatus(Merchant merchant, String reference);

    /** Empty when the signature or the merchant does not match: the notification is not trusted (REQ-PAY-11). */
    Optional<Notification> readNotification(Merchant merchant, Map<String, Object> body);

    /** The answer the provider expects so it stops repeating the notification. */
    Map<String, Object> acknowledge(Merchant merchant, String reference);
}
