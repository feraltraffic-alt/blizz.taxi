package taxi.blizz.identity;

import java.util.Optional;
import taxi.blizz.platform.Actor;

/** Current account state and contact data of a subject, for checks in other modules (section 36.4). */
public interface AccountDirectory {

    /** {@code ACTIVE}, {@code BLOCKED}, ... from the subject's own table; empty if it does not exist. */
    Optional<String> accountState(Actor subject);

    /** Normalized E.164 phone for a client or driver; empty for other subject types or anonymized accounts. */
    Optional<String> phone(Actor subject);

    /** The language a client or driver chose (uk, pl, ru, en); empty when not set. */
    Optional<String> language(Actor subject);

    /** The client account with this phone (any state); e.g. for staff who find a rider by the number they called. */
    Optional<java.util.UUID> clientByPhone(PhoneNumber phone);
}
