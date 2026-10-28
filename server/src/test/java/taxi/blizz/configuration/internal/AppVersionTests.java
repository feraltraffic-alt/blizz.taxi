package taxi.blizz.configuration.internal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.configuration.ServiceSettings;
import taxi.blizz.configuration.ServiceSettings.AppVersions;
import taxi.blizz.configuration.ServiceSettings.PlatformVersions;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.SessionService;
import taxi.blizz.identity.VerifiedSubject;
import taxi.blizz.operations.Dispatch;
import taxi.blizz.operations.Orders;
import taxi.blizz.operations.Trips;
import taxi.blizz.operations.WorkSessions;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.pricing.QuoteService;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.json.JsonMapper;

/** App version and forced update (REQ-API-10, issue #93), through HTTP with signed-in apps. */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class AppVersionTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, 77.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 77.45);
    static final PlatformVersions NONE = new PlatformVersions("0.0.0", "0.0.0");

    @Autowired
    WebApplicationContext context;
    @Autowired
    ServiceSettings settings;
    @Autowired
    RequestMappingHandlerMapping mappings;
    @Autowired
    SessionService auth;
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
    @Autowired
    JdbcClient jdbc;
    @Autowired
    JsonMapper json;

    MockMvc mvc;
    TestRides rides;
    UUID cityId;
    ServiceSettings.Settings saved;
    Actor admin;

    @BeforeEach
    void setUp() {
        mvc = MockMvcBuilders.webAppContextSetup(context).build();
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        cityId = rides.city("test-app-version", "UAH", 77);
        new taxi.blizz.TestQuotes(jdbc, quotes).ensureClass(cityId, "STANDARD");
        admin = staff("settings.manage");
        saved = settings.current().settings();
    }

    /** The settings are shared by every test class: put them back, whatever happened. */
    @AfterEach
    void restore() {
        policy(saved.appVersions());
    }

    private Actor staff(String... permissions) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, all_cities, state, created_at, updated_at)
                        values (:id, :login, 'Admin', 'ADMIN', :permissions, true, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "app-version-" + id).param("permissions", permissions).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private ServiceSettings.Version policy(AppVersions versions) {
        ServiceSettings.Version now = settings.current();
        ServiceSettings.Settings s = now.settings();
        return settings.change(admin, UUID.randomUUID(), now.version(), new ServiceSettings.Settings(s.brand(),
                s.languages(), s.calls(), s.preorders(), s.ratings(), s.tips(), s.orders(), s.cashNotReceived(),
                versions), "App version test");
    }

    private void minimum(String riderAndDriver, boolean required) {
        PlatformVersions p = new PlatformVersions(riderAndDriver, riderAndDriver);
        policy(new AppVersions(p, p, p, p, required));
    }

    private String token(Actor actor) {
        return auth.open(new VerifiedSubject(actor, "ACTIVE", false), "phone").accessToken();
    }

    private static MockHttpServletRequestBuilder app(MockHttpServletRequestBuilder request, String token,
                                                     String platform, String version) {
        request.header("Authorization", "Bearer " + token).contentType("application/json");
        if (platform != null) {
            request.header(AppVersionInterceptor.PLATFORM, platform);
        }
        if (version != null) {
            request.header(AppVersionInterceptor.VERSION_HEADER, version);
        }
        return request;
    }

    private ResultActions postAs(String token, String path, String platform, String version, String body)
            throws Exception {
        return mvc.perform(app(post(path), token, platform, version).content(body));
    }

    private JsonNode read(ResultActions result) throws Exception {
        return json.readTree(result.andReturn().getResponse().getContentAsString());
    }

    private String quoteBody() {
        return """
                {"command_id":"%s","vehicle_class":"STANDARD","pickup":{"lat":%s,"lon":%s},"dropoff":{"lat":%s,"lon":%s}}"""
                .formatted(UUID.randomUUID(), PICKUP.lat(), PICKUP.lon(), DROPOFF.lat(), DROPOFF.lon());
    }

    // ------------------------------------------------------------------------------------------------- blocked

    @Test
    void anOutdatedRiderIsRefusedAQuoteAndAnOrderAndACurrentOneIsNot() throws Exception {
        minimum("2.0.0", false);
        String rider = token(rides.client());
        for (String path : List.of("/api/rider/v1/quotes", "/api/rider/v1/orders")) {
            postAs(rider, path, "RIDER_ANDROID", "1.9.9", quoteBody()).andExpect(status().is(426))
                    .andExpect(jsonPath("$.code").value("UPGRADE_REQUIRED"))
                    .andExpect(jsonPath("$.minimum_version").value("2.0.0"));
            postAs(rider, path, "RIDER_IOS", "1.0.0", quoteBody()).andExpect(status().is(426));
        }
        postAs(rider, "/api/rider/v1/quotes", "RIDER_ANDROID", "2.0.0", quoteBody()).andExpect(status().isCreated());
    }

    @Test
    void anOutdatedDriverIsRefusedGoingOnlineAndAcceptingAnOffer() throws Exception {
        minimum("2.0.0", false);
        String driver = token(new Actor(SubjectType.DRIVER, UUID.randomUUID()));
        String online = """
                {"command_id":"%s","vehicle_id":"%s","location":{"lat":-39.5,"lon":77.5,"accuracy_m":5,
                 "recorded_at":"%s","sequence":1}}""".formatted(UUID.randomUUID(), UUID.randomUUID(),
                OffsetDateTime.now());
        postAs(driver, "/api/driver/v1/work-sessions", "DRIVER_ANDROID", "1.0.0", online)
                .andExpect(status().is(426)).andExpect(jsonPath("$.minimum_version").value("2.0.0"));
        postAs(driver, "/api/driver/v1/offers/" + UUID.randomUUID() + "/accept", "DRIVER_IOS", "1.0.0",
                "{\"command_id\":\"" + UUID.randomUUID() + "\"}")
                .andExpect(status().is(426)).andExpect(jsonPath("$.minimum_version").value("2.0.0"));
    }

    // ------------------------------------------------------------------------------------ never stranded

    /** The minimum is raised in the middle of a trip: the outdated driver still finishes it. */
    @Test
    void anOutdatedDriverFinishesATripAlreadyUnderWay() throws Exception {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        TestRides.Ride ride = rides.assigned(cityId, driver, PICKUP, DROPOFF);
        rides.moveTo(driver, TestRides.north(PICKUP, 30));
        minimum("9.0.0", true);
        String token = token(driver.actor());
        String old = "1.0.0";
        String trip = "/api/driver/v1/trips/" + ride.trip().id();

        JsonNode arrived = read(postAs(token, trip + "/arrive", "DRIVER_ANDROID", old,
                "{\"command_id\":\"%s\",\"expected_version\":%d}".formatted(UUID.randomUUID(), ride.trip().version()))
                .andExpect(status().isOk()));
        JsonNode started = read(postAs(token, trip + "/start", "DRIVER_ANDROID", old,
                "{\"command_id\":\"%s\",\"expected_version\":%d}".formatted(UUID.randomUUID(),
                        arrived.get("version").asLong())).andExpect(status().isOk()));
        postAs(token, "/api/driver/v1/location-batches", "DRIVER_ANDROID", old, """
                {"command_id":"%s","points":[{"sequence":7,"lat":-39.49,"lon":77.5,"accuracy_m":5,
                 "recorded_at":"%s"}]}""".formatted(UUID.randomUUID(), OffsetDateTime.now()))
                .andExpect(result -> assertThat(result.getResponse().getStatus()).isLessThan(300));
        postAs(token, trip + "/complete", "DRIVER_ANDROID", old,
                "{\"command_id\":\"%s\",\"expected_version\":%d,\"reported_at\":\"%s\",\"cash_received\":true}"
                        .formatted(UUID.randomUUID(), started.get("version").asLong(), OffsetDateTime.now()))
                .andExpect(status().isOk());
        mvc.perform(app(get("/api/driver/v1/trips/current"), token, "DRIVER_ANDROID", old))
                .andExpect(result -> assertThat(result.getResponse().getStatus()).isNotEqualTo(426));
    }

    /**
     * Every rider and driver POST except the four, with an outdated and with a malformed version, signed in as that
     * app: none is refused because of the version. The list comes from the application's own mappings, so a new
     * endpoint cannot slip past.
     */
    @Test
    void noOtherRiderOrDriverActionLooksAtTheVersion() throws Exception {
        minimum("9.0.0", true);
        String rider = token(rides.client());
        String driver = token(new Actor(SubjectType.DRIVER, UUID.randomUUID()));
        List<String> checkedPaths = new ArrayList<>();
        List<String> seen = new ArrayList<>();
        for (var entry : mappings.getHandlerMethods().entrySet()) {
            var info = entry.getKey();
            if (!info.getMethodsCondition().getMethods().contains(RequestMethod.POST)) {
                continue;
            }
            for (String pattern : info.getPatternValues()) {
                boolean riderPath = pattern.startsWith("/api/rider/");
                if (!riderPath && !pattern.startsWith("/api/driver/")) {
                    continue;
                }
                String path = pattern.replaceAll("\\{[^}]+}", UUID.randomUUID().toString());
                boolean blocked = pattern.equals("/api/rider/v1/quotes") || pattern.equals("/api/rider/v1/orders")
                        || pattern.equals("/api/driver/v1/work-sessions")
                        || pattern.matches("/api/driver/v1/offers/\\{[^}]+}/accept");
                String token = riderPath ? rider : driver;
                String platform = riderPath ? "RIDER_ANDROID" : "DRIVER_ANDROID";
                for (String version : new String[] {"1.0.0", "1.2.x", null}) {
                    MockHttpServletResponse response = postAs(token, path, platform, version, "{}").andReturn()
                            .getResponse();
                    String body = response.getContentAsString();
                    if (blocked) {
                        assertThat(response.getStatus()).as(pattern + " with " + version)
                                .isEqualTo("1.2.x".equals(version) ? 400 : 426);
                    } else {
                        assertThat(response.getStatus()).as(pattern + " with " + version).isNotEqualTo(426);
                        assertThat(body).as(pattern + " with " + version).doesNotContain("X-App-");
                    }
                }
                (blocked ? checkedPaths : seen).add(pattern);
            }
        }
        assertThat(checkedPaths).hasSize(4);
        assertThat(seen).as("the sweep found the other actions").hasSizeGreaterThan(40)
                .contains("/api/driver/v1/trips/{tripId}/complete", "/api/driver/v1/work-sessions/{id}/heartbeat",
                        "/api/driver/v1/location-batches");
    }

    // ----------------------------------------------------------------------------------- headers and policy

    @Test
    void aMissingHeaderPassesUntilStaffRequireItAndStaffAppsAreNeverChecked() throws Exception {
        String rider = token(rides.client());
        minimum("2.0.0", false);
        postAs(rider, "/api/rider/v1/quotes", null, null, quoteBody()).andExpect(status().isCreated());
        minimum("2.0.0", true);
        postAs(rider, "/api/rider/v1/quotes", null, null, quoteBody()).andExpect(status().is(426))
                .andExpect(jsonPath("$.minimum_version").value("2.0.0"));
        postAs(rider, "/api/rider/v1/quotes", "RIDER_ANDROID", null, quoteBody()).andExpect(status().is(426));

        String operator = auth.openStaff(new VerifiedSubject(staff("orders.create"), "ACTIVE", false),
                taxi.blizz.identity.ApiAudience.OPERATOR, null).accessToken();
        mvc.perform(app(post("/api/operator/v1/quotes"), operator, "RIDER_ANDROID", "1.0.0").content(quoteBody()))
                .andExpect(result -> assertThat(result.getResponse().getStatus()).isNotEqualTo(426));
        String adminToken = auth.openStaff(new VerifiedSubject(admin, "ACTIVE", false),
                taxi.blizz.identity.ApiAudience.ADMIN, null).accessToken();
        mvc.perform(app(get("/api/admin/v1/settings"), adminToken, "RIDER_ANDROID", "1.0.0"))
                .andExpect(status().isOk());
    }

    @Test
    void versionsCompareNumberByNumberAndAMalformedOneIsRefusedOnlyWhereChecked() throws Exception {
        assertThat(JdbcServiceSettings.compareVersions("1.10.0", "1.9.3")).isPositive();
        assertThat(JdbcServiceSettings.compareVersions("2.0.0", "10.0.0")).isNegative();
        assertThat(JdbcServiceSettings.compareVersions("3.4.5", "3.4.5")).isZero();

        String rider = token(rides.client());
        minimum("1.9.3", false);
        postAs(rider, "/api/rider/v1/quotes", "RIDER_ANDROID", "1.10.0", quoteBody()).andExpect(status().isCreated());
        postAs(rider, "/api/rider/v1/quotes", "RIDER_ANDROID", "1.9.3", quoteBody()).andExpect(status().isCreated());
        minimum("10.0.0", false);
        postAs(rider, "/api/rider/v1/quotes", "RIDER_ANDROID", "2.0.0", quoteBody()).andExpect(status().is(426));
        for (String bad : List.of("1.2", "1.2.x", "1.2.3.4", "9999999.0.0")) {
            postAs(rider, "/api/rider/v1/quotes", "RIDER_ANDROID", bad, quoteBody()).andExpect(status().isBadRequest());
        }
        postAs(rider, "/api/rider/v1/quotes", "DRIVER_ANDROID", "99.0.0", quoteBody())
                .andExpect(status().isBadRequest()); // the driver app's platform on a rider action
    }

    @Test
    void theAppsSeeThePolicyAndStaffCannotSetAMinimumAboveTheLatest() throws Exception {
        policy(new AppVersions(new PlatformVersions("1.2.0", "1.4.0"), NONE, NONE, NONE, false));
        mvc.perform(get("/api/config/v1/bootstrap")).andExpect(status().isOk())
                .andExpect(jsonPath("$.app_versions.rider_android.minimum_version").value("1.2.0"))
                .andExpect(jsonPath("$.app_versions.rider_android.latest_version").value("1.4.0"))
                .andExpect(jsonPath("$.app_versions.driver_ios.minimum_version").value("0.0.0"));

        for (PlatformVersions bad : List.of(new PlatformVersions("2.0.0", "1.0.0"),
                new PlatformVersions("1.0", "1.0.0"), new PlatformVersions(null, "1.0.0"))) {
            assertThatThrownBy(() -> policy(new AppVersions(NONE, NONE, bad, NONE, false)))
                    .isInstanceOf(DomainException.class)
                    .extracting(e -> ((DomainException) e).code()).isEqualTo(ErrorCode.VALIDATION_FAILED);
        }
        // Two admins at once from the same version: one wins, the other gets a conflict, never a 500.
        ServiceSettings.Version now = settings.current();
        ServiceSettings.Settings s = now.settings();
        settings.change(admin, UUID.randomUUID(), now.version(), s, "First");
        assertThatThrownBy(() -> settings.change(admin, UUID.randomUUID(), now.version(), s, "Second"))
                .isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(ErrorCode.VERSION_CONFLICT);
        assertThat(jdbc.sql("select count(*) from audit_log where action = 'settings.change' and actor_id = :id")
                .param("id", admin.id()).query(Long.class).single()).isGreaterThanOrEqualTo(2);
    }
}
