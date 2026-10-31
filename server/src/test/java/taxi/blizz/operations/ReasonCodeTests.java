package taxi.blizz.operations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import jakarta.servlet.Filter;
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
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.ApiAudience;
import taxi.blizz.identity.SessionService;
import taxi.blizz.identity.VerifiedSubject;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.pricing.QuoteService;
import tools.jackson.databind.json.JsonMapper;

/**
 * Issue #143, part 3 (REQ-CAN-01, E4): taking a driver off an order and a driver giving it up need a reason code of the
 * catalog (ADR 0007) — the REASSIGN list for staff, a RETURN_TO_SEARCH driver reason for the driver — with an optional
 * comment; the code and its labels at the time stay with the assignment. Its own city at longitude 158.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class ReasonCodeTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, 158.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 158.55);

    @Autowired Orders orders;
    @Autowired Dispatch dispatch;
    @Autowired Trips trips;
    @Autowired WorkSessions sessions;
    @Autowired SessionService auth;
    @Autowired QuoteService quotes;
    @Autowired JdbcClient jdbc;
    @Autowired WebApplicationContext context;
    @Autowired JsonMapper json;

    TestRides rides;
    UUID city;
    MockMvc mvc;

    @BeforeEach
    void city() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        city = rides.city("test-reason-codes", "UAH", 158);
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

    // ------------------------------------------------------------ staff take a driver off (E4)

    @Test
    void takingADriverOffNeedsACodeOfTheReassignList() {
        TestRides.Ride ride = rides.assigned(city, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        Actor dispatcher = staff();
        long version = orders.get(ride.order().id()).version();

        assertCode(() -> orders.revokeAssignment(dispatcher, UUID.randomUUID(), ride.order().id(), version, null,
                "No code"), ErrorCode.VALIDATION_FAILED);
        assertCode(() -> orders.revokeAssignment(dispatcher, UUID.randomUUID(), ride.order().id(), version,
                "NO_SUCH_CODE", null), ErrorCode.VALIDATION_FAILED);
        assertCode(() -> orders.revokeAssignment(dispatcher, UUID.randomUUID(), ride.order().id(), version, "NO_CARS",
                null), ErrorCode.VALIDATION_FAILED); // a reason to cancel an order, not to take a driver off
        jdbc.sql("update cancel_reason set active = false where audience = 'REASSIGN' and code = 'OTHER'").update();
        try {
            assertCode(() -> orders.revokeAssignment(dispatcher, UUID.randomUUID(), ride.order().id(), version,
                    "OTHER", null), ErrorCode.VALIDATION_FAILED);
        } finally {
            jdbc.sql("update cancel_reason set active = true where audience = 'REASSIGN' and code = 'OTHER'").update();
        }
        assertThat(orders.get(ride.order().id()).status()).isEqualTo("ASSIGNED");

        orders.revokeAssignment(dispatcher, UUID.randomUUID(), ride.order().id(), version, "DRIVER_NOT_RESPONDING",
                "Three calls, no answer");

        Map<String, Object> closed = jdbc.sql("""
                        select close_reason, close_reason_code, close_reason_labels ->> 'en' as label from assignment
                        where order_id = :o""")
                .param("o", ride.order().id()).query().singleRow();
        assertThat(closed.get("close_reason_code")).isEqualTo("DRIVER_NOT_RESPONDING");
        assertThat(closed.get("label")).isEqualTo("The driver does not answer");
        assertThat((String) closed.get("close_reason")).contains("Three calls, no answer");
        assertThat(jdbc.sql("""
                        select payload ->> 'reason_code' from outbox
                        where event_type = 'AssignmentRevoked' and aggregate_id = :o""")
                .param("o", ride.order().id()).query(String.class).single()).isEqualTo("DRIVER_NOT_RESPONDING");
    }

    @Test
    void overHttpAMissingOrUnknownCodeIs400AndTheListIsThere() throws Exception {
        TestRides.Ride ride = rides.assigned(city, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        String token = auth.openStaff(new VerifiedSubject(staff(), "ACTIVE", false), ApiAudience.OPERATOR, "reasons")
                .accessToken();
        long version = orders.get(ride.order().id()).version();
        String path = "/api/operator/v1/orders/" + ride.order().id() + "/revoke-assignment";

        assertThat(status(path, token, Map.of("command_id", UUID.randomUUID(), "expected_version", version,
                "reason", "Free text only"))).as("the first version's body").isEqualTo(400);
        assertThat(status(path, token, Map.of("command_id", UUID.randomUUID(), "expected_version", version,
                "reason_code", "NO_SUCH_CODE"))).isEqualTo(400);
        assertThat(status(path, token, Map.of("command_id", UUID.randomUUID(), "expected_version", version,
                "reason_code", "DRIVER_TOO_FAR", "comment", "Stuck on the bridge"))).isEqualTo(200);

        MvcResult list = mvc.perform(get("/api/operator/v1/reassign-reasons")
                .header(HttpHeaders.AUTHORIZATION, "Bearer " + token)).andReturn();
        assertThat(list.getResponse().getStatus()).isEqualTo(200);
        assertThat(list.getResponse().getContentAsString()).contains("DRIVER_NOT_RESPONDING", "DRIVER_TOO_FAR")
                .doesNotContain("NO_CARS");
    }

    // ------------------------------------------------------------ the driver gives the order up (E4)

    @Test
    void givingTheOrderUpNeedsADriverReasonThatReturnsItToTheSearch() {
        TestRides.Ride ride = rides.assigned(city, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        TripView trip = ride.trip();
        Actor driver = ride.driver().actor();

        assertCode(() -> trips.withdraw(driver, UUID.randomUUID(), trip.id(), trip.version(), null, "Flat tyre"),
                ErrorCode.VALIDATION_FAILED);
        assertCode(() -> trips.withdraw(driver, UUID.randomUUID(), trip.id(), trip.version(), "NO_SUCH_CODE", null),
                ErrorCode.VALIDATION_FAILED);
        assertCode(() -> trips.withdraw(driver, UUID.randomUUID(), trip.id(), trip.version(), "PASSENGER_ASKED",
                null), ErrorCode.VALIDATION_FAILED); // that reason cancels the order instead

        TripView withdrawn = trips.withdraw(driver, UUID.randomUUID(), trip.id(), trip.version(), "VEHICLE_PROBLEM",
                "Flat tyre");

        assertThat(withdrawn.phase()).isEqualTo("ABORTED");
        assertThat(orders.get(ride.order().id()).status()).isEqualTo("SEARCHING");
        assertThat(jdbc.sql("""
                        select payload ->> 'reason_code' from outbox
                        where event_type = 'AssignmentWithdrawn' and aggregate_id = :o""")
                .param("o", ride.order().id()).query(String.class).single()).isEqualTo("VEHICLE_PROBLEM");
    }

    // ------------------------------------------------------------ helpers

    private int status(String path, String token, Map<String, Object> body) throws Exception {
        return mvc.perform(post(path).header(HttpHeaders.AUTHORIZATION, "Bearer " + token)
                .contentType(MediaType.APPLICATION_JSON).content(json.writeValueAsString(body)))
                .andReturn().getResponse().getStatus();
    }

    private Actor staff() {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, all_cities, state, created_at,
                                                updated_at)
                        values (:id, :login, 'Dispatcher', 'OPERATOR', '{orders.reassign,orders.view}', true,
                                'ACTIVE', now(), now())""")
                .param("id", id).param("login", "reasons-" + id).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private static void assertCode(ThrowingCallable call, ErrorCode code) {
        assertThatThrownBy(call).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }
}
