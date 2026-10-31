package taxi.blizz.notification.internal;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Map;
import java.util.UUID;
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
import taxi.blizz.identity.IssuedSession;
import taxi.blizz.identity.SessionService;
import taxi.blizz.identity.VerifiedSubject;
import taxi.blizz.operations.CallerContact;
import taxi.blizz.operations.CreateOrder;
import taxi.blizz.operations.Dispatch;
import taxi.blizz.operations.OfferView;
import taxi.blizz.operations.OrderChannel;
import taxi.blizz.operations.OrderView;
import taxi.blizz.operations.Orders;
import taxi.blizz.operations.PaymentMethod;
import taxi.blizz.operations.Trips;
import taxi.blizz.operations.WorkSessions;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.platform.internal.OutboxRelay;
import taxi.blizz.pricing.QuoteService;

/**
 * Issue #143, part 1 (REQ-NTF-03, AC-19, REQ-RID-05): a notification is sent only while what it announces is still
 * current — the offer open, the assignment not replaced — and its deadline comes from the event (E3). The rider's order
 * shows the current driver only, and why the driver changed. Its own city at longitude 152.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class ReassignmentNotificationTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, 152.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 152.55);

    @Autowired Orders orders;
    @Autowired Dispatch dispatch;
    @Autowired Trips trips;
    @Autowired WorkSessions sessions;
    @Autowired SessionService auth;
    @Autowired QuoteService quotes;
    @Autowired OutboxRelay relay;
    @Autowired PushWorker pushes;
    @Autowired SmsWorker sms;
    @Autowired FakePushProvider push;
    @Autowired PushDevices devices;
    @Autowired JdbcClient jdbc;

    TestRides rides;
    UUID city;

    @BeforeEach
    void city() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        city = rides.city("test-reassignment-push", "UAH", 152);
        jdbc.sql("""
                        update dispatch_attempt set phase = 'STOPPED', next_action_at = null
                        where phase in ('PERSONAL', 'BROADCAST')
                          and order_id in (select id from ride_order where city_id = :c)""")
                .param("c", city).update();
        jdbc.sql("""
                        update ride_order set status = 'UNFULFILLED'
                        where city_id = :c and status in ('READY', 'SEARCHING', 'ASSIGNED', 'IN_SERVICE')""")
                .param("c", city).update();
        deliver();
        while (pushes.runOnce() > 0) {
            // nothing of earlier tests left to send
        }
        push.reset();
    }

    // ------------------------------------------------------------ E3

    @Test
    void aDriverReplacedBeforeThePushLeavesIsNeverAnnouncedAndTheRiderHearsAboutTheSecond() {
        TestRides.Driver first = rides.driverNear(PICKUP);
        TestRides.Driver second = rides.driverNear(TestRides.north(PICKUP, 2000));
        Actor rider = rides.client();
        String token = register(rider);
        OrderView order = rides.order(rider, city, PICKUP, DROPOFF);
        UUID firstAssignment = accept(first, order).id();

        // Before any push leaves: staff take the first driver off, the second takes the order.
        orders.revokeAssignment(staff(), UUID.randomUUID(), order.id(), orders.get(order.id()).version(),
                "DRIVER_NOT_RESPONDING", "Driver does not answer");
        UUID secondAssignment = accept(second, order).id();
        deliver();
        assertThat(states(rider, "rider.driver-assigned")).as("both queued before sending").hasSize(2);

        while (pushes.runOnce() > 0) {
            // send what is due
        }

        assertThat(stateOf(rider, "rider.driver-assigned", firstAssignment)).isEqualTo("SUPERSEDED");
        assertThat(stateOf(rider, "rider.driver-assigned", secondAssignment)).isEqualTo("SENT");
        List<FakePushProvider.Sent> sent = push.sent().stream().filter(s -> s.token().equals(token))
                .filter(s -> "rider.driver-assigned".equals(s.data().get("type"))).toList();
        assertThat(sent).hasSize(1);
        assertThat(sent.getFirst().data()).containsEntry("assignment_id", secondAssignment.toString());
    }

    @Test
    void anOfferPushLastsAsLongAsTheOfferAndIsDroppedOnceTheOfferIsClosed() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        String token = register(driver.actor());
        rides.order(rides.client(), city, PICKUP, DROPOFF);
        OfferView offer = dispatch.offers(driver.actor()).getFirst();
        deliver();

        Map<String, Object> row = jdbc.sql("""
                        select deadline, data ->> 'offer_id' as offer_id from notification
                        where recipient_id = :d and template = 'driver.offer'""")
                .param("d", driver.actor().id()).query().singleRow();
        assertThat(((java.sql.Timestamp) row.get("deadline")).toInstant()).as("the offer's own deadline")
                .isEqualTo(offer.expiresAt().toInstant());
        assertThat(row.get("offer_id")).isEqualTo(offer.id().toString());

        sessions.pause(driver.actor(), UUID.randomUUID(), driver.device(),
                sessions.availability(driver.actor().id()).sessionVersion());
        while (pushes.runOnce() > 0) {
            // send what is due
        }
        assertThat(states(driver.actor(), "driver.offer")).containsExactly("SUPERSEDED");
        assertThat(push.sent()).noneMatch(s -> s.token().equals(token));
    }

    @Test
    void theCallersSmsAboutAReplacedDriverIsNotSent() {
        TestRides.Driver first = rides.driverNear(PICKUP);
        TestRides.Driver second = rides.driverNear(TestRides.north(PICKUP, 2000));
        Actor operator = staff();
        UUID quote = new TestQuotes(jdbc, quotes).quote(operator, city, "STANDARD", PICKUP, DROPOFF).id();
        String phone = "+38067" + String.format("%07d", Math.floorMod(UUID.randomUUID().hashCode(), 10_000_000));
        OrderView order = orders.create(operator, UUID.randomUUID(), new CreateOrder(null, "STANDARD", PICKUP,
                "Вокзал", DROPOFF, "Аеропорт", PaymentMethod.CASH, quote, OrderChannel.PHONE, null,
                new CallerContact("Олена", phone), null, false));
        UUID firstAssignment = accept(first, order).id();
        orders.revokeAssignment(operator, UUID.randomUUID(), order.id(), orders.get(order.id()).version(),
                "DRIVER_NOT_RESPONDING", "Driver does not answer");
        UUID secondAssignment = accept(second, order).id();
        deliver();

        while (sms.runOnce() > 0) {
            // send what is due
        }

        assertThat(smsState(order, firstAssignment)).isEqualTo("SUPERSEDED");
        assertThat(smsState(order, secondAssignment)).isEqualTo("SENT");
    }

    // ------------------------------------------------------------ the rider's view (REQ-RID-05)

    @Test
    void theRiderSeesTheCurrentDriverOnlyAndWhyTheDriverChanged() {
        TestRides.Driver first = rides.driverNear(PICKUP);
        TestRides.Driver second = rides.driverNear(TestRides.north(PICKUP, 2000));
        Actor rider = rides.client();
        OrderView order = rides.order(rider, city, PICKUP, DROPOFF);
        accept(first, order);

        OrderView assigned = orders.get(order.id());
        assertThat(assigned.driver()).isNotNull();
        assertThat(assigned.driver().registrationNumber()).isEqualTo("AA4000AA");
        assertThat(assigned.driver().make()).isEqualTo("Skoda");
        assertThat(assigned.driver().photoUrl()).isNull();
        assertThat(assigned.driverChange()).isNull();

        orders.revokeAssignment(staff(), UUID.randomUUID(), order.id(), assigned.version(),
                "DRIVER_NOT_RESPONDING", "Driver does not answer");
        OrderView searching = orders.get(order.id());
        assertThat(searching.assignment()).as("the revoked assignment is hidden").isNull();
        assertThat(searching.driver()).isNull();
        assertThat(searching.driverChange().reasonCode()).isEqualTo("SERVICE_REASSIGNED");

        accept(second, order);
        OrderView again = orders.get(order.id());
        assertThat(again.assignment().driverId()).isEqualTo(second.actor().id());
        assertThat(again.driver()).isNotNull();

        var trip = trips.current(second.actor()).orElseThrow();
        trips.withdraw(second.actor(), UUID.randomUUID(), trip.id(), trip.version(), "VEHICLE_PROBLEM", "Flat tyre");
        OrderView withdrawn = orders.get(order.id());
        assertThat(withdrawn.assignment()).isNull();
        assertThat(withdrawn.driverChange().reasonCode()).isEqualTo("DRIVER_CANCELLED");
    }

    // ------------------------------------------------------------ helpers

    private taxi.blizz.operations.AssignmentView accept(TestRides.Driver driver, OrderView order) {
        OfferView offer = dispatch.offers(driver.actor()).stream().filter(o -> o.orderId().equals(order.id()))
                .findFirst().orElseThrow();
        return dispatch.accept(driver.actor(), driver.device(), UUID.randomUUID(), offer.id());
    }

    private void deliver() {
        while (relay.runOnce() > 0) {
            // deliver the events
        }
    }

    private String register(Actor actor) {
        IssuedSession session = auth.open(new VerifiedSubject(actor, "ACTIVE", false), "reassignment-push");
        String token = "fcm-" + UUID.randomUUID();
        devices.register(actor, session.sessionId(), UUID.randomUUID(),
                new PushDevices.Registration("ANDROID", token, "uk"));
        return token;
    }

    private List<String> states(Actor recipient, String template) {
        return jdbc.sql("select state from notification where recipient_id = :r and template = :t order by created_at")
                .param("r", recipient.id()).param("t", template).query(String.class).list();
    }

    private String stateOf(Actor recipient, String template, UUID assignmentId) {
        return jdbc.sql("""
                        select state from notification
                        where recipient_id = :r and template = :t and data ->> 'assignment_id' = :a""")
                .param("r", recipient.id()).param("t", template).param("a", assignmentId.toString())
                .query(String.class).single();
    }

    private String smsState(OrderView order, UUID assignmentId) {
        return jdbc.sql("""
                        select state from notification
                        where channel = 'SMS' and template = 'caller.driver-assigned'
                          and data ->> 'order_id' = :o and data ->> 'assignment_id' = :a""")
                .param("o", order.id().toString()).param("a", assignmentId.toString()).query(String.class).single();
    }

    private Actor staff() {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, all_cities, state, created_at,
                                                updated_at)
                        values (:id, :login, 'Dispatcher', 'OPERATOR', '{orders.create,orders.reassign}', true,
                                'ACTIVE', now(), now())""")
                .param("id", id).param("login", "reassign-push-" + id).update();
        return new Actor(SubjectType.STAFF, id);
    }
}
