package taxi.blizz.configuration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import jakarta.servlet.Filter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
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
import taxi.blizz.identity.SessionService;
import taxi.blizz.identity.VerifiedSubject;
import taxi.blizz.operations.Dispatch;
import taxi.blizz.operations.OrderView;
import taxi.blizz.operations.Orders;
import taxi.blizz.operations.Trips;
import taxi.blizz.operations.WorkSessions;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.pricing.QuoteService;
import tools.jackson.databind.json.JsonMapper;

/** The safety button's contacts per city (REQ-RID-09): admin commands, defaults, the rider's and driver's reads. */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class SafetyContactsTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, 115.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 115.55);

    @Autowired
    WebApplicationContext context;
    @Autowired
    JdbcClient jdbc;
    @Autowired
    JsonMapper json;
    @Autowired
    SessionService auth;
    @Autowired
    ServiceSettings settings;
    @Autowired
    Orders orders;
    @Autowired
    Dispatch dispatch;
    @Autowired
    Trips trips;
    @Autowired
    WorkSessions sessions;
    @Autowired
    QuoteService quotes;

    MockMvc mvc;
    TestRides rides;

    @BeforeEach
    void setUp() {
        List<Filter> filters = new ArrayList<>(context.getBeansOfType(Filter.class).values());
        AnnotationAwareOrderComparator.sort(filters);
        mvc = MockMvcBuilders.webAppContextSetup(context).addFilters(filters.toArray(Filter[]::new)).build();
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
    }

    // ------------------------------------------------------------ fixtures

    /** A staff member with the permissions for the given cities only. */
    private String staff(String[] permissions, UUID... cities) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, city_scope, state, created_at,
                                                updated_at)
                        values (:id, :login, 'Safety', 'ADMIN', :permissions, :scope, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "safety-" + id).param("permissions", permissions)
                .param("scope", cities).update();
        return auth.openStaff(new VerifiedSubject(new Actor(SubjectType.STAFF, id), "ACTIVE", false),
                ApiAudience.ADMIN, null).accessToken();
    }

    private String manager(UUID city) {
        return staff(new String[]{SafetyContacts.MANAGE_PERMISSION}, city);
    }

    private String token(Actor actor) {
        return auth.open(new VerifiedSubject(actor, "ACTIVE", false), "safety-test").accessToken();
    }

    private MvcResult call(String method, String path, String token, Object body) throws Exception {
        var request = (method.equals("GET") ? get(path) : post(path))
                .header(HttpHeaders.AUTHORIZATION, "Bearer " + token);
        if (body != null) {
            request = request.contentType(MediaType.APPLICATION_JSON).content(json.writeValueAsString(body));
        }
        return mvc.perform(request).andReturn();
    }

    @SuppressWarnings("unchecked")
    private Map<String, Object> body(MvcResult result) throws Exception {
        return json.readValue(result.getResponse().getContentAsString(), Map.class);
    }

    private String defaultLanguage() {
        return settings.current().settings().languages().defaultLanguage();
    }

    /** A supported language other than the service's default. */
    private String otherLanguage() {
        return ServiceSettings.SUPPORTED_LANGUAGES.stream().filter(l -> !l.equals(defaultLanguage())).findFirst()
                .orElseThrow();
    }

    /** A change body; {@code extra} labels: one contact in every language, one only in the default. */
    private Map<String, Object> change(UUID commandId, long expectedVersion, String emergency, String support) {
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("command_id", commandId.toString());
        body.put("expected_version", expectedVersion);
        body.put("emergency_number", emergency);
        body.put("support_phone", support);
        Map<String, String> everyLanguage = new LinkedHashMap<>();
        ServiceSettings.SUPPORTED_LANGUAGES.forEach(l -> everyLanguage.put(l, "Police " + l));
        body.put("extra", List.of(Map.of("label", everyLanguage, "phone", "+48 22 600 00 00"),
                Map.of("label", Map.of(defaultLanguage(), "Hotline"), "phone", "+48800100100")));
        body.put("reason", "Contacts of the city");
        return body;
    }

    private String path(UUID city) {
        return "/api/admin/v1/settings/safety-contacts/" + city;
    }

    private long audits(UUID city) {
        return jdbc.sql("select count(*) from audit_log where action = 'safety_contacts.change' and resource_id = :c")
                .param("c", city.toString()).query(Long.class).single();
    }

    // ------------------------------------------------------------ tests

    @Test
    void aCityNobodyConfiguredGets112AndTheNoAutoDispatchNotice() throws Exception {
        UUID city = UUID.randomUUID();
        MvcResult rider = call("GET", "/api/rider/v1/safety-contacts?city_id=" + city, token(rides.client()), null);
        assertThat(rider.getResponse().getStatus()).isEqualTo(200);
        assertThat(body(rider)).containsEntry("city_id", city.toString()).containsEntry("emergency_number", "112")
                .containsEntry("support_phone", null).containsEntry("extra", List.of())
                .containsEntry("disclaimer_code", "NO_AUTO_DISPATCH");

        MvcResult admin = call("GET", path(city), manager(city), null);
        assertThat(admin.getResponse().getStatus()).isEqualTo(200);
        assertThat(body(admin)).containsEntry("version", 0).containsEntry("emergency_number", "112")
                .containsEntry("changed_by", null);
    }

    @Test
    void aManagerOfTheCityChangesThemOnceAndOthersCannot() throws Exception {
        UUID city = UUID.randomUUID();
        String manager = manager(city);
        UUID command = UUID.randomUUID();

        // Without the permission, or with it for another city only: 403, before anything is stored.
        assertThat(call("POST", path(city), staff(new String[]{"orders.view"}, city),
                change(UUID.randomUUID(), 0, "112", null)).getResponse().getStatus()).isEqualTo(403);
        assertThat(call("POST", path(city), manager(UUID.randomUUID()),
                change(command, 0, "112", null)).getResponse().getStatus()).isEqualTo(403);
        assertThat(call("GET", path(city), manager(UUID.randomUUID()), null).getResponse().getStatus())
                .isEqualTo(403);

        MvcResult first = call("POST", path(city), manager, change(command, 0, "997", "+380 44 123-45-67"));
        assertThat(first.getResponse().getStatus()).isEqualTo(200);
        Map<String, Object> saved = body(first);
        assertThat(saved).containsEntry("version", 1).containsEntry("emergency_number", "997")
                .containsEntry("support_phone", "+380441234567").containsEntry("reason", "Contacts of the city");
        assertThat((List<?>) saved.get("extra")).hasSize(2);
        assertThat(saved.get("extra").toString()).contains("+48226000000");
        assertThat(audits(city)).isEqualTo(1);

        // The same command again: the first result, nothing changed.
        MvcResult repeat = call("POST", path(city), manager, change(command, 0, "997", "+380 44 123-45-67"));
        assertThat(repeat.getResponse().getStatus()).isEqualTo(200);
        assertThat(body(repeat)).containsEntry("version", 1);
        assertThat(audits(city)).isEqualTo(1);

        // The same command_id with another body, and a stale expected_version: 409.
        assertThat(call("POST", path(city), manager, change(command, 0, "112", null)).getResponse().getStatus())
                .isEqualTo(409);
        assertThat(call("POST", path(city), manager, change(UUID.randomUUID(), 0, "112", null))
                .getResponse().getStatus()).isEqualTo(409);
        assertThat(body(call("GET", path(city), manager, null))).containsEntry("version", 1)
                .containsEntry("emergency_number", "997");

        MvcResult second = call("POST", path(city), manager, change(UUID.randomUUID(), 1, "112", null));
        assertThat(body(second)).containsEntry("version", 2).containsEntry("support_phone", null);
        assertThat(audits(city)).isEqualTo(2);
    }

    @Test
    void badContactsAreRefused() throws Exception {
        UUID city = UUID.randomUUID();
        String manager = manager(city);
        assertThat(call("POST", path(city), manager, change(UUID.randomUUID(), 0, "1", null)).getResponse()
                .getStatus()).as("one digit").isEqualTo(400);
        assertThat(call("POST", path(city), manager, change(UUID.randomUUID(), 0, "1234567", null)).getResponse()
                .getStatus()).as("seven digits").isEqualTo(400);
        assertThat(call("POST", path(city), manager, change(UUID.randomUUID(), 0, "11a", null)).getResponse()
                .getStatus()).isEqualTo(400);
        assertThat(call("POST", path(city), manager, change(UUID.randomUUID(), 0, "112", "0441234567"))
                .getResponse().getStatus()).as("not E.164").isEqualTo(400);

        Map<String, Object> tooMany = change(UUID.randomUUID(), 0, "112", null);
        Map<String, Object> one = Map.of("label", Map.of(defaultLanguage(), "Hotline"), "phone", "+48800100100");
        tooMany.put("extra", List.of(one, one, one, one, one, one));
        assertThat(call("POST", path(city), manager, tooMany).getResponse().getStatus()).isEqualTo(400);

        Map<String, Object> noDefaultLabel = change(UUID.randomUUID(), 0, "112", null);
        noDefaultLabel.put("extra", List.of(Map.of("label", Map.of(otherLanguage(), "Hotline"), "phone",
                "+48800100100")));
        assertThat(call("POST", path(city), manager, noDefaultLabel).getResponse().getStatus()).isEqualTo(400);
        assertThat(audits(city)).isZero();
    }

    @Test
    void theRiderGetsTheContactsOfTheActiveOrdersCityAndTheDriverOfTheSessionsCity() throws Exception {
        UUID city = rides.city("test-safety-contacts", "UAH", 115);
        String manager = manager(city);
        assertThat(call("POST", path(city), manager, change(UUID.randomUUID(), 0, "112", "+380441234567"))
                .getResponse().getStatus()).isEqualTo(200);

        // The rider: labels in the rider's language, the default language where the label has no other.
        Actor rider = rides.client();
        String language = otherLanguage();
        jdbc.sql("update client set language = :l where id = :id").param("l", language).param("id", rider.id())
                .update();
        String riderToken = token(rider);
        assertThat(call("GET", "/api/rider/v1/safety-contacts", riderToken, null).getResponse().getStatus())
                .as("no city_id and no active order").isEqualTo(400);

        TestRides.Driver driver = rides.driverNear(PICKUP);
        OrderView order = rides.order(rider, city, PICKUP, DROPOFF);
        Map<String, Object> forRider = body(call("GET", "/api/rider/v1/safety-contacts", riderToken, null));
        assertThat(forRider).containsEntry("city_id", city.toString()).containsEntry("emergency_number", "112")
                .containsEntry("support_phone", "+380441234567").containsEntry("disclaimer_code", "NO_AUTO_DISPATCH");
        assertThat(forRider.get("extra")).isEqualTo(List.of(
                Map.of("label", "Police " + language, "phone", "+48226000000"),
                Map.of("label", "Hotline", "phone", "+48800100100")));

        // The driver: the city of the open session.
        String driverToken = token(driver.actor());
        Map<String, Object> forDriver = body(call("GET", "/api/driver/v1/safety-contacts", driverToken, null));
        assertThat(forDriver).containsEntry("city_id", city.toString())
                .containsEntry("support_phone", "+380441234567");

        orders.cancel(rider, UUID.randomUUID(), order.id(), orders.get(order.id()).version(), "CHANGED_MIND");
        var availability = sessions.availability(driver.actor().id());
        sessions.close(driver.actor(), UUID.randomUUID(), driver.device(), availability.sessionVersion());
        MvcResult offline = call("GET", "/api/driver/v1/safety-contacts", driverToken, null);
        assertThat(offline.getResponse().getStatus()).as("no open session").isEqualTo(409);
        assertThat(body(offline)).containsEntry("code", "STATE_CONFLICT");
    }
}
