package taxi.blizz.operations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
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
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.pricing.QuoteService;

/**
 * Trip phases: REQ-ASG-03..07, REQ-ORD-04..05, REQ-PAY-15, REQ-DRV-09; T-01, T-08, T-18 (end), T-19.
 * Exceptions before the start: REQ-ASG-04, REQ-CAN-05..06, REQ-OPS-05; T-20.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class TripTests {

    static final String AREA = "SRID=4326;MULTIPOLYGON(((120 -40,121 -40,121 -39,120 -39,120 -40)))";
    static final GeoPoint PICKUP = new GeoPoint(-39.5, 120.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 120.55);

    @Autowired
    Orders orders;
    @Autowired
    Dispatch dispatch;
    @Autowired
    Trips trips;
    @Autowired
    WorkSessions sessions;
    @Autowired
    JdbcClient jdbc;
    @Autowired
    QuoteService quoteService;

    UUID cityId;

    @BeforeEach
    void cleanArea() {
        cityId = jdbc.sql("select id from city where code = 'test-trips'").query(UUID.class).optional()
                .orElseGet(() -> {
                    UUID id = UUID.randomUUID();
                    jdbc.sql("""
                                    insert into city (id, code, name, currency, timezone, polygon, priority, state,
                                                      created_at, updated_at)
                                    values (:id, 'test-trips', 'Trips', 'UAH', 'Europe/Kyiv', ST_GeomFromEWKT(:area),
                                            7779, 'PUBLISHED', now(), now())""")
                            .param("id", id).param("area", AREA).update();
                    return id;
                });
        jdbc.sql("update work_session set state = 'CLOSED', closed_at = now() where city_id = :c and state <> 'CLOSED'")
                .param("c", cityId).update();
        jdbc.sql("""
                        update dispatch_attempt set phase = 'STOPPED', next_action_at = null
                        where phase in ('PERSONAL', 'BROADCAST')
                          and order_id in (select id from ride_order where city_id = :c)""")
                .param("c", cityId).update();
    }

    record Driver(Actor actor, UUID vehicle, UUID device) {
    }

    record Ride(Actor payer, Driver driver, OrderView order, TripView trip) {
    }

    private Actor client() {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into client (id, phone_normalized, account_state, has_app, created_at, updated_at)
                        values (:id, :phone, 'ACTIVE', true, now(), now())""")
                .param("id", id)
                .param("phone", taxi.blizz.TestPhones.unique("+48", 9))
                .update();
        return new Actor(SubjectType.CLIENT, id);
    }

    private Driver driverAt(GeoPoint at) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into driver (id, phone_normalized, account_state, review_status, created_at, updated_at)
                        values (:id, :phone, 'ACTIVE', 'APPROVED', now(), now())""")
                .param("id", id)
                .param("phone", taxi.blizz.TestPhones.unique("+38093", 7))
                .update();
        taxi.blizz.TestAdmission.inEveryCity(jdbc, id);
        UUID vehicle = UUID.randomUUID();
        jdbc.sql("""
                        insert into vehicle (id, driver_id, registration_number, make, model, color, production_year,
                                             state, class_approvals, created_at, updated_at)
                        values (:id, :driver, 'AA2000AA', 'VW', 'Passat', 'black', 2021, 'APPROVED', '{STANDARD}',
                                now(), now())""")
                .param("id", vehicle).param("driver", id).update();
        UUID device = UUID.randomUUID();
        jdbc.sql("""
                        insert into device_session (id, subject_type, subject_id, audience, created_at,
                                                    last_refreshed_at, expires_at)
                        values (:id, 'DRIVER', :driver, 'driver', now(), now(), now() + interval '1 day')""")
                .param("id", device).param("driver", id).update();
        Driver driver = new Driver(new Actor(SubjectType.DRIVER, id), vehicle, device);
        sessions.open(driver.actor(), UUID.randomUUID(), device, vehicle, new LocationFix(at, 5.0, OffsetDateTime.now(), 1));
        return driver;
    }

    private static GeoPoint north(int metres) {
        return new GeoPoint(PICKUP.lat() + metres / 111_000.0, PICKUP.lon());
    }

    private long sequence = 10;

    private void moveTo(Driver driver, GeoPoint point) {
        TestRides.timePassed(jdbc, driver.actor().id());
        sessions.heartbeat(driver.actor(), driver.device(), new LocationFix(point, 5.0, OffsetDateTime.now(), sequence++));
    }

    /** An assigned ride with the driver 1 km away. */
    private Ride assigned(PaymentMethod payment) {
        Actor payer = client();
        Driver driver = driverAt(north(1000));
        OrderView order = orders.create(payer, UUID.randomUUID(), new CreateOrder(payer.id(), "STANDARD", PICKUP, "Entrance 1",
                DROPOFF, "Office", payment,
                new TestQuotes(jdbc, quoteService).quote(payer, cityId, "STANDARD", PICKUP, DROPOFF).id()));
        OfferView offer = dispatch.offers(driver.actor()).getFirst();
        dispatch.accept(driver.actor(), driver.device(), UUID.randomUUID(), offer.id());
        return new Ride(payer, driver, order, trips.current(driver.actor()).orElseThrow());
    }

    private TripView arrived(Ride ride) {
        moveTo(ride.driver(), north(40));
        return trips.arrive(ride.driver().actor(), UUID.randomUUID(), ride.trip().id(), ride.trip().version(), null);
    }

    private String occupancy(Driver driver) {
        return jdbc.sql("select occupancy from driver_capacity where driver_id = :id")
                .param("id", driver.actor().id()).query(String.class).single();
    }

    private static void assertCode(ThrowingCallable call, ErrorCode code) {
        assertThatThrownBy(call).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }

    // ------------------------------------------------------------ full ride (T-01)

    @Test
    void cashRideFromAssignmentToCompletion() {
        Ride ride = assigned(PaymentMethod.CASH);
        assertThat(ride.trip().phase()).isEqualTo("TO_PICKUP");

        TripView waiting = arrived(ride);
        assertThat(waiting.phase()).isEqualTo("WAITING");
        assertThat(waiting.arrivedAt()).isNotNull();
        assertThat(occupancy(ride.driver())).isEqualTo("WAITING");

        TripView started = trips.start(ride.driver().actor(), UUID.randomUUID(), waiting.id(), waiting.version(), null);
        assertThat(started.phase()).isEqualTo("IN_PROGRESS");
        assertThat(orders.get(ride.order().id()).status()).isEqualTo("IN_SERVICE");
        assertThat(occupancy(ride.driver())).isEqualTo("ON_TRIP");

        TripView done = trips.complete(ride.driver().actor(), UUID.randomUUID(), started.id(), started.version(),
                OffsetDateTime.now(), true);

        assertThat(done.phase()).isEqualTo("COMPLETED");
        assertThat(done.needsReview()).isFalse();
        OrderView fulfilled = orders.get(ride.order().id());
        assertThat(fulfilled.status()).isEqualTo("FULFILLED");
        assertThat(fulfilled.paymentState()).isEqualTo("CASH_REPORTED");
        assertThat(fulfilled.assignment().state()).isEqualTo("COMPLETED");
        assertThat(occupancy(ride.driver())).isEqualTo("FREE");
        assertThat(sessions.availability(ride.driver().actor().id()).eligible()).isTrue();
        assertThat(trips.current(ride.driver().actor())).isEmpty();
    }

    @Test
    void cashNotReceivedIsRecordedAsTheDriversStatement() {
        Ride ride = assigned(PaymentMethod.CASH);
        TripView waiting = arrived(ride);
        TripView started = trips.start(ride.driver().actor(), UUID.randomUUID(), waiting.id(), waiting.version(), null);

        assertCode(() -> trips.complete(ride.driver().actor(), UUID.randomUUID(), started.id(), started.version(),
                OffsetDateTime.now(), null), ErrorCode.VALIDATION_FAILED);
        trips.complete(ride.driver().actor(), UUID.randomUUID(), started.id(), started.version(), OffsetDateTime.now(), false);

        assertThat(orders.get(ride.order().id()).paymentState()).isEqualTo("CASH_NOT_RECEIVED");
    }

    // ------------------------------------------------------------ arrival check (T-19)

    @Test
    void arrivalFarFromThePickupNeedsAReasonAndIsFlagged() {
        Ride ride = assigned(PaymentMethod.CASH);
        moveTo(ride.driver(), north(600));

        assertCode(() -> trips.arrive(ride.driver().actor(), UUID.randomUUID(), ride.trip().id(), ride.trip().version(),
                null), ErrorCode.PICKUP_TOO_FAR);

        TripView flagged = trips.arrive(ride.driver().actor(), UUID.randomUUID(), ride.trip().id(),
                ride.trip().version(), "Passenger asked to wait around the corner");
        assertThat(flagged.phase()).isEqualTo("WAITING");
        assertThat(flagged.needsReview()).isTrue();
    }

    @Test
    void arrivalWithAPoorFixNeedsAReasonAndIsFlagged() {
        Ride ride = assigned(PaymentMethod.CASH);
        TestRides.timePassed(jdbc, ride.driver().actor().id());
        sessions.heartbeat(ride.driver().actor(), ride.driver().device(),
                new LocationFix(north(30), 250.0, OffsetDateTime.now(), sequence++));

        assertCode(() -> trips.arrive(ride.driver().actor(), UUID.randomUUID(), ride.trip().id(), ride.trip().version(),
                null), ErrorCode.LOCATION_NOT_FRESH);

        TripView flagged = trips.arrive(ride.driver().actor(), UUID.randomUUID(), ride.trip().id(),
                ride.trip().version(), "GPS is poor between the buildings");
        assertThat(flagged.phase()).isEqualTo("WAITING");
        assertThat(flagged.needsReview()).isTrue();
    }

    @Test
    void arrivalWithAStaleLocationIsRefused() {
        Ride ride = assigned(PaymentMethod.CASH);
        moveTo(ride.driver(), north(30));
        jdbc.sql("update work_session set last_location_at = now() - interval '1 minute' where driver_id = :id and state = 'OPEN'")
                .param("id", ride.driver().actor().id()).update();

        assertCode(() -> trips.arrive(ride.driver().actor(), UUID.randomUUID(), ride.trip().id(), ride.trip().version(),
                null), ErrorCode.LOCATION_NOT_FRESH);
    }

    @Test
    void startWithoutArrivalNeedsAReason() {
        Ride ride = assigned(PaymentMethod.CASH);

        assertCode(() -> trips.start(ride.driver().actor(), UUID.randomUUID(), ride.trip().id(), ride.trip().version(),
                null), ErrorCode.STATE_CONFLICT);
        TripView started = trips.start(ride.driver().actor(), UUID.randomUUID(), ride.trip().id(), ride.trip().version(),
                "Passenger was already at the car");
        assertThat(started.phase()).isEqualTo("IN_PROGRESS");
        assertThat(started.needsReview()).isTrue();
    }

    // ------------------------------------------------------------ who and which version

    @Test
    void onlyTheAssignedDriverControlsTheTrip() {
        Ride ride = assigned(PaymentMethod.CASH);
        Driver stranger = driverAt(north(2000));
        moveTo(ride.driver(), north(30));

        assertCode(() -> trips.arrive(stranger.actor(), UUID.randomUUID(), ride.trip().id(), ride.trip().version(), null),
                ErrorCode.NOT_FOUND);
        assertCode(() -> trips.arrive(ride.payer(), UUID.randomUUID(), ride.trip().id(), ride.trip().version(), null),
                ErrorCode.ACCESS_DENIED);
    }

    @Test
    void staleVersionAndRepeatsBehave() {
        Ride ride = assigned(PaymentMethod.CASH);
        moveTo(ride.driver(), north(30));
        UUID command = UUID.randomUUID();

        TripView first = trips.arrive(ride.driver().actor(), command, ride.trip().id(), ride.trip().version(), null);
        TripView repeat = trips.arrive(ride.driver().actor(), command, ride.trip().id(), ride.trip().version(), null);

        assertThat(repeat).isEqualTo(first);
        assertCode(() -> trips.arrive(ride.driver().actor(), UUID.randomUUID(), ride.trip().id(), ride.trip().version(),
                null), ErrorCode.VERSION_CONFLICT);
    }

    @Test
    void completionTimeFarFromServerTimeIsFlagged() {
        Ride ride = assigned(PaymentMethod.CASH);
        TripView waiting = arrived(ride);
        TripView started = trips.start(ride.driver().actor(), UUID.randomUUID(), waiting.id(), waiting.version(), null);

        TripView done = trips.complete(ride.driver().actor(), UUID.randomUUID(), started.id(), started.version(),
                OffsetDateTime.now().minusHours(2), true);

        assertThat(done.needsReview()).isTrue();
    }

    // ------------------------------------------------------------ pause and close requested during the trip (T-18)

    @Test
    void pauseAndCloseRequestedDuringTheTripTakeEffectAtTheEnd() {
        Ride paused = assigned(PaymentMethod.CASH);
        DriverAvailability p = sessions.availability(paused.driver().actor().id());
        sessions.pause(paused.driver().actor(), UUID.randomUUID(), paused.driver().device(), p.sessionVersion());
        finish(paused);
        assertThat(sessions.availability(paused.driver().actor().id()).intent()).isEqualTo("NOT_ACCEPTING");

        Ride closing = assigned(PaymentMethod.CASH);
        DriverAvailability c = sessions.availability(closing.driver().actor().id());
        sessions.close(closing.driver().actor(), UUID.randomUUID(), closing.driver().device(), c.sessionVersion());
        finish(closing);
        assertThat(sessions.availability(closing.driver().actor().id()).sessionState()).isEqualTo("CLOSED");
    }

    private void finish(Ride ride) {
        TripView waiting = arrived(ride);
        TripView started = trips.start(ride.driver().actor(), UUID.randomUUID(), waiting.id(), waiting.version(), null);
        trips.complete(ride.driver().actor(), UUID.randomUUID(), started.id(), started.version(), OffsetDateTime.now(), true);
    }

    // ------------------------------------------------------------ cancellation racing the start (T-08)

    @Test
    void cancellationRacingTheStartHasOneOutcome() throws Exception {
        for (int round = 0; round < 5; round++) {
            Ride ride = assigned(PaymentMethod.CASH);
            TripView waiting = arrived(ride);
            long orderVersion = orders.get(ride.order().id()).version();

            runTogether(List.of(
                    () -> trips.start(ride.driver().actor(), UUID.randomUUID(), waiting.id(), waiting.version(), null),
                    () -> orders.cancel(ride.payer(), UUID.randomUUID(), ride.order().id(), orderVersion, "CHANGED_MIND")));

            OrderView result = orders.get(ride.order().id());
            String phase = jdbc.sql("select phase from trip where id = :id").param("id", waiting.id())
                    .query(String.class).single();
            if ("CANCELLED".equals(result.status())) {
                assertThat(phase).isEqualTo("ABORTED");
                assertThat(occupancy(ride.driver())).isEqualTo("FREE");
            } else {
                assertThat(result.status()).isEqualTo("IN_SERVICE");
                assertThat(phase).isEqualTo("IN_PROGRESS");
                assertThat(occupancy(ride.driver())).isEqualTo("ON_TRIP");
            }
            cleanArea();
        }
    }

    @Test
    void startedTripCannotBeCancelledByThePassenger() {
        Ride ride = assigned(PaymentMethod.CASH);
        TripView waiting = arrived(ride);
        trips.start(ride.driver().actor(), UUID.randomUUID(), waiting.id(), waiting.version(), null);

        assertCode(() -> orders.cancel(ride.payer(), UUID.randomUUID(), ride.order().id(),
                orders.get(ride.order().id()).version(), "CHANGED_MIND"), ErrorCode.STATE_CONFLICT);
    }

    // ------------------------------------------------------------ exceptions before the start (REQ-ASG-04, REQ-CAN-05)

    private Actor staff(String... permissions) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, city_scope, state, created_at, updated_at)
                        values (:id, :login, 'Dispatcher', 'ADMIN', :permissions, :scope, 'ACTIVE', now(), now())""")
                .param("id", id)
                .param("login", "staff-" + id)
                .param("permissions", permissions)
                .param("scope", new UUID[] {cityId})
                .update();
        return new Actor(SubjectType.STAFF, id);
    }

    private long searchSeconds(UUID orderId, String type) {
        return jdbc.sql("""
                        select (payload ->> 'search_seconds')::bigint from order_event
                        where order_id = :id and type = :type order by sequence desc limit 1""")
                .param("id", orderId).param("type", type).query(Long.class).single();
    }

    @Test
    void driverWithdrawalSendsTheOrderToAnotherDriver() {
        Ride ride = assigned(PaymentMethod.CASH);
        Driver other = driverAt(north(1500));

        assertCode(() -> trips.withdraw(ride.driver().actor(), UUID.randomUUID(), ride.trip().id(), ride.trip().version(),
                " "), ErrorCode.VALIDATION_FAILED);
        TripView withdrawn = trips.withdraw(ride.driver().actor(), UUID.randomUUID(), ride.trip().id(),
                ride.trip().version(), "Flat tyre");

        assertThat(withdrawn.phase()).isEqualTo("ABORTED");
        OrderView order = orders.get(ride.order().id());
        assertThat(order.status()).isEqualTo("SEARCHING");
        assertThat(occupancy(ride.driver())).isEqualTo("FREE");
        assertThat(trips.current(ride.driver().actor())).isEmpty();
        assertThat(dispatch.offers(ride.driver().actor())).isEmpty();
        assertThat(dispatch.offers(other.actor())).extracting(OfferView::orderId).containsExactly(ride.order().id());
        assertThat(searchSeconds(ride.order().id(), "OrderSearchResumed"))
                .isLessThan(searchSeconds(ride.order().id(), "OrderSearchStarted"));
        assertThat(jdbc.sql("select close_reason from assignment where order_id = :id")
                .param("id", ride.order().id()).query(String.class).single()).contains("Flat tyre");

        jdbc.sql("update dispatch_attempt set phase = 'BROADCAST' where order_id = :id and phase = 'PERSONAL'")
                .param("id", ride.order().id()).update();
        assertCode(() -> dispatch.claim(ride.driver().actor(), ride.driver().device(), UUID.randomUUID(), ride.order().id()),
                ErrorCode.DRIVER_NOT_ELIGIBLE);
        assertThat(dispatch.broadcast(ride.driver().actor()))
                .noneMatch(b -> b.orderId().equals(ride.order().id()));
    }

    @Test
    void withdrawalAfterTheStartIsRefused() {
        Ride ride = assigned(PaymentMethod.CASH);
        TripView waiting = arrived(ride);
        TripView started = trips.start(ride.driver().actor(), UUID.randomUUID(), waiting.id(), waiting.version(), null);

        assertCode(() -> trips.withdraw(ride.driver().actor(), UUID.randomUUID(), started.id(), started.version(),
                "Changed my mind"), ErrorCode.STATE_CONFLICT);
        assertThat(occupancy(ride.driver())).isEqualTo("ON_TRIP");
    }

    @Test
    void dispatcherTakesTheDriverOffOnlyWithThePermission() {
        Ride ride = assigned(PaymentMethod.CASH);
        long version = orders.get(ride.order().id()).version();
        Actor without = staff(Orders.CANCEL_PERMISSION);
        Actor with = staff(Orders.REASSIGN_PERMISSION);

        assertCode(() -> orders.revokeAssignment(without, UUID.randomUUID(), ride.order().id(), version,
                "Driver does not answer"), ErrorCode.ACCESS_DENIED);
        assertCode(() -> orders.revokeAssignment(with, UUID.randomUUID(), ride.order().id(), version, ""),
                ErrorCode.VALIDATION_FAILED);
        UUID command = UUID.randomUUID();
        OrderView revoked = orders.revokeAssignment(with, command, ride.order().id(), version, "Driver does not answer");
        OrderView repeat = orders.revokeAssignment(with, command, ride.order().id(), version, "Driver does not answer");

        assertThat(repeat).isEqualTo(revoked);
        assertThat(revoked.status()).isEqualTo("SEARCHING");
        assertThat(jdbc.sql("select state from assignment where order_id = :id")
                .param("id", ride.order().id()).query(String.class).single()).isEqualTo("REVOKED");
        assertThat(occupancy(ride.driver())).isEqualTo("FREE");
        assertCode(() -> orders.revokeAssignment(with, UUID.randomUUID(), ride.order().id(), revoked.version(),
                "again"), ErrorCode.STATE_CONFLICT);
    }

    // ------------------------------------------------------------ the passenger did not come out (REQ-CAN-06, T-20)

    @Test
    void noShowOnlyAfterTheMinimumWait() {
        Ride ride = assigned(PaymentMethod.CASH);
        assertCode(() -> trips.reportNoShow(ride.driver().actor(), UUID.randomUUID(), ride.trip().id(),
                ride.trip().version()), ErrorCode.STATE_CONFLICT);

        TripView waiting = arrived(ride);
        assertCode(() -> trips.reportNoShow(ride.driver().actor(), UUID.randomUUID(), waiting.id(), waiting.version()),
                ErrorCode.STATE_CONFLICT);

        jdbc.sql("update trip set arrived_at = arrived_at - interval '6 minutes' where id = :id")
                .param("id", waiting.id()).update();
        TripView aborted = trips.reportNoShow(ride.driver().actor(), UUID.randomUUID(), waiting.id(), waiting.version());

        assertThat(aborted.phase()).isEqualTo("ABORTED");
        OrderView order = orders.get(ride.order().id());
        assertThat(order.status()).isEqualTo("CANCELLED");
        assertThat(order.statusReason()).isEqualTo("NO_SHOW");
        assertThat(occupancy(ride.driver())).isEqualTo("FREE");
    }

    @Test
    void passengerMayCancelWhileTheDriverWaits() {
        Ride ride = assigned(PaymentMethod.CASH);
        arrived(ride);

        OrderView cancelled = orders.cancel(ride.payer(), UUID.randomUUID(), ride.order().id(),
                orders.get(ride.order().id()).version(), "CHANGED_MIND");

        assertThat(cancelled.status()).isEqualTo("CANCELLED");
        assertThat(occupancy(ride.driver())).isEqualTo("FREE");
    }

    private static void runTogether(List<Callable<Object>> calls) throws Exception {
        CountDownLatch start = new CountDownLatch(1);
        ExecutorService pool = Executors.newFixedThreadPool(calls.size());
        try {
            List<Future<Object>> futures = new ArrayList<>();
            for (Callable<Object> call : calls) {
                futures.add(pool.submit(() -> {
                    start.await();
                    return call.call();
                }));
            }
            start.countDown();
            for (Future<Object> future : futures) {
                try {
                    future.get();
                } catch (ExecutionException e) {
                    assertThat(e.getCause()).isInstanceOf(DomainException.class);
                }
            }
        } finally {
            pool.shutdownNow();
        }
    }
}
