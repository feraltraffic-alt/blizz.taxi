package taxi.blizz.files.internal;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.files.FakeClamd;
import taxi.blizz.files.FilePurpose;
import taxi.blizz.files.FileService;
import taxi.blizz.files.FileState;
import taxi.blizz.files.StoredFile;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.SubjectType;

/**
 * The rescan of quarantined files on several instances (review of #131): two runs at once scan each file once, and a
 * file claimed by a worker that died is claimed again only after its lease. The scheduled job is off here; the test
 * calls {@link QuarantineRescan#rescanDue} itself.
 */
@SpringBootTest(properties = "blizz.files.rescan.enabled=false")
@Import(TestcontainersConfiguration.class)
class QuarantineRescanTests {

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
    QuarantineRescan rescan;
    @Autowired
    JdbcClient jdbc;

    @Autowired FileRetirement retirement;
    @Autowired FileStorage storage;
    @org.springframework.test.context.bean.override.mockito.MockitoSpyBean ContentScanner antivirus;
    @org.springframework.beans.factory.annotation.Value("${blizz.files.local-dir}") java.nio.file.Path root;

    private final Actor driver = new Actor(SubjectType.DRIVER, UUID.randomUUID());

    private UUID quarantined(String payload) throws Exception {
        clamd.stop();
        byte[] body = FakeClamd.jpegCarrying(payload);
        UUID id = files.openUpload(driver, UUID.randomUUID(), FilePurpose.DRIVER_DOCUMENT, "image/jpeg", body.length)
                .fileId();
        StoredFile stored = files.upload(driver, id, "image/jpeg", body.length, new ByteArrayInputStream(body));
        assertThat(stored.state()).isEqualTo(FileState.QUARANTINE);
        clamd.restart();
        return id;
    }

    private void dueNow(List<UUID> ids) {
        jdbc.sql("update file_object set next_scan_at = now() - interval '1 second' where id = any(:ids)")
                .param("ids", ids.toArray(UUID[]::new)).update();
    }

    private String state(UUID id) {
        return jdbc.sql("select state from file_object where id = :id").param("id", id).query(String.class).single();
    }

    @Test
    void twoRunsAtOnceScanEachFileOnce() throws Exception {
        List<UUID> ids = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            ids.add(quarantined("file " + i + " " + UUID.randomUUID()));
        }
        dueNow(ids);
        int before = clamd.scans();

        ExecutorService pool = Executors.newFixedThreadPool(2);
        try {
            CountDownLatch start = new CountDownLatch(1);
            Future<Integer> first = pool.submit(() -> {
                start.await();
                return rescan.rescanDue();
            });
            Future<Integer> second = pool.submit(() -> {
                start.await();
                return rescan.rescanDue();
            });
            start.countDown();
            assertThat(first.get() + second.get()).as("verdicts").isEqualTo(6);
        } finally {
            pool.shutdown();
        }
        assertThat(clamd.scans() - before).as("each file scanned once").isEqualTo(6);
        assertThat(ids).allSatisfy(id -> assertThat(state(id)).isEqualTo("SAFE"));
    }

    @Test
    void aFileClaimedByAWorkerThatDiedIsClaimedAgainAfterTheLease() throws Exception {
        UUID id = quarantined("claimed " + UUID.randomUUID());
        // What a claim does, by a worker that then died: the next attempt only after the lease.
        jdbc.sql("""
                        update file_object set scan_attempts = scan_attempts + 1,
                                               next_scan_at = now() + make_interval(secs => :lease)
                        where id = :id""")
                .param("lease", QuarantineRescan.LEASE.toSeconds()).param("id", id).update();
        int before = clamd.scans();

        rescan.rescanDue();
        assertThat(state(id)).as("still leased").isEqualTo("QUARANTINE");
        assertThat(clamd.scans()).isEqualTo(before);

        // The lease ran out.
        dueNow(List.of(id));
        rescan.rescanDue();
        assertThat(state(id)).isEqualTo("SAFE");
        assertThat(clamd.scans()).isEqualTo(before + 1);
    }

    /** Issue #135, E2: a document waiting in quarantine is stored encrypted; the rescan decrypts its copy to scan it. */
    @Test
    void anEncryptedDocumentInQuarantineIsDecryptedForTheRescan() throws Exception {
        byte[] cleanBody = FakeClamd.jpegCarrying("clean " + UUID.randomUUID());
        UUID infected = quarantined(FakeClamd.EICAR);
        clamd.stop();
        UUID clean = files.openUpload(driver, UUID.randomUUID(), FilePurpose.DRIVER_DOCUMENT, "image/jpeg",
                cleanBody.length).fileId();
        assertThat(files.upload(driver, clean, "image/jpeg", cleanBody.length, new ByteArrayInputStream(cleanBody))
                .state()).isEqualTo(FileState.QUARANTINE);
        clamd.restart();
        assertThat(jdbc.sql("select count(*) from file_object where id in (:a, :b) and encryption = 'AES256GCM-STREAM-1'")
                .param("a", infected).param("b", clean).query(Integer.class).single())
                .as("both stored encrypted while waiting").isEqualTo(2);

        dueNow(List.of(infected, clean));
        rescan.rescanDue();

        assertThat(state(infected)).as("EICAR found in the decrypted copy").isEqualTo("REJECTED");
        assertThat(state(clean)).isEqualTo("SAFE");
        try (java.io.InputStream in = files.open(driver, clean).stream()) {
            assertThat(in.readAllBytes()).isEqualTo(cleanBody);
        }
    }

    private record RescanPause(CountDownLatch entered, CountDownLatch release,
                               java.util.concurrent.atomic.AtomicReference<java.nio.file.Path> path) {
    }

    private RescanPause pauseAfterVerdict(boolean secondUnavailable) throws Exception {
        RescanPause pause = new RescanPause(new CountDownLatch(1),new CountDownLatch(1),
                new java.util.concurrent.atomic.AtomicReference<>());
        var calls = new java.util.concurrent.atomic.AtomicInteger();
        org.mockito.Mockito.doAnswer(invocation -> {
            if (calls.incrementAndGet()>1 && secondUnavailable) throw new ContentScanner.Unavailable("Second scan unavailable");
            Object result = invocation.callRealMethod();
            pause.path().set(invocation.getArgument(0,java.nio.file.Path.class));
            pause.entered().countDown();
            if (!pause.release().await(10,java.util.concurrent.TimeUnit.SECONDS)) throw new AssertionError("Rescan control timed out");
            return result;
        }).when(antivirus).scan(org.mockito.ArgumentMatchers.any());
        return pause;
    }

    private void fence(UUID id) {
        jdbc.sql("update file_object set retention_claim=:claim,retention_until=now()+interval '10 minutes' where id=:id")
                .param("claim",UUID.randomUUID()).param("id",id).update();
    }

    private void clean(UUID id) throws Exception {
        var keys = jdbc.sql("select storage_key,staging_key from file_object where id=:id").param("id",id)
                .query((rs,i)->java.util.Arrays.asList(rs.getString(1),rs.getString(2))).list();
        for (var row : keys) for (String key : row) if (key!=null) storage.delete(key);
        jdbc.sql("delete from file_object where id=:id").param("id",id).update();
    }

    @Test
    void retentionRemovesTheRegisteredRescanCopyBeforeItsMetadata() throws Exception {
        UUID id = quarantined("copy " + UUID.randomUUID());
        jdbc.sql("update file_object set quarantine_at=now()-interval '400 days' where id=:id").param("id",id).update();
        dueNow(List.of(id));
        RescanPause pause = pauseAfterVerdict(false);
        ExecutorService worker = Executors.newSingleThreadExecutor();
        Future<Integer> result = worker.submit(rescan::rescanDue);
        try {
            assertThat(pause.entered().await(10,java.util.concurrent.TimeUnit.SECONDS)).isTrue();
            assertThat(java.nio.file.Files.exists(pause.path().get())).isTrue();
            String registeredStage = jdbc.sql("select staging_key from file_object where id=:id")
                    .param("id",id).query(String.class).single();
            var now = java.time.OffsetDateTime.now();
            assertThat(retirement.run("quarantined_files",now.minusDays(1),now,1000).deleted()).isEqualTo(1);
            assertThat(java.nio.file.Files.exists(pause.path().get())).as("private rescan bytes removed before row").isFalse();
            assertThat(registeredStage).startsWith("quarantine_scan/");
            assertThat(jdbc.sql("select count(*) from file_object where id=:id").param("id",id).query(Long.class).single()).isZero();
            pause.release().countDown();
            assertThat(result.get(10,java.util.concurrent.TimeUnit.SECONDS)).as("a removed row got no SAFE verdict").isZero();
        } finally {
            pause.release().countDown();worker.shutdownNow();worker.awaitTermination(10,java.util.concurrent.TimeUnit.SECONDS);clean(id);
        }
    }

    @org.junit.jupiter.params.ParameterizedTest
    @org.junit.jupiter.params.provider.ValueSource(booleans={false,true})
    void aRetirementFenceStopsARescanBeforeClaimAndBeforeVerdict(boolean alreadyScanning) throws Exception {
        UUID id = quarantined("fenced " + UUID.randomUUID());dueNow(List.of(id));
        int before = clamd.scans();
        if (!alreadyScanning) {
            try {
                fence(id);
                assertThat(rescan.rescanDue()).isZero();
                assertThat(clamd.scans()).as("a retired file is not claimed for scanning").isEqualTo(before);
                assertThat(state(id)).isEqualTo("QUARANTINE");
            } finally { clean(id); }
            return;
        }
        RescanPause pause = pauseAfterVerdict(false);
        ExecutorService worker = Executors.newSingleThreadExecutor();
        Future<Integer> result = worker.submit(rescan::rescanDue);
        try {
            assertThat(pause.entered().await(10,java.util.concurrent.TimeUnit.SECONDS)).isTrue();
            fence(id);pause.release().countDown();
            assertThat(result.get(10,java.util.concurrent.TimeUnit.SECONDS)).isZero();
            assertThat(state(id)).as("late SAFE must not overwrite a retirement claim").isEqualTo("QUARANTINE");
            assertThat(clamd.scans()).isEqualTo(before+1);
        } finally {
            pause.release().countDown();worker.shutdownNow();worker.awaitTermination(10,java.util.concurrent.TimeUnit.SECONDS);clean(id);
        }
    }

    @Test
    void anExpiredWorkersVerdictCannotReplaceANewerUnsettledAttempt() throws Exception {
        UUID id = quarantined("late " + UUID.randomUUID());dueNow(List.of(id));
        RescanPause pause = pauseAfterVerdict(true);
        ExecutorService worker = Executors.newSingleThreadExecutor();
        Future<Integer> old = worker.submit(rescan::rescanDue);
        try {
            assertThat(pause.entered().await(10,java.util.concurrent.TimeUnit.SECONDS)).isTrue();
            dueNow(List.of(id));
            assertThat(rescan.rescanDue()).as("the new attempt has no antivirus verdict").isZero();
            assertThat(state(id)).isEqualTo("QUARANTINE");
            pause.release().countDown();
            assertThat(old.get(10,java.util.concurrent.TimeUnit.SECONDS)).as("old claim cannot settle newer attempt").isZero();
            assertThat(state(id)).isEqualTo("QUARANTINE");
        } finally {
            pause.release().countDown();worker.shutdownNow();worker.awaitTermination(10,java.util.concurrent.TimeUnit.SECONDS);clean(id);
        }
    }

    @Test
    void aRejectedFilesStorageKeySurvivesARealDeletionFailure() throws Exception {
        UUID id = quarantined(taxi.blizz.files.FakeClamd.EICAR);dueNow(List.of(id));
        String key = jdbc.sql("select storage_key from file_object where id=:id").param("id",id).query(String.class).single();
        java.nio.file.Path target = root.resolve(key);
        org.mockito.Mockito.doAnswer(invocation -> {
            var verdict = (java.util.Optional<?>) invocation.callRealMethod();
            assertThat(verdict).isPresent();
            java.nio.file.Files.delete(target);java.nio.file.Files.createDirectory(target);
            java.nio.file.Files.writeString(target.resolve("blocked"),"undeletable test bytes");
            return verdict;
        }).when(antivirus).scan(org.mockito.ArgumentMatchers.any());
        try {
            assertThat(rescan.rescanDue()).isZero();
            assertThat(state(id)).isEqualTo("REJECTED");
            assertThat(jdbc.sql("select storage_key from file_object where id=:id").param("id",id).query(String.class).single()).isEqualTo(key);
            assertThat(java.nio.file.Files.exists(target.resolve("blocked"))).isTrue();
            java.nio.file.Files.delete(target.resolve("blocked"));
            jdbc.sql("update file_object set uploaded_at=now()-interval '400 days' where id=:id").param("id",id).update();
            var now = java.time.OffsetDateTime.now();
            assertThat(retirement.run("upload_sessions",now.minusDays(1),now,1000).deleted()).isEqualTo(1);
            assertThat(java.nio.file.Files.exists(target)).isFalse();
        } finally {
            java.nio.file.Files.deleteIfExists(target.resolve("blocked"));clean(id);
        }
    }

}
