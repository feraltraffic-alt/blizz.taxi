package taxi.blizz.identity;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import taxi.blizz.platform.Actor;

/**
 * Riders in the admin panel (REQ-ADM-01, section 36.4): finding a rider, blocking and unblocking. A block has a
 * reason and, optionally, an end, when the rider becomes ACTIVE again by itself. A blocked rider cannot order but may
 * still sign in to follow a trip in progress; a debt or a dispute is not touched by unblocking. Every change is
 * audited. Needs {@link #MANAGE_PERMISSION}.
 */
public interface ClientAccounts {

    String MANAGE_PERMISSION = "clients.manage";

    /**
     * A rider as staff see them. {@code phone} in full: support calls back. Anonymized riders are never returned.
     */
    record Client(UUID id, String phone, String name, String language, String accountState, boolean hasApp,
                  OffsetDateTime createdAt, long version, Block block, OffsetDateTime deletionRequestedAt) {
    }

    /** Set while the rider is blocked, and kept while a deletion request is pending on top of a block. */
    record Block(String reason, OffsetDateTime until, OffsetDateTime at, UUID by) {
    }

    /**
     * Riders whose phone contains the digits of {@code query} (at least 4) or whose name contains it (at least 2
     * letters), newest first; at most 50.
     */
    List<Client> search(Actor staff, String query, int limit);

    Client get(Actor staff, UUID clientId);

    /** ACTIVE → BLOCKED; {@code until} null — until unblocked by staff, otherwise in the future. */
    Client block(Actor staff, UUID commandId, UUID clientId, long expectedVersion, String reason, OffsetDateTime until);

    /** BLOCKED → ACTIVE. */
    Client unblock(Actor staff, UUID commandId, UUID clientId, long expectedVersion, String reason);

    /** Blocks whose end has come are lifted; for the worker. Returns how many. */
    int liftExpiredBlocks();
}
