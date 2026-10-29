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
 * Chargebacks in the journal (REQ-PAY-23, issue #103; accounts chosen by the lead). Recorded: the bank took the money
 * out of the provider's clearing account and the rider owes it again — Dr RIDER_RECEIVABLE, Cr PROVIDER_CLEARING.
 * Won: the exact reverse. Lost: nothing; the debt stays with the rider and the driver's share is not touched. Each
 * posts once per chargeback, whatever the redeliveries.
 */
@Component
class ChargebackPosting implements OutboxHandler {

    private final Ledger ledger;
    private final JsonMapper json;

    ChargebackPosting(Ledger ledger, JsonMapper json) {
        this.ledger = ledger;
        this.json = json;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    record Chargeback(UUID chargebackId, UUID orderId, UUID payerClientId, long amountMinor, String currency,
                      String outcome) {
    }

    @Override
    public String consumerId() {
        return "finance.chargeback-posting";
    }

    @Override
    public boolean supports(String eventType) {
        return "CardChargebackRecorded".equals(eventType) || "CardChargebackResolved".equals(eventType);
    }

    @Override
    public void handle(OutboxMessage message) {
        Chargeback c = json.readValue(message.payload(), Chargeback.class);
        if ("CardChargebackRecorded".equals(message.type())) {
            ledger.post(new Ledger.Posting("chargeback:" + c.chargebackId(), "CHARGEBACK", c.orderId(), c.currency(),
                    "Chargeback of a card payment",
                    List.of(Line.debit(Account.RIDER_RECEIVABLE, c.payerClientId(), c.amountMinor()),
                            Line.credit(Account.PROVIDER_CLEARING, null, c.amountMinor()))));
        } else if ("WON".equals(c.outcome())) {
            ledger.post(new Ledger.Posting("chargeback-won:" + c.chargebackId(), "CHARGEBACK", c.orderId(),
                    c.currency(), "Chargeback won back",
                    List.of(Line.debit(Account.PROVIDER_CLEARING, null, c.amountMinor()),
                            Line.credit(Account.RIDER_RECEIVABLE, c.payerClientId(), c.amountMinor()))));
        }
    }
}
