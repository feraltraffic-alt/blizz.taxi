package taxi.blizz.operations;

import java.util.UUID;
import taxi.blizz.platform.Actor;

/**
 * Going online and offline (section 6, transitions of section 12.2). Only the device that controls
 * the session can change it; another device takes control explicitly with {@link #handover}
 * (REQ-DRV-03, T-16). A busy driver never loses the current trip by pausing or closing
 * (REQ-DRV-13, T-18): the change waits for the trip to end.
 */
public interface WorkSessions {

    /**
     * CLOSED → OPEN + ACCEPTING. Requires an active account, admission, an approved own vehicle
     * and a fresh location inside a published city (REQ-DRV-04).
     */
    DriverAvailability open(Actor driver, UUID commandId, UUID deviceSessionId, UUID vehicleId, LocationFix location);

    /** Moves control of the open session to {@code deviceSessionId}; the session and any trip continue. */
    DriverAvailability handover(Actor driver, UUID commandId, UUID deviceSessionId, long expectedVersion);

    /** FREE → NOT_ACCEPTING; busy → PAUSE_AFTER_CURRENT. */
    DriverAvailability pause(Actor driver, UUID commandId, UUID deviceSessionId, long expectedVersion);

    /** NOT_ACCEPTING or PAUSE_AFTER_CURRENT → ACCEPTING after re-checking admission and vehicle. */
    DriverAvailability resume(Actor driver, UUID commandId, UUID deviceSessionId, long expectedVersion);

    /** FREE → CLOSED; busy → CLOSING + PAUSE_AFTER_CURRENT, closed when the trip ends. */
    DriverAvailability close(Actor driver, UUID commandId, UUID deviceSessionId, long expectedVersion);

    /**
     * Keeps the connection alive and optionally moves the current position. Safe to repeat: a point
     * with a sequence not newer than the stored one is ignored (REQ-GEO-02). A heartbeat without a
     * location restores the connection but not location freshness (REQ-DS-04, T-15). A point that implies a
     * movement faster than {@code blizz.risk.impossible-speed-kph} from the driver's last accepted position (any
     * device or shift of the last 30 minutes) is not stored: the location is STALE until a plausible one, an
     * IMPOSSIBLE_MOVEMENT flag is raised, and the answer has {@code accepted} false (issue #102).
     */
    DriverAvailability heartbeat(Actor driver, UUID deviceSessionId, LocationFix location);

    DriverAvailability availability(UUID driverId);
}
