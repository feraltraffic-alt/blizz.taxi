package taxi.blizz.geo.internal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.platform.OutboxHandler;
import taxi.blizz.platform.OutboxMessage;
import tools.jackson.databind.json.JsonMapper;

/**
 * {@code ClientAnonymized} (REQ-PRV-04, issue #56): geo forgets the rider. Riders have no saved addresses yet; what
 * geo keeps per rider is the log of address searches behind the rate limit, which is deleted. The service's own
 * addresses are not the rider's and stay. A repeat finds nothing to delete.
 */
@Component
class AnonymizedClientCleanup implements OutboxHandler {

    private final JdbcClient jdbc;
    private final JsonMapper json;

    AnonymizedClientCleanup(JdbcClient jdbc, JsonMapper json) {
        this.jdbc = jdbc;
        this.json = json;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    record Payload(UUID clientId) {
    }

    @Override
    public String consumerId() {
        return "geo.anonymized-clients";
    }

    @Override
    public boolean supports(String eventType) {
        return "ClientAnonymized".equals(eventType);
    }

    @Override
    public void handle(OutboxMessage message) {
        UUID client = json.readValue(message.payload(), Payload.class).clientId();
        jdbc.sql("delete from address_search_request where rider_id = :client").param("client", client).update();
    }
}
