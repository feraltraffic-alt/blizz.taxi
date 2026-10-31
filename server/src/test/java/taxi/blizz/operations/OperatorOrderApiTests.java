package taxi.blizz.operations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import jakarta.servlet.Filter;
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
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import taxi.blizz.TestQuotes;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.ApiAudience;
import taxi.blizz.identity.SessionService;
import taxi.blizz.identity.StaffDirectory;
import taxi.blizz.identity.StaffDirectory.Contacts;
import taxi.blizz.identity.StaffDirectory.Profile;
import taxi.blizz.identity.StaffDirectory.Role;
import taxi.blizz.identity.VerifiedSubject;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.pricing.QuoteService;
import tools.jackson.databind.json.JsonMapper;

/** HTTP acceptance of the operator workstation against Testcontainers PostgreSQL/PostGIS (S-08). */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class OperatorOrderApiTests {

    private static final String ROOT_PASSWORD = "operator-root-secret-1";
    private static final String INITIAL_PASSWORD = "operator-initial-123";
    private static final String FINAL_PASSWORD = "operator-final-456";
    private static final GeoPoint A_PICKUP = new GeoPoint(50.0, 30.0);
    private static final GeoPoint A_DROPOFF = new GeoPoint(50.01, 30.01);
    private static final GeoPoint B_PICKUP = new GeoPoint(50.0, 40.0);
    private static final GeoPoint B_DROPOFF = new GeoPoint(50.01, 40.01);

    @Autowired StaffDirectory directory;
    @Autowired SessionService sessions;
    @Autowired QuoteService quotes;
    @Autowired JdbcClient jdbc;
    @Autowired WebApplicationContext context;
    @Autowired JsonMapper json;

    MockMvc mvc;
    Actor root;
    String rootLogin;
    UUID cityA;
    UUID cityB;
    TestQuotes testQuotes;

    @BeforeEach
    void setUp() {
        List<Filter> filters = new ArrayList<>(context.getBeansOfType(Filter.class).values());
        AnnotationAwareOrderComparator.sort(filters);
        mvc = MockMvcBuilders.webAppContextSetup(context).addFilters(filters.toArray(Filter[]::new)).build();

        UUID rootId = UUID.randomUUID();
        rootLogin = unique("operator-root");
        jdbc.sql("""
                        insert into staff_user (id, login, first_name, last_name, name, role, state, password_hash,
                                                all_cities, created_at, updated_at)
                        values (:id, :login, 'Root', 'Operator', 'Root Operator', 'SUPER_ADMIN', 'ACTIVE', :hash,
                                true, now(), now())""")
                .param("id", rootId).param("login", rootLogin)
                .param("hash", new BCryptPasswordEncoder(4).encode(ROOT_PASSWORD)).update();
        root = new Actor(SubjectType.STAFF, rootId);
        cityA = city("operator-a", 29, 49, 31, 51);
        cityB = city("operator-b", 39, 49, 41, 51);
        testQuotes = new TestQuotes(jdbc, quotes);
        testQuotes.ensureClass(cityA, "STANDARD");
        testQuotes.ensureClass(cityB, "STANDARD");
    }

    @Test
    @SuppressWarnings("unchecked")
    void operatorPhoneOrdersAreScopedPermissionedAuditedAndDoNotCreateClients() throws Exception {
        SignedOperator full = operator(cityA, List.of("orders.create", "orders.view", "orders.cancel", "orders.reassign"));
        SignedOperator limited = operator(cityA, List.of("orders.create", "orders.view"));
        SignedOperator noCreate = operator(cityA, List.of());
        SignedOperator otherCity = operator(cityB, List.of("orders.create", "orders.view"));

        UUID quoteCommand = UUID.randomUUID();
        MvcResult quote = postJson("/api/operator/v1/quotes", full.token(), Map.of(
                "command_id", quoteCommand, "vehicle_class", "STANDARD",
                "pickup", point(A_PICKUP), "dropoff", point(A_DROPOFF)));
        assertThat(quote.getResponse().getStatus()).isEqualTo(201);
        UUID quoteId = UUID.fromString((String) object(quote).get("id"));
        assertThat(object(quote)).containsEntry("city_id", cityA.toString())
                .as("the operator gets the quote the contract describes (rider.v1.yaml Quote)")
                .containsKeys("discount_minor", "to_pay_minor", "promotions", "route_source");

        UUID createCommand = UUID.randomUUID();
        MvcResult created = postJson("/api/operator/v1/orders", full.token(), orderBody(
                createCommand, quoteId, A_PICKUP, A_DROPOFF, "+48 512 345 678", "call-29-a"));
        assertThat(created.getResponse().getStatus()).isEqualTo(201);
        Map<String, Object> createdBody = object(created);
        UUID orderA = UUID.fromString((String) createdBody.get("id"));
        assertThat(createdBody).containsEntry("channel", "PHONE");
        assertThat((Map<String, Object>) createdBody.get("caller"))
                .containsEntry("name", "Anna Caller").containsEntry("phone", "+48512345678");
        assertThat(jdbc.sql("select created_by_type from ride_order where id = :id").param("id", orderA)
                .query(String.class).single()).isEqualTo("STAFF");
        assertThat(jdbc.sql("select source_ref from ride_order where id = :id").param("id", orderA)
                .query(String.class).single()).isEqualTo("call-29-a");
        assertThat(jdbc.sql("select phone from order_contact where order_id = :id").param("id", orderA)
                .query(String.class).single()).isEqualTo("+48512345678");
        assertThat(jdbc.sql("select count(*) from client where phone_normalized = '+48512345678'")
                .query(Long.class).single()).isZero();

        UUID deniedQuoteCommand = UUID.randomUUID();
        assertThat(postJson("/api/operator/v1/quotes", noCreate.token(), Map.of(
                "command_id", deniedQuoteCommand, "vehicle_class", "STANDARD",
                "pickup", point(A_PICKUP), "dropoff", point(A_DROPOFF))).getResponse().getStatus()).isEqualTo(403);
        assertNoReceipt(deniedQuoteCommand);

        UUID wrongCityQuoteCommand = UUID.randomUUID();
        assertThat(postJson("/api/operator/v1/quotes", otherCity.token(), Map.of(
                "command_id", wrongCityQuoteCommand, "vehicle_class", "STANDARD",
                "pickup", point(A_PICKUP), "dropoff", point(A_DROPOFF))).getResponse().getStatus()).isEqualTo(403);
        assertNoReceipt(wrongCityQuoteCommand);

        QuoteService.Quote deniedOrderQuote = testQuotes.quote(noCreate.actor(), cityA, "STANDARD", A_PICKUP, A_DROPOFF);
        UUID deniedOrderCommand = UUID.randomUUID();
        assertThat(postJson("/api/operator/v1/orders", noCreate.token(), orderBody(
                deniedOrderCommand, deniedOrderQuote.id(), A_PICKUP, A_DROPOFF, "+48512345679", null))
                .getResponse().getStatus()).isEqualTo(403);
        assertNoReceipt(deniedOrderCommand);

        MvcResult quoteB = postJson("/api/operator/v1/quotes", otherCity.token(), Map.of(
                "command_id", UUID.randomUUID(), "vehicle_class", "STANDARD",
                "pickup", point(B_PICKUP), "dropoff", point(B_DROPOFF)));
        MvcResult createdB = postJson("/api/operator/v1/orders", otherCity.token(), orderBody(
                UUID.randomUUID(), UUID.fromString((String) object(quoteB).get("id")), B_PICKUP, B_DROPOFF,
                "+48512345680", "call-29-b"));
        UUID orderB = UUID.fromString((String) object(createdB).get("id"));

        MvcResult activeA = getAuth("/api/operator/v1/orders?city_id=" + cityA + "&status=active&limit=100", full.token());
        assertThat(activeA.getResponse().getStatus()).isEqualTo(200);
        List<Map<String, Object>> activeOrders = array(activeA);
        assertThat(activeOrders).extracting(o -> o.get("id")).contains(orderA.toString()).doesNotContain(orderB.toString());
        assertThat(activeOrders).allSatisfy(o -> assertThat(o.get("city_id")).isEqualTo(cityA.toString()));

        long orderAVersion = ((Number) createdBody.get("version")).longValue();
        UUID deniedCancel = UUID.randomUUID();
        assertThat(postJson("/api/operator/v1/orders/" + orderA + "/cancel", limited.token(), Map.of(
                "command_id", deniedCancel, "expected_version", orderAVersion, "reason_code", "PASSENGER_ASKED"))
                .getResponse().getStatus()).isEqualTo(403);
        assertNoReceipt(deniedCancel);

        MvcResult cancelled = postJson("/api/operator/v1/orders/" + orderA + "/cancel", full.token(), Map.of(
                "command_id", UUID.randomUUID(), "expected_version", orderAVersion,
                "reason_code", "PASSENGER_ASKED"));
        assertThat(cancelled.getResponse().getStatus()).isEqualTo(200);
        assertThat(object(cancelled)).containsEntry("status", "CANCELLED");
        assertThat(object(cancelled).get("cancellation")).asString().contains("by=STAFF")
                .contains("reason_code=PASSENGER_ASKED").contains("Пассажир попросил");
        assertThat(array(getAuth("/api/operator/v1/orders?city_id=" + cityA + "&status=active", full.token())))
                .extracting(o -> o.get("id")).doesNotContain(orderA.toString());
        assertThat(array(getAuth("/api/operator/v1/orders?city_id=" + cityA + "&status=all", full.token())))
                .extracting(o -> o.get("id")).contains(orderA.toString());

        UUID revokeOrder = createPhoneOrder(full, A_PICKUP, A_DROPOFF, "+48512345681");
        long revokeVersion = assignDriver(revokeOrder);
        UUID deniedRevoke = UUID.randomUUID();
        assertThat(postJson("/api/operator/v1/orders/" + revokeOrder + "/revoke-assignment", limited.token(), Map.of(
                "command_id", deniedRevoke, "expected_version", revokeVersion, "reason", "Operator reassignment"))
                .getResponse().getStatus()).isEqualTo(403);
        assertNoReceipt(deniedRevoke);
        MvcResult revoked = postJson("/api/operator/v1/orders/" + revokeOrder + "/revoke-assignment", full.token(), Map.of(
                "command_id", UUID.randomUUID(), "expected_version", revokeVersion,
                "reason_code", "DRIVER_NOT_RESPONDING", "reason", "Operator reassignment"));
        assertThat(revoked.getResponse().getStatus()).isEqualTo(200);
        assertThat(jdbc.sql("select state from assignment where order_id = :id order by created_at desc limit 1")
                .param("id", revokeOrder).query(String.class).single()).isEqualTo("REVOKED");

        MvcResult conversation = getAuth("/api/operator/v1/orders/" + revokeOrder
                + "/messages?reason=Support%20call", full.token());
        assertThat(conversation.getResponse().getStatus()).isEqualTo(200);
        assertThat(jdbc.sql("select count(*) from audit_log where action = 'order.chat.read' and resource_id = :id")
                .param("id", revokeOrder.toString()).query(Long.class).single()).isGreaterThan(0);

        UUID riderId = UUID.randomUUID();
        jdbc.sql("""
                        insert into client (id, phone_normalized, phone_verified_at, name, account_state, has_app,
                                            created_at, updated_at)
                        values (:id, :phone, now(), 'Rider', 'ACTIVE', true, now(), now())""")
                .param("id", riderId).param("phone", "+38050" + digits(riderId, 7)).update();
        String riderToken = sessions.open(new VerifiedSubject(new Actor(SubjectType.CLIENT, riderId), "ACTIVE", false),
                "operator-api-test").accessToken();
        assertThat(getAuth("/api/operator/v1/orders?city_id=" + cityA, riderToken).getResponse().getStatus()).isEqualTo(401);

        String rootToken = staffSignIn(rootLogin, ROOT_PASSWORD, ApiAudience.ADMIN.name());
        MvcResult activity = getAuth("/api/admin/v1/logs/activity?role=OPERATOR&staff_id=" + full.actor().id()
                + "&kind=REQUEST&limit=100", rootToken);
        assertThat(activity.getResponse().getStatus()).isEqualTo(200);
        List<Map<String, Object>> entries = (List<Map<String, Object>>) object(activity).get("entries");
        assertThat(entries).isNotEmpty().allSatisfy(entry -> assertThat(entry.get("role")).isEqualTo("OPERATOR"));
        assertThat(entries).extracting(entry -> entry.get("path"))
                .contains("/api/operator/v1/quotes", "/api/operator/v1/orders");
    }

    private SignedOperator operator(UUID cityId, List<String> permissions) throws Exception {
        String login = unique("operator");
        StaffDirectory.StaffMember member = directory.create(root, UUID.randomUUID(), login, INITIAL_PASSWORD,
                new Profile("Olena", "Operator", new Contacts(null, login + "@example.invalid", null),
                        Role.OPERATOR, permissions, false, List.of(cityId)), "Operator API test");
        String firstToken = staffSignIn(login, INITIAL_PASSWORD, "OPERATOR");
        assertThat(postJson("/api/operator/v1/me/password", firstToken, Map.of(
                "current_password", INITIAL_PASSWORD, "new_password", FINAL_PASSWORD)).getResponse().getStatus())
                .isEqualTo(204);
        return new SignedOperator(new Actor(SubjectType.STAFF, member.id()), staffSignIn(login, FINAL_PASSWORD, "OPERATOR"));
    }

    private UUID createPhoneOrder(SignedOperator operator, GeoPoint pickup, GeoPoint dropoff, String phone) throws Exception {
        MvcResult quote = postJson("/api/operator/v1/quotes", operator.token(), Map.of(
                "command_id", UUID.randomUUID(), "vehicle_class", "STANDARD", "pickup", point(pickup),
                "dropoff", point(dropoff)));
        MvcResult order = postJson("/api/operator/v1/orders", operator.token(), orderBody(UUID.randomUUID(),
                UUID.fromString((String) object(quote).get("id")), pickup, dropoff, phone, null));
        assertThat(order.getResponse().getStatus()).isEqualTo(201);
        return UUID.fromString((String) object(order).get("id"));
    }

    private long assignDriver(UUID orderId) {
        jdbc.sql("""
                        update dispatch_attempt set phase = 'STOPPED', stopped_at = now(), next_action_at = null,
                                                    version = version + 1
                        where order_id = :order and phase in ('PERSONAL', 'BROADCAST')""")
                .param("order", orderId).update();
        UUID driver = UUID.randomUUID();
        String phone = "+38067" + digits(driver, 7);
        jdbc.sql("""
                        insert into driver (id, phone_normalized, phone_verified_at, name, account_state, review_status,
                                            eligibility_rules, created_at, updated_at)
                        values (:id, :phone, now(), 'Synthetic Driver', 'ACTIVE', 'APPROVED', '{}', now(), now())""")
                .param("id", driver).param("phone", phone).update();
        taxi.blizz.TestAdmission.inEveryCity(jdbc, driver);
        UUID vehicle = UUID.randomUUID();
        jdbc.sql("""
                        insert into vehicle (id, driver_id, registration_number, make, model, color, production_year,
                                             state, class_approvals, created_at, updated_at)
                        values (:id, :driver, :registration, 'Test', 'Car', 'Black', 2024, 'APPROVED',
                                array['STANDARD'], now(), now())""")
                .param("id", vehicle).param("driver", driver).param("registration", "OP" + digits(vehicle, 6)).update();
        UUID assignment = UUID.randomUUID();
        jdbc.sql("""
                        insert into assignment (id, order_id, driver_id, vehicle_id, source, state, created_at)
                        values (:id, :order, :driver, :vehicle, 'OFFER', 'COMMITTED', now())""")
                .param("id", assignment).param("order", orderId).param("driver", driver).param("vehicle", vehicle).update();
        jdbc.sql("""
                        insert into trip (id, assignment_id, order_id, phase, created_at)
                        values (:id, :assignment, :order, 'TO_PICKUP', now())""")
                .param("id", UUID.randomUUID()).param("assignment", assignment).param("order", orderId).update();
        return jdbc.sql("update ride_order set status = 'ASSIGNED', version = version + 1, updated_at = now() "
                        + "where id = :id returning version")
                .param("id", orderId).query(Long.class).single();
    }

    private UUID city(String prefix, int minLon, int minLat, int maxLon, int maxLat) {
        UUID id = UUID.randomUUID();
        String polygon = "SRID=4326;MULTIPOLYGON(((" + minLon + " " + minLat + "," + maxLon + " " + minLat
                + "," + maxLon + " " + maxLat + "," + minLon + " " + maxLat + "," + minLon + " " + minLat + ")))";
        jdbc.sql("""
                        insert into city (id, code, name, currency, timezone, polygon, priority, state, created_at,
                                          updated_at)
                        values (:id, :code, 'Operator city', 'UAH', 'UTC', ST_GeomFromEWKT(:polygon), 0,
                                'PUBLISHED', now(), now())""")
                .param("id", id).param("code", prefix + "-" + id).param("polygon", polygon).update();
        return id;
    }

    private String staffSignIn(String login, String password, String audience) throws Exception {
        MvcResult result = postJson("/auth/v1/staff/sign-in", null,
                Map.of("login", login, "password", password, "audience", audience));
        assertThat(result.getResponse().getStatus()).isEqualTo(200);
        return (String) object(result).get("access_token");
    }

    private Map<String, Object> orderBody(UUID commandId, UUID quoteId, GeoPoint pickup, GeoPoint dropoff,
                                          String phone, String callRef) {
        Map<String, Object> result = new java.util.LinkedHashMap<>();
        result.put("command_id", commandId);
        result.put("quote_id", quoteId);
        result.put("vehicle_class", "STANDARD");
        result.put("pickup", point(pickup));
        result.put("pickup_label", "Pickup");
        result.put("dropoff", point(dropoff));
        result.put("dropoff_label", "Dropoff");
        result.put("payment_method", "CASH");
        if (callRef != null) result.put("call_ref", callRef);
        result.put("caller", Map.of("name", "Anna Caller", "phone", phone));
        return result;
    }

    private static Map<String, Object> point(GeoPoint point) {
        return Map.of("lat", point.lat(), "lon", point.lon());
    }

    private void assertNoReceipt(UUID commandId) {
        assertThat(jdbc.sql("select count(*) from command_receipt where command_id = :id")
                .param("id", commandId).query(Long.class).single()).isZero();
    }

    private MvcResult postJson(String path, String token, Object body) throws Exception {
        var request = post(path).contentType(MediaType.APPLICATION_JSON).content(json.writeValueAsString(body));
        if (token != null) request.header(HttpHeaders.AUTHORIZATION, "Bearer " + token);
        return mvc.perform(request).andReturn();
    }

    private MvcResult getAuth(String path, String token) throws Exception {
        return mvc.perform(get(path).header(HttpHeaders.AUTHORIZATION, "Bearer " + token)).andReturn();
    }

    @SuppressWarnings("unchecked")
    private Map<String, Object> object(MvcResult result) throws Exception {
        return json.readValue(result.getResponse().getContentAsString(), Map.class);
    }

    @SuppressWarnings("unchecked")
    private List<Map<String, Object>> array(MvcResult result) throws Exception {
        // A page of the list (REQ-API-09): its rows are under items.
        return (List<Map<String, Object>>) json.readValue(result.getResponse().getContentAsString(), Map.class)
                .get("items");
    }

    private static String unique(String prefix) {
        return prefix + "-" + UUID.randomUUID().toString().substring(0, 8);
    }

    private static String digits(UUID id, int count) {
        String value = id.toString().replaceAll("[^0-9]", "") + "123456789012345";
        return value.substring(0, count);
    }

    private record SignedOperator(Actor actor, String token) {
    }
}
