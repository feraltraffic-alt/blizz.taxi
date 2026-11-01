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
     * (an inactive member, a member without the permission, or not staff at all). Only cities of the member's own
     * taxi service (ADR 0016); with {@code allCities}, {@code cityIds} lists every one of them, so a list filtered by
     * {@code cityIds} alone stays inside the service.
     */
    record Scope(boolean allCities, java.util.Set<UUID> cityIds) {
        public Scope {
            cityIds = cityIds == null ? java.util.Set.of() : java.util.Set.copyOf(cityIds);
        }

        /** A city of the member's service in the scope; a city-less object only with every city. */
        public boolean covers(UUID cityId) {
            return cityId == null ? allCities : cityIds.contains(cityId);
        }

        public static Scope none() {
            return new Scope(false, java.util.Set.of());
        }
    }

    Scope scope(Actor actor, String permission);

    /**
     * {@link #require} for an action on a driver (owner decision 01.11.2026, #201): the member must hold
     * {@code permission} in at least one city the driver is admitted in, or in every city. An applicant admitted
     * nowhere yet is open to every holder of the permission. Fails with {@code ACCESS_DENIED}.
     */
    void requireForDriver(Actor actor, String permission, UUID driverId);

    /**
     * {@link #require} for an action on another staff member (owner decision 01.11.2026, #201): {@code permission} in
     * every city of that member — every city when the member has all of them, or is a super admin. An unknown member:
     * the permission alone (the caller answers NOT_FOUND). Fails with {@code ACCESS_DENIED}.
     */
    void requireOverStaff(Actor actor, String permission, UUID staffId);

    /**
     * {@link #require} for an action on a rider: a rider of the member's own taxi service only (ADR 0016); riders
     * have no city, so {@code permission} alone decides within the service.
     */
    void requireForClient(Actor actor, String permission, UUID clientId);

    /** {@link #require} with every city: for objects that serve several cities at once. */
    void requireEveryCity(Actor actor, String permission);

    /**
     * The ACTIVE staff members who may use {@code permission} in {@code cityId} — or, for a null city, only those with
     * all cities. For pushing to the people concerned (a ringing call); never a check of access itself.
     */
    java.util.Set<UUID> holders(String permission, UUID cityId);
}
