package taxi.blizz.identity;

import java.util.List;
import java.util.UUID;
import taxi.blizz.platform.Actor;

/**
 * Staff accounts (owner decision 27.10.2026). Only an active super admin adds staff, edits them, assigns
 * the role, ticks the functions ({@link StaffPermissions}) and the cities, suspends and restores them and
 * sets a temporary password. Every change is audited; at least one active super admin always remains.
 */
public interface StaffDirectory {

    enum Role {
        SUPER_ADMIN, ADMIN, OPERATOR
    }

    /** At least one of phone, e-mail, Telegram. */
    record Contacts(String phone, String email, String telegram) {
    }

    /**
     * What the super admin fills in. For a super admin {@code permissions} and the cities are ignored —
     * everything is allowed. {@code allCities} includes cities added later.
     */
    record Profile(String firstName, String lastName, Contacts contacts, Role role, List<String> permissions,
                   boolean allCities, List<UUID> cityIds) {
        public Profile {
            permissions = permissions == null ? List.of() : List.copyOf(permissions);
            cityIds = cityIds == null ? List.of() : List.copyOf(cityIds);
        }
    }

    record StaffMember(UUID id, String login, Profile profile, String state, boolean passwordChangeRequired,
                       long version) {
    }

    /** The new member must change the initial password at the first sign-in. */
    StaffMember create(Actor superAdmin, UUID commandId, String login, String initialPassword, Profile profile,
                       String reason);

    StaffMember update(Actor superAdmin, UUID commandId, UUID staffId, long expectedVersion, Profile profile,
                       String reason);

    /** Signs the member out everywhere. */
    StaffMember suspend(Actor superAdmin, UUID commandId, UUID staffId, long expectedVersion, String reason);

    StaffMember restore(Actor superAdmin, UUID commandId, UUID staffId, long expectedVersion, String reason);

    /** A temporary password the member must change; signs the member out everywhere. */
    StaffMember resetPassword(Actor superAdmin, UUID commandId, UUID staffId, long expectedVersion,
                              String temporaryPassword, String reason);

    List<StaffMember> list(Actor superAdmin);

    /** The super admin reads anyone; a member reads only himself. */
    StaffMember get(Actor reader, UUID staffId);
}
