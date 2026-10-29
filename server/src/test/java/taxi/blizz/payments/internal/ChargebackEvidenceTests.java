package taxi.blizz.payments.internal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

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
 * Chargebacks (REQ-PAY-23, issue #103), through the admin API: the evidence of an order (E1–E2) — a finished card
 * ride with a GPS track, a chat and a support case, people typing phone and card numbers into both — and recording
 * and resolving a chargeback with its journal postings and case (E2–E5).
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

    // ------------------------------------------------------------ chargebacks

    private Response send(Actor staff, String path, Map<String, Object> body) throws Exception {
        var result = mvc.perform(post(path).header("Authorization", "Bearer " + token(staff))
                .contentType("application/json").content(json.writeValueAsString(body))).andReturn();
        return new Response(result.getResponse().getStatus(), result.getResponse().getContentAsString());
    }

    private Response record(Actor staff, UUID orderId, UUID commandId, long amount, String currency)
            throws Exception {
        return send(staff, "/api/admin/v1/orders/" + orderId + "/chargebacks", Map.of("command_id", commandId,
                "amount_minor", amount, "currency", currency, "bank_reason", "4837 No cardholder authorization",
                "received_on", java.time.LocalDate.now(java.time.ZoneOffset.UTC).minusDays(1).toString()));
    }

    private Response resolve(Actor staff, UUID orderId, UUID chargebackId, long version, String outcome)
            throws Exception {
        return send(staff, "/api/admin/v1/orders/" + orderId + "/chargebacks/" + chargebackId + "/resolve",
                Map.of("command_id", UUID.randomUUID(), "expected_version", version, "outcome", outcome,
                        "reason", "The provider's risk manager answered"));
    }

    @SuppressWarnings("unchecked")
    private Map<String, Object> read(Response response) {
        return json.readValue(response.body(), Map.class);
    }

    private String code(Response response) {
        return (String) read(response).get("code");
    }

    /** The order's journal: the payer's RIDER_RECEIVABLE and the PROVIDER_CLEARING lines of the order's postings. */
    private Map<String, Long> journal(UUID orderId, UUID payer) {
        long receivable = jdbc.sql("""
                        select coalesce(sum(debit_minor) - sum(credit_minor), 0) from journal_line
                        where account = 'RIDER_RECEIVABLE' and party_id = :payer""")
                .param("payer", payer).query(Long.class).single();
        long clearing = jdbc.sql("""
                        select coalesce(sum(l.debit_minor) - sum(l.credit_minor), 0)
                        from journal_line l join journal_transaction t on t.id = l.transaction_id
                        where t.basis_id = :order and l.account = 'PROVIDER_CLEARING'""")
                .param("order", orderId).query(Long.class).single();
        long unbalanced = jdbc.sql("""
                        select count(*) from (select t.id from journal_transaction t
                                              join journal_line l on l.transaction_id = t.id
                                              where t.basis_id = :order group by t.id
                                              having sum(l.debit_minor) <> sum(l.credit_minor)) u""")
                .param("order", orderId).query(Long.class).single();
        return Map.of("receivable", receivable, "clearing", clearing, "unbalanced", unbalanced);
    }

    private long chargebackPostings(UUID orderId) {
        return jdbc.sql("select count(*) from journal_transaction where basis_id = :order and basis_type = 'CHARGEBACK'")
                .param("order", orderId).query(Long.class).single();
    }

    // E2, E3
    @Test
    void aChargebackIsAtMostWhatTheCardPaidOnlyByFinanceOfTheCityAndOnce() throws Exception {
        Finished ride = finishedCardRide();
        UUID orderId = ride.order().id();
        long paid = orders.get(orderId).finalPriceMinor();
        Actor finance = staffIn(cityId, PaymentOperations.RETRY_PERMISSION);

        assertThat(record(staff("orders.view"), orderId, UUID.randomUUID(), 100, "UAH").status()).isEqualTo(403);
        assertThat(record(staffIn(UUID.randomUUID(), PaymentOperations.RETRY_PERMISSION), orderId,
                UUID.randomUUID(), 100, "UAH").status()).as("finance of another city").isEqualTo(403);

        Response tooMuch = record(finance, orderId, UUID.randomUUID(), paid + 1, "UAH");
        assertThat(tooMuch.status()).isEqualTo(422);
        assertThat(code(tooMuch)).isEqualTo("CHARGEBACK_NOT_ALLOWED");
        assertThat(code(record(finance, orderId, UUID.randomUUID(), 100, "PLN"))).isEqualTo("CHARGEBACK_NOT_ALLOWED");

        // The card ride's driver is free again: off the line, so the cash order goes to the new one.
        jdbc.sql("update work_session set state = 'CLOSED', closed_at = now() where city_id = :c and state <> 'CLOSED'")
                .param("c", cityId).update();
        TestRides.Ride cash = rides.started(cityId, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        rides.complete(cash, true);
        Response onCash = record(finance, cash.order().id(), UUID.randomUUID(), 100, "UAH");
        assertThat(onCash.status()).isEqualTo(422);
        assertThat(code(onCash)).isEqualTo("CHARGEBACK_NOT_ALLOWED");

        UUID command = UUID.randomUUID();
        Response first = record(finance, orderId, command, paid - 100, "UAH");
        assertThat(first.status()).isEqualTo(201);
        Response again = record(finance, orderId, command, paid - 100, "UAH");
        assertThat(again.status()).isEqualTo(201);
        assertThat(read(again).get("id")).isEqualTo(read(first).get("id"));
        assertThat(jdbc.sql("select count(*) from payment_chargeback where order_id = :o").param("o", orderId)
                .query(Long.class).single()).as("a repeat is one row").isOne();
        assertThat(code(record(finance, orderId, UUID.randomUUID(), 101, "UAH"))).as("100 is left")
                .isEqualTo("CHARGEBACK_NOT_ALLOWED");
        assertThat(record(finance, orderId, UUID.randomUUID(), 100, "UAH").status()).isEqualTo(201);

        deliverEvents();
        deliverEvents();
        assertThat(jdbc.sql("""
                        select count(*) from support_case
                        where source_key = :key and category = 'PAYMENT' and priority = 'HIGH' and order_id = :order""")
                .param("key", "chargeback:" + read(first).get("id")).param("order", orderId)
                .query(Long.class).single()).isOne();
        assertThat(jdbc.sql("""
                        select count(*) from audit_log where action = 'payment.chargeback.record'
                          and resource_id = :id and reason = '4837 No cardholder authorization'""")
                .param("id", read(first).get("id")).query(Long.class).single()).isOne();
    }

    // E4, E5
    @Test
    @SuppressWarnings("unchecked")
    void theJournalBalancesAndWonPutsEveryAccountBackLostLeavesTheDebtAndResolvingTwiceIsRefused()
            throws Exception {
        Finished ride = finishedCardRide();
        UUID orderId = ride.order().id();
        long paid = orders.get(orderId).finalPriceMinor();
        Actor finance = staffIn(cityId, PaymentOperations.RETRY_PERMISSION);
        deliverEvents();
        Map<String, Long> before = journal(orderId, ride.rider().id());
        assertThat(before.get("unbalanced")).isZero();

        Map<String, Object> won = read(record(finance, orderId, UUID.randomUUID(), paid - 200, "UAH"));
        Map<String, Object> lost = read(record(finance, orderId, UUID.randomUUID(), 200, "UAH"));
        deliverEvents();
        Map<String, Long> recorded = journal(orderId, ride.rider().id());
        assertThat(recorded.get("unbalanced")).isZero();
        assertThat(recorded.get("receivable")).as("the rider owes it again").isEqualTo(before.get("receivable") + paid);
        assertThat(recorded.get("clearing")).isEqualTo(before.get("clearing") - paid);
        assertThat(chargebackPostings(orderId)).isEqualTo(2);

        Response resolved = resolve(finance, orderId, UUID.fromString((String) won.get("id")), 0, "WON");
        assertThat(resolved.status()).isEqualTo(200);
        assertThat(read(resolved)).containsEntry("state", "WON");
        Response lostOne = resolve(finance, orderId, UUID.fromString((String) lost.get("id")), 0, "LOST");
        assertThat(lostOne.status()).isEqualTo(200);
        deliverEvents();
        deliverEvents();
        Map<String, Long> after = journal(orderId, ride.rider().id());
        assertThat(after.get("unbalanced")).isZero();
        assertThat(after.get("receivable")).as("won back; the lost 200 stays the rider's debt")
                .isEqualTo(before.get("receivable") + 200);
        assertThat(after.get("clearing")).isEqualTo(before.get("clearing") - 200);
        assertThat(chargebackPostings(orderId)).as("LOST posts nothing").isEqualTo(3);

        for (var twice : List.of(resolve(finance, orderId, UUID.fromString((String) won.get("id")), 1, "LOST"),
                resolve(finance, orderId, UUID.fromString((String) won.get("id")), 0, "WON"),
                resolve(finance, orderId, UUID.fromString((String) lost.get("id")), 1, "WON"))) {
            assertThat(twice.status()).isEqualTo(409);
        }
        assertThat(resolve(staffIn(UUID.randomUUID(), PaymentOperations.RETRY_PERMISSION), orderId,
                UUID.fromString((String) lost.get("id")), 1, "WON").status()).isEqualTo(403);
        Response list = mvc.perform(get("/api/admin/v1/orders/" + orderId + "/chargebacks")
                        .header("Authorization", "Bearer " + token(finance)))
                .andReturn().getResponse().getContentAsString().transform(b -> new Response(200, b));
        assertThat((List<Map<String, Object>>) read(list).get("chargebacks")).extracting(c -> c.get("state"))
                .containsExactly("WON", "LOST");
    }
}
