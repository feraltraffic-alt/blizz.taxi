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
import taxi.blizz.TestQuotes;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.SessionService;
import taxi.blizz.operations.internal.DispatchWorker;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.pricing.FinalFares;
import taxi.blizz.pricing.QuoteService;

/**
 * Issue #143, part 2 (REQ-OPS-04, REQ-DSP-10, REQ-DRV-07): a dispatcher offers an order to a chosen driver through the
 * same offer path as an automatic offer (E1, E2), and the offer tells the driver the terms — the server time, what
 * kind of sum the price is, the expected earnings by the settlement's own split — and the rider's note and entrance.
 * Its own city at longitude 153; the neighbouring city at 154.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class ManualOfferTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, 153.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 153.55);

    @Autowired Orders orders;
    @Autowired Dispatch dispatch;
    @Autowired Trips trips;
    @Autowired WorkSessions sessions;
    @Autowired SessionService auth;
    @Autowired QuoteService quotes;
    @Autowired FinalFares fares;
    @Autowired DispatchWorker worker;
    @Autowired JdbcClient jdbc;
    @Autowired org.springframework.transaction.support.TransactionTemplate tx;

    TestRides rides;
    UUID city;
    UUID otherCity;

    @BeforeEach
    void city() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        city = rides.city("test-manual-offer", "UAH", 153);
        otherCity = rides.city("test-manual-offer-b", "UAH", 154);
        for (UUID c : List.of(city, otherCity)) {
            jdbc.sql("""
                            update dispatch_attempt set phase = 'STOPPED', next_action_at = null
                            where phase in ('PERSONAL', 'BROADCAST')
                              and order_id in (select id from ride_order where city_id = :c)""")
                    .param("c", c).update();
            jdbc.sql("""
                            update ride_order set status = 'UNFULFILLED'
                            where city_id = :c and status in ('READY', 'SEARCHING', 'ASSIGNED', 'IN_SERVICE')""")
                    .param("c", c).update();
        }
    }

    // ------------------------------------------------------------ E1

    @Test
    void aManualOfferToAnEligibleDriverIsAnOrdinaryOfferThatExpiresLikeAnyOther() {
        OrderView order = orderNobodyNear();
        TestRides.Driver chosen = rides.driverNear(TestRides.north(PICKUP, 1500));
        Actor dispatcher = staff(Orders.OFFER_PERMISSION);
        UUID command = UUID.randomUUID();

        OrderView offered = orders.manualOffer(dispatcher, command, order.id(), chosen.actor().id(), "Regular client");

        OfferView offer = dispatch.offers(chosen.actor()).getFirst();
        assertThat(offer.orderId()).isEqualTo(order.id());
        assertThat(offer.expiresAt()).isBefore(OffsetDateTime.now().plusSeconds(16));
        assertThat(jdbc.sql("select occupancy from driver_capacity where driver_id = :d")
                .param("d", chosen.actor().id()).query(String.class).single()).isEqualTo("OFFERED");
        assertThat(orders.manualOffer(dispatcher, command, order.id(), chosen.actor().id(), "Regular client"))
                .as("repeat").isEqualTo(offered);
        assertThat(jdbc.sql("""
                        select payload ->> 'source' from outbox
                        where event_type = 'OfferMade' and payload ->> 'offer_id' = :o""")
                .param("o", offer.id().toString()).query(String.class).single()).isEqualTo("MANUAL");
        assertThat(jdbc.sql("""
                        select count(*) from audit_log where action = 'order.manual_offer' and resource_id = :o""")
                .param("o", order.id().toString()).query(Integer.class).single()).isEqualTo(1);

        // It expires like any other offer: the driver is free again, the order still searches.
        jdbc.sql("update offer set expires_at = now() - interval '1 second' where id = :id")
                .param("id", offer.id()).update();
        jdbc.sql("update dispatch_attempt set next_action_at = now() - interval '1 second' where order_id = :o")
                .param("o", order.id()).update();
        worker.runOnce();
        assertThat(jdbc.sql("select state from offer where id = :id").param("id", offer.id()).query(String.class)
                .single()).isEqualTo("EXPIRED");
        assertThat(orders.get(order.id()).status()).isEqualTo("SEARCHING");
        assertCode(() -> dispatch.accept(chosen.actor(), chosen.device(), UUID.randomUUID(), offer.id()),
                ErrorCode.OFFER_EXPIRED);
    }

    @Test
    void aManualOfferToAnIneligibleDriverIsRefused() {
        OrderView order = orderNobodyNear();
        Actor dispatcher = staff(Orders.OFFER_PERMISSION);
        TestRides.Driver otherCityDriver = rides.driverNear(new GeoPoint(-39.5, 154.01));
        TestRides.Driver busy = rides.driverNear(TestRides.north(PICKUP, 1500));
        rides.assigned(city, busy, TestRides.north(PICKUP, 2500), DROPOFF);
        TestRides.Driver stale = rides.driverNear(TestRides.north(PICKUP, 1600));
        jdbc.sql("""
                        update work_session set last_location_at = now() - interval '1 minute'
                        where driver_id = :d and state = 'OPEN'""")
                .param("d", stale.actor().id()).update();
        TestRides.Driver far = rides.driverNear(TestRides.north(PICKUP, 20_000));

        assertCode(() -> orders.manualOffer(dispatcher, UUID.randomUUID(), order.id(), otherCityDriver.actor().id(),
                "x"), ErrorCode.DRIVER_NOT_ELIGIBLE);
        assertThat(codeOf(() -> orders.manualOffer(dispatcher, UUID.randomUUID(), order.id(), busy.actor().id(),
                "x"))).isIn(ErrorCode.DRIVER_BUSY, ErrorCode.DRIVER_NOT_ELIGIBLE);
        assertCode(() -> orders.manualOffer(dispatcher, UUID.randomUUID(), order.id(), stale.actor().id(), "x"),
                ErrorCode.DRIVER_NOT_ELIGIBLE);
        assertCode(() -> orders.manualOffer(dispatcher, UUID.randomUUID(), order.id(), far.actor().id(), "x"),
                ErrorCode.DRIVER_NOT_ELIGIBLE);
        assertThat(jdbc.sql("select count(*) from offer where order_id = :o").param("o", order.id())
                .query(Integer.class).single()).isZero();
    }

    @Test
    void theManualOfferNeedsThePermissionAReasonAndNoOtherOpenOffer() {
        TestRides.Driver nearest = rides.driverNear(PICKUP);
        TestRides.Driver chosen = rides.driverNear(TestRides.north(PICKUP, 1500));
        OrderView order = rides.order(rides.client(), city, PICKUP, DROPOFF);
        assertThat(dispatch.offers(nearest.actor())).hasSize(1);

        assertCode(() -> orders.manualOffer(staff(Orders.REASSIGN_PERMISSION), UUID.randomUUID(), order.id(),
                chosen.actor().id(), "x"), ErrorCode.ACCESS_DENIED);
        assertCode(() -> orders.manualOffer(staff(Orders.OFFER_PERMISSION), UUID.randomUUID(), order.id(),
                chosen.actor().id(), " "), ErrorCode.VALIDATION_FAILED);
        assertCode(() -> orders.manualOffer(staff(Orders.OFFER_PERMISSION), UUID.randomUUID(), order.id(),
                chosen.actor().id(), "Regular client"), ErrorCode.STATE_CONFLICT);
        assertThat(dispatch.offers(nearest.actor())).as("nothing revoked").hasSize(1);
        assertThat(dispatch.offers(chosen.actor())).isEmpty();
    }

    // ------------------------------------------------------------ E2

    @Test
    void aManualAndAnAutomaticOfferRacingForOneDriverMakeOneOfferAndNeverTwoAssignments() throws Exception {
        ExecutorService pool = Executors.newFixedThreadPool(2);
        Actor dispatcher = staff(Orders.OFFER_PERMISSION);
        int manualWon = 0;
        int automaticWon = 0;
        try {
            for (int round = 0; round < 30; round++) {
                OrderView waiting = orderNobodyNear();
                TestRides.Driver driver = rides.driverNear(TestRides.north(PICKUP, 1500));
                Actor rider = rides.client();
                // Creating the other order takes longer than the manual offer: holding the manual one back 0-180 ms
                // in turn lets both sides win.
                long delay = (round % 4) * 60L;
                CountDownLatch start = new CountDownLatch(1);
                Future<?> manual = pool.submit(() -> {
                    start.await();
                    Thread.sleep(delay);
                    return orders.manualOffer(dispatcher, UUID.randomUUID(), waiting.id(), driver.actor().id(), "Race");
                });
                Future<OrderView> automatic = pool.submit(() -> {
                    start.await();
                    return rides.order(rider, city, TestRides.north(PICKUP, 1200), DROPOFF);
                });
                start.countDown();
                OrderView other = automatic.get();
                try {
                    manual.get();
                } catch (java.util.concurrent.ExecutionException e) {
                    assertThat(e.getCause()).as("round %d: a domain answer, never a 500", round)
                            .isInstanceOf(DomainException.class);
                }
                List<OfferView> open = dispatch.offers(driver.actor());
                assertThat(open).as("round %d: one offer at a time", round).hasSize(1);
                if (open.getFirst().orderId().equals(waiting.id())) {
                    manualWon++;
                } else {
                    assertThat(open.getFirst().orderId()).isEqualTo(other.id());
                    automaticWon++;
                }
                dispatch.accept(driver.actor(), driver.device(), UUID.randomUUID(), open.getFirst().id());
                assertThat(jdbc.sql("""
                                select count(*) from assignment
                                where driver_id = :d and state in ('RESERVED', 'COMMITTED')""")
                        .param("d", driver.actor().id()).query(Integer.class).single())
                        .as("round %d: one assignment", round).isEqualTo(1);
            }
        } finally {
            pool.shutdownNow();
        }
        assertThat(manualWon + automaticWon).isEqualTo(30);
        assertThat(manualWon).as("the manual offer won some rounds").isPositive();
        assertThat(automaticWon).as("the automatic offer won some rounds").isPositive();
    }

    @Test
    void aManualOfferThatWaitsForTheDriversCapacityReadsItAgainAfterTheWait() throws Exception {
        OrderView order = orderNobodyNear();
        TestRides.Driver driver = rides.driverNear(TestRides.north(PICKUP, 1500));
        Actor dispatcher = staff(Orders.OFFER_PERMISSION);
        CountDownLatch locked = new CountDownLatch(1);
        CountDownLatch release = new CountDownLatch(1);
        ExecutorService pool = Executors.newFixedThreadPool(2);
        try {
            // Another offer in flight: it holds the driver's capacity and makes it OFFERED, not yet committed.
            Future<?> other = pool.submit(() -> tx.executeWithoutResult(status -> {
                jdbc.sql("select driver_id from driver_capacity where driver_id = :d for update")
                        .param("d", driver.actor().id()).query(UUID.class).single();
                jdbc.sql("update driver_capacity set occupancy = 'OFFERED' where driver_id = :d")
                        .param("d", driver.actor().id()).update();
                locked.countDown();
                try {
                    release.await();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }));
            locked.await();
            Future<OrderView> manual = pool.submit(() -> orders.manualOffer(dispatcher, UUID.randomUUID(), order.id(),
                    driver.actor().id(), "Waits for the lock"));
            Thread.sleep(500); // the manual offer has read the driver as free and waits for the capacity lock
            release.countDown();
            other.get();

            assertThatThrownBy(manual::get).hasCauseInstanceOf(DomainException.class)
                    .satisfies(e -> assertThat(((DomainException) e.getCause()).code())
                            .isEqualTo(ErrorCode.DRIVER_BUSY));
            assertThat(jdbc.sql("select count(*) from offer where order_id = :o").param("o", order.id())
                    .query(Integer.class).single()).isZero();
        } finally {
            pool.shutdownNow();
        }
    }

    // ------------------------------------------------------------ the offer's terms (REQ-DRV-07)

    @Test
    void theOfferShowsTheServerTimeThePriceKindAndTheEarningsTheSettlementPays() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        OrderView order = rides.order(rides.client(), city, PICKUP, DROPOFF);
        OfferView offer = dispatch.offers(driver.actor()).getFirst();

        assertThat(offer.serverTime()).isBetween(OffsetDateTime.now().minusSeconds(5), OffsetDateTime.now());
        assertThat(offer.secondsLeft()).isBetween(1L, 15L);
        assertThat(offer.priceKind()).isEqualTo(OfferView.PRICE_FIXED);
        assertThat(offer.expectedEarningsMinor()).isPositive().isLessThan(offer.priceMinor());

        // An ordinary ride without paid waiting: the estimate is exactly what the settlement pays the driver.
        AssignmentView assignment = dispatch.accept(driver.actor(), driver.device(), UUID.randomUUID(), offer.id());
        rides.moveTo(driver, TestRides.north(PICKUP, 30));
        TripView trip = trips.current(driver.actor()).orElseThrow();
        TripView started = trips.start(driver.actor(), UUID.randomUUID(), trip.id(), trip.version(), "Rider waved");
        trips.complete(driver.actor(), UUID.randomUUID(), started.id(), started.version(), OffsetDateTime.now(), true);
        assertThat(assignment.orderId()).isEqualTo(order.id());
        assertThat(fares.ofOrder(order.id()).orElseThrow().driverShareMinor())
                .isEqualTo(offer.expectedEarningsMinor());
    }

    @Test
    void theRidersNoteAndEntranceReachTheOfferTheTripAndTheOrder() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        Actor rider = rides.client();
        UUID quote = new TestQuotes(jdbc, quotes).quote(rider, city, "STANDARD", PICKUP, DROPOFF).id();
        OrderView order = orders.create(rider, UUID.randomUUID(), withNote(rider, quote, "Two suitcases, I am in a red coat",
                "Entrance 3, from the yard"));

        assertThat(order.comment()).isEqualTo("Two suitcases, I am in a red coat");
        assertThat(order.entrance()).isEqualTo("Entrance 3, from the yard");
        OfferView offer = dispatch.offers(driver.actor()).getFirst();
        assertThat(offer.comment()).isEqualTo("Two suitcases, I am in a red coat");
        assertThat(offer.entrance()).isEqualTo("Entrance 3, from the yard");
        dispatch.accept(driver.actor(), driver.device(), UUID.randomUUID(), offer.id());
        TripView trip = trips.current(driver.actor()).orElseThrow();
        assertThat(trip.comment()).isEqualTo("Two suitcases, I am in a red coat");
        assertThat(trip.entrance()).isEqualTo("Entrance 3, from the yard");

        UUID another = new TestQuotes(jdbc, quotes).quote(rider, city, "STANDARD", PICKUP, DROPOFF).id();
        assertCode(() -> orders.create(rider, UUID.randomUUID(), withNote(rider, another, "x".repeat(501), null)),
                ErrorCode.VALIDATION_FAILED);
        assertCode(() -> orders.create(rider, UUID.randomUUID(), withNote(rider, another, null, "y".repeat(101))),
                ErrorCode.VALIDATION_FAILED);
    }

    // ------------------------------------------------------------ helpers

    private static CreateOrder withNote(Actor rider, UUID quote, String comment, String entrance) {
        return new CreateOrder(rider.id(), "STANDARD", PICKUP, "Home", DROPOFF, "Work", PaymentMethod.CASH, quote,
                null, null, null, null, false, null, comment, entrance);
    }

    /** An order nobody is near: it goes straight to the ALL tab, without an open offer. */
    private OrderView orderNobodyNear() {
        OrderView order = rides.order(rides.client(), city, PICKUP, DROPOFF);
        assertThat(orders.get(order.id()).searchPhase()).isEqualTo("BROADCAST");
        return order;
    }

    private Actor staff(String... permissions) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, all_cities, state, created_at,
                                                updated_at)
                        values (:id, :login, 'Dispatcher', 'OPERATOR', :permissions, true, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "manual-offer-" + id).param("permissions", permissions).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private static ErrorCode codeOf(ThrowingCallable call) {
        try {
            call.call();
        } catch (DomainException e) {
            return e.code();
        } catch (Throwable other) {
            throw new AssertionError(other);
        }
        throw new AssertionError("no error");
    }

    private static void assertCode(ThrowingCallable call, ErrorCode code) {
        assertThatThrownBy(call).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }
}
