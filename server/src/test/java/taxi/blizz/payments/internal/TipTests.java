package taxi.blizz.payments.internal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

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
import taxi.blizz.finance.DriverBalances;
import taxi.blizz.finance.Ledger;
import taxi.blizz.finance.RiderWallets;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.SessionService;
import taxi.blizz.operations.CreateOrder;
import taxi.blizz.operations.Dispatch;
import taxi.blizz.operations.OrderView;
import taxi.blizz.operations.Orders;
import taxi.blizz.operations.PaymentMethod;
import taxi.blizz.operations.Tips;
import taxi.blizz.operations.TripView;
import taxi.blizz.operations.Trips;
import taxi.blizz.operations.WorkSessions;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.internal.OutboxRelay;
import taxi.blizz.pricing.QuoteService;

/** Tips after the trip (ADR 0012, Q-04): paid the way the order was, all of it to the driver. */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class TipTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, 135.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 135.55);

    @Autowired Orders orders;
    @Autowired Dispatch dispatch;
    @Autowired Trips trips;
    @Autowired WorkSessions sessions;
    @Autowired SessionService auth;
    @Autowired QuoteService quotes;
    @Autowired Tips tips;
    @Autowired RiderWallets wallets;
    @Autowired DriverBalances balances;
    @Autowired Ledger ledger;
    @Autowired PaymentWorker worker;
    @Autowired FakeProvider.Gateway gateway;
    @Autowired OutboxRelay relay;
    @Autowired TransactionTemplate tx;
    @Autowired JdbcClient jdbc;

    TestRides rides;
    UUID cityId;
    UUID merchantId;

    @BeforeEach
    void setUp() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        cityId = rides.city("test-tips", "UAH", 135);
        merchantId = jdbc.sql("select merchant_id from payment_merchant_city where city_id = :city")
                .param("city", cityId).query(UUID.class).optional().orElseGet(() -> {
                    UUID id = UUID.randomUUID();
                    jdbc.sql("""
                                    insert into payment_merchant (id, provider, account, domain, secret_ref, currency,
                                                                  created_at)
                                    values (:id, 'FAKE', :account, 'test.blizz.invalid', 'test', 'UAH', now())""")
                            .param("id", id).param("account", "tips_" + id).update();
                    jdbc.sql("insert into payment_merchant_city (city_id, merchant_id) values (:city, :merchant)")
                            .param("city", cityId).param("merchant", id).update();
                    return id;
                });
        gateway.reset();
        deliverEvents();
    }

    @Test
    void aCashTripTipIsOnlyRecordedOnceAndThePresetsComeFromTheCost() {
        TestRides.Ride ride = cashTrip();
        Tips.Options options = tips.options(ride.payer(), ride.order().id());
        assertThat(options.open()).isTrue();
        assertThat(options.method()).isEqualTo("CASH");
        assertThat(options.minMinor()).isEqualTo(100);
        long cost = options.tripCostMinor();
        assertThat(options.maxMinor()).isEqualTo((cost + 99) / 100 * 100);
        assertThat(options.presets()).extracting(Tips.Preset::percent).containsExactly(10, 15, 20, 25);
        assertThat(options.presets().getFirst().amountMinor()).isEqualTo((cost * 10 + 9_999) / 10_000 * 100);
        long driverBefore = driverBalance(ride.driver().actor());

        UUID command = UUID.randomUUID();
        long amount = options.presets().getFirst().amountMinor();
        Tips.Tip tip = tips.leave(ride.payer(), command, ride.order().id(), amount);
        assertThat(tip.state()).isEqualTo("RECORDED");
        assertThat(tip.method()).isEqualTo("CASH");
        assertThat(tips.leave(ride.payer(), command, ride.order().id(), amount).id()).as("a repeat").isEqualTo(tip.id());
        assertCode(() -> tips.leave(ride.payer(), command, ride.order().id(), amount + 100),
                ErrorCode.IDEMPOTENCY_CONFLICT);
        assertCode(() -> tips.leave(ride.payer(), UUID.randomUUID(), ride.order().id(), amount),
                ErrorCode.STATE_CONFLICT);
        deliverEvents();

        assertThat(published("TipPaid", tip.id())).isEqualTo(1);
        assertThat(driverBalance(ride.driver().actor())).as("cash never passes through the service")
                .isEqualTo(driverBefore);
        Tips.Options after = tips.options(ride.payer(), ride.order().id());
        assertThat(after.open()).isFalse();
        assertThat(after.tip().id()).isEqualTo(tip.id());
    }

    @Test
    void boundsWindowAndOwnership() {
        TestRides.Ride ride = cashTrip();
        long max = tips.options(ride.payer(), ride.order().id()).maxMinor();
        assertCode(() -> tips.leave(ride.payer(), UUID.randomUUID(), ride.order().id(), 99),
                ErrorCode.VALIDATION_FAILED);
        assertCode(() -> tips.leave(ride.payer(), UUID.randomUUID(), ride.order().id(), max + 1),
                ErrorCode.VALIDATION_FAILED);
        assertCode(() -> tips.leave(rides.client(), UUID.randomUUID(), ride.order().id(), 100), ErrorCode.NOT_FOUND);
        assertCode(() -> tips.leave(ride.driver().actor(), UUID.randomUUID(), ride.order().id(), 100),
                ErrorCode.ACCESS_DENIED);

        jdbc.sql("update trip set completed_at = now() - interval '25 hours' where order_id = :order")
                .param("order", ride.order().id()).update();
        assertThat(tips.options(ride.payer(), ride.order().id()).open()).isFalse();
        assertCode(() -> tips.leave(ride.payer(), UUID.randomUUID(), ride.order().id(), 100), ErrorCode.STATE_CONFLICT);
    }

    @Test
    void aCardTipIsChargedToTheSameCardAndGoesToTheDriver() {
        CardTrip trip = cardTrip();
        long driverBefore = driverBalance(trip.driver());
        Tips.Tip tip = tips.leave(trip.rider(), UUID.randomUUID(), trip.orderId(), 1_600);
        assertThat(tip.method()).isEqualTo("CARD");
        settlePayments();

        assertThat(tips.options(trip.rider(), trip.orderId()).tip().state()).isEqualTo("PAID");
        assertThat(sent()).contains("CHARGE:SALE:16.00");
        assertThat(driverBalance(trip.driver()) - driverBefore).isEqualTo(1_600);
        assertThat(balances.mine(trip.driver(), 20).entries())
                .anySatisfy(e -> {
                    assertThat(e.kind()).isEqualTo("TIP");
                    assertThat(e.amountMinor()).isEqualTo(1_600);
                    assertThat(e.orderId()).isEqualTo(trip.orderId());
                });
    }

    @Test
    void aDeclinedCardTipFailsAndMayBeLeftAgain() {
        CardTrip trip = cardTrip();
        gateway.next("Declined");
        Tips.Tip first = tips.leave(trip.rider(), UUID.randomUUID(), trip.orderId(), 500);
        settlePayments();
        Tips.Options options = tips.options(trip.rider(), trip.orderId());
        assertThat(options.tip()).isNull();
        assertThat(options.open()).isTrue();
        assertThat(jdbc.sql("select state from order_tip where id = :id").param("id", first.id())
                .query(String.class).single()).isEqualTo("FAILED");

        tips.leave(trip.rider(), UUID.randomUUID(), trip.orderId(), 500);
        settlePayments();
        assertThat(tips.options(trip.rider(), trip.orderId()).tip().state()).isEqualTo("PAID");
    }

    @Test
    void aTripPaidWithBonusesIsTippedFromTheBonusAccountWhenItHasEnough() {
        TestRides.Ride ride = cashTrip();
        long cost = tips.options(ride.payer(), ride.order().id()).tripCostMinor();
        jdbc.sql("update ride_order set wallet_minor = :cost where id = :order")
                .param("cost", cost).param("order", ride.order().id()).update();
        giveBonuses(ride.payer(), 1_000);
        long driverBefore = driverBalance(ride.driver().actor());

        assertThat(tips.options(ride.payer(), ride.order().id()).method()).isEqualTo("WALLET");
        Tips.Tip tip = tips.leave(ride.payer(), UUID.randomUUID(), ride.order().id(), 1_000);
        assertThat(tip.method()).isEqualTo("WALLET");
        assertThat(tip.state()).isEqualTo("PAID");
        deliverEvents();
        assertThat(wallets.available(ride.payer().id(), "UAH")).isZero();
        assertThat(driverBalance(ride.driver().actor()) - driverBefore).isEqualTo(1_000);
        assertThat(wallets.mine(ride.payer(), 10).entries())
                .anySatisfy(e -> assertThat(e.kind()).isEqualTo("TIP"));
    }

    @Test
    void withoutEnoughBonusesTheTipFallsBackToTheOrdersOwnMethod() {
        TestRides.Ride ride = cashTrip();
        long cost = tips.options(ride.payer(), ride.order().id()).tripCostMinor();
        jdbc.sql("update ride_order set wallet_minor = :cost where id = :order")
                .param("cost", cost).param("order", ride.order().id()).update();
        giveBonuses(ride.payer(), 300);

        Tips.Tip tip = tips.leave(ride.payer(), UUID.randomUUID(), ride.order().id(), 500);
        assertThat(tip.method()).isEqualTo("CASH");
        assertThat(tip.state()).isEqualTo("RECORDED");
        assertThat(wallets.available(ride.payer().id(), "UAH")).isEqualTo(300);
    }

    // ---------------------------------------------------------------- helpers

    private TestRides.Ride cashTrip() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        TestRides.Ride ride = rides.started(cityId, driver, PICKUP, DROPOFF);
        rides.complete(ride, true);
        deliverEvents();
        return ride;
    }

    record CardTrip(Actor rider, Actor driver, UUID orderId) {
    }

    private CardTrip cardTrip() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        Actor rider = rides.client();
        jdbc.sql("""
                        insert into payment_card (id, client_id, merchant_id, token, masked_pan, card_type, state,
                                                  created_at)
                        values (:id, :client, :merchant, :token, '41****1111', 'Visa', 'ACTIVE', now())""")
                .param("id", UUID.randomUUID()).param("client", rider.id()).param("merchant", merchantId)
                .param("token", "tok-" + rider.id()).update();
        UUID quote = new TestQuotes(jdbc, quotes).quote(rider, cityId, "STANDARD", PICKUP, DROPOFF).id();
        OrderView order = orders.create(rider, UUID.randomUUID(), new CreateOrder(rider.id(), "STANDARD", PICKUP,
                "Home", DROPOFF, "Work", PaymentMethod.CARD, quote));
        deliverEvents();
        dispatch.accept(driver.actor(), UUID.randomUUID(), dispatch.offers(driver.actor()).getFirst().id());
        TripView trip = trips.current(driver.actor()).orElseThrow();
        rides.moveTo(driver, TestRides.north(PICKUP, 20));
        TripView waiting = trips.arrive(driver.actor(), UUID.randomUUID(), trip.id(), trip.version(), null);
        TripView started = trips.start(driver.actor(), UUID.randomUUID(), waiting.id(), waiting.version(), null);
        trips.complete(driver.actor(), UUID.randomUUID(), started.id(), started.version(), OffsetDateTime.now(), null);
        deliverEvents();
        settlePayments();
        gateway.reset();
        return new CardTrip(rider, driver.actor(), order.id());
    }

    private void giveBonuses(Actor rider, long amountMinor) {
        tx.executeWithoutResult(s -> ledger.post(new Ledger.Posting("test-bonus:" + UUID.randomUUID(), "PROMOTION",
                UUID.randomUUID(), "UAH", "Test bonuses",
                List.of(Ledger.Line.debit(Ledger.Account.PROMO_EXPENSE, null, amountMinor),
                        Ledger.Line.credit(Ledger.Account.RIDER_WALLET, rider.id(), amountMinor)))));
    }

    private long driverBalance(Actor driver) {
        return balances.mine(driver, 1).balances().stream().filter(b -> b.currency().equals("UAH"))
                .mapToLong(DriverBalances.Balance::balanceMinor).sum();
    }

    private long published(String type, UUID aggregateId) {
        return jdbc.sql("select count(*) from outbox where event_type = :type and aggregate_id = :id")
                .param("type", type).param("id", aggregateId).query(Long.class).single();
    }

    private List<String> sent() {
        return gateway.requests().stream().map(r -> r.get("transactionType") + ":" + r.getOrDefault(
                "merchantTransactionType", "") + ":" + r.get("amount")).toList();
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
            deliverEvents();
        }
    }

    private static void assertCode(Runnable call, ErrorCode code) {
        assertThatThrownBy(call::run).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }
}
