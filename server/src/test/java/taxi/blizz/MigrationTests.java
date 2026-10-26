package taxi.blizz;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * An empty database is brought up by migrations alone, and Hibernate validates the
 * resulting schema at startup (AC-20, REQ-DATA-12).
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class MigrationTests {

    @Autowired
    JdbcTemplate jdbc;

    @Test
    void allMigrationsAppliedSuccessfully() {
        Integer failed = jdbc.queryForObject(
                "select count(*) from flyway_schema_history where not success", Integer.class);
        Integer applied = jdbc.queryForObject(
                "select count(*) from flyway_schema_history where success", Integer.class);

        assertThat(failed).isZero();
        assertThat(applied).isPositive();
    }

    @Test
    void postgisIsAvailable() {
        String version = jdbc.queryForObject("select postgis_lib_version()", String.class);

        assertThat(version).startsWith("3.6");
    }

    @Test
    void sessionTimeZoneIsUtc() {
        String zone = jdbc.queryForObject("show timezone", String.class);

        assertThat(zone).isIn("UTC", "Etc/UTC");
    }
}
