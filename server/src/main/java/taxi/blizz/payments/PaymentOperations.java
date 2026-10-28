package taxi.blizz.payments;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import taxi.blizz.platform.Actor;

/**
 * The card operations of an order for staff, and a manual retry of a charge (REQ-PAY-14): only of a charge the
 * provider has declined for sure — never of one whose result is unknown or still coming, which the system keeps
 * asking about — with {@link #RETRY_PERMISSION}, a reason, audited, the initiator kept on the new operation. A
 * retried charge that succeeds pays the rider's debt: {@link #DEBT_PAID}.
 */
public interface PaymentOperations {

    String RETRY_PERMISSION = "payments.retry";
    /**
     * A retried charge took the rest of a fare: {@code order_id}, {@code intent_id}, {@code operation_id},
     * {@code amount_minor}, {@code currency}, {@code payer_client_id}, {@code paid_minor} and {@code due_minor}.
     */
    String DEBT_PAID = "CardDebtPaid";

    record Operation(UUID id, UUID orderId, String type, String state, long amountMinor, String currency,
                     String providerStatus, String reason, UUID retryOf, UUID initiatedBy, OffsetDateTime createdAt) {
    }

    /** Oldest first; needs {@link #RETRY_PERMISSION}. NOT_FOUND when the order has no card payment. */
    List<Operation> ofOrder(Actor staff, UUID orderId);

    /**
     * A new charge of the same amount to the same saved card. STATE_CONFLICT unless the operation is a CHARGE the
     * provider DECLINED that has not been retried yet; PAYMENT_UNKNOWN while its result is not final.
     */
    Operation retry(Actor staff, UUID commandId, UUID operationId, String reason);
}
