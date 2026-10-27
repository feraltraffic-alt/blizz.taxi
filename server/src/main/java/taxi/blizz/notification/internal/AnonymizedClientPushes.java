package taxi.blizz.notification.internal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.platform.OutboxHandler;
import taxi.blizz.platform.OutboxMessage;
import tools.jackson.databind.json.JsonMapper;

/**
 * {@code ClientAnonymized} (REQ-PRV-04, issue #56): the rider's phones get nothing more — their push devices and the
 * notifications not yet sent are deleted. Notifications already sent stay as the delivery record; they carry no
 * personal data. A repeat finds nothing to delete.
 */
@Component
class AnonymizedClientPushes implements OutboxHandler {

    private final JdbcClient jdbc;
    private final JsonMapper json;

    AnonymizedClientPushes(JdbcClient jdbc, JsonMapper json) {
        this.jdbc = jdbc;
        this.json = json;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    record Payload(UUID clientId) {
    }

    @Override
    public String consumerId() {
        return "notification.anonymized-clients";
    }

    @Override
    public boolean supports(String eventType) {
        return "ClientAnonymized".equals(eventType);
    }

    @Override
    public void handle(OutboxMessage message) {
        UUID client = json.readValue(message.payload(), Payload.class).clientId();
        jdbc.sql("delete from push_device where subject_type = 'CLIENT' and subject_id = :client")
                .param("client", client).update();
        jdbc.sql("""
                        delete from notification
                        where recipient_type = 'CLIENT' and recipient_id = :client and state in ('PENDING', 'SENDING')""")
                .param("client", client).update();
    }
}
