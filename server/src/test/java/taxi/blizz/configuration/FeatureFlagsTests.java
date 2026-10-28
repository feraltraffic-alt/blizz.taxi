package taxi.blizz.configuration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.configuration.FeatureFlags.Flag;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;

/** Server-side feature flags with an owner and a review date (REQ-ENG-14). */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class FeatureFlagsTests {

    @Autowired
    FeatureFlags flags;
    @Autowired
    JdbcClient jdbc;

    private Actor staff(String... permissions) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, all_cities, state, created_at, updated_at)
                        values (:id, :login, 'Admin', 'ADMIN', :permissions, true, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "flags-" + id).param("permissions", permissions).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private static void assertCode(ThrowingCallable call, ErrorCode code) {
        assertThatThrownBy(call).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }

    private FeatureFlags.State state(Actor admin, Flag flag) {
        return flags.all(admin).stream().filter(s -> s.flag() == flag).findFirst().orElseThrow();
    }

    /** The "срок" of REQ-ENG-14: a flag past its review date fails the build until it is removed or re-dated. */
    @Test
    void everyFlagHasAnOwnerAUniqueKeyAndAReviewDateNotPassed() {
        LocalDate today = LocalDate.now(ZoneOffset.UTC);
        for (Flag flag : Flag.values()) {
            assertThat(flag.owner()).as(flag.key()).isNotBlank();
            assertThat(flag.key()).matches("[a-z0-9-]{1,64}");
            assertThat(flag.reviewBy()).as(flag.key() + ": remove the flag or move its date with a reason")
                    .isAfterOrEqualTo(today);
        }
        assertThat(Arrays.stream(Flag.values()).map(Flag::key)).doesNotHaveDuplicates();
    }

    @Test
    void staffSwitchAFlagWithAReasonOnceAndAudited() {
        Flag flag = Flag.CARD_PAYMENTS;
        Actor admin = staff(FeatureFlags.MANAGE_PERMISSION);
        Actor other = staff("settings.manage");
        FeatureFlags.State before = state(admin, flag);

        assertCode(() -> flags.all(other), ErrorCode.ACCESS_DENIED);
        assertCode(() -> flags.change(other, UUID.randomUUID(), flag.key(), before.version(), false, "x"),
                ErrorCode.ACCESS_DENIED);
        assertCode(() -> flags.change(admin, UUID.randomUUID(), "no-such-flag", 0, false, "x"), ErrorCode.NOT_FOUND);
        assertCode(() -> flags.change(admin, UUID.randomUUID(), flag.key(), before.version(), false, " "),
                ErrorCode.VALIDATION_FAILED);
        assertCode(() -> flags.change(admin, UUID.randomUUID(), flag.key(), before.version() + 7, false, "x"),
                ErrorCode.VERSION_CONFLICT);

        UUID command = UUID.randomUUID();
        FeatureFlags.State off = flags.change(admin, command, flag.key(), before.version(), false, "Provider down");
        try {
            assertThat(off.enabled()).isFalse();
            assertThat(off.version()).isEqualTo(before.version() + 1);
            assertThat(off.changedBy()).isEqualTo(admin.id());
            assertThat(flags.enabled(flag)).isFalse();
            assertThat(flags.change(admin, command, flag.key(), before.version(), false, "Provider down"))
                    .as("a repeat of the command").extracting(FeatureFlags.State::version).isEqualTo(off.version());
            assertCode(() -> flags.change(admin, command, flag.key(), before.version(), true, "Provider down"),
                    ErrorCode.IDEMPOTENCY_CONFLICT);
            assertThat(jdbc.sql("""
                            select count(*) from audit_log
                            where action = 'feature-flag.change' and actor_id = :admin and resource_id = :key""")
                    .param("admin", admin.id()).param("key", flag.key()).query(Long.class).single()).isEqualTo(1);
        } finally {
            flags.change(admin, UUID.randomUUID(), flag.key(), off.version(), true, "Back on");
        }
        assertThat(flags.enabled(flag)).isTrue();
    }

    /** Two admins switching at once with the same version: one wins, the other gets a conflict, never a 500. */
    @Test
    void twoSwitchesAtOnceNeverBothApply() throws Exception {
        Flag flag = Flag.CARD_PAYMENTS;
        Actor admin = staff(FeatureFlags.MANAGE_PERMISSION);
        long version = state(admin, flag).version();
        CountDownLatch start = new CountDownLatch(1);
        Callable<Object> attempt = () -> {
            start.await();
            try {
                return flags.change(admin, UUID.randomUUID(), flag.key(), version, false, "Race");
            } catch (DomainException e) {
                return e.code();
            }
        };
        var pool = Executors.newFixedThreadPool(2);
        try {
            Future<Object> a = pool.submit(attempt);
            Future<Object> b = pool.submit(attempt);
            start.countDown();
            var results = java.util.List.of(a.get(), b.get());
            assertThat(results).filteredOn(r -> r instanceof FeatureFlags.State).hasSize(1);
            assertThat(results).contains(ErrorCode.VERSION_CONFLICT);
        } finally {
            pool.shutdownNow();
            FeatureFlags.State now = state(admin, flag);
            if (!now.enabled()) {
                flags.change(admin, UUID.randomUUID(), flag.key(), now.version(), true, "Back on");
            }
        }
    }
}
