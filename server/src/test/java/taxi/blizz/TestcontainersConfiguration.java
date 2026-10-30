package taxi.blizz;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.DynamicPropertyRegistrar;
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
     * connections for all of them. Its lifetime is the JVM's, not that of an evicted Spring context.
     */
    private static final PostgreSQLContainer POSTGRES = new PostgreSQLContainer(POSTGIS)
            .withCommand("postgres", "-c", "max_connections=500");

    static {
        POSTGRES.start();
    }

    @Bean
    DynamicPropertyRegistrar postgresProperties() {
        // Exposing the shared Startable as a bean would let any context's destruction stop everyone else's DB.
        return registry -> {
            registry.add("spring.datasource.url", POSTGRES::getJdbcUrl);
            registry.add("spring.datasource.username", POSTGRES::getUsername);
            registry.add("spring.datasource.password", POSTGRES::getPassword);
            registry.add("spring.datasource.driver-class-name", POSTGRES::getDriverClassName);
        };
    }
}
