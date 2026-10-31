package taxi.blizz.identity.internal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.platform.OutboxHandler;
import taxi.blizz.platform.OutboxMessage;
import tools.jackson.databind.json.JsonMapper;

/**
 * {@code DriverAnonymized} (issue #144): copies of a deleted driver's data go with the account, as a rider's do in
 * {@code JdbcClientDeletions}. A repeat finds nothing to delete.
 */
@Component
class AnonymizedDriverExports implements OutboxHandler {

    private final JdbcClient jdbc;
    private final JsonMapper json;

    AnonymizedDriverExports(JdbcClient jdbc, JsonMapper json) {
        this.jdbc = jdbc;
        this.json = json;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    record Payload(UUID driverId) {
    }

    @Override
    public String consumerId() {
        return "identity.anonymized-driver-exports";
    }

    @Override
    public boolean supports(String eventType) {
        return "DriverAnonymized".equals(eventType);
    }

    @Override
    public void handle(OutboxMessage message) {
        jdbc.sql("delete from personal_data_export where driver_id = :id")
                .param("id", json.readValue(message.payload(), Payload.class).driverId()).update();
    }
}
