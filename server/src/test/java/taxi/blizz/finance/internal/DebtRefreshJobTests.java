package taxi.blizz.finance.internal;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.finance.DriverDebts;
import taxi.blizz.finance.Ledger;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.SubjectType;

@SpringBootTest
@Import(DebtRefreshJobTests.Database.class)
class DebtRefreshJobTests {
    @org.springframework.boot.test.context.TestConfiguration(proxyBeanMethods=false)
    static class Database {
        @org.springframework.context.annotation.Bean
        @org.springframework.boot.testcontainers.service.connection.ServiceConnection
        org.testcontainers.postgresql.PostgreSQLContainer debtRefreshPostgres() {
            return new org.testcontainers.postgresql.PostgreSQLContainer(
                    org.testcontainers.utility.DockerImageName.parse("postgis/postgis:18-3.6")
                            .asCompatibleSubstituteFor("postgres"));
        }
    }
    @Autowired JdbcClient jdbc;
    @Autowired TransactionTemplate tx;
    @Autowired DriverDebts debts;
    @Autowired Ledger ledger;
    @Autowired ApplicationContext context;
    String currency;
    String prefix;
    Actor finance;

    @BeforeEach
    void seedTwoThousandDrivers(org.junit.jupiter.api.TestInfo test) {
        // Per-test currency and ids: one test's limit and progress cannot contaminate another.
        prefix = UUID.randomUUID().toString();
        boolean restartCase = test.getTestMethod().orElseThrow().getName().startsWith("committed");
        boolean registryCase = test.getTestMethod().orElseThrow().getName().startsWith("registry");
        currency = restartCase ? "XZA" : registryCase ? "XZC" : "XZB";
        long phoneBase = restartCase ? 380111000000L : registryCase ? 380113000000L : 380112000000L;
        UUID staff = UUID.randomUUID();
        jdbc.sql("""
                insert into staff_user(id,login,name,role,permissions,all_cities,state,created_at,updated_at)
                values (:id,:login,'Debt refresh','ADMIN',ARRAY['finance.manage'],true,'ACTIVE',now(),now())""")
                .param("id", staff).param("login", "debt-refresh-" + staff).update();
        finance = new Actor(SubjectType.STAFF, staff);
        jdbc.sql("""
                insert into driver(id,phone_normalized,account_state,review_status,created_at,updated_at)
                select md5(:prefix||'driver'||g)::uuid, '+'||(:phoneBase+g)::text,
                    'ACTIVE','APPROVED',now(),now() from generate_series(1,2000) g""")
                .param("prefix", prefix).param("phoneBase", phoneBase).update();
        // Exercise Ledger.post, not an alternate path that bypasses future durable membership enrollment.
        tx.executeWithoutResult(s -> {
            for (int i=1; i<=2000; i++) {
                UUID driver = driver(i);
                ledger.post(new Ledger.Posting(prefix + ":seed:" + i, "DEBT_TEST", driver, currency, "Fictional debt",
                        List.of(Ledger.Line.debit(Ledger.Account.DRIVER_PAYABLE, driver, 200),
                                Ledger.Line.credit(Ledger.Account.SERVICE_COMMISSION, null, 200))));
                debts.refresh(driver, currency);
            }
        });
    }

    @org.junit.jupiter.api.AfterEach
    void finishThisTestsBacklog() {
        if (!context.containsBean("driverDebtRefreshJob")) return; // red baseline has no worker yet
        Object worker=context.getBean("driverDebtRefreshJob");
        for(int i=0;i<40 && jdbc.sql("select exists(select 1 from driver_debt_refresh where currency=:currency)")
                .param("currency",currency).query(Boolean.class).single();i++) batch(worker);
    }

    UUID driver(int i) {
        return jdbc.sql("select md5(:prefix||'driver'||:n)::uuid").param("prefix", prefix).param("n", i)
                .query(UUID.class).single();
    }

    Object job() {
        assertThat(context.containsBean("driverDebtRefreshJob"))
                .as("setLimit needs a durable batch worker, not synchronous refresh").isTrue();
        return context.getBean("driverDebtRefreshJob");
    }

    int batch(Object worker) {
        Integer count = ReflectionTestUtils.invokeMethod(worker, "runOnce");
        return count;
    }

    long blocked() {
        return jdbc.sql("select count(*) from driver_debt_status where currency=:currency and blocked")
                .param("currency", currency).query(Long.class).single();
    }

    String registryPlan() {
        return tx.execute(status->{
            jdbc.sql("set local plan_cache_mode=force_generic_plan").update();
            jdbc.sql("prepare debt_member_plan as "+DriverDebtRefreshJob.NEXT_MEMBERS_SQL
                    .replace(":currency","$1").replace(":version","$2")).update();
            String result=jdbc.sql("explain(analyze,buffers,format json) execute debt_member_plan('"+currency+"',1)")
                    .query(String.class).single();
            jdbc.sql("deallocate debt_member_plan").update();return result;
        });
    }

    @Test
    void registrySelectsOneIndexedBatchWithoutRevisitingCompletedHistory() {
        jdbc.sql("""
                insert into driver_debt_refresh_member(currency,driver_id,applied_version)
                select :currency,md5(:prefix||'completed'||g)::uuid,1 from generate_series(1,200000) g
                """).param("currency",currency).param("prefix",prefix).update();
        jdbc.sql("analyze driver_debt_refresh_member").update();
        String before=tx.execute(status->{
            jdbc.sql("drop index driver_debt_refresh_pending_idx").update();
            String plan=registryPlan();status.setRollbackOnly();return plan;
        });
        System.out.println("DEBT REGISTRY BEFORE\n"+before);
        assertThat(tools.jackson.databind.json.JsonMapper.builder().build().readTree(before).get(0)
                .get("Plan").toString()).contains("Seq Scan");
        String text=registryPlan();
        System.out.println("DEBT REGISTRY PLAN 200000 completed + 2000 pending\n"+text);
        var plan=tools.jackson.databind.json.JsonMapper.builder().build().readTree(text).get(0);
        assertThat(taxi.blizz.SqlPlans.indexNames(plan.get("Plan"))).contains("driver_debt_refresh_pending_idx");
        assertThat(plan.get("Plan").toString()).doesNotContain("Seq Scan");
        assertThat(plan.get("Plan").get("Actual Rows").asInt()).isEqualTo(200);
        assertThat(plan.get("Execution Time").asDouble()).isLessThan(50);
    }

    @Test
    void committedBatchesResumeOnANewWorkerWithoutRepeatingDrivers() {
        var limit = debts.setLimit(finance, UUID.randomUUID(), currency, 100L, 0, "Apply a new limit");
        assertThat(blocked()).as("staff command enqueues work rather than touching every driver").isZero();
        Object worker = job();
        assertThat(batch(worker)).isEqualTo(200);
        assertThat(blocked()).isEqualTo(200);
        List<UUID> first = jdbc.sql("select driver_id from driver_debt_status where currency=:currency and blocked")
                .param("currency", currency).query(UUID.class).list();
        var versions = jdbc.sql("select driver_id, version from driver_debt_status where currency=:currency and blocked")
                .param("currency", currency).query().listOfRows();
        // Simulate process loss after a committed batch: construct another instance from injected dependencies.
        Object restarted = context.getAutowireCapableBeanFactory().createBean(worker.getClass());
        int total = 200;
        for (int i=0; i<20 && total<2000; i++) {
            int count=batch(restarted); assertThat(count).isBetween(1,200); total+=count;
        }
        assertThat(total).isEqualTo(2000);
        assertThat(blocked()).isEqualTo(2000);
        assertThat(jdbc.sql("select driver_id, version from driver_debt_status where currency=:currency and driver_id in (:ids)")
                .param("currency", currency).param("ids", first).query().listOfRows())
                .containsExactlyInAnyOrderElementsOf(versions);
        assertThat(batch(restarted)).isZero();
        debts.setLimit(finance, UUID.randomUUID(), currency, null, limit.version(), "Remove limit");
        int refreshed=0;
        for(int i=0;i<20 && blocked()>0;i++) refreshed+=batch(restarted);
        assertThat(refreshed).isEqualTo(2000);
        assertThat(blocked()).isZero();
    }

    @Test
    void staffCommandDoesNotWaitForADriverRowAndPostingWaitsForOnlyOneWorkerBatch() throws Exception {
        UUID driver=jdbc.sql("select driver_id from driver_debt_status where currency=:currency order by driver_id limit 1")
                .param("currency",currency).query(UUID.class).single();
        CountDownLatch locked=new CountDownLatch(1), release=new CountDownLatch(1);
        CompletableFuture<Void> locker=CompletableFuture.runAsync(()->tx.executeWithoutResult(s->{
            jdbc.sql("select version from driver_debt_status where driver_id=:driver and currency=:currency for update")
                    .param("driver",driver).param("currency",currency).query(Long.class).single();
            locked.countDown();
            try { assertThat(release.await(30,TimeUnit.SECONDS)).isTrue(); }
            catch(InterruptedException e) {Thread.currentThread().interrupt();throw new IllegalStateException(e);}
        }));
        assertThat(locked.await(10,TimeUnit.SECONDS)).isTrue();
        CompletableFuture<DriverDebts.Limit> command=CompletableFuture.supplyAsync(()->
                debts.setLimit(finance,UUID.randomUUID(),currency,100L,0,"No driver locks in staff command"));
        try {
            assertThat(command.get(2,TimeUnit.SECONDS).limitMinor()).isEqualTo(100L);
        } finally {release.countDown();}
        locker.get(10,TimeUnit.SECONDS);
        // Hold one projection row while a real batch reaches it; observe the PostgreSQL blocker, not a sleep.
        CountDownLatch held=new CountDownLatch(1), finish=new CountDownLatch(1);
        CompletableFuture<Integer> rowPid=new CompletableFuture<>();
        CompletableFuture<Void> rowLock=CompletableFuture.runAsync(()->tx.executeWithoutResult(s->{
            jdbc.sql("select version from driver_debt_status where driver_id=:driver and currency=:currency for update")
                    .param("driver",driver).param("currency",currency).query(Long.class).single();
            rowPid.complete(jdbc.sql("select pg_backend_pid()").query(Integer.class).single());held.countDown();
            try {finish.await(30,TimeUnit.SECONDS);} catch(InterruptedException e){Thread.currentThread().interrupt();}
        }));
        assertThat(held.await(10,TimeUnit.SECONDS)).isTrue();
        Object worker=job();
        CompletableFuture<Integer> running=CompletableFuture.supplyAsync(()->batch(worker));
        try {
            long until=System.nanoTime()+TimeUnit.SECONDS.toNanos(10);
            boolean waiting=false;
            while(System.nanoTime()<until) {
                waiting=jdbc.sql("select exists(select 1 from pg_stat_activity where :pid=any(pg_blocking_pids(pid)))")
                        .param("pid",rowPid.get(2,TimeUnit.SECONDS)).query(Boolean.class).single();
                if(waiting)break;TimeUnit.MILLISECONDS.sleep(10);
            }
            assertThat(waiting).as("worker reached the held projection in its first batch").isTrue();
            int workerPid=jdbc.sql("select pid from pg_stat_activity where :pid=any(pg_blocking_pids(pid)) limit 1")
                    .param("pid",rowPid.get(2,TimeUnit.SECONDS)).query(Integer.class).single();
            CompletableFuture<Integer> postingPid=new CompletableFuture<>();
            CompletableFuture<Void> posting=CompletableFuture.runAsync(()->tx.executeWithoutResult(s->{
                postingPid.complete(jdbc.sql("select pg_backend_pid()").query(Integer.class).single());
                ledger.post(new Ledger.Posting(prefix+":during-refresh","DEBT_TEST",driver,currency,"Concurrent trip",
                        List.of(Ledger.Line.debit(Ledger.Account.DRIVER_PAYABLE,driver,50),
                                Ledger.Line.credit(Ledger.Account.SERVICE_COMMISSION,null,50))));
                debts.refresh(driver,currency);
            }));
            int writer=postingPid.get(5,TimeUnit.SECONDS);
            boolean postingWaits=false;
            long postingDeadline=System.nanoTime()+TimeUnit.SECONDS.toNanos(5);
            while(System.nanoTime()<postingDeadline) {
                postingWaits=jdbc.sql("select :worker=any(pg_blocking_pids(:writer))")
                        .param("worker",workerPid).param("writer",writer).query(Boolean.class).single();
                if(postingWaits)break;TimeUnit.MILLISECONDS.sleep(10);
            }
            assertThat(postingWaits).as("the real posting reached the worker's held registry row").isTrue();
            assertThat(posting.isDone()).isFalse();
            finish.countDown();
            assertThat(running.get(10,TimeUnit.SECONDS)).isBetween(1,200);
            posting.get(10,TimeUnit.SECONDS);
            assertThat(blocked()).isLessThan(2000L);
            assertThat(debts.statusOf(driver).stream().filter(x->x.currency().equals(currency)).findFirst().orElseThrow()
                    .owedMinor()).isEqualTo(250);
        } finally {finish.countDown();rowLock.get(10,TimeUnit.SECONDS);}
    }
}
