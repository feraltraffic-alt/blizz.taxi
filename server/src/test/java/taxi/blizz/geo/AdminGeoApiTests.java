package taxi.blizz.geo;

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
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.identity.ApiAudience;
import taxi.blizz.identity.SessionService;
import taxi.blizz.identity.VerifiedSubject;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.SubjectType;
import tools.jackson.databind.json.JsonMapper;

/** Cities, zones and own addresses in the admin panel (geo.manage), boundaries as GeoJSON. */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class AdminGeoApiTests {

    @Autowired
    WebApplicationContext context;
    @Autowired
    SessionService sessions;
    @Autowired
    JdbcClient jdbc;
    @Autowired
    JsonMapper json;

    MockMvc mvc;

    @BeforeEach
    void setUp() {
        List<Filter> filters = new ArrayList<>(context.getBeansOfType(Filter.class).values());
        AnnotationAwareOrderComparator.sort(filters);
        mvc = MockMvcBuilders.webAppContextSetup(context).addFilters(filters.toArray(Filter[]::new)).build();
    }

    private String token(String... permissions) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, all_cities, state, created_at, updated_at)
                        values (:id, :login, 'Geo admin', 'ADMIN', :permissions, true, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "geo-" + id).param("permissions", permissions).update();
        return sessions.openStaff(new VerifiedSubject(new Actor(SubjectType.STAFF, id), "ACTIVE", false),
                ApiAudience.ADMIN, null).accessToken();
    }

    private MvcResult send(String token, String path, Object body) throws Exception {
        return mvc.perform(post(path).header(HttpHeaders.AUTHORIZATION, "Bearer " + token)
                .contentType(MediaType.APPLICATION_JSON).content(json.writeValueAsString(body))).andReturn();
    }

    private MvcResult read(String token, String path, String... params) throws Exception {
        var request = get(path).header(HttpHeaders.AUTHORIZATION, "Bearer " + token);
        for (int i = 0; i < params.length; i += 2) {
            request.param(params[i], params[i + 1]);
        }
        return mvc.perform(request).andReturn();
    }

    @SuppressWarnings("unchecked")
    private Map<String, Object> body(MvcResult result) throws Exception {
        return json.readValue(result.getResponse().getContentAsString(), Map.class);
    }

    private static Map<String, Object> square(double lon, double lat, double size) {
        return Map.of("type", "Polygon", "coordinates", List.of(List.of(List.of(lon, lat), List.of(lon + size, lat),
                List.of(lon + size, lat + size), List.of(lon, lat + size), List.of(lon, lat))));
    }

    private static Map<String, Object> change(Map<String, Object> revision, String reason) {
        return Map.of("command_id", UUID.randomUUID(), "expected_version", revision.get("version"), "reason", reason);
    }

    @Test
    @SuppressWarnings("unchecked")
    void anAdminDrawsACityAZoneAndAddsAnAddress() throws Exception {
        String token = token("geo.manage");
        String code = "admin-geo-" + UUID.randomUUID().toString().substring(0, 8);

        MvcResult created = send(token, "/api/admin/v1/cities", Map.of("command_id", UUID.randomUUID(), "code", code,
                "name", "Synthetic", "currency", "PLN", "timezone", "Europe/Warsaw",
                "polygon", square(-170, 60, 1), "priority", 5, "reason", "New city"));
        assertThat(created.getResponse().getStatus()).isEqualTo(201);
        Map<String, Object> city = body(created);
        String cityId = (String) city.get("id");
        Map<String, Object> published = body(send(token, "/api/admin/v1/cities/" + cityId + "/publish",
                change(city, "Launch")));
        assertThat(published).containsEntry("state", "PUBLISHED");

        List<Map<String, Object>> cities = (List<Map<String, Object>>) body(read(token, "/api/admin/v1/cities",
                "state", "PUBLISHED")).get("cities");
        assertThat(cities).anySatisfy(c -> {
            assertThat(c).containsEntry("code", code);
            assertThat((Map<String, Object>) c.get("polygon")).containsEntry("type", "MultiPolygon");
        });

        Map<String, Object> zone = body(send(token, "/api/admin/v1/cities/" + cityId + "/zones",
                Map.of("command_id", UUID.randomUUID(), "type", "AIRPORT", "polygon", square(-169.9, 60.1, 0.1),
                        "priority", 10, "reason", "Airport")));
        send(token, "/api/admin/v1/zones/" + zone.get("id") + "/publish", change(zone, "Airport rules"));
        assertThat((List<Map<String, Object>>) body(read(token, "/api/admin/v1/cities/" + cityId + "/zones"))
                .get("zones")).singleElement().satisfies(z -> assertThat(z).containsEntry("state", "PUBLISHED"));

        MvcResult address = send(token, "/api/admin/v1/addresses", Map.of("command_id", UUID.randomUUID(),
                "reason", "Own address", "data", Map.of("city_id", cityId, "kind", "HOUSE", "label", "Main Street 2A",
                        "language", "en", "street", "Main Street", "house_raw", "2A",
                        "pickup", Map.of("lat", 60.5, "lon", -169.5))));
        assertThat(address.getResponse().getStatus()).isEqualTo(201);
        Map<String, Object> own = body(address);
        Map<String, Object> hidden = body(send(token, "/api/admin/v1/addresses/" + own.get("id") + "/hide",
                change(own, "Closed street")));
        assertThat(hidden).containsEntry("visibility", "HIDDEN");
        assertThat((List<?>) body(read(token, "/api/admin/v1/cities/" + cityId + "/addresses", "text", "main"))
                .get("addresses")).isEmpty();
        assertThat((List<?>) body(read(token, "/api/admin/v1/cities/" + cityId + "/addresses", "text", "main",
                "include_hidden", "true")).get("addresses")).hasSize(1);
        assertThat(body(read(token, "/api/admin/v1/addresses/" + own.get("id")))).containsEntry("visibility", "HIDDEN");
    }

    @Test
    void badBoundariesAndMissingRightsAreRefused() throws Exception {
        String token = token("geo.manage");
        MvcResult bad = send(token, "/api/admin/v1/cities", Map.of("command_id", UUID.randomUUID(), "code", "bad-geo",
                "name", "Bad", "currency", "PLN", "timezone", "UTC", "polygon", Map.of("type", "Point",
                        "coordinates", List.of(1, 2)), "priority", 0, "reason", "x"));
        assertThat(bad.getResponse().getStatus()).isBetween(400, 422);

        String other = token("orders.view");
        assertThat(read(other, "/api/admin/v1/cities").getResponse().getStatus()).isEqualTo(403);
        assertThat(send(other, "/api/admin/v1/cities", Map.of("command_id", UUID.randomUUID(), "code", "no-right",
                "name", "No", "currency", "PLN", "timezone", "UTC", "polygon", square(-160, 60, 1), "priority", 0,
                "reason", "x")).getResponse().getStatus()).isEqualTo(403);
    }
}
