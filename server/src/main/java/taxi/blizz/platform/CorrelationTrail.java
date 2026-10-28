package taxi.blizz.platform;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

/**
 * What a module recorded under a correlation id (REQ-OBS-01/04, issue #81), as types and ids only — the search of the
 * staff logs asks every module that implements this. Never contents, never personal data.
 */
public interface CorrelationTrail {

    /** {@code orderId} when the row belongs to an order. */
    record Found(String type, String id, UUID orderId, OffsetDateTime at) {
    }

    /** At most {@code limit}, oldest first. */
    List<Found> find(UUID correlationId, int limit);
}
