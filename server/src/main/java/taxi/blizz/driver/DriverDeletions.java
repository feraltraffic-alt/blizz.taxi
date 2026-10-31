package taxi.blizz.driver;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import taxi.blizz.identity.ChallengeIssued;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.PageCursor;

/**
 * A driver's request to delete the account (issue #144, REQ-PRV-04), the same shape as the rider's
 * ({@code identity.ClientDeletions}): ACTIVE or BLOCKED → DELETION_PENDING → ANONYMIZED, or back to the state it had.
 * Staff decide by hand (the blockers and the permission are checked by the caller, backoffice); the methods here only
 * move the driver and run in the caller's transaction.
 */
public interface DriverDeletions {

    /** A pending request: when it was made and the state the account goes back to if it is not completed. */
    record Pending(UUID driverId, String previousState, OffsetDateTime requestedAt) {
    }

    /** The driver's account after a request or a cancellation; {@code requestedAt} only while pending. */
    record Status(UUID driverId, String accountState, OffsetDateTime requestedAt) {
    }

    /** Step one: a code of purpose ACCOUNT_DELETION to the driver's current phone. */
    ChallengeIssued requestCode(Actor driver, String deviceRef, String clientIp);

    /**
     * Step two, a command: with a correct code, ACTIVE or BLOCKED → DELETION_PENDING. Every other session of the
     * driver is revoked; {@code currentSessionId} stays. {@code OTP_INVALID} for a wrong code, {@code STATE_CONFLICT}
     * from any other state.
     */
    Status request(Actor driver, UUID currentSessionId, UUID commandId, UUID challengeId, String otpCode);

    /** A command: DELETION_PENDING → the state before the request, while staff have not completed it. */
    Status cancel(Actor driver, UUID commandId);

    /** Pending requests, oldest first (requested_at, then id), after {@code after} when given (REQ-API-09). */
    List<Pending> pending(PageCursor after, int limit);

    Optional<Pending> pending(UUID driverId);

    /**
     * DELETION_PENDING → ANONYMIZED: the phone, name and language are cleared, the documents' numbers too, every
     * session is revoked, what other modules know only by the phone is erased ({@code identity.DriverErasing}) and
     * {@code DriverAnonymized} is published. The document files are deleted after {@code blizz.driver.document-keep}.
     * Trips, earnings, the ledger and the vehicle keep the driver id. {@code STATE_CONFLICT} without a pending request.
     */
    void anonymize(UUID driverId);

    /** DELETION_PENDING → the previous state (staff rejected the request). {@code STATE_CONFLICT} otherwise. */
    void restore(UUID driverId);
}
