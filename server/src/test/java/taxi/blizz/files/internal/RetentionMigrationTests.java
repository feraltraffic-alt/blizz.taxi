package taxi.blizz.files.internal;

import static org.assertj.core.api.Assertions.assertThat;

import java.nio.file.Files;
import java.nio.file.Path;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.sql.DataSource;
import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.test.util.ReflectionTestUtils;
import tools.jackson.databind.json.JsonMapper;

/** Rows are inserted at the old Flyway version, before the attachment-marker migration. */
@SpringBootTest(properties={"spring.flyway.target=20261029.1730.1","blizz.retention.enabled=false",
    "blizz.files.local-dir=${java.io.tmpdir}/blizz-retention-migration"})
@Import(RetentionMigrationTests.Database.class)
class RetentionMigrationTests {
    @org.springframework.boot.test.context.TestConfiguration(proxyBeanMethods=false)
    static class Database {
        @org.springframework.context.annotation.Bean
        @org.springframework.boot.testcontainers.service.connection.ServiceConnection
        org.testcontainers.postgresql.PostgreSQLContainer retentionMigrationPostgres() {
            return new org.testcontainers.postgresql.PostgreSQLContainer(
                org.testcontainers.utility.DockerImageName.parse("postgis/postgis:18-3.6").asCompatibleSubstituteFor("postgres"));
        }
    }
    @Autowired JdbcClient jdbc;
    @Autowired DataSource dataSource;
    @Autowired ApplicationContext context;
    @Autowired JsonMapper json;
    @Value("${blizz.files.local-dir}") Path root;
    UUID file(String purpose) throws Exception {
        UUID id=UUID.randomUUID();String key=purpose.toLowerCase()+"/migration/"+id;
        Path path=root.resolve(key);Files.createDirectories(path.getParent());Files.writeString(path,"historical bytes");
        boolean recording=purpose.equals("CALL_RECORDING");
        jdbc.sql("""
            insert into file_object(id,owner_type,owner_id,purpose,declared_content_type,declared_size_bytes,
              storage_key,state,encryption,upload_expires_at,created_at,uploaded_at)
            values(:id,:owner,:ownerId,:purpose,'image/png',1,:key,'SAFE',:encryption,
              now()-interval '400 days',now()-interval '400 days',now()-interval '400 days')
            """).param("id",id).param("owner",recording?"SYSTEM":"DRIVER").param("ownerId",recording?null:id)
            .param("purpose",purpose).param("key",key).param("encryption",recording?"AES256GCM-STREAM-1":null).update();
        return id;
    }
    @Test void preMigrationDocumentsAttachmentsAndRecordingsSurviveButUnusedUploadDoesNot() throws Exception {
        assertThat(jdbc.sql("select count(*) from information_schema.columns where table_name='file_object' and column_name='attached_at'")
            .query(Long.class).single()).isZero();
        UUID document=file("DRIVER_DOCUMENT"),attachment=file("SUPPORT_ATTACHMENT"),recording=file("CALL_RECORDING"),unused=file("DRIVER_DOCUMENT");
        UUID driver=UUID.randomUUID(),supportCase=UUID.randomUUID(),message=UUID.randomUUID(),call=UUID.randomUUID();
        jdbc.sql("""
            insert into driver(id,account_state,created_at,updated_at) values(:id,'ANONYMIZED',now(),now())
            """).param("id",driver).update();
        jdbc.sql("insert into driver_document(id,driver_id,type,file_id,created_at) values(:id,:driver,'IDENTITY',:file,now())")
            .param("id",UUID.randomUUID()).param("driver",driver).param("file",document).update();
        jdbc.sql("""
            insert into support_case(id,category,requester_type,subject,priority,state,created_at,updated_at,respond_by)
            values(:id,'OTHER','SYSTEM','Historical attachment','NORMAL','OPEN',now(),now(),now())
            """).param("id",supportCase).update();
        jdbc.sql("""
            insert into support_message(id,case_id,sequence,author_type,visibility,body,created_at)
            values(:id,:case,1,'SYSTEM','PUBLIC','Historical attachment',now())
            """).param("id",message).param("case",supportCase).update();
        jdbc.sql("""
            insert into support_message_attachment(message_id,file_id,content_type,size_bytes,created_at)
            values(:message,:file,'image/png',1,now())
            """).param("message",message).param("file",attachment).update();
        jdbc.sql("""
            insert into call(id,channel_id,called_number,state,started_at,ended_at)
            values(:id,:channel,'retention','ENDED',now()-interval '400 days',now()-interval '400 days')
            """).param("id",call).param("channel","migration-"+call).update();
        jdbc.sql("""
            insert into call_recording(call_id,state,file_id,next_attempt_at,created_at,stored_at)
            values(:id,'STORED',:file,now(),now()-interval '400 days',now()-interval '400 days')
            """).param("id",call).param("file",recording).update();
        Flyway.configure().dataSource(dataSource).locations("classpath:db/migration").load().migrate();
        assertThat(jdbc.sql("select count(*) from information_schema.columns where table_name='file_object' and column_name='attached_at'")
            .query(Long.class).single()).as("new files migration exists").isEqualTo(1);
        Map<String,Object> days=new java.util.LinkedHashMap<>();for(String kind:RetentionAcceptanceTests.KINDS)days.put(kind,0);
        days.put("upload_sessions",7);
        jdbc.sql("insert into retention_settings(version,days,reason,changed_at) values(1,cast(:days as jsonb),'Migration proof',now())")
            .param("days",json.writeValueAsString(days)).update();
        assertThat(context.containsBean("retentionRunner")).isTrue();
        Object runner=context.getBean("retentionRunner");
        ReflectionTestUtils.invokeMethod(runner,"runKindAt","upload_sessions",OffsetDateTime.now());
        for(UUID id:List.of(document,attachment,recording)) {
            assertThat(jdbc.sql("select count(*) from file_object where id=:id").param("id",id).query(Long.class).single())
                .as("historical referenced file survives: "+id).isEqualTo(1);
        }
        assertThat(jdbc.sql("select count(*) from file_object where id=:id").param("id",unused).query(Long.class).single()).isZero();
        assertThat(jdbc.sql("select count(*) from file_object where attached_at is not null").query(Long.class).single()).isEqualTo(3);
        days.put("upload_sessions",0);
        jdbc.sql("insert into retention_settings(version,days,reason,changed_at) values(2,cast(:days as jsonb),'Keep forever',now())")
            .param("days",json.writeValueAsString(days)).update();
        UUID forever=file("DRIVER_DOCUMENT");
        for(String kind:RetentionAcceptanceTests.KINDS)ReflectionTestUtils.invokeMethod(runner,"runKindAt",kind,OffsetDateTime.now());
        assertThat(jdbc.sql("select count(*) from file_object where id=:id").param("id",forever).query(Long.class).single()).isEqualTo(1);
    }
}
