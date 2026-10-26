package taxi.blizz.platform;

import java.time.OffsetDateTime;
import java.util.UUID;

/** A stored event as delivered to handlers; {@code payload} is the raw JSON body. */
public record OutboxMessage(
        UUID eventId,
        String type,
        int schemaVersion,
        String aggregateType,
        UUID aggregateId,
        long aggregateVersion,
        String payload,
        UUID correlationId,
        OffsetDateTime occurredAt,
        int attempts) {
}
