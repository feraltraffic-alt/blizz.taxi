package taxi.blizz.operations;

import static org.assertj.core.api.Assertions.assertThat;

import io.micrometer.core.instrument.MeterRegistry;
import java.time.Instant;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.TestQuotes;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.SessionService;
import taxi.blizz.operations.internal.DispatchWorker;
import taxi.blizz.platform.Actor;
import taxi.blizz.pricing.QuoteService;

/** REQ-OBS-02: actual commands on PostgreSQL; meter deltas across rollback, commit and replay. */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class OrderMetricsTests {
    static final GeoPoint PICKUP = new GeoPoint(-39.5, -159.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, -159.45);
    @Autowired Orders orders;
    @Autowired Dispatch dispatch;
    @Autowired Trips trips;
    @Autowired WorkSessions sessions;
    @Autowired SessionService auth;
    @Autowired QuoteService quotes;
    @Autowired JdbcClient jdbc;
    @Autowired MeterRegistry meters;
    @Autowired TransactionTemplate tx;
    @Autowired DispatchWorker worker;
    TestRides rides;
    UUID city;

    @BeforeEach
    void setUp() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        city = rides.city("test-order-metrics", "UAH", -160);
        jdbc.sql("""
                update dispatch_attempt set phase = 'STOPPED', next_action_at = null
                where order_id in (select id from ride_order where city_id = :city)
                """).param("city", city).update();
    }

    CreateOrder request(Actor payer, OrderChannel channel, Instant pickupAt) {
        UUID quote = new TestQuotes(jdbc, quotes).quote(payer, city, "STANDARD", PICKUP, DROPOFF, pickupAt).id();
        return new CreateOrder(payer.id(), "STANDARD", PICKUP, "Home", DROPOFF, "Work", PaymentMethod.CASH,
                quote, channel, null, null, pickupAt);
    }

    OrderView order(Actor payer) { return orders.create(payer, UUID.randomUUID(), request(payer, null, null)); }
    UUID offer(TestRides.Driver d) { return dispatch.offers(d.actor()).getFirst().id(); }
    double counter(String name, String... tags) {
        var c = meters.find(name).tags(tags).counter();
        return c == null ? 0 : c.count();
    }
    long timer(String name, String... tags) {
        var t = meters.find(name).tags(tags).timer();
        return t == null ? 0 : t.count();
    }
    double seconds(String name, String... tags) {
        var t = meters.find(name).tags(tags).timer();
        return t == null ? 0 : t.totalTime(TimeUnit.SECONDS);
    }
    void rollback(Runnable action) {
        tx.executeWithoutResult(status -> { action.run(); status.setRollbackOnly(); });
    }

    @Test
    void createdCountsOnlyCommittedCommandsOnceForEachChannelAndPreorder() {
        for (OrderChannel channel : new OrderChannel[] {OrderChannel.APP, OrderChannel.WEB}) {
            for (boolean preorder : new boolean[] {false, true}) {
                Actor payer = rides.client();
                Instant at = preorder ? Instant.now().plusSeconds(14400) : null;
                CreateOrder request = request(payer, channel, at);
                UUID command = UUID.randomUUID();
                String[] tags = {"channel", channel.name(), "preorder", Boolean.toString(preorder)};
                double before = counter("blizz.orders.created", tags);
                rollback(() -> {
                    orders.create(payer, command, request);
                    assertThat(counter("blizz.orders.created", tags)).isEqualTo(before);
                });
                assertThat(counter("blizz.orders.created", tags)).isEqualTo(before);
                orders.create(payer, command, request);
                assertThat(counter("blizz.orders.created", tags)).isEqualTo(before + 1);
                orders.create(payer, command, request);
                assertThat(counter("blizz.orders.created", tags)).isEqualTo(before + 1);
            }
        }
    }

    @Test
    void phoneOrdersAndStaffCancellationsCountAfterCommitAndNotOnReplay() {
        UUID staffId = UUID.randomUUID();
        jdbc.sql("""
                insert into staff_user (id, login, name, role, permissions, all_cities, state, created_at, updated_at)
                values (:id, :login, 'Metrics', 'OPERATOR', '{orders.create,orders.cancel}', true, 'ACTIVE', now(), now())
                """).param("id", staffId).param("login", "metrics-" + staffId).update();
        Actor staff = new Actor(taxi.blizz.platform.SubjectType.STAFF, staffId);
        UUID quote = new TestQuotes(jdbc, quotes).quote(staff, city, "STANDARD", PICKUP, DROPOFF).id();
        CreateOrder request = new CreateOrder(null, "STANDARD", PICKUP, "Home", DROPOFF, "Work",
                PaymentMethod.CASH, quote, OrderChannel.PHONE, null);
        UUID command = UUID.randomUUID();
        double created = counter("blizz.orders.created", "channel", "PHONE", "preorder", "false");
        rollback(() -> orders.create(staff, command, request));
        assertThat(counter("blizz.orders.created", "channel", "PHONE", "preorder", "false")).isEqualTo(created);
        OrderView order = orders.create(staff, command, request);
        orders.create(staff, command, request);
        assertThat(counter("blizz.orders.created", "channel", "PHONE", "preorder", "false")).isEqualTo(created + 1);
        UUID cancelId = UUID.randomUUID();
        long version = orders.get(order.id()).version();
        double cancelled = counter("blizz.orders.cancelled", "by", "STAFF", "reason", "DUPLICATE");
        Runnable cancel = () -> orders.cancel(staff, cancelId, order.id(), version, "DUPLICATE");
        rollback(cancel);
        assertThat(counter("blizz.orders.cancelled", "by", "STAFF", "reason", "DUPLICATE")).isEqualTo(cancelled);
        cancel.run();
        cancel.run();
        assertThat(counter("blizz.orders.cancelled", "by", "STAFF", "reason", "DUPLICATE")).isEqualTo(cancelled + 1);
    }

    @Test
    void driverCancellationCountsOnlyCommittedCommandsAndNotReplay() {
        var driver = rides.driverNear(PICKUP);
        order(rides.client());
        dispatch.accept(driver.actor(), UUID.randomUUID(), offer(driver));
        var trip = trips.current(driver.actor()).orElseThrow();
        UUID command = UUID.randomUUID();
        double before = counter("blizz.orders.cancelled", "by", "DRIVER", "reason", "PASSENGER_ASKED");
        Runnable cancel = () -> trips.cancel(driver.actor(), command, trip.id(), trip.version(), "PASSENGER_ASKED");
        rollback(cancel);
        assertThat(counter("blizz.orders.cancelled", "by", "DRIVER", "reason", "PASSENGER_ASKED")).isEqualTo(before);
        cancel.run();
        cancel.run();
        assertThat(counter("blizz.orders.cancelled", "by", "DRIVER", "reason", "PASSENGER_ASKED")).isEqualTo(before + 1);
    }

    @Test
    void cancellationCountsOnlyAfterCommitAndNeverOnReplay() {
        Actor payer = rides.client();
        OrderView order = order(payer);
        long version = orders.get(order.id()).version();
        UUID command = UUID.randomUUID();
        String[] tags = {"by", "RIDER", "reason", "CHANGED_MIND"};
        double before = counter("blizz.orders.cancelled", tags);
        Runnable cancel = () -> orders.cancel(payer, command, order.id(), version, "CHANGED_MIND");
        rollback(() -> { cancel.run(); assertThat(counter("blizz.orders.cancelled", tags)).isEqualTo(before); });
        assertThat(counter("blizz.orders.cancelled", tags)).isEqualTo(before);
        cancel.run();
        assertThat(counter("blizz.orders.cancelled", tags)).isEqualTo(before + 1);
        cancel.run();
        assertThat(counter("blizz.orders.cancelled", tags)).isEqualTo(before + 1);
    }

    @Test
    void unknownCancellationCodeIsCappedAndEveryBlizzTagIsFreeOfIdsAndPhones() {
        String code = "CUSTOM_" + UUID.randomUUID().toString().replace("-", "").toUpperCase();
        jdbc.sql("""
                insert into cancel_reason (id, audience, code, labels, active, created_at, updated_at)
                values (:id, 'RIDER', :code, '{"en":"Custom"}', true, now(), now())
                """).param("id", UUID.randomUUID()).param("code", code).update();
        Actor payer = rides.client();
        OrderView order = order(payer);
        double before = counter("blizz.orders.cancelled", "by", "RIDER", "reason", "OTHER");
        orders.cancel(payer, UUID.randomUUID(), order.id(), orders.get(order.id()).version(), code);
        assertThat(counter("blizz.orders.cancelled", "by", "RIDER", "reason", "OTHER")).isEqualTo(before + 1);
        meters.getMeters().stream().filter(m -> m.getId().getName().startsWith("blizz.")).forEach(m ->
                m.getId().getTags().forEach(t -> assertThat(t.getValue())
                        .doesNotContain(payer.id().toString(), order.id().toString(), code)
                        .doesNotMatch("(?i).*[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}.*")
                        .doesNotMatch(".*[+]?\\d{9,15}.*")));
    }

    @Test
    void unfulfilledAndRevokedCountOnlyCommittedTransitions() {
        var driver = rides.driverNear(PICKUP);
        OrderView order = order(rides.client());
        jdbc.sql("""
                update dispatch_attempt set total_deadline = now() - interval '1 second', next_action_at = now()
                where order_id = :id
                """).param("id", order.id()).update();
        double before = counter("blizz.orders.unfulfilled");
        double revoked = counter("blizz.offers", "outcome", "REVOKED");
        rollback(() -> { worker.runOnce(); assertThat(counter("blizz.orders.unfulfilled")).isEqualTo(before); });
        assertThat(counter("blizz.offers", "outcome", "REVOKED")).isEqualTo(revoked);
        worker.runOnce();
        assertThat(counter("blizz.orders.unfulfilled")).isEqualTo(before + 1);
        assertThat(counter("blizz.offers", "outcome", "REVOKED")).isEqualTo(revoked + 1);
        worker.runOnce();
        assertThat(counter("blizz.orders.unfulfilled")).isEqualTo(before + 1);
        assertThat(dispatch.offers(driver.actor())).isEmpty();
    }

    @Test
    void offerAndBroadcastAssignmentTimersIgnoreRollbackAndReplay() {
        for (String source : new String[] {"OFFER", "BROADCAST"}) {
            Actor payer = rides.client();
            var driver = source.equals("OFFER") ? rides.driverNear(PICKUP) : null;
            OrderView order = order(payer);
            if (driver == null) driver = rides.driverNear(PICKUP);
            var d = driver;
            UUID offer = source.equals("OFFER") ? offer(d) : null;
            UUID command = UUID.randomUUID();
            jdbc.sql("update dispatch_attempt set created_at = now() - interval '10 seconds' where order_id = :id")
                    .param("id", order.id()).update();
            long before = timer("blizz.dispatch.assigned", "source", source);
            double elapsed = seconds("blizz.dispatch.assigned", "source", source);
            double accepted = counter("blizz.offers", "outcome", "ACCEPTED");
            Runnable assign = () -> {
                if (offer != null) dispatch.accept(d.actor(), command, offer);
                else dispatch.claim(d.actor(), command, order.id());
            };
            rollback(() -> { assign.run(); assertThat(timer("blizz.dispatch.assigned", "source", source)).isEqualTo(before); });
            assertThat(timer("blizz.dispatch.assigned", "source", source)).isEqualTo(before);
            assertThat(counter("blizz.offers", "outcome", "ACCEPTED")).isEqualTo(accepted);
            assign.run();
            assertThat(timer("blizz.dispatch.assigned", "source", source)).isEqualTo(before + 1);
            assertThat(seconds("blizz.dispatch.assigned", "source", source) - elapsed)
                    .isBetween(9.0, 30.0);
            assign.run();
            assertThat(timer("blizz.dispatch.assigned", "source", source)).isEqualTo(before + 1);
            assertThat(counter("blizz.offers", "outcome", "ACCEPTED")).isEqualTo(accepted + (offer == null ? 0 : 1));
        }
    }

    @Test
    void firstOfferUsesSearchStartOnceEvenWithASecondOfferAndRollback() {
        OrderView order = order(rides.client()); // no drivers; starts as broadcast
        jdbc.sql("""
                update dispatch_attempt set phase = 'PERSONAL', created_at = now() - interval '10 seconds',
                    phase_deadline = now() + interval '30 seconds', next_action_at = now() where order_id = :id
                """).param("id", order.id()).update();
        rides.driverNear(PICKUP);
        rides.driverNear(PICKUP);
        long before = timer("blizz.dispatch.first_offer");
        double elapsed = seconds("blizz.dispatch.first_offer");
        rollback(() -> { worker.runOnce(); assertThat(timer("blizz.dispatch.first_offer")).isEqualTo(before); });
        assertThat(timer("blizz.dispatch.first_offer")).isEqualTo(before);
        worker.runOnce();
        assertThat(timer("blizz.dispatch.first_offer")).isEqualTo(before + 1);
        assertThat(seconds("blizz.dispatch.first_offer") - elapsed).isBetween(9.0, 30.0);
        jdbc.sql("update offer set expires_at = now() - interval '1 second' where order_id = :id")
                .param("id", order.id()).update();
        jdbc.sql("update dispatch_attempt set next_action_at = now() where order_id = :id")
                .param("id", order.id()).update();
        double expired = counter("blizz.offers", "outcome", "EXPIRED");
        rollback(worker::runOnce);
        assertThat(counter("blizz.offers", "outcome", "EXPIRED")).isEqualTo(expired);
        worker.runOnce();
        assertThat(counter("blizz.offers", "outcome", "EXPIRED")).isEqualTo(expired + 1);
        assertThat(timer("blizz.dispatch.first_offer")).isEqualTo(before + 1);
        assertThat(jdbc.sql("select count(*) from offer where order_id = :id").param("id", order.id())
                .query(Integer.class).single()).isEqualTo(2);
    }

    @Test
    void declinedOffersCountOnlyOnceAfterCommit() {
        var driver = rides.driverNear(PICKUP);
        order(rides.client());
        UUID offer = offer(driver), command = UUID.randomUUID();
        double before = counter("blizz.offers", "outcome", "DECLINED");
        Runnable reject = () -> dispatch.reject(driver.actor(), command, offer);
        rollback(() -> { reject.run(); assertThat(counter("blizz.offers", "outcome", "DECLINED")).isEqualTo(before); });
        assertThat(counter("blizz.offers", "outcome", "DECLINED")).isEqualTo(before);
        reject.run();
        assertThat(counter("blizz.offers", "outcome", "DECLINED")).isEqualTo(before + 1);
        reject.run();
        assertThat(counter("blizz.offers", "outcome", "DECLINED")).isEqualTo(before + 1);
    }

    @Test
    void exclusionsCountEachJournalRoundOnlyAfterCommitAndNotOnCommandReplay() {
        var paused = rides.driverNear(PICKUP);
        var state = sessions.availability(paused.actor().id());
        sessions.pause(paused.actor(), UUID.randomUUID(), paused.device(), state.sessionVersion());
        Actor payer = rides.client();
        CreateOrder request = request(payer, null, null);
        UUID command = UUID.randomUUID();
        double before = counter("blizz.dispatch.excluded", "reason", "PAUSED");
        rollback(() -> {
            orders.create(payer, command, request);
            assertThat(counter("blizz.dispatch.excluded", "reason", "PAUSED")).isEqualTo(before);
        });
        assertThat(counter("blizz.dispatch.excluded", "reason", "PAUSED")).isEqualTo(before);
        orders.create(payer, command, request);
        assertThat(counter("blizz.dispatch.excluded", "reason", "PAUSED")).isEqualTo(before + 1);
        orders.create(payer, command, request);
        assertThat(counter("blizz.dispatch.excluded", "reason", "PAUSED")).isEqualTo(before + 1);
    }
}
