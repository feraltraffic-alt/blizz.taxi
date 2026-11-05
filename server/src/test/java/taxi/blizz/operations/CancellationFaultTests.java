package taxi.blizz.operations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.configuration.CancelReasons;
import taxi.blizz.configuration.ServiceSettings;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.SessionService;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.pricing.QuoteService;

/**
 * Who is at fault for a cancelled order (owner decision 05.11.2026, ADR 0019): the fault comes from the reason, the
 * client's turns free before a driver and within the free window, the driver's when a reason says so and the driver
 * is late, and every number is the service's setting. Its own city at longitude -129.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class CancellationFaultTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, -128.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, -128.45);

    @Autowired Orders orders;
    @Autowired Dispatch dispatch;
    @Autowired Trips trips;
    @Autowired WorkSessions sessions;
    @Autowired SessionService auth;
    @Autowired QuoteService quotes;
    @Autowired ServiceSettings settings;
    @Autowired CancelReasons reasons;
    @Autowired JdbcClient jdbc;

    TestRides rides;
    UUID city;

    @BeforeEach
    void city() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        city = rides.city("test-cancellation-fault", "UAH", -129);
    }

    // ------------------------------------------------------------ the client's fault, free or not

    @Test
    void theClientCancellingBeforeADriverIsFree() {
        Actor payer = rides.client();
        OrderView order = rides.order(payer, city, PICKUP, DROPOFF);

        OrderView cancelled = orders.cancel(payer, UUID.randomUUID(), order.id(), order.version(), "CHANGED_MIND");

        assertThat(cancelled.cancellation().fault()).isEqualTo("CLIENT_FREE");
        assertThat(eventFault(order, "OrderCancelled")).isEqualTo("CLIENT_FREE");
    }

    @Test
    void theClientCancellingWithinTwoMinutesOfTheAcceptanceIsFreeAndLaterIsNot() {
        TestRides.Ride early = ride();
        acceptedAgo(early, 110);
        assertThat(riderCancels(early, "CHANGED_MIND")).isEqualTo("CLIENT_FREE");

        TestRides.Ride late = ride();
        acceptedAgo(late, 130);
        assertThat(riderCancels(late, "CHANGED_MIND")).isEqualTo("CLIENT");
    }

    @Test
    void theFreeWindowIsTheServicesSetting() {
        withFault(new ServiceSettings.CancellationFault(5, 5, 15, false), () -> {
            TestRides.Ride ride = ride();
            acceptedAgo(ride, 4 * 60);
            assertThat(riderCancels(ride, "CHANGED_MIND")).as("4 minutes within 5").isEqualTo("CLIENT_FREE");
        });
        withFault(new ServiceSettings.CancellationFault(0, 5, 15, false), () -> {
            TestRides.Ride ride = ride();
            acceptedAgo(ride, 5);
            assertThat(riderCancels(ride, "CHANGED_MIND")).as("no free window").isEqualTo("CLIENT");
        });
    }

    // ------------------------------------------------------------ the driver late

    @Test
    void waitingTooLongForADriverLaterThanPromisedIsTheDriversFault() {
        TestRides.Ride ride = ride();
        acceptedAgo(ride, 20 * 60);
        promisedAgo(ride, 6 * 60);

        assertThat(riderCancels(ride, "WAIT_TOO_LONG")).isEqualTo("DRIVER");
        assertThat(jdbc.sql("""
                        select payload ->> 'driver_late' from order_event
                        where order_id = :o and type = 'OrderCancelled'""")
                .param("o", ride.order().id()).query(String.class).single()).isEqualTo("true");
        assertThat(driverCancellations(ride)).as("not counted against the driver by default").isZero();
    }

    @Test
    void fiveMinutesOverThePromiseAreNotLateYet() {
        TestRides.Ride ride = ride();
        acceptedAgo(ride, 20 * 60);
        promisedAgo(ride, 4 * 60);

        assertThat(riderCancels(ride, "WAIT_TOO_LONG")).isEqualTo("CLIENT");
    }

    @Test
    void withoutAPromiseTheDriverIsLateAfterFifteenMinutes() {
        TestRides.Ride late = ride();
        assertThat(promised(late)).as("no router in the tests: a straight-line time promises nothing").isNull();
        acceptedAgo(late, 16 * 60);
        assertThat(riderCancels(late, "WAIT_TOO_LONG")).isEqualTo("DRIVER");

        TestRides.Ride notYet = ride();
        acceptedAgo(notYet, 14 * 60);
        assertThat(riderCancels(notYet, "WAIT_TOO_LONG")).isEqualTo("CLIENT");
    }

    @Test
    void aDriverWhoArrivedLateIsStillAtFault() {
        TestRides.Ride ride = ride();
        rides.moveTo(ride.driver(), TestRides.north(PICKUP, 30));
        trips.arrive(ride.driver().actor(), UUID.randomUUID(), ride.trip().id(), ride.trip().version(), null);
        acceptedAgo(ride, 30 * 60);
        promisedAgo(ride, 20 * 60);
        jdbc.sql("update trip set arrived_at = now() - interval '10 minutes' where order_id = :o")
                .param("o", ride.order().id()).update();

        assertThat(riderCancels(ride, "WAIT_TOO_LONG")).as("arrived 10 minutes past the promise").isEqualTo("DRIVER");
    }

    @Test
    void aReasonWithoutTheLateMarkStaysTheClientsWhenTheDriverIsLate() {
        TestRides.Ride ride = ride();
        acceptedAgo(ride, 30 * 60);
        promisedAgo(ride, 20 * 60);

        assertThat(riderCancels(ride, "CHANGED_MIND")).isEqualTo("CLIENT");
    }

    @Test
    void theLatenessMinutesAndTheCountingAreTheServicesSettings() {
        withFault(new ServiceSettings.CancellationFault(2, 10, 30, true), () -> {
            TestRides.Ride notLate = ride();
            acceptedAgo(notLate, 20 * 60);
            promisedAgo(notLate, 8 * 60);
            assertThat(riderCancels(notLate, "WAIT_TOO_LONG")).as("8 minutes within 10").isEqualTo("CLIENT");

            TestRides.Ride noPromise = ride();
            acceptedAgo(noPromise, 20 * 60);
            assertThat(riderCancels(noPromise, "WAIT_TOO_LONG")).as("20 minutes within 30").isEqualTo("CLIENT");

            TestRides.Ride late = ride();
            acceptedAgo(late, 30 * 60);
            promisedAgo(late, 11 * 60);
            assertThat(riderCancels(late, "WAIT_TOO_LONG")).isEqualTo("DRIVER");
            assertThat(jdbc.sql("""
                            select source || ':' || counted from driver_cancellation where order_id = :o""")
                    .param("o", late.order().id()).query(String.class).single())
                    .as("counted against the driver when the service says so").isEqualTo("LATE:true");
        });
    }

    // ------------------------------------------------------------ staff and drivers

    @Test
    void staffReasonsGiveTheirFault() {
        Actor operator = staff("orders.cancel");
        Map<String, String> expected = Map.of("DUPLICATE", "NONE", "TEST_ORDER", "NONE", "NO_CARS", "NONE",
                "OPERATOR_ERROR", "OPERATOR", "PASSENGER_ASKED", "CLIENT_FREE");
        expected.forEach((code, fault) -> {
            OrderView order = rides.order(rides.client(), city, PICKUP, DROPOFF);
            OrderView cancelled = orders.cancel(operator, UUID.randomUUID(), order.id(), order.version(), code);
            assertThat(cancelled.cancellation().fault()).as(code).isEqualTo(fault);
        });
    }

    @Test
    void aDriverCancellingBecauseThePassengerAskedIsTheClientsFault() {
        TestRides.Ride ride = ride();
        acceptedAgo(ride, 5 * 60);

        trips.cancel(ride.driver().actor(), UUID.randomUUID(), ride.trip().id(), trips.current(ride.driver().actor())
                .orElseThrow().version(), "PASSENGER_ASKED");

        assertThat(orders.get(ride.order().id()).cancellation().fault()).isEqualTo("CLIENT");
    }

    @Test
    void aDriversOwnReasonIsTheDriversFault() {
        Actor admin = staff(CancelReasons.MANAGE_PERMISSION);
        String code = "FAULT_TEST_" + Long.toString(System.nanoTime() % 1_000_000_000L, 36).toUpperCase();
        CancelReasons.Reason created = reasons.create(admin, UUID.randomUUID(), new CancelReasons.Draft(
                CancelReasons.Audience.DRIVER, code, Map.of("ru", "Не хочу ехать"),
                CancelReasons.DriverOutcome.CANCEL_ORDER, false, false, true, 900), "Test of ADR 0019");
        assertThat(created.fault()).as("a new driver's reason starts as the driver's").isEqualTo(
                CancelReasons.Fault.DRIVER);
        TestRides.Ride ride = ride();

        trips.cancel(ride.driver().actor(), UUID.randomUUID(), ride.trip().id(), trips.current(ride.driver().actor())
                .orElseThrow().version(), code);

        assertThat(orders.get(ride.order().id()).cancellation().fault()).isEqualTo("DRIVER");
    }

    // ------------------------------------------------------------ the reasons and the settings

    @Test
    void theStartingReasonsCarryTheFaultsOfADR0019() {
        Map<String, CancelReasons.Reason> all = new java.util.HashMap<>();
        reasons.all(staff(CancelReasons.MANAGE_PERMISSION)).forEach(r -> all.put(r.audience() + ":" + r.code(), r));
        Map<String, CancelReasons.Fault> expected = Map.ofEntries(
                Map.entry("RIDER:CHANGED_MIND", CancelReasons.Fault.CLIENT),
                Map.entry("RIDER:WAIT_TOO_LONG", CancelReasons.Fault.CLIENT),
                Map.entry("DRIVER:NO_SHOW", CancelReasons.Fault.CLIENT),
                Map.entry("DRIVER:PASSENGER_ASKED", CancelReasons.Fault.CLIENT),
                Map.entry("DRIVER:VEHICLE_PROBLEM", CancelReasons.Fault.DRIVER),
                Map.entry("STAFF:PASSENGER_ASKED", CancelReasons.Fault.CLIENT),
                Map.entry("STAFF:OPERATOR_ERROR", CancelReasons.Fault.OPERATOR),
                Map.entry("STAFF:DUPLICATE", CancelReasons.Fault.NONE),
                Map.entry("STAFF:ACCIDENT", CancelReasons.Fault.NONE),
                Map.entry("STAFF:VEHICLE_BREAKDOWN", CancelReasons.Fault.DRIVER));
        expected.forEach((key, fault) -> assertThat(all.get(key).fault()).as(key).isEqualTo(fault));
        assertThat(all.get("RIDER:WAIT_TOO_LONG").lateDriverFault()).isTrue();
        assertThat(all.get("RIDER:CHANGED_MIND").lateDriverFault()).isFalse();
        assertThat(all.values().stream().filter(r -> r.audience() == CancelReasons.Audience.REASSIGN))
                .isNotEmpty().allMatch(r -> r.fault() == null);
    }

    @Test
    void aReasonsFaultIsCheckedWhenSaved() {
        Actor admin = staff(CancelReasons.MANAGE_PERMISSION);
        List<CancelReasons.Draft> wrong = List.of(
                draft(CancelReasons.Audience.RIDER, null, false, CancelReasons.Fault.OPERATOR, false),
                draft(CancelReasons.Audience.RIDER, null, false, CancelReasons.Fault.DRIVER, true),
                draft(CancelReasons.Audience.STAFF, null, true, CancelReasons.Fault.NONE, false),
                draft(CancelReasons.Audience.REASSIGN, null, false, CancelReasons.Fault.NONE, false));
        for (CancelReasons.Draft d : wrong) {
            assertThatThrownBy(() -> reasons.create(admin, UUID.randomUUID(), d, "Test of ADR 0019")).as("%s", d)
                    .isInstanceOfSatisfying(DomainException.class,
                            e -> assertThat(e.code()).isEqualTo(ErrorCode.VALIDATION_FAILED));
        }
        CancelReasons.Reason operator = reasons.create(admin, UUID.randomUUID(),
                draft(CancelReasons.Audience.STAFF, null, false, CancelReasons.Fault.OPERATOR, false), "Test");
        assertThat(operator.operatorFault()).as("the fault OPERATOR is the operator flag").isTrue();

        CancelReasons.Reason kept = reasons.update(admin, UUID.randomUUID(), operator.id(), operator.version(),
                new CancelReasons.Draft(null, null, operator.labels(), null, true, false, true, 5), "Older client");
        assertThat(kept.fault()).as("an update without the fault keeps it").isEqualTo(CancelReasons.Fault.OPERATOR);
        CancelReasons.Reason cleared = reasons.update(admin, UUID.randomUUID(), kept.id(), kept.version(),
                new CancelReasons.Draft(null, null, kept.labels(), null, false, false, true, 5), "Older client");
        assertThat(cleared.fault()).as("clearing the operator flag").isEqualTo(CancelReasons.Fault.NONE);
    }

    @Test
    void theSettingsAreCheckedWhenSaved() {
        Actor admin = staff(ServiceSettings.MANAGE_PERMISSION);
        for (ServiceSettings.CancellationFault wrong : List.of(new ServiceSettings.CancellationFault(-1, 5, 15, false),
                new ServiceSettings.CancellationFault(61, 5, 15, false),
                new ServiceSettings.CancellationFault(2, 0, 15, false),
                new ServiceSettings.CancellationFault(2, 5, 0, false),
                new ServiceSettings.CancellationFault(2, 5, 181, false))) {
            ServiceSettings.Version before = settings.current();
            assertThatThrownBy(() -> settings.change(admin, UUID.randomUUID(), before.version(),
                    with(before.settings(), wrong), "Test of ADR 0019")).as("%s", wrong)
                    .isInstanceOfSatisfying(DomainException.class,
                            e -> assertThat(e.code()).isEqualTo(ErrorCode.VALIDATION_FAILED));
        }
        assertThat(settings.current().settings().cancellationFault()).as("the defaults")
                .isEqualTo(new ServiceSettings.CancellationFault(2, 5, 15, false));
    }

    // ------------------------------------------------------------ helpers

    /** An accepted order of a new driver, the only one on line in the city. */
    private TestRides.Ride ride() {
        rides.city("test-cancellation-fault", "UAH", -129);
        return rides.assigned(city, rides.driverNear(PICKUP), PICKUP, DROPOFF);
    }

    private String riderCancels(TestRides.Ride ride, String code) {
        OrderView now = orders.get(ride.order().id());
        return orders.cancel(ride.payer(), UUID.randomUUID(), now.id(), now.version(), code).cancellation().fault();
    }

    private void acceptedAgo(TestRides.Ride ride, int seconds) {
        jdbc.sql("update assignment set created_at = now() - make_interval(secs => :s) where order_id = :o")
                .param("s", seconds).param("o", ride.order().id()).update();
    }

    private void promisedAgo(TestRides.Ride ride, int seconds) {
        jdbc.sql("update assignment set promised_pickup_at = now() - make_interval(secs => :s) where order_id = :o")
                .param("s", seconds).param("o", ride.order().id()).update();
    }

    private Object promised(TestRides.Ride ride) {
        return jdbc.sql("select promised_pickup_at from assignment where order_id = :o")
                .param("o", ride.order().id()).query().singleRow().get("promised_pickup_at");
    }

    private int driverCancellations(TestRides.Ride ride) {
        return jdbc.sql("select count(*) from driver_cancellation where order_id = :o")
                .param("o", ride.order().id()).query(Integer.class).single();
    }

    private String eventFault(OrderView order, String type) {
        return jdbc.sql("select payload ->> 'fault' from order_event where order_id = :o and type = :t")
                .param("o", order.id()).param("t", type).query(String.class).single();
    }

    private static CancelReasons.Draft draft(CancelReasons.Audience audience, CancelReasons.DriverOutcome outcome,
                                             boolean operatorFault, CancelReasons.Fault fault, boolean late) {
        String code = "F" + Long.toString(System.nanoTime() % 1_000_000_000_000L, 36).toUpperCase();
        return new CancelReasons.Draft(audience, code, Map.of("ru", "Проверка"), outcome, operatorFault, false, true,
                950, fault, late);
    }

    private void withFault(ServiceSettings.CancellationFault fault, Runnable body) {
        Actor admin = staff(ServiceSettings.MANAGE_PERMISSION);
        ServiceSettings.Version before = settings.current();
        ServiceSettings.Version changed = settings.change(admin, UUID.randomUUID(), before.version(),
                with(before.settings(), fault), "Test of ADR 0019");
        try {
            body.run();
        } finally {
            settings.change(admin, UUID.randomUUID(), changed.version(), before.settings(), "Back after the test");
        }
    }

    private static ServiceSettings.Settings with(ServiceSettings.Settings s, ServiceSettings.CancellationFault f) {
        return new ServiceSettings.Settings(s.brand(), s.languages(), s.calls(), s.preorders(), s.ratings(), s.tips(),
                s.orders(), s.cashNotReceived(), s.appVersions(), s.staffTopUps(), s.riderDebts(),
                s.driverDiscipline(), s.offerDiscipline(), s.pickupTime(), f);
    }

    private Actor staff(String permission) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, all_cities, state, created_at,
                                                updated_at)
                        values (:id, :login, 'Fault', 'ADMIN', :permissions, true, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "fault-" + id).param("permissions", new String[] {permission})
                .update();
        return new Actor(SubjectType.STAFF, id);
    }
}
