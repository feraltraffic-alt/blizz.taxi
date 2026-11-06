package taxi.blizz.refunds;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
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
 * Part 1 of #512 (ADR 0018 A1–A9): who may request and confirm a refund, the staff member's limits, what an order
 * allows, the time limit, the fault, and the rider warning — no money moves yet. Cash trips of its own city at
 * longitude -137; a card trip is part 2.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class RefundRequestTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, -136.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, -136.45);

    @Autowired Refunds refunds;
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
        city = rides.city("test-refunds", "UAH", -137);
    }

    // ------------------------------------------------------------ who

    @Test
    void theSuperAdminsRefundGoesAtOnceWithoutLimits() {
        TestRides.Ride ride = cashRide();
        Actor superAdmin = staff("SUPER_ADMIN", true);

        Refunds.Requested r = refunds.request(superAdmin, UUID.randomUUID(), bonuses(ride, fare(ride), "GOODWILL"));

        assertThat(r.refund().state()).isEqualTo("APPROVED");
        assertThat(r.refund().decidedBy()).isEqualTo(superAdmin.id());
        assertThat(r.refund().bonusMinor()).isEqualTo(fare(ride));
        assertThat(r.refund().fault()).isEqualTo("NONE");
        assertThat(count("select count(*) from outbox where event_type = 'RefundApproved' and aggregate_id = :id",
                r.refund().id())).isEqualTo(1);
        assertThat(count("select count(*) from audit_log where action = 'refund.request' and resource_id = :id",
                r.refund().id().toString())).isEqualTo(1);
    }

    @Test
    void anAdminsRequestWaitsForSomeoneElseToConfirm() {
        TestRides.Ride ride = cashRide();
        Actor admin = admin(2000, 3000);
        Actor confirmer = staff("ADMIN", true, Refunds.CONFIRM_PERMISSION);

        Refunds.Refund requested = refunds.request(admin, UUID.randomUUID(), bonuses(ride, 1500, "LONG_ROUTE"))
                .refund();
        assertThat(requested.state()).isEqualTo("REQUESTED");
        assertThat(requested.fault()).as("the reason's fault").isEqualTo("DRIVER");
        assertCode(() -> refunds.confirm(admin, UUID.randomUUID(), requested.id(), requested.version()),
                ErrorCode.ACCESS_DENIED);
        Actor both = staff("ADMIN", true, Refunds.CREATE_PERMISSION, Refunds.CONFIRM_PERMISSION);
        limit(both, 2000, 3000);
        Refunds.Refund own = refunds.request(both, UUID.randomUUID(), bonuses(ride, 1000, "GOODWILL")).refund();
        assertCode(() -> refunds.confirm(both, UUID.randomUUID(), own.id(), own.version()), ErrorCode.ACCESS_DENIED);
        assertCode(() -> refunds.reject(both, UUID.randomUUID(), own.id(), own.version(), "Mine"),
                ErrorCode.ACCESS_DENIED);
        assertThat(refunds.waiting(both)).as("not one's own").extracting(Refunds.Refund::id)
                .doesNotContain(own.id()).contains(requested.id());
        assertThat(refunds.waiting(confirmer)).extracting(Refunds.Refund::id).contains(requested.id());
        assertThat(refunds.waiting(admin)).as("not one's own").isEmpty();
        assertCode(() -> refunds.confirm(confirmer, UUID.randomUUID(), requested.id(), requested.version() + 1),
                ErrorCode.VERSION_CONFLICT);

        Refunds.Refund approved = refunds.confirm(confirmer, UUID.randomUUID(), requested.id(), requested.version());

        assertThat(approved.state()).isEqualTo("APPROVED");
        assertThat(approved.decidedBy()).isEqualTo(confirmer.id());
        assertThat(approved.amountMinor()).as("the confirmer does not change the amount").isEqualTo(1500);
        assertCode(() -> refunds.confirm(confirmer, UUID.randomUUID(), approved.id(), approved.version()),
                ErrorCode.STATE_CONFLICT);
    }

    @Test
    void aRejectionNeedsAReasonAndFreesTheSum() {
        TestRides.Ride ride = cashRide();
        Actor admin = admin(fare(ride), fare(ride) * 3);
        Actor confirmer = staff("ADMIN", true, Refunds.CONFIRM_PERMISSION);
        Refunds.Refund requested = refunds.request(admin, UUID.randomUUID(), bonuses(ride, fare(ride), "GOODWILL"))
                .refund();
        assertThat(refunds.refundable(admin, ride.order().id()).leftMinor()).isZero();
        assertCode(() -> refunds.reject(confirmer, UUID.randomUUID(), requested.id(), requested.version(), " "),
                ErrorCode.VALIDATION_FAILED);

        Refunds.Refund rejected = refunds.reject(confirmer, UUID.randomUUID(), requested.id(), requested.version(),
                "The route was the shortest");

        assertThat(rejected.state()).isEqualTo("REJECTED");
        assertThat(rejected.decisionReason()).isEqualTo("The route was the shortest");
        assertThat(refunds.refundable(admin, ride.order().id()).leftMinor()).isEqualTo(fare(ride));
    }

    @Test
    void withoutTheRightOrInAnotherCityNothingIsRequestedOrConfirmed() {
        TestRides.Ride ride = cashRide();
        assertCode(() -> refunds.request(staff("OPERATOR", true, "orders.cancel"), UUID.randomUUID(),
                bonuses(ride, 1000, "GOODWILL")), ErrorCode.ACCESS_DENIED);
        Actor elsewhere = staff("ADMIN", false, Refunds.CREATE_PERMISSION, Refunds.CONFIRM_PERMISSION);
        limit(elsewhere, 5000, 5000);
        assertCode(() -> refunds.request(elsewhere, UUID.randomUUID(), bonuses(ride, 1000, "GOODWILL")),
                ErrorCode.ACCESS_DENIED);
        assertCode(() -> refunds.refundable(elsewhere, ride.order().id()), ErrorCode.ACCESS_DENIED);
    }

    @Test
    void otherCities() {
        TestRides.Ride ride = cashRide();
        Refunds.Refund requested = refunds.request(admin(2000, 3000), UUID.randomUUID(),
                bonuses(ride, 1000, "GOODWILL")).refund();
        Actor elsewhere = staff("ADMIN", false, Refunds.CONFIRM_PERMISSION);
        Actor withoutRight = staff("ADMIN", true, Refunds.CREATE_PERMISSION);

        assertCode(() -> refunds.confirm(elsewhere, UUID.randomUUID(), requested.id(), requested.version()),
                ErrorCode.ACCESS_DENIED);
        assertCode(() -> refunds.reject(elsewhere, UUID.randomUUID(), requested.id(), requested.version(), "No"),
                ErrorCode.ACCESS_DENIED);
        assertCode(() -> refunds.confirm(withoutRight, UUID.randomUUID(), requested.id(), requested.version()),
                ErrorCode.ACCESS_DENIED);
        assertThat(refunds.waiting(elsewhere)).isEmpty();
    }

    // ------------------------------------------------------------ limits

    @Test
    void noLimitSetMeansNoRefunds() {
        TestRides.Ride ride = cashRide();
        Actor admin = staff("ADMIN", true, Refunds.CREATE_PERMISSION);

        assertCode(() -> refunds.request(admin, UUID.randomUUID(), bonuses(ride, 1000, "GOODWILL")),
                ErrorCode.REFUND_LIMIT);
    }

    @Test
    void oneRefundAndTwentyFourHoursAreBoundedAndAFailedOneDoesNotCount() {
        Actor admin = admin(1500, 2500);
        TestRides.Ride first = cashRide();
        assertCode(() -> refunds.request(admin, UUID.randomUUID(), bonuses(first, 1501, "GOODWILL")),
                ErrorCode.REFUND_LIMIT);
        Refunds.Refund taken = refunds.request(admin, UUID.randomUUID(), bonuses(first, 1500, "GOODWILL")).refund();
        TestRides.Ride second = cashRide();
        assertCode(() -> refunds.request(admin, UUID.randomUUID(), bonuses(second, 1001, "GOODWILL")),
                ErrorCode.REFUND_LIMIT);
        refunds.request(admin, UUID.randomUUID(), bonuses(second, 1000, "GOODWILL"));
        assertThat(refunds.limits(admin, admin.id())).singleElement()
                .satisfies(l -> assertThat(l.usedMinor()).isEqualTo(2500));

        jdbc.sql("update refund set state = 'FAILED' where id = :id").param("id", taken.id()).update();

        assertThat(refunds.request(admin, UUID.randomUUID(), bonuses(second, 1000, "GOODWILL")).refund().state())
                .as("a failed refund leaves room").isEqualTo("REQUESTED");
    }

    @Test
    void requestsAtOnceCannotPassTheDailyLimitTogether() throws Exception {
        Actor admin = admin(1000, 2000);
        List<TestRides.Ride> trips = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            trips.add(cashRide());
        }
        List<Callable<?>> calls = new ArrayList<>();
        trips.forEach(t -> calls.add(() -> refunds.request(admin, UUID.randomUUID(), bonuses(t, 1000, "GOODWILL"))));

        List<Object> results = parallel(calls);

        assertThat(results).filteredOn(r -> r instanceof Refunds.Requested).hasSize(2);
        assertThat(results).filteredOn(r -> r instanceof DomainException d && d.code() == ErrorCode.REFUND_LIMIT)
                .hasSize(4);
    }

    @Test
    void refundsOfTheWholeFareAtOnceCannotPassTogether() throws Exception {
        TestRides.Ride ride = cashRide();
        long whole = fare(ride);
        List<Callable<?>> calls = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            Actor superAdmin = staff("SUPER_ADMIN", true);
            calls.add(() -> refunds.request(superAdmin, UUID.randomUUID(), bonuses(ride, whole, "GOODWILL")));
        }

        List<Object> results = parallel(calls);

        assertThat(results).filteredOn(r -> r instanceof Refunds.Requested).hasSize(1);
        assertThat(results).filteredOn(r -> r instanceof DomainException d && d.code() == ErrorCode.REFUND_NOT_ALLOWED)
                .hasSize(7);
        assertThat(refunds.refundable(staff("SUPER_ADMIN", true), ride.order().id()).refundedMinor())
                .isEqualTo(whole);
    }

    // ------------------------------------------------------------ what the order allows

    @Test
    void partialRefundsWhileARemainderIsLeftAndNotBelowTheMinimum() {
        TestRides.Ride ride = cashRide();
        Actor superAdmin = staff("SUPER_ADMIN", true);
        assertCode(() -> refunds.request(superAdmin, UUID.randomUUID(), bonuses(ride, 999, "GOODWILL")),
                ErrorCode.REFUND_NOT_ALLOWED);
        refunds.request(superAdmin, UUID.randomUUID(), bonuses(ride, 1000, "GOODWILL"));
        long left = fare(ride) - 1000;
        assertCode(() -> refunds.request(superAdmin, UUID.randomUUID(), bonuses(ride, left + 1, "GOODWILL")),
                ErrorCode.REFUND_NOT_ALLOWED);
        refunds.request(superAdmin, UUID.randomUUID(), bonuses(ride, left, "GOODWILL"));

        Refunds.Refundable now = refunds.refundable(superAdmin, ride.order().id());
        assertThat(now.leftMinor()).isZero();
        assertThat(now.refundedMinor()).isEqualTo(fare(ride));
        assertThat(refunds.ofOrder(superAdmin, ride.order().id())).hasSize(2);
    }

    @Test
    void aCashTripGoesBackOnlyAsBonusesAndOnlyWithTheRidersConsent() {
        TestRides.Ride ride = cashRide();
        Actor superAdmin = staff("SUPER_ADMIN", true);
        assertThat(refunds.refundable(superAdmin, ride.order().id()).toCard()).isFalse();

        assertCode(() -> refunds.request(superAdmin, UUID.randomUUID(), new Refunds.Request(ride.order().id(), 1000,
                "CARD", true, "GOODWILL", null, null)), ErrorCode.REFUND_NOT_ALLOWED);
        assertCode(() -> refunds.request(superAdmin, UUID.randomUUID(), new Refunds.Request(ride.order().id(), 1000,
                "BONUSES", false, "GOODWILL", null, null)), ErrorCode.VALIDATION_FAILED);
    }

    @Test
    void thePartPaidWithBonusesGoesBackAsBonusesInItsShare() {
        TestRides.Ride ride = cashRide();
        long fare = fare(ride);
        long wallet = fare / 4;
        jdbc.sql("""
                        update order_event set payload = jsonb_set(payload, '{wallet_minor}', to_jsonb(cast(:w as bigint)))
                        where order_id = :o and type = 'TripCompleted'""")
                .param("w", wallet).param("o", ride.order().id()).update();
        Actor superAdmin = staff("SUPER_ADMIN", true);
        Refunds.Refundable allows = refunds.refundable(superAdmin, ride.order().id());
        assertThat(allows.bonusMinor()).isEqualTo(wallet);
        assertThat(allows.moneyMinor()).isEqualTo(fare - wallet);

        Refunds.Refund half = refunds.request(superAdmin, UUID.randomUUID(), bonuses(ride, fare / 2, "GOODWILL"))
                .refund();

        assertThat(half.paidBonusMinor()).isEqualTo(Math.floorDiv(fare / 2 * wallet, fare));
    }

    @Test
    void anOrderStillUnderWayIsNotRefunded() {
        TestRides.Ride ride = rides.started(city, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        assertCode(() -> refunds.request(staff("SUPER_ADMIN", true), UUID.randomUUID(),
                bonuses(ride, 1000, "GOODWILL")), ErrorCode.REFUND_NOT_ALLOWED);
    }

    // ------------------------------------------------------------ time

    @Test
    void staffRefundWithinThirtyDaysAndTheSuperAdminWithinOneHundredEighty() {
        TestRides.Ride ride = cashRide();
        endedDaysAgo(ride, 31);
        Actor admin = admin(5000, 5000);
        Actor superAdmin = staff("SUPER_ADMIN", true);
        assertCode(() -> refunds.request(admin, UUID.randomUUID(), bonuses(ride, 1000, "GOODWILL")),
                ErrorCode.REFUND_NOT_ALLOWED);
        assertThat(refunds.request(superAdmin, UUID.randomUUID(), bonuses(ride, 1000, "GOODWILL")).refund().state())
                .isEqualTo("APPROVED");

        endedDaysAgo(ride, 181);
        assertCode(() -> refunds.request(superAdmin, UUID.randomUUID(), bonuses(ride, 1000, "GOODWILL")),
                ErrorCode.REFUND_NOT_ALLOWED);
    }

    // ------------------------------------------------------------ the fault

    @Test
    void theFaultComesFromTheReasonAndAnotherOneNeedsAComment() {
        TestRides.Ride ride = cashRide();
        Actor superAdmin = staff("SUPER_ADMIN", true);
        assertCode(() -> refunds.request(superAdmin, UUID.randomUUID(), new Refunds.Request(ride.order().id(), 1000,
                "BONUSES", true, "OTHER", null, "Lost umbrella")), ErrorCode.VALIDATION_FAILED);
        assertCode(() -> refunds.request(superAdmin, UUID.randomUUID(), new Refunds.Request(ride.order().id(), 1000,
                "BONUSES", true, "OTHER", "DRIVER", null)), ErrorCode.VALIDATION_FAILED);
        assertCode(() -> refunds.request(superAdmin, UUID.randomUUID(), new Refunds.Request(ride.order().id(), 1000,
                "BONUSES", true, "LONG_ROUTE", "NONE", null)), ErrorCode.VALIDATION_FAILED);

        assertThat(refunds.request(superAdmin, UUID.randomUUID(), new Refunds.Request(ride.order().id(), 1000,
                "BONUSES", true, "OTHER", "DRIVER", "Smoked in the car")).refund().fault()).isEqualTo("DRIVER");
        assertThat(refunds.request(superAdmin, UUID.randomUUID(), new Refunds.Request(ride.order().id(), 1000,
                "BONUSES", true, "LONG_ROUTE", "NONE", "The road was closed")).refund().fault()).isEqualTo("NONE");
        assertThat(refunds.request(superAdmin, UUID.randomUUID(), bonuses(ride, 1000, "OPERATOR_ERROR")).refund()
                .fault()).isEqualTo("OPERATOR");
    }

    @Test
    void aCancelledOrderFollowsItsOwnFault() {
        Actor payer = rides.client();
        taxi.blizz.operations.OrderView order = rides.order(payer, city, PICKUP, DROPOFF);
        orders.cancel(payer, UUID.randomUUID(), order.id(), order.version(), "CHANGED_MIND");

        Refunds.Refundable allows = refunds.refundable(staff("SUPER_ADMIN", true), order.id());

        assertThat(allows.defaultFault()).isEqualTo("CLIENT_FREE");
        assertThat(allows.leftMinor()).as("nothing was paid").isZero();
    }

    // ------------------------------------------------------------ the rider warning, repeats, limits

    @Test
    void theFourthRefundToOneRiderInThirtyDaysWarns() {
        Actor superAdmin = staff("SUPER_ADMIN", true);
        Actor rider = rides.client();
        List<Refunds.Requested> made = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            TestRides.Ride ride = cashRide(rider);
            made.add(refunds.request(superAdmin, UUID.randomUUID(), bonuses(ride, 1000, "GOODWILL")));
        }
        assertThat(made).extracting(Refunds.Requested::riderWarning).containsExactly(false, false, false, true);
        assertThat(made.getLast().riderRefunds()).isEqualTo(3);
    }

    @Test
    void theSameCommandTwiceIsOneRefund() {
        TestRides.Ride ride = cashRide();
        Actor superAdmin = staff("SUPER_ADMIN", true);
        UUID command = UUID.randomUUID();

        Refunds.Requested first = refunds.request(superAdmin, command, bonuses(ride, 1000, "GOODWILL"));
        Refunds.Requested again = refunds.request(superAdmin, command, bonuses(ride, 1000, "GOODWILL"));

        assertThat(again.refund().id()).isEqualTo(first.refund().id());
        assertThat(refunds.ofOrder(superAdmin, ride.order().id())).hasSize(1);
    }

    @Test
    void onlyTheSuperAdminSetsLimitsAndStaffReadTheirOwn() {
        Actor superAdmin = staff("SUPER_ADMIN", true);
        Actor admin = staff("ADMIN", true, Refunds.CREATE_PERMISSION, Refunds.CONFIRM_PERMISSION);
        assertCode(() -> refunds.setLimit(admin, UUID.randomUUID(), admin.id(), "UAH", 1000, 2000, 0, "Myself"),
                ErrorCode.ACCESS_DENIED);
        assertCode(() -> refunds.setLimit(superAdmin, UUID.randomUUID(), admin.id(), "UAH", 2000, 1000, 0, "Daily "
                + "below one"), ErrorCode.VALIDATION_FAILED);

        Refunds.Limit set = refunds.setLimit(superAdmin, UUID.randomUUID(), admin.id(), "UAH", 1000, 2000, 0, "Pilot");
        assertCode(() -> refunds.setLimit(superAdmin, UUID.randomUUID(), admin.id(), "UAH", 1000, 3000, 0, "Stale"),
                ErrorCode.VERSION_CONFLICT);
        refunds.setLimit(superAdmin, UUID.randomUUID(), admin.id(), "UAH", 1000, 3000, set.version(), "More");

        assertThat(refunds.limits(admin, admin.id())).singleElement()
                .satisfies(l -> assertThat(l.dailyMinor()).isEqualTo(3000));
        Actor other = staff("ADMIN", true, Refunds.CREATE_PERMISSION);
        assertCode(() -> refunds.limits(other, admin.id()), ErrorCode.ACCESS_DENIED);
    }

    // ------------------------------------------------------------ helpers

    private TestRides.Ride cashRide() {
        return cashRide(null);
    }

    private TestRides.Ride cashRide(Actor rider) {
        rides.city("test-refunds", "UAH", -137);
        TestRides.Ride ride = rides.started(city, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        rides.complete(ride, true);
        if (rider != null) {
            jdbc.sql("update ride_order set payer_client_id = :p where id = :o")
                    .param("p", rider.id()).param("o", ride.order().id()).update();
            jdbc.sql("""
                            update order_event set payload = jsonb_set(payload, '{payer_client_id}', to_jsonb(cast(:p as text)))
                            where order_id = :o and type = 'TripCompleted'""")
                    .param("p", rider.id().toString()).param("o", ride.order().id()).update();
        }
        return ride;
    }

    private long fare(TestRides.Ride ride) {
        return orders.get(ride.order().id()).finalPriceMinor();
    }

    private static Refunds.Request bonuses(TestRides.Ride ride, long amount, String reason) {
        return new Refunds.Request(ride.order().id(), amount, "BONUSES", true, reason, null, null);
    }

    private void endedDaysAgo(TestRides.Ride ride, int days) {
        jdbc.sql("""
                        update order_event set occurred_at = now() - make_interval(days => :d)
                        where order_id = :o and type = 'TripCompleted'""")
                .param("d", days).param("o", ride.order().id()).update();
    }

    private Actor admin(long perRefund, long daily) {
        Actor admin = staff("ADMIN", true, Refunds.CREATE_PERMISSION);
        limit(admin, perRefund, daily);
        return admin;
    }

    private void limit(Actor staff, long perRefund, long daily) {
        refunds.setLimit(staff("SUPER_ADMIN", true), UUID.randomUUID(), staff.id(), "UAH", perRefund, daily, 0,
                "Test of #512");
    }

    private Actor staff(String role, boolean allCities, String... permissions) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, all_cities, city_scope, state,
                                                created_at, updated_at)
                        values (:id, :login, 'Refunds', :role, :permissions, :all, '{}', 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "refunds-" + id).param("role", role)
                .param("permissions", permissions).param("all", allCities).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private int count(String sql, Object id) {
        return jdbc.sql(sql).param("id", id).query(Integer.class).single();
    }

    private static List<Object> parallel(List<Callable<?>> calls) throws Exception {
        ExecutorService pool = Executors.newFixedThreadPool(calls.size());
        CountDownLatch start = new CountDownLatch(1);
        try {
            List<Future<Object>> futures = new ArrayList<>();
            for (Callable<?> call : calls) {
                futures.add(pool.submit(() -> {
                    start.await();
                    try {
                        return call.call();
                    } catch (DomainException e) {
                        return e;
                    }
                }));
            }
            start.countDown();
            List<Object> results = new ArrayList<>();
            for (Future<Object> f : futures) {
                results.add(f.get());
            }
            return results;
        } finally {
            pool.shutdownNow();
        }
    }

    private static void assertCode(Runnable call, ErrorCode code) {
        assertThatThrownBy(call::run).isInstanceOfSatisfying(DomainException.class,
                e -> assertThat(e.code()).isEqualTo(code));
    }
}
