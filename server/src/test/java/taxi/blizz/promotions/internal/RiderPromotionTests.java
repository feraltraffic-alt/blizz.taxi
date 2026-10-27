package taxi.blizz.promotions.internal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.TestQuotes;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.finance.Ledger;
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
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.platform.internal.OutboxRelay;
import taxi.blizz.pricing.QuoteService;
import taxi.blizz.promotions.RiderPromotions;
import taxi.blizz.promotions.RiderPromotions.Conditions;
import taxi.blizz.promotions.RiderPromotions.Draft;
import taxi.blizz.promotions.RiderPromotions.Kind;
import taxi.blizz.promotions.RiderPromotions.ValueType;

/** Promotions for riders (ADR 0009 p. 4–7): discounts in the quote, bonuses after the trip, conditions. */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class RiderPromotionTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, 3.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 3.55);

    @Autowired
    RiderPromotions promotions;
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
    OutboxRelay relay;
    @Autowired
    JdbcClient jdbc;

    TestRides rides;
    UUID cityId;
    Actor admin;

    @BeforeEach
    void setUp() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        cityId = rides.city("test-rider-promotions", "UAH", 3);
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, state, created_at, updated_at)
                        values (:id, :login, 'Marketing', 'ADMIN', :permissions, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "promotions-" + id)
                .param("permissions", new String[] {RiderPromotions.MANAGE_PERMISSION}).update();
        admin = new Actor(SubjectType.STAFF, id);
        deliverEvents();
    }

    /** Promotions are global: none of this class may stay active for other tests. */
    @AfterEach
    void archiveAll() {
        for (RiderPromotions.Promotion p : promotions.list(admin, false)) {
            if (cityId.equals(p.conditions().cityId())) {
                promotions.archive(admin, UUID.randomUUID(), p.id(), p.version(), "test clean-up");
            }
        }
    }

    private void deliverEvents() {
        while (relay.runOnce() > 0) {
            // drain
        }
    }

    private Conditions inCity() {
        return new Conditions(cityId, null, null, null, null, null, null, null, null, null);
    }

    private RiderPromotions.Promotion create(String name, Kind kind, ValueType type, long value, Conditions c) {
        return promotions.create(admin, UUID.randomUUID(),
                new Draft(name, kind, type, value, type == ValueType.FIXED ? "UAH" : null, c), "test");
    }

    private QuoteService.Quote quote(Actor rider) {
        return new TestQuotes(jdbc, quotes).quote(rider, cityId, "STANDARD", PICKUP, DROPOFF);
    }

    /** One driver per test: after a ride the driver is the nearest free one again. */
    TestRides.Driver driver;

    private OrderView rideToTheEnd(Actor rider, QuoteService.Quote quote) {
        if (driver == null) {
            driver = rides.driverNear(PICKUP);
        }
        rides.moveTo(driver, TestRides.north(PICKUP, 1000));
        OrderView order = orders.create(rider, UUID.randomUUID(), new CreateOrder(rider.id(), "STANDARD", PICKUP,
                "Home", DROPOFF, "Work", PaymentMethod.CASH, quote.id()));
        dispatch.accept(driver.actor(), UUID.randomUUID(), dispatch.offers(driver.actor()).getFirst().id());
        TripView trip = trips.current(driver.actor()).orElseThrow();
        rides.moveTo(driver, TestRides.north(PICKUP, 30));
        TripView waiting = trips.arrive(driver.actor(), UUID.randomUUID(), trip.id(), trip.version(), null);
        TripView started = trips.start(driver.actor(), UUID.randomUUID(), waiting.id(), waiting.version(), null);
        trips.complete(driver.actor(), UUID.randomUUID(), started.id(), started.version(), OffsetDateTime.now(), true);
        deliverEvents();
        deliverEvents();
        return orders.get(order.id());
    }

    private long net(Ledger.Account account, UUID party) {
        return ledger.balances(account, party).stream().filter(b -> b.currency().equals("UAH"))
                .mapToLong(b -> b.debitMinor() - b.creditMinor()).sum();
    }

    private static void assertCode(ThrowingCallable call, ErrorCode code) {
        assertThatThrownBy(call).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }

    @Test
    void discountsAddUpAndTheServicePaysThemNotTheDriver() {
        create("Мінус 10 %", Kind.DISCOUNT, ValueType.PERCENT, 1_000, inCity());
        create("Мінус 5 грн", Kind.DISCOUNT, ValueType.FIXED, 500, inCity());
        Actor rider = rides.client();
        QuoteService.Quote quote = quote(rider);
        long price = quote.amountMinor();
        long expected = (price * 1_000 + 5_000) / 10_000 + 500;
        assertThat(quote.discountMinor()).isEqualTo(expected);
        assertThat(quote.toPayMinor()).isEqualTo(price - expected);
        assertThat(quote.promotions()).extracting(RiderPromotions.Applied::name)
                .containsExactly("Мінус 10 %", "Мінус 5 грн");

        OrderView done = rideToTheEnd(rider, quote);
        assertThat(done.discountMinor()).isEqualTo(expected);
        assertThat(done.finalPriceMinor()).as("the fare stays full").isEqualTo(price);
        assertThat(net(Ledger.Account.RIDER_RECEIVABLE, rider.id())).isZero();
        long commission = jdbc.sql("select commission_minor from final_fare where order_id = :id")
                .param("id", done.id()).query(Long.class).single();
        UUID driver = done.assignment().driverId();
        assertThat(net(Ledger.Account.DRIVER_PAYABLE, driver))
                .as("cash = price - discount; the service owes the driver the discount, less the commission")
                .isEqualTo(commission - expected);
    }

    @Test
    void bonusesComeOnEveryNthTripToTheAccount() {
        create("Кожна друга поїздка +3 грн", Kind.BONUS, ValueType.FIXED, 300,
                new Conditions(cityId, null, 2, null, null, null, null, null, null, null));
        Actor rider = rides.client();

        QuoteService.Quote first = quote(rider);
        assertThat(first.promotions()).isEmpty();
        rideToTheEnd(rider, first);
        assertThat(wallets.mine(rider, 10).balances()).isEmpty();

        QuoteService.Quote second = quote(rider);
        assertThat(second.promotions()).singleElement().satisfies(a -> {
            assertThat(a.kind()).isEqualTo(Kind.BONUS);
            assertThat(a.discountMinor()).isZero();
        });
        assertThat(second.discountMinor()).isZero();
        OrderView done = rideToTheEnd(rider, second);
        RiderWallets.Wallet wallet = wallets.mine(rider, 10);
        assertThat(wallet.balances()).singleElement().extracting(RiderWallets.Balance::balanceMinor).isEqualTo(300L);
        assertThat(wallet.entries()).singleElement().satisfies(e -> {
            assertThat(e.kind()).isEqualTo("PROMOTION");
            assertThat(e.orderId()).isEqualTo(done.id());
            assertThat(e.reason()).isEqualTo("Кожна друга поїздка +3 грн");
        });
        deliverEvents();
        assertThat(wallets.mine(rider, 10).entries()).as("once per trip").hasSize(1);
    }

    @Test
    void conditionsTimeWindowsAndRounding() {
        Conditions weekdayMornings = new Conditions(null, null, null,
                List.of(DayOfWeek.MONDAY, DayOfWeek.FRIDAY), LocalTime.of(8, 0), LocalTime.of(9, 0), null, null,
                null, null);
        RiderPromotions.Promotion p = new RiderPromotions.Promotion(UUID.randomUUID(), "x", Kind.DISCOUNT,
                ValueType.PERCENT, 1_000, null, weekdayMornings, "ACTIVE", 1, null, null, null);
        LocalDateTime monday0830 = LocalDateTime.of(2026, 10, 26, 8, 30);
        assertThat(JdbcRiderPromotions.matches(p, ctx(monday0830), 1)).isTrue();
        assertThat(JdbcRiderPromotions.matches(p, ctx(monday0830.withHour(9)), 1)).as("the end is exclusive").isFalse();
        assertThat(JdbcRiderPromotions.matches(p, ctx(monday0830.plusDays(1)), 1)).as("Tuesday").isFalse();
        assertThat(JdbcRiderPromotions.within(LocalTime.of(23, 0), LocalTime.of(22, 0), LocalTime.of(6, 0))).isTrue();
        assertThat(JdbcRiderPromotions.within(LocalTime.of(5, 59), LocalTime.of(22, 0), LocalTime.of(6, 0))).isTrue();
        assertThat(JdbcRiderPromotions.within(LocalTime.of(12, 0), LocalTime.of(22, 0), LocalTime.of(6, 0))).isFalse();
        assertThat(JdbcRiderPromotions.amount(ValueType.PERCENT, 1_250, 12_345)).isEqualTo(1_543);
        assertThat(JdbcRiderPromotions.amount(ValueType.FIXED, 700, 12_345)).isEqualTo(700);
    }

    private static RiderPromotions.Context ctx(LocalDateTime local) {
        return new RiderPromotions.Context(UUID.randomUUID(), UUID.randomUUID(), "STANDARD", "UAH", 10_000, Set.of(),
                Set.of(), local);
    }

    @Test
    void archivedOrOutOfTheirCityPromotionsDoNotApplyAndInputIsChecked() {
        RiderPromotions.Promotion p = create("Тимчасова", Kind.DISCOUNT, ValueType.FIXED, 100, inCity());
        promotions.archive(admin, UUID.randomUUID(), p.id(), p.version(), "ended");
        assertThat(quote(rides.client()).promotions()).isEmpty();

        assertCode(() -> create(" ", Kind.DISCOUNT, ValueType.FIXED, 100, inCity()), ErrorCode.VALIDATION_FAILED);
        assertCode(() -> create("x", Kind.DISCOUNT, ValueType.PERCENT, 10_001, inCity()), ErrorCode.VALIDATION_FAILED);
        assertCode(() -> promotions.create(admin, UUID.randomUUID(), new Draft("x", Kind.BONUS, ValueType.FIXED, 100,
                null, inCity()), "test"), ErrorCode.VALIDATION_FAILED);
        assertCode(() -> create("x", Kind.DISCOUNT, ValueType.FIXED, 100, new Conditions(null, null, null, null,
                null, null, UUID.randomUUID(), null, null, null)), ErrorCode.VALIDATION_FAILED);
        assertCode(() -> create("x", Kind.DISCOUNT, ValueType.FIXED, 100, new Conditions(cityId, null, null, null,
                LocalTime.of(8, 0), null, null, null, null, null)), ErrorCode.VALIDATION_FAILED);
        Actor clerk = new Actor(SubjectType.STAFF, UUID.randomUUID());
        assertCode(() -> promotions.list(clerk, false), ErrorCode.ACCESS_DENIED);
    }
}
