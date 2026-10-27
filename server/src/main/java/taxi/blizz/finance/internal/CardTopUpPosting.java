package taxi.blizz.finance.internal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.UUID;
import org.springframework.stereotype.Component;
import taxi.blizz.platform.OutboxHandler;
import taxi.blizz.platform.OutboxMessage;
import tools.jackson.databind.json.JsonMapper;

/**
 * A card top-up the provider confirmed (CardTopUpCompleted from payments): the rider's bonus account (ADR 0009) or
 * the driver's balance (ADR 0010) is credited, once per top-up.
 */
@Component
class CardTopUpPosting implements OutboxHandler {

    private final JdbcRiderWallets wallets;
    private final JdbcDriverBalances balances;
    private final JsonMapper json;

    CardTopUpPosting(JdbcRiderWallets wallets, JdbcDriverBalances balances, JsonMapper json) {
        this.wallets = wallets;
        this.balances = balances;
        this.json = json;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    record Completed(UUID topUpId, String accountType, UUID accountId, long amountMinor, String currency) {
    }

    @Override
    public String consumerId() {
        return "finance.card-top-up-posting";
    }

    @Override
    public boolean supports(String eventType) {
        return "CardTopUpCompleted".equals(eventType);
    }

    @Override
    public void handle(OutboxMessage message) {
        Completed c = json.readValue(message.payload(), Completed.class);
        switch (c.accountType()) {
            case "CLIENT" -> wallets.creditCardTopUp(c.accountId(), c.topUpId(), c.currency(), c.amountMinor());
            case "DRIVER" -> balances.creditCardTopUp(c.accountId(), c.topUpId(), c.currency(), c.amountMinor());
            default -> throw new IllegalStateException("Unknown account type " + c.accountType());
        }
    }
}
