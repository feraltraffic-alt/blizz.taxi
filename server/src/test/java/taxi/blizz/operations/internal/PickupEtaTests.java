package taxi.blizz.operations.internal;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.SessionService;
import taxi.blizz.operations.Dispatch;
import taxi.blizz.operations.OrderView;
import taxi.blizz.operations.Orders;
import taxi.blizz.operations.TripView;
import taxi.blizz.operations.Trips;
import taxi.blizz.operations.WorkSessions;
import taxi.blizz.pricing.QuoteService;
import taxi.blizz.pricing.RouteEstimator;

/** The pickup ETA the rider sees while the driver is on the way (REQ-RID-04). */
@SpringBootTest
@Import({TestcontainersConfiguration.class, PickupEtaTests.Counting.class})
class PickupEtaTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, -104.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, -104.45);

    @Autowired
    PickupEtas etas;
    @Autowired
    CountingRoutes routes;
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
    JdbcClient jdbc;

    TestRides rides;
    UUID cityId;

    @BeforeEach
    void setUp() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        cityId = rides.city("test-pickup-eta", "UAH", -105);
    }

    private OrderView now(TestRides.Ride ride) {
        return etas.with(orders.get(ride.order().id()));
    }

    @Test
    void onTheWayTheRiderSeesAForecastFromTheDriversLastPosition() {
        TestRides.Ride ride = rides.assigned(cityId, rides.driverNear(PICKUP), PICKUP, DROPOFF);

        OrderView.PickupEta eta = now(ride).pickupEta();

        assertThat(eta).isNotNull();
        assertThat(eta.distanceMetres()).as("the driver is about 1 km north").isBetween(800L, 2_500L);
        assertThat(eta.seconds()).isPositive();
        assertThat(eta.stale()).isFalse();
        assertThat(eta.source()).isIn("ROUTER", "STRAIGHT_LINE");
        assertThat(orders.get(ride.order().id()).pickupEta()).as("the stored snapshot has none").isNull();
    }

    @Test
    void anOldPositionIsMarkedAndNoPositionGivesNoEta() {
        TestRides.Ride ride = rides.assigned(cityId, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        UUID driver = ride.driver().actor().id();
        jdbc.sql("""
                        update work_session set last_location_at = now() - interval '5 minutes'
                        where driver_id = :driver and state = 'OPEN'""").param("driver", driver).update();
        assertThat(now(ride).pickupEta().stale()).as("REQ-RID-04: an old forecast is marked").isTrue();

        jdbc.sql("update work_session set last_location_at = null where driver_id = :driver and state = 'OPEN'")
                .param("driver", driver).update();
        assertThat(now(ride).pickupEta()).as("no position, no made-up ETA").isNull();
    }

    @Test
    void onlyWhileTheDriverIsOnTheWay() {
        TestRides.Ride ride = rides.assigned(cityId, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        rides.moveTo(ride.driver(), TestRides.north(PICKUP, 30));
        TripView waiting = trips.arrive(ride.driver().actor(), UUID.randomUUID(), ride.trip().id(),
                ride.trip().version(), null);
        assertThat(waiting.phase()).isEqualTo("WAITING");
        assertThat(now(ride).pickupEta()).isNull();

        OrderView searching = rides.order(rides.client(), cityId, PICKUP, DROPOFF);
        assertThat(etas.with(searching).pickupEta()).as("no driver yet").isNull();
    }

    @Test
    void aPositionAlreadyRoutedIsNotRoutedAgain() {
        TestRides.Ride ride = rides.assigned(cityId, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        int before = routes.calls.get();
        now(ride);
        now(ride);
        now(ride);
        assertThat(routes.calls.get() - before).as("riders poll; the router is paid").isEqualTo(1);

        rides.moveTo(ride.driver(), TestRides.north(PICKUP, 500));
        OrderView.PickupEta closer = now(ride).pickupEta();
        assertThat(routes.calls.get() - before).as("a new position is routed").isEqualTo(2);
        assertThat(closer.distanceMetres()).isLessThan(1_000L);
    }

    /** D1 of #479: on the way the rider sees where the driver is, from the session's last position; old is marked. */
    @Test
    void onTheWayTheRiderSeesWhereTheDriverIs() {
        TestRides.Ride ride = rides.assigned(cityId, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        UUID driver = ride.driver().actor().id();
        var stored = jdbc.sql("""
                        select ST_Y(last_location) as lat, ST_X(last_location) as lon, last_location_at
                        from work_session where driver_id = :driver and state = 'OPEN'""").param("driver", driver)
                .query((rs, i) -> new double[]{rs.getDouble("lat"), rs.getDouble("lon")}).single();

        OrderView.DriverLocation location = now(ride).driverLocation();
        assertThat(location).isNotNull();
        assertThat(location.lat()).isEqualTo(stored[0]);
        assertThat(location.lon()).isEqualTo(stored[1]);
        assertThat(location.at()).isNotNull();
        assertThat(location.stale()).isFalse();
        assertThat(orders.get(ride.order().id()).driverLocation()).as("the stored snapshot has none").isNull();

        jdbc.sql("""
                        update work_session set last_location_at = now() - interval '5 minutes'
                        where driver_id = :driver and state = 'OPEN'""").param("driver", driver).update();
        assertThat(now(ride).driverLocation().stale()).as("an old position is marked").isTrue();
    }

    /** D2 of #479: waiting at the pickup and on the trip too. */
    @Test
    void waitingAndOnTheTripTheRiderStillSeesTheDriver() {
        TestRides.Ride ride = rides.assigned(cityId, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        rides.moveTo(ride.driver(), TestRides.north(PICKUP, 30));
        TripView waiting = trips.arrive(ride.driver().actor(), UUID.randomUUID(), ride.trip().id(),
                ride.trip().version(), null);
        assertThat(waiting.phase()).isEqualTo("WAITING");
        assertThat(now(ride).driverLocation()).as("waiting").isNotNull();
        assertThat(now(ride).pickupEta()).as("no ETA once there").isNull();

        TripView started = trips.start(ride.driver().actor(), UUID.randomUUID(), ride.trip().id(), waiting.version(),
                null);
        assertThat(started.phase()).isEqualTo("IN_PROGRESS");
        assertThat(now(ride).driverLocation()).as("on the trip").isNotNull();
    }

    /** D3 and D4 of #479: no driver yet, no position, or a trip that ended: no location at all. */
    @Test
    void noLocationBeforeAnAssignmentWithoutAPositionOrAfterTheTrip() {
        OrderView searching = rides.order(rides.client(), cityId, PICKUP, DROPOFF);
        assertThat(etas.with(searching).driverLocation()).as("no driver yet").isNull();

        TestRides.Ride ride = rides.assigned(cityId, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        UUID driver = ride.driver().actor().id();
        jdbc.sql("update work_session set last_location_at = null where driver_id = :driver and state = 'OPEN'")
                .param("driver", driver).update();
        assertThat(now(ride).driverLocation()).as("no position, no made-up one").isNull();

        TestRides.Ride done = rides.assigned(cityId, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        rides.moveTo(done.driver(), TestRides.north(PICKUP, 30));
        TripView there = trips.arrive(done.driver().actor(), UUID.randomUUID(), done.trip().id(),
                done.trip().version(), null);
        TripView going = trips.start(done.driver().actor(), UUID.randomUUID(), there.id(), there.version(), null);
        TripView ended = trips.complete(done.driver().actor(), UUID.randomUUID(), going.id(), going.version(),
                java.time.OffsetDateTime.now(), Boolean.TRUE);
        assertThat(ended.phase()).isEqualTo("COMPLETED");
        assertThat(now(done).driverLocation()).as("after the trip").isNull();
    }

    /** Counts calls and delegates to the estimator the application would use. */
    static class CountingRoutes implements RouteEstimator {
        final AtomicInteger calls = new AtomicInteger();
        private final RouteEstimator delegate;

        CountingRoutes(RouteEstimator delegate) {
            this.delegate = delegate;
        }

        @Override
        public Estimate estimate(GeoPoint pickup, GeoPoint dropOff) {
            calls.incrementAndGet();
            return delegate.estimate(pickup, dropOff);
        }
    }

    @TestConfiguration(proxyBeanMethods = false)
    static class Counting {
        @Bean
        @Primary
        CountingRoutes pickupEtaCountingRoutes(
                @org.springframework.beans.factory.annotation.Qualifier("configuredRouteEstimator") RouteEstimator real) {
            return new CountingRoutes(real);
        }
    }
}
