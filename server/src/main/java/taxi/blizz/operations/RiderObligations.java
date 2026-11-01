package taxi.blizz.operations;

import java.util.List;
import java.util.UUID;
import taxi.blizz.payments.CardTopUps;
import taxi.blizz.platform.Actor;

/**
 * A rider's obligations and their repayment by card (REQ-PAY-18, issue #140). An obligation is an order of the rider
 * whose payment has ended (paid, partly paid, cash or terminal reported) and on which the journal still has a
 * remainder for them. It is paid on the provider's page, like a card top-up; one page at a time per obligation.
 * Owed above the service's rider_debts limit for the currency, the rider gets no new orders until they pay
 * (owner decision 01.11.2026, ADR 0014, Q-10): 403 RIDER_HAS_DEBT.
 */
public interface RiderObligations {

    record Obligation(UUID orderId, String currency, long owedMinor, long paidMinor, long remainderMinor,
                      List<CardTopUps.TopUp> repayments) {
    }

    /** The rider's obligations with a remainder, newest order first. */
    List<Obligation> list(Actor rider);

    /**
     * Opens the payment page for {@code amountMinor} of the remainder (the whole remainder when null). NOT_FOUND when
     * the order is not the rider's or nothing is owed on it; STATE_CONFLICT while another page of it is open;
     * VALIDATION_FAILED above the remainder or outside the card limits.
     */
    CardTopUps.TopUp startRepayment(Actor rider, UUID commandId, UUID orderId, Long amountMinor);

    /** One of the rider's repayments. */
    CardTopUps.TopUp payment(Actor rider, UUID paymentId);
}
