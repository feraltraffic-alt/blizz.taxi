package taxi.blizz.operations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Set;
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
import taxi.blizz.driver.DriverAdmission;
import taxi.blizz.driver.DriverProfile;
import taxi.blizz.geo.CityOperations;
import taxi.blizz.geo.GeoConfiguration;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.SessionService;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.pricing.QuoteService;

/**
 * Issue #141, part 2: a driver works only in the cities they are admitted in (REQ-DSP-01, REQ-DS-06; E1), only inside
 * the city's polygon or its return zone (REQ-DS-07), and may narrow the ALL tab to a zone (REQ-DSP-07). Two cities
 * side by side: A at longitudes 147-148, B at 148-149; the border is longitude 148.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class AdmissionCityTests {

    static final GeoPoint PICKUP_A = new GeoPoint(-39.5, 147.5);
    static final GeoPoint DROPOFF_A = new GeoPoint(-39.45, 147.55);
    /** In A, 300 m west of the border. */
    static final GeoPoint BORDER_A = new GeoPoint(-39.5, 148 - 0.0035);
    /** In B, 300 m east of the border. */
    static final GeoPoint BORDER_B = new GeoPoint(-39.5, 148 + 0.0035);
    private static final AtomicLong SEQUENCE = new AtomicLong(9_000);

    @Autowired Orders orders;
    @Autowired Dispatch dispatch;
    @Autowired Trips trips;
    @Autowired WorkSessions sessions;
    @Autowired SessionService auth;
    @Autowired QuoteService quotes;
    @Autowired DriverAdmission admission;
    @Autowired CityOperations cityOperations;
    @Autowired JdbcClient jdbc;

    TestRides rides;
    UUID cityA;
    UUID cityB;

    @BeforeEach
    void cities() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        cityA = rides.city("test-admission-a", "UAH", 147);
        cityB = rides.city("test-admission-b", "UAH", 148);
        for (UUID city : List.of(cityA, cityB)) {
            jdbc.sql("""
                            update dispatch_attempt set phase = 'STOPPED', next_action_at = null
                            where phase in ('PERSONAL', 'BROADCAST')
                              and order_id in (select id from ride_order where city_id = :c)""")
                    .param("c", city).update();
            jdbc.sql("""
                            update ride_order set status = 'UNFULFILLED'
                            where city_id = :c and status in ('READY', 'SEARCHING', 'ASSIGNED', 'IN_SERVICE')""")
                    .param("c", city).update();
            jdbc.sql("delete from city_operations where city_id = :c").param("c", city).update();
        }
    }

    // ------------------------------------------------------------ E1: another city's driver

    @Test
    void goingOnlineNeedsAdmissionInTheCity() {
        TestRides.Driver driver = rides.driverNear(TestRides.north(BORDER_B, -2000));
        sessions.close(driver.actor(), UUID.randomUUID(), driver.device(), version(driver));
        admitIn(driver, cityB);
        TestRides.timePassed(jdbc, driver.actor().id());

        assertThatThrownBy(() -> sessions.open(driver.actor(), UUID.randomUUID(), driver.device(), driver.vehicle(),
                fix(PICKUP_A, 5.0)))
                .isInstanceOf(DomainException.class)
                .satisfies(e -> assertThat(((DomainException) e).code()).isEqualTo(ErrorCode.DRIVER_NOT_ELIGIBLE))
                .hasMessageContaining("ADMISSION_CITY");
        assertThat(sessions.open(driver.actor(), UUID.randomUUID(), driver.device(), driver.vehicle(),
                fix(TestRides.north(BORDER_B, -1000), 5.0)).eligible()).as("in B it works").isTrue();
    }

    @Test
    void aDriverOfTheNeighbouringCityNearThePickupIsNeverACandidateNorInTheAllTab() {
        TestRides.Driver neighbour = rides.driverNear(TestRides.north(BORDER_B, -1000));
        moveTo(neighbour, BORDER_B, 5.0);
        admitIn(neighbour, cityB);

        OrderView order = rides.order(rides.client(), cityA, BORDER_A, DROPOFF_A);

        assertThat(dispatch.offers(neighbour.actor())).as("600 m from the pickup, admitted only in B").isEmpty();
        assertThat(orders.get(order.id()).searchPhase()).isEqualTo("BROADCAST");
        assertThat(dispatch.broadcast(neighbour.actor())).extracting(BroadcastOrderView::orderId)
                .doesNotContain(order.id());
        assertCode(() -> dispatch.claim(neighbour.actor(), neighbour.device(), UUID.randomUUID(), order.id()),
                ErrorCode.DRIVER_NOT_ELIGIBLE);
    }

    @Test
    void aDriverTakenOffTheCityKeepsTheShiftButGetsNoNewOrderThere() {
        TestRides.Driver driver = rides.driverNear(PICKUP_A);
        admitIn(driver, cityB);

        DriverAvailability state = sessions.availability(driver.actor().id());
        assertThat(state.sessionState()).isEqualTo("OPEN");
        assertThat(state.ineligibleReasons()).containsExactly("ADMISSION_CITY");

        OrderView order = rides.order(rides.client(), cityA, PICKUP_A, DROPOFF_A);
        assertThat(dispatch.offers(driver.actor())).isEmpty();
        assertThat(journalReason(order.id(), driver)).isEqualTo("CITY_NOT_ADMITTED");
        assertThat(dispatch.broadcast(driver.actor())).isEmpty();
        assertCode(() -> dispatch.claim(driver.actor(), driver.device(), UUID.randomUUID(), order.id()),
                ErrorCode.DRIVER_NOT_ELIGIBLE);
        long version = sessions.pause(driver.actor(), UUID.randomUUID(), driver.device(), version(driver))
                .sessionVersion();
        assertCode(() -> sessions.resume(driver.actor(), UUID.randomUUID(), driver.device(), version),
                ErrorCode.DRIVER_NOT_ELIGIBLE);

        admitIn(driver, cityA, cityB);
        sessions.resume(driver.actor(), UUID.randomUUID(), driver.device(), version);
        assertThat(dispatch.broadcast(driver.actor())).extracting(BroadcastOrderView::orderId).contains(order.id());
    }

    @Test
    void aDriverTakenOffTheCityDuringATripFinishesIt() {
        TestRides.Driver driver = rides.driverNear(PICKUP_A);
        TestRides.Ride ride = rides.started(cityA, driver, PICKUP_A, DROPOFF_A);
        admitIn(driver, cityB);

        TripView done = rides.complete(ride, true);

        assertThat(done.phase()).isEqualTo("COMPLETED");
        assertThat(sessions.availability(driver.actor().id()).ineligibleReasons()).containsExactly("ADMISSION_CITY");
    }

    // ------------------------------------------------------------ the staff command

    @Test
    void staffSetTheCitiesWithThePermissionInEachCityTouched() {
        TestRides.Driver driver = rides.driverNear(PICKUP_A);
        long version = admission.profile(driver.actor().id()).version();
        Actor reviewerOfA = staff(new UUID[] {cityA}, DriverAdmission.REVIEW_PERMISSION);
        Actor reviewerOfBoth = staff(new UUID[] {cityA, cityB}, DriverAdmission.REVIEW_PERMISSION);

        // Forbidden: the driver, staff without the permission, staff of A only removing B (every city is touched).
        assertCode(() -> admission.setAdmissionCities(driver.actor(), UUID.randomUUID(), driver.actor().id(),
                version, Set.of(cityA), "self"), ErrorCode.ACCESS_DENIED);
        assertCode(() -> admission.setAdmissionCities(staff(new UUID[] {cityA, cityB}), UUID.randomUUID(),
                driver.actor().id(), version, Set.of(cityA), "no permission"), ErrorCode.ACCESS_DENIED);
        assertCode(() -> admission.setAdmissionCities(reviewerOfA, UUID.randomUUID(), driver.actor().id(), version,
                Set.of(cityA), "touches B"), ErrorCode.ACCESS_DENIED);
        // Every other city the fixture admitted the driver in is touched too; a reviewer of all cities does it.
        Actor reviewerOfAll = staff(null, DriverAdmission.REVIEW_PERMISSION);
        assertCode(() -> admission.setAdmissionCities(reviewerOfAll, UUID.randomUUID(), driver.actor().id(), version,
                Set.of(cityA, UUID.randomUUID()), "unknown"), ErrorCode.VALIDATION_FAILED);
        assertCode(() -> admission.setAdmissionCities(reviewerOfBoth, UUID.randomUUID(), driver.actor().id(), version,
                Set.of(cityA), " "), ErrorCode.VALIDATION_FAILED);

        UUID command = UUID.randomUUID();
        DriverProfile changed = admission.setAdmissionCities(reviewerOfAll, command, driver.actor().id(), version,
                Set.of(cityA, cityB), "Licence for both");
        assertThat(changed.admissionCityIds()).containsExactlyInAnyOrder(cityA, cityB);
        assertThat(changed.version()).isEqualTo(version + 1);

        assertThat(admission.setAdmissionCities(reviewerOfAll, command, driver.actor().id(), version,
                Set.of(cityB, cityA), "Licence for both")).as("repeat, in any order").isEqualTo(changed);
        assertCode(() -> admission.setAdmissionCities(reviewerOfAll, UUID.randomUUID(), driver.actor().id(), version,
                Set.of(cityA), "stale"), ErrorCode.VERSION_CONFLICT);

        DriverProfile narrowed = admission.setAdmissionCities(reviewerOfA, UUID.randomUUID(), driver.actor().id(),
                changed.version(), Set.of(cityB), "A licence withdrawn");
        assertThat(narrowed.admissionCityIds()).containsExactly(cityB);
        assertThat(jdbc.sql("""
                        select payload ->> 'removed' from outbox
                        where event_type = 'DriverAdmissionCitiesChanged' and aggregate_id = :d
                        order by occurred_at desc limit 1""")
                .param("d", driver.actor().id()).query(String.class).single()).contains(cityA.toString());
        assertThat(jdbc.sql("""
                        select count(*) from audit_log where action = 'driver.admission_cities' and resource_id = :d""")
                .param("d", driver.actor().id().toString()).query(Integer.class).single()).isEqualTo(2);
    }

    // ------------------------------------------------------------ return zone (REQ-DS-07)

    @Test
    void outsideThePolygonNoNewOrdersUnlessWithinTheReturnZone() {
        TestRides.Driver driver = rides.driverNear(TestRides.north(BORDER_A, -1000));
        // 300 m west of A's west border (longitude 147): outside every city.
        GeoPoint outside = new GeoPoint(-39.5, 147 - 0.0035);
        moveTo(driver, outside, 5.0);

        assertThat(sessions.availability(driver.actor().id()).ineligibleReasons())
                .containsExactly("LOCATION_OUTSIDE_CITY");
        GeoPoint pickup = new GeoPoint(-39.5, 147 + 0.0035);
        OrderView order = rides.order(rides.client(), cityA, pickup, DROPOFF_A);
        assertThat(dispatch.offers(driver.actor())).as("600 m from the pickup, but outside A").isEmpty();
        assertThat(journalReason(order.id(), driver)).isEqualTo("OUTSIDE_CITY");

        CityOperations.State state = cityOperations.of(cityA);
        Actor manager = staff(new UUID[] {cityA}, GeoConfiguration.MANAGE_PERMISSION);
        CityOperations.State widened = cityOperations.change(manager, UUID.randomUUID(), cityA, state.version(),
                new CityOperations.Settings(state.workingHours(), state.paymentMethods(), 1000), "Airport road");
        assertThat(widened.returnZoneMeters()).isEqualTo(1000);
        assertThat(cityOperations.change(manager, UUID.randomUUID(), cityA, widened.version(),
                new CityOperations.Settings(state.workingHours(), state.paymentMethods()), "Hours only")
                .returnZoneMeters()).as("left out: unchanged").isEqualTo(1000);
        assertCode(() -> cityOperations.change(manager, UUID.randomUUID(), cityA, widened.version() + 1,
                new CityOperations.Settings(state.workingHours(), state.paymentMethods(), -1), "x"),
                ErrorCode.VALIDATION_FAILED);

        assertThat(sessions.availability(driver.actor().id()).eligible()).isTrue();
        OrderView next = rides.order(rides.client(), cityA, pickup, DROPOFF_A);
        assertThat(dispatch.offers(driver.actor())).extracting(OfferView::orderId).contains(next.id());
    }

    @Test
    void leavingThePolygonNeverTouchesTheCurrentTrip() {
        TestRides.Driver driver = rides.driverNear(PICKUP_A);
        TestRides.Ride ride = rides.started(cityA, driver, PICKUP_A, DROPOFF_A);

        moveTo(driver, new GeoPoint(-39.5, 147 - 0.02), 5.0);

        DriverAvailability away = sessions.availability(driver.actor().id());
        assertThat(away.ineligibleReasons()).contains("LOCATION_OUTSIDE_CITY");
        assertThat(away.occupancy()).isEqualTo("ON_TRIP");
        assertThat(trips.current(driver.actor())).isPresent();
        assertThat(rides.complete(ride, true).phase()).isEqualTo("COMPLETED");
    }

    // ------------------------------------------------------------ zone filter of the ALL tab (REQ-DSP-07)

    @Test
    void theAllTabCanBeNarrowedToAZoneOfTheDriversCity() {
        UUID north = zone(cityA, -39.53, -39.47);
        UUID inB = zone(cityB, -39.53, -39.47);
        UUID draft = jdbc.sql("""
                        insert into zone (id, city_id, type, polygon, priority, state, created_at, updated_at)
                        values (gen_random_uuid(), :c, 'DISTRICT', ST_GeomFromEWKT(:p), 1, 'DRAFT', now(), now())
                        returning id""")
                .param("c", cityA).param("p", box(-39.53, -39.47)).query(UUID.class).single();
        TestRides.Driver driver = rides.driverNear(PICKUP_A);
        sessions.pause(driver.actor(), UUID.randomUUID(), driver.device(), version(driver));
        OrderView inside = rides.order(rides.client(), cityA, PICKUP_A, DROPOFF_A);
        OrderView outside = rides.order(rides.client(), cityA, TestRides.north(PICKUP_A, 4000), DROPOFF_A);
        resume(driver);

        assertThat(dispatch.broadcast(driver.actor())).extracting(BroadcastOrderView::orderId)
                .contains(inside.id(), outside.id());
        assertThat(dispatch.broadcast(driver.actor(), north)).extracting(BroadcastOrderView::orderId)
                .contains(inside.id()).doesNotContain(outside.id());
        assertCode(() -> dispatch.broadcast(driver.actor(), inB), ErrorCode.VALIDATION_FAILED);
        assertCode(() -> dispatch.broadcast(driver.actor(), draft), ErrorCode.VALIDATION_FAILED);
        assertCode(() -> dispatch.broadcast(driver.actor(), UUID.randomUUID()), ErrorCode.VALIDATION_FAILED);
    }

    // ------------------------------------------------------------ helpers

    private void admitIn(TestRides.Driver driver, UUID... cities) {
        long version = admission.profile(driver.actor().id()).version();
        admission.setAdmissionCities(staff(null, DriverAdmission.REVIEW_PERMISSION), UUID.randomUUID(),
                driver.actor().id(), version, Set.of(cities), "Test admission");
    }

    private void resume(TestRides.Driver driver) {
        sessions.resume(driver.actor(), UUID.randomUUID(), driver.device(), version(driver));
    }

    private void moveTo(TestRides.Driver driver, GeoPoint at, Double accuracy) {
        TestRides.timePassed(jdbc, driver.actor().id());
        sessions.heartbeat(driver.actor(), driver.device(), fix(at, accuracy));
    }

    private static LocationFix fix(GeoPoint at, Double accuracy) {
        return new LocationFix(at, accuracy, OffsetDateTime.now(), SEQUENCE.incrementAndGet());
    }

    private long version(TestRides.Driver driver) {
        return sessions.availability(driver.actor().id()).sessionVersion();
    }

    private static String box(double south, double north) {
        return "SRID=4326;MULTIPOLYGON(((147.2 %1$s,148.8 %1$s,148.8 %2$s,147.2 %2$s,147.2 %1$s)))"
                .formatted(south, north);
    }

    private UUID zone(UUID city, double south, double north) {
        return jdbc.sql("""
                        insert into zone (id, city_id, type, polygon, priority, state, created_at, updated_at)
                        values (gen_random_uuid(), :c, 'DISTRICT', ST_GeomFromEWKT(:p), 1, 'PUBLISHED', now(), now())
                        returning id""")
                .param("c", city).param("p", box(south, north)).query(UUID.class).single();
    }

    /** Staff with these permissions in {@code cities} (null: every city). */
    private Actor staff(UUID[] cities, String... permissions) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, city_scope, all_cities, state,
                                                created_at, updated_at)
                        values (:id, :login, 'Reviewer', 'ADMIN', :permissions, :scope, :all, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "admission-" + id).param("permissions", permissions)
                .param("scope", cities == null ? new UUID[0] : cities).param("all", cities == null).update();
        return new Actor(SubjectType.STAFF, id);
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
