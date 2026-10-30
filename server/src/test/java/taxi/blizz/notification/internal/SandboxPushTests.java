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
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.AccountDirectory;
import taxi.blizz.identity.IssuedSession;
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

/**
 * {@code GET /sandbox/v1/pushes} (issue #49): the controller is sandbox-only, so the test builds it over the real
 * beans of the test profile instead of starting a sandbox context.
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Import(TestcontainersConfiguration.class)
class SandboxPushTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, 6.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 6.55);

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
    PushWorker worker;
    @Autowired
    FakePushProvider push;
    @Autowired
    AccountDirectory accounts;

    TestRides rides;
    UUID cityId;
    SandboxPushController sandbox;

    @BeforeEach
    void setUp() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        cityId = rides.city("test-sandbox-pushes", "UAH", 6);
        sandbox = new SandboxPushController(accounts, devices, push);
        deliverEvents();
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

    private String register(Actor actor) {
        IssuedSession session = auth.open(new VerifiedSubject(actor, "ACTIVE", false), "sandbox-push-test");
        String token = "fcm-" + UUID.randomUUID();
        devices.register(actor, session.sessionId(), UUID.randomUUID(),
                new PushDevices.Registration("ANDROID", token, null));
        return token;
    }

    private String phone(String table, UUID id) {
        return jdbc.sql("select phone_normalized from " + table + " where id = :id").param("id", id)
                .query(String.class).single();
    }

    @Test
    void theRiderAndTheDriverSeeTheirOwnPushesWithoutTheWholeToken() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        Actor rider = rides.client();
        jdbc.sql("update client set language = 'pl' where id = :id").param("id", rider.id()).update();
        String riderToken = register(rider);
        String driverToken = register(driver.actor());
        String riderPhone = phone("client", rider.id());
        String driverPhone = phone("driver", driver.actor().id());

        OrderView order = rides.order(rider, cityId, PICKUP, DROPOFF);
        deliverEvents();
        sendPushes();
        dispatch.accept(driver.actor(), driver.device(), UUID.randomUUID(), dispatch.offers(driver.actor()).getFirst().id());
        deliverEvents();
        sendPushes();

        List<SandboxPushController.Push> riderPushes = sandbox.pushes(riderPhone, null);
        assertThat(riderPushes).singleElement().satisfies(assigned -> {
            assertThat(assigned.data()).containsEntry("type", "rider.driver-assigned")
                    .containsEntry("order_id", order.id().toString());
            assertThat(assigned.title()).as("in the rider's language").isEqualTo("Kierowca znaleziony");
            assertThat(assigned.tokenSuffix()).isEqualTo(riderToken.substring(riderToken.length() - 6));
            assertThat(assigned.at()).isNotNull();
        });
        assertThat(riderPushes.toString()).as("never the whole token").doesNotContain(riderToken);

        assertThat(sandbox.pushes(driverPhone, null)).extracting(p -> p.data().get("type"))
                .containsExactly("driver.offer");
        assertThat(sandbox.pushes(driverPhone, null)).extracting(SandboxPushController.Push::tokenSuffix)
                .containsOnly(driverToken.substring(driverToken.length() - 6));

        // Only what came after the given moment.
        assertThat(sandbox.pushes(riderPhone, riderPushes.getFirst().at())).isEmpty();
        assertThat(sandbox.pushes(riderPhone, riderPushes.getFirst().at().minusSeconds(1))).hasSize(1);

        // Another phone, or a phone with no account, sees nothing.
        Actor other = rides.client();
        register(other);
        assertThat(sandbox.pushes(phone("client", other.id()), null)).isEmpty();
        assertThat(sandbox.pushes("+380630000049", null)).isEmpty();

        orders.cancel(rider, UUID.randomUUID(), order.id(), orders.get(order.id()).version(), "CHANGED_MIND");
        deliverEvents();
        sendPushes();
    }

    @Test
    void aShortTokenShowsOnlyItsEnd() {
        assertThat(SandboxPushController.suffix("abcdefghij")).isEqualTo("efghij");
        assertThat(SandboxPushController.suffix("abcdef")).isEqualTo("def");
        assertThat(SandboxPushController.suffix("a")).isEmpty();
    }
}
