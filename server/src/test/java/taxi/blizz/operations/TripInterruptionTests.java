package taxi.blizz.operations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.time.OffsetDateTime;
import java.util.UUID;
import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.TestRides;
import taxi.blizz.TestRides.Ride;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.SessionService;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.platform.internal.OutboxRelay;
import taxi.blizz.pricing.QuoteService;

/** A trip interrupted after the start (T-22): free for the rider, a follow-up on the service's account. */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class TripInterruptionTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, 80.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.4, 80.6);

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

    @BeforeEach
    void setUp() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        cityId = rides.city("test-trip-interruption", "UAH", 80);
    }

    private Actor staff(String... permissions) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, first_name, last_name, name, role, permissions, all_cities,
                                                state, created_at, updated_at)
                        values (:id, :login, 'Olena', 'Support', 'Olena Support', 'OPERATOR', :permissions, true,
                                'ACTIVE', now(), now())""")
                .param("id", id).param("login", "interrupt-" + id).param("permissions", permissions).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private static void assertCode(ThrowingCallable call, ErrorCode code) {
        assertThatThrownBy(call).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }

    private String occupancy(Actor driver) {
        return jdbc.sql("select occupancy from driver_capacity where driver_id = :id").param("id", driver.id())
                .query(String.class).single();
    }

    private void deliverEvents() {
        while (relay.runOnce() > 0) {
            // drain
        }
    }

    @Test
    void aBrokenDownTripIsFreeAndTheFollowUpIsOnTheService() {
        Actor support = staff(Orders.INTERRUPT_PERMISSION, Orders.VIEW_PERMISSION);
        Ride assigned = rides.assigned(cityId, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        assertCode(() -> orders.interrupt(support, UUID.randomUUID(), assigned.order().id(),
                orders.get(assigned.order().id()).version(), new Orders.Interruption("VEHICLE_BREAKDOWN", null, false,
                        null, null)), ErrorCode.STATE_CONFLICT); // before the start: cancel or reassign instead
        orders.cancel(assigned.payer(), UUID.randomUUID(), assigned.order().id(),
                orders.get(assigned.order().id()).version(), "CHANGED_MIND");

        rides.city("test-trip-interruption", "UAH", 80);
        TestRides.Driver broken = rides.driverNear(PICKUP);
        Ride ride = rides.started(cityId, broken, PICKUP, DROPOFF);
        GeoPoint stop = TestRides.north(PICKUP, 300);
        rides.moveTo(broken, stop);
        TestRides.Driver rescue = rides.driverNear(stop);
        long version = orders.get(ride.order().id()).version();

        assertCode(() -> orders.interrupt(staff(Orders.CANCEL_PERMISSION), UUID.randomUUID(), ride.order().id(), version,
                new Orders.Interruption("VEHICLE_BREAKDOWN", null, true, null, null)), ErrorCode.ACCESS_DENIED);
        assertCode(() -> orders.interrupt(support, UUID.randomUUID(), ride.order().id(), version,
                new Orders.Interruption("CHANGED_MIND", null, true, null, null)), ErrorCode.VALIDATION_FAILED);

        UUID command = UUID.randomUUID();
        Orders.Interruption interruption = new Orders.Interruption("VEHICLE_BREAKDOWN", "Engine stopped on the bridge",
                true, null, null);
        Orders.Interrupted result = orders.interrupt(support, command, ride.order().id(), version, interruption);
        assertThat(orders.interrupt(support, command, ride.order().id(), version, interruption)).isEqualTo(result);

        OrderView interrupted = result.order();
        assertThat(interrupted.status()).isEqualTo("CANCELLED");
        assertThat(interrupted.cancellation().by()).isEqualTo("STAFF");
        assertThat(interrupted.cancellation().reasonCode()).isEqualTo("VEHICLE_BREAKDOWN");
        assertThat(interrupted.finalPriceMinor()).as("the part driven is free").isNull();
        assertThat(jdbc.sql("select phase || ' ' || (interrupted_at is not null) || ' ' || "
                        + "(interrupted_at_point is not null) from trip where id = :id")
                .param("id", ride.trip().id()).query(String.class).single()).isEqualTo("ABORTED true true");
        assertThat(occupancy(broken.actor())).isEqualTo("FREE");

        OrderView followUp = result.followUp();
        assertThat(followUp.relatedOrderId()).isEqualTo(ride.order().id());
        assertThat(followUp.paymentMethod()).isEqualTo(PaymentMethod.SERVICE);
        assertThat(followUp.payerClientId()).isEqualTo(ride.payer().id());
        assertThat(followUp.status()).isEqualTo("SEARCHING");
        assertThat(followUp.pickup().lat()).isCloseTo(stop.lat(), org.assertj.core.api.Assertions.within(1e-6));
        assertThat(orders.active(ride.payer().id())).map(OrderView::id).contains(followUp.id());
        assertThat(dispatch.offers(broken.actor())).as("the broken car is not offered the follow-up").isEmpty();
        assertThat(dispatch.offers(rescue.actor())).extracting(OfferView::orderId).containsExactly(followUp.id());

        // The rescue driver finishes the ride; the rider owes nothing, the service pays the driver's share.
        dispatch.accept(rescue.actor(), rescue.device(), UUID.randomUUID(), dispatch.offers(rescue.actor()).getFirst().id());
        TripView trip = trips.current(rescue.actor()).orElseThrow();
        rides.moveTo(rescue, TestRides.north(stop, 20));
        TripView waiting = trips.arrive(rescue.actor(), UUID.randomUUID(), trip.id(), trip.version(), null);
        TripView started = trips.start(rescue.actor(), UUID.randomUUID(), waiting.id(), waiting.version(), null);
        trips.complete(rescue.actor(), UUID.randomUUID(), started.id(), started.version(), OffsetDateTime.now(), null);
        deliverEvents();
        assertThat(jdbc.sql("""
                        select count(*) from journal_line l join journal_transaction t on t.id = l.transaction_id
                        where t.basis_id = :order and l.account = 'RIDER_RECEIVABLE'""")
                .param("order", followUp.id()).query(Long.class).single()).isZero();
        assertThat(jdbc.sql("""
                        select sum(l.debit_minor) from journal_line l join journal_transaction t on t.id = l.transaction_id
                        where t.basis_id = :order and l.account = 'SERVICE_EXPENSE'""")
                .param("order", followUp.id()).query(Long.class).single())
                .isEqualTo(orders.get(followUp.id()).finalPriceMinor());
        assertThat(jdbc.sql("""
                        select sum(l.credit_minor) - sum(l.debit_minor) from journal_line l
                        join journal_transaction t on t.id = l.transaction_id
                        where t.basis_id = :order and l.account = 'DRIVER_PAYABLE' and l.party_id = :driver""")
                .param("order", followUp.id()).param("driver", rescue.actor().id()).query(Long.class).single())
                .as("the service owes the rescue driver his share").isPositive();
        assertThat(jdbc.sql("select count(*) from journal_transaction where basis_id = :order")
                .param("order", ride.order().id()).query(Long.class).single()).as("nothing for the interrupted part")
                .isZero();
    }

    @Test
    void withoutAFollowUpTheOrderIsOnlyClosed() {
        Actor support = staff(Orders.INTERRUPT_PERMISSION);
        Ride ride = rides.started(cityId, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        Orders.Interrupted result = orders.interrupt(support, UUID.randomUUID(), ride.order().id(),
                orders.get(ride.order().id()).version(), new Orders.Interruption("ACCIDENT", null, false, null, null));
        assertThat(result.followUp()).isNull();
        assertThat(result.order().status()).isEqualTo("CANCELLED");
        assertThat(orders.active(ride.payer().id())).isEmpty();
        assertThat(jdbc.sql("select count(*) from audit_log where action = 'order.interrupt' and resource_id = :id")
                .param("id", ride.order().id().toString()).query(Long.class).single()).isEqualTo(1);
        assertCode(() -> orders.interrupt(support, UUID.randomUUID(), ride.order().id(),
                orders.get(ride.order().id()).version(), new Orders.Interruption("ACCIDENT", null, false, null, null)),
                ErrorCode.STATE_CONFLICT);
    }

    /** Review of 28.10.2026: a driver who ended the shift during the trip is not left in a closing session. */
    @Test
    void anInterruptedTripClosesTheSessionTheDriverWasEnding() {
        Actor support = staff(Orders.INTERRUPT_PERMISSION, Orders.VIEW_PERMISSION);
        TestRides.Driver driver = rides.driverNear(PICKUP);
        Ride ride = rides.started(cityId, driver, PICKUP, DROPOFF);
        assertThat(sessions.close(driver.actor(), UUID.randomUUID(), driver.device(),
                sessions.availability(driver.actor().id()).sessionVersion()).sessionState()).isEqualTo("CLOSING");

        orders.interrupt(support, UUID.randomUUID(), ride.order().id(), orders.get(ride.order().id()).version(),
                new Orders.Interruption("VEHICLE_BREAKDOWN", null, false, null, null));

        assertThat(occupancy(driver.actor())).isEqualTo("FREE");
        assertThat(jdbc.sql("select state from work_session where driver_id = :id order by opened_at desc limit 1")
                .param("id", driver.actor().id()).query(String.class).single()).isEqualTo("CLOSED");
    }
}
