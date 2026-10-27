package taxi.blizz.finance.internal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
 * A tip the provider took from the rider's card (TipPaid with method CARD, ADR 0012): the whole tip goes to the
 * driver's balance, no commission. A tip paid with bonuses is posted when it is left ({@code RiderWallets.payTip});
 * cash and terminal tips never pass through the service.
 */
@Component
class TipPosting implements OutboxHandler {

    private final Ledger ledger;
    private final DriverDebts debts;
    private final JsonMapper json;

    TipPosting(Ledger ledger, DriverDebts debts, JsonMapper json) {
        this.ledger = ledger;
        this.debts = debts;
        this.json = json;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    record TipPaid(UUID tipId, UUID orderId, UUID driverId, long amountMinor, String currency, String method) {
    }

    @Override
    public String consumerId() {
        return "finance.tip-posting";
    }

    @Override
    public boolean supports(String eventType) {
        return "TipPaid".equals(eventType);
    }

    @Override
    public void handle(OutboxMessage message) {
        TipPaid tip = json.readValue(message.payload(), TipPaid.class);
        if (!"CARD".equals(tip.method())) {
            return;
        }
        boolean posted = ledger.post(new Ledger.Posting("tip:" + tip.tipId(), "TIP", tip.orderId(), tip.currency(),
                "Tip for the driver", List.of(Line.debit(Account.PROVIDER_CLEARING, null, tip.amountMinor()),
                        Line.credit(Account.DRIVER_PAYABLE, tip.driverId(), tip.amountMinor()))));
        if (posted) {
            debts.refresh(tip.driverId(), tip.currency());
        }
    }
}
