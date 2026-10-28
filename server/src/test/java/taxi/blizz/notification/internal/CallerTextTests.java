package taxi.blizz.notification.internal;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
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
import taxi.blizz.identity.SessionService;
import taxi.blizz.operations.CallerContact;
import taxi.blizz.operations.CreateOrder;
import taxi.blizz.operations.Dispatch;
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
import taxi.blizz.telephony.FakeTextMessages;

/** SMS to a phone order's caller and a dispatcher task when it does not reach them (REQ-NTF-08, section 20). */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class CallerTextTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, -94.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, -94.45);

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
    SmsWorker sms;
    @Autowired
    FakeTextMessages texts;
    @Autowired
    JdbcClient jdbc;

    TestRides rides;
    UUID cityId;
    Actor operator;

    @BeforeEach
    void setUp() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        cityId = rides.city("test-caller-sms", "UAH", -95);
        UUID staffId = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, city_scope, state, created_at, updated_at)
                        values (:id, :login, 'Operator', 'OPERATOR', '{orders.create}', :cities, 'ACTIVE', now(), now())""")
                .param("id", staffId).param("login", "caller-sms-" + staffId).param("cities", new UUID[] {cityId})
                .update();
        operator = new Actor(SubjectType.STAFF, staffId);
        drain();
    }

    private void drain() {
        while (relay.runOnce() > 0) {
            // deliver the events
        }
        while (sms.runOnce() > 0) {
            // send what is due
        }
    }

    private static String phone(String prefix, String last4) {
        return prefix + String.format("%03d", Math.floorMod(UUID.randomUUID().hashCode(), 1000)) + last4;
    }

    private OrderView phoneOrder(String callerPhone) {
        UUID quote = new TestQuotes(jdbc, quotes).quote(operator, cityId, "STANDARD", PICKUP, DROPOFF).id();
        return orders.create(operator, UUID.randomUUID(), new CreateOrder(null, "STANDARD", PICKUP, "Вокзал", DROPOFF,
                "Аеропорт", PaymentMethod.CASH, quote, OrderChannel.PHONE, null, new CallerContact("Олена", callerPhone),
                null, false));
    }

    /** A driver online before the order: the offer goes out when the order is made. */
    private TestRides.Driver online() {
        return rides.driverNear(PICKUP);
    }

    private void accept(TestRides.Driver driver) {
        dispatch.accept(driver.actor(), UUID.randomUUID(), dispatch.offers(driver.actor()).getFirst().id());
    }

    private List<String> textsTo(String phone) {
        return texts.to(phone).stream().map(FakeTextMessages.Sent::text).toList();
    }

    @Test
    void theCallerIsToldTheCarAndWhenItIsThere() {
        String caller = phone("+38067", "1234");
        TestRides.Driver driver = online();
        OrderView order = phoneOrder(caller);
        accept(driver);
        drain();

        assertThat(textsTo(caller)).singleElement().satisfies(text -> assertThat(text)
                .startsWith("До вас їде").contains("AA4000AA").contains("Skoda Octavia"));

        rides.moveTo(driver, TestRides.north(PICKUP, 30));
        var trip = trips.current(driver.actor()).orElseThrow();
        trips.arrive(driver.actor(), UUID.randomUUID(), trip.id(), trip.version(), null);
        drain();
        assertThat(textsTo(caller)).hasSize(2).last().asString().contains("чекає на вас");

        drain();
        assertThat(textsTo(caller)).as("a redelivered event texts nobody twice").hasSize(2);
        assertThat(jdbc.sql("select count(*) from notification where recipient_id = :order and channel = 'SMS'")
                .param("order", order.id()).query(Long.class).single()).isEqualTo(2);
    }

    @Test
    void aPolishNumberIsWrittenToInPolish() {
        String caller = phone("+48600", "1234");
        TestRides.Driver driver = online();
        phoneOrder(caller);
        accept(driver);
        drain();
        assertThat(textsTo(caller)).singleElement().asString().startsWith("Jedzie do Ciebie").contains("AA4000AA");
    }

    @Test
    void anAppOrderGetsNoSms() {
        TestRides.Driver driver = online();
        OrderView order = rides.order(rides.client(), cityId, PICKUP, DROPOFF);
        accept(driver);
        drain();
        assertThat(jdbc.sql("select count(*) from notification where recipient_id = :order and channel = 'SMS'")
                .param("order", order.id()).query(Long.class).single()).isZero();
    }

    @Test
    void anSmsThatCannotGoThroughBecomesATaskAndTheAssignmentStays() {
        String caller = phone("+38067", "0000"); // the fake provider refuses numbers ending in 0000
        TestRides.Driver driver = online();
        OrderView order = phoneOrder(caller);
        accept(driver);
        drain();
        assertThat(textsTo(caller)).isEmpty();
        UUID smsId = jdbc.sql("select id from notification where recipient_id = :order and channel = 'SMS'")
                .param("order", order.id()).query(UUID.class).single();
        assertThat(jdbc.sql("select state from notification where id = :id").param("id", smsId).query(String.class)
                .single()).as("retried later").isEqualTo("PENDING");

        // The retries run out (instead of waiting for the back-off).
        jdbc.sql("update notification set attempts = :max, next_attempt_at = now() where id = :id")
                .param("max", PushWorker.MAX_ATTEMPTS).param("id", smsId).update();
        drain();
        drain();

        assertThat(jdbc.sql("select state from notification where id = :id").param("id", smsId).query(String.class)
                .single()).isEqualTo("FAILED");
        assertThat(jdbc.sql("""
                        select count(*) from support_case
                        where order_id = :order and source_key = :key and priority = 'HIGH'""")
                .param("order", order.id()).param("key", "caller-not-notified:" + order.id())
                .query(Long.class).single()).as("one task for the dispatchers").isEqualTo(1);
        assertThat(orders.get(order.id()).assignment()).as("REQ-NTF-08: the assignment stays").isNotNull();
    }

    @Test
    void textsAreShortAndNeverEmpty() {
        Orders.CallerNotice noCar = new Orders.CallerNotice(UUID.randomUUID(), UUID.randomUUID(), "+380671234567",
                null, null);
        assertThat(CallerTexts.text("caller.no-driver", "uk", noCar, "Blizz")).startsWith("На жаль");
        Orders.CallerNotice withCar = new Orders.CallerNotice(UUID.randomUUID(), UUID.randomUUID(), "+380671234567",
                null, new Orders.HistoryVehicle("Skoda", "Octavia", null, "AA4000AA"));
        assertThat(CallerTexts.text("caller.driver-assigned", "uk", withCar, "Blizz"))
                .isEqualTo("До вас їде Skoda Octavia, AA4000AA. Blizz");
    }
}
