package taxi.blizz.driver.internal;

import java.time.OffsetDateTime;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.platform.DriverPersonalData;

/** The driver's vehicles for the copy of their data (issue #144). */
@Component
class DriverVehiclesPersonalData implements DriverPersonalData {

    private final JdbcClient jdbc;

    DriverVehiclesPersonalData(JdbcClient jdbc) {
        this.jdbc = jdbc;
    }

    record Vehicle(UUID id, String registrationNumber, String make, String model, String color,
                   Integer productionYear, String state, OffsetDateTime createdAt) {
    }

    @Override
    public String section() {
        return "vehicles";
    }

    @Override
    public Object of(Subject subject) {
        return jdbc.sql("""
                        select id, registration_number, make, model, color, production_year, state, created_at
                        from vehicle where driver_id = :id order by created_at, id""")
                .param("id", subject.driverId())
                .query((rs, i) -> new Vehicle(rs.getObject(1, UUID.class), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), (Integer) rs.getObject(6), rs.getString(7),
                        rs.getObject(8, OffsetDateTime.class)))
                .list();
    }
}
