package taxi.blizz.configuration.internal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.configuration.ServiceSettings;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.SubjectType;

/**
 * REQ-API-10: app version and forced update.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class AppVersionTests {

    @Autowired
    WebApplicationContext context;
    @Autowired
    ServiceSettings settings;
    @Autowired
    JdbcClient jdbc;
    @Autowired
    RequestMappingHandlerMapping mappings;

    MockMvc mvc;

    @BeforeEach
    void setUp() {
        mvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    void outdatedRiderQuoteAndOrderAre426() throws Exception {
        setMinimum("RIDER_ANDROID", "2.0.0");
        postReq("/api/rider/v1/quotes", "RIDER_ANDROID", "1.0.0")
                .andExpect(status().is(426)).andExpect(jsonPath("$.minimum_version").value("2.0.0"));
        postReq("/api/rider/v1/orders", "RIDER_ANDROID", "1.0.0")
                .andExpect(status().is(426)).andExpect(jsonPath("$.minimum_version").value("2.0.0"));
    }

    @Test
    void outdatedDriverOnlineAndAcceptAre426() throws Exception {
        setMinimum("DRIVER_ANDROID", "2.0.0");
        postReq("/api/driver/v1/work-sessions", "DRIVER_ANDROID", "1.0.0")
                .andExpect(status().is(426)).andExpect(jsonPath("$.minimum_version").value("2.0.0"));
        postReq("/api/driver/v1/offers/" + UUID.randomUUID() + "/accept", "DRIVER_ANDROID", "1.0.0")
                .andExpect(status().is(426)).andExpect(jsonPath("$.minimum_version").value("2.0.0"));
    }

    @Test
    void allOtherPostPathsAreNotBlockedByVersion() throws Exception {
        setMinimum("RIDER_ANDROID", "9.0.0");
        setMinimum("DRIVER_ANDROID", "9.0.0");
        mappings.getHandlerMethods().forEach((info, method) -> {
            String pattern = info.getPathPatternsCondition() != null
                    ? info.getPathPatternsCondition().getPatterns().iterator().next().getPatternString()
                    : info.getPatternsCondition().getPatterns().iterator().next();
            if (!"POST".equals(info.getMethodsCondition().getMethods().stream().findFirst().map(Enum::name).orElse(""))) {
                return;
            }
            if (!pattern.startsWith("/api/rider/") && !pattern.startsWith("/api/driver/")) {
                return;
            }
            if (isChecked(pattern)) {
                return;
            }
            String path = pattern.replaceAll("\\{[^}]+}", UUID.randomUUID().toString());
            try {
                int status = postReq(path, "RIDER_ANDROID", "1.0.0").andReturn().getResponse().getStatus();
                assertThat(status).as("outdated on " + path).isNotEqualTo(426);
                int bad = postReq(path, "RIDER_ANDROID", "1.2.x").andReturn().getResponse().getStatus();
                assertThat(bad).as("malformed on " + path).isNotEqualTo(400);
            } catch (Exception e) {
                throw new RuntimeException(path, e);
            }
        });
    }

    @Test
    void noHeaderAllowedUnlessRequired() throws Exception {
        setRequireHeader(false);
        postReq("/api/rider/v1/quotes", null, null).andExpect(status().is(401));
        setRequireHeader(true);
        postReq("/api/rider/v1/quotes", null, null).andExpect(status().is(426));
    }

    @Test
    void adminAndOperatorNeverChecked() throws Exception {
        setMinimum("RIDER_ANDROID", "9.0.0");
        postReq("/api/admin/v1/settings", "RIDER_ANDROID", "1.0.0").andExpect(status().is(401));
        postReq("/api/operator/v1/orders", "RIDER_ANDROID", "1.0.0").andExpect(status().is(401));
    }

    @Test
    void versionComparison() throws Exception {
        setMinimum("RIDER_ANDROID", "1.9.3");
        postReq("/api/rider/v1/quotes", "RIDER_ANDROID", "1.10.0").andExpect(status().is(401));
        setMinimum("RIDER_ANDROID", "10.0.0");
        postReq("/api/rider/v1/quotes", "RIDER_ANDROID", "2.0.0").andExpect(status().is(426));
        setMinimum("RIDER_ANDROID", "1.5.0");
        postReq("/api/rider/v1/quotes", "RIDER_ANDROID", "1.5.0").andExpect(status().is(401));
        postReq("/api/rider/v1/quotes", "RIDER_ANDROID", "1.2").andExpect(status().is(400));
        postReq("/api/rider/v1/quotes", "RIDER_ANDROID", "1.2.x").andExpect(status().is(400));
    }

    @Test
    void settingsMinimumAboveLatestRefusedAndAudited() throws Exception {
        Actor admin = staffWithPermission();
        ServiceSettings.Version current = settings.current();
        ServiceSettings.AppVersions bad = new ServiceSettings.AppVersions(
                new ServiceSettings.PlatformVersions("2.0.0", "1.0.0"),
                new ServiceSettings.PlatformVersions("0.0.0", "0.0.0"),
                new ServiceSettings.PlatformVersions("0.0.0", "0.0.0"),
                new ServiceSettings.PlatformVersions("0.0.0", "0.0.0"), false);
        ServiceSettings.Settings s = withAppVersions(current.settings(), bad);
        assertThatThrownBy(() -> settings.change(admin, UUID.randomUUID(), current.version(), s, "bad"))
                .isInstanceOf(taxi.blizz.platform.DomainException.class);
        ServiceSettings.AppVersions good = new ServiceSettings.AppVersions(
                new ServiceSettings.PlatformVersions("1.0.0", "2.0.0"),
                new ServiceSettings.PlatformVersions("0.0.0", "0.0.0"),
                new ServiceSettings.PlatformVersions("0.0.0", "0.0.0"),
                new ServiceSettings.PlatformVersions("0.0.0", "0.0.0"), false);
        settings.change(admin, UUID.randomUUID(), current.version(), withAppVersions(current.settings(), good), "ok");
        assertThat(jdbc.sql("select count(*) from audit_log where action = 'settings.change' and actor_id = :id")
                .param("id", admin.id()).query(Long.class).single()).isGreaterThan(0);
    }

    private static boolean isChecked(String path) {
        return path.equals("/api/rider/v1/quotes") || path.equals("/api/rider/v1/orders")
                || path.equals("/api/driver/v1/work-sessions")
                || path.matches("/api/driver/v1/offers/\\{[^}]+}/accept");
    }

    private ResultActions postReq(String path, String platform, String version) throws Exception {
        var builder = post(path).contentType("application/json").content("{}");
        if (platform != null) builder = builder.header("X-App-Platform", platform);
        if (version != null) builder = builder.header("X-App-Version", version);
        return mvc.perform(builder);
    }

    private void setMinimum(String platform, String version) {
        ServiceSettings.Version current = settings.current();
        ServiceSettings.AppVersions av = orDefault(current.settings().appVersions());
        ServiceSettings.PlatformVersions pv = new ServiceSettings.PlatformVersions(version, version);
        ServiceSettings.AppVersions next = new ServiceSettings.AppVersions(
                platform.equals("RIDER_ANDROID") ? pv : av.riderAndroid(),
                platform.equals("RIDER_IOS") ? pv : av.riderIos(),
                platform.equals("DRIVER_ANDROID") ? pv : av.driverAndroid(),
                platform.equals("DRIVER_IOS") ? pv : av.driverIos(),
                av.requireVersionHeader());
        settings.change(staffWithPermission(), UUID.randomUUID(), current.version(),
                withAppVersions(current.settings(), next), "test");
    }

    private void setRequireHeader(boolean required) {
        ServiceSettings.Version current = settings.current();
        ServiceSettings.AppVersions av = orDefault(current.settings().appVersions());
        ServiceSettings.AppVersions next = new ServiceSettings.AppVersions(
                av.riderAndroid(), av.riderIos(), av.driverAndroid(), av.driverIos(), required);
        settings.change(staffWithPermission(), UUID.randomUUID(), current.version(),
                withAppVersions(current.settings(), next), "test");
    }

    private static ServiceSettings.AppVersions orDefault(ServiceSettings.AppVersions av) {
        return av != null ? av : new ServiceSettings.AppVersions(
                new ServiceSettings.PlatformVersions("0.0.0", "0.0.0"),
                new ServiceSettings.PlatformVersions("0.0.0", "0.0.0"),
                new ServiceSettings.PlatformVersions("0.0.0", "0.0.0"),
                new ServiceSettings.PlatformVersions("0.0.0", "0.0.0"), false);
    }

    private static ServiceSettings.Settings withAppVersions(ServiceSettings.Settings s, ServiceSettings.AppVersions av) {
        return new ServiceSettings.Settings(s.brand(), s.languages(), s.calls(), s.preorders(),
                s.ratings(), s.tips(), s.orders(), av);
    }

    private Actor staffWithPermission() {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                insert into staff_user (id, login, name, role, permissions)
                values (:id, :login, 'test', 'ADMIN', array['settings.manage'])
                """).param("id", id).param("login", "av-" + id).update();
        return new Actor(SubjectType.STAFF, id);
    }
}
