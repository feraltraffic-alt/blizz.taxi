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

    /** The rider's account after a request or a cancellation; {@code requestedAt} only while pending. */
    record Status(UUID clientId, String accountState, OffsetDateTime requestedAt) {
    }

    /** Step one: a code of purpose ACCOUNT_DELETION to the rider's current phone. */
    ChallengeIssued requestCode(taxi.blizz.platform.Actor rider, String deviceRef, String clientIp);

    /**
     * Step two, a command: with a correct code, ACTIVE or BLOCKED → DELETION_PENDING. Every other session of the
     * rider is revoked; {@code currentSessionId} stays, so the app can show the request and offer to cancel it.
     * {@code OTP_INVALID} for a wrong code, {@code STATE_CONFLICT} from any other state.
     */
    Status request(taxi.blizz.platform.Actor rider, UUID currentSessionId, UUID commandId, UUID challengeId,
                   String otpCode);

    /** A command: DELETION_PENDING → the state before the request, while staff have not completed it. */
    Status cancel(taxi.blizz.platform.Actor rider, UUID commandId);

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
