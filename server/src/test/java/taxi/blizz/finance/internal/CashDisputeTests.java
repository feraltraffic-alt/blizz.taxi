package taxi.blizz.finance.internal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.time.Duration;
import java.util.List;
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
import taxi.blizz.finance.CashDisputes;
import taxi.blizz.finance.CashDisputes.Decision;
import taxi.blizz.finance.Ledger;
import taxi.blizz.finance.Ledger.Account;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.SessionService;
import taxi.blizz.operations.Dispatch;
import taxi.blizz.operations.Orders;
import taxi.blizz.operations.Trips;
import taxi.blizz.operations.WorkSessions;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.platform.internal.OutboxRelay;
import taxi.blizz.pricing.QuoteService;

/** A trip the driver reports as not paid, and support's decision (owner decision 28.10.2026). */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class CashDisputeTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, -69.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, -69.45);

    @Autowired
    CashDisputes disputes;
    @Autowired
    JdbcCashDisputes internal;
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

    @BeforeEach
    void setUp() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        cityId = rides.city("test-cash-disputes", "UAH", -70);
        offline();
    }

    /** Ends every shift in the city, so the next ride gets its own driver (offers go to the nearest). */
    private void offline() {
        jdbc.sql("update work_session set state = 'CLOSED', closed_at = now() where city_id = :c and state <> 'CLOSED'")
                .param("c", cityId).update();
    }

    private void drain() {
        while (relay.runOnce() > 0) {
            // deliver the events
        }
    }

    private Ride ride(boolean cashReceived) {
        Ride ride = rides.started(cityId, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        rides.complete(ride, cashReceived);
        offline();
        drain();
        return ride;
    }

    /** Holds part of the driver's share by hand, as the setting would (the setting is tested in FareLedgerTests). */
    private void hold(Ride ride, long held) {
        UUID driver = ride.driver().actor().id();
        ledger.post(new Ledger.Posting("test-hold:" + ride.order().id(), "TEST", ride.order().id(), "UAH",
                "test hold", List.of(Ledger.Line.debit(Account.DRIVER_PAYABLE, driver, held),
                        Ledger.Line.credit(Account.SUSPENSE, driver, held))));
        jdbc.sql("update cash_dispute set held_minor = :h where order_id = :o")
                .param("h", held).param("o", ride.order().id()).update();
    }

    private Actor staff(String... permissions) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, all_cities, state, created_at, updated_at)
                        values (:id, :login, 'Finance', 'ADMIN', :permissions, true, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "dispute-" + id).param("permissions", permissions).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private long net(Account account, UUID party) {
        return ledger.balances(account, party).stream().filter(b -> b.currency().equals("UAH"))
                .mapToLong(b -> b.debitMinor() - b.creditMinor()).sum();
    }

    private long flags(UUID driver) {
        return jdbc.sql("select count(*) from driver_risk_flag where driver_id = :d and kind = 'CASH_DISPUTE'")
                .param("d", driver).query(Long.class).single();
    }

    private static void assertCode(ThrowingCallable call, ErrorCode code) {
        assertThatThrownBy(call).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }

    @Test
    void anUnpaidTripOpensOneDisputeWithAFourteenDayDeadline() {
        Ride ride = ride(false);
        Actor finance = staff(CashDisputes.MANAGE_PERMISSION);
        CashDisputes.Dispute d = disputes.get(finance, ride.order().id());
        assertThat(d.decision()).isNull();
        assertThat(d.heldMinor()).as("default setting: the whole share credited").isZero();
        assertThat(d.riderDebtMinor()).isEqualTo(net(Account.RIDER_RECEIVABLE, ride.payer().id()));
        assertThat(Duration.between(d.openedAt(), d.decideBy())).isEqualTo(Duration.ofDays(14));
        assertThat(disputes.open(finance, 100)).extracting(CashDisputes.Dispute::orderId).contains(ride.order().id());

        assertCode(() -> disputes.get(staff("settings.manage"), ride.order().id()), ErrorCode.ACCESS_DENIED);
        assertCode(() -> disputes.get(finance, UUID.randomUUID()), ErrorCode.NOT_FOUND);
        Ride paid = ride(true);
        assertCode(() -> disputes.get(finance, paid.order().id()), ErrorCode.NOT_FOUND);
    }

    @Test
    void riderPaidClearsTheDebtReleasesTheHeldPartAndFlagsTheDriver() {
        Ride ride = ride(false);
        UUID driver = ride.driver().actor().id();
        long share = -net(Account.DRIVER_PAYABLE, driver);
        hold(ride, share / 2);
        long debt = net(Account.RIDER_RECEIVABLE, ride.payer().id());
        assertThat(debt).isPositive();

        Actor finance = staff(CashDisputes.MANAGE_PERMISSION);
        long version = disputes.get(finance, ride.order().id()).version();
        assertCode(() -> disputes.decide(finance, UUID.randomUUID(), ride.order().id(), version, Decision.RIDER_PAID,
                " "), ErrorCode.VALIDATION_FAILED);
        assertCode(() -> disputes.decide(finance, UUID.randomUUID(), ride.order().id(), version + 3,
                Decision.RIDER_PAID, "x"), ErrorCode.VERSION_CONFLICT);
        assertCode(() -> disputes.decide(staff("settings.manage"), UUID.randomUUID(), ride.order().id(), version,
                Decision.RIDER_PAID, "x"), ErrorCode.ACCESS_DENIED);
        UUID command = UUID.randomUUID();
        CashDisputes.Dispute decided = disputes.decide(finance, command, ride.order().id(), version,
                Decision.RIDER_PAID, "The rider showed a photo of the payment");
        assertThat(disputes.decide(finance, command, ride.order().id(), version, Decision.RIDER_PAID,
                "The rider showed a photo of the payment").version()).as("a repeat").isEqualTo(decided.version());
        assertCode(() -> disputes.decide(finance, UUID.randomUUID(), ride.order().id(), decided.version(),
                Decision.PAY_DRIVER, "again"), ErrorCode.STATE_CONFLICT);
        drain();

        assertThat(net(Account.RIDER_RECEIVABLE, ride.payer().id())).as("the rider owes nothing").isZero();
        assertThat(net(Account.SUSPENSE, driver)).as("nothing held").isZero();
        // The driver holds the rider's cash and owes the commission, as on any cash trip.
        assertThat(net(Account.DRIVER_PAYABLE, driver)).isEqualTo(debt - share);
        assertThat(flags(driver)).isEqualTo(1);
        assertThat(jdbc.sql("select count(*) from audit_log where action = 'cash-dispute.decide' and actor_id = :a")
                .param("a", finance.id()).query(Long.class).single()).isEqualTo(1);
    }

    @Test
    void payDriverReleasesTheHeldPartAndKeepHeldMovesNothing() {
        Actor finance = staff(CashDisputes.MANAGE_PERMISSION);
        for (Decision decision : new Decision[] {Decision.PAY_DRIVER, Decision.KEEP_HELD}) {
            Ride ride = ride(false);
            UUID driver = ride.driver().actor().id();
            hold(ride, 1000);
            long payable = net(Account.DRIVER_PAYABLE, driver);
            long debt = net(Account.RIDER_RECEIVABLE, ride.payer().id());

            disputes.decide(finance, UUID.randomUUID(), ride.order().id(),
                    disputes.get(finance, ride.order().id()).version(), decision, "The rider does not answer");
            drain();

            assertThat(net(Account.RIDER_RECEIVABLE, ride.payer().id())).as("the debt stays").isEqualTo(debt);
            if (decision == Decision.PAY_DRIVER) {
                assertThat(net(Account.SUSPENSE, driver)).isZero();
                assertThat(net(Account.DRIVER_PAYABLE, driver)).isEqualTo(payable - 1000);
            } else {
                assertThat(net(Account.SUSPENSE, driver)).isEqualTo(-1000);
                assertThat(net(Account.DRIVER_PAYABLE, driver)).isEqualTo(payable);
            }
            assertThat(flags(driver)).isZero();
        }
    }

    /** Owner decision 28.10.2026: past 14 days nothing moves by itself; it becomes one urgent task. */
    @Test
    void anUndecidedDisputePastItsDeadlineBecomesOneUrgentTaskAndMovesNoMoney() {
        Ride late = ride(false);
        UUID driver = late.driver().actor().id();
        long payable = net(Account.DRIVER_PAYABLE, driver);
        Ride fresh = ride(false);
        jdbc.sql("update cash_dispute set decide_by = now() - interval '1 minute' where order_id = :o")
                .param("o", late.order().id()).update();

        while (internal.reportOverdue() > 0) {
            // disputes of other tests may be overdue too
        }
        assertThat(internal.reportOverdue()).as("once").isZero();
        drain();

        String sql = "select count(*) from support_case where source_key = :key and priority = 'URGENT'";
        assertThat(jdbc.sql(sql).param("key", "cash-dispute-overdue:" + late.order().id()).query(Long.class).single())
                .isEqualTo(1);
        assertThat(jdbc.sql(sql).param("key", "cash-dispute-overdue:" + fresh.order().id()).query(Long.class).single())
                .isZero();
        assertThat(net(Account.DRIVER_PAYABLE, driver)).as("no money moved").isEqualTo(payable);
        assertThat(disputes.get(staff(CashDisputes.MANAGE_PERMISSION), late.order().id()).decision()).isNull();
    }
}
