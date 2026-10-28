package taxi.blizz.identity.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;

@Service
class JdbcStaffAccess implements StaffAccess {

    private final JdbcClient jdbc;

    JdbcStaffAccess(JdbcClient jdbc) {
        this.jdbc = jdbc;
    }

    @Override
    public void require(Actor actor, String permission, UUID... cityIds) {
        if (actor == null || actor.type() != SubjectType.STAFF) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Staff permission required");
        }
        UUID[] cities = cityIds == null ? new UUID[0]
                : Arrays.stream(cityIds).filter(Objects::nonNull).distinct().toArray(UUID[]::new);
        boolean allowed = jdbc.sql("""
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
        return new Scope(parts.stream().anyMatch(Scope::allCities), cities);
    }

    @Override
    public java.util.Set<UUID> holders(String permission, UUID cityId) {
        return new java.util.LinkedHashSet<>(jdbc.sql("""
                        select id from staff_user
                        where state = 'ACTIVE' and not must_change_password
                          and (role = 'SUPER_ADMIN'
                               or (:permission = any(permissions)
                                   and (all_cities or (cast(:city as uuid) is not null
                                                       and cast(:city as uuid) = any(city_scope)))))
                        union
                        select g.staff_id from staff_emergency_grant g join staff_user u on u.id = g.staff_id
                        where u.state = 'ACTIVE' and not u.must_change_password
                          and g.revoked_at is null and g.expires_at > now() and :permission = any(g.permissions)
                          and (g.all_cities or (cast(:city as uuid) is not null
                                                and cast(:city as uuid) = any(g.city_scope)))
                        order by 1""")
                .param("permission", permission).param("city", cityId)
                .query(UUID.class).list());
    }
}
