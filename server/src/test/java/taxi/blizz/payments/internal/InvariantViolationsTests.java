package taxi.blizz.payments.internal;

import static org.assertj.core.api.Assertions.assertThat;

import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.simple.SimpleMeterRegistry;
import java.time.Clock;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import javax.sql.DataSource;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
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
import taxi.blizz.TestQuotes;
import taxi.blizz.TestRides;
import taxi.blizz.finance.Ledger;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.SessionService;
import taxi.blizz.operations.CreateOrder;
import taxi.blizz.operations.Dispatch;
import taxi.blizz.operations.OrderView;
import taxi.blizz.operations.Orders;
import taxi.blizz.operations.PaymentMethod;
import taxi.blizz.operations.Trips;
import taxi.blizz.operations.WorkSessions;
import taxi.blizz.payments.CardPayments;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.InvariantChecks;
import taxi.blizz.platform.InvariantReports;
import taxi.blizz.platform.internal.OutboxRelay;
import taxi.blizz.pricing.QuoteService;

/** Deliberate corruptions use a separate real PostgreSQL database, not other tests' negative fixtures. */
@SpringBootTest(properties = {"blizz.finance.invariants.enabled=false", "blizz.operations.invariants.enabled=false",
        "blizz.payments.invariants.enabled=false"})
@Import(InvariantViolationsTests.InvariantDatabase.class)
class InvariantViolationsTests {
    @TestConfiguration(proxyBeanMethods = false)
    static class InvariantDatabase {
        static final PostgreSQLContainer DATABASE = new PostgreSQLContainer(
                DockerImageName.parse("postgis/postgis:18-3.6").asCompatibleSubstituteFor("postgres"));
        @Bean @ServiceConnection PostgreSQLContainer postgres() { return DATABASE; }
    }

    static final GeoPoint PICKUP = new GeoPoint(-39.5, -164.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, -164.45);
    @Autowired JdbcClient jdbc;
    @Autowired Orders orders;
    @Autowired Dispatch dispatch;
    @Autowired Trips trips;
    @Autowired taxi.blizz.operations.Tips tips;
    @Autowired WorkSessions sessions;
    @Autowired SessionService auth;
    @Autowired QuoteService quotes;
    @Autowired CardPayments cards;
    @Autowired PaymentWorker payments;
    @Autowired FakeProvider.Gateway gateway;
    @Autowired Ledger ledger;
    @Autowired OutboxRelay relay;
    @Autowired MeterRegistry meters;
    @Autowired TransactionTemplate tx;
    @Autowired ApplicationContext context;
    TestRides rides;
    UUID city;
    UUID merchant;
    final List<Runnable> restore = new ArrayList<>();

    @BeforeEach
    void setUp() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        city = rides.city("test-invariants", "UAH", -165);
        merchant = jdbc.sql("select merchant_id from payment_merchant_city where city_id=:city")
                .param("city", city).query(UUID.class).optional().orElseGet(() -> {
                    UUID id = UUID.randomUUID();
                    jdbc.sql("""
                            insert into payment_merchant(id,provider,account,domain,secret_ref,currency,created_at)
                            values(:id,'FAKE',:account,'test.blizz.invalid','test','UAH',now())
                            """).param("id", id).param("account", "invariant-" + id).update();
                    jdbc.sql("insert into payment_merchant_city(city_id,merchant_id) values(:city,:merchant)")
                            .param("city", city).param("merchant", id).update();
                    return id;
                });
        gateway.reset();
    }

    @AfterEach
    void restoreCorruptions() {
        for (int i = restore.size() - 1; i >= 0; i--) restore.get(i).run();
        restore.clear();
        gateway.reset();
    }

    void scan(String owner) {
        if ("all".equals(owner)) {
            for (String module : List.of("finance", "operations", "payments")) scan(module);
            return;
        }
        // Reflection lets the tests-only commit compile before the new scanners exist.
        ReflectionTestUtils.invokeMethod(context.getBean(owner + "Invariants"), "runChecks");
    }

    double gauge(String check) {
        var g = meters.find("blizz.invariant.violations").tag("check", check).gauge();
        assertThat(g).as("registered gauge for " + check).isNotNull();
        return g.value();
    }

    long events(String check, UUID id) {
        return jdbc.sql("""
                select count(*) from outbox where event_type='InvariantViolated'
                  and aggregate_id=:id and payload->>'check'=:check
                """).param("id", id).param("check", check).query(Long.class).single();
    }

    void drain() { while (relay.runOnce() > 0) { /* deliver the actual outbox */ } }

    void assertOneReport(String owner, String check, UUID id) {
        scan(owner);
        assertThat(gauge(check)).isEqualTo(1);
        drain();
        assertThat(events(check, id)).isEqualTo(1);
        assertThat(jdbc.sql("""
                select count(*) from support_case where source_key=:key and category='OTHER' and priority='HIGH'
                """).param("key", "invariant:" + check + ":" + id).query(Long.class).single()).isEqualTo(1);
        scan(owner);
        drain();
        assertThat(gauge(check)).isEqualTo(1);
        assertThat(events(check, id)).isEqualTo(1);
        assertThat(jdbc.sql("select count(*) from support_case where source_key=:key")
                .param("key", "invariant:" + check + ":" + id).query(Long.class).single()).isEqualTo(1);
        String payload = jdbc.sql("select payload::text from outbox where event_type='InvariantViolated' and aggregate_id=:id and payload->>'check'=:check")
                .param("id", id).param("check", check).query(String.class).single();
        assertThat(payload).doesNotContain("41****1111", "tok-", "+380", "+48", "phone", "masked_pan");
    }

    void editJournal(Runnable edit) {
        tx.executeWithoutResult(s -> {
            jdbc.sql("alter table journal_transaction disable trigger journal_transaction_append_only").update();
            jdbc.sql("alter table journal_line disable trigger journal_line_append_only").update();
            edit.run();
            jdbc.sql("alter table journal_line enable trigger journal_line_append_only").update();
            jdbc.sql("alter table journal_transaction enable trigger journal_transaction_append_only").update();
        }); // On failure PostgreSQL also rolls back the trigger changes.
    }

    void ageData() {
        for (String table : List.of("ride_order", "driver_capacity", "payment_intent", "payment_operation")) {
            jdbc.sql("update " + table + " set updated_at=now()-interval '3 minutes'").update();
        }
        jdbc.sql("update assignment set created_at=now()-interval '3 minutes', closed_at=case when closed_at is null then null else now()-interval '3 minutes' end").update();
        editJournal(() -> jdbc.sql("update journal_transaction set occurred_at=now()-interval '3 minutes'").update());
    }

    @Autowired DataSource dataSource;
    @Autowired InvariantReports reports;
    @Autowired Clock clock;

    class Probe extends InvariantChecks {
        Probe(java.util.function.Supplier<List<Violation>> first, java.util.function.Supplier<List<Violation>> second) {
            super(dataSource, reports, context.getBeanProvider(MeterRegistry.class), InvariantViolationsTests.this.clock);
            check(Check.I1, ObjectType.JOURNAL_TRANSACTION, first);
            check(Check.I3, ObjectType.ORDER, second);
        }
    }

    @Test
    void failedSqlIsNotZeroAndDoesNotPreventTheNextReadOnlyCheck() {
        var registry = new SimpleMeterRegistry();
        var probe = new Probe(() -> {
            jdbc.sql("select * from deliberately_missing_invariant_table").query().listOfRows();
            return List.of();
        }, () -> {
            assertThat(jdbc.sql("select current_setting('transaction_read_only')").query(String.class).single()).isEqualTo("on");
            return List.of();
        });
        probe.bindTo(registry);
        double before = meters.counter("blizz.invariant.failures", "check", "I1").count();
        probe.runChecks();
        assertThat(registry.get("blizz.invariant.violations").tag("check", "I1").gauge().value()).isNaN();
        assertThat(registry.get("blizz.invariant.violations").tag("check", "I3").gauge().value()).isZero();
        assertThat(meters.counter("blizz.invariant.failures", "check", "I1").count()).isEqualTo(before + 1);
    }

    @Test
    void readOnlyScanCompletesWhileBusinessRowIsWriteLocked() throws Exception {
        var order = rides.order(rides.client(), city, PICKUP, DROPOFF);
        var locked = new CountDownLatch(1);
        var release = new CountDownLatch(1);
        try (var pool = Executors.newVirtualThreadPerTaskExecutor()) {
            var writer = pool.submit(() -> tx.executeWithoutResult(status -> {
                jdbc.sql("update ride_order set updated_at=now() where id=:id").param("id", order.id()).update();
                locked.countDown();
                try { assertThat(release.await(5, TimeUnit.SECONDS)).isTrue(); }
                catch (InterruptedException e) { throw new IllegalStateException(e); }
            }));
            try {
                assertThat(locked.await(5, TimeUnit.SECONDS)).isTrue();
                var reader = pool.submit(() -> {
                    scan("operations");
                    assertThat(gauge("I3")).isZero();
                });
                reader.get(2, TimeUnit.SECONDS);
            } finally { release.countDown(); }
            writer.get(5, TimeUnit.SECONDS);
        }
    }

    @Test
    void concurrentReportersCommitOneReceiptEventAndCase() throws Exception {
        var id = UUID.randomUUID();
        var start = new CountDownLatch(1);
        try (var pool = Executors.newVirtualThreadPerTaskExecutor()) {
            var tasks = new ArrayList<java.util.concurrent.Future<Boolean>>();
            for (int i = 0; i < 8; i++) tasks.add(pool.submit(() -> {
                start.await();
                return reports.reportOnce(InvariantChecks.Check.I1, InvariantChecks.ObjectType.JOURNAL_TRANSACTION,
                        id, "CONCURRENT_REPORT_FIXTURE");
            }));
            start.countDown();
            int created = 0;
            for (var task : tasks) if (task.get(10, TimeUnit.SECONDS)) created++;
            assertThat(created).isEqualTo(1);
        }
        drain();
        assertThat(events("I1", id)).isEqualTo(1);
        assertThat(jdbc.sql("select count(*) from support_case where source_key=:key")
                .param("key", "invariant:I1:" + id).query(Long.class).single()).isEqualTo(1);
    }

    @Test
    void i1UnbalancedPostingIsReportedOnceAndNeverRepaired() {
        String key = "invariant-fixture-" + UUID.randomUUID();
        ledger.post(new Ledger.Posting(key, "InvariantFixture", UUID.randomUUID(), "UAH", "Invariant test",
                List.of(Ledger.Line.debit(Ledger.Account.SUSPENSE, null, 100),
                        Ledger.Line.credit(Ledger.Account.SERVICE_FUNDS, null, 100))));
        UUID id = jdbc.sql("select id from journal_transaction where business_key=:key").param("key", key).query(UUID.class).single();
        ageData();
        editJournal(() -> jdbc.sql("update journal_line set credit_minor=101 where transaction_id=:id and line_no=2").param("id", id).update());
        restore.add(() -> editJournal(() -> jdbc.sql("update journal_line set credit_minor=100 where transaction_id=:id and line_no=2").param("id", id).update()));
        assertOneReport("finance", "I1", id);
        assertThat(jdbc.sql("select credit_minor from journal_line where transaction_id=:id and line_no=2")
                .param("id", id).query(Long.class).single()).isEqualTo(101);
    }

    @Test
    void i2BusyCapacityWithoutCommittedAssignmentIsReportedOnce() {
        var driver = rides.driverNear(PICKUP);
        UUID id = driver.actor().id();
        jdbc.sql("update driver_capacity set occupancy='TO_PICKUP',assignment_id=null where driver_id=:id")
                .param("id", id).update();
        restore.add(() -> jdbc.sql("update driver_capacity set occupancy='FREE',assignment_id=null,updated_at=now() where driver_id=:id")
                .param("id", id).update());
        ageData();
        assertOneReport("operations", "I2", id);
        assertThat(jdbc.sql("select occupancy from driver_capacity where driver_id=:id").param("id", id)
                .query(String.class).single()).isEqualTo("TO_PICKUP");
    }

    @Test
    void i5CancelledOrderStillHasStandingAuthorizationAfterOneHour() {
        var order = heldOrder(riderWithCard());
        UUID intent = cards.intent(order.id()).orElseThrow().id();
        drain(); // Consume authorization before the deliberate cancellation loses its release step.
        restore.add(() -> {
            tx.executeWithoutResult(status -> cards.releaseHold(order.id(), "INVARIANT_TEST_CLEANUP"));
            for (int i = 0; i < 4; i++) { payments.runOnce(); drain(); }
        });
        // Simulate a hand edit/crash that lost cancellation's hold-release step.
        jdbc.sql("update ride_order set status='CANCELLED',updated_at=now()-interval '2 hours' where id=:id")
                .param("id", order.id()).update();
        jdbc.sql("update payment_intent set created_at=now()-interval '2 hours',updated_at=now()-interval '2 hours' where id=:id")
                .param("id", intent).update();
        jdbc.sql("update payment_operation set created_at=now()-interval '2 hours',updated_at=now()-interval '2 hours' where intent_id=:id")
                .param("id", intent).update();
        assertOneReport("all", "I5", intent);
        assertThat(cards.intent(order.id()).orElseThrow().state()).isEqualTo("AUTHORIZED");
    }

    @ParameterizedTest
    @ValueSource(strings = {"OFFERED", "RESERVED", "WAITING", "ON_TRIP"})
    void i2OtherOccupanciesWithoutTheirRequiredOfferOrAssignmentAreViolations(String occupancy) {
        UUID id = rides.driverNear(PICKUP).actor().id();
        jdbc.sql("update driver_capacity set occupancy=:occupancy,assignment_id=null where driver_id=:id")
                .param("occupancy", occupancy).param("id", id).update();
        restore.add(() -> jdbc.sql("update driver_capacity set occupancy='FREE',assignment_id=null,updated_at=now() where driver_id=:id")
                .param("id", id).update());
        ageData();
        assertOneReport("operations", "I2", id);
    }

    @Test
    void i2OpenPersonalOfferIsCleanWithoutACommittedAssignment() {
        var driver = rides.driverNear(PICKUP);
        var payer = rides.client();
        var order = rides.order(payer, city, PICKUP, DROPOFF);
        restore.add(() -> { orders.cancel(payer, UUID.randomUUID(), order.id(), orders.get(order.id()).version(), "CHANGED_MIND"); drain(); });
        assertThat(dispatch.offers(driver.actor())).hasSize(1);
        ageData();
        scan("operations");
        assertThat(gauge("I2")).isZero();
        assertThat(gauge("I3")).isZero();
    }

    @Test
    void i2ReservedCapacityNeedsItsMatchingReservedAssignment() {
        var ride = rides.assigned(city, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        UUID assignment = jdbc.sql("select id from assignment where order_id=:id").param("id", ride.order().id()).query(UUID.class).single();
        restore.add(() -> {
            jdbc.sql("update assignment set state='COMMITTED' where id=:id").param("id", assignment).update();
            jdbc.sql("update ride_order set status='ASSIGNED' where id=:id").param("id", ride.order().id()).update();
            jdbc.sql("update driver_capacity set occupancy='TO_PICKUP',assignment_id=:assignment where driver_id=:id")
                    .param("assignment", assignment).param("id", ride.driver().actor().id()).update();
            orders.cancel(ride.payer(), UUID.randomUUID(), ride.order().id(), orders.get(ride.order().id()).version(), "CHANGED_MIND");
            drain();
        });
        jdbc.sql("update assignment set state='RESERVED' where id=:id").param("id", assignment).update();
        jdbc.sql("update ride_order set status='SEARCHING' where id=:id").param("id", ride.order().id()).update();
        jdbc.sql("update driver_capacity set occupancy='RESERVED' where driver_id=:id").param("id", ride.driver().actor().id()).update();
        ageData();
        scan("operations");
        assertThat(gauge("I2")).isZero();
        assertThat(gauge("I3")).isZero();
        jdbc.sql("update driver_capacity set assignment_id=:wrong where driver_id=:id")
                .param("wrong", UUID.randomUUID()).param("id", ride.driver().actor().id()).update();
        assertOneReport("operations", "I2", ride.driver().actor().id());
    }

    @Test
    void anActiveRealRideHasOneCommittedAssignmentAndMatchingBusyCapacity() {
        var ride = rides.started(city, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        restore.add(() -> { rides.complete(ride, true); drain(); });
        ageData();
        scan("operations");
        assertThat(gauge("I2")).isZero();
        assertThat(gauge("I3")).isZero();
        assertThat(events("I2", ride.driver().actor().id())).isZero();
        assertThat(events("I3", ride.order().id())).isZero();
    }

    @ParameterizedTest
    @ValueSource(strings = {"FREE", "WRONG_ASSIGNMENT", "MISSING_CAPACITY"})
    void i2CommittedRideNeedsItsCapacityRowAndMatchingBusyAssignment(String corruption) {
        var ride = rides.started(city, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        UUID driver = ride.driver().actor().id();
        UUID assignment = jdbc.sql("select id from assignment where order_id=:id").param("id", ride.order().id()).query(UUID.class).single();
        long version = jdbc.sql("select version from driver_capacity where driver_id=:id").param("id", driver).query(Long.class).single();
        restore.add(() -> {
            jdbc.sql("""
                    insert into driver_capacity(driver_id,occupancy,assignment_id,updated_at,version)
                    values(:id,'ON_TRIP',:assignment,now(),:version) on conflict(driver_id) do update
                    set occupancy='ON_TRIP',assignment_id=excluded.assignment_id,updated_at=now()
                    """).param("id", driver).param("assignment", assignment).param("version", version).update();
            rides.complete(ride, true);
            drain();
        });
        if ("MISSING_CAPACITY".equals(corruption)) jdbc.sql("delete from driver_capacity where driver_id=:id").param("id", driver).update();
        else jdbc.sql("update driver_capacity set occupancy=:occupancy,assignment_id=:assignment where driver_id=:id")
                .param("occupancy", "FREE".equals(corruption) ? "FREE" : "ON_TRIP")
                .param("assignment", "FREE".equals(corruption) ? null : UUID.randomUUID()).param("id", driver).update();
        ageData();
        assertOneReport("operations", "I2", driver);
        assertThat(gauge("I3")).isZero();
    }

    @ParameterizedTest
    @ValueSource(strings = {"select deliberately_missing_column from ride_order", "select pg_sleep(10)"})
    @SuppressWarnings("unchecked")
    void actualOperationsQueryFailureOrTimeoutLeavesOtherChecksRunning(String sql) {
        var scanner = context.getBean("operationsInvariants");
        var queries = (java.util.Map<InvariantChecks.Check, java.util.function.Supplier<List<InvariantChecks.Violation>>>)
                ReflectionTestUtils.getField(scanner, "checks");
        var original = queries.get(InvariantChecks.Check.I2);
        double before = meters.counter("blizz.invariant.failures", "check", "I2").count();
        queries.put(InvariantChecks.Check.I2, () -> { jdbc.sql(sql).query().listOfRows(); return List.of(); });
        try {
            long start = System.nanoTime();
            scan("operations");
            assertThat(java.time.Duration.ofNanos(System.nanoTime() - start)).isLessThan(java.time.Duration.ofSeconds(9));
            assertThat(gauge("I2")).isNaN();
            assertThat(gauge("I3")).isZero();
            assertThat(gauge("I5")).isZero();
            assertThat(meters.counter("blizz.invariant.failures", "check", "I2").count()).isEqualTo(before + 1);
        } finally { queries.put(InvariantChecks.Check.I2, original); }
        scan("operations");
        assertThat(gauge("I2")).isZero();
    }

    record CancelledHold(OrderView order, UUID intent) { }

    CancelledHold cancelledHold() {
        var order = heldOrder(riderWithCard());
        UUID intent = cards.intent(order.id()).orElseThrow().id();
        drain();
        restore.add(() -> {
            tx.executeWithoutResult(status -> cards.releaseHold(order.id(), "INVARIANT_TEST_CLEANUP"));
            for (int i = 0; i < 4; i++) { payments.runOnce(); drain(); }
        });
        jdbc.sql("update ride_order set status='CANCELLED' where id=:id").param("id", order.id()).update();
        return new CancelledHold(order, intent);
    }

    void ageTerminalData() {
        ageData();
        jdbc.sql("update ride_order set updated_at=now()-interval '2 hours' where status in ('FULFILLED','CANCELLED','UNFULFILLED')").update();
    }

    UUID voidHold(CancelledHold hold) {
        tx.executeWithoutResult(status -> cards.releaseHold(hold.order().id(), "INVARIANT_TEST_VOID"));
        for (int i = 0; i < 4; i++) { payments.runOnce(); drain(); }
        assertThat(cards.intent(hold.order().id()).orElseThrow().state()).isEqualTo("VOIDED");
        return jdbc.sql("select id from payment_operation where intent_id=:id and type='REFUND' and state='SUCCEEDED'")
                .param("id", hold.intent()).query(UUID.class).single();
    }

    @Test
    void i5OneHourTerminalGracePreventsTransientFalseAlarms() {
        var hold = cancelledHold();
        ageData();
        jdbc.sql("update ride_order set updated_at=now()-interval '59 minutes' where id=:id").param("id", hold.order().id()).update();
        scan("operations");
        assertThat(gauge("I5")).isZero();
        assertThat(events("I5", hold.intent())).isZero();
        jdbc.sql("update ride_order set updated_at=now()-interval '61 minutes' where id=:id").param("id", hold.order().id()).update();
        assertOneReport("operations", "I5", hold.intent());
    }

    @ParameterizedTest
    @ValueSource(strings = {"SUCCEEDED", "PENDING", "UNKNOWN"})
    void i5ClosedOrUnresolvedVoidBelongsOutsideStandingHoldCases(String state) {
        var hold = cancelledHold();
        UUID refund = voidHold(hold);
        jdbc.sql("update payment_operation set state=:state where id=:id").param("state", state).param("id", refund).update();
        restore.add(() -> jdbc.sql("update payment_operation set state='SUCCEEDED',updated_at=now() where id=:id").param("id", refund).update());
        ageTerminalData();
        scan("operations");
        assertThat(gauge("I5")).isZero();
        assertThat(events("I5", hold.intent())).isZero();
    }

    @ParameterizedTest
    @ValueSource(strings = {"PENDING", "UNKNOWN"})
    void i5UnresolvedSettleIsHandledByThePaymentUnknownQueue(String state) {
        var ride = completedCardRide(false);
        UUID settle = jdbc.sql("select id from payment_operation where intent_id=:id and type='SETTLE' and state='SUCCEEDED'")
                .param("id", ride.intent()).query(UUID.class).single();
        jdbc.sql("update payment_operation set state=:state where id=:id").param("state", state).param("id", settle).update();
        restore.add(() -> jdbc.sql("update payment_operation set state='SUCCEEDED',updated_at=now() where id=:id").param("id", settle).update());
        ageTerminalData();
        scan("operations");
        assertThat(gauge("I5")).isZero();
        assertThat(events("I5", ride.intent())).isZero();
    }

    @Test
    void i5SuccessfulAuthorizationIsNotHiddenByAZeroedPaidIntent() {
        var hold = cancelledHold();
        long original = cards.intent(hold.order().id()).orElseThrow().holdMinor();
        restore.add(() -> jdbc.sql("update payment_intent set hold_minor=:hold,state='AUTHORIZED',capture_minor=null where id=:id")
                .param("hold", original).param("id", hold.intent()).update());
        jdbc.sql("update payment_intent set hold_minor=0,state='PAID',capture_minor=0 where id=:id").param("id", hold.intent()).update();
        ageTerminalData();
        assertOneReport("operations", "I5", hold.intent());
    }

    @Test
    void i5DeclinedVoidDoesNotCloseSuccessfulAuthorization() {
        var hold = cancelledHold();
        UUID refund = voidHold(hold);
        jdbc.sql("update payment_operation set state='DECLINED' where id=:id").param("id", refund).update();
        restore.add(() -> jdbc.sql("update payment_operation set state='SUCCEEDED',updated_at=now() where id=:id").param("id", refund).update());
        ageTerminalData();
        assertOneReport("operations", "I5", hold.intent());
    }

    @Test
    void i3AssignedOrderWithoutAnAssignmentIsReportedOnce() {
        Actor payer = rides.client();
        OrderView order = rides.order(payer, city, PICKUP, DROPOFF);
        jdbc.sql("update ride_order set status='ASSIGNED' where id=:id").param("id", order.id()).update();
        restore.add(() -> jdbc.sql("update ride_order set status='UNFULFILLED',updated_at=now() where id=:id").param("id", order.id()).update());
        ageData();
        assertOneReport("operations", "I3", order.id());
        assertThat(orders.get(order.id()).status()).isEqualTo("ASSIGNED");
    }

    Actor riderWithCard() {
        Actor rider = rides.client();
        jdbc.sql("""
                insert into payment_card(id,client_id,merchant_id,token,masked_pan,card_type,state,created_at)
                values(:id,:client,:merchant,:token,'41****1111','Visa','ACTIVE',now())
                """).param("id", UUID.randomUUID()).param("client", rider.id()).param("merchant", merchant)
                .param("token", "tok-" + rider.id()).update();
        return rider;
    }

    OrderView heldOrder(Actor rider) {
        UUID quote = new TestQuotes(jdbc, quotes).quote(rider, city, "STANDARD", PICKUP, DROPOFF).id();
        OrderView order = orders.create(rider, UUID.randomUUID(), new CreateOrder(rider.id(), "STANDARD", PICKUP,
                "Home", DROPOFF, "Work", PaymentMethod.CARD, quote));
        assertThat(cards.intent(order.id()).orElseThrow().state()).isEqualTo("AUTHORIZED");
        return order;
    }

    record CardRide(Actor rider, TestRides.Driver driver, OrderView order, UUID intent) { }

    CardRide completedCardRide(boolean extraWaiting) { return completedCardRide(extraWaiting, false); }

    CardRide completedCardRide(boolean extraWaiting, boolean bonusPaid) {
        var driver = rides.driverNear(PICKUP);
        Actor rider = riderWithCard();
        OrderView order;
        if (bonusPaid) {
            var quote = new TestQuotes(jdbc, quotes).quote(rider, city, "STANDARD", PICKUP, DROPOFF);
            long wallet = quote.toPayMinor();
            ledger.post(new Ledger.Posting("bonus-fixture:" + UUID.randomUUID(), "PROMOTION", UUID.randomUUID(), "UAH",
                    "Test bonuses", List.of(Ledger.Line.debit(Ledger.Account.PROMO_EXPENSE, null, wallet),
                    Ledger.Line.credit(Ledger.Account.RIDER_WALLET, rider.id(), wallet))));
            order = orders.create(rider, UUID.randomUUID(), new CreateOrder(rider.id(), "STANDARD", PICKUP,
                    "Home", DROPOFF, "Work", PaymentMethod.CARD, quote.id(), null, null, null, null, false, wallet));
        } else order = heldOrder(rider);
        drain();
        dispatch.accept(driver.actor(), driver.device(), UUID.randomUUID(), dispatch.offers(driver.actor()).getFirst().id());
        rides.moveTo(driver, TestRides.north(PICKUP, 20));
        var trip = trips.current(driver.actor()).orElseThrow();
        var waiting = trips.arrive(driver.actor(), UUID.randomUUID(), trip.id(), trip.version(), null);
        if (extraWaiting) jdbc.sql("update trip set arrived_at=now()-interval '10 minutes' where id=:id").param("id", trip.id()).update();
        var started = trips.start(driver.actor(), UUID.randomUUID(), trip.id(), waiting.version(), null);
        trips.complete(driver.actor(), UUID.randomUUID(), trip.id(), started.version(), OffsetDateTime.now(), bonusPaid ? true : null);
        drain();
        for (int i = 0; i < 4; i++) { payments.runOnce(); drain(); }
        assertThat(cards.intent(order.id()).orElseThrow().state()).isEqualTo("PAID");
        return new CardRide(rider, driver, orders.get(order.id()), cards.intent(order.id()).orElseThrow().id());
    }

    @Test
    void i4PaidIntentWithInsufficientSuccessfulCaptureIsReportedOnce() {
        var ride = completedCardRide(false);
        long due = jdbc.sql("select capture_minor from payment_intent where id=:id").param("id", ride.intent()).query(Long.class).single();
        jdbc.sql("update payment_intent set capture_minor=:amount where id=:id").param("amount", due + 1).param("id", ride.intent()).update();
        restore.add(() -> jdbc.sql("update payment_intent set capture_minor=:amount,updated_at=now() where id=:id").param("amount", due).param("id", ride.intent()).update());
        ageData();
        assertOneReport("payments", "I4", ride.intent());
        assertThat(jdbc.sql("select capture_minor from payment_intent where id=:id").param("id", ride.intent()).query(Long.class).single()).isEqualTo(due + 1);
    }

    @Test
    void i4SuccessfulSettleCannotExceedItsAuthorization() {
        var ride = completedCardRide(false);
        var operation = jdbc.sql("select id,amount_minor from payment_operation where intent_id=:id and type='SETTLE' and state='SUCCEEDED'")
                .param("id", ride.intent()).query().singleRow();
        UUID operationId = (UUID) operation.get("id");
        long amount = ((Number) operation.get("amount_minor")).longValue();
        long hold = jdbc.sql("select hold_minor from payment_intent where id=:id").param("id", ride.intent()).query(Long.class).single();
        jdbc.sql("update payment_operation set amount_minor=:amount where id=:id").param("amount", hold + 1).param("id", operationId).update();
        restore.add(() -> jdbc.sql("update payment_operation set amount_minor=:amount,updated_at=now() where id=:id")
                .param("amount", amount).param("id", operationId).update());
        ageData();
        assertOneReport("payments", "I4", ride.intent());
        assertThat(jdbc.sql("select payload->>'detail' from outbox where event_type='InvariantViolated' and aggregate_id=:id and payload->>'check'='I4'")
                .param("id", ride.intent()).query(String.class).single()).contains("SETTLE_EXCEEDS_AUTH");
    }

    @Test
    void i3TerminalOrderCannotKeepACommittedAssignment() {
        var ride = rides.started(city, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        rides.complete(ride, true);
        drain();
        UUID assignment = jdbc.sql("select id from assignment where order_id=:id").param("id", ride.order().id()).query(UUID.class).single();
        jdbc.sql("update assignment set state='COMMITTED' where id=:id").param("id", assignment).update();
        restore.add(() -> jdbc.sql("update assignment set state='COMPLETED',closed_at=now() where id=:id").param("id", assignment).update());
        ageData();
        assertOneReport("operations", "I3", ride.order().id());
    }

    @Test
    void bonusOnlyCardLegNeedsNoAuthorizationOrCapture() {
        var card = completedCardRide(false, true);
        assertThat(cards.intent(card.order().id()).orElseThrow().holdMinor()).isZero();
        assertThat(jdbc.sql("select capture_minor from payment_intent where id=:id").param("id", card.intent())
                .query().singleRow().get("capture_minor")).isNull();
        assertThat(jdbc.sql("select count(*) from payment_operation where intent_id=:id").param("id", card.intent())
                .query(Long.class).single()).isZero();
        ageData();
        scan("payments");
        assertThat(gauge("I4")).isZero();
        assertThat(events("I4", card.intent())).isZero();
    }

    @Test
    void finishedCashAndAboveHoldCardRidesAreCleanAfterTheSettlingMargin() {
        var cashDriver = rides.driverNear(PICKUP);
        var cash = rides.started(city, cashDriver, PICKUP, DROPOFF);
        rides.complete(cash, true);
        drain();
        sessions.close(cashDriver.actor(), UUID.randomUUID(), cashDriver.device(), sessions.availability(cashDriver.actor().id()).sessionVersion());
        var card = completedCardRide(true);
        tips.leave(card.rider(), UUID.randomUUID(), card.order().id(), 100);
        for (int i = 0; i < 4; i++) { payments.runOnce(); drain(); }
        assertThat(tips.options(card.rider(), card.order().id()).tip().state()).isEqualTo("PAID");
        assertThat(jdbc.sql("select count(*) from payment_operation where intent_id=:id and type='CHARGE' and state='SUCCEEDED'")
                .param("id", card.intent()).query(Long.class).single()).isPositive();
        ageTerminalData();
        for (String owner : List.of("finance", "operations", "payments")) scan(owner);
        assertThat(gauge("I1")).isZero();
        assertThat(gauge("I2")).isZero();
        assertThat(gauge("I5")).isZero();
        assertThat(gauge("I3")).isZero();
        assertThat(gauge("I4")).isZero();
        drain();
        assertThat(events("I3", cash.order().id())).isZero();
        assertThat(events("I3", card.order().id())).isZero();
        assertThat(events("I4", card.intent())).isZero();
    }
}
