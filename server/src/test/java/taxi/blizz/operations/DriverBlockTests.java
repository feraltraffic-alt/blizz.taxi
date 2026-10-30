package taxi.blizz.operations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.patch;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import jakarta.servlet.Filter;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
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
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.driver.DriverAdmission;
import taxi.blizz.driver.DriverProfile;
import taxi.blizz.geo.GeoPoint;
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
 * Issue #141, part 3 (REQ-DS-01): blocking a driver account stops new work at once but keeps a limited session — the
 * current trip is completed and paid (E3), support is reached and everything already earned can be read. Its own city
 * at longitude 149.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class DriverBlockTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, 149.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 149.55);

    @Autowired Orders orders;
    @Autowired Dispatch dispatch;
    @Autowired Trips trips;
    @Autowired WorkSessions sessions;
    @Autowired SessionService auth;
    @Autowired QuoteService quotes;
    @Autowired DriverBlocks blocks;
    @Autowired DriverAdmission admission;
    @Autowired OutboxRelay relay;
    @Autowired JdbcClient jdbc;
    @Autowired WebApplicationContext context;
    @Autowired JsonMapper json;

    TestRides rides;
    UUID city;
    MockMvc mvc;

    @BeforeEach
    void city() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        city = rides.city("test-driver-block", "UAH", 149);
        jdbc.sql("""
                        update dispatch_attempt set phase = 'STOPPED', next_action_at = null
                        where phase in ('PERSONAL', 'BROADCAST')
                          and order_id in (select id from ride_order where city_id = :c)""")
                .param("c", city).update();
        jdbc.sql("""
                        update ride_order set status = 'UNFULFILLED'
                        where city_id = :c and status in ('READY', 'SEARCHING', 'ASSIGNED', 'IN_SERVICE')""")
                .param("c", city).update();
        List<Filter> filters = new ArrayList<>(context.getBeansOfType(Filter.class).values());
        AnnotationAwareOrderComparator.sort(filters);
        mvc = MockMvcBuilders.webAppContextSetup(context).addFilters(filters.toArray(Filter[]::new)).build();
    }

    // ------------------------------------------------------------ E3

    @Test
    void aDriverBlockedOnATripCompletesItGetsPaidAndIsOfferedNothingNew() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        TestRides.Ride ride = rides.started(city, driver, PICKUP, DROPOFF);

        block(driver, "Fraud complaint under review");

        DriverAvailability blocked = sessions.availability(driver.actor().id());
        assertThat(blocked.accountState()).isEqualTo("BLOCKED");
        assertThat(blocked.intent()).as("no next order after this trip").isEqualTo("PAUSE_AFTER_CURRENT");
        assertThat(blocked.occupancy()).isEqualTo("ON_TRIP");

        TripView done = rides.complete(ride, true);
        assertThat(done.phase()).isEqualTo("COMPLETED");
        while (relay.runOnce() > 0) {
            // deliver the completion to finance
        }
        assertThat(jdbc.sql("""
                        select count(*) from journal_transaction where basis_type = 'TRIP_FARE' and basis_id = :o""")
                .param("o", ride.order().id()).query(Integer.class).single()).as("the earnings are posted")
                .isEqualTo(1);

        DriverAvailability after = sessions.availability(driver.actor().id());
        assertThat(after.intent()).isEqualTo("NOT_ACCEPTING");
        assertThat(after.ineligibleReasons()).contains("ACCOUNT_BLOCKED");
        OrderView next = rides.order(rides.client(), city, PICKUP, DROPOFF);
        assertThat(dispatch.offers(driver.actor())).isEmpty();
        assertThat(orders.get(next.id()).searchPhase()).isEqualTo("BROADCAST");
        assertThat(dispatch.broadcast(driver.actor())).isEmpty();
    }

    @Test
    void blockingRevokesTheOpenOfferAtOnceAndTheNextDriverGetsTheOrder() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        OrderView order = rides.order(rides.client(), city, PICKUP, DROPOFF);
        OfferView offer = dispatch.offers(driver.actor()).getFirst();
        TestRides.Driver next = rides.driverNear(TestRides.north(PICKUP, 1500));

        block(driver, "Documents forged");

        assertThat(jdbc.sql("select state from offer where id = :id").param("id", offer.id()).query(String.class)
                .single()).isEqualTo("REVOKED");
        assertThat(jdbc.sql("""
                        select payload ->> 'reason' from outbox
                        where event_type = 'OfferRevoked' and payload ->> 'offer_id' = :o""")
                .param("o", offer.id().toString()).query(String.class).list()).containsExactly("DRIVER_BLOCKED");
        assertThat(sessions.availability(driver.actor().id()).intent()).isEqualTo("NOT_ACCEPTING");
        assertCode(() -> dispatch.accept(driver.actor(), driver.device(), UUID.randomUUID(), offer.id()),
                ErrorCode.OFFER_REVOKED);
        assertThat(dispatch.offers(next.actor())).extracting(OfferView::orderId).containsExactly(order.id());
    }

    // ------------------------------------------------------------ the limited session (HTTP)

    @Test
    void aBlockedDriverReadsEverythingFinishesTheTripAndIsRefusedNewWork() throws Exception {
        TestRides.Driver online = rides.driverNear(PICKUP);
        IssuedSession phone = auth.open(new VerifiedSubject(online.actor(), "ACTIVE", false), "block-phone");
        sessions.handover(online.actor(), UUID.randomUUID(), phone.sessionId(), version(online));
        TestRides.Driver driver = new TestRides.Driver(online.actor(), phone.sessionId(), online.vehicle());
        TestRides.Ride ride = rides.started(city, driver, PICKUP, DROPOFF);
        String token = phone.accessToken();

        block(driver, "Complaint");

        // Reads: trips, balance, earnings, documents, the shift.
        for (String path : List.of("/api/driver/v1/trips/current", "/api/driver/v1/trips", "/api/driver/v1/balance",
                "/api/driver/v1/earnings?city_id=" + city + "&from=" + java.time.LocalDate.now().minusDays(6) + "&to="
                        + java.time.LocalDate.now(), "/api/driver/v1/profile",
                "/api/driver/v1/work-sessions/current")) {
            assertThat(status(get(path), token)).as("GET %s", path).isEqualTo(200);
        }
        // Commands outside the limited session.
        assertBlocked(patch("/api/driver/v1/profile")
                .content("{\"command_id\":\"" + UUID.randomUUID() + "\",\"name\":\"New name\"}"), token);
        assertBlocked(post("/api/driver/v1/work-sessions/" + sessionId(driver) + "/resume")
                .content(versioned(driver)), token);
        assertBlocked(post("/api/driver/v1/offers/" + UUID.randomUUID() + "/accept")
                .content("{\"command_id\":\"" + UUID.randomUUID() + "\"}"), token);
        assertBlocked(post("/api/driver/v1/orders/" + UUID.randomUUID() + "/claim")
                .content("{\"command_id\":\"" + UUID.randomUUID() + "\"}"), token);
        assertBlocked(post("/api/driver/v1/transfers").content("{}"), token);

        // The trip and the shift go on.
        MvcResult heartbeat = mvc.perform(post("/api/driver/v1/work-sessions/" + sessionId(driver) + "/heartbeat")
                .header(HttpHeaders.AUTHORIZATION, "Bearer " + token).contentType(MediaType.APPLICATION_JSON)
                .content("{}")).andReturn();
        assertThat(heartbeat.getResponse().getStatus()).as(heartbeat.getResponse().getContentAsString())
                .isEqualTo(200);
        TripView trip = ride.trip();
        MvcResult complete = mvc.perform(post("/api/driver/v1/trips/" + trip.id() + "/complete")
                .header(HttpHeaders.AUTHORIZATION, "Bearer " + token).contentType(MediaType.APPLICATION_JSON)
                .content("{\"command_id\":\"" + UUID.randomUUID() + "\",\"expected_version\":" + trip.version()
                        + ",\"reported_at\":\"" + OffsetDateTime.now() + "\",\"cash_received\":true}"))
                .andReturn();
        assertThat(complete.getResponse().getStatus()).as(complete.getResponse().getContentAsString())
                .isEqualTo(200);
        MvcResult support = mvc.perform(post("/api/driver/v1/support/cases")
                .header(HttpHeaders.AUTHORIZATION, "Bearer " + token).contentType(MediaType.APPLICATION_JSON)
                .content("{\"command_id\":\"" + UUID.randomUUID() + "\",\"category\":\"OTHER\","
                        + "\"subject\":\"Why am I blocked?\",\"message\":\"Please explain the block.\"}"))
                .andReturn();
        assertThat(support.getResponse().getStatus()).as(support.getResponse().getContentAsString())
                .isIn(200, 201);
        MvcResult close = mvc.perform(post("/api/driver/v1/work-sessions/" + sessionId(driver) + "/close")
                .header(HttpHeaders.AUTHORIZATION, "Bearer " + token).contentType(MediaType.APPLICATION_JSON)
                .content(versioned(driver))).andReturn();
        assertThat(close.getResponse().getStatus()).as(close.getResponse().getContentAsString()).isEqualTo(200);

        // Going online again is refused with the same code.
        assertBlocked(post("/api/driver/v1/work-sessions").content("{\"command_id\":\"" + UUID.randomUUID()
                + "\",\"vehicle_id\":\"" + driver.vehicle() + "\",\"location\":{\"lat\":-39.5,\"lon\":149.5,"
                + "\"accuracy_m\":5,\"recorded_at\":\"" + OffsetDateTime.now() + "\",\"sequence\":99999}}"), token);
    }

    @Test
    void aBlockedDriverKeepsTheSessionRefreshesAndCanSignInAgain() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        IssuedSession phone = auth.open(new VerifiedSubject(driver.actor(), "ACTIVE", false), "block-refresh");

        block(driver, "Complaint");

        IssuedSession refreshed = auth.refresh(phone.refreshToken());
        assertThat(refreshed.sessionId()).isEqualTo(phone.sessionId());
        assertThat(auth.open(new VerifiedSubject(driver.actor(), "BLOCKED", false), "block-new-phone").accessToken())
                .as("a new phone mid-trip still reaches the limited session").isNotBlank();
    }

    // ------------------------------------------------------------ the staff command

    @Test
    void staffBlockAndUnblockWithThePermissionAReasonAndTheVersion() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        long version = admission.profile(driver.actor().id()).version();
        Actor reviewer = staff(DriverAdmission.REVIEW_PERMISSION);

        assertCode(() -> blocks.block(driver.actor(), UUID.randomUUID(), driver.actor().id(), version, "self"),
                ErrorCode.ACCESS_DENIED);
        assertCode(() -> blocks.block(staff(), UUID.randomUUID(), driver.actor().id(), version, "no permission"),
                ErrorCode.ACCESS_DENIED);
        assertCode(() -> blocks.block(reviewer, UUID.randomUUID(), driver.actor().id(), version, " "),
                ErrorCode.VALIDATION_FAILED);

        UUID command = UUID.randomUUID();
        DriverProfile blocked = blocks.block(reviewer, command, driver.actor().id(), version, "Complaint");
        assertThat(blocked.accountState()).isEqualTo("BLOCKED");
        assertThat(blocks.block(reviewer, command, driver.actor().id(), version, "Complaint")).isEqualTo(blocked);
        assertCode(() -> blocks.block(reviewer, UUID.randomUUID(), driver.actor().id(), version, "stale"),
                ErrorCode.VERSION_CONFLICT);
        assertCode(() -> blocks.block(reviewer, UUID.randomUUID(), driver.actor().id(), blocked.version(), "again"),
                ErrorCode.STATE_CONFLICT);

        DriverProfile unblocked = blocks.unblock(reviewer, UUID.randomUUID(), driver.actor().id(), blocked.version(),
                "Complaint closed");
        assertThat(unblocked.accountState()).isEqualTo("ACTIVE");
        assertCode(() -> blocks.unblock(reviewer, UUID.randomUUID(), driver.actor().id(), unblocked.version(),
                "again"), ErrorCode.STATE_CONFLICT);
        sessions.resume(driver.actor(), UUID.randomUUID(), driver.device(), version(driver));
        assertThat(sessions.availability(driver.actor().id()).eligible()).as("resumed by the driver").isTrue();

        assertThat(jdbc.sql("""
                        select action from audit_log where resource_type = 'driver' and resource_id = :d
                          and action in ('driver.block', 'driver.unblock') order by occurred_at""")
                .param("d", driver.actor().id().toString()).query(String.class).list())
                .containsExactly("driver.block", "driver.unblock");
        assertThat(jdbc.sql("""
                        select event_type from outbox where aggregate_id = :d
                          and event_type in ('DriverAccountBlocked', 'DriverAccountUnblocked') order by occurred_at""")
                .param("d", driver.actor().id()).query(String.class).list())
                .containsExactly("DriverAccountBlocked", "DriverAccountUnblocked");
    }

    // ------------------------------------------------------------ helpers

    private void block(TestRides.Driver driver, String reason) {
        blocks.block(staff(DriverAdmission.REVIEW_PERMISSION), UUID.randomUUID(), driver.actor().id(),
                admission.profile(driver.actor().id()).version(), reason);
    }

    private long version(TestRides.Driver driver) {
        return sessions.availability(driver.actor().id()).sessionVersion();
    }

    private UUID sessionId(TestRides.Driver driver) {
        return sessions.availability(driver.actor().id()).sessionId();
    }

    private String versioned(TestRides.Driver driver) {
        return "{\"command_id\":\"" + UUID.randomUUID() + "\",\"expected_version\":" + version(driver) + "}";
    }

    private int status(MockHttpServletRequestBuilder request, String token) throws Exception {
        MvcResult result = mvc.perform(request.header(HttpHeaders.AUTHORIZATION, "Bearer " + token)).andReturn();
        return result.getResponse().getStatus();
    }

    @SuppressWarnings("unchecked")
    private void assertBlocked(MockHttpServletRequestBuilder request, String token) throws Exception {
        MvcResult result = mvc.perform(request.header(HttpHeaders.AUTHORIZATION, "Bearer " + token)
                .contentType(MediaType.APPLICATION_JSON)).andReturn();
        String body = result.getResponse().getContentAsString();
        assertThat(result.getResponse().getStatus()).as(body).isEqualTo(403);
        assertThat((Map<String, Object>) json.readValue(body, Map.class)).containsEntry("code", "ACCOUNT_BLOCKED");
    }

    private Actor staff(String... permissions) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, all_cities, state, created_at,
                                                updated_at)
                        values (:id, :login, 'Reviewer', 'ADMIN', :permissions, true, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "block-" + id).param("permissions", permissions).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private static void assertCode(ThrowingCallable call, ErrorCode code) {
        assertThatThrownBy(call).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }
}
