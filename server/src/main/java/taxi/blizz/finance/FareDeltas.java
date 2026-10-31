package taxi.blizz.finance;

import java.util.UUID;

/**
 * The journal side of a final-fare correction (issue #142, REQ-PRC-10): the difference between two versions, posted
 * once per correction. A higher fare is a debt of the payer (RIDER_RECEIVABLE; the service's expense for a trip it
 * pays itself), never a second capture; a lower one first reduces what the payer still owes on the order and the rest
 * is a refund obligation (REFUNDS_PAYABLE) until the refund flow pays it (#140, Q-06). The driver's share and the
 * commission move by their own differences.
 */
public interface FareDeltas {

    /** {@code *Minor}: new minus old, each signed; {@code paidByService}: a trip the service pays (T-22). */
    record Delta(UUID orderId, UUID correctionId, UUID payerClientId, UUID driverId, boolean paidByService,
                 String currency, long amountMinor, long commissionMinor, long driverShareMinor) {
    }

    /**
     * In the caller's transaction; returns the refund obligation this correction created (0 when none). The order's
     * fare must already be posted, otherwise STATE_CONFLICT. A repeat of the same correction posts nothing more.
     */
    long post(Delta delta);

    /** What the service owes the payer back on the order after corrections; 0 when nothing. */
    long refundObligation(UUID orderId);
}
