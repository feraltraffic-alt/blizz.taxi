package taxi.blizz.platform;

import java.util.UUID;

/**
 * A module's part of a rider's copy of their personal data (REQ-PRV-07). Every module that keeps data about riders
 * implements it in its {@code internal} package and reads only its own tables; the identity module collects the
 * parts into one file. A part never contains staff ids, secrets (tokens, keys) or another person's contact details.
 */
public interface PersonalData {

    /** The rider the copy is for; {@code phone} in E.164, the account's current number. */
    record Subject(UUID clientId, String phone) {
    }

    /** The key of this part in the file, e.g. {@code orders}; unique across the application. */
    String section();

    /** The rider's data in this module: records, lists or maps serialisable to JSON; an empty list when none. */
    Object of(Subject subject);
}
