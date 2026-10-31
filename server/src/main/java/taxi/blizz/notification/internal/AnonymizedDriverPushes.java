package taxi.blizz.notification.internal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.platform.OutboxHandler;
import taxi.blizz.platform.OutboxMessage;
import tools.jackson.databind.json.JsonMapper;

/**
 * {@code DriverAnonymized} (issue #144): as {@link AnonymizedClientPushes} for riders — the driver's push devices and
 * unsent notifications are deleted, the sent ones keep their template, channel, state and times without their texts
 * and data. A repeat changes nothing.
 */
@Component
class AnonymizedDriverPushes implements OutboxHandler {

    private final JdbcClient jdbc;
    private final JsonMapper json;

    AnonymizedDriverPushes(JdbcClient jdbc, JsonMapper json) {
        this.jdbc = jdbc;
        this.json = json;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    record Payload(UUID driverId) {
    }

    @Override
    public String consumerId() {
        return "notification.anonymized-drivers";
    }

    @Override
    public boolean supports(String eventType) {
        return "DriverAnonymized".equals(eventType);
    }

    @Override
    public void handle(OutboxMessage message) {
        UUID driver = json.readValue(message.payload(), Payload.class).driverId();
        jdbc.sql("delete from push_device where subject_type = 'DRIVER' and subject_id = :driver")
                .param("driver", driver).update();
        jdbc.sql("""
                        delete from notification
                        where recipient_type = 'DRIVER' and recipient_id = :driver
                          and state in ('PENDING', 'SENDING')""")
                .param("driver", driver).update();
        jdbc.sql("""
                        update notification set title = :deleted, body = :deleted, data = '{}'::jsonb
                        where recipient_type = 'DRIVER' and recipient_id = :driver
                          and (title <> :deleted or body <> :deleted or data <> '{}'::jsonb)""")
                .param("deleted", "[deleted]").param("driver", driver).update();
    }
}
