package taxi.blizz.operations.internal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.TestQuotes;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.driver.DriverAdmission;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.location.TrackService;
import taxi.blizz.operations.CreateOrder;
import taxi.blizz.operations.Dispatch;
import taxi.blizz.operations.DriverRiskFlags;
import taxi.blizz.operations.LocationFix;
import taxi.blizz.operations.OrderView;
import taxi.blizz.operations.Orders;
import taxi.blizz.operations.PaymentMethod;
import taxi.blizz.operations.WorkSessions;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.platform.internal.OutboxRelay;
import taxi.blizz.pricing.QuoteService;

/**
 * Driver risk flags (REQ-DS-08, REQ-SEC-11, issue #71) on real PostgreSQL: an impossible jump of a shift raises
 * exactly one flag and leaves the trip alone, a fast highway segment and a short glitch do not, review transitions and
 * permissions, manual flags, and a suspension that names its flag.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class DriverRiskFlagTests {

    static final String AREA = "SRID=4326;MULTIPOLYGON(((113 -40,114 -40,114 -39,113 -39,113 -40)))";
    static final GeoPoint PICKUP = new GeoPoint(-39.5, 113.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 113.55);

    @Autowired
    TrackService tracks;
    @Autowired
    DriverRiskFlags flags;
    @Autowired
    DriverAdmission admission;
    @Autowired
    WorkSessions sessions;
    @Autowired
    Orders orders;
    @Autowired
    Dispatch dispatch;
    @Autowired
    OutboxRelay relay;
    @Autowired
    JdbcClient jdbc;
    @Autowired
    QuoteService quoteService;

    UUID cityId;

    @BeforeEach
    void city() {
        cityId = jdbc.sql("select id from city where code = 'test-risk'").query(UUID.class).optional()
                .orElseGet(() -> {
                    UUID id = UUID.randomUUID();
                    jdbc.sql("""
                                    insert into city (id, code, name, currency, timezone, polygon, priority, state,
                                                      created_at, updated_at)
                                    values (:id, 'test-risk', 'Risk', 'UAH', 'Europe/Kyiv',
                                            ST_GeomFromEWKT(:area), 7772, 'PUBLISHED', now(), now())""")
                            .param("id", id).param("area", AREA).update();
                    return id;
                });
        jdbc.sql("update work_session set state = 'CLOSED', closed_at = now() where city_id = :c and state <> 'CLOSED'")
                .param("c", cityId).update();
        deliver();
    }

    // ------------------------------------------------------------ fixtures

    record Driver(Actor actor, UUID vehicle, UUID device) {
        UUID id() {
            return actor.id();
        }
    }

    private Driver driverOnShift() {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into driver (id, phone_normalized, account_state, review_status, created_at, updated_at)
                        values (:id, :phone, 'ACTIVE', 'APPROVED', now(), now())""")
                .param("id", id)
                .param("phone", "+38097" + String.format("%07d", Math.floorMod(id.hashCode(), 10_000_000)))
                .update();
        taxi.blizz.TestAdmission.inEveryCity(jdbc, id);
        UUID vehicle = UUID.randomUUID();
        jdbc.sql("""
                        insert into vehicle (id, driver_id, registration_number, make, model, color, production_year,
                                             state, class_approvals, created_at, updated_at)
                        values (:id, :driver, 'AA3000AA', 'Kia', 'Ceed', 'blue', 2020, 'APPROVED', '{STANDARD}',
                                now(), now())""")
                .param("id", vehicle).param("driver", id).update();
        UUID device = UUID.randomUUID();
        jdbc.sql("""
                        insert into device_session (id, subject_type, subject_id, audience, created_at,
                                                    last_refreshed_at, expires_at)
                        values (:id, 'DRIVER', :driver, 'driver', now(), now(), now() + interval '1 day')""")
                .param("id", device).param("driver", id).update();
        Driver driver = new Driver(new Actor(SubjectType.DRIVER, id), vehicle, device);
        sessions.open(driver.actor(), UUID.randomUUID(), device, vehicle,
                new LocationFix(PICKUP, 5.0, OffsetDateTime.now(), 1));
        jdbc.sql("update work_session set opened_at = now() - interval '3 hours' where driver_id = :d and state = 'OPEN'")
                .param("d", id).update();
        return driver;
    }

    private Actor staff(UUID city, String... permissions) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, city_scope, state, created_at,
                                                updated_at)
                        values (:id, :login, 'Reviewer', 'ADMIN', :permissions, :scope, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "risk-" + id).param("permissions", permissions)
                .param("scope", new UUID[]{city}).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private static TrackService.InputPoint point(long sequence, GeoPoint at, double accuracy, OffsetDateTime when) {
        return new TrackService.InputPoint(sequence, at.lat(), at.lon(), accuracy, null, null, when);
    }

    /** A point {@code metres} east of the pickup (about 85.6 km per degree at this latitude). */
    private static GeoPoint east(double metres) {
        return new GeoPoint(PICKUP.lat(), PICKUP.lon() + metres / 85_800.0);
    }

    private void track(Driver driver, TrackService.InputPoint... points) {
        tracks.store(driver.actor(), driver.device(), UUID.randomUUID(), List.of(points));
        deliver();
    }

    private void deliver() {
        while (relay.runOnce() > 0) {
            // drain
        }
    }

    private List<DriverRiskFlags.Flag> flagsOf(Actor reviewer, Driver driver) {
        return flags.list(reviewer, cityId, null, driver.id(), null, 100);
    }

    private static void assertCode(org.assertj.core.api.ThrowableAssert.ThrowingCallable call, ErrorCode code) {
        assertThatThrownBy(call).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }

    // ------------------------------------------------------------ the automatic source

    @Test
    void anImpossibleJumpRaisesExactlyOneFlagPerShiftAndHourAndLeavesTheTripAlone() {
        Driver driver = driverOnShift();
        Actor rider = clientActor();
        UUID quote = new TestQuotes(jdbc, quoteService).quote(rider, cityId, "STANDARD", PICKUP, DROPOFF).id();
        OrderView order = orders.create(rider, UUID.randomUUID(), new CreateOrder(rider.id(), "STANDARD", PICKUP,
                "Pickup", DROPOFF, "Dropoff", PaymentMethod.CASH, quote));
        dispatch.accept(driver.actor(), driver.device(), UUID.randomUUID(), dispatch.offers(driver.actor()).getFirst().id());
        String tripBefore = tripState(order.id());

        // Early in the previous hour, so all points fall into one hour whatever the clock says.
        OffsetDateTime base = OffsetDateTime.now(ZoneOffset.UTC).minusHours(1)
                .truncatedTo(java.time.temporal.ChronoUnit.HOURS).plusMinutes(1);
        // 40 km in one minute: 2 400 km/h.
        track(driver, point(10, PICKUP, 5, base), point(11, east(40_000), 5, base.plusSeconds(60)));
        // Back again in the same hour: still one flag.
        track(driver, point(12, PICKUP, 5, base.plusSeconds(120)));

        Actor reviewer = staff(cityId, DriverRiskFlags.RISK_PERMISSION);
        List<DriverRiskFlags.Flag> raised = flagsOf(reviewer, driver);
        assertThat(raised).hasSize(1);
        DriverRiskFlags.Flag flag = raised.getFirst();
        assertThat(flag.kind()).isEqualTo(DriverRiskFlags.Kind.IMPOSSIBLE_MOVEMENT);
        assertThat(flag.state()).isEqualTo(DriverRiskFlags.State.OPEN);
        assertThat(flag.cityId()).isEqualTo(cityId);
        assertThat(flag.raisedBy()).isNull();
        assertThat(flag.evidence()).containsKeys("work_session_id", "track_point_id", "distance_m", "seconds",
                "speed_kph", "recorded_at").doesNotContainKeys("lat", "lon", "point");
        assertThat(((Number) flag.evidence().get("speed_kph")).intValue()).isGreaterThan(2000);
        assertThat(flag.evidence().toString()).doesNotContain(String.valueOf(PICKUP.lon()));

        // Nothing else happened: the trip, the assignment and the driver's admission are as they were.
        assertThat(tripState(order.id())).isEqualTo(tripBefore);
        assertThat(jdbc.sql("select review_status from driver where id = :d").param("d", driver.id())
                .query(String.class).single()).isEqualTo("APPROVED");
        assertThat(jdbc.sql("select count(*) from driver_restriction where driver_id = :d and active")
                .param("d", driver.id()).query(Long.class).single()).isZero();
    }

    @Test
    void aFastHighwaySegmentAShortGlitchAndAPoorFixAreNotFlagged() {
        Driver driver = driverOnShift();
        OffsetDateTime base = OffsetDateTime.now(ZoneOffset.UTC).minusMinutes(10);
        // 2.5 km in a minute: 150 km/h on a highway.
        track(driver, point(1, PICKUP, 5, base), point(2, east(2_500), 5, base.plusSeconds(60)));
        // 600 m in two seconds: over 1 000 km/h, but a glitch shorter than the minimum distance.
        track(driver, point(3, east(3_100), 5, base.plusSeconds(62)));
        // 30 km in a minute, but the fix is 200 m inaccurate.
        track(driver, point(4, east(33_100), 200, base.plusSeconds(122)));
        Actor reviewer = staff(cityId, DriverRiskFlags.RISK_PERMISSION);
        assertThat(flagsOf(reviewer, driver)).isEmpty();
    }

    // ------------------------------------------------------------ people

    /** REQ-API-09: flags raised in the same microsecond are each listed once across pages. */
    @Test
    void flagsOfTheSameMomentPageEachOnce() {
        Driver driver = driverOnShift();
        Actor reviewer = staff(cityId, DriverRiskFlags.RISK_PERMISSION);
        List<UUID> raised = new java.util.ArrayList<>();
        for (int i = 0; i < 3; i++) {
            raised.add(flags.raise(reviewer, UUID.randomUUID(), driver.id(), cityId, "Same moment " + i).id());
        }
        jdbc.sql("update driver_risk_flag set raised_at = now() - interval '1 minute' where id in (:ids)")
                .param("ids", raised).update();

        List<UUID> seen = new java.util.ArrayList<>();
        taxi.blizz.platform.PageCursor after = null;
        for (int page = 0; page < 5; page++) {
            List<DriverRiskFlags.Flag> rows = flags.list(reviewer, cityId, null, driver.id(), after, 2);
            seen.add(rows.getFirst().id());
            if (rows.size() < 2) {
                break;
            }
            after = DriverRiskFlags.position(rows.getFirst());
        }
        assertThat(seen).hasSize(3).doesNotHaveDuplicates().containsExactlyInAnyOrderElementsOf(raised);
    }

    @Test
    void reviewIsOnceWithAReasonForTheFlagsCityAndASuspensionCanNameTheFlag() {
        Driver driver = driverOnShift();
        Driver other = driverOnShift();
        Actor reviewer = staff(cityId, DriverRiskFlags.RISK_PERMISSION);
        Actor elsewhere = staff(UUID.randomUUID(), DriverRiskFlags.RISK_PERMISSION);
        Actor noRight = staff(cityId, Orders.VIEW_PERMISSION);

        UUID command = UUID.randomUUID();
        DriverRiskFlags.Flag manual = flags.raise(reviewer, command, driver.id(), cityId, "Rider complaint: detours");
        assertThat(flags.raise(reviewer, command, driver.id(), cityId, "Rider complaint: detours").id())
                .as("a repeat").isEqualTo(manual.id());
        assertThat(manual.kind()).isEqualTo(DriverRiskFlags.Kind.MANUAL);
        assertThat(manual.raisedBy()).isEqualTo(reviewer.id());
        assertCode(() -> flags.raise(elsewhere, UUID.randomUUID(), driver.id(), cityId, "x"), ErrorCode.ACCESS_DENIED);
        assertCode(() -> flags.raise(reviewer, UUID.randomUUID(), driver.id(), cityId, " "),
                ErrorCode.VALIDATION_FAILED);
        assertCode(() -> flags.raise(reviewer, UUID.randomUUID(), UUID.randomUUID(), cityId, "x"), ErrorCode.NOT_FOUND);
        assertCode(() -> flags.list(noRight, null, null, null, null, 10), ErrorCode.ACCESS_DENIED);
        assertCode(() -> flags.get(elsewhere, manual.id()), ErrorCode.ACCESS_DENIED);
        assertThat(flags.list(elsewhere, null, null, driver.id(), null, 10)).as("another city's").isEmpty();

        assertCode(() -> flags.review(reviewer, UUID.randomUUID(), manual.id(), manual.version() + 1, true, "ok"),
                ErrorCode.VERSION_CONFLICT);
        assertCode(() -> flags.review(elsewhere, UUID.randomUUID(), manual.id(), manual.version(), true, "ok"),
                ErrorCode.ACCESS_DENIED);
        DriverRiskFlags.Flag confirmed = flags.review(reviewer, UUID.randomUUID(), manual.id(), manual.version(), true,
                "Checked the trips: confirmed");
        assertThat(confirmed.state()).isEqualTo(DriverRiskFlags.State.CONFIRMED);
        assertThat(confirmed.reviewedBy()).isEqualTo(reviewer.id());
        assertThat(confirmed.reviewReason()).isEqualTo("Checked the trips: confirmed");
        assertCode(() -> flags.review(reviewer, UUID.randomUUID(), manual.id(), confirmed.version(), false, "no"),
                ErrorCode.STATE_CONFLICT);
        assertThat(flags.list(reviewer, cityId, DriverRiskFlags.State.CONFIRMED, driver.id(), null, 10))
                .extracting(DriverRiskFlags.Flag::id).containsExactly(manual.id());

        DriverRiskFlags.Flag second = flags.raise(reviewer, UUID.randomUUID(), driver.id(), cityId, "Second look");
        assertThat(flags.review(reviewer, UUID.randomUUID(), second.id(), second.version(), false, "No case").state())
                .isEqualTo(DriverRiskFlags.State.DISMISSED);
        assertThat(jdbc.sql("""
                        select count(*) from audit_log
                        where resource_type = 'driver_risk_flag' and resource_id in (:a, :b)""")
                .param("a", manual.id().toString()).param("b", second.id().toString()).query(Long.class).single())
                .as("raise, confirm, raise, dismiss").isEqualTo(4);

        // A flag blocks nothing: the driver is still approved. The suspension is separate and names the flag.
        assertThat(jdbc.sql("select review_status from driver where id = :d").param("d", driver.id())
                .query(String.class).single()).isEqualTo("APPROVED");
        Actor admissionReviewer = staff(cityId, DriverAdmission.REVIEW_PERMISSION);
        long version = admission.profile(driver.id()).version();
        DriverRiskFlags.Flag othersFlag = flags.raise(reviewer, UUID.randomUUID(), other.id(), cityId, "Other");
        assertCode(() -> admission.suspend(admissionReviewer, UUID.randomUUID(), driver.id(), version,
                "Detours", othersFlag.id()), ErrorCode.VALIDATION_FAILED);
        admission.suspend(admissionReviewer, UUID.randomUUID(), driver.id(), version, "Detours confirmed",
                manual.id());
        assertThat(jdbc.sql("""
                        select risk_flag_id from driver_review_event
                        where driver_id = :d and to_status = 'SUSPENDED'""").param("d", driver.id())
                .query(UUID.class).single()).isEqualTo(manual.id());
        assertThat(jdbc.sql("""
                        select after ->> 'risk_flag_id' from audit_log
                        where resource_type = 'driver' and resource_id = :d and action = 'driver.review_status.suspended'""")
                .param("d", driver.id().toString()).query(String.class).single()).isEqualTo(manual.id().toString());
    }

    // ------------------------------------------------------------ helpers for the trip test

    private Actor clientActor() {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into client (id, phone_normalized, account_state, has_app, created_at, updated_at)
                        values (:id, :phone, 'ACTIVE', true, now(), now())""")
                .param("id", id)
                .param("phone", "+48" + String.format("%09d", Math.floorMod(id.hashCode(), 1_000_000_000)))
                .update();
        return new Actor(SubjectType.CLIENT, id);
    }

    private String tripState(UUID orderId) {
        return jdbc.sql("""
                        select o.status || '/' || a.state || '/' || coalesce(t.phase, '-')
                        from ride_order o join assignment a on a.order_id = o.id
                        left join trip t on t.assignment_id = a.id
                        where o.id = :o""").param("o", orderId).query(String.class).single();
    }
}
