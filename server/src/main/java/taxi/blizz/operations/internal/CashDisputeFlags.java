package taxi.blizz.operations.internal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Map;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.finance.CashDisputes;
import taxi.blizz.operations.DriverRiskFlags;
import taxi.blizz.platform.OutboxHandler;
import taxi.blizz.platform.OutboxMessage;
import tools.jackson.databind.json.JsonMapper;

/**
 * A driver who reported unpaid cash that, as support decided, the rider had paid gets a CASH_DISPUTE risk flag for a
 * person to review (owner decision 28.10.2026, REQ-SEC-11). The flag blocks nothing by itself.
 */
@Component
class CashDisputeFlags implements OutboxHandler {

    private final JdbcDriverRiskFlags flags;
    private final JdbcClient jdbc;
    private final JsonMapper json;

    CashDisputeFlags(JdbcDriverRiskFlags flags, JdbcClient jdbc, JsonMapper json) {
        this.flags = flags;
        this.jdbc = jdbc;
        this.json = json;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    record Decided(UUID orderId, UUID driverId, String decision) {
    }

    @Override
    public String consumerId() {
        return "operations.cash-dispute-flags";
    }

    @Override
    public boolean supports(String eventType) {
        return CashDisputes.DECIDED.equals(eventType);
    }

    @Override
    public void handle(OutboxMessage message) {
        Decided d = json.readValue(message.payload(), Decided.class);
        if (!CashDisputes.Decision.RIDER_PAID.name().equals(d.decision())) {
            return;
        }
        UUID cityId = jdbc.sql("select city_id from ride_order where id = :id").param("id", d.orderId())
                .query(UUID.class).single();
        flags.raiseAutomatic(d.driverId(), cityId, DriverRiskFlags.Kind.CASH_DISPUTE,
                Map.of("order_id", d.orderId().toString(), "decision", d.decision()),
                "CASH_DISPUTE:" + d.orderId(), message.occurredAt());
    }
}
