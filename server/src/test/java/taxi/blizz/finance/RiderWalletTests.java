package taxi.blizz.finance;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.UUID;
import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.identity.SessionService;
import taxi.blizz.TestQuotes;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.operations.CreateOrder;
import taxi.blizz.operations.Dispatch;
import taxi.blizz.operations.OrderView;
import taxi.blizz.operations.PaymentMethod;
import taxi.blizz.operations.TripView;
import taxi.blizz.platform.internal.OutboxRelay;
import taxi.blizz.operations.Orders;
import taxi.blizz.operations.Trips;
import taxi.blizz.operations.WorkSessions;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.pricing.QuoteService;

/** The rider's virtual account, part A of ADR 0009: history, balance and top-ups by staff. */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class RiderWalletTests {

    @Autowired
    RiderWallets wallets;
    @Autowired
    Ledger ledger;
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
    JdbcClient jdbc;
    @Autowired
    OutboxRelay relay;

    static final GeoPoint PICKUP = new GeoPoint(-39.5, 0.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 0.55);
    UUID cityId;

    TestRides rides;
    Actor admin;

    @BeforeEach
    void setUp() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        cityId = rides.city("test-rider-wallets", "UAH", 0);
        admin = staff(RiderWallets.MANAGE_PERMISSION);
    }

    private Actor staff(String... permissions) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, state, created_at, updated_at)
                        values (:id, :login, 'Wallets', 'ADMIN', :permissions, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "wallets-" + id).param("permissions", permissions).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private static void assertCode(ThrowingCallable call, ErrorCode code) {
        assertThatThrownBy(call).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }

    @Test
    void staffTopUpAppearsInTheBalanceTheHistoryAndTheJournalOnce() {
        Actor rider = rides.client();
        UUID command = UUID.randomUUID();
        RiderWallets.Wallet after = wallets.topUp(admin, command, rider.id(), "UAH", 15_000, "Компенсація за затримку");
        wallets.topUp(admin, command, rider.id(), "UAH", 15_000, "Компенсація за затримку"); // a repeat

        assertThat(after.balances()).containsExactly(new RiderWallets.Balance("UAH", 15_000, 0, 15_000));
        RiderWallets.Wallet mine = wallets.mine(rider, 10);
        assertThat(mine.balances()).containsExactly(new RiderWallets.Balance("UAH", 15_000, 0, 15_000));
        assertThat(mine.entries()).singleElement().satisfies(e -> {
            assertThat(e.kind()).isEqualTo("STAFF_TOP_UP");
            assertThat(e.amountMinor()).isEqualTo(15_000);
            assertThat(e.staffId()).isEqualTo(admin.id());
            assertThat(e.reason()).isEqualTo("Компенсація за затримку");
        });
        assertThat(jdbc.sql("""
                        select count(*) from audit_log where action = 'wallet.topUp' and resource_id = :id""")
                .param("id", rider.id().toString()).query(Long.class).single()).isEqualTo(1);
        assertCode(() -> wallets.topUp(admin, command, rider.id(), "UAH", 20_000, "Компенсація за затримку"),
                ErrorCode.IDEMPOTENCY_CONFLICT);

        wallets.topUp(admin, UUID.randomUUID(), rider.id(), "UAH", 500, "Акція до дня міста");
        assertThat(wallets.of(admin, rider.id(), 10).entries()).extracting(RiderWallets.Entry::amountMinor)
                .containsExactly(500L, 15_000L);
        assertThat(ledger.balances(Ledger.Account.RIDER_WALLET, rider.id())).singleElement()
                .satisfies(b -> assertThat(b.creditMinor() - b.debitMinor()).isEqualTo(15_500));
    }

    @Test
    void theRightsTheRiderAndTheInputAreChecked() {
        Actor rider = rides.client();
        String phone = jdbc.sql("select phone_normalized from client where id = :id").param("id", rider.id())
                .query(String.class).single();
        assertThat(wallets.clientByPhone(admin, phone)).isEqualTo(rider.id());
        assertCode(() -> wallets.clientByPhone(admin, "+380000000000"), ErrorCode.NOT_FOUND);
        assertCode(() -> wallets.clientByPhone(admin, "call me"), ErrorCode.VALIDATION_FAILED);

        Actor clerk = staff("orders.view");
        assertCode(() -> wallets.of(clerk, rider.id(), 10), ErrorCode.ACCESS_DENIED);
        assertCode(() -> wallets.topUp(clerk, UUID.randomUUID(), rider.id(), "UAH", 100, "x"), ErrorCode.ACCESS_DENIED);
        assertCode(() -> wallets.topUp(admin, UUID.randomUUID(), rider.id(), "XYZ", 100, "x"),
                ErrorCode.VALIDATION_FAILED);
        assertCode(() -> wallets.topUp(admin, UUID.randomUUID(), rider.id(), "UAH", 0, "x"),
                ErrorCode.VALIDATION_FAILED);
        assertCode(() -> wallets.topUp(admin, UUID.randomUUID(), rider.id(), "UAH", 100, " "),
                ErrorCode.VALIDATION_FAILED);
        assertCode(() -> wallets.topUp(admin, UUID.randomUUID(), UUID.randomUUID(), "UAH", 100, "x"),
                ErrorCode.NOT_FOUND);
        assertCode(() -> wallets.mine(admin, 10), ErrorCode.ACCESS_DENIED);
        assertThat(wallets.mine(rider, 10).balances()).isEmpty();
    }

    private void deliverEvents() {
        while (relay.runOnce() > 0) {
            // drain
        }
    }

    private OrderView orderWithBonuses(Actor rider, PaymentMethod method, long bonuses) {
        UUID quote = new TestQuotes(jdbc, quotes).quote(rider, cityId, "STANDARD", PICKUP, DROPOFF).id();
        return orders.create(rider, UUID.randomUUID(), new CreateOrder(rider.id(), "STANDARD", PICKUP, "Home",
                DROPOFF, "Work", method, quote, null, null, null, null, false, bonuses));
    }

    private long net(Ledger.Account account, UUID party) {
        return ledger.balances(account, party).stream().filter(b -> b.currency().equals("UAH"))
                .mapToLong(b -> b.debitMinor() - b.creditMinor()).sum();
    }

    @Test
    void bonusesPayPartOfACashTripAndTheDriverCollectsTheRest() {
        deliverEvents();
        Actor rider = rides.client();
        wallets.topUp(admin, UUID.randomUUID(), rider.id(), "UAH", 5_000, "Welcome bonus");
        TestRides.Driver driver = rides.driverNear(PICKUP);

        OrderView order = orderWithBonuses(rider, PaymentMethod.CASH, 3_000);
        assertThat(order.walletMinor()).isEqualTo(3_000);
        assertThat(wallets.mine(rider, 10).balances()).singleElement()
                .isEqualTo(new RiderWallets.Balance("UAH", 5_000, 3_000, 2_000));
        assertCode(() -> orderWithBonuses(rides.client(), PaymentMethod.CASH, 1), ErrorCode.WALLET_INSUFFICIENT);

        dispatch.accept(driver.actor(), UUID.randomUUID(), dispatch.offers(driver.actor()).getFirst().id());
        TripView trip = trips.current(driver.actor()).orElseThrow();
        assertThat(trip.walletMinor()).isEqualTo(3_000);
        rides.moveTo(driver, TestRides.north(PICKUP, 30));
        TripView waiting = trips.arrive(driver.actor(), UUID.randomUUID(), trip.id(), trip.version(), null);
        TripView started = trips.start(driver.actor(), UUID.randomUUID(), waiting.id(), waiting.version(), null);
        trips.complete(driver.actor(), UUID.randomUUID(), started.id(), started.version(),
                java.time.OffsetDateTime.now(), true);
        deliverEvents();
        deliverEvents();

        long fare = orders.get(order.id()).finalPriceMinor();
        RiderWallets.Wallet after = wallets.mine(rider, 10);
        assertThat(after.balances()).singleElement().isEqualTo(new RiderWallets.Balance("UAH", 2_000, 0, 2_000));
        assertThat(after.entries().getFirst()).satisfies(e -> {
            assertThat(e.kind()).isEqualTo("TRIP_PAYMENT");
            assertThat(e.amountMinor()).isEqualTo(-3_000);
            assertThat(e.orderId()).isEqualTo(order.id());
        });
        assertThat(net(Ledger.Account.RIDER_RECEIVABLE, rider.id())).as("the fare is fully paid").isZero();
        long commission = jdbc.sql("select commission_minor from final_fare where order_id = :id")
                .param("id", order.id()).query(Long.class).single();
        assertThat(net(Ledger.Account.DRIVER_PAYABLE, driver.actor().id()))
                .as("the driver collected fare - 3000 in cash and owes the commission; the service owes the bonuses")
                .isEqualTo(commission - 3_000);
        assertThat(fare).isGreaterThan(3_000);
    }

    @Test
    void aNoShowGivesTheBonusesBack() {
        deliverEvents();
        Actor rider = rides.client();
        wallets.topUp(admin, UUID.randomUUID(), rider.id(), "UAH", 5_000, "Welcome bonus");
        TestRides.Driver driver = rides.driverNear(PICKUP);
        OrderView order = orderWithBonuses(rider, PaymentMethod.CASH, 3_000);
        dispatch.accept(driver.actor(), UUID.randomUUID(), dispatch.offers(driver.actor()).getFirst().id());
        TripView trip = trips.current(driver.actor()).orElseThrow();
        rides.moveTo(driver, TestRides.north(PICKUP, 30));
        TripView waiting = trips.arrive(driver.actor(), UUID.randomUUID(), trip.id(), trip.version(), null);
        jdbc.sql("update trip set arrived_at = arrived_at - interval '30 minutes' where id = :id")
                .param("id", waiting.id()).update();
        trips.reportNoShow(driver.actor(), UUID.randomUUID(), waiting.id(), waiting.version());
        deliverEvents();

        assertThat(orders.get(order.id()).status()).isEqualTo("CANCELLED");
        assertThat(wallets.mine(rider, 10).balances()).as("the reservation is released (review of 28.10.2026)")
                .singleElement().isEqualTo(new RiderWallets.Balance("UAH", 5_000, 0, 5_000));
    }

    @Test
    void aCancelledOrderGivesTheBonusesBackAndTheyNeverPayMoreThanThePrice() {
        deliverEvents();
        Actor rider = rides.client();
        wallets.topUp(admin, UUID.randomUUID(), rider.id(), "UAH", 9_000_000, "Big bonus");
        OrderView order = orderWithBonuses(rider, PaymentMethod.CARD, 9_000_000);
        assertThat(order.walletMinor()).as("at most the price").isEqualTo(order.priceMinor());
        assertThat(order.paymentMethod()).as("nothing left for the card").isEqualTo(PaymentMethod.CASH);
        assertThat(wallets.mine(rider, 10).balances().getFirst().reservedMinor()).isEqualTo(order.priceMinor());

        orders.cancel(rider, UUID.randomUUID(), order.id(), orders.get(order.id()).version(), "CHANGED_MIND");
        deliverEvents();
        assertThat(wallets.mine(rider, 10).balances()).singleElement()
                .isEqualTo(new RiderWallets.Balance("UAH", 9_000_000, 0, 9_000_000));

    }
}
