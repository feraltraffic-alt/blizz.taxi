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
@SpringBootTest(properties={"blizz.retention.enabled=false","blizz.files.local-dir=${java.io.tmpdir}/blizz-retention-recordings"})
@Import(RecordingRetentionTests.Database.class)
class RecordingRetentionTests {
    @org.springframework.boot.test.context.TestConfiguration(proxyBeanMethods=false)
    static class Database {
        @org.springframework.context.annotation.Bean
        @org.springframework.boot.testcontainers.service.connection.ServiceConnection
        org.testcontainers.postgresql.PostgreSQLContainer recordingRetentionPostgres() {
            return new org.testcontainers.postgresql.PostgreSQLContainer(
                org.testcontainers.utility.DockerImageName.parse("postgis/postgis:18-3.6").asCompatibleSubstituteFor("postgres"));
        }
    }
    @Autowired JdbcClient jdbc;
    @Autowired FileService files;
    @Autowired FakeCallSource fake;
    @Autowired PlatformTransactionManager transactions;
    @Value("${blizz.files.local-dir}") Path root;
    UUID recording(String state,UUID file,OffsetDateTime at) {
        UUID id=UUID.randomUUID();
        jdbc.sql("insert into call(id,channel_id,called_number,state,started_at,ended_at) values(:id,:channel,'retention','ENDED',:at,:at)")
            .param("id",id).param("channel",id.toString()).param("at",at).update();
        new TransactionTemplate(transactions).executeWithoutResult(status->{
            jdbc.sql("insert into call_recording(call_id,state,file_id,next_attempt_at,created_at) values(:id,:state,:file,:at,:at)")
                .param("id",id).param("state",state).param("file",file).param("at",at).update();
            if(file!=null)files.markAttached(Actor.system(),file,FilePurpose.CALL_RECORDING);
        });return id;
    }
    long count(UUID id){return jdbc.sql("select count(*) from call_recording where call_id=:id").param("id",id).query(Long.class).single();}
    final class Ari implements AutoCloseable {
        final HttpServer server;
        final AtomicInteger status=new AtomicInteger(204),calls=new AtomicInteger();
        final AtomicBoolean copy=new AtomicBoolean(true);
        final AtomicReference<Throwable> problem=new AtomicReference<>();
        Ari() throws Exception {
            server=HttpServer.create(new InetSocketAddress("127.0.0.1",0),0);
            server.createContext("/ari/recordings/stored/",exchange->{
                try {
                    if(exchange.getRequestMethod().equals("GET")) {
                        byte[] wav=WavFiles.tone(1);exchange.sendResponseHeaders(200,wav.length);
                        exchange.getResponseBody().write(wav);return;
                    }
                    assertThat(exchange.getRequestMethod()).isEqualTo("DELETE");
                    assertThat(jdbc.sql("select count(*) from pg_stat_activity where datname=current_database() and state='idle in transaction'")
                        .query(Long.class).single()).as("no DB transaction held across ARI").isZero();
                    String name=exchange.getRequestURI().getPath().substring("/ari/recordings/stored/".length());
                    assertThat(count(UUID.fromString(name))).as("metadata is retained until source deletion").isEqualTo(1);
                    calls.incrementAndGet();if(status.get()==204)copy.set(false);
                    exchange.sendResponseHeaders(status.get(),-1);
                } catch(Throwable ex){problem.set(ex);exchange.sendResponseHeaders(500,-1);}
                finally{exchange.close();}
            });server.start();
        }
        AriRecordingSource source() {
            Map<String,String> values=Map.of(Integrations.OTP_ASTERISK_ARI_URL,"http://127.0.0.1:"+server.getAddress().getPort(),
                Integrations.OTP_ASTERISK_ARI_USER,"retention-test",Integrations.OTP_ASTERISK_ARI_PASSWORD,"test-only");
            Integrations integrations=org.mockito.Mockito.mock(Integrations.class);
            org.mockito.Mockito.when(integrations.value(org.mockito.ArgumentMatchers.anyString()))
                .thenAnswer(invocation->Optional.ofNullable(values.get(invocation.getArgument(0,String.class))));
            return new AriRecordingSource(integrations);
        }
        CallRecordingRetention work() {
            TelephonyProperties live=new TelephonyProperties("LIVE","https://example.invalid",Duration.ofSeconds(30),false,
                Duration.ofHours(4),false,false,Duration.ofHours(1),1000000,"PJSIP/{extension}","blizz-outgoing",List.of());
            return new CallRecordingRetention(jdbc,files,live,source(),fake,transactions);
        }
        @Override public void close(){server.stop(0);assertThat(problem.get()).isNull();}
    }
    @Test void refusedSourceCopyRetriesAfterAnHttpFailureAndIsDeletedBeforeItsRow() throws Exception {
        OffsetDateTime now=OffsetDateTime.now();UUID id=recording("NONE",null,now.minusDays(400));
        try(Ari ari=new Ari()) {
            ari.status.set(503);var failed=ari.work().run(now.minusDays(30),now,1000);
            assertThat(failed.failures()).isEqualTo(1);assertThat(count(id)).isEqualTo(1);assertThat(ari.copy).isTrue();
            ari.status.set(204);var success=ari.work().run(now.minusDays(30),now,1000);
            assertThat(success.deleted()).isEqualTo(1);assertThat(count(id)).isZero();assertThat(ari.copy).isFalse();
            assertThat(ari.calls).hasValue(2);
        }
    }
    @Test void aStoredFileFailureKeepsBothMetadataRowsAndRetriesAnAlreadyAbsentSource() throws Exception {
        OffsetDateTime now=OffsetDateTime.now();
        var stored=files.storeSystemFile(FilePurpose.CALL_RECORDING,"audio/wav",new java.io.ByteArrayInputStream(WavFiles.tone(1)),1000000);
        UUID id=recording("STORED",stored.fileId(),now.minusDays(400));
        String key=jdbc.sql("select storage_key from file_object where id=:id").param("id",stored.fileId()).query(String.class).single();
        Path path=root.resolve(key);Files.delete(path);Files.createDirectory(path);Files.writeString(path.resolve("blocked"),"cannot delete");
        try(Ari ari=new Ari()) {
            var failed=ari.work().run(now.minusDays(30),now,1000);
            assertThat(failed.failures()).isEqualTo(1);assertThat(count(id)).isEqualTo(1);assertThat(ari.copy).isFalse();
            assertThat(jdbc.sql("select count(*) from file_object where id=:id").param("id",stored.fileId()).query(Long.class).single()).isEqualTo(1);
            Files.delete(path.resolve("blocked"));ari.status.set(404);
            var success=ari.work().run(now.minusDays(30),now.plusSeconds(1),1000);
            assertThat(success.deleted()).isEqualTo(1);assertThat(count(id)).isZero();assertThat(Files.exists(path)).isFalse();
            assertThat(jdbc.sql("select count(*) from file_object where id=:id").param("id",stored.fileId()).query(Long.class).single()).isZero();
        }
    }
    @Test void anActiveFetchIsKeptAndAnExpiredDeleteClaimIsRecovered() throws Exception {
        OffsetDateTime now=OffsetDateTime.now();UUID active=recording("PENDING",null,now.minusDays(400));
        UUID expired=recording("NONE",null,now.minusDays(400));
        jdbc.sql("update call_recording set fetching_until=:until where call_id=:id").param("until",now.plusDays(1)).param("id",active).update();
        jdbc.sql("update call_recording set retention_claim=:claim,retention_until=:until where call_id=:id")
            .param("claim",UUID.randomUUID()).param("until",now.minusSeconds(1)).param("id",expired).update();
        try(Ari ari=new Ari()) {
            assertThat(ari.work().run(now.minusDays(30),now,1000).deleted()).isEqualTo(1);
            assertThat(count(active)).isEqualTo(1);assertThat(count(expired)).isZero();assertThat(ari.calls).hasValue(1);
        }
    }
    @Test void anUnsupportedSourceNameIsAFailureInsteadOfAFalseSuccessfulDeletion() {
        var source=new AriRecordingSource(org.mockito.Mockito.mock(Integrations.class));
        org.assertj.core.api.Assertions.assertThatThrownBy(()->source.discard("unsupported/name"))
            .isInstanceOf(java.io.IOException.class).hasMessage("Unsupported stored recording name");
    }

    @Test void cleanupAlsoRemovesTheDownloadedAsteriskTemporaryCopy() throws Exception {
        OffsetDateTime now=OffsetDateTime.now();UUID id=recording("NONE",null,now.minusDays(400));
        try(Ari ari=new Ari()) {
            Path downloaded=ari.source().fetch(id.toString()).orElseThrow();
            try {
                assertThat(Files.exists(downloaded)).isTrue();
                assertThat(Files.getPosixFilePermissions(downloaded)).containsExactlyInAnyOrder(
                    java.nio.file.attribute.PosixFilePermission.OWNER_READ,java.nio.file.attribute.PosixFilePermission.OWNER_WRITE);
                assertThat(ari.work().run(now.minusDays(30),now,1000).deleted()).isEqualTo(1);
                assertThat(Files.exists(downloaded)).as("downloaded source bytes removed before recording metadata").isFalse();
                assertThat(count(id)).isZero();
            } finally {Files.deleteIfExists(downloaded);}
        }
    }

}
