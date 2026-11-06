package taxi.blizz.refunds;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.TestQuotes;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.finance.FareDeltas;
import taxi.blizz.finance.RiderWallets;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.SessionService;
import taxi.blizz.operations.CreateOrder;
import taxi.blizz.operations.Dispatch;
import taxi.blizz.operations.OrderView;
import taxi.blizz.operations.Orders;
import taxi.blizz.operations.PaymentMethod;
import taxi.blizz.operations.TripView;
import taxi.blizz.operations.Trips;
import taxi.blizz.operations.WorkSessions;
import taxi.blizz.payments.internal.TestPayments;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.pricing.QuoteService;

/**
 * Part 2 of #512 (ADR 0018 A5–A7): an approved refund moves the money — to the card through the payment worker, one
 * REFUND per paid transaction and never a void of the payment, or to the bonus account — and the journal puts it on
 * whoever is at fault, after a fare correction's refund obligation. Its own city at longitude -139.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class RefundExecutionTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, -138.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, -138.45);

    @Autowired Refunds refunds;
    @Autowired Orders orders;
    @Autowired Dispatch dispatch;
    @Autowired Trips trips;
    @Autowired WorkSessions sessions;
    @Autowired SessionService auth;
    @Autowired QuoteService quotes;
    @Autowired RiderWallets wallets;
    @Autowired FareDeltas fareDeltas;
    @Autowired TransactionTemplate tx;
    @Autowired ApplicationContext context;
    @Autowired JdbcClient jdbc;

    TestRides rides;
    TestPayments payments;
    UUID city;

    @BeforeEach
    void city() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        payments = new TestPayments(context);
        city = rides.city("test-refund-execution", "UAH", -139);
        if (jdbc.sql("select count(*) from payment_merchant_city where city_id = :city").param("city", city)
                .query(Long.class).single() == 0) {
            UUID id = UUID.randomUUID();
            jdbc.sql("""
                            insert into payment_merchant (id, provider, account, domain, secret_ref, currency,
                                                          created_at)
                            values (:id, 'FAKE', :account, 'test.blizz.invalid', 'test', 'UAH', now())""")
                    .param("id", id).param("account", "refunds_" + id).update();
            jdbc.sql("insert into payment_merchant_city (city_id, merchant_id) values (:city, :merchant)")
                    .param("city", city).param("merchant", id).update();
        }
        payments.resetGateway();
    }

    @AfterEach
    void drainAll() {
        payments.settle();
        payments.resetGateway();
    }

    @Test
    void aBonusRefundOfACashTripIsDoneAtOnceAndTheDriverAtFaultBearsAllOfIt() {
        Ride ride = cashRide();
        Actor superAdmin = staff("SUPER_ADMIN");
        long before = wallets.available(ride.ride().payer().id(), "UAH");

        Refunds.Refund refund = refunds.request(superAdmin, UUID.randomUUID(), new Refunds.Request(
                ride.orderId(), 1500, "BONUSES", true, "LONG_ROUTE", null, null)).refund();
        payments.settle();

        assertThat(state(refund)).isEqualTo("SUCCEEDED");
        assertThat(wallets.available(ride.ride().payer().id(), "UAH")).isEqualTo(before + 1500);
        assertThat(lines(refund)).containsExactlyInAnyOrder("RIDER_WALLET:credit:1500",
                "DRIVER_PAYABLE:debit:1500");
        assertThat(count("select count(*) from outbox where event_type = 'RefundSucceeded' and aggregate_id = :id",
                refund.id())).isEqualTo(1);
    }

    @Test
    void aCardRefundGoesThroughTheWorkerAndLeavesThePaymentPaid() {
        Ride ride = cardRide();
        Actor superAdmin = staff("SUPER_ADMIN");
        String intentBefore = intentState(ride);
        int requestsBefore = payments.requests().size();

        Refunds.Refund refund = refunds.request(superAdmin, UUID.randomUUID(), new Refunds.Request(
                ride.orderId(), 1200, "CARD", false, "DOUBLE_CHARGE", null, null)).refund();
        payments.settle();

        assertThat(state(refund)).isEqualTo("SUCCEEDED");
        List<Map<String, Object>> sent = payments.requests().subList(requestsBefore, payments.requests().size());
        assertThat(sent).filteredOn(r -> "REFUND".equals(r.get("transactionType"))).singleElement()
                .satisfies(r -> assertThat(r.get("comment")).isEqualTo("Refund to the rider"));
        assertThat(intentState(ride)).as("a rider refund is no void").isEqualTo(intentBefore);
        assertThat(jdbc.sql("""
                        select count(*) from payment_operation where refund_id = :id and type = 'REFUND'
                          and state = 'SUCCEEDED' and amount_minor = 1200""")
                .param("id", refund.id()).query(Integer.class).single()).isEqualTo(1);
        assertThat(lines(refund)).containsExactlyInAnyOrder("PROVIDER_CLEARING:credit:1200",
                "SERVICE_EXPENSE:debit:1200");
    }

    @Test
    void theDriversShareAndTheCommissionBearACardRefundForTheDriversFault() {
        Ride ride = cardRide();
        Map<String, Object> trip = jdbc.sql("""
                        select (payload ->> 'amount_minor')::bigint as fare,
                               (payload ->> 'driver_share_minor')::bigint as share
                        from order_event where order_id = :o and type = 'TripCompleted'""")
                .param("o", ride.orderId()).query().singleRow();
        long share = Math.floorDiv(2000 * ((Number) trip.get("share")).longValue(),
                ((Number) trip.get("fare")).longValue());

        Refunds.Refund refund = refunds.request(staff("SUPER_ADMIN"), UUID.randomUUID(), new Refunds.Request(
                ride.orderId(), 2000, "CARD", false, "RUDE_DRIVER", null, null)).refund();
        payments.settle();

        assertThat(lines(refund)).containsExactlyInAnyOrder("PROVIDER_CLEARING:credit:2000",
                "DRIVER_PAYABLE:debit:" + share, "SERVICE_COMMISSION:debit:" + (2000 - share));
    }

    @Test
    void aDeclinedCardRefundFailsMovesNothingAndFreesTheSum() {
        Ride ride = cardRide();
        Actor superAdmin = staff("SUPER_ADMIN");
        payments.next("Declined");

        Refunds.Refund refund = refunds.request(superAdmin, UUID.randomUUID(), new Refunds.Request(
                ride.orderId(), 1000, "CARD", false, "GOODWILL", null, null)).refund();
        payments.settle();

        assertThat(state(refund)).isEqualTo("FAILED");
        assertThat(lines(refund)).isEmpty();
        assertThat(count("select count(*) from outbox where event_type = 'RefundFailed' and aggregate_id = :id",
                refund.id())).isEqualTo(1);
        assertThat(refunds.refundable(superAdmin, ride.orderId()).refundedMinor()).isZero();
    }

    @Test
    void aFareCorrectionsRefundObligationIsPaidFirst() {
        Ride ride = cardRide();
        tx.executeWithoutResult(s -> fareDeltas.post(new FareDeltas.Delta(ride.orderId(), UUID.randomUUID(),
                ride.ride().payer().id(), ride.ride().driver().actor().id(), false, "UAH", -1000, -250, -750)));
        assertThat(fareDeltas.refundObligation(ride.orderId())).isEqualTo(1000);

        Refunds.Refund refund = refunds.request(staff("SUPER_ADMIN"), UUID.randomUUID(), new Refunds.Request(
                ride.orderId(), 1500, "CARD", false, "SOFTWARE_ERROR", null, null)).refund();
        payments.settle();

        assertThat(lines(refund)).containsExactlyInAnyOrder("PROVIDER_CLEARING:credit:1500",
                "REFUNDS_PAYABLE:debit:1000", "SERVICE_EXPENSE:debit:500");
        assertThat(fareDeltas.refundObligation(ride.orderId())).as("paid").isZero();
    }

    @Test
    void anAdminsRefundMovesOnlyAfterTheConfirmation() {
        Ride ride = cashRide();
        Actor admin = staff("ADMIN", Refunds.CREATE_PERMISSION);
        refunds.setLimit(staff("SUPER_ADMIN"), UUID.randomUUID(), admin.id(), "UAH", 5000, 5000, 0, "Test");
        Refunds.Refund requested = refunds.request(admin, UUID.randomUUID(), new Refunds.Request(ride.orderId(), 1000,
                "BONUSES", true, "GOODWILL", null, null)).refund();
        payments.settle();
        assertThat(state(requested)).isEqualTo("REQUESTED");
        assertThat(lines(requested)).isEmpty();

        refunds.confirm(staff("ADMIN", Refunds.CONFIRM_PERMISSION), UUID.randomUUID(), requested.id(),
                requested.version());
        payments.settle();

        assertThat(state(requested)).isEqualTo("SUCCEEDED");
    }

    // ------------------------------------------------------------ helpers

    record Ride(TestRides.Ride ride, UUID orderId) {
    }

    private Ride cashRide() {
        rides.city("test-refund-execution", "UAH", -139);
        TestRides.Ride ride = rides.started(city, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        rides.complete(ride, true);
        payments.settle();
        return new Ride(ride, ride.order().id());
    }

    private Ride cardRide() {
        rides.city("test-refund-execution", "UAH", -139);
        UUID merchant = jdbc.sql("select merchant_id from payment_merchant_city where city_id = :c")
                .param("c", city).query(UUID.class).single();
        Actor rider = rides.client();
        jdbc.sql("""
                        insert into payment_card (id, client_id, merchant_id, token, masked_pan, card_type, state,
                                                  created_at)
                        values (:id, :client, :merchant, :token, '41****1111', 'Visa', 'ACTIVE', now())""")
                .param("id", UUID.randomUUID()).param("client", rider.id()).param("merchant", merchant)
                .param("token", "tok-" + rider.id()).update();
        TestRides.Driver driver = rides.driverNear(PICKUP);
        UUID quote = new TestQuotes(jdbc, quotes).quote(rider, city, "STANDARD", PICKUP, DROPOFF).id();
        OrderView order = orders.create(rider, UUID.randomUUID(), new CreateOrder(rider.id(), "STANDARD", PICKUP,
                "Home", DROPOFF, "Work", PaymentMethod.CARD, quote));
        payments.settle();
        dispatch.accept(driver.actor(), driver.device(), UUID.randomUUID(),
                dispatch.offers(driver.actor()).getFirst().id());
        TripView trip = trips.current(driver.actor()).orElseThrow();
        rides.moveTo(driver, TestRides.north(PICKUP, 30));
        TripView waiting = trips.arrive(driver.actor(), UUID.randomUUID(), trip.id(), trip.version(), null);
        TripView started = trips.start(driver.actor(), UUID.randomUUID(), waiting.id(), waiting.version(), null);
        TestRides.Ride ride = new TestRides.Ride(rider, driver, order, started);
        rides.complete(ride, null);
        payments.settle();
        assertThat(intentState(new Ride(ride, order.id()))).as("the fare is paid").isEqualTo("PAID");
        return new Ride(ride, order.id());
    }

    private String intentState(Ride ride) {
        return jdbc.sql("select state from payment_intent where order_id = :o").param("o", ride.orderId())
                .query(String.class).single();
    }

    private String state(Refunds.Refund refund) {
        return jdbc.sql("select state from refund where id = :id").param("id", refund.id()).query(String.class)
                .single();
    }

    /** ACCOUNT:debit|credit:amount of the refund's journal entry. */
    private List<String> lines(Refunds.Refund refund) {
        return jdbc.sql("""
                        select l.account || ':' || case when l.debit_minor > 0 then 'debit:' || l.debit_minor
                                                        else 'credit:' || l.credit_minor end
                        from journal_line l join journal_transaction t on t.id = l.transaction_id
                        where t.business_key = :key""")
                .param("key", "refund:" + refund.id()).query(String.class).list();
    }

    private Actor staff(String role, String... permissions) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, all_cities, city_scope, state,
                                                created_at, updated_at)
                        values (:id, :login, 'Refunds', :role, :permissions, true, '{}', 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "refund-exec-" + id).param("role", role)
                .param("permissions", permissions).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private int count(String sql, Object id) {
        return jdbc.sql(sql).param("id", id).query(Integer.class).single();
    }
}
