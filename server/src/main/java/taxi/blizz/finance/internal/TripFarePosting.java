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
 * blocks new orders is Q-10. How much of the driver's share for the unpaid part is credited then is the service's
 * setting (cash_not_received, owner decision 28.10.2026); the rest waits in SUSPENSE, under the driver, for support.
 */
@Component
class TripFarePosting implements OutboxHandler {

    static final String CONSUMER = "finance.trip-fare-posting";

    private final Ledger ledger;
    private final DriverDebts debts;
    private final JsonMapper json;
    private final taxi.blizz.configuration.ServiceSettings settings;
    private final JdbcCashDisputes disputes;

    TripFarePosting(Ledger ledger, DriverDebts debts, JsonMapper json,
                    taxi.blizz.configuration.ServiceSettings settings, JdbcCashDisputes disputes) {
        this.disputes = disputes;
        this.ledger = ledger;
        this.debts = debts;
        this.json = json;
        this.settings = settings;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    record TripCompleted(UUID orderId, UUID driverId, UUID payerClientId, String paymentMethod, Boolean cashReceived,
                         UUID finalFareId, Integer finalFareVersion, Long amountMinor, Long commissionMinor,
                         Long driverShareMinor, String currency, Long walletMinor, Long discountMinor) {
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
        long held = held(trip);
        if (trip.driverShareMinor() - held > 0) {
            fare.add(Line.credit(Account.DRIVER_PAYABLE, trip.driverId(), trip.driverShareMinor() - held));
        }
        if (held > 0) {
            fare.add(Line.credit(Account.SUSPENSE, trip.driverId(), held));
        }
        if (trip.commissionMinor() > 0) {
            fare.add(Line.credit(Account.SERVICE_COMMISSION, null, trip.commissionMinor()));
        }
        ledger.post(new Ledger.Posting("trip-fare:" + trip.finalFareId(), "TRIP_FARE", trip.orderId(),
                trip.currency(), "Fare of a completed trip, final fare v" + trip.finalFareVersion(), fare));
        if (unpaidByDriverReport(trip) > 0) {
            disputes.open(trip.orderId(), trip.driverId(), trip.payerClientId(), trip.currency(), held,
                    unpaidByDriverReport(trip));
        }
        // Cash, or a card at the driver's own terminal: the money is with the driver, who owes the service its
        // commission from the balance (owner decision 27.10.2026).
        boolean collectedByDriver = "CASH".equals(trip.paymentMethod()) || "TERMINAL".equals(trip.paymentMethod());
        // A promotion's discount is the service's expense; the driver's share stays as of the full fare (ADR 0009).
        long discount = trip.discountMinor() == null ? 0 : trip.discountMinor();
        if (discount > 0 && !"SERVICE".equals(trip.paymentMethod())) {
            ledger.post(new Ledger.Posting("trip-discount:" + trip.orderId(), "PROMOTION_DISCOUNT", trip.orderId(),
                    trip.currency(), "Discount of promotions",
                    List.of(Line.debit(Account.PROMO_EXPENSE, null, discount),
                            Line.credit(Account.RIDER_RECEIVABLE, trip.payerClientId(), discount))));
        }
        // Bonuses and the discount paid part of the fare (ADR 0009): the driver collected only the rest.
        long collected = trip.amountMinor() - (trip.walletMinor() == null ? 0 : trip.walletMinor()) - discount;
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

    /**
     * The part of the driver's share held back when the driver reports the money was not paid: the share of the
     * part the driver was to collect (bonuses and discounts were paid anyway), less what the setting credits.
     */
    private long held(TripCompleted trip) {
        boolean collectedByDriver = "CASH".equals(trip.paymentMethod()) || "TERMINAL".equals(trip.paymentMethod());
        if (!collectedByDriver || !Boolean.FALSE.equals(trip.cashReceived()) || trip.driverShareMinor() <= 0) {
            return 0;
        }
        long amount = trip.amountMinor();
        long unpaid = unpaidByDriverReport(trip);
        if (unpaid <= 0) {
            return 0;
        }
        long shareOfUnpaid = trip.driverShareMinor() * unpaid / amount;
        // The rule of the trip's taxi service, the driver's own (ADR 0016).
        var rule = settings.of(new taxi.blizz.platform.Actor(taxi.blizz.platform.SubjectType.DRIVER, trip.driverId()))
                .settings().cashNotReceived();
        return shareOfUnpaid - rule.credited(shareOfUnpaid);
    }

    /** What the driver says was not paid: the part the driver was to collect, when reported as not received. */
    private static long unpaidByDriverReport(TripCompleted trip) {
        boolean collectedByDriver = "CASH".equals(trip.paymentMethod()) || "TERMINAL".equals(trip.paymentMethod());
        if (!collectedByDriver || !Boolean.FALSE.equals(trip.cashReceived())) {
            return 0;
        }
        return Math.max(0, trip.amountMinor() - (trip.walletMinor() == null ? 0 : trip.walletMinor())
                - (trip.discountMinor() == null ? 0 : trip.discountMinor()));
    }
}
