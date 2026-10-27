package taxi.blizz.promotions.internal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.time.Instant;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;
import java.util.UUID;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
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

    TestRides rides;
    UUID cityId;
    Actor admin;

    @BeforeEach
    void setUp() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        cityId = rides.city("test-driver-promotions", "UAH", 5);
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, state, created_at, updated_at)
                        values (:id, :login, 'Fleet', 'ADMIN', :permissions, 'ACTIVE', now(), now())""")
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

    private void ride(TestRides.Driver driver) {
        TestRides.Ride ride = rides.started(cityId, driver, PICKUP, DROPOFF);
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
        TestRides.Driver driver = rides.driverNear(PICKUP);

        ride(driver);
        assertThat(promotionMoney(driver.actor())).isZero();
        assertThat(promotions.progress(driver.actor())).filteredOn(p -> p.name().startsWith("2 "))
                .singleElement().satisfies(p -> {
                    assertThat(p.ordersDone()).isEqualTo(1);
                    assertThat(p.rewarded()).isFalse();
                });

        ride(driver);
        assertThat(promotionMoney(driver.actor())).isEqualTo(10_000);
        ride(driver);
        assertThat(promotionMoney(driver.actor())).as("ONCE pays once").isEqualTo(10_000);
        assertThat(promotions.progress(driver.actor())).filteredOn(p -> p.promotionId().equals(offHours.id()))
                .singleElement().satisfies(p -> assertThat(p.ordersDone()).as("outside its hours")
                        .isZero());
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
