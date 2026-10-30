package taxi.blizz.files;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.util.HexFormat;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.SubjectType;

/**
 * Driver documents at rest (issue #135, threat model D3, E1): what lies under the files directory is not the
 * document — neither its header nor its content — and the owner still downloads exactly what was uploaded.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class StoredDocumentsTests {

    @Autowired
    FileService files;
    @Autowired
    JdbcClient jdbc;
    @Value("${blizz.files.local-dir}")
    Path localDir;

    private final Actor driver = new Actor(SubjectType.DRIVER, UUID.randomUUID());

    static String sha256(byte[] bytes) throws Exception {
        return HexFormat.of().formatHex(MessageDigest.getInstance("SHA-256").digest(bytes));
    }

    private UUID upload(String type, byte[] body) {
        UUID id = files.openUpload(driver, UUID.randomUUID(), FilePurpose.DRIVER_DOCUMENT, type, body.length).fileId();
        assertThat(files.upload(driver, id, type, body.length, new ByteArrayInputStream(body)).state())
                .isEqualTo(FileState.SAFE);
        return id;
    }

    private byte[] raw(UUID fileId) throws Exception {
        String key = jdbc.sql("select storage_key from file_object where id = :id").param("id", fileId)
                .query(String.class).single();
        return Files.readAllBytes(localDir.toAbsolutePath().normalize().resolve(key));
    }

    private byte[] download(UUID fileId) throws Exception {
        try (InputStream in = files.open(driver, fileId).stream()) {
            return in.readAllBytes();
        }
    }

    @Test
    void aJpegDocumentIsUnreadableOnDiskAndDownloadsUnchanged() throws Exception {
        String marker = "licence-number-AB1234567-" + UUID.randomUUID();
        byte[] jpeg = FakeClamd.jpegCarrying(marker);
        UUID id = upload("image/jpeg", jpeg);

        byte[] onDisk = raw(id);
        assertThat(onDisk[0] == (byte) 0xFF && onDisk[1] == (byte) 0xD8).as("no JPEG header on disk").isFalse();
        assertThat(new String(onDisk, StandardCharsets.ISO_8859_1)).doesNotContain(marker);
        assertThat(jdbc.sql("select encryption from file_object where id = :id").param("id", id)
                .query(String.class).single()).isEqualTo("AES256GCM-STREAM-1");

        byte[] downloaded = download(id);
        assertThat(sha256(downloaded)).isEqualTo(sha256(jpeg));
        assertThat(jdbc.sql("select encode(sha256, 'hex') from file_object where id = :id").param("id", id)
                .query(String.class).single()).as("the hash is of the plain bytes").isEqualTo(sha256(jpeg));
    }

    @Test
    void aPdfDocumentIsUnreadableOnDiskAndDownloadsUnchanged() throws Exception {
        String marker = "Passport-No-FX0099887-" + UUID.randomUUID();
        byte[] pdf = ("%PDF-1.7\n1 0 obj << /Type /Catalog /Title (" + marker + ") >> endobj\n%%EOF")
                .getBytes(StandardCharsets.ISO_8859_1);
        UUID id = upload("application/pdf", pdf);

        byte[] onDisk = raw(id);
        String text = new String(onDisk, StandardCharsets.ISO_8859_1);
        assertThat(text).doesNotStartWith("%PDF").doesNotContain(marker);
        assertThat(sha256(download(id))).isEqualTo(sha256(pdf));
    }
}
