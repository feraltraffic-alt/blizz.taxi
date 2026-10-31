package taxi.blizz.operations.internal;

import static org.assertj.core.api.Assertions.assertThat;

import io.micrometer.core.instrument.MeterRegistry;
import java.time.Duration;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import taxi.blizz.TestQuotes;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.SessionService;
import taxi.blizz.operations.CreateOrder;
import taxi.blizz.operations.Dispatch;
import taxi.blizz.operations.FareCorrections;
import taxi.blizz.operations.OrderView;
import taxi.blizz.operations.Orders;
import taxi.blizz.operations.PaymentMethod;
import taxi.blizz.operations.TripCorrections;
import taxi.blizz.operations.TripView;
import taxi.blizz.operations.Trips;
import taxi.blizz.operations.WorkSessions;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DatabaseGauges;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.platform.internal.OutboxRelay;
import taxi.blizz.pricing.QuoteService;

/**
 * Review of #169 (issue #142, part C1): a capture held by a trip-facts correction must not outlive the card hold. A
 * held card trip whose hold expires within the margin (6 hours by default) is captured with the order's current fare
 * without the review, which stays open; a trip reviewed before is not captured twice. Its own city at longitude 97.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class HeldCaptureDeadlineTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, 97.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 97.55);
    static final String PASSWORD = "Held-Capture-Test-2026";
    /** blizz.payments.hold-timeout-seconds by default: a hold without its own deadline lasts 48 hours. */
    static final Duration PROVIDER_HOLD = Duration.ofHours(48);
    static final Duration MARGIN = Duration.ofHours(6);

    @Autowired HeldCaptureDeadline deadline;
    @Autowired TripCorrections corrections;
    @Autowired FareCorrections fares;
    @Autowired Orders orders;
    @Autowired Dispatch dispatch;
    @Autowired Trips trips;
    @Autowired WorkSessions sessions;
    @Autowired SessionService auth;
    @Autowired QuoteService quotes;
    @Autowired OutboxRelay relay;
    @Autowired JdbcClient jdbc;
    @Autowired List<DatabaseGauges> gauges;
    @Autowired MeterRegistry meters;

    TestRides rides;
    UUID city;

    @BeforeEach
    void city() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        city = rides.city("test-held-captures", "UAH", 97);
        jdbc.sql("""
                        update ride_order set status = 'UNFULFILLED'
                        where city_id = :c and status in ('READY', 'SEARCHING', 'ASSIGNED', 'IN_SERVICE')""")
                .param("c", city).update();
        deliverEvents();
    }

    /**
     * The fake provider's captures are left to nobody, even when a test fails halfway: another class's payment worker
     * would take them and use up that class's scripted answers.
     */
    @org.junit.jupiter.api.AfterEach
    void cancelLeftoverCaptures() {
        jdbc.sql("""
                        update payment_operation set state = 'CANCELLED'
                        where intent_id in (select id from payment_intent where city_id = :c)
                          and state in ('CREATED', 'SENDING', 'PENDING', 'UNKNOWN')""")
                .param("c", city).update();
    }

    // ------------------------------------------------------------ fixtures

    private void deliverEvents() {
        while (relay.runOnce() > 0) {
            // drain
        }
    }

    private Actor reviewer() {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, all_cities, city_scope, state,
                                                password_hash, created_at, updated_at)
                        values (:id, :login, 'Review', 'ADMIN', :permissions, false, :scope, 'ACTIVE', :hash, now(),
                                now())""")
                .param("id", id).param("login", "held-" + id)
                .param("permissions", new String[] {TripCorrections.CORRECT_PERMISSION,
                        FareCorrections.CORRECT_PERMISSION, Orders.VIEW_PERMISSION})
                .param("scope", new UUID[] {city}).param("hash", new BCryptPasswordEncoder(4).encode(PASSWORD))
                .update();
        return new Actor(SubjectType.STAFF, id);
    }

    /**
     * A card ride started, its start corrected as pressed by mistake (which holds the capture) and completed: the
     * capture waits for the review.
     */
    private TestRides.Ride heldCardRide(Actor staff) {
        UUID merchant = jdbc.sql("select merchant_id from payment_merchant_city where city_id = :city")
                .param("city", city).query(UUID.class).optional().orElseGet(() -> {
                    UUID id = UUID.randomUUID();
                    jdbc.sql("""
                                    insert into payment_merchant (id, provider, account, domain, secret_ref, currency,
                                                                  created_at)
                                    values (:id, 'FAKE', :account, 'test.blizz.invalid', 'test', 'UAH', now())""")
                            .param("id", id).param("account", "held_captures_" + id).update();
                    jdbc.sql("insert into payment_merchant_city (city_id, merchant_id) values (:city, :merchant)")
                            .param("city", city).param("merchant", id).update();
                    return id;
                });
        Actor rider = rides.client();
        jdbc.sql("""
                        insert into payment_card (id, client_id, merchant_id, token, masked_pan, card_type, state,
                                                  created_at)
                        values (:id, :client, :merchant, :token, '41****1111', 'Visa', 'ACTIVE', now())""")
                .param("id", UUID.randomUUID()).param("client", rider.id()).param("merchant", merchant)
                .param("token", "tok-" + rider.id()).update();
        TestRides.Driver driver = rides.driverNear(PICKUP);
        UUID quote = new TestQuotes(jdbc, quotes).quote(rider, city, "STANDARD", PICKUP, DROPOFF).id();
        OrderView order = orders.create(rider, UUID.randomUUID(), new CreateOrder(rider.id(), "STANDARD", PICKUP,
                "Home", DROPOFF, "Work", PaymentMethod.CARD, quote));
        assertThat(intent(order.id())).containsEntry("state", "AUTHORIZED");
        deliverEvents();
        dispatch.accept(driver.actor(), driver.device(), UUID.randomUUID(),
                dispatch.offers(driver.actor()).getFirst().id());
        TripView trip = trips.current(driver.actor()).orElseThrow();
        rides.moveTo(driver, TestRides.north(PICKUP, 30));
        trip = trips.arrive(driver.actor(), UUID.randomUUID(), trip.id(), trip.version(), null);
        trip = trips.start(driver.actor(), UUID.randomUUID(), trip.id(), trip.version(), null);
        corrections.correct(staff, UUID.randomUUID(), order.id(), trip.version(),
                new TripCorrections.Change(true, null, null), "Started before the rider got in");
        trip = trips.current(driver.actor()).orElseThrow();
        trip = trips.complete(driver.actor(), UUID.randomUUID(), trip.id(), trip.version(), OffsetDateTime.now(),
                null);
        jdbc.sql("update work_session set state = 'CLOSED', closed_at = now() where driver_id = :d and state <> 'CLOSED'")
                .param("d", driver.actor().id()).update();
        deliverEvents();
        assertThat(intent(order.id())).as("the capture waits for the review").containsEntry("state", "AUTHORIZED");
        assertThat(corrections.facts(staff, order.id()).captureHeld()).isTrue();
        return new TestRides.Ride(rider, driver, order, trip);
    }

    private Map<String, Object> intent(UUID order) {
        return jdbc.sql("select state, capture_minor from payment_intent where order_id = :o").param("o", order)
                .query().singleRow();
    }

    private void holdUntil(UUID order, Instant until) {
        jdbc.sql("update payment_intent set hold_until = :until where order_id = :o")
                .param("until", until.atOffset(ZoneOffset.UTC)).param("o", order).update();
    }

    private long settles(UUID order) {
        return jdbc.sql("""
                        select count(*) from payment_operation
                        where intent_id in (select id from payment_intent where order_id = :o) and type = 'SETTLE'""")
                .param("o", order).query(Long.class).single();
    }

    private long releasedEvents(UUID order) {
        return jdbc.sql("""
                        select count(*) from outbox
                        where aggregate_id = :o and event_type = 'TripCaptureReleased'""")
                .param("o", order).query(Long.class).single();
    }

    private void cancelLeftoverPayments(UUID order) {
        // The fake provider's capture is left to nobody: other test classes' payment workers would take it.
        jdbc.sql("""
                        update payment_operation set state = 'CANCELLED'
                        where intent_id in (select id from payment_intent where order_id = :o)
                          and state in ('CREATED', 'SENDING', 'PENDING', 'UNKNOWN')""")
                .param("o", order).update();
    }

    private double gauge(String name) {
        gauges.forEach(DatabaseGauges::refresh);
        return meters.get(name).gauge().value();
    }

    // ------------------------------------------------------------ tests

    @Test
    void aHeldCaptureStartsBeforeTheHoldExpiresWithTheCorrectedFareAndTheReviewStaysOpen() {
        Actor staff = reviewer();
        TestRides.Ride ride = heldCardRide(staff);
        UUID order = ride.order().id();
        long amount = orders.get(order).finalPriceMinor();
        fares.correct(staff, UUID.randomUUID(), order, 1, amount - 1_000, "Start pressed early", PASSWORD);
        Instant now = Instant.now().truncatedTo(ChronoUnit.SECONDS);
        holdUntil(order, now.plus(MARGIN).plus(Duration.ofHours(1)));

        assertThat(deadline.releaseExpiring(now)).as("seven hours left: it waits").isZero();
        assertThat(intent(order)).containsEntry("state", "AUTHORIZED");
        assertThat(gauge("blizz.trips.held_captures")).isGreaterThanOrEqualTo(1);
        assertThat(gauge("blizz.trips.held_capture.expiry.seconds"))
                .as("the first held hold expires in at most seven hours")
                .isLessThanOrEqualTo(MARGIN.plusHours(1).toSeconds());

        Instant later = now.plus(Duration.ofHours(1)).plusSeconds(60);
        assertThat(deadline.releaseExpiring(later)).as("within the margin: released").isGreaterThanOrEqualTo(1);
        deliverEvents();
        assertThat(intent(order)).containsEntry("state", "CAPTURE_PENDING")
                .containsEntry("capture_minor", amount - 1_000);
        TripCorrections.Facts facts = corrections.facts(staff, order);
        assertThat(facts.captureHeld()).isFalse();
        assertThat(facts.needsReview()).isTrue();
        assertThat(facts.corrections()).singleElement().satisfies(c -> {
            assertThat(c.reviewedAt()).as("the review still happens").isNull();
            assertThat(c.releasedByDeadlineAt()).isNotNull();
        });
        assertThat(jdbc.sql("""
                        select count(*) from audit_log
                        where action = 'trip.capture_release_by_deadline' and resource_id = :o""")
                .param("o", order.toString()).query(Long.class).single()).isOne();
        taxi.blizz.EventContracts.assertOrderEventsConform(jdbc, order, "TripCaptureReleased");

        assertThat(deadline.releaseExpiring(later.plusSeconds(60))).as("released once").isZero();
        TripCorrections.Facts reviewed = corrections.review(staff, UUID.randomUUID(), order, "Checked the track");
        assertThat(reviewed.corrections()).singleElement().satisfies(c -> assertThat(c.reviewedAt()).isNotNull());
        deliverEvents();
        assertThat(releasedEvents(order)).as("the review releases nothing more").isOne();
        assertThat(settles(order)).isOne();
        cancelLeftoverPayments(order);
    }

    @Test
    void aHoldWithoutItsOwnDeadlineLastsTheProvidersTimeoutFromTheAuthorization() {
        Actor staff = reviewer();
        TestRides.Ride ride = heldCardRide(staff);
        UUID order = ride.order().id();
        Instant authorized = jdbc.sql("""
                        select updated_at from payment_operation
                        where intent_id in (select id from payment_intent where order_id = :o)
                          and type = 'AUTH' and state = 'SUCCEEDED'""")
                .param("o", order).query(OffsetDateTime.class).single().toInstant();
        Instant due = authorized.plus(PROVIDER_HOLD).minus(MARGIN);

        assertThat(deadline.releaseExpiring(due.minusSeconds(60))).isZero();
        assertThat(intent(order)).containsEntry("state", "AUTHORIZED");
        assertThat(deadline.releaseExpiring(due.plusSeconds(1))).isGreaterThanOrEqualTo(1);
        deliverEvents();
        assertThat(intent(order)).containsEntry("state", "CAPTURE_PENDING");
        cancelLeftoverPayments(order);
    }

    @Test
    void theScheduledRunReleasesByTheServiceClock() throws Exception {
        Actor staff = reviewer();
        TestRides.Ride ride = heldCardRide(staff);
        UUID order = ride.order().id();
        holdUntil(order, Instant.now().plus(Duration.ofHours(1)));

        java.lang.reflect.Method run = HeldCaptureDeadline.class.getDeclaredMethod("run");
        assertThat(run.getAnnotation(org.springframework.scheduling.annotation.Scheduled.class))
                .as("the job runs by itself").isNotNull();
        run.setAccessible(true);
        run.invoke(deadline);
        deliverEvents();

        assertThat(intent(order)).containsEntry("state", "CAPTURE_PENDING");
        cancelLeftoverPayments(order);
    }

    @Test
    void aTripReviewedBeforeTheDeadlineIsNotCapturedTwice() {
        Actor staff = reviewer();
        TestRides.Ride ride = heldCardRide(staff);
        UUID order = ride.order().id();
        corrections.review(staff, UUID.randomUUID(), order, "Checked the track");
        deliverEvents();
        assertThat(intent(order)).containsEntry("state", "CAPTURE_PENDING");
        Instant now = Instant.now();
        holdUntil(order, now.plus(Duration.ofHours(1)));

        deadline.releaseExpiring(now);
        deliverEvents();

        assertThat(releasedEvents(order)).isOne();
        assertThat(settles(order)).isOne();
        assertThat(corrections.facts(staff, order).corrections())
                .allSatisfy(c -> assertThat(c.releasedByDeadlineAt()).isNull());
        cancelLeftoverPayments(order);
    }
}
