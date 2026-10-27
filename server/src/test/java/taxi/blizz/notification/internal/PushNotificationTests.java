package taxi.blizz.notification.internal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.web.client.RestClient;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.configuration.ServiceSettings;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.IssuedSession;
import taxi.blizz.identity.SessionService;
import taxi.blizz.identity.VerifiedSubject;
import taxi.blizz.operations.Dispatch;
import taxi.blizz.operations.OrderView;
import taxi.blizz.operations.Orders;
import taxi.blizz.operations.Trips;
import taxi.blizz.operations.WorkSessions;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.OutboxMessage;
import taxi.blizz.platform.internal.OutboxRelay;
import taxi.blizz.pricing.QuoteService;

/** Push notifications (section 20, REQ-NTF-02/03/07): devices, texts, languages, retries and deadlines. */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Import(TestcontainersConfiguration.class)
class PushNotificationTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, 90.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 90.55);

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
    PushDevices devices;
    @Autowired
    NotificationFeed feed;
    @Autowired
    PushWorker worker;
    @Autowired
    FakePushProvider push;
    @Autowired
    ServiceSettings settings;

    TestRides rides;
    UUID cityId;

    @BeforeEach
    void setUp() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        cityId = rides.city("test-push", "UAH", 90);
        deliverEvents();
        push.reset();
    }

    private void deliverEvents() {
        while (relay.runOnce() > 0) {
            // drain
        }
    }

    private void sendPushes() {
        while (worker.runOnce() > 0) {
            // drain
        }
    }

    private IssuedSession session(Actor actor) {
        return auth.open(new VerifiedSubject(actor, "ACTIVE", false), "push-test");
    }

    private String register(Actor actor, IssuedSession session, String platform, String locale) {
        String token = "fcm-" + UUID.randomUUID();
        devices.register(actor, session.sessionId(), UUID.randomUUID(),
                new PushDevices.Registration(platform, token, locale));
        return token;
    }

    private List<FakePushProvider.Sent> sentTo(String token) {
        return push.sent().stream().filter(s -> s.token().equals(token)).toList();
    }

    private Map<String, Object> notification(UUID recipient, String template) {
        return jdbc.sql("""
                        select state, locale, attempts, deadline, last_error from notification
                        where recipient_id = :r and template = :t order by created_at desc limit 1""")
                .param("r", recipient).param("t", template).query().singleRow();
    }

    private String defaultLanguage() {
        return settings.current().settings().languages().defaultLanguage();
    }

    /** An order event delivered straight to the feed (as the relay does). */
    private void event(OrderView order, String type, String payload) {
        feed.handle(new OutboxMessage(UUID.randomUUID(), type, 1, "Order", order.id(), order.version() + 1, payload,
                null, OffsetDateTime.now(), 0));
    }

    /** Leaves no order searching in the test city. */
    private void cancel(Actor rider, OrderView order) {
        orders.cancel(rider, UUID.randomUUID(), order.id(), orders.get(order.id()).version(), "CHANGED_MIND");
    }

    @Test
    void theDriverGetsTheOfferAndTheRiderHearsInTheirLanguage() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        Actor rider = rides.client();
        jdbc.sql("update client set language = 'pl' where id = :id").param("id", rider.id()).update();
        String riderToken = register(rider, session(rider), "IOS", "pl-PL");
        String driverToken = register(driver.actor(), session(driver.actor()), "ANDROID", null);

        OrderView order = rides.order(rider, cityId, PICKUP, DROPOFF);
        deliverEvents();
        sendPushes();
        assertThat(sentTo(driverToken)).singleElement().satisfies(offer -> {
            assertThat(offer.title()).isEqualTo(PushTemplates.text("driver.offer", defaultLanguage(),
                    defaultLanguage()).orElseThrow().title());
            assertThat(offer.data()).containsEntry("type", "driver.offer").containsEntry("event_type", "OfferMade")
                    .containsEntry("order_id", order.id().toString());
            assertThat(offer.ttl()).as("an offer is useless after its deadline")
                    .isLessThanOrEqualTo(NotificationFeed.OFFER_DEADLINE).isPositive();
        });

        dispatch.accept(driver.actor(), UUID.randomUUID(), dispatch.offers(driver.actor()).getFirst().id());
        deliverEvents();
        deliverEvents(); // a repeated round adds nothing
        sendPushes();
        assertThat(sentTo(riderToken)).singleElement().satisfies(assigned -> {
            assertThat(assigned.title()).isEqualTo("Kierowca znaleziony");
            assertThat(assigned.data()).containsEntry("type", "rider.driver-assigned");
            assertThat(String.join(" ", assigned.title(), assigned.body(), assigned.data().toString()))
                    .as("nothing personal on a locked screen").doesNotContain("+48", "+380");
        });
        assertThat(notification(rider.id(), "rider.driver-assigned")).containsEntry("state", "SENT")
                .containsEntry("locale", "pl");

        // The rider cancels: the driver on the way is told, the rider (who did it) is not.
        orders.cancel(rider, UUID.randomUUID(), order.id(), orders.get(order.id()).version(), "CHANGED_MIND");
        deliverEvents();
        sendPushes();
        assertThat(sentTo(driverToken)).extracting(s -> s.data().get("type"))
                .containsExactly("driver.offer", "driver.order-cancelled");
        assertThat(sentTo(riderToken)).hasSize(1);
    }

    @Test
    void closedSessionsAndDeadTokensGetNothing() {
        Actor rider = rides.client();
        IssuedSession phone = session(rider);
        String oldToken = register(rider, phone, "ANDROID", null);
        auth.logout(phone.refreshToken());
        OrderView order = rides.order(rider, cityId, PICKUP, DROPOFF);
        event(order, "DriverArrived", "{}");
        sendPushes();
        assertThat(sentTo(oldToken)).isEmpty();
        assertThat(notification(rider.id(), "rider.driver-arrived")).containsEntry("state", "NO_DEVICE");
        assertThat(devices.devices(rider)).as("the logged-out phone is dropped").isEmpty();

        String deadToken = register(rider, session(rider), "ANDROID", null);
        push.next(PushProvider.Outcome.INVALID_TOKEN);
        event(order, "TripCompleted", "{}");
        sendPushes();
        assertThat(notification(rider.id(), "rider.trip-completed")).containsEntry("state", "NO_DEVICE");
        assertThat(devices.devices(rider)).isEmpty();
        assertThat(sentTo(deadToken)).isEmpty();
        cancel(rider, order);
    }

    @Test
    void aFailedPushIsRetriedUntilItsDeadline() {
        Actor rider = rides.client();
        String token = register(rider, session(rider), "IOS", null);
        OrderView order = rides.order(rider, cityId, PICKUP, DROPOFF);

        push.next(PushProvider.Outcome.RETRY);
        event(order, "DriverArrived", "{}");
        sendPushes();
        Map<String, Object> waiting = notification(rider.id(), "rider.driver-arrived");
        assertThat(waiting).containsEntry("state", "PENDING").containsEntry("attempts", 1);
        assertThat(waiting.get("last_error")).isNotNull();
        jdbc.sql("update notification set next_attempt_at = now() where recipient_id = :r").param("r", rider.id())
                .update();
        sendPushes();
        assertThat(notification(rider.id(), "rider.driver-arrived")).containsEntry("state", "SENT");
        assertThat(sentTo(token)).hasSize(1);

        // Past its deadline a push is not sent at all (REQ-NTF-03).
        event(order, "TripCompleted", "{}");
        jdbc.sql("update notification set deadline = now() - interval '1 second' "
                + "where recipient_id = :r and template = 'rider.trip-completed'").param("r", rider.id()).update();
        sendPushes();
        assertThat(notification(rider.id(), "rider.trip-completed")).containsEntry("state", "EXPIRED");
        assertThat(sentTo(token)).hasSize(1);
        assertThat(PushWorker.backoff(1)).isEqualTo(Duration.ofSeconds(2));
        assertThat(PushWorker.backoff(30)).isEqualTo(Duration.ofSeconds(60));
        cancel(rider, order);
    }

    @Test
    void aTokenBelongsToOnePersonAndIsRegisteredOverHttp() {
        Actor first = rides.client();
        Actor second = rides.client();
        IssuedSession secondSession = session(second);
        String token = register(first, session(first), "ANDROID", null);

        RestClient http = RestClient.builder().baseUrl("http://localhost:" + port).build();
        @SuppressWarnings("unchecked")
        Map<String, Object> device = http.post().uri("/api/rider/v1/push-devices")
                .header("Authorization", "Bearer " + secondSession.accessToken()).contentType(MediaType.APPLICATION_JSON)
                .body(Map.of("command_id", UUID.randomUUID().toString(), "platform", "android", "token", token,
                        "locale", "uk-UA"))
                .retrieve().body(Map.class);
        assertThat(device).containsEntry("platform", "ANDROID").containsEntry("state", "ACTIVE");
        assertThat(devices.devices(first)).as("the phone changed hands").isEmpty();
        assertThat(devices.devices(second)).hasSize(1);

        UUID id = UUID.fromString((String) device.get("id"));
        http.post().uri("/api/rider/v1/push-devices/{id}/remove", id)
                .header("Authorization", "Bearer " + secondSession.accessToken()).contentType(MediaType.APPLICATION_JSON)
                .body(Map.of("command_id", UUID.randomUUID().toString())).retrieve().toBodilessEntity();
        assertThat(devices.devices(second)).isEmpty();

        assertThatThrownBy(() -> devices.register(second, secondSession.sessionId(), UUID.randomUUID(),
                new PushDevices.Registration("SYMBIAN", "x", null))).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(ErrorCode.VALIDATION_FAILED);
        assertThatThrownBy(() -> devices.remove(first, UUID.randomUUID(), id)).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(ErrorCode.NOT_FOUND);
    }

    @Test
    void whoIsToldOfWhat() {
        UUID rider = UUID.randomUUID();
        UUID driver = UUID.randomUUID();
        assertThat(NotificationFeed.pushes("OrderCancelled",
                new NotificationFeed.Payload(driver, "STAFF", null), rider))
                .extracting(NotificationFeed.Push::template)
                .containsExactly("rider.order-cancelled", "driver.order-cancelled");
        assertThat(NotificationFeed.pushes("OrderCancelled",
                new NotificationFeed.Payload(null, "DRIVER", null), rider))
                .extracting(NotificationFeed.Push::template).containsExactly("rider.order-cancelled");
        assertThat(NotificationFeed.pushes("TripInterrupted",
                new NotificationFeed.Payload(driver, "STAFF", UUID.randomUUID()), rider))
                .extracting(NotificationFeed.Push::template).containsExactly("rider.trip-interrupted");
        assertThat(NotificationFeed.pushes("OrderUnfulfilled", new NotificationFeed.Payload(null, null, null), null))
                .as("a phone order without an app rider").isEmpty();
    }
}
