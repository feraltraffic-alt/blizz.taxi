package taxi.blizz.operations.internal;

import java.time.OffsetDateTime;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.platform.DriverPersonalData;

/** The driver's shifts for the copy of their data (issue #144): when, in which city, with which car. */
@Component
class DriverShiftsPersonalData implements DriverPersonalData {

    private final JdbcClient jdbc;

    DriverShiftsPersonalData(JdbcClient jdbc) {
        this.jdbc = jdbc;
    }

    record Shift(UUID id, UUID cityId, UUID vehicleId, String state, OffsetDateTime openedAt,
                 OffsetDateTime closedAt) {
    }

    @Override
    public String section() {
        return "shifts";
    }

    @Override
    public Object of(Subject subject) {
        return jdbc.sql("""
                        select id, city_id, vehicle_id, state, opened_at, closed_at
                        from work_session where driver_id = :id order by opened_at, id""")
                .param("id", subject.driverId())
                .query((rs, i) -> new Shift(rs.getObject(1, UUID.class), rs.getObject(2, UUID.class),
                        rs.getObject(3, UUID.class), rs.getString(4), rs.getObject(5, OffsetDateTime.class),
                        rs.getObject(6, OffsetDateTime.class)))
                .list();
    }
}
