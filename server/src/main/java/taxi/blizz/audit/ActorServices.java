package taxi.blizz.audit;

import java.util.Optional;
import java.util.UUID;
import taxi.blizz.platform.Actor;

/**
 * The taxi service a person belongs to (ADR 0016), so each change is filed under the service of who made it. The
 * identity module implements it; the audit module never reads the people's tables of the other modules.
 */
public interface ActorServices {

    /** Empty for a system action, or a person of no service (the platform owner). */
    Optional<UUID> serviceOf(Actor actor);
}
