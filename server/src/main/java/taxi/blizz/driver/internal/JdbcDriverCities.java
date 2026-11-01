package taxi.blizz.driver.internal;

import java.util.Set;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.identity.DriverCities;

/** See {@link DriverCities}: the rows of {@code driver_admission_city}. */
@Component
class JdbcDriverCities implements DriverCities {

    private final JdbcClient jdbc;

    JdbcDriverCities(JdbcClient jdbc) {
        this.jdbc = jdbc;
    }

    @Override
    public Set<UUID> of(UUID driverId) {
        return Set.copyOf(jdbc.sql("select city_id from driver_admission_city where driver_id = :id")
                .param("id", driverId).query(UUID.class).list());
    }
}
