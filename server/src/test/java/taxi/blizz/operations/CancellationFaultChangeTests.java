package taxi.blizz.operations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.Map;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.configuration.CancelReasons;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.SessionService;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.pricing.QuoteService;

/**
 * Staff correct the fault of a cancelled order (owner decision 05.11.2026, ADR 0019 point 4): with their own right in
 * the order's city, a comment, audited and in the history, and the driver's counted cancellation follows. The
 * operator's points are in OperatorBonusTests. Its own city at longitude -131.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class CancellationFaultChangeTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, -130.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, -130.45);

    @Autowired Orders orders;
    @Autowired Dispatch dispatch;
    @Autowired Trips trips;
    @Autowired WorkSessions sessions;
    @Autowired SessionService auth;
    @Autowired QuoteService quotes;
    @Autowired CancelReasons reasons;
    @Autowired JdbcClient jdbc;

    TestRides rides;
    UUID city;

    @BeforeEach
    void city() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        city = rides.city("test-fault-change", "UAH", -131);
    }

    @Test
    void puttingItOnTheDriverCountsTheCancellationAndTakingItOffStopsCounting() {
        TestRides.Ride ride = ride();
        acceptedAgo(ride, 5 * 60);
        OrderView cancelled = riderCancels(ride, "CHANGED_MIND");
        assertThat(cancelled.cancellation().fault()).isEqualTo("CLIENT");
        assertThat(row(ride)).as("a rider's cancellation counts nothing").isNull();
        Actor staff = staff(Orders.CHANGE_FAULT_PERMISSION);

        OrderView driver = orders.changeCancellationFault(staff, UUID.randomUUID(), ride.order().id(),
                cancelled.version(), "DRIVER", "The driver stood still for 20 minutes; the rider called");

        assertThat(driver.cancellation().fault()).isEqualTo("DRIVER");
        assertThat(row(ride)).isEqualTo("STAFF:true:null");
        Map<String, Object> event = jdbc.sql("""
                        select payload ->> 'fault' as fault, payload ->> 'fault_before' as before,
                               payload ->> 'driver_id' as driver, reason
                        from order_event where order_id = :o and type = 'CancellationFaultChanged'""")
                .param("o", ride.order().id()).query().singleRow();
        assertThat(event).containsEntry("fault", "DRIVER").containsEntry("before", "CLIENT")
                .containsEntry("driver", ride.driver().actor().id().toString())
                .containsEntry("reason", "The driver stood still for 20 minutes; the rider called");
        assertThat(jdbc.sql("""
                        select count(*) from audit_log where action = 'order.cancellation_fault'
                          and resource_id = :o and actor_id = :staff""")
                .param("o", ride.order().id().toString()).param("staff", staff.id()).query(Integer.class).single())
                .isEqualTo(1);

        orders.changeCancellationFault(staff, UUID.randomUUID(), ride.order().id(), driver.version(), "CLIENT",
                "A second look: the rider changed their mind");
        assertThat(row(ride)).isEqualTo("STAFF:false:STAFF");
    }

    @Test
    void aDriversOwnCountedCancellationStopsCountingWhenStaffTakeTheFaultOff() {
        String code = driverReason();
        TestRides.Ride ride = ride();
        acceptedAgo(ride, 5 * 60);
        trips.cancel(ride.driver().actor(), UUID.randomUUID(), ride.trip().id(),
                trips.current(ride.driver().actor()).orElseThrow().version(), code);
        assertThat(row(ride)).isEqualTo("DRIVER:true:null");

        OrderView now = orders.get(ride.order().id());
        orders.changeCancellationFault(staff(Orders.CHANGE_FAULT_PERMISSION), UUID.randomUUID(), now.id(),
                now.version(), "NONE", "The road was closed by the police");

        assertThat(row(ride)).isEqualTo("DRIVER:false:STAFF");
    }

    @Test
    void theSameCommandTwiceChangesOnce() {
        TestRides.Ride ride = ride();
        OrderView cancelled = riderCancels(ride, "CHANGED_MIND");
        Actor staff = staff(Orders.CHANGE_FAULT_PERMISSION);
        UUID command = UUID.randomUUID();

        OrderView first = orders.changeCancellationFault(staff, command, ride.order().id(), cancelled.version(),
                "NONE", "Test order by mistake");
        OrderView again = orders.changeCancellationFault(staff, command, ride.order().id(), cancelled.version(),
                "NONE", "Test order by mistake");

        assertThat(again.version()).isEqualTo(first.version());
        assertThat(jdbc.sql("select count(*) from order_event where order_id = :o and type = 'CancellationFaultChanged'")
                .param("o", ride.order().id()).query(Integer.class).single()).isEqualTo(1);
    }

    @Test
    void onlyACancelledOrderWithAnotherFaultAndTheRightAndAComment() {
        TestRides.Ride ride = ride();
        OrderView assigned = orders.get(ride.order().id());
        Actor staff = staff(Orders.CHANGE_FAULT_PERMISSION);
        assertCode(() -> orders.changeCancellationFault(staff, UUID.randomUUID(), assigned.id(), assigned.version(),
                "DRIVER", "Not yet"), ErrorCode.STATE_CONFLICT);

        OrderView cancelled = riderCancels(ride, "CHANGED_MIND");
        String fault = cancelled.cancellation().fault();
        assertCode(() -> orders.changeCancellationFault(staff, UUID.randomUUID(), cancelled.id(), cancelled.version(),
                fault, "The same"), ErrorCode.STATE_CONFLICT);
        assertCode(() -> orders.changeCancellationFault(staff, UUID.randomUUID(), cancelled.id(), cancelled.version(),
                "SOMEONE", "Unknown"), ErrorCode.VALIDATION_FAILED);
        assertCode(() -> orders.changeCancellationFault(staff, UUID.randomUUID(), cancelled.id(), cancelled.version(),
                "NONE", "  "), ErrorCode.VALIDATION_FAILED);
        assertCode(() -> orders.changeCancellationFault(staff, UUID.randomUUID(), cancelled.id(),
                cancelled.version() - 1, "NONE", "Stale"), ErrorCode.VERSION_CONFLICT);
        assertCode(() -> orders.changeCancellationFault(staff(Orders.CANCEL_PERMISSION), UUID.randomUUID(),
                cancelled.id(), cancelled.version(), "NONE", "Only the right to cancel"), ErrorCode.ACCESS_DENIED);
        Actor elsewhere = staffOfOtherCity(Orders.CHANGE_FAULT_PERMISSION);
        assertThatThrownBy(() -> orders.changeCancellationFault(elsewhere, UUID.randomUUID(), cancelled.id(),
                cancelled.version(), "NONE", "Another city")).isInstanceOf(DomainException.class);
        assertThat(orders.get(cancelled.id()).cancellation().fault()).as("nothing changed").isEqualTo(fault);
    }

    // ------------------------------------------------------------ helpers

    private TestRides.Ride ride() {
        rides.city("test-fault-change", "UAH", -131);
        return rides.assigned(city, rides.driverNear(PICKUP), PICKUP, DROPOFF);
    }

    private OrderView riderCancels(TestRides.Ride ride, String code) {
        OrderView now = orders.get(ride.order().id());
        return orders.cancel(ride.payer(), UUID.randomUUID(), now.id(), now.version(), code);
    }

    private void acceptedAgo(TestRides.Ride ride, int seconds) {
        jdbc.sql("update assignment set created_at = now() - make_interval(secs => :s) where order_id = :o")
                .param("s", seconds).param("o", ride.order().id()).update();
    }

    /** source:counted:not_counted_why of the order's counted-cancellation row, or null without one. */
    private String row(TestRides.Ride ride) {
        return jdbc.sql("""
                        select source || ':' || counted || ':' || coalesce(not_counted_why, 'null')
                        from driver_cancellation where order_id = :o""")
                .param("o", ride.order().id()).query(String.class).optional().orElse(null);
    }

    private String driverReason() {
        String code = "CHANGE_TEST_" + Long.toString(System.nanoTime() % 1_000_000_000L, 36).toUpperCase();
        reasons.create(staff(CancelReasons.MANAGE_PERMISSION), UUID.randomUUID(), new CancelReasons.Draft(
                CancelReasons.Audience.DRIVER, code, Map.of("ru", "Не поеду"), CancelReasons.DriverOutcome.CANCEL_ORDER,
                false, false, true, 910), "Test of ADR 0019");
        return code;
    }

    private Actor staff(String permission) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, all_cities, state, created_at,
                                                updated_at)
                        values (:id, :login, 'Fault', 'ADMIN', :permissions, true, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "fault-change-" + id).param("permissions", new String[] {permission})
                .update();
        return new Actor(SubjectType.STAFF, id);
    }

    private Actor staffOfOtherCity(String permission) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, all_cities, state, created_at,
                                                updated_at)
                        values (:id, :login, 'Fault', 'ADMIN', :permissions, false, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "fault-change-" + id).param("permissions", new String[] {permission})
                .update();
        return new Actor(SubjectType.STAFF, id);
    }

    private static void assertCode(Runnable call, ErrorCode code) {
        assertThatThrownBy(call::run).isInstanceOfSatisfying(DomainException.class,
                e -> assertThat(e.code()).isEqualTo(code));
    }
}
