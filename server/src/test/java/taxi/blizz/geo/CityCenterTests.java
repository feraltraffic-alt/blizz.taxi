package taxi.blizz.geo;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.TestcontainersConfiguration;

/**
 * Issue #243: the start-up data gives a point inside each city, where the address search and the maps start. For a
 * C-shaped city the centroid falls outside it; the point given never does.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class CityCenterTests {

    /** A "C": its centroid lies in the open middle, outside the polygon. */
    static final String C_SHAPE = "MULTIPOLYGON(((120 -60, 124 -60, 124 -59, 121 -59, 121 -57, 124 -57, 124 -56, "
            + "120 -56, 120 -60)))";

    @Autowired CityCatalog cities;
    @Autowired JdbcClient jdbc;

    @Test
    void thePointOfABentCityIsInsideItAndOnlyItsServiceGetsIt() {
        UUID service = UUID.randomUUID();
        jdbc.sql("""
                        insert into service (id, code, name, created_at, updated_at)
                        values (:id, :code, 'Bent', now(), now())""")
                .param("id", service).param("code", "bent-" + service.toString().substring(0, 8)).update();
        UUID city = UUID.randomUUID();
        jdbc.sql("""
                        insert into city (id, code, name, currency, timezone, polygon, priority, state, service_id,
                                          created_at, updated_at)
                        values (:id, :code, 'C-town', 'UAH', 'UTC', ST_GeomFromText(:shape, 4326), 1, 'PUBLISHED',
                                :service, now(), now())""")
                .param("id", city).param("code", "c-town-" + city.toString().substring(0, 8)).param("shape", C_SHAPE)
                .param("service", service).update();

        GeoPoint center = cities.centers(service).get(city);
        assertThat(center).as("the city's point").isNotNull();
        assertThat(jdbc.sql("select ST_Contains(polygon, ST_SetSRID(ST_MakePoint(:lon, :lat), 4326)) from city "
                        + "where id = :id")
                .param("lon", center.lon()).param("lat", center.lat()).param("id", city).query(Boolean.class).single())
                .as("inside the C").isTrue();
        assertThat(jdbc.sql("select ST_Contains(polygon, ST_Centroid(polygon)) from city where id = :id")
                .param("id", city).query(Boolean.class).single()).as("while its centroid is not").isFalse();
        assertThat(cities.centers(UUID.randomUUID())).as("another service has none of it").doesNotContainKey(city);
    }
}
