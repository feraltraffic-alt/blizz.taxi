package taxi.blizz.payments;

import java.time.OffsetDateTime;
import java.util.Map;
import java.util.UUID;
import taxi.blizz.platform.Actor;

/**
 * Topping up by card on the provider's payment page (ADR 0009 p. 1, ADR 0010 p. 1): a rider tops up the bonus
 * account, a driver the balance with the service. The app posts {@code fields} to {@code url} from a web view, the
 * card is entered there (3-D Secure included), and the provider tells the server the result. When the money is taken
 * {@link #COMPLETED} is published with {@code top_up_id}, {@code account_type} (CLIENT or DRIVER), {@code account_id},
 * {@code amount_minor} and {@code currency}; finance credits the account from it. A result the provider did not
 * report is asked for with CHECK_STATUS; money the provider took is credited even when it reports late.
 */
public interface CardTopUps {

    String COMPLETED = "CardTopUpCompleted";

    /**
     * {@code state}: PENDING until the provider reports, then COMPLETED or FAILED; EXPIRED when the page was left
     * unpaid. {@code url} and {@code fields} only in the answer that starts it.
     */
    record TopUp(UUID id, String state, long amountMinor, String currency, String url, Map<String, String> fields,
                 String returnUrl, OffsetDateTime createdAt, OffsetDateTime expiresAt, OffsetDateTime completedAt,
                 String maskedPan, String failureReason) {
    }

    /**
     * Opens the payment page of the merchant of {@code cityId} for {@code amountMinor} in the merchant's currency.
     * Riders and drivers only; NOT_FOUND when the city takes no cards; VALIDATION_FAILED outside the allowed amounts.
     */
    TopUp start(Actor payer, UUID commandId, UUID cityId, long amountMinor);

    /** One of the payer's own top-ups. */
    TopUp topUp(Actor payer, UUID topUpId);

    /**
     * REQ-PAY-18 (issue #140): a top-up that repays the rider's debt on {@code obligationOrderId} instead of crediting
     * the bonus account; {@link #COMPLETED} then carries {@code obligation_order_id}. Runs in the caller's
     * transaction, which must hold the order's lock: STATE_CONFLICT while another page of the same obligation is
     * open (not yet expired and not yet decided). The amount limits are those of a top-up.
     */
    TopUp openRepayment(Actor payer, UUID cityId, UUID obligationOrderId, long amountMinor);

    /** The repayments of an obligation, newest first, without the page's form. */
    java.util.List<TopUp> repaymentsOf(UUID obligationOrderId);

    /** One of the payer's own repayments; NOT_FOUND for a plain top-up or another payer's. */
    TopUp repayment(Actor payer, UUID repaymentId);
}
