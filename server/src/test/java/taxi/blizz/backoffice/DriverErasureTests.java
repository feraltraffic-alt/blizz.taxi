package taxi.blizz.backoffice;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.finance.Ledger;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.OtpAudience;
import taxi.blizz.identity.OtpService;
import taxi.blizz.identity.SessionService;
import taxi.blizz.operations.Dispatch;
import taxi.blizz.operations.OrderChat;
import taxi.blizz.operations.OrderView;
import taxi.blizz.operations.Orders;
import taxi.blizz.operations.Ratings;
import taxi.blizz.operations.TripView;
import taxi.blizz.operations.Trips;
import taxi.blizz.operations.WorkSessions;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.platform.internal.OutboxRelay;
import taxi.blizz.pricing.QuoteService;

/**
 * The driver's side of E1 (issue #144): after a driver's deletion no column of the schema holds the driver's phone or
 * a word they wrote, searched the same way as for riders ({@link RiderErasureTests#holders}) with the same K columns
 * left out. Earnings, trips and the car stay; what the rider wrote stays the rider's. Its own city at longitude 119.
 */
@SpringBootTest
@Import({TestcontainersConfiguration.class, ClientDeletionTests.Capture.class})
class DriverErasureTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, 119.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 119.55);

    @Autowired DriverDeletionReview review;
    @Autowired JdbcClient jdbc;
    @Autowired SessionService auth;
    @Autowired OtpService otp;
    @Autowired OutboxRelay relay;
    @Autowired Ledger ledger;
    @Autowired SupportCases support;
    @Autowired Orders orders;
    @Autowired Dispatch dispatch;
    @Autowired Trips trips;
    @Autowired WorkSessions sessions;
    @Autowired QuoteService quotes;
    @Autowired OrderChat chat;
    @Autowired Ratings ratings;

    private void deliverEvents() {
        while (relay.runOnce() > 0) {
            // drain
        }
    }

    private Actor staff() {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, all_cities, state, created_at,
                                                updated_at)
                        values (:id, :login, 'Privacy', 'ADMIN', :permissions, true, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "driver-erasure-" + id)
                .param("permissions", new String[] {DriverDeletionReview.DELETE_PERMISSION}).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private void settle(Actor driver) {
        for (Ledger.Balance b : ledger.balances(Ledger.Account.DRIVER_PAYABLE, driver.id())) {
            long owed = b.debitMinor() - b.creditMinor();
            if (owed > 0) {
                UUID basis = UUID.randomUUID();
                ledger.post(new Ledger.Posting("test-settle:" + basis, "TEST", basis, b.currency(), "Paid in",
                        List.of(Ledger.Line.credit(Ledger.Account.DRIVER_PAYABLE, driver.id(), owed),
                                Ledger.Line.debit(Ledger.Account.SUSPENSE, null, owed))));
            }
        }
    }

    private List<String> holders(List<String> needles) {
        Map<RiderErasureTests.Column, Character> classes = RiderErasureTests.classification();
        return RiderErasureTests.holders(jdbc, needles, column -> classes.get(column) == Character.valueOf('K'));
    }

    @Test
    void afterTheDeletionNoColumnHoldsTheDriversPhoneOrWords() {
        TestRides rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        UUID city = rides.city("test-driver-erasure", "UAH", 119);
        jdbc.sql("""
                        update ride_order set status = 'UNFULFILLED'
                        where city_id = :c and status in ('READY', 'SEARCHING', 'ASSIGNED', 'IN_SERVICE')""")
                .param("c", city).update();
        String words = "Kalyna" + UUID.randomUUID().toString().substring(0, 8);
        TestRides.Driver driver = rides.driverNear(PICKUP);
        Actor me = driver.actor();
        String phone = jdbc.sql("select phone_normalized from driver where id = :id").param("id", me.id())
                .query(String.class).single();
        jdbc.sql("update driver set name = :name, language = 'uk' where id = :id")
                .param("name", "Petro " + words).param("id", me.id()).update();

        // A ride: the driver writes in the chat and rates the rider; the rider writes too.
        Actor rider = rides.client();
        rides.moveTo(driver, TestRides.north(PICKUP, 1000));
        OrderView order = rides.order(rider, city, PICKUP, DROPOFF);
        dispatch.accept(me, driver.device(), UUID.randomUUID(), dispatch.offers(me).getFirst().id());
        chat.post(me, UUID.randomUUID(), order.id(), "Call me at " + phone + ", " + words);
        chat.post(rider, UUID.randomUUID(), order.id(), "I am coming");
        TripView trip = trips.current(me).orElseThrow();
        rides.moveTo(driver, TestRides.north(PICKUP, 30));
        trip = trips.arrive(me, UUID.randomUUID(), trip.id(), trip.version(), null);
        trip = trips.start(me, UUID.randomUUID(), trip.id(), trip.version(), null);
        trips.complete(me, UUID.randomUUID(), trip.id(), trip.version(), OffsetDateTime.now(), true);
        ratings.submit(me, UUID.randomUUID(), order.id(), 4, "Late passenger, " + words);
        deliverEvents();
        settle(me);

        // Support with a file, a document, a sign-in code and its delivery, a call, a sent push.
        SupportCases.Case opened = support.open(me, UUID.randomUUID(), SupportCases.Category.OTHER, order.id(),
                "Payout " + words, "Reach me at " + phone + ", " + words);
        jdbc.sql("update support_case set state = 'RESOLVED', resolution = :r where id = :id")
                .param("r", "Paid to " + words).param("id", opened.id()).update();
        UUID message = jdbc.sql("select id from support_message where case_id = :id and author_type = 'DRIVER'")
                .param("id", opened.id()).query(UUID.class).single();
        UUID file = UUID.randomUUID();
        jdbc.sql("""
                        insert into file_object (id, owner_type, owner_id, purpose, declared_content_type,
                                                 declared_size_bytes, state, storage_key, upload_expires_at, created_at,
                                                 attached_at)
                        values (:id, 'DRIVER', :driver, 'SUPPORT_ATTACHMENT', 'image/png', 10, 'SAFE', :key,
                                now(), now(), now())""")
                .param("id", file).param("driver", me.id()).param("key", "test/driver-erasure/" + file).update();
        jdbc.sql("""
                        insert into support_message_attachment (message_id, file_id, content_type, size_bytes, name,
                                                                created_at)
                        values (:message, :file, 'image/png', 10, :name, now())""")
                .param("message", message).param("file", file).param("name", "receipt-" + words + ".png").update();
        jdbc.sql("""
                        insert into driver_document (id, driver_id, type, number, valid_from, valid_to, decision,
                                                     created_at)
                        values (:id, :driver, 'DRIVER_LICENSE', :number, current_date - 400, current_date + 400,
                                'ACCEPTED', now())""")
                .param("id", UUID.randomUUID()).param("driver", me.id()).param("number", "LIC-" + words).update();
        UUID challenge = otp.requestChallenge(OtpAudience.DRIVER, phone, "device-" + words, "10.1.2.4")
                .challengeId();
        jdbc.sql("""
                        insert into otp_delivery (id, challenge_id, phone, audience, channel, provider, state,
                                                  attempted_at)
                        values (:id, :challenge, :phone, 'DRIVER', 'SMS', 'FAKE', 'SENT', now())""")
                .param("id", UUID.randomUUID()).param("challenge", challenge).param("phone", phone).update();
        UUID call = UUID.randomUUID();
        jdbc.sql("""
                        insert into call (id, channel_id, caller_phone, caller_raw, called_number, state, started_at,
                                          ended_at)
                        values (:id, :channel, :phone, :raw, '+380441234567', 'ENDED', now(), now())""")
                .param("id", call).param("channel", "driver-erasure-" + call).param("phone", phone)
                .param("raw", phone.substring(3)).update();
        jdbc.sql("""
                        insert into notification (id, event_id, recipient_type, recipient_id, channel, template,
                                                  template_version, locale, title, body, data, state, next_attempt_at,
                                                  deadline, created_at)
                        values (:id, :event, 'DRIVER', :driver, 'PUSH', 'driver.payout', 1, 'uk', 'Payout',
                                :body, '{}'::jsonb, 'SENT', now(), now() + interval '1 hour', now())""")
                .param("id", UUID.randomUUID()).param("event", UUID.randomUUID()).param("driver", me.id())
                .param("body", "Petro " + words + ", your payout is ready").update();
        jdbc.sql("""
                        update work_session set state = 'CLOSED', closed_at = now()
                        where driver_id = :d and state <> 'CLOSED'""")
                .param("d", me.id()).update();
        deliverEvents();
        String digits = phone.substring(phone.length() - 9);
        assertThat(holders(List.of(digits, words))).as("the fixture spread the data")
                .contains("driver.phone_normalized", "driver.name", "order_message.body", "rating.comment",
                        "support_case.subject", "support_message.body", "support_message_attachment.name",
                        "driver_document.number", "otp_challenge.phone_normalized", "otp_delivery.phone",
                        "call.caller_phone", "notification.body");

        jdbc.sql("""
                        update driver set account_state = 'DELETION_PENDING', deletion_previous_state = 'ACTIVE',
                                          deletion_requested_at = now() where id = :id""")
                .param("id", me.id()).update();
        assertThat(review.complete(staff(), UUID.randomUUID(), me.id(), "Confirmed by the driver").accountState())
                .isEqualTo("ANONYMIZED");
        deliverEvents();

        assertThat(new TreeSet<>(holders(List.of(digits, words))))
                .as("columns still holding the deleted driver's phone or words").isEmpty();
        assertThat(jdbc.sql("select count(*) from command_receipt where scope like :scope")
                .param("scope", "DRIVER:" + me.id() + ":%").query(Long.class).single())
                .as("the driver's own command receipts").isZero();
        assertThat(jdbc.sql("select body from order_message where order_id = :id order by sequence")
                .param("id", order.id()).query(String.class).list()).as("what the rider wrote stays")
                .containsExactly("[deleted]", "I am coming");
        assertThat(jdbc.sql("select count(*) from file_object where id = :id and erase_requested_at is null")
                .param("id", file).query(Long.class).single()).as("the support file is queued for deletion").isZero();
    }
}
