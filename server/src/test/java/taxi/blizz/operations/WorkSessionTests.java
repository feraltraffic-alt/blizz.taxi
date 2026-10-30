package taxi.blizz.operations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
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
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;

/** Section 12: REQ-DRV-03, REQ-DRV-04, REQ-DRV-05, REQ-DRV-13, REQ-DS-*, REQ-GEO-02, AC-05, T-14 – T-18. */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class WorkSessionTests {

    /** A synthetic service area far from other tests' polygons, so their overlap rules are unaffected. */
    static final String AREA = "SRID=4326;MULTIPOLYGON(((100 -40,101 -40,101 -39,100 -39,100 -40)))";
    static final GeoPoint INSIDE = new GeoPoint(-39.5, 100.5);

    @Autowired
    WorkSessions sessions;
    @Autowired
    JdbcClient jdbc;

    UUID cityId;

    @BeforeEach
    void city() {
        cityId = jdbc.sql("select id from city where code = 'test-work-sessions'").query(UUID.class).optional()
                .orElseGet(() -> {
                    UUID id = UUID.randomUUID();
                    jdbc.sql("""
                                    insert into city (id, code, name, currency, timezone, polygon, priority, state,
                                                      created_at, updated_at)
                                    values (:id, 'test-work-sessions', 'Test', 'UAH', 'Europe/Kyiv',
                                            ST_GeomFromEWKT(:area), 7777, 'PUBLISHED', now(), now())""")
                            .param("id", id).param("area", AREA).update();
                    return id;
                });
    }

    record Fixture(Actor driver, UUID vehicle, UUID device) {
    }

    private Fixture approvedDriver() {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into driver (id, phone_normalized, account_state, review_status, created_at, updated_at)
                        values (:id, :phone, 'ACTIVE', 'APPROVED', now(), now())""")
                .param("id", id)
                .param("phone", "+38066" + String.format("%07d", Math.floorMod(id.hashCode(), 10_000_000)))
                .update();
        UUID vehicle = UUID.randomUUID();
        jdbc.sql("""
                        insert into vehicle (id, driver_id, registration_number, make, model, color, production_year,
                                             state, class_approvals, created_at, updated_at)
                        values (:id, :driver, 'AA0001AA', 'Skoda', 'Octavia', 'white', 2021, 'APPROVED',
                                '{STANDARD}', now(), now())""")
                .param("id", vehicle).param("driver", id).update();
        return new Fixture(new Actor(SubjectType.DRIVER, id), vehicle, device(id));
    }

    private UUID device(UUID driverId) {
        UUID device = UUID.randomUUID();
        jdbc.sql("""
                        insert into device_session (id, subject_type, subject_id, audience, created_at,
                                                    last_refreshed_at, expires_at)
                        values (:id, 'DRIVER', :driver, 'driver', now(), now(), now() + interval '1 day')""")
                .param("id", device).param("driver", driverId).update();
        return device;
    }

    private static LocationFix fix(GeoPoint point, long sequence) {
        return new LocationFix(point, 5.0, OffsetDateTime.now(), sequence);
    }

    private DriverAvailability open(Fixture f) {
        return sessions.open(f.driver(), UUID.randomUUID(), f.device(), f.vehicle(), fix(INSIDE, 1));
    }

    private void occupancy(Fixture f, String value) {
        jdbc.sql("update driver_capacity set occupancy = :o where driver_id = :id")
                .param("o", value).param("id", f.driver().id()).update();
    }

    private static void assertCode(ThrowingCallable call, ErrorCode code) {
        assertThatThrownBy(call).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }

    // ------------------------------------------------------------ going online

    @Test
    void admittedDriverGoesOnlineAndIsEligible() {
        Fixture f = approvedDriver();

        DriverAvailability state = open(f);

        assertThat(state.sessionState()).isEqualTo("OPEN");
        assertThat(state.intent()).isEqualTo("ACCEPTING");
        assertThat(state.connection()).isEqualTo("CONNECTED");
        assertThat(state.geolocation()).isEqualTo("FRESH");
        assertThat(state.occupancy()).isEqualTo("FREE");
        assertThat(state.cityId()).isEqualTo(cityId);
        assertThat(state.eligible()).isTrue();
        assertThat(state.ineligibleReasons()).isEmpty();
    }

    @Test
    void goingOnlineNeedsAdmissionVehicleAndActiveAccount() {
        Fixture notAdmitted = approvedDriver();
        jdbc.sql("update driver set review_status = 'IN_REVIEW' where id = :id").param("id", notAdmitted.driver().id()).update();
        Fixture blocked = approvedDriver();
        jdbc.sql("update driver set account_state = 'BLOCKED' where id = :id").param("id", blocked.driver().id()).update();
        Fixture wrongVehicle = approvedDriver();
        Fixture other = approvedDriver();

        assertCode(() -> open(notAdmitted), ErrorCode.DRIVER_NOT_ELIGIBLE);
        assertCode(() -> open(blocked), ErrorCode.DRIVER_NOT_ELIGIBLE);
        assertCode(() -> sessions.open(wrongVehicle.driver(), UUID.randomUUID(), wrongVehicle.device(), other.vehicle(),
                fix(INSIDE, 1)), ErrorCode.DRIVER_NOT_ELIGIBLE);
    }

    @Test
    void goingOnlineNeedsAFreshLocationInsideAServiceArea() {
        Fixture f = approvedDriver();

        assertCode(() -> sessions.open(f.driver(), UUID.randomUUID(), f.device(), f.vehicle(),
                fix(new GeoPoint(0.5, -170.5), 1)), ErrorCode.OUTSIDE_SERVICE_AREA);
        assertCode(() -> sessions.open(f.driver(), UUID.randomUUID(), f.device(), f.vehicle(),
                new LocationFix(INSIDE, 5.0, OffsetDateTime.now().minusMinutes(10), 1)), ErrorCode.LOCATION_NOT_FRESH);
    }

    // ------------------------------------------------------------ one controlling device (T-16)

    @Test
    void secondDeviceCannotOpenAnotherSessionButCanTakeControl() {
        Fixture f = approvedDriver();
        DriverAvailability first = open(f);
        UUID secondPhone = device(f.driver().id());

        assertThat(open(f).sessionId()).as("same device repeats safely").isEqualTo(first.sessionId());
        assertCode(() -> sessions.open(f.driver(), UUID.randomUUID(), secondPhone, f.vehicle(), fix(INSIDE, 1)),
                ErrorCode.STATE_CONFLICT);

        DriverAvailability moved = sessions.handover(f.driver(), UUID.randomUUID(), secondPhone, first.sessionVersion());

        assertThat(moved.sessionId()).isEqualTo(first.sessionId());
        assertCode(() -> sessions.pause(f.driver(), UUID.randomUUID(), f.device(), moved.sessionVersion()),
                ErrorCode.STATE_CONFLICT);
        assertThat(sessions.pause(f.driver(), UUID.randomUUID(), secondPhone, moved.sessionVersion()).intent())
                .isEqualTo("NOT_ACCEPTING");
        assertThat(jdbc.sql("select count(*) from work_session where driver_id = :id").param("id", f.driver().id())
                .query(Integer.class).single()).isEqualTo(1);
    }

    @Test
    void concurrentOpensFromTwoDevicesCreateOneSession() throws Exception {
        Fixture f = approvedDriver();
        UUID secondPhone = device(f.driver().id());
        CountDownLatch start = new CountDownLatch(1);
        ExecutorService pool = Executors.newFixedThreadPool(2);
        try {
            List<Future<DriverAvailability>> results = new ArrayList<>();
            for (UUID device : List.of(f.device(), secondPhone)) {
                results.add(pool.submit(() -> {
                    start.await();
                    return sessions.open(f.driver(), UUID.randomUUID(), device, f.vehicle(), fix(INSIDE, 1));
                }));
            }
            start.countDown();
            int opened = 0;
            for (Future<DriverAvailability> result : results) {
                try {
                    result.get();
                    opened++;
                } catch (ExecutionException e) {
                    assertThat(((DomainException) e.getCause()).code()).isEqualTo(ErrorCode.STATE_CONFLICT);
                }
            }
            assertThat(opened).isEqualTo(1);
        } finally {
            pool.shutdownNow();
        }
        assertThat(jdbc.sql("select count(*) from work_session where driver_id = :id").param("id", f.driver().id())
                .query(Integer.class).single()).isEqualTo(1);
    }

    // ------------------------------------------------------------ pause, resume, close (T-18)

    @Test
    void freeDriverPausesAndResumes() {
        Fixture f = approvedDriver();
        DriverAvailability online = open(f);

        DriverAvailability paused = sessions.pause(f.driver(), UUID.randomUUID(), f.device(), online.sessionVersion());
        assertThat(paused.intent()).isEqualTo("NOT_ACCEPTING");
        assertThat(paused.eligible()).isFalse();
        assertThat(paused.ineligibleReasons()).contains("INTENT_NOT_ACCEPTING");

        DriverAvailability resumed = sessions.resume(f.driver(), UUID.randomUUID(), f.device(), paused.sessionVersion());
        assertThat(resumed.intent()).isEqualTo("ACCEPTING");
        assertThat(resumed.eligible()).isTrue();
    }

    @Test
    void busyDriverPausingOrClosingKeepsTheTrip() {
        Fixture f = approvedDriver();
        DriverAvailability online = open(f);
        occupancy(f, "ON_TRIP");

        DriverAvailability paused = sessions.pause(f.driver(), UUID.randomUUID(), f.device(), online.sessionVersion());
        assertThat(paused.intent()).isEqualTo("PAUSE_AFTER_CURRENT");
        assertThat(paused.occupancy()).isEqualTo("ON_TRIP");

        DriverAvailability closing = sessions.close(f.driver(), UUID.randomUUID(), f.device(), paused.sessionVersion());
        assertThat(closing.sessionState()).isEqualTo("CLOSING");
        assertThat(closing.sessionId()).isEqualTo(online.sessionId());
        assertThat(closing.ineligibleReasons()).contains("SESSION_CLOSING", "OCCUPANCY_ON_TRIP");
        assertThat(sessions.heartbeat(f.driver(), f.device(), fix(INSIDE, 2)).connection()).isEqualTo("CONNECTED");
    }

    @Test
    void freeDriverClosesTheSession() {
        Fixture f = approvedDriver();
        DriverAvailability online = open(f);

        DriverAvailability closed = sessions.close(f.driver(), UUID.randomUUID(), f.device(), online.sessionVersion());

        assertThat(closed.sessionState()).isEqualTo("CLOSED");
        assertThat(closed.ineligibleReasons()).contains("NO_OPEN_SESSION");
        assertThat(open(f).sessionId()).as("can go online again").isNotEqualTo(online.sessionId());
    }

    @Test
    void staleVersionIsAConflict() {
        Fixture f = approvedDriver();
        DriverAvailability online = open(f);
        sessions.pause(f.driver(), UUID.randomUUID(), f.device(), online.sessionVersion());

        assertCode(() -> sessions.close(f.driver(), UUID.randomUUID(), f.device(), online.sessionVersion()),
                ErrorCode.VERSION_CONFLICT);
    }

    // ------------------------------------------------------------ admission changes during work (T-17, AC-05)

    @Test
    void expiredAdmissionStopsNewOrdersButNotTheSession() {
        Fixture f = approvedDriver();
        DriverAvailability online = open(f);
        DriverAvailability paused = sessions.pause(f.driver(), UUID.randomUUID(), f.device(), online.sessionVersion());
        jdbc.sql("update driver set review_status = 'EXPIRED' where id = :id").param("id", f.driver().id()).update();

        DriverAvailability state = sessions.availability(f.driver().id());

        assertThat(state.sessionState()).isEqualTo("OPEN");
        assertThat(state.eligible()).isFalse();
        assertThat(state.ineligibleReasons()).contains("ADMISSION_EXPIRED");
        assertCode(() -> sessions.resume(f.driver(), UUID.randomUUID(), f.device(), paused.sessionVersion()),
                ErrorCode.DRIVER_NOT_ELIGIBLE);
    }

    // ------------------------------------------------------------ connection and location (T-14, T-15)

    @Test
    void olderLocationNeverMovesTheCurrentPositionBack() {
        Fixture f = approvedDriver();
        open(f);
        GeoPoint newer = new GeoPoint(-39.4, 100.6);
        GeoPoint older = new GeoPoint(-39.9, 100.1);

        taxi.blizz.TestRides.timePassed(jdbc, f.driver().id());
        sessions.heartbeat(f.driver(), f.device(), fix(newer, 10));
        sessions.heartbeat(f.driver(), f.device(), fix(older, 5));

        double lon = jdbc.sql("select ST_X(last_location) from work_session where driver_id = :id and state = 'OPEN'")
                .param("id", f.driver().id()).query(Double.class).single();
        assertThat(lon).isEqualTo(100.6);
    }

    @Test
    void heartbeatWithoutLocationRestoresConnectionButNotEligibility() {
        Fixture f = approvedDriver();
        open(f);
        jdbc.sql("""
                        update work_session set last_heartbeat_at = now() - interval '40 seconds',
                                                last_location_at = now() - interval '40 seconds'
                        where driver_id = :id and state = 'OPEN'""")
                .param("id", f.driver().id()).update();
        assertThat(sessions.availability(f.driver().id()).connection()).isEqualTo("DISCONNECTED");

        DriverAvailability state = sessions.heartbeat(f.driver(), f.device(), null);

        assertThat(state.connection()).isEqualTo("CONNECTED");
        assertThat(state.geolocation()).isEqualTo("STALE");
        assertThat(state.eligible()).isFalse();
        assertThat(state.ineligibleReasons()).containsExactly("LOCATION_STALE");
    }

    @Test
    void staleHeartbeatExcludesTheDriverButKeepsAnAssignment() {
        Fixture f = approvedDriver();
        open(f);
        occupancy(f, "TO_PICKUP");
        jdbc.sql("update work_session set last_heartbeat_at = now() - interval '20 seconds' where driver_id = :id")
                .param("id", f.driver().id()).update();

        DriverAvailability state = sessions.availability(f.driver().id());

        assertThat(state.connection()).isEqualTo("STALE");
        assertThat(state.occupancy()).isEqualTo("TO_PICKUP");
        assertThat(state.eligible()).isFalse();
    }
}
