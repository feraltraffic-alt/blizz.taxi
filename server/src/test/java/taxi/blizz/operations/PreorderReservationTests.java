package taxi.blizz.operations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
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
import taxi.blizz.configuration.ServiceSettings;
import taxi.blizz.configuration.ServiceSettings.PreorderDispatch;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.SessionService;
import taxi.blizz.operations.internal.PreorderWorker;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.pricing.QuoteService;

/** Drivers reserving pre-orders and confirming "On my way" (ADR 0006, RESERVATION mode). */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class PreorderReservationTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, -99.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, -99.45);

    @Autowired
    Preorders preorders;
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
    PreorderWorker worker;
    @Autowired
    JdbcClient jdbc;

    TestRides rides;
    UUID cityId;
    Actor admin;
    ServiceSettings.Settings before;

    @BeforeEach
    void setUp() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        cityId = rides.city("test-preorder-reservations", "UAH", -100);
        admin = staff(ServiceSettings.MANAGE_PERMISSION);
        before = settings.current().settings();
        mode(PreorderDispatch.RESERVATION);
    }

    @AfterEach
    void restore() {
        settings.change(admin, UUID.randomUUID(), settings.current().version(), before, "Test over");
    }

    /** Confirm 30–20 minutes before the pickup; the driver may drop it until 60 minutes before. */
    private void mode(PreorderDispatch dispatch) {
        ServiceSettings.Settings now = settings.current().settings();
        settings.change(admin, UUID.randomUUID(), settings.current().version(), new ServiceSettings.Settings(
                now.brand(), now.languages(), now.calls(),
                new ServiceSettings.Preorders(60, 7, dispatch, 30, 30, 10, 60)), "Reservation test");
    }

    private Actor staff(String... permissions) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, first_name, last_name, name, role, permissions, all_cities,
                                                state, created_at, updated_at)
                        values (:id, :login, 'Test', 'Dispatcher', 'Test Dispatcher', 'ADMIN', :permissions, true,
                                'ACTIVE', now(), now())""")
                .param("id", id).param("login", "reservations-" + id).param("permissions", permissions).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private static void assertCode(ThrowingCallable call, ErrorCode code) {
        assertThatThrownBy(call).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }

    private OrderView preorder(Actor payer) {
        Instant pickupAt = Instant.now().plus(3, ChronoUnit.HOURS);
        UUID quote = new TestQuotes(jdbc, quotes).quote(payer, cityId, "STANDARD", PICKUP, DROPOFF, pickupAt).id();
        OrderView order = orders.create(payer, UUID.randomUUID(), new CreateOrder(payer.id(), "STANDARD", PICKUP,
                "Home", DROPOFF, "Airport", PaymentMethod.CASH, quote, null, null, null, pickupAt));
        assertThat(order.status()).isEqualTo("SCHEDULED");
        return order;
    }

    private void pickupIn(UUID orderId, int minutes) {
        jdbc.sql("update ride_order set pickup_at = now() + make_interval(mins => :m) where id = :id")
                .param("m", minutes).param("id", orderId).update();
    }

    private String reservationState(UUID reservationId) {
        return jdbc.sql("select state from preorder_reservation where id = :id").param("id", reservationId)
                .query(String.class).single();
    }

    @Test
    void theReservedDriverConfirmsInTheWindowAndBecomesTheAssignedDriver() {
        TestRides.Driver anna = rides.driverNear(PICKUP);
        TestRides.Driver bohdan = rides.driverNear(PICKUP);
        Actor payer = rides.client();
        OrderView order = preorder(payer);

        assertThat(preorders.available(anna.actor())).extracting(Preorders.Available::orderId).contains(order.id());
        UUID command = UUID.randomUUID();
        Preorders.Reservation reservation = preorders.reserve(anna.actor(), command, order.id());
        assertThat(preorders.reserve(anna.actor(), command, order.id())).isEqualTo(reservation);
        assertThat(reservation.state()).isEqualTo("RESERVED");
        assertThat(preorders.mine(anna.actor())).extracting(Preorders.Reservation::id).containsExactly(reservation.id());
        assertThat(preorders.holder(order.id())).map(Preorders.Holder::driverId).contains(anna.actor().id());

        assertThat(preorders.available(bohdan.actor())).extracting(Preorders.Available::orderId)
                .doesNotContain(order.id());
        assertCode(() -> preorders.reserve(bohdan.actor(), UUID.randomUUID(), order.id()),
                ErrorCode.ORDER_ALREADY_ASSIGNED);
        assertCode(() -> preorders.confirm(anna.actor(), UUID.randomUUID(), reservation.id()), ErrorCode.STATE_CONFLICT);
        assertCode(() -> preorders.confirm(bohdan.actor(), UUID.randomUUID(), reservation.id()), ErrorCode.NOT_FOUND);

        jdbc.sql("update ride_order set release_at = now() - interval '1 second' where id = :id")
                .param("id", order.id()).update();
        worker.runOnce();
        assertThat(orders.get(order.id()).status()).as("a held pre-order is not released").isEqualTo("SCHEDULED");

        pickupIn(order.id(), 25);
        AssignmentView assignment = preorders.confirm(anna.actor(), UUID.randomUUID(), reservation.id());
        assertThat(assignment.source()).isEqualTo("RESERVATION");
        assertThat(assignment.driverId()).isEqualTo(anna.actor().id());
        assertThat(orders.get(order.id()).status()).isEqualTo("ASSIGNED");
        assertThat(trips.current(anna.actor())).map(TripView::phase).contains("TO_PICKUP");
        assertThat(reservationState(reservation.id())).isEqualTo("CONFIRMED");
        assertThat(preorders.mine(anna.actor())).isEmpty();

        orders.cancel(payer, UUID.randomUUID(), order.id(), orders.get(order.id()).version(), "CHANGED_MIND");
    }

    @Test
    void theDriverDropsInTimeOrOnlyADispatcherCanTakeHimOff() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        OrderView early = preorder(rides.client());
        Preorders.Reservation held = preorders.reserve(driver.actor(), UUID.randomUUID(), early.id());
        assertCode(() -> preorders.drop(driver.actor(), UUID.randomUUID(), held.id(), "WAIT_TOO_LONG"),
                ErrorCode.VALIDATION_FAILED); // a rider reason
        Preorders.Reservation dropped = preorders.drop(driver.actor(), UUID.randomUUID(), held.id(), "CANNOT_REACH");
        assertThat(dropped.state()).isEqualTo("DROPPED");
        assertThat(preorders.holder(early.id())).isEmpty();
        assertCode(() -> preorders.reserve(driver.actor(), UUID.randomUUID(), early.id()),
                ErrorCode.DRIVER_NOT_ELIGIBLE);

        OrderView late = preorder(rides.client());
        Preorders.Reservation lateHold = preorders.reserve(driver.actor(), UUID.randomUUID(), late.id());
        pickupIn(late.id(), 50);
        assertCode(() -> preorders.drop(driver.actor(), UUID.randomUUID(), lateHold.id(), "CANNOT_REACH"),
                ErrorCode.STATE_CONFLICT);
        assertCode(() -> preorders.removeReservation(staff(Orders.VIEW_PERMISSION), UUID.randomUUID(), late.id(),
                "Driver called"), ErrorCode.ACCESS_DENIED);
        OrderView kept = preorders.removeReservation(staff(Orders.REASSIGN_PERMISSION), UUID.randomUUID(), late.id(),
                "Driver called, car broke down");
        assertThat(kept.status()).isEqualTo("SCHEDULED");
        assertThat(reservationState(lateHold.id())).isEqualTo("REMOVED");
        assertThat(jdbc.sql("select count(*) from audit_log where action = 'preorder.remove_reservation' "
                + "and resource_id = :id").param("id", late.id().toString()).query(Long.class).single()).isEqualTo(1);
        assertThat(jdbc.sql("""
                        select string_agg(type, ',' order by sequence) from order_event where order_id = :id""")
                .param("id", late.id()).query(String.class).single())
                .contains("PreorderReserved", "PreorderReservationRemoved");
    }

    @Test
    void anUnconfirmedReservationExpiresAndTheOrderGoesToTheSearch() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        OrderView order = preorder(rides.client());
        Preorders.Reservation held = preorders.reserve(driver.actor(), UUID.randomUUID(), order.id());
        worker.expireReservations();
        assertThat(reservationState(held.id())).as("not due").isEqualTo("RESERVED");

        pickupIn(order.id(), 15);
        assertThat(worker.expireReservations()).isGreaterThanOrEqualTo(1);
        assertThat(reservationState(held.id())).isEqualTo("EXPIRED");
        assertThat(orders.get(order.id()).status()).isEqualTo("SEARCHING");
        assertCode(() -> preorders.confirm(driver.actor(), UUID.randomUUID(), held.id()), ErrorCode.STATE_CONFLICT);

        Actor payer = rides.client();
        OrderView cancelled = preorder(payer);
        Preorders.Reservation lost = preorders.reserve(driver.actor(), UUID.randomUUID(), cancelled.id());
        orders.cancel(payer, UUID.randomUUID(), cancelled.id(), orders.get(cancelled.id()).version(), "CHANGED_MIND");
        assertThat(reservationState(lost.id())).isEqualTo("CANCELLED");
    }

    @Test
    void inBroadcastModeNothingIsReserved() {
        mode(PreorderDispatch.BROADCAST_BEFORE);
        TestRides.Driver driver = rides.driverNear(PICKUP);
        OrderView order = preorder(rides.client());
        assertThat(preorders.available(driver.actor())).isEmpty();
        assertCode(() -> preorders.reserve(driver.actor(), UUID.randomUUID(), order.id()), ErrorCode.STATE_CONFLICT);
        assertCode(() -> preorders.available(new Actor(SubjectType.CLIENT, UUID.randomUUID())), ErrorCode.ACCESS_DENIED);
    }
}
