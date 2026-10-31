package taxi.blizz.operations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
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
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.SessionService;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.ConflictException;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.platform.internal.OutboxRelay;
import taxi.blizz.pricing.FinalFares;
import taxi.blizz.pricing.QuoteService;

/**
 * Issue #142, part C2 (REQ-RID-06): support changes where a trip in progress ends. The new price is a new quote with
 * the order's own tariff version, never the tariff in force now; the fare at completion comes from it. A card order
 * whose card part goes above the hold gets a payment problem case, and the capture takes the hold and charges the
 * rest. Its own city at longitude 101; 102 for the other city.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class DestinationChangeTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, 101.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 101.55);
    /** About 28 km from the pickup: well above the price to {@link #DROPOFF}. */
    static final GeoPoint FAR = new GeoPoint(-39.3, 101.75);
    /** About 1 km from the pickup: the tariff's minimum. */
    static final GeoPoint NEAR = new GeoPoint(-39.49, 101.5);

    @Autowired DestinationChanges destinations;
    @Autowired Orders orders;
    @Autowired Dispatch dispatch;
    @Autowired Trips trips;
    @Autowired WorkSessions sessions;
    @Autowired SessionService auth;
    @Autowired QuoteService quotes;
    @Autowired FinalFares fares;
    @Autowired OutboxRelay relay;
    @Autowired JdbcClient jdbc;
    @Autowired javax.sql.DataSource dataSource;

    TestRides rides;
    UUID city;

    @BeforeEach
    void city() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        city = rides.city("test-destination-changes", "UAH", 101);
        jdbc.sql("""
                        update ride_order set status = 'UNFULFILLED'
                        where city_id = :c and status in ('READY', 'SEARCHING', 'ASSIGNED', 'IN_SERVICE')""")
                .param("c", city).update();
        deliverEvents();
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
                        values (:id, :login, 'Support', 'OPERATOR', :permissions, false, :scope, 'ACTIVE', 'x', now(),
                                now())""")
                .param("id", id).param("login", "destination-" + id).param("permissions", permissions)
                .param("scope", new UUID[] {scope}).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private Actor support() {
        return staff(city, DestinationChanges.PERMISSION, Orders.VIEW_PERMISSION);
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
                            .param("id", id).param("account", "destination_changes_" + id).update();
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
        return jdbc.sql("select state, hold_minor, capture_minor from payment_intent where order_id = :o")
                .param("o", order).query().singleRow();
    }

    private void cancelLeftoverPayments(UUID order) {
        // The fake provider's capture is left to nobody: other test classes' payment workers would take it.
        jdbc.sql("""
                        update payment_operation set state = 'CANCELLED'
                        where intent_id in (select id from payment_intent where order_id = :o)
                          and state in ('CREATED', 'SENDING', 'PENDING', 'UNKNOWN')""")
                .param("o", order).update();
    }

    private record OrderRow(UUID quoteId, long priceMinor, String dropoffLabel, double lat, double lon,
                            long version) {
    }

    private OrderRow row(UUID order) {
        return jdbc.sql("""
                        select quote_id, price_minor, dropoff_label, ST_Y(dropoff), ST_X(dropoff), version
                        from ride_order where id = :o""")
                .param("o", order)
                .query((rs, i) -> new OrderRow(rs.getObject(1, UUID.class), rs.getLong(2), rs.getString(3),
                        rs.getDouble(4), rs.getDouble(5), rs.getLong(6)))
                .single();
    }

    private UUID tariffOf(UUID quote) {
        return jdbc.sql("select tariff_version_id from quote where id = :q").param("q", quote).query(UUID.class)
                .single();
    }

    private long events(UUID order, String type) {
        return jdbc.sql("select count(*) from order_event where order_id = :o and type = :t")
                .param("o", order).param("t", type).query(Long.class).single();
    }

    /** The price a rider without promotions is quoted now from the pickup to {@code dropoff}. */
    private long quotedNow(GeoPoint dropoff) {
        return new TestQuotes(jdbc, quotes).quote(rides.client(), city, "STANDARD", PICKUP, dropoff).amountMinor();
    }

    /** From now on the city's STANDARD tariff is a new version with every rate twice the one in force. */
    private void publishDearerTariff() {
        UUID classId = new TestQuotes(jdbc, quotes).ensureClass(city, "STANDARD");
        UUID current = jdbc.sql("""
                        select id from tariff_version
                        where city_id = :city and class_id = :class and state = 'PUBLISHED'""")
                .param("city", city).param("class", classId).query(UUID.class).single();
        jdbc.sql("""
                        insert into tariff_version (id, city_id, class_id, currency, effective_from, state,
                                                    pickup_minor, per_km_minor, per_minute_minor, minimum_minor,
                                                    free_waiting_minutes, waiting_per_minute_minor,
                                                    cancellation_fee_minor, commission_rate, waiting_step_seconds,
                                                    waiting_rounding, pickup_outside_minor,
                                                    per_km_outside_minor, zone_surcharges, created_at, updated_at)
                        select :id, city_id, class_id, currency, now(), 'PUBLISHED', pickup_minor * 2,
                               per_km_minor * 2, per_minute_minor * 2, minimum_minor * 2, free_waiting_minutes,
                               waiting_per_minute_minor, cancellation_fee_minor, commission_rate,
                               waiting_step_seconds, waiting_rounding, pickup_outside_minor * 2,
                               per_km_outside_minor * 2, zone_surcharges, now(), now()
                        from tariff_version where id = :current""")
                .param("id", UUID.randomUUID()).param("current", current).update();
        jdbc.sql("""
                        update tariff_version set state = 'ARCHIVED', version = version + 1, updated_at = now()
                        where id = :current""")
                .param("current", current).update();
    }

    private DestinationChanges.Change to(GeoPoint dropoff, String label) {
        return new DestinationChanges.Change(dropoff, label, "The rider called: they go to the station instead");
    }

    private static void assertCode(ThrowingCallable call, ErrorCode code) {
        assertThatThrownBy(call).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }

    // ------------------------------------------------------------ tests

    @Test
    void theNewPriceUsesTheOrdersOwnTariffAndTheFareAtCompletionFollowsIt() {
        long expected = quotedNow(FAR);
        TestRides.Driver driver = rides.driverNear(PICKUP);
        TestRides.Ride ride = rides.started(city, driver, PICKUP, DROPOFF);
        UUID order = ride.order().id();
        OrderRow before = row(order);
        // The tariff changes during the trip; the order keeps the one it was priced with (AC-14).
        publishDearerTariff();
        assertThat(quotedNow(FAR)).as("the tariff in force now is dearer").isGreaterThan(expected);
        Actor staff = support();

        DestinationChanges.Changed changed = destinations.change(staff, UUID.randomUUID(), order, before.version(),
                to(FAR, "Railway station"));

        assertThat(changed.previousPriceMinor()).isEqualTo(before.priceMinor());
        assertThat(changed.priceMinor()).isEqualTo(expected);
        assertThat(changed.currency()).isEqualTo("UAH");
        assertThat(changed.holdMinor()).as("a cash order has no hold").isNull();
        assertThat(changed.aboveHold()).isFalse();
        assertThat(changed.order().dropoffLabel()).isEqualTo("Railway station");
        assertThat(changed.order().version()).isGreaterThan(before.version());
        OrderRow after = row(order);
        assertThat(after.quoteId()).isNotEqualTo(before.quoteId());
        assertThat(after.priceMinor()).isEqualTo(expected);
        assertThat(after.lat()).isEqualTo(FAR.lat());
        assertThat(after.lon()).isEqualTo(FAR.lon());
        assertThat(tariffOf(after.quoteId())).isEqualTo(tariffOf(before.quoteId()));
        assertThat(jdbc.sql("select consumed_at is not null from quote where id = :q").param("q", after.quoteId())
                .query(Boolean.class).single()).isTrue();
        // In the order's history with the reason and the author, and audited.
        Orders.TimelineEntry entry = orders.timeline(staff, order).getLast();
        assertThat(entry.type()).isEqualTo(DestinationChanges.EVENT);
        assertThat(entry.reason()).isEqualTo("The rider called: they go to the station instead");
        assertThat(((Number) entry.details().get("previous_price_minor")).longValue()).isEqualTo(before.priceMinor());
        assertThat(((Number) entry.details().get("price_minor")).longValue()).isEqualTo(expected);
        assertThat(entry.details()).containsEntry("above_hold", false);
        assertThat(jdbc.sql("""
                        select count(*) from audit_log
                        where action = 'order.destination' and resource_id = :o and actor_id = :staff
                          and reason = 'The rider called: they go to the station instead'""")
                .param("o", order.toString()).param("staff", staff.id()).query(Long.class).single()).isOne();
        taxi.blizz.EventContracts.assertOrderEventsConform(jdbc, order, DestinationChanges.EVENT);

        TripView done = rides.complete(ride, true);
        offline(driver);
        assertThat(done.phase()).isEqualTo("COMPLETED");
        assertThat(fares.ofOrder(order).orElseThrow().breakdown().agreedMinor()).isEqualTo(expected);
        deliverEvents();
    }

    @Test
    void aSecondChangeStillUsesTheOriginalTariffVersion() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        TestRides.Ride ride = rides.started(city, driver, PICKUP, DROPOFF);
        UUID order = ride.order().id();
        UUID original = tariffOf(row(order).quoteId());
        long nearNow = quotedNow(NEAR);
        Actor staff = support();
        destinations.change(staff, UUID.randomUUID(), order, row(order).version(), to(FAR, "Station"));
        publishDearerTariff();

        DestinationChanges.Changed back = destinations.change(staff, UUID.randomUUID(), order, row(order).version(),
                to(NEAR, "Back home"));

        assertThat(back.priceMinor()).isEqualTo(nearNow);
        assertThat(tariffOf(row(order).quoteId())).isEqualTo(original);
        assertThat(events(order, DestinationChanges.EVENT)).isEqualTo(2);
        rides.complete(ride, true);
        offline(driver);
        deliverEvents();
    }

    @Test
    void aRepeatedCommandReplaysTheFirstResultAndChangesNothingMore() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        TestRides.Ride ride = rides.started(city, driver, PICKUP, DROPOFF);
        UUID order = ride.order().id();
        Actor staff = support();
        UUID command = UUID.randomUUID();
        long version = row(order).version();
        long quotesBefore = jdbc.sql("select count(*) from quote where city_id = :c").param("c", city)
                .query(Long.class).single();

        DestinationChanges.Changed first = destinations.change(staff, command, order, version, to(FAR, "Station"));
        OrderRow after = row(order);
        DestinationChanges.Changed again = destinations.change(staff, command, order, version, to(FAR, "Station"));

        assertThat(again).isEqualTo(first);
        assertThat(row(order)).isEqualTo(after);
        assertThat(events(order, DestinationChanges.EVENT)).isOne();
        assertThat(jdbc.sql("select count(*) from quote where city_id = :c").param("c", city).query(Long.class)
                .single()).as("one new quote, not one per attempt").isEqualTo(quotesBefore + 1);
        assertThat(jdbc.sql("select count(*) from audit_log where action = 'order.destination' and resource_id = :o")
                .param("o", order.toString()).query(Long.class).single()).isOne();
        rides.complete(ride, true);
        offline(driver);
        deliverEvents();
    }

    @Test
    void aStaleVersionIsAConflictWithTheCurrentVersionAndChangesNothing() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        TestRides.Ride ride = rides.started(city, driver, PICKUP, DROPOFF);
        UUID order = ride.order().id();
        Actor staff = support();
        long version = row(order).version();
        destinations.change(staff, UUID.randomUUID(), order, version, to(FAR, "Station"));
        OrderRow after = row(order);

        assertThatThrownBy(() -> destinations.change(staff, UUID.randomUUID(), order, version, to(NEAR, "Home")))
                .isInstanceOf(ConflictException.class)
                .extracting(e -> ((ConflictException) e).currentVersion()).isEqualTo(after.version());
        assertThat(row(order)).isEqualTo(after);
        assertThat(events(order, DestinationChanges.EVENT)).isOne();
        rides.complete(ride, true);
        offline(driver);
        deliverEvents();
    }

    @Test
    void twoChangesAtOnceOneWinsTheOtherIsAConflict() throws Exception {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        TestRides.Ride ride = rides.started(city, driver, PICKUP, DROPOFF);
        UUID order = ride.order().id();
        Actor staff = support();
        long version = row(order).version();
        ExecutorService pool = Executors.newFixedThreadPool(2);
        List<Future<DestinationChanges.Changed>> results = new ArrayList<>();
        // The order is held elsewhere until both commands wait for it, so both have read whatever they read before
        // either goes on: without the lock both would see the same version and both would win.
        try (java.sql.Connection holder = dataSource.getConnection()) {
            holder.setAutoCommit(false);
            try (var lock = holder.prepareStatement("select id from ride_order where id = ? for update")) {
                lock.setObject(1, order);
                lock.executeQuery();
            }
            for (GeoPoint point : List.of(FAR, NEAR)) {
                Callable<DestinationChanges.Changed> change = () ->
                        destinations.change(staff, UUID.randomUUID(), order, version, to(point, "Somewhere"));
                results.add(pool.submit(change));
            }
            long deadline = System.nanoTime() + java.time.Duration.ofSeconds(20).toNanos();
            while (jdbc.sql("""
                            select count(*) from pg_stat_activity
                            where wait_event_type = 'Lock' and query ilike '%ride_order%'""")
                    .query(Long.class).single() < 2) {
                assertThat(System.nanoTime()).as("both commands wait for the order").isLessThan(deadline);
                Thread.sleep(20);
            }
            holder.commit();
        }
        try {
            int won = 0;
            int conflicts = 0;
            for (Future<DestinationChanges.Changed> result : results) {
                try {
                    result.get();
                    won++;
                } catch (java.util.concurrent.ExecutionException e) {
                    assertThat(e.getCause()).isInstanceOf(ConflictException.class);
                    conflicts++;
                }
            }
            assertThat(won).isOne();
            assertThat(conflicts).isOne();
        } finally {
            pool.shutdownNow();
        }
        assertThat(events(order, DestinationChanges.EVENT)).isOne();
        rides.complete(ride, true);
        offline(driver);
        deliverEvents();
    }

    @Test
    void onlyATripInProgressWithThePermissionInTheOrdersCityAndAReason() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        TestRides.Ride assigned = rides.assigned(city, driver, PICKUP, DROPOFF);
        UUID order = assigned.order().id();
        Actor staff = support();
        // Before the start the route is changed by cancelling and ordering again, not here.
        assertCode(() -> destinations.change(staff, UUID.randomUUID(), order, row(order).version(),
                to(FAR, "Station")), ErrorCode.STATE_CONFLICT);
        TripView trip = assigned.trip();
        rides.moveTo(driver, TestRides.north(PICKUP, 30));
        trip = trips.arrive(driver.actor(), UUID.randomUUID(), trip.id(), trip.version(), null);
        trip = trips.start(driver.actor(), UUID.randomUUID(), trip.id(), trip.version(), null);
        TestRides.Ride ride = new TestRides.Ride(assigned.payer(), driver, assigned.order(), trip);
        long version = row(order).version();

        assertCode(() -> destinations.change(staff(city, Orders.VIEW_PERMISSION), UUID.randomUUID(), order, version,
                to(FAR, "Station")), ErrorCode.ACCESS_DENIED);
        UUID elsewhere = rides.city("test-destination-changes-other", "UAH", 102);
        assertCode(() -> destinations.change(staff(elsewhere, DestinationChanges.PERMISSION), UUID.randomUUID(),
                order, version, to(FAR, "Station")), ErrorCode.ACCESS_DENIED);
        assertCode(() -> destinations.change(rides.client(), UUID.randomUUID(), order, version, to(FAR, "Station")),
                ErrorCode.ACCESS_DENIED);
        assertCode(() -> destinations.change(staff, UUID.randomUUID(), order, version,
                new DestinationChanges.Change(FAR, "Station", " ")), ErrorCode.VALIDATION_FAILED);
        assertCode(() -> destinations.change(staff, UUID.randomUUID(), order, version,
                new DestinationChanges.Change(FAR, " ", "The rider asked")), ErrorCode.VALIDATION_FAILED);
        assertCode(() -> destinations.change(staff, UUID.randomUUID(), order, version,
                new DestinationChanges.Change(null, "Station", "The rider asked")), ErrorCode.VALIDATION_FAILED);
        assertCode(() -> destinations.change(staff, UUID.randomUUID(), UUID.randomUUID(), version,
                to(FAR, "Station")), ErrorCode.NOT_FOUND);
        assertThat(row(order).version()).isEqualTo(version);
        assertThat(events(order, DestinationChanges.EVENT)).isZero();

        rides.complete(ride, true);
        offline(driver);
        deliverEvents();
        assertCode(() -> destinations.change(staff, UUID.randomUUID(), order, row(order).version(),
                to(FAR, "Station")), ErrorCode.STATE_CONFLICT);
    }

    @Test
    void aCardPartAboveTheHoldNeedsAttentionAndTheCaptureChargesTheRest() {
        TestRides.Ride ride = startedCardRide();
        UUID order = ride.order().id();
        long hold = ((Number) intent(order).get("hold_minor")).longValue();
        Actor staff = support();

        DestinationChanges.Changed changed = destinations.change(staff, UUID.randomUUID(), order,
                row(order).version(), to(FAR, "Airport"));

        assertThat(changed.holdMinor()).isEqualTo(hold);
        assertThat(changed.priceMinor()).isGreaterThan(hold);
        assertThat(changed.aboveHold()).isTrue();
        assertThat(intent(order)).as("never a second hold").containsEntry("hold_minor", hold)
                .containsEntry("state", "AUTHORIZED");
        deliverEvents();
        assertThat(jdbc.sql("""
                        select count(*) from support_case
                        where order_id = :o and category = 'PAYMENT' and state <> 'RESOLVED'""")
                .param("o", order).query(Long.class).single()).as("the order needs attention").isOne();
        deliverEvents();
        assertThat(jdbc.sql("select count(*) from support_case where order_id = :o and category = 'PAYMENT'")
                .param("o", order).query(Long.class).single()).as("redelivery opens nothing twice").isOne();
        taxi.blizz.EventContracts.assertOrderEventsConform(jdbc, order, DestinationChanges.EVENT);

        rides.complete(ride, null);
        offline(ride.driver());
        deliverEvents();
        long fare = fares.ofOrder(order).orElseThrow().amountMinor();
        assertThat(fare).isEqualTo(changed.priceMinor());
        assertThat(intent(order)).as("the capture asks for the whole new fare: the hold, then the rest")
                .containsEntry("capture_minor", fare);
        cancelLeftoverPayments(order);
    }

    @Test
    void aCardPartWithinTheHoldNeedsNothing() {
        TestRides.Ride ride = startedCardRide();
        UUID order = ride.order().id();
        long hold = ((Number) intent(order).get("hold_minor")).longValue();

        DestinationChanges.Changed changed = destinations.change(support(), UUID.randomUUID(), order,
                row(order).version(), to(NEAR, "Back home"));

        assertThat(changed.priceMinor()).isLessThanOrEqualTo(hold);
        assertThat(changed.holdMinor()).isEqualTo(hold);
        assertThat(changed.aboveHold()).isFalse();
        deliverEvents();
        assertThat(jdbc.sql("select count(*) from support_case where order_id = :o and category = 'PAYMENT'")
                .param("o", order).query(Long.class).single()).isZero();
        rides.complete(ride, null);
        offline(ride.driver());
        deliverEvents();
        cancelLeftoverPayments(order);
    }

    @Test
    void theRiderAndTheDriverAreTold() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        TestRides.Ride ride = rides.started(city, driver, PICKUP, DROPOFF);
        UUID order = ride.order().id();

        destinations.change(support(), UUID.randomUUID(), order, row(order).version(), to(FAR, "Station"));
        deliverEvents();

        assertThat(jdbc.sql("""
                        select recipient_type || ' ' || template from notification
                        where recipient_id in (:rider, :driver) and template like '%destination%'""")
                .param("rider", ride.payer().id()).param("driver", driver.actor().id())
                .query(String.class).list())
                .containsExactlyInAnyOrder("CLIENT rider.destination-changed", "DRIVER driver.destination-changed");
        rides.complete(ride, true);
        offline(driver);
        deliverEvents();
    }
}
