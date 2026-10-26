package taxi.blizz.identity;

import java.util.UUID;
import taxi.blizz.platform.Actor;

/**
 * The one place that decides whether a staff member may act (REQ-AUTH-10, section 36). Other modules
 * never read {@code staff_user} themselves. Call it before {@code IdempotentCommands.execute}, so a
 * stored outcome is never replayed to someone who has lost access (AGENTS.md).
 */
public interface StaffAccess {

    /**
     * Requires an {@code ACTIVE} staff member holding {@code permission}; for each given city the
     * city must also be in the member's {@code city_scope}. Null city ids are ignored. Fails with
     * {@code ACCESS_DENIED}.
     */
    void require(Actor actor, String permission, UUID... cityIds);
}
