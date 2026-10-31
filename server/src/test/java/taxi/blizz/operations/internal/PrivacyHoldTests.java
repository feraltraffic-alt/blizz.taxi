package taxi.blizz.operations.internal;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.backoffice.ClientDeletionReview;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.SessionService;
import taxi.blizz.operations.Dispatch;
import taxi.blizz.operations.OrderChat;
import taxi.blizz.operations.Orders;
import taxi.blizz.operations.Trips;
import taxi.blizz.operations.WorkSessions;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.platform.internal.OutboxRelay;
import taxi.blizz.pricing.QuoteService;

/**
 * E2 of issue #144 (REQ-PRV-04): a deleted rider's order with an open chargeback keeps what the dispute needs — the
 * labels, the note, the exact points, the contact and the chat — under a recorded hold; every other order of the rider
 * is anonymized at once. When the chargeback is decided, the sweep finishes the anonymization and releases the hold.
 *
 * <p>The chargeback rows are written directly: a recorded chargeback makes a debt, which blocks the deletion, so the
 * case here is a rider who paid that debt while the bank has not yet decided.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class PrivacyHoldTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.512345, 111.523456);
    static final GeoPoint DROPOFF = new GeoPoint(-39.456789, 111.587654);

    @Autowired
    JdbcClient jdbc;
    @Autowired
    ClientDeletionReview review;
    @Autowired
    OutboxRelay relay;
    @Autowired
    PrivacyHoldSweep sweep;
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
    OrderChat chat;

    private void deliverEvents() {
        while (relay.runOnce() > 0) {
            // drain
        }
    }

    private Actor staff() {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, state, created_at, updated_at)
                        values (:id, :login, 'Privacy', 'ADMIN', :permissions, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "hold-" + id)
                .param("permissions", new String[] {ClientDeletionReview.DELETE_PERMISSION}).update();
        return new Actor(SubjectType.STAFF, id);
    }

    /** A completed ride of {@code rider} with a note, an entrance, a contact and a chat message. */
    private UUID ride(TestRides rides, UUID city, Actor rider, String contactPhone) {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        UUID order = rides.order(rider, city, PICKUP, DROPOFF).id();
        dispatch.accept(driver.actor(), driver.device(), UUID.randomUUID(),
                dispatch.offers(driver.actor()).getFirst().id());
        chat.post(rider, UUID.randomUUID(), order, "Blue door");
        var trip = trips.current(driver.actor()).orElseThrow();
        rides.moveTo(driver, TestRides.north(PICKUP, 30));
        trip = trips.arrive(driver.actor(), UUID.randomUUID(), trip.id(), trip.version(), null);
        trip = trips.start(driver.actor(), UUID.randomUUID(), trip.id(), trip.version(), null);
        rides.complete(new TestRides.Ride(rider, driver, orders.get(order), trip), true);
        jdbc.sql("update ride_order set comment = 'Two bags', entrance = 'Gate 2' where id = :id").param("id", order)
                .update();
        jdbc.sql("""
                        insert into order_contact (order_id, name, phone, created_by, created_at)
                        values (:id, 'Olena', :phone, :by, now())""")
                .param("id", order).param("phone", contactPhone).param("by", rider.id()).update();
        jdbc.sql("update work_session set state = 'CLOSED', closed_at = now() where driver_id = :d and state <> 'CLOSED'")
                .param("d", driver.actor().id()).update();
        return order;
    }

    /** An OPEN chargeback on the order's card payment. */
    private UUID chargeback(UUID order, UUID payer) {
        UUID merchant = UUID.randomUUID();
        jdbc.sql("""
                        insert into payment_merchant (id, provider, account, domain, secret_ref, currency, created_at)
                        values (:id, 'FAKE', :account, 'test.blizz.invalid', 'test', 'UAH', now())""")
                .param("id", merchant).param("account", "hold_" + merchant).update();
        UUID card = UUID.randomUUID();
        jdbc.sql("""
                        insert into payment_card (id, client_id, merchant_id, token, masked_pan, state, created_at)
                        values (:id, :client, :merchant, :token, '4111****1111', 'ACTIVE', now())""")
                .param("id", card).param("client", payer).param("merchant", merchant)
                .param("token", "rec-" + card).update();
        UUID intent = UUID.randomUUID();
        jdbc.sql("""
                        insert into payment_intent (id, order_id, client_id, merchant_id, card_id, currency, hold_minor,
                                                    capture_minor, state, created_at, updated_at)
                        values (:id, :order, :client, :merchant, :card, 'UAH', 5000, 5000, 'PAID', now(), now())""")
                .param("id", intent).param("order", order).param("client", payer).param("merchant", merchant)
                .param("card", card).update();
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into payment_chargeback (id, order_id, intent_id, payer_client_id, amount_minor, currency,
                                                        bank_reason, received_on, state, recorded_by, created_at)
                        values (:id, :order, :intent, :client, 5000, 'UAH', 'Not recognised', current_date, 'OPEN',
                                :client, now())""")
                .param("id", id).param("order", order).param("intent", intent).param("client", payer).update();
        return id;
    }

    private void decide(UUID chargeback) {
        jdbc.sql("""
                        update payment_chargeback set state = 'WON', resolution_reason = 'Proof sent', resolved_at = now(),
                                                      resolved_by = recorded_by, version = version + 1
                        where id = :id""")
                .param("id", chargeback).update();
    }

    private Map<String, Object> order(UUID id) {
        return jdbc.sql("""
                        select pickup_label, dropoff_label, comment, entrance, ST_Y(pickup) as lat, ST_X(pickup) as lon,
                               (select count(*) from order_contact c where c.order_id = o.id) as contacts,
                               (select string_agg(body, '|') from order_message m where m.order_id = o.id
                                                                                     and m.sender_role = 'RIDER') as chat
                        from ride_order o where id = :id""")
                .param("id", id).query().singleRow();
    }

    private List<Map<String, Object>> holds(Actor rider) {
        return jdbc.sql("""
                        select object_type, object_id, basis, released_at is not null as released from privacy_hold
                        where subject_id = :id order by object_type""")
                .param("id", rider.id()).query().listOfRows();
    }

    private void delete(Actor rider) {
        jdbc.sql("""
                        update client set account_state = 'DELETION_PENDING', deletion_previous_state = 'ACTIVE',
                                          deletion_requested_at = now() where id = :id""")
                .param("id", rider.id()).update();
        assertThat(review.complete(staff(), UUID.randomUUID(), rider.id(), "Confirmed").accountState())
                .isEqualTo("ANONYMIZED");
        deliverEvents();
    }

    private static void assertKept(Map<String, Object> order) {
        assertThat(order).containsEntry("pickup_label", "Home").containsEntry("comment", "Two bags")
                .containsEntry("entrance", "Gate 2").containsEntry("lat", PICKUP.lat())
                .containsEntry("lon", PICKUP.lon()).containsEntry("contacts", 1L).containsEntry("chat", "Blue door");
    }

    private static void assertAnonymized(Map<String, Object> order) {
        assertThat(order).containsEntry("pickup_label", "—").containsEntry("dropoff_label", "—")
                .containsEntry("comment", "[deleted]").containsEntry("entrance", "[deleted]")
                .containsEntry("lat", -39.51).containsEntry("lon", 111.52).containsEntry("contacts", 0L)
                .containsEntry("chat", "[deleted]");
    }

    @Test
    void anOpenChargebackHoldsItsOrderUntilItIsDecided() {
        TestRides rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        UUID city = rides.city("test-privacy-hold", "UAH", 111);
        Actor rider = rides.client();
        UUID disputed = ride(rides, city, rider, "+48600000001");
        UUID plain = ride(rides, city, rider, "+48600000002");
        UUID chargeback = chargeback(disputed, rider.id());

        delete(rider);
        assertKept(order(disputed));
        assertAnonymized(order(plain));
        assertThat(holds(rider)).containsExactly(Map.of("object_type", "ORDER", "object_id", disputed,
                "basis", "CHARGEBACK", "released", false));

        // Still open: the sweep keeps it; a redelivered event neither adds a hold nor touches the order.
        sweep.runOnce();
        UUID event = jdbc.sql("select event_id from outbox where event_type = 'ClientAnonymized' and aggregate_id = :id")
                .param("id", rider.id()).query(UUID.class).single();
        jdbc.sql("delete from consumer_inbox where event_id = :id").param("id", event).update();
        jdbc.sql("update outbox set state = 'PENDING', next_attempt_at = now() where event_id = :id")
                .param("id", event).update();
        deliverEvents();
        assertKept(order(disputed));
        assertThat(holds(rider)).hasSize(1);

        decide(chargeback);
        assertThat(sweep.runOnce()).isEqualTo(1);
        assertAnonymized(order(disputed));
        assertThat(holds(rider)).containsExactly(Map.of("object_type", "ORDER", "object_id", disputed,
                "basis", "CHARGEBACK", "released", true));
        assertThat(sweep.runOnce()).as("a repeat finds nothing").isZero();
    }

    @Test
    void theRiderAsSomeoneElsesContactIsHeldOnlyOnADisputedOrder() {
        TestRides rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        UUID city = rides.city("test-privacy-hold", "UAH", 111);
        Actor rider = rides.client();
        String phone = jdbc.sql("select phone_normalized from client where id = :id").param("id", rider.id())
                .query(String.class).single();
        Actor payer = rides.client();
        UUID disputed = ride(rides, city, payer, phone);
        UUID plain = ride(rides, city, payer, phone);
        UUID chargeback = chargeback(disputed, payer.id());

        delete(rider);
        assertThat(order(disputed)).as("the payer's order keeps its contact").containsEntry("contacts", 1L)
                .containsEntry("pickup_label", "Home");
        assertThat(order(plain)).as("the payer's own data stays").containsEntry("contacts", 0L)
                .containsEntry("pickup_label", "Home").containsEntry("comment", "Two bags");
        assertThat(holds(rider)).containsExactly(Map.of("object_type", "ORDER_CONTACT", "object_id", disputed,
                "basis", "CHARGEBACK", "released", false));

        decide(chargeback);
        assertThat(sweep.runOnce()).isEqualTo(1);
        assertThat(order(disputed)).containsEntry("contacts", 0L).containsEntry("pickup_label", "Home");
        assertThat(holds(rider)).extracting(h -> h.get("released")).containsExactly(true);
    }
}
