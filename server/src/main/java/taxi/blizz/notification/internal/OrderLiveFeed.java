package taxi.blizz.notification.internal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.springframework.stereotype.Component;
import taxi.blizz.operations.Orders;
import taxi.blizz.platform.OutboxHandler;
import taxi.blizz.platform.OutboxMessage;
import tools.jackson.databind.json.JsonMapper;

/**
 * Every change of an order reaches the rider and the driver taking part, and a driver offered the order (REQ-NTF-04).
 * The message names the change and the order's version only — no phones, places or prices; the app reads the
 * order's snapshot over REST, and on a gap in versions it simply reads it again (REQ-NTF-01).
 */
@Component
class OrderLiveFeed implements OutboxHandler {

    private final Orders orders;
    private final LiveBus bus;
    private final JsonMapper json;

    OrderLiveFeed(Orders orders, LiveBus bus, JsonMapper json) {
        this.orders = orders;
        this.bus = bus;
        this.json = json;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    record Mentions(UUID driverId) {
    }

    @Override
    public String consumerId() {
        return "notification.order-live-feed";
    }

    @Override
    public boolean supports(String eventType) {
        return true; // filtered by aggregate below
    }

    @Override
    public void handle(OutboxMessage message) {
        if (!"Order".equals(message.aggregateType())) {
            return;
        }
        Set<UUID> to = new LinkedHashSet<>();
        orders.participants(message.aggregateId()).ifPresent(p -> {
            if (p.payerClientId() != null) {
                to.add(p.payerClientId());
            }
            if (p.driverId() != null) {
                to.add(p.driverId());
            }
        });
        Mentions mentions = json.readValue(message.payload(), Mentions.class);
        if (mentions.driverId() != null) {
            to.add(mentions.driverId()); // offered, withdrawn, interrupted
        }
        Map<String, Object> envelope = new LinkedHashMap<>();
        envelope.put("event_id", message.eventId().toString());
        envelope.put("type", message.type());
        envelope.put("schema_version", message.schemaVersion());
        envelope.put("aggregate_type", message.aggregateType());
        envelope.put("aggregate_id", message.aggregateId().toString());
        envelope.put("aggregate_version", message.aggregateVersion());
        envelope.put("occurred_at", message.occurredAt() == null ? null : message.occurredAt().toString());
        envelope.put("correlation_id", message.correlationId() == null ? null : message.correlationId().toString());
        envelope.put("payload", Map.of());
        bus.publish(to, envelope);
    }
}
