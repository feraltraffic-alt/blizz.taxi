package taxi.blizz.files;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.SubjectType;

/**
 * The antivirus step of uploads (issue #105, threat model D1) through the real ClamAV client against
 * {@link FakeClamd}: SAFE only when the structural check and the scanner pass; a scanner that cannot answer keeps
 * the file in QUARANTINE and the rescan job tries again until it can, never SAFE by default.
 */
@SpringBootTest(properties = "blizz.files.rescan.interval=PT0.2S")
@Import(TestcontainersConfiguration.class)
class ContentScannerTests {

    static FakeClamd clamd;

    @DynamicPropertySource
    static void clamav(DynamicPropertyRegistry registry) throws Exception {
        clamd = FakeClamd.start();
        registry.add("blizz.files.clamav.address", clamd::address);
    }

    @AfterAll
    static void stopClamd() throws Exception {
        clamd.stop();
    }

    @Autowired
    FileService files;
    @Autowired
    JdbcClient jdbc;

    private final Actor driver = new Actor(SubjectType.DRIVER, UUID.randomUUID());

    @BeforeEach
    void scannerUp() throws Exception {
        clamd.mode(FakeClamd.Mode.NORMAL);
        clamd.restart();
    }

    /** A JPEG whose image data carries {@code payload}: it passes the type and structure checks. */
    static byte[] jpegCarrying(String payload) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.writeBytes(new byte[] {(byte) 0xFF, (byte) 0xD8});
        segment(out, 0xE0, "JFIF\0\1\1\0\0\1\0\1\0\0");
        segment(out, 0xDB, "quantization-table-bytes");
        segment(out, 0xDA, "\0\1\2\3\4\5");
        out.writeBytes(payload.getBytes(StandardCharsets.ISO_8859_1));
        out.writeBytes(new byte[] {0x11, 0x22, (byte) 0xFF, (byte) 0xD9});
        return out.toByteArray();
    }

    private static void segment(ByteArrayOutputStream out, int marker, String payload) {
        byte[] data = payload.getBytes(StandardCharsets.ISO_8859_1);
        int length = data.length + 2;
        out.writeBytes(new byte[] {(byte) 0xFF, (byte) marker, (byte) (length >> 8), (byte) length});
        out.writeBytes(data);
    }

    private StoredFile upload(String type, byte[] body) {
        UUID id = files.openUpload(driver, UUID.randomUUID(), FilePurpose.DRIVER_DOCUMENT, type, body.length).fileId();
        return files.upload(driver, id, type, body.length, new ByteArrayInputStream(body));
    }

    private String state(UUID fileId) {
        return jdbc.sql("select state from file_object where id = :id").param("id", fileId).query(String.class).single();
    }

    private int attempts(UUID fileId) {
        return jdbc.sql("select scan_attempts from file_object where id = :id").param("id", fileId)
                .query(Integer.class).single();
    }

    /** Makes the file due for the rescan job now, instead of waiting out its back-off. */
    private void dueNow(UUID fileId) {
        jdbc.sql("update file_object set next_scan_at = now() - interval '1 second' where id = :id")
                .param("id", fileId).update();
    }

    private static void waitFor(BooleanSupplier condition, String what) throws InterruptedException {
        long until = System.currentTimeMillis() + 10_000;
        while (!condition.getAsBoolean()) {
            if (System.currentTimeMillis() > until) {
                throw new AssertionError("Timed out waiting for " + what);
            }
            Thread.sleep(100);
        }
    }

    // ------------------------------------------------------------ E1

    @Test
    void eicarInsideAValidJpegIsRejectedByTheScannerAndACleanJpegIsSafe() {
        int before = clamd.scans();
        StoredFile infected = upload("image/jpeg", jpegCarrying(FakeClamd.EICAR));
        assertThat(infected.state()).isEqualTo(FileState.REJECTED);
        assertThat(infected.rejectReason()).isEqualTo("The file did not pass the malware check");
        assertThat(clamd.scans()).as("the scanner was asked").isEqualTo(before + 1);
        assertThat(jdbc.sql("select storage_key from file_object where id = :id").param("id", infected.fileId())
                .query((rs, i) -> java.util.Optional.ofNullable(rs.getString(1))).single()).isEmpty();

        StoredFile clean = upload("image/jpeg", jpegCarrying("plain image data"));
        assertThat(clean.state()).isEqualTo(FileState.SAFE);
        assertThat(clamd.scans()).isEqualTo(before + 2);
        assertThat(jdbc.sql("select scan_engine from file_object where id = :id").param("id", clean.fileId())
                .query(String.class).single()).isEqualTo("structural+clamav");
    }

    @Test
    void eicarBytesDeclaredAsJpegAreRejectedBeforeTheScanner() {
        int before = clamd.scans();
        byte[] eicar = FakeClamd.EICAR.getBytes(StandardCharsets.ISO_8859_1);
        StoredFile file = upload("image/jpeg", eicar);
        assertThat(file.state()).isEqualTo(FileState.REJECTED);
        assertThat(file.rejectReason()).isEqualTo("The content does not match the declared type");
        assertThat(clamd.scans()).isEqualTo(before);
    }

    // ------------------------------------------------------------ E2

    @Test
    void whileTheScannerIsDownNothingBecomesSafeAndItHealsWhenItIsBack() throws Exception {
        clamd.stop();
        StoredFile clean = upload("image/jpeg", jpegCarrying("plain image data"));
        StoredFile infected = upload("image/jpeg", jpegCarrying(FakeClamd.EICAR));
        assertThat(clean.state()).isEqualTo(FileState.QUARANTINE);
        assertThat(infected.state()).isEqualTo(FileState.QUARANTINE);

        // The job keeps trying while it is down: attempts grow, the state does not change.
        for (int round = 0; round < 3; round++) {
            int attempts = attempts(clean.fileId());
            dueNow(clean.fileId());
            dueNow(infected.fileId());
            waitFor(() -> attempts(clean.fileId()) > attempts, "another attempt");
            assertThat(state(clean.fileId())).isEqualTo("QUARANTINE");
            assertThat(state(infected.fileId())).isEqualTo("QUARANTINE");
        }
        assertCannotBeAttached(clean.fileId());

        clamd.restart();
        dueNow(clean.fileId());
        dueNow(infected.fileId());
        waitFor(() -> "SAFE".equals(state(clean.fileId())), "the clean file to be SAFE");
        waitFor(() -> "REJECTED".equals(state(infected.fileId())), "the infected file to be REJECTED");
        assertThat(files.requireAttachable(driver, clean.fileId(), FilePurpose.DRIVER_DOCUMENT).state())
                .isEqualTo(FileState.SAFE);
        assertThat(jdbc.sql("select storage_key from file_object where id = :id").param("id", infected.fileId())
                .query((rs, i) -> java.util.Optional.ofNullable(rs.getString(1))).single())
                .as("the infected bytes are deleted").isEmpty();
    }

    @Test
    void anAnswerThatIsNeitherOkNorFoundOrADroppedConnectionIsNotClean() throws Exception {
        clamd.mode(FakeClamd.Mode.ERROR);
        StoredFile errored = upload("image/jpeg", jpegCarrying("plain image data"));
        assertThat(errored.state()).isEqualTo(FileState.QUARANTINE);

        clamd.mode(FakeClamd.Mode.DROP);
        StoredFile dropped = upload("image/jpeg", jpegCarrying("plain image data"));
        assertThat(dropped.state()).isEqualTo(FileState.QUARANTINE);

        clamd.mode(FakeClamd.Mode.NORMAL);
        dueNow(errored.fileId());
        dueNow(dropped.fileId());
        waitFor(() -> "SAFE".equals(state(errored.fileId())) && "SAFE".equals(state(dropped.fileId())),
                "both files to be SAFE once the scanner answers");
    }

    private void assertCannotBeAttached(UUID fileId) {
        org.assertj.core.api.Assertions.assertThatThrownBy(
                        () -> files.requireAttachable(driver, fileId, FilePurpose.DRIVER_DOCUMENT))
                .isInstanceOf(taxi.blizz.platform.DomainException.class);
    }
}
