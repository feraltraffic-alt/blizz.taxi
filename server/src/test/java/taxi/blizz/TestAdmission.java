package taxi.blizz;

import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;

/**
 * Admission cities for test drivers (issue #141): a driver goes online and gets orders only in a city they are admitted
 * in. Fixtures that are not about admission admit their drivers in every city; tests of the city rule set the list
 * themselves through {@code DriverAdmission.setAdmissionCities}.
 */
public final class TestAdmission {

    private TestAdmission() {
    }

    public static void inEveryCity(JdbcClient jdbc, UUID driverId) {
        jdbc.sql("""
                        insert into driver_admission_city (driver_id, city_id, granted_by, granted_at)
                        select :driver, id, null, now() from city
                        on conflict do nothing""")
                .param("driver", driverId).update();
    }
}
