package taxi.blizz;

import org.springframework.boot.SpringApplication;

/**
 * Runs the server locally against a throwaway PostGIS container:
 * {@code mvn spring-boot:test-run}. No docker compose needed.
 */
public class TestBlizzTaxiApplication {

    public static void main(String[] args) {
        SpringApplication.from(BlizzTaxiApplication::main)
                .with(TestcontainersConfiguration.class)
                .run(args);
    }
}
