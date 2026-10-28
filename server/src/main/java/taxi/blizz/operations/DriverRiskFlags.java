package taxi.blizz.operations;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import taxi.blizz.platform.Actor;

/**
 * Suspicions about drivers for a person to review (REQ-DS-08, REQ-SEC-11, issue #71). A flag never blocks, ends a
 * trip or charges anything by itself; suspending a driver stays a separate, explained action that may name the flag.
 * Drivers never see flags. Everything needs {@link #RISK_PERMISSION} for the flag's city and is audited.
 */
public interface DriverRiskFlags {

    String RISK_PERMISSION = "drivers.risk";

    enum Kind {
        IMPOSSIBLE_MOVEMENT, MANUAL
    }

    enum State {
        OPEN, CONFIRMED, DISMISSED
    }

    record Flag(UUID id, UUID driverId, UUID cityId, Kind kind, State state, Map<String, Object> evidence,
                UUID raisedBy, OffsetDateTime raisedAt, String reason, UUID reviewedBy, OffsetDateTime reviewedAt,
                String reviewReason, long version) {
    }

    /** Newest first, at most 100, in the staff member's cities; every filter optional. */
    List<Flag> list(Actor staff, UUID cityId, State state, UUID driverId, OffsetDateTime before, int limit);

    Flag get(Actor staff, UUID flagId);

    Flag raise(Actor staff, UUID commandId, UUID driverId, UUID cityId, String reason);

    /** OPEN → CONFIRMED or DISMISSED ({@code confirm} false), once; a reason is required. */
    Flag review(Actor staff, UUID commandId, UUID flagId, long expectedVersion, boolean confirm, String reason);
}
