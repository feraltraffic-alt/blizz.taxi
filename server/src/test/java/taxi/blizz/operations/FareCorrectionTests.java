package taxi.blizz.operations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.SessionService;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.ConflictException;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.InvariantChecks;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.platform.internal.OutboxRelay;
import taxi.blizz.pricing.FinalFares;
import taxi.blizz.pricing.QuoteService;

/**
 * Issue #142, part B (REQ-ADM-03, REQ-PRC-10): staff correct a fulfilled order's final fare with a reason and their
 * password; a new version is written, the original stays, and the difference is posted to the journal once. A lower
 * fare after the rider paid becomes a refund obligation (E3), visible in the fare and the history; two corrections at
 * once have one winner (E2); a repeat posts nothing more (E4). Its own city at longitude 107.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class FareCorrectionTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, 107.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 107.55);
    static final String PASSWORD = "Fare-Correction-Test-2026";

    @Autowired FareCorrections corrections;
    @Autowired FinalFares fares;
    @Autowired Orders orders;
    @Autowired Dispatch dispatch;
    @Autowired Trips trips;
    @Autowired WorkSessions sessions;
    @Autowired SessionService auth;
    @Autowired QuoteService quotes;
    @Autowired OutboxRelay relay;
    @Autowired List<InvariantChecks> invariants;
    @Autowired JdbcClient jdbc;

    TestRides rides;
    UUID city;

    @BeforeEach
    void city() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        city = rides.city("test-fare-corrections", "UAH", 107);
        jdbc.sql("""
                        update ride_order set status = 'UNFULFILLED'
                        where city_id = :c and status in ('READY', 'SEARCHING', 'ASSIGNED', 'IN_SERVICE')""")
                .param("c", city).update();
    }

    // ------------------------------------------------------------ fixtures

    private void deliverEvents() {
        while (relay.runOnce() > 0) {
            // drain
        }
    }

    private Actor staff(UUID scope, String... permissions) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, all_cities, city_scope, state,
                                                password_hash, created_at, updated_at)
                        values (:id, :login, 'Finance', 'ADMIN', :permissions, false, :scope, 'ACTIVE', :hash, now(),
                                now())""")
                .param("id", id).param("login", "fares-" + id).param("permissions", permissions)
                .param("scope", new UUID[] {scope}).param("hash", new BCryptPasswordEncoder(4).encode(PASSWORD))
                .update();
        return new Actor(SubjectType.STAFF, id);
    }

    private Actor corrector() {
        return staff(city, FareCorrections.CORRECT_PERMISSION, Orders.VIEW_PERMISSION);
    }

    /** A fulfilled cash ride, its fare posted; {@code cashReceived} false leaves the rider owing the whole fare. */
    private TestRides.Ride fulfilled(boolean cashReceived) {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        TestRides.Ride ride = rides.started(city, driver, PICKUP, DROPOFF);
        rides.complete(ride, cashReceived);
        jdbc.sql("""
                        update work_session set state = 'CLOSED', closed_at = now()
                        where driver_id = :d and state <> 'CLOSED'""")
                .param("d", driver.actor().id()).update();
        deliverEvents();
        return ride;
    }

    private FinalFares.Version latest(UUID order) {
        return fares.versions(order).getLast();
    }

    private long net(UUID order, String account, boolean credit) {
        return jdbc.sql("""
                        select coalesce(sum(case when :credit then l.credit_minor - l.debit_minor
                                                  else l.debit_minor - l.credit_minor end), 0)
                        from journal_line l join journal_transaction t on t.id = l.transaction_id
                        where t.basis_id = :order and t.basis_type in ('TRIP_FARE', 'FARE_CORRECTION')
                          and l.account = :account""")
                .param("credit", credit).param("order", order).param("account", account)
                .query(Long.class).single();
    }

    private long refunds(UUID order) {
        return jdbc.sql("""
                        select coalesce(sum(l.credit_minor - l.debit_minor), 0)
                        from journal_line l join journal_transaction t on t.id = l.transaction_id
                        where t.basis_id = :order and l.account = 'REFUNDS_PAYABLE'""")
                .param("order", order).query(Long.class).single();
    }

    private long postings(UUID order) {
        return jdbc.sql("""
                        select count(*) from journal_transaction
                        where basis_id = :o and basis_type = 'FARE_CORRECTION'""")
                .param("o", order).query(Long.class).single();
    }

    /** The journal agrees with the latest version: the fare owed (less refunds), the commission, the driver's share. */
    private void assertJournalMatches(UUID order) {
        FinalFares.Version fare = latest(order);
        assertThat(net(order, "RIDER_RECEIVABLE", false) - refunds(order)).as("fare owed less refunds")
                .isEqualTo(fare.amountMinor());
        assertThat(net(order, "SERVICE_COMMISSION", true)).isEqualTo(fare.commissionMinor());
        assertThat(net(order, "DRIVER_PAYABLE", true)).isEqualTo(fare.driverShareMinor());
        assertThat(jdbc.sql("""
                        select count(*) from journal_transaction t
                        where t.basis_id = :o and (select sum(debit_minor) - sum(credit_minor) from journal_line
                                                   where transaction_id = t.id) <> 0""")
                .param("o", order).query(Long.class).single()).as("every posting balanced").isZero();
    }

    private static void assertCode(ThrowingCallable call, ErrorCode code) {
        assertThatThrownBy(call).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }

    // ------------------------------------------------------------ tests

    @Test
    void aHigherFareIsANewVersionAndOneDebtPostingARepeatPostsNothingMore() {
        UUID order = fulfilled(true).order().id();
        Actor staff = corrector();
        FinalFares.Version first = latest(order);

        UUID command = UUID.randomUUID();
        FareCorrections.View view = corrections.correct(staff, command, order, 1, first.amountMinor() + 1_000,
                "Waiting at the airport was not counted", PASSWORD);
        assertThat(view.currentVersion()).isEqualTo(2);
        assertThat(view.refundObligationMinor()).isZero();
        assertThat(view.refundState()).isEqualTo("NONE");
        FinalFares.Version second = latest(order);
        assertThat(second.correctsId()).isEqualTo(first.id());
        assertThat(second.authorId()).isEqualTo(staff.id());
        assertThat(second.reason()).isEqualTo("Waiting at the airport was not counted");
        assertThat(second.commissionMinor() + second.driverShareMinor()).isEqualTo(second.amountMinor());
        assertThat(fares.versions(order).getFirst()).as("the original is never changed").isEqualTo(first);
        assertThat(orders.get(order).finalPriceMinor()).isEqualTo((Long) second.amountMinor());
        assertJournalMatches(order);

        // E4: the same command again gives the same result and posts nothing.
        assertThat(corrections.correct(staff, command, order, 1, first.amountMinor() + 1_000,
                "Waiting at the airport was not counted", PASSWORD)).isEqualTo(view);
        assertThat(postings(order)).isEqualTo(1);
        assertJournalMatches(order);
        assertThat(jdbc.sql("select count(*) from audit_log where action = 'fare.correct' and resource_id = :id")
                .param("id", order.toString()).query(Long.class).single()).isEqualTo(1);
    }

    @Test
    void aLowerFareAfterPaymentIsARefundObligationVisibleInTheFareAndTheHistory() {
        UUID paid = fulfilled(true).order().id();
        Actor staff = corrector();
        long amount = latest(paid).amountMinor();

        FareCorrections.View view = corrections.correct(staff, UUID.randomUUID(), paid, 1, amount - 1_500,
                "Detour by the driver", PASSWORD);
        assertThat(view.refundObligationMinor()).isEqualTo(1_500);
        assertThat(view.refundState()).isEqualTo("WAITING_FOR_REFUND_FLOW");
        assertThat(corrections.fare(staff, paid)).isEqualTo(view);
        assertThat(refunds(paid)).isEqualTo(1_500);
        assertJournalMatches(paid);
        Orders.TimelineEntry entry = orders.timeline(staff, paid).getLast();
        assertThat(entry.type()).isEqualTo("FareCorrected");
        assertThat(entry.reason()).isEqualTo("Detour by the driver");
        assertThat(entry.details()).containsEntry("refund_obligation_minor", 1_500)
                .containsEntry("refund_state", "WAITING_FOR_REFUND_FLOW");
        taxi.blizz.EventContracts.assertOrderEventsConform(jdbc, paid, "FareCorrected");

        // Unpaid: the lower fare only reduces the rider's open debt on the order.
        UUID unpaid = fulfilled(false).order().id();
        long owed = latest(unpaid).amountMinor();
        FareCorrections.View reduced = corrections.correct(staff, UUID.randomUUID(), unpaid, 1, owed - 1_000,
                "Detour by the driver", PASSWORD);
        assertThat(reduced.refundObligationMinor()).isZero();
        assertThat(reduced.refundState()).isEqualTo("NONE");
        assertJournalMatches(unpaid);
    }

    @Test
    void twoCorrectionsAtOnceHaveOneWinnerAndTheJournalOneDifference() throws Exception {
        UUID order = fulfilled(true).order().id();
        Actor staff = corrector();
        long amount = latest(order).amountMinor();
        CountDownLatch start = new CountDownLatch(1);
        ExecutorService pool = Executors.newFixedThreadPool(2);
        List<Future<FareCorrections.View>> results = new ArrayList<>();
        for (long delta : new long[] {700, 900}) {
            Callable<FareCorrections.View> call = () -> {
                start.await();
                return corrections.correct(staff, UUID.randomUUID(), order, 1, amount + delta, "Race", PASSWORD);
            };
            results.add(pool.submit(call));
        }
        start.countDown();
        int won = 0;
        List<Throwable> lost = new ArrayList<>();
        for (Future<FareCorrections.View> result : results) {
            try {
                result.get();
                won++;
            } catch (java.util.concurrent.ExecutionException e) {
                lost.add(e.getCause());
            }
        }
        pool.shutdown();
        assertThat(won).isEqualTo(1);
        assertThat(lost).singleElement().isInstanceOf(ConflictException.class)
                .satisfies(e -> assertThat(((ConflictException) e).currentVersion()).isEqualTo(2));
        assertThat(fares.versions(order)).hasSize(2);
        assertThat(postings(order)).isEqualTo(1);
        assertJournalMatches(order);
    }

    @Test
    void onlyWithThePermissionInTheCityAPasswordAReasonAndTheCurrentVersion() {
        TestRides.Ride ride = fulfilled(true);
        UUID order = ride.order().id();
        long amount = latest(order).amountMinor();
        Actor staff = corrector();

        assertCode(() -> corrections.correct(staff(city, Orders.VIEW_PERMISSION), UUID.randomUUID(), order, 1,
                amount + 1, "No permission", PASSWORD), ErrorCode.ACCESS_DENIED);
        UUID elsewhere = rides.city("test-fare-corrections-other", "UAH", 106);
        assertCode(() -> corrections.correct(staff(elsewhere, FareCorrections.CORRECT_PERMISSION), UUID.randomUUID(),
                order, 1, amount + 1, "Another city", PASSWORD), ErrorCode.ACCESS_DENIED);
        assertCode(() -> corrections.correct(staff, UUID.randomUUID(), order, 1, amount + 1, "Wrong password",
                "not-my-password"), ErrorCode.ACCESS_DENIED);
        assertThat(jdbc.sql("select failed_sign_ins from staff_user where id = :id").param("id", staff.id())
                .query(Integer.class).single()).as("counted like a failed sign-in").isEqualTo(1);
        assertCode(() -> corrections.correct(staff, UUID.randomUUID(), order, 1, amount + 1, " ", PASSWORD),
                ErrorCode.VALIDATION_FAILED);
        assertCode(() -> corrections.correct(staff, UUID.randomUUID(), order, 1, -1, "Negative", PASSWORD),
                ErrorCode.VALIDATION_FAILED);
        assertCode(() -> corrections.correct(staff, UUID.randomUUID(), order, 1, amount, "Same amount", PASSWORD),
                ErrorCode.STATE_CONFLICT);
        assertThatThrownBy(() -> corrections.correct(staff, UUID.randomUUID(), order, 2, amount + 1, "Ahead",
                PASSWORD)).isInstanceOf(ConflictException.class)
                .satisfies(e -> assertThat(((ConflictException) e).currentVersion()).isEqualTo(1));
        TestRides.Ride open = rides.assigned(city, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        assertCode(() -> corrections.correct(staff, UUID.randomUUID(), open.order().id(), 1, 1_000, "Not done",
                PASSWORD), ErrorCode.STATE_CONFLICT);
        assertThat(fares.versions(order)).hasSize(1);
        assertThat(postings(order)).isZero();

        // A final fare on an order not FULFILLED (e.g. reopened by support) is not corrected.
        jdbc.sql("update ride_order set status = 'IN_SERVICE' where id = :id").param("id", order).update();
        assertCode(() -> corrections.correct(staff, UUID.randomUUID(), order, 1, amount + 1, "Not fulfilled",
                PASSWORD), ErrorCode.STATE_CONFLICT);
        jdbc.sql("update ride_order set status = 'FULFILLED' where id = :id").param("id", order).update();

        // A card payment still being captured: its amount could still move.
        jdbc.sql("update ride_order set payment_state = 'CAPTURE_PENDING' where id = :id").param("id", order).update();
        assertCode(() -> corrections.correct(staff, UUID.randomUUID(), order, 1, amount + 1, "Capturing", PASSWORD),
                ErrorCode.PAYMENT_PENDING);
        jdbc.sql("update ride_order set payment_state = 'CASH_REPORTED' where id = :id").param("id", order).update();

        // Completed, but the fare not in the journal yet (its event not delivered): the open debt is unknown.
        TestRides.Driver driver = rides.driverNear(PICKUP);
        TestRides.Ride fresh = rides.started(city, driver, PICKUP, DROPOFF);
        rides.complete(fresh, true);
        UUID unposted = fresh.order().id();
        assertCode(() -> corrections.correct(staff, UUID.randomUUID(), unposted, 1, latest(unposted).amountMinor() + 1,
                "Too early", PASSWORD), ErrorCode.STATE_CONFLICT);
        assertThat(fares.versions(unposted)).as("rolled back with the refusal").hasSize(1);
        deliverEvents();
    }

    @Test
    void theFinanceInvariantsStayGreenAfterCorrections() {
        UUID order = fulfilled(true).order().id();
        Actor staff = corrector();
        long amount = latest(order).amountMinor();
        corrections.correct(staff, UUID.randomUUID(), order, 1, amount + 2_000, "Up", PASSWORD);
        corrections.correct(staff, UUID.randomUUID(), order, 2, amount - 500, "Down again", PASSWORD);
        assertJournalMatches(order);
        invariants.forEach(InvariantChecks::runChecks);
        assertThat(jdbc.sql("""
                        select count(*) from invariant_report r
                        where r.object_id in (select id from journal_transaction where basis_id = :o)""")
                .param("o", order).query(Long.class).single()).isZero();
    }
}
