package taxi.blizz.identity;

import java.util.UUID;
import taxi.blizz.platform.Actor;

/**
 * The account that proved control of the phone. {@code accountState} lets the session layer
 * refuse blocked or deleted accounts; {@code created} is true for a first sign-in.
 */
public record VerifiedSubject(Actor actor, String accountState, boolean created) {

    public UUID id() {
        return actor.id();
    }
}
