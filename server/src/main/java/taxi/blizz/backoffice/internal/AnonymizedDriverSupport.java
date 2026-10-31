package taxi.blizz.backoffice.internal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.files.FileService;
import taxi.blizz.platform.OutboxHandler;
import taxi.blizz.platform.OutboxMessage;
import tools.jackson.databind.json.JsonMapper;

/**
 * {@code DriverAnonymized} (issue #144): the support cases the driver opened lose their texts and files, as a rider's
 * do ({@link AnonymizedClientSupport}). A repeat changes nothing.
 */
@Component
class AnonymizedDriverSupport implements OutboxHandler {

    private final JdbcClient jdbc;
    private final JsonMapper json;
    private final FileService files;

    AnonymizedDriverSupport(JdbcClient jdbc, JsonMapper json, FileService files) {
        this.jdbc = jdbc;
        this.json = json;
        this.files = files;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    record Payload(UUID driverId) {
    }

    @Override
    public String consumerId() {
        return "backoffice.anonymized-drivers";
    }

    @Override
    public boolean supports(String eventType) {
        return "DriverAnonymized".equals(eventType);
    }

    @Override
    public void handle(OutboxMessage message) {
        AnonymizedClientSupport.erase(jdbc, files, "DRIVER", json.readValue(message.payload(), Payload.class)
                .driverId());
    }
}
