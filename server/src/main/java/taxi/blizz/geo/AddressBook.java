package taxi.blizz.geo;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import taxi.blizz.platform.Actor;

/**
 * The service's own addresses (REQ-GEO-10..16). Own data only: provider references are opaque override
 * links, never provider content (Q-08). Commands need {@link #MANAGE_PERMISSION} for the address's city.
 */
public interface AddressBook {
    String MANAGE_PERMISSION = GeoConfiguration.MANAGE_PERMISSION;

    Address create(Create command);
    Address update(Update command);
    Address addAlias(AddAlias command);
    Address hide(Change command);
    Address restore(Change command);

    /**
     * For the admin panel: addresses of a city, hidden ones included when asked, matched by a plain text
     * fragment (or all when blank), newest changes first; needs {@link #MANAGE_PERMISSION} for the city.
     */
    List<Address> listForStaff(Actor staff, UUID cityId, String text, boolean includeHidden, int limit);

    /** One address whatever its visibility, for the admin panel; needs {@link #MANAGE_PERMISSION} for its city. */
    Address getForStaff(Actor staff, UUID id);

    /** Fresh visibility check for selections from old suggestions. */
    Optional<Address> find(UUID id);
    /** All alias languages are searched; language is a ranking preference. Limits above 20 are capped. */
    List<Address> search(UUID cityId, String query, String language, GeoPoint near, int limit);
    /** The closest visible address within {@code radiusMetres} (at most 500). */
    Optional<Address> nearest(UUID cityId, GeoPoint point, double radiusMetres);

    enum Kind {
        HOUSE, PLACE, ENTRANCE
    }

    enum Visibility {
        ACTIVE, HIDDEN
    }

    record ProviderRef(String provider, String objectId) {
    }

    record Data(UUID cityId, Kind kind, String label, String language, String street,
                String houseRaw, String building, GeoPoint pickup, String instructions, ProviderRef override) {
    }

    record Alias(String label, String language) {
    }

    record Address(UUID id, Data data, HouseNumber house, String source, Visibility visibility,
                   long version, List<Alias> aliases) {
        public Address {
            aliases = List.copyOf(aliases);
        }
    }

    /**
     * {@code expectedVersion} is always 0 for a new address. {@code distinct}: save although an active address of the
     * same house lies within {@link #DUPLICATE_METRES} (REQ-GEO-14); never overrides a linked provider reference.
     */
    record Create(UUID commandId, Actor actor, long expectedVersion, Data data, String reason, boolean distinct) {
        public Create(UUID commandId, Actor actor, long expectedVersion, Data data, String reason) {
            this(commandId, actor, expectedVersion, data, reason, false);
        }
    }

    /** {@code distinct}: as for {@link Create}. */
    record Update(UUID commandId, Actor actor, UUID id, long expectedVersion, Data data, String reason,
                  boolean distinct) {
        public Update(UUID commandId, Actor actor, UUID id, long expectedVersion, Data data, String reason) {
            this(commandId, actor, id, expectedVersion, data, reason, false);
        }
    }

    /**
     * How close two pickup points of the same normalized house must be to count as a duplicate (REQ-GEO-14): a
     * create or update that would make one is a {@link taxi.blizz.platform.DuplicateException} naming the existing
     * address, unless {@code distinct}. The same provider reference is always a duplicate.
     */
    double DUPLICATE_METRES = 25;

    record AddAlias(UUID commandId, Actor actor, UUID id, long expectedVersion, Alias alias, String reason) {
    }

    record Change(UUID commandId, Actor actor, UUID id, long expectedVersion, String reason) {
    }
}
