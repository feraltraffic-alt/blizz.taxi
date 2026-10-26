package taxi.blizz.pricing;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * The final fare of a completed trip (REQ-PRC-09..12). It is computed from the quote the order consumed,
 * never from the tariff in force at completion (AC-14), and has a version: version 1 is written at
 * completion; a later correction would be a new version with a delta, never an overwrite.
 */
public interface FinalFares {

    /** Pricing policy of version 1: the agreed price; waiting is recorded but not charged until Q-07. */
    String POLICY_AGREED_PRICE = "M1_AGREED_PRICE";

    /**
     * Server-side facts of the trip. {@code waitedSeconds} is the time from the confirmed arrival to
     * the start (0 when the trip started without an arrival).
     */
    record Facts(UUID orderId, UUID quoteId, long waitedSeconds) {
    }

    /**
     * @param agreedMinor        the price of the quote
     * @param waitingSeconds     waiting beyond nothing, as measured
     * @param freeWaitingSeconds free waiting of the tariff snapshot
     * @param waitingMinor       charged waiting; 0 under {@link #POLICY_AGREED_PRICE}
     */
    record Breakdown(long agreedMinor, long waitingSeconds, long freeWaitingSeconds, long waitingMinor) {
    }

    /**
     * {@code commissionRate} is the snapshot from the quote's tariff terms (REQ-PRC-12);
     * {@code commissionMinor} = round_half_up(amount × rate); {@code driverShareMinor} = amount − commission.
     */
    record FinalFare(UUID id, UUID orderId, int version, UUID quoteId, String policy, long amountMinor,
                     String currency, BigDecimal commissionRate, long commissionMinor, long driverShareMinor,
                     Breakdown breakdown) {
    }

    /**
     * Joins the caller's transaction. Idempotent per order: a repeat returns the stored version 1
     * unchanged (AC-14).
     */
    FinalFare finalizeFare(Facts facts);
}
