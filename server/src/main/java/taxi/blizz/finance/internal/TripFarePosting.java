package taxi.blizz.finance.internal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.stereotype.Component;
import taxi.blizz.finance.DriverDebts;
import taxi.blizz.finance.Ledger;
import taxi.blizz.finance.Ledger.Account;
import taxi.blizz.finance.Ledger.Line;
import taxi.blizz.platform.OutboxHandler;
import taxi.blizz.platform.OutboxMessage;
import tools.jackson.databind.json.JsonMapper;

/**
 * Posts a completed trip to the journal (REQ-LED-05), from the TripCompleted payload alone
 * (packages/contracts/events/trip-completed.v1.schema.json).
 *
 * <p>Fare earned, one posting per final fare: the payer owes the fare; the service owes the driver
 * the driver's share and keeps the commission. Cash the driver says he received is a second posting:
 * the driver holds the payer's money, so the payer's debt moves onto the driver. For a cash trip the
 * driver therefore ends up owing the service its commission and nothing is paid out (spec section 17,
 * AC-16). When the driver says the cash was not received, the payer's debt stays open; whether it
 * blocks new orders is Q-10.
 */
@Component
class TripFarePosting implements OutboxHandler {

    static final String CONSUMER = "finance.trip-fare-posting";

    private final Ledger ledger;
    private final DriverDebts debts;
    private final JsonMapper json;

    TripFarePosting(Ledger ledger, DriverDebts debts, JsonMapper json) {
        this.ledger = ledger;
        this.debts = debts;
        this.json = json;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    record TripCompleted(UUID orderId, UUID driverId, UUID payerClientId, String paymentMethod, Boolean cashReceived,
                         UUID finalFareId, Integer finalFareVersion, Long amountMinor, Long commissionMinor,
                         Long driverShareMinor, String currency, Long walletMinor) {
    }

    @Override
    public String consumerId() {
        return CONSUMER;
    }

    @Override
    public boolean supports(String eventType) {
        return "TripCompleted".equals(eventType);
    }

    @Override
    public void handle(OutboxMessage message) {
        TripCompleted trip = json.readValue(message.payload(), TripCompleted.class);
        if (trip.finalFareId() == null || trip.amountMinor() == null || trip.amountMinor() == 0) {
            return;
        }
        List<Line> fare = new ArrayList<>();
        // A follow-up of an interrupted trip is on the service, not the rider (T-22, owner decision 27.10.2026).
        fare.add("SERVICE".equals(trip.paymentMethod())
                ? Line.debit(Account.SERVICE_EXPENSE, null, trip.amountMinor())
                : Line.debit(Account.RIDER_RECEIVABLE, trip.payerClientId(), trip.amountMinor()));
        if (trip.driverShareMinor() > 0) {
            fare.add(Line.credit(Account.DRIVER_PAYABLE, trip.driverId(), trip.driverShareMinor()));
        }
        if (trip.commissionMinor() > 0) {
            fare.add(Line.credit(Account.SERVICE_COMMISSION, null, trip.commissionMinor()));
        }
        ledger.post(new Ledger.Posting("trip-fare:" + trip.finalFareId(), "TRIP_FARE", trip.orderId(),
                trip.currency(), "Fare of a completed trip, final fare v" + trip.finalFareVersion(), fare));
        // Cash, or a card at the driver's own terminal: the money is with the driver, who owes the service its
        // commission from the balance (owner decision 27.10.2026).
        boolean collectedByDriver = "CASH".equals(trip.paymentMethod()) || "TERMINAL".equals(trip.paymentMethod());
        // Bonuses paid part of the fare (ADR 0009): the driver collected only the rest.
        long collected = trip.amountMinor() - (trip.walletMinor() == null ? 0 : trip.walletMinor());
        if (collectedByDriver && Boolean.TRUE.equals(trip.cashReceived()) && collected > 0) {
            boolean cash = "CASH".equals(trip.paymentMethod());
            ledger.post(new Ledger.Posting("trip-cash:" + trip.orderId(), cash ? "CASH_COLLECTED" : "TERMINAL_COLLECTED",
                    trip.orderId(), trip.currency(), cash ? "Cash the driver reported as received"
                            : "Card payment at the driver's own terminal, as the driver reported",
                    List.of(Line.debit(Account.DRIVER_PAYABLE, trip.driverId(), collected),
                            Line.credit(Account.RIDER_RECEIVABLE, trip.payerClientId(), collected))));
        }
        // The driver's debt may have crossed the limit (REQ-PAY-16).
        debts.refresh(trip.driverId(), trip.currency());
    }
}
