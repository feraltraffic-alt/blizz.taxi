package taxi.blizz.operations.internal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.UUID;
import org.springframework.stereotype.Component;
import taxi.blizz.payments.CardPayments;
import taxi.blizz.platform.OutboxHandler;
import taxi.blizz.platform.OutboxMessage;
import tools.jackson.databind.json.JsonMapper;

/** The bank's answer to a tip charged to the card (CardTipSettled, ADR 0012): the tip is paid or failed. */
@Component
class CardTipOutcome implements OutboxHandler {

    private final JdbcTips tips;
    private final JsonMapper json;

    CardTipOutcome(JdbcTips tips, JsonMapper json) {
        this.tips = tips;
        this.json = json;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    record Settled(UUID tipId, UUID orderId, boolean paid, String reason) {
    }

    @Override
    public String consumerId() {
        return "operations.card-tip-outcome";
    }

    @Override
    public boolean supports(String eventType) {
        return CardPayments.TIP_SETTLED.equals(eventType);
    }

    @Override
    public void handle(OutboxMessage message) {
        Settled s = json.readValue(message.payload(), Settled.class);
        tips.settleCard(s.tipId(), s.paid(), s.reason());
    }
}
