package taxi.blizz.backoffice.internal;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.test.util.AopTestUtils;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.TestRides;
import taxi.blizz.backoffice.SupportCases;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.SessionService;
import taxi.blizz.operations.Dispatch;
import taxi.blizz.operations.Orders;
import taxi.blizz.operations.Trips;
import taxi.blizz.operations.WorkSessions;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.pricing.QuoteService;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.json.JsonMapper;

/** Real 200k-row plans; an isolated database keeps this fixture out of functional tests. */
@SpringBootTest
@Import(AuditHotPathVolumeTests.Database.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class AuditHotPathVolumeTests {
    @org.springframework.boot.test.context.TestConfiguration(proxyBeanMethods=false)
    static class Database {
        @org.springframework.context.annotation.Bean
        @org.springframework.boot.testcontainers.service.connection.ServiceConnection
        org.testcontainers.postgresql.PostgreSQLContainer auditHotPathPostgres() {
            return new org.testcontainers.postgresql.PostgreSQLContainer(
                    org.testcontainers.utility.DockerImageName.parse("postgis/postgis:18-3.6")
                            .asCompatibleSubstituteFor("postgres"));
        }
    }
    @Autowired JdbcClient jdbc;
    @Autowired TransactionTemplate tx;
    @Autowired JsonMapper json;
    @Autowired Orders orders;
    @Autowired Dispatch dispatch;
    @Autowired Trips trips;
    @Autowired WorkSessions sessions;
    @Autowired SessionService auth;
    @Autowired QuoteService quotes;
    @Autowired SupportCases cases;
    UUID order,driver,vehicle,device,city;
    Actor staff;

    @BeforeAll
    void seedTwoHundredThousandRowsPerHotTable() {
        TestRides rides=new TestRides(jdbc,orders,dispatch,trips,sessions,auth,quotes);
        // This longitude is distinct from all shared TestRides cities; this database is isolated as well.
        city=rides.city("audit-hot-paths","UAH",-177);
        GeoPoint pickup=new GeoPoint(-39.5,-176.5),dropoff=new GeoPoint(-39.45,-176.45);
        var online=rides.driverNear(pickup);
        var ride=rides.started(city,online,pickup,dropoff);rides.complete(ride,true);
        order=ride.order().id();driver=online.actor().id();vehicle=online.vehicle();device=online.device();
        UUID id=UUID.randomUUID();staff=new Actor(SubjectType.STAFF,id);
        jdbc.sql("""
                insert into staff_user(id,login,name,role,permissions,all_cities,state,created_at,updated_at)
                values (:id,:login,'Volume support','ADMIN',ARRAY['support.manage'],true,'ACTIVE',now(),now())""")
                .param("id",id).param("login","volume-support-"+id).update();
        jdbc.sql("""
                insert into assignment(id,order_id,driver_id,vehicle_id,source,state,created_at,closed_at)
                select md5('audit-assignment-'||g)::uuid,:order,:driver,:vehicle,'OFFER','COMPLETED',
                    now()-g*interval '1 second',now() from generate_series(1,200000) g""")
                .param("order",order).param("driver",driver).param("vehicle",vehicle).update();
        jdbc.sql("""
                insert into dispatch_attempt(id,order_id,generation,phase,total_deadline,created_at)
                select md5('audit-attempt-'||g)::uuid,:order,g+100,'STOPPED',now(),now()
                from generate_series(1,200000) g""").param("order",order).update();
        jdbc.sql("""
                insert into offer(id,order_id,attempt_id,driver_id,state,expires_at,created_at)
                select md5('audit-offer-'||g)::uuid,:order,md5('audit-attempt-'||g)::uuid,:driver,
                    'EXPIRED',now(),now() from generate_series(1,200000) g""")
                .param("order",order).param("driver",driver).update();
        jdbc.sql("""
                insert into track_point(id,driver_id,device_session_id,sequence,recorded_at,received_at,point,accuracy_m)
                select md5('audit-track-'||g)::uuid,:driver,:device,g,now()-g*interval '1 second',now(),
                    ST_SetSRID(ST_MakePoint(20,50),4326),5 from generate_series(1,200000) g""")
                .param("driver",driver).param("device",device).update();
        jdbc.sql("""
                insert into support_case(id,city_id,category,order_id,requester_type,subject,priority,state,
                    assigned_staff_id,created_at,updated_at,respond_by)
                select md5('audit-case-'||g)::uuid,case when g%2=0 then :city else null end,
                    case when g%5=0 then 'PAYMENT' else 'OTHER' end,
                    case when g=1 then :order else md5('unrelated-order-'||g)::uuid end,'SYSTEM','Volume case',
                    case g%4 when 0 then 'URGENT' when 1 then 'HIGH' when 2 then 'NORMAL' else 'LOW' end,'OPEN',
                    case when g%7=0 then :staff else null end,now()-g*interval '1 second',now(),
                    now()+(g-100000)*interval '1 second' from generate_series(1,200000) g""")
                .param("city",city).param("order",order).param("staff",staff.id()).update();
        jdbc.sql("""
                insert into otp_delivery(id,phone,audience,channel,provider,state,attempted_at)
                select md5('audit-otp-'||g)::uuid,'+'||(380200000000+g)::text,'CLIENT','SMS','FAKE','SENT',
                    now()-interval '30 days'+g*interval '1 second' from generate_series(1,200000) g""").update();
        jdbc.sql("""
                insert into audit_log(id,occurred_at,actor_type,actor_id,action,resource_type,correlation_id)
                select md5('audit-log-'||g)::uuid,now()-g*interval '1 second','STAFF',
                    md5('audit-staff-'||g)::uuid,'volume','volume',gen_random_uuid()
                from generate_series(1,200000) g""").update();
        for(String table:List.of("assignment","offer","track_point","support_case","otp_delivery","audit_log")) {
            jdbc.sql("analyze "+table).update();
            assertThat(jdbc.sql("select count(*) from "+table).query(Long.class).single()).isGreaterThanOrEqualTo(200000);
        }
    }

    record Query(String name,String index,String sql,Map<String,?> params) {}

    List<Query> hotQueries() {
        return List.of(
            new Query("assignment/order (OrderView, chat, journal)","assignment_order_created_idx",
                "select id,driver_id from assignment where order_id=:order order by created_at desc limit 1",Map.of("order",order)),
            new Query("assignment/driver history","assignment_driver_created_idx",
                "select id,order_id from assignment where driver_id=:driver order by created_at desc limit 50",Map.of("driver",driver)),
            new Query("offer candidate exclusion","offer_order_driver_idx",
                "select exists(select 1 from offer where order_id=:order and driver_id=:driver)",Map.of("order",order,"driver",UUID.randomUUID())),
            new Query("track predecessor","track_point_session_recorded_idx","""
                select recorded_at,ST_Y(point),ST_X(point),not(flags && ARRAY['POOR_ACCURACY','FUTURE']::text[])
                from track_point where device_session_id=:device
                 and (recorded_at<:recorded or (recorded_at=:recorded and sequence<:sequence))
                order by recorded_at desc,sequence desc limit 1""",
                Map.of("device",device,"recorded",OffsetDateTime.now().plusHours(1),"sequence",300000L)),
            new Query("support order hold/evidence","support_case_order_idx",
                "select exists(select 1 from support_case where order_id=:order and state not in ('RESOLVED','CLOSED'))",
                Map.of("order",UUID.randomUUID())),
            new Query("OTP delivery gauge","otp_delivery_attempted_idx",
                "select channel,state,count(*) from otp_delivery where attempted_at>=:from group by channel,state",
                Map.of("from",OffsetDateTime.now().minusHours(1))),
            new Query("staff changes log","audit_log_staff_occurred_idx",
                "select id,occurred_at,action from audit_log where actor_type='STAFF' order by occurred_at desc,id desc limit 100",Map.of()));
    }

    JsonNode explain(String label,String sql,Map<String,?> params) {
        String text=jdbc.sql("explain (analyze,buffers,format json) "+sql).params(params).query(String.class).single();
        System.out.println("AUDIT PLAN "+label+"\n"+text);
        return json.readTree(text).get(0);
    }

    @ParameterizedTest(name="{0}")
    @MethodSource("hotQueries")
    void eachHotPathUsesItsIndexUnderFiftyMilliseconds(Query query) {
        JsonNode before=tx.execute(s->{
            jdbc.sql("drop index if exists "+query.index()).update();
            JsonNode plan=explain(query.name()+" BEFORE",query.sql(),query.params());s.setRollbackOnly();return plan;
        });
        assertThat(before.get("Plan").toString()).as(query.name()+" baseline really scans history").contains("Seq Scan");
        JsonNode after=explain(query.name()+" AFTER",query.sql(),query.params());
        assertThat(after.get("Plan").toString()).contains(query.index());
        assertThat(after.get("Execution Time").asDouble()).as(query.name()+" PostgreSQL execution milliseconds").isLessThan(50);
    }

    @Test
    @SuppressWarnings("unchecked")
    void realQueueSqlUsesOnlySuppliedPredicatesAndPreservesFiltersAndPaging() {
        List<SupportCases.QueueFilter> filters=List.of(
            new SupportCases.QueueFilter(city,null,null,null,null,false,null,50),
            new SupportCases.QueueFilter(null,null,null,null,null,false,null,50),
            new SupportCases.QueueFilter(city,SupportCases.State.OPEN,SupportCases.Priority.URGENT,
                SupportCases.Category.PAYMENT,staff.id(),false,null,50),
            new SupportCases.QueueFilter(null,null,null,null,null,true,null,50,true));
        Object target=AopTestUtils.getUltimateTargetObject(cases);
        for(var filter:filters) {
            Object query=ReflectionTestUtils.invokeMethod(target,"queueQuery",filter);
            String sql=ReflectionTestUtils.invokeMethod(query,"sql");
            Map<String,?> params=ReflectionTestUtils.invokeMethod(query,"params");
            assertThat(sql).doesNotContain("is not distinct from", "cast(:", "not :");
            JsonNode plan=explain("support queue "+filter,sql,params);
            assertThat(plan.get("Plan").toString()).contains("Index");
            if(filter.state()==null && !filter.overdueOnly())
                assertThat(plan.get("Plan").toString()).contains("support_case_queue_order_idx");
            assertThat(plan.get("Execution Time").asDouble()).isLessThan(50);
            var result=cases.queue(staff,filter);
            assertThat(result).hasSize(50).allSatisfy(c->{
                assertThat(c.cityId()).isEqualTo(filter.cityId());
                if(filter.state()!=null)assertThat(c.state()).isEqualTo(filter.state());
                if(filter.priority()!=null)assertThat(c.priority()).isEqualTo(filter.priority());
                if(filter.category()!=null)assertThat(c.category()).isEqualTo(filter.category());
                if(filter.assignedStaffId()!=null)assertThat(c.assignedStaffId()).isEqualTo(filter.assignedStaffId());
                if(filter.unassignedOnly())assertThat(c.assignedStaffId()).isNull();
                if(filter.overdueOnly())assertThat(c.respondBy()).isBefore(OffsetDateTime.now());
            });
            var page=cases.queue(staff,new SupportCases.QueueFilter(filter.cityId(),filter.state(),filter.priority(),
                filter.category(),filter.assignedStaffId(),filter.unassignedOnly(),result.getLast().createdAt(),50,
                filter.overdueOnly()));
            assertThat(page).noneMatch(c->result.stream().anyMatch(previous->previous.id().equals(c.id())));
        }
    }
}
