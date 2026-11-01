package taxi.blizz.operations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.UUID;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.TestQuotes;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.SessionService;
import taxi.blizz.operations.internal.DispatchWorker;
import taxi.blizz.payments.internal.TestPayments;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.ConflictException;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.platform.internal.OutboxRelay;
import taxi.blizz.pricing.QuoteService;

/**
 * AC-08 (issue #198): one test per row of the order transition table of section 9, each with the allowed path, a
 * forbidden initiator, a repeated command and a version conflict; where a row has no command (the system makes it)
 * the test says what stands in for each check. Then the transitions the table does not allow: each gives
 * STATE_CONFLICT and leaves the order exactly as it was — its row, its history, its events in the outbox, its
 * assignments and offers. Its own city at longitude 15.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class OrderTransitionTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, 15.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 15.55);
    static final Orders.Interruption BREAKDOWN = new Orders.Interruption("VEHICLE_BREAKDOWN", null, false, null, null);

    @Autowired Orders orders;
    @Autowired Dispatch dispatch;
    @Autowired Trips trips;
    @Autowired WorkSessions sessions;
    @Autowired SessionService auth;
    @Autowired QuoteService quotes;
    @Autowired DispatchWorker worker;
    @Autowired OutboxRelay relay;
    @Autowired JdbcClient jdbc;
    @Autowired ApplicationContext context;

    TestRides rides;
    TestPayments payments;
    UUID city;
    UUID merchant;

    @BeforeEach
    void setUp() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        payments = new TestPayments(context);
        payments.resetGateway();
        city = rides.city("test-order-transitions", "UAH", 15);
        // An earlier test's order must not take the driver of the next one.
        jdbc.sql("""
                        update dispatch_attempt set phase = 'STOPPED', next_action_at = null
                        where phase in ('PERSONAL', 'BROADCAST')
                          and order_id in (select id from ride_order where city_id = :c)""")
                .param("c", city).update();
        jdbc.sql("""
                        update ride_order set status = 'UNFULFILLED'
                        where city_id = :c and status in ('READY', 'SEARCHING', 'ASSIGNED', 'IN_SERVICE')""")
                .param("c", city).update();
        merchant = jdbc.sql("select merchant_id from payment_merchant_city where city_id = :city")
                .param("city", city).query(UUID.class).optional().orElseGet(() -> {
                    UUID id = UUID.randomUUID();
                    jdbc.sql("""
                                    insert into payment_merchant (id, provider, account, domain, secret_ref, currency,
                                                                  created_at)
                                    values (:id, 'FAKE', :account, 'test.blizz.invalid', 'test', 'UAH', now())""")
                            .param("id", id).param("account", "transitions_" + id).update();
                    jdbc.sql("insert into payment_merchant_city (city_id, merchant_id) values (:city, :merchant)")
                            .param("city", city).param("merchant", id).update();
                    return id;
                });
        deliverEvents();
    }

    /** Card operations of this city are left to nobody: another class's payment worker would take them. */
    @AfterEach
    void cancelLeftoverPayments() {
        deliverEvents();
        jdbc.sql("""
                        update payment_operation set state = 'CANCELLED'
                        where intent_id in (select id from payment_intent where city_id = :c)
                          and state in ('CREATED', 'SENDING', 'PENDING', 'UNKNOWN')""")
                .param("c", city).update();
    }

    // ------------------------------------------------------------ the rows of section 9

    /** "Создание → AWAITING_PAYMENT": a card order waits for its hold; nothing is searched before it. */
    @Test
    void createACardOrder() {
        Actor rider = riderWithCard();
        UUID quote = quote(rider);
        CreateOrder card = new CreateOrder(rider.id(), "STANDARD", PICKUP, "Home", DROPOFF, "Work",
                PaymentMethod.CARD, quote);
        // A forbidden initiator: a driver does not order.
        Actor driver = rides.driverNear(TestRides.north(PICKUP, 40_000)).actor();
        assertThatThrownBy(() -> orders.create(driver, UUID.randomUUID(), card)).isInstanceOf(DomainException.class);
        UUID command = UUID.randomUUID();
        payments.next("TIMEOUT");

        OrderView created = orders.create(rider, command, card);
        assertThat(created.status()).isEqualTo("AWAITING_PAYMENT");
        assertThat(created.paymentState()).isEqualTo("AUTH_PENDING");
        assertThat(searchAttempts(created.id())).as("no search before the hold").isZero();

        assertThat(orders.create(rider, command, card).id()).as("a repeat").isEqualTo(created.id());
        assertThat(count("select count(*) from ride_order where quote_id = :q", quote)).isOne();
        // Version: an order has none before it exists; a second order on the consumed quote stands in for it.
        assertThatThrownBy(() -> orders.create(rider, UUID.randomUUID(), card)).isInstanceOf(DomainException.class);
    }

    /** "Создание → READY", then "READY → SEARCHING" by the system: cash is allowed, the search starts. */
    @Test
    void createACashOrderThatIsReadyAndThenSearching() {
        Actor rider = rides.client();
        UUID quote = quote(rider);
        CreateOrder cash = new CreateOrder(rider.id(), "STANDARD", PICKUP, "Home", DROPOFF, "Work",
                PaymentMethod.CASH, quote);
        Actor another = rides.client();
        assertThatThrownBy(() -> orders.create(another, UUID.randomUUID(), cash)).as("someone else's quote")
                .isInstanceOf(DomainException.class);
        UUID command = UUID.randomUUID();

        OrderView created = orders.create(rider, command, cash);
        assertThat(orders.get(created.id()).status()).isEqualTo("SEARCHING");
        assertThat(searchAttempts(created.id())).isOne();
        // The fact of READY: the order is created in READY (OrderCreated, version 0), and the system then starts
        // the search in its own step (a SYSTEM event carrying the attempt).
        assertThat(jdbc.sql("""
                        select type || '|' || actor_type || '|' || (payload ->> 'attempt_id' is not null)
                        from order_event where order_id = :o order by sequence limit 2""")
                .param("o", created.id()).query(String.class).list())
                .containsExactly("OrderCreated|CLIENT|false", eventAfterCreation(created.id()) + "|SYSTEM|true");

        assertThat(orders.create(rider, command, cash).id()).as("a repeat").isEqualTo(created.id());
        assertThat(searchAttempts(created.id())).as("the repeat starts nothing").isOne();
    }

    /** "AWAITING_PAYMENT → READY" by finance: no command; the bank's answer is the initiator, a repeat is its echo. */
    @Test
    void theHoldIsTakenAndTheOrderGoesOn() {
        Actor rider = riderWithCard();
        OrderView order = cardOrder(rider);
        assertThat(order.status()).isEqualTo("AWAITING_PAYMENT");

        deliverEvents();
        OrderView going = orders.get(order.id());
        assertThat(going.status()).isEqualTo("SEARCHING");
        assertThat(going.paymentState()).isEqualTo("AUTHORIZED");
        long version = going.version();
        // Forbidden initiator: the rider cannot move it himself; a second delivery of the same event changes nothing.
        payments.settle();
        deliverEvents();
        assertThat(orders.get(order.id()).version()).as("a repeated answer changes nothing").isEqualTo(version);
        assertThat(searchAttempts(order.id())).isOne();
    }

    /** "AWAITING_PAYMENT → UNFULFILLED" by the system: a declined hold ends the order; no search ever starts. */
    @Test
    void aDeclinedHoldEndsTheOrder() {
        Actor rider = riderWithCard();
        payments.next("Declined");
        OrderView order = cardOrder(rider);
        deliverEvents();
        OrderView ended = orders.get(order.id());
        assertThat(ended.status()).isEqualTo("UNFULFILLED");
        assertThat(ended.statusReason()).isEqualTo("PAYMENT_DECLINED");
        assertThat(searchAttempts(order.id())).isZero();
        long version = ended.version();
        deliverEvents();
        payments.settle();
        assertThat(orders.get(order.id()).version()).as("the repeat changes nothing").isEqualTo(version);
    }

    /** "SEARCHING → ASSIGNED" by the core: the offered driver accepts. */
    @Test
    void theOfferedDriverAccepts() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        TestRides.Driver other = rides.driverNear(TestRides.north(PICKUP, 40_000));
        rides.moveTo(driver, TestRides.north(PICKUP, 1000));
        OrderView order = rides.order(rides.client(), city, PICKUP, DROPOFF);
        OfferView offer = dispatch.offers(driver.actor()).getFirst();
        assertCode(() -> dispatch.accept(other.actor(), other.device(), UUID.randomUUID(), offer.id()),
                ErrorCode.NOT_FOUND);
        UUID command = UUID.randomUUID();

        AssignmentView assigned = dispatch.accept(driver.actor(), driver.device(), command, offer.id());
        assertThat(orders.get(order.id()).status()).isEqualTo("ASSIGNED");

        assertThat(dispatch.accept(driver.actor(), driver.device(), command, offer.id())).isEqualTo(assigned);
        assertThat(count("select count(*) from assignment where order_id = :o", order.id())).isOne();
        // Version: an offer has no version; a second accept with a new command stands in and is refused.
        assertThatThrownBy(() -> dispatch.accept(driver.actor(), driver.device(), UUID.randomUUID(), offer.id()))
                .isInstanceOf(DomainException.class);
    }

    /** "ASSIGNED → SEARCHING" by the core: staff take the driver off before the start. */
    @Test
    void theDriverIsTakenOffBeforeTheStart() {
        TestRides.Ride ride = rides.assigned(city, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        long version = orders.get(ride.order().id()).version();
        Actor with = staff(Orders.REASSIGN_PERMISSION, Orders.VIEW_PERMISSION);
        assertCode(() -> orders.revokeAssignment(ride.payer(), UUID.randomUUID(), ride.order().id(), version,
                "DRIVER_NOT_RESPONDING", "No answer"), ErrorCode.ACCESS_DENIED);
        assertCode(() -> orders.revokeAssignment(staff(Orders.CANCEL_PERMISSION), UUID.randomUUID(),
                ride.order().id(), version, "DRIVER_NOT_RESPONDING", "No answer"), ErrorCode.ACCESS_DENIED);
        UUID command = UUID.randomUUID();

        OrderView revoked = orders.revokeAssignment(with, command, ride.order().id(), version,
                "DRIVER_NOT_RESPONDING", "No answer");
        assertThat(revoked.status()).isEqualTo("SEARCHING");

        assertThat(orders.revokeAssignment(with, command, ride.order().id(), version, "DRIVER_NOT_RESPONDING",
                "No answer")).isEqualTo(revoked);
        assertVersionConflict(() -> orders.revokeAssignment(with, UUID.randomUUID(), ride.order().id(), version,
                "DRIVER_NOT_RESPONDING", "No answer"), revoked.version());
    }

    /** "ASSIGNED → IN_SERVICE" by the assigned driver. */
    @Test
    void theAssignedDriverStarts() {
        TestRides.Ride ride = rides.assigned(city, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        rides.moveTo(ride.driver(), TestRides.north(PICKUP, 30));
        TripView waiting = trips.arrive(ride.driver().actor(), UUID.randomUUID(), ride.trip().id(),
                ride.trip().version(), null);
        TestRides.Driver stranger = rides.driverNear(TestRides.north(PICKUP, 40_000));
        assertThatThrownBy(() -> trips.start(stranger.actor(), UUID.randomUUID(), waiting.id(), waiting.version(),
                null)).isInstanceOf(DomainException.class);
        UUID command = UUID.randomUUID();

        TripView started = trips.start(ride.driver().actor(), command, waiting.id(), waiting.version(), null);
        assertThat(orders.get(ride.order().id()).status()).isEqualTo("IN_SERVICE");

        assertThat(trips.start(ride.driver().actor(), command, waiting.id(), waiting.version(), null))
                .isEqualTo(started);
        assertCode(() -> trips.start(ride.driver().actor(), UUID.randomUUID(), waiting.id(), waiting.version(), null),
                ErrorCode.VERSION_CONFLICT);
    }

    /** "IN_SERVICE → FULFILLED" by the assigned driver. */
    @Test
    void theAssignedDriverCompletes() {
        TestRides.Ride ride = rides.started(city, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        TestRides.Driver stranger = rides.driverNear(TestRides.north(PICKUP, 40_000));
        assertThatThrownBy(() -> trips.complete(stranger.actor(), UUID.randomUUID(), ride.trip().id(),
                ride.trip().version(), java.time.OffsetDateTime.now(), true)).isInstanceOf(DomainException.class);
        UUID command = UUID.randomUUID();
        java.time.OffsetDateTime at = java.time.OffsetDateTime.now();
        assertCode(() -> trips.complete(ride.driver().actor(), UUID.randomUUID(), ride.trip().id(),
                ride.trip().version() - 1, at, true), ErrorCode.VERSION_CONFLICT);

        TripView done = trips.complete(ride.driver().actor(), command, ride.trip().id(), ride.trip().version(), at,
                true);
        assertThat(orders.get(ride.order().id()).status()).isEqualTo("FULFILLED");

        assertThat(trips.complete(ride.driver().actor(), command, ride.trip().id(), ride.trip().version(), at, true))
                .isEqualTo(done);
    }

    /** "SEARCHING → UNFULFILLED" by the system past the total deadline: no command; the worker twice is the repeat. */
    @Test
    void nobodyUntilTheTotalDeadline() {
        OrderView order = rides.order(rides.client(), city, PICKUP, DROPOFF);
        jdbc.sql("""
                        update dispatch_attempt set total_deadline = now() - interval '1 second',
                                                    next_action_at = now() - interval '1 second'
                        where order_id = :id""")
                .param("id", order.id()).update();

        worker.runOnce();
        OrderView ended = orders.get(order.id());
        assertThat(ended.status()).isEqualTo("UNFULFILLED");
        assertThat(ended.statusReason()).isEqualTo("NO_DRIVER");
        worker.runOnce();
        assertThat(orders.get(order.id()).version()).as("the worker again changes nothing").isEqualTo(ended.version());
    }

    /** "До IN_SERVICE → CANCELLED" by an authorized participant: the rider, or staff of the city. */
    @Test
    void cancelledBeforeTheStart() {
        TestRides.Ride ride = rides.assigned(city, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        long version = orders.get(ride.order().id()).version();
        assertCode(() -> orders.cancel(rides.client(), UUID.randomUUID(), ride.order().id(), version,
                "CHANGED_MIND"), ErrorCode.NOT_FOUND);
        assertCode(() -> orders.cancel(staff(Orders.VIEW_PERMISSION), UUID.randomUUID(), ride.order().id(), version,
                "NO_CARS"), ErrorCode.ACCESS_DENIED);
        UUID command = UUID.randomUUID();

        OrderView cancelled = orders.cancel(ride.payer(), command, ride.order().id(), version, "CHANGED_MIND");
        assertThat(cancelled.status()).isEqualTo("CANCELLED");
        assertThat(sessions.availability(ride.driver().actor().id()).occupancy()).isEqualTo("FREE");

        assertThat(orders.cancel(ride.payer(), command, ride.order().id(), version, "CHANGED_MIND"))
                .isEqualTo(cancelled);
        OrderView searching = rides.order(rides.client(), city, PICKUP, DROPOFF);
        Actor staff = staff(Orders.CANCEL_PERMISSION, Orders.VIEW_PERMISSION);
        assertVersionConflict(() -> orders.cancel(staff, UUID.randomUUID(), searching.id(),
                searching.version() - 1, "NO_CARS"), orders.get(searching.id()).version());
        assertThat(orders.cancel(staff, UUID.randomUUID(), searching.id(), orders.get(searching.id()).version(),
                "NO_CARS").status()).as("staff of the city cancel too").isEqualTo("CANCELLED");
    }

    /** "IN_SERVICE → CANCELLED" by support: an exceptional interruption with a reason. */
    @Test
    void supportInterruptsATripInProgress() {
        TestRides.Ride ride = rides.started(city, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        long version = orders.get(ride.order().id()).version();
        Actor support = staff(Orders.INTERRUPT_PERMISSION, Orders.VIEW_PERMISSION);
        assertCode(() -> orders.interrupt(staff(Orders.CANCEL_PERMISSION), UUID.randomUUID(), ride.order().id(),
                version, BREAKDOWN), ErrorCode.ACCESS_DENIED);
        assertCode(() -> orders.interrupt(ride.payer(), UUID.randomUUID(), ride.order().id(), version, BREAKDOWN),
                ErrorCode.ACCESS_DENIED);
        UUID command = UUID.randomUUID();

        Orders.Interrupted interrupted = orders.interrupt(support, command, ride.order().id(), version, BREAKDOWN);
        assertThat(interrupted.order().status()).isEqualTo("CANCELLED");

        assertThat(orders.interrupt(support, command, ride.order().id(), version, BREAKDOWN)).isEqualTo(interrupted);
        assertVersionConflict(() -> orders.interrupt(support, UUID.randomUUID(), ride.order().id(), version,
                BREAKDOWN), interrupted.order().version());
    }

    // ------------------------------------------------------------ transitions the table does not allow

    @Test
    void nothingLeavesAFulfilledOrder() {
        TestRides.Ride ride = rides.started(city, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        TripView done = rides.complete(ride, true);
        UUID order = ride.order().id();
        Actor staff = allRights();

        assertRefusedAndUnchanged(order, () -> orders.cancel(ride.payer(), UUID.randomUUID(), order,
                version(order), "CHANGED_MIND"));
        assertRefusedAndUnchanged(order, () -> orders.cancel(staff, UUID.randomUUID(), order, version(order),
                "NO_CARS"));
        assertRefusedAndUnchanged(order, () -> orders.revokeAssignment(staff, UUID.randomUUID(), order,
                version(order), "DRIVER_NOT_RESPONDING", "x"));
        assertRefusedAndUnchanged(order, () -> orders.interrupt(staff, UUID.randomUUID(), order, version(order),
                BREAKDOWN));
        assertRefusedAndUnchanged(order, () -> orders.manualOffer(staff, UUID.randomUUID(), order,
                ride.driver().actor().id(), "x"));
        assertRefusedAndUnchanged(order, () -> trips.complete(ride.driver().actor(), UUID.randomUUID(), done.id(),
                done.version(), java.time.OffsetDateTime.now(), true));
    }

    @Test
    void nothingLeavesACancelledOrder() {
        TestRides.Ride ride = rides.assigned(city, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        UUID order = ride.order().id();
        orders.cancel(ride.payer(), UUID.randomUUID(), order, version(order), "CHANGED_MIND");
        Actor staff = allRights();

        assertRefusedAndUnchanged(order, () -> orders.cancel(staff, UUID.randomUUID(), order, version(order),
                "NO_CARS"));
        assertRefusedAndUnchanged(order, () -> orders.revokeAssignment(staff, UUID.randomUUID(), order,
                version(order), "DRIVER_NOT_RESPONDING", "x"));
        assertRefusedAndUnchanged(order, () -> orders.interrupt(staff, UUID.randomUUID(), order, version(order),
                BREAKDOWN));
        assertRefusedAndUnchanged(order, () -> orders.manualOffer(staff, UUID.randomUUID(), order,
                ride.driver().actor().id(), "x"));
        TripView trip = ride.trip();
        assertRefusedAndUnchanged(order, () -> trips.arrive(ride.driver().actor(), UUID.randomUUID(), trip.id(),
                trip.version(), null));
    }

    @Test
    void nothingLeavesAnUnfulfilledOrder() {
        OrderView created = rides.order(rides.client(), city, PICKUP, DROPOFF);
        UUID order = created.id();
        jdbc.sql("""
                        update dispatch_attempt set total_deadline = now() - interval '1 second',
                                                    next_action_at = now() - interval '1 second'
                        where order_id = :id""")
                .param("id", order).update();
        worker.runOnce();
        assertThat(orders.get(order).status()).isEqualTo("UNFULFILLED");
        Actor staff = allRights();
        TestRides.Driver driver = rides.driverNear(PICKUP);

        assertRefusedAndUnchanged(order, () -> orders.cancel(staff, UUID.randomUUID(), order, version(order),
                "NO_CARS"));
        assertRefusedAndUnchanged(order, () -> orders.revokeAssignment(staff, UUID.randomUUID(), order,
                version(order), "DRIVER_NOT_RESPONDING", "x"));
        assertRefusedAndUnchanged(order, () -> orders.interrupt(staff, UUID.randomUUID(), order, version(order),
                BREAKDOWN));
        assertRefusedAndUnchanged(order, () -> orders.manualOffer(staff, UUID.randomUUID(), order,
                driver.actor().id(), "x"));
    }

    /** IN_SERVICE → SEARCHING is not in the table, nor IN_SERVICE → CANCELLED by the rider. */
    @Test
    void aTripInProgressIsNeitherReassignedNorCancelledByTheRider() {
        TestRides.Ride ride = rides.started(city, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        UUID order = ride.order().id();
        Actor staff = allRights();

        assertRefusedAndUnchanged(order, () -> orders.revokeAssignment(staff, UUID.randomUUID(), order,
                version(order), "DRIVER_NOT_RESPONDING", "x"));
        assertRefusedAndUnchanged(order, () -> orders.cancel(ride.payer(), UUID.randomUUID(), order,
                version(order), "CHANGED_MIND"));
        assertRefusedAndUnchanged(order, () -> orders.manualOffer(staff, UUID.randomUUID(), order,
                ride.driver().actor().id(), "x"));
    }

    /** Before the start: no interruption (it is for a trip in progress) and no start without arriving first. */
    @Test
    void anOrderBeforeTheStartIsNotInterrupted() {
        OrderView searching = rides.order(rides.client(), city, PICKUP, DROPOFF);
        Actor staff = allRights();
        assertRefusedAndUnchanged(searching.id(), () -> orders.interrupt(staff, UUID.randomUUID(), searching.id(),
                version(searching.id()), BREAKDOWN));
        assertRefusedAndUnchanged(searching.id(), () -> orders.revokeAssignment(staff, UUID.randomUUID(),
                searching.id(), version(searching.id()), "DRIVER_NOT_RESPONDING", "x"));
    }

    // ------------------------------------------------------------ fixtures

    /** What a refused transition must leave as it was. */
    private record Snapshot(String order, String events, String outbox, String assignments, String offers) {
    }

    private Snapshot snapshot(UUID order) {
        return new Snapshot(
                one("""
                        select concat_ws('|', status, version, price_minor, final_price_minor, payment_state,
                                         updated_at)
                        from ride_order where id = :o""", order),
                one("""
                        select count(*) || '|' || coalesce(max(sequence), 0) from order_event
                        where order_id = :o""", order),
                one("""
                        select count(*) || '|' || coalesce(string_agg(event_type, ',' order by occurred_at, event_id),
                                                           '')
                        from outbox where aggregate_id = :o or payload ->> 'order_id' = cast(:o as text)""", order),
                one("""
                        select count(*) || '|' || coalesce(string_agg(state, ',' order by created_at, id), '')
                        from assignment where order_id = :o""", order),
                one("""
                        select count(*) || '|' || coalesce(string_agg(state, ',' order by created_at, id), '')
                        from offer where order_id = :o""", order));
    }

    /** STATE_CONFLICT, and the order's row, history, events, assignments and offers are exactly as before. */
    private void assertRefusedAndUnchanged(UUID order, Runnable call) {
        Snapshot before = snapshot(order);
        assertCode(call, ErrorCode.STATE_CONFLICT);
        deliverEvents();
        assertThat(snapshot(order)).as("nothing changed").isEqualTo(before);
    }

    private String one(String sql, UUID order) {
        return jdbc.sql(sql).param("o", order).query(String.class).single();
    }

    private long version(UUID order) {
        return orders.get(order).version();
    }

    private int count(String sql, UUID id) {
        return jdbc.sql(sql.replace(":q", ":id").replace(":o", ":id")).param("id", id).query(Integer.class).single();
    }

    private String eventAfterCreation(UUID order) {
        return jdbc.sql("select type from order_event where order_id = :o order by sequence offset 1 limit 1")
                .param("o", order).query(String.class).single();
    }

    private int searchAttempts(UUID order) {
        return count("select count(*) from dispatch_attempt where order_id = :o", order);
    }

    private UUID quote(Actor payer) {
        return new TestQuotes(jdbc, quotes).quote(payer, city, "STANDARD", PICKUP, DROPOFF).id();
    }

    private OrderView cardOrder(Actor rider) {
        return orders.create(rider, UUID.randomUUID(), new CreateOrder(rider.id(), "STANDARD", PICKUP, "Home",
                DROPOFF, "Work", PaymentMethod.CARD, quote(rider)));
    }

    private Actor riderWithCard() {
        Actor rider = rides.client();
        jdbc.sql("""
                        insert into payment_card (id, client_id, merchant_id, token, masked_pan, card_type, state,
                                                  created_at)
                        values (:id, :client, :merchant, :token, '41****1111', 'Visa', 'ACTIVE', now())""")
                .param("id", UUID.randomUUID()).param("client", rider.id()).param("merchant", merchant)
                .param("token", "tok-" + rider.id()).update();
        return rider;
    }

    /** Staff with every order right in this city: a refusal is then about the state, not the rights. */
    private Actor allRights() {
        return staff(Orders.VIEW_PERMISSION, Orders.CANCEL_PERMISSION, Orders.REASSIGN_PERMISSION,
                Orders.OFFER_PERMISSION, Orders.INTERRUPT_PERMISSION);
    }

    private Actor staff(String... permissions) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, all_cities, city_scope, state,
                                                created_at, updated_at)
                        values (:id, :login, 'Transitions', 'ADMIN', :permissions, false, :scope, 'ACTIVE', now(),
                                now())""")
                .param("id", id).param("login", "transitions-" + id).param("permissions", permissions)
                .param("scope", new UUID[]{city}).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private void deliverEvents() {
        while (relay.runOnce() > 0) {
            // drain
        }
    }

    private static void assertCode(Runnable call, ErrorCode code) {
        assertThatThrownBy(call::run).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }

    private static void assertVersionConflict(Runnable call, long current) {
        assertThatThrownBy(call::run).isInstanceOf(ConflictException.class)
                .satisfies(e -> {
                    assertThat(((DomainException) e).code()).isEqualTo(ErrorCode.VERSION_CONFLICT);
                    assertThat(((ConflictException) e).currentVersion()).isEqualTo(current);
                });
    }
}
