package taxi.blizz.operations;

import java.util.UUID;
import taxi.blizz.driver.DriverProfile;
import taxi.blizz.platform.Actor;

/**
 * Staff block and unblock a driver account (REQ-DS-01, issue #141); needs {@code driver.review}, a reason, and is
 * audited. Blocking stops new work in the same transaction: the open offer is revoked (OfferRevoked, DRIVER_BLOCKED)
 * and the shift stops taking orders — NOT_ACCEPTING when free, PAUSE_AFTER_CURRENT on a trip. The current trip goes
 * on: the driver keeps a limited session (identity) to complete it, reach support and read what they earned.
 * Unblocking leaves the shift as it is; the driver resumes it.
 */
public interface DriverBlocks {

    DriverProfile block(Actor staff, UUID commandId, UUID driverId, long expectedVersion, String reason);

    DriverProfile unblock(Actor staff, UUID commandId, UUID driverId, long expectedVersion, String reason);
}
