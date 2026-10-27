package taxi.blizz.payments.internal;

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
 * {@code ClientAnonymized} (REQ-PRV-04, issue #56): the rider's saved cards are removed and their provider tokens
 * dropped, so nothing can be charged to them any more. The card rows stay (masked number only) because the payment
 * history refers to them. A card being added at that moment fails, so a late answer of the provider cannot attach a
 * new card. A repeat changes nothing.
 */
@Component
class AnonymizedClientCards implements OutboxHandler {

    private final JdbcClient jdbc;
    private final JsonMapper json;
    private final Clock clock;

    AnonymizedClientCards(JdbcClient jdbc, JsonMapper json, Clock clock) {
        this.jdbc = jdbc;
        this.json = json;
        this.clock = clock;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    record Payload(UUID clientId) {
    }

    @Override
    public String consumerId() {
        return "payments.anonymized-clients";
    }

    @Override
    public boolean supports(String eventType) {
        return "ClientAnonymized".equals(eventType);
    }

    @Override
    public void handle(OutboxMessage message) {
        UUID client = json.readValue(message.payload(), Payload.class).clientId();
        OffsetDateTime now = OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
        jdbc.sql("""
                        update payment_card
                        set state = 'REMOVED', removed_at = coalesce(removed_at, :now), token = null,
                            version = version + 1
                        where client_id = :client and (state = 'ACTIVE' or token is not null)""")
                .param("client", client).param("now", now).update();
        jdbc.sql("""
                        update card_binding set state = 'FAILED', failure_reason = 'CLIENT_ANONYMIZED', completed_at = :now
                        where client_id = :client and state = 'PENDING'""")
                .param("client", client).param("now", now).update();
    }
}
