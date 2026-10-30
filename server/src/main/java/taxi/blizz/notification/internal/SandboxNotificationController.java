package taxi.blizz.notification.internal;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tools.jackson.databind.json.JsonMapper;

/**
 * {@code GET /sandbox/v1/notifications?order_id=…}: every push and SMS row of an order and what became of it — SENT,
 * EXPIRED, FAILED, or SUPERSEDED when what it announced was no longer current (issue #143). Sandbox only, no auth;
 * no text and no phone, only the template, the recipient's id and the data the push carried.
 */
@RestController
@Profile("sandbox")
class SandboxNotificationController {

    record Row(String recipientType, UUID recipientId, String channel, String template, String state,
               Map<String, String> data, OffsetDateTime createdAt) {
    }

    private final JdbcClient jdbc;
    private final JsonMapper json;

    SandboxNotificationController(JdbcClient jdbc, JsonMapper json) {
        this.jdbc = jdbc;
        this.json = json;
    }

    @GetMapping("/sandbox/v1/notifications")
    @SuppressWarnings("unchecked")
    List<Row> notifications(@RequestParam("order_id") UUID orderId) {
        return jdbc.sql("""
                        select recipient_type, recipient_id, channel, template, state, data::text as data, created_at
                        from notification where data ->> 'order_id' = :order order by created_at, id limit 100""")
                .param("order", orderId.toString())
                .query((rs, i) -> new Row(rs.getString("recipient_type"), rs.getObject("recipient_id", UUID.class),
                        rs.getString("channel"), rs.getString("template"), rs.getString("state"),
                        json.readValue(rs.getString("data"), Map.class),
                        rs.getObject("created_at", OffsetDateTime.class)))
                .list();
    }
}
