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
     * Requires an {@code ACTIVE} staff member who has changed the initial password and holds
     * {@code permission}; for each given city the member must have all cities or that city in
     * {@code city_scope}. A super admin passes every check. Null city ids are ignored. Fails with
     * {@code ACCESS_DENIED}.
     */
    void require(Actor actor, String permission, UUID... cityIds);

    /**
     * Where a staff member may use {@code permission}: every city ({@code allCities}), the listed ones, or none
     * (an inactive member, a member without the permission, or not staff at all).
     */
    record Scope(boolean allCities, java.util.Set<UUID> cityIds) {
        public Scope {
            cityIds = cityIds == null ? java.util.Set.of() : java.util.Set.copyOf(cityIds);
        }

        public boolean covers(UUID cityId) {
            return allCities || (cityId != null && cityIds.contains(cityId));
        }

        public static Scope none() {
            return new Scope(false, java.util.Set.of());
        }
    }

    Scope scope(Actor actor, String permission);

    /**
     * The ACTIVE staff members who may use {@code permission} in {@code cityId} — or, for a null city, only those with
     * all cities. For pushing to the people concerned (a ringing call); never a check of access itself.
     */
    java.util.Set<UUID> holders(String permission, UUID cityId);
}
