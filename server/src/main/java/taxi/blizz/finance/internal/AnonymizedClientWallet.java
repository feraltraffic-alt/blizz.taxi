package taxi.blizz.finance.internal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.UUID;
import org.springframework.stereotype.Component;
import taxi.blizz.platform.OutboxHandler;
import taxi.blizz.platform.OutboxMessage;
import tools.jackson.databind.json.JsonMapper;

/**
 * {@code ClientAnonymized} (issue #56): the rider deleted the account, so the bonuses burn (owner decision
 * 27.10.2026) — Dt RIDER_WALLET, Kt WALLET_FORFEITED. The journal's business key makes a repeat post nothing; every
 * earlier line of the rider stays as it is (REQ-PRV-04, AC-24).
 */
@Component
class AnonymizedClientWallet implements OutboxHandler {

    private final JdbcRiderWallets wallets;
    private final JsonMapper json;

    AnonymizedClientWallet(JdbcRiderWallets wallets, JsonMapper json) {
        this.wallets = wallets;
        this.json = json;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    record Payload(UUID clientId) {
    }

    @Override
    public String consumerId() {
        return "finance.anonymized-clients";
    }

    @Override
    public boolean supports(String eventType) {
        return "ClientAnonymized".equals(eventType);
    }

    @Override
    public void handle(OutboxMessage message) {
        wallets.forfeitAll(json.readValue(message.payload(), Payload.class).clientId());
    }
}
