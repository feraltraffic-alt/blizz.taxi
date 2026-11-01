package taxi.blizz.backoffice;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;

import jakarta.servlet.Filter;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Base64;
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
import taxi.blizz.files.FilePurpose;
import taxi.blizz.files.FileService;
import taxi.blizz.files.UploadSession;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.ApiAudience;
import taxi.blizz.identity.SessionService;
import taxi.blizz.identity.VerifiedSubject;
import taxi.blizz.operations.Dispatch;
import taxi.blizz.operations.Orders;
import taxi.blizz.operations.Trips;
import taxi.blizz.operations.WorkSessions;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.pricing.QuoteService;
import tools.jackson.databind.json.JsonMapper;

@SpringBootTest
@Import(TestcontainersConfiguration.class)
class SupportAttachmentApiTests {

    private static final GeoPoint PICKUP = new GeoPoint(-39.5, 175.5);
    private static final GeoPoint DROPOFF = new GeoPoint(-39.45, 175.55);
    private static final byte[] PNG = Base64.getDecoder().decode(
            "iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAQAAAC1HAwCAAAAC0lEQVR42mNk+A8AAQUBAScY42YAAAAASUVORK5CYII=");

    @Autowired Orders orders;
    @Autowired Dispatch dispatch;
    @Autowired Trips trips;
    @Autowired WorkSessions workSessions;
    @Autowired SessionService auth;
    @Autowired QuoteService quotes;
    @Autowired SupportCases cases;
    @Autowired FileService files;
    @Autowired JdbcClient jdbc;
    @Autowired WebApplicationContext context;
    @Autowired JsonMapper json;

    MockMvc mvc;
    TestRides rides;
    UUID city;

    @BeforeEach
    void setUp() {
        List<Filter> filters = new ArrayList<>(context.getBeansOfType(Filter.class).values());
        AnnotationAwareOrderComparator.sort(filters);
        mvc = MockMvcBuilders.webAppContextSetup(context).addFilters(filters.toArray(Filter[]::new)).build();
        rides = new TestRides(jdbc, orders, dispatch, trips, workSessions, auth, quotes);
        city = rides.city("test-support-attachments", "UAH", 175.0);
    }

    /**
     * Issue #201 (found by the staff city sweep): {@code wait_for_requester} is optional in the contract, so a comment
     * without it is accepted as "not waiting".
     */
    @Test
    void aStaffCommentWithoutTheOptionalWaitForRequesterIsAccepted() throws Exception {
        TestRides.Ride ride = rides.assigned(city, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        String riderToken = token(ride.payer());
        Actor agent = staff("OPERATOR", city, SupportCases.MANAGE_PERMISSION);
        String operatorToken = auth.openStaff(new VerifiedSubject(agent, "ACTIVE", false), ApiAudience.OPERATOR, null)
                .accessToken();
        Map<String, Object> opened = jsonBody(postJson("/api/rider/v1/support/cases", riderToken,
                Map.of("command_id", UUID.randomUUID(), "category", "APP_PROBLEM", "order_id", ride.order().id(),
                        "subject", "A question", "message", "Where is my receipt?")), 201);
        String caseId = (String) opened.get("id");
        long version = ((Number) jsonBody(getAuth("/api/operator/v1/support/cases/" + caseId, operatorToken), 200)
                .get("version")).longValue();

        Map<String, Object> commented = jsonBody(postJson("/api/operator/v1/support/cases/" + caseId + "/comments",
                operatorToken, Map.of("command_id", UUID.randomUUID(), "expected_version", version,
                        "visibility", "PUBLIC", "body", "We are looking into it")), 200);
        assertThat(commented.toString()).contains("We are looking into it");
        assertThat(commented.get("state")).as("not waiting for the requester").isNotEqualTo("WAITING_FOR_REQUESTER");
    }

    @Test
    @SuppressWarnings("unchecked")
    void supportAttachmentsRespectOwnershipVisibilityReuseAndAudit() throws Exception {
        TestRides.Ride ride = rides.assigned(city, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        Actor rider = ride.payer();
        String riderToken = token(rider);
        Actor agent = staff("OPERATOR", city, SupportCases.MANAGE_PERMISSION);
        String operatorToken = auth.openStaff(new VerifiedSubject(agent, "ACTIVE", false), ApiAudience.OPERATOR, null)
                .accessToken();

        UUID riderFile = uploadOverHttp("/api/rider/v1/support/uploads", riderToken, "image/png", PNG);
        UUID openCommand = UUID.randomUUID();
        Map<String, Object> openBody = Map.of("command_id", openCommand, "category", "APP_PROBLEM",
                "order_id", ride.order().id(), "subject", "Screenshot", "message", "See the screenshot",
                "attachment_ids", List.of(riderFile));
        Map<String, Object> opened = jsonBody(postJson("/api/rider/v1/support/cases", riderToken, openBody), 201);
        UUID caseId = UUID.fromString((String) opened.get("id"));
        assertThat(opened.toString()).contains(riderFile.toString()).contains("image/png");

        // A repeat is the same case; a repeat with other files must not add them to the old message.
        assertThat(jsonBody(postJson("/api/rider/v1/support/cases", riderToken, openBody), 201).get("id"))
                .isEqualTo(opened.get("id"));
        UUID lateFile = uploadOverHttp("/api/rider/v1/support/uploads", riderToken, "image/png", PNG);
        Map<String, Object> sneaky = new java.util.HashMap<>(openBody);
        sneaky.put("attachment_ids", List.of(riderFile, lateFile));
        assertThat(postJson("/api/rider/v1/support/cases", riderToken, sneaky).getResponse().getStatus())
                .isEqualTo(409);
        assertThat(jdbc.sql("select count(*) from support_message_attachment where file_id = :f")
                .param("f", lateFile).query(Long.class).single()).isZero();

        MvcResult staffDownload = getAuth("/api/operator/v1/support/cases/" + caseId + "/attachments/" + riderFile,
                operatorToken);
        assertThat(staffDownload.getResponse().getStatus()).isEqualTo(200);
        assertThat(staffDownload.getResponse().getContentAsByteArray()).isEqualTo(PNG);

        Actor root = root();
        String adminToken = auth.openStaff(new VerifiedSubject(root, "ACTIVE", false), ApiAudience.ADMIN, null)
                .accessToken();
        MvcResult audit = mvc.perform(get("/api/admin/v1/logs/changes")
                .param("action", "support.attachment.read").param("resource_type", "support_case")
                .param("resource_id", caseId.toString())
                .header(HttpHeaders.AUTHORIZATION, "Bearer " + adminToken)).andReturn();
        assertThat(audit.getResponse().getStatus()).isEqualTo(200);
        assertThat(audit.getResponse().getContentAsString()).contains("support.attachment.read").contains(riderFile.toString());

        UUID internalFile = uploadOverHttp("/api/operator/v1/support/uploads", operatorToken, "image/png", PNG);
        Map<String, Object> operatorCase = jsonBody(getAuth("/api/operator/v1/support/cases/" + caseId, operatorToken), 200);
        long version = ((Number) operatorCase.get("version")).longValue();
        Map<String, Object> commented = jsonBody(postJson("/api/operator/v1/support/cases/" + caseId + "/comments",
                operatorToken, Map.of("command_id", UUID.randomUUID(), "expected_version", version,
                        "visibility", "INTERNAL", "body", "Internal screenshot", "wait_for_requester", false,
                        "attachment_ids", List.of(internalFile))), 200);
        assertThat(commented.toString()).contains(internalFile.toString());

        MvcResult riderCase = getAuth("/api/rider/v1/support/cases/" + caseId, riderToken);
        assertThat(riderCase.getResponse().getStatus()).isEqualTo(200);
        assertThat(riderCase.getResponse().getContentAsString()).doesNotContain(internalFile.toString())
                .doesNotContain("Internal screenshot");
        assertStatus("/api/rider/v1/support/cases/" + caseId + "/attachments/" + internalFile, riderToken, 404);

        Actor stranger = rides.client();
        UUID strangersFile = safeFile(stranger, FilePurpose.SUPPORT_ATTACHMENT);
        assertPostStatus("/api/rider/v1/support/cases/" + caseId + "/messages", riderToken,
                Map.of("command_id", UUID.randomUUID(), "message", "foreign", "attachment_ids", List.of(strangersFile)), 400);

        UUID wrongPurpose = safeFile(rider, FilePurpose.DRIVER_DOCUMENT);
        assertPostStatus("/api/rider/v1/support/cases/" + caseId + "/messages", riderToken,
                Map.of("command_id", UUID.randomUUID(), "message", "wrong purpose", "attachment_ids", List.of(wrongPurpose)), 400);

        assertPostStatus("/api/rider/v1/support/cases/" + caseId + "/messages", riderToken,
                Map.of("command_id", UUID.randomUUID(), "message", "reuse", "attachment_ids", List.of(riderFile)), 400);
        assertPostStatus("/api/rider/v1/support/cases/" + caseId + "/messages", riderToken,
                Map.of("command_id", UUID.randomUUID(), "message", "too many", "attachment_ids", List.of(
                        UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(),
                        UUID.randomUUID())), 400);
        assertPostStatus("/api/rider/v1/support/uploads", riderToken,
                Map.of("command_id", UUID.randomUUID(), "content_type", "text/plain", "size_bytes", 3), 400);

        Actor other = rides.client();
        SupportCases.Case otherCase = cases.open(other, UUID.randomUUID(), SupportCases.Category.APP_PROBLEM, null,
                "Other case", "Not yours");
        assertStatus("/api/rider/v1/support/cases/" + otherCase.id() + "/attachments/" + riderFile, riderToken, 404);
    }

    private UUID uploadOverHttp(String openPath, String token, String contentType, byte[] bytes) throws Exception {
        Map<String, Object> session = jsonBody(postJson(openPath, token, Map.of("command_id", UUID.randomUUID(),
                "content_type", contentType, "size_bytes", bytes.length)), 201);
        UUID file = UUID.fromString((String) session.get("file_id"));
        String path = (String) session.get("upload_path");
        MvcResult uploaded = mvc.perform(put(path).header(HttpHeaders.AUTHORIZATION, "Bearer " + token)
                .contentType(contentType).content(bytes)).andReturn();
        assertThat(uploaded.getResponse().getStatus()).isEqualTo(200);
        assertThat(uploaded.getResponse().getContentAsString()).contains("SAFE");
        return file;
    }

    private UUID safeFile(Actor owner, FilePurpose purpose) {
        UploadSession session = files.openUpload(owner, UUID.randomUUID(), purpose, "image/png", PNG.length);
        files.upload(owner, session.fileId(), "image/png", PNG.length, new ByteArrayInputStream(PNG));
        return session.fileId();
    }

    private Actor staff(String role, UUID cityId, String... permissions) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, city_scope, state, created_at, updated_at)
                        values (:id, :login, 'Attachment Agent', :role, :permissions, :scope, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "support-attachment-" + id).param("role", role)
                .param("permissions", permissions).param("scope", new UUID[] {cityId}).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private Actor root() {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, state, all_cities, created_at, updated_at)
                        values (:id, :login, 'Attachment Root', 'SUPER_ADMIN', 'ACTIVE', true, now(), now())""")
                .param("id", id).param("login", "support-attachment-root-" + id).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private String token(Actor actor) {
        return auth.open(new VerifiedSubject(actor, "ACTIVE", false), "support-attachment-test").accessToken();
    }

    private MvcResult postJson(String path, String token, Object body) throws Exception {
        return mvc.perform(post(path).header(HttpHeaders.AUTHORIZATION, "Bearer " + token)
                .contentType(MediaType.APPLICATION_JSON).content(json.writeValueAsString(body))).andReturn();
    }

    private MvcResult getAuth(String path, String token) throws Exception {
        return mvc.perform(get(path).header(HttpHeaders.AUTHORIZATION, "Bearer " + token)).andReturn();
    }

    private void assertStatus(String path, String token, int status) throws Exception {
        assertThat(getAuth(path, token).getResponse().getStatus()).isEqualTo(status);
    }

    private void assertPostStatus(String path, String token, Object body, int status) throws Exception {
        assertThat(postJson(path, token, body).getResponse().getStatus()).isEqualTo(status);
    }

    @SuppressWarnings("unchecked")
    private Map<String, Object> jsonBody(MvcResult result, int status) throws Exception {
        assertThat(result.getResponse().getStatus()).isEqualTo(status);
        return json.readValue(result.getResponse().getContentAsString(), Map.class);
    }
}
