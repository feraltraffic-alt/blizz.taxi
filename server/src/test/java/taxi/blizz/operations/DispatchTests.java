package taxi.blizz.operations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.operations.internal.DispatchWorker;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.pricing.QuoteService;

/**
 * Sections 9-11: AC-08, AC-09, AC-10, T-04, T-05, T-06, T-07, T-09, T-10, T-11.
 * Uses its own synthetic city so drivers and orders of other test classes never interfere.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class DispatchTests {

    static final String AREA = "SRID=4326;MULTIPOLYGON(((110 -40,111 -40,111 -39,110 -39,110 -40)))";
    static final GeoPoint PICKUP = new GeoPoint(-39.5, 110.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 110.55);

    @Autowired
    Orders orders;
    @Autowired
    Dispatch dispatch;
    @Autowired
    WorkSessions sessions;
    @Autowired
    DispatchWorker worker;
    @Autowired
    JdbcClient jdbc;
    @Autowired
    QuoteService quoteService;

    UUID cityId;

    @BeforeEach
    void cleanArea() {
        cityId = jdbc.sql("select id from city where code = 'test-dispatch'").query(UUID.class).optional()
                .orElseGet(() -> {
                    UUID id = UUID.randomUUID();
                    jdbc.sql("""
                                    insert into city (id, code, name, currency, timezone, polygon, priority, state,
                                                      created_at, updated_at)
                                    values (:id, 'test-dispatch', 'Dispatch', 'UAH', 'Europe/Kyiv',
                                            ST_GeomFromEWKT(:area), 7778, 'PUBLISHED', now(), now())""")
                            .param("id", id).param("area", AREA).update();
                    return id;
                });
        // Leave nothing from earlier tests that could become a candidate or an "ALL" order.
        jdbc.sql("update work_session set state = 'CLOSED', closed_at = now() where city_id = :c and state <> 'CLOSED'")
                .param("c", cityId).update();
        jdbc.sql("""
                        update dispatch_attempt set phase = 'STOPPED', next_action_at = null
                        where phase in ('PERSONAL', 'BROADCAST')
                          and order_id in (select id from ride_order where city_id = :c)""")
                .param("c", cityId).update();
        jdbc.sql("""
                        update ride_order set status = 'UNFULFILLED'
                        where city_id = :c and status in ('READY', 'SEARCHING', 'ASSIGNED', 'IN_SERVICE')""")
                .param("c", cityId).update();
    }

    // ------------------------------------------------------------ fixtures

    private Actor client() {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into client (id, phone_normalized, account_state, has_app, created_at, updated_at)
                        values (:id, :phone, 'ACTIVE', true, now(), now())""")
                .param("id", id)
                .param("phone", "+48" + String.format("%09d", Math.floorMod(id.hashCode(), 1_000_000_000)))
                .update();
        return new Actor(SubjectType.CLIENT, id);
    }

    record Driver(Actor actor, UUID vehicle, UUID device) {
    }

    private Driver driverAt(GeoPoint at, String... classes) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into driver (id, phone_normalized, account_state, review_status, created_at, updated_at)
                        values (:id, :phone, 'ACTIVE', 'APPROVED', now(), now())""")
                .param("id", id)
                .param("phone", "+38095" + String.format("%07d", Math.floorMod(id.hashCode(), 10_000_000)))
                .update();
        UUID vehicle = UUID.randomUUID();
        jdbc.sql("""
                        insert into vehicle (id, driver_id, registration_number, make, model, color, production_year,
                                             state, class_approvals, created_at, updated_at)
                        values (:id, :driver, 'AA1000AA', 'Toyota', 'Corolla', 'white', 2022, 'APPROVED', :classes,
                                now(), now())""")
                .param("id", vehicle)
                .param("driver", id)
                .param("classes", classes.length == 0 ? new String[] {"STANDARD"} : classes)
                .update();
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

    /** A point roughly {@code metres} north of the pickup. */
    private static GeoPoint north(int metres) {
        return new GeoPoint(PICKUP.lat() + metres / 111_000.0, PICKUP.lon());
    }

    private UUID quote(Actor payer) {
        return new TestQuotes(jdbc, quoteService).quote(payer, cityId, "STANDARD", PICKUP, DROPOFF).id();
    }

    private OrderView order(Actor payer) {
        return orders.create(payer, UUID.randomUUID(), new CreateOrder(payer.id(), "STANDARD", PICKUP, "Pickup 1",
                DROPOFF, "Dropoff 2", PaymentMethod.CASH, quote(payer)));
    }

    private OfferView onlyOffer(Driver driver) {
        List<OfferView> offers = dispatch.offers(driver.actor());
        assertThat(offers).hasSize(1);
        return offers.getFirst();
    }

    private String occupancy(Driver driver) {
        return jdbc.sql("select occupancy from driver_capacity where driver_id = :id")
                .param("id", driver.actor().id()).query(String.class).single();
    }

    private void makeDue(UUID orderId) {
        jdbc.sql("update offer set expires_at = now() - interval '1 second' where order_id = :id and state = 'OPEN'")
                .param("id", orderId).update();
        jdbc.sql("""
                        update dispatch_attempt set next_action_at = now() - interval '1 second'
                        where order_id = :id and phase in ('PERSONAL', 'BROADCAST')""")
                .param("id", orderId).update();
    }

    private static void assertCode(ThrowingCallable call, ErrorCode code) {
        assertThatThrownBy(call).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }

    private int activeAssignments(UUID orderId) {
        return jdbc.sql("select count(*) from assignment where order_id = :id and state in ('RESERVED', 'COMMITTED')")
                .param("id", orderId).query(Integer.class).single();
    }

    // ------------------------------------------------------------ search and offers

    @Test
    void orderIsOfferedToTheNearestEligibleDriver() {
        Driver near = driverAt(north(500));
        Driver far = driverAt(north(1500));
        Driver paused = driverAt(north(100));
        DriverAvailability p = sessions.availability(paused.actor().id());
        sessions.pause(paused.actor(), UUID.randomUUID(), paused.device(), p.sessionVersion());
        Driver wrongClass = driverAt(north(50), "BUSINESS");

        OrderView order = order(client());

        assertThat(order.status()).isEqualTo("SEARCHING");
        assertThat(order.searchPhase()).isEqualTo("PERSONAL");
        OfferView offer = onlyOffer(near);
        assertThat(offer.orderId()).isEqualTo(order.id());
        assertThat(offer.priceMinor()).isPositive().isEqualTo(order.priceMinor());
        assertThat(offer.expiresAt()).isAfter(OffsetDateTime.now());
        assertThat(occupancy(near)).isEqualTo("OFFERED");
        assertThat(dispatch.offers(far.actor())).isEmpty();
        assertThat(dispatch.offers(paused.actor())).isEmpty();
        assertThat(dispatch.offers(wrongClass.actor())).isEmpty();
    }

    @Test
    void acceptingCommitsTheAssignmentAndStopsTheSearch() {
        Driver driver = driverAt(north(300));
        OrderView order = order(client());

        AssignmentView assignment = dispatch.accept(driver.actor(), UUID.randomUUID(), onlyOffer(driver).id());

        assertThat(assignment.state()).isEqualTo("COMMITTED");
        assertThat(assignment.tripPhase()).isEqualTo("TO_PICKUP");
        OrderView assigned = orders.get(order.id());
        assertThat(assigned.status()).isEqualTo("ASSIGNED");
        assertThat(assigned.searchPhase()).isEqualTo("STOPPED");
        assertThat(assigned.assignment().driverId()).isEqualTo(driver.actor().id());
        assertThat(occupancy(driver)).isEqualTo("TO_PICKUP");
        assertThat(dispatch.currentAssignment(driver.actor())).contains(assignment);
        assertThat(sessions.availability(driver.actor().id()).eligible()).isFalse();
    }

    @Test
    void lostResponseRepeatReturnsTheSameAssignment() {
        Driver driver = driverAt(north(300));
        order(client());
        UUID offerId = onlyOffer(driver).id();
        UUID command = UUID.randomUUID();

        AssignmentView first = dispatch.accept(driver.actor(), command, offerId);
        AssignmentView repeat = dispatch.accept(driver.actor(), command, offerId);

        assertThat(repeat).isEqualTo(first);
        assertCode(() -> dispatch.accept(driver.actor(), UUID.randomUUID(), offerId), ErrorCode.OFFER_REVOKED);
    }

    @Test
    void refusalGoesToTheNextDriverWithinTheSameOrder() {
        Driver first = driverAt(north(200));
        Driver second = driverAt(north(900));
        OrderView order = order(client());

        dispatch.reject(first.actor(), UUID.randomUUID(), onlyOffer(first).id());

        assertThat(occupancy(first)).isEqualTo("FREE");
        AssignmentView assignment = dispatch.accept(second.actor(), UUID.randomUUID(), onlyOffer(second).id());
        assertThat(assignment.orderId()).isEqualTo(order.id());
        assertThat(jdbc.sql("select count(*) from offer where order_id = :id").param("id", order.id())
                .query(Integer.class).single()).isEqualTo(2);
        assertThat(activeAssignments(order.id())).isEqualTo(1);
        assertThat(dispatch.offers(first.actor())).as("not offered the same order again").isEmpty();
    }

    @Test
    void lateAcceptanceAfterExpiryIsRefusedAndTheSearchMovesOn() {
        Driver slow = driverAt(north(200));
        Driver next = driverAt(north(700));
        OrderView order = order(client());
        UUID offerId = onlyOffer(slow).id();

        makeDue(order.id());
        worker.runOnce();

        assertCode(() -> dispatch.accept(slow.actor(), UUID.randomUUID(), offerId), ErrorCode.OFFER_EXPIRED);
        assertThat(occupancy(slow)).isEqualTo("FREE");
        assertThat(onlyOffer(next).orderId()).isEqualTo(order.id());
    }

    @Test
    void acceptanceAfterTheServerDeadlineIsRefusedEvenBeforeTheWorkerRuns() {
        Driver driver = driverAt(north(200));
        OrderView order = order(client());
        UUID offerId = onlyOffer(driver).id();
        jdbc.sql("update offer set expires_at = now() - interval '1 second' where order_id = :id")
                .param("id", order.id()).update();

        assertCode(() -> dispatch.accept(driver.actor(), UUID.randomUUID(), offerId), ErrorCode.OFFER_EXPIRED);
        assertThat(activeAssignments(order.id())).isZero();
    }

    // ------------------------------------------------------------ the "ALL" tab

    @Test
    void withNobodyNearTheOrderGoesToAllAndCanBeClaimed() {
        OrderView order = order(client());
        assertThat(orders.get(order.id()).searchPhase()).isEqualTo("BROADCAST");

        Driver driver = driverAt(north(1000));
        List<BroadcastOrderView> visible = dispatch.broadcast(driver.actor());
        assertThat(visible).extracting(BroadcastOrderView::orderId).containsExactly(order.id());
        assertThat(visible.getFirst().distanceM()).isBetween(900, 1100);

        AssignmentView assignment = dispatch.claim(driver.actor(), UUID.randomUUID(), order.id());

        assertThat(assignment.source()).isEqualTo("BROADCAST");
        assertThat(orders.get(order.id()).status()).isEqualTo("ASSIGNED");
        assertThat(dispatch.broadcast(driverAt(north(500)).actor())).isEmpty();
    }

    @Test
    void ineligibleDriverSeesNothingInAllAndCannotClaim() {
        OrderView order = order(client());
        Driver driver = driverAt(north(300));
        jdbc.sql("update driver set review_status = 'SUSPENDED' where id = :id").param("id", driver.actor().id()).update();

        assertThat(dispatch.broadcast(driver.actor())).isEmpty();
        assertCode(() -> dispatch.claim(driver.actor(), UUID.randomUUID(), order.id()), ErrorCode.DRIVER_NOT_ELIGIBLE);
    }

    @Test
    void hundredSimultaneousClaimsProduceOneAssignment() throws Exception {
        OrderView order = order(client());
        List<Driver> drivers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            drivers.add(driverAt(north(100 + i * 10)));
        }

        List<Callable<AssignmentView>> claims = new ArrayList<>();
        for (Driver driver : drivers) {
            claims.add(() -> dispatch.claim(driver.actor(), UUID.randomUUID(), order.id()));
        }
        Outcomes outcomes = runTogether(claims, 16);

        assertThat(outcomes.succeeded()).isEqualTo(1);
        assertThat(outcomes.codes()).containsOnly(ErrorCode.ORDER_ALREADY_ASSIGNED);
        assertThat(activeAssignments(order.id())).isEqualTo(1);
        assertThat(jdbc.sql("select count(*) from driver_capacity where occupancy <> 'FREE' and driver_id = any(:ids)")
                .param("ids", drivers.stream().map(d -> d.actor().id()).toArray(UUID[]::new))
                .query(Integer.class).single()).isEqualTo(1);
    }

    @Test
    void oneDriverClaimingTwoOrdersAtOnceGetsOne() throws Exception {
        OrderView first = order(client());
        OrderView second = order(client());
        Driver driver = driverAt(north(300));

        Outcomes outcomes = runTogether(List.of(
                () -> dispatch.claim(driver.actor(), UUID.randomUUID(), first.id()),
                () -> dispatch.claim(driver.actor(), UUID.randomUUID(), second.id())), 2);

        assertThat(outcomes.succeeded()).isEqualTo(1);
        assertThat(outcomes.codes()).containsOnly(ErrorCode.DRIVER_BUSY);
        assertThat(jdbc.sql("select count(*) from assignment where driver_id = :id and state = 'COMMITTED'")
                .param("id", driver.actor().id()).query(Integer.class).single()).isEqualTo(1);
    }

    // ------------------------------------------------------------ cancellation and deadlines

    @Test
    void cancellationRacingAcceptanceNeverLeavesAPhantomTrip() throws Exception {
        for (int round = 0; round < 5; round++) {
            cleanArea();
            Actor payer = client();
            Driver driver = driverAt(north(200));
            OrderView order = order(payer);
            UUID offerId = onlyOffer(driver).id();
            long version = orders.get(order.id()).version();

            runTogether(List.of(
                    () -> dispatch.accept(driver.actor(), UUID.randomUUID(), offerId),
                    () -> orders.cancel(payer, UUID.randomUUID(), order.id(), version, "CHANGED_MIND")), 2);

            OrderView result = orders.get(order.id());
            if ("CANCELLED".equals(result.status())) {
                assertThat(activeAssignments(order.id())).isZero();
                assertThat(occupancy(driver)).isEqualTo("FREE");
            } else {
                assertThat(result.status()).isEqualTo("ASSIGNED");
                assertThat(activeAssignments(order.id())).isEqualTo(1);
                assertThat(occupancy(driver)).isEqualTo("TO_PICKUP");
            }
        }
    }

    @Test
    void cancellingAnAssignedOrderFreesTheDriverAndAppliesAPendingPause() {
        Actor payer = client();
        Driver driver = driverAt(north(200));
        OrderView order = order(payer);
        dispatch.accept(driver.actor(), UUID.randomUUID(), onlyOffer(driver).id());
        DriverAvailability busy = sessions.availability(driver.actor().id());
        sessions.pause(driver.actor(), UUID.randomUUID(), driver.device(), busy.sessionVersion());

        OrderView cancelled = orders.cancel(payer, UUID.randomUUID(), order.id(), orders.get(order.id()).version(),
                "CHANGED_MIND");

        assertThat(cancelled.status()).isEqualTo("CANCELLED");
        assertThat(cancelled.assignment().state()).isEqualTo("RELEASED");
        assertThat(cancelled.assignment().tripPhase()).isEqualTo("ABORTED");
        DriverAvailability after = sessions.availability(driver.actor().id());
        assertThat(after.occupancy()).isEqualTo("FREE");
        assertThat(after.intent()).isEqualTo("NOT_ACCEPTING");
    }

    @Test
    void cancellingWhileSearchingRevokesTheOffer() {
        Actor payer = client();
        Driver driver = driverAt(north(200));
        OrderView order = order(payer);
        onlyOffer(driver);

        orders.cancel(payer, UUID.randomUUID(), order.id(), orders.get(order.id()).version(), "CHANGED_MIND");

        assertThat(dispatch.offers(driver.actor())).isEmpty();
        assertThat(occupancy(driver)).isEqualTo("FREE");
        assertThat(orders.get(order.id()).searchPhase()).isEqualTo("STOPPED");
    }

    @Test
    void noDriverUntilTheTotalDeadlineMakesTheOrderUnfulfilled() {
        OrderView order = order(client());
        jdbc.sql("""
                        update dispatch_attempt set total_deadline = now() - interval '1 second',
                                                    next_action_at = now() - interval '1 second'
                        where order_id = :id""")
                .param("id", order.id()).update();

        worker.runOnce();

        OrderView result = orders.get(order.id());
        assertThat(result.status()).isEqualTo("UNFULFILLED");
        assertThat(result.statusReason()).isEqualTo("NO_DRIVER");
        assertThat(result.searchPhase()).isEqualTo("EXHAUSTED");
    }

    @Test
    void endOfThePersonalPhaseRevokesTheOfferAndBroadcasts() {
        Driver driver = driverAt(north(200));
        OrderView order = order(client());
        onlyOffer(driver);
        jdbc.sql("update dispatch_attempt set phase_deadline = now() - interval '1 second' where order_id = :id")
                .param("id", order.id()).update();
        makeDue(order.id());

        worker.runOnce();

        assertThat(orders.get(order.id()).searchPhase()).isEqualTo("BROADCAST");
        assertThat(occupancy(driver)).isEqualTo("FREE");
    }

    @Test
    void lateWorkerNeverUndoesAnAcceptedOrder() {
        Driver driver = driverAt(north(200));
        OrderView order = order(client());
        dispatch.accept(driver.actor(), UUID.randomUUID(), onlyOffer(driver).id());
        jdbc.sql("""
                        update dispatch_attempt set next_action_at = now() - interval '1 second',
                                                    total_deadline = now() - interval '1 second'
                        where order_id = :id""")
                .param("id", order.id()).update();

        worker.runOnce();

        assertThat(orders.get(order.id()).status()).isEqualTo("ASSIGNED");
        assertThat(activeAssignments(order.id())).isEqualTo(1);
    }

    // ------------------------------------------------------------ order rules

    @Test
    void oneActiveOrderPerPayer() {
        Actor payer = client();
        order(payer);

        assertCode(() -> order(payer), ErrorCode.ORDER_ALREADY_ACTIVE);
    }

    @Test
    void orderRequestsAreValidated() {
        Actor payer = client();
        Actor other = client();

        assertCode(() -> orders.create(payer, UUID.randomUUID(), new CreateOrder(payer.id(), "STANDARD",
                new GeoPoint(10, 10), "x", DROPOFF, "y", PaymentMethod.CASH, UUID.randomUUID())), ErrorCode.OUTSIDE_SERVICE_AREA);
        // No card merchant in this city (ADR 0008).
        assertCode(() -> orders.create(payer, UUID.randomUUID(), new CreateOrder(payer.id(), "STANDARD", PICKUP, "x",
                DROPOFF, "y", PaymentMethod.CARD, quote(payer))), ErrorCode.VALIDATION_FAILED);
        assertCode(() -> orders.create(payer, UUID.randomUUID(), new CreateOrder(other.id(), "STANDARD", PICKUP, "x",
                DROPOFF, "y", PaymentMethod.CASH, UUID.randomUUID())), ErrorCode.ACCESS_DENIED);
        assertCode(() -> orders.cancel(other, UUID.randomUUID(), order(payer).id(), 0, "x"), ErrorCode.NOT_FOUND);
    }

    @Test
    void orderSourcesFollowWhoIsAsking() {
        Actor web = client();
        OrderView fromWeb = orders.create(web, UUID.randomUUID(), new CreateOrder(web.id(), "STANDARD", PICKUP, "x",
                DROPOFF, "y", PaymentMethod.CASH, quote(web), OrderChannel.WEB, null));
        assertThat(fromWeb.channel()).isEqualTo("WEB");
        assertThat(order(client()).channel()).as("app by default").isEqualTo("APP");

        Actor rider = client();
        assertCode(() -> orders.create(rider, UUID.randomUUID(), new CreateOrder(rider.id(), "STANDARD", PICKUP, "x",
                DROPOFF, "y", PaymentMethod.CASH, UUID.randomUUID(), OrderChannel.PHONE, null)), ErrorCode.VALIDATION_FAILED);

        UUID staffId = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, city_scope, state, created_at, updated_at)
                        values (:id, :login, 'Operator', 'OPERATOR', '{orders.create}', :cities, 'ACTIVE', now(), now())""")
                .param("id", staffId).param("login", "op-" + staffId).param("cities", new UUID[] {cityId}).update();
        Actor operator = new Actor(SubjectType.STAFF, staffId);
        OrderView phone = orders.create(operator, UUID.randomUUID(), new CreateOrder(null, "STANDARD", PICKUP, "x",
                DROPOFF, "y", PaymentMethod.CASH, quote(operator), OrderChannel.PHONE, "call-123"));
        assertThat(phone.channel()).isEqualTo("PHONE");
        assertThat(phone.payerClientId()).isNull();

        Actor partner = new Actor(SubjectType.PARTNER, UUID.randomUUID());
        assertCode(() -> orders.create(partner, UUID.randomUUID(), new CreateOrder(null, "STANDARD", PICKUP, "x",
                DROPOFF, "y", PaymentMethod.CASH, UUID.randomUUID(), OrderChannel.PARTNER, "partner-order-1")),
                ErrorCode.ACCESS_DENIED);
    }

    @Test
    void historyRecordsEveryVersionOfTheOrder() {
        Driver driver = driverAt(north(200));
        OrderView order = order(client());
        dispatch.reject(driver.actor(), UUID.randomUUID(), onlyOffer(driver).id());

        OrderView current = orders.get(order.id());
        List<Map<String, Object>> events = jdbc.sql("select sequence, type from order_event where order_id = :id order by sequence")
                .param("id", order.id()).query().listOfRows();

        assertThat(events).hasSize((int) current.version() + 1);
        assertThat(events).extracting(e -> e.get("type"))
                .startsWith("OrderCreated", "OrderSearchStarted", "OfferMade", "OfferRejected");
    }

    // ------------------------------------------------------------ helpers

    record Outcomes(int succeeded, List<ErrorCode> codes) {
    }

    private static <T> Outcomes runTogether(List<Callable<T>> calls, int threads) throws Exception {
        CountDownLatch start = new CountDownLatch(1);
        ExecutorService pool = Executors.newFixedThreadPool(threads);
        try {
            List<Future<T>> futures = new ArrayList<>();
            for (Callable<T> call : calls) {
                futures.add(pool.submit(() -> {
                    start.await();
                    return call.call();
                }));
            }
            start.countDown();
            int succeeded = 0;
            List<ErrorCode> codes = new ArrayList<>();
            for (Future<T> future : futures) {
                try {
                    future.get();
                    succeeded++;
                } catch (ExecutionException e) {
                    if (e.getCause() instanceof DomainException domain) {
                        codes.add(domain.code());
                    } else {
                        throw e;
                    }
                }
            }
            return new Outcomes(succeeded, codes);
        } finally {
            pool.shutdownNow();
        }
    }
}
