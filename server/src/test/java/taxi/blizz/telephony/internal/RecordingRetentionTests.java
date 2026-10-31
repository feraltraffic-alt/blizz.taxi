package taxi.blizz.telephony.internal;

import static org.assertj.core.api.Assertions.assertThat;

import com.sun.net.httpserver.HttpServer;
import java.net.InetSocketAddress;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.configuration.Integrations;
import taxi.blizz.files.FilePurpose;
import taxi.blizz.files.FileService;
import taxi.blizz.platform.Actor;

/** Real ARI HTTP and local storage: source errors cannot lose their durable retry row. */
@SpringBootTest(properties = {"blizz.retention.enabled=false",
        "blizz.files.local-dir=${java.io.tmpdir}/blizz-retention-recordings"})
@Import(RecordingRetentionTests.Database.class)
class RecordingRetentionTests {

    @org.springframework.boot.test.context.TestConfiguration(proxyBeanMethods = false)
    static class Database {
        @org.springframework.context.annotation.Bean
        @org.springframework.boot.testcontainers.service.connection.ServiceConnection
        org.testcontainers.postgresql.PostgreSQLContainer recordingRetentionPostgres() {
            return new org.testcontainers.postgresql.PostgreSQLContainer(org.testcontainers.utility.DockerImageName
                    .parse("postgis/postgis:18-3.6").asCompatibleSubstituteFor("postgres"));
        }
    }

    @Autowired
    JdbcClient jdbc;
    @Autowired
    FileService files;
    @Autowired
    FakeCallSource fake;
    @Autowired
    PlatformTransactionManager transactions;
    @Value("${blizz.files.local-dir}")
    Path root;
    @Autowired
    org.springframework.context.ApplicationContext context;
    @Autowired
    CallRecordings recordings;

    @org.junit.jupiter.api.AfterEach
    void cleanOwnDatabase() {
        jdbc.sql("delete from call_recording").update();
        jdbc.sql("delete from file_object").update();
    }

    void keepRecordingsForever() {
        var json = new tools.jackson.databind.json.JsonMapper();
        var days = taxi.blizz.platform.RetentionPolicy.KINDS.stream()
                .collect(java.util.stream.Collectors.toMap(k -> k, k -> 0));
        jdbc.sql("""
                        insert into retention_settings(version,days,changed_by,reason,changed_at)
                        select coalesce(max(version),0)+1,cast(:days as jsonb),gen_random_uuid(),
                          'Keep recordings forever',now() from retention_settings
                        """)
                .param("days", json.writeValueAsString(days)).update();
        org.springframework.test.util.ReflectionTestUtils.invokeMethod(context.getBean("retentionRunner"),
                "runKindAt", "call_recordings", OffsetDateTime.now().plusDays(2));
    }

    Actor listener() {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user(id,login,name,role,permissions,all_cities,state,created_at,updated_at)
                        values(:id,:login,'Listener','ADMIN',:permissions,true,'ACTIVE',now(),now())
                        """)
                .param("id", id).param("login", "retention-listener-" + id)
                .param("permissions", new String[] {taxi.blizz.telephony.Calls.LISTEN_PERMISSION}).update();
        return new Actor(taxi.blizz.platform.SubjectType.STAFF, id);
    }

    UUID recording(String state, UUID file, OffsetDateTime at) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into call(id,channel_id,called_number,state,started_at,ended_at)
                        values(:id,:channel,'retention','ENDED',:at,:at)""")
                .param("id", id).param("channel", id.toString()).param("at", at).update();
        new TransactionTemplate(transactions).executeWithoutResult(status -> {
            jdbc.sql("""
                            insert into call_recording(call_id,state,file_id,next_attempt_at,created_at)
                            values(:id,:state,:file,:at,:at)""")
                    .param("id", id).param("state", state).param("file", file).param("at", at).update();
            if (file != null) {
                files.markAttached(Actor.system(), file, FilePurpose.CALL_RECORDING);
            }
        });
        return id;
    }

    long count(UUID id) {
        return jdbc.sql("select count(*) from call_recording where call_id=:id").param("id", id).query(Long.class)
                .single();
    }

    final class Ari implements AutoCloseable {
        final HttpServer server;
        final AtomicInteger status = new AtomicInteger(204), calls = new AtomicInteger();
        final AtomicBoolean copy = new AtomicBoolean(true);
        final AtomicReference<Throwable> problem = new AtomicReference<>();

        Ari() throws Exception {
            server = HttpServer.create(new InetSocketAddress("127.0.0.1", 0), 0);
            server.createContext("/ari/recordings/stored/", exchange -> {
                try {
                    if (exchange.getRequestMethod().equals("GET")) {
                        byte[] wav = WavFiles.tone(1);
                        exchange.sendResponseHeaders(200, wav.length);
                        exchange.getResponseBody().write(wav);
                        return;
                    }
                    assertThat(exchange.getRequestMethod()).isEqualTo("DELETE");
                    assertThat(jdbc.sql("""
                                    select count(*) from pg_stat_activity
                                    where datname=current_database() and state='idle in transaction'""")
                            .query(Long.class).single()).as("no DB transaction held across ARI").isZero();
                    String name = exchange.getRequestURI().getPath().substring("/ari/recordings/stored/".length());
                    assertThat(count(UUID.fromString(name))).as("metadata is retained until source deletion")
                            .isEqualTo(1);
                    calls.incrementAndGet();
                    if (status.get() == 204) {
                        copy.set(false);
                    }
                    exchange.sendResponseHeaders(status.get(), -1);
                } catch (Throwable ex) {
                    problem.set(ex);
                    exchange.sendResponseHeaders(500, -1);
                } finally {
                    exchange.close();
                }
            });
            server.start();
        }

        AriRecordingSource source() {
            Map<String, String> values = Map.of(
                    Integrations.OTP_ASTERISK_ARI_URL, "http://127.0.0.1:" + server.getAddress().getPort(),
                    Integrations.OTP_ASTERISK_ARI_USER, "retention-test",
                    Integrations.OTP_ASTERISK_ARI_PASSWORD, "test-only");
            Integrations integrations = org.mockito.Mockito.mock(Integrations.class);
            org.mockito.Mockito.when(integrations.value(org.mockito.ArgumentMatchers.anyString()))
                    .thenAnswer(invocation -> Optional.ofNullable(values.get(invocation.getArgument(0, String.class))));
            return new AriRecordingSource(integrations);
        }

        CallRecordingRetention work() {
            TelephonyProperties live = new TelephonyProperties("LIVE", "https://example.invalid",
                    Duration.ofSeconds(30), false, Duration.ofHours(4), false, false, Duration.ofHours(1), 1000000,
                    "PJSIP/{extension}", "blizz-outgoing", List.of());
            return new CallRecordingRetention(jdbc, files, live, source(), fake, transactions);
        }

        @Override
        public void close() {
            server.stop(0);
            assertThat(problem.get()).isNull();
        }
    }

    @Test
    void refusedSourceCopyRetriesAfterAnHttpFailureAndIsDeletedBeforeItsRow() throws Exception {
        OffsetDateTime now = OffsetDateTime.now();
        UUID id = recording("NONE", null, now.minusDays(400));
        try (Ari ari = new Ari()) {
            ari.status.set(503);
            var failed = ari.work().run(now.minusDays(30), now, 1000);
            assertThat(failed.failures()).isEqualTo(1);
            assertThat(count(id)).isEqualTo(1);
            assertThat(ari.copy).isTrue();
            ari.status.set(204);
            var success = ari.work().run(now.minusDays(30), now.plusMinutes(2), 1000);
            assertThat(success.deleted()).isEqualTo(1);
            assertThat(count(id)).isZero();
            assertThat(ari.copy).isFalse();
            assertThat(ari.calls).hasValue(2);
        }
    }

    @Test
    void aStoredFileFailureKeepsBothMetadataRowsAndRetriesAnAlreadyAbsentSource() throws Exception {
        OffsetDateTime now = OffsetDateTime.now();
        var stored = files.storeSystemFile(FilePurpose.CALL_RECORDING, "audio/wav",
                new java.io.ByteArrayInputStream(WavFiles.tone(1)), 1000000);
        UUID id = recording("STORED", stored.fileId(), now.minusDays(400));
        String key = jdbc.sql("select storage_key from file_object where id=:id").param("id", stored.fileId())
                .query(String.class).single();
        Path path = root.resolve(key);
        Files.delete(path);
        Files.createDirectory(path);
        Files.writeString(path.resolve("blocked"), "cannot delete");
        try (Ari ari = new Ari()) {
            var failed = ari.work().run(now.minusDays(30), now, 1000);
            assertThat(failed.failures()).isEqualTo(1);
            assertThat(count(id)).isEqualTo(1);
            assertThat(ari.copy).isFalse();
            assertThat(jdbc.sql("select count(*) from file_object where id=:id").param("id", stored.fileId())
                    .query(Long.class).single()).isEqualTo(1);
            Files.delete(path.resolve("blocked"));
            ari.status.set(404);
            jdbc.sql("update file_object set retention_until=now()-interval '1 second' where id=:id")
                    .param("id", stored.fileId()).update();
            var success = ari.work().run(now.minusDays(30), now.plusMinutes(2), 1000);
            assertThat(success.deleted()).isEqualTo(1);
            assertThat(count(id)).isZero();
            assertThat(Files.exists(path)).isFalse();
            assertThat(jdbc.sql("select count(*) from file_object where id=:id").param("id", stored.fileId())
                    .query(Long.class).single()).isZero();
        }
    }

    @Test
    void untouchedRecordingsPlayAndPendingRecordingsFetchAfterAFailureAndZeroPolicy() throws Exception {
        OffsetDateTime now = OffsetDateTime.now();
        byte[] wav = WavFiles.tone(1);
        var stored = files.storeSystemFile(FilePurpose.CALL_RECORDING, "audio/wav",
                new java.io.ByteArrayInputStream(wav), 1000000);
        UUID playable = recording("STORED", stored.fileId(), now.minusDays(400));
        UUID pending = recording("PENDING", null, now.minusDays(400));
        try (Ari ari = new Ari()) {
            ari.status.set(503);
            assertThat(ari.work().run(now.minusDays(30), now, 1000).failures()).isEqualTo(2);
            keepRecordingsForever();
            try (var in = recordings.listen(listener(), playable).stream()) {
                assertThat(in.readAllBytes()).isEqualTo(wav);
            }
            assertThat(recordings.fetchDue()).isEqualTo(1);
            assertThat(jdbc.sql("select state from call_recording where call_id=:id").param("id", pending)
                    .query(String.class).single()).isEqualTo("STORED");
            assertThat(jdbc.sql("select count(*) from call_recording where retention_claim is null")
                    .query(Long.class).single()).isEqualTo(2);
            assertThat(ari.calls).hasValue(2);
        }
    }

    @Test
    void anAbsentSourceAndUntouchedLocalFileFailureAlsoReleaseTheRecordingFence() throws Exception {
        OffsetDateTime now = OffsetDateTime.now();
        byte[] wav = WavFiles.tone(1);
        var stored = files.storeSystemFile(FilePurpose.CALL_RECORDING, "audio/wav",
                new java.io.ByteArrayInputStream(wav), 1000000);
        UUID id = recording("STORED", stored.fileId(), now.minusDays(400));
        String key = jdbc.sql("select storage_key from file_object where id=:id").param("id", stored.fileId())
                .query(String.class).single();
        String stageKey = "call_recording/retention/" + UUID.randomUUID();
        Path stage = root.resolve("staging").resolve(
                UUID.nameUUIDFromBytes(stageKey.getBytes(java.nio.charset.StandardCharsets.UTF_8)) + ".bin");
        Files.createDirectory(stage);
        Files.writeString(stage.resolve("blocked"), "cannot delete");
        jdbc.sql("update file_object set staging_key=:key where id=:id").param("key", stageKey)
                .param("id", stored.fileId()).update();
        try (Ari ari = new Ari()) {
            ari.status.set(404);
            assertThat(ari.work().run(now.minusDays(30), now, 1000).failures()).isEqualTo(1);
            // Parent retry can become due before the file's independent deadline; this is still an untouched failure.
            assertThat(ari.work().run(now.minusDays(30), now.plusMinutes(2), 1000).failures()).isEqualTo(1);
            assertThat(jdbc.sql("select retention_claim is null from call_recording where call_id=:id")
                    .param("id", id).query(Boolean.class).single()).isTrue();
            assertThat(jdbc.sql("select retention_claim is null from file_object where id=:id")
                    .param("id", stored.fileId()).query(Boolean.class).single()).isTrue();
            keepRecordingsForever();
            try (var in = recordings.listen(listener(), id).stream()) {
                assertThat(in.readAllBytes()).isEqualTo(wav);
            }
        } finally {
            Files.delete(stage.resolve("blocked"));
            Files.delete(stage);
            Files.deleteIfExists(root.resolve(key));
        }
    }

    @Test
    void providerFailureBudgetYieldsAndBackoffLetsUntouchedRecordingsProceed() throws Exception {
        OffsetDateTime now = OffsetDateTime.now();
        List<UUID> ids = java.util.stream.IntStream.range(0, 4)
                .mapToObj(i -> recording("NONE", null, now.minusDays(400))).toList();
        try (Ari ari = new Ari()) {
            ari.status.set(503);
            var first = ari.work().run(now.minusDays(30), now, 1000);
            assertThat(first.failures()).isEqualTo(3);
            assertThat(first.examined()).isEqualTo(3);
            assertThat(ari.calls).hasValue(3);
            ari.status.set(204);
            assertThat(ari.work().run(now.minusDays(30), now, 1000).deleted()).isEqualTo(1);
            assertThat(ari.calls).hasValue(4);
            ari.status.set(503);
            assertThat(ari.work().run(now.minusDays(30), now.plusMinutes(1), 1000).failures()).isEqualTo(3);
            assertThat(jdbc.sql("select count(*) from call_recording where retention_until>:at")
                    .param("at", now.plusMinutes(2)).query(Long.class).single()).isEqualTo(3);
        }
    }

    @Test
    void anActiveFetchIsKeptAndAnExpiredDeleteClaimIsRecovered() throws Exception {
        OffsetDateTime now = OffsetDateTime.now();
        UUID active = recording("PENDING", null, now.minusDays(400));
        UUID expired = recording("NONE", null, now.minusDays(400));
        jdbc.sql("update call_recording set fetching_until=:until where call_id=:id").param("until", now.plusDays(1))
                .param("id", active).update();
        jdbc.sql("update call_recording set retention_claim=:claim,retention_until=:until where call_id=:id")
                .param("claim", UUID.randomUUID()).param("until", now.minusSeconds(1)).param("id", expired).update();
        try (Ari ari = new Ari()) {
            assertThat(ari.work().run(now.minusDays(30), now, 1000).deleted()).isEqualTo(1);
            assertThat(count(active)).isEqualTo(1);
            assertThat(count(expired)).isZero();
            assertThat(ari.calls).hasValue(1);
        }
    }

    @Test
    void anUnsupportedSourceNameIsAFailureInsteadOfAFalseSuccessfulDeletion() {
        var source = new AriRecordingSource(org.mockito.Mockito.mock(Integrations.class));
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> source.discard("unsupported/name"))
                .isInstanceOf(java.io.IOException.class).hasMessage("Unsupported stored recording name");
    }

    @Test
    void cleanupAlsoRemovesTheDownloadedAsteriskTemporaryCopy() throws Exception {
        OffsetDateTime now = OffsetDateTime.now();
        UUID id = recording("NONE", null, now.minusDays(400));
        try (Ari ari = new Ari()) {
            Path downloaded = ari.source().fetch(id.toString()).orElseThrow();
            try {
                assertThat(Files.exists(downloaded)).isTrue();
                assertThat(Files.getPosixFilePermissions(downloaded)).containsExactlyInAnyOrder(
                        java.nio.file.attribute.PosixFilePermission.OWNER_READ,
                        java.nio.file.attribute.PosixFilePermission.OWNER_WRITE);
                assertThat(ari.work().run(now.minusDays(30), now, 1000).deleted()).isEqualTo(1);
                assertThat(Files.exists(downloaded)).as("downloaded source bytes removed before recording metadata")
                        .isFalse();
                assertThat(count(id)).isZero();
            } finally {
                Files.deleteIfExists(downloaded);
            }
        }
    }

    /** A deleted rider's recording (issue #144): it goes although the policy keeps recordings for ever. */
    @Test
    void anErasedCallersRecordingGoesWhateverTheTermAndOthersStay() throws Exception {
        keepRecordingsForever();
        OffsetDateTime now = OffsetDateTime.now();
        var stored = files.storeSystemFile(FilePurpose.CALL_RECORDING, "audio/wav",
                new java.io.ByteArrayInputStream(WavFiles.tone(1)), 1000000);
        UUID erased = recording("STORED", stored.fileId(), now.minusMinutes(5));
        UUID pending = recording("PENDING", null, now.minusMinutes(5));
        UUID kept = recording("NONE", null, now.minusMinutes(5));
        jdbc.sql("update call_recording set erase_requested_at=now() where call_id in (:ids)")
                .param("ids", List.of(erased, pending)).update();
        try (Ari ari = new Ari()) {
            var result = ari.work().runErased(now.plusSeconds(1), 1000);
            assertThat(result.deleted()).isEqualTo(2);
            assertThat(count(erased)).isZero();
            assertThat(count(pending)).isZero();
            assertThat(count(kept)).isEqualTo(1);
            assertThat(jdbc.sql("select count(*) from file_object where id=:id").param("id", stored.fileId())
                    .query(Long.class).single()).as("the stored file goes with it").isZero();
            assertThat(ari.calls).as("each copy on Asterisk is discarded").hasValue(2);
            assertThat(ari.work().runErased(now.plusSeconds(2), 1000).deleted()).as("a repeat").isZero();
        }
    }
}
