package taxi.blizz;

import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;

/**
 * Admission cities for test drivers (issue #141): a driver goes online and gets orders only in a city they are admitted
 * in. Fixtures that are not about admission admit their drivers in every city of the driver's own taxi service (never
 * another service's: #444, a city moved to another service by one test made a later test's reviewer of all cities
 * touch it); tests of the city rule set the list themselves through {@code DriverAdmission.setAdmissionCities}.
 */
public final class TestAdmission {

    private TestAdmission() {
    }

    public static void inEveryCity(JdbcClient jdbc, UUID driverId) {
        jdbc.sql("""
                        insert into driver_admission_city (driver_id, city_id, granted_by, granted_at)
                        select :driver, id, null, now() from city
                        where service_id = (select service_id from driver where id = :driver)
                        on conflict do nothing""")
                .param("driver", driverId).update();
    }
}
