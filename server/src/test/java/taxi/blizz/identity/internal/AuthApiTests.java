package taxi.blizz.identity.internal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import jakarta.servlet.Filter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;
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
import taxi.blizz.identity.OtpAudience;
import taxi.blizz.identity.OtpDelivery;
import taxi.blizz.identity.PhoneNumber;
import tools.jackson.databind.json.JsonMapper;

/**
 * Sign-in over HTTP end to end: auth.v1.yaml, rider.v1.yaml, driver.v1.yaml
 * (REQ-AUTH-03 – REQ-AUTH-07, REQ-USR-08, AC-03, AC-27).
 */
@SpringBootTest
@Import({TestcontainersConfiguration.class, AuthApiTests.Capture.class})
class AuthApiTests {

    static final java.util.UUID SVC = taxi.blizz.identity.Services.DEFAULT_ID;

    @Autowired
    WebApplicationContext context;
    @Autowired
    JsonMapper json;
    @Autowired
    CapturingDelivery delivery;
    @Autowired
    JdbcClient jdbc;
    @Autowired
    AuthProperties properties;
    @Autowired
    taxi.blizz.identity.SessionService sessions;
    @Autowired
    java.time.Clock clock;

    MockMvc mvc;
    String phone;

    @BeforeEach
    void setUp() {
        List<Filter> filters = new ArrayList<>(context.getBeansOfType(Filter.class).values());
        AnnotationAwareOrderComparator.sort(filters);
        mvc = MockMvcBuilders.webAppContextSetup(context).addFilters(filters.toArray(Filter[]::new)).build();
        phone = taxi.blizz.TestPhones.unique("+38050", 7);
        delivery.codes.clear();
    }

    private MvcResult postJson(String path, Object body) throws Exception {
        return mvc.perform(post(path).contentType(MediaType.APPLICATION_JSON).content(json.writeValueAsString(body))
                .with(request -> {
                    request.setRemoteAddr("198.51.100." + Math.floorMod(UUID.randomUUID().hashCode(), 250));
                    return request;
                })).andReturn();
    }

    @SuppressWarnings("unchecked")
    private Map<String, Object> body(MvcResult result) throws Exception {
        return json.readValue(result.getResponse().getContentAsString(), Map.class);
    }

    private Map<String, Object> signIn(String audience) throws Exception {
        return signIn(audience, null);
    }

    /** {@code service}: the taxi service's code (ADR 0016), or null for the first service. */
    private Map<String, Object> signIn(String audience, String service) throws Exception {
        Map<String, Object> request = new java.util.HashMap<>(
                Map.of("audience", audience, "phone", phone, "device_ref", "test-device"));
        if (service != null) {
            request.put("service", service);
        }
        MvcResult challenge = postJson("/auth/v1/otp/challenges", request);
        assertThat(challenge.getResponse().getStatus()).isEqualTo(201);
        Map<String, Object> issued = body(challenge);
        assertThat(issued).containsOnlyKeys("challenge_id", "expires_at", "resend_available_at", "channel");
        assertThat(issued).containsEntry("channel", "SMS");

        MvcResult verify = postJson("/auth/v1/otp/verify",
                Map.of("challenge_id", issued.get("challenge_id"), "code", delivery.codes.getLast()));
        assertThat(verify.getResponse().getStatus()).isEqualTo(200);
        return body(verify);
    }

    private MvcResult getWithToken(String path, Object token) throws Exception {
        return mvc.perform(get(path).header(HttpHeaders.AUTHORIZATION, "Bearer " + token)).andReturn();
    }

    @Test
    void clientSignsInAndCallsTheRiderApi() throws Exception {
        Map<String, Object> session = signIn("CLIENT");

        assertThat(session).containsKeys("session_id", "subject", "audience", "access_token", "access_expires_at",
                "refresh_token", "refresh_expires_at", "account_created");
        assertThat(session.get("audience")).isEqualTo("rider");
        assertThat(session.get("account_created")).isEqualTo(true);

        MvcResult me = getWithToken("/api/rider/v1/me", session.get("access_token"));
        assertThat(me.getResponse().getStatus()).isEqualTo(200);
        assertThat(body(me)).containsEntry("subject_type", "CLIENT")
                .containsEntry("account_state", "ACTIVE")
                .containsEntry("session_id", session.get("session_id"));
    }

    /**
     * Issue #197 (AC-27): a token signed with the server's own key for a real client, but whose session was never
     * issued or is gone, is refused; the codec alone accepts it, so only the missing session refuses it.
     */
    @Test
    void aCorrectlySignedTokenWithoutItsSessionIsRefused() throws Exception {
        Map<String, Object> session = signIn("CLIENT");
        @SuppressWarnings("unchecked")
        UUID clientId = UUID.fromString((String) ((Map<String, Object>) session.get("subject")).get("id"));
        taxi.blizz.platform.Actor client = new taxi.blizz.platform.Actor(taxi.blizz.platform.SubjectType.CLIENT,
                clientId);
        AccessTokenCodec codec = new AccessTokenCodec(properties.accessTokenSecret(), properties.instanceId(),
                properties.accessTtl(), clock);

        String neverIssued = codec.sign(client, ApiAudience.RIDER, UUID.randomUUID(), SVC).token();
        assertThat(codec.verify(neverIssued, ApiAudience.RIDER)).as("signed correctly").isPresent();
        assertThat(sessions.verifyAccess(neverIssued, ApiAudience.RIDER)).isEmpty();
        assertUnauthenticated(getWithToken("/api/rider/v1/me", neverIssued));

        UUID sessionId = UUID.fromString((String) session.get("session_id"));
        String ofTheRealSession = codec.sign(client, ApiAudience.RIDER, sessionId, SVC).token();
        assertThat(getWithToken("/api/rider/v1/me", ofTheRealSession).getResponse().getStatus())
                .as("the control: the same token for the real session works").isEqualTo(200);
        jdbc.sql("delete from refresh_token where session_id = :id").param("id", sessionId).update();
        jdbc.sql("delete from device_session where id = :id").param("id", sessionId).update();
        assertThat(sessions.verifyAccess(ofTheRealSession, ApiAudience.RIDER)).isEmpty();
        assertUnauthenticated(getWithToken("/api/rider/v1/me", ofTheRealSession));
    }

    @Test
    void riderTokenIsRefusedByTheDriverApiAndViceVersa() throws Exception {
        Map<String, Object> rider = signIn("CLIENT");
        Map<String, Object> driver = signIn("DRIVER");

        assertUnauthenticated(getWithToken("/api/driver/v1/me", rider.get("access_token")));
        assertUnauthenticated(getWithToken("/api/rider/v1/me", driver.get("access_token")));
        assertThat(getWithToken("/api/driver/v1/me", driver.get("access_token")).getResponse().getStatus())
                .isEqualTo(200);
    }

    @Test
    void missingOrBrokenTokenIsUnauthenticated() throws Exception {
        MvcResult none = mvc.perform(get("/api/rider/v1/me")).andReturn();
        assertUnauthenticated(none);
        assertThat(none.getResponse().getHeader(HttpHeaders.WWW_AUTHENTICATE)).isEqualTo("Bearer");

        assertUnauthenticated(getWithToken("/api/rider/v1/me", "not-a-jwt"));
    }

    @Test
    void refreshRotatesAndReuseLogsTheDeviceOut() throws Exception {
        Map<String, Object> first = signIn("CLIENT");

        MvcResult refreshed = postJson("/auth/v1/token/refresh", Map.of("refresh_token", first.get("refresh_token")));
        assertThat(refreshed.getResponse().getStatus()).isEqualTo(200);
        Map<String, Object> second = body(refreshed);
        assertThat(second).doesNotContainKey("account_created");

        assertUnauthenticated(postJson("/auth/v1/token/refresh", Map.of("refresh_token", first.get("refresh_token"))));
        assertUnauthenticated(getWithToken("/api/rider/v1/me", second.get("access_token")));
    }

    @Test
    void logoutEndsTheSessionImmediately() throws Exception {
        Map<String, Object> session = signIn("CLIENT");

        MvcResult logout = postJson("/auth/v1/logout", Map.of("refresh_token", session.get("refresh_token")));

        assertThat(logout.getResponse().getStatus()).isEqualTo(204);
        assertUnauthenticated(getWithToken("/api/rider/v1/me", session.get("access_token")));
    }

    @Test
    void blockingTheAccountStopsRequestsOnceSessionsAreRevoked() throws Exception {
        Map<String, Object> session = signIn("CLIENT");
        @SuppressWarnings("unchecked")
        UUID clientId = UUID.fromString((String) ((Map<String, Object>) session.get("subject")).get("id"));
        jdbc.sql("update client set account_state = 'BLOCKED' where id = :id").param("id", clientId).update();
        jdbc.sql("update device_session set revoked_at = now() where subject_id = :id").param("id", clientId).update();

        assertUnauthenticated(getWithToken("/api/rider/v1/me", session.get("access_token")));
    }

    @Test
    void wrongCodeIsAProblemWithOtpInvalid() throws Exception {
        Map<String, Object> issued = body(postJson("/auth/v1/otp/challenges", Map.of("audience", "CLIENT", "phone", phone)));
        String wrong = delivery.codes.getLast().equals("000000") ? "111111" : "000000";

        MvcResult result = postJson("/auth/v1/otp/verify", Map.of("challenge_id", issued.get("challenge_id"), "code", wrong));

        assertThat(result.getResponse().getStatus()).isEqualTo(422);
        assertThat(result.getResponse().getContentType()).startsWith("application/problem+json");
        assertThat(body(result)).containsEntry("code", "OTP_INVALID");
    }

    @Test
    void resendTooSoonIs429WithRetryAfter() throws Exception {
        postJson("/auth/v1/otp/challenges", Map.of("audience", "CLIENT", "phone", phone));

        MvcResult again = postJson("/auth/v1/otp/challenges", Map.of("audience", "CLIENT", "phone", phone));

        assertThat(again.getResponse().getStatus()).isEqualTo(429);
        assertThat(again.getResponse().getHeader(HttpHeaders.RETRY_AFTER)).isNotBlank();
        assertThat(body(again)).containsEntry("code", "RATE_LIMITED");
    }

    @Test
    void malformedPhoneAndUnknownAudienceAreValidationErrors() throws Exception {
        MvcResult phoneResult = postJson("/auth/v1/otp/challenges", Map.of("audience", "CLIENT", "phone", "0501234567"));
        MvcResult audienceResult = postJson("/auth/v1/otp/challenges", Map.of("audience", "STAFF", "phone", phone));

        assertThat(phoneResult.getResponse().getStatus()).isEqualTo(400);
        assertThat(audienceResult.getResponse().getStatus()).isEqualTo(400);
    }

    @Test
    void blockedAccountCannotSignIn() throws Exception {
        jdbc.sql("""
                        insert into client (id, phone_normalized, account_state, has_app, created_at, updated_at)
                        values (:id, :phone, 'BLOCKED', true, now(), now())""")
                .param("id", UUID.randomUUID()).param("phone", phone).update();
        Map<String, Object> issued = body(postJson("/auth/v1/otp/challenges", Map.of("audience", "CLIENT", "phone", phone)));

        MvcResult result = postJson("/auth/v1/otp/verify",
                Map.of("challenge_id", issued.get("challenge_id"), "code", delivery.codes.getLast()));

        assertThat(result.getResponse().getStatus()).isEqualTo(403);
        assertThat(body(result)).containsEntry("code", "ACCESS_DENIED");
    }

    private void assertUnauthenticated(MvcResult result) throws Exception {
        assertThat(result.getResponse().getStatus()).isEqualTo(401);
        assertThat(body(result)).containsEntry("code", "UNAUTHENTICATED");
    }

    static class CapturingDelivery implements OtpDelivery {
        final List<String> codes = new CopyOnWriteArrayList<>();

        @Override
        public void send(PhoneNumber phone, String code, OtpAudience audience) {
            codes.add(code);
        }
    }

    @TestConfiguration(proxyBeanMethods = false)
    static class Capture {
        @Bean
        @Primary
        CapturingDelivery authApiCapturingDelivery() {
            return new CapturingDelivery();
        }
    }

    // ------------------------------------------------------------ taxi services (ADR 0016, #214)

    private UUID service(String prefix) {
        UUID id = UUID.randomUUID();
        String code = prefix + "-" + id.toString().substring(0, 8);
        jdbc.sql("""
                        insert into service (id, code, name, created_at, updated_at)
                        values (:id, :code, :code, now(), now())""")
                .param("id", id).param("code", code).update();
        return id;
    }

    private String code(UUID service) {
        return jdbc.sql("select code from service where id = :id").param("id", service).query(String.class).single();
    }

    @SuppressWarnings("unchecked")
    private static String subjectId(Map<String, Object> session) {
        return (String) ((Map<String, Object>) session.get("subject")).get("id");
    }

    @Test
    void theSamePhoneSignsInToTwoServicesAsTwoAccountsEachTokenInItsOwnService() throws Exception {
        UUID other = service("second");
        for (String audience : List.of("CLIENT", "DRIVER")) {
            Map<String, Object> first = signIn(audience);
            Map<String, Object> second = signIn(audience, code(other));
            assertThat(second).containsEntry("account_created", true);
            assertThat(subjectId(second)).as(audience + ": another account").isNotEqualTo(subjectId(first));
            String table = audience.equals("CLIENT") ? "client" : "driver";
            assertThat(jdbc.sql("select service_id from " + table + " where id = :id")
                    .param("id", UUID.fromString(subjectId(second))).query(UUID.class).single()).isEqualTo(other);
            assertThat(sessions.verifyAccess((String) second.get("access_token"),
                    audience.equals("CLIENT") ? ApiAudience.RIDER : ApiAudience.DRIVER).orElseThrow().serviceId())
                    .as("the token carries the service").isEqualTo(other);
            assertThat(sessions.verifyAccess((String) first.get("access_token"),
                    audience.equals("CLIENT") ? ApiAudience.RIDER : ApiAudience.DRIVER).orElseThrow().serviceId())
                    .isEqualTo(SVC);
            // Signing in again in either service finds that service's own account.
            assertThat(subjectId(signIn(audience, code(other)))).isEqualTo(subjectId(second));
        }
    }

    @Test
    void anUnknownOrSuspendedServiceSignsNobodyIn() throws Exception {
        UUID suspended = service("paused");
        jdbc.sql("update service set state = 'SUSPENDED' where id = :id").param("id", suspended).update();
        for (String code : List.of("no-such-service", code(suspended))) {
            MvcResult refused = postJson("/auth/v1/otp/challenges",
                    Map.of("audience", "CLIENT", "phone", phone, "device_ref", "test-device", "service", code));
            assertThat(refused.getResponse().getStatus()).as(code).isEqualTo(422);
        }
        assertThat(delivery.codes).as("no code sent").isEmpty();
    }

    @Test
    void suspendingAServiceEndsItsSessions() throws Exception {
        UUID service = service("ending");
        Map<String, Object> session = signIn("CLIENT", code(service));
        assertThat(getWithToken("/api/rider/v1/me", session.get("access_token")).getResponse().getStatus())
                .isEqualTo(200);
        jdbc.sql("update service set state = 'SUSPENDED' where id = :id").param("id", service).update();
        assertUnauthenticated(getWithToken("/api/rider/v1/me", session.get("access_token")));
        assertThat(postJson("/auth/v1/token/refresh", Map.of("refresh_token", session.get("refresh_token")))
                .getResponse().getStatus()).as("no new token either").isEqualTo(401);
    }
}
