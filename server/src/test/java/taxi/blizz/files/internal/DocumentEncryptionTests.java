package taxi.blizz.files.internal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.files.FileService;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.SubjectType;

/**
 * Re-encryption of the driver documents stored in the clear before issue #135 (E3, E4): a crash after the encrypted
 * copy or after the row switch leaves a readable file and the next run finishes; two runs at once encrypt each file
 * once; a download meanwhile returns the right bytes; a missing or unreadable plain file is retried, never marked
 * encrypted and never deleted. The scheduled job is off here; the test runs it.
 */
@SpringBootTest(properties = "blizz.files.document-encryption.enabled=false")
@Import(TestcontainersConfiguration.class)
class DocumentEncryptionTests {

    @Autowired
    DocumentEncryption job;
    @Autowired
    FileService files;
    @Autowired
    JdbcClient jdbc;
    @Value("${blizz.files.local-dir}")
    Path localDir;

    private final Actor driver = new Actor(SubjectType.DRIVER, UUID.randomUUID());

    @AfterEach
    void noHook() {
        job.steps(null);
    }

    private Path path(String key) {
        return localDir.toAbsolutePath().normalize().resolve(key);
    }

    /** A SAFE driver document as stored before #135: a plain file and a row without encryption. */
    private record Plain(UUID id, String key, byte[] bytes) {
    }

    private Plain plainDocument() throws Exception {
        UUID id = UUID.randomUUID();
        String key = "driver_document/2026-01/" + id;
        byte[] bytes = ("%PDF-1.7\n% licence of " + id + "\n%%EOF").getBytes(StandardCharsets.ISO_8859_1);
        Files.createDirectories(path(key).getParent());
        Files.write(path(key), bytes);
        jdbc.sql("""
                        insert into file_object (id, owner_type, owner_id, purpose, declared_content_type,
                                                 declared_size_bytes, detected_content_type, size_bytes, storage_key,
                                                 state, scan_engine, upload_expires_at, created_at, uploaded_at,
                                                 scanned_at)
                        values (:id, 'DRIVER', :owner, 'DRIVER_DOCUMENT', 'application/pdf', :size, 'application/pdf',
                                :size, :key, 'SAFE', 'structural', now(), now(), now(), now())""")
                .param("id", id).param("owner", driver.id()).param("size", bytes.length).param("key", key).update();
        return new Plain(id, key, bytes);
    }

    private byte[] download(UUID id) throws Exception {
        try (InputStream in = files.open(driver, id).stream()) {
            return in.readAllBytes();
        }
    }

    private String column(UUID id, String column) {
        return jdbc.sql("select " + column + "::text from file_object where id = :id").param("id", id)
                .query((rs, i) -> java.util.Optional.ofNullable(rs.getString(1))).single().orElse(null);
    }

    /** Lets the next run take the file now instead of after its lease or back-off. */
    private void dueNow(UUID id) {
        jdbc.sql("update file_object set next_encrypt_at = now() - interval '1 second' where id = :id")
                .param("id", id).update();
    }

    private void assertEncrypted(Plain doc) throws Exception {
        assertThat(column(doc.id(), "encryption")).isEqualTo("AES256GCM-STREAM-1");
        assertThat(column(doc.id(), "storage_key")).isEqualTo(doc.key() + DocumentEncryption.SUFFIX);
        assertThat(column(doc.id(), "plain_key_pending_delete")).isNull();
        assertThat(Files.exists(path(doc.key()))).as("the plain file is gone").isFalse();
        byte[] onDisk = Files.readAllBytes(path(doc.key() + DocumentEncryption.SUFFIX));
        assertThat(new String(onDisk, StandardCharsets.ISO_8859_1)).doesNotStartWith("%PDF")
                .doesNotContain(doc.id().toString());
        assertThat(download(doc.id())).isEqualTo(doc.bytes());
    }

    // ------------------------------------------------------------ E3

    @Test
    void aCrashAfterTheEncryptedCopyLeavesTheFileReadableAndTheNextRunFinishes() throws Exception {
        Plain doc = plainDocument();
        job.steps(step -> {
            if (step.equals("written")) {
                throw new IllegalStateException("crash after the copy");
            }
        });
        assertThatThrownBy(() -> job.encryptDue()).hasMessage("crash after the copy");

        assertThat(column(doc.id(), "encryption")).isNull();
        assertThat(column(doc.id(), "storage_key")).isEqualTo(doc.key());
        assertThat(Files.exists(path(doc.key()))).as("the plain file is still there").isTrue();
        assertThat(download(doc.id())).isEqualTo(doc.bytes());

        job.steps(null);
        dueNow(doc.id());   // the lease of the crashed run ran out
        job.encryptDue();
        assertEncrypted(doc);
    }

    @Test
    void aCrashAfterTheSwitchLeavesTheFileReadableAndTheNextRunRemovesThePlainFile() throws Exception {
        Plain doc = plainDocument();
        job.steps(step -> {
            if (step.equals("switched")) {
                throw new IllegalStateException("crash after the switch");
            }
        });
        assertThatThrownBy(() -> job.encryptDue()).hasMessage("crash after the switch");

        assertThat(column(doc.id(), "encryption")).isEqualTo("AES256GCM-STREAM-1");
        assertThat(column(doc.id(), "plain_key_pending_delete")).isEqualTo(doc.key());
        assertThat(download(doc.id())).as("read from the encrypted copy").isEqualTo(doc.bytes());

        job.steps(null);
        job.encryptDue();
        assertEncrypted(doc);
    }

    @Test
    void twoRunsAtOnceEncryptEachFileOnce() throws Exception {
        List<Plain> docs = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            docs.add(plainDocument());
        }
        ExecutorService pool = Executors.newFixedThreadPool(2);
        try {
            CountDownLatch start = new CountDownLatch(1);
            Future<Integer> first = pool.submit(() -> {
                start.await();
                return job.encryptDue();
            });
            Future<Integer> second = pool.submit(() -> {
                start.await();
                return job.encryptDue();
            });
            start.countDown();
            assertThat(first.get() + second.get()).isGreaterThanOrEqualTo(6);
        } finally {
            pool.shutdown();
        }
        for (Plain doc : docs) {
            assertEncrypted(doc);
            assertThat(column(doc.id(), "encrypt_attempts")).as("claimed once").isEqualTo("1");
        }
    }

    @Test
    void aDownloadWhileTheFileIsReEncryptedReturnsTheRightBytes() throws Exception {
        Plain doc = plainDocument();
        List<byte[]> seen = new ArrayList<>();
        job.steps(step -> {
            try {
                seen.add(download(doc.id()));
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        });
        job.encryptDue();
        assertThat(seen).hasSize(2).allSatisfy(bytes -> assertThat(bytes).isEqualTo(doc.bytes()));
        assertEncrypted(doc);
    }

    // ------------------------------------------------------------ E4

    @Test
    void aMissingOrUnreadablePlainFileIsRetriedNeverMarkedEncryptedNorDeleted() throws Exception {
        Plain missing = plainDocument();
        Files.delete(path(missing.key()));
        Plain unreadable = plainDocument();
        Files.delete(path(unreadable.key()));
        Files.createDirectories(path(unreadable.key()));   // a directory where the file should be

        job.encryptDue();
        for (Plain doc : List.of(missing, unreadable)) {
            assertThat(column(doc.id(), "encryption")).isNull();
            assertThat(column(doc.id(), "storage_key")).isEqualTo(doc.key());
            assertThat(column(doc.id(), "encrypt_attempts")).isEqualTo("1");
            assertThat(jdbc.sql("select next_encrypt_at > now() + interval '20 seconds' from file_object where id = :id")
                    .param("id", doc.id()).query(Boolean.class).single()).as("backed off").isTrue();
            assertThat(Files.exists(path(doc.key() + DocumentEncryption.SUFFIX))).isFalse();
        }
        assertThat(Files.isDirectory(path(unreadable.key()))).as("nothing deleted").isTrue();

        // Retried, with a longer wait, and counted as failing.
        dueNow(missing.id());
        job.encryptDue();
        assertThat(column(missing.id(), "encrypt_attempts")).isEqualTo("2");
        assertThat(jdbc.sql("select next_encrypt_at > now() + interval '50 seconds' from file_object where id = :id")
                .param("id", missing.id()).query(Boolean.class).single()).isTrue();
        assertThat(jdbc.sql("""
                        select count(*) from file_object where id = :id and encryption is null and encrypt_attempts > 1""")
                .param("id", missing.id()).query(Integer.class).single()).as("counted by the failing gauge").isEqualTo(1);
        Files.delete(path(unreadable.key()));
    }
}
