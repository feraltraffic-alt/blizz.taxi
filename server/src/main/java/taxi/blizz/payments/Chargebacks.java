package taxi.blizz.payments;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import taxi.blizz.platform.Actor;

/**
 * Chargebacks of card payments, recorded by hand (REQ-PAY-23, issue #103): the provider's risk managers handle them
 * and no API tells us. Finance records what the bank took back from an order's card payment and, later, whether it
 * came back ({@link Outcome#WON}) or not ({@link Outcome#LOST}). Each needs {@link PaymentOperations#RETRY_PERMISSION}
 * for the order's city, which the caller passes because payments does not know cities. Both are idempotent and
 * audited; {@link #RECORDED} and {@link #RESOLVED} go out with the change.
 */
public interface Chargebacks {

    /**
     * {@code chargeback_id}, {@code order_id}, {@code intent_id}, {@code payer_client_id}, {@code amount_minor},
     * {@code currency}: the money left the provider's clearing account and the rider owes it again.
     */
    String RECORDED = "CardChargebackRecorded";
    /** As {@link #RECORDED} without the intent, plus {@code outcome}: WON returns the money, LOST leaves the debt. */
    String RESOLVED = "CardChargebackResolved";

    enum State { OPEN, WON, LOST }

    enum Outcome { WON, LOST }

    record Chargeback(UUID id, UUID orderId, long amountMinor, String currency, String bankReason,
                      LocalDate receivedOn, State state, String resolutionReason, OffsetDateTime createdAt,
                      OffsetDateTime resolvedAt, long version) {
    }

    /** {@code bankReason}: the bank's reason as written; {@code receivedOn}: when the bank's notice came. */
    record NewChargeback(long amountMinor, String currency, String bankReason, LocalDate receivedOn) {
    }

    /**
     * Records a chargeback of the order. CHARGEBACK_NOT_ALLOWED (422) when it is larger than what is left of the
     * order's card payment, or the order has none; VALIDATION_FAILED for a bad amount, currency, reason or date.
     */
    Chargeback record(Actor staff, UUID commandId, UUID orderId, UUID cityId, NewChargeback chargeback);

    /** Once: STATE_CONFLICT (409) when already resolved, VERSION_CONFLICT (409) for a stale version. */
    Chargeback resolve(Actor staff, UUID commandId, UUID orderId, UUID cityId, UUID chargebackId,
                       long expectedVersion, Outcome outcome, String reason);

    /** The order's chargebacks, oldest first. */
    List<Chargeback> ofOrder(Actor staff, UUID orderId, UUID cityId);

    /**
     * Of these orders, the ones with a chargeback still OPEN: a deleted rider's data on them is held until it is decided
     * (issue #144). No staff check: a read for another module's privacy rules, never shown as such.
     */
    java.util.Set<UUID> disputed(java.util.Collection<UUID> orderIds);
}
