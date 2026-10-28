package taxi.blizz.payments.internal;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.TestQuotes;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
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
import taxi.blizz.payments.CardPayments;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.internal.OutboxRelay;
import taxi.blizz.pricing.QuoteService;

/** Taking the money after the trip (ADR 0008, REQ-PAY-04/05/18). */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class CardCaptureTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, -9.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, -9.45);

    @Autowired
    Orders orders;
    @Autowired
    Dispatch dispatch;
    @Autowired
    Trips trips;
    @Autowired
    WorkSessions sessions;
    @Autowired
    SessionService auth;
    @Autowired
    QuoteService quotes;
    @Autowired
    CardPayments payments;
    @Autowired
    JdbcCardPayments internal;
    @Autowired
    PaymentWorker worker;
    @Autowired
    FakeProvider.Gateway gateway;
    @Autowired
    OutboxRelay relay;
    @Autowired
    TransactionTemplate tx;
    @Autowired
    JdbcClient jdbc;

    TestRides rides;
    UUID cityId;
    UUID merchantId;

    @BeforeEach
    void setUp() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        cityId = rides.city("test-card-capture", "UAH", -10);
        merchantId = jdbc.sql("select merchant_id from payment_merchant_city where city_id = :city")
                .param("city", cityId).query(UUID.class).optional().orElseGet(() -> {
                    UUID id = UUID.randomUUID();
                    jdbc.sql("""
                                    insert into payment_merchant (id, provider, account, domain, secret_ref, currency,
                                                                  created_at)
                                    values (:id, 'FAKE', :account, 'test.blizz.invalid', 'test', 'UAH', now())""")
                            .param("id", id).param("account", "capture_" + id).update();
                    jdbc.sql("insert into payment_merchant_city (city_id, merchant_id) values (:city, :merchant)")
                            .param("city", cityId).param("merchant", id).update();
                    return id;
                });
        gateway.reset();
    }

    private Actor riderWithCard() {
        Actor rider = rides.client();
        jdbc.sql("""
                        insert into payment_card (id, client_id, merchant_id, token, masked_pan, card_type, state, created_at)
                        values (:id, :client, :merchant, :token, '41****1111', 'Visa', 'ACTIVE', now())""")
                .param("id", UUID.randomUUID()).param("client", rider.id()).param("merchant", merchantId)
                .param("token", "tok-" + rider.id()).update();
        return rider;
    }

    /** A card order whose hold is in place. */
    private OrderView heldOrder(Actor rider) {
        UUID quote = new TestQuotes(jdbc, quotes).quote(rider, cityId, "STANDARD", PICKUP, DROPOFF).id();
        OrderView order = orders.create(rider, UUID.randomUUID(), new CreateOrder(rider.id(), "STANDARD", PICKUP,
                "Home", DROPOFF, "Work", PaymentMethod.CARD, quote));
        assertThat(payments.intent(order.id()).orElseThrow().state()).isEqualTo("AUTHORIZED");
        return order;
    }

    private void deliverEvents() {
        while (relay.runOnce() > 0) {
            // drain
        }
    }

    private void settlePayments() {
        for (int i = 0; i < 6; i++) {
            jdbc.sql("update payment_operation set next_check_at = now() - interval '1 second' "
                    + "where state in ('PENDING', 'UNKNOWN')").update();
            worker.runOnce();
        }
        deliverEvents();
    }

    private List<String> sent() {
        return gateway.requests().stream().map(r -> r.get("transactionType") + ":" + r.getOrDefault(
                "merchantTransactionType", "") + ":" + r.get("amount")).toList();
    }

    private long receivable(Actor rider) {
        return jdbc.sql("""
                        select coalesce(sum(debit_minor) - sum(credit_minor), 0) from journal_line
                        where account = 'RIDER_RECEIVABLE' and party_id = :payer""")
                .param("payer", rider.id()).query(Long.class).single();
    }

    @Test
    void aCardRideIsPaidFromTheHoldAfterTheTrip() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        Actor rider = riderWithCard();
        OrderView order = heldOrder(rider);
        deliverEvents();
        dispatch.accept(driver.actor(), UUID.randomUUID(), dispatch.offers(driver.actor()).getFirst().id());
        TripView trip = trips.current(driver.actor()).orElseThrow();
        rides.moveTo(driver, TestRides.north(PICKUP, 20));
        TripView waiting = trips.arrive(driver.actor(), UUID.randomUUID(), trip.id(), trip.version(), null);
        TripView started = trips.start(driver.actor(), UUID.randomUUID(), waiting.id(), waiting.version(), null);
        trips.complete(driver.actor(), UUID.randomUUID(), started.id(), started.version(), OffsetDateTime.now(), null);
        assertThat(orders.get(order.id()).paymentState()).as("the driver is free before the bank answers")
                .isEqualTo("CAPTURE_PENDING");
        assertThat(trips.current(driver.actor())).isEmpty();

        deliverEvents();
        settlePayments();
        OrderView paid = orders.get(order.id());
        assertThat(paid.paymentState()).isEqualTo("PAID");
        assertThat(payments.intent(order.id()).orElseThrow().state()).isEqualTo("PAID");
        assertThat(sent()).containsExactly("CHARGE:AUTH:" + WayForPayProvider.amount(order.priceMinor()),
                "SETTLE::" + WayForPayProvider.amount(paid.finalPriceMinor()));
        assertThat(receivable(rider)).as("the fare is paid in full").isZero();
        assertThat(jdbc.sql("""
                        select sum(l.debit_minor) from journal_line l join journal_transaction t on t.id = l.transaction_id
                        where t.basis_id = :order and l.account = 'PROVIDER_CLEARING'""")
                .param("order", order.id()).query(Long.class).single()).isEqualTo(paid.finalPriceMinor());
    }

    /** T-27: the driver reports cash on a card order — the card pays, the cash is not counted a second time. */
    @Test
    void cashReportedOnACardOrderIsNotCountedTwice() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        Actor rider = riderWithCard();
        OrderView order = heldOrder(rider);
        deliverEvents();
        dispatch.accept(driver.actor(), UUID.randomUUID(), dispatch.offers(driver.actor()).getFirst().id());
        TripView trip = trips.current(driver.actor()).orElseThrow();
        rides.moveTo(driver, TestRides.north(PICKUP, 20));
        TripView waiting = trips.arrive(driver.actor(), UUID.randomUUID(), trip.id(), trip.version(), null);
        TripView started = trips.start(driver.actor(), UUID.randomUUID(), waiting.id(), waiting.version(), null);
        trips.complete(driver.actor(), UUID.randomUUID(), started.id(), started.version(), OffsetDateTime.now(), true);
        deliverEvents();
        settlePayments();

        OrderView paid = orders.get(order.id());
        assertThat(paid.paymentState()).isEqualTo("PAID");
        assertThat(receivable(rider)).as("the fare is paid once, by the card").isZero();
        assertThat(jdbc.sql("""
                        select count(*) from journal_transaction
                        where basis_id = :order and basis_type in ('CASH_COLLECTED', 'TERMINAL_COLLECTED')""")
                .param("order", order.id()).query(Long.class).single()).as("no cash posting").isZero();
    }

    @Test
    void aboveTheHoldTheRestIsChargedToTheSavedCard() {
        Actor rider = riderWithCard();
        OrderView order = heldOrder(rider);
        long hold = order.priceMinor();
        tx.executeWithoutResult(s -> internal.startCapture(order.id(), hold + 700, "UAH"));
        tx.executeWithoutResult(s -> internal.startCapture(order.id(), hold + 700, "UAH")); // a repeated event
        settlePayments();
        assertThat(payments.intent(order.id()).orElseThrow().state()).isEqualTo("PAID");
        assertThat(sent()).containsExactly("CHARGE:AUTH:" + WayForPayProvider.amount(hold),
                "SETTLE::" + WayForPayProvider.amount(hold), "CHARGE:SALE:7.00");
    }

    @Test
    void whatCannotBeChargedStaysTheRidersDebt() {
        Actor rider = riderWithCard();
        OrderView order = heldOrder(rider);
        long hold = order.priceMinor();
        gateway.next("Approved", "Declined"); // the hold is taken, the rest is refused
        tx.executeWithoutResult(s -> internal.startCapture(order.id(), hold + 700, "UAH"));
        settlePayments();
        assertThat(payments.intent(order.id()).orElseThrow().state()).isEqualTo("PARTIALLY_PAID");
        assertThat(orders.get(order.id()).paymentState()).isEqualTo("PARTIALLY_PAID");
        assertThat(jdbc.sql("""
                        select sum(l.debit_minor) from journal_line l join journal_transaction t on t.id = l.transaction_id
                        where t.basis_id = :order and l.account = 'PROVIDER_CLEARING'""")
                .param("order", order.id()).query(Long.class).single()).isEqualTo(hold);
    }

    @Test
    void aHoldThatCannotBeTakenIsChargedOnceToTheSavedCard() {
        Actor rider = riderWithCard();
        OrderView order = heldOrder(rider);
        long hold = order.priceMinor();
        gateway.next("Declined"); // the settle fails, e.g. the hold lapsed
        tx.executeWithoutResult(s -> internal.startCapture(order.id(), hold - 100, "UAH"));
        settlePayments();
        assertThat(payments.intent(order.id()).orElseThrow().state()).isEqualTo("PAID");
        assertThat(sent()).containsExactly("CHARGE:AUTH:" + WayForPayProvider.amount(hold),
                "SETTLE::" + WayForPayProvider.amount(hold - 100), "CHARGE:SALE:" + WayForPayProvider.amount(hold - 100));
    }

    private String authReference(OrderView order) {
        return jdbc.sql("""
                        select o.reference from payment_operation o join payment_intent i on i.id = o.intent_id
                        where i.order_id = :order and o.type = 'AUTH'""")
                .param("order", order.id()).query(String.class).single();
    }

    private long sentOf(String type) {
        return gateway.requests().stream().filter(r -> type.equals(r.get("transactionType"))).count();
    }

    /** Review of 28.10.2026: a capture that never reached the bank is sent again while the hold stands. */
    @Test
    void aLostCaptureIsSentAgainWhileTheHoldStands() {
        Actor rider = riderWithCard();
        OrderView order = heldOrder(rider);
        long hold = order.priceMinor();
        gateway.next("TIMEOUT"); // the settle never arrives
        tx.executeWithoutResult(s -> internal.startCapture(order.id(), hold - 100, "UAH"));
        settlePayments();
        assertThat(payments.intent(order.id()).orElseThrow().state()).isEqualTo("PAID");
        assertThat(sentOf("SETTLE")).isEqualTo(2);
        assertThat(sent()).as("no extra charge").noneMatch(r -> r.startsWith("CHARGE:SALE"));
    }

    /** Review of 28.10.2026: a hold that lapsed before the capture arrived is not taken for paid. */
    @Test
    void aHoldThatLapsedBeforeTheCaptureIsNotTakenForPaid() {
        Actor rider = riderWithCard();
        OrderView order = heldOrder(rider);
        long hold = order.priceMinor();
        gateway.next("TIMEOUT");
        tx.executeWithoutResult(s -> internal.startCapture(order.id(), hold - 100, "UAH"));
        worker.runOnce(); // the settle is lost
        gateway.record(authReference(order), "Voided"); // meanwhile the hold lapsed
        settlePayments();
        assertThat(jdbc.sql("""
                        select o.state from payment_operation o join payment_intent i on i.id = o.intent_id
                        where i.order_id = :order and o.type = 'SETTLE'""")
                .param("order", order.id()).query(String.class).single()).isEqualTo("DECLINED");
        assertThat(sent()).contains("CHARGE:SALE:" + WayForPayProvider.amount(hold - 100));
        assertThat(payments.intent(order.id()).orElseThrow().state()).isEqualTo("PAID");
    }

    /** Review of 28.10.2026: a void that never reached the bank is sent again; the rider's money is not blocked. */
    @Test
    void aLostVoidIsSentAgain() {
        Actor rider = riderWithCard();
        OrderView order = heldOrder(rider);
        gateway.next("TIMEOUT");
        orders.cancel(rider, UUID.randomUUID(), order.id(), orders.get(order.id()).version(), "CHANGED_MIND");
        deliverEvents();
        settlePayments();
        assertThat(payments.intent(order.id()).orElseThrow().state()).isEqualTo("VOIDED");
        assertThat(sentOf("REFUND")).isEqualTo(2);
    }
}
