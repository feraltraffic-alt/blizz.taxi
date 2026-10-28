package taxi.blizz.configuration.internal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.configuration.ServiceSettings;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.SubjectType;

@SpringBootTest
@Import(TestcontainersConfiguration.class)
class AppVersionTests {

    @Autowired
    WebApplicationContext context;
    @Autowired
    ServiceSettings settings;
    @Autowired
    StaffAccess staff;
    @Autowired
    JdbcClient jdbc;

    MockMvc mvc;

    @BeforeEach
    void setUp() {
        mvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    void outdatedRiderQuoteIsRefused() throws Exception {
        Actor admin = staffWithPermission();
        setMinimum("RIDER_ANDROID", "2.0.0");
        mvc.perform(post("/api/rider/v1/quotes")
                        .header("X-App-Platform", "RIDER_ANDROID")
                        .header("X-App-Version", "1.0.0")
                        .contentType("application/json")
                        .content("{}"))
                .andExpect(status().is(426));
    }

    @Test
    void currentRiderQuoteIsNotRefusedForVersion() throws Exception {
        setMinimum("RIDER_ANDROID", "1.0.0");
        mvc.perform(post("/api/rider/v1/quotes")
                        .header("X-App-Platform", "RIDER_ANDROID")
                        .header("X-App-Version", "1.5.0")
                        .contentType("application/json")
                        .content("{}"))
                .andExpect(status().is(401)); // auth fails, not version
    }

    @Test
    void malformedVersionOnCheckedEndpointIs400() throws Exception {
        mvc.perform(post("/api/rider/v1/quotes")
                        .header("X-App-Platform", "RIDER_ANDROID")
                        .header("X-App-Version", "1.2")
                        .contentType("application/json")
                        .content("{}"))
                .andExpect(status().is(400));
    }

    @Test
    void malformedVersionOnOtherEndpointIsNot400() throws Exception {
        mvc.perform(post("/api/driver/v1/work-sessions/00000000-0000-0000-0000-000000000001/heartbeat")
                        .header("X-App-Platform", "DRIVER_ANDROID")
                        .header("X-App-Version", "1.2.x")
                        .contentType("application/json")
                        .content("{}"))
                .andExpect(status().is(401)); // auth, not version
    }

    private void setMinimum(String platform, String version) {
        ServiceSettings.Version current = settings.current();
        ServiceSettings.AppVersions av = current.settings().appVersions();
        ServiceSettings.PlatformVersions pv = new ServiceSettings.PlatformVersions(version, version);
        ServiceSettings.AppVersions next = new ServiceSettings.AppVersions(
                platform.equals("RIDER_ANDROID") ? pv : av.riderAndroid(),
                platform.equals("RIDER_IOS") ? pv : av.riderIos(),
                platform.equals("DRIVER_ANDROID") ? pv : av.driverAndroid(),
                platform.equals("DRIVER_IOS") ? pv : av.driverIos(),
                false);
        ServiceSettings.Settings s = new ServiceSettings.Settings(
                current.settings().brand(), current.settings().languages(), current.settings().calls(),
                current.settings().preorders(), current.settings().ratings(), current.settings().tips(),
                current.settings().orders(), next);
        settings.change(staffWithPermission(), UUID.randomUUID(), current.version(), s, "test");
    }

    private Actor staffWithPermission() {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                insert into staff_user (id, login, password_hash, display_name, permissions)
                values (:id, :login, 'x', 'test', array['settings.manage'])
                """).param("id", id).param("login", "av-" + id).update();
        return new Actor(SubjectType.STAFF, id);
    }
}
