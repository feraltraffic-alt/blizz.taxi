package taxi.blizz.operations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import jakarta.servlet.Filter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.core.annotation.AnnotationAwareOrderComparator;
import org.springframework.http.HttpHeaders;
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
import taxi.blizz.platform.SubjectType;
import taxi.blizz.pricing.QuoteService;
import tools.jackson.databind.json.JsonMapper;

/** The call centre's map of the cars on the line (REQ-OPS-01). */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class LiveDriverBoardTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, 85.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 85.55);

    @Autowired Orders orders;
    @Autowired Dispatch dispatch;
    @Autowired Trips trips;
    @Autowired WorkSessions sessions;
    @Autowired SessionService auth;
    @Autowired QuoteService quotes;
    @Autowired JdbcClient jdbc;
    @Autowired WebApplicationContext context;
    @Autowired JsonMapper json;

    @Test
    @SuppressWarnings("unchecked")
    void freeAndBusyCarsOfTheCityForStaffOfTheCity() throws Exception {
        List<Filter> filters = new ArrayList<>(context.getBeansOfType(Filter.class).values());
        AnnotationAwareOrderComparator.sort(filters);
        MockMvc mvc = MockMvcBuilders.webAppContextSetup(context).addFilters(filters.toArray(Filter[]::new)).build();
        TestRides rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        UUID city = rides.city("test-live-board", "UAH", 85);

        TestRides.Driver busy = rides.driverNear(PICKUP);
        TestRides.Ride ride = rides.assigned(city, busy, PICKUP, DROPOFF);
        TestRides.Driver free = rides.driverNear(new GeoPoint(-39.8, 85.8));

        String operator = token(new String[]{Orders.VIEW_PERMISSION}, city);
        MvcResult result = mvc.perform(get("/api/operator/v1/drivers/live").param("city_id", city.toString())
                .header(HttpHeaders.AUTHORIZATION, "Bearer " + operator)).andReturn();
        assertThat(result.getResponse().getStatus()).as(result.getResponse().getContentAsString()).isEqualTo(200);
        List<Map<String, Object>> drivers = (List<Map<String, Object>>) json.readValue(
                result.getResponse().getContentAsString(), Map.class).get("drivers");

        assertThat(drivers).anySatisfy(d -> {
            assertThat(d).containsEntry("driver_id", busy.actor().id().toString())
                    .containsEntry("status", "ON_ORDER").containsEntry("order_id", ride.order().id().toString());
            assertThat((Map<String, Object>) d.get("car")).containsEntry("registration_number", "AA4000AA");
        });
        assertThat(drivers).anySatisfy(d -> {
            assertThat(d).containsEntry("driver_id", free.actor().id().toString())
                    .containsEntry("status", "FREE").containsEntry("connection", "CONNECTED");
            assertThat(d.get("order_id")).isNull();
            assertThat((Map<String, Object>) d.get("location")).containsKeys("lat", "lon");
        });
        assertThat(result.getResponse().getContentAsString()).as("no phone numbers").doesNotContain("+38099");
        // When each driver was last heard from, by server time (REQ-DS-03, issue #141).
        for (TestRides.Driver driver : List.of(busy, free)) {
            java.time.Instant heard = jdbc.sql("""
                            select last_heartbeat_at from work_session where driver_id = :d and state = 'OPEN'""")
                    .param("d", driver.actor().id()).query(java.time.OffsetDateTime.class).single().toInstant();
            assertThat(drivers).anySatisfy(d -> {
                assertThat(d).containsEntry("driver_id", driver.actor().id().toString());
                assertThat(d.get("last_heartbeat_at")).as("last_heartbeat_at of %s", driver).isNotNull();
                assertThat(java.time.OffsetDateTime.parse((String) d.get("last_heartbeat_at")).toInstant())
                        .isEqualTo(heard);
            });
        }

        // Filters (REQ-ADM-08): by status, and by the part of the map in view.
        List<Map<String, Object>> onOrder = (List<Map<String, Object>>) json.readValue(mvc.perform(
                get("/api/operator/v1/drivers/live").param("city_id", city.toString()).param("status", "ON_ORDER")
                        .header(HttpHeaders.AUTHORIZATION, "Bearer " + operator)).andReturn().getResponse()
                .getContentAsString(), Map.class).get("drivers");
        assertThat(onOrder).extracting(d -> d.get("driver_id")).containsExactly(busy.actor().id().toString());
        List<Map<String, Object>> inBox = (List<Map<String, Object>>) json.readValue(mvc.perform(
                get("/api/operator/v1/drivers/live").param("city_id", city.toString())
                        .param("box", "-39.85,85.7,-39.7,85.9")
                        .header(HttpHeaders.AUTHORIZATION, "Bearer " + operator)).andReturn().getResponse()
                .getContentAsString(), Map.class).get("drivers");
        assertThat(inBox).extracting(d -> d.get("driver_id")).containsExactly(free.actor().id().toString());

        String elsewhere = token(new String[]{Orders.VIEW_PERMISSION}, UUID.randomUUID());
        assertThat(mvc.perform(get("/api/operator/v1/drivers/live").param("city_id", city.toString())
                .header(HttpHeaders.AUTHORIZATION, "Bearer " + elsewhere)).andReturn().getResponse().getStatus())
                .isEqualTo(403);
    }

    private String token(String[] permissions, UUID city) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, city_scope, state, created_at,
                                                updated_at)
                        values (:id, :login, 'Board', 'OPERATOR', :permissions, :scope, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "board-" + id).param("permissions", permissions)
                .param("scope", new UUID[]{city}).update();
        return auth.openStaff(new VerifiedSubject(new Actor(SubjectType.STAFF, id), "ACTIVE", false),
                ApiAudience.OPERATOR, null).accessToken();
    }
}
