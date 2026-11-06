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
    @Autowired taxi.blizz.refunds.internal.RefundTimer timer;
    @Autowired taxi.blizz.finance.internal.BonusExpiry expiry;
    @Autowired taxi.blizz.finance.Ledger ledger;

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
        assertThat(jdbc.sql("select reason from journal_transaction where business_key = :k")
                .param("k", "refund:" + refund.id()).query(String.class).single())
                .as("the driver reads the reason in words").isIn("Длинный маршрут", "Довгий маршрут");
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

    // ------------------------------------------------------------ part 3: notices, problem queue, timer

    @Test
    void aDoneRefundTellsTheRiderAndTheDriverWhoBearsIt() {
        Ride cash = cashRide();
        Refunds.Refund bonus = refunds.request(staff("SUPER_ADMIN"), UUID.randomUUID(), new Refunds.Request(
                cash.orderId(), 1000, "BONUSES", true, "RUDE_DRIVER", null, null)).refund();
        Ride card = cardRide();
        Refunds.Refund money = refunds.request(staff("SUPER_ADMIN"), UUID.randomUUID(), new Refunds.Request(
                card.orderId(), 1000, "CARD", false, "DOUBLE_CHARGE", null, null)).refund();
        payments.settle();

        assertThat(pushes(cash)).containsExactlyInAnyOrder("CLIENT:rider.refund-bonuses",
                "DRIVER:driver.refund-charge");
        assertThat(pushes(card)).as("nobody else bears a double charge").containsExactly("CLIENT:rider.refund-card");
        assertThat(state(bonus)).isEqualTo("SUCCEEDED");
        assertThat(state(money)).isEqualTo("SUCCEEDED");
    }

    @Test
    void aFailedRefundGoesToTheProblemQueueAndTheRiderIsNotTold() {
        Ride ride = cardRide();
        payments.next("Declined");
        Refunds.Refund refund = refunds.request(staff("SUPER_ADMIN"), UUID.randomUUID(), new Refunds.Request(
                ride.orderId(), 1000, "CARD", false, "GOODWILL", null, null)).refund();
        payments.settle();

        assertThat(caseOf("refund-failed:" + refund.id())).isEqualTo("PAYMENT:HIGH");
        assertThat(pushes(ride)).isEmpty();
    }

    @Test
    void aWaitingRequestRemindsOnceAfterFourHoursAndClosesAfterSevenDays() {
        Ride ride = cashRide();
        Actor admin = staff("ADMIN", Refunds.CREATE_PERMISSION);
        refunds.setLimit(staff("SUPER_ADMIN"), UUID.randomUUID(), admin.id(), "UAH", 5000, 9000, 0, "Test");
        Refunds.Refund fresh = refunds.request(admin, UUID.randomUUID(), new Refunds.Request(ride.orderId(), 1000,
                "BONUSES", true, "GOODWILL", null, null)).refund();
        Refunds.Refund waiting = refunds.request(admin, UUID.randomUUID(), new Refunds.Request(ride.orderId(), 1000,
                "BONUSES", true, "GOODWILL", null, null)).refund();
        Refunds.Refund old = refunds.request(admin, UUID.randomUUID(), new Refunds.Request(ride.orderId(), 1000,
                "BONUSES", true, "GOODWILL", null, null)).refund();
        requestedAgo(fresh, "3 hours 50 minutes");
        requestedAgo(waiting, "4 hours 10 minutes");
        requestedAgo(old, "7 days 1 minute");

        timer.runOnce();
        timer.runOnce();
        payments.settle();

        assertThat(state(fresh)).isEqualTo("REQUESTED");
        assertThat(caseOf("refund-waiting:" + fresh.id())).isNull();
        assertThat(state(waiting)).isEqualTo("REQUESTED");
        assertThat(caseOf("refund-waiting:" + waiting.id())).isEqualTo("PAYMENT:NORMAL");
        assertThat(count("select count(*) from outbox where event_type = 'RefundWaiting' and aggregate_id = :id",
                waiting.id())).as("once").isEqualTo(1);
        assertThat(state(old)).isEqualTo("NOT_REVIEWED");
        assertThat(lines(old)).isEmpty();
        assertThat(refunds.refundable(admin, ride.orderId()).refundedMinor()).as("the closed one frees its sum")
                .isEqualTo(2000);
    }

    @Test
    void theRemindingAndClosingTermsAreTheServicesSettings() {
        taxi.blizz.configuration.ServiceSettings settings = context.getBean(
                taxi.blizz.configuration.ServiceSettings.class);
        Actor superAdmin = staff("SUPER_ADMIN");
        taxi.blizz.configuration.ServiceSettings.Version before = settings.current();
        taxi.blizz.configuration.ServiceSettings.Settings s = before.settings();
        taxi.blizz.configuration.ServiceSettings.Refunds r = s.refunds();
        taxi.blizz.configuration.ServiceSettings.Version changed = settings.change(superAdmin, UUID.randomUUID(),
                before.version(), new taxi.blizz.configuration.ServiceSettings.Settings(s.brand(), s.languages(),
                        s.calls(), s.preorders(), s.ratings(), s.tips(), s.orders(), s.cashNotReceived(),
                        s.appVersions(), s.staffTopUps(), s.riderDebts(), s.driverDiscipline(), s.offerDiscipline(),
                        s.pickupTime(), s.cancellationFault(), new taxi.blizz.configuration.ServiceSettings.Refunds(
                                r.minimumMinor(), r.defaultPerRefundMinor(), r.defaultDailyMinor(),
                                r.riderWarningCount(), r.riderWarningDays(), r.staffDays(), r.superAdminDays(),
                                r.refundTips(), r.cardForCash(), r.showReasonToRider(), 2, 1, 0)), "Test #512");
        try {
            Ride ride = cashRide();
            Actor admin = staff("ADMIN", Refunds.CREATE_PERMISSION);
            refunds.setLimit(superAdmin, UUID.randomUUID(), admin.id(), "UAH", 5000, 9000, 0, "Test");
            Refunds.Refund reminded = refunds.request(admin, UUID.randomUUID(), new Refunds.Request(ride.orderId(),
                    1000, "BONUSES", true, "GOODWILL", null, null)).refund();
            Refunds.Refund closed = refunds.request(admin, UUID.randomUUID(), new Refunds.Request(ride.orderId(),
                    1000, "BONUSES", true, "GOODWILL", null, null)).refund();
            requestedAgo(reminded, "2 hours 1 minute");
            requestedAgo(closed, "1 day 1 minute");

            timer.runOnce();

            assertThat(count("select count(*) from outbox where event_type = 'RefundWaiting' and aggregate_id = :id",
                    reminded.id())).isEqualTo(1);
            assertThat(state(closed)).isEqualTo("NOT_REVIEWED");
        } finally {
            settings.change(superAdmin, UUID.randomUUID(), changed.version(), s, "Back after the test");
        }
    }

    // ------------------------------------------------------------ refund bonuses end (owner, 06.11.2026)

    @Test
    void refundBonusesLast180DaysAndWhatIsLeftBurnsAfterTheBonusesThatNeverEndAreKept() {
        Ride ride = cashRide();
        UUID rider = ride.ride().payer().id();
        credit(rider, 500, "forever-" + UUID.randomUUID());
        Refunds.Refund refund = refunds.request(staff("SUPER_ADMIN"), UUID.randomUUID(), new Refunds.Request(
                ride.orderId(), 1000, "BONUSES", true, "GOODWILL", null, null)).refund();
        payments.settle();
        Map<String, Object> lot = jdbc.sql("""
                        select amount_minor, round(extract(epoch from expires_at - granted_at) / 86400)::int as days
                        from rider_bonus_lot where credit_key = :k""")
                .param("k", "refund:" + refund.id()).query().singleRow();
        assertThat(lot).containsEntry("amount_minor", 1000L).containsEntry("days", 180);
        assertThat(wallets.mine(ride.ride().payer(), 10).expiring()).singleElement()
                .satisfies(e -> assertThat(e.amountMinor()).isEqualTo(1000));

        spend(rider, 700);
        assertThat(wallets.mine(ride.ride().payer(), 10).expiring()).as("spent from the lot first").singleElement()
                .satisfies(e -> assertThat(e.amountMinor()).isEqualTo(300));
        long before = wallets.available(rider, "UAH");
        endLots(rider);
        expiry.runOnce();
        expiry.runOnce();

        assertThat(wallets.available(rider, "UAH")).as("300 burnt, the 500 that never end kept")
                .isEqualTo(before - 300);
        assertThat(jdbc.sql("select expired_minor from rider_bonus_lot where credit_key = :k")
                .param("k", "refund:" + refund.id()).query(Long.class).single()).isEqualTo(300);
        assertThat(wallets.mine(ride.ride().payer(), 10).expiring()).isEmpty();
        assertThat(wallets.mine(ride.ride().payer(), 10).entries()).extracting(taxi.blizz.finance.RiderWallets.Entry::kind)
                .contains("REFUND", "BONUS_EXPIRED");
    }

    @Test
    void bonusesHeldForAnOrderDoNotBurn() {
        Ride ride = cashRide();
        UUID rider = ride.ride().payer().id();
        refunds.request(staff("SUPER_ADMIN"), UUID.randomUUID(), new Refunds.Request(ride.orderId(), 1000,
                "BONUSES", true, "GOODWILL", null, null));
        payments.settle();
        tx.executeWithoutResult(s -> wallets.reserve(rider, ride.orderId(), "UAH", 800));
        long free = wallets.available(rider, "UAH");
        endLots(rider);

        expiry.runOnce();

        assertThat(wallets.available(rider, "UAH")).as("only the free part burns").isEqualTo(0);
        assertThat(jdbc.sql("select max(expired_minor) from rider_bonus_lot where client_id = :c")
                .param("c", rider).query(Long.class).single()).isEqualTo(free);
    }

    @Test
    void withNoTermRefundBonusesNeverEnd() {
        taxi.blizz.configuration.ServiceSettings settings = context.getBean(
                taxi.blizz.configuration.ServiceSettings.class);
        Actor superAdmin = staff("SUPER_ADMIN");
        taxi.blizz.configuration.ServiceSettings.Version before = settings.current();
        taxi.blizz.configuration.ServiceSettings.Settings s = before.settings();
        taxi.blizz.configuration.ServiceSettings.Refunds r = s.refunds();
        taxi.blizz.configuration.ServiceSettings.Version changed = settings.change(superAdmin, UUID.randomUUID(),
                before.version(), new taxi.blizz.configuration.ServiceSettings.Settings(s.brand(), s.languages(),
                        s.calls(), s.preorders(), s.ratings(), s.tips(), s.orders(), s.cashNotReceived(),
                        s.appVersions(), s.staffTopUps(), s.riderDebts(), s.driverDiscipline(), s.offerDiscipline(),
                        s.pickupTime(), s.cancellationFault(), new taxi.blizz.configuration.ServiceSettings.Refunds(
                                r.minimumMinor(), r.defaultPerRefundMinor(), r.defaultDailyMinor(),
                                r.riderWarningCount(), r.riderWarningDays(), r.staffDays(), r.superAdminDays(),
                                r.refundTips(), r.cardForCash(), r.showReasonToRider(), r.reminderHours(),
                                r.closeAfterDays(), 0)), "Test: no term");
        try {
            Ride ride = cashRide();
            Refunds.Refund refund = refunds.request(superAdmin, UUID.randomUUID(), new Refunds.Request(
                    ride.orderId(), 1000, "BONUSES", true, "GOODWILL", null, null)).refund();
            payments.settle();
            assertThat(state(refund)).isEqualTo("SUCCEEDED");
            assertThat(count("select count(*) from rider_bonus_lot where credit_key = 'refund:' || :id",
                    refund.id().toString())).isZero();
        } finally {
            settings.change(superAdmin, UUID.randomUUID(), changed.version(), s, "Back after the test");
        }
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

    private List<String> pushes(Ride ride) {
        return jdbc.sql("""
                        select recipient_type || ':' || template from notification
                        where data ->> 'order_id' = :o and template like '%refund%'""")
                .param("o", ride.orderId().toString()).query(String.class).list();
    }

    private String caseOf(String sourceKey) {
        return jdbc.sql("select category || ':' || priority from support_case where source_key = :k")
                .param("k", sourceKey).query(String.class).optional().orElse(null);
    }

    private void requestedAgo(Refunds.Refund refund, String interval) {
        jdbc.sql("update refund set requested_at = now() - cast(:i as interval) where id = :id")
                .param("i", interval).param("id", refund.id()).update();
    }

    /** Bonuses that never end, from a promotion-like credit. */
    private void credit(UUID rider, long amount, String key) {
        tx.executeWithoutResult(st -> {
            wallets.open(rider, "UAH");
            ledger.post(new taxi.blizz.finance.Ledger.Posting(key, "PROMOTION", rider, "UAH", "Test bonuses",
                    List.of(taxi.blizz.finance.Ledger.Line.debit(taxi.blizz.finance.Ledger.Account.PROMO_EXPENSE,
                                    null, amount),
                            taxi.blizz.finance.Ledger.Line.credit(taxi.blizz.finance.Ledger.Account.RIDER_WALLET,
                                    rider, amount))));
        });
    }

    /** A spending of bonuses, as a ride paid with them. */
    private void spend(UUID rider, long amount) {
        tx.executeWithoutResult(st -> ledger.post(new taxi.blizz.finance.Ledger.Posting("test-spend:" + UUID.randomUUID(),
                "TRIP_PAYMENT", UUID.randomUUID(), "UAH", "Test ride",
                List.of(taxi.blizz.finance.Ledger.Line.debit(taxi.blizz.finance.Ledger.Account.RIDER_WALLET, rider,
                                amount),
                        taxi.blizz.finance.Ledger.Line.credit(taxi.blizz.finance.Ledger.Account.RIDER_RECEIVABLE,
                                rider, amount)))));
    }

    private void endLots(UUID rider) {
        jdbc.sql("update rider_bonus_lot set expires_at = now() - interval '1 minute' where client_id = :c")
                .param("c", rider).update();
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
