package taxi.blizz.identity;

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
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.support.TransactionTemplate;
import org.springframework.web.context.WebApplicationContext;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.identity.StaffDirectory.Contacts;
import taxi.blizz.identity.StaffDirectory.Profile;
import taxi.blizz.identity.StaffDirectory.Role;
import taxi.blizz.identity.StaffDirectory.StaffMember;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;
import tools.jackson.databind.json.JsonMapper;

/** Staff sign in by login and password, roles and ticked functions (owner decision 27.10.2026). */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class StaffSignInTests {

    static final String SUPER_PASSWORD = "super-admin-secret-1";

    @Autowired
    StaffDirectory directory;
    @Autowired
    StaffSignIn signIn;
    @Autowired
    StaffAccess access;
    @Autowired
    SessionService sessions;
    @Autowired
    JdbcClient jdbc;
    @Autowired
    TransactionTemplate tx;
    @Autowired
    WebApplicationContext context;
    @Autowired
    JsonMapper json;

    MockMvc mvc;
    Actor superAdmin;
    String superLogin;
    UUID cityA;
    UUID cityB;

    @BeforeEach
    void setUp() {
        List<Filter> filters = new ArrayList<>(context.getBeansOfType(Filter.class).values());
        AnnotationAwareOrderComparator.sort(filters);
        mvc = MockMvcBuilders.webAppContextSetup(context).addFilters(filters.toArray(Filter[]::new)).build();
        UUID id = UUID.randomUUID();
        superLogin = "root-" + id.toString().substring(0, 8);
        jdbc.sql("""
                        insert into staff_user (id, login, first_name, last_name, name, role, state, password_hash,
                                                all_cities, created_at, updated_at)
                        values (:id, :login, 'Root', 'Admin', 'Root Admin', 'SUPER_ADMIN', 'ACTIVE', :hash, true,
                                now(), now())""")
                .param("id", id).param("login", superLogin)
                .param("hash", new BCryptPasswordEncoder(4).encode(SUPER_PASSWORD)).update();
        superAdmin = new Actor(SubjectType.STAFF, id);
        cityA = city();
        cityB = city();
    }

    private UUID city() {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into city (id, code, name, currency, timezone, polygon, priority, state, created_at,
                                          updated_at)
                        values (:id, :code, 'Staff city', 'UAH', 'UTC',
                                ST_GeomFromEWKT('SRID=4326;MULTIPOLYGON(((170 -80,171 -80,171 -79,170 -79,170 -80)))'),
                                0, 'DRAFT', now(), now())""")
                .param("id", id).param("code", "staff-" + id).update();
        return id;
    }

    private Profile operatorProfile(String... permissions) {
        return new Profile("Olena", "Shevchenko", new Contacts(null, "olena@example.invalid", "@olena_ops"),
                Role.OPERATOR, List.of(permissions), false, List.of(cityA));
    }

    private StaffMember operator(String login, String password, String... permissions) {
        return directory.create(superAdmin, UUID.randomUUID(), login, password, operatorProfile(permissions),
                "New operator");
    }

    private static void assertCode(ThrowingCallable call, ErrorCode code) {
        assertThatThrownBy(call).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }

    private MvcResult postJson(String path, String token, Object body) throws Exception {
        var request = post(path).contentType(MediaType.APPLICATION_JSON).content(json.writeValueAsString(body));
        if (token != null) {
            request.header(HttpHeaders.AUTHORIZATION, "Bearer " + token);
        }
        return mvc.perform(request).andReturn();
    }

    @SuppressWarnings("unchecked")
    private Map<String, Object> body(MvcResult result) throws Exception {
        return json.readValue(result.getResponse().getContentAsString(), Map.class);
    }

    private String uniqueLogin(String prefix) {
        return prefix + "-" + UUID.randomUUID().toString().substring(0, 8);
    }

    // ------------------------------------------------------------ the whole path over HTTP

    @Test
    @SuppressWarnings("unchecked")
    void superAdminAddsAnOperatorWhoSignsInChangesThePasswordAndGetsOnlyTheTickedFunctions() throws Exception {
        MvcResult root = postJson("/auth/v1/staff/sign-in", null,
                Map.of("login", superLogin.toUpperCase(), "password", SUPER_PASSWORD, "audience", "ADMIN"));
        assertThat(root.getResponse().getStatus()).isEqualTo(200);
        String rootToken = (String) body(root).get("access_token");
        MvcResult me = mvc.perform(get("/api/admin/v1/me").header(HttpHeaders.AUTHORIZATION, "Bearer " + rootToken))
                .andReturn();
        assertThat((List<String>) body(me).get("effective_permissions"))
                .containsExactlyInAnyOrderElementsOf(StaffPermissions.CODES);

        String login = uniqueLogin("olena");
        MvcResult created = postJson("/api/admin/v1/staff", rootToken, Map.of("command_id", UUID.randomUUID(),
                "login", login, "initial_password", "first-password-123", "reason", "New operator",
                "profile", Map.of("first_name", "Olena", "last_name", "Shevchenko",
                        "contacts", Map.of("phone", "+48 512 345 678", "telegram", "olena_ops"),
                        "role", "OPERATOR", "permissions", List.of("orders.create", "orders.view"),
                        "all_cities", false, "city_ids", List.of(cityA))));
        assertThat(created.getResponse().getStatus()).isEqualTo(201);
        Map<String, Object> member = body(created);
        assertThat(member).containsEntry("password_change_required", true);
        assertThat((Map<String, Object>) ((Map<String, Object>) member.get("profile")).get("contacts"))
                .containsEntry("phone", "+48512345678").containsEntry("telegram", "@olena_ops");
        Actor operator = new Actor(SubjectType.STAFF, UUID.fromString((String) member.get("id")));

        MvcResult first = postJson("/auth/v1/staff/sign-in", null,
                Map.of("login", login, "password", "first-password-123", "audience", "OPERATOR"));
        assertThat(body(first)).containsEntry("password_change_required", true).containsEntry("audience", "operator");
        String token = (String) body(first).get("access_token");
        assertCode(() -> access.require(operator, "orders.create", cityA), ErrorCode.ACCESS_DENIED);

        assertThat(postJson("/api/operator/v1/me/password", token, Map.of("current_password", "wrong-password-1",
                "new_password", "second-password-456")).getResponse().getStatus()).isEqualTo(401);
        assertThat(postJson("/api/operator/v1/me/password", token, Map.of("current_password", "first-password-123",
                "new_password", "second-password-456")).getResponse().getStatus()).isEqualTo(204);

        access.require(operator, "orders.create", cityA);
        assertCode(() -> access.require(operator, "orders.create", cityB), ErrorCode.ACCESS_DENIED);
        assertCode(() -> access.require(operator, "orders.cancel", cityA), ErrorCode.ACCESS_DENIED);
        assertThat(mvc.perform(get("/api/admin/v1/me").header(HttpHeaders.AUTHORIZATION, "Bearer " + token))
                .andReturn().getResponse().getStatus()).as("operator token on the admin API").isEqualTo(401);

        MvcResult asAdmin = postJson("/auth/v1/staff/sign-in", null,
                Map.of("login", login, "password", "second-password-456", "audience", "ADMIN"));
        String adminToken = (String) body(asAdmin).get("access_token");
        assertThat(mvc.perform(get("/api/admin/v1/staff").header(HttpHeaders.AUTHORIZATION, "Bearer " + adminToken))
                .andReturn().getResponse().getStatus()).as("only a super admin manages staff").isEqualTo(403);
    }

    // ------------------------------------------------------------ sign in

    @Test
    void wrongLoginAndWrongPasswordLookTheSameAndTooManyLockTheAccount() {
        String login = uniqueLogin("lock");
        operator(login, "lock-password-123");
        assertCode(() -> signIn.signIn("nobody-" + login, "whatever-123", ApiAudience.ADMIN, null, null),
                ErrorCode.UNAUTHENTICATED);
        for (int i = 0; i < 4; i++) {
            assertCode(() -> signIn.signIn(login, "wrong-password-0", ApiAudience.ADMIN, null, null), ErrorCode.UNAUTHENTICATED);
        }
        assertCode(() -> signIn.signIn(login, "wrong-password-0", ApiAudience.ADMIN, null, null), ErrorCode.RATE_LIMITED);
        assertCode(() -> signIn.signIn(login, "lock-password-123", ApiAudience.ADMIN, null, null), ErrorCode.RATE_LIMITED);
        assertThat(jdbc.sql("select count(*) from staff_sign_in where login = :login and outcome = 'LOCKED'")
                .param("login", login).query(Long.class).single()).isEqualTo(2);
        assertCode(() -> signIn.signIn(login, "lock-password-123", ApiAudience.RIDER, null, null), ErrorCode.VALIDATION_FAILED);
    }

    @Test
    void suspendingSignsOutAndBlocksSignInAndResetUnlocks() {
        String login = uniqueLogin("susp");
        StaffMember member = operator(login, "susp-password-123", "orders.view");
        StaffSignIn.Result session = signIn.signIn(login, "susp-password-123", ApiAudience.OPERATOR, null, null);
        // An active member's session goes on: the refresh works (review of 28.10.2026).
        var refreshed = sessions.refresh(session.session().refreshToken());
        assertThat(refreshed.accessToken()).isNotBlank();

        StaffMember suspended = directory.suspend(superAdmin, UUID.randomUUID(), member.id(), member.version(), "Left");
        assertThat(suspended.state()).isEqualTo("SUSPENDED");
        assertCode(() -> sessions.refresh(refreshed.refreshToken()), ErrorCode.UNAUTHENTICATED);
        assertCode(() -> signIn.signIn(login, "susp-password-123", ApiAudience.OPERATOR, null, null), ErrorCode.ACCESS_DENIED);

        StaffMember restored = directory.restore(superAdmin, UUID.randomUUID(), member.id(), suspended.version(), "Back");
        StaffMember reset = directory.resetPassword(superAdmin, UUID.randomUUID(), member.id(), restored.version(),
                "temporary-pass-789", "Forgot the password");
        assertThat(reset.passwordChangeRequired()).isTrue();
        assertThat(signIn.signIn(login, "temporary-pass-789", ApiAudience.OPERATOR, null, null).passwordChangeRequired()).isTrue();
        assertCode(() -> signIn.signIn(login, "susp-password-123", ApiAudience.OPERATOR, null, null), ErrorCode.UNAUTHENTICATED);
    }

    // ------------------------------------------------------------ the super admin's rules

    @Test
    void onlyAnActiveSuperAdminManagesStaffAndTheInputIsChecked() {
        String login = uniqueLogin("rules");
        StaffMember admin = directory.create(superAdmin, UUID.randomUUID(), login, "admin-password-123",
                new Profile("Ivan", "Koval", new Contacts("+380501234567", null, null), Role.ADMIN,
                        List.of("pricing.manage"), true, List.of()), "New admin");
        Actor adminActor = new Actor(SubjectType.STAFF, admin.id());
        assertThat(admin.profile().allCities()).isTrue();

        assertCode(() -> directory.create(adminActor, UUID.randomUUID(), uniqueLogin("x"), "some-password-123",
                operatorProfile(), "x"), ErrorCode.ACCESS_DENIED);
        assertCode(() -> directory.create(superAdmin, UUID.randomUUID(), login, "some-password-123",
                operatorProfile(), "x"), ErrorCode.STATE_CONFLICT);
        assertCode(() -> directory.create(superAdmin, UUID.randomUUID(), uniqueLogin("x"), "short",
                operatorProfile(), "x"), ErrorCode.VALIDATION_FAILED);
        assertCode(() -> directory.create(superAdmin, UUID.randomUUID(), uniqueLogin("x"), "some-password-123",
                operatorProfile("orders.everything"), "x"), ErrorCode.VALIDATION_FAILED);
        assertCode(() -> directory.create(superAdmin, UUID.randomUUID(), uniqueLogin("x"), "some-password-123",
                new Profile("No", "Contact", new Contacts(null, null, null), Role.OPERATOR, List.of(), false,
                        List.of()), "x"), ErrorCode.VALIDATION_FAILED);
        assertCode(() -> directory.update(superAdmin, UUID.randomUUID(), admin.id(), admin.version() + 1,
                operatorProfile(), "x"), ErrorCode.VERSION_CONFLICT);

        StaffMember promoted = directory.update(superAdmin, UUID.randomUUID(), admin.id(), admin.version(),
                new Profile("Ivan", "Koval", new Contacts("+380501234567", null, null), Role.SUPER_ADMIN,
                        List.of("pricing.manage"), false, List.of()), "Promoted");
        assertThat(promoted.profile().permissions()).as("a super admin has everything, no ticks").isEmpty();
        assertThat(promoted.profile().allCities()).isTrue();
        assertThat(jdbc.sql("select count(*) from audit_log where resource_id = :id and action like 'staff.%'")
                .param("id", admin.id().toString()).query(Long.class).single()).isEqualTo(2);
    }

    @Test
    void theLastActiveSuperAdminCannotBeSuspendedOrDemoted() {
        StaffMember self = directory.get(superAdmin, superAdmin.id());
        assertThatThrownBy(() -> tx.executeWithoutResult(status -> {
            jdbc.sql("update staff_user set state = 'SUSPENDED' where role = 'SUPER_ADMIN' and id <> :id")
                    .param("id", superAdmin.id()).update();
            directory.suspend(superAdmin, UUID.randomUUID(), superAdmin.id(), self.version(), "test");
        })).isInstanceOf(DomainException.class).hasMessageContaining("super admin must remain");
        assertThatThrownBy(() -> tx.executeWithoutResult(status -> {
            jdbc.sql("update staff_user set state = 'SUSPENDED' where role = 'SUPER_ADMIN' and id <> :id")
                    .param("id", superAdmin.id()).update();
            directory.update(superAdmin, UUID.randomUUID(), superAdmin.id(), self.version(), operatorProfile(), "t");
        })).isInstanceOf(DomainException.class).hasMessageContaining("super admin must remain");
        assertThat(directory.get(superAdmin, superAdmin.id()).state()).isEqualTo("ACTIVE");
    }

    // ------------------------------------------------------------ logs of all staff, by role

    @Test
    @SuppressWarnings("unchecked")
    void everyStaffActionIsLoggedWithTheRoleAndOnlyLogReadersSeeIt() throws Exception {
        String login = uniqueLogin("logop");
        StaffMember op = operator(login, "log-operator-123", "orders.view");
        signIn.changePassword(new Actor(SubjectType.STAFF, op.id()), "log-operator-123", "log-operator-456");
        assertThat(postJson("/auth/v1/staff/sign-in", null, Map.of("login", login, "password", "wrong-password-9",
                "audience", "OPERATOR")).getResponse().getStatus()).isEqualTo(401);
        String opToken = (String) body(postJson("/auth/v1/staff/sign-in", null,
                Map.of("login", login, "password", "log-operator-456", "audience", "OPERATOR"))).get("access_token");
        mvc.perform(get("/api/operator/v1/me").header(HttpHeaders.AUTHORIZATION, "Bearer " + opToken)).andReturn();
        mvc.perform(get("/api/admin/v1/staff")).andReturn(); // no token: logged without a staff id

        String rootToken = (String) body(postJson("/auth/v1/staff/sign-in", null,
                Map.of("login", superLogin, "password", SUPER_PASSWORD, "audience", "ADMIN"))).get("access_token");
        mvc.perform(get("/api/admin/v1/staff/" + op.id()).header(HttpHeaders.AUTHORIZATION, "Bearer " + rootToken))
                .andReturn();

        MvcResult operators = mvc.perform(get("/api/admin/v1/logs/activity").param("staff_id", op.id().toString())
                .param("role", "OPERATOR").header(HttpHeaders.AUTHORIZATION, "Bearer " + rootToken)).andReturn();
        assertThat(operators.getResponse().getStatus()).isEqualTo(200);
        List<Map<String, Object>> entries = (List<Map<String, Object>>) body(operators).get("entries");
        assertThat(entries).extracting(e -> e.get("kind") + " " + e.get("outcome") + " " + e.get("path"))
                .contains("SIGN_IN BAD_CREDENTIALS /auth/v1/staff/sign-in", "SIGN_IN SUCCESS /auth/v1/staff/sign-in",
                        "REQUEST OK /api/operator/v1/me");
        assertThat(entries).allSatisfy(e -> assertThat(e).containsEntry("role", "OPERATOR"));

        List<Map<String, Object>> supers = (List<Map<String, Object>>) body(mvc.perform(get("/api/admin/v1/logs/activity")
                .param("staff_id", superAdmin.id().toString()).param("kind", "REQUEST")
                .header(HttpHeaders.AUTHORIZATION, "Bearer " + rootToken)).andReturn()).get("entries");
        assertThat(supers).anySatisfy(e -> {
            assertThat(e).containsEntry("path", "/api/admin/v1/staff/{staff_id}").containsEntry("role", "SUPER_ADMIN");
            assertThat((Map<String, Object>) e.get("resource_ids")).containsEntry("staff_id", op.id().toString());
        });
        assertThat(jdbc.sql("""
                        select count(*) from staff_activity
                        where staff_id is null and path = '/api/admin/v1/staff' and status = 401""")
                .query(Long.class).single()).isPositive();
        assertThat(jdbc.sql("select count(*) from staff_activity where cast(staff_activity.* as text) like '%log-operator%'")
                .query(Long.class).single()).as("no passwords in the log").isZero();

        List<Map<String, Object>> changes = (List<Map<String, Object>>) body(mvc.perform(get("/api/admin/v1/logs/changes")
                .param("role", "SUPER_ADMIN").param("resource_id", op.id().toString())
                .header(HttpHeaders.AUTHORIZATION, "Bearer " + rootToken)).andReturn()).get("changes");
        assertThat(changes).extracting(c -> c.get("action")).contains("staff.create");

        assertThat(mvc.perform(get("/api/admin/v1/logs/activity").header(HttpHeaders.AUTHORIZATION,
                "Bearer " + body(postJson("/auth/v1/staff/sign-in", null, Map.of("login", login, "password",
                        "log-operator-456", "audience", "ADMIN"))).get("access_token"))).andReturn()
                .getResponse().getStatus()).as("without audit.view").isEqualTo(403);
        assertThatThrownBy(() -> jdbc.sql("update staff_activity set outcome = 'x'").update())
                .rootCause().hasMessageContaining("append-only");
    }
}
