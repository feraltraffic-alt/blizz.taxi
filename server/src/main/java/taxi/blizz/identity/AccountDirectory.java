package taxi.blizz.identity;

import java.util.Optional;
import taxi.blizz.platform.Actor;

/** Current account state of a subject, for checks in other modules (section 36.4). */
public interface AccountDirectory {

    /** {@code ACTIVE}, {@code BLOCKED}, ... from the subject's own table; empty if it does not exist. */
    Optional<String> accountState(Actor subject);
}
