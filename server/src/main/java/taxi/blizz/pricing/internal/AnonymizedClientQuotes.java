package taxi.blizz.pricing.internal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.platform.OutboxHandler;
import taxi.blizz.platform.OutboxMessage;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.json.JsonMapper;
import tools.jackson.databind.node.ObjectNode;

/**
 * {@code ClientAnonymized} (issue #144, REQ-PRV-06): the rider's quotes keep their price and terms, but the points in
 * their snapshot are rounded to two decimals (about 1 km), as on the rider's orders: a pickup repeated over many
 * quotes is the rider's home. A repeat changes nothing.
 */
@Component
class AnonymizedClientQuotes implements OutboxHandler {

    private final JdbcClient jdbc;
    private final JsonMapper json;

    AnonymizedClientQuotes(JdbcClient jdbc, JsonMapper json) {
        this.jdbc = jdbc;
        this.json = json;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    record Payload(UUID clientId) {
    }

    private record Stored(UUID id, String snapshot) {
    }

    @Override
    public String consumerId() {
        return "pricing.anonymized-clients";
    }

    @Override
    public boolean supports(String eventType) {
        return "ClientAnonymized".equals(eventType);
    }

    @Override
    public void handle(OutboxMessage message) {
        UUID client = json.readValue(message.payload(), Payload.class).clientId();
        for (Stored quote : jdbc.sql("""
                        select id, snapshot::text from quote where owner_type = 'CLIENT' and owner_id = :client""")
                .param("client", client)
                .query((rs, i) -> new Stored(rs.getObject(1, UUID.class), rs.getString(2))).list()) {
            JsonNode snapshot = json.readTree(quote.snapshot());
            if (round(snapshot)) {
                jdbc.sql("update quote set snapshot = cast(:snapshot as jsonb) where id = :id")
                        .param("snapshot", json.writeValueAsString(snapshot)).param("id", quote.id()).update();
            }
        }
    }

    /** Rounds every number named lat or lon below {@code node}; returns whether anything changed. */
    private static boolean round(JsonNode node) {
        boolean changed = false;
        if (node instanceof ObjectNode object) {
            for (String name : object.propertyNames()) {
                JsonNode value = object.get(name);
                if (("lat".equals(name) || "lon".equals(name)) && value.isNumber()) {
                    BigDecimal rounded = value.decimalValue().setScale(2, RoundingMode.HALF_UP);
                    if (rounded.compareTo(value.decimalValue()) != 0) {
                        object.put(name, rounded);
                        changed = true;
                    }
                } else {
                    changed |= round(value);
                }
            }
        } else if (node != null && node.isArray()) {
            for (JsonNode item : node) {
                changed |= round(item);
            }
        }
        return changed;
    }
}
