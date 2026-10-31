package taxi.blizz.operations.internal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.payments.Chargebacks;
import taxi.blizz.platform.OutboxHandler;
import taxi.blizz.platform.OutboxMessage;
import tools.jackson.databind.json.JsonMapper;

/**
 * {@code ClientAnonymized} (issue #144): the rider's orders are anonymized ({@link OrderErasure}), except an order with
 * an open chargeback, which is held. A repeat changes nothing.
 */
@Component
class AnonymizedClientOrders implements OutboxHandler {

    private final JdbcClient jdbc;
    private final JsonMapper json;
    private final OrderErasure erasure;
    private final Chargebacks chargebacks;

    AnonymizedClientOrders(JdbcClient jdbc, JsonMapper json, OrderErasure erasure, Chargebacks chargebacks) {
        this.jdbc = jdbc;
        this.json = json;
        this.erasure = erasure;
        this.chargebacks = chargebacks;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    record Payload(UUID clientId) {
    }

    @Override
    public String consumerId() {
        return "operations.anonymized-clients";
    }

    @Override
    public boolean supports(String eventType) {
        return "ClientAnonymized".equals(eventType);
    }

    @Override
    public void handle(OutboxMessage message) {
        UUID client = json.readValue(message.payload(), Payload.class).clientId();
        List<UUID> orders = jdbc.sql("select id from ride_order where payer_client_id = :client")
                .param("client", client).query(UUID.class).list();
        Set<UUID> disputed = chargebacks.disputed(orders);
        disputed.forEach(order -> erasure.hold(client, "ORDER", order));
        erasure.anonymize(orders.stream().filter(order -> !disputed.contains(order)).toList(), client);
    }
}
