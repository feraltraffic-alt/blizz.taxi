package taxi.blizz.identity;

import java.util.UUID;

/**
 * Data another module knows only by the rider's phone (issue #144, REQ-PRV-04): a call from that number, the contact
 * of someone else's order. The phone never goes into an event or the outbox, so a module holding such data implements
 * this and is called in the anonymizing transaction, just before the phone is cleared — also when the erasure journal
 * applies a deletion again after a restore. Data linked by the client id goes through {@code ClientAnonymized}.
 *
 * <p>Implementations run inside that transaction (MANDATORY), touch only their own tables and are idempotent.
 */
public interface ClientErasing {

    /** {@code phone}: the rider's number in E.164, never null. */
    void erasing(UUID clientId, String phone);
}
