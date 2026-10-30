package taxi.blizz.pricing;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * The final fare of a completed trip (REQ-PRC-09..12). It is computed from the quote the order consumed,
 * never from the tariff in force at completion (AC-14), and has a version: version 1 is written at
 * completion; a later correction would be a new version with a delta, never an overwrite.
 */
public interface FinalFares {

    /** Version 1 policy: the agreed price plus paid waiting by the rule of the quote's tariff. */
    String POLICY_AGREED_PLUS_WAITING = "M1_AGREED_PLUS_WAITING";

    /** For a quote made before the waiting rule existed: the agreed price only. */
    String POLICY_AGREED_PRICE = "M1_AGREED_PRICE";

    /**
     * Server-side facts of the trip. {@code waitedSeconds} is the time from the confirmed arrival to
     * the start (0 when the trip started without an arrival).
     */
    record Facts(UUID orderId, UUID quoteId, long waitedSeconds) {
    }

    /**
     * @param agreedMinor           the price of the quote
     * @param waitingSeconds        measured waiting, arrival to start
     * @param freeWaitingSeconds    free waiting of the tariff snapshot
     * @param chargedWaitingSeconds waiting charged after free time, steps and rounding
     * @param waitingMinor          charge for the waiting; 0 under {@link #POLICY_AGREED_PRICE}
     */
    record Breakdown(long agreedMinor, long waitingSeconds, long freeWaitingSeconds, long chargedWaitingSeconds,
                     long waitingMinor) {
    }

    /**
     * {@code amountMinor} = agreed + waiting. {@code commissionRate} is the snapshot from the quote's tariff
     * terms (REQ-PRC-12); {@code commissionMinor} = round_half_up(amount × rate), so waiting carries
     * commission too; {@code driverShareMinor} = amount − commission.
     */
    record FinalFare(UUID id, UUID orderId, int version, UUID quoteId, String policy, long amountMinor,
                     String currency, BigDecimal commissionRate, long commissionMinor, long driverShareMinor,
                     Breakdown breakdown) {
    }

    /** The service's commission and the driver's share of an amount. */
    record Split(long commissionMinor, long driverShareMinor) {
    }

    /**
     * Splits {@code amountMinor} by the commission rate of the quote's tariff snapshot exactly as
     * {@link #finalizeFare} does: commission = round_half_up(amount × rate), share = amount − commission. The offer's
     * expected earnings use it, so the estimate and the settlement cannot drift apart (issue #143).
     */
    Split split(UUID quoteId, long amountMinor);

    /**
     * Joins the caller's transaction. Idempotent per order: a repeat returns the stored version 1
     * unchanged (AC-14).
     */
    FinalFare finalizeFare(Facts facts);

    /** The order's final fare when it has one, e.g. for a chargeback's evidence (REQ-PAY-23). */
    java.util.Optional<FinalFare> ofOrder(UUID orderId);
}
