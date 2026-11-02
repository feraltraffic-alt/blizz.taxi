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
    @Autowired
    taxi.blizz.payments.PaymentOperations paymentOperations;
    @Autowired
    taxi.blizz.configuration.FeatureFlags flags;
    @Autowired
    PaymentNotifications notifications;
    @Autowired
    UnknownPayments unknown;

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
        dispatch.accept(driver.actor(), driver.device(), UUID.randomUUID(), dispatch.offers(driver.actor()).getFirst().id());
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
        assertThat(sent()).containsExactly("CHARGE:AUTH:" + WayForPayProvider.amount(order.priceMinor(), "UAH"),
                "SETTLE::" + WayForPayProvider.amount(paid.finalPriceMinor(), "UAH"));
        assertThat(receivable(rider)).as("the fare is paid in full").isZero();
        assertThat(jdbc.sql("""
                        select sum(l.debit_minor) from journal_line l join journal_transaction t on t.id = l.transaction_id
                        where t.basis_id = :order and l.account = 'PROVIDER_CLEARING'""")
                .param("order", order.id()).query(Long.class).single()).isEqualTo(paid.finalPriceMinor());

        // Payment and order both publish these types, each with its own payload and schema (#112).
        assertThat(jdbc.sql("""
                        select distinct aggregate_type || ' ' || event_type from outbox
                        where (aggregate_id = :order or payload ->> 'order_id' = :orderText)
                          and event_type in ('CardHoldAuthorized', 'CardPaymentSettled')""")
                .param("order", order.id()).param("orderText", order.id().toString()).query(String.class).list())
                .containsExactlyInAnyOrder("PaymentIntent CardHoldAuthorized", "Order CardHoldAuthorized",
                        "PaymentIntent CardPaymentSettled", "Order CardPaymentSettled");
        taxi.blizz.EventContracts.assertOrderEventsConform(jdbc, order.id(), "CardHoldAuthorized",
                "CardPaymentSettled");
    }

    /** T-27: the driver reports cash on a card order — the card pays, the cash is not counted a second time. */
    @Test
    void cashReportedOnACardOrderIsNotCountedTwice() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        Actor rider = riderWithCard();
        OrderView order = heldOrder(rider);
        deliverEvents();
        dispatch.accept(driver.actor(), driver.device(), UUID.randomUUID(), dispatch.offers(driver.actor()).getFirst().id());
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
        assertThat(sent()).containsExactly("CHARGE:AUTH:" + WayForPayProvider.amount(hold, "UAH"),
                "SETTLE::" + WayForPayProvider.amount(hold, "UAH"), "CHARGE:SALE:7.00");
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
        assertThat(sent()).containsExactly("CHARGE:AUTH:" + WayForPayProvider.amount(hold, "UAH"),
                "SETTLE::" + WayForPayProvider.amount(hold - 100, "UAH"), "CHARGE:SALE:" + WayForPayProvider.amount(hold - 100, "UAH"));
    }

    /**
     * Audit 29.10.2026: a status check that comes back without a status (here a bad signature, as right after a key
     * change) is not a decline. The charge went through; taking it for declined let staff charge it again.
     */
    @Test
    void aStatusCheckWithoutAStatusLeavesTheChargeUnknownUntilTheBankDescribesIt() {
        Actor rider = riderWithCard();
        OrderView order = heldOrder(rider);
        long hold = order.priceMinor();
        // The capture goes through; the charge of the rest too, but its answer is lost; the first check is an error.
        gateway.next("Approved", "LOST_ANSWER", "REASON:1113");
        tx.executeWithoutResult(s -> internal.startCapture(order.id(), hold + 700, "UAH"));
        settlePayments();
        assertThat(gateway.requests()).filteredOn(r -> "CHECK_STATUS".equals(r.get("transactionType"))).hasSizeGreaterThanOrEqualTo(2);
        assertThat(payments.intent(order.id()).orElseThrow().state()).as("the bank took the rest").isEqualTo("PAID");
        assertThat(clearingFor(order)).isEqualTo(hold + 700);
    }

    /** "Order Not Found" is the one status-less answer that says a charge never reached the bank. */
    @Test
    void aChargeTheBankNeverSawIsDeclinedOnOrderNotFound() {
        Actor rider = riderWithCard();
        OrderView order = heldOrder(rider);
        long hold = order.priceMinor();
        gateway.next("Approved", "TIMEOUT"); // the charge never reaches the bank
        tx.executeWithoutResult(s -> internal.startCapture(order.id(), hold + 700, "UAH"));
        settlePayments();
        assertThat(payments.intent(order.id()).orElseThrow().state()).isEqualTo("PARTIALLY_PAID");
        assertThat(clearingFor(order)).isEqualTo(hold);
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
        assertThat(sent()).contains("CHARGE:SALE:" + WayForPayProvider.amount(hold - 100, "UAH"));
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

    private long clearingFor(OrderView order) {
        return jdbc.sql("""
                        select coalesce(sum(l.debit_minor), 0) from journal_line l
                        join journal_transaction t on t.id = l.transaction_id
                        where t.basis_id = :order and l.account = 'PROVIDER_CLEARING'""")
                .param("order", order.id()).query(Long.class).single();
    }

    private List<UUID> operations(OrderView order, String type) {
        return jdbc.sql("""
                        select o.id from payment_operation o join payment_intent i on i.id = o.intent_id
                        where i.order_id = :order and o.type = :type order by o.created_at""")
                .param("order", order.id()).param("type", type).query(UUID.class).list();
    }

    /**
     * T-24: the capture times out and is sent again, and the provider's answers then come twice — for the capture and
     * for the charge of the rest. One capture, one charge, the money counted once.
     */
    @Test
    void aTimedOutCaptureAndRepeatedAnswersChargeAndCountOnce() {
        Actor rider = riderWithCard();
        OrderView order = heldOrder(rider);
        long hold = order.priceMinor();
        gateway.next("TIMEOUT"); // the capture's answer is lost; it is sent again
        tx.executeWithoutResult(s -> internal.startCapture(order.id(), hold + 700, "UAH"));
        settlePayments();
        assertThat(payments.intent(order.id()).orElseThrow().state()).isEqualTo("PAID");
        long counted = clearingFor(order);
        assertThat(counted).isEqualTo(hold + 700);
        int requests = gateway.requests().size();

        // The same answers again, as a provider repeats its notifications.
        for (String type : List.of("SETTLE", "CHARGE")) {
            for (UUID op : operations(order, type)) {
                tx.executeWithoutResult(s -> internal.apply(op, PaymentProvider.Outcome.SUCCEEDED, "Approved", null,
                        null));
                tx.executeWithoutResult(s -> internal.apply(op, PaymentProvider.Outcome.SUCCEEDED, "Approved", null,
                        null));
            }
        }
        settlePayments();

        assertThat(clearingFor(order)).as("no second settlement in the ledger").isEqualTo(counted);
        assertThat(gateway.requests()).as("no second charge sent").hasSize(requests);
        assertThat(sent()).filteredOn(r -> r.startsWith("CHARGE:SALE")).hasSize(1);
        assertThat(payments.intent(order.id()).orElseThrow().state()).isEqualTo("PAID");
    }

    /** T-25: an answer with an older status after PAID — still in progress, or even declined — changes nothing. */
    @Test
    void anOlderAnswerAfterPaidDoesNotUndoIt() {
        Actor rider = riderWithCard();
        OrderView order = heldOrder(rider);
        long hold = order.priceMinor();
        tx.executeWithoutResult(s -> internal.startCapture(order.id(), hold + 700, "UAH"));
        settlePayments();
        assertThat(payments.intent(order.id()).orElseThrow().state()).isEqualTo("PAID");
        long counted = clearingFor(order);
        String paymentState = orders.get(order.id()).paymentState();

        for (String type : List.of("AUTH", "SETTLE", "CHARGE")) {
            for (UUID op : operations(order, type)) {
                tx.executeWithoutResult(s -> internal.apply(op, PaymentProvider.Outcome.PENDING, "InProcessing", null,
                        null));
                tx.executeWithoutResult(s -> internal.apply(op, PaymentProvider.Outcome.DECLINED, "Declined", "1100",
                        "Old answer"));
                tx.executeWithoutResult(s -> internal.apply(op, PaymentProvider.Outcome.UNKNOWN, null, null, null));
            }
        }
        settlePayments();

        assertThat(payments.intent(order.id()).orElseThrow().state()).isEqualTo("PAID");
        assertThat(orders.get(order.id()).paymentState()).isEqualTo(paymentState);
        assertThat(clearingFor(order)).isEqualTo(counted);
        assertThat(jdbc.sql("""
                        select count(*) from payment_operation o join payment_intent i on i.id = o.intent_id
                        where i.order_id = :order and o.state <> 'SUCCEEDED'""")
                .param("order", order.id()).query(Long.class).single()).as("every operation stays SUCCEEDED")
                .isZero();
    }

    private Actor staffWith(String... permissions) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, all_cities, state, created_at, updated_at)
                        values (:id, :login, 'Finance', 'ADMIN', :permissions, true, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "capture-finance-" + id).param("permissions", permissions).update();
        return new Actor(taxi.blizz.platform.SubjectType.STAFF, id);
    }

    private static void assertCode(org.assertj.core.api.ThrowableAssert.ThrowingCallable call,
                                   taxi.blizz.platform.ErrorCode code) {
        org.assertj.core.api.Assertions.assertThatThrownBy(call)
                .isInstanceOf(taxi.blizz.platform.DomainException.class)
                .extracting(e -> ((taxi.blizz.platform.DomainException) e).code()).isEqualTo(code);
    }

    /** A fare whose rest the card refused: PARTIALLY_PAID, the declined CHARGE returned. */
    private taxi.blizz.payments.PaymentOperations.Operation declinedRest(OrderView order, Actor finance) {
        long hold = order.priceMinor();
        gateway.next("Approved", "Declined");
        tx.executeWithoutResult(s -> internal.startCapture(order.id(), hold + 700, "UAH"));
        settlePayments();
        assertThat(orders.get(order.id()).paymentState()).isEqualTo("PARTIALLY_PAID");
        return paymentOperations.ofOrder(finance, order.id()).stream()
                .filter(o -> o.type().equals("CHARGE") && o.state().equals("DECLINED")).findFirst().orElseThrow();
    }

    private Actor staffIn(UUID city, String... permissions) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, all_cities, city_scope, state,
                                                created_at, updated_at)
                        values (:id, :login, 'Finance', 'ADMIN', :permissions, false, :scope, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "capture-city-" + id).param("permissions", permissions)
                .param("scope", new UUID[] {city}).update();
        return new Actor(taxi.blizz.platform.SubjectType.STAFF, id);
    }

    /** Audit 29.10.2026: finance of another city neither sees nor re-charges a city's card payments. */
    @Test
    void onlyFinanceOfTheOrdersCityRetriesItsCharge() {
        Actor rider = riderWithCard();
        OrderView order = heldOrder(rider);
        String retry = taxi.blizz.payments.PaymentOperations.RETRY_PERMISSION;
        var declined = declinedRest(order, staffWith(retry));
        Actor elsewhere = staffIn(UUID.randomUUID(), retry);
        assertCode(() -> paymentOperations.ofOrder(elsewhere, order.id()), taxi.blizz.platform.ErrorCode.ACCESS_DENIED);
        assertCode(() -> paymentOperations.retry(elsewhere, UUID.randomUUID(), declined.id(), "Bank asked"),
                taxi.blizz.platform.ErrorCode.ACCESS_DENIED);
        Actor here = staffIn(cityId, retry);
        assertThat(paymentOperations.ofOrder(here, order.id())).isNotEmpty();
        assertThat(paymentOperations.retry(here, UUID.randomUUID(), declined.id(), "Bank asked").type())
                .isEqualTo("CHARGE");
        // The retry is sent here, so no later test's scripted answer is taken by it.
        settlePayments();
    }

    /** REQ-PAY-14: a declined charge is retried by hand, once, by someone with the right; it pays the debt. */
    @Test
    void aDeclinedChargeIsRetriedByHandOnceAndPaysTheDebt() {
        Actor rider = riderWithCard();
        OrderView order = heldOrder(rider);
        long hold = order.priceMinor();
        Actor finance = staffWith(taxi.blizz.payments.PaymentOperations.RETRY_PERMISSION);
        Actor other = staffWith("finance.manage");
        var declined = declinedRest(order, finance);
        long clearing = clearingFor(order);
        assertThat(clearing).isEqualTo(hold);

        assertCode(() -> paymentOperations.ofOrder(other, order.id()), taxi.blizz.platform.ErrorCode.ACCESS_DENIED);
        assertCode(() -> paymentOperations.retry(other, UUID.randomUUID(), declined.id(), "x"),
                taxi.blizz.platform.ErrorCode.ACCESS_DENIED);
        assertCode(() -> paymentOperations.retry(finance, UUID.randomUUID(), declined.id(), " "),
                taxi.blizz.platform.ErrorCode.VALIDATION_FAILED);
        UUID settle = operations(order, "SETTLE").getFirst();
        assertCode(() -> paymentOperations.retry(finance, UUID.randomUUID(), settle, "x"),
                taxi.blizz.platform.ErrorCode.STATE_CONFLICT);

        UUID command = UUID.randomUUID();
        var retry = paymentOperations.retry(finance, command, declined.id(), "The rider topped up the card");
        assertThat(retry.retryOf()).isEqualTo(declined.id());
        assertThat(retry.initiatedBy()).isEqualTo(finance.id());
        assertThat(retry.amountMinor()).isEqualTo(700);
        assertThat(paymentOperations.retry(finance, command, declined.id(), "The rider topped up the card").id())
                .as("a repeat of the command").isEqualTo(retry.id());
        assertCode(() -> paymentOperations.retry(finance, UUID.randomUUID(), declined.id(), "again"),
                taxi.blizz.platform.ErrorCode.STATE_CONFLICT);
        assertCode(() -> paymentOperations.retry(finance, UUID.randomUUID(), retry.id(), "too early"),
                taxi.blizz.platform.ErrorCode.PAYMENT_UNKNOWN);

        settlePayments();

        assertThat(payments.intent(order.id()).orElseThrow().state()).isEqualTo("PAID");
        assertThat(orders.get(order.id()).paymentState()).isEqualTo("PAID");
        assertThat(clearingFor(order)).as("the rest is counted once").isEqualTo(hold + 700);
        assertThat(sent()).filteredOn(r -> r.startsWith("CHARGE:SALE")).hasSize(2);
        settlePayments();
        assertThat(clearingFor(order)).isEqualTo(hold + 700);
        assertThat(jdbc.sql("select count(*) from audit_log where action = 'payment.retry' and actor_id = :staff")
                .param("staff", finance.id()).query(Long.class).single()).isEqualTo(1);
        // The order's own CardPaymentSettled / OrderDebtPaid history events never poison the ledger's handlers.
        assertThat(jdbc.sql("select count(*) from outbox where aggregate_id = :order and (attempts > 0 or state = 'FAILED')")
                .param("order", order.id()).query(Long.class).single()).isZero();
    }

    @Test
    void aRetryThatIsDeclinedAgainLeavesTheDebtAndCanBeRetriedItself() {
        Actor rider = riderWithCard();
        OrderView order = heldOrder(rider);
        Actor finance = staffWith(taxi.blizz.payments.PaymentOperations.RETRY_PERMISSION);
        var declined = declinedRest(order, finance);
        long clearing = clearingFor(order);

        gateway.next("Declined");
        var retry = paymentOperations.retry(finance, UUID.randomUUID(), declined.id(), "First try");
        settlePayments();
        assertThat(orders.get(order.id()).paymentState()).isEqualTo("PARTIALLY_PAID");
        assertThat(clearingFor(order)).isEqualTo(clearing);

        var again = paymentOperations.retry(finance, UUID.randomUUID(), retry.id(), "Second try");
        assertThat(again.retryOf()).isEqualTo(retry.id());
        settlePayments();
        assertThat(orders.get(order.id()).paymentState()).isEqualTo("PAID");
        assertThat(clearingFor(order)).isEqualTo(clearing + 700);
    }

    private long systemCases(String sourceKey, String category) {
        return jdbc.sql("""
                        select count(*) from support_case
                        where source_key = :key and category = :category and priority = 'HIGH'""")
                .param("key", sourceKey).param("category", category).query(Long.class).single();
    }

    /** REQ-OPS-06: a card fare left partly unpaid is one case for the dispatchers; a paid one is none. */
    @Test
    void aCardFareLeftPartlyUnpaidBecomesOneCase() {
        Actor finance = staffWith(taxi.blizz.payments.PaymentOperations.RETRY_PERMISSION);
        OrderView partly = heldOrder(riderWithCard());
        declinedRest(partly, finance);
        settlePayments();
        assertThat(systemCases("card-debt:" + partly.id(), "PAYMENT")).isEqualTo(1);

        OrderView paid = heldOrder(riderWithCard());
        tx.executeWithoutResult(s -> internal.startCapture(paid.id(), paid.priceMinor(), "UAH"));
        settlePayments();
        assertThat(payments.intent(paid.id()).orElseThrow().state()).isEqualTo("PAID");
        assertThat(systemCases("card-debt:" + paid.id(), "PAYMENT")).isZero();
    }

    /** REQ-OPS-06: an operation whose result stays unknown past the limit is reported once; a fresh one is not. */
    @Test
    void aResultStillUnknownAfterTheLimitIsReportedOnce() {
        OrderView old = heldOrder(riderWithCard());
        OrderView fresh = heldOrder(riderWithCard());
        UUID oldAuth = operations(old, "AUTH").getFirst();
        UUID freshAuth = operations(fresh, "AUTH").getFirst();
        // The provider never answered (the state set directly: an answer cannot move a finished operation back).
        jdbc.sql("""
                        update payment_operation set state = 'UNKNOWN',
                            created_at = case when id = :old then now() - interval '20 minutes' else now() end
                        where id in (:old, :fresh)""")
                .param("old", oldAuth).param("fresh", freshAuth).update();

        while (unknown.report() > 0) {
            // operations left unknown by other tests are reported too
        }
        assertThat(unknown.report()).as("nothing twice").isZero();
        deliverEvents();

        assertThat(systemCases("payment-unknown:" + oldAuth, "PAYMENT_UNKNOWN")).isEqualTo(1);
        assertThat(systemCases("payment-unknown:" + freshAuth, "PAYMENT_UNKNOWN")).isZero();
        assertThat(jdbc.sql("select count(*) from outbox where event_type = 'PaymentResultUnknown' and payload ->> 'operation_id' = :op")
                .param("op", oldAuth.toString()).query(Long.class).single()).isEqualTo(1);
        // Back to a finished state, so later tests' workers do not ask the fake provider about it.
        jdbc.sql("update payment_operation set state = 'SUCCEEDED' where id in (:old, :fresh)")
                .param("old", oldAuth).param("fresh", freshAuth).update();
    }

    /** REQ-ENG-14: switching card payments off refuses new card orders but never stops a payment already begun. */
    @Test
    void cardPaymentsSwitchedOffRefuseNewCardOrdersButFinishTheOnesBegun() {
        var card = taxi.blizz.configuration.FeatureFlags.Flag.CARD_PAYMENTS;
        Actor admin = staffWith(taxi.blizz.configuration.FeatureFlags.MANAGE_PERMISSION);
        Actor rider = riderWithCard();
        OrderView begun = heldOrder(rider);
        var before = flags.all(admin).stream().filter(s -> s.flag() == card).findFirst().orElseThrow();
        assertThat(before.enabled()).isTrue();
        var off = flags.change(admin, UUID.randomUUID(), card.key(), before.version(), false, "Provider incident");
        try {
            assertThat(flags.enabled(taxi.blizz.identity.Services.DEFAULT_ID, card)).isFalse();
            UUID quote = new TestQuotes(jdbc, quotes).quote(rider, cityId, "STANDARD", PICKUP, DROPOFF).id();
            assertCode(() -> orders.create(rider, UUID.randomUUID(), new CreateOrder(rider.id(), "STANDARD", PICKUP,
                    "Home", DROPOFF, "Work", PaymentMethod.CARD, quote)),
                    taxi.blizz.platform.ErrorCode.PAYMENT_METHOD_NOT_OFFERED);
            UUID cashQuote = new TestQuotes(jdbc, quotes).quote(rider, cityId, "STANDARD", PICKUP, DROPOFF).id();
            OrderView cash = orders.create(rider, UUID.randomUUID(), new CreateOrder(rider.id(), "STANDARD", PICKUP,
                    "Home", DROPOFF, "Work", PaymentMethod.CASH, cashQuote));
            assertThat(cash.paymentMethod()).isEqualTo(PaymentMethod.CASH);
            orders.cancel(rider, UUID.randomUUID(), cash.id(), orders.get(cash.id()).version(), "CHANGED_MIND");

            // The order made before the switch is paid as begun.
            tx.executeWithoutResult(s -> internal.startCapture(begun.id(), begun.priceMinor(), "UAH"));
            settlePayments();
            assertThat(payments.intent(begun.id()).orElseThrow().state()).isEqualTo("PAID");
        } finally {
            flags.change(admin, UUID.randomUUID(), card.key(), off.version(), true, "Incident over");
        }
        assertThat(flags.enabled(taxi.blizz.identity.Services.DEFAULT_ID, card)).isTrue();
    }

    /** REQ-PAY-20, owner decision 28.10.2026: only the rider or an operator switches a card order to cash. */
    @Test
    void theRiderOrAnOperatorSwitchesACardOrderToCashAndTheHoldIsReleased() {
        Actor rider = riderWithCard();
        OrderView order = heldOrder(rider);
        Actor stranger = rides.client();
        assertCode(() -> orders.switchToCash(stranger, UUID.randomUUID(), order.id(), order.version(), null),
                taxi.blizz.platform.ErrorCode.NOT_FOUND);
        long version = orders.get(order.id()).version();
        assertCode(() -> orders.switchToCash(rider, UUID.randomUUID(), order.id(), version + 5, null),
                taxi.blizz.platform.ErrorCode.VERSION_CONFLICT);

        // A hold still being asked about is not released by a switch.
        UUID intent = payments.intent(order.id()).orElseThrow().id();
        jdbc.sql("update payment_intent set state = 'AUTH_PENDING' where id = :id").param("id", intent).update();
        assertCode(() -> orders.switchToCash(rider, UUID.randomUUID(), order.id(), version, null),
                taxi.blizz.platform.ErrorCode.PAYMENT_UNKNOWN);
        jdbc.sql("update payment_intent set state = 'AUTHORIZED' where id = :id").param("id", intent).update();

        UUID command = UUID.randomUUID();
        OrderView cash = orders.switchToCash(rider, command, order.id(), version, null);
        assertThat(cash.paymentMethod()).isEqualTo(PaymentMethod.CASH);
        assertThat(cash.paymentState()).isEqualTo("CASH_EXPECTED");
        assertThat(orders.switchToCash(rider, command, order.id(), version, null).version()).as("a repeat")
                .isEqualTo(cash.version());
        assertCode(() -> orders.switchToCash(rider, UUID.randomUUID(), order.id(), cash.version(), null),
                taxi.blizz.platform.ErrorCode.STATE_CONFLICT);
        settlePayments();
        assertThat(payments.intent(order.id()).orElseThrow().state()).as("the hold is released").isEqualTo("VOIDED");
        assertThat(sent()).anyMatch(r -> r.startsWith("REFUND"));
        assertThat(jdbc.sql("select count(*) from order_event where order_id = :o and type = 'PaymentSwitchedToCash'")
                .param("o", order.id()).query(Long.class).single()).isEqualTo(1);

        // An operator, at the rider's request, with a reason and the right.
        OrderView second = heldOrder(riderWithCard());
        long v2 = orders.get(second.id()).version();
        Actor operator = staffWith(taxi.blizz.operations.Orders.CREATE_PERMISSION);
        assertCode(() -> orders.switchToCash(staffWith("finance.manage"), UUID.randomUUID(), second.id(), v2,
                "Rider asked"), taxi.blizz.platform.ErrorCode.ACCESS_DENIED);
        assertCode(() -> orders.switchToCash(operator, UUID.randomUUID(), second.id(), v2, " "),
                taxi.blizz.platform.ErrorCode.VALIDATION_FAILED);
        assertThat(orders.switchToCash(operator, UUID.randomUUID(), second.id(), v2, "The rider asked by phone")
                .paymentMethod()).isEqualTo(PaymentMethod.CASH);
        assertThat(jdbc.sql("""
                        select count(*) from audit_log where action = 'order.switch_to_cash' and actor_id = :a
                          and reason = 'The rider asked by phone'""")
                .param("a", operator.id()).query(Long.class).single()).isEqualTo(1);
        // Its release goes out now: a later test's scripted provider answers must not meet it.
        settlePayments();
        assertThat(payments.intent(second.id()).orElseThrow().state()).isEqualTo("VOIDED");
    }

    /** Threat model W1: a signed notification about another sum than the operation's is not applied. */
    @Test
    void aNotificationAboutAnotherSumIsNotApplied() {
        OrderView order = heldOrder(riderWithCard());
        String reference = authReference(order);
        String account = jdbc.sql("select account from payment_merchant where id = :id").param("id", merchantId)
                .query(String.class).single();
        Merchant merchant = new Merchant(merchantId, "FAKE", account, "test.blizz.invalid",
                "test-merchant-secret-0123456789", "UAH");
        java.util.function.BiFunction<String, String, java.util.Map<String, Object>> callback = (amount, currency) -> {
            java.util.Map<String, Object> body = new java.util.LinkedHashMap<>();
            body.put("merchantAccount", account);
            body.put("orderReference", reference);
            body.put("amount", amount);
            body.put("currency", currency);
            body.put("authCode", "");
            body.put("cardPan", "41****1111");
            body.put("transactionStatus", "Declined");
            body.put("reasonCode", "1100");
            body.put("merchantSignature", WayForPayProvider.sign(merchant, account, reference, amount, currency, "",
                    "41****1111", "Declined", "1100"));
            return body;
        };
        String outcome = "select outcome from payment_event where reference = :ref order by received_at desc limit 1";

        assertThat(notifications.receive(merchantId, callback.apply("1.00", "UAH")).trusted()).isTrue();
        assertThat(jdbc.sql(outcome).param("ref", reference).query(String.class).single())
                .isEqualTo("OPERATION_AMOUNT_MISMATCH");
        assertThat(notifications.receive(merchantId,
                callback.apply(WayForPayProvider.amount(order.priceMinor(), "PLN"), "PLN")).trusted()).isTrue();
        assertThat(jdbc.sql(outcome).param("ref", reference).query(String.class).single())
                .isEqualTo("OPERATION_AMOUNT_MISMATCH");
        assertThat(payments.intent(order.id()).orElseThrow().state()).as("the hold stands").isEqualTo("AUTHORIZED");
    }
}
