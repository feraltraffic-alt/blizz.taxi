package taxi.blizz.operations;

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
import taxi.blizz.TestQuotes;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.driver.DriverAdmission;
import taxi.blizz.driver.DriverProfile;
import taxi.blizz.finance.Ledger;
import taxi.blizz.finance.Ledger.Account;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.SessionService;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.platform.internal.OutboxRelay;
import taxi.blizz.pricing.QuoteService;

/** A phone order paid by card at the driver's own terminal (owner decision 27.10.2026). */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class TerminalPaymentTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, -39.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, -39.45);

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
    DriverAdmission admission;
    @Autowired
    Ledger ledger;
    @Autowired
    OutboxRelay relay;
    @Autowired
    JdbcClient jdbc;

    TestRides rides;
    UUID cityId;
    Actor operator;

    @BeforeEach
    void setUp() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        cityId = rides.city("test-terminal-payment", "UAH", -40);
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, all_cities, state, created_at,
                                                updated_at)
                        values (:id, :login, 'Phone desk', 'OPERATOR', :permissions, true, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "terminal-" + id)
                .param("permissions", new String[] {Orders.CREATE_PERMISSION, Orders.VIEW_PERMISSION,
                        Orders.CANCEL_PERMISSION, "driver.review"}).update();
        operator = new Actor(SubjectType.STAFF, id);
        while (relay.runOnce() > 0) {
            // earlier events do not count
        }
    }

    private OrderView phoneOrder(PaymentMethod method, boolean fallback) {
        UUID quote = new TestQuotes(jdbc, quotes).quote(operator, cityId, "STANDARD", PICKUP, DROPOFF).id();
        return orders.create(operator, UUID.randomUUID(), new CreateOrder(null, "STANDARD", PICKUP, "Home", DROPOFF,
                "Work", method, quote, OrderChannel.PHONE, null, new CallerContact("Olena", "+380671112233"), null,
                fallback));
    }

    private TestRides.Driver withTerminal(TestRides.Driver driver) {
        long version = admission.profile(driver.actor().id()).version();
        DriverProfile profile = admission.setPaymentTerminal(operator, UUID.randomUUID(), driver.actor().id(), version,
                true, "Sole trader, own terminal");
        assertThat(profile.hasPaymentTerminal()).isTrue();
        return driver;
    }

    private long driverOwes(UUID driverId) {
        return ledger.balances(Account.DRIVER_PAYABLE, driverId).stream().filter(b -> b.currency().equals("UAH"))
                .mapToLong(b -> b.debitMinor() - b.creditMinor()).sum();
    }

    /** Takes the driver of an assigned order up to the start of the trip. */
    private TripView start(TestRides.Driver driver) {
        TripView trip = trips.current(driver.actor()).orElseThrow();
        rides.moveTo(driver, TestRides.north(PICKUP, 30));
        TripView waiting = trips.arrive(driver.actor(), UUID.randomUUID(), trip.id(), trip.version(), null);
        return trips.start(driver.actor(), UUID.randomUUID(), waiting.id(), waiting.version(), null);
    }

    @Test
    void onlyADriverWithATerminalGetsItAndTheCommissionComesFromTheBalance() {
        TestRides.Driver plain = rides.driverNear(PICKUP);
        TestRides.Driver terminal = withTerminal(rides.driverNear(PICKUP));
        rides.moveTo(plain, TestRides.north(PICKUP, 300)); // nearer, but without a terminal

        OrderView order = phoneOrder(PaymentMethod.TERMINAL, false);
        assertThat(order.paymentMethod()).isEqualTo(PaymentMethod.TERMINAL);
        assertThat(order.paymentState()).isEqualTo("TERMINAL_EXPECTED");
        assertThat(dispatch.offers(plain.actor())).isEmpty();
        dispatch.accept(terminal.actor(), UUID.randomUUID(), dispatch.offers(terminal.actor()).getFirst().id());

        TripView started = start(terminal);
        assertThatThrownBy(() -> trips.complete(terminal.actor(), UUID.randomUUID(), started.id(), started.version(),
                OffsetDateTime.now(), null)).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(ErrorCode.VALIDATION_FAILED);
        trips.complete(terminal.actor(), UUID.randomUUID(), started.id(), started.version(), OffsetDateTime.now(), true);
        while (relay.runOnce() > 0) {
            // post the fare
        }
        OrderView done = orders.get(order.id());
        assertThat(done.paymentState()).isEqualTo("TERMINAL_REPORTED");
        long commission = jdbc.sql("select commission_minor from final_fare where order_id = :id")
                .param("id", order.id()).query(Long.class).single();
        assertThat(driverOwes(terminal.actor().id())).as("the money is with the driver; the commission is owed")
                .isEqualTo(commission);
    }

    @Test
    void withoutATerminalNearbyTheCallerWhoAgreedPaysCash() {
        TestRides.Driver plain = rides.driverNear(PICKUP);

        OrderView strict = phoneOrder(PaymentMethod.TERMINAL, false);
        assertThat(orders.get(strict.id()).searchPhase()).as("nobody with a terminal near").isEqualTo("BROADCAST");
        assertThat(dispatch.broadcast(plain.actor())).extracting(BroadcastOrderView::orderId)
                .doesNotContain(strict.id());
        assertThatThrownBy(() -> dispatch.claim(plain.actor(), UUID.randomUUID(), strict.id()))
                .isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(ErrorCode.DRIVER_NOT_ELIGIBLE);
        orders.cancel(operator, UUID.randomUUID(), strict.id(), orders.get(strict.id()).version(), "NO_CARS");

        OrderView agreed = phoneOrder(PaymentMethod.TERMINAL, true);
        assertThat(dispatch.broadcast(plain.actor())).extracting(BroadcastOrderView::orderId)
                .contains(agreed.id());
        dispatch.claim(plain.actor(), UUID.randomUUID(), agreed.id());
        OrderView cash = orders.get(agreed.id());
        assertThat(cash.paymentMethod()).isEqualTo(PaymentMethod.CASH);
        assertThat(cash.paymentState()).isEqualTo("CASH_EXPECTED");
        assertThat(orders.timeline(operator, agreed.id())).extracting(Orders.TimelineEntry::type)
                .contains("PaymentMethodChanged");
    }

    @Test
    void theRiderAppCannotChooseTheTerminalAndCashCannotFallBack() {
        Actor rider = rides.client();
        UUID quote = new TestQuotes(jdbc, quotes).quote(rider, cityId, "STANDARD", PICKUP, DROPOFF).id();
        assertThatThrownBy(() -> orders.create(rider, UUID.randomUUID(), new CreateOrder(rider.id(), "STANDARD",
                PICKUP, "Home", DROPOFF, "Work", PaymentMethod.TERMINAL, quote)))
                .isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(ErrorCode.VALIDATION_FAILED);
        assertThatThrownBy(() -> phoneOrder(PaymentMethod.CASH, true)).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(ErrorCode.VALIDATION_FAILED);
        assertThat(List.of(PaymentMethod.values())).contains(PaymentMethod.TERMINAL);
    }
}
