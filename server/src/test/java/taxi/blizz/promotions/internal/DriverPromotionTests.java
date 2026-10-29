package taxi.blizz.promotions.internal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.time.Instant;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.UUID;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.finance.DriverBalances;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.SessionService;
import taxi.blizz.operations.Dispatch;
import taxi.blizz.operations.Orders;
import taxi.blizz.operations.Trips;
import taxi.blizz.operations.WorkSessions;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.OutboxMessage;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.platform.internal.OutboxRelay;
import taxi.blizz.pricing.QuoteService;
import taxi.blizz.promotions.DriverPromotions;
import taxi.blizz.promotions.DriverPromotions.Draft;
import taxi.blizz.promotions.DriverPromotions.Repeat;
import taxi.blizz.promotions.RiderPromotions;

/** Promotions for drivers (ADR 0010 p. 3–5): N orders in a period, conditions, the reward on the balance. */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class DriverPromotionTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, 5.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 5.55);

    @Autowired
    DriverPromotions promotions;
    @Autowired
    DriverBalances balances;
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
    @Autowired
    OutboxRelay relay;
    @Autowired
    JdbcClient jdbc;
    @Autowired
    DriverPromotionTrips handler;
    @Autowired
    PlatformTransactionManager txManager;

    TestRides rides;
    UUID cityId;
    Actor admin;

    @BeforeEach
    void setUp() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        cityId = rides.city("test-driver-promotions", "UAH", 5);
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, all_cities, state, created_at, updated_at)
                        values (:id, :login, 'Fleet', 'ADMIN', :permissions, true, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "driver-promotions-" + id)
                .param("permissions", new String[] {RiderPromotions.MANAGE_PERMISSION}).update();
        admin = new Actor(SubjectType.STAFF, id);
        while (relay.runOnce() > 0) {
            // earlier events do not count
        }
    }

    @AfterEach
    void archiveAll() {
        for (DriverPromotions.Promotion p : promotions.list(admin, false)) {
            if (cityId.equals(p.terms().cityId())) {
                promotions.archive(admin, UUID.randomUUID(), p.id(), p.version(), "test clean-up");
            }
        }
    }

    private Draft draft(String name, int orders, LocalTime from, LocalTime to, Repeat repeat) {
        return new Draft(name, 10_000, "UAH", cityId, 10, orders, null, from, to, "CASH", repeat,
                Instant.now().minus(1, ChronoUnit.HOURS), null);
    }

    private void ride(TestRides.Driver driver, OffsetDateTime acceptedAt) {
        TestRides.Ride ride = rides.started(cityId, driver, PICKUP, DROPOFF);
        jdbc.sql("update assignment set created_at = :at where id = :id")
                .param("at", acceptedAt).param("id", ride.trip().assignmentId()).update();
        rides.complete(ride, true);
        while (relay.runOnce() > 0) {
            // deliver
        }
    }

    private long promotionMoney(Actor driver) {
        return balances.mine(driver, 50).entries().stream().filter(e -> e.kind().equals("PROMOTION"))
                .mapToLong(DriverBalances.Entry::amountMinor).sum();
    }

    @Test
    void twoCashOrdersEarnTheRewardOnce() {
        promotions.create(admin, UUID.randomUUID(), draft("2 замовлення — 100 грн", 2, null, null, Repeat.ONCE),
                "test");
        DriverPromotions.Promotion offHours = promotions.create(admin, UUID.randomUUID(),
                draft("Тільки о 03:00", 1, LocalTime.of(3, 0), LocalTime.of(3, 1), Repeat.EVERY_PERIOD), "test");
        // Test the off-hours condition at noon UTC, regardless of when CI runs.
        OffsetDateTime acceptedAt = OffsetDateTime.now(ZoneOffset.UTC)
                .truncatedTo(ChronoUnit.DAYS).minusDays(1).plusHours(12);
        jdbc.sql("update driver_promotion set starts_at = :at where city_id = :city")
                .param("at", acceptedAt.minusHours(1)).param("city", cityId).update();
        TestRides.Driver driver = rides.driverNear(PICKUP);

        ride(driver, acceptedAt);
        assertThat(promotionMoney(driver.actor())).isZero();
        assertThat(promotions.progress(driver.actor())).filteredOn(p -> p.name().startsWith("2 "))
                .singleElement().satisfies(p -> {
                    assertThat(p.ordersDone()).isEqualTo(1);
                    assertThat(p.rewarded()).isFalse();
                });

        ride(driver, acceptedAt);
        assertThat(promotionMoney(driver.actor())).isEqualTo(10_000);
        ride(driver, acceptedAt);
        assertThat(promotionMoney(driver.actor())).as("ONCE pays once").isEqualTo(10_000);
        assertThat(promotions.progress(driver.actor())).filteredOn(p -> p.promotionId().equals(offHours.id()))
                .singleElement().satisfies(p -> assertThat(p.ordersDone()).as("outside its hours")
                        .isZero());
    }

    private OutboxMessage tripCompleted(UUID driverId) {
        UUID orderId = UUID.randomUUID();
        OffsetDateTime at = OffsetDateTime.now(ZoneOffset.UTC);
        String payload = """
                {"order_id":"%s","driver_id":"%s","payment_method":"CASH","city_id":"%s","accepted_at":"%s"}"""
                .formatted(orderId, driverId, cityId, at);
        return new OutboxMessage(UUID.randomUUID(), "TripCompleted", 1, "Order", orderId, 1, payload, null, at, 0);
    }

    /** Two trips finishing at once: the second waits for the first's count, so the target is seen and paid once. */
    @Test
    void tripsCountedAtOnceStillPayTheReward() throws Exception {
        promotions.create(admin, UUID.randomUUID(), draft("2 одночасно", 2, null, null, Repeat.ONCE), "test");
        TestRides.Driver driver = rides.driverNear(PICKUP);
        UUID driverId = driver.actor().id();
        TransactionTemplate tx = new TransactionTemplate(txManager);
        CompletableFuture<Integer> firstPid = new CompletableFuture<>();
        CompletableFuture<Integer> secondPid = new CompletableFuture<>();
        CountDownLatch firstCounted = new CountDownLatch(1);
        CountDownLatch commitFirst = new CountDownLatch(1);
        CompletableFuture<Void> first = CompletableFuture.runAsync(() -> tx.executeWithoutResult(s -> {
            firstPid.complete(jdbc.sql("select pg_backend_pid()").query(Integer.class).single());
            handler.handle(tripCompleted(driverId));
            firstCounted.countDown();
            try {
                commitFirst.await(10, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }));
        assertThat(firstCounted.await(10, TimeUnit.SECONDS)).isTrue();
        CompletableFuture<Void> second = CompletableFuture.runAsync(() -> tx.executeWithoutResult(s -> {
            secondPid.complete(jdbc.sql("select pg_backend_pid()").query(Integer.class).single());
            handler.handle(tripCompleted(driverId));
        }));
        try {
            int firstBackend = firstPid.get(5, TimeUnit.SECONDS);
            int secondBackend = secondPid.get(5, TimeUnit.SECONDS);
            long deadline = System.nanoTime() + TimeUnit.SECONDS.toNanos(5);
            boolean blocked = false;
            while (System.nanoTime() < deadline) {
                blocked = jdbc.sql("select :first = any(pg_blocking_pids(:second))")
                        .param("first", firstBackend).param("second", secondBackend).query(Boolean.class).single();
                if (blocked) break;
                TimeUnit.MILLISECONDS.sleep(10);
            }
            assertThat(blocked).as("PostgreSQL observed the second trip waiting for the first transaction").isTrue();
        } finally {
            commitFirst.countDown();
        }
        first.get(10, TimeUnit.SECONDS);
        second.get(10, TimeUnit.SECONDS);

        assertThat(promotionMoney(driver.actor())).isEqualTo(10_000);
    }

    @Test
    void periodsAndInputAreChecked() {
        Draft d = draft("x", 1, null, null, Repeat.EVERY_PERIOD);
        assertThat(JdbcDriverPromotions.periodIndex(d, d.startsAt().plus(9, ChronoUnit.DAYS))).isZero();
        assertThat(JdbcDriverPromotions.periodIndex(d, d.startsAt().plus(10, ChronoUnit.DAYS))).isEqualTo(1);
        assertThat(JdbcDriverPromotions.periodIndex(d, d.startsAt().plus(25, ChronoUnit.DAYS))).isEqualTo(2);

        assertThatThrownBy(() -> promotions.create(admin, UUID.randomUUID(), new Draft("x", 0, "UAH", cityId, 10, 5,
                null, null, null, null, Repeat.ONCE, Instant.now(), null), "test"))
                .isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(ErrorCode.VALIDATION_FAILED);
        assertThatThrownBy(() -> promotions.create(admin, UUID.randomUUID(), new Draft("x", 100, "UAH", cityId, 10, 5,
                null, null, null, "BITCOIN", Repeat.ONCE, Instant.now(), null), "test"))
                .isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(ErrorCode.VALIDATION_FAILED);
        assertThatThrownBy(() -> promotions.progress(admin)).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(ErrorCode.ACCESS_DENIED);
        assertThat(OffsetDateTime.now()).isNotNull();
    }
}
