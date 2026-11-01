package taxi.blizz.finance;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * What a rider owes on an order, as the journal says (REQ-PAY-18, issue #140): their RIDER_RECEIVABLE lines with the
 * order as the basis. {@code owedMinor} is what was charged to them there (the fare, a raising correction),
 * {@code paidMinor} what came in against it (card, bonuses, cash, repayments); the remainder is the difference.
 */
public interface RiderDebts {

    record Balance(UUID orderId, String currency, long owedMinor, long paidMinor) {

        public long remainderMinor() {
            return owedMinor - paidMinor;
        }
    }

    /** Every order on which the rider owes something now, newest posting first. */
    List<Balance> owedBy(UUID payerClientId);

    /** The rider's balance on one order; empty when the journal has nothing of theirs on it. */
    Optional<Balance> of(UUID payerClientId, UUID orderId);
}
