package taxi.blizz;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;

import jakarta.servlet.Filter;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.annotation.AnnotationAwareOrderComparator;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import taxi.blizz.files.FilePurpose;
import taxi.blizz.files.FileService;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.ApiAudience;
import taxi.blizz.identity.SessionService;
import taxi.blizz.identity.VerifiedSubject;
import taxi.blizz.operations.CreateOrder;
import taxi.blizz.operations.Dispatch;
import taxi.blizz.operations.OrderView;
import taxi.blizz.operations.PaymentMethod;
import taxi.blizz.operations.TripView;
import taxi.blizz.operations.Orders;
import taxi.blizz.operations.Trips;
import taxi.blizz.operations.WorkSessions;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.platform.internal.OutboxRelay;
import taxi.blizz.pricing.QuoteService;
import tools.jackson.databind.json.JsonMapper;

/**
 * Issue #201 (AC-21 "scope", AC-03): staff of another city learn and change nothing of a city's objects, through any
 * admin or operator operation — the city-scope twin of {@link AccessIsolationTests}' stranger sweep. For each swept
 * operation the object is made in {@code city}; staff with every permission but in {@code foreign}, and staff of the
 * city with no permission, are refused (403/404 as the contract declares) and write nothing; then the owner's
 * identical request succeeds (or meets a documented conflict of the fixture's state), which proves the request
 * reaches the code. Every admin and operator operation with a path id or a {@code city_id} is either swept, an
 * exception with its reason, or listed for the second part of #201 — a new operation in neither fails the build.
 */
@SpringBootTest(properties = "blizz.files.local-dir=${java.io.tmpdir}/blizz-staff-isolation-201")
@org.springframework.context.annotation.Import(TestcontainersConfiguration.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class StaffIsolationTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, 19.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 19.55);
    static final String PASSWORD = "Staff-Isolation-201";
    static final String[] EVERY_RIGHT = {
            "audit.view", "calls.answer", "calls.listen", "calls.supervise", "clients.delete", "clients.manage",
            "driver.review", "drivers.delete", "drivers.risk", "fares.correct", "finance.manage", "flags.manage",
            "geo.manage", "integrations.manage", "legal.manage", "orders.cancel", "orders.create",
            "orders.interrupt", "orders.offer", "orders.reassign", "orders.view", "payments.retry", "pricing.manage",
            "promotions.manage", "reports.view", "retention.manage", "settings.manage", "support.manage",
            "trips.correct", "wallets.manage"};

    /** Swept here: the order and support-case families of the admin and operator APIs. */
    static final Set<String> FAMILIES_SWEPT = Set.of("/orders/{order_id}", "/support/cases/{case_id}");

    /**
     * Not city-scoped, each with its reason (a stale or unreasoned entry fails {@link #everyOperationIsAccounted}).
     */
    static final Map<String, String> EXCEPTIONS = Map.ofEntries(
            Map.entry("PUT /api/admin/v1/uploads/{file_id}",
                    "Uploads a file of a case the staff member is writing; the file belongs to its uploader until "
                            + "attached, and reading it back is swept through the case's attachment"),
            Map.entry("PUT /api/operator/v1/uploads/{file_id}", "Same as the admin upload"));

    @Autowired Orders orders;
    @Autowired Dispatch dispatch;
    @Autowired Trips trips;
    @Autowired WorkSessions sessions;
    @Autowired SessionService auth;
    @Autowired QuoteService quotes;
    @Autowired FileService files;
    @Autowired OutboxRelay relay;
    @Autowired org.springframework.context.ApplicationContext application;
    @Autowired JdbcClient jdbc;
    @Autowired JsonMapper json;
    @Autowired WebApplicationContext context;

    MockMvc mvc;
    TestRides rides;
    UUID city;
    UUID foreign;

    @BeforeAll
    void setUp() {
        List<Filter> filters = new ArrayList<>(context.getBeansOfType(Filter.class).values());
        AnnotationAwareOrderComparator.sort(filters);
        mvc = MockMvcBuilders.webAppContextSetup(context).addFilters(filters.toArray(Filter[]::new)).build();
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        city = rides.city("test-staff-isolation", "UAH", 19);
        foreign = rides.city("test-staff-isolation-foreign", "UAH", 21);
    }

    // ------------------------------------------------------------ the sweep

    static Stream<IsolationContract.Operation> swept() {
        return scoped().stream().filter(StaffIsolationTests::inSweptFamily);
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("swept")
    void staffOfAnotherCityAndStaffWithoutTheRightGetNothing(IsolationContract.Operation operation) throws Exception {
        Fixture fixture = fixture(operation);
        String path = operation.path();
        for (var entry : fixture.ids().entrySet()) {
            path = path.replace("{" + entry.getKey() + "}", entry.getValue().toString());
        }
        if (hasCityQuery(operation)) {
            path = path + "?city_id=" + city;
        }
        if (requiresReasonQuery(operation)) {
            path = path + (path.contains("?") ? "&" : "?") + "reason=Staff%20isolation%20probe";
        }
        assertThat(path).as(operation + " every path parameter has a fixture").doesNotContain("{");
        String payload = json.writeValueAsString(operation.body(fixture.values()));
        ApiAudience audience = operation.contract().startsWith("operator") ? ApiAudience.OPERATOR : ApiAudience.ADMIN;

        List<String> problems = new ArrayList<>();
        for (Actor refused : List.of(staff(foreign, EVERY_RIGHT), staff(city))) {
            var before = sideEffects();
            MvcResult result = perform(request(operation, path, payload), token(refused, audience));
            int status = result.getResponse().getStatus();
            String who = refused.equals(fixture.owner()) ? "owner" : status + " " + code(result);
            if (!operation.denials().contains(status)) {
                problems.add(operation + ": refused staff got " + who);
            }
            if (!sideEffects().equals(before)) {
                problems.add(operation + ": a refused request wrote outbox, audit or command receipts");
            }
        }
        MvcResult owner = perform(request(operation, path, payload), token(fixture.owner(), audience));
        int status = owner.getResponse().getStatus();
        boolean declared = ((Map<?, ?>) operation.definition().get("responses")).containsKey(String.valueOf(status));
        boolean reached = status >= 200 && status < 300 || status == 409 || status == 422;
        if (!declared || !reached) {
            problems.add(operation + ": owner got " + status + " " + code(owner) + " "
                    + abbreviate(owner.getResponse().getContentAsString()));
        }
        System.out.println("STAFF ISOLATION " + operation + " owner=" + status + " " + code(owner));
        assertThat(problems).as(String.join(" | ", problems)).isEmpty();
    }

    // ------------------------------------------------------------ completeness

    /** Admin and operator operations with a path id or a city_id query. */
    static List<IsolationContract.Operation> scoped() {
        List<IsolationContract.Operation> result = new ArrayList<>();
        for (String contract : List.of("admin.v1.yaml", "operator.v1.yaml")) {
            for (var operation : IsolationContract.allOperations(contract)) {
                if (operation.path().contains("{") || hasCityQuery(operation)) {
                    result.add(operation);
                }
            }
        }
        return result;
    }

    static boolean hasCityQuery(IsolationContract.Operation operation) {
        Object parameters = operation.definition().get("parameters");
        return parameters instanceof List<?> list && list.stream().anyMatch(p -> p instanceof Map<?, ?> m
                && "query".equals(m.get("in")) && "city_id".equals(m.get("name")));
    }

    static boolean requiresReasonQuery(IsolationContract.Operation operation) {
        Object parameters = operation.definition().get("parameters");
        return parameters instanceof List<?> list && list.stream().anyMatch(p -> p instanceof Map<?, ?> m
                && "query".equals(m.get("in")) && "reason".equals(m.get("name"))
                && Boolean.TRUE.equals(m.get("required")));
    }

    static boolean inSweptFamily(IsolationContract.Operation operation) {
        return !EXCEPTIONS.containsKey(operation.toString())
                && FAMILIES_SWEPT.stream().anyMatch(family -> operation.path().contains(family));
    }

    @Test
    void everyOperationIsAccounted() {
        Set<String> all = new TreeSet<>();
        scoped().forEach(operation -> all.add(operation.toString()));
        EXCEPTIONS.forEach((operation, reason) -> {
            assertThat(reason).as(operation + " exception reason").isNotBlank();
            assertThat(all).as("no stale exception: " + operation).contains(operation);
        });
        Set<String> swept = new TreeSet<>();
        swept().forEach(operation -> swept.add(operation.toString()));
        Set<String> secondPart = new TreeSet<>(all);
        secondPart.removeAll(swept);
        secondPart.removeAll(EXCEPTIONS.keySet());
        assertThat(secondPart).as("operations left for the second part of #201").isEqualTo(SECOND_PART);
        System.out.println("STAFF ISOLATION accounted: " + all.size() + " = swept " + swept.size() + " + exceptions "
                + EXCEPTIONS.size() + " + second part " + SECOND_PART.size());
    }

    /**
     * Operations whose fixtures come in the second part of #201: the list is exact, so an operation added to the
     * contracts without a sweep or an exception fails {@link #everyOperationIsAccounted}.
     */
    static final Set<String> SECOND_PART = new TreeSet<>(List.of(
            "GET /api/admin/v1/addresses/{address_id}",
            "GET /api/admin/v1/cities/{city_id}/addresses",
            "GET /api/admin/v1/cities/{city_id}/operations",
            "GET /api/admin/v1/cities/{city_id}/zones",
            "GET /api/admin/v1/clients/{client_id}",
            "GET /api/admin/v1/clients/{client_id}/data-exports",
            "GET /api/admin/v1/driver-risk-flags",
            "GET /api/admin/v1/driver-risk-flags/{flag_id}",
            "GET /api/admin/v1/drivers/{driver_id}",
            "GET /api/admin/v1/drivers/{driver_id}/balance",
            "GET /api/admin/v1/drivers/{driver_id}/documents/{document_id}/file",
            "GET /api/admin/v1/drivers/{driver_id}/earnings",
            "GET /api/admin/v1/emergency-grants/{grant_id}/activity",
            "GET /api/admin/v1/finance/pending-postings",
            "GET /api/admin/v1/logs/correlation/{correlation_id}",
            "GET /api/admin/v1/operator-bonuses/{staff_id}/history",
            "GET /api/admin/v1/orders",
            "GET /api/admin/v1/orders/overview",
            "GET /api/admin/v1/payment-reconciliations/{run_id}",
            "GET /api/admin/v1/reports/exports/{export_id}",
            "GET /api/admin/v1/reports/exports/{export_id}/file",
            "GET /api/admin/v1/reports/finance",
            "GET /api/admin/v1/reports/orders",
            "GET /api/admin/v1/rider-wallets/{client_id}",
            "GET /api/admin/v1/settings/safety-contacts/{city_id}",
            "GET /api/admin/v1/staff/{staff_id}",
            "GET /api/admin/v1/support/cases",
            "GET /api/operator/v1/calls/{call_id}/recording",
            "GET /api/operator/v1/drivers/live",
            "GET /api/operator/v1/operators",
            "GET /api/operator/v1/orders",
            "GET /api/operator/v1/support/cases",
            "POST /api/admin/v1/addresses/{address_id}/aliases",
            "POST /api/admin/v1/addresses/{address_id}/hide",
            "POST /api/admin/v1/addresses/{address_id}/restore",
            "POST /api/admin/v1/addresses/{address_id}/update",
            "POST /api/admin/v1/call-lines/{number}",
            "POST /api/admin/v1/cities/{city_id}/archive",
            "POST /api/admin/v1/cities/{city_id}/operations",
            "POST /api/admin/v1/cities/{city_id}/operations/pause",
            "POST /api/admin/v1/cities/{city_id}/operations/resume",
            "POST /api/admin/v1/cities/{city_id}/publish",
            "POST /api/admin/v1/cities/{city_id}/update",
            "POST /api/admin/v1/cities/{city_id}/zones",
            "POST /api/admin/v1/client-deletions/{client_id}/complete",
            "POST /api/admin/v1/client-deletions/{client_id}/reject",
            "POST /api/admin/v1/clients/{client_id}/block",
            "POST /api/admin/v1/clients/{client_id}/phone",
            "POST /api/admin/v1/clients/{client_id}/phone/new-code",
            "POST /api/admin/v1/clients/{client_id}/unblock",
            "POST /api/admin/v1/driver-deletions/{driver_id}/complete",
            "POST /api/admin/v1/driver-deletions/{driver_id}/reject",
            "POST /api/admin/v1/driver-promotions/{promotion_id}/archive",
            "POST /api/admin/v1/driver-promotions/{promotion_id}/change",
            "POST /api/admin/v1/driver-risk-flags/{flag_id}/confirm",
            "POST /api/admin/v1/driver-risk-flags/{flag_id}/dismiss",
            "POST /api/admin/v1/drivers/{driver_id}/balance/top-ups",
            "POST /api/admin/v1/drivers/{driver_id}/block",
            "POST /api/admin/v1/drivers/{driver_id}/decision",
            "POST /api/admin/v1/drivers/{driver_id}/payment-terminal",
            "POST /api/admin/v1/drivers/{driver_id}/phone",
            "POST /api/admin/v1/drivers/{driver_id}/phone/new-code",
            "POST /api/admin/v1/drivers/{driver_id}/reinstate",
            "POST /api/admin/v1/drivers/{driver_id}/suspend",
            "POST /api/admin/v1/drivers/{driver_id}/unblock",
            "POST /api/admin/v1/emergency-grants/{grant_id}/revoke",
            "POST /api/admin/v1/feature-flags/{key}/change",
            "POST /api/admin/v1/integrations/{group}/check",
            "POST /api/admin/v1/legal-documents/{version_id}",
            "POST /api/admin/v1/legal-documents/{version_id}/publish",
            "POST /api/admin/v1/payment-merchants/{merchant_id}/change",
            "POST /api/admin/v1/payment-merchants/{merchant_id}/check",
            "POST /api/admin/v1/payment-operations/{operation_id}/retry",
            "POST /api/admin/v1/payment-reconciliations/items/{item_id}/resolve",
            "POST /api/admin/v1/promotions/{promotion_id}/archive",
            "POST /api/admin/v1/promotions/{promotion_id}/change",
            "POST /api/admin/v1/rider-wallets/{client_id}/top-ups",
            "POST /api/admin/v1/settings/cancel-reasons/{reason_id}",
            "POST /api/admin/v1/settings/driver-transfers/{currency}",
            "POST /api/admin/v1/settings/safety-contacts/{city_id}",
            "POST /api/admin/v1/staff-extensions/{staff_id}",
            "POST /api/admin/v1/staff/{staff_id}/emergency-grants",
            "POST /api/admin/v1/staff/{staff_id}/reset-password",
            "POST /api/admin/v1/staff/{staff_id}/restore",
            "POST /api/admin/v1/staff/{staff_id}/suspend",
            "POST /api/admin/v1/staff/{staff_id}/update",
            "POST /api/admin/v1/zones/{zone_id}/archive",
            "POST /api/admin/v1/zones/{zone_id}/publish",
            "POST /api/operator/v1/calls/{call_id}/answer",
            "PUT /api/admin/v1/drivers/{driver_id}/admission-cities"));

    // ------------------------------------------------------------ fixtures

    private record Fixture(Map<String, UUID> ids, Map<String, Object> values, Actor owner) {
    }

    private Fixture fixture(IsolationContract.Operation operation) throws Exception {
        String path = operation.path();
        Actor owner = staff(city, EVERY_RIGHT);
        Map<String, UUID> ids = new LinkedHashMap<>();
        Map<String, Object> values = new LinkedHashMap<>();
        values.put("reason", "Staff isolation probe");
        values.put("comment", "Staff isolation probe");
        values.put("password", PASSWORD);
        values.put("text", "Staff isolation probe");
        values.put("visibility", "INTERNAL");
        values.put("dropoff", Map.of("lat", -39.4, "lon", 19.6));
        // A fixture of its own: earlier orders and drivers of the city must not take this one's place.
        jdbc.sql("update work_session set state = 'CLOSED', closed_at = now() where city_id = :c and state <> 'CLOSED'")
                .param("c", city).update();
        jdbc.sql("""
                        update dispatch_attempt set phase = 'STOPPED', next_action_at = null
                        where phase in ('PERSONAL', 'BROADCAST')
                          and order_id in (select id from ride_order where city_id = :c)""")
                .param("c", city).update();
        boolean card = path.contains("/payment-operations") || path.contains("/evidence")
                || path.contains("/chargebacks");
        TestRides.Ride ride = card ? cardRide() : rides.started(city, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        if (!card) {
            // A cash dispute needs the driver's "not paid"; every other operation takes a paid trip.
            rides.complete(ride, !path.contains("/cash-dispute"));
        }
        deliverEvents();
        ids.put("order_id", ride.order().id());
        values.put("driver_id", ride.driver().actor().id());
        values.put("dropoff_label", "Station");
        values.put("decision", "RIDER_PAID");
        values.put("currency", "UAH");
        values.put("bank_reason", "Staff isolation probe");
        values.put("received_on", java.time.LocalDate.now().toString());
        values.put("outcome", "WON");
        values.put("to", "RIDER");
        values.put("follow_up", false);
        values.put("reason_code", path.endsWith("/interrupt") ? "VEHICLE_BREAKDOWN"
                : path.endsWith("/revoke-assignment") ? "DRIVER_NOT_RESPONDING" : "NO_CARS");
        if (path.contains("/cash-dispute/")) {
            values.put("expected_version", jdbc.sql("select version from cash_dispute where order_id = :o")
                    .param("o", ride.order().id()).query(Long.class).single());
        }
        if (path.contains("{chargeback_id}")) {
            Map<String, Object> opened = postJson("/api/admin/v1/orders/" + ride.order().id() + "/chargebacks",
                    token(owner, ApiAudience.ADMIN), Map.of("command_id", UUID.randomUUID(), "amount_minor", 100,
                            "currency", "UAH", "bank_reason", "Fixture", "received_on",
                            java.time.LocalDate.now().toString()));
            ids.put("chargeback_id", UUID.fromString(opened.get("id").toString()));
            values.put("expected_version", opened.get("version"));
        }
        if (!path.contains("/cash-dispute/") && !path.contains("{chargeback_id}")) {
            // A fare correction is checked against the fare's version, everything else against the order's.
            values.put("expected_version", path.endsWith("/fare-corrections") ? 1L
                    : orders.get(ride.order().id()).version());
        }
        values.put("amount_minor", orders.get(ride.order().id()).finalPriceMinor() + 500);
        if (path.contains("/support/cases/")) {
            UUID attachment = safeFile(ride.payer(), FilePurpose.SUPPORT_ATTACHMENT);
            Map<String, Object> creation = new LinkedHashMap<>();
            creation.put("command_id", UUID.randomUUID());
            creation.put("category", "LOST_ITEM");
            creation.put("subject", "Staff isolation fixture");
            creation.put("message", "A bag left in the car");
            creation.put("attachment_ids", List.of(attachment));
            creation.put("order_id", ride.order().id());
            Map<String, Object> created = postJson("/api/rider/v1/support/cases",
                    auth.open(new VerifiedSubject(ride.payer(), "ACTIVE", false), "staff-isolation").accessToken(),
                    creation);
            UUID caseId = UUID.fromString(created.get("id").toString());
            ids.put("case_id", caseId);
            ids.put("file_id", attachment);
            values.put("expected_version", jdbc.sql("select version from support_case where id = :id")
                    .param("id", caseId).query(Long.class).single());
            values.put("assignee_id", owner.id());
            values.put("priority", "HIGH");
            values.put("body", "Staff isolation probe");
        }
        return new Fixture(ids, values, owner);
    }

    /** A finished card ride of the city, paid from the hold. */
    private TestRides.Ride cardRide() {
        UUID merchant = jdbc.sql("select merchant_id from payment_merchant_city where city_id = :c").param("c", city)
                .query(UUID.class).optional().orElseGet(() -> {
                    UUID id = UUID.randomUUID();
                    jdbc.sql("""
                                    insert into payment_merchant (id, provider, account, domain, secret_ref, currency,
                                                                  created_at)
                                    values (:id, 'FAKE', :account, 'test.blizz.invalid', 'test', 'UAH', now())""")
                            .param("id", id).param("account", "staff_isolation_" + id).update();
                    jdbc.sql("insert into payment_merchant_city (city_id, merchant_id) values (:c, :m)")
                            .param("c", city).param("m", id).update();
                    return id;
                });
        Actor rider = rides.client();
        jdbc.sql("""
                        insert into payment_card (id, client_id, merchant_id, token, masked_pan, card_type, state,
                                                  created_at)
                        values (:id, :client, :merchant, :token, '41****1111', 'Visa', 'ACTIVE', now())""")
                .param("id", UUID.randomUUID()).param("client", rider.id()).param("merchant", merchant)
                .param("token", "tok-" + rider.id()).update();
        TestRides.Driver driver = rides.driverNear(PICKUP);
        UUID quote = new TestQuotes(jdbc, quotes).quote(rider, city, "STANDARD", PICKUP, DROPOFF).id();
        OrderView order = orders.create(rider, UUID.randomUUID(), new CreateOrder(rider.id(), "STANDARD", PICKUP,
                "Home", DROPOFF, "Work", PaymentMethod.CARD, quote));
        deliverEvents();
        dispatch.accept(driver.actor(), driver.device(), UUID.randomUUID(),
                dispatch.offers(driver.actor()).getFirst().id());
        TripView trip = trips.current(driver.actor()).orElseThrow();
        rides.moveTo(driver, TestRides.north(PICKUP, 30));
        TripView waiting = trips.arrive(driver.actor(), UUID.randomUUID(), trip.id(), trip.version(), null);
        TripView started = trips.start(driver.actor(), UUID.randomUUID(), waiting.id(), waiting.version(), null);
        TestRides.Ride ride = new TestRides.Ride(rider, driver, order, started);
        rides.complete(ride, null);
        deliverEvents();
        new taxi.blizz.payments.internal.TestPayments(application).settle();
        return ride;
    }

    private void deliverEvents() {
        while (relay.runOnce() > 0) {
            // drain
        }
    }

    private UUID safeFile(Actor owner, FilePurpose purpose) {
        byte[] png = AccessIsolationTests.PNG;
        UUID fileId = files.openUpload(owner, UUID.randomUUID(), purpose, "image/png", png.length).fileId();
        files.upload(owner, fileId, "image/png", png.length, new ByteArrayInputStream(png));
        return fileId;
    }

    private Actor staff(UUID scope, String... permissions) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, all_cities, city_scope, state,
                                                password_hash, created_at, updated_at)
                        values (:id, :login, 'Staff isolation', 'ADMIN', :permissions, false, :scope, 'ACTIVE',
                                :hash, now(), now())""")
                .param("id", id).param("login", "staff-isolation-" + id).param("permissions", permissions)
                .param("scope", new UUID[] {scope}).param("hash", new BCryptPasswordEncoder(4).encode(PASSWORD))
                .update();
        return new Actor(SubjectType.STAFF, id);
    }

    private String token(Actor staff, ApiAudience audience) {
        return auth.openStaff(new VerifiedSubject(staff, "ACTIVE", false), audience, "staff-isolation").accessToken();
    }

    private MockHttpServletRequestBuilder request(IsolationContract.Operation operation, String path, String payload) {
        return switch (operation.method()) {
            case "get" -> get(path);
            case "put" -> operation.binary()
                    ? put(path).contentType(MediaType.IMAGE_PNG).content(AccessIsolationTests.PNG)
                    : put(path).contentType(MediaType.APPLICATION_JSON).content(payload);
            case "post" -> post(path).contentType(MediaType.APPLICATION_JSON).content(payload);
            default -> throw new AssertionError("Unsupported request method: " + operation);
        };
    }

    private MvcResult perform(MockHttpServletRequestBuilder request, String token) throws Exception {
        return mvc.perform(request.header(HttpHeaders.AUTHORIZATION, "Bearer " + token)).andReturn();
    }

    @SuppressWarnings("unchecked")
    private Map<String, Object> postJson(String path, String token, Map<String, Object> body) throws Exception {
        MvcResult result = perform(post(path).contentType(MediaType.APPLICATION_JSON)
                .content(json.writeValueAsString(body)), token);
        assertThat(result.getResponse().getStatus()).as(path + " " + result.getResponse().getContentAsString())
                .isBetween(200, 201);
        return json.readValue(result.getResponse().getContentAsString(), Map.class);
    }

    private Map<String, Object> sideEffects() {
        return jdbc.sql("""
                select (select count(*) from outbox) as outbox,
                       (select count(*) from audit_log) as audit_log,
                       (select count(*) from command_receipt) as command_receipt""").query().singleRow();
    }

    private String code(MvcResult result) throws Exception {
        int status = result.getResponse().getStatus();
        if (status >= 200 && status < 300) {
            return "success";
        }
        return json.readTree(result.getResponse().getContentAsString()).path("code").asText("MISSING_CODE");
    }

    private static String abbreviate(String text) {
        String flat = text.replace('\n', ' ');
        return flat.length() > 600 ? flat.substring(0, 600) + "…" : flat;
    }
}
