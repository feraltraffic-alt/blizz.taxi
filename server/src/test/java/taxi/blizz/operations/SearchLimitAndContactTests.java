package taxi.blizz.operations;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.OffsetDateTime;
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
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.SessionService;
import taxi.blizz.pricing.QuoteService;

/**
 * Issue #143, part 3 (REQ-CAN-05, REQ-CAN-06): after a driver gives the order up, the search uses only what is left of
 * the rider's total wait and never runs past it silently (E5); the driver's attempts to reach the rider are recorded
 * and shown with a no-show. Its own city at longitude 157.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class SearchLimitAndContactTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, 157.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 157.55);

    @Autowired Orders orders;
    @Autowired Dispatch dispatch;
    @Autowired Trips trips;
    @Autowired WorkSessions sessions;
    @Autowired SessionService auth;
    @Autowired QuoteService quotes;
    @Autowired OrderCalls calls;
    @Autowired OrderChat chat;
    @Autowired JdbcClient jdbc;

    TestRides rides;
    UUID city;

    @BeforeEach
    void city() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        city = rides.city("test-search-limit", "UAH", 157);
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

    // ------------------------------------------------------------ E5

    @Test
    void aDriverGivingUpAfterTheRidersWholeWaitEndsTheOrderInsteadOfSearchingOn() {
        TestRides.Ride ride = rides.assigned(city, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        searchedFor(ride.order(), 200); // the total is 180 s

        TripView trip = ride.trip();
        trips.cancel(ride.driver().actor(), UUID.randomUUID(), trip.id(), trip.version(), "VEHICLE_PROBLEM");

        OrderView order = orders.get(ride.order().id());
        assertThat(order.status()).isEqualTo("UNFULFILLED");
        assertThat(order.statusReason()).isEqualTo("NO_DRIVER");
        assertThat(attempts(ride.order())).as("no new search").isEqualTo(1);
        assertThat(jdbc.sql("""
                        select count(*) from outbox where event_type = 'OrderUnfulfilled' and aggregate_id = :o""")
                .param("o", ride.order().id()).query(Integer.class).single()).as("the rider is told").isEqualTo(1);
    }

    @Test
    void aDriverGivingUpWithSecondsLeftSearchesOnlyThoseSeconds() {
        TestRides.Ride ride = rides.assigned(city, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        searchedFor(ride.order(), 150); // 30 s are left of the 180 s

        TripView trip = ride.trip();
        trips.cancel(ride.driver().actor(), UUID.randomUUID(), trip.id(), trip.version(), "VEHICLE_PROBLEM");

        assertThat(orders.get(ride.order().id()).status()).isEqualTo("SEARCHING");
        OffsetDateTime total = jdbc.sql("""
                        select total_deadline from dispatch_attempt
                        where order_id = :o and phase in ('PERSONAL', 'BROADCAST')""")
                .param("o", ride.order().id()).query(OffsetDateTime.class).single();
        assertThat(total).as("what was left, not a minute more").isBefore(OffsetDateTime.now().plusSeconds(35));
    }

    // ------------------------------------------------------------ contact attempts (REQ-CAN-06)

    @Test
    void theDriversCallsAndMessagesAreRecordedAndShownWithTheNoShow() {
        TestRides.Ride ride = rides.assigned(city, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        TestRides.Driver driver = ride.driver();
        rides.moveTo(driver, TestRides.north(PICKUP, 30));
        TripView waiting = trips.arrive(driver.actor(), UUID.randomUUID(), ride.trip().id(), ride.trip().version(), null);

        calls.forDriver(driver.actor(), waiting.id());
        chat.post(driver.actor(), UUID.randomUUID(), ride.order().id(), "I am at the entrance");
        calls.forDriver(driver.actor(), waiting.id());
        chat.post(ride.payer(), UUID.randomUUID(), ride.order().id(), "Coming").id();

        List<TripView.ContactAttempt> attempts = trips.current(driver.actor()).orElseThrow().contactAttempts();
        assertThat(attempts).extracting(TripView.ContactAttempt::kind).as("the driver's only")
                .containsExactly("CALL", "MESSAGE", "CALL");

        jdbc.sql("update trip set arrived_at = now() - interval '6 minutes' where id = :t")
                .param("t", waiting.id()).update();
        TripView current = trips.current(driver.actor()).orElseThrow();
        trips.reportNoShow(driver.actor(), UUID.randomUUID(), current.id(), current.version());

        Map<String, Object> payload = jdbc.sql("""
                        select (payload ->> 'contact_attempts')::int as attempts, payload ->> 'last_contact_at' as last
                        from outbox where event_type = 'PassengerNoShow' and aggregate_id = :o""")
                .param("o", ride.order().id()).query().singleRow();
        assertThat(payload.get("attempts")).isEqualTo(3);
        assertThat(payload.get("last")).isNotNull();
    }

    // ------------------------------------------------------------ helpers

    /** As if the order had been searched {@code seconds} before the driver took it. */
    private void searchedFor(OrderView order, int seconds) {
        jdbc.sql("""
                        update dispatch_attempt set created_at = stopped_at - make_interval(secs => :s)
                        where order_id = :o""")
                .param("s", seconds).param("o", order.id()).update();
    }

    private int attempts(OrderView order) {
        return jdbc.sql("select count(*) from dispatch_attempt where order_id = :o").param("o", order.id())
                .query(Integer.class).single();
    }
}
