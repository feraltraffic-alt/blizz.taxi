package taxi.blizz.operations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.TestQuotes;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.configuration.ServiceSettings;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.SessionService;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.pricing.QuoteService;

/**
 * Several active orders per rider and the person the taxi is for (ADR 0012 Q-03, REQ-RID-03, issue #57): the
 * limit with pre-orders, phone orders counted by the caller's phone, races at the limit, and when the driver sees
 * the recipient.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class MultipleOrdersTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, 145.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 145.55);
    static final int LIMIT = 3;

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
    ServiceSettings settings;
    @Autowired
    JdbcClient jdbc;

    TestRides rides;
    TestQuotes testQuotes;
    UUID cityId;
    Actor operator;

    @BeforeEach
    void setUp() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        testQuotes = new TestQuotes(jdbc, quotes);
        cityId = rides.city("test-multiple-orders", "UAH", 145);
        operator = staff("orders.create");
        settings(ServiceSettings.CallMode.DIRECT, null, LIMIT);
    }

    // ------------------------------------------------------------ fixtures

    private Actor staff(String... permissions) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, all_cities, state, created_at,
                                                updated_at)
                        values (:id, :login, 'Orders', 'ADMIN', :permissions, true, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "multi-" + id).param("permissions", permissions).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private void settings(ServiceSettings.CallMode mode, String servicePhone, int limit) {
        ServiceSettings.Version current = settings.current();
        ServiceSettings.Settings s = current.settings();
        settings.change(staff(ServiceSettings.MANAGE_PERMISSION), UUID.randomUUID(), current.version(),
                new ServiceSettings.Settings(s.brand(), s.languages(), new ServiceSettings.Calls(mode, servicePhone),
                        s.preorders(), s.ratings(), s.tips(), new ServiceSettings.Orders(limit)),
                "Multiple orders test");
    }

    private String phone(Actor rider) {
        return jdbc.sql("select phone_normalized from client where id = :id").param("id", rider.id())
                .query(String.class).single();
    }

    private static String newPhone() {
        return "+38073" + String.format("%07d", Math.floorMod(UUID.randomUUID().hashCode(), 10_000_000));
    }

    private OrderView appOrder(Actor rider) {
        return appOrder(rider, testQuotes.quote(rider, cityId, "STANDARD", PICKUP, DROPOFF).id(), null);
    }

    private OrderView appOrder(Actor rider, UUID quote, CallerContact recipient) {
        return orders.create(rider, UUID.randomUUID(), new CreateOrder(rider.id(), "STANDARD", PICKUP, "Home",
                DROPOFF, "Work", PaymentMethod.CASH, quote, null, null, recipient));
    }

    private OrderView preorder(Actor rider) {
        Instant at = Instant.now().plus(3, ChronoUnit.HOURS).truncatedTo(ChronoUnit.MINUTES);
        UUID quote = testQuotes.quote(rider, cityId, "STANDARD", PICKUP, DROPOFF, at).id();
        return orders.create(rider, UUID.randomUUID(), new CreateOrder(rider.id(), "STANDARD", PICKUP, "Home",
                DROPOFF, "Work", PaymentMethod.CASH, quote, null, null, null, at));
    }

    private OrderView phoneOrder(String callerPhone) {
        return phoneOrder(callerPhone, testQuotes.quote(operator, cityId, "STANDARD", PICKUP, DROPOFF).id());
    }

    private OrderView phoneOrder(String callerPhone, UUID quote) {
        return orders.create(operator, UUID.randomUUID(), new CreateOrder(null, "STANDARD", PICKUP, "Home", DROPOFF,
                "Work", PaymentMethod.CASH, quote, OrderChannel.PHONE, null, new CallerContact("Caller", callerPhone)));
    }

    /** Off line, so a later test's order is not offered to this driver. */
    private void offline(TestRides.Driver driver) {
        DriverAvailability availability = sessions.availability(driver.actor().id());
        sessions.close(driver.actor(), UUID.randomUUID(), driver.device(), availability.sessionVersion());
    }

    private static void assertCode(ThrowingCallable call, ErrorCode code) {
        assertThatThrownBy(call).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }

    /** Runs both at the same moment; returns how many succeeded, after checking the others hit the limit. */
    private static int race(Callable<?> first, Callable<?> second) throws Exception {
        CountDownLatch start = new CountDownLatch(1);
        ExecutorService pool = Executors.newFixedThreadPool(2);
        try {
            List<Future<?>> futures = new ArrayList<>();
            for (Callable<?> call : List.of(first, second)) {
                futures.add(pool.submit(() -> {
                    start.await();
                    return call.call();
                }));
            }
            start.countDown();
            int succeeded = 0;
            for (Future<?> future : futures) {
                try {
                    future.get();
                    succeeded++;
                } catch (java.util.concurrent.ExecutionException e) {
                    assertThat(e.getCause()).isInstanceOf(DomainException.class);
                    assertThat(((DomainException) e.getCause()).code()).isEqualTo(ErrorCode.ACTIVE_ORDER_LIMIT);
                }
            }
            return succeeded;
        } finally {
            pool.shutdown();
        }
    }

    // ------------------------------------------------------------ tests

    @Test
    void upToTheLimitWithPreOrdersAndTheListShowsThemAll() {
        Actor rider = rides.client();
        OrderView first = appOrder(rider);
        OrderView later = preorder(rider);
        OrderView second = appOrder(rider);
        assertThat(later.status()).isEqualTo("SCHEDULED");
        assertCode(() -> appOrder(rider), ErrorCode.ACTIVE_ORDER_LIMIT);
        assertCode(() -> preorder(rider), ErrorCode.ACTIVE_ORDER_LIMIT);

        assertThat(orders.current(rider.id())).extracting(OrderView::id)
                .containsExactly(second.id(), later.id(), first.id());
        assertThat(orders.active(rider.id())).map(OrderView::id).as("the most recent order for now")
                .contains(second.id());

        // A finished order frees a place.
        orders.cancel(rider, UUID.randomUUID(), first.id(), orders.get(first.id()).version(), "CHANGED_MIND");
        assertThat(appOrder(rider).id()).isNotNull();

        // The limit is a setting.
        settings(ServiceSettings.CallMode.DIRECT, null, 5);
        assertThat(appOrder(rider).id()).isNotNull();
        settings(ServiceSettings.CallMode.DIRECT, null, LIMIT);
        assertCode(() -> appOrder(rider), ErrorCode.ACTIVE_ORDER_LIMIT);
    }

    @Test
    void twoOrdersAtTheLastPlaceMakeExactlyOne() throws Exception {
        Actor rider = rides.client();
        for (int i = 0; i < LIMIT - 1; i++) {
            appOrder(rider);
        }
        UUID q1 = testQuotes.quote(rider, cityId, "STANDARD", PICKUP, DROPOFF).id();
        UUID q2 = testQuotes.quote(rider, cityId, "STANDARD", PICKUP, DROPOFF).id();
        assertThat(race(() -> appOrder(rider, q1, null), () -> appOrder(rider, q2, null))).isEqualTo(1);
        assertThat(orders.current(rider.id())).hasSize(LIMIT);
    }

    @Test
    void anAppOrderAndAPhoneOrderOfTheSamePersonShareTheLimitAndTheLock() throws Exception {
        Actor rider = rides.client();
        String riderPhone = phone(rider);
        // A phone order from the rider's phone counts toward the rider's limit.
        phoneOrder(riderPhone);
        for (int i = 0; i < LIMIT - 2; i++) {
            appOrder(rider);
        }
        UUID appQuote = testQuotes.quote(rider, cityId, "STANDARD", PICKUP, DROPOFF).id();
        UUID phoneQuote = testQuotes.quote(operator, cityId, "STANDARD", PICKUP, DROPOFF).id();
        assertThat(race(() -> appOrder(rider, appQuote, null), () -> phoneOrder(riderPhone, phoneQuote)))
                .isEqualTo(1);
        assertCode(() -> appOrder(rider), ErrorCode.ACTIVE_ORDER_LIMIT);
        assertCode(() -> phoneOrder(riderPhone), ErrorCode.ACTIVE_ORDER_LIMIT);
    }

    @Test
    void aCallerWithoutAnAccountIsLimitedByTheNumber() {
        String caller = newPhone();
        for (int i = 0; i < LIMIT; i++) {
            phoneOrder(caller);
        }
        assertCode(() -> phoneOrder(caller), ErrorCode.ACTIVE_ORDER_LIMIT);
        assertThat(phoneOrder(newPhone()).id()).as("another number is not affected").isNotNull();
    }

    @Test
    void theDriverSeesTheRecipientOnlyOnTheTrip() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        rides.moveTo(driver, TestRides.north(PICKUP, 1000));
        Actor rider = rides.client();
        String recipientPhone = newPhone();
        OrderView order = appOrder(rider, testQuotes.quote(rider, cityId, "STANDARD", PICKUP, DROPOFF).id(),
                new CallerContact("Granny Olha", recipientPhone));

        // Offered, not assigned: nothing about the recipient (REQ-DRV-08).
        List<OfferView> offers = dispatch.offers(driver.actor());
        assertThat(offers).extracting(OfferView::orderId).contains(order.id());
        assertThat(offers.toString()).doesNotContain(recipientPhone).doesNotContain("Granny");
        assertThat(trips.current(driver.actor())).isEmpty();

        OfferView offer = offers.stream().filter(o -> o.orderId().equals(order.id())).findFirst().orElseThrow();
        dispatch.accept(driver.actor(), driver.device(), UUID.randomUUID(), offer.id());
        TripView trip = trips.current(driver.actor()).orElseThrow();
        assertThat(trip.recipient()).isEqualTo(new TripView.Recipient("Granny Olha", recipientPhone));
        assertThat(orders.get(order.id()).payerClientId()).as("the rider still pays").isEqualTo(rider.id());

        // With calls through the service's numbers the driver gets no real number.
        settings(ServiceSettings.CallMode.VIA_SERVICE_NUMBERS, "+380441110000", LIMIT);
        assertThat(trips.current(driver.actor()).orElseThrow().recipient())
                .isEqualTo(new TripView.Recipient("Granny Olha", null));
        settings(ServiceSettings.CallMode.DIRECT, null, LIMIT);

        // After the trip it is gone.
        rides.moveTo(driver, TestRides.north(PICKUP, 30));
        TripView waiting = trips.arrive(driver.actor(), UUID.randomUUID(), trip.id(), trip.version(), null);
        TripView riding = trips.start(driver.actor(), UUID.randomUUID(), waiting.id(), waiting.version(), null);
        TripView done = trips.complete(driver.actor(), UUID.randomUUID(), riding.id(), riding.version(),
                java.time.OffsetDateTime.now(), true);
        assertThat(done.recipient()).isNull();
        offline(driver);
    }

    @Test
    void anOrderWithoutARecipientShowsNone() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        TestRides.Ride ride = rides.assigned(cityId, driver, PICKUP, DROPOFF);
        assertThat(ride.trip().recipient()).isNull();
        orders.cancel(ride.payer(), UUID.randomUUID(), ride.order().id(), orders.get(ride.order().id()).version(),
                "CHANGED_MIND");
        offline(driver);
    }
}
