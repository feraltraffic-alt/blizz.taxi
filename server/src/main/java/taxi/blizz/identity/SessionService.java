package taxi.blizz.identity;

import java.util.Optional;
import taxi.blizz.platform.Actor;

/**
 * Device sessions with short access tokens and rotating refresh tokens (REQ-AUTH-06, REQ-AUTH-07).
 */
public interface SessionService {

    /**
     * Opens a session for a subject that has just proven its identity.
     *
     * @throws taxi.blizz.platform.DomainException {@code ACCESS_DENIED} if the account is not active
     */
    IssuedSession open(VerifiedSubject subject, String deviceRef);

    /** Opens a staff session for the admin or operator audience, with the shorter staff session age. */
    IssuedSession openStaff(VerifiedSubject subject, ApiAudience audience, String deviceRef);

    /**
     * Exchanges a refresh token for a new pair. Reusing an already exchanged token revokes the
     * whole session (token family), including the newest tokens.
     *
     * @throws taxi.blizz.platform.DomainException {@code UNAUTHENTICATED}
     */
    IssuedSession refresh(String refreshToken);

    /** Revokes the session the token belongs to; unknown tokens are ignored. */
    void logout(String refreshToken);

    /** Revokes every open session of the subject, e.g. when the account is blocked. Returns the count. */
    int revokeAll(Actor subject, String reason);

    /** Checks signature, expiry, audience and that the session is still open. */
    Optional<AccessClaims> verifyAccess(String accessToken, ApiAudience expectedAudience);

    /** Whether the session is still open (not logged out, revoked or expired); e.g. before a push to its device. */
    boolean isOpen(java.util.UUID sessionId);
}
