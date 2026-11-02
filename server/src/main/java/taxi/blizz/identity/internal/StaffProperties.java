package taxi.blizz.identity.internal;

import java.time.Duration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

/**
 * Staff sign in.
 *
 * @param maxFailedSignIns   wrong passwords in a row before the account is locked
 * @param lockout            how long it stays locked
 * @param minPasswordLength  minimum length of a staff password
 * @param bootstrapLogin     first super admin, created at start only while no super admin exists
 * @param bootstrapPassword  its initial password (must be changed at the first sign-in); set it through the
 *                           environment, never in a file in the repository
 * @param maxFailedSignInsPerAddress wrong sign-ins from one network address within {@code lockout}, any login,
 *                           before that address is refused for a while (threat model A3)
 * @param ownerLogin         the platform owner (ADR 0016), created at start only while there is none
 * @param ownerPassword      its initial password, through the environment like the super admin's
 */
@ConfigurationProperties("blizz.staff")
record StaffProperties(
        @DefaultValue("5") int maxFailedSignIns,
        @DefaultValue("PT15M") Duration lockout,
        @DefaultValue("12") int minPasswordLength,
        String bootstrapLogin,
        String bootstrapPassword,
        @DefaultValue("30") int maxFailedSignInsPerAddress,
        String ownerLogin,
        String ownerPassword) {

    /** Without a platform owner (tests and servers that set none). */
    StaffProperties(int maxFailedSignIns, Duration lockout, int minPasswordLength, String bootstrapLogin,
                    String bootstrapPassword, int maxFailedSignInsPerAddress) {
        this(maxFailedSignIns, lockout, minPasswordLength, bootstrapLogin, bootstrapPassword,
                maxFailedSignInsPerAddress, null, null);
    }

    StaffProperties {
        if (maxFailedSignInsPerAddress < 1) {
            throw new IllegalStateException("blizz.staff: max-failed-sign-ins-per-address must be at least 1");
        }
        if (maxFailedSignIns < 1 || lockout.isNegative() || lockout.isZero() || minPasswordLength < 8) {
            throw new IllegalStateException("blizz.staff: invalid sign-in settings");
        }
    }
}
