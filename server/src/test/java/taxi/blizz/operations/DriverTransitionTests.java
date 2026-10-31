package taxi.blizz.operations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.time.OffsetDateTime;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.SessionService;
import taxi.blizz.operations.internal.DispatchWorker;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.pricing.QuoteService;

/**
 * AC-11 (issue #141): one test per row of the driver transition table of section 12.2 that the server carries out, each
 * with the allowed path, a forbidden actor, a repeated command and a version conflict; where a row has no command
 * (the system makes the offer, the network is lost) the test says what stands in for each check. The rows of the
 * admission axis are in {@code driver.DriverAdmissionTests}; the partner rows are M2. Its own city at longitude 146.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class DriverTransitionTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, 146.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 146.55);
    private static final AtomicLong SEQUENCE = new AtomicLong(5_000);

    @Autowired Orders orders;
    @Autowired Dispatch dispatch;
    @Autowired Trips trips;
    @Autowired WorkSessions sessions;
    @Autowired SessionService auth;
    @Autowired QuoteService quotes;
    @Autowired DispatchWorker worker;
    @Autowired JdbcClient jdbc;

    TestRides rides;
    UUID city;

    @BeforeEach
    void city() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        city = rides.city("test-driver-transitions", "UAH", 146);
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

    // ------------------------------------------------------------ work session

    /** "Выйти на линию": CLOSED → OPEN + ACCEPTING. */
    @Test
    void goOnline() {
        TestRides.Driver driver = closedDriver();
        UUID command = UUID.randomUUID();
        LocationFix here = fix(TestRides.north(PICKUP, 800), 5.0);

        DriverAvailability open = sessions.open(driver.actor(), command, driver.device(), driver.vehicle(), here);
        assertThat(open.sessionState()).isEqualTo("OPEN");
        assertThat(open.intent()).isEqualTo("ACCEPTING");
        assertThat(open.eligible()).isTrue();

        // Forbidden actor: not a driver; a driver with somebody else's car.
        assertCode(() -> sessions.open(rides.client(), UUID.randomUUID(), driver.device(), driver.vehicle(), here),
                ErrorCode.ACCESS_DENIED);
        TestRides.Driver other = closedDriver();
        assertCode(() -> sessions.open(other.actor(), UUID.randomUUID(), other.device(), driver.vehicle(),
                fix(TestRides.north(PICKUP, 700), 5.0)), ErrorCode.DRIVER_NOT_ELIGIBLE);

        // Repeat: the same answer, one session.
        DriverAvailability repeat = sessions.open(driver.actor(), command, driver.device(), driver.vehicle(), here);
        assertThat(repeat.sessionId()).isEqualTo(open.sessionId());
        assertThat(openSessions(driver)).isEqualTo(1);

        // Conflict (open has no version): a second device cannot open a second session over the first.
        UUID secondPhone = rides.newDevice(driver);
        assertCode(() -> sessions.open(driver.actor(), UUID.randomUUID(), secondPhone, driver.vehicle(), here),
                ErrorCode.STATE_CONFLICT);
        assertThat(openSessions(driver)).isEqualTo(1);
    }

    /** "Пауза": FREE → NOT_ACCEPTING, open offers revoked. */
    @Test
    void pause() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        long version = version(driver);
        assertForbiddenActors(driver, (actor, device) -> sessions.pause(actor, UUID.randomUUID(), device, version));
        UUID command = UUID.randomUUID();

        DriverAvailability paused = sessions.pause(driver.actor(), command, driver.device(), version);
        assertThat(paused.intent()).isEqualTo("NOT_ACCEPTING");
        assertThat(paused.ineligibleReasons()).containsExactly("INTENT_NOT_ACCEPTING");

        assertThat(sessions.pause(driver.actor(), command, driver.device(), version)).isEqualTo(paused);
        assertCode(() -> sessions.pause(driver.actor(), UUID.randomUUID(), driver.device(), version),
                ErrorCode.VERSION_CONFLICT);
        // The offer half of the row: DriverStateTests (E2).
    }

    /** "Пауза во время поездки": TO_PICKUP/WAITING/ON_TRIP → the same + PAUSE_AFTER_CURRENT. */
    @Test
    void pauseDuringATrip() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        TestRides.Ride ride = rides.started(city, driver, PICKUP, DROPOFF);
        long version = version(driver);
        assertForbiddenActors(driver, (actor, device) -> sessions.pause(actor, UUID.randomUUID(), device, version));
        UUID command = UUID.randomUUID();

        DriverAvailability paused = sessions.pause(driver.actor(), command, driver.device(), version);
        assertThat(paused.intent()).isEqualTo("PAUSE_AFTER_CURRENT");
        assertThat(paused.occupancy()).isEqualTo("ON_TRIP");
        assertThat(trips.current(driver.actor())).isPresent();

        assertThat(sessions.pause(driver.actor(), command, driver.device(), version)).isEqualTo(paused);
        assertCode(() -> sessions.pause(driver.actor(), UUID.randomUUID(), driver.device(), version),
                ErrorCode.VERSION_CONFLICT);

        // The next assignment is not allowed: after the trip the driver is not offered a new order.
        rides.complete(ride, true);
        assertThat(sessions.availability(driver.actor().id()).intent()).isEqualTo("NOT_ACCEPTING");
        rides.order(rides.client(), city, PICKUP, DROPOFF);
        assertThat(dispatch.offers(driver.actor())).isEmpty();
    }

    /** "Возобновить": NOT_ACCEPTING → FREE + ACCEPTING after the eligibility check. */
    @Test
    void resume() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        long version = sessions.pause(driver.actor(), UUID.randomUUID(), driver.device(), version(driver))
                .sessionVersion();
        assertForbiddenActors(driver, (actor, device) -> sessions.resume(actor, UUID.randomUUID(), device, version));
        UUID command = UUID.randomUUID();

        DriverAvailability resumed = sessions.resume(driver.actor(), command, driver.device(), version);
        assertThat(resumed.intent()).isEqualTo("ACCEPTING");
        assertThat(resumed.eligible()).isTrue();

        assertThat(sessions.resume(driver.actor(), command, driver.device(), version)).isEqualTo(resumed);
        assertCode(() -> sessions.resume(driver.actor(), UUID.randomUUID(), driver.device(), version),
                ErrorCode.VERSION_CONFLICT);

        // The eligibility check: a suspended admission cannot resume.
        long again = sessions.pause(driver.actor(), UUID.randomUUID(), driver.device(), resumed.sessionVersion())
                .sessionVersion();
        jdbc.sql("update driver set review_status = 'SUSPENDED' where id = :id")
                .param("id", driver.actor().id()).update();
        assertCode(() -> sessions.resume(driver.actor(), UUID.randomUUID(), driver.device(), again),
                ErrorCode.DRIVER_NOT_ELIGIBLE);
    }

    /** "Выйти": FREE/NOT_ACCEPTING → CLOSED, offers revoked. */
    @Test
    void goOffline() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        long version = version(driver);
        assertForbiddenActors(driver, (actor, device) -> sessions.close(actor, UUID.randomUUID(), device, version));
        UUID command = UUID.randomUUID();

        DriverAvailability closed = sessions.close(driver.actor(), command, driver.device(), version);
        assertThat(closed.sessionState()).isEqualTo("CLOSED");

        assertThat(sessions.close(driver.actor(), command, driver.device(), version)).isEqualTo(closed);
        // No open session is left to change: a new command with the old version is refused.
        assertCode(() -> sessions.close(driver.actor(), UUID.randomUUID(), driver.device(), version),
                ErrorCode.STATE_CONFLICT);
        // The offer half of the row: DriverStateTests (E2).
    }

    /** "Запросить выход занятым": TO_PICKUP/WAITING/ON_TRIP → CLOSING + PAUSE_AFTER_CURRENT, closed after it. */
    @Test
    void goOfflineWhileBusy() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        TestRides.Ride ride = rides.assigned(city, driver, PICKUP, DROPOFF);
        long version = version(driver);
        assertForbiddenActors(driver, (actor, device) -> sessions.close(actor, UUID.randomUUID(), device, version));
        UUID command = UUID.randomUUID();

        DriverAvailability closing = sessions.close(driver.actor(), command, driver.device(), version);
        assertThat(closing.sessionState()).isEqualTo("CLOSING");
        assertThat(closing.intent()).isEqualTo("PAUSE_AFTER_CURRENT");
        assertThat(closing.occupancy()).isEqualTo("TO_PICKUP");

        assertThat(sessions.close(driver.actor(), command, driver.device(), version)).isEqualTo(closing);
        assertCode(() -> sessions.close(driver.actor(), UUID.randomUUID(), driver.device(), version),
                ErrorCode.VERSION_CONFLICT);

        TripView trip = ride.trip();
        rides.moveTo(driver, TestRides.north(PICKUP, 30));
        TripView waiting = trips.arrive(driver.actor(), UUID.randomUUID(), trip.id(), trip.version(), null);
        TripView started = trips.start(driver.actor(), UUID.randomUUID(), waiting.id(), waiting.version(), null);
        trips.complete(driver.actor(), UUID.randomUUID(), started.id(), started.version(), OffsetDateTime.now(), true);
        assertThat(sessions.availability(driver.actor().id()).sessionState()).isEqualTo("CLOSED");
    }

    // ------------------------------------------------------------ offers and assignment

    /** "Получить оффер": FREE → OFFERED after eligibility is re-checked. No command: the system makes it. */
    @Test
    void getAnOffer() {
        TestRides.Driver paused = rides.driverNear(TestRides.north(PICKUP, -300));
        sessions.pause(paused.actor(), UUID.randomUUID(), paused.device(), version(paused));
        TestRides.Driver driver = rides.driverNear(PICKUP);

        OrderView order = rides.order(rides.client(), city, PICKUP, DROPOFF);
        assertThat(dispatch.offers(driver.actor())).extracting(OfferView::orderId).containsExactly(order.id());
        assertThat(occupancy(driver)).isEqualTo("OFFERED");

        // "Forbidden actor": a driver who is not eligible (here paused, though nearer) is never offered.
        assertThat(dispatch.offers(paused.actor())).isEmpty();
        // Repeat: the worker running again makes no second offer.
        worker.runOnce();
        worker.runOnce();
        assertThat(offers(order.id())).isEqualTo(1);
        // Conflict: a stale worker task after the accept changes nothing (generation and order lock).
        AssignmentView assignment = dispatch.accept(driver.actor(), driver.device(), UUID.randomUUID(),
                dispatch.offers(driver.actor()).getFirst().id());
        jdbc.sql("update dispatch_attempt set next_action_at = now() - interval '1 second' where order_id = :id")
                .param("id", order.id()).update();
        worker.runOnce();
        assertThat(orders.get(order.id()).status()).isEqualTo("ASSIGNED");
        assertThat(dispatch.currentAssignment(driver.actor())).contains(assignment);
    }

    /** "Отклонить/истечение": OFFERED → FREE when no other reservation or assignment. */
    @Test
    void declineAnOffer() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        OrderView order = rides.order(rides.client(), city, PICKUP, DROPOFF);
        UUID offerId = dispatch.offers(driver.actor()).getFirst().id();

        TestRides.Driver stranger = rides.driverNear(TestRides.north(PICKUP, 20_000));
        assertCode(() -> dispatch.reject(stranger.actor(), UUID.randomUUID(), offerId), ErrorCode.NOT_FOUND);
        assertCode(() -> dispatch.reject(rides.client(), UUID.randomUUID(), offerId), ErrorCode.ACCESS_DENIED);

        UUID command = UUID.randomUUID();
        dispatch.reject(driver.actor(), command, offerId);
        assertThat(occupancy(driver)).isEqualTo("FREE");
        dispatch.reject(driver.actor(), command, offerId);
        assertThat(events(order.id(), "OfferRejected")).as("repeat: one refusal").isEqualTo(1);

        // Conflict: the offer is no longer open; a late accept is refused, a second refusal changes nothing.
        assertCode(() -> dispatch.accept(driver.actor(), driver.device(), UUID.randomUUID(), offerId),
                ErrorCode.OFFER_REVOKED);
        dispatch.reject(driver.actor(), UUID.randomUUID(), offerId);
        assertThat(events(order.id(), "OfferRejected")).isEqualTo(1);
    }

    /** "Принять локально": FREE/OFFERED → TO_PICKUP in one transaction. */
    @Test
    void acceptAnOffer() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        OrderView order = rides.order(rides.client(), city, PICKUP, DROPOFF);
        UUID offerId = dispatch.offers(driver.actor()).getFirst().id();

        TestRides.Driver stranger = rides.driverNear(TestRides.north(PICKUP, 20_000));
        assertCode(() -> dispatch.accept(stranger.actor(), stranger.device(), UUID.randomUUID(), offerId),
                ErrorCode.NOT_FOUND);
        assertCode(() -> dispatch.accept(rides.client(), driver.device(), UUID.randomUUID(), offerId),
                ErrorCode.ACCESS_DENIED);
        assertCode(() -> dispatch.accept(driver.actor(), rides.newDevice(driver), UUID.randomUUID(), offerId),
                ErrorCode.STATE_CONFLICT);

        UUID command = UUID.randomUUID();
        AssignmentView assignment = dispatch.accept(driver.actor(), driver.device(), command, offerId);
        assertThat(assignment.tripPhase()).isEqualTo("TO_PICKUP");
        assertThat(occupancy(driver)).isEqualTo("TO_PICKUP");

        assertThat(dispatch.accept(driver.actor(), driver.device(), command, offerId)).isEqualTo(assignment);
        assertCode(() -> dispatch.accept(driver.actor(), driver.device(), UUID.randomUUID(), offerId),
                ErrorCode.OFFER_REVOKED);
        assertThat(jdbc.sql("select count(*) from assignment where order_id = :id").param("id", order.id())
                .query(Integer.class).single()).isEqualTo(1);
    }

    // ------------------------------------------------------------ trip

    /** "Прибыть": TO_PICKUP → WAITING. */
    @Test
    void arrive() {
        TestRides.Ride ride = rides.assigned(city, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        TestRides.Driver driver = ride.driver();
        rides.moveTo(driver, TestRides.north(PICKUP, 30));
        TripView trip = ride.trip();
        assertTripForbiddenActors(ride, (actor) -> trips.arrive(actor, UUID.randomUUID(), trip.id(), trip.version(),
                null));
        UUID command = UUID.randomUUID();

        TripView waiting = trips.arrive(driver.actor(), command, trip.id(), trip.version(), null);
        assertThat(waiting.phase()).isEqualTo("WAITING");
        assertThat(occupancy(driver)).isEqualTo("WAITING");

        assertThat(trips.arrive(driver.actor(), command, trip.id(), trip.version(), null)).isEqualTo(waiting);
        assertCode(() -> trips.arrive(driver.actor(), UUID.randomUUID(), trip.id(), trip.version(), null),
                ErrorCode.VERSION_CONFLICT);
    }

    /** "Начать": WAITING → ON_TRIP. */
    @Test
    void start() {
        TestRides.Ride ride = rides.assigned(city, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        TestRides.Driver driver = ride.driver();
        rides.moveTo(driver, TestRides.north(PICKUP, 30));
        TripView waiting = trips.arrive(driver.actor(), UUID.randomUUID(), ride.trip().id(), ride.trip().version(),
                null);
        assertTripForbiddenActors(ride, (actor) -> trips.start(actor, UUID.randomUUID(), waiting.id(),
                waiting.version(), null));
        UUID command = UUID.randomUUID();

        TripView started = trips.start(driver.actor(), command, waiting.id(), waiting.version(), null);
        assertThat(started.phase()).isEqualTo("IN_PROGRESS");
        assertThat(occupancy(driver)).isEqualTo("ON_TRIP");

        assertThat(trips.start(driver.actor(), command, waiting.id(), waiting.version(), null)).isEqualTo(started);
        assertCode(() -> trips.start(driver.actor(), UUID.randomUUID(), waiting.id(), waiting.version(), null),
                ErrorCode.VERSION_CONFLICT);
    }

    /** "Завершить": ON_TRIP → FREE (or NOT_ACCEPTING), trip done and assignment freed in one transaction. */
    @Test
    void complete() {
        TestRides.Ride ride = rides.started(city, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        TestRides.Driver driver = ride.driver();
        TripView trip = ride.trip();
        assertTripForbiddenActors(ride, (actor) -> trips.complete(actor, UUID.randomUUID(), trip.id(),
                trip.version(), OffsetDateTime.now(), true));
        UUID command = UUID.randomUUID();
        OffsetDateTime at = OffsetDateTime.now();
        assertCode(() -> trips.complete(driver.actor(), UUID.randomUUID(), trip.id(), trip.version() - 1, at, true),
                ErrorCode.VERSION_CONFLICT);

        TripView done = trips.complete(driver.actor(), command, trip.id(), trip.version(), at, true);
        assertThat(done.phase()).isEqualTo("COMPLETED");
        assertThat(occupancy(driver)).isEqualTo("FREE");
        assertThat(jdbc.sql("select state from assignment where order_id = :id").param("id", ride.order().id())
                .query(String.class).single()).isEqualTo("COMPLETED");
        assertThat(sessions.availability(driver.actor().id()).eligible()).isTrue();

        assertThat(trips.complete(driver.actor(), command, trip.id(), trip.version(), at, true)).isEqualTo(done);
        assertCode(() -> trips.complete(driver.actor(), UUID.randomUUID(), trip.id(), trip.version(), at, true),
                ErrorCode.STATE_CONFLICT);
    }

    /** "Отозвать водителя до старта": TO_PICKUP/WAITING → FREE/NOT_ACCEPTING, the order searches again. */
    @Test
    void takeTheDriverOffBeforeTheStart() {
        TestRides.Ride ride = rides.assigned(city, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        long version = orders.get(ride.order().id()).version();
        Actor without = staff(Orders.CANCEL_PERMISSION);
        Actor with = staff(Orders.REASSIGN_PERMISSION);

        assertCode(() -> orders.revokeAssignment(without, UUID.randomUUID(), ride.order().id(), version,
                "DRIVER_NOT_RESPONDING", "No answer"),
                ErrorCode.ACCESS_DENIED);
        assertCode(() -> orders.revokeAssignment(ride.payer(), UUID.randomUUID(), ride.order().id(), version,
                "DRIVER_NOT_RESPONDING", "No answer"), ErrorCode.ACCESS_DENIED);
        UUID command = UUID.randomUUID();
        OrderView revoked = orders.revokeAssignment(with, command, ride.order().id(), version,
                "DRIVER_NOT_RESPONDING", "No answer");
        assertThat(revoked.status()).isEqualTo("SEARCHING");
        assertThat(occupancy(ride.driver())).isEqualTo("FREE");

        assertThat(orders.revokeAssignment(with, command, ride.order().id(), version,
                "DRIVER_NOT_RESPONDING", "No answer")).isEqualTo(revoked);
        assertCode(() -> orders.revokeAssignment(with, UUID.randomUUID(), ride.order().id(), version,
                "DRIVER_NOT_RESPONDING", "No answer"),
                ErrorCode.VERSION_CONFLICT);
    }

    // ------------------------------------------------------------ connection

    /**
     * "Потерять сеть": any occupancy → the same + DISCONNECTED; DISCONNECTED + ON_TRIP is never among the free
     * (AC-11). No command: actor, repeat and version do not apply; the trip is kept instead.
     */
    @Test
    void loseTheNetwork() {
        TestRides.Ride ride = rides.started(city, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        TestRides.Driver driver = ride.driver();
        silent(driver, 40);

        DriverAvailability lost = sessions.availability(driver.actor().id());
        assertThat(lost.connection()).isEqualTo("DISCONNECTED");
        assertThat(lost.occupancy()).isEqualTo("ON_TRIP");
        assertThat(lost.eligible()).isFalse();
        assertThat(trips.current(driver.actor())).isPresent();

        // Not among the free: neither offered a new order nor shown the ALL tab, even with the occupancy row lost.
        jdbc.sql("update driver_capacity set occupancy = 'FREE' where driver_id = :d")
                .param("d", driver.actor().id()).update();
        rides.order(rides.client(), city, TestRides.north(PICKUP, 100), DROPOFF);
        assertThat(dispatch.offers(driver.actor())).isEmpty();
        assertThat(dispatch.broadcast(driver.actor())).isEmpty();
    }

    /** "Восстановить сеть": DISCONNECTED → CONNECTED after the session, fresh point and server snapshot check. */
    @Test
    void getTheNetworkBack() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        silent(driver, 40);
        assertThat(sessions.availability(driver.actor().id()).connection()).isEqualTo("DISCONNECTED");

        // Forbidden actor: another phone of the driver; not a driver.
        assertCode(() -> sessions.heartbeat(driver.actor(), rides.newDevice(driver), null), ErrorCode.STATE_CONFLICT);
        assertCode(() -> sessions.heartbeat(rides.client(), driver.device(), null), ErrorCode.ACCESS_DENIED);

        // Where the driver went silent (TestRides puts them 1 km north): a plausible point.
        LocationFix fix = fix(TestRides.north(PICKUP, 1000), 5.0);
        DriverAvailability back = sessions.heartbeat(driver.actor(), driver.device(), fix);
        assertThat(back.connection()).isEqualTo("CONNECTED");
        assertThat(back.eligible()).isTrue();

        // Repeat: the same point again changes nothing. Version: an older sequence never moves the position back.
        assertThat(sessions.heartbeat(driver.actor(), driver.device(), fix).lastLocationAt())
                .isEqualTo(back.lastLocationAt());
        sessions.heartbeat(driver.actor(), driver.device(),
                new LocationFix(TestRides.north(PICKUP, 900), 5.0, OffsetDateTime.now(), fix.sequence() - 1));
        assertThat(jdbc.sql("""
                        select round(ST_Y(last_location)::numeric, 6) from work_session
                        where driver_id = :d and state = 'OPEN'""")
                .param("d", driver.actor().id()).query(Double.class).single())
                .isCloseTo(TestRides.north(PICKUP, 1000).lat(), org.assertj.core.data.Offset.offset(1e-6));
    }

    // ------------------------------------------------------------ helpers

    private interface SessionCommand {
        DriverAvailability run(Actor actor, UUID device);
    }

    /** Not a driver; the driver's other phone, which does not control the shift. */
    private void assertForbiddenActors(TestRides.Driver driver, SessionCommand command) {
        assertCode(() -> command.run(rides.client(), driver.device()), ErrorCode.ACCESS_DENIED);
        assertCode(() -> command.run(driver.actor(), rides.newDevice(driver)), ErrorCode.STATE_CONFLICT);
    }

    private interface TripCommand {
        TripView run(Actor actor);
    }

    /** Another driver; the passenger. */
    private void assertTripForbiddenActors(TestRides.Ride ride, TripCommand command) {
        TestRides.Driver stranger = rides.driverNear(TestRides.north(PICKUP, 20_000));
        assertCode(() -> command.run(stranger.actor()), ErrorCode.NOT_FOUND);
        assertCode(() -> command.run(ride.payer()), ErrorCode.ACCESS_DENIED);
    }

    /** A driver whose shift is closed, with a phone and an approved car. */
    private TestRides.Driver closedDriver() {
        TestRides.Driver driver = rides.driverNear(TestRides.north(PICKUP, 10_000));
        sessions.close(driver.actor(), UUID.randomUUID(), driver.device(), version(driver));
        TestRides.timePassed(jdbc, driver.actor().id());
        return driver;
    }

    private void silent(TestRides.Driver driver, int seconds) {
        jdbc.sql("""
                        update work_session set last_heartbeat_at = now() - make_interval(secs => :s),
                                                last_location_at = now() - make_interval(secs => :s)
                        where driver_id = :d and state in ('OPEN', 'CLOSING')""")
                .param("s", seconds).param("d", driver.actor().id()).update();
    }

    private static LocationFix fix(GeoPoint at, Double accuracy) {
        return new LocationFix(at, accuracy, OffsetDateTime.now(), SEQUENCE.incrementAndGet());
    }

    private long version(TestRides.Driver driver) {
        return sessions.availability(driver.actor().id()).sessionVersion();
    }

    private String occupancy(TestRides.Driver driver) {
        return jdbc.sql("select occupancy from driver_capacity where driver_id = :id")
                .param("id", driver.actor().id()).query(String.class).single();
    }

    private int openSessions(TestRides.Driver driver) {
        return jdbc.sql("select count(*) from work_session where driver_id = :d and state in ('OPEN', 'CLOSING')")
                .param("d", driver.actor().id()).query(Integer.class).single();
    }

    private int offers(UUID orderId) {
        return jdbc.sql("select count(*) from offer where order_id = :id").param("id", orderId)
                .query(Integer.class).single();
    }

    private int events(UUID orderId, String type) {
        return jdbc.sql("select count(*) from order_event where order_id = :id and type = :type")
                .param("id", orderId).param("type", type).query(Integer.class).single();
    }

    private Actor staff(String... permissions) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, city_scope, state, created_at,
                                                updated_at)
                        values (:id, :login, 'Dispatcher', 'ADMIN', :permissions, :scope, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "transitions-" + id).param("permissions", permissions)
                .param("scope", new UUID[] {city}).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private static void assertCode(ThrowingCallable call, ErrorCode code) {
        assertThatThrownBy(call).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }
}
