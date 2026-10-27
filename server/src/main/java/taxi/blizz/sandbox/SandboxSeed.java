package taxi.blizz.sandbox;

import javax.sql.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.stereotype.Component;

/** Loads {@code sandbox/seed.sql} after the migrations, at every start; the script is idempotent. */
@Component
@Profile("sandbox")
class SandboxSeed implements ApplicationRunner {

    private static final Logger log = LoggerFactory.getLogger(SandboxSeed.class);

    private final DataSource dataSource;

    SandboxSeed(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void run(ApplicationArguments args) {
        ResourceDatabasePopulator populator = new ResourceDatabasePopulator(new ClassPathResource("sandbox/seed.sql"));
        populator.setSqlScriptEncoding("UTF-8");
        populator.execute(dataSource);
        log.warn("[sandbox] Seed data loaded. This instance is a sandbox: SMS codes are readable at /sandbox/v1/otp.");
    }
}
