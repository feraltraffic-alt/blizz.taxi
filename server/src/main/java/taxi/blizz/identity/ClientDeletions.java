package taxi.blizz.identity;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * A rider's request to delete the account (REQ-RID-10, section 36.4): ACTIVE or BLOCKED → DELETION_PENDING →
 * ANONYMIZED, or back to the state it had. Staff decide by hand (the blockers and the permission are checked by the
 * caller, backoffice); the methods here only move the client and run in the caller's transaction.
 */
public interface ClientDeletions {

    /** A pending request: when it was made and the state the account goes back to if it is not completed. */
    record Pending(UUID clientId, String previousState, OffsetDateTime requestedAt) {
    }

    /** Pending requests, oldest first, after {@code after} (exclusive) when given. */
    List<Pending> pending(OffsetDateTime after, int limit);

    Optional<Pending> pending(UUID clientId);

    /**
     * DELETION_PENDING → ANONYMIZED: the phone, name and language are cleared, every session is revoked and
     * {@code ClientAnonymized} is published. The phone is free again: signing in with it creates a new client
     * (36.4). Orders, the journal, ratings and the audit log keep the client id. {@code STATE_CONFLICT} when the
     * client has no pending request.
     */
    void anonymize(UUID clientId);

    /** DELETION_PENDING → the previous state (staff rejected the request). {@code STATE_CONFLICT} otherwise. */
    void restore(UUID clientId);
}
