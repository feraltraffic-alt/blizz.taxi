package taxi.blizz.identity.internal;

import java.util.Arrays;
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
                                      where id = :id and state = 'ACTIVE' and :permission = any(permissions)
                                        and cast(:cities as uuid[]) <@ city_scope)""")
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
}
