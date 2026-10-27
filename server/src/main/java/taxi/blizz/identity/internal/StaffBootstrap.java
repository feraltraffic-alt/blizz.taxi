package taxi.blizz.identity.internal;

import java.time.Clock;
import java.time.ZoneOffset;
import java.util.Locale;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * Creates the first super admin of a new instance from {@code blizz.staff.bootstrap-login} and
 * {@code bootstrap-password} (environment), only while no super admin exists. The password must be changed
 * at the first sign-in; afterwards the settings do nothing and can be removed.
 */
@Component
class StaffBootstrap implements ApplicationRunner {

    private static final Logger log = LoggerFactory.getLogger(StaffBootstrap.class);

    private final JdbcClient jdbc;
    private final TransactionTemplate tx;
    private final StaffPasswords passwords;
    private final StaffProperties properties;
    private final Clock clock;

    StaffBootstrap(JdbcClient jdbc, TransactionTemplate tx, StaffPasswords passwords, StaffProperties properties,
                   Clock clock) {
        this.jdbc = jdbc;
        this.tx = tx;
        this.passwords = passwords;
        this.properties = properties;
        this.clock = clock;
    }

    @Override
    public void run(ApplicationArguments args) {
        String login = properties.bootstrapLogin();
        String password = properties.bootstrapPassword();
        if (login == null || login.isBlank() || password == null || password.isBlank()) {
            return;
        }
        tx.executeWithoutResult(status -> {
            jdbc.sql("select pg_advisory_xact_lock(hashtext('staff-bootstrap'))").query().singleRow();
            boolean exists = jdbc.sql("select exists(select 1 from staff_user where role = 'SUPER_ADMIN')")
                    .query(Boolean.class).single();
            if (exists) {
                return;
            }
            String normalized = login.strip().toLowerCase(Locale.ROOT);
            jdbc.sql("""
                            insert into staff_user (id, login, first_name, last_name, name, role, permissions,
                                                    all_cities, state, password_hash, must_change_password,
                                                    created_at, updated_at, version)
                            values (:id, :login, 'Super', 'Admin', 'Super Admin', 'SUPER_ADMIN', '{}', true, 'ACTIVE',
                                    :hash, true, :now, :now, 0)""")
                    .param("id", UUID.randomUUID()).param("login", normalized)
                    .param("hash", passwords.hash(normalized, password))
                    .param("now", clock.instant().atOffset(ZoneOffset.UTC)).update();
            log.warn("Created the first super admin '{}'; the password must be changed at the first sign-in", normalized);
        });
    }
}
