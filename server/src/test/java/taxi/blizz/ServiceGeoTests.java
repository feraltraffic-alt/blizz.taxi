package taxi.blizz;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import jakarta.servlet.Filter;
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
import taxi.blizz.geo.CityResolver;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.ApiAudience;
import taxi.blizz.identity.SessionService;
import taxi.blizz.identity.VerifiedSubject;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.SubjectType;
import tools.jackson.databind.json.JsonMapper;

/**
 * ADR 0016, issue #214 (step 1c, geography): a point belongs to a city of the asker's own taxi service. Two services
 * may cover the same streets; each rider, driver and admin sees and orders only in their own service's cities.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class ServiceGeoTests {

    /** Far from every other test city: latitude 70 to 71, longitude 160 to 161. */
    static final GeoPoint POINT = new GeoPoint(70.5, 160.5);

    @Autowired JdbcClient jdbc;
    @Autowired CityResolver resolver;
    @Autowired SessionService sessions;
    @Autowired JsonMapper json;
    @Autowired WebApplicationContext context;

    MockMvc mvc;

    @BeforeEach
    void setUp() {
        List<Filter> filters = new ArrayList<>(context.getBeansOfType(Filter.class).values());
        AnnotationAwareOrderComparator.sort(filters);
        mvc = MockMvcBuilders.webAppContextSetup(context).addFilters(filters.toArray(Filter[]::new)).build();
    }

    private UUID service(String prefix) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into service (id, code, name, created_at, updated_at)
                        values (:id, :code, :code, now(), now())""")
                .param("id", id).param("code", prefix + "-" + id.toString().substring(0, 8)).update();
        return id;
    }

    private String code(UUID service) {
        return jdbc.sql("select code from service where id = :id").param("id", service).query(String.class).single();
    }

    /** A published city of {@code service} over the same square as every other one here, at one priority. */
    private UUID city(UUID service) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into city (id, code, name, currency, timezone, polygon, priority, state, service_id,
                                          created_at, updated_at)
                        values (:id, :code, :code, 'UAH', 'UTC',
                                ST_GeomFromEWKT('SRID=4326;MULTIPOLYGON(((160 70,161 70,161 71,160 71,160 70)))'),
                                7999, 'PUBLISHED', :service, now(), now())""")
                .param("id", id).param("code", "svc-geo-" + id.toString().substring(0, 8)).param("service", service)
                .update();
        return id;
    }

    private Actor rider(UUID service) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into client (id, phone_normalized, account_state, has_app, service_id, created_at,
                                            updated_at)
                        values (:id, :phone, 'ACTIVE', true, :service, now(), now())""")
                .param("id", id).param("phone", TestPhones.unique("+48", 9)).param("service", service).update();
        return new Actor(SubjectType.CLIENT, id);
    }

    private String admin(UUID service) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, all_cities, state, service_id,
                                                created_at, updated_at)
                        values (:id, :login, 'Geo', 'ADMIN', '{geo.manage}', true, 'ACTIVE', :service, now(), now())""")
                .param("id", id).param("login", "svc-geo-" + id).param("service", service).update();
        return sessions.openStaff(new VerifiedSubject(new Actor(SubjectType.STAFF, id), "ACTIVE", false),
                ApiAudience.ADMIN, null).accessToken();
    }

    @SuppressWarnings("unchecked")
    private Map<String, Object> body(MvcResult result) throws Exception {
        return json.readValue(result.getResponse().getContentAsString(), Map.class);
    }

    @Test
    void aPointIsInTheCityOfTheAskersOwnService() {
        UUID a = service("geo-a");
        UUID b = service("geo-b");
        UUID none = service("geo-none");
        UUID cityA = city(a);
        UUID cityB = city(b);
        assertThat(resolver.resolve(a, POINT).orElseThrow().id()).isEqualTo(cityA);
        assertThat(resolver.resolve(b, POINT).orElseThrow().id()).isEqualTo(cityB);
        assertThat(resolver.resolve(none, POINT)).as("another service's cities never answer").isEmpty();
    }

    @Test
    void aRiderOfAServiceWithNoCityThereIsOutsideTheServiceArea() throws Exception {
        UUID covered = service("geo-covered");
        city(covered);
        String token = sessions.open(new VerifiedSubject(rider(service("geo-empty")), "ACTIVE", false), "phone")
                .accessToken();
        MvcResult classes = mvc.perform(get("/api/rider/v1/vehicle-classes")
                .param("lat", "70.5").param("lon", "160.5")
                .header(HttpHeaders.AUTHORIZATION, "Bearer " + token)).andReturn();
        assertThat(classes.getResponse().getStatus()).isEqualTo(422);
        assertThat(body(classes)).containsEntry("code", "OUTSIDE_SERVICE_AREA");
    }

    @Test
    void anAdminListsAndDrawsCitiesOfTheirOwnServiceOnly() throws Exception {
        UUID a = service("geo-admin-a");
        UUID b = service("geo-admin-b");
        UUID cityA = city(a);
        UUID cityB = city(b);
        @SuppressWarnings("unchecked")
        List<Map<String, Object>> listed = (List<Map<String, Object>>) body(mvc.perform(get("/api/admin/v1/cities")
                .header(HttpHeaders.AUTHORIZATION, "Bearer " + admin(a))).andReturn()).get("cities");
        assertThat(listed).extracting(c -> c.get("id")).contains(cityA.toString())
                .doesNotContain(cityB.toString());

        // A city of another service over A's streets at the same priority publishes: equal priorities clash only
        // inside one service. A second one of that service over the same streets then clashes.
        UUID c = service("geo-admin-c");
        String tokenC = admin(c);
        assertThat(publish(tokenC, draft(tokenC, b))).as("no clash with A's or B's cities").isEqualTo(200);
        assertThat(publish(tokenC, draft(tokenC, b))).as("a clash with C's own city").isEqualTo(409);
    }

    /** A draft city over the shared square drawn by {@code token}'s staff; {@code unused} only names the case. */
    private Map<String, Object> draft(String token, UUID unused) throws Exception {
        Map<String, Object> square = Map.of("type", "Polygon", "coordinates", List.of(List.of(List.of(160.2, 70.2),
                List.of(160.4, 70.2), List.of(160.4, 70.4), List.of(160.2, 70.4), List.of(160.2, 70.2))));
        MvcResult created = mvc.perform(post("/api/admin/v1/cities").contentType(MediaType.APPLICATION_JSON)
                .header(HttpHeaders.AUTHORIZATION, "Bearer " + token)
                .content(json.writeValueAsString(Map.of("command_id", UUID.randomUUID(),
                        "code", "svc-geo-new-" + UUID.randomUUID().toString().substring(0, 8), "name", "New city",
                        "currency", "UAH", "timezone", "UTC", "polygon", square, "priority", 7999,
                        "reason", "Another service")))).andReturn();
        assertThat(created.getResponse().getStatus()).isEqualTo(201);
        return body(created);
    }

    private int publish(String token, Map<String, Object> city) throws Exception {
        return mvc.perform(post("/api/admin/v1/cities/" + city.get("id") + "/publish")
                .contentType(MediaType.APPLICATION_JSON).header(HttpHeaders.AUTHORIZATION, "Bearer " + token)
                .content(json.writeValueAsString(Map.of("command_id", UUID.randomUUID(),
                        "expected_version", city.get("version"), "reason", "Launch")))).andReturn()
                .getResponse().getStatus();
    }

    @Test
    void theBootstrapShowsTheCitiesOfTheAppsService() throws Exception {
        UUID a = service("geo-boot-a");
        UUID b = service("geo-boot-b");
        UUID cityA = city(a);
        UUID cityB = city(b);
        @SuppressWarnings("unchecked")
        List<Map<String, Object>> cities = (List<Map<String, Object>>) body(mvc.perform(get("/api/config/v1/bootstrap")
                .param("service", code(a))).andReturn()).get("cities");
        assertThat(cities).extracting(c -> c.get("id")).contains(cityA.toString()).doesNotContain(cityB.toString());
        assertThat(mvc.perform(get("/api/config/v1/bootstrap").param("service", "no-such-service")).andReturn()
                .getResponse().getStatus()).isEqualTo(400);
    }
}
