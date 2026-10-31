package taxi.blizz.platform;

import java.util.UUID;

/**
 * A module's part of a driver's copy of their personal data (REQ-PRV-07, issue #144), as {@link PersonalData} is for
 * riders. Reads only the module's own tables. A part never contains staff ids, secrets, document files, or anything
 * about a rider: no name, phone, points, labels, note or message of the people the driver drove.
 */
public interface DriverPersonalData {

    /** The driver the copy is for; {@code phone} in E.164, the account's current number. */
    record Subject(UUID driverId, String phone) {
    }

    /** The key of this part in the file, e.g. {@code trips}; unique across the application. */
    String section();

    /** The driver's data in this module: records, lists or maps serialisable to JSON; an empty list when none. */
    Object of(Subject subject);
}
