package taxi.blizz.identity;

import java.time.OffsetDateTime;
import java.util.UUID;
import taxi.blizz.platform.Actor;

/**
 * Tokens handed to a device. The refresh token is shown only here; the server keeps its hash.
 * Clients store both in the platform's secure storage (REQ-AUTH-09).
 */
public record IssuedSession(
        UUID sessionId,
        Actor actor,
        ApiAudience audience,
        String accessToken,
        OffsetDateTime accessExpiresAt,
        String refreshToken,
        OffsetDateTime refreshExpiresAt) {

    @Override
    public String toString() {
        return "IssuedSession[sessionId=" + sessionId + ", actor=" + actor + ", audience=" + audience + "]";
    }
}
