package taxi.blizz.operations;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.configuration.ServiceSettings;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.SessionService;
import taxi.blizz.operations.internal.DispatchWorker;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.pricing.QuoteService;

/**
 * Issue #487, ADR 0018 B12, cases 14–17: personal offers let expire in a row take the driver off line; a low acceptance
 * rate over 7 days warns, then pauses, and two weeks running raise a flag; far pickups never count; each part can be
 * switched off. Offers of the past are inserted as rows; the last one of each test is a real offer. Its own city at
 * longitude 167.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class OfferDisciplineTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, 167.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 167.55);

    @Autowired Orders orders;
    @Autowired Dispatch dispatch;
    @Autowired Trips trips;
    @Autowired WorkSessions sessions;
    @Autowired SessionService auth;
    @Autowired QuoteService quotes;
    @Autowired ServiceSettings settings;
    @Autowired DispatchWorker worker;
    @Autowired JdbcClient jdbc;

    TestRides rides;
    UUID city;

    @BeforeEach
    void city() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        city = rides.city("test-offer-discipline", "UAH", 167);
        stopSearches();
    }

    // ------------------------------------------------------------ case 14: missed in a row

    @Test
    void case14_threeMissedInARowTakeTheDriverOffLineTwoDoNotAndAnAnswerStartsAgain() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        miss(driver);
        miss(driver);
        assertThat(intent(driver)).as("2 missed").isEqualTo("ACCEPTING");
        answer(driver);
        miss(driver);
        miss(driver);
        assertThat(intent(driver)).as("an accepted offer started the count again").isEqualTo("ACCEPTING");
        miss(driver);
        assertThat(intent(driver)).as("3 in a row").isEqualTo("NOT_ACCEPTING");
        assertThat(events(driver, "DriverOffersMissed")).isEqualTo(1);
        assertThat(jdbc.sql("""
                        select count(*) from outbox where event_type = 'WorkSessionIntentChanged'
                          and payload ->> 'intent' = 'NOT_ACCEPTING'
                          and aggregate_id = (select id from work_session where driver_id = :d and state = 'OPEN')""")
                .param("d", driver.actor().id()).query(Integer.class).single()).isEqualTo(1);

        // One tap brings the driver back, and the count starts from zero.
        DriverAvailability now = sessions.availability(driver.actor().id());
        sessions.resume(driver.actor(), UUID.randomUUID(), driver.device(), now.sessionVersion());
        miss(driver);
        assertThat(intent(driver)).isEqualTo("ACCEPTING");
    }

    // ------------------------------------------------------------ case 15: the acceptance rate

    @Test
    void case15_belowThirtyPercentOfTwentyOffersPausesNineteenOffersDoNothing() {
        TestRides.Driver few = rides.driverNear(PICKUP);
        past(few, 4, 14, 0, 2);
        decline(few);
        assertThat(pauses(few)).as("19 offers").isZero();
        stopSessions(few);

        TestRides.Driver low = rides.driverNear(PICKUP);
        past(low, 5, 14, 0, 2);
        decline(low);
        assertThat(pauses(low)).as("5 of 20 is 25 %").isEqualTo(1);
        assertThat(jdbc.sql("select kind from driver_pause where driver_id = :d").param("d", low.actor().id())
                .query(String.class).single()).isEqualTo("ACCEPTANCE");
        assertThat(sessions.availability(low.actor().id()).ineligibleReasons()).contains("ACCEPTANCE_PAUSE")
                .doesNotContain("CANCELLATION_PAUSE");
        assertThat(jdbc.sql("""
                        select payload ->> 'kind' from outbox where event_type = 'DriverPaused'
                          and payload ->> 'driver_id' = :d""").param("d", low.actor().id().toString())
                .query(String.class).single()).isEqualTo("ACCEPTANCE");
        assertThat(flags(low)).as("only one week").isZero();
    }

    @Test
    void case15_belowFiftyPercentWarnsOnceADay() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        past(driver, 8, 11, 0, 2);
        decline(driver);
        assertThat(events(driver, "DriverAcceptanceWarning")).as("8 of 20 is 40 %").isEqualTo(1);
        decline(driver);
        assertThat(events(driver, "DriverAcceptanceWarning")).as("once in 24 hours").isEqualTo(1);
        assertThat(pauses(driver)).isZero();
    }

    @Test
    void case15_belowThePauseThresholdInBothOfTheLastTwoWeeksRaisesAFlag() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        past(driver, 2, 18, 0, 10);
        past(driver, 2, 17, 0, 2);
        decline(driver);
        assertThat(pauses(driver)).isEqualTo(1);
        assertThat(flags(driver)).isEqualTo(1);
    }

    // ------------------------------------------------------------ case 16: what never counts

    @Test
    void case16_offersWithAFarPickupNeverCount() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        for (int i = 0; i < 3; i++) {
            UUID offer = offer(driver);
            jdbc.sql("update offer set distance_m = 3001 where id = :id").param("id", offer).update();
            expire(offer);
        }
        assertThat(intent(driver)).isEqualTo("ACCEPTING");
        past(driver, 0, 25, 0, 2);
        jdbc.sql("update offer set distance_m = 5000 where driver_id = :d").param("d", driver.actor().id()).update();
        decline(driver);
        assertThat(pauses(driver)).as("only one near offer counts").isZero();
    }

    // ------------------------------------------------------------ case 17: switched off

    @Test
    void case17_eachPartSwitchedOffCountsNothing() {
        withOffers(new ServiceSettings.OfferDiscipline(false, 3, false, 20, 50, 30, 3000), () -> {
            TestRides.Driver driver = rides.driverNear(PICKUP);
            miss(driver);
            miss(driver);
            miss(driver);
            assertThat(intent(driver)).isEqualTo("ACCEPTING");
            past(driver, 2, 17, 0, 2);
            decline(driver);
            assertThat(pauses(driver)).isZero();
            assertThat(events(driver, "DriverAcceptanceWarning")).isZero();
        });
    }

    // ------------------------------------------------------------ helpers

    /** A new order offered to the driver, the only one near. */
    private UUID offer(TestRides.Driver driver) {
        rides.moveTo(driver, TestRides.north(PICKUP, 1000));
        rides.order(rides.client(), city, PICKUP, DROPOFF);
        return dispatch.offers(driver.actor()).getFirst().id();
    }

    private void miss(TestRides.Driver driver) {
        expire(offer(driver));
    }

    private void expire(UUID offer) {
        jdbc.sql("update offer set expires_at = now() - interval '1 second' where id = :id").param("id", offer)
                .update();
        jdbc.sql("""
                        update dispatch_attempt set next_action_at = now() - interval '1 second'
                        where order_id = (select order_id from offer where id = :id)""").param("id", offer).update();
        worker.runOnce();
        assertThat(jdbc.sql("select state from offer where id = :id").param("id", offer).query(String.class)
                .single()).isEqualTo("EXPIRED");
        stopSearches();
    }

    private void decline(TestRides.Driver driver) {
        dispatch.reject(driver.actor(), UUID.randomUUID(), offer(driver));
        stopSearches();
    }

    /** Accepts an offer and gives the order back at once (within the grace window, so not a cancellation). */
    private void answer(TestRides.Driver driver) {
        UUID offer = offer(driver);
        dispatch.accept(driver.actor(), driver.device(), UUID.randomUUID(), offer);
        TripView trip = trips.current(driver.actor()).orElseThrow();
        trips.withdraw(driver.actor(), UUID.randomUUID(), trip.id(), trip.version(), "VEHICLE_PROBLEM", null);
        stopSearches();
    }

    /** Offers of {@code daysAgo} days ago (1 km pickup): accepted, declined and missed ones. */
    private void past(TestRides.Driver driver, int accepted, int declined, int missed, int daysAgo) {
        OrderView order = rides.order(rides.client(), city, PICKUP, DROPOFF);
        stopSearches();
        int n = 0;
        for (String state : java.util.Collections.nCopies(accepted, "ACCEPTED")) {
            pastOffer(driver, order, state, daysAgo, n++);
        }
        for (String state : java.util.Collections.nCopies(declined, "REJECTED")) {
            pastOffer(driver, order, state, daysAgo, n++);
        }
        for (String state : java.util.Collections.nCopies(missed, "EXPIRED")) {
            pastOffer(driver, order, state, daysAgo, n++);
        }
    }

    private void pastOffer(TestRides.Driver driver, OrderView order, String state, int daysAgo, int n) {
        UUID attempt = UUID.randomUUID();
        jdbc.sql("""
                        insert into dispatch_attempt (id, order_id, generation, phase, total_deadline, created_at)
                        values (:id, :o, (select coalesce(max(generation), 0) + 1 from dispatch_attempt
                                          where order_id = :o), 'STOPPED', now(), now())""")
                .param("id", attempt).param("o", order.id()).update();
        jdbc.sql("""
                        insert into offer (id, order_id, attempt_id, driver_id, state, distance_m, expires_at,
                                           created_at, closed_at)
                        values (gen_random_uuid(), :o, :a, :d, :state, 1000,
                                now() - make_interval(days => :days, secs => :n),
                                now() - make_interval(days => :days, secs => :n + 20),
                                now() - make_interval(days => :days, secs => :n))""")
                .param("o", order.id()).param("a", attempt).param("d", driver.actor().id()).param("state", state)
                .param("days", daysAgo).param("n", n).update();
    }

    private void stopSearches() {
        jdbc.sql("""
                        update dispatch_attempt set phase = 'STOPPED', next_action_at = null
                        where phase in ('PERSONAL', 'BROADCAST')
                          and order_id in (select id from ride_order where city_id = :c)""")
                .param("c", city).update();
        jdbc.sql("update offer set state = 'REVOKED', closed_at = now() where state = 'OPEN' and order_id in "
                + "(select id from ride_order where city_id = :c)").param("c", city).update();
        jdbc.sql("""
                        update driver_capacity set occupancy = 'FREE' where occupancy = 'OFFERED'
                          and driver_id in (select driver_id from work_session where city_id = :c and state = 'OPEN')""")
                .param("c", city).update();
        jdbc.sql("""
                        update ride_order set status = 'UNFULFILLED'
                        where city_id = :c and status in ('READY', 'SEARCHING')""")
                .param("c", city).update();
    }

    private void stopSessions(TestRides.Driver driver) {
        jdbc.sql("update work_session set state = 'CLOSED', closed_at = now() where driver_id = :d and state <> 'CLOSED'")
                .param("d", driver.actor().id()).update();
    }

    private String intent(TestRides.Driver driver) {
        return jdbc.sql("select intent from work_session where driver_id = :d and state = 'OPEN'")
                .param("d", driver.actor().id()).query(String.class).single();
    }

    private int events(TestRides.Driver driver, String type) {
        return jdbc.sql("select count(*) from outbox where event_type = :t and payload ->> 'driver_id' = :d")
                .param("t", type).param("d", driver.actor().id().toString()).query(Integer.class).single();
    }

    private int pauses(TestRides.Driver driver) {
        return jdbc.sql("select count(*) from driver_pause where driver_id = :d").param("d", driver.actor().id())
                .query(Integer.class).single();
    }

    private int flags(TestRides.Driver driver) {
        return jdbc.sql("select count(*) from driver_risk_flag where driver_id = :d and kind = 'LOW_ACCEPTANCE'")
                .param("d", driver.actor().id()).query(Integer.class).single();
    }

    private void withOffers(ServiceSettings.OfferDiscipline offers, Runnable body) {
        Actor admin = staff(ServiceSettings.MANAGE_PERMISSION);
        ServiceSettings.Version before = settings.current();
        ServiceSettings.Settings s = before.settings();
        ServiceSettings.Version changed = settings.change(admin, UUID.randomUUID(), before.version(),
                new ServiceSettings.Settings(s.brand(), s.languages(), s.calls(), s.preorders(), s.ratings(), s.tips(),
                        s.orders(), s.cashNotReceived(), s.appVersions(), s.staffTopUps(), s.riderDebts(),
                        s.driverDiscipline(), offers), "Test of ADR 0018 B12");
        try {
            body.run();
        } finally {
            settings.change(admin, UUID.randomUUID(), changed.version(), s, "Back after the test");
        }
    }

    private Actor staff(String permission) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, all_cities, state, created_at,
                                                updated_at)
                        values (:id, :login, 'Settings', 'ADMIN', :permissions, true, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "offers-" + id).param("permissions", new String[] {permission})
                .update();
        return new Actor(SubjectType.STAFF, id);
    }
}
