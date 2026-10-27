package taxi.blizz.finance.internal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.UUID;
import org.springframework.stereotype.Component;
import taxi.blizz.finance.Ledger;
import taxi.blizz.finance.Ledger.Account;
import taxi.blizz.finance.Ledger.Line;
import taxi.blizz.platform.OutboxHandler;
import taxi.blizz.platform.OutboxMessage;
import tools.jackson.databind.json.JsonMapper;

/**
 * Money taken from the rider's card after a trip (CardPaymentSettled, ADR 0008): the rider's debt for the fare
 * (posted by {@link TripFarePosting}) is paid by what the provider now holds for the service. What could not be
 * charged stays on RIDER_RECEIVABLE as the rider's debt (REQ-PAY-18; whether it blocks new orders is Q-10).
 */
@Component
class CardPaymentPosting implements OutboxHandler {

    private final Ledger ledger;
    private final JsonMapper json;

    CardPaymentPosting(Ledger ledger, JsonMapper json) {
        this.ledger = ledger;
        this.json = json;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    record Settled(UUID orderId, UUID intentId, UUID payerClientId, long paidMinor, long dueMinor, String currency) {
    }

    @Override
    public String consumerId() {
        return "finance.card-payment-posting";
    }

    @Override
    public boolean supports(String eventType) {
        return "CardPaymentSettled".equals(eventType);
    }

    @Override
    public void handle(OutboxMessage message) {
        Settled s = json.readValue(message.payload(), Settled.class);
        if (s.paidMinor() <= 0) {
            return;
        }
        ledger.post(new Ledger.Posting("card-payment:" + s.intentId(), "CARD_PAYMENT", s.orderId(), s.currency(),
                "Fare paid by card" + (s.paidMinor() < s.dueMinor() ? ", in part" : ""),
                List.of(Line.debit(Account.PROVIDER_CLEARING, null, s.paidMinor()),
                        Line.credit(Account.RIDER_RECEIVABLE, s.payerClientId(), s.paidMinor()))));
    }
}
