package taxi.blizz.platform;

import java.util.Objects;
import java.util.UUID;
import java.util.regex.Pattern;

/**
 * An event to publish together with the business change that caused it. Field names follow the
 * event envelope in packages/contracts/events/envelope.schema.json (REQ-NTF-04).
 */
public record OutboxEvent(
        String type,
        int schemaVersion,
        String aggregateType,
        UUID aggregateId,
        long aggregateVersion,
        Object payload) {

    private static final Pattern TYPE = Pattern.compile("^[A-Z][A-Za-z0-9]+$");

    public OutboxEvent {
        Objects.requireNonNull(type, "type");
        Objects.requireNonNull(aggregateType, "aggregateType");
        Objects.requireNonNull(aggregateId, "aggregateId");
        Objects.requireNonNull(payload, "payload");
        if (!TYPE.matcher(type).matches()) {
            throw new IllegalArgumentException("Event type must be PascalCase: " + type);
        }
        if (schemaVersion < 1 || aggregateVersion < 0) {
            throw new IllegalArgumentException("schemaVersion must be >= 1 and aggregateVersion >= 0");
        }
    }
}
