package taxi.blizz.payments.internal;

import static org.assertj.core.api.Assertions.assertThat;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;
import java.util.UUID;
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
import taxi.blizz.TestQuotes;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.ApiAudience;
import taxi.blizz.identity.SessionService;
import taxi.blizz.identity.StaffPermissions;
import taxi.blizz.identity.VerifiedSubject;
import taxi.blizz.operations.CreateOrder;
import taxi.blizz.operations.Dispatch;
import taxi.blizz.operations.OrderView;
import taxi.blizz.operations.Orders;
import taxi.blizz.operations.PaymentMethod;
import taxi.blizz.operations.Trips;
import taxi.blizz.operations.WorkSessions;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CorrelationId;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.platform.internal.OutboxRelay;
import taxi.blizz.pricing.QuoteService;
import tools.jackson.databind.json.JsonMapper;

/**
 * Correlation ids where support looks (REQ-OBS-01/04, issue #81): an order command and the payment it triggers share
 * one id, the payment worker works under it (its log lines carry it), the order's history shows it, and the staff
 * logs find everything recorded under it — as types and ids only.
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Import(TestcontainersConfiguration.class)
@ExtendWith(OutputCaptureExtension.class)
class CorrelationIdTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, 50.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 50.55);

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
    PaymentWorker worker;
    @Autowired
    FakeProvider.Gateway gateway;
    @Autowired
    OutboxRelay relay;
    @Autowired
    JdbcClient jdbc;
    @Autowired
    JsonMapper json;

    TestRides rides;
    UUID cityId;
    UUID merchantId;

    @BeforeEach
    void setUp() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        cityId = rides.city("test-correlation", "UAH", 50);
        merchantId = jdbc.sql("select merchant_id from payment_merchant_city where city_id = :city")
                .param("city", cityId).query(UUID.class).optional().orElseGet(() -> {
                    UUID id = UUID.randomUUID();
                    jdbc.sql("""
                                    insert into payment_merchant (id, provider, account, domain, secret_ref, currency,
                                                                  created_at)
                                    values (:id, 'FAKE', :account, 'test.blizz.invalid', 'test', 'UAH', now())""")
                            .param("id", id).param("account", "correlation_" + id).update();
                    jdbc.sql("insert into payment_merchant_city (city_id, merchant_id) values (:city, :merchant)")
                            .param("city", cityId).param("merchant", id).update();
                    return id;
                });
        gateway.reset();
    }

    private Actor riderWithCard() {
        Actor rider = rides.client();
        jdbc.sql("""
                        insert into payment_card (id, client_id, merchant_id, token, masked_pan, card_type, state, created_at)
                        values (:id, :client, :merchant, :token, '41****1111', 'Visa', 'ACTIVE', now())""")
                .param("id", UUID.randomUUID()).param("client", rider.id()).param("merchant", merchantId)
                .param("token", "tok-" + rider.id()).update();
        return rider;
    }

    private void deliverEvents() {
        while (relay.runOnce() > 0) {
            // drain
        }
    }

    private Actor staff(String... permissions) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, city_scope, state, created_at,
                                                updated_at)
                        values (:id, :login, 'Support', 'ADMIN', :permissions, :scope, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "correlation-" + id).param("permissions", permissions)
                .param("scope", new UUID[]{cityId}).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private HttpResponse<String> search(Actor who, UUID correlationId) throws Exception {
        String token = auth.openStaff(new VerifiedSubject(who, "ACTIVE", false), ApiAudience.ADMIN, "corr-test")
                .accessToken();
        return HttpClient.newHttpClient().send(HttpRequest.newBuilder(URI.create(
                                "http://localhost:" + port + "/api/admin/v1/logs/correlation/" + correlationId))
                        .header("Authorization", "Bearer " + token).GET().build(),
                HttpResponse.BodyHandlers.ofString());
    }

    @Test
    void anOrderAndItsPaymentShareTheIdTheWorkerLogsUnderItAndSupportFindsBoth(CapturedOutput output)
            throws Exception {
        rides.driverNear(PICKUP);
        Actor rider = riderWithCard();
        UUID quote = new TestQuotes(jdbc, quotes).quote(rider, cityId, "STANDARD", PICKUP, DROPOFF).id();
        UUID request = UUID.randomUUID();
        OrderView order;
        // As the web filter does for a request with X-Correlation-Id; the bank does not answer the hold at once.
        gateway.next("TIMEOUT");
        try (CorrelationId.Scope ignored = CorrelationId.open(request)) {
            order = orders.create(rider, UUID.randomUUID(), new CreateOrder(rider.id(), "STANDARD", PICKUP, "Home",
                    DROPOFF, "Work", PaymentMethod.CARD, quote));
        }

        UUID intent = jdbc.sql("select id from payment_intent where order_id = :o").param("o", order.id())
                .query(UUID.class).single();
        assertThat(jdbc.sql("select correlation_id from payment_intent where id = :id").param("id", intent)
                .query(UUID.class).single()).isEqualTo(request);
        assertThat(jdbc.sql("select correlation_id from payment_operation where intent_id = :id").param("id", intent)
                .query(UUID.class).list()).containsOnly(request);

        // Later the worker asks the bank again — outside any request, under the operation's id.
        int linesBefore = output.getAll().length();
        gateway.next("TIMEOUT");
        jdbc.sql("""
                        update payment_operation set next_check_at = now() - interval '1 second',
                                                     lease_until = now() - interval '1 second'
                        where intent_id = :id""").param("id", intent).update();
        worker.runOnce();
        String workerLines = output.getAll().substring(linesBefore);
        assertThat(workerLines).contains("did not answer").contains(request.toString());

        // The bank's answer comes in later rounds; what follows is written under the same id by the relay.
        for (int i = 0; i < 3; i++) {
            jdbc.sql("""
                            update payment_operation set next_check_at = now() - interval '1 second',
                                                         lease_until = now() - interval '1 second'
                            where intent_id = :id and state in ('PENDING', 'UNKNOWN', 'SENDING')""")
                    .param("id", intent).update();
            worker.runOnce();
        }
        deliverEvents();
        Actor support = staff(Orders.VIEW_PERMISSION);
        List<Orders.TimelineEntry> history = orders.timeline(support, order.id());
        assertThat(history).first().satisfies(e -> assertThat(e.correlationId()).isEqualTo(request));
        assertThat(history).extracting(Orders.TimelineEntry::correlationId).contains(request);

        // Support finds the order event and the payment by the id — types and ids only.
        HttpResponse<String> found = search(staff(StaffPermissions.AUDIT_VIEW), request);
        assertThat(found.statusCode()).as(found.body()).isEqualTo(200);
        @SuppressWarnings("unchecked")
        List<Map<String, Object>> rows = (List<Map<String, Object>>) json.readValue(found.body(), Map.class)
                .get("found");
        assertThat(rows).extracting(r -> r.get("type")).contains("ORDER_EVENT", "PAYMENT_INTENT",
                "PAYMENT_OPERATION");
        assertThat(rows).filteredOn(r -> "PAYMENT_INTENT".equals(r.get("type")))
                .singleElement().satisfies(r -> {
                    assertThat(r).containsEntry("id", intent.toString()).containsEntry("order_id", order.id().toString());
                    assertThat(r.keySet()).containsExactlyInAnyOrder("type", "id", "order_id", "at");
                });
        assertThat(found.body()).doesNotContain("tok-").doesNotContain("41****");

        assertThat(search(support, request).statusCode()).as("needs audit.view").isEqualTo(403);
        HttpResponse<String> nothing = search(staff(StaffPermissions.AUDIT_VIEW), UUID.randomUUID());
        assertThat(nothing.body()).contains("\"found\":[]");
    }
}
