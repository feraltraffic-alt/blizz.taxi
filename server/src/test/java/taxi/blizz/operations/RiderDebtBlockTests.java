package taxi.blizz.operations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
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
import taxi.blizz.configuration.ServiceSettings;
import taxi.blizz.configuration.ServiceSettings.Settings;
import taxi.blizz.finance.FareDeltas;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.SessionService;
import taxi.blizz.payments.CardTopUps;
import taxi.blizz.payments.internal.TestPayments;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.platform.internal.OutboxRelay;
import taxi.blizz.pricing.QuoteService;

/**
 * Owner decision 01.11.2026 (ADR 0014, Q-10): a rider who owes more than the service's rider_debts limit in a currency
 * gets no new order, at once, from the app or by phone; the account stays ACTIVE and paying the debt lifts it.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class RiderDebtBlockTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, -147.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, -147.45);
    static final long DEBT = 4_200;

    @Autowired Orders orders;
    @Autowired Dispatch dispatch;
    @Autowired Trips trips;
    @Autowired WorkSessions sessions;
    @Autowired SessionService auth;
    @Autowired QuoteService quotes;
    @Autowired RiderObligations obligations;
    @Autowired FareDeltas fareDeltas;
    @Autowired ServiceSettings settings;
    @Autowired OutboxRelay relay;
    @Autowired JdbcClient jdbc;
    @Autowired ApplicationContext context;
    @Autowired TransactionTemplate tx;

    TestRides rides;
    TestPayments payments;
    UUID cityId;
    Actor admin;

    @BeforeEach
    void setUp() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        payments = new TestPayments(context);
        cityId = rides.city("test-rider-debt-block", "UAH", -148);
        if (jdbc.sql("select count(*) from payment_merchant_city where city_id = :city").param("city", cityId)
                .query(Long.class).single() == 0) {
            UUID id = UUID.randomUUID();
            jdbc.sql("""
                            insert into payment_merchant (id, provider, account, domain, secret_ref, currency,
                                                          created_at)
                            values (:id, 'FAKE', :account, 'test.blizz.invalid', 'test', 'UAH', now())""")
                    .param("id", id).param("account", "debt_block_" + id).update();
            jdbc.sql("insert into payment_merchant_city (city_id, merchant_id) values (:city, :merchant)")
                    .param("city", cityId).param("merchant", id).update();
        }
        admin = staff(null, ServiceSettings.MANAGE_PERMISSION);
        payments.resetGateway();
    }

    @AfterEach
    void cleanUp() {
        allow(Map.of());
        drain();
        payments.resetGateway();
    }

    private void drain() {
        while (relay.runOnce() > 0) {
            // drain
        }
    }

    private void allow(Map<String, Long> perCurrency) {
        ServiceSettings.Version now = settings.current();
        Settings s = now.settings();
        settings.change(admin, UUID.randomUUID(), now.version(), new Settings(s.brand(), s.languages(), s.calls(),
                s.preorders(), s.ratings(), s.tips(), s.orders(), s.cashNotReceived(), s.appVersions(),
                s.staffTopUps(), new ServiceSettings.RiderDebts(perCurrency)), "test");
    }

    private Actor staff(UUID city, String... permissions) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, state, created_at, updated_at)
                        values (:id, :login, 'Debts', 'ADMIN', :permissions, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "debt-block-" + id).param("permissions", permissions).update();
        if (city != null) {
            jdbc.sql("update staff_user set city_scope = :scope where id = :id")
                    .param("scope", new UUID[]{city}).param("id", id).update();
        }
        return new Actor(SubjectType.STAFF, id);
    }

    /** A cash ride paid in full, then a final-fare correction that raises it by {@link #DEBT}: the rider owes it. */
    private Actor owing() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        TestRides.Ride ride = rides.started(cityId, driver, PICKUP, DROPOFF);
        rides.complete(ride, true);
        drain();
        tx.executeWithoutResult(status -> fareDeltas.post(new FareDeltas.Delta(ride.order().id(), UUID.randomUUID(),
                ride.payer().id(), driver.actor().id(), false, "UAH", DEBT, 630, DEBT - 630)));
        assertThat(obligations.list(ride.payer())).as("the rider owes").hasSize(1);
        return ride.payer();
    }

    private UUID quote(Actor who) {
        return new TestQuotes(jdbc, quotes).quote(who, cityId, "STANDARD", PICKUP, DROPOFF).id();
    }

    private OrderView appOrder(Actor rider, UUID quote) {
        return orders.create(rider, UUID.randomUUID(), new CreateOrder(rider.id(), "STANDARD", PICKUP, "Home",
                DROPOFF, "Work", PaymentMethod.CASH, quote));
    }

    private OrderView phoneOrder(Actor operator, String callerPhone) {
        return orders.create(operator, UUID.randomUUID(), new CreateOrder(null, "STANDARD", PICKUP, "Home", DROPOFF,
                "Work", PaymentMethod.CASH, quote(operator), OrderChannel.PHONE, null,
                new CallerContact("Caller", callerPhone)));
    }

    private long ordersOf(Actor rider) {
        return jdbc.sql("select count(*) from ride_order where payer_client_id = :rider").param("rider", rider.id())
                .query(Long.class).single();
    }

    private String phoneOf(Actor rider) {
        return jdbc.sql("select phone_normalized from client where id = :id").param("id", rider.id())
                .query(String.class).single();
    }

    private static void assertCode(ThrowingCallable call, ErrorCode code) {
        assertThatThrownBy(call).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }

    @Test
    void aRiderWhoOwesGetsNoNewOrderAtOnceAndPayingLiftsIt() {
        Actor rider = owing();
        long before = ordersOf(rider);
        UUID quote = quote(rider);

        assertCode(() -> appOrder(rider, quote), ErrorCode.RIDER_HAS_DEBT);
        assertThat(ordersOf(rider)).as("nothing created").isEqualTo(before);
        assertThat(jdbc.sql("select account_state from client where id = :id").param("id", rider.id())
                .query(String.class).single()).as("a financial limit, not a blocked account").isEqualTo("ACTIVE");

        CardTopUps.TopUp page = obligations.startRepayment(rider, UUID.randomUUID(),
                obligations.list(rider).getFirst().orderId(), null);
        payments.payOnFakePage(page.fields());
        drain();
        assertThat(obligations.list(rider)).isEmpty();

        OrderView order = appOrder(rider, quote);
        assertThat(order.status()).as("the refused order did not use the quote").isEqualTo("SEARCHING");
        orders.cancel(rider, UUID.randomUUID(), order.id(), orders.get(order.id()).version(), "CHANGED_MIND");
    }

    @Test
    void theAdminsLimitIsWhatADebtMayReachAndOnlyInItsCurrency() {
        Actor rider = owing();

        allow(Map.of("PLN", 1_000_000L));
        assertCode(() -> appOrder(rider, quote(rider)), ErrorCode.RIDER_HAS_DEBT);

        allow(Map.of("UAH", DEBT - 1));
        assertCode(() -> appOrder(rider, quote(rider)), ErrorCode.RIDER_HAS_DEBT);

        allow(Map.of("UAH", DEBT));
        OrderView order = appOrder(rider, quote(rider));
        assertThat(order.status()).as("a debt up to the limit lets the rider order").isEqualTo("SEARCHING");
        orders.cancel(rider, UUID.randomUUID(), order.id(), orders.get(order.id()).version(), "CHANGED_MIND");
    }

    @Test
    void aPhoneOrderForACallerWhoOwesIsRefusedAndAStrangersIsNot() {
        Actor rider = owing();
        Actor operator = staff(cityId, Orders.CREATE_PERMISSION, Orders.VIEW_PERMISSION, Orders.CANCEL_PERMISSION);

        assertCode(() -> phoneOrder(operator, phoneOf(rider)), ErrorCode.RIDER_HAS_DEBT);

        Actor clean = rides.client();
        OrderView order = phoneOrder(operator, phoneOf(clean));
        assertThat(order.status()).isEqualTo("SEARCHING");
        orders.cancel(operator, UUID.randomUUID(), order.id(), orders.get(order.id()).version(), "NO_CARS");
    }

    @Test
    void aRiderWhoOwesNothingOrdersAsBefore() {
        Actor rider = rides.client();
        OrderView order = appOrder(rider, quote(rider));
        assertThat(order.status()).isEqualTo("SEARCHING");
        orders.cancel(rider, UUID.randomUUID(), order.id(), orders.get(order.id()).version(), "CHANGED_MIND");
    }

    @Test
    void aWrongLimitIsRefusedWhenSaved() {
        for (Map<String, Long> wrong : List.of(Map.of("uah", 100L), Map.of("UAHH", 100L), Map.of("UAH", -1L),
                Map.of("UAH", 1_000_000_000_001L))) {
            assertCode(() -> allow(wrong), ErrorCode.VALIDATION_FAILED);
        }
        allow(Map.of("UAH", 0L, "PLN", 1_000_000_000_000L));
        assertThat(settings.current().settings().riderDebts().allowed("PLN")).isEqualTo(1_000_000_000_000L);
        assertThat(settings.current().settings().riderDebts().allowed("EUR")).as("not listed: none").isZero();
    }
}
