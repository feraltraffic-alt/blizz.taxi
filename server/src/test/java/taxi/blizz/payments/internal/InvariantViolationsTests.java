package taxi.blizz.payments.internal;

import static org.assertj.core.api.Assertions.assertThat;

import io.micrometer.core.instrument.MeterRegistry;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
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

    CardRide completedCardRide(boolean extraWaiting) {
        var driver = rides.driverNear(PICKUP);
        Actor rider = riderWithCard();
        OrderView order = heldOrder(rider);
        drain();
        dispatch.accept(driver.actor(), UUID.randomUUID(), dispatch.offers(driver.actor()).getFirst().id());
        rides.moveTo(driver, TestRides.north(PICKUP, 20));
        var trip = trips.current(driver.actor()).orElseThrow();
        var waiting = trips.arrive(driver.actor(), UUID.randomUUID(), trip.id(), trip.version(), null);
        if (extraWaiting) jdbc.sql("update trip set arrived_at=now()-interval '10 minutes' where id=:id").param("id", trip.id()).update();
        var started = trips.start(driver.actor(), UUID.randomUUID(), trip.id(), waiting.version(), null);
        trips.complete(driver.actor(), UUID.randomUUID(), trip.id(), started.version(), OffsetDateTime.now(), null);
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
    void finishedCashAndAboveHoldCardRidesAreCleanAfterTheSettlingMargin() {
        var cashDriver = rides.driverNear(PICKUP);
        var cash = rides.started(city, cashDriver, PICKUP, DROPOFF);
        rides.complete(cash, true);
        drain();
        sessions.close(cashDriver.actor(), UUID.randomUUID(), cashDriver.device(), sessions.availability(cashDriver.actor().id()).sessionVersion());
        var card = completedCardRide(true);
        assertThat(jdbc.sql("select count(*) from payment_operation where intent_id=:id and type='CHARGE' and state='SUCCEEDED'")
                .param("id", card.intent()).query(Long.class).single()).isPositive();
        ageData();
        for (String owner : List.of("finance", "operations", "payments")) scan(owner);
        assertThat(gauge("I1")).isZero();
        assertThat(gauge("I3")).isZero();
        assertThat(gauge("I4")).isZero();
        drain();
        assertThat(events("I3", cash.order().id())).isZero();
        assertThat(events("I3", card.order().id())).isZero();
        assertThat(events("I4", card.intent())).isZero();
    }
}
