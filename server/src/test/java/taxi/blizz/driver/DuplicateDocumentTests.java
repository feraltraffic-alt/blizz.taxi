package taxi.blizz.driver;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import jakarta.servlet.Filter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.core.annotation.AnnotationAwareOrderComparator;
import org.springframework.http.HttpHeaders;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.files.FilePurpose;
import taxi.blizz.files.FileService;
import taxi.blizz.files.FileState;
import taxi.blizz.identity.ApiAudience;
import taxi.blizz.identity.SessionService;
import taxi.blizz.identity.VerifiedSubject;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.platform.internal.OutboxRelay;
import tools.jackson.databind.json.JsonMapper;

/**
 * The same document at two drivers (issue #105, threat model D2): a driver document whose content equals a document
 * of another driver raises one DUPLICATE_DOCUMENT risk flag on the later driver and shows in the reviewer's view; a
 * driver's own re-upload does not. The admin download is an attachment that the browser does not sniff (D3, E6).
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class DuplicateDocumentTests {

    @Autowired DriverAdmission admission;
    @Autowired FileService files;
    @Autowired SessionService auth;
    @Autowired OutboxRelay relay;
    @Autowired JdbcClient jdbc;
    @Autowired JsonMapper json;
    @Autowired WebApplicationContext context;
    @Autowired taxi.blizz.operations.DriverRiskFlags riskFlags;

    MockMvc mvc;

    @BeforeEach
    void setUp() {
        List<Filter> filters = new ArrayList<>(context.getBeansOfType(Filter.class).values());
        AnnotationAwareOrderComparator.sort(filters);
        mvc = MockMvcBuilders.webAppContextSetup(context).addFilters(filters.toArray(Filter[]::new)).build();
    }

    // ------------------------------------------------------------ fixtures

    private Actor newDriver() {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into driver (id, phone_normalized, account_state, review_status, created_at, updated_at)
                        values (:id, :phone, 'ACTIVE', 'NOT_SUBMITTED', now(), now())""")
                .param("id", id)
                .param("phone", "+38095" + String.format("%07d", Math.floorMod(id.hashCode(), 10_000_000)))
                .update();
        return new Actor(SubjectType.DRIVER, id);
    }

    /** A JPEG no other test uploads: random image data (no 0xFF bytes). */
    private static byte[] uniqueJpeg() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.writeBytes(new byte[] {(byte) 0xFF, (byte) 0xD8});
        segment(out, 0xE0, "JFIF\0\1\1\0\0\1\0\1\0\0");
        segment(out, 0xDB, "quantization-table-bytes");
        segment(out, 0xDA, "\0\1\2\3\4\5");
        for (int i = 0; i < 64; i++) {
            out.write(ThreadLocalRandom.current().nextInt(0, 0xFF));
        }
        out.writeBytes(new byte[] {(byte) 0xFF, (byte) 0xD9});
        return out.toByteArray();
    }

    private static void segment(ByteArrayOutputStream out, int marker, String payload) {
        byte[] data = payload.getBytes(StandardCharsets.ISO_8859_1);
        int length = data.length + 2;
        out.writeBytes(new byte[] {(byte) 0xFF, (byte) marker, (byte) (length >> 8), (byte) length});
        out.writeBytes(data);
    }

    private UUID document(Actor driver, byte[] content) {
        UUID fileId = files.openUpload(driver, UUID.randomUUID(), FilePurpose.DRIVER_DOCUMENT, "image/jpeg",
                content.length).fileId();
        assertThat(files.upload(driver, fileId, "image/jpeg", content.length, new ByteArrayInputStream(content))
                .state()).isEqualTo(FileState.SAFE);
        UUID documentId = admission.addDocument(driver, UUID.randomUUID(), new DriverAdmission.DocumentInput(
                DocumentType.DRIVER_LICENSE, null, fileId, "N-1", LocalDate.now().minusYears(1),
                LocalDate.now().plusYears(5)));
        while (relay.runOnce() > 0) {
            // deliver the events of this document
        }
        return documentId;
    }

    private List<Map<String, Object>> duplicateFlags(UUID driverId) {
        return jdbc.sql("""
                        select driver_id::text as driver_id, evidence::text as evidence from driver_risk_flag
                        where kind = 'DUPLICATE_DOCUMENT' and driver_id = :d""")
                .param("d", driverId).query().listOfRows();
    }

    private String staffToken(String... permissions) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, state, all_cities, created_at,
                                                updated_at)
                        values (:id, :login, 'Reviewer', 'ADMIN', :permissions, 'ACTIVE', true, now(), now())""")
                .param("id", id).param("login", "dup-" + id).param("permissions", permissions).update();
        return auth.openStaff(new VerifiedSubject(new Actor(SubjectType.STAFF, id), "ACTIVE", false),
                ApiAudience.ADMIN, null).accessToken();
    }

    @SuppressWarnings("unchecked")
    private Map<String, Object> reviewCase(String token, UUID driverId) throws Exception {
        MvcResult result = mvc.perform(get("/api/admin/v1/drivers/" + driverId)
                .header(HttpHeaders.AUTHORIZATION, "Bearer " + token)).andReturn();
        assertThat(result.getResponse().getStatus()).as(result.getResponse().getContentAsString()).isEqualTo(200);
        return json.readValue(result.getResponse().getContentAsString(), Map.class);
    }

    // ------------------------------------------------------------ E4

    @Test
    void theSameFileAtTwoDriversRaisesOneFlagOnTheLaterOneAndOwnReUploadsRaiseNone() throws Exception {
        byte[] licence = uniqueJpeg();
        Actor first = newDriver();
        Actor second = newDriver();

        UUID firstDocument = document(first, licence);
        document(first, licence);   // the same driver again: no flag
        assertThat(duplicateFlags(first.id())).isEmpty();

        UUID secondDocument = document(second, licence);
        List<Map<String, Object>> flags = duplicateFlags(second.id());
        assertThat(flags).hasSize(1);
        assertThat((String) flags.getFirst().get("evidence")).contains(first.id().toString())
                .contains(firstDocument.toString()).contains(secondDocument.toString());

        // Repeats of the same pair: still one flag, and none on the first driver.
        document(second, licence);
        document(first, licence);
        assertThat(duplicateFlags(second.id())).hasSize(1);
        assertThat(duplicateFlags(first.id())).isEmpty();

        // A different file: nothing.
        Actor third = newDriver();
        document(third, uniqueJpeg());
        assertThat(duplicateFlags(third.id())).isEmpty();

        // The reviewer sees it on the driver's current document (the latest of the type), naming the other driver.
        String reviewer = staffToken(DriverAdmission.REVIEW_PERMISSION);
        @SuppressWarnings("unchecked")
        Map<String, Object> review = reviewCase(reviewer, second.id());
        @SuppressWarnings("unchecked")
        Map<String, Object> profile = (Map<String, Object>) review.get("profile");
        @SuppressWarnings("unchecked")
        Object current = ((List<Map<String, Object>>) profile.get("documents")).getFirst().get("id");
        @SuppressWarnings("unchecked")
        List<Map<String, Object>> duplicates = (List<Map<String, Object>>) review.get("duplicates");
        assertThat(duplicates).isNotEmpty().allSatisfy(d -> assertThat(d)
                .containsEntry("document_id", current)
                .containsEntry("other_driver_id", first.id().toString()));
        assertThat(duplicates).anySatisfy(d -> assertThat(d)
                .containsEntry("other_document_id", firstDocument.toString()));
        assertThat(reviewCase(reviewer, third.id()).get("duplicates")).isEqualTo(List.of());
    }

    @Test
    void aFlagOfNoCityIsForStaffWithAllCitiesOnly() {
        byte[] licence = uniqueJpeg();
        document(newDriver(), licence);
        Actor second = newDriver();
        document(second, licence);
        UUID flagId = jdbc.sql("select id from driver_risk_flag where kind = 'DUPLICATE_DOCUMENT' and driver_id = :d")
                .param("d", second.id()).query(UUID.class).single();
        assertThat(jdbc.sql("select city_id is null from driver_risk_flag where id = :id").param("id", flagId)
                .query(Boolean.class).single()).isTrue();

        Actor oneCity = staff(false, UUID.randomUUID());
        assertThat(riskFlags.list(oneCity, null, null, second.id(), null, 50)).isEmpty();
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> riskFlags.get(oneCity, flagId))
                .isInstanceOf(taxi.blizz.platform.DomainException.class)
                .extracting(e -> ((taxi.blizz.platform.DomainException) e).code())
                .isEqualTo(taxi.blizz.platform.ErrorCode.ACCESS_DENIED);
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> riskFlags.review(oneCity, UUID.randomUUID(), flagId,
                        0, false, "Not mine to decide"))
                .isInstanceOf(taxi.blizz.platform.DomainException.class);

        Actor allCities = staff(true);
        assertThat(riskFlags.list(allCities, null, null, second.id(), null, 50))
                .extracting(taxi.blizz.operations.DriverRiskFlags.Flag::id).containsExactly(flagId);
        long version = riskFlags.get(allCities, flagId).version();
        assertThat(riskFlags.review(allCities, UUID.randomUUID(), flagId, version, false, "Same licence photo, checked")
                .state()).isEqualTo(taxi.blizz.operations.DriverRiskFlags.State.DISMISSED);
    }

    private Actor staff(boolean allCities, UUID... cities) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, state, all_cities, city_scope,
                                                created_at, updated_at)
                        values (:id, :login, 'Risk', 'ADMIN', :permissions, 'ACTIVE', :all, :scope, now(), now())""")
                .param("id", id).param("login", "risk-" + id)
                .param("permissions", new String[]{taxi.blizz.operations.DriverRiskFlags.RISK_PERMISSION})
                .param("all", allCities).param("scope", cities).update();
        return new Actor(SubjectType.STAFF, id);
    }

    // ------------------------------------------------------------ E6

    @Test
    void theAdminDownloadIsAnAttachmentTheBrowserDoesNotSniff() throws Exception {
        Actor driver = newDriver();
        UUID documentId = document(driver, uniqueJpeg());
        String reviewer = staffToken(DriverAdmission.REVIEW_PERMISSION);

        MvcResult file = mvc.perform(get("/api/admin/v1/drivers/" + driver.id() + "/documents/" + documentId + "/file")
                .header(HttpHeaders.AUTHORIZATION, "Bearer " + reviewer)).andReturn();

        assertThat(file.getResponse().getStatus()).isEqualTo(200);
        assertThat(file.getResponse().getHeader(HttpHeaders.CONTENT_DISPOSITION)).startsWith("attachment");
        assertThat(file.getResponse().getHeader("X-Content-Type-Options")).isEqualTo("nosniff");
        assertThat(file.getResponse().getContentType()).isEqualTo("image/jpeg");
    }
}
