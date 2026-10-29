package taxi.blizz.payments.internal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import jakarta.servlet.Filter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.core.annotation.AnnotationAwareOrderComparator;
import org.springframework.http.MediaType;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.identity.ApiAudience;
import taxi.blizz.identity.SessionService;
import taxi.blizz.identity.VerifiedSubject;
import taxi.blizz.payments.PaymentReconciliations;
import taxi.blizz.payments.PaymentReconciliations.Decision;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;
import tools.jackson.databind.json.JsonMapper;

@SpringBootTest(properties="blizz.payments.reconciliation.enabled=false")
@Import(TestcontainersConfiguration.class)
class ReconciliationDecisionTests {
    @Autowired JdbcClient jdbc;
    @Autowired PaymentReconciliations api;
    @Autowired SessionService sessions;
    @Autowired WebApplicationContext context;
    @Autowired JsonMapper json;
    @Autowired ReconciliationStore store;
    @Autowired io.micrometer.core.instrument.MeterRegistry meters;
    UUID merchant,run,item,city1,city2;
    MockMvc mvc;

    @BeforeEach
    void fixture() {
        merchant=UUID.randomUUID();run=UUID.randomUUID();item=UUID.randomUUID();city1=UUID.randomUUID();city2=UUID.randomUUID();
        jdbc.sql("""
                insert into payment_merchant(id,provider,account,domain,secret_ref,currency,created_at)
                values (:id,'FAKE',:account,'example.test','test','UAH',now())
                """).param("id",merchant).param("account","decision_"+merchant).update();
        for (UUID city:List.of(city1,city2)) jdbc.sql("insert into payment_merchant_city(city_id,merchant_id) values (:city,:merchant)")
                .param("city",city).param("merchant",merchant).update();
        jdbc.sql("""
                insert into payment_reconciliation(id,merchant_id,day,period_from,period_to,state,
                    local_count,provider_count,item_count,open_count,created_at,updated_at)
                values (:id,:merchant,current_date-1,now()-interval '2 days',now()-interval '1 day','OPEN',1,1,1,1,now(),now())
                """).param("id",run).param("merchant",merchant).update();
        insertItem(item);
        List<Filter> filters=new ArrayList<>(context.getBeansOfType(Filter.class).values());
        AnnotationAwareOrderComparator.sort(filters);
        mvc=MockMvcBuilders.webAppContextSetup(context).addFilters(filters.toArray(Filter[]::new)).build();
    }

    @Test
    void decisionIsAuditedOnceAndReplaysOnlyWhileStillAuthorized() {
        Actor actor=staff(true,true,city1,city2);
        UUID command=UUID.randomUUID();
        var first=api.resolve(actor,command,item,0,Decision.EXPLAINED,"Bank checked");
        assertThat(first.state()).isEqualTo("RESOLVED");
        assertThat(first.decision()).isEqualTo(Decision.EXPLAINED);
        assertThat(api.resolve(actor,command,item,0,Decision.EXPLAINED,"Bank checked")).isEqualTo(first);
        assertThat(api.get(actor,run,null,100).run().state()).isEqualTo("RESOLVED");
        assertThat(jdbc.sql("select count(*) from audit_log where action='payment-reconciliation.resolve' and resource_id=:id")
                .param("id",item.toString()).query(Long.class).single()).isEqualTo(1);
        code(()->api.resolve(actor,UUID.randomUUID(),item,1,Decision.ESCALATED,"Another decision"),ErrorCode.STATE_CONFLICT);
        code(()->api.resolve(actor,command,item,0,Decision.ESCALATED,"Bank checked"),ErrorCode.IDEMPOTENCY_CONFLICT);
        jdbc.sql("update staff_user set permissions='{}' where id=:id").param("id",actor.id()).update();
        code(()->api.resolve(actor,command,item,0,Decision.EXPLAINED,"Bank checked"),ErrorCode.ACCESS_DENIED);
    }

    @Test
    void everyMerchantCityIsRequiredAndListsDoNotLeakOtherStatements() {
        assertThat(api.list(staff(true,false),null,null,100).runs()).isEmpty();
        Actor partial=staff(true,false,city1);
        code(()->api.get(partial,run,null,10),ErrorCode.ACCESS_DENIED);
        code(()->api.resolve(partial,UUID.randomUUID(),item,0,Decision.EXPLAINED,"Checked"),ErrorCode.ACCESS_DENIED);
        assertThat(api.list(partial,null,null,100).runs()).noneMatch(r->r.id().equals(run));
        Actor both=staff(true,false,city1,city2);
        assertThat(api.get(both,run,null,10).items()).hasSize(1);
        assertThat(api.list(both,merchant,null,10).runs()).extracting(PaymentReconciliations.Run::id).containsExactly(run);
        jdbc.sql("delete from payment_merchant_city where merchant_id=:id").param("id",merchant).update();
        code(()->api.get(both,run,null,10),ErrorCode.ACCESS_DENIED);
        assertThat(api.get(staff(true,true),run,null,10).run().id()).isEqualTo(run);
    }

    @Test
    void httpChecksValidAuthAndBodyBeforeTestingPermissionReasonAndVersion() throws Exception {
        assertThat(context.getBeansOfType(SandboxReconciliationController.class)).isEmpty();
        Actor allowed=staff(true,true);
        String token=token(allowed);
        Map<String,Object> valid=Map.of("command_id",UUID.randomUUID(),"expected_version",0,
                "decision","EXPLAINED","reason","Bank checked");
        String path="/api/admin/v1/payment-reconciliations/items/"+item+"/resolve";
        assertThat(mvc.perform(post(path).header("Authorization","Bearer "+token(staff(false,true)))
                .contentType(MediaType.APPLICATION_JSON).content(json.writeValueAsString(valid))).andReturn()
                .getResponse().getStatus()).isEqualTo(403);
        var noReason=new java.util.LinkedHashMap<>(valid);noReason.remove("reason");
        assertThat(mvc.perform(post(path).header("Authorization","Bearer "+token).contentType(MediaType.APPLICATION_JSON)
                .content(json.writeValueAsString(noReason))).andReturn().getResponse().getStatus()).isEqualTo(400);
        var missingVersion=new java.util.LinkedHashMap<>(valid);missingVersion.remove("expected_version");
        assertThat(mvc.perform(post(path).header("Authorization","Bearer "+token).contentType(MediaType.APPLICATION_JSON)
                .content(json.writeValueAsString(missingVersion))).andReturn().getResponse().getStatus()).isEqualTo(400);
        assertThat(mvc.perform(get("/api/admin/v1/payment-reconciliations").param("merchant_id",merchant.toString())
                .header("Authorization","Bearer "+token)).andReturn().getResponse().getStatus()).isEqualTo(200);
        assertThat(mvc.perform(post(path).header("Authorization","Bearer "+token).contentType(MediaType.APPLICATION_JSON)
                .content(json.writeValueAsString(valid))).andReturn().getResponse().getStatus()).isEqualTo(200);
    }

    @Test
    void pastedPhoneAndCardMaskNeverReachItemsAuditOrStoredOutcome() {
        Actor actor=staff(true,true);
        var resolved=api.resolve(actor,UUID.randomUUID(),item,0,Decision.ESCALATED,"Check +380501234567 and 41****1111");
        assertThat(resolved.reason()).isEqualTo("Check [redacted] and [redacted]");
        String persisted=jdbc.sql("""
                select jsonb_build_object('item',(select to_jsonb(i) from payment_reconciliation_item i where id=:id),
                    'audit',(select jsonb_agg(to_jsonb(a)) from audit_log a where actor_id=:actor),
                    'receipts',(select jsonb_agg(to_jsonb(c)) from command_receipt c where scope like :scope))::text
                """).param("id",item).param("actor",actor.id()).param("scope","%"+actor.id()+"%")
                .query(String.class).single();
        assertThat(persisted).doesNotContain("380501234567","41****1111");
    }

    @Test
    void concurrentDecisionsOnDifferentItemsKeepTheRunCountConsistent() {
        UUID second=UUID.randomUUID();insertItem(second);
        jdbc.sql("update payment_reconciliation set item_count=2,open_count=2 where id=:id").param("id",run).update();
        Actor actor=staff(true,true);
        var one=java.util.concurrent.CompletableFuture.supplyAsync(()->api.resolve(actor,UUID.randomUUID(),item,0,Decision.EXPLAINED,"Checked"));
        var two=java.util.concurrent.CompletableFuture.supplyAsync(()->api.resolve(actor,UUID.randomUUID(),second,0,Decision.ESCALATED,"Checked"));
        one.join();two.join();
        assertThat(api.get(actor,run,null,10).run().openCount()).isZero();
        assertThat(api.get(actor,run,null,10).run().state()).isEqualTo("RESOLVED");
    }

    @Test
    void failedAttemptReusesIdentityAndCompletedCleanSnapshotStoresFees() {
        var day=java.time.LocalDate.now(java.time.ZoneOffset.UTC).minusDays(3);
        var attempt=store.begin(merchant,day,false);
        assertThat(attempt.acquired()).isTrue();
        assertThat(store.begin(merchant,day,false).acquired()).isFalse();
        store.fail(attempt,"RECONCILIATION_PROVIDER_UNAVAILABLE");
        assertThat(meters.get("blizz.payments.reconciliation.failed").gauge().value()).isGreaterThanOrEqualTo(1);
        assertThat(store.begin(merchant,day,false).acquired()).as("not before its pause").isFalse();
        jdbc.sql("update payment_reconciliation set next_attempt_at=now()-interval '1 second' where id=:id")
                .param("id",attempt.run().id()).update();
        var retry=store.begin(merchant,day,false);
        assertThat(retry.run().id()).isEqualTo(attempt.run().id());
        assertThat(retry.run().attempts()).isEqualTo(2);
        var entry=new PaymentProvider.ProviderTransaction("clean-anchor","PURCHASE","Approved",100,"UAH",3L,
                java.time.Instant.now(),java.time.Instant.now());
        var clean=store.complete(retry,1,List.of(entry),List.of(),java.time.OffsetDateTime.now());
        assertThat(clean.state()).isEqualTo("CLEAN");
        assertThat(clean.itemCount()).isZero();
        assertThat(jdbc.sql("select fee_minor from payment_reconciliation_entry where run_id=:id")
                .param("id",clean.id()).query(Long.class).single()).isEqualTo(3);
        assertThat(store.begin(merchant,day,false).acquired()).isFalse();
        assertThat(store.fail(attempt,"RECONCILIATION_INVALID_RESPONSE").state()).isEqualTo("CLEAN");
    }

    @Test
    void expiredLeaseCannotOverwriteTheNewAttemptAndConcurrentBeginHasOneOwner() {
        var day=java.time.LocalDate.now(java.time.ZoneOffset.UTC).minusDays(4);
        var tasks=java.util.stream.IntStream.range(0,8).mapToObj(n->java.util.concurrent.CompletableFuture
                .supplyAsync(()->store.begin(merchant,day,false))).toList();
        var attempts=tasks.stream().map(java.util.concurrent.CompletableFuture::join).toList();
        assertThat(attempts.stream().filter(ReconciliationStore.Attempt::acquired)).hasSize(1);
        var old=attempts.stream().filter(ReconciliationStore.Attempt::acquired).findFirst().orElseThrow();
        jdbc.sql("update payment_reconciliation set lease_until=now()-interval '1 minute' where id=:id")
                .param("id",old.run().id()).update();
        var current=store.begin(merchant,day,false);
        assertThat(current.acquired()).isTrue();
        assertThat(current.token()).isNotEqualTo(old.token());
        assertThat(store.complete(old,0,List.of(),List.of(),java.time.OffsetDateTime.now()).state()).isEqualTo("RUNNING");
        assertThat(store.complete(current,0,List.of(),List.of(),java.time.OffsetDateTime.now()).state()).isEqualTo("CLEAN");
    }

    @Test
    void oneMerchantsSuccessCannotHideAnothersStaleOrFailedReconciliation() {
        jdbc.sql("update payment_merchant set created_at=now()-interval '30 hours' where id=:id").param("id",merchant).update();
        var failed=store.begin(merchant,java.time.LocalDate.now(java.time.ZoneOffset.UTC).minusDays(5),false);
        store.fail(failed,"RECONCILIATION_PROVIDER_UNAVAILABLE");
        assertThat(meters.get("blizz.payments.reconciliation.oldest.success.age").gauge().value()).isGreaterThan(29*3600);
        assertThat(meters.find("blizz.payments.reconciliation.items").gauges()).hasSize(taxi.blizz.payments.PaymentReconciliations.Kind.values().length);
        assertThat(meters.get("blizz.payments.reconciliation.items").tag("kind","AMOUNT").gauge().value()).isGreaterThanOrEqualTo(1);
    }

    @Test
    void paginationAndFreshnessUseBoundedIndexesOnOneHundredThousandHistoricalRuns() {
        jdbc.sql("""
                insert into payment_reconciliation(id,merchant_id,day,period_from,period_to,state,
                    local_count,provider_count,item_count,open_count,created_at,updated_at,finished_at)
                select md5(:prefix||n)::uuid,:merchant,date '1700-01-01'+n,
                    now()-interval '1 minute',now(),'CLEAN',0,0,0,0,now(),now(),now()-n*interval '1 minute'
                from generate_series(1,100000) n
                on conflict (merchant_id,day,partial) do nothing
                """).param("prefix",merchant.toString()).param("merchant",merchant).update();
        jdbc.sql("analyze payment_reconciliation").update();
        Actor actor=staff(true,true);
        long start=System.nanoTime();
        var first=api.list(actor,merchant,null,20);
        var second=api.list(actor,merchant,first.nextCursor(),20);
        assertThat(first.runs()).hasSize(20);
        assertThat(second.runs()).hasSize(20);
        assertThat(first.runs()).doesNotContainAnyElementsOf(second.runs());
        double age=meters.get("blizz.payments.reconciliation.oldest.success.age").gauge().value();
        assertThat(Double.isFinite(age)).isTrue();
        long elapsed=System.nanoTime()-start;
        System.out.printf("RECONCILIATION_VOLUME two_pages_and_freshness_ms=%.3f%n",elapsed/1e6);
        assertThat(java.time.Duration.ofNanos(elapsed)).isLessThan(java.time.Duration.ofSeconds(1));
        String listSql=(String)org.springframework.test.util.ReflectionTestUtils.getField(api,"LIST_SQL");
        String pagePlan=jdbc.sql("explain (analyze,buffers,format json) "+listSql).param("merchant",merchant)
                .param("after",null).param("allCities",true).param("cities",List.of(city1,city2)).param("limit",21)
                .query(String.class).single();
        String freshnessSql=(String)org.springframework.test.util.ReflectionTestUtils.getField(
                context.getBean(ReconciliationMetrics.class),"LAST_SUCCESS_SQL");
        String freshnessPlan=jdbc.sql("explain (analyze,buffers,format json) "+freshnessSql)
                .param("now",java.time.OffsetDateTime.now()).query(String.class).single();
        System.out.println("RECONCILIATION_VOLUME page_plan="+pagePlan);
        System.out.println("RECONCILIATION_VOLUME freshness_plan="+freshnessPlan);
        assertThat(pagePlan).contains("payment_reconciliation_merchant_page_idx");
        assertThat(freshnessPlan).contains("payment_reconciliation_last_success_idx");
        noHistorySeqScan(json.readValue(pagePlan,Object.class));
        noHistorySeqScan(json.readValue(freshnessPlan,Object.class));
    }

    private static void noHistorySeqScan(Object node) {
        if (node instanceof Map<?,?> map) {
            if ("payment_reconciliation".equals(map.get("Relation Name"))) {
                assertThat(map.get("Node Type")).isNotEqualTo("Seq Scan");
            }
            map.values().forEach(ReconciliationDecisionTests::noHistorySeqScan);
        } else if (node instanceof List<?> list) list.forEach(ReconciliationDecisionTests::noHistorySeqScan);
    }

    @Test
    void redactingAMaximumLengthReasonKeepsTheStoredContractLimit() {
        var resolved=api.resolve(staff(true,true),UUID.randomUUID(),item,0,Decision.EXPLAINED,"**** ".repeat(100));
        assertThat(resolved.reason().length()).isLessThanOrEqualTo(500);
        assertThat(resolved.reason()).doesNotContain("****");
    }

    @Test
    void sandboxPreviewCannotBlockTheAuthoritativeDailySnapshot() {
        var day=java.time.LocalDate.now(java.time.ZoneOffset.UTC).minusDays(8);
        var preview=store.begin(merchant,day,true);
        store.complete(preview,0,List.of(),List.of(),java.time.OffsetDateTime.now());
        assertThat(store.begin(merchant,day,true).acquired()).isFalse();
        var full=store.begin(merchant,day,false);
        assertThat(full.acquired()).isTrue();
        assertThat(full.run().id()).isNotEqualTo(preview.run().id());
        assertThat(full.run().partial()).isFalse();
        assertThat(store.complete(full,0,List.of(),List.of(),java.time.OffsetDateTime.now()).state()).isEqualTo("CLEAN");
    }

    @Test
    void dailyCutoffIsUtc0215EvenAcrossCalendarBoundaries() {
        assertThat(ReconciliationSchedule.latestCompletedDay(java.time.Instant.parse("2026-11-01T02:14:59Z")))
                .isEqualTo(java.time.LocalDate.parse("2026-10-30"));
        assertThat(ReconciliationSchedule.latestCompletedDay(java.time.Instant.parse("2026-11-01T02:15:00Z")))
                .isEqualTo(java.time.LocalDate.parse("2026-10-31"));
    }

    @Test
    void malformedPaginationAndOutOfRangeLimitsAreRefusedAfterAuthorization() {
        Actor actor=staff(true,true);
        code(()->api.list(actor,merchant,"not-a-uuid",20),ErrorCode.VALIDATION_FAILED);
        code(()->api.list(actor,merchant,null,0),ErrorCode.VALIDATION_FAILED);
        code(()->api.get(actor,run,null,201),ErrorCode.VALIDATION_FAILED);
        assertThat(api.get(actor,run,null,200).items()).hasSize(1);
    }

    private void insertItem(UUID id) {
        jdbc.sql("""
                insert into payment_reconciliation_item(id,run_id,kind,reference_fingerprint)
                values (:id,:run,'AMOUNT',:fingerprint)
                """).param("id",id).param("run",run).param("fingerprint",ReconciliationStore.fingerprint(merchant,id.toString())).update();
    }
    private Actor staff(boolean permission,boolean all,UUID... cities) {
        UUID id=UUID.randomUUID();
        jdbc.sql("""
                insert into staff_user(id,login,name,role,permissions,all_cities,city_scope,state,created_at,updated_at)
                values (:id,:login,'Reconciliation reviewer','ADMIN',:permissions,:all,:cities,'ACTIVE',now(),now())
                """).param("id",id).param("login","reconciliation_"+id)
                .param("permissions",permission?new String[]{PaymentReconciliations.RESOLVE_PERMISSION}:new String[0])
                .param("all",all).param("cities",cities).update();
        return new Actor(SubjectType.STAFF,id);
    }
    private String token(Actor actor) { return sessions.openStaff(new VerifiedSubject(actor,"ACTIVE",false),ApiAudience.ADMIN,null).accessToken(); }
    private static void code(Runnable action,ErrorCode expected) {
        assertThatThrownBy(action::run).isInstanceOfSatisfying(DomainException.class,error->assertThat(error.code()).isEqualTo(expected));
    }
}
