package taxi.blizz.identity.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import taxi.blizz.identity.DriverCities;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;

@Service
class JdbcStaffAccess implements StaffAccess {

    private final JdbcClient jdbc;
    private final DriverCities driverCities;
    private final taxi.blizz.identity.CityServices cityServices;

    JdbcStaffAccess(JdbcClient jdbc, DriverCities driverCities, taxi.blizz.identity.CityServices cityServices) {
        this.cityServices = cityServices;
        this.jdbc = jdbc;
        this.driverCities = driverCities;
    }

    /** The member's own taxi service; null for an unknown member, who passes no check anyway. */
    private UUID ownService(Actor actor) {
        return jdbc.sql("select service_id from staff_user where id = :id").param("id", actor.id())
                .query(UUID.class).optional().orElse(null);
    }

    /** A driver or staff member of another taxi service is out of reach, whatever the role (ADR 0016). */
    private void requireSameService(Actor actor, String table, UUID subjectId) {
        if (subjectId != null && jdbc.sql("select exists(select 1 from " + table + " where id = :subject"
                        + " and service_id <> (select service_id from staff_user where id = :actor))")
                .param("subject", subjectId).param("actor", actor.id()).query(Boolean.class).single()) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Of another taxi service");
        }
    }

    @Override
    public void requireForDriver(Actor actor, String permission, UUID driverId) {
        require(actor, permission);
        requireSameService(actor, "driver", driverId);
        Set<UUID> cities = driverId == null ? Set.of() : driverCities.of(driverId);
        if (cities.isEmpty()) {
            return;
        }
        Scope scope = scope(actor, permission);
        if (!scope.allCities() && cities.stream().noneMatch(scope.cityIds()::contains)) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Missing permission " + permission
                    + " for a city of this driver");
        }
    }

    @Override
    public void requireOverStaff(Actor actor, String permission, UUID staffId) {
        requireSameService(actor, "staff_user", staffId);
        List<Scope> target = jdbc.sql("""
                        select role = 'SUPER_ADMIN' or all_cities as all_cities, city_scope from staff_user
                        where id = :id""")
                .param("id", staffId)
                .query((rs, i) -> new Scope(rs.getBoolean("all_cities"),
                        new java.util.HashSet<>(Arrays.asList((UUID[]) rs.getArray("city_scope").getArray()))))
                .list();
        if (target.isEmpty()) {
            require(actor, permission);
        } else if (target.getFirst().allCities()) {
            requireEveryCity(actor, permission);
        } else {
            require(actor, permission, target.getFirst().cityIds().toArray(UUID[]::new));
        }
    }

    @Override
    public void requireEveryCity(Actor actor, String permission) {
        require(actor, permission);
        if (!scope(actor, permission).allCities()) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Missing permission " + permission
                    + " for every city");
        }
    }

    @Override
    public void require(Actor actor, String permission, UUID... cityIds) {
        if (actor == null || actor.type() != SubjectType.STAFF) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Staff permission required");
        }
        UUID[] cities = cityIds == null ? new UUID[0]
                : Arrays.stream(cityIds).filter(Objects::nonNull).distinct().toArray(UUID[]::new);
        // Every city asked about must be of the member's own taxi service, whatever the role or grant (ADR 0016):
        // "all cities" and a super admin mean all cities of that service.
        UUID own = ownService(actor);
        boolean allowed = cityServices.servicesOf(Arrays.asList(cities)).values().stream()
                .allMatch(s -> s.equals(own))
                && jdbc.sql("""
                        select exists(select 1 from staff_user
                                      where id = :id and state = 'ACTIVE' and not must_change_password
                                        and (role = 'SUPER_ADMIN'
                                             or (:permission = any(permissions)
                                                 and (all_cities or cast(:cities as uuid[]) <@ city_scope))))
                            or exists(select 1 from staff_emergency_grant g join staff_user u on u.id = g.staff_id
                                      where g.staff_id = :id and u.state = 'ACTIVE' and not u.must_change_password
                                        and g.revoked_at is null and g.expires_at > now()
                                        and :permission = any(g.permissions)
                                        and (g.all_cities or cast(:cities as uuid[]) <@ g.city_scope))""")
                .param("id", actor.id())
                .param("permission", permission)
                .param("cities", cities)
                .query(Boolean.class)
                .single();
        if (!allowed) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, cities.length == 0
                    ? "Missing permission " + permission
                    : "Missing permission " + permission + " for this city");
        }
    }

    @Override
    public Scope scope(Actor actor, String permission) {
        if (actor == null || actor.type() != SubjectType.STAFF) {
            return Scope.none();
        }
        // The staff member's own permission and every active emergency grant of it (REQ-SEC-10), together.
        List<Scope> parts = jdbc.sql("""
                        select role = 'SUPER_ADMIN' or all_cities as all_cities, city_scope from staff_user
                        where id = :id and state = 'ACTIVE' and not must_change_password
                          and (role = 'SUPER_ADMIN' or :permission = any(permissions))
                        union all
                        select g.all_cities, g.city_scope
                        from staff_emergency_grant g join staff_user u on u.id = g.staff_id
                        where g.staff_id = :id and u.state = 'ACTIVE' and not u.must_change_password
                          and g.revoked_at is null and g.expires_at > now() and :permission = any(g.permissions)""")
                .param("id", actor.id()).param("permission", permission)
                .query((rs, i) -> new Scope(rs.getBoolean("all_cities"),
                        new java.util.HashSet<>(Arrays.asList((UUID[]) rs.getArray("city_scope").getArray()))))
                .list();
        if (parts.isEmpty()) {
            return Scope.none();
        }
        java.util.Set<UUID> cities = new java.util.HashSet<>();
        parts.forEach(p -> cities.addAll(p.cityIds()));
        boolean all = parts.stream().anyMatch(Scope::allCities);
        // The member's own taxi service only (ADR 0016): "all cities" lists every city of that service, so a list
        // filtered by the scope's cities never shows another service's; a city of another service is dropped.
        UUID own = ownService(actor);
        if (all) {
            cities.addAll(cityServices.citiesOf(own));
        }
        cityServices.servicesOf(java.util.List.copyOf(cities)).forEach((city, service) -> {
            if (!service.equals(own)) {
                cities.remove(city);
            }
        });
        return new Scope(all, cities);
    }

    @Override
    public java.util.Set<UUID> holders(String permission, UUID cityId) {
        return new java.util.LinkedHashSet<>(jdbc.sql("""
                        select id from staff_user
                        where state = 'ACTIVE' and not must_change_password
                          and (cast(:service as uuid) is null or service_id = cast(:service as uuid))
                          and (role = 'SUPER_ADMIN'
                               or (:permission = any(permissions)
                                   and (all_cities or (cast(:city as uuid) is not null
                                                       and cast(:city as uuid) = any(city_scope)))))
                        union
                        select g.staff_id from staff_emergency_grant g join staff_user u on u.id = g.staff_id
                        where u.state = 'ACTIVE' and not u.must_change_password
                          and (cast(:service as uuid) is null or u.service_id = cast(:service as uuid))
                          and g.revoked_at is null and g.expires_at > now() and :permission = any(g.permissions)
                          and (g.all_cities or (cast(:city as uuid) is not null
                                                and cast(:city as uuid) = any(g.city_scope)))
                        order by 1""")
                .param("permission", permission).param("city", cityId)
                .param("service", cityId == null ? null
                        : cityServices.servicesOf(java.util.List.of(cityId)).get(cityId))
                .query(UUID.class).list());
    }
}
