package taxi.blizz.payments.internal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import jakarta.servlet.Filter;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.core.annotation.AnnotationAwareOrderComparator;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import taxi.blizz.TestQuotes;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.backoffice.SupportCases;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.ApiAudience;
import taxi.blizz.identity.SessionService;
import taxi.blizz.identity.VerifiedSubject;
import taxi.blizz.operations.CreateOrder;
import taxi.blizz.operations.Dispatch;
import taxi.blizz.operations.OrderChat;
import taxi.blizz.operations.OrderView;
import taxi.blizz.operations.Orders;
import taxi.blizz.operations.PaymentMethod;
import taxi.blizz.operations.TripView;
import taxi.blizz.operations.Trips;
import taxi.blizz.operations.WorkSessions;
import taxi.blizz.payments.CardPayments;
import taxi.blizz.payments.PaymentOperations;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.platform.internal.OutboxRelay;
import taxi.blizz.pricing.QuoteService;
import tools.jackson.databind.json.JsonMapper;

/**
 * The evidence of an order for a chargeback (REQ-PAY-23, issue #103 E1–E2), through the admin API: a finished card
 * ride with a GPS track, a chat and a support case, people typing phone and card numbers into both.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class ChargebackEvidenceTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, -49.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, -49.45);
    static final String TYPED = "call me +380 67 123 45 67 or 0671234567, card 4111 1111 1111 1111";

    @Autowired Orders orders;
    @Autowired Dispatch dispatch;
    @Autowired Trips trips;
    @Autowired WorkSessions sessions;
    @Autowired SessionService auth;
    @Autowired QuoteService quotes;
    @Autowired CardPayments payments;
    @Autowired PaymentWorker worker;
    @Autowired FakeProvider.Gateway gateway;
    @Autowired OutboxRelay relay;
    @Autowired JdbcClient jdbc;
    @Autowired OrderChat chat;
    @Autowired SupportCases cases;
    @Autowired JsonMapper json;
    @Autowired WebApplicationContext context;

    TestRides rides;
    UUID cityId;
    UUID merchantId;
    MockMvc mvc;

    @BeforeEach
    void setUp() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        cityId = rides.city("test-chargeback-evidence", "UAH", -50);
        merchantId = jdbc.sql("select merchant_id from payment_merchant_city where city_id = :city")
                .param("city", cityId).query(UUID.class).optional().orElseGet(() -> {
                    UUID id = UUID.randomUUID();
                    jdbc.sql("""
                                    insert into payment_merchant (id, provider, account, domain, secret_ref, currency,
                                                                  created_at)
                                    values (:id, 'FAKE', :account, 'test.blizz.invalid', 'test', 'UAH', now())""")
                            .param("id", id).param("account", "evidence_" + id).update();
                    jdbc.sql("insert into payment_merchant_city (city_id, merchant_id) values (:city, :merchant)")
                            .param("city", cityId).param("merchant", id).update();
                    return id;
                });
        gateway.reset();
        List<Filter> filters = new ArrayList<>(context.getBeansOfType(Filter.class).values());
        AnnotationAwareOrderComparator.sort(filters);
        mvc = MockMvcBuilders.webAppContextSetup(context).addFilters(filters.toArray(Filter[]::new)).build();
    }

    // ------------------------------------------------------------ fixtures

    private void deliverEvents() {
        while (relay.runOnce() > 0) {
            // drain
        }
    }

    private void settlePayments() {
        for (int i = 0; i < 6; i++) {
            jdbc.sql("update payment_operation set next_check_at = now() - interval '1 second' "
                    + "where state in ('PENDING', 'UNKNOWN')").update();
            worker.runOnce();
        }
        deliverEvents();
    }

    private Actor riderWithCard() {
        Actor rider = rides.client();
        jdbc.sql("""
                        insert into payment_card (id, client_id, merchant_id, token, masked_pan, card_type, state,
                                                  created_at)
                        values (:id, :client, :merchant, :token, '41****1111', 'Visa', 'ACTIVE', now())""")
                .param("id", UUID.randomUUID()).param("client", rider.id()).param("merchant", merchantId)
                .param("token", "tok-" + rider.id()).update();
        return rider;
    }

    private Actor staff(String... permissions) {
        return staffIn(null, permissions);
    }

    /** Staff limited to {@code city}, or of all cities when it is null. */
    private Actor staffIn(UUID city, String... permissions) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, all_cities, city_scope, state,
                                                created_at, updated_at)
                        values (:id, :login, 'Finance', 'ADMIN', :permissions, :all, :scope, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "evidence-" + id).param("permissions", permissions)
                .param("all", city == null).param("scope", city == null ? new UUID[0] : new UUID[] {city}).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private String token(Actor staff) {
        return auth.openStaff(new VerifiedSubject(staff, "ACTIVE", false), ApiAudience.ADMIN, null).accessToken();
    }

    record Response(int status, String body) {
    }

    private Response evidence(Actor staff, UUID orderId, String reason) throws Exception {
        var request = get("/api/admin/v1/orders/" + orderId + "/evidence")
                .header("Authorization", "Bearer " + token(staff));
        if (reason != null) {
            request.param("reason", reason);
        }
        var result = mvc.perform(request).andReturn();
        return new Response(result.getResponse().getStatus(), result.getResponse().getContentAsString());
    }

    record Finished(Actor rider, TestRides.Driver driver, OrderView order) {
    }

    /** A card ride paid from its hold, with a GPS track, a chat and a support case typed full of numbers. */
    private Finished finishedCardRide() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        Actor rider = riderWithCard();
        UUID quote = new TestQuotes(jdbc, quotes).quote(rider, cityId, "STANDARD", PICKUP, DROPOFF).id();
        OrderView order = orders.create(rider, UUID.randomUUID(), new CreateOrder(rider.id(), "STANDARD", PICKUP,
                "Home", DROPOFF, "Work", PaymentMethod.CARD, quote));
        deliverEvents();
        dispatch.accept(driver.actor(), UUID.randomUUID(), dispatch.offers(driver.actor()).getFirst().id());
        TripView trip = trips.current(driver.actor()).orElseThrow();
        chat.post(rider, UUID.randomUUID(), order.id(), "I am at the gate, " + TYPED);
        chat.post(driver.actor(), UUID.randomUUID(), order.id(), "Coming, mine is +48 512 345 678");
        rides.moveTo(driver, TestRides.north(PICKUP, 20));
        TripView waiting = trips.arrive(driver.actor(), UUID.randomUUID(), trip.id(), trip.version(), null);
        TripView started = trips.start(driver.actor(), UUID.randomUUID(), waiting.id(), waiting.version(), null);
        // Three points of the ride about 1.1 km apart, and one the server flagged as a jump.
        long sequence = Math.floorMod(UUID.randomUUID().hashCode(), 1_000_000) + 1_000_000L;
        for (int i = 0; i < 4; i++) {
            jdbc.sql("""
                            insert into track_point (id, driver_id, device_session_id, sequence, recorded_at,
                                                     received_at, point, accuracy_m, flags)
                            values (:id, :driver, :device, :sequence, clock_timestamp(), clock_timestamp(),
                                    ST_SetSRID(ST_MakePoint(:lon, :lat), 4326), 5, :flags)""")
                    .param("id", UUID.randomUUID()).param("driver", driver.actor().id())
                    .param("device", driver.device()).param("sequence", sequence + i)
                    .param("lon", i == 3 ? 10.0 : -49.5).param("lat", -39.5 + 0.01 * Math.min(i, 2))
                    .param("flags", i == 3 ? new String[] {"JUMP"} : new String[0]).update();
        }
        trips.complete(driver.actor(), UUID.randomUUID(), started.id(), started.version(), OffsetDateTime.now(), null);
        deliverEvents();
        settlePayments();
        assertThat(orders.get(order.id()).paymentState()).isEqualTo("PAID");

        SupportCases.Case opened = cases.open(rider, UUID.randomUUID(), SupportCases.Category.PAYMENT, order.id(),
                "Charged twice? " + TYPED, "Please check, " + TYPED);
        Actor support = staff(SupportCases.MANAGE_PERMISSION);
        SupportCases.Case noted = cases.comment(support, UUID.randomUUID(), opened.id(), opened.version(),
                SupportCases.Visibility.INTERNAL, "internal-only-note about the rider", false);
        cases.comment(support, UUID.randomUUID(), opened.id(), noted.version(), SupportCases.Visibility.PUBLIC,
                "We checked: one charge. Our line is +380 44 000 00 00", false);
        return new Finished(rider, driver, order);
    }

    private String phoneOf(String table, UUID id) {
        return jdbc.sql("select phone_normalized from " + table + " where id = :id").param("id", id)
                .query(String.class).single();
    }

    // ------------------------------------------------------------ E1

    @Test
    @SuppressWarnings("unchecked")
    void theEvidenceOfAFinishedCardRideHasEverySectionAndNoPhoneOrCardData() throws Exception {
        Finished ride = finishedCardRide();
        Actor finance = staff(PaymentOperations.RETRY_PERMISSION);

        Response response = evidence(finance, ride.order().id(), "Bank request 2026-117");
        assertThat(response.status()).isEqualTo(200);
        Map<String, Object> body = json.readValue(response.body(), Map.class);

        Map<String, Object> order = (Map<String, Object>) body.get("order");
        assertThat(order).containsEntry("id", ride.order().id().toString()).containsEntry("status", "FULFILLED")
                .containsEntry("payment_method", "CARD").containsEntry("payment_state", "PAID")
                .containsEntry("pickup_label", "Home").containsEntry("dropoff_label", "Work");
        for (String time : List.of("created_at", "assigned_at", "arrived_at", "started_at", "completed_at")) {
            assertThat(order.get(time)).as(time).isNotNull();
        }
        Map<String, Object> fare = (Map<String, Object>) order.get("fare");
        assertThat(((Number) fare.get("amount_minor")).longValue()).isEqualTo(
                orders.get(ride.order().id()).finalPriceMinor());
        assertThat(fare).containsKeys("agreed_minor", "waiting_seconds", "waiting_minor", "policy");

        Map<String, Object> driver = (Map<String, Object>) body.get("driver");
        assertThat(driver).containsEntry("id", ride.driver().actor().id().toString());
        assertThat((Map<String, Object>) driver.get("vehicle")).containsEntry("make", "Skoda")
                .containsEntry("model", "Octavia").containsEntry("registration_number", "AA4000AA");

        Map<String, Object> track = (Map<String, Object>) body.get("track");
        assertThat(track).containsEntry("points", 4).containsEntry("flagged_points", 1);
        assertThat(((Number) track.get("length_meters")).longValue()).as("two steps of ~1.1 km, the jump left out")
                .isBetween(2000L, 2500L);
        assertThat(track.get("first_point_at")).isNotNull();

        Map<String, Object> rider = (Map<String, Object>) body.get("rider");
        assertThat(rider).containsEntry("id", ride.rider().id().toString());
        assertThat(rider.get("registered_at")).isNotNull();
        assertThat((List<Map<String, Object>>) rider.get("trips_last_year")).singleElement()
                .satisfies(t -> assertThat(t).containsEntry("currency", "UAH").containsEntry("trips", 1));

        assertThat((List<Map<String, Object>>) body.get("card_operations"))
                .extracting(o -> o.get("type") + " " + o.get("state"))
                .contains("AUTH SUCCEEDED", "SETTLE SUCCEEDED");
        assertThat((List<Map<String, Object>>) body.get("chat")).hasSize(2)
                .allSatisfy(m -> assertThat((String) m.get("body")).contains("[number hidden]"));
        List<Map<String, Object>> support = (List<Map<String, Object>>) body.get("support_cases");
        assertThat(support).singleElement().satisfies(c -> {
            assertThat((List<Map<String, Object>>) c.get("messages")).as("the requester's and the public answer")
                    .hasSize(2);
        });

        // The scan: nothing a bank should not get, whatever the section.
        String all = response.body();
        assertThat(all).doesNotContain("internal-only-note")
                .doesNotContain("41****1111").doesNotContain("tok-")
                .doesNotContain("4111").doesNotContain("0671234567").doesNotContain("123 45 67")
                .doesNotContain(phoneOf("client", ride.rider().id()))
                .doesNotContain(phoneOf("client", ride.rider().id()).substring(1))
                .doesNotContain(phoneOf("driver", ride.driver().actor().id()))
                .doesNotContain(phoneOf("driver", ride.driver().actor().id()).substring(1))
                .doesNotContainPattern("\\+\\s*(380|48)")
                .doesNotContainPattern("(380|48)\\d{9}");

        assertThat(jdbc.sql("""
                        select count(*) from audit_log where actor_id = :staff and action = 'order.evidence.view'
                          and resource_id = :order and reason = 'Bank request 2026-117'""")
                .param("staff", finance.id()).param("order", ride.order().id().toString())
                .query(Long.class).single()).isOne();
    }

    // ------------------------------------------------------------ E2

    @Test
    @SuppressWarnings("unchecked")
    void onlyFinanceOfTheOrdersCityWithAReasonGetsTheEvidence() throws Exception {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        TestRides.Ride cash = rides.started(cityId, driver, PICKUP, DROPOFF);
        rides.complete(cash, true);
        UUID orderId = cash.order().id();

        assertThat(evidence(staff("orders.view"), orderId, "Bank request").status()).isEqualTo(403);
        assertThat(evidence(staffIn(UUID.randomUUID(), PaymentOperations.RETRY_PERMISSION), orderId, "Bank request")
                .status()).as("finance of another city").isEqualTo(403);
        assertThat(evidence(staff(PaymentOperations.RETRY_PERMISSION), UUID.randomUUID(), "Bank request").status())
                .isEqualTo(404);
        assertThat(evidence(staff(PaymentOperations.RETRY_PERMISSION), orderId, null).status()).isEqualTo(400);
        assertThat(evidence(staff(PaymentOperations.RETRY_PERMISSION), orderId, " ").status()).isEqualTo(400);

        Response ofTheCity = evidence(staffIn(cityId, PaymentOperations.RETRY_PERMISSION), orderId, "Bank request");
        assertThat(ofTheCity.status()).as("finance of the order's city: %s", ofTheCity.body()).isEqualTo(200);
        Map<String, Object> body = json.readValue(ofTheCity.body(), Map.class);
        assertThat((List<Object>) body.get("card_operations")).as("a cash ride").isEmpty();
        assertThat((Map<String, Object>) body.get("order")).containsEntry("payment_method", "CASH");
    }
}
