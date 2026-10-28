package taxi.blizz.operations.internal;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.TestRides;
import taxi.blizz.TestRides.Ride;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.SessionService;
import taxi.blizz.operations.Dispatch;
import taxi.blizz.operations.OrderView;
import taxi.blizz.operations.Orders;
import taxi.blizz.operations.Trips;
import taxi.blizz.operations.WorkSessions;
import taxi.blizz.platform.internal.OutboxRelay;
import taxi.blizz.pricing.QuoteService;

/** Problem queues fed by operations (REQ-OPS-06): no driver found, a driver lost during the order. */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class ProblemReportTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, -84.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, -84.45);

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
    LostDrivers lost;
    @Autowired
    DispatchWorker worker;
    @Autowired
    OutboxRelay relay;
    @Autowired
    JdbcClient jdbc;

    TestRides rides;
    UUID cityId;

    @BeforeEach
    void setUp() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        cityId = rides.city("test-problem-reports", "UAH", -85);
    }

    private void report() {
        while (lost.report() > 0) {
            // other classes' stale rides are reported too; go on until nothing is left
        }
        while (relay.runOnce() > 0) {
            // deliver the events
        }
    }

    private UUID assignment(OrderView order) {
        return jdbc.sql("select id from assignment where order_id = :order and state = 'COMMITTED'")
                .param("order", order.id()).query(UUID.class).single();
    }

    private void silence(Ride ride, int minutes) {
        jdbc.sql("""
                        update work_session set last_location_at = now() - make_interval(mins => :minutes)
                        where driver_id = :driver and state in ('OPEN', 'CLOSING')""")
                .param("minutes", minutes).param("driver", ride.driver().actor().id()).update();
    }

    private long cases(String sourceKey, String category, String priority) {
        return jdbc.sql("""
                        select count(*) from support_case where source_key = :key and category = :category
                          and priority = :priority and requester_type = 'SYSTEM'""")
                .param("key", sourceKey).param("category", category).param("priority", priority)
                .query(Long.class).single();
    }

    private long events(OrderView order, String type) {
        return jdbc.sql("select count(*) from order_event where order_id = :order and type = :type")
                .param("order", order.id()).param("type", type).query(Long.class).single();
    }

    @Test
    void aDriverSilentOnTheWayToThePickupBecomesOneHighCase() {
        Ride ride = rides.assigned(cityId, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        UUID assignment = assignment(ride.order());
        silence(ride, 10);

        report();
        report();

        assertThat(events(ride.order(), "DriverLostDuringOrder")).as("reported once").isEqualTo(1);
        assertThat(cases("lost-driver:" + assignment, "LOST_CONNECTION", "HIGH")).isEqualTo(1);
        assertThat(jdbc.sql("""
                        select extract(epoch from respond_by - created_at)::int from support_case
                        where source_key = :key""")
                .param("key", "lost-driver:" + assignment).query(Integer.class).single())
                .as("HIGH is answered within 15 minutes").isEqualTo(15 * 60);
        assertThat(orders.get(ride.order().id()).assignment()).as("the order stays with the driver").isNotNull();
    }

    @Test
    void aDriverSilentDuringTheRideIsUrgent() {
        Ride ride = rides.started(cityId, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        UUID assignment = assignment(ride.order());
        silence(ride, 10);

        report();

        // The ride is left unfinished: a free driver here would take the next test's order (TestRides.assigned).
        assertThat(cases("lost-driver:" + assignment, "LOST_CONNECTION", "URGENT")).isEqualTo(1);
    }

    @Test
    void aDriverHeardFromRecentlyIsNotReported() {
        Ride ride = rides.assigned(cityId, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        silence(ride, 2); // under the three-minute limit

        report();

        assertThat(events(ride.order(), "DriverLostDuringOrder")).isZero();
        assertThat(jdbc.sql("select lost_reported_at is null from assignment where id = :id")
                .param("id", assignment(ride.order())).query(Boolean.class).single()).isTrue();
    }

    @Test
    void noDriverFoundBecomesOneCaseForTheOrder() {
        OrderView order = rides.order(rides.client(), cityId, new GeoPoint(-39.9, -84.9), DROPOFF);
        jdbc.sql("""
                        update dispatch_attempt set total_deadline = now() - interval '1 second',
                                                    next_action_at = now() - interval '1 second'
                        where order_id = :id""")
                .param("id", order.id()).update();
        worker.runOnce();
        report();

        assertThat(orders.get(order.id()).status()).isEqualTo("UNFULFILLED");
        assertThat(cases("no-driver:" + order.id(), "NO_DRIVER", "NORMAL")).isEqualTo(1);
    }
}
