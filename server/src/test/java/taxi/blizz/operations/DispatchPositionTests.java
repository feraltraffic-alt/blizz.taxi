package taxi.blizz.operations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import jakarta.servlet.Filter;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.core.annotation.AnnotationAwareOrderComparator;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.ApiAudience;
import taxi.blizz.identity.IssuedSession;
import taxi.blizz.identity.SessionService;
import taxi.blizz.identity.VerifiedSubject;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.platform.internal.OutboxRelay;
import taxi.blizz.pricing.QuoteService;
import tools.jackson.databind.json.JsonMapper;

/**
 * The position dispatch uses (issue #102, threat model G1/G2): a heartbeat fix that implies a speed above 250 km/h
 * from the driver's last accepted position is not stored, leaves the location STALE and raises one
 * IMPOSSIBLE_MOVEMENT flag per shift and hour; the baseline is the driver's, across sign-out, devices and shifts.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class DispatchPositionTests {

    static final GeoPoint HOME = new GeoPoint(-39.5, 62.2);
    /** About 50 km east of {@link #HOME} (85.9 km per degree of longitude at this latitude). */
    static final GeoPoint FAR = new GeoPoint(-39.5, 62.2 + 50_000 / 85_900.0);
    /** About 300 km east: too far even for half an hour at 250 km/h. */
    static final GeoPoint VERY_FAR = new GeoPoint(-39.5, 62.2 + 300_000 / 85_900.0);

    @Autowired WebApplicationContext context;
    @Autowired SessionService auth;
    @Autowired WorkSessions sessions;
    @Autowired Orders orders;
    @Autowired Dispatch dispatch;
    @Autowired Trips trips;
    @Autowired QuoteService quotes;
    @Autowired OutboxRelay relay;
    @Autowired JsonMapper json;
    @Autowired JdbcClient jdbc;

    MockMvc mvc;
    TestRides rides;
    UUID city;

    @BeforeEach
    void setUp() {
        List<Filter> filters = new ArrayList<>(context.getBeansOfType(Filter.class).values());
        AnnotationAwareOrderComparator.sort(filters);
        mvc = MockMvcBuilders.webAppContextSetup(context).addFilters(filters.toArray(Filter[]::new)).build();
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        city = rides.city("test-dispatch-position", "UAH", 62);
    }

    // ------------------------------------------------------------ fixtures

    private Actor driver() {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into driver (id, phone_normalized, account_state, review_status, created_at, updated_at)
                        values (:id, :phone, 'ACTIVE', 'APPROVED', now(), now())""")
                .param("id", id)
                .param("phone", "+38063" + String.format("%07d", Math.floorMod(id.hashCode(), 10_000_000)))
                .update();
        jdbc.sql("""
                        insert into vehicle (id, driver_id, registration_number, make, model, color, production_year,
                                             state, class_approvals, created_at, updated_at)
                        values (:id, :driver, 'AA6200AA', 'Skoda', 'Fabia', 'red', 2022, 'APPROVED', '{STANDARD}',
                                now(), now())""")
                .param("id", UUID.randomUUID()).param("driver", id).update();
        return new Actor(SubjectType.DRIVER, id);
    }

    private UUID vehicleOf(Actor driver) {
        return jdbc.sql("select id from vehicle where driver_id = :d").param("d", driver.id()).query(UUID.class).single();
    }

    private IssuedSession signIn(Actor driver, String device) {
        return auth.open(new VerifiedSubject(driver, "ACTIVE", false), device);
    }

    private long sequence = 1;

    private Map<String, Object> location(GeoPoint point, OffsetDateTime recordedAt) {
        return Map.of("lat", point.lat(), "lon", point.lon(), "accuracy_m", 5, "recorded_at", recordedAt.toString(),
                "sequence", sequence++);
    }

    private MvcResult call(String path, IssuedSession session, Object body) throws Exception {
        return mvc.perform(post(path).header(HttpHeaders.AUTHORIZATION, "Bearer " + session.accessToken())
                .contentType(MediaType.APPLICATION_JSON).content(json.writeValueAsString(body))).andReturn();
    }

    @SuppressWarnings("unchecked")
    private Map<String, Object> body(MvcResult result) throws Exception {
        return json.readValue(result.getResponse().getContentAsString(), Map.class);
    }

    private Map<String, Object> open(IssuedSession device, Actor driver, GeoPoint at) throws Exception {
        MvcResult opened = call("/api/driver/v1/work-sessions", device, Map.of("command_id", UUID.randomUUID(),
                "vehicle_id", vehicleOf(driver), "location", location(at, OffsetDateTime.now())));
        assertThat(opened.getResponse().getStatus()).as(opened.getResponse().getContentAsString()).isEqualTo(201);
        return body(opened);
    }

    /** A heartbeat over HTTP: the answer as the app reads it. */
    private Map<String, Object> heartbeat(IssuedSession device, Actor driver, GeoPoint at, OffsetDateTime recordedAt)
            throws Exception {
        UUID session = sessions.availability(driver.id()).sessionId();
        MvcResult result = call("/api/driver/v1/work-sessions/" + session + "/heartbeat", device,
                Map.of("location", location(at, recordedAt)));
        assertThat(result.getResponse().getStatus()).as(result.getResponse().getContentAsString()).isEqualTo(200);
        return body(result);
    }

    /** Moves the driver's last accepted position back in time, as if {@code seconds} had passed since it. */
    private void baselineAged(Actor driver, int seconds) {
        int updated = jdbc.sql("""
                        update driver_last_position set accepted_at = accepted_at - make_interval(secs => :s)
                        where driver_id = :d""")
                .param("s", seconds).param("d", driver.id()).update();
        assertThat(updated).as("the driver has a baseline").isEqualTo(1);
    }

    private GeoPoint dispatchPosition(Actor driver) {
        return jdbc.sql("""
                        select ST_Y(last_location) as lat, ST_X(last_location) as lon from work_session
                        where driver_id = :d and state = 'OPEN'""")
                .param("d", driver.id())
                .query((rs, i) -> java.util.Optional.ofNullable(rs.getObject("lat") == null ? null
                        : new GeoPoint(rs.getDouble("lat"), rs.getDouble("lon"))))
                .single().orElse(null);
    }

    private int flags(Actor driver) {
        relay.runOnce();
        return jdbc.sql("select count(*) from driver_risk_flag where driver_id = :d and kind = 'IMPOSSIBLE_MOVEMENT'")
                .param("d", driver.id()).query(Integer.class).single();
    }

    @SuppressWarnings("unchecked")
    private Map<String, Object> onLiveBoard(Actor driver) throws Exception {
        UUID staffId = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, city_scope, state, created_at,
                                                updated_at)
                        values (:id, :login, 'Map', 'OPERATOR', :permissions, :scope, 'ACTIVE', now(), now())""")
                .param("id", staffId).param("login", "position-" + staffId)
                .param("permissions", new String[]{Orders.VIEW_PERMISSION}).param("scope", new UUID[]{city}).update();
        String token = auth.openStaff(new VerifiedSubject(new Actor(SubjectType.STAFF, staffId), "ACTIVE", false),
                ApiAudience.OPERATOR, null).accessToken();
        MvcResult result = mvc.perform(get("/api/operator/v1/drivers/live").param("city_id", city.toString())
                .header(HttpHeaders.AUTHORIZATION, "Bearer " + token)).andReturn();
        assertThat(result.getResponse().getStatus()).isEqualTo(200);
        List<Map<String, Object>> drivers = (List<Map<String, Object>>) body(result).get("drivers");
        return drivers.stream().filter(d -> driver.id().toString().equals(d.get("driver_id"))).findFirst().orElseThrow();
    }

    private static void assertNear(GeoPoint actual, GeoPoint expected) {
        assertThat(actual).isNotNull();
        assertThat(actual.lat()).isCloseTo(expected.lat(), org.assertj.core.data.Offset.offset(0.0001));
        assertThat(actual.lon()).isCloseTo(expected.lon(), org.assertj.core.data.Offset.offset(0.0001));
    }

    // ------------------------------------------------------------ E1

    @Test
    void aJumpIsNotStoredLeavesTheLocationStaleAndRaisesOneFlag() throws Exception {
        Actor driver = driver();
        IssuedSession phone = signIn(driver, "phone");
        open(phone, driver, HOME);
        baselineAged(driver, 10);

        // E1: 50 km in 10 s (18,000 km/h). The phone keeps sending: 200 with accepted false.
        Map<String, Object> jumped = heartbeat(phone, driver, FAR, OffsetDateTime.now());
        assertThat(jumped).containsEntry("accepted", false).containsEntry("geolocation", "STALE")
                .containsEntry("eligible", false);
        assertThat((List<String>) jumped.get("ineligible_reasons")).contains("LOCATION_STALE");
        assertNear(dispatchPosition(driver), HOME);

        // The operator's map still shows the old point, as STALE.
        Map<String, Object> onMap = onLiveBoard(driver);
        assertThat(onMap).containsEntry("geolocation", "STALE");
        @SuppressWarnings("unchecked")
        Map<String, Object> shown = (Map<String, Object>) onMap.get("location");
        assertNear(new GeoPoint(((Number) shown.get("lat")).doubleValue(), ((Number) shown.get("lon")).doubleValue()),
                HOME);

        // No offer for an order at the old point, and no claim of it: the candidate query sees STALE too.
        OrderView order = rides.order(rides.client(), city, TestRides.north(HOME, 200), TestRides.north(HOME, 3000));
        assertThat(dispatch.offers(driver)).isEmpty();
        assertThat(orders.get(order.id()).searchPhase()).isEqualTo("BROADCAST");
        assertThatThrownBy(() -> dispatch.claim(driver, phone.sessionId(), UUID.randomUUID(), order.id()))
                .isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(ErrorCode.DRIVER_NOT_ELIGIBLE);

        // Three jumps in the hour: one flag, with the heartbeat as its evidence.
        heartbeat(phone, driver, FAR, OffsetDateTime.now());
        heartbeat(phone, driver, new GeoPoint(FAR.lat(), FAR.lon() + 0.1), OffsetDateTime.now());
        assertThat(flags(driver)).isEqualTo(1);
        String evidence = jdbc.sql("select evidence::text from driver_risk_flag where driver_id = :d")
                .param("d", driver.id()).query(String.class).single();
        assertThat(evidence).contains("\"source\": \"heartbeat\"").doesNotContain("62.");
        assertThat(sessions.availability(driver.id()).geolocation()).isEqualTo("STALE");

        // The next plausible fix near the old position is accepted and the driver is FRESH again.
        Map<String, Object> back = heartbeat(phone, driver, TestRides.north(HOME, 50), OffsetDateTime.now());
        assertThat(back).containsEntry("accepted", true).containsEntry("geolocation", "FRESH");
        assertNear(dispatchPosition(driver), TestRides.north(HOME, 50));

        // Known limit (G3, mobile): a fake straight route at 240 km/h is plausible and stays accepted.
        baselineAged(driver, 10);
        GeoPoint fast = TestRides.north(HOME, 50 + 667);
        assertThat(heartbeat(phone, driver, fast, OffsetDateTime.now())).containsEntry("accepted", true);
        assertNear(dispatchPosition(driver), fast);
        assertThat(flags(driver)).isEqualTo(1);
    }

    @Test
    void aShortGlitchIsRefusedButNotFlaggedAndAFutureFixIsNotAccepted() throws Exception {
        Actor driver = driver();
        IssuedSession phone = signIn(driver, "phone");
        open(phone, driver, HOME);

        // 400 m at once: faster than 250 km/h, but not over the 1 km of an impossible movement (a GPS glitch).
        assertThat(heartbeat(phone, driver, TestRides.north(HOME, 400), OffsetDateTime.now()))
                .containsEntry("accepted", false).containsEntry("geolocation", "STALE");
        assertNear(dispatchPosition(driver), HOME);
        assertThat(flags(driver)).isZero();

        // A time ahead of the server by more than the tolerance was already ignored; now the answer says so.
        assertThat(heartbeat(phone, driver, TestRides.north(HOME, 20), OffsetDateTime.now().plusMinutes(5)))
                .containsEntry("accepted", false);
        assertThat(heartbeat(phone, driver, TestRides.north(HOME, 20), OffsetDateTime.now()))
                .containsEntry("accepted", true).containsEntry("geolocation", "FRESH");
    }

    // ------------------------------------------------------------ E2

    @Test
    void theBaselineIsTheDriversAcrossSignOutAnotherDeviceAndANewShift() throws Exception {
        Actor driver = driver();
        IssuedSession phone = signIn(driver, "phone");
        Map<String, Object> shift = open(phone, driver, HOME);

        // Sign out on the phone, sign in on a tablet, take over the shift and jump: still refused.
        auth.logout(phone.refreshToken());
        IssuedSession tablet = signIn(driver, "tablet");
        sessions.handover(driver, UUID.randomUUID(), tablet.sessionId(),
                ((Number) shift.get("session_version")).longValue());
        assertThat(heartbeat(tablet, driver, FAR, OffsetDateTime.now())).containsEntry("accepted", false);
        assertNear(dispatchPosition(driver), HOME);

        // Close the shift and open a new one at the far point: it opens, but without a dispatch position.
        DriverAvailability current = sessions.availability(driver.id());
        sessions.close(driver, UUID.randomUUID(), tablet.sessionId(), current.sessionVersion());
        Map<String, Object> reopened = open(tablet, driver, FAR);
        assertThat(reopened).containsEntry("geolocation", "UNAVAILABLE").containsEntry("eligible", false);
        assertThat(dispatchPosition(driver)).isNull();
        assertThat(heartbeat(tablet, driver, FAR, OffsetDateTime.now())).containsEntry("accepted", false);
        assertThat(flags(driver)).isEqualTo(2);  // one per shift and hour

        // Back near the last accepted position: accepted.
        assertThat(heartbeat(tablet, driver, TestRides.north(HOME, 30), OffsetDateTime.now()))
                .containsEntry("accepted", true).containsEntry("eligible", true);
    }

    @Test
    void aRefusalHealsOnceTheTimeToDriveThereHasPassed() throws Exception {
        Actor driver = driver();
        IssuedSession phone = signIn(driver, "phone");
        open(phone, driver, HOME);

        // A wrong first fix (a cell tower) must not hold the driver STALE until the 30-minute age-out: refused fixes
        // do not move the baseline, so the same far point is plausible once 50 km at 250 km/h (12 min) have passed.
        assertThat(heartbeat(phone, driver, FAR, OffsetDateTime.now())).containsEntry("accepted", false);
        assertThat(flags(driver)).isEqualTo(1);

        baselineAged(driver, 11 * 60);
        assertThat(heartbeat(phone, driver, FAR, OffsetDateTime.now())).containsEntry("accepted", false)
                .containsEntry("geolocation", "STALE");
        assertThat(flags(driver)).as("no second flag in the hour").isEqualTo(1);

        baselineAged(driver, 2 * 60);
        assertThat(heartbeat(phone, driver, FAR, OffsetDateTime.now())).containsEntry("accepted", true)
                .containsEntry("geolocation", "FRESH");
        assertNear(dispatchPosition(driver), FAR);
        assertThat(jdbc.sql("select location_refused_at from work_session where driver_id = :d and state = 'OPEN'")
                .param("d", driver.id()).query((rs, i) -> java.util.Optional.ofNullable(rs.getObject(1)))
                .single()).isEmpty();
        assertThat(flags(driver)).isEqualTo(1);
    }

    @Test
    void aBaselineOlderThanThirtyMinutesIsNotUsed() throws Exception {
        Actor driver = driver();
        IssuedSession phone = signIn(driver, "phone");
        open(phone, driver, HOME);

        baselineAged(driver, 29 * 60);
        assertThat(heartbeat(phone, driver, VERY_FAR, OffsetDateTime.now())).containsEntry("accepted", false);

        baselineAged(driver, 2 * 60);
        assertThat(heartbeat(phone, driver, VERY_FAR, OffsetDateTime.now())).containsEntry("accepted", true)
                .containsEntry("geolocation", "FRESH");
        assertNear(dispatchPosition(driver), VERY_FAR);
    }
}
