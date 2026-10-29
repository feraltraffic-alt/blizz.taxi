package taxi.blizz.payments.internal;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.test.util.ReflectionTestUtils;
import taxi.blizz.TestQuotes;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.SessionService;
import taxi.blizz.operations.CreateOrder;
import taxi.blizz.operations.Dispatch;
import taxi.blizz.operations.Orders;
import taxi.blizz.operations.PaymentMethod;
import taxi.blizz.operations.Trips;
import taxi.blizz.operations.WorkSessions;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.internal.OutboxRelay;
import taxi.blizz.pricing.QuoteService;

/** Deliberate statement errors against real holds, without changing money through reconciliation. */
@SpringBootTest(properties = "blizz.payments.reconciliation.enabled=false")
@Import(TestcontainersConfiguration.class)
class CardReconciliationTests {
    static final GeoPoint PICKUP = new GeoPoint(-39.5, -119.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, -119.45);
    @Autowired JdbcClient jdbc;
    @Autowired Orders orders;
    @Autowired Dispatch dispatch;
    @Autowired Trips trips;
    @Autowired WorkSessions sessions;
    @Autowired SessionService auth;
    @Autowired QuoteService quotes;
    @Autowired FakeProvider.Gateway gateway;
    @Autowired ApplicationContext context;
    @Autowired OutboxRelay relay;
    @Autowired PaymentWorker worker;
    @Autowired taxi.blizz.payments.PaymentCards cards;
    @Autowired taxi.blizz.payments.CardTopUps topUps;
    @Autowired FakeVerifyController pages;
    @Autowired Providers providers;
    @Autowired io.micrometer.core.instrument.MeterRegistry meters;
    @Autowired org.springframework.transaction.support.TransactionTemplate tx;
    @Autowired taxi.blizz.operations.Tips tips;
    TestRides rides;
    UUID city;
    UUID merchant;
    UUID operation;
    UUID orderId;
    Actor rider;
    String account;
    Map<String, Object> statement;

    @BeforeEach
    void heldCardOrder() {
        gateway.reset();
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        city = rides.city("test-card-reconciliation", "UAH", -120);
        for (UUID previous:jdbc.sql("select id from ride_order where city_id=:city and status in ('AWAITING_PAYMENT','READY','SEARCHING')")
                .param("city",city).query(UUID.class).list()) {
            var old=orders.get(previous);
            orders.cancel(new Actor(taxi.blizz.platform.SubjectType.CLIENT,old.payerClientId()),UUID.randomUUID(),
                    previous,old.version(),"CHANGED_MIND");
        }
        merchant = UUID.randomUUID();
        account = "reconciliation_" + merchant;
        jdbc.sql("""
                insert into payment_merchant(id,provider,account,domain,secret_ref,currency,created_at)
                values (:id,'FAKE',:account,'example.test','test','UAH',now())
                """).param("id", merchant).param("account", account).update();
        jdbc.sql("""
                insert into payment_merchant_city(city_id,merchant_id) values (:city,:merchant)
                on conflict (city_id) do update set merchant_id=excluded.merchant_id
                """).param("city", city).param("merchant", merchant).update();
        rider = rides.client();
        jdbc.sql("""
                insert into payment_card(id,client_id,merchant_id,token,masked_pan,card_type,state,created_at)
                values (:id,:client,:merchant,:token,'41****1111','Visa','ACTIVE',now())
                """).param("id", UUID.randomUUID()).param("client", rider.id()).param("merchant", merchant)
                .param("token", "tok-" + rider.id()).update();
        UUID quote = new TestQuotes(jdbc, quotes).quote(rider, city, "STANDARD", PICKUP, DROPOFF).id();
        orderId = orders.create(rider, UUID.randomUUID(), new CreateOrder(rider.id(), "STANDARD", PICKUP,
                "Home", DROPOFF, "Work", PaymentMethod.CARD, quote)).id();
        Map<String, Object> op = jdbc.sql("""
                select o.id,o.reference,o.amount_minor,o.state from payment_operation o
                join payment_intent i on i.id=o.intent_id where i.order_id=:order and o.type='AUTH'
                """).param("order", orderId).query().singleRow();
        assertThat(op.get("state")).isEqualTo("SUCCEEDED");
        operation = (UUID) op.get("id");
        statement = new LinkedHashMap<>(Map.of("orderReference", op.get("reference"), "transactionType", "PURCHASE",
                "transactionStatus", "WaitingAuthComplete", "amount", WayForPayProvider.amount(((Number) op.get("amount_minor")).longValue()),
                "currency", "UAH", "createdDate", OffsetDateTime.now().toEpochSecond(),
                "processingDate", OffsetDateTime.now().toEpochSecond(), "fee", "1.23"));
    }

    @Test void amountMismatchIsExactlyOneItem() { statement.put("amount", "0.01"); difference("AMOUNT"); }
    @Test void currencyMismatchIsExactlyOneItem() { statement.put("currency", "PLN"); difference("CURRENCY"); }
    @Test void stateMismatchIsExactlyOneItem() { statement.put("transactionStatus", "Declined"); difference("STATE"); }
    @Test void absentProviderRowIsExactlyOneItem() { override(List.of()); differenceAlreadyOverridden("MISSING_AT_PROVIDER"); }
    @Test void absentLocalRowIsExactlyOneItem() {
        Map<String,Object> extra = new LinkedHashMap<>(statement);
        extra.put("orderReference", "external-+380501234567-41****1111");
        extra.put("phone", "+380501234567");
        extra.put("cardPan", "41****1111");
        extra.put("email", "fixture-customer");
        extra.put("transactionStatus", "Approved");
        override(List.of(statement, extra));
        differenceAlreadyOverridden("MISSING_LOCALLY");
    }
    @Test void aFinalProviderAnswerDoesNotApplyAnUnknownLocalOperation() {
        jdbc.sql("update payment_operation set state='UNKNOWN' where id=:id").param("id", operation).update();
        try { difference("UNKNOWN_STILL"); }
        finally { jdbc.sql("update payment_operation set state='SUCCEEDED' where id=:id").param("id",operation).update(); }
    }

    @Test
    void cleanDayAndThreeRerunsKeepOneImmutableSnapshot() {
        override(List.of(statement));
        UUID first = run();
        assertThat(run()).isEqualTo(first);
        assertThat(run()).isEqualTo(first);
        assertThat(jdbc.sql("select state from payment_reconciliation where id=:id").param("id", first)
                .query(String.class).single()).isEqualTo("CLEAN");
        assertThat(jdbc.sql("select count(*) from payment_reconciliation_item where run_id=:id").param("id", first)
                .query(Long.class).single()).isZero();
    }

    @Test
    void providerFailureIsFailedWithUnknownCountsAndRetryReusesTheRun() {
        override(Map.of("reasonCode", 1113, "transactionList", List.of()));
        UUID first = run();
        Map<String,Object> failed = jdbc.sql("select * from payment_reconciliation where id=:id")
                .param("id", first).query().singleRow();
        assertThat(failed.get("state")).isEqualTo("FAILED");
        assertThat(failed.get("provider_count")).isNull();
        assertThat(failed.get("item_count")).isNull();
        assertThat(failed.get("failure_code")).isEqualTo("RECONCILIATION_INVALID_RESPONSE");
        override(List.of(statement));
        assertThat(run()).isEqualTo(first);
        assertThat(jdbc.sql("select state from payment_reconciliation where id=:id").param("id", first)
                .query(String.class).single()).isEqualTo("CLEAN");
    }

    @Test
    void capturedRideTipAndVoidedHoldReconcileCleanAgainstTheActualFakeBank() {
        TestRides.Driver driver=rides.driverNear(PICKUP);
        drain();
        var offer=dispatch.offers(driver.actor()).stream().filter(o->o.orderId().equals(orderId)).findFirst().orElseThrow();
        dispatch.accept(driver.actor(),UUID.randomUUID(),offer.id());
        var trip=trips.current(driver.actor()).orElseThrow();
        rides.moveTo(driver,TestRides.north(PICKUP,20));
        var waiting=trips.arrive(driver.actor(),UUID.randomUUID(),trip.id(),trip.version(),null);
        var started=trips.start(driver.actor(),UUID.randomUUID(),waiting.id(),waiting.version(),null);
        trips.complete(driver.actor(),UUID.randomUUID(),started.id(),started.version(),OffsetDateTime.now(),null);
        settle();
        tips.leave(rider,UUID.randomUUID(),orderId,100);
        settle();
        UUID quote=new TestQuotes(jdbc,quotes).quote(rider,city,"STANDARD",PICKUP,DROPOFF).id();
        var voided=orders.create(rider,UUID.randomUUID(),new CreateOrder(rider.id(),"STANDARD",PICKUP,"Home",
                DROPOFF,"Work",PaymentMethod.CARD,quote));
        orders.cancel(rider,UUID.randomUUID(),voided.id(),orders.get(voided.id()).version(),"CHANGED_MIND");
        settle();
        assertThat(jdbc.sql("select o.type from payment_operation o join payment_intent i on i.id=o.intent_id where i.merchant_id=:merchant and o.state='SUCCEEDED'")
                .param("merchant",merchant).query(String.class).list()).contains("AUTH","SETTLE","TIP","REFUND");
        String before=moneySnapshot();
        UUID id=run();
        assertThat(jdbc.sql("select state from payment_reconciliation where id=:id").param("id",id)
                .query(String.class).single()).isEqualTo("CLEAN");
        assertThat(jdbc.sql("select count(*) from payment_reconciliation_item where run_id=:id").param("id",id)
                .query(Long.class).single()).isZero();
        assertThat(moneySnapshot()).isEqualTo(before);
    }

    @Test
    void gatewayTimeoutIsAFailedRunAndNextAttemptUsesTheSameIdentity() {
        jdbc.sql("update payment_operation set created_at=now()-interval '1 day',updated_at=now()-interval '1 day' where id=:id")
                .param("id",operation).update();
        statement.put("createdDate",((Number)statement.get("createdDate")).longValue()-86400);
        statement.put("processingDate",((Number)statement.get("processingDate")).longValue()-86400);
        override(List.of(statement));
        gateway.next("TIMEOUT");
        double failures=meters.get("blizz.payments.reconciliation.failures").counter().count();
        LocalDate yesterday=LocalDate.now(ZoneOffset.UTC).minusDays(1);
        UUID id=run(yesterday,false);
        assertThat(jdbc.sql("select state from payment_reconciliation where id=:id").param("id",id)
                .query(String.class).single()).isEqualTo("FAILED");
        assertThat(jdbc.sql("select failure_code from payment_reconciliation where id=:id").param("id",id)
                .query(String.class).single()).isEqualTo("RECONCILIATION_PROVIDER_UNAVAILABLE");
        assertThat(meters.get("blizz.payments.reconciliation.failures").counter().count()).isEqualTo(failures+1);
        assertThat(meters.get("blizz.payments.reconciliation.failed").gauge().value()).isGreaterThanOrEqualTo(1);
        assertThat(run(yesterday,false)).isEqualTo(id);
        assertThat(jdbc.sql("select state from payment_reconciliation where id=:id").param("id",id)
                .query(String.class).single()).isEqualTo("CLEAN");
    }

    @Test
    void statementFetchHappensOutsideAnyDatabaseTransaction() {
        WayForPayProvider bank=(WayForPayProvider)providers.byName().get("FAKE");
        var previous=(WayForPayProvider.Transport)ReflectionTestUtils.getField(bank,"transport");
        ReflectionTestUtils.setField(bank,"transport",(WayForPayProvider.Transport)(url,body)->{
            if ("TRANSACTION_LIST".equals(body.get("transactionType"))) {
                assertThat(org.springframework.transaction.support.TransactionSynchronizationManager.isActualTransactionActive())
                        .as("provider statement must not hold a DB transaction open").isFalse();
            }
            return previous.post(url,body);
        });
        try { run(); }
        finally { ReflectionTestUtils.setField(bank,"transport",previous); }
    }

    @Test
    void callersCannotStartAStatementFetchInsideABusinessTransaction() {
        org.assertj.core.api.Assertions.assertThatThrownBy(()->tx.executeWithoutResult(status->run()))
                .isInstanceOf(IllegalStateException.class).hasMessage("Reconciliation cannot join a business transaction");
        assertThat(jdbc.sql("select count(*) from payment_reconciliation where merchant_id=:id").param("id",merchant)
                .query(Long.class).single()).isZero();
    }

    @Test
    void finalAnswerForAPendingOperationIsRecordedWithoutApplyingIt() {
        jdbc.sql("update payment_operation set state='PENDING' where id=:id").param("id",operation).update();
        try { difference("UNKNOWN_STILL"); }
        finally { jdbc.sql("update payment_operation set state='SUCCEEDED' where id=:id").param("id",operation).update(); }
    }

    @Test
    void expiredHoldWithoutSuccessfulReleaseIsAStateDifference() {
        statement.put("transactionStatus","Expired");difference("STATE");
    }

    @Test
    void anExpiredHoldAlreadySuccessfullyReleasedIsClean() {
        orders.cancel(rider,UUID.randomUUID(),orderId,orders.get(orderId).version(),"CHANGED_MIND");
        settle();
        statement.put("transactionStatus","Expired");override(List.of(statement));
        UUID id=run();
        assertThat(jdbc.sql("select state from payment_reconciliation where id=:id").param("id",id)
                .query(String.class).single()).isEqualTo("CLEAN");
    }

    @Test
    void oldAnchorLookupHandlesCreationDateFilteringWithoutImportingUnrelatedHistory() {
        jdbc.sql("update payment_operation set created_at=now()-interval '7 days' where id=:id")
                .param("id",operation).update();
        var oldDay=LocalDate.now(ZoneOffset.UTC).minusDays(7);
        long primary=LocalDate.now(ZoneOffset.UTC).atStartOfDay().toEpochSecond(ZoneOffset.UTC)-7200;
        long supplementary=oldDay.atStartOfDay().toEpochSecond(ZoneOffset.UTC)-7200;
        Map<String,Object> oldRow=new LinkedHashMap<>(statement);
        oldRow.put("createdDate",supplementary+10800);
        Map<String,Object> unrelated=new LinkedHashMap<>(oldRow);
        unrelated.put("orderReference","unrelated-historical-bank-charge");unrelated.put("transactionStatus","Approved");
        WayForPayProvider bank=(WayForPayProvider)providers.byName().get("FAKE");
        var previous=(WayForPayProvider.Transport)ReflectionTestUtils.getField(bank,"transport");
        var calls=new java.util.concurrent.atomic.AtomicInteger();
        ReflectionTestUtils.setField(bank,"transport",(WayForPayProvider.Transport)(url,body)->{
            if (!"TRANSACTION_LIST".equals(body.get("transactionType"))) return previous.post(url,body);
            calls.incrementAndGet();
            long from=((Number)body.get("dateBegin")).longValue();
            if (from==primary) return Map.of("reasonCode",1100,"transactionList",List.of());
            assertThat(from).isEqualTo(supplementary);
            return Map.of("reasonCode",1100,"transactionList",List.of(oldRow,unrelated));
        });
        try {
            UUID id=run();assertThat(run()).isEqualTo(id);
            assertThat(calls.get()).isEqualTo(2);
            assertThat(jdbc.sql("select state from payment_reconciliation where id=:id").param("id",id)
                    .query(String.class).single()).isEqualTo("CLEAN");
            assertThat(jdbc.sql("select provider_count from payment_reconciliation where id=:id").param("id",id)
                    .query(Integer.class).single()).isEqualTo(1);
        } finally { ReflectionTestUtils.setField(bank,"transport",previous); }
    }

    @Test
    void exhaustingTheDefensiveWindowBudgetIsFailedInsteadOfInventingMissingRows() {
        jdbc.sql("update payment_operation set created_at=now()-interval '7 days' where id=:id")
                .param("id",operation).update();override(List.of());
        Object service=context.getBean("cardReconciliation");
        Object previous=ReflectionTestUtils.getField(service,"maximumWindows");
        ReflectionTestUtils.setField(service,"maximumWindows",0);
        try {
            UUID id=run();
            assertThat(jdbc.sql("select failure_code from payment_reconciliation where id=:id").param("id",id)
                    .query(String.class).single()).isEqualTo("RECONCILIATION_TOO_MANY_WINDOWS");
            assertThat(jdbc.sql("select count(*) from payment_reconciliation_item where run_id=:id").param("id",id)
                    .query(Long.class).single()).isZero();
        } finally { ReflectionTestUtils.setField(service,"maximumWindows",previous); }
    }

    @Test
    void conflictingBankRowsAndUnownedPendingEvidenceFailTheSnapshot() {
        Map<String,Object> conflicting=new LinkedHashMap<>(statement);conflicting.put("amount","0.01");
        override(List.of(statement,conflicting));
        UUID id=run();
        assertThat(jdbc.sql("select failure_code from payment_reconciliation where id=:id").param("id",id)
                .query(String.class).single()).isEqualTo("RECONCILIATION_CONFLICTING_BANK_EVIDENCE");
        Map<String,Object> pending=new LinkedHashMap<>(statement);
        pending.put("orderReference","unowned-pending-bank-charge");pending.put("transactionStatus","InProcessing");
        override(List.of(statement,pending));
        assertThat(run()).isEqualTo(id);
        assertThat(jdbc.sql("select failure_code from payment_reconciliation where id=:id").param("id",id)
                .query(String.class).single()).isEqualTo("RECONCILIATION_UNOWNED_PENDING_TRANSACTION");
        pending.put("transactionStatus","Approved");override(List.of(statement,pending));
        assertThat(run()).isEqualTo(id);
        assertThat(jdbc.sql("select kind from payment_reconciliation_item where run_id=:id").param("id",id)
                .query(String.class).list()).containsExactly("MISSING_LOCALLY");
    }

    @Test
    void theDailyCohortAndAnchorLookupStayBoundedOnOneHundredThousandOldOperations() {
        UUID card=jdbc.sql("select card_id from payment_intent where order_id=:id").param("id",orderId).query(UUID.class).single();
        jdbc.sql("""
                insert into payment_intent(id,order_id,client_id,merchant_id,card_id,currency,hold_minor,state,created_at,updated_at)
                select md5(:prefix||'intent'||n)::uuid,md5(:prefix||'order'||n)::uuid,:client,:merchant,:card,'UAH',100,
                    'AUTHORIZED',now()-interval '60 days',now()-interval '60 days' from generate_series(1,100000) n
                """).param("prefix",merchant.toString()).param("client",rider.id()).param("merchant",merchant).param("card",card).update();
        jdbc.sql("""
                insert into payment_operation(id,intent_id,type,reference,target,amount_minor,state,created_at,updated_at,correlation_id)
                select md5(:prefix||'auth'||n)::uuid,md5(:prefix||'intent'||n)::uuid,'AUTH',:prefix||'-old-'||n,
                    :prefix||'-old-'||n,100,'SUCCEEDED',now()-interval '60 days',now()-interval '60 days',gen_random_uuid()
                from generate_series(1,100000) n
                """).param("prefix",merchant.toString()).update();
        jdbc.sql("analyze payment_operation").update();jdbc.sql("analyze payment_intent").update();
        ReconciliationLocals projection=context.getBean(ReconciliationLocals.class);
        OffsetDateTime from=LocalDate.now(ZoneOffset.UTC).atStartOfDay().atOffset(ZoneOffset.UTC).minusHours(2);
        OffsetDateTime until=OffsetDateTime.now();
        long start=System.nanoTime();
        var candidates=projection.candidates(merchant,from,until);
        assertThat(candidates).containsExactly((String)statement.get("orderReference"));
        assertThat(projection.load(merchant,candidates)).hasSize(1);
        UUID id=run();
        assertThat(jdbc.sql("select state from payment_reconciliation where id=:id").param("id",id)
                .query(String.class).single()).isEqualTo("CLEAN");
        long elapsed=System.nanoTime()-start;
        System.out.printf("RECONCILIATION_OPERATIONS_VOLUME cohort_lookup_full_run_ms=%.3f%n",elapsed/1e6);
        assertThat(java.time.Duration.ofNanos(elapsed)).isLessThan(java.time.Duration.ofSeconds(1));
        String cohortSql=(String)ReflectionTestUtils.getField(projection,"CANDIDATES_SQL");
        String cohortPlan=jdbc.sql("explain (analyze,buffers,format json) "+cohortSql).param("merchant",merchant)
                .param("from",from).param("until",until).query(String.class).single();
        String lookupSql=(String)ReflectionTestUtils.getField(projection,"OPERATIONS_SQL");
        String lookupPlan=jdbc.sql("explain (analyze,buffers,format json) "+lookupSql).param("merchant",merchant)
                .param("references",candidates.toArray(String[]::new)).query(String.class).single();
        System.out.println("RECONCILIATION_OPERATIONS_VOLUME cohort_plan="+cohortPlan);
        System.out.println("RECONCILIATION_OPERATIONS_VOLUME lookup_plan="+lookupPlan);
        assertThat(cohortPlan).contains("payment_operation_reconciliation_created_idx","payment_operation_reconciliation_updated_idx");
        assertThat(lookupPlan).contains("payment_operation_reconciliation_target_idx");
    }

    @Test
    void realTopUpAndZeroVerificationAreRecognizedWithoutBeingMissingLocalOperations() {
        var binding=cards.startBinding(rider,UUID.randomUUID(),city);
        var verification=new org.springframework.util.LinkedMultiValueMap<String,String>();
        binding.fields().forEach(verification::add);
        assertThat(pages.verify(verification).getStatusCode().value()).isEqualTo(303);
        assertThat(cards.binding(rider,binding.id()).state()).isEqualTo("COMPLETED");
        var topUp=topUps.start(rider,UUID.randomUUID(),city,15000);
        var purchase=new org.springframework.util.LinkedMultiValueMap<String,String>();
        topUp.fields().forEach(purchase::add);
        assertThat(pages.pay(purchase).getStatusCode().value()).isEqualTo(303);
        assertThat(topUps.topUp(rider,topUp.id()).state()).isEqualTo("COMPLETED");
        drain();
        String before=moneySnapshot();
        UUID id=run();
        assertThat(jdbc.sql("select state from payment_reconciliation where id=:id").param("id",id)
                .query(String.class).single()).isEqualTo("CLEAN");
        assertThat(jdbc.sql("select provider_count from payment_reconciliation where id=:id").param("id",id)
                .query(Integer.class).single()).isEqualTo(3);
        assertThat(moneySnapshot()).isEqualTo(before);
    }

    @Test
    void anUnsupportedPartialRefundCannotBeReportedAsACleanVoid() {
        orders.cancel(rider,UUID.randomUUID(),orderId,orders.get(orderId).version(),"CHANGED_MIND");settle();
        jdbc.sql("update payment_operation set amount_minor=amount_minor-1 where intent_id in (select id from payment_intent where order_id=:order) and type='REFUND'")
                .param("order",orderId).update();
        String before=moneySnapshot();
        UUID id=run();
        assertThat(jdbc.sql("select failure_code from payment_reconciliation where id=:id").param("id",id)
                .query(String.class).single()).isEqualTo("RECONCILIATION_UNSUPPORTED_PARTIAL_REFUND");
        assertThat(moneySnapshot()).isEqualTo(before);
    }

    private void drain() { while(relay.runOnce()>0) { /* actual module consumers */ } }
    private void settle() { for(int i=0;i<4;i++) { drain();worker.runOnce(); } drain(); }

    private void difference(String kind) { override(List.of(statement)); differenceAlreadyOverridden(kind); }

    private void differenceAlreadyOverridden(String kind) {
        String before = moneySnapshot();
        UUID id = run();
        assertThat(run()).isEqualTo(id);
        assertThat(jdbc.sql("select kind from payment_reconciliation_item where run_id=:id")
                .param("id", id).query(String.class).list()).containsExactly(kind);
        assertThat(jdbc.sql("select state from payment_reconciliation where id=:id").param("id", id)
                .query(String.class).single()).isEqualTo("OPEN");
        assertThat(moneySnapshot()).isEqualTo(before);
        while (relay.runOnce() > 0) { /* actual event consumer */ }
        assertThat(jdbc.sql("select count(*) from support_case where source_key=:source")
                .param("source", "reconciliation:" + id).query(Long.class).single()).isEqualTo(1);
        String persisted = jdbc.sql("select coalesce(jsonb_agg(to_jsonb(i))::text,'[]') from payment_reconciliation_item i where run_id=:id")
                .param("id", id).query(String.class).single();
        assertThat(persisted).doesNotContain("380501234567", "41****1111", "fixture-customer", "fixture-token");
        String event=jdbc.sql("select payload::text from outbox where aggregate_id=:id and event_type='PaymentReconciliationDifferencesFound'")
                .param("id",id).query(String.class).single();
        assertThat(event).doesNotContain("380501234567", "41****1111", "fixture-customer", "fixture-token");
    }

    private String moneySnapshot() {
        return jdbc.sql("""
                select jsonb_build_object(
                  'operations',(select jsonb_agg(to_jsonb(o) order by o.id) from payment_operation o join payment_intent i on i.id=o.intent_id where i.merchant_id=:merchant),
                  'intents',(select jsonb_agg(to_jsonb(i) order by i.id) from payment_intent i where i.merchant_id=:merchant),
                  'journal_lines',(select md5(jsonb_agg(to_jsonb(l) order by l.transaction_id,l.line_no)::text) from journal_line l),
                  'journal_transactions',(select md5(jsonb_agg(to_jsonb(t) order by t.id)::text) from journal_transaction t))::text
                """).param("merchant", merchant).query(String.class).single();
    }

    private void override(List<Map<String,Object>> rows) {
        override(Map.of("reasonCode", 1100, "transactionList", rows));
    }
    private void override(Map<String,Object> response) {
        ReflectionTestUtils.invokeMethod(gateway, "reconciliationList", account, response);
    }
    private UUID run() { return run(LocalDate.now(ZoneOffset.UTC),true); }
    private UUID run(LocalDate day,boolean partial) {
        Object result = ReflectionTestUtils.invokeMethod(context.getBean("cardReconciliation"), "run", merchant,day,partial);
        return ReflectionTestUtils.invokeMethod(result, "id");
    }
}
