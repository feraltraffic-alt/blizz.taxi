package taxi.blizz.identity;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import jakarta.servlet.Filter;
import java.util.ArrayList;
import java.util.HashMap;
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
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import taxi.blizz.TestPhones;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.SubjectType;
import tools.jackson.databind.json.JsonMapper;

/**
 * ADR 0016, issue #214: the platform owner creates taxi services with their first super admin, suspends and resumes
 * them, and reaches nothing inside a service; nobody else manages services.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class PlatformOwnerTests {

    static final String OWNER_PASSWORD = "platform-owner-secret-1";

    @Autowired JdbcClient jdbc;
    @Autowired SessionService sessions;
    @Autowired StaffSignIn signIn;
    @Autowired JsonMapper json;
    @Autowired WebApplicationContext context;

    MockMvc mvc;
    String owner;

    @BeforeEach
    void setUp() {
        List<Filter> filters = new ArrayList<>(context.getBeansOfType(Filter.class).values());
        AnnotationAwareOrderComparator.sort(filters);
        mvc = MockMvcBuilders.webAppContextSetup(context).addFilters(filters.toArray(Filter[]::new)).build();
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, first_name, last_name, name, role, state, password_hash,
                                                all_cities, service_id, created_at, updated_at)
                        values (:id, :login, 'Platform', 'Owner', 'Platform Owner', 'PLATFORM_OWNER', 'ACTIVE', :hash,
                                false, null, now(), now())""")
                .param("id", id).param("login", "owner-" + id.toString().substring(0, 8))
                .param("hash", new BCryptPasswordEncoder(4).encode(OWNER_PASSWORD)).update();
        owner = token(new Actor(SubjectType.STAFF, id));
    }

    private String token(Actor staff) {
        return sessions.openStaff(new VerifiedSubject(staff, "ACTIVE", false), ApiAudience.ADMIN, null).accessToken();
    }

    private MvcResult post(String path, String token, Map<String, Object> body) throws Exception {
        return mvc.perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post(path)
                .contentType(MediaType.APPLICATION_JSON).content(json.writeValueAsString(body))
                .header(HttpHeaders.AUTHORIZATION, "Bearer " + token)).andReturn();
    }

    private int status(String path, String token) throws Exception {
        return mvc.perform(get(path).header(HttpHeaders.AUTHORIZATION, "Bearer " + token)).andReturn()
                .getResponse().getStatus();
    }

    @SuppressWarnings("unchecked")
    private Map<String, Object> body(MvcResult result) throws Exception {
        return json.readValue(result.getResponse().getContentAsString(), Map.class);
    }

    private Map<String, Object> creation(String code, String login, String password) {
        Map<String, Object> body = new HashMap<>(Map.of("command_id", UUID.randomUUID(), "code", code,
                "name", "Taxi " + code, "reason", "A new brand",
                "super_admin", Map.of("login", login, "initial_password", "first-super-admin-1",
                        "first_name", "Iryna", "last_name", "Koval")));
        if (password != null) {
            body.put("password", password);
        }
        return body;
    }

    @Test
    void theOwnerCreatesAServiceWithItsFirstSuperAdminOnlyWithTheirOwnPassword() throws Exception {
        String code = "owner-" + UUID.randomUUID().toString().substring(0, 8);
        String login = "first-" + code;
        assertThat(post("/api/admin/v1/services", owner, creation(code, login, null)).getResponse().getStatus())
                .as("no password").isEqualTo(403);
        assertThat(post("/api/admin/v1/services", owner, creation(code, login, "not-the-password"))
                .getResponse().getStatus()).as("a wrong password").isEqualTo(403);
        assertThat(jdbc.sql("select count(*) from service where code = :c").param("c", code).query(Long.class)
                .single()).isZero();

        MvcResult created = post("/api/admin/v1/services", owner, creation(code, login, OWNER_PASSWORD));
        assertThat(created.getResponse().getStatus()).isEqualTo(201);
        UUID service = UUID.fromString((String) body(created).get("id"));
        assertThat(jdbc.sql("select service_id from staff_user where login = :l").param("l", login)
                .query(UUID.class).single()).isEqualTo(service);
        assertThat(signIn.signIn(login, "first-super-admin-1", ApiAudience.ADMIN, null, null)
                .passwordChangeRequired()).as("the first super admin signs in and changes the password").isTrue();
        assertThat(post("/api/admin/v1/services", owner, creation(code, login + "-2", OWNER_PASSWORD))
                .getResponse().getStatus()).as("a taken code").isEqualTo(409);
    }

    @Test
    void theOwnerReachesNothingInsideAServiceAndNobodyElseManagesServices() throws Exception {
        for (String path : List.of("/api/admin/v1/staff", "/api/admin/v1/orders", "/api/admin/v1/cities")) {
            assertThat(status(path, owner)).as(path).isEqualTo(403);
        }
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, all_cities, state, created_at,
                                                updated_at)
                        values (:id, :login, 'Boss', 'SUPER_ADMIN', '{}', true, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "boss-" + id).update();
        String superAdmin = token(new Actor(SubjectType.STAFF, id));
        assertThat(status("/api/admin/v1/services", superAdmin)).isEqualTo(403);
        assertThat(status("/api/admin/v1/services", owner)).isEqualTo(200);
    }

    @Test
    void suspendingAServiceSignsItsPeopleOutAndResumingLetsThemBackIn() throws Exception {
        String code = "pause-" + UUID.randomUUID().toString().substring(0, 8);
        Map<String, Object> service = body(post("/api/admin/v1/services", owner,
                creation(code, "first-" + code, OWNER_PASSWORD)));
        UUID serviceId = UUID.fromString((String) service.get("id"));
        UUID rider = UUID.randomUUID();
        jdbc.sql("""
                        insert into client (id, phone_normalized, account_state, has_app, service_id, created_at,
                                            updated_at)
                        values (:id, :phone, 'ACTIVE', true, :service, now(), now())""")
                .param("id", rider).param("phone", TestPhones.unique("+48", 9)).param("service", serviceId).update();
        String riderToken = sessions.open(new VerifiedSubject(new Actor(SubjectType.CLIENT, rider), "ACTIVE", false),
                "phone").accessToken();
        assertThat(status("/api/rider/v1/me", riderToken)).isEqualTo(200);

        MvcResult suspended = post("/api/admin/v1/services/" + serviceId + "/suspend", owner,
                Map.of("command_id", UUID.randomUUID(), "expected_version", service.get("version"),
                        "reason", "Unpaid"));
        assertThat(suspended.getResponse().getStatus()).isEqualTo(200);
        assertThat(status("/api/rider/v1/me", riderToken)).as("signed out at once").isEqualTo(401);
        MvcResult resumed = post("/api/admin/v1/services/" + serviceId + "/resume", owner,
                Map.of("command_id", UUID.randomUUID(), "expected_version", body(suspended).get("version"),
                        "reason", "Paid"));
        assertThat(resumed.getResponse().getStatus()).isEqualTo(200);
        assertThat(body(resumed)).containsEntry("state", "ACTIVE");
    }
}
