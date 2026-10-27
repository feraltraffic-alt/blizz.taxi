package taxi.blizz.finance;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 * Double-entry journal (REQ-LED-01..03). Postings are append-only and balanced; a business key is
 * posted at most once, so redelivered events never post twice (AC-16). Errors are corrected by a
 * reversing posting, never by changing a line (REQ-LED-02).
 */
public interface Ledger {

    /**
     * Account types of REQ-LED-03; {@code partyId} names the rider, driver or partner where it applies.
     * {@code SERVICE_FUNDS} is money the service itself received, e.g. a driver paying in his debt.
     */
    enum Account {
        RIDER_RECEIVABLE, DRIVER_PAYABLE, SERVICE_COMMISSION, SERVICE_FUNDS, PROVIDER_CLEARING,
        PARTNER_SETTLEMENT, TIPS_PAYABLE, REFUNDS_PAYABLE, SUSPENSE,
        /** What the service pays itself, e.g. the driver of a follow-up ride the rider gets for free (T-22). */
        SERVICE_EXPENSE,
        /** The rider's virtual account: what the service owes the rider in bonuses and top-ups (ADR 0009). */
        RIDER_WALLET,
        /** What the service spends on promotions, discounts and goodwill top-ups (ADR 0009, ADR 0010). */
        PROMO_EXPENSE,
        /** Bonuses of a rider who deleted the account, now the service's income (owner decision 27.10.2026). */
        WALLET_FORFEITED
    }

    record Line(Account account, UUID partyId, long debitMinor, long creditMinor) {
        public Line {
            Objects.requireNonNull(account, "account");
            if (debitMinor < 0 || creditMinor < 0 || (debitMinor == 0) == (creditMinor == 0)) {
                throw new IllegalArgumentException("A line is either a positive debit or a positive credit");
            }
        }

        public static Line debit(Account account, UUID partyId, long amountMinor) {
            return new Line(account, partyId, amountMinor, 0);
        }

        public static Line credit(Account account, UUID partyId, long amountMinor) {
            return new Line(account, partyId, 0, amountMinor);
        }
    }

    record Posting(String businessKey, String basisType, UUID basisId, String currency, String reason,
                   List<Line> lines) {
        public Posting {
            lines = List.copyOf(lines);
        }
    }

    /** Sums of one account and party in one currency. */
    record Balance(String currency, long debitMinor, long creditMinor) {
    }

    /**
     * Writes the posting in the caller's transaction (or its own). Returns {@code false} without
     * writing when the business key was already posted.
     */
    boolean post(Posting posting);

    /** Per-currency sums of the account for the party ({@code null} party for service accounts). */
    List<Balance> balances(Account account, UUID partyId);
}
