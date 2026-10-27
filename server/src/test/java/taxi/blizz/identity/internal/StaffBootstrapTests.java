package taxi.blizz.identity.internal;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.Clock;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.TestcontainersConfiguration;

/** The first super admin of a new instance comes from the environment, once. */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class StaffBootstrapTests {

    @Autowired
    JdbcClient jdbc;
    @Autowired
    TransactionTemplate tx;
    @Autowired
    StaffPasswords passwords;
    @Autowired
    Clock clock;

    @Test
    void createsTheFirstSuperAdminOnlyWhileThereIsNone() {
        StaffProperties properties = new StaffProperties(5, java.time.Duration.ofMinutes(15), 12, "Owner",
                "bootstrap-password-1");
        StaffBootstrap bootstrap = new StaffBootstrap(jdbc, tx, passwords, properties, clock);
        tx.executeWithoutResult(status -> {
            jdbc.sql("update staff_user set role = 'ADMIN' where role = 'SUPER_ADMIN'").update();
            bootstrap.run(null);
            bootstrap.run(null);
            assertThat(jdbc.sql("""
                            select count(*) from staff_user
                            where role = 'SUPER_ADMIN' and login = 'owner' and must_change_password""")
                    .query(Long.class).single()).isEqualTo(1);
            status.setRollbackOnly();
        });
    }
}
