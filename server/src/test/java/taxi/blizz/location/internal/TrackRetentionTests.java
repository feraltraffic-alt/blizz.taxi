package taxi.blizz.location.internal;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.Clock;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.SessionService;
import taxi.blizz.location.TrackRetention;
import taxi.blizz.operations.Dispatch;
import taxi.blizz.operations.Orders;
import taxi.blizz.operations.Trips;
import taxi.blizz.operations.WorkSessions;
import taxi.blizz.pricing.QuoteService;

/**
 * GPS track retention (REQ-PRV-02, issue #81) on real PostgreSQL: points outside a trip go after the short retention,
 * trip points after the long one, the points of a disputed trip (an open support case, a risk flag) stay, and two
 * instances cleaning at once neither fail nor delete a point twice.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class TrackRetentionTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, 52.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 52.55);

    @Autowired
    TrackRetentionSweep sweep;
    @Autowired
    List<TrackRetention> sources;
    @Autowired
    TransactionTemplate tx;
    @Autowired
    Clock clock;
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
        cityId = rides.city("test-track-retention", "UAH", 52);
    }

    // ------------------------------------------------------------ fixtures

    /** A completed ride of {@code driver}, moved into the past: its assignment ran from {@code from} to {@code to}. */
    private UUID tripBetween(TestRides.Driver driver, OffsetDateTime from, OffsetDateTime to) {
        TestRides.Ride ride = rides.started(cityId, driver, PICKUP, DROPOFF);
        rides.complete(ride, true);
        jdbc.sql("update assignment set created_at = :from, closed_at = :to where order_id = :o")
                .param("from", from).param("to", to).param("o", ride.order().id()).update();
        jdbc.sql("update trip set completed_at = :to where order_id = :o")
                .param("to", to).param("o", ride.order().id()).update();
        return ride.order().id();
    }

    private UUID point(TestRides.Driver driver, OffsetDateTime at) {
        return point(driver, at, at);
    }

    /** A point the phone dated {@code recorded} and the server received at {@code received}. */
    private UUID point(TestRides.Driver driver, OffsetDateTime recorded, OffsetDateTime received) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into track_point (id, driver_id, device_session_id, sequence, recorded_at, received_at,
                                                 point, accuracy_m)
                        values (:id, :driver, :device, :sequence, :recorded, :received,
                                ST_SetSRID(ST_MakePoint(52.5, -39.5), 4326), 5)""")
                .param("id", id).param("driver", driver.actor().id()).param("device", driver.device())
                .param("sequence", Math.floorMod(id.getMostSignificantBits(), Long.MAX_VALUE))
                .param("recorded", recorded).param("received", received)
                .update();
        return id;
    }

    private boolean exists(UUID pointId) {
        return jdbc.sql("select count(*) from track_point where id = :id").param("id", pointId).query(Long.class)
                .single() == 1;
    }

    private UUID orderOf(UUID pointId) {
        return jdbc.sql("select order_id from track_point where id = :id").param("id", pointId)
                .query(UUID.class).optional().orElse(null);
    }

    private OffsetDateTime now() {
        return OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
    }

    private void sweepAll() {
        while (sweep.run(50).deleted() > 0) {
            // other tests' old points may be due as well
        }
    }

    // ------------------------------------------------------------ tests

    @Test
    void pointsOutsideATripGoFirstTripPointsAfterTheirRetentionAndDisputedTripsStay() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        OffsetDateTime threeDaysAgo = now().minusDays(3);
        OffsetDateTime longAgo = now().minusDays(100);
        UUID recentTrip = tripBetween(driver, threeDaysAgo, threeDaysAgo.plusMinutes(30));
        UUID oldTrip = tripBetween(driver, longAgo, longAgo.plusMinutes(30));
        UUID supportTrip = tripBetween(driver, longAgo.plusHours(2), longAgo.plusHours(2).plusMinutes(30));
        UUID flaggedTrip = tripBetween(driver, longAgo.plusHours(4), longAgo.plusHours(4).plusMinutes(30));
        jdbc.sql("""
                        insert into support_case (id, category, order_id, requester_type, subject, priority, state,
                                                  created_at, updated_at, respond_by)
                        values (:id, 'LOST_ITEM', :o, 'STAFF', 'Lost phone', 'NORMAL', 'OPEN', now(), now(),
                                now() + interval '4 hours')""")
                .param("id", UUID.randomUUID()).param("o", supportTrip).update();
        jdbc.sql("""
                        insert into driver_risk_flag (id, driver_id, city_id, kind, raised_by, raised_at, reason)
                        values (:id, :d, :c, 'MANUAL', :staff, :at, 'Detour')""")
                .param("id", UUID.randomUUID()).param("d", driver.actor().id()).param("c", cityId)
                .param("staff", UUID.randomUUID()).param("at", longAgo.plusHours(4).plusMinutes(10)).update();

        UUID offTripOld = point(driver, threeDaysAgo.minusHours(2));
        UUID offTripRecent = point(driver, now().minusHours(1));
        UUID inRecentTrip = point(driver, threeDaysAgo.plusMinutes(10));
        UUID inOldTrip = point(driver, longAgo.plusMinutes(10));
        UUID inSupportTrip = point(driver, longAgo.plusHours(2).plusMinutes(10));
        UUID inFlaggedTrip = point(driver, longAgo.plusHours(4).plusMinutes(10));
        UUID betweenOldTrips = point(driver, longAgo.plusHours(1));

        sweepAll();

        assertThat(exists(offTripOld)).as("outside a trip, older than a day").isFalse();
        assertThat(exists(betweenOldTrips)).as("between trips, long ago").isFalse();
        assertThat(exists(offTripRecent)).as("outside a trip, recent").isTrue();
        assertThat(orderOf(offTripRecent)).isNull();
        assertThat(exists(inRecentTrip)).as("a trip of three days ago").isTrue();
        assertThat(orderOf(inRecentTrip)).isEqualTo(recentTrip);
        assertThat(exists(inOldTrip)).as("a trip older than 90 days").isFalse();
        assertThat(exists(inSupportTrip)).as("an open support case").isTrue();
        assertThat(exists(inFlaggedTrip)).as("a risk flag during the trip").isTrue();
        assertThat(jdbc.sql("select count(*) from track_point where id in (:a, :b) and kept")
                .param("a", inSupportTrip).param("b", inFlaggedTrip).query(Long.class).single()).isEqualTo(2);
        assertThat(oldTrip).isNotNull();

        // Kept points stay on later runs too.
        sweepAll();
        assertThat(exists(inSupportTrip)).isTrue();
        assertThat(exists(inFlaggedTrip)).isTrue();
    }

    /**
     * #112: the age came from the phone's clock. A point dated 2099 was never deleted; a phone two days behind lost
     * the points it had just sent. The server's receipt time decides now.
     */
    @Test
    void theAgeOfAPointIsCountedFromWhenTheServerGotItNotFromThePhonesClock() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        UUID future = point(driver, OffsetDateTime.parse("2099-01-01T00:00:00Z"), now().minusDays(3));
        UUID behind = point(driver, now().minusDays(2), now().minusMinutes(5));

        sweepAll();

        assertThat(exists(future)).as("dated 2099, received three days ago").isFalse();
        assertThat(exists(behind)).as("dated two days ago by a slow clock, received just now").isTrue();
    }

    /**
     * #186: a phone whose clock is days off had its trip points matched by its own clock against the trip's server
     * time, so they were deleted as off-trip after a day. The device session's clock offset corrects it.
     */
    @Test
    void aPhoneDaysBehindKeepsItsTripPointsWithTheTrip() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        OffsetDateTime start = now().minusDays(3);
        UUID trip = tripBetween(driver, start, start.plusMinutes(30));
        Duration behind = Duration.ofDays(2);
        UUID during = point(driver, start.plusMinutes(10).minus(behind), start.plusMinutes(10).plusSeconds(2));
        UUID before = point(driver, start.minusHours(2).minus(behind), start.minusHours(2).plusSeconds(2));

        sweepAll();

        assertThat(exists(during)).as("sent during the trip by a phone two days behind").isTrue();
        assertThat(orderOf(during)).isEqualTo(trip);
        assertThat(exists(before)).as("off-trip, older than a day by the server").isFalse();
    }

    @Test
    void aPhoneDaysAheadKeepsItsTripPointsWithTheTrip() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        OffsetDateTime start = now().minusDays(3);
        UUID trip = tripBetween(driver, start, start.plusMinutes(30));
        Duration ahead = Duration.ofDays(2);
        UUID during = point(driver, start.plusMinutes(10).plus(ahead), start.plusMinutes(10).plusSeconds(2));
        UUID before = point(driver, start.minusHours(2).plus(ahead), start.minusHours(2).plusSeconds(2));

        sweepAll();

        assertThat(orderOf(during)).isEqualTo(trip);
        assertThat(exists(before)).isFalse();
    }

    /**
     * A correct clock whose points arrive with a small delay, and a batch kept offline for hours: matched by the
     * phone's own time, never shifted by the delay.
     */
    @Test
    void aCorrectPhoneWithALateBufferedBatchIsMatchedByItsOwnTime() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        OffsetDateTime start = now().minusDays(3);
        UUID trip = tripBetween(driver, start, start.plusMinutes(30));
        UUID live = point(driver, start.plusMinutes(5), start.plusMinutes(5).plusSeconds(30));
        UUID buffered = point(driver, start.plusMinutes(20), start.plusHours(2));
        UUID justBefore = point(driver, start.minusSeconds(10), start.plusHours(2));
        UUID offTrip = point(driver, start.minusHours(3), start.plusHours(2));

        sweepAll();

        assertThat(orderOf(live)).isEqualTo(trip);
        assertThat(orderOf(buffered)).as("recorded during the trip, sent after it").isEqualTo(trip);
        assertThat(exists(justBefore)).as("ten seconds before the trip, not moved into it by the delay").isFalse();
        assertThat(exists(offTrip)).isFalse();
    }

    @Test
    void twoInstancesCleaningAtOnceDeleteEveryDuePointOnce() throws Exception {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        List<UUID> due = new ArrayList<>();
        for (int i = 0; i < 60; i++) {
            due.add(point(driver, now().minusDays(2).minusMinutes(i)));
        }
        TrackRetentionProperties small = new TrackRetentionProperties(Duration.ofHours(24), Duration.ofDays(90), 7,
                false, Duration.ofMinutes(2));
        TrackRetentionSweep first = new TrackRetentionSweep(jdbc, tx, sources, small, clock);
        TrackRetentionSweep second = new TrackRetentionSweep(jdbc, tx, sources, small, clock);
        ExecutorService pool = Executors.newFixedThreadPool(2);
        try {
            Future<TrackRetentionSweep.Result> a = pool.submit(() -> first.run(1000));
            Future<TrackRetentionSweep.Result> b = pool.submit(() -> second.run(1000));
            int deleted = a.get().deleted() + b.get().deleted();
            assertThat(deleted).as("each point once, other tests' due points aside").isGreaterThanOrEqualTo(60);
        } finally {
            pool.shutdown();
        }
        assertThat(due).noneMatch(this::exists);
    }

    @Test
    void theRateLimitRecordsOfOldBatchesGoToo() {
        UUID driver = UUID.randomUUID();
        jdbc.sql("insert into location_batch_request (driver_id, requested_at) values (:d, now() - interval '2 days')")
                .param("d", driver).update();
        jdbc.sql("insert into location_batch_request (driver_id, requested_at) values (:d, now())")
                .param("d", driver).update();
        sweep.run(1);
        assertThat(jdbc.sql("select count(*) from location_batch_request where driver_id = :d").param("d", driver)
                .query(Long.class).single()).isEqualTo(1);
    }
}
