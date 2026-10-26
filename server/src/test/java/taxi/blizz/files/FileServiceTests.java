package taxi.blizz.files;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;

/** REQ-SEC-06, REQ-SEC-07, AC-23 (malicious file), T-38. */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class FileServiceTests {

    private static final byte[] PNG = {(byte) 0x89, 'P', 'N', 'G', '\r', '\n', 0x1A, '\n', 0, 0, 0, 13, 'I', 'H', 'D', 'R'};

    @Autowired
    FileService files;
    @Autowired
    JdbcClient jdbc;

    private final Actor driver = new Actor(SubjectType.DRIVER, UUID.randomUUID());

    /** A minimal JPEG: SOI, APP0 (JFIF), APP1 (Exif with a fake GPS tag), COM, SOS with data, EOI. */
    static byte[] jpegWithExif() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.writeBytes(new byte[] {(byte) 0xFF, (byte) 0xD8});
        segment(out, 0xE0, "JFIF\0\1\1\0\0\1\0\1\0\0");
        segment(out, 0xE1, "Exif\0\0GPSLatitude=50.45");
        segment(out, 0xFE, "camera owner comment");
        segment(out, 0xDB, "quantization-table-bytes");
        segment(out, 0xDA, "\0\1\2\3\4\5");
        out.writeBytes(new byte[] {0x11, 0x22, 0x33, (byte) 0xFF, 0x00, 0x44, (byte) 0xFF, (byte) 0xD9});
        return out.toByteArray();
    }

    private static void segment(ByteArrayOutputStream out, int marker, String payload) {
        byte[] data = payload.getBytes(StandardCharsets.ISO_8859_1);
        int length = data.length + 2;
        out.writeBytes(new byte[] {(byte) 0xFF, (byte) marker, (byte) (length >> 8), (byte) length});
        out.writeBytes(data);
    }

    private UUID open(String type, long size) {
        return files.openUpload(driver, UUID.randomUUID(), FilePurpose.DRIVER_DOCUMENT, type, size).fileId();
    }

    private StoredFile upload(UUID fileId, String type, byte[] body) {
        return files.upload(driver, fileId, type, body.length, new ByteArrayInputStream(body));
    }

    private static void assertCode(ThrowingCallable call, ErrorCode code) {
        assertThatThrownBy(call).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }

    @Test
    void pngIsAcceptedStoredUnderARandomKeyAndHashed() throws Exception {
        UUID id = open("image/png", PNG.length);

        StoredFile stored = upload(id, "image/png", PNG);

        assertThat(stored.state()).isEqualTo(FileState.SAFE);
        assertThat(stored.contentType()).isEqualTo("image/png");
        String key = jdbc.sql("select storage_key from file_object where id = :id").param("id", id)
                .query(String.class).single();
        assertThat(key).matches("driver_document/\\d{4}-\\d{2}/" + id);
        byte[] hash = jdbc.sql("select sha256 from file_object where id = :id").param("id", id)
                .query((rs, i) -> rs.getBytes(1)).single();
        assertThat(hash).hasSize(32);
        try (InputStream in = files.open(driver, id).stream()) {
            assertThat(in.readAllBytes()).isEqualTo(PNG);
        }
    }

    @Test
    void jpegLosesExifAndCommentsButKeepsImageData() throws Exception {
        byte[] jpeg = jpegWithExif();
        UUID id = open("image/jpeg", jpeg.length);

        StoredFile stored = upload(id, "image/jpeg", jpeg);

        assertThat(stored.state()).isEqualTo(FileState.SAFE);
        assertThat(stored.sizeBytes()).isLessThan(jpeg.length);
        byte[] kept;
        try (InputStream in = files.open(driver, id).stream()) {
            kept = in.readAllBytes();
        }
        String text = new String(kept, StandardCharsets.ISO_8859_1);
        assertThat(text).doesNotContain("Exif").doesNotContain("GPSLatitude").doesNotContain("camera owner")
                .contains("JFIF").contains("quantization-table-bytes");
        assertThat(kept[kept.length - 2] & 0xFF).isEqualTo(0xFF);
        assertThat(kept[kept.length - 1] & 0xFF).isEqualTo(0xD9);
    }

    @Test
    void contentThatIsNotTheDeclaredTypeIsRejectedAndRemoved() {
        byte[] html = "<html><script>alert(1)</script></html>".getBytes(StandardCharsets.UTF_8);
        UUID id = open("image/png", html.length);

        StoredFile stored = upload(id, "image/png", html);

        assertThat(stored.state()).isEqualTo(FileState.REJECTED);
        assertThat(stored.rejectReason()).contains("does not match");
        assertThat(jdbc.sql("select storage_key from file_object where id = :id").param("id", id)
                .query(String.class).optional()).isEmpty();
        assertCode(() -> files.open(driver, id), ErrorCode.NOT_FOUND);
        assertCode(() -> files.requireAttachable(driver, id, FilePurpose.DRIVER_DOCUMENT), ErrorCode.STATE_CONFLICT);
    }

    @Test
    void pdfWithActiveContentIsRejected() {
        byte[] pdf = "%PDF-1.7\n1 0 obj << /OpenAction << /S /JavaScript /JS (app.alert(1)) >> >> endobj"
                .getBytes(StandardCharsets.ISO_8859_1);
        UUID id = open("application/pdf", pdf.length);

        assertThat(upload(id, "application/pdf", pdf).state()).isEqualTo(FileState.REJECTED);
    }

    @Test
    void bodyLargerThanDeclaredIsRejected() {
        UUID id = open("image/png", 8);

        StoredFile stored = files.upload(driver, id, "image/png", -1, new ByteArrayInputStream(PNG));

        assertThat(stored.state()).isEqualTo(FileState.REJECTED);
        assertThat(stored.rejectReason()).contains("larger");
    }

    @Test
    void declaredLengthOverTheSessionIsRefusedBeforeReading() {
        UUID id = open("image/png", 8);

        assertCode(() -> files.upload(driver, id, "image/png", 1000, new ByteArrayInputStream(PNG)),
                ErrorCode.VALIDATION_FAILED);
    }

    @Test
    void sessionIsSingleUseAndBoundToItsType() {
        UUID id = open("image/png", PNG.length);

        assertCode(() -> upload(id, "image/jpeg", PNG), ErrorCode.VALIDATION_FAILED);
        upload(id, "image/png", PNG);
        assertCode(() -> upload(id, "image/png", PNG), ErrorCode.STATE_CONFLICT);
    }

    @Test
    void expiredSessionCannotBeUsed() {
        UUID id = open("image/png", PNG.length);
        jdbc.sql("update file_object set upload_expires_at = now() - interval '1 second' where id = :id")
                .param("id", id).update();

        assertCode(() -> upload(id, "image/png", PNG), ErrorCode.STATE_CONFLICT);
    }

    @Test
    void anotherSubjectSeesNothing() {
        UUID id = open("image/png", PNG.length);
        Actor stranger = new Actor(SubjectType.DRIVER, UUID.randomUUID());
        Actor sameIdOtherType = new Actor(SubjectType.CLIENT, driver.id());

        assertCode(() -> files.upload(stranger, id, "image/png", PNG.length, new ByteArrayInputStream(PNG)),
                ErrorCode.NOT_FOUND);
        upload(id, "image/png", PNG);
        assertCode(() -> files.open(stranger, id), ErrorCode.NOT_FOUND);
        assertCode(() -> files.open(sameIdOtherType, id), ErrorCode.NOT_FOUND);
        assertCode(() -> files.requireAttachable(stranger, id, FilePurpose.DRIVER_DOCUMENT), ErrorCode.NOT_FOUND);
    }

    @Test
    void unsupportedTypeOrSizeIsRefused() {
        assertCode(() -> open("text/html", 10), ErrorCode.VALIDATION_FAILED);
        assertCode(() -> open("image/png", 0), ErrorCode.VALIDATION_FAILED);
        assertCode(() -> open("image/png", 50L * 1024 * 1024), ErrorCode.VALIDATION_FAILED);
    }

    @Test
    void repeatedOpenReturnsTheSameSession() {
        UUID command = UUID.randomUUID();

        UploadSession first = files.openUpload(driver, command, FilePurpose.DRIVER_DOCUMENT, "image/png", 100);
        UploadSession again = files.openUpload(driver, command, FilePurpose.DRIVER_DOCUMENT, "image/png", 100);

        assertThat(again).isEqualTo(first);
        assertThat(first.uploadPath()).isEqualTo("/api/driver/v1/uploads/" + first.fileId());
    }
}
