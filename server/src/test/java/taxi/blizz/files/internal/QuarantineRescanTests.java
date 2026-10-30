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
}
