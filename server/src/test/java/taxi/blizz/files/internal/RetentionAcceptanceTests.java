package taxi.blizz.files.internal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;

import jakarta.servlet.Filter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.core.annotation.AnnotationAwareOrderComparator;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import taxi.blizz.identity.ApiAudience;
import taxi.blizz.identity.SessionService;
import taxi.blizz.identity.VerifiedSubject;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.SubjectType;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.json.JsonMapper;

/** Tests-first boundary/control evidence for #118; every operation uses the real database and storage. */
@SpringBootTest(properties={"blizz.retention.enabled=false","blizz.files.local-dir=${java.io.tmpdir}/blizz-retention-acceptance"})
@Import(RetentionAcceptanceTests.Database.class)
@org.junit.jupiter.api.TestMethodOrder(org.junit.jupiter.api.MethodOrderer.OrderAnnotation.class)
class RetentionAcceptanceTests {
    @org.springframework.boot.test.context.TestConfiguration(proxyBeanMethods=false)
    static class Database {
        @org.springframework.context.annotation.Bean
        @org.springframework.boot.testcontainers.service.connection.ServiceConnection
        org.testcontainers.postgresql.PostgreSQLContainer retentionAcceptancePostgres() {
            return new org.testcontainers.postgresql.PostgreSQLContainer(
                org.testcontainers.utility.DockerImageName.parse("postgis/postgis:18-3.6").asCompatibleSubstituteFor("postgres"));
        }
    }
    static final String[] KINDS={"sessions","sign_in_codes","code_deliveries","delivered_events","consumer_receipts",
        "command_receipts","upload_sessions","quarantined_files","call_recordings"};
    @Autowired JdbcClient jdbc;
    @Autowired org.springframework.transaction.support.TransactionTemplate tx;
    @org.springframework.test.context.bean.override.mockito.MockitoSpyBean FileStorage storage;
    @Autowired WebApplicationContext context;
    @Autowired SessionService auth;
    @Autowired JsonMapper json;
    @Value("${blizz.files.local-dir}") Path root;
    MockMvc mvc;
    String token;
    UUID staffId;

    @BeforeEach void setup() {
        List<Filter> filters=new ArrayList<>(context.getBeansOfType(Filter.class).values());
        AnnotationAwareOrderComparator.sort(filters);
        mvc=MockMvcBuilders.webAppContextSetup(context).addFilters(filters.toArray(Filter[]::new)).build();
        token=staff(true,true);
    }
    String staff(boolean permission,boolean allCities) {
        UUID id=UUID.randomUUID();staffId=id;
        jdbc.sql("""
            insert into staff_user(id,login,name,role,permissions,all_cities,state,created_at,updated_at)
            values(:id,:login,'Retention','ADMIN',:permissions,:all,'ACTIVE',now(),now())
            """).param("id",id).param("login","retention-"+id)
            .param("permissions",permission?new String[]{"retention.manage"}:new String[0]).param("all",allCities).update();
        return auth.openStaff(new VerifiedSubject(new Actor(SubjectType.STAFF,id),"ACTIVE",false),ApiAudience.ADMIN,null).accessToken();
    }
    MvcResult request(String verb,String access,Object body) throws Exception {
        var req=(verb.equals("GET")?get("/api/admin/v1/retention"):put("/api/admin/v1/retention"))
            .header("Authorization","Bearer "+access);
        if(body!=null)req.contentType("application/json").content(json.writeValueAsString(body));
        return mvc.perform(req).andReturn();
    }
    JsonNode current() throws Exception {
        MvcResult result=request("GET",token,null);
        assertThat(result.getResponse().getStatus()).as("authenticated retention GET").isEqualTo(200);
        return json.readTree(result.getResponse().getContentAsString());
    }
    Map<String,Object> days(int n) {Map<String,Object> map=new LinkedHashMap<>();for(String k:KINDS)map.put(k,n);return map;}
    Map<String,Object> command(long version,Map<String,Object> days,UUID command) {
        return Map.of("command_id",command,"expected_version",version,"days",days,"reason","Retention acceptance");
    }
    void policy(Map<String,Object> days) throws Exception {
        MvcResult result=request("PUT",token,command(current().path("version").asLong(),days,UUID.randomUUID()));
        assertThat(result.getResponse().getStatus()).as(result.getResponse().getContentAsString()).isEqualTo(200);
    }
    void run(String kind,OffsetDateTime now) {
        assertThat(context.containsBean("retentionRunner")).as("production retention runner exists").isTrue();
        ReflectionTestUtils.invokeMethod(context.getBean("retentionRunner"),"runKindAt",kind,now);
    }
    record Row(String table,String key,UUID id,String storageKey) {}
    Row seed(String kind,OffsetDateTime at) throws Exception {
        UUID id=UUID.randomUUID();String table,key="id",storageKey=null;
        switch(kind) {
            case "sessions" -> {
                table="refresh_token";key="session_id";
                jdbc.sql("""
                    insert into device_session(id,subject_type,subject_id,audience,created_at,last_refreshed_at,expires_at)
                    values(:id,'CLIENT',:id,'rider',:at,:at,:at)
                    """).param("id",id).param("at",at).update();
                jdbc.sql("insert into refresh_token(token_hash,session_id,issued_at,expires_at) values(:hash,:id,:at,:at)")
                    .param("hash",id.toString().getBytes(java.nio.charset.StandardCharsets.UTF_8)).param("id",id).param("at",at).update();
            }
            case "sign_in_codes" -> {
                table="otp_challenge";
                jdbc.sql("""
                    insert into otp_challenge(id,audience,phone_normalized,code_hmac,expires_at,max_attempts,created_at)
                    values(:id,'CLIENT','+48111000000',:hash,:at,3,:at)
                    """).param("id",id).param("at",at).param("hash",new byte[]{1,2}).update();
            }
            case "code_deliveries" -> {
                table="otp_delivery";
                jdbc.sql("""
                    insert into otp_delivery(id,phone,audience,channel,provider,state,attempted_at)
                    values(:id,'+48111000000','CLIENT','SMS','FAKE','SENT',:at)
                    """).param("id",id).param("at",at).update();
            }
            case "delivered_events" -> {
                table="outbox";key="event_id";
                jdbc.sql("""
                    insert into outbox(event_id,event_type,schema_version,aggregate_type,aggregate_id,aggregate_version,
                      payload,correlation_id,occurred_at,state,next_attempt_at,completed_at)
                    values(:id,'RetentionFixture',1,'Fixture',:id,0,'{}',:id,:at,'DONE',:at,:at)
                    """).param("id",id).param("at",at).update();
            }
            case "consumer_receipts" -> {
                table="consumer_inbox";key="event_id";
                jdbc.sql("insert into consumer_inbox(consumer_id,event_id,completed_at) values('retention-test',:id,:at)")
                    .param("id",id).param("at",at).update();
            }
            case "command_receipts" -> {
                table="command_receipt";key="command_id";
                jdbc.sql("""
                    insert into command_receipt(scope,command_id,request_hash,outcome,created_at,completed_at)
                    values('retention-test',:id,:hash,'{}',:at,:at)
                    """).param("id",id).param("hash",new byte[]{1}).param("at",at).update();
            }
            case "upload_sessions","quarantined_files","call_recordings" -> {
                table="file_object";
                boolean recording=kind.equals("call_recordings"),quarantine=kind.equals("quarantined_files");
                storageKey=(recording?"call_recording":"driver_document")+"/retention/"+id;
                Path file=root.resolve(storageKey);Files.createDirectories(file.getParent());Files.writeString(file,"retention fixture");
                jdbc.sql("""
                    insert into file_object(id,owner_type,owner_id,purpose,declared_content_type,declared_size_bytes,
                      storage_key,state,encryption,upload_expires_at,created_at,uploaded_at)
                    values(:id,:owner,:ownerId,:purpose,'image/png',1,:key,:state,:encryption,:at,:at,:at)
                    """).param("id",id).param("owner",recording?"SYSTEM":"DRIVER").param("ownerId",recording?null:id)
                    .param("purpose",recording?"CALL_RECORDING":"DRIVER_DOCUMENT").param("key",storageKey)
                    .param("state",quarantine?"QUARANTINE":"SAFE").param("encryption",recording?"AES256GCM-STREAM-1":null)
                    .param("at",at).update();
                if(recording) {
                    jdbc.sql("insert into call(id,channel_id,called_number,state,started_at,ended_at) values(:id,:channel,'retention','ENDED',:at,:at)")
                        .param("id",id).param("channel","retention-"+id).param("at",at).update();
                    jdbc.sql("insert into call_recording(call_id,state,file_id,next_attempt_at,created_at,stored_at) values(:id,'STORED',:id,:at,:at,:at)")
                        .param("id",id).param("at",at).update();
                }
            }
            default -> throw new AssertionError("Unknown kind "+kind);
        }
        return new Row(table,key,id,storageKey);
    }
    long count(Row row) {return jdbc.sql("select count(*) from "+row.table()+" where "+row.key()+"=:id")
        .param("id",row.id()).query(Long.class).single();}
    void assertPresent(Row row,boolean present) {
        assertThat(count(row)).as(row.table()+" "+row.id()).isEqualTo(present?1:0);
        if(row.storageKey()!=null)assertThat(Files.exists(root.resolve(row.storageKey()))).isEqualTo(present);
        if(row.storageKey()!=null && row.storageKey().startsWith("call_recording/"))
            assertThat(jdbc.sql("select count(*) from call_recording where call_id=:id").param("id",row.id()).query(Long.class).single()).isEqualTo(present?1:0);
    }
    @ParameterizedTest @ValueSource(strings={"sessions","sign_in_codes","code_deliveries","delivered_events","consumer_receipts",
        "command_receipts","upload_sessions","quarantined_files","call_recordings"})
    void eachKindHonorsBothSidesOfTheBoundaryZeroAndChangedPolicies(String kind) throws Exception {
        OffsetDateTime now=OffsetDateTime.now(ZoneOffset.UTC);
        Row old=seed(kind,now.minusDays(31)),edge=seed(kind,now.minusDays(30)),recent=seed(kind,now.minusDays(29));
        policy(days(0));run(kind,now);assertPresent(old,true);assertPresent(edge,true);assertPresent(recent,true);
        Map<String,Object> p=days(0);p.put(kind,30);policy(p);run(kind,now);
        assertPresent(old,false);assertPresent(edge,true);assertPresent(recent,true);
        p.put(kind,60);policy(p);run(kind,now);assertPresent(edge,true);assertPresent(recent,true);
        p.put(kind,20);policy(p);run(kind,now);assertPresent(edge,false);assertPresent(recent,false);
    }
    @Test @org.junit.jupiter.api.Order(1) void defaultsAuditHistoryVersionConflictAndAuthorizationAreRealHttpChecks() throws Exception {
        JsonNode before=current();
        assertThat(before.path("version").asLong()).isZero();
        int[] defaults={30,90,90,30,30,30,7,30,0};
        for(int i=0;i<KINDS.length;i++)assertThat(before.path("days").path(KINDS[i]).asInt()).as(KINDS[i]+" default").isEqualTo(defaults[i]);
        long version=before.path("version").asLong();
        Map<String,Object> body=command(version,days(12),UUID.randomUUID());
        MvcResult ok=request("PUT",token,body);assertThat(ok.getResponse().getStatus()).isEqualTo(200);
        JsonNode saved=json.readTree(ok.getResponse().getContentAsString());assertThat(saved.path("version").asLong()).isEqualTo(version+1);
        assertThat(saved.path("changed_by").asText()).isEqualTo(staffId.toString());
        assertThat(request("PUT",token,body).getResponse().getContentAsString()).isEqualTo(ok.getResponse().getContentAsString());
        assertThat(request("PUT",token,command(version,days(13),UUID.randomUUID())).getResponse().getStatus()).isEqualTo(409);
        assertThat(jdbc.sql("select count(*) from audit_log where action='retention.change' and actor_id=:id")
            .param("id",staffId).query(Long.class).single()).isEqualTo(1);
        assertThat(jdbc.sql("select count(*) from retention_settings where version=:v").param("v",version+1).query(Long.class).single()).isEqualTo(1);
        for(Object invalid:List.of(-1,"never",1.5,"12")) {
            Map<String,Object> p=days(1);p.put("sessions",invalid);
            assertThat(request("PUT",token,command(version+1,p,UUID.randomUUID())).getResponse().getStatus()).as("invalid days "+invalid).isEqualTo(400);
        }
        String stranger=staff(false,true);
        assertThat(request("GET",stranger,null).getResponse().getStatus()).isEqualTo(403);
        assertThat(request("PUT",stranger,command(version+1,days(1),UUID.randomUUID())).getResponse().getStatus()).isEqualTo(403);
        String cityOnly=staff(true,false);
        assertThat(request("GET",cityOnly,null).getResponse().getStatus()).isEqualTo(403);
        jdbc.sql("update staff_user set permissions='{}' where id=cast(:id as uuid)").param("id",saved.path("changed_by").asText()).update();
        assertThat(request("PUT",token,body).getResponse().getStatus()).as("lost rights before receipt replay").isEqualTo(403);
    }
    @Test void storageFailureKeepsTheRowCountsFailureAndRetriesWithoutAnOpenTransaction() throws Exception {
        org.mockito.Mockito.doAnswer(invocation->{
            assertThat(org.springframework.transaction.support.TransactionSynchronizationManager.isActualTransactionActive())
                .as("storage deletion occurs outside a database transaction").isFalse();
            return invocation.callRealMethod();
        }).when(storage).delete(org.mockito.ArgumentMatchers.anyString());
        OffsetDateTime now=OffsetDateTime.now(ZoneOffset.UTC);Row row=seed("upload_sessions",now.minusDays(40));
        Path path=root.resolve(row.storageKey());Files.delete(path);Files.createDirectory(path);Files.writeString(path.resolve("blocked"),"real deletion failure");
        Map<String,Object> p=days(0);p.put("upload_sessions",7);policy(p);
        io.micrometer.core.instrument.MeterRegistry meters=context.getBean(io.micrometer.core.instrument.MeterRegistry.class);
        double before=meters.find("blizz.retention.failures").tag("kind","upload_sessions").counters().stream().mapToDouble(c->c.count()).sum();
        run("upload_sessions",now);assertThat(count(row)).isEqualTo(1);assertThat(Files.exists(path)).isTrue();
        assertThat(meters.find("blizz.retention.failures").tag("kind","upload_sessions").counter().count()).isEqualTo(before+1);
        Files.delete(path.resolve("blocked"));run("upload_sessions",now);assertPresent(row,false);
    }
    @Test void failedAndPendingEventsAndUnfinishedReceiptsSurviveEverySettingAtOne() throws Exception {
        OffsetDateTime now=OffsetDateTime.now(ZoneOffset.UTC);
        Row failed=seed("delivered_events",now.minusDays(200)),pending=seed("delivered_events",now.minusDays(200));
        jdbc.sql("update outbox set state='FAILED' where event_id=:id").param("id",failed.id()).update();
        jdbc.sql("update outbox set state='PENDING',completed_at=null where event_id=:id").param("id",pending.id()).update();
        Row unfinished=seed("command_receipts",now.minusDays(200));
        jdbc.sql("update command_receipt set completed_at=null,outcome=null where command_id=:id").param("id",unfinished.id()).update();
        UUID journalId=UUID.randomUUID();
        tx.executeWithoutResult(status->{
        jdbc.sql("insert into journal_transaction(id,business_key,basis_type,basis_id,currency,reason,occurred_at) values(:id,:key,'RetentionFixture',:id,'PLN','Protected',:at)")
            .param("id",journalId).param("key","retention-"+journalId).param("at",now.minusDays(200)).update();
        jdbc.sql("insert into journal_line(transaction_id,line_no,account,debit_minor,credit_minor) values(:id,1,'SUSPENSE',1,0),(:id,2,'SERVICE_COMMISSION',0,1)")
            .param("id",journalId).update();
        });
        jdbc.sql("insert into audit_log(id,occurred_at,actor_type,action,resource_type,correlation_id) values(:id,:at,'SYSTEM','retention.fixture','Fixture',:id)")
            .param("id",UUID.randomUUID()).param("at",now.minusDays(200)).update();
        policy(days(1));long audit=jdbc.sql("select count(*) from audit_log").query(Long.class).single();
        long journal=jdbc.sql("select count(*) from journal_transaction").query(Long.class).single();
        for(String kind:KINDS)run(kind,now);
        assertPresent(failed,true);assertPresent(pending,true);assertPresent(unfinished,true);
        assertThat(jdbc.sql("select count(*) from audit_log").query(Long.class).single()).isEqualTo(audit);
        assertThat(jdbc.sql("select count(*) from journal_transaction").query(Long.class).single()).isEqualTo(journal);
    }
    @Test void recordingsAreExcludedFromBothFileCleanupKindsWithoutAnAttachmentMarker() throws Exception {
        OffsetDateTime now=OffsetDateTime.now();Row safe=seed("call_recordings",now.minusDays(400));
        Row quarantine=seed("call_recordings",now.minusDays(400));
        jdbc.sql("update file_object set state='QUARANTINE' where id=:id").param("id",quarantine.id()).update();
        Map<String,Object> p=days(0);p.put("upload_sessions",1);p.put("quarantined_files",1);policy(p);
        run("upload_sessions",now);run("quarantined_files",now);assertPresent(safe,true);assertPresent(quarantine,true);
    }
    @Test void oneInvocationCommitsOnlyOneThousandAndTheNextResumes() throws Exception {
        String prefix="batch-"+UUID.randomUUID();
        jdbc.sql("""
            insert into outbox(event_id,event_type,schema_version,aggregate_type,aggregate_id,aggregate_version,
              payload,correlation_id,occurred_at,state,next_attempt_at,completed_at)
            select md5(:prefix||g)::uuid,:prefix,1,'Fixture',md5(:prefix||g)::uuid,0,'{}',md5(:prefix||g)::uuid,
              now()-interval '600 days','DONE',now()-interval '600 days',now()-interval '600 days'
            from generate_series(1,2005) g
            """).param("prefix",prefix).update();
        Map<String,Object> p=days(0);p.put("delivered_events",1);policy(p);
        for(int expected:List.of(1005,5,0)) {
            run("delivered_events",OffsetDateTime.now());
            assertThat(jdbc.sql("select count(*) from outbox where event_type=:prefix").param("prefix",prefix).query(Long.class).single()).isEqualTo(expected);
        }
    }

    @Test void revokedTokensUseRevocationAgeAndActiveTokensRemain() throws Exception {
        OffsetDateTime now=OffsetDateTime.now();Row revoked=seed("sessions",now.plusDays(365));
        Row recent=seed("sessions",now.plusDays(365)),active=seed("sessions",now.plusDays(365));
        jdbc.sql("update device_session set revoked_at=:at where id=:id").param("at",now.minusDays(31)).param("id",revoked.id()).update();
        jdbc.sql("update device_session set revoked_at=:at where id=:id").param("at",now.minusDays(29)).param("id",recent.id()).update();
        Map<String,Object> p=days(0);p.put("sessions",30);policy(p);run("sessions",now);
        assertPresent(revoked,false);assertPresent(recent,true);assertPresent(active,true);
    }

}
