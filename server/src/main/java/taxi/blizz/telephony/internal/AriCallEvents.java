package taxi.blizz.telephony.internal;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import tools.jackson.databind.json.JsonMapper;

/**
 * Turns an ARI event (the JSON Asterisk sends on the events WebSocket) into the call log: {@code ChannelCreated} →
 * ringing, {@code ChannelStateChange} to {@code Up} → answered, {@code ChannelDestroyed} → ended. A leg of a call
 * (a {@code linkedid} that is not the channel's own id) counts only when it goes Up: an operator's phone answering an
 * incoming call, or the other side picking up an outgoing one (issue #67). Other events are ignored. Never throws: a
 * bad event is logged without its contents, so it cannot stop the stream.
 */
@Component
class AriCallEvents {

    private static final Logger log = LoggerFactory.getLogger(AriCallEvents.class);
    /** ARI writes "2026-10-27T18:00:00.000+0000". */
    private static final DateTimeFormatter ARI_TIME = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ");

    private final JdbcCalls calls;
    private final JsonMapper json;

    AriCallEvents(JdbcCalls calls, JsonMapper json) {
        this.calls = calls;
        this.json = json;
    }

    @SuppressWarnings("unchecked")
    void handle(String event) {
        try {
            Map<String, Object> e = json.readValue(event, Map.class);
            Object type = e.get("type");
            if (!(e.get("channel") instanceof Map<?, ?> rawChannel)) {
                return;
            }
            Map<String, Object> channel = (Map<String, Object>) rawChannel;
            String id = text(channel.get("id"));
            Object linked = channel.get("linkedid");
            if (id == null) {
                return;
            }
            OffsetDateTime at = time(text(e.get("timestamp")));
            if (linked != null && !id.equals(text(linked))) {
                if ("ChannelStateChange".equals(type) && "Up".equalsIgnoreCase(text(channel.get("state")))) {
                    calls.legAnswered(text(linked), text(channel.get("name")), at);
                }
                return;
            }
            switch (String.valueOf(type)) {
                case "ChannelCreated" -> calls.ringing(id, field(channel, "caller", "number"),
                        field(channel, "dialplan", "exten"), field(channel, "dialplan", "context"), at);
                case "ChannelStateChange" -> {
                    if ("Up".equalsIgnoreCase(text(channel.get("state")))) {
                        calls.answered(id, at);
                    }
                }
                case "ChannelDestroyed" -> calls.ended(id, at, "HANGUP");
                default -> {
                }
            }
        } catch (RuntimeException ex) {
            log.warn("An ARI event could not be handled: {}", ex.getClass().getSimpleName());
        }
    }

    private static String field(Map<String, Object> channel, String object, String name) {
        return channel.get(object) instanceof Map<?, ?> inner ? text(inner.get(name)) : null;
    }

    private static String text(Object value) {
        return value == null || value.toString().isBlank() ? null : value.toString();
    }

    private static OffsetDateTime time(String value) {
        if (value == null) {
            return null;
        }
        try {
            return OffsetDateTime.parse(value, ARI_TIME);
        } catch (DateTimeParseException e) {
            try {
                return OffsetDateTime.parse(value);
            } catch (DateTimeParseException again) {
                return null;
            }
        }
    }
}
