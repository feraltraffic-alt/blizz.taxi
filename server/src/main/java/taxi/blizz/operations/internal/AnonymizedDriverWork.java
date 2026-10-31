package taxi.blizz.operations.internal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.platform.OutboxHandler;
import taxi.blizz.platform.OutboxMessage;
import tools.jackson.databind.json.JsonMapper;

/**
 * {@code DriverAnonymized} (issue #144): a shift still open ends (the driver had no work left: the deletion waits for
 * it), and what the driver wrote becomes "[deleted]" — chat messages and rating comments. What the riders wrote stays
 * theirs; trips, assignments and their times stay with the driver id. A repeat changes nothing.
 */
@Component
class AnonymizedDriverWork implements OutboxHandler {

    private final JdbcClient jdbc;
    private final JsonMapper json;
    private final Clock clock;

    AnonymizedDriverWork(JdbcClient jdbc, JsonMapper json, Clock clock) {
        this.jdbc = jdbc;
        this.json = json;
        this.clock = clock;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    record Payload(UUID driverId) {
    }

    @Override
    public String consumerId() {
        return "operations.anonymized-drivers";
    }

    @Override
    public boolean supports(String eventType) {
        return "DriverAnonymized".equals(eventType);
    }

    @Override
    public void handle(OutboxMessage message) {
        UUID driver = json.readValue(message.payload(), Payload.class).driverId();
        OffsetDateTime now = OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
        jdbc.sql("""
                        update work_session set state = 'CLOSED', closed_at = :now, version = version + 1
                        where driver_id = :driver and state in ('OPEN', 'CLOSING')""")
                .param("now", now).param("driver", driver).update();
        jdbc.sql("""
                        update order_message set body = :deleted
                        where sender_role = 'DRIVER' and sender_id = :driver and body <> :deleted""")
                .param("deleted", OrderErasure.DELETED).param("driver", driver).update();
        jdbc.sql("""
                        update rating set comment = :deleted
                        where author_type = 'DRIVER' and author_id = :driver
                          and comment is not null and comment <> :deleted""")
                .param("deleted", OrderErasure.DELETED).param("driver", driver).update();
    }
}
