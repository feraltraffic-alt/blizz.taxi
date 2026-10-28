package taxi.blizz;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.testcontainers.postgresql.PostgreSQLContainer;
import org.testcontainers.utility.DockerImageName;

/**
 * PostgreSQL with PostGIS, the same major versions as production
 * (docs/decisions/0001-stack-versions.md). One container is shared by every test context in the JVM.
 */
@TestConfiguration(proxyBeanMethods = false)
public class TestcontainersConfiguration {

    static final DockerImageName POSTGIS = DockerImageName.parse("postgis/postgis:18-3.6")
            .asCompatibleSubstituteFor("postgres");

    /**
     * Many test contexts share this container (the context cache keeps up to 32), each with its own pool: enough
     * connections for all of them.
     */
    private static final PostgreSQLContainer POSTGRES = new PostgreSQLContainer(POSTGIS)
            .withCommand("postgres", "-c", "max_connections=500");

    @Bean
    @ServiceConnection
    PostgreSQLContainer postgres() {
        return POSTGRES;
    }
}
