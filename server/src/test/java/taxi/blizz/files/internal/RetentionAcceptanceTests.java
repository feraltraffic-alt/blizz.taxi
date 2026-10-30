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
    @org.springframework.test.context.bean.override.mockito.MockitoSpyBean FileScanner scanner;
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
    Map<String,UUID> oldBusinessRecords(OffsetDateTime at) {
        UUID city=UUID.randomUUID(),order=UUID.randomUUID(),merchant=UUID.randomUUID(),card=UUID.randomUUID(),intent=UUID.randomUUID(),operation=UUID.randomUUID();
        // Empty draft geometry has no operating area and cannot overlap another test city.
        jdbc.sql("""
            insert into city(id,code,name,currency,timezone,polygon,priority,state,created_at,updated_at)
            values(:id,:code,'Retention fixture','PLN','UTC',ST_GeomFromText('MULTIPOLYGON EMPTY',4326),0,'DRAFT',:at,:at)
            """).param("id",city).param("code","retention-"+city).param("at",at).update();
        jdbc.sql("""
            insert into ride_order(id,channel,created_by_type,created_by_id,city_id,vehicle_class,pickup,pickup_label,
              dropoff,dropoff_label,payment_method,price_minor,currency,status,created_at,updated_at)
            values(:id,'PHONE','STAFF',:staff,:city,'standard',ST_SetSRID(ST_MakePoint(0,0),4326),'Fixture',
              ST_SetSRID(ST_MakePoint(0,0),4326),'Fixture','CARD',1,'PLN','FULFILLED',:at,:at)
            """).param("id",order).param("staff",staffId).param("city",city).param("at",at).update();
        jdbc.sql("""
            insert into payment_merchant(id,provider,account,domain,secret_ref,currency,created_at)
            values(:id,'FAKE',:account,'retention.invalid','retentionfixture','PLN',:at)
            """).param("id",merchant).param("account","retention-"+merchant).param("at",at).update();
        jdbc.sql("""
            insert into payment_card(id,client_id,merchant_id,token,masked_pan,state,created_at)
            values(:id,:client,:merchant,'retention-fixture','****0000','ACTIVE',:at)
            """).param("id",card).param("client",order).param("merchant",merchant).param("at",at).update();
        jdbc.sql("""
            insert into payment_intent(id,order_id,client_id,merchant_id,card_id,currency,hold_minor,state,created_at,updated_at)
            values(:id,:order,:client,:merchant,:card,'PLN',1,'PAID',:at,:at)
            """).param("id",intent).param("order",order).param("client",order).param("merchant",merchant).param("card",card).param("at",at).update();
        jdbc.sql("""
            insert into payment_operation(id,intent_id,type,reference,target,amount_minor,state,created_at,updated_at)
            values(:id,:intent,'CHARGE',:reference,'retention-fixture',1,'SUCCEEDED',:at,:at)
            """).param("id",operation).param("intent",intent).param("reference","retention-"+operation).param("at",at).update();
        return Map.of("ride_order",order,"payment_merchant",merchant,"payment_card",card,"payment_intent",intent,"payment_operation",operation);
    }
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
        for(Object invalid:List.of(-1,"never",1.5,"12",2147483648L)) {
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
        Map<String,UUID> protectedBusiness=oldBusinessRecords(now.minusDays(200));
        policy(days(1));long audit=jdbc.sql("select count(*) from audit_log").query(Long.class).single();
        long journal=jdbc.sql("select count(*) from journal_transaction").query(Long.class).single();
        for(String kind:KINDS)run(kind,now);
        assertPresent(failed,true);assertPresent(pending,true);assertPresent(unfinished,true);
        assertThat(jdbc.sql("select count(*) from audit_log").query(Long.class).single()).isEqualTo(audit);
        assertThat(jdbc.sql("select count(*) from journal_transaction").query(Long.class).single()).isEqualTo(journal);
        for(var entry:protectedBusiness.entrySet())assertThat(jdbc.sql("select count(*) from "+entry.getKey()+" where id=:id")
            .param("id",entry.getValue()).query(Long.class).single()).as("protected "+entry.getKey()).isEqualTo(1);
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

    @Test void simultaneousPolicyCommandsCannotLoseAnUpdate() throws Exception {
        long version=current().path("version").asLong();
        var start=new java.util.concurrent.CountDownLatch(1);
        try(var executor=java.util.concurrent.Executors.newFixedThreadPool(2)) {
            var a=executor.submit(()->{start.await();return request("PUT",token,command(version,days(17),UUID.randomUUID())).getResponse().getStatus();});
            var b=executor.submit(()->{start.await();return request("PUT",token,command(version,days(18),UUID.randomUUID())).getResponse().getStatus();});
            start.countDown();
            assertThat(List.of(a.get(10,java.util.concurrent.TimeUnit.SECONDS),b.get(10,java.util.concurrent.TimeUnit.SECONDS))).containsExactlyInAnyOrder(200,409);
            assertThat(current().path("version").asLong()).isEqualTo(version+1);
        }
    }
    @Test void anAttachmentTransactionWinsBeforeCleanupAndCleanupSkipsItsLockedRow() throws Exception {
        OffsetDateTime now=OffsetDateTime.now();Row row=seed("upload_sessions",now.minusDays(40));
        Map<String,Object> p=days(0);p.put("upload_sessions",7);policy(p);
        var attached=new java.util.concurrent.CountDownLatch(1);var release=new java.util.concurrent.CountDownLatch(1);
        try(var executor=java.util.concurrent.Executors.newFixedThreadPool(2)) {
            var attach=executor.submit(()->tx.executeWithoutResult(status->{
                context.getBean(taxi.blizz.files.FileService.class).markAttached(new Actor(SubjectType.DRIVER,row.id()),row.id(),taxi.blizz.files.FilePurpose.DRIVER_DOCUMENT);
                attached.countDown();try {if(!release.await(10,java.util.concurrent.TimeUnit.SECONDS))throw new AssertionError("Attachment not released");}
                catch(InterruptedException ex){Thread.currentThread().interrupt();throw new RuntimeException(ex);}
            }));
            try {
                assertThat(attached.await(10,java.util.concurrent.TimeUnit.SECONDS)).isTrue();
                executor.submit(()->run("upload_sessions",now)).get(5,java.util.concurrent.TimeUnit.SECONDS);
                assertPresent(row,true);
            } finally {release.countDown();}
            attach.get(10,java.util.concurrent.TimeUnit.SECONDS);
            run("upload_sessions",now);assertPresent(row,true);
        }
    }
    @Test void aCommittedCleanupClaimRejectsAnAttachmentBeforeItsBytesAreRemoved() throws Exception {
        OffsetDateTime now=OffsetDateTime.now();Row row=seed("upload_sessions",now.minusDays(40));
        Map<String,Object> p=days(0);p.put("upload_sessions",7);policy(p);
        var claimed=new java.util.concurrent.CountDownLatch(1);var release=new java.util.concurrent.CountDownLatch(1);
        org.mockito.Mockito.doAnswer(invocation->{
            assertThat(org.springframework.transaction.support.TransactionSynchronizationManager.isActualTransactionActive()).isFalse();
            claimed.countDown();if(!release.await(10,java.util.concurrent.TimeUnit.SECONDS))throw new AssertionError("Storage not released");
            return invocation.callRealMethod();
        }).when(storage).delete(org.mockito.ArgumentMatchers.eq(row.storageKey()));
        try(var executor=java.util.concurrent.Executors.newSingleThreadExecutor()) {
            var cleanup=executor.submit(()->run("upload_sessions",now));
            try {
                assertThat(claimed.await(10,java.util.concurrent.TimeUnit.SECONDS)).isTrue();
                org.assertj.core.api.Assertions.assertThatThrownBy(()->tx.executeWithoutResult(status->
                    context.getBean(taxi.blizz.files.FileService.class).markAttached(new Actor(SubjectType.DRIVER,row.id()),row.id(),taxi.blizz.files.FilePurpose.DRIVER_DOCUMENT)))
                    .isInstanceOf(taxi.blizz.platform.DomainException.class)
                    .extracting(ex->((taxi.blizz.platform.DomainException)ex).code()).isEqualTo(taxi.blizz.platform.ErrorCode.STATE_CONFLICT);
                assertPresent(row,true);
            } finally {release.countDown();}
            cleanup.get(10,java.util.concurrent.TimeUnit.SECONDS);assertPresent(row,false);
        }
    }
    @Test void sandboxTriggersAreAbsentOutsideTheSandboxProfile() throws Exception {
        assertThat(mvc.perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post("/sandbox/v1/retention/run")
            .header("Authorization","Bearer "+token)).andReturn().getResponse().getStatus()).isEqualTo(404);
    }

    boolean blocked(int pid) {
        return pid>0&&jdbc.sql("select exists(select 1 from pg_stat_activity where pid=:pid and wait_event_type='Lock')")
            .param("pid",pid).query(Boolean.class).single();
    }
    @Test void tokenRotationAndRevocationHaveTheSameLockOrder() throws Exception {
        var issued=auth.openStaff(new VerifiedSubject(new Actor(SubjectType.STAFF,staffId),"ACTIVE",false),ApiAudience.ADMIN,null);
        var locked=new java.util.concurrent.CountDownLatch(1);var revoke=new java.util.concurrent.CountDownLatch(1);
        var rotationPid=new java.util.concurrent.atomic.AtomicInteger();
        try(var executor=java.util.concurrent.Executors.newFixedThreadPool(2)) {
            var revoker=executor.submit(()->tx.executeWithoutResult(status->{
                jdbc.sql("set local lock_timeout='5s'").update();
                jdbc.sql("select id from device_session where id=:id for update").param("id",issued.sessionId()).query(UUID.class).single();
                locked.countDown();try {if(!revoke.await(10,java.util.concurrent.TimeUnit.SECONDS))throw new AssertionError("Revoker not released");}
                catch(InterruptedException ex){Thread.currentThread().interrupt();throw new RuntimeException(ex);}
                auth.revokeAll(issued.actor(),"RETENTION_LOCK_ORDER_TEST");
            }));
            assertThat(locked.await(10,java.util.concurrent.TimeUnit.SECONDS)).isTrue();
            var rotation=executor.submit(()->{
                try {tx.executeWithoutResult(status->{
                    jdbc.sql("set local lock_timeout='5s'").update();rotationPid.set(jdbc.sql("select pg_backend_pid()").query(Integer.class).single());
                    auth.refresh(issued.refreshToken());
                });return (Throwable)null;}catch(Throwable ex){return ex;}
            });
            try {org.awaitility.Awaitility.await().atMost(java.time.Duration.ofSeconds(10)).until(()->blocked(rotationPid.get()));}
            finally {revoke.countDown();}
            revoker.get(10,java.util.concurrent.TimeUnit.SECONDS);
            assertThat(rotation.get(10,java.util.concurrent.TimeUnit.SECONDS)).isInstanceOf(taxi.blizz.platform.DomainException.class)
                .extracting(ex->((taxi.blizz.platform.DomainException)ex).code()).isEqualTo(taxi.blizz.platform.ErrorCode.UNAUTHENTICATED);
        }
    }
    @Test void reversedAttachmentListsCannotDeadlockTwoRealSupportCommands() throws Exception {
        UUID client=UUID.randomUUID();Actor owner=new Actor(SubjectType.CLIENT,client);
        jdbc.sql("insert into client(id,phone_normalized,account_state,created_at,updated_at) values(:id,'+48111000001','ACTIVE',now(),now())")
            .param("id",client).update();
        byte[] png=java.util.Base64.getDecoder().decode("iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAQAAAC1HAwCAAAAC0lEQVR42mNk+A8AAQUBAScY42YAAAAASUVORK5CYII=");
        var files=context.getBean(taxi.blizz.files.FileService.class);var ids=new ArrayList<UUID>();
        for(int i=0;i<2;i++) {
            var upload=files.openUpload(owner,UUID.randomUUID(),taxi.blizz.files.FilePurpose.SUPPORT_ATTACHMENT,"image/png",png.length);
            assertThat(files.upload(owner,upload.fileId(),"image/png",png.length,new java.io.ByteArrayInputStream(png)).state()).isEqualTo(taxi.blizz.files.FileState.SAFE);
            ids.add(upload.fileId());
        }
        ids.sort(UUID::compareTo);UUID low=ids.get(0);
        var locked=new java.util.concurrent.CountDownLatch(1);var release=new java.util.concurrent.CountDownLatch(1);
        var firstPid=new java.util.concurrent.atomic.AtomicInteger();var secondPid=new java.util.concurrent.atomic.AtomicInteger();
        try(var executor=java.util.concurrent.Executors.newFixedThreadPool(3)) {
            var holder=executor.submit(()->tx.executeWithoutResult(status->{
                jdbc.sql("select id from file_object where id=:id for update").param("id",low).query(UUID.class).single();
                locked.countDown();try {if(!release.await(10,java.util.concurrent.TimeUnit.SECONDS))throw new AssertionError("File holder not released");}
                catch(InterruptedException ex){Thread.currentThread().interrupt();throw new RuntimeException(ex);}
            }));
            assertThat(locked.await(10,java.util.concurrent.TimeUnit.SECONDS)).isTrue();
            java.util.function.BiFunction<List<UUID>,java.util.concurrent.atomic.AtomicInteger,Throwable> open=(attachments,pid)->{
                try {tx.executeWithoutResult(status->{
                    jdbc.sql("set local lock_timeout='5s'").update();pid.set(jdbc.sql("select pg_backend_pid()").query(Integer.class).single());
                    ReflectionTestUtils.invokeMethod(context.getBean("supportAttachments"),"open",owner,UUID.randomUUID(),
                        taxi.blizz.backoffice.SupportCases.Category.OTHER,null,"Retention concurrency","Two files",attachments);
                });return null;}catch(Throwable ex){return ex;}
            };
            var a=executor.submit(()->open.apply(List.copyOf(ids),firstPid));
            var b=executor.submit(()->open.apply(List.of(ids.get(1),ids.get(0)),secondPid));
            try {org.awaitility.Awaitility.await().atMost(java.time.Duration.ofSeconds(10)).until(()->blocked(firstPid.get())&&blocked(secondPid.get()));}
            finally {release.countDown();}
            holder.get(10,java.util.concurrent.TimeUnit.SECONDS);
            var results=java.util.Arrays.asList(a.get(10,java.util.concurrent.TimeUnit.SECONDS),b.get(10,java.util.concurrent.TimeUnit.SECONDS));
            assertThat(results.stream().filter(java.util.Objects::isNull).count()).as("one command owns both attachments").isEqualTo(1);
            assertThat(results.stream().filter(java.util.Objects::nonNull).toList()).singleElement().isInstanceOf(taxi.blizz.platform.DomainException.class)
                .extracting(ex->((taxi.blizz.platform.DomainException)ex).code()).isEqualTo(taxi.blizz.platform.ErrorCode.VALIDATION_FAILED);
            assertThat(jdbc.sql("select count(*) from support_case where requester_id=:id").param("id",client).query(Long.class).single()).isEqualTo(1);
        }
    }

    @Test void theLargestValidDayCountKeepsDataWithoutOverflowingPostgresTime() throws Exception {
        OffsetDateTime now=OffsetDateTime.now();Row row=seed("sessions",now.minusDays(400));
        Map<String,Object> p=days(0);p.put("sessions",Integer.MAX_VALUE);policy(p);
        io.micrometer.core.instrument.MeterRegistry meters=context.getBean(io.micrometer.core.instrument.MeterRegistry.class);
        double failures=meters.find("blizz.retention.failures").tag("kind","sessions").counters().stream().mapToDouble(c->c.count()).sum();
        run("sessions",now);assertPresent(row,true);
        assertThat(meters.find("blizz.retention.failures").tag("kind","sessions").counter().count()).isEqualTo(failures);
    }
    @Test void aFinalUploadMoveAndQuarantineCleanupCannotInterleave() throws Exception {
        Actor owner=new Actor(SubjectType.DRIVER,UUID.randomUUID());
        byte[] png=java.util.Base64.getDecoder().decode("iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAQAAAC1HAwCAAAAC0lEQVR42mNk+A8AAQUBAScY42YAAAAASUVORK5CYII=");
        var files=context.getBean(taxi.blizz.files.FileService.class);
        var upload=files.openUpload(owner,UUID.randomUUID(),taxi.blizz.files.FilePurpose.DRIVER_DOCUMENT,"image/png",png.length);
        Map<String,Object> p=days(0);p.put("quarantined_files",1);policy(p);
        var moving=new java.util.concurrent.CountDownLatch(1);var release=new java.util.concurrent.CountDownLatch(1);
        org.mockito.Mockito.doAnswer(invocation->{
            moving.countDown();if(!release.await(10,java.util.concurrent.TimeUnit.SECONDS))throw new AssertionError("Move not released");
            return invocation.callRealMethod();
        }).when(storage).store(org.mockito.ArgumentMatchers.any(java.nio.file.Path.class),org.mockito.ArgumentMatchers.anyString());
        try(var executor=java.util.concurrent.Executors.newFixedThreadPool(2)) {
            var uploaded=executor.submit(()->files.upload(owner,upload.fileId(),"image/png",png.length,new java.io.ByteArrayInputStream(png)));
            try {
                assertThat(moving.await(10,java.util.concurrent.TimeUnit.SECONDS)).isTrue();
                // Advance only the cleanup clock: make this otherwise in-flight quarantine eligible.
                executor.submit(()->run("quarantined_files",OffsetDateTime.now().plusDays(400))).get(5,java.util.concurrent.TimeUnit.SECONDS);
            } finally {release.countDown();}
            assertThat(uploaded.get(10,java.util.concurrent.TimeUnit.SECONDS).state()).isEqualTo(taxi.blizz.files.FileState.SAFE);
            run("quarantined_files",OffsetDateTime.now().plusDays(400));
            assertThat(jdbc.sql("select state from file_object where id=:id").param("id",upload.fileId()).query(String.class).single()).isEqualTo("SAFE");
            try(var content=files.open(owner,upload.fileId()).stream()){assertThat(content.readAllBytes()).isNotEmpty();}
        }
    }

    @Test void uploadExpiryUploadTimeAndQuarantineStartAreSeparateRetentionAnchors() throws Exception {
        OffsetDateTime now=OffsetDateTime.now();var expired=new ArrayList<Row>();
        for(int days:new int[]{8,6,-1}) {
            UUID id=UUID.randomUUID();
            jdbc.sql("""
                insert into file_object(id,owner_type,owner_id,purpose,declared_content_type,declared_size_bytes,
                  state,upload_expires_at,created_at)
                values(:id,'DRIVER',:id,'DRIVER_DOCUMENT','image/png',1,'AWAITING_UPLOAD',:expires,:created)
                """).param("id",id).param("expires",now.minusDays(days)).param("created",now.minusDays(400)).update();
            expired.add(new Row("file_object","id",id,null));
        }
        Row uploaded=seed("upload_sessions",now),quarantine=seed("quarantined_files",now.minusDays(400));
        jdbc.sql("update file_object set created_at=:at where id=:id").param("at",now.minusDays(400)).param("id",uploaded.id()).update();
        jdbc.sql("update file_object set quarantine_at=:at where id=:id").param("at",now).param("id",quarantine.id()).update();
        Map<String,Object> p=days(0);p.put("upload_sessions",7);p.put("quarantined_files",30);policy(p);
        run("upload_sessions",now);run("quarantined_files",now);
        assertPresent(expired.get(0),false);assertPresent(expired.get(1),true);assertPresent(expired.get(2),true);
        assertPresent(uploaded,true);assertPresent(quarantine,true);
    }
    @Test void rejectedAndUnlinkedSystemRecordingsFollowOnlyTheRecordingPolicy() throws Exception {
        OffsetDateTime now=OffsetDateTime.now();var files=context.getBean(taxi.blizz.files.FileService.class);
        var rejected=files.storeSystemFile(taxi.blizz.files.FilePurpose.CALL_RECORDING,"audio/wav",
            new java.io.ByteArrayInputStream(new byte[]{1,2,3}),1000000);
        assertThat(rejected.state()).isEqualTo(taxi.blizz.files.FileState.REJECTED);
        // Valid WAV bytes from the already-tested fake recording source, through the real encrypted storage path.
        var fake=context.getBean("fakeCallSource");
        @SuppressWarnings("unchecked") java.util.Optional<Path> wav=ReflectionTestUtils.invokeMethod(fake,"fetch","retention-orphan");
        taxi.blizz.files.StoredFile unlinked;
        try(var body=Files.newInputStream(wav.orElseThrow())) {
            unlinked=files.storeSystemFile(taxi.blizz.files.FilePurpose.CALL_RECORDING,"audio/wav",body,1000000);
        } finally {Files.deleteIfExists(wav.orElseThrow());}
        assertThat(unlinked.state()).isEqualTo(taxi.blizz.files.FileState.SAFE);
        for(UUID id:List.of(rejected.fileId(),unlinked.fileId()))jdbc.sql("update file_object set uploaded_at=case when state='SAFE' then :at else null end,scanned_at=:at,created_at=:at where id=:id")
            .param("at",now.minusDays(40)).param("id",id).update();
        String key=jdbc.sql("select storage_key from file_object where id=:id").param("id",unlinked.fileId()).query(String.class).single();
        Map<String,Object> p=days(1);p.put("call_recordings",0);policy(p);
        run("upload_sessions",now);run("quarantined_files",now);run("call_recordings",now);
        assertThat(jdbc.sql("select count(*) from file_object where id in (:a,:b)").param("a",rejected.fileId()).param("b",unlinked.fileId()).query(Long.class).single()).isEqualTo(2);
        assertThat(Files.exists(root.resolve(key))).isTrue();
        p.put("call_recordings",30);policy(p);run("call_recordings",now);
        assertThat(jdbc.sql("select count(*) from file_object where id in (:a,:b)").param("a",rejected.fileId()).param("b",unlinked.fileId()).query(Long.class).single()).isZero();
        assertThat(Files.exists(root.resolve(key))).isFalse();
    }

    @Test void quarantineCleanupRemovesTheActualPausedScannersTemporaryBytesBeforeItsRow() throws Exception {
        Actor owner=new Actor(SubjectType.DRIVER,UUID.randomUUID());
        byte[] png=java.util.Base64.getDecoder().decode("iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAQAAAC1HAwCAAAAC0lEQVR42mNk+A8AAQUBAScY42YAAAAASUVORK5CYII=");
        var files=context.getBean(taxi.blizz.files.FileService.class);
        var upload=files.openUpload(owner,UUID.randomUUID(),taxi.blizz.files.FilePurpose.DRIVER_DOCUMENT,"image/png",png.length);
        Map<String,Object> p=days(0);p.put("quarantined_files",1);policy(p);
        var scanning=new java.util.concurrent.CountDownLatch(1);var release=new java.util.concurrent.CountDownLatch(1);
        var actualPath=new java.util.concurrent.atomic.AtomicReference<Path>();
        org.mockito.Mockito.doAnswer(invocation->{
            actualPath.set(invocation.getArgument(0,Path.class));scanning.countDown();
            if(!release.await(10,java.util.concurrent.TimeUnit.SECONDS))throw new AssertionError("Scanner not released");
            return java.util.Optional.empty();
        }).when(scanner).scan(org.mockito.ArgumentMatchers.any(Path.class),org.mockito.ArgumentMatchers.anyString());
        try(var executor=java.util.concurrent.Executors.newSingleThreadExecutor()) {
            var uploading=executor.submit(()->files.upload(owner,upload.fileId(),"image/png",png.length,new java.io.ByteArrayInputStream(png)));
            try {
                assertThat(scanning.await(10,java.util.concurrent.TimeUnit.SECONDS)).isTrue();assertThat(Files.exists(actualPath.get())).isTrue();
                assertThat(Files.getPosixFilePermissions(actualPath.get())).containsExactlyInAnyOrder(
                    java.nio.file.attribute.PosixFilePermission.OWNER_READ,java.nio.file.attribute.PosixFilePermission.OWNER_WRITE);
                run("quarantined_files",OffsetDateTime.now().plusDays(400));
                assertThat(Files.exists(actualPath.get())).as("real temporary bytes removed before the upload row").isFalse();
                assertThat(jdbc.sql("select count(*) from file_object where id=:id").param("id",upload.fileId()).query(Long.class).single()).isZero();
            } finally {release.countDown();}
            assertThat(uploading.get(10,java.util.concurrent.TimeUnit.SECONDS).state()).isNotEqualTo(taxi.blizz.files.FileState.SAFE);
        }
    }

    @ParameterizedTest @ValueSource(strings={"QUARANTINE","SAFE"})
    void legacyBytesWithNoKnownKeyAreReportedAndNeverSilentlyDropped(String state) throws Exception {
        UUID id=UUID.randomUUID();OffsetDateTime now=OffsetDateTime.now();
        jdbc.sql("""
            insert into file_object(id,owner_type,owner_id,purpose,declared_content_type,declared_size_bytes,state,
              upload_expires_at,created_at,quarantine_at)
            values(:id,'DRIVER',:id,'DRIVER_DOCUMENT','image/png',1,:state,:at,:at,:at)
            """).param("id",id).param("state",state).param("at",now.minusDays(400)).update();
        String kind=state.equals("QUARANTINE")?"quarantined_files":"upload_sessions";
        Map<String,Object> p=days(0);p.put(kind,1);policy(p);
        var metrics=context.getBean(io.micrometer.core.instrument.MeterRegistry.class);
        double before=metrics.find("blizz.retention.failures").tag("kind",kind).counters().stream().mapToDouble(c->c.count()).sum();
        try {
            run(kind,now);run(kind,now);
            assertThat(jdbc.sql("select count(*) from file_object where id=:id").param("id",id).query(Long.class).single()).isEqualTo(1);
            assertThat(metrics.find("blizz.retention.failures").tag("kind",kind).counter().count()).isEqualTo(before+2);
        } finally {
            // This synthetic unknown row has no bytes; do not add failures to another test's counter delta.
            jdbc.sql("delete from file_object where id=:id").param("id",id).update();
        }
    }

}
