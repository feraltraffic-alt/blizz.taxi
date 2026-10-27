package taxi.blizz.operations.internal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.time.Clock;
import java.time.ZoneOffset;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.platform.OutboxHandler;
import taxi.blizz.platform.OutboxMessage;
import tools.jackson.databind.json.JsonMapper;

/**
 * Applies {@code DriverDebtStatusChanged} from finance (REQ-PAY-16): over the debt limit the driver gets no
 * new offers and cannot take orders; nothing happens to a trip in progress. A stale event (lower
 * status_version for the same driver and currency) changes nothing.
 */
@Component
class DriverDebtRestriction implements OutboxHandler {

    private final JdbcClient jdbc;
    private final JsonMapper json;
    private final Clock clock;

    DriverDebtRestriction(JdbcClient jdbc, JsonMapper json, Clock clock) {
        this.jdbc = jdbc;
        this.json = json;
        this.clock = clock;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    record DebtStatus(UUID driverId, String currency, boolean blocked, long statusVersion) {
    }

    @Override
    public String consumerId() {
        return "operations.driver-debt-restriction";
    }

    @Override
    public boolean supports(String eventType) {
        return "DriverDebtStatusChanged".equals(eventType);
    }

    @Override
    public void handle(OutboxMessage message) {
        DebtStatus status = json.readValue(message.payload(), DebtStatus.class);
        jdbc.sql("""
                        insert into driver_restriction (driver_id, kind, source_ref, active, source_version, updated_at)
                        values (:driver, 'DEBT_LIMIT', :currency, :active, :version, :now)
                        on conflict (driver_id, kind, source_ref) do update
                            set active = excluded.active, source_version = excluded.source_version,
                                updated_at = excluded.updated_at
                            where driver_restriction.source_version < excluded.source_version""")
                .param("driver", status.driverId())
                .param("currency", status.currency())
                .param("active", status.blocked())
                .param("version", status.statusVersion())
                .param("now", clock.instant().atOffset(ZoneOffset.UTC))
                .update();
    }
}
