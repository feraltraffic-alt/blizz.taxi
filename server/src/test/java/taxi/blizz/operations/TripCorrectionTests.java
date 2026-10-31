package taxi.blizz.operations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.UUID;
import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
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
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.ConflictException;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.platform.internal.OutboxRelay;
import taxi.blizz.pricing.QuoteService;

/**
 * Issue #142, part C1 (REQ-CAN-07): staff correct a trip's facts after the start — the start pressed by mistake, the
 * right start or completion time — as records beside the trip's own times, with the reason and the author; no money
 * moves. A correction made before a card trip completes holds its capture until the review; a fare correction may come
 * in between, and the capture then takes the corrected fare. Its own city at longitude 104.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class TripCorrectionTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, 104.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 104.55);
    static final String PASSWORD = "Trip-Correction-Test-2026";

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

    TestRides rides;
    UUID city;

    @BeforeEach
    void city() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        city = rides.city("test-trip-corrections", "UAH", 104);
        jdbc.sql("""
                        update ride_order set status = 'UNFULFILLED'
                        where city_id = :c and status in ('READY', 'SEARCHING', 'ASSIGNED', 'IN_SERVICE')""")
                .param("c", city).update();
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

    private Actor staff(UUID scope, String... permissions) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, all_cities, city_scope, state,
                                                password_hash, created_at, updated_at)
                        values (:id, :login, 'Review', 'ADMIN', :permissions, false, :scope, 'ACTIVE', :hash, now(),
                                now())""")
                .param("id", id).param("login", "trips-" + id).param("permissions", permissions)
                .param("scope", new UUID[] {scope}).param("hash", new BCryptPasswordEncoder(4).encode(PASSWORD))
                .update();
        return new Actor(SubjectType.STAFF, id);
    }

    private Actor reviewer() {
        return staff(city, TripCorrections.CORRECT_PERMISSION, FareCorrections.CORRECT_PERMISSION,
                Orders.VIEW_PERMISSION);
    }

    private void offline(TestRides.Driver driver) {
        jdbc.sql("""
                        update work_session set state = 'CLOSED', closed_at = now()
                        where driver_id = :d and state <> 'CLOSED'""")
                .param("d", driver.actor().id()).update();
    }

    /** A card order in the city, its hold in place, accepted by a driver near the pickup and started. */
    private TestRides.Ride startedCardRide() {
        UUID merchant = jdbc.sql("select merchant_id from payment_merchant_city where city_id = :city")
                .param("city", city).query(UUID.class).optional().orElseGet(() -> {
                    UUID id = UUID.randomUUID();
                    jdbc.sql("""
                                    insert into payment_merchant (id, provider, account, domain, secret_ref, currency,
                                                                  created_at)
                                    values (:id, 'FAKE', :account, 'test.blizz.invalid', 'test', 'UAH', now())""")
                            .param("id", id).param("account", "trip_corrections_" + id).update();
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
        return new TestRides.Ride(rider, driver, order, trip);
    }

    private Map<String, Object> intent(UUID order) {
        return jdbc.sql("select state, capture_minor from payment_intent where order_id = :o").param("o", order)
                .query().singleRow();
    }

    private Map<String, Object> tripRow(UUID trip) {
        return jdbc.sql("select started_at, completed_at, version from trip where id = :id").param("id", trip)
                .query((rs, i) -> {
                    Map<String, Object> row = new java.util.HashMap<>();
                    row.put("started_at", rs.getObject(1, OffsetDateTime.class));
                    row.put("completed_at", rs.getObject(2, OffsetDateTime.class));
                    row.put("version", rs.getLong(3));
                    return row;
                }).single();
    }

    private long version(UUID trip) {
        return ((Number) tripRow(trip).get("version")).longValue();
    }

    private static void assertCode(ThrowingCallable call, ErrorCode code) {
        assertThatThrownBy(call).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }

    // ------------------------------------------------------------ tests

    @Test
    void aCorrectionAfterCompletionStandsBesideTheOriginalAndMovesNoMoney() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        TestRides.Ride ride = rides.started(city, driver, PICKUP, DROPOFF);
        TripView done = rides.complete(ride, true);
        offline(driver);
        deliverEvents();
        UUID order = ride.order().id();
        // A ride of 20 minutes, half an hour ago.
        jdbc.sql("""
                        update trip set arrived_at = now() - interval '30 minutes',
                                        started_at = now() - interval '25 minutes',
                                        completed_at = now() - interval '5 minutes'
                        where id = :id""")
                .param("id", done.id()).update();
        Map<String, Object> recorded = tripRow(done.id());
        long postings = jdbc.sql("select count(*) from journal_transaction where basis_id = :o").param("o", order)
                .query(Long.class).single();
        Actor staff = reviewer();
        OffsetDateTime started = ((OffsetDateTime) recorded.get("started_at")).plusMinutes(1)
                .truncatedTo(ChronoUnit.SECONDS);
        OffsetDateTime completed = ((OffsetDateTime) recorded.get("completed_at")).minusMinutes(2)
                .truncatedTo(ChronoUnit.SECONDS);

        UUID command = UUID.randomUUID();
        long before = version(done.id());
        TripCorrections.Facts facts = corrections.correct(staff, command, order, before,
                new TripCorrections.Change(false, started, completed), "The driver pressed complete late");
        assertThat(facts.correctedStartedAt()).isEqualTo(started);
        assertThat(facts.correctedCompletedAt()).isEqualTo(completed);
        assertThat(facts.startedAt()).isEqualTo(recorded.get("started_at"));
        assertThat(facts.needsReview()).isTrue();
        assertThat(facts.captureHeld()).as("completed already: nothing to hold").isFalse();
        assertThat(facts.corrections()).extracting(TripCorrections.Correction::kind)
                .containsExactlyInAnyOrder("STARTED_AT", "COMPLETED_AT");
        assertThat(facts.corrections()).allSatisfy(c -> assertThat(c.authorId()).isEqualTo(staff.id()));
        Map<String, Object> after = tripRow(done.id());
        assertThat(after.get("started_at")).as("the trip's own times never change")
                .isEqualTo(recorded.get("started_at"));
        assertThat(after.get("completed_at")).isEqualTo(recorded.get("completed_at"));
        assertThat(jdbc.sql("select count(*) from journal_transaction where basis_id = :o").param("o", order)
                .query(Long.class).single()).as("no money moves").isEqualTo(postings);
        assertThat(orders.timeline(staff, order).getLast().type()).isEqualTo("TripFactsCorrected");
        assertThat(corrections.correct(staff, command, order, before,
                new TripCorrections.Change(false, started, completed), "The driver pressed complete late"))
                .as("a repeat returns the first result").isEqualTo(facts);
        assertThat(corrections.facts(staff, order)).isEqualTo(facts);
        assertThat(jdbc.sql("select count(*) from audit_log where action = 'trip.correct' and resource_id = :id")
                .param("id", order.toString()).query(Long.class).single()).isEqualTo(1);

        TripCorrections.Facts reviewed = corrections.review(staff, UUID.randomUUID(), order, "Checked the track");
        assertThat(reviewed.corrections()).allSatisfy(c -> assertThat(c.reviewedBy()).isEqualTo(staff.id()));
        assertCode(() -> corrections.review(staff, UUID.randomUUID(), order, "Again"), ErrorCode.STATE_CONFLICT);
    }

    @Test
    void aCardTripCorrectedBeforeCompletionIsCapturedOnlyAfterTheReviewAtTheCorrectedFare() {
        TestRides.Ride ride = startedCardRide();
        UUID order = ride.order().id();
        Actor staff = reviewer();
        TripCorrections.Facts held = corrections.correct(staff, UUID.randomUUID(), order, version(ride.trip().id()),
                new TripCorrections.Change(true, null, null), "Started before the rider got in");
        assertThat(held.startVoid()).isTrue();
        assertThat(held.corrections()).singleElement().satisfies(c -> assertThat(c.holdsCapture()).isTrue());

        TripView trip = trips.current(ride.driver().actor()).orElseThrow();
        trips.complete(ride.driver().actor(), UUID.randomUUID(), trip.id(), trip.version(), OffsetDateTime.now(),
                null);
        offline(ride.driver());
        deliverEvents();
        assertThat(intent(order)).as("the capture waits for the review").containsEntry("state", "AUTHORIZED")
                .containsEntry("capture_minor", null);
        assertThat(corrections.facts(staff, order).captureHeld()).isTrue();

        // The fare is corrected while the capture waits; the capture then takes the corrected fare.
        long amount = orders.get(order).finalPriceMinor();
        fares.correct(staff, UUID.randomUUID(), order, 1, amount - 1_000, "Start pressed early", PASSWORD);
        TripCorrections.Facts released = corrections.review(staff, UUID.randomUUID(), order, "Fare corrected");
        assertThat(released.captureHeld()).isFalse();
        deliverEvents();
        assertThat(intent(order)).containsEntry("state", "CAPTURE_PENDING")
                .containsEntry("capture_minor", amount - 1_000);
        assertThat(orders.timeline(staff, order).getLast().details()).containsEntry("capture_released", true);
        taxi.blizz.EventContracts.assertOrderEventsConform(jdbc, order, "TripFactsCorrected", "TripCompleted",
                "FareCorrected", "TripCorrectionsReviewed", "TripCaptureReleased");
        // The fake provider's capture is left to nobody: other test classes' payment workers would take it.
        jdbc.sql("""
                        update payment_operation set state = 'CANCELLED'
                        where intent_id in (select id from payment_intent where order_id = :o)
                          and state in ('CREATED', 'SENDING', 'PENDING', 'UNKNOWN')""")
                .param("o", order).update();
    }

    @Test
    void onlyAfterTheStartWithThePermissionTheCurrentVersionAndSaneTimes() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        TestRides.Ride assigned = rides.assigned(city, driver, PICKUP, DROPOFF);
        Actor staff = reviewer();
        assertCode(() -> corrections.correct(staff, UUID.randomUUID(), assigned.order().id(),
                version(assigned.trip().id()), new TripCorrections.Change(true, null, null), "Too early"),
                ErrorCode.STATE_CONFLICT);
        orders.cancel(assigned.payer(), UUID.randomUUID(), assigned.order().id(),
                orders.get(assigned.order().id()).version(), "CHANGED_MIND");
        offline(driver);

        TestRides.Driver other = rides.driverNear(PICKUP);
        TestRides.Ride ride = rides.started(city, other, PICKUP, DROPOFF);
        UUID order = ride.order().id();
        UUID trip = ride.trip().id();
        long v = version(trip);
        OffsetDateTime now = OffsetDateTime.now();
        assertCode(() -> corrections.correct(staff(city, Orders.VIEW_PERMISSION), UUID.randomUUID(), order, v,
                new TripCorrections.Change(true, null, null), "No permission"), ErrorCode.ACCESS_DENIED);
        UUID elsewhere = rides.city("test-trip-corrections-other", "UAH", 103);
        assertCode(() -> corrections.correct(staff(elsewhere, TripCorrections.CORRECT_PERMISSION), UUID.randomUUID(),
                order, v, new TripCorrections.Change(true, null, null), "Elsewhere"), ErrorCode.ACCESS_DENIED);
        assertThatThrownBy(() -> corrections.correct(staff, UUID.randomUUID(), order, v + 5,
                new TripCorrections.Change(true, null, null), "Stale")).isInstanceOf(ConflictException.class)
                .satisfies(e -> assertThat(((ConflictException) e).currentVersion()).isEqualTo(v));
        assertCode(() -> corrections.correct(staff, UUID.randomUUID(), order, v,
                new TripCorrections.Change(false, null, null), "Nothing"), ErrorCode.STATE_CONFLICT);
        assertCode(() -> corrections.correct(staff, UUID.randomUUID(), order, v,
                new TripCorrections.Change(false, now.plusMinutes(10), null), "Future"), ErrorCode.VALIDATION_FAILED);
        assertCode(() -> corrections.correct(staff, UUID.randomUUID(), order, v,
                new TripCorrections.Change(false, now.minusDays(1), null), "Before the arrival"),
                ErrorCode.VALIDATION_FAILED);
        assertCode(() -> corrections.correct(staff, UUID.randomUUID(), order, v,
                new TripCorrections.Change(true, now.minusMinutes(1), null), "Both"), ErrorCode.VALIDATION_FAILED);
        assertCode(() -> corrections.correct(staff, UUID.randomUUID(), order, v,
                new TripCorrections.Change(false, null, now.minusMinutes(1)), "Not completed"),
                ErrorCode.VALIDATION_FAILED);
        assertCode(() -> corrections.correct(staff, UUID.randomUUID(), order, v,
                new TripCorrections.Change(true, null, null), " "), ErrorCode.VALIDATION_FAILED);
        assertCode(() -> corrections.review(staff, UUID.randomUUID(), order, "Nothing open"),
                ErrorCode.STATE_CONFLICT);

        TripView done = rides.complete(ride, true);
        OffsetDateTime start = (OffsetDateTime) tripRow(trip).get("started_at");
        assertCode(() -> corrections.correct(staff, UUID.randomUUID(), order, version(done.id()),
                new TripCorrections.Change(false, null, start.minusSeconds(1)), "Completion before the start"),
                ErrorCode.VALIDATION_FAILED);
        assertThat(corrections.facts(staff, order).corrections()).isEmpty();
        offline(other);
    }
}
