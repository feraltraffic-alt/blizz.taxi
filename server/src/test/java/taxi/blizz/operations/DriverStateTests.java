package taxi.blizz.operations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.EventContracts;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.SessionService;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.pricing.QuoteService;

/**
 * Driver states and dispatch eligibility (issue #141, part 1): a free driver who pauses or closes the shift loses the
 * open offer at once and the search goes on (AC-11 rows "Пауза", "Выйти"; E2), a pause racing an accept has exactly
 * one winner (E5), and a fix less accurate than {@code blizz.presence.eligibility-accuracy-meters} takes the driver
 * out of new orders until an accurate one (REQ-GEO-04; E4). Its own city at longitude 143.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class DriverStateTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, 143.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 143.55);

    @Autowired Orders orders;
    @Autowired Dispatch dispatch;
    @Autowired Trips trips;
    @Autowired WorkSessions sessions;
    @Autowired SessionService auth;
    @Autowired QuoteService quotes;
    @Autowired JdbcClient jdbc;

    TestRides rides;
    UUID city;

    @BeforeEach
    void city() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        city = rides.city("test-driver-states", "UAH", 143);
        jdbc.sql("""
                        update dispatch_attempt set phase = 'STOPPED', next_action_at = null
                        where phase in ('PERSONAL', 'BROADCAST')
                          and order_id in (select id from ride_order where city_id = :c)""")
                .param("c", city).update();
        jdbc.sql("""
                        update ride_order set status = 'UNFULFILLED'
                        where city_id = :c and status in ('READY', 'SEARCHING', 'ASSIGNED', 'IN_SERVICE')""")
                .param("c", city).update();
    }

    // ------------------------------------------------------------ E2: pause and close revoke the open offer

    @Test
    void pausingWithAnOpenOfferRevokesItAndTheNextDriverGetsTheOrder() {
        TestRides.Driver first = rides.driverNear(PICKUP);
        OrderView order = rides.order(rides.client(), city, PICKUP, DROPOFF);
        OfferView offer = onlyOffer(first);
        TestRides.Driver second = driverAt(TestRides.north(PICKUP, 1500));

        DriverAvailability paused = sessions.pause(first.actor(), UUID.randomUUID(), first.device(), version(first));

        assertThat(paused.intent()).isEqualTo("NOT_ACCEPTING");
        assertThat(paused.occupancy()).isEqualTo("FREE");
        assertThat(offerState(offer.id())).isEqualTo("REVOKED");
        assertThat(dispatch.offers(first.actor())).isEmpty();
        assertCode(() -> dispatch.accept(first.actor(), first.device(), UUID.randomUUID(), offer.id()),
                ErrorCode.OFFER_REVOKED);
        assertThat(revocations(offer.id())).containsExactly("DRIVER_PAUSED");
        OfferView next = onlyOffer(second);
        assertThat(next.orderId()).as("the search went on at once, not after the 15 s of the offer")
                .isEqualTo(order.id());
        EventContracts.assertOrderEventsConform(jdbc, order.id(), "OfferRevoked", "OfferMade");
    }

    @Test
    void closingWithAnOpenOfferRevokesItAndClosesTheShift() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        OrderView order = rides.order(rides.client(), city, PICKUP, DROPOFF);
        OfferView offer = onlyOffer(driver);

        DriverAvailability closed = sessions.close(driver.actor(), UUID.randomUUID(), driver.device(), version(driver));

        assertThat(closed.sessionState()).isEqualTo("CLOSED");
        assertThat(closed.occupancy()).isEqualTo("FREE");
        assertThat(offerState(offer.id())).isEqualTo("REVOKED");
        assertCode(() -> dispatch.accept(driver.actor(), driver.device(), UUID.randomUUID(), offer.id()),
                ErrorCode.OFFER_REVOKED);
        assertThat(revocations(offer.id())).containsExactly("DRIVER_CLOSED");
        assertThat(orders.get(order.id()).searchPhase()).as("nobody else near: straight to the ALL tab")
                .isEqualTo("BROADCAST");
    }

    @Test
    void aRepeatedPauseRevokesOnceAndAnswersTheSame() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        rides.order(rides.client(), city, PICKUP, DROPOFF);
        OfferView offer = onlyOffer(driver);
        UUID command = UUID.randomUUID();
        long version = version(driver);

        DriverAvailability first = sessions.pause(driver.actor(), command, driver.device(), version);
        DriverAvailability repeat = sessions.pause(driver.actor(), command, driver.device(), version);

        assertThat(repeat).isEqualTo(first);
        assertThat(revocations(offer.id())).hasSize(1);
        assertCode(() -> sessions.pause(driver.actor(), UUID.randomUUID(), driver.device(), version),
                ErrorCode.VERSION_CONFLICT);
    }

    @Test
    void pausingWithoutAnOfferRevokesNothingElse() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        TestRides.Driver offered = driverAt(TestRides.north(PICKUP, 200));
        rides.order(rides.client(), city, PICKUP, DROPOFF);
        OfferView offer = onlyOffer(offered);

        sessions.pause(driver.actor(), UUID.randomUUID(), driver.device(), version(driver));

        assertThat(offerState(offer.id())).as("another driver's offer").isEqualTo("OPEN");
        assertThat(revocations(offer.id())).isEmpty();
    }

    // ------------------------------------------------------------ E5: pause and accept at once

    @Test
    void pauseAndAcceptAtOnceHaveExactlyOneWinner() throws Exception {
        ExecutorService pool = Executors.newFixedThreadPool(2);
        try {
            int accepted = 0;
            int paused = 0;
            for (int round = 0; round < 30; round++) {
                TestRides.Driver driver = rides.driverNear(PICKUP);
                OrderView order = rides.order(rides.client(), city, PICKUP, DROPOFF);
                OfferView offer = onlyOffer(driver);
                long version = version(driver);
                CountDownLatch start = new CountDownLatch(1);
                Future<AssignmentView> accept = pool.submit(() -> {
                    start.await();
                    return dispatch.accept(driver.actor(), driver.device(), UUID.randomUUID(), offer.id());
                });
                Future<DriverAvailability> pause = pool.submit(() -> {
                    start.await();
                    return sessions.pause(driver.actor(), UUID.randomUUID(), driver.device(), version);
                });
                start.countDown();

                DriverAvailability afterPause = pause.get();
                Throwable acceptFailure = null;
                try {
                    accept.get();
                } catch (java.util.concurrent.ExecutionException e) {
                    acceptFailure = e.getCause();
                }
                int assignments = jdbc.sql("""
                                select count(*) from assignment
                                where order_id = :id and state in ('RESERVED', 'COMMITTED')""")
                        .param("id", order.id()).query(Integer.class).single();
                if (acceptFailure == null) {
                    accepted++;
                    assertThat(assignments).as("round %d", round).isEqualTo(1);
                    assertThat(afterPause.intent()).as("round %d: busy, so after the trip", round)
                            .isEqualTo("PAUSE_AFTER_CURRENT");
                    assertThat(afterPause.occupancy()).as("round %d", round).isEqualTo("TO_PICKUP");
                    assertThat(offerState(offer.id())).as("round %d", round).isEqualTo("ACCEPTED");
                } else {
                    paused++;
                    assertThat(acceptFailure).as("round %d: a domain answer, never a 500", round)
                            .isInstanceOf(DomainException.class);
                    assertThat(((DomainException) acceptFailure).code()).as("round %d", round)
                            .isEqualTo(ErrorCode.OFFER_REVOKED);
                    assertThat(assignments).as("round %d", round).isZero();
                    assertThat(afterPause.intent()).as("round %d", round).isEqualTo("NOT_ACCEPTING");
                    assertThat(afterPause.occupancy()).as("round %d", round).isEqualTo("FREE");
                    assertThat(offerState(offer.id())).as("round %d", round).isEqualTo("REVOKED");
                }
                // Out of the next rounds: the driver is paused or busy either way.
            }
            assertThat(accepted + paused).isEqualTo(30);
        } finally {
            pool.shutdownNow();
        }
    }

    // ------------------------------------------------------------ E4: location accuracy

    @Test
    void anInaccurateFixTakesTheDriverOutOfNewOrdersUntilAnAccurateOne() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        heartbeat(driver, TestRides.north(PICKUP, 300), 250.0);

        DriverAvailability inaccurate = sessions.availability(driver.actor().id());
        assertThat(inaccurate.eligible()).isFalse();
        assertThat(inaccurate.ineligibleReasons()).containsExactly("LOCATION_INACCURATE");
        assertThat(inaccurate.geolocation()).as("the fix itself is fresh").isEqualTo("FRESH");

        OrderView missed = rides.order(rides.client(), city, PICKUP, DROPOFF);
        assertThat(dispatch.offers(driver.actor())).as("no personal offer").isEmpty();
        assertThat(orders.get(missed.id()).searchPhase()).isEqualTo("BROADCAST");
        assertThat(dispatch.broadcast(driver.actor())).as("nor the ALL tab").isEmpty();
        assertCode(() -> dispatch.claim(driver.actor(), driver.device(), UUID.randomUUID(), missed.id()),
                ErrorCode.DRIVER_NOT_ELIGIBLE);
        assertThat(journalReason(missed.id(), driver)).isEqualTo("INACCURATE_LOCATION");

        heartbeat(driver, TestRides.north(PICKUP, 290), 12.0);

        assertThat(sessions.availability(driver.actor().id()).eligible()).isTrue();
        assertThat(dispatch.broadcast(driver.actor())).extracting(BroadcastOrderView::orderId).contains(missed.id());
        OrderView next = rides.order(rides.client(), city, PICKUP, DROPOFF);
        assertThat(onlyOffer(driver).orderId()).isEqualTo(next.id());
    }

    @Test
    void theAccuracyLimitItselfIsStillAccurateAndAFixWithoutAccuracyIsTakenAsTheContractAllows() {
        TestRides.Driver driver = rides.driverNear(PICKUP);

        heartbeat(driver, TestRides.north(PICKUP, 300), 100.0);
        assertThat(sessions.availability(driver.actor().id()).eligible()).as("exactly at the limit").isTrue();

        heartbeat(driver, TestRides.north(PICKUP, 300), 100.5);
        assertThat(sessions.availability(driver.actor().id()).ineligibleReasons())
                .containsExactly("LOCATION_INACCURATE");

        heartbeat(driver, TestRides.north(PICKUP, 300), null);
        assertThat(sessions.availability(driver.actor().id()).eligible())
                .as("accuracy_m is optional in the Location contract").isTrue();
    }

    // ------------------------------------------------------------ helpers

    private static final java.util.concurrent.atomic.AtomicLong SEQUENCE = new java.util.concurrent.atomic.AtomicLong(
            1_000);

    /** A second driver at {@code at}: online about 1 km north of it, then moved there. */
    private TestRides.Driver driverAt(GeoPoint at) {
        TestRides.Driver driver = rides.driverNear(at);
        heartbeat(driver, at, 5.0);
        return driver;
    }

    private void heartbeat(TestRides.Driver driver, GeoPoint at, Double accuracy) {
        TestRides.timePassed(jdbc, driver.actor().id());
        sessions.heartbeat(driver.actor(), driver.device(),
                new LocationFix(at, accuracy, OffsetDateTime.now(), SEQUENCE.incrementAndGet()));
    }

    private long version(TestRides.Driver driver) {
        return sessions.availability(driver.actor().id()).sessionVersion();
    }

    private OfferView onlyOffer(TestRides.Driver driver) {
        List<OfferView> offers = dispatch.offers(driver.actor());
        assertThat(offers).hasSize(1);
        return offers.getFirst();
    }

    private String offerState(UUID offerId) {
        return jdbc.sql("select state from offer where id = :id").param("id", offerId).query(String.class).single();
    }

    /** The reasons of the OfferRevoked events of this offer, in the outbox. */
    private List<String> revocations(UUID offerId) {
        return jdbc.sql("""
                        select payload ->> 'reason' from outbox
                        where event_type = 'OfferRevoked' and payload ->> 'offer_id' = :offer""")
                .param("offer", offerId.toString()).query(String.class).list();
    }

    /** Why the driver was left out of the last dispatch round of the order, as the journal recorded it. */
    private String journalReason(UUID orderId, TestRides.Driver driver) {
        return jdbc.sql("""
                        select c ->> 'reason' from dispatch_round r, jsonb_array_elements(r.candidates) c
                        where r.order_id = :order and c ->> 'driver_id' = :driver
                        order by r.at desc limit 1""")
                .param("order", orderId).param("driver", driver.actor().id().toString()).query(String.class)
                .single();
    }

    private static void assertCode(ThrowingCallable call, ErrorCode code) {
        assertThatThrownBy(call).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }
}
