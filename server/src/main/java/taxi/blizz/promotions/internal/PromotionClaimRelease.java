package taxi.blizz.promotions.internal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Set;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.platform.OutboxHandler;
import taxi.blizz.platform.OutboxMessage;
import tools.jackson.databind.json.JsonMapper;

/**
 * An order that ends without a trip gives back the "every N-th trip" cycles it claimed (#112): the rider's next order
 * can have them. A completed trip keeps its claim, so the cycle is never given twice.
 */
@Component
class PromotionClaimRelease implements OutboxHandler {

    /** Every way an order ends without a completed trip. */
    static final Set<String> ENDED_WITHOUT_TRIP = Set.of("OrderCancelled", "TripInterrupted", "PassengerNoShow",
            "OrderUnfulfilled", "CardHoldDeclined");

    private final JdbcClient jdbc;
    private final JsonMapper json;

    PromotionClaimRelease(JdbcClient jdbc, JsonMapper json) {
        this.jdbc = jdbc;
        this.json = json;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    record Ended(UUID orderId) {
    }

    @Override
    public String consumerId() {
        return "promotions.nth-claim-release";
    }

    @Override
    public boolean supports(String eventType) {
        return ENDED_WITHOUT_TRIP.contains(eventType);
    }

    @Override
    public void handle(OutboxMessage message) {
        Ended ended = json.readValue(message.payload(), Ended.class);
        UUID orderId = ended.orderId() != null ? ended.orderId() : message.aggregateId();
        jdbc.sql("delete from promotion_nth_claim where order_id = :order").param("order", orderId).update();
    }
}
