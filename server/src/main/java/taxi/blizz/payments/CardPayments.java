package taxi.blizz.payments;

import java.time.OffsetDateTime;
import java.util.Optional;
import java.util.UUID;

/**
 * Paying an order by a saved card (ADR 0008, REQ-PAY-01…07). The order module asks for a hold inside its own
 * transaction; the provider is called afterwards, outside any transaction, by the payment worker. The result comes
 * back as an event: {@link #HOLD_AUTHORIZED} or {@link #HOLD_DECLINED} with {@code order_id}. An unknown result is
 * neither: it is reconciled with the provider, never treated as a decline (REQ-PAY-19).
 */
public interface CardPayments {

    String HOLD_AUTHORIZED = "CardHoldAuthorized";
    String HOLD_DECLINED = "CardHoldDeclined";
    /** After the trip: {@code paid_minor} of {@code due_minor} was taken from the card (ADR 0008, part C). */
    String PAYMENT_SETTLED = "CardPaymentSettled";
    /**
     * A tip charged to the order's saved card (ADR 0012): {@code tip_id}, {@code order_id} and {@code paid} (false —
     * declined, with {@code reason}).
     */
    String TIP_SETTLED = "CardTipSettled";

    record Intent(UUID id, UUID orderId, String state, long holdMinor, String currency, String maskedPan) {
    }

    /**
     * Within the caller's transaction: a hold of {@code amountMinor} on the rider's card for the city's merchant,
     * kept at least until {@code holdUntil} (null — the provider's default). VALIDATION_FAILED when the city takes no
     * cards or the rider has no card there.
     */
    UUID requestHold(UUID orderId, UUID clientId, UUID cityId, long amountMinor, String currency,
                     OffsetDateTime holdUntil);

    /**
     * Within the caller's transaction: the order no longer needs the money. A hold is released; a hold still being
     * asked for is released as soon as it succeeds (T-23). Nothing happens when there is no hold.
     */
    void releaseHold(UUID orderId, String reason);

    /**
     * Within the caller's transaction: a separate charge of {@code amountMinor} for a tip to the card the order was
     * paid with (ADR 0012); the result comes as {@link #TIP_SETTLED}. VALIDATION_FAILED when the order has no card
     * payment or the currency differs.
     */
    void requestTip(UUID orderId, UUID tipId, long amountMinor, String currency);

    /** Sends what is due for the order now rather than at the worker's next round; outside any transaction. */
    void processNow(UUID orderId);

    Optional<Intent> intent(UUID orderId);
}
