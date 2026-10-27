package taxi.blizz.telephony.internal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.WebSocket;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.TestQuotes;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.ApiAudience;
import taxi.blizz.identity.SessionService;
import taxi.blizz.identity.VerifiedSubject;
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
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.platform.internal.OutboxRelay;
import taxi.blizz.pricing.QuoteService;
import taxi.blizz.telephony.Calls;
import taxi.blizz.telephony.FakeCallEvents;
import tools.jackson.databind.json.JsonMapper;

/**
 * Incoming calls (issue #64, REQ-OPS-01/07/08/10, AC-06, T-36) on the fake event source: the log from Asterisk's
 * events, repeats, missed calls, the card-pop on /ws/v1/operator, the operator's answer, the link to a phone order
 * and what happens while Asterisk is unreachable.
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Import(TestcontainersConfiguration.class)
class CallLogTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, 65.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 65.55);

    @Value("${local.server.port}")
    int port;
    @Autowired
    FakeCallEvents asterisk;
    @Autowired
    Calls calls;
    @Autowired
    JdbcCalls log;
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
    JdbcClient jdbc;
    @Autowired
    JsonMapper json;

    TestRides rides;
    UUID cityId;
    UUID otherCity;
    String line;

    @BeforeEach
    void setUp() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        cityId = rides.city("test-calls", "UAH", 65);
        otherCity = UUID.randomUUID();
        line = newPhone("+38044");
        jdbc.sql("insert into call_line (number, city_id, version, updated_at) values (:n, :c, 1, now())")
                .param("n", line).param("c", cityId).update();
        deliverEvents();
    }

    // ------------------------------------------------------------ fixtures

    private static String newPhone(String prefix) {
        return prefix + String.format("%07d", Math.floorMod(UUID.randomUUID().hashCode(), 10_000_000));
    }

    private Actor operator(UUID city, String... permissions) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, city_scope, state, created_at,
                                                updated_at)
                        values (:id, :login, 'Operator', 'OPERATOR', :permissions, :scope, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "calls-" + id).param("permissions", permissions)
                .param("scope", new UUID[]{city}).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private Actor callOperator(UUID city) {
        return operator(city, Calls.ANSWER_PERMISSION, Orders.CREATE_PERMISSION, Orders.CANCEL_PERMISSION);
    }

    private String channel() {
        return "1730052000." + Math.floorMod(UUID.randomUUID().hashCode(), 1_000_000);
    }

    /** As Asterisk sends them on the ARI events WebSocket (caller number without "+", as trunks often do). */
    private void created(String channel, String caller, String called) {
        asterisk.push("""
                {"type":"ChannelCreated","timestamp":"2026-10-27T18:00:00.000+0000","application":"blizz-calls",
                 "channel":{"id":"%s","name":"PJSIP/trunk-00000001","state":"Ring","linkedid":"%s",
                 "caller":{"name":"","number":"%s"},"dialplan":{"context":"from-trunk","exten":"%s","priority":1}}}"""
                .formatted(channel, channel, caller.replace("+", ""), called.replace("+", "")));
    }

    private void up(String channel) {
        asterisk.push("""
                {"type":"ChannelStateChange","timestamp":"2026-10-27T18:00:05.000+0000",
                 "channel":{"id":"%s","state":"Up"}}""".formatted(channel));
    }

    private void destroyed(String channel) {
        asterisk.push("""
                {"type":"ChannelDestroyed","timestamp":"2026-10-27T18:02:00.000+0000","cause":16,
                 "cause_txt":"Normal Clearing","channel":{"id":"%s","state":"Up"}}""".formatted(channel));
    }

    private Calls.Call call(String channel) {
        UUID id = jdbc.sql("select id from call where channel_id = :c").param("c", channel).query(UUID.class)
                .single();
        return calls.find(id).orElseThrow();
    }

    private long rows(String channel) {
        return jdbc.sql("select count(*) from call where channel_id = :c").param("c", channel).query(Long.class)
                .single();
    }

    private void deliverEvents() {
        while (relay.runOnce() > 0) {
            // drain
        }
    }

    private static void assertCode(ThrowingCallable call, ErrorCode code) {
        assertThatThrownBy(call).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }

    /** A connection that collects what it receives. */
    static final class Inbox implements WebSocket.Listener {
        final List<String> messages = new CopyOnWriteArrayList<>();
        private final StringBuilder partial = new StringBuilder();

        @Override
        public CompletionStage<?> onText(WebSocket socket, CharSequence data, boolean last) {
            partial.append(data);
            if (last) {
                messages.add(partial.toString());
                partial.setLength(0);
            }
            socket.request(1);
            return null;
        }
    }

    private Inbox connect(Actor staff) throws InterruptedException {
        String token = auth.openStaff(new VerifiedSubject(staff, "ACTIVE", false), ApiAudience.OPERATOR, "calls-test")
                .accessToken();
        Inbox inbox = new Inbox();
        HttpClient.newHttpClient().newWebSocketBuilder().connectTimeout(Duration.ofSeconds(5))
                .header("Authorization", "Bearer " + token)
                .buildAsync(URI.create("ws://localhost:" + port + "/ws/v1/operator"), inbox).join();
        for (int i = 0; i < 50 && inbox.messages.isEmpty(); i++) {
            TimeUnit.MILLISECONDS.sleep(100);
        }
        assertThat(inbox.messages).first().asString().contains("Connected");
        return inbox;
    }

    @SuppressWarnings("unchecked")
    private List<Map<String, Object>> pops(Inbox inbox, UUID callId) {
        return inbox.messages.stream().map(m -> (Map<String, Object>) json.readValue(m, Map.class))
                .filter(m -> "CallRinging".equals(m.get("type")))
                .map(m -> (Map<String, Object>) m.get("payload"))
                .filter(p -> callId.toString().equals(p.get("call_id"))).toList();
    }

    private Map<String, Object> awaitPop(Inbox inbox, UUID callId) throws InterruptedException {
        for (int i = 0; i < 50; i++) {
            List<Map<String, Object>> found = pops(inbox, callId);
            if (!found.isEmpty()) {
                return found.getFirst();
            }
            TimeUnit.MILLISECONDS.sleep(100);
        }
        throw new AssertionError("No card-pop for " + callId + " in " + inbox.messages);
    }

    private OrderView phoneOrder(Actor operator, String callerPhone, UUID callId, boolean again) {
        UUID quote = new TestQuotes(jdbc, quotes).quote(operator, cityId, "STANDARD", PICKUP, DROPOFF).id();
        CreateOrder order = new CreateOrder(null, "STANDARD", PICKUP, "Home", DROPOFF, "Work", PaymentMethod.CASH,
                quote, OrderChannel.PHONE, null, new CallerContact("Caller", callerPhone));
        return callId == null ? orders.create(operator, UUID.randomUUID(), order)
                : orders.createDuringCall(operator, UUID.randomUUID(), order, callId, again);
    }

    /** Clean-up: staff and riders each give a reason of their own list. */
    private void cancel(Actor who, OrderView order) {
        orders.cancel(who, UUID.randomUUID(), order.id(), orders.get(order.id()).version(),
                who.type() == SubjectType.STAFF ? "NO_CARS" : "CHANGED_MIND");
    }

    // ------------------------------------------------------------ the log

    @Test
    void ringingAnsweredEndedAndEveryEventOfOneCallLandsOnOneRow() {
        String channel = channel();
        String caller = newPhone("+38067");
        created(channel, caller, line);
        created(channel, caller, line); // Asterisk resent it, or a reconnect replayed it
        assertThat(rows(channel)).isEqualTo(1);
        Calls.Call ringing = call(channel);
        assertThat(ringing.state()).isEqualTo(Calls.State.RINGING);
        assertThat(ringing.callerPhone()).as("normalized to E.164").isEqualTo(caller);
        assertThat(ringing.calledNumber()).isEqualTo(line);
        assertThat(ringing.cityId()).isEqualTo(cityId);
        assertThat(jdbc.sql("""
                        select count(*) from outbox where event_type = 'CallRinging' and aggregate_id = :id""")
                .param("id", ringing.id()).query(Long.class).single()).as("one card-pop per call").isEqualTo(1);

        up(channel);
        up(channel);
        assertThat(call(channel).state()).isEqualTo(Calls.State.ANSWERED);
        assertThat(call(channel).answeredAt()).isNotNull();
        destroyed(channel);
        destroyed(channel);
        Calls.Call ended = call(channel);
        assertThat(ended.state()).isEqualTo(Calls.State.ENDED);
        assertThat(ended.endedAt()).isNotNull();
        up(channel);
        assertThat(call(channel).state()).as("an event after the end changes nothing").isEqualTo(Calls.State.ENDED);
    }

    @Test
    void aCallNobodyTookIsMissedAndLegsAndOtherNumbersAreNotCalls() {
        String missed = channel();
        created(missed, newPhone("+38067"), line);
        destroyed(missed);
        assertThat(call(missed).state()).isEqualTo(Calls.State.MISSED);

        String elsewhere = channel();
        created(elsewhere, newPhone("+38067"), "101"); // an operator's extension, an outgoing call…
        created(channel(), newPhone("+38067"), newPhone("+38044")); // a number without a call line
        assertThat(rows(elsewhere)).isZero();

        String leg = channel();
        asterisk.push("""
                {"type":"ChannelCreated","channel":{"id":"%s","linkedid":"%s","caller":{"number":"380671112233"},
                 "dialplan":{"exten":"%s"}}}""".formatted(leg, missed, line.replace("+", "")));
        assertThat(rows(leg)).as("a leg of another call").isZero();

        asterisk.push("not json at all");
        asterisk.push("{\"type\":\"ChannelCreated\"}");
        // Still listening.
        String after = channel();
        created(after, newPhone("+38067"), line);
        assertThat(rows(after)).isEqualTo(1);
    }

    @Test
    void aCallWhoseEndWasNeverReportedIsClosedLater() {
        String lost = channel();
        created(lost, newPhone("+38067"), line);
        jdbc.sql("update call set started_at = now() - interval '5 hours' where channel_id = :c").param("c", lost)
                .update();
        assertThat(log.closeStale(Duration.ofHours(4))).isGreaterThanOrEqualTo(1);
        assertThat(call(lost).state()).isEqualTo(Calls.State.MISSED);
        assertThat(jdbc.sql("select ended_reason from call where channel_id = :c").param("c", lost)
                .query(String.class).single()).isEqualTo("LOST");
    }

    // ------------------------------------------------------------ the operators

    @Test
    void theOperatorsOfTheCityGetTheCardPopWithTheRiderAndHisOpenOrders() throws Exception {
        Actor mine = callOperator(cityId);
        Actor elsewhere = callOperator(otherCity);
        Actor withoutTheRight = operator(cityId, Orders.CREATE_PERMISSION);
        Inbox mineInbox = connect(mine);
        Inbox elsewhereInbox = connect(elsewhere);
        assertThatThrownBy(() -> connect(withoutTheRight)).as("no calls.answer: no operator channel")
                .rootCause().hasMessageContaining("403");

        // A known rider with an open order.
        TestRides.Driver driver = rides.driverNear(PICKUP);
        Actor rider = rides.client();
        jdbc.sql("update client set name = 'Olena' where id = :id").param("id", rider.id()).update();
        String riderPhone = jdbc.sql("select phone_normalized from client where id = :id").param("id", rider.id())
                .query(String.class).single();
        OrderView open = rides.order(rider, cityId, PICKUP, DROPOFF);
        String known = channel();
        created(known, riderPhone, line);
        deliverEvents();
        Map<String, Object> pop = awaitPop(mineInbox, call(known).id());
        assertThat(pop).containsEntry("caller_phone", riderPhone).containsEntry("client_id", rider.id().toString())
                .containsEntry("client_name", "Olena").containsEntry("city_id", cityId.toString());
        assertThat(pop.get("open_order_ids")).isEqualTo(List.of(open.id().toString()));
        assertThat(pop.keySet()).containsExactlyInAnyOrder("call_id", "city_id", "caller_phone", "client_id",
                "client_name", "open_order_ids");

        // An unknown caller: the number only.
        String stranger = newPhone("+38067");
        String unknown = channel();
        created(unknown, stranger, line);
        deliverEvents();
        Map<String, Object> strangerPop = awaitPop(mineInbox, call(unknown).id());
        assertThat(strangerPop).containsEntry("caller_phone", stranger).containsEntry("client_id", null)
                .containsEntry("client_name", null).containsEntry("open_order_ids", List.of());

        TimeUnit.MILLISECONDS.sleep(500);
        assertThat(pops(elsewhereInbox, call(known).id())).as("another city").isEmpty();

        // The call log follows the same rule.
        assertThat(calls.recent(mine, null, null, 100)).extracting(Calls.Call::id)
                .contains(call(known).id(), call(unknown).id());
        assertThat(calls.recent(elsewhere, null, null, 100)).extracting(Calls.Call::cityId).doesNotContain(cityId);
        assertThat(calls.recent(mine, Calls.State.ENDED, null, 100)).extracting(Calls.Call::id)
                .doesNotContain(call(known).id());
        assertCode(() -> calls.recent(withoutTheRight, null, null, 10), ErrorCode.ACCESS_DENIED);
        assertCode(() -> calls.answer(elsewhere, UUID.randomUUID(), call(known).id()), ErrorCode.ACCESS_DENIED);

        // The right is taken away during the shift: the next call does not pop for him.
        jdbc.sql("update staff_user set permissions = array_remove(permissions, :p) where id = :id")
                .param("p", Calls.ANSWER_PERMISSION).param("id", mine.id()).update();
        String later = channel();
        created(later, newPhone("+38067"), line);
        deliverEvents();
        TimeUnit.MILLISECONDS.sleep(500);
        assertThat(pops(mineInbox, call(later).id())).isEmpty();
        destroyed(later);

        cancel(rider, open);
        destroyed(known);
        destroyed(unknown);
        DriverOffline.close(sessions, driver);
    }

    @Test
    void oneOperatorTakesTheCallAndAnOrderMadeDuringItIsLinked() {
        Actor anna = callOperator(cityId);
        Actor boris = callOperator(cityId);
        String channel = channel();
        String caller = newPhone("+38067");
        created(channel, caller, line);
        UUID callId = call(channel).id();

        UUID command = UUID.randomUUID();
        Calls.Call taken = calls.answer(anna, command, callId);
        assertThat(taken.answeredBy()).isEqualTo(anna.id());
        assertThat(taken.state()).isEqualTo(Calls.State.ANSWERED);
        assertThat(calls.answer(anna, command, callId).answeredBy()).as("a repeat").isEqualTo(anna.id());
        assertCode(() -> calls.answer(boris, UUID.randomUUID(), callId), ErrorCode.STATE_CONFLICT);
        up(channel); // Asterisk reports the same answer later: nothing changes
        assertThat(call(channel).answeredBy()).isEqualTo(anna.id());

        // The order made during the call is linked; a second one only explicitly; the first link stays.
        OrderView first = phoneOrder(anna, caller, callId, false);
        assertThat(call(channel).orderIds()).containsExactly(first.id());
        assertCode(() -> phoneOrder(anna, caller, callId, false), ErrorCode.STATE_CONFLICT);
        OrderView second = phoneOrder(anna, caller, callId, true);
        assertThat(call(channel).orderIds()).containsExactly(first.id(), second.id());
        assertCode(() -> phoneOrder(anna, caller, UUID.randomUUID(), false), ErrorCode.NOT_FOUND);

        // Hanging up does not cancel anything (REQ-OPS-10).
        destroyed(channel);
        assertThat(call(channel).state()).isEqualTo(Calls.State.ENDED);
        assertThat(orders.get(first.id()).status()).isNotIn("CANCELLED", "UNFULFILLED");
        assertCode(() -> calls.answer(anna, UUID.randomUUID(), callId), ErrorCode.STATE_CONFLICT);

        // A call is linked only by someone who takes calls in its city.
        Actor phoneOnly = operator(cityId, Orders.CREATE_PERMISSION);
        String another = channel();
        created(another, caller, line);
        assertCode(() -> phoneOrder(phoneOnly, newPhone("+38067"), call(another).id(), false),
                ErrorCode.ACCESS_DENIED);

        cancel(anna, first);
        cancel(anna, second);
        destroyed(another);
    }

    // ------------------------------------------------------------ Asterisk down (T-36, AC-06)

    @Test
    void withAsteriskUnreachableCallsAreNotLoggedAndPhoneOrdersStillWork() {
        Actor anna = callOperator(cityId);
        // A server that listens to a real Asterisk which is not there: it keeps retrying in the background.
        TelephonyProperties live = new TelephonyProperties("LIVE", "https://turbosms.test", Duration.ofSeconds(30),
                true, Duration.ofHours(4), false, false, Duration.ofHours(1), 268_435_456L);
        AriEventStream stream = new AriEventStream(new UnreachableAsterisk(), live, new AriCallEvents(log, json));
        long started = System.nanoTime();
        stream.start();
        assertThat(Duration.ofNanos(System.nanoTime() - started)).as("start never waits for Asterisk")
                .isLessThan(Duration.ofSeconds(1));
        try {
            assertThat(stream.connected()).isFalse();
            OrderView manual = phoneOrder(anna, newPhone("+38067"), null, false);
            assertThat(manual.status()).isNotIn("CANCELLED", "UNFULFILLED");
            cancel(anna, manual);
        } finally {
            stream.stop();
        }
        // Back up: the same call's events never make two calls (AC-06).
        String channel = channel();
        created(channel, newPhone("+38067"), line);
        created(channel, newPhone("+38067"), line);
        assertThat(rows(channel)).isEqualTo(1);
        destroyed(channel);
    }

    /** ARI at an address where nothing answers. */
    static final class UnreachableAsterisk extends IntegrationsStub {
        UnreachableAsterisk() {
            super(Map.of(taxi.blizz.configuration.Integrations.OTP_ASTERISK_ARI_URL, "http://127.0.0.1:9",
                    taxi.blizz.configuration.Integrations.OTP_ASTERISK_ARI_USER, "blizz",
                    taxi.blizz.configuration.Integrations.OTP_ASTERISK_ARI_PASSWORD, "nobody-home"));
        }
    }

    /** Closes a test driver's session so later tests do not offer him their orders. */
    static final class DriverOffline {
        static void close(WorkSessions sessions, TestRides.Driver driver) {
            var availability = sessions.availability(driver.actor().id());
            sessions.close(driver.actor(), UUID.randomUUID(), driver.device(), availability.sessionVersion());
        }
    }
}
