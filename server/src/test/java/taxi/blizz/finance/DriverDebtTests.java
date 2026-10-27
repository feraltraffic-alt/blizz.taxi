package taxi.blizz.finance;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.TestRides;
import taxi.blizz.TestRides.Driver;
import taxi.blizz.TestRides.Ride;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.SessionService;
import taxi.blizz.operations.DriverAvailability;
import taxi.blizz.operations.Dispatch;
import taxi.blizz.operations.Orders;
import taxi.blizz.operations.Trips;
import taxi.blizz.operations.WorkSessions;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.OutboxHandler;
import taxi.blizz.platform.OutboxMessage;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.platform.internal.OutboxRelay;
import taxi.blizz.pricing.QuoteService;

/**
 * Driver debt limit (REQ-PAY-16): over the admin's limit no new orders, the trip in progress goes on, paying
 * in lifts the block. Own currency (CZK) so the limit never touches other test classes.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class DriverDebtTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, 150.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 150.55);

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
    DriverDebts debts;
    @Autowired
    OutboxRelay relay;
    @Autowired
    List<OutboxHandler> handlers;
    @Autowired
    JdbcClient jdbc;
    @Autowired
    TransactionTemplate tx;

    TestRides rides;
    UUID cityId;
    Actor finance;

    @BeforeEach
    void setUp() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        cityId = rides.city("test-driver-debt", "CZK", 150);
        finance = staff(DriverDebts.MANAGE_PERMISSION);
        setLimit(null);
    }

    private Actor staff(String... permissions) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, state, created_at, updated_at)
                        values (:id, :login, 'Finance', 'ADMIN', :permissions, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "finance-" + id).param("permissions", permissions).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private DriverDebts.Limit setLimit(Long limit) {
        return debts.setLimit(finance, UUID.randomUUID(), "CZK", limit, debts.limit("CZK").version(), "test");
    }

    private void deliverEvents() {
        while (relay.runOnce() > 0) {
            // drain
        }
    }

    private DriverDebts.Status status(Driver driver) {
        return debts.statusOf(driver.actor().id()).stream().filter(s -> s.currency().equals("CZK"))
                .findFirst().orElseThrow();
    }

    private static void assertCode(ThrowingCallable call, ErrorCode code) {
        assertThatThrownBy(call).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }

    @Test
    void overTheLimitNoNewOrdersButTheTripInProgressGoesOnAndPayingInLiftsTheBlock() {
        Driver driver = rides.driverNear(PICKUP);
        rides.complete(rides.started(cityId, driver, PICKUP, DROPOFF), true);
        deliverEvents();
        long owedAfterFirst = status(driver).owedMinor();
        assertThat(owedAfterFirst).as("cash commission").isPositive();
        assertThat(status(driver).blocked()).isFalse();

        Ride second = rides.started(cityId, driver, PICKUP, DROPOFF);
        setLimit(0L);
        deliverEvents();
        assertThat(status(driver).blocked()).isTrue();
        assertThat(sessions.availability(driver.actor().id()).ineligibleReasons()).contains("DEBT_LIMIT");

        // The trip in progress is never interrupted (REQ-PAY-16).
        assertThat(rides.complete(second, true).phase()).isEqualTo("COMPLETED");
        deliverEvents();

        DriverAvailability blocked = sessions.availability(driver.actor().id());
        assertThat(blocked.eligible()).isFalse();
        assertThat(blocked.ineligibleReasons()).contains("DEBT_LIMIT");
        rides.moveTo(driver, TestRides.north(PICKUP, 500));
        rides.order(rides.client(), cityId, PICKUP, DROPOFF);
        assertThat(dispatch.offers(driver.actor())).as("no offer while blocked").isEmpty();

        long owed = status(driver).owedMinor();
        UUID command = UUID.randomUUID();
        DriverDebts.Status paid = debts.recordPayment(finance, command, driver.actor().id(), "CZK", owed,
                "cash-desk-17", "Paid in at the office");
        assertThat(debts.recordPayment(finance, command, driver.actor().id(), "CZK", owed, "cash-desk-17",
                "Paid in at the office")).isEqualTo(paid);
        assertThat(paid.owedMinor()).isZero();
        assertThat(paid.blocked()).isFalse();
        deliverEvents();
        assertThat(sessions.availability(driver.actor().id()).ineligibleReasons()).doesNotContain("DEBT_LIMIT");
    }

    @Test
    void raisingOrRemovingTheLimitUnblocks() {
        Driver driver = rides.driverNear(PICKUP);
        setLimit(0L);
        rides.complete(rides.started(cityId, driver, PICKUP, DROPOFF), true);
        deliverEvents();
        assertThat(status(driver).blocked()).isTrue();

        setLimit(status(driver).owedMinor());
        assertThat(status(driver).blocked()).as("owed equal to the limit is allowed").isFalse();
        setLimit(0L);
        assertThat(status(driver).blocked()).isTrue();
        setLimit(null);
        assertThat(status(driver).blocked()).isFalse();
        deliverEvents();
        assertThat(sessions.availability(driver.actor().id()).ineligibleReasons()).doesNotContain("DEBT_LIMIT");
    }

    @Test
    void onlyFinanceStaffChangeTheLimitAndVersionsAreChecked() {
        Actor other = staff("orders.cancel");
        long version = debts.limit("CZK").version();
        assertCode(() -> debts.setLimit(other, UUID.randomUUID(), "CZK", 100L, version, "x"), ErrorCode.ACCESS_DENIED);
        assertCode(() -> debts.recordPayment(other, UUID.randomUUID(), UUID.randomUUID(), "CZK", 100, "r", "x"),
                ErrorCode.ACCESS_DENIED);
        assertCode(() -> debts.setLimit(finance, UUID.randomUUID(), "CZK", 100L, version + 5, "x"),
                ErrorCode.VERSION_CONFLICT);
        assertCode(() -> debts.setLimit(finance, UUID.randomUUID(), "CZK", -1L, version, "x"),
                ErrorCode.VALIDATION_FAILED);
        assertCode(() -> debts.recordPayment(finance, UUID.randomUUID(), UUID.randomUUID(), "CZK", 0, "r", "x"),
                ErrorCode.VALIDATION_FAILED);
    }

    @Test
    void aStaleStatusEventDoesNotUndoANewerOne() {
        UUID driverId = UUID.randomUUID();
        OutboxHandler restriction = handlers.stream()
                .filter(h -> h.consumerId().equals("operations.driver-debt-restriction")).findFirst().orElseThrow();
        tx.executeWithoutResult(s -> {
            restriction.handle(event(driverId, false, 5));
            restriction.handle(event(driverId, true, 4));
        });
        assertThat(jdbc.sql("select active from driver_restriction where driver_id = :id")
                .param("id", driverId).query(Boolean.class).single()).isFalse();
    }

    private static OutboxMessage event(UUID driverId, boolean blocked, long version) {
        String payload = """
                {"driver_id":"%s","currency":"CZK","blocked":%s,"owed_minor":1,"limit_minor":0,"status_version":%d}"""
                .formatted(driverId, blocked, version);
        return new OutboxMessage(UUID.randomUUID(), "DriverDebtStatusChanged", 1, "DriverDebt", driverId, version,
                payload, UUID.randomUUID(), OffsetDateTime.now(), 0);
    }
}
