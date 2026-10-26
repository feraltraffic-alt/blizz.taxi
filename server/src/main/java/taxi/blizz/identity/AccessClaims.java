package taxi.blizz.identity;

import java.time.OffsetDateTime;
import java.util.UUID;
import taxi.blizz.platform.Actor;

/** Verified content of an access token (REQ-USR-08). */
public record AccessClaims(Actor actor, ApiAudience audience, UUID sessionId, UUID instanceId,
                           OffsetDateTime expiresAt) {
}
