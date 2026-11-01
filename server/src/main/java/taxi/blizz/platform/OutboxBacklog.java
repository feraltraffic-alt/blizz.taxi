package taxi.blizz.platform;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

/**
 * Events a consumer has not handled yet (issue #140, REQ-LED-05): an event not DONE without the consumer's
 * {@code consumer_inbox} row, waiting for a retry or FAILED. A module asks about its own consumer only.
 */
public interface OutboxBacklog {

    /** {@code payload}: the event's JSON as written. */
    record Waiting(UUID eventId, Instant occurredAt, String payload) {
    }

    /** The oldest first, at most {@code limit}. */
    List<Waiting> waiting(String eventType, String consumerId, int limit);
}
