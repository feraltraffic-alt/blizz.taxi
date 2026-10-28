package taxi.blizz.notification;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.WebSocket;
import java.net.http.WebSocketHandshakeException;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletionException;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.ApiAudience;
import taxi.blizz.identity.SessionService;
import taxi.blizz.identity.VerifiedSubject;
import taxi.blizz.operations.Dispatch;
import taxi.blizz.operations.OrderView;
import taxi.blizz.operations.Orders;
import taxi.blizz.operations.Trips;
import taxi.blizz.operations.WorkSessions;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.internal.OutboxRelay;
import taxi.blizz.pricing.QuoteService;
import tools.jackson.databind.json.JsonMapper;

/** The live channel (section 20, REQ-NTF-04/05): who gets which order changes, and nothing personal in them. */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Import(TestcontainersConfiguration.class)
class LiveChannelTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, 45.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 45.55);

    @Value("${local.server.port}")
    int port;
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

    @BeforeEach
    void setUp() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        cityId = rides.city("test-live-channel", "UAH", 45);
        while (relay.runOnce() > 0) {
            // earlier events do not count
        }
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

    private WebSocket connect(String path, String bearer, String queryToken, Inbox inbox) {
        WebSocket.Builder builder = HttpClient.newHttpClient().newWebSocketBuilder().connectTimeout(Duration.ofSeconds(5));
        if (bearer != null) {
            builder.header("Authorization", "Bearer " + bearer);
        }
        String uri = "ws://localhost:" + port + path + (queryToken == null ? "" : "?access_token=" + queryToken);
        return builder.buildAsync(URI.create(uri), inbox).join();
    }

    private String token(Actor actor) {
        return auth.open(new VerifiedSubject(actor, "ACTIVE", false), "live-test").accessToken();
    }

    @SuppressWarnings("unchecked")
    private List<Map<String, Object>> events(Inbox inbox, UUID orderId) {
        return inbox.messages.stream().map(m -> (Map<String, Object>) json.readValue(m, Map.class))
                .filter(m -> orderId.toString().equals(m.get("aggregate_id"))).toList();
    }

    private void await(Inbox inbox, UUID orderId, String type) throws InterruptedException {
        for (int i = 0; i < 50; i++) {
            if (events(inbox, orderId).stream().anyMatch(e -> type.equals(e.get("type")))) {
                return;
            }
            TimeUnit.MILLISECONDS.sleep(100);
        }
        throw new AssertionError("No " + type + " for " + orderId + " in " + inbox.messages);
    }

    @Test
    void theRiderAndTheOfferedDriverHearAboutTheOrderAndNobodyElse() throws Exception {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        Actor rider = rides.client();
        Actor stranger = rides.client();
        Inbox riderInbox = new Inbox();
        Inbox driverInbox = new Inbox();
        Inbox strangerInbox = new Inbox();
        connect("/ws/v1/rider", token(rider), null, riderInbox);
        connect("/ws/v1/driver", null, token(driver.actor()), driverInbox); // the browser way
        connect("/ws/v1/rider", token(stranger), null, strangerInbox);
        for (int i = 0; i < 50 && riderInbox.messages.isEmpty(); i++) {
            TimeUnit.MILLISECONDS.sleep(100);
        }
        assertThat(riderInbox.messages).as("greeted").isNotEmpty();
        assertThat(riderInbox.messages.getFirst()).contains("Connected");

        OrderView order = rides.order(rider, cityId, PICKUP, DROPOFF);
        while (relay.runOnce() > 0) {
            // deliver
        }
        await(riderInbox, order.id(), "OrderCreated");
        await(riderInbox, order.id(), "OrderSearchStarted");
        await(driverInbox, order.id(), "OfferMade");

        dispatch.accept(driver.actor(), UUID.randomUUID(), dispatch.offers(driver.actor()).getFirst().id());
        while (relay.runOnce() > 0) {
            // deliver
        }
        await(riderInbox, order.id(), "AssignmentCommitted");
        await(driverInbox, order.id(), "AssignmentCommitted");

        assertThat(strangerInbox.messages).noneMatch(m -> m.contains(order.id().toString()));
        List<Map<String, Object>> seen = events(riderInbox, order.id());
        assertThat(seen).allSatisfy(e -> assertThat(e).containsKeys("event_id", "aggregate_version", "occurred_at")
                .containsEntry("aggregate_type", "Order").containsEntry("payload", Map.of()));
        assertThat(String.join("", driverInbox.messages)).as("nothing personal").doesNotContain("+380", "+48");
    }

    /** Remembers how the server closed the connection. */
    static final class Closing implements WebSocket.Listener {
        final java.util.concurrent.CompletableFuture<Integer> closedWith = new java.util.concurrent.CompletableFuture<>();

        @Override
        public CompletionStage<?> onClose(WebSocket socket, int status, String reason) {
            closedWith.complete(status);
            return null;
        }
    }

    @Test
    void aRevokedSessionLosesItsConnectionWithinSecondsNotWhenTheTokenExpires() throws Exception {
        Actor rider = rides.client();
        Closing closing = new Closing();
        HttpClient.newHttpClient().newWebSocketBuilder().header("Authorization", "Bearer " + token(rider))
                .buildAsync(URI.create("ws://localhost:" + port + "/ws/v1/rider"), closing).join();
        auth.revokeAll(rider, "test: account blocked");
        // The tests recheck every second (blizz.live.recheck); a real server every 15 s.
        assertThat(closing.closedWith.get(10, TimeUnit.SECONDS)).isEqualTo(4403);
    }

    @Test
    void wrongAudienceOrNoTokenIsRefused() {
        Actor rider = rides.client();
        assertThatThrownBy(() -> connect("/ws/v1/driver", token(rider), null, new Inbox()))
                .isInstanceOf(CompletionException.class).hasCauseInstanceOf(WebSocketHandshakeException.class);
        assertThatThrownBy(() -> connect("/ws/v1/rider", null, null, new Inbox()))
                .isInstanceOf(CompletionException.class).hasCauseInstanceOf(WebSocketHandshakeException.class);
    }
}
