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
 * The rest of a fare taken from the card by a staff member's retry (CardDebtPaid, REQ-PAY-14): the rider's debt on
 * RIDER_RECEIVABLE is paid by what the provider now holds for the service. Once per operation.
 */
@Component
class CardDebtPosting implements OutboxHandler {

    private final Ledger ledger;
    private final JsonMapper json;

    CardDebtPosting(Ledger ledger, JsonMapper json) {
        this.ledger = ledger;
        this.json = json;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    record DebtPaid(UUID orderId, UUID operationId, UUID payerClientId, long amountMinor, String currency) {
    }

    @Override
    public String consumerId() {
        return "finance.card-debt-posting";
    }

    @Override
    public boolean supports(String eventType) {
        return "CardDebtPaid".equals(eventType);
    }

    @Override
    public void handle(OutboxMessage message) {
        if (!"PaymentIntent".equals(message.aggregateType())) {
            return;
        }
        DebtPaid d = json.readValue(message.payload(), DebtPaid.class);
        if (d.amountMinor() <= 0) {
            return;
        }
        ledger.post(new Ledger.Posting("card-debt:" + d.operationId(), "CARD_PAYMENT", d.orderId(), d.currency(),
                "Rest of the fare paid by card on a retry",
                List.of(Line.debit(Account.PROVIDER_CLEARING, null, d.amountMinor()),
                        Line.credit(Account.RIDER_RECEIVABLE, d.payerClientId(), d.amountMinor()))));
    }
}
