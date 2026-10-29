package taxi.blizz.payments.internal;

import static org.assertj.core.api.Assertions.assertThat;

import io.micrometer.core.instrument.MeterRegistry;
import java.time.Clock;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.Supplier;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.transaction.support.TransactionTemplate;
import org.testcontainers.postgresql.PostgreSQLContainer;
import org.testcontainers.utility.DockerImageName;
import taxi.blizz.TestRides;
import taxi.blizz.identity.SessionService;
import taxi.blizz.operations.Dispatch;
import taxi.blizz.operations.Orders;
import taxi.blizz.operations.Trips;
import taxi.blizz.operations.WorkSessions;
import taxi.blizz.payments.CardPayments;
import taxi.blizz.platform.InvariantChecks.Check;
import taxi.blizz.platform.InvariantChecks.Violation;
import taxi.blizz.platform.internal.OutboxRelay;
import taxi.blizz.pricing.QuoteService;
import tools.jackson.databind.json.JsonMapper;

/** History is deliberately large and isolated from other tests' negative fixtures. */
@SpringBootTest(properties = {"blizz.finance.invariants.enabled=false", "blizz.operations.invariants.enabled=false",
        "blizz.payments.invariants.enabled=false"})
@Import(InvariantVolumeTests.VolumeDatabase.class)
class InvariantVolumeTests {
    @TestConfiguration(proxyBeanMethods = false)
    static class VolumeDatabase {
        static final PostgreSQLContainer DATABASE = new PostgreSQLContainer(
                DockerImageName.parse("postgis/postgis:18-3.6").asCompatibleSubstituteFor("postgres"));
        @Bean @ServiceConnection PostgreSQLContainer postgres() { return DATABASE; }
    }

    @Autowired JdbcClient jdbc;
    @Autowired ApplicationContext context;
    @Autowired MeterRegistry meters;
    @Autowired TransactionTemplate tx;
    @Autowired OutboxRelay relay;
    @Autowired JsonMapper json;
    @Autowired Clock clock;
    @Autowired Orders orders;
    @Autowired Dispatch dispatch;
    @Autowired Trips trips;
    @Autowired WorkSessions sessions;
    @Autowired SessionService auth;
    @Autowired QuoteService quotes;
    @Autowired CardPayments cards;

    UUID id(String key) { return jdbc.sql("select md5(:key)::uuid").param("key", key).query(UUID.class).single(); }

    void history() {
        var rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        UUID city = rides.city("test-invariant-volume", "UAH", -172);
        UUID client = rides.client().id();
        UUID merchant = UUID.randomUUID(), card = UUID.randomUUID();
        tx.executeWithoutResult(status -> {
            jdbc.sql("""
                    insert into payment_merchant(id,provider,account,domain,secret_ref,currency,created_at)
                    values(:id,'FAKE','volume','test.blizz.invalid','test','UAH',now())
                    """).param("id", merchant).update();
            jdbc.sql("""
                    insert into payment_card(id,client_id,merchant_id,token,masked_pan,state,created_at)
                    values(:id,:client,:merchant,'volume-token','41****1111','ACTIVE',now())
                    """).param("id", card).param("client", client).param("merchant", merchant).update();
            jdbc.sql("""
                    insert into driver(id,phone_normalized,account_state,review_status,created_at,updated_at)
                    select md5('volume-driver-'||n)::uuid,'+38079'||lpad(n::text,7,'0'),'ACTIVE','APPROVED',
                        now()-interval '60 days',now()-interval '60 days' from generate_series(1,10000) n
                    """).update();
            jdbc.sql("""
                    insert into vehicle(id,driver_id,registration_number,make,model,color,production_year,state,class_approvals,created_at,updated_at)
                    select md5('volume-vehicle-'||n)::uuid,md5('volume-driver-'||n)::uuid,'VOL'||lpad(n::text,5,'0'),
                        'Skoda','Octavia','blue',2021,'APPROVED','{STANDARD}',now(),now()
                    from generate_series(1,10000) n
                    """).update();
            jdbc.sql("""
                    insert into driver_capacity(driver_id,occupancy,assignment_id,updated_at)
                    select md5('volume-driver-'||n)::uuid,'FREE',null,now()-interval '3 minutes'
                    from generate_series(1,10000) n
                    """).update();
            jdbc.sql("""
                    insert into ride_order(id,channel,payer_client_id,created_by_type,created_by_id,city_id,
                        vehicle_class,pickup,pickup_label,dropoff,dropoff_label,payment_method,price_minor,currency,
                        status,created_at,updated_at)
                    select md5('volume-order-'||n)::uuid,'APP',:client,'CLIENT',:client,:city,'STANDARD',
                        ST_SetSRID(ST_MakePoint(-171.5,-39.5),4326),'Volume',
                        ST_SetSRID(ST_MakePoint(-171.45,-39.45),4326),'Volume','CARD',100,'UAH','FULFILLED',
                        now()-interval '60 days',now()-interval '60 days' from generate_series(1,100000) n
                    """).param("client", client).param("city", city).update();
            jdbc.sql("""
                    insert into assignment(id,order_id,driver_id,vehicle_id,source,state,created_at,closed_at)
                    select md5('volume-assignment-'||n)::uuid,md5('volume-order-'||n)::uuid,
                        md5('volume-driver-'||(1+(n-1)%10000))::uuid,md5('volume-vehicle-'||(1+(n-1)%10000))::uuid,
                        'OFFER','COMPLETED',now()-interval '60 days',now()-interval '59 days'
                    from generate_series(1,100000) n
                    """).update();
            jdbc.sql("""
                    insert into payment_intent(id,order_id,client_id,merchant_id,card_id,currency,hold_minor,state,created_at,updated_at)
                    select md5('volume-intent-'||n)::uuid,md5('volume-order-'||n)::uuid,:client,:merchant,:card,'UAH',100,
                        'AUTHORIZED',now()-interval '60 days',now()-interval '60 days' from generate_series(1,100000) n
                    """).param("client", client).param("merchant", merchant).param("card", card).update();
            jdbc.sql("""
                    insert into payment_operation(id,intent_id,type,reference,target,amount_minor,state,created_at,updated_at)
                    select md5('volume-auth-'||n)::uuid,md5('volume-intent-'||n)::uuid,'AUTH',
                        'volume-auth-'||n,'volume-auth-'||n,100,'SUCCEEDED',now()-interval '60 days',now()-interval '60 days'
                    from generate_series(1,100000) n
                    """).update();
            // Bulk-load balanced history without running 300k deferred fixture checks. Restore guards in this tx.
            jdbc.sql("alter table journal_transaction disable trigger journal_transaction_has_lines").update();
            jdbc.sql("alter table journal_line disable trigger journal_line_balanced").update();
            jdbc.sql("""
                    insert into journal_transaction(id,business_key,basis_type,basis_id,currency,reason,occurred_at)
                    select md5('volume-journal-'||n)::uuid,'volume-journal-'||n,'Volume',md5(n::text)::uuid,'UAH','Volume',
                        now()-case when n=100001 then interval '3 minutes' else interval '60 days' end
                    from generate_series(1,100001) n
                    """).update();
            jdbc.sql("""
                    insert into journal_line(transaction_id,line_no,account,debit_minor,credit_minor)
                    select md5('volume-journal-'||n)::uuid,line_no,'SUSPENSE',
                        case when line_no=1 then 100 else 0 end,case when line_no=2 then 100 else 0 end
                    from generate_series(1,100001) n cross join generate_series(1,2) line_no
                    """).update();
            jdbc.sql("alter table journal_line disable trigger journal_line_append_only").update();
            jdbc.sql("""
                    update journal_line set credit_minor=101 where line_no=2 and transaction_id in
                        (md5('volume-journal-1')::uuid,md5('volume-journal-100001')::uuid)
                    """).update();
            jdbc.sql("alter table journal_line enable trigger journal_line_append_only").update();
            jdbc.sql("alter table journal_line enable trigger journal_line_balanced").update();
            jdbc.sql("alter table journal_transaction enable trigger journal_transaction_has_lines").update();
            jdbc.sql("update driver_capacity set occupancy='TO_PICKUP' where driver_id=md5('volume-driver-1')::uuid").update();
            jdbc.sql("update ride_order set status='ASSIGNED',updated_at=now()-interval '3 minutes' where id=md5('volume-order-3')::uuid").update();
            // I4 must include an old intent because its SETTLE, not its intent row, changed recently.
            jdbc.sql("update payment_intent set state='PAID',capture_minor=100 where id=md5('volume-intent-1')::uuid").update();
            jdbc.sql("""
                    insert into payment_operation(id,intent_id,type,reference,target,amount_minor,state,created_at,updated_at)
                    values(md5('volume-settle')::uuid,md5('volume-intent-1')::uuid,'SETTLE','volume-settle','volume-auth-1',
                        99,'SUCCEEDED',now()-interval '3 minutes',now()-interval '3 minutes')
                    """).update();
            jdbc.sql("update payment_operation set created_at=now()-interval '2 hours',updated_at=now()-interval '3 minutes' where id=md5('volume-auth-2')::uuid").update();
            jdbc.sql("update payment_intent set updated_at=now()-interval '3 minutes' where id=md5('volume-intent-2')::uuid").update();
            jdbc.sql("update ride_order set updated_at=now()-interval '2 hours' where id=md5('volume-order-2')::uuid").update();
        });
        for (String table : List.of("journal_transaction","journal_line","driver_capacity","assignment","ride_order","payment_intent","payment_operation")) {
            jdbc.sql("vacuum analyze " + table).update();
        }
        assertThat(jdbc.sql("select count(*) from journal_line").query(Long.class).single()).isEqualTo(200002);
        assertThat(jdbc.sql("select count(*) from ride_order").query(Long.class).single()).isEqualTo(100000);
        assertThat(jdbc.sql("select count(*) from assignment").query(Long.class).single()).isEqualTo(100000);
        assertThat(jdbc.sql("select count(*) from payment_operation").query(Long.class).single()).isEqualTo(100001);
    }

    @Test
    @SuppressWarnings("unchecked")
    void boundedQueriesFindAllFiveViolationsWithinOneSecondOnLargeHistory() {
        history();
        Map<Check,UUID> expected = Map.of(Check.I1,id("volume-journal-100001"), Check.I2,id("volume-driver-1"),
                Check.I3,id("volume-order-3"), Check.I4,id("volume-intent-1"), Check.I5,id("volume-intent-2"));
        Map<Check,List<Violation>> found = new EnumMap<>(Check.class);
        Map<Check,Duration> timings = new EnumMap<>(Check.class);
        for (String owner : List.of("finance","operations","payments")) {
            Object bean=context.getBean(owner+"Invariants");
            var queries=(Map<Check,Supplier<List<Violation>>>)ReflectionTestUtils.getField(bean,"checks");
            var originals=new EnumMap<Check,Supplier<List<Violation>>>(queries);
            queries.replaceAll((check,query)->()->{
                long start=System.nanoTime();
                var rows=query.get();
                timings.put(check,Duration.ofNanos(System.nanoTime()-start));
                found.put(check,rows);
                return rows;
            });
            try {
                long start=System.nanoTime();
                ReflectionTestUtils.invokeMethod(bean,"runChecks");
                Duration elapsed=Duration.ofNanos(System.nanoTime()-start);
                System.out.printf("INVARIANT_VOLUME owner=%s total_ms=%.3f%n",owner,elapsed.toNanos()/1e6);
                assertThat(elapsed).as("full owner scan including durable reporting: "+owner).isLessThan(Duration.ofSeconds(1));
            } finally { queries.clear(); queries.putAll(originals); }
        }
        for (Check check:Check.values()) {
            System.out.printf("INVARIANT_VOLUME check=%s query_ms=%.3f%n",check,timings.getOrDefault(check,Duration.ZERO).toNanos()/1e6);
            assertThat(timings).containsKey(check);
            assertThat(timings.get(check)).isLessThan(Duration.ofSeconds(1));
            assertThat(found.get(check)).extracting(Violation::objectId).containsExactly(expected.get(check));
            assertThat(meters.get("blizz.invariant.violations").tag("check",check.name()).gauge().value()).isEqualTo(1);
        }
        while(relay.runOnce()>0) { /* deliver actual reporting */ }
        for (Check check:Check.values()) {
            assertThat(jdbc.sql("select count(*) from support_case where source_key=:key")
                    .param("key","invariant:"+check+":"+expected.get(check)).query(Long.class).single()).isEqualTo(1);
        }
        assertThat(jdbc.sql("select count(*) from outbox where event_type='InvariantViolated' and aggregate_id=:id")
                .param("id",id("volume-journal-1")).query(Long.class).single()).as("out-of-window unbalanced posting").isZero();
        assertThat(cards.standingHoldsOlderThan(OffsetDateTime.now(clock).minusMinutes(2)))
                .extracting(CardPayments.StandingHold::intentId).containsExactly(id("volume-intent-2"));
        plans();
        recentHoldCandidatesExceedThePostgresParameterLimit();
    }

    void recentHoldCandidatesExceedThePostgresParameterLimit() {
        tx.executeWithoutResult(status -> {
            jdbc.sql("update payment_operation set created_at=now()-interval '60 days',updated_at=now()-interval '60 days' where id=md5('volume-auth-2')::uuid").update();
            jdbc.sql("""
                    update payment_operation set created_at=now()-interval '2 hours',updated_at=now()-interval '3 minutes'
                    where id in (select md5('volume-auth-'||n)::uuid from generate_series(4,65539) n)
                    """).update();
            jdbc.sql("""
                    update ride_order set status='SCHEDULED',preorder=true,pickup_at=now()+interval '2 days',
                        release_at=now()+interval '2 days'-interval '15 minutes',updated_at=now()-interval '3 minutes'
                    where id in (select md5('volume-order-'||n)::uuid from generate_series(4,65539) n)
                    """).update();
        });
        jdbc.sql("analyze payment_operation").update();
        jdbc.sql("analyze ride_order").update();
        var holds=cards.standingHoldsOlderThan(OffsetDateTime.now(clock).minusMinutes(2));
        assertThat(holds).hasSize(65536);
        var last=holds.getLast();
        jdbc.sql("update ride_order set status='FULFILLED',updated_at=now()-interval '2 hours' where id=:id")
                .param("id",last.orderId()).update();
        long start=System.nanoTime();
        ReflectionTestUtils.invokeMethod(context.getBean("operationsInvariants"),"runChecks");
        Duration elapsed=Duration.ofNanos(System.nanoTime()-start);
        System.out.printf("INVARIANT_VOLUME I5_recent_candidates=%d last_page_target=%s total_ms=%.3f%n",
                holds.size(),last.intentId(),elapsed.toNanos()/1e6);
        assertThat(elapsed).as("all recent candidates, including the last page, stay below the 5s budget")
                .isLessThan(Duration.ofSeconds(4));
        assertThat(meters.get("blizz.invariant.violations").tag("check","I5").gauge().value()).isEqualTo(1);
        while(relay.runOnce()>0) { /* deliver final-page report */ }
        assertThat(jdbc.sql("select count(*) from support_case where source_key=:key")
                .param("key","invariant:I5:"+last.intentId()).query(Long.class).single()).isEqualTo(1);
        ReflectionTestUtils.invokeMethod(context.getBean("operationsInvariants"),"runChecks");
        assertThat(meters.get("blizz.invariant.violations").tag("check","I5").gauge().value()).isEqualTo(1);
        assertThat(jdbc.sql("select count(*) from outbox where event_type='InvariantViolated' and aggregate_id=:id and payload->>'check'='I5'")
                .param("id",last.intentId()).query(Long.class).single()).isEqualTo(1);
    }

    void plans() {
        OffsetDateTime now=OffsetDateTime.now(clock);
        explain("I3",context.getBean("operationsInvariants"),"ORDER_ASSIGNMENTS_SQL",Map.of("cutoff",now.minusMinutes(2)));
        explain("I5_AUTH",context.getBean(CardPayments.class),"STANDING_HOLDS_SQL",
                Map.of("before",now.minusMinutes(2),"since",now.minusDays(30)));
        explain("I5_ORDER",context.getBean("operationsInvariants"),"TERMINAL_HOLDS_SQL",
                Map.of("orders",List.of(id("volume-order-2")),"terminalBefore",now.minusHours(1)));
    }

    void explain(String name,Object bean,String field,Map<String,?> parameters) {
        String sql=(String)ReflectionTestUtils.getField(bean,field);
        assertThat(sql).as("EXPLAIN must use the actual production SQL").isNotBlank();
        String plan=jdbc.sql("explain (analyze,buffers,format json) "+sql).params(parameters).query(String.class).single();
        System.out.println("INVARIANT_EXPLAIN "+name+" "+plan);
        noFullHistoryScan(json.readValue(plan,Object.class));
    }

    void noFullHistoryScan(Object node) {
        if(node instanceof Map<?,?> map) {
            if("Seq Scan".equals(map.get("Node Type"))) assertThat(map.get("Relation Name")).isNotIn("ride_order","payment_operation");
            map.values().forEach(this::noFullHistoryScan);
        } else if(node instanceof List<?> list) list.forEach(this::noFullHistoryScan);
    }
}
