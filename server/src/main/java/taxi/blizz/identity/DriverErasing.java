package taxi.blizz.identity;

import java.util.UUID;

/**
 * Data another module knows only by a driver's phone (issue #144): the driver's sign-in codes and their deliveries,
 * calls from that number. As {@link ClientErasing} for riders: called in the driver's anonymizing transaction, just
 * before the phone is cleared, also when the erasure journal applies the deletion again after a restore; the phone
 * never goes into an event. Implementations run inside that transaction (MANDATORY), touch only their own tables and
 * are idempotent.
 */
public interface DriverErasing {

    /** {@code phone}: the driver's number in E.164, never null. */
    void erasing(UUID driverId, String phone);
}
