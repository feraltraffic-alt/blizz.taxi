package taxi.blizz.finance;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.configuration.ServiceSettings;
import taxi.blizz.configuration.ServiceSettings.Settings;
import taxi.blizz.configuration.ServiceSettings.StaffTopUps;
import taxi.blizz.finance.DriverBalances.TopUpKind;
import taxi.blizz.identity.SessionService;
import taxi.blizz.operations.Dispatch;
import taxi.blizz.operations.Orders;
import taxi.blizz.operations.Trips;
import taxi.blizz.operations.WorkSessions;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.pricing.QuoteService;

/**
 * Threat model C3 (owner decision 30.10.2026): what one staff member may top up in 24 hours, driver balances and rider
 * wallets together, per currency, set in the service settings. The limit is set on EUR, a currency of this test's
 * own city only, so no other test's top-ups are affected; it is removed after each test.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class StaffTopUpLimitTests {

    @Autowired
    DriverBalances balances;
    @Autowired
    RiderWallets wallets;
    @Autowired
    ServiceSettings settings;
    @Autowired
    JdbcClient jdbc;
    @Autowired
    Orders orders;
    @Autowired
    Dispatch dispatch;
    @Autowired
    Trips trips;
    @Autowired
    WorkSessions sessions;
    @Autowired
    SessionService auth;
    @Autowired
    QuoteService quotes;

    Actor admin;

    @BeforeEach
    void setUp() {
        new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes).city("test-staff-top-ups", "EUR", 27);
        admin = staff(ServiceSettings.MANAGE_PERMISSION);
    }

    @AfterEach
    void noLimit() {
        limit(Map.of());
    }

    private void limit(Map<String, Long> perCurrency) {
        ServiceSettings.Version now = settings.current();
        Settings s = now.settings();
        settings.change(admin, UUID.randomUUID(), now.version(), new Settings(s.brand(), s.languages(), s.calls(),
                s.preorders(), s.ratings(), s.tips(), s.orders(), s.cashNotReceived(), s.appVersions(),
                new StaffTopUps(perCurrency)), "test");
    }

    private Actor staff(String... permissions) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, state, created_at, updated_at)
                        values (:id, :login, 'Top-ups', 'ADMIN', :permissions, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "top-ups-" + id).param("permissions", permissions).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private Actor cashier() {
        return staff(DriverBalances.MANAGE_PERMISSION, RiderWallets.MANAGE_PERMISSION);
    }

    private UUID driver() {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into driver (id, phone_normalized, account_state, review_status, created_at, updated_at)
                        values (:id, :phone, 'ACTIVE', 'APPROVED', now(), now())""")
                .param("id", id).param("phone", "+38097" + String.format("%07d", Math.floorMod(id.hashCode(),
                        10_000_000))).update();
        return id;
    }

    private UUID client() {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into client (id, phone_normalized, account_state, has_app, created_at, updated_at)
                        values (:id, :phone, 'ACTIVE', true, now(), now())""")
                .param("id", id).param("phone", "+48" + String.format("%09d", Math.floorMod(id.hashCode(),
                        1_000_000_000))).update();
        return id;
    }

    private long toppedUp(Actor staff) {
        return jdbc.sql("""
                        select coalesce((select sum(amount_minor) from driver_balance_top_up where staff_id = :s), 0)
                             + coalesce((select sum(amount_minor) from rider_wallet_top_up where staff_id = :s), 0)""")
                .param("s", staff.id()).query(Long.class).single();
    }

    private static void assertCode(ThrowingCallable call, ErrorCode code) {
        assertThatThrownBy(call).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }

    @Test
    void driverAndRiderTopUpsShareOneLimitPerStaffMemberAndCurrency() {
        limit(Map.of("EUR", 10_000L));
        Actor anna = cashier();
        UUID driver = driver();
        UUID rider = client();

        balances.topUp(anna, UUID.randomUUID(), driver, "EUR", 6_000, TopUpKind.DEPOSIT, null, "Cash at the office");
        wallets.topUp(anna, UUID.randomUUID(), rider, "EUR", 4_000, "Goodwill");
        assertThat(toppedUp(anna)).as("up to the limit exactly").isEqualTo(10_000);

        // One minor unit more, by either kind of top-up: refused, nothing credited.
        assertCode(() -> balances.topUp(anna, UUID.randomUUID(), driver, "EUR", 1, TopUpKind.BONUS, null, "x"),
                ErrorCode.TOP_UP_DAILY_LIMIT);
        assertCode(() -> wallets.topUp(anna, UUID.randomUUID(), rider, "EUR", 1, "x"), ErrorCode.TOP_UP_DAILY_LIMIT);
        assertThat(toppedUp(anna)).isEqualTo(10_000);
        assertThat(ErrorCode.TOP_UP_DAILY_LIMIT.httpStatus()).isEqualTo(422);

        // Another staff member has a limit of their own; a currency without a limit is not limited.
        Actor bohdan = cashier();
        balances.topUp(bohdan, UUID.randomUUID(), driver, "EUR", 10_000, TopUpKind.DEPOSIT, null, "Cash");
        assertThat(toppedUp(bohdan)).isEqualTo(10_000);
        limit(Map.of("PLN", 1L));
        balances.topUp(anna, UUID.randomUUID(), driver, "EUR", 50_000, TopUpKind.DEPOSIT, null, "No limit on EUR now");
    }

    @Test
    void theWindowIsTheLast24HoursAndARepeatGetsItsStoredResult() {
        limit(Map.of("EUR", 10_000L));
        Actor anna = cashier();
        UUID rider = client();
        UUID command = UUID.randomUUID();
        wallets.topUp(anna, command, rider, "EUR", 10_000, "Goodwill");
        assertCode(() -> wallets.topUp(anna, UUID.randomUUID(), rider, "EUR", 1, "x"), ErrorCode.TOP_UP_DAILY_LIMIT);
        // A repeat of the command that is already done is its stored result, not a refusal.
        assertThat(wallets.topUp(anna, command, rider, "EUR", 10_000, "Goodwill").balances()).isNotEmpty();

        jdbc.sql("update rider_wallet_top_up set created_at = created_at - interval '23 hours 59 minutes' "
                + "where staff_id = :s").param("s", anna.id()).update();
        assertCode(() -> wallets.topUp(anna, UUID.randomUUID(), rider, "EUR", 1, "x"), ErrorCode.TOP_UP_DAILY_LIMIT);
        jdbc.sql("update rider_wallet_top_up set created_at = created_at - interval '2 minutes' where staff_id = :s")
                .param("s", anna.id()).update();
        wallets.topUp(anna, UUID.randomUUID(), rider, "EUR", 10_000, "A new day");
        assertThat(toppedUp(anna)).isEqualTo(20_000);
    }

    @Test
    void topUpsAtOnceNeverPassTheLimitTogether() throws Exception {
        limit(Map.of("EUR", 10_000L));
        Actor anna = cashier();
        UUID driver = driver();
        UUID rider = client();
        int threads = 8;
        CountDownLatch start = new CountDownLatch(1);
        List<Future<Boolean>> results = new ArrayList<>();
        try (var pool = Executors.newFixedThreadPool(threads)) {
            for (int i = 0; i < threads; i++) {
                boolean toDriver = i % 2 == 0;
                results.add(pool.submit(() -> {
                    start.await();
                    try {
                        if (toDriver) {
                            balances.topUp(anna, UUID.randomUUID(), driver, "EUR", 2_000, TopUpKind.DEPOSIT, null,
                                    "Cash");
                        } else {
                            wallets.topUp(anna, UUID.randomUUID(), rider, "EUR", 2_000, "Goodwill");
                        }
                        return true;
                    } catch (DomainException e) {
                        assertThat(e.code()).isEqualTo(ErrorCode.TOP_UP_DAILY_LIMIT);
                        return false;
                    }
                }));
            }
            start.countDown();
            long done = 0;
            for (Future<Boolean> result : results) {
                done += result.get() ? 1 : 0;
            }
            assertThat(done).isEqualTo(5);
        }
        assertThat(toppedUp(anna)).isEqualTo(10_000);
    }

    @Test
    void aWrongLimitIsRefusedWhenSaved() {
        for (Map<String, Long> wrong : List.of(Map.of("eur", 100L), Map.of("EURO", 100L), Map.of("EUR", 0L),
                Map.of("EUR", -5L), Map.of("EUR", 1_000_000_000_001L))) {
            assertCode(() -> limit(wrong), ErrorCode.VALIDATION_FAILED);
        }
        limit(Map.of("EUR", 1_000_000_000_000L, "UAH", 1L));
        assertThat(settings.current().settings().staffTopUps().dailyMax("UAH")).hasValue(1L);
        assertThat(settings.current().settings().staffTopUps().dailyMax("PLN")).isEmpty();
    }
}
