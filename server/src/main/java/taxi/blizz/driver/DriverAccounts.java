package taxi.blizz.driver;

import java.util.UUID;
import taxi.blizz.platform.Actor;

/**
 * Blocking a driver account (REQ-DS-01, issue #141). Runs only inside the caller's transaction: the operations module
 * blocks the account and stops the driver's new work (open offer, intent) in one command
 * ({@code operations.DriverBlocks}). Locks the driver row, checks the version, audits and publishes the event.
 */
public interface DriverAccounts {

    /** ACTIVE → BLOCKED; STATE_CONFLICT for any other state. */
    void block(Actor staff, UUID driverId, long expectedVersion, String reason);

    /** BLOCKED → ACTIVE; STATE_CONFLICT for any other state. */
    void unblock(Actor staff, UUID driverId, long expectedVersion, String reason);
}
