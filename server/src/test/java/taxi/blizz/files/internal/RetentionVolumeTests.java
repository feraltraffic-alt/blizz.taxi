package taxi.blizz.files.internal;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.web.context.WebApplicationContext;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.json.JsonMapper;

/** Actual work selections over 200k rows per table; no toy duplicate of the cleanup SQL. */
@SpringBootTest(properties="blizz.retention.enabled=false")
@Import(RetentionVolumeTests.Database.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class RetentionVolumeTests {
    @org.springframework.boot.test.context.TestConfiguration(proxyBeanMethods=false)
    static class Database {
        @org.springframework.context.annotation.Bean
        @org.springframework.boot.testcontainers.service.connection.ServiceConnection
        org.testcontainers.postgresql.PostgreSQLContainer retentionVolumePostgres() {
            return new org.testcontainers.postgresql.PostgreSQLContainer(
                org.testcontainers.utility.DockerImageName.parse("postgis/postgis:18-3.6").asCompatibleSubstituteFor("postgres"));
        }
    }
    @Autowired JdbcClient jdbc;
    @Autowired WebApplicationContext context;
    @Autowired JsonMapper json;
    OffsetDateTime now=OffsetDateTime.now();
    static final String AGE="case when g<=2000 then now()-interval '200 days' else now()+interval '1 day' end";
    static final String ID="md5('retention-volume-'||g)::uuid";
    @BeforeAll void seed() {
        jdbc.sql("""
            insert into device_session(id,subject_type,subject_id,audience,created_at,last_refreshed_at,expires_at)
            select %s,'CLIENT',%s,'rider',now(),now(),%s from generate_series(1,200000) g
            """.formatted(ID,ID,AGE)).update();
        jdbc.sql("insert into refresh_token(token_hash,session_id,issued_at,expires_at) select convert_to(g::text,'UTF8'),%s,now(),%s from generate_series(1,200000) g".formatted(ID,AGE)).update();
        jdbc.sql("""
            insert into otp_challenge(id,audience,phone_normalized,code_hmac,expires_at,max_attempts,created_at)
            select %s,'CLIENT','+48111000000',decode('01','hex'),now(),3,%s from generate_series(1,200000) g
            """.formatted(ID,AGE)).update();
        jdbc.sql("""
            insert into otp_delivery(id,phone,audience,channel,provider,state,attempted_at)
            select %s,'+48111000000','CLIENT','SMS','FAKE','SENT',%s from generate_series(1,200000) g
            """.formatted(ID,AGE)).update();
        jdbc.sql("""
            insert into outbox(event_id,event_type,schema_version,aggregate_type,aggregate_id,aggregate_version,
              payload,correlation_id,occurred_at,state,next_attempt_at,completed_at)
            select %s,'RetentionFixture',1,'Fixture',%s,0,'{}',%s,now(),'DONE',now(),%s from generate_series(1,200000) g
            """.formatted(ID,ID,ID,AGE)).update();
        jdbc.sql("insert into consumer_inbox(consumer_id,event_id,completed_at) select 'volume',%s,%s from generate_series(1,200000) g".formatted(ID,AGE)).update();
        jdbc.sql("""
            insert into command_receipt(scope,command_id,request_hash,outcome,created_at,completed_at)
            select 'volume',%s,decode('01','hex'),'{}',now(),%s from generate_series(1,200000) g
            """.formatted(ID,AGE)).update();
        for(String state:List.of("SAFE","QUARANTINE"))jdbc.sql("""
            insert into file_object(id,owner_type,owner_id,purpose,declared_content_type,declared_size_bytes,state,
              upload_expires_at,created_at,uploaded_at)
            select md5(:prefix||g)::uuid,'DRIVER',%s,'DRIVER_DOCUMENT','image/png',1,:state,%s,%s,%s
            from generate_series(1,200000) g
            """.formatted(ID,AGE,AGE,AGE)).param("prefix",state).param("state",state).update();
        jdbc.sql("""
            insert into file_object(id,owner_type,purpose,declared_content_type,declared_size_bytes,state,encryption,
              upload_expires_at,created_at,uploaded_at)
            select md5('recording-'||g)::uuid,'SYSTEM','CALL_RECORDING','audio/wav',1,'SAFE','AES256GCM-STREAM-1',%s,%s,%s
            from generate_series(1,200000) g
            """.formatted(AGE,AGE,AGE)).update();
        jdbc.sql("""
            insert into call(id,channel_id,called_number,state,started_at,ended_at)
            select %s,'volume-'||g,'retention','ENDED',%s,%s from generate_series(1,200000) g
            """.formatted(ID,AGE,AGE)).update();
        jdbc.sql("""
            insert into call_recording(call_id,state,next_attempt_at,created_at)
            select %s,'NONE',now(),%s from generate_series(1,200000) g
            """.formatted(ID,AGE)).update();
        for(String table:List.of("device_session","refresh_token","otp_challenge","otp_delivery","outbox","consumer_inbox","command_receipt","file_object","call_recording"))
            jdbc.sql("analyze "+table).update();
    }
    @ParameterizedTest @ValueSource(strings={"sessions","sign_in_codes","code_deliveries","delivered_events",
        "consumer_receipts","command_receipts","upload_sessions","quarantined_files","call_recordings"})
    void actualSelectionUsesAnIndexAndBoundsTheBatch(String kind) throws Exception {
        Class<?> workType;
        try {workType=Class.forName("taxi.blizz.platform.RetentionWork");}
        catch(ClassNotFoundException ex){throw new AssertionError("No production retention work exists for "+kind,ex);}
        List<Object> work=new ArrayList<>();
        for(Object bean:context.getBeansOfType(workType).values()) {
            String key=ReflectionTestUtils.invokeMethod(bean,"kind");
            if(kind.equals(key))work.add(bean);
        }
        assertThat(work).as("registered production work for "+kind).isNotEmpty();
        for(Object bean:work) {
            String sql=ReflectionTestUtils.invokeMethod(bean,"selectionSql",1000);
            assertThat(sql).isNotBlank();
            String planText=jdbc.sql("explain (analyze,buffers,format json) "+sql)
                .params(Map.of("cutoff",now.minusDays(30),"now",now)).query(String.class).single();
            JsonNode plan=json.readTree(planText).get(0);List<String> indexes=new ArrayList<>();collect(plan.path("Plan"),indexes);
            System.out.println("RETENTION PLAN "+kind+" "+bean.getClass().getSimpleName()+"\n"+planText);
            String expected=switch(kind) {
                case "sessions" -> "refresh_token_retention_idx";
                case "sign_in_codes" -> "otp_challenge_retention_idx";
                case "code_deliveries" -> "otp_delivery_retention_idx";
                case "delivered_events" -> "outbox_retention_idx";
                case "consumer_receipts" -> "consumer_inbox_retention_idx";
                case "command_receipts" -> "command_receipt_retention_idx";
                case "upload_sessions" -> "file_upload_retention_idx";
                case "quarantined_files" -> "file_quarantine_retention_idx";
                case "call_recordings" -> sql.contains("from file_object")?"file_recording_retention_idx":"call_recording_retention_idx";
                default -> throw new AssertionError(kind);
            };
            assertThat(indexes).as(kind+" uses the exact retention index").contains(expected);
            assertThat(plan.path("Plan").path("Actual Rows").asInt()).isEqualTo(1000);
            assertThat(plan.path("Execution Time").asDouble()).isLessThan(50);
        }
    }
    static void collect(JsonNode node,List<String> indexes) {
        if(node.has("Index Name"))indexes.add(node.path("Index Name").asText());
        for(JsonNode child:node.path("Plans"))collect(child,indexes);
    }
}
