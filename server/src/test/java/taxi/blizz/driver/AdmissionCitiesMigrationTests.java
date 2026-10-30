package taxi.blizz.driver;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.UUID;
import javax.sql.DataSource;
import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.testcontainers.postgresql.PostgreSQLContainer;
import org.testcontainers.utility.DockerImageName;

/**
 * The back-fill of admission cities (issue #141, migration V20261030_1444_5): rows are written at the Flyway version
 * before it, then the rest of the migrations run. Every driver gets every city of their sessions, whatever the review
 * status (review of #156: a suspended driver approved again must not lose the line); a driver who never opened a
 * session gets none. Its own database, so the other tests are untouched.
 */
@SpringBootTest(properties = {"spring.flyway.target=20261030.1154.5", "blizz.retention.enabled=false"})
@Import(AdmissionCitiesMigrationTests.Database.class)
class AdmissionCitiesMigrationTests {

    @TestConfiguration(proxyBeanMethods = false)
    static class Database {
        @Bean
        @ServiceConnection
        PostgreSQLContainer admissionMigrationPostgres() {
            return new PostgreSQLContainer(DockerImageName.parse("postgis/postgis:18-3.6")
                    .asCompatibleSubstituteFor("postgres"));
        }
    }

    @Autowired JdbcClient jdbc;
    @Autowired DataSource dataSource;

    @Test
    void everyDriverKeepsTheCitiesTheyWorkedInAndOnlyDriversWithoutSessionsGetNone() {
        assertThat(jdbc.sql("select to_regclass('driver_admission_city') is null").query(Boolean.class).single())
                .as("written before the migration").isTrue();
        UUID kyiv = city("migration-kyiv", 160);
        UUID lviv = city("migration-lviv", 161);
        UUID odesa = city("migration-odesa", 162);
        UUID both = driver("APPROVED");
        session(both, kyiv);
        session(both, lviv);
        session(both, kyiv);
        UUID oneCity = driver("APPROVED");
        session(oneCity, odesa);
        UUID noSession = driver("APPROVED");
        UUID suspended = driver("SUSPENDED");
        session(suspended, kyiv);
        UUID inReview = driver("IN_REVIEW");
        session(inReview, lviv);
        UUID suspendedNoSession = driver("SUSPENDED");

        Flyway.configure().dataSource(dataSource).locations("classpath:db/migration").load().migrate();

        assertThat(cities(both)).containsExactlyInAnyOrder(kyiv, lviv);
        assertThat(cities(oneCity)).containsExactly(odesa);
        assertThat(cities(noSession)).as("no session: staff must set a city").isEmpty();
        assertThat(cities(suspended)).as("suspended now, keeps Kyiv for when approved again").containsExactly(kyiv);
        assertThat(cities(inReview)).containsExactly(lviv);
        assertThat(cities(suspendedNoSession)).as("suspended, never drove").isEmpty();
        assertThat(jdbc.sql("select count(*) from driver_admission_city where granted_by is not null")
                .query(Integer.class).single()).as("set by the migration, not a person").isZero();
    }

    private UUID city(String code, int lon) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into city (id, code, name, currency, timezone, polygon, priority, state, created_at,
                                          updated_at)
                        values (:id, :code, :code, 'UAH', 'UTC', ST_GeomFromEWKT(:area), 1, 'PUBLISHED', now(), now())""")
                .param("id", id).param("code", code)
                .param("area", "SRID=4326;MULTIPOLYGON(((%1$d -40,%2$d -40,%2$d -39,%1$d -39,%1$d -40)))"
                        .formatted(lon, lon + 1))
                .update();
        return id;
    }

    private UUID driver(String reviewStatus) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into driver (id, phone_normalized, account_state, review_status, created_at, updated_at)
                        values (:id, :phone, 'ACTIVE', :status, now(), now())""")
                .param("id", id).param("status", reviewStatus)
                .param("phone", taxi.blizz.TestPhones.unique("+38093", 7))
                .update();
        return id;
    }

    /** A closed work session of the driver in the city, with its own car and phone. */
    private void session(UUID driver, UUID city) {
        UUID vehicle = UUID.randomUUID();
        jdbc.sql("""
                        insert into vehicle (id, driver_id, registration_number, make, model, color, production_year,
                                             state, created_at, updated_at)
                        values (:id, :driver, 'AA0000AA', 'Skoda', 'Fabia', 'red', 2020, 'APPROVED', now(), now())""")
                .param("id", vehicle).param("driver", driver).update();
        UUID device = UUID.randomUUID();
        jdbc.sql("""
                        insert into device_session (id, subject_type, subject_id, audience, created_at,
                                                    last_refreshed_at, expires_at)
                        values (:id, 'DRIVER', :driver, 'driver', now(), now(), now() + interval '1 day')""")
                .param("id", device).param("driver", driver).update();
        jdbc.sql("""
                        insert into work_session (id, driver_id, vehicle_id, city_id, device_session_id, state, intent,
                                                  opened_at, closed_at, last_heartbeat_at)
                        values (:id, :driver, :vehicle, :city, :device, 'CLOSED', 'ACCEPTING', now(), now(), now())""")
                .param("id", UUID.randomUUID()).param("driver", driver).param("vehicle", vehicle)
                .param("city", city).param("device", device).update();
    }

    private List<UUID> cities(UUID driver) {
        return jdbc.sql("select city_id from driver_admission_city where driver_id = :d")
                .param("d", driver).query(UUID.class).list();
    }
}
