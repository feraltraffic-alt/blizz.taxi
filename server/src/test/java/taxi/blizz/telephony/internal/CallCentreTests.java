package taxi.blizz.telephony.internal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.WebSocket;
import java.nio.charset.StandardCharsets;
import java.time.Clock;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.TestQuotes;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.configuration.Integrations;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.ApiAudience;
import taxi.blizz.identity.PhoneNumber;
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
import taxi.blizz.platform.IdempotentCommands;
import taxi.blizz.platform.Outbox;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.platform.internal.OutboxRelay;
import taxi.blizz.pricing.QuoteService;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.telephony.Calls;
import taxi.blizz.telephony.FakeCallEvents;
import tools.jackson.databind.json.JsonMapper;

/**
 * Call centre telephony, part 2 (issue #67, REQ-OPS-08, REQ-PRV-03) on real PostgreSQL: the staff's extensions name
 * who took a call, the operators' status filters the card-pop, click-to-call against an ARI over HTTP rings once and
 * never shows the number, calls are reconciled after a reconnect, and outgoing legs make no warning.
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Import(TestcontainersConfiguration.class)
@ExtendWith(OutputCaptureExtension.class)
class CallCentreTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, 68.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 68.55);

    @Value("${local.server.port}")
    int port;
    @Autowired
    FakeCallEvents asterisk;
    @Autowired
    Calls calls;
    @Autowired
    JdbcCalls log;
    @Autowired
    StaffExtensions extensions;
    @Autowired
    OperatorStatuses statuses;
    @Autowired
    CallRecordings recordings;
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
    @Autowired
    TransactionTemplate tx;
    @Autowired
    IdempotentCommands commands;
    @Autowired
    StaffAccess staffAccess;
    @Autowired
    Outbox outbox;
    @Autowired
    FakeChannels fakeChannels;
    @Autowired
    Clock clock;

    final HttpClient http = HttpClient.newHttpClient();
    UUID cityId;
    String line;
    Actor admin;
    FakeAri ari;

    @BeforeEach
    void setUp() {
        cityId = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes).city("test-call-centre", "UAH", 68);
        line = newPhone("+38044");
        jdbc.sql("insert into call_line (number, city_id, version, updated_at) values (:n, :c, 1, now())")
                .param("n", line).param("c", cityId).update();
        admin = staff(cityId, "settings.manage");
        deliverEvents();
    }

    @AfterEach
    void stopAri() {
        if (ari != null) {
            ari.stop();
        }
    }

    // ------------------------------------------------------------ fixtures

    private static String newPhone(String prefix) {
        return prefix + String.format("%07d", Math.floorMod(UUID.randomUUID().hashCode(), 10_000_000));
    }

    /** A free extension: three random digits after a 5, unique enough between test runs on one database. */
    private String freeExtension() {
        for (int i = 0; i < 100; i++) {
            String candidate = "5" + String.format("%04d", Math.floorMod(UUID.randomUUID().hashCode(), 10_000));
            if (jdbc.sql("select count(*) from staff_extension where extension = :e").param("e", candidate)
                    .query(Long.class).single() == 0) {
                return candidate;
            }
        }
        throw new IllegalStateException("No free extension");
    }

    private Actor staff(UUID city, String... permissions) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, city_scope, state, created_at,
                                                updated_at)
                        values (:id, :login, 'Operator', 'OPERATOR', :permissions, :scope, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "centre-" + id).param("permissions", permissions)
                .param("scope", new UUID[]{city}).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private Actor operatorWithExtension(String extension) {
        Actor operator = staff(cityId, Calls.ANSWER_PERMISSION, Orders.CREATE_PERMISSION, Orders.VIEW_PERMISSION,
                Orders.CANCEL_PERMISSION);
        extensions.change(admin, UUID.randomUUID(), operator.id(), 0, extension, "Desk " + extension);
        return operator;
    }

    private static String channel() {
        return "1730054000." + Math.floorMod(UUID.randomUUID().hashCode(), 1_000_000);
    }

    private void created(String channel, String caller, String exten, String context) {
        asterisk.push("""
                {"type":"ChannelCreated","channel":{"id":"%s","state":"Ring","linkedid":"%s",
                 "caller":{"name":"","number":"%s"},"dialplan":{"context":"%s","exten":"%s"}}}"""
                .formatted(channel, channel, caller.replace("+", ""), context, exten.replace("+", "")));
    }

    private void up(String channel) {
        asterisk.push("{\"type\":\"ChannelStateChange\",\"channel\":{\"id\":\"%s\",\"state\":\"Up\"}}"
                .formatted(channel));
    }

    /** A leg of the call {@code linked} — an operator's phone or the other side — went Up. */
    private void legUp(String linked, String name) {
        asterisk.push("""
                {"type":"ChannelStateChange","channel":{"id":"%s","name":"%s","state":"Up","linkedid":"%s"}}"""
                .formatted(channel(), name, linked));
    }

    private void destroyed(String channel) {
        asterisk.push("{\"type\":\"ChannelDestroyed\",\"cause\":16,\"channel\":{\"id\":\"%s\",\"state\":\"Up\"}}"
                .formatted(channel));
    }

    private Calls.Call call(String channel) {
        UUID id = jdbc.sql("select id from call where channel_id = :c").param("c", channel).query(UUID.class)
                .single();
        return calls.find(id).orElseThrow();
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

    private OrderView phoneOrder(Actor operator, String callerPhone) {
        UUID quote = new TestQuotes(jdbc, quotes).quote(operator, cityId, "STANDARD", PICKUP, DROPOFF).id();
        return orders.create(operator, UUID.randomUUID(), new CreateOrder(null, "STANDARD", PICKUP, "Home", DROPOFF,
                "Work", PaymentMethod.CASH, quote, OrderChannel.PHONE, null, new CallerContact("Caller", callerPhone)));
    }

    private void cancel(Actor operator, OrderView order) {
        orders.cancel(operator, UUID.randomUUID(), order.id(), orders.get(order.id()).version(), "NO_CARS");
    }

    private String token(Actor who) {
        return auth.openStaff(new VerifiedSubject(who, "ACTIVE", false), ApiAudience.OPERATOR, "centre-test")
                .accessToken();
    }

    /** No trace of the number where people or other systems could read it (REQ-PRV-03). */
    private void assertNumberNowhere(String phone, UUID callId, CapturedOutput output) {
        String digits = phone.replace("+", "");
        assertThat(jdbc.sql("select count(*) from call c where c.id = :id and c::text like :d")
                .param("id", callId).param("d", "%" + digits + "%").query(Long.class).single())
                .as("the call row").isZero();
        assertThat(jdbc.sql("select count(*) from outbox where payload::text like :d")
                .param("d", "%" + digits + "%").query(Long.class).single()).as("the outbox").isZero();
        assertThat(jdbc.sql("select count(*) from audit_log where coalesce(after::text, '') || coalesce(before::text, '')"
                        + " like :d").param("d", "%" + digits + "%").query(Long.class).single())
                .as("the audit").isZero();
        assertThat(jdbc.sql("select count(*) from command_receipt where outcome::text like :d")
                .param("d", "%" + digits + "%").query(Long.class).single()).as("the receipts").isZero();
        assertThat(output.getAll()).as("the log").doesNotContain(digits);
    }

    /** ARI over HTTP: records originates, refuses a second one with the same channel id, can drop its answer. */
    static final class FakeAri {
        final HttpServer server;
        final List<String> originates = new CopyOnWriteArrayList<>();
        final List<String> bodies = new CopyOnWriteArrayList<>();
        final Set<String> channels = java.util.concurrent.ConcurrentHashMap.newKeySet();
        final AtomicBoolean dropNextAnswer = new AtomicBoolean();
        final AtomicBoolean failing = new AtomicBoolean();

        FakeAri() throws IOException {
            server = HttpServer.create(new InetSocketAddress("127.0.0.1", 0), 0);
            server.createContext("/ari/channels", exchange -> {
                String query = exchange.getRequestURI().getRawQuery();
                if ("GET".equals(exchange.getRequestMethod())) {
                    StringBuilder list = new StringBuilder("[");
                    channels.forEach(c -> list.append(list.length() > 1 ? "," : "").append("{\"id\":\"")
                            .append(c).append("\"}"));
                    byte[] body = list.append("]").toString().getBytes(StandardCharsets.UTF_8);
                    exchange.sendResponseHeaders(200, body.length);
                    exchange.getResponseBody().write(body);
                    exchange.close();
                    return;
                }
                originates.add(query);
                bodies.add(new String(exchange.getRequestBody().readAllBytes(), StandardCharsets.UTF_8));
                if (failing.get()) {
                    exchange.sendResponseHeaders(500, -1); // Asterisk is broken: nothing was placed
                    exchange.close();
                    return;
                }
                String id = java.net.URLDecoder.decode(query.replaceAll(".*channelId=([^&]*).*", "$1"),
                        StandardCharsets.UTF_8);
                boolean fresh = channels.add(id);
                if (fresh && dropNextAnswer.compareAndSet(true, false)) {
                    exchange.close(); // Asterisk took it, the answer is lost on the way
                    return;
                }
                exchange.sendResponseHeaders(fresh ? 200 : 409, -1);
                exchange.close();
            });
            server.start();
        }

        String url() {
            return "http://127.0.0.1:" + server.getAddress().getPort();
        }

        void stop() {
            server.stop(0);
        }
    }

    private static TelephonyProperties live() {
        return new TelephonyProperties("LIVE", "https://turbosms.test", Duration.ofSeconds(30), true,
                Duration.ofHours(4), false, false, Duration.ofHours(1), 268_435_456L, "PJSIP/{extension}",
                "blizz-outgoing", List.of("blizz-outgoing", "from-internal"));
    }

    private JdbcCalls liveCalls(String ariUrl) {
        return liveCalls(ariUrl, taxi.blizz.platform.ProviderBreakers.none());
    }

    private JdbcCalls liveCalls(String ariUrl, taxi.blizz.platform.ProviderBreakers breakers) {
        Integrations integrations = new IntegrationsStub(Map.of(Integrations.OTP_ASTERISK_ARI_URL, ariUrl,
                Integrations.OTP_ASTERISK_ARI_USER, "blizz", Integrations.OTP_ASTERISK_ARI_PASSWORD, "test-only"));
        return new JdbcCalls(jdbc, tx, commands, staffAccess, outbox, live(),
                new AriChannels(integrations, json, breakers), fakeChannels, clock);
    }

    /**
     * #145 E2: Asterisk answering 5xx opens its breaker; the next call from an order is refused at once with 503
     * PROVIDER_UNAVAILABLE, and Asterisk is not asked again until the breaker lets a probe through.
     */
    @Test
    void aBrokenAsteriskOpensItsBreakerAndCallsAreRefusedWithoutAskingIt() throws Exception {
        ari = new FakeAri();
        ari.failing.set(true);
        JdbcCalls guarded = liveCalls(ari.url(), taxi.blizz.platform.ProviderBreakers.of(2, Duration.ofMinutes(1),
                Clock.systemUTC()));
        Actor anna = operatorWithExtension(freeExtension());
        String callerPhone = newPhone("+38067");
        OrderView order = phoneOrder(anna, callerPhone);
        Calls.Outbound toCaller = new Calls.Outbound(order.id(), cityId, Calls.Party.CALLER,
                PhoneNumber.parse(callerPhone));
        for (int i = 0; i < 2; i++) {
            assertCode(() -> guarded.dial(anna, UUID.randomUUID(), toCaller), ErrorCode.PROVIDER_UNAVAILABLE);
        }
        assertThat(ari.originates).as("two real failures").hasSize(2);
        long started = System.nanoTime();
        assertCode(() -> guarded.dial(anna, UUID.randomUUID(), toCaller), ErrorCode.PROVIDER_UNAVAILABLE);
        assertThat(Duration.ofNanos(System.nanoTime() - started)).isLessThan(Duration.ofSeconds(2));
        assertThat(ari.originates).as("the open breaker does not ask Asterisk").hasSize(2);
        cancel(anna, order);
    }

    // ------------------------------------------------------------ extensions and who took a call

    @Test
    void theOperatorsPhoneNamesWhoTookTheCallAndTheFirstAnswerStays(CapturedOutput output) {
        String annaDesk = freeExtension();
        Actor anna = operatorWithExtension(annaDesk);
        String borisDesk = freeExtension();
        Actor boris = operatorWithExtension(borisDesk);
        assertCode(() -> extensions.change(admin, UUID.randomUUID(), boris.id(), 1, annaDesk, "Swap"),
                ErrorCode.STATE_CONFLICT);
        assertCode(() -> extensions.change(boris, UUID.randomUUID(), boris.id(), 1, "777", "Mine"),
                ErrorCode.ACCESS_DENIED);
        assertCode(() -> extensions.change(admin, UUID.randomUUID(), boris.id(), 1, "1x", "Bad"),
                ErrorCode.VALIDATION_FAILED);
        assertThat(extensions.list(admin)).extracting(StaffExtensions.Extension::staffId).contains(anna.id(), boris.id());
        assertThat(jdbc.sql("select count(*) from audit_log where action = 'staff_extension.change' and resource_id = :id")
                .param("id", anna.id().toString()).query(Long.class).single()).isEqualTo(1);

        // Anna's phone answers: she took it; the button of another operator is then a conflict.
        String first = channel();
        created(first, newPhone("+38067"), line, "from-trunk");
        legUp(first, "PJSIP/" + annaDesk + "-0000002a");
        up(first);
        assertThat(call(first).answeredBy()).isEqualTo(anna.id());
        assertThat(call(first).state()).isEqualTo(Calls.State.ANSWERED);
        assertCode(() -> calls.answer(boris, UUID.randomUUID(), call(first).id()), ErrorCode.STATE_CONFLICT);
        assertThat(calls.answer(anna, UUID.randomUUID(), call(first).id()).answeredBy()).isEqualTo(anna.id());

        // Boris presses the button first, then Anna's phone answers: the first answer stays, the other is logged.
        String second = channel();
        created(second, newPhone("+38067"), line, "from-trunk");
        calls.answer(boris, UUID.randomUUID(), call(second).id());
        legUp(second, "PJSIP/" + annaDesk + "-0000002b");
        assertThat(call(second).answeredBy()).isEqualTo(boris.id());
        assertThat(output.getAll()).contains("took it in the panel first; kept");

        // A phone that is no staff member's changes nothing.
        String third = channel();
        created(third, newPhone("+38067"), line, "from-trunk");
        legUp(third, "PJSIP/trunk-0000002c");
        assertThat(call(third).answeredBy()).isNull();

        destroyed(first);
        destroyed(second);
        destroyed(third);
    }

    // ------------------------------------------------------------ status and the card-pop

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

        boolean popped(UUID callId) {
            return messages.stream().anyMatch(m -> m.contains("CallRinging") && m.contains(callId.toString()));
        }
    }

    private Inbox connect(Actor staff) throws InterruptedException {
        Inbox inbox = new Inbox();
        http.newWebSocketBuilder().connectTimeout(Duration.ofSeconds(5))
                .header("Authorization", "Bearer " + token(staff))
                .buildAsync(URI.create("ws://localhost:" + port + "/ws/v1/operator"), inbox).join();
        for (int i = 0; i < 50 && inbox.messages.isEmpty(); i++) {
            TimeUnit.MILLISECONDS.sleep(100);
        }
        return inbox;
    }

    private void awaitPop(Inbox inbox, UUID callId) throws InterruptedException {
        for (int i = 0; i < 50 && !inbox.popped(callId); i++) {
            TimeUnit.MILLISECONDS.sleep(100);
        }
        assertThat(inbox.popped(callId)).as("card-pop for " + callId).isTrue();
    }

    @Test
    void theCardPopGoesToTheAvailableOperatorsWhenThereIsOneAndSupervisorsSeeTheStatus() throws Exception {
        Actor anna = staff(cityId, Calls.ANSWER_PERMISSION);
        Actor boris = staff(cityId, Calls.ANSWER_PERMISSION);
        Actor supervisor = staff(cityId, Calls.SUPERVISE_PERMISSION);
        assertThat(statuses.mine(anna).status()).as("never set").isEqualTo(OperatorStatuses.Status.OFFLINE);
        Inbox annaInbox = connect(anna);
        Inbox borisInbox = connect(boris);

        // Nobody AVAILABLE: everyone gets it, as before.
        String first = channel();
        created(first, newPhone("+38067"), line, "from-trunk");
        deliverEvents();
        awaitPop(annaInbox, call(first).id());
        awaitPop(borisInbox, call(first).id());

        // Anna is AVAILABLE, Boris on a break: only Anna.
        UUID command = UUID.randomUUID();
        assertThat(statuses.change(anna, command, OperatorStatuses.Status.AVAILABLE).status())
                .isEqualTo(OperatorStatuses.Status.AVAILABLE);
        assertThat(statuses.change(anna, command, OperatorStatuses.Status.AVAILABLE).changedAt()).as("a repeat")
                .isNotNull();
        statuses.change(boris, UUID.randomUUID(), OperatorStatuses.Status.BREAK);
        String second = channel();
        created(second, newPhone("+38067"), line, "from-trunk");
        deliverEvents();
        awaitPop(annaInbox, call(second).id());
        TimeUnit.MILLISECONDS.sleep(500);
        assertThat(borisInbox.popped(call(second).id())).as("on a break while Anna is available").isFalse();

        // The supervisor of the city sees both; an operator is not a supervisor.
        assertThat(statuses.inCity(supervisor, cityId))
                .filteredOn(o -> o.staffId().equals(anna.id()) || o.staffId().equals(boris.id()))
                .extracting(OperatorStatuses.Operator::status)
                .containsExactlyInAnyOrder(OperatorStatuses.Status.AVAILABLE, OperatorStatuses.Status.BREAK);
        assertCode(() -> statuses.inCity(anna, cityId), ErrorCode.ACCESS_DENIED);
        assertCode(() -> statuses.inCity(supervisor, UUID.randomUUID()), ErrorCode.ACCESS_DENIED);
        assertCode(() -> statuses.mine(supervisor), ErrorCode.ACCESS_DENIED);

        statuses.change(anna, UUID.randomUUID(), OperatorStatuses.Status.OFFLINE);
        destroyed(first);
        destroyed(second);
    }

    // ------------------------------------------------------------ click-to-call

    @Test
    void clickToCallAsksAriOnceWithTheNumberOnlyInTheBodyAndNeverShowsIt(CapturedOutput output) throws Exception {
        ari = new FakeAri();
        JdbcCalls liveCalls = liveCalls(ari.url());
        String desk = freeExtension();
        Actor anna = operatorWithExtension(desk);
        String callerPhone = newPhone("+38067");
        OrderView order = phoneOrder(anna, callerPhone);
        UUID command = UUID.randomUUID();
        Calls.Outbound toCaller = new Calls.Outbound(order.id(), cityId, Calls.Party.CALLER,
                PhoneNumber.parse(callerPhone));

        Calls.Call placed = liveCalls.dial(anna, command, toCaller);
        assertThat(placed.direction()).isEqualTo(Calls.Direction.OUTBOUND);
        assertThat(placed.party()).isEqualTo(Calls.Party.CALLER);
        assertThat(placed.state()).isEqualTo(Calls.State.RINGING);
        assertThat(placed.answeredBy()).isEqualTo(anna.id());
        assertThat(placed.orderIds()).containsExactly(order.id());
        assertThat(placed.callerPhone()).isNull();
        assertThat(placed.calledNumber()).isNull();
        assertThat(ari.originates).hasSize(1);
        assertThat(ari.originates.getFirst()).contains("endpoint=PJSIP%2F" + desk).contains("context=blizz-outgoing")
                .contains("channelId=" + placed.id()).doesNotContain(callerPhone.replace("+", ""));
        assertThat(json.readTree(ari.bodies.getFirst()).at("/variables/BLIZZ_DIAL").asString()).isEqualTo(callerPhone);

        // A repeat returns the same call and does not ring again.
        assertThat(liveCalls.dial(anna, command, toCaller).id()).isEqualTo(placed.id());
        assertThat(ari.originates).hasSize(1);

        // The operator picks up, then the other side; the call is recorded like an incoming one.
        String channelId = placed.id().toString();
        up(channelId);
        assertThat(call(channelId).state()).as("only my phone").isEqualTo(Calls.State.RINGING);
        legUp(channelId, "PJSIP/trunk-0000003a");
        assertThat(call(channelId).state()).isEqualTo(Calls.State.ANSWERED);
        destroyed(channelId);
        assertThat(call(channelId).state()).isEqualTo(Calls.State.ENDED);
        assertThat(call(channelId).recording().state()).isEqualTo(Calls.RecordingState.PENDING);
        assertThat(calls.recent(anna, null, order.id(), 10)).extracting(Calls.Call::id).contains(placed.id());
        assertNumberNowhere(callerPhone, placed.id(), output);

        // Without an extension; a side the order does not have.
        Actor noDesk = staff(cityId, Orders.VIEW_PERMISSION);
        assertCode(() -> liveCalls.dial(noDesk, UUID.randomUUID(), toCaller), ErrorCode.STATE_CONFLICT);
        assertCode(() -> calls.answer(anna, UUID.randomUUID(), placed.id()), ErrorCode.STATE_CONFLICT);
        cancel(anna, order);
    }

    @Test
    void aLostAnswerFromAriThenARepeatGivesOneChannelAndUnreachableAriFailsTheCall() throws Exception {
        ari = new FakeAri();
        JdbcCalls liveCalls = liveCalls(ari.url());
        Actor anna = operatorWithExtension(freeExtension());
        String callerPhone = newPhone("+38067");
        OrderView order = phoneOrder(anna, callerPhone);
        Calls.Outbound toCaller = new Calls.Outbound(order.id(), cityId, Calls.Party.CALLER,
                PhoneNumber.parse(callerPhone));

        // Asterisk took the first request, its answer was lost: 503, the call waits as DIALING.
        ari.dropNextAnswer.set(true);
        UUID command = UUID.randomUUID();
        assertCode(() -> liveCalls.dial(anna, command, toCaller), ErrorCode.PROVIDER_UNAVAILABLE);
        UUID callId = jdbc.sql("select id from call where order_id = :o").param("o", order.id())
                .query(UUID.class).single();
        assertThat(calls.find(callId).orElseThrow().state()).isEqualTo(Calls.State.DIALING);
        // The repeat asks again with the same channel id: Asterisk says it exists — it is ringing, one channel.
        Calls.Call repeated = liveCalls.dial(anna, command, toCaller);
        assertThat(repeated.id()).isEqualTo(callId);
        assertThat(repeated.state()).isEqualTo(Calls.State.RINGING);
        assertThat(ari.channels).containsExactly(callId.toString());
        assertThat(ari.originates).hasSize(2);
        destroyed(callId.toString());

        // Asterisk not there at all: FAILED and 503; the same command keeps failing, a new one places a new call.
        JdbcCalls nowhere = liveCalls("http://127.0.0.1:9");
        UUID failing = UUID.randomUUID();
        assertCode(() -> nowhere.dial(anna, failing, toCaller), ErrorCode.PROVIDER_UNAVAILABLE);
        UUID failed = jdbc.sql("select id from call where order_id = :o and state = 'FAILED'").param("o", order.id())
                .query(UUID.class).single();
        assertThat(jdbc.sql("select ended_reason from call where id = :id").param("id", failed).query(String.class)
                .single()).isEqualTo("FAILED");
        assertCode(() -> nowhere.dial(anna, failing, toCaller), ErrorCode.PROVIDER_UNAVAILABLE);
        assertThat(liveCalls.dial(anna, UUID.randomUUID(), toCaller).id()).isNotEqualTo(failed);
        cancel(anna, order);
    }

    @Test
    void theOrderEndpointRingsWithoutTheNumberInTheAnswer(CapturedOutput output) throws Exception {
        Actor anna = operatorWithExtension(freeExtension());
        String callerPhone = newPhone("+38067");
        OrderView order = phoneOrder(anna, callerPhone);
        HttpResponse<String> answer = http.send(HttpRequest.newBuilder(
                                URI.create("http://localhost:" + port + "/api/operator/v1/orders/" + order.id() + "/calls"))
                        .header("Authorization", "Bearer " + token(anna)).header("Content-Type", "application/json")
                        .POST(HttpRequest.BodyPublishers.ofString(
                                "{\"command_id\":\"" + UUID.randomUUID() + "\",\"to\":\"CALLER\"}")).build(),
                HttpResponse.BodyHandlers.ofString());
        assertThat(answer.statusCode()).as(answer.body()).isEqualTo(201);
        String digits = callerPhone.replace("+", "");
        assertThat(answer.body()).contains("\"direction\":\"OUTBOUND\"").contains("\"party\":\"CALLER\"")
                .doesNotContain(digits);
        UUID callId = UUID.fromString(json.readTree(answer.body()).get("id").asString());
        assertThat(asterisk.originated()).filteredOn(o -> o.channelId().equals(callId.toString()))
                .singleElement().satisfies(o -> assertThat(o.dial()).isEqualTo(callerPhone));
        assertNumberNowhere(callerPhone, callId, output);

        // No driver yet; another city's operator; no extension.
        HttpResponse<String> noDriver = http.send(HttpRequest.newBuilder(
                                URI.create("http://localhost:" + port + "/api/operator/v1/orders/" + order.id() + "/calls"))
                        .header("Authorization", "Bearer " + token(anna)).header("Content-Type", "application/json")
                        .POST(HttpRequest.BodyPublishers.ofString(
                                "{\"command_id\":\"" + UUID.randomUUID() + "\",\"to\":\"DRIVER\"}")).build(),
                HttpResponse.BodyHandlers.ofString());
        assertThat(noDriver.statusCode()).isEqualTo(409);
        Actor elsewhere = staff(UUID.randomUUID(), Orders.VIEW_PERMISSION);
        HttpResponse<String> foreign = http.send(HttpRequest.newBuilder(
                                URI.create("http://localhost:" + port + "/api/operator/v1/orders/" + order.id() + "/calls"))
                        .header("Authorization", "Bearer " + token(elsewhere)).header("Content-Type", "application/json")
                        .POST(HttpRequest.BodyPublishers.ofString(
                                "{\"command_id\":\"" + UUID.randomUUID() + "\",\"to\":\"CALLER\"}")).build(),
                HttpResponse.BodyHandlers.ofString());
        assertThat(foreign.statusCode()).isEqualTo(403);
        destroyed(callId.toString());
        cancel(anna, order);
    }

    // ------------------------------------------------------------ reconciliation and quiet legs

    @Test
    void afterAReconnectTheCallsWhoseChannelIsGoneAreClosedAndATakenOneGetsItsRecording() throws Exception {
        String gone = channel();
        String goneTaken = channel();
        String stillThere = channel();
        for (String c : List.of(gone, goneTaken, stillThere)) {
            created(c, newPhone("+38067"), line, "from-trunk");
        }
        up(goneTaken);
        ari = new FakeAri();
        ari.channels.add(stillThere);
        JdbcCalls live = liveCalls(ari.url());
        Set<String> alive = new AriChannels(new IntegrationsStub(Map.of(Integrations.OTP_ASTERISK_ARI_URL, ari.url(),
                Integrations.OTP_ASTERISK_ARI_USER, "blizz", Integrations.OTP_ASTERISK_ARI_PASSWORD, "test-only")),
                json).channels();
        assertThat(alive).containsExactly(stillThere);

        live.reconcile(alive, OffsetDateTime.now(clock).plusSeconds(1));
        assertThat(call(gone).state()).isEqualTo(Calls.State.MISSED);
        assertThat(call(goneTaken).state()).isEqualTo(Calls.State.ENDED);
        assertThat(call(goneTaken).recording().state()).isEqualTo(Calls.RecordingState.PENDING);
        assertThat(call(stillThere).state()).isEqualTo(Calls.State.RINGING);
        assertThat(jdbc.sql("select ended_reason from call where channel_id = :c").param("c", gone)
                .query(String.class).single()).isEqualTo("LOST");

        // A call that started after the snapshot is left alone.
        String newer = channel();
        created(newer, newPhone("+38067"), line, "from-trunk");
        live.reconcile(Set.of(), OffsetDateTime.now(clock).minusMinutes(1));
        assertThat(call(newer).state()).isEqualTo(Calls.State.RINGING);
        destroyed(newer);
        destroyed(stillThere);
        while (recordings.fetchDue() > 0) {
            // fetch the recording of the taken one (fake source)
        }
        assertThat(call(goneTaken).recording().state()).isEqualTo(Calls.RecordingState.STORED);
    }

    @Test
    void outgoingLegsAndAnOperatorsOwnPhoneMakeNoWarningButAnUnknownServiceNumberDoes(CapturedOutput output) {
        String desk = freeExtension();
        operatorWithExtension(desk);
        String outgoingTarget = newPhone("+38050");
        created(channel(), desk, outgoingTarget, "blizz-outgoing");
        String fromDesk = newPhone("+38063");
        created(channel(), desk, fromDesk, "from-operators");
        String internal = newPhone("+38066");
        created(channel(), "380671112233", internal, "from-internal");
        String masked = new PhoneNumber(outgoingTarget).masked();
        assertThat(output.getAll()).doesNotContain(masked).doesNotContain(new PhoneNumber(fromDesk).masked())
                .doesNotContain(new PhoneNumber(internal).masked());

        String unknownLine = newPhone("+38044");
        created(channel(), "380671112233", unknownLine, "from-trunk");
        assertThat(output.getAll()).contains(new PhoneNumber(unknownLine).masked());
    }
}
