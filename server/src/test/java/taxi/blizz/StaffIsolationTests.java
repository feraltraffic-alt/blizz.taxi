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
 * exception with its reason, or waits for the owner's decision with its reason — a new operation in none fails the
 * build.
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
            "operator-bonuses.manage", "orders.interrupt", "orders.offer", "orders.reassign", "orders.view",
            "payments.retry", "pricing.manage",
            "promotions.manage", "reports.view", "retention.manage", "settings.manage", "support.manage",
            "trips.correct", "wallets.manage"};

    /** Swept with an order (and its case) of the city: the order and support-case families. */
    static final Set<String> FAMILIES_SWEPT = Set.of("/orders/{order_id}", "/support/cases/{case_id}");

    /** Swept with an object of their own family, made by {@link #cityFixture} (the second part of #201). */
    static final Set<String> CITY_SWEPT = new TreeSet<>(List.of(
            "GET /api/admin/v1/addresses/{address_id}",
            "GET /api/admin/v1/cities/{city_id}/addresses",
            "POST /api/admin/v1/addresses/{address_id}/aliases",
            "POST /api/admin/v1/addresses/{address_id}/hide",
            "POST /api/admin/v1/addresses/{address_id}/restore",
            "POST /api/admin/v1/addresses/{address_id}/update",
            "GET /api/admin/v1/cities/{city_id}/operations",
            "GET /api/admin/v1/cities/{city_id}/zones",
            "POST /api/admin/v1/cities/{city_id}/archive",
            "POST /api/admin/v1/cities/{city_id}/operations",
            "POST /api/admin/v1/cities/{city_id}/operations/pause",
            "POST /api/admin/v1/cities/{city_id}/operations/resume",
            "POST /api/admin/v1/cities/{city_id}/publish",
            "POST /api/admin/v1/cities/{city_id}/update",
            "POST /api/admin/v1/cities/{city_id}/zones",
            "POST /api/admin/v1/zones/{zone_id}/archive",
            "POST /api/admin/v1/zones/{zone_id}/publish",
            "GET /api/admin/v1/driver-risk-flags",
            "GET /api/admin/v1/driver-risk-flags/{flag_id}",
            "POST /api/admin/v1/driver-risk-flags/{flag_id}/confirm",
            "POST /api/admin/v1/driver-risk-flags/{flag_id}/dismiss",
            "GET /api/admin/v1/drivers/{driver_id}/earnings",
            "GET /api/admin/v1/finance/pending-postings",
            "GET /api/admin/v1/orders",
            "GET /api/admin/v1/orders/overview",
            "GET /api/admin/v1/reports/finance",
            "GET /api/admin/v1/reports/orders",
            "GET /api/admin/v1/reports/exports/{export_id}",
            "GET /api/admin/v1/reports/exports/{export_id}/file",
            "GET /api/admin/v1/payment-reconciliations/{run_id}",
            "POST /api/admin/v1/payment-reconciliations/items/{item_id}/resolve",
            "POST /api/admin/v1/payment-operations/{operation_id}/retry",
            "POST /api/admin/v1/promotions/{promotion_id}/archive",
            "POST /api/admin/v1/promotions/{promotion_id}/change",
            "POST /api/admin/v1/driver-promotions/{promotion_id}/archive",
            "POST /api/admin/v1/driver-promotions/{promotion_id}/change",
            "GET /api/admin/v1/settings/safety-contacts/{city_id}",
            "POST /api/admin/v1/settings/safety-contacts/{city_id}",
            "POST /api/admin/v1/call-lines/{number}",
            "GET /api/admin/v1/support/cases",
            "GET /api/operator/v1/support/cases",
            "GET /api/operator/v1/drivers/live",
            "GET /api/operator/v1/operators",
            "GET /api/operator/v1/orders",
            "POST /api/operator/v1/calls/{call_id}/answer",
            "GET /api/operator/v1/calls/{call_id}/recording",
            // A driver admitted only in the city (owner decision 01.11.2026, option 2 in #201).
            "GET /api/admin/v1/drivers/{driver_id}",
            "GET /api/admin/v1/drivers/{driver_id}/documents/{document_id}/file",
            "GET /api/admin/v1/drivers/{driver_id}/balance",
            "POST /api/admin/v1/drivers/{driver_id}/balance/top-ups",
            "POST /api/admin/v1/drivers/{driver_id}/block",
            "POST /api/admin/v1/drivers/{driver_id}/unblock",
            "POST /api/admin/v1/drivers/{driver_id}/decision",
            "POST /api/admin/v1/drivers/{driver_id}/payment-terminal",
            "POST /api/admin/v1/drivers/{driver_id}/phone",
            "POST /api/admin/v1/drivers/{driver_id}/phone/new-code",
            "POST /api/admin/v1/drivers/{driver_id}/reinstate",
            "POST /api/admin/v1/drivers/{driver_id}/suspend",
            "POST /api/admin/v1/driver-deletions/{driver_id}/complete",
            "POST /api/admin/v1/driver-deletions/{driver_id}/reject",
            "PUT /api/admin/v1/drivers/{driver_id}/admission-cities",
            // An operator of the city (owner decision 01.11.2026 in #201).
            "POST /api/admin/v1/staff-extensions/{staff_id}",
            "GET /api/admin/v1/operator-bonuses/{staff_id}/history"));

    private static final String RIDER_NO_CITY = "A rider has no city: client operations stay global (owner decision "
            + "30.10.2026 in #112, clients.manage)";
    private static final String SUPER_ADMIN = "Super admin only, by role and not by city (contract: \"Super admin "
            + "only\"); a super admin passes every city check";
    private static final String GLOBAL_SETTING = "A setting of the whole service with no city in it";
    private static final String MERCHANT = "Staff of every city only (owner decision 01.11.2026 in #201): a merchant "
            + "serves several cities and holds the service's keys; proven by merchantsAreForStaffOfEveryCity";

    /**
     * Not city-scoped, each with its reason (a stale or unreasoned entry fails {@link #everyOperationIsAccounted}).
     */
    static final Map<String, String> EXCEPTIONS = Map.ofEntries(
            Map.entry("PUT /api/admin/v1/uploads/{file_id}",
                    "Uploads a file of a case the staff member is writing; the file belongs to its uploader until "
                            + "attached, and reading it back is swept through the case's attachment"),
            Map.entry("PUT /api/operator/v1/uploads/{file_id}", "Same as the admin upload"),
            Map.entry("GET /api/admin/v1/clients/{client_id}", RIDER_NO_CITY),
            Map.entry("GET /api/admin/v1/clients/{client_id}/data-exports", RIDER_NO_CITY),
            Map.entry("POST /api/admin/v1/clients/{client_id}/block", RIDER_NO_CITY),
            Map.entry("POST /api/admin/v1/clients/{client_id}/unblock", RIDER_NO_CITY),
            Map.entry("POST /api/admin/v1/clients/{client_id}/phone", RIDER_NO_CITY),
            Map.entry("POST /api/admin/v1/clients/{client_id}/phone/new-code", RIDER_NO_CITY),
            Map.entry("POST /api/admin/v1/client-deletions/{client_id}/complete", RIDER_NO_CITY),
            Map.entry("POST /api/admin/v1/client-deletions/{client_id}/reject", RIDER_NO_CITY),
            Map.entry("GET /api/admin/v1/rider-wallets/{client_id}", RIDER_NO_CITY
                    + "; the bonus wallet is the rider's, per currency"),
            Map.entry("POST /api/admin/v1/rider-wallets/{client_id}/top-ups", RIDER_NO_CITY
                    + "; the bonus wallet is the rider's, per currency"),
            Map.entry("GET /api/admin/v1/staff/{staff_id}", SUPER_ADMIN + "; others read only themselves"),
            Map.entry("POST /api/admin/v1/staff/{staff_id}/update", SUPER_ADMIN),
            Map.entry("POST /api/admin/v1/staff/{staff_id}/suspend", SUPER_ADMIN),
            Map.entry("POST /api/admin/v1/staff/{staff_id}/restore", SUPER_ADMIN),
            Map.entry("POST /api/admin/v1/staff/{staff_id}/reset-password", SUPER_ADMIN),
            Map.entry("POST /api/admin/v1/staff/{staff_id}/emergency-grants", SUPER_ADMIN),
            Map.entry("POST /api/admin/v1/emergency-grants/{grant_id}/revoke", SUPER_ADMIN),
            Map.entry("GET /api/admin/v1/emergency-grants/{grant_id}/activity", SUPER_ADMIN),
            Map.entry("GET /api/admin/v1/logs/correlation/{correlation_id}",
                    "The logs of all staff with audit.view (owner decision 27.10.2026, StaffLogsController)"),
            Map.entry("POST /api/admin/v1/feature-flags/{key}/change", GLOBAL_SETTING + ": a feature flag"),
            Map.entry("POST /api/admin/v1/integrations/{group}/check", GLOBAL_SETTING + ": the service's keys"),
            Map.entry("POST /api/admin/v1/legal-documents/{version_id}", GLOBAL_SETTING + ": the legal texts"),
            Map.entry("POST /api/admin/v1/legal-documents/{version_id}/publish", GLOBAL_SETTING + ": the legal texts"),
            Map.entry("POST /api/admin/v1/settings/cancel-reasons/{reason_id}",
                    GLOBAL_SETTING + ": the cancel reason catalogue"),
            Map.entry("POST /api/admin/v1/settings/driver-transfers/{currency}",
                    GLOBAL_SETTING + ": a transfer rule per currency"),
            Map.entry("POST /api/admin/v1/payment-merchants/{merchant_id}/change", MERCHANT),
            Map.entry("POST /api/admin/v1/payment-merchants/{merchant_id}/check", MERCHANT));

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
    @Autowired org.springframework.transaction.PlatformTransactionManager transactions;
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
        Fixture fixture = CITY_SWEPT.contains(operation.toString()) ? cityFixture(operation) : fixture(operation);
        String path = operation.path();
        for (var entry : fixture.ids().entrySet()) {
            path = path.replace("{" + entry.getKey() + "}", entry.getValue().toString());
        }
        List<String> query = new ArrayList<>();
        if (hasCityQuery(operation)) {
            query.add("city_id=" + fixture.home());
        }
        if (requiresReasonQuery(operation)) {
            query.add("reason=Staff%20isolation%20probe");
        }
        for (String name : requiredQuery(operation)) {
            if (!name.equals("city_id") && !name.equals("reason")) {
                assertThat(fixture.values()).as(operation + " query parameter " + name).containsKey(name);
                query.add(name + "=" + java.net.URLEncoder.encode(fixture.values().get(name).toString(),
                        java.nio.charset.StandardCharsets.UTF_8));
            }
        }
        if (!query.isEmpty()) {
            path = path + "?" + String.join("&", query);
        }
        assertThat(path).as(operation + " every path parameter has a fixture").doesNotContain("{");
        String payload = json.writeValueAsString(operation.body(fixture.values()));
        ApiAudience audience = operation.contract().startsWith("operator") ? ApiAudience.OPERATOR : ApiAudience.ADMIN;

        List<String> problems = new ArrayList<>();
        for (Actor refused : List.of(staff(foreign, EVERY_RIGHT), staff(fixture.home()))) {
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

    /** Names of the required query parameters. */
    static List<String> requiredQuery(IsolationContract.Operation operation) {
        Object parameters = operation.definition().get("parameters");
        List<String> names = new ArrayList<>();
        if (parameters instanceof List<?> list) {
            for (Object p : list) {
                if (p instanceof Map<?, ?> m && "query".equals(m.get("in")) && Boolean.TRUE.equals(m.get("required"))) {
                    names.add(m.get("name").toString());
                }
            }
        }
        return names;
    }

    static boolean requiresReasonQuery(IsolationContract.Operation operation) {
        Object parameters = operation.definition().get("parameters");
        return parameters instanceof List<?> list && list.stream().anyMatch(p -> p instanceof Map<?, ?> m
                && "query".equals(m.get("in")) && "reason".equals(m.get("name"))
                && Boolean.TRUE.equals(m.get("required")));
    }

    static boolean inSweptFamily(IsolationContract.Operation operation) {
        return !EXCEPTIONS.containsKey(operation.toString())
                && (FAMILIES_SWEPT.stream().anyMatch(family -> operation.path().contains(family))
                    || CITY_SWEPT.contains(operation.toString()));
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
        assertThat(swept).as("every listed sweep is in the contracts").containsAll(CITY_SWEPT);
        Set<String> left = new TreeSet<>(all);
        left.removeAll(swept);
        left.removeAll(EXCEPTIONS.keySet());
        AWAITING_DECISION.forEach((operation, reason) ->
                assertThat(reason).as(operation + " reason it waits").isNotBlank());
        assertThat(left).as("operations neither swept nor an exception: only those waiting for a decision")
                .isEqualTo(AWAITING_DECISION.keySet());
        System.out.println("STAFF ISOLATION accounted: " + all.size() + " = swept " + swept.size() + " + exceptions "
                + EXCEPTIONS.size() + " + awaiting a decision " + AWAITING_DECISION.size());
    }

    /**
     * Operations that check the permission and not the city although their object has one, waiting for the owner's
     * decision. Empty since the decisions of 01.11.2026 (#201); the list stays exact so a new gap is named here.
     */
    static final Map<String, String> AWAITING_DECISION = Map.of();

    /**
     * Owner decision 01.11.2026 (#201): a payment merchant serves several cities and holds the service's keys, so only
     * staff of every city change or check it; staff of one of its cities are refused and write nothing.
     */
    @Test
    void merchantsAreForStaffOfEveryCity() throws Exception {
        UUID merchant = merchantOf(city);
        Map<String, Object> change = Map.of("command_id", UUID.randomUUID(), "password", PASSWORD,
                "domain", "test.blizz.invalid", "reason", "Staff isolation probe");
        String body = json.writeValueAsString(change);
        String ofTheCity = token(staff(city, EVERY_RIGHT), ApiAudience.ADMIN);
        var before = sideEffects();
        assertThat(perform(post("/api/admin/v1/payment-merchants/" + merchant + "/change")
                .contentType(MediaType.APPLICATION_JSON).content(body), ofTheCity).getResponse().getStatus())
                .as("staff of one of the merchant's cities change it").isEqualTo(403);
        assertThat(perform(post("/api/admin/v1/payment-merchants/" + merchant + "/check"), ofTheCity)
                .getResponse().getStatus()).as("staff of one of the merchant's cities check it").isEqualTo(403);
        assertThat(sideEffects()).as("refused: nothing written").isEqualTo(before);

        String everyCity = token(staff(null, EVERY_RIGHT), ApiAudience.ADMIN);
        int changed = perform(post("/api/admin/v1/payment-merchants/" + merchant + "/change")
                .contentType(MediaType.APPLICATION_JSON).content(body), everyCity).getResponse().getStatus();
        assertThat(changed).as("staff of every city reach the change").isIn(200, 422);
        assertThat(perform(post("/api/admin/v1/payment-merchants/" + merchant + "/check"), everyCity)
                .getResponse().getStatus()).as("staff of every city check it").isEqualTo(200);
    }

    // ------------------------------------------------------------ fixtures

    /** {@code home}: the city the object is in; its staff own it, staff of {@code foreign} do not. */
    private record Fixture(Map<String, Object> ids, Map<String, Object> values, Actor owner, UUID home) {
    }

    private Fixture fixture(IsolationContract.Operation operation) throws Exception {
        String path = operation.path();
        Actor owner = staff(city, EVERY_RIGHT);
        Map<String, Object> ids = new LinkedHashMap<>();
        Map<String, Object> values = new LinkedHashMap<>();
        values.put("reason", "Staff isolation probe");
        values.put("comment", "Staff isolation probe");
        values.put("password", PASSWORD);
        values.put("text", "Staff isolation probe");
        values.put("visibility", "INTERNAL");
        values.put("dropoff", Map.of("lat", -39.4, "lon", 19.6));
        freeCity();
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
        return new Fixture(ids, values, owner, city);
    }

    /** Spare cities for operations that change a city: each at its own longitude, far from the test cities. */
    private static final java.util.concurrent.atomic.AtomicInteger SPARE =
            new java.util.concurrent.atomic.AtomicInteger();

    /**
     * The object of one operation of the second part of #201, made in {@code city} — or in a spare city of its own when
     * the operation changes the city (archive, publish, operations, zones, promotions) — through the admin API by staff
     * of that city, so the fixture is what the owner could have made.
     */
    @SuppressWarnings("unchecked")
    private Fixture cityFixture(IsolationContract.Operation operation) throws Exception {
        String path = operation.path();
        String key = operation.toString();
        boolean spare = path.contains("/cities/{city_id}/") && !key.startsWith("GET ")
                || path.contains("/zones/") || path.contains("promotions/");
        UUID home = city;
        Map<String, Object> spareCity = null;
        if (spare) {
            spareCity = spareCity(!path.endsWith("/publish") && !path.endsWith("/update")
                    || path.contains("/zones/"));
            home = UUID.fromString(spareCity.get("id").toString());
        }
        Actor owner = staff(home, EVERY_RIGHT);
        String admin = token(owner, ApiAudience.ADMIN);
        Map<String, Object> ids = new LinkedHashMap<>();
        Map<String, Object> values = new LinkedHashMap<>();
        ids.put("city_id", home);
        values.put("reason", "Staff isolation probe");
        String today = java.time.LocalDate.now().toString();
        values.put("date", today);
        values.put("from", java.time.LocalDate.now().minusDays(7).toString());
        values.put("to", today);
        if (spareCity != null) {
            values.put("expected_version", spareCity.get("version"));
        }

        if (path.contains("/addresses")) {
            Map<String, Object> data = new LinkedHashMap<>(Map.of("city_id", city, "kind", "HOUSE",
                    "label", "Isolation street " + UUID.randomUUID().toString().substring(0, 8), "language", "en",
                    "street", "Isolation street", "house_raw", String.valueOf(SPARE.incrementAndGet()),
                    "pickup", Map.of("lat", -39.9 + SPARE.get() * 0.004, "lon", 19.1 + SPARE.get() * 0.004)));
            Map<String, Object> address = postJson("/api/admin/v1/addresses", admin,
                    Map.of("command_id", UUID.randomUUID(), "reason", "Fixture", "data", data));
            if (path.endsWith("/restore")) {
                address = postJson("/api/admin/v1/addresses/" + address.get("id") + "/hide", admin,
                        Map.of("command_id", UUID.randomUUID(), "expected_version", address.get("version"),
                                "reason", "Fixture"));
            }
            ids.put("address_id", address.get("id"));
            values.put("expected_version", address.get("version"));
            values.put("alias", Map.of("label", "Isolation alias " + UUID.randomUUID(), "language", "en"));
            values.put("data", data);
        } else if (path.contains("/zones/")) {
            Map<String, Object> zone = postJson("/api/admin/v1/cities/" + home + "/zones", admin,
                    Map.of("command_id", UUID.randomUUID(), "type", "AIRPORT",
                            "polygon", square(sparePolygonLon(spareCity) + 0.1, 60.1, 0.1), "priority", 10,
                            "reason", "Fixture"));
            if (path.endsWith("/archive")) {
                zone = postJson("/api/admin/v1/zones/" + zone.get("id") + "/publish", admin,
                        Map.of("command_id", UUID.randomUUID(), "expected_version", zone.get("version"),
                                "reason", "Fixture"));
            }
            ids.put("zone_id", zone.get("id"));
            values.put("expected_version", zone.get("version"));
        } else if (path.contains("/cities/{city_id}/")) {
            double lon = sparePolygonLon(spareCity);
            values.put("type", "AIRPORT");
            values.put("polygon", square(lon + 0.2, 60.2, 0.1));
            values.put("priority", 10);
            values.put("name", "Isolation spare");
            values.put("currency", "UAH");
            values.put("timezone", "UTC");
            if (path.endsWith("/update")) {
                values.put("polygon", square(lon, 60, 1));
            }
            if (path.contains("/operations")) {
                Map<String, Object> operations = getJson("/api/admin/v1/cities/" + home + "/operations", admin);
                values.put("expected_version", operations.get("version"));
                values.put("working_hours", List.of());
                values.put("payment_methods", List.of("CASH"));
                if (path.endsWith("/resume")) {
                    Map<String, Object> paused = postJson("/api/admin/v1/cities/" + home + "/operations/pause",
                            admin, Map.of("command_id", UUID.randomUUID(), "expected_version",
                                    operations.get("version"), "reason", "Fixture"));
                    values.put("expected_version", paused.get("version"));
                }
            }
        } else if (path.contains("/driver-risk-flags")) {
            TestRides.Driver driver = rides.driverNear(PICKUP);
            Map<String, Object> flag = postJson("/api/admin/v1/driver-risk-flags", admin,
                    Map.of("command_id", UUID.randomUUID(), "driver_id", driver.actor().id(), "city_id", city,
                            "reason", "Fixture"));
            ids.put("flag_id", flag.get("id"));
            values.put("expected_version", flag.get("version"));
        } else if (path.contains("/drivers/{driver_id}/earnings")) {
            ids.put("driver_id", rides.driverNear(PICKUP).actor().id());
        } else if (path.contains("{driver_id}")) {
            UUID driver = driverOnlyIn(city);
            ids.put("driver_id", driver);
            values.put("expected_version", jdbc.sql("select version from driver where id = :id").param("id", driver)
                    .query(Long.class).single());
            values.put("decision", "REQUEST_CHANGES");
            values.put("currency", "UAH");
            values.put("amount_minor", 100L);
            values.put("kind", "DEPOSIT");
            values.put("has_terminal", true);
            values.put("phone", "+38099" + (1_000_000 + SPARE.incrementAndGet()));
            values.put("new_challenge_id", UUID.randomUUID());
            values.put("new_code", "123456");
            values.put("city_ids", List.of(city));
            if (path.contains("{document_id}")) {
                UUID document = UUID.randomUUID();
                jdbc.sql("""
                                insert into driver_document (id, driver_id, type, file_id, created_at)
                                values (:id, :driver, 'IDENTITY', :file, now())""")
                        .param("id", document).param("driver", driver)
                        .param("file", safeFile(new Actor(SubjectType.DRIVER, driver), FilePurpose.DRIVER_DOCUMENT))
                        .update();
                ids.put("document_id", document);
            }
        } else if (path.contains("{staff_id}")) {
            Actor operator = staff(city, "calls.answer", "orders.create");
            ids.put("staff_id", operator.id());
            values.put("expected_version", 0L);
            values.put("extension", String.valueOf(7000 + SPARE.incrementAndGet()));
        } else if (path.contains("/reports/exports/")) {
            Map<String, Object> export = postJson("/api/admin/v1/reports/exports", admin,
                    Map.of("command_id", UUID.randomUUID(), "kind", "ORDERS", "city_id", city,
                            "from", values.get("from"), "to", today));
            ids.put("export_id", export.get("id"));
        } else if (path.contains("/payment-reconciliations/")) {
            var run = taxi.blizz.payments.internal.TestReconciliations.open(jdbc, merchantOf(city),
                    100 + SPARE.incrementAndGet());
            ids.put("run_id", run.runId());
            ids.put("item_id", run.itemId());
            values.put("expected_version", 0L);
            values.put("decision", "EXPLAINED");
        } else if (path.contains("/payment-operations/")) {
            freeCity();
            TestRides.Ride ride = cardRide();
            ids.put("operation_id", jdbc.sql("""
                            select o.id from payment_operation o join payment_intent i on i.id = o.intent_id
                            where i.order_id = :order order by o.created_at limit 1""")
                    .param("order", ride.order().id()).query(UUID.class).single());
        } else if (path.contains("/driver-promotions/")) {
            Map<String, Object> promotion = Map.of("name", "Isolation " + UUID.randomUUID(), "reward_minor", 100,
                    "currency", "UAH", "city_id", home, "period_days", 7, "orders_required", 5, "repeat", "ONCE",
                    "starts_at", java.time.OffsetDateTime.now().plusDays(1).toString());
            Map<String, Object> created = postJson("/api/admin/v1/driver-promotions", admin,
                    Map.of("command_id", UUID.randomUUID(), "promotion", promotion, "reason", "Fixture"));
            ids.put("promotion_id", created.get("id"));
            values.put("expected_version", created.get("version"));
            values.put("promotion", promotion);
        } else if (path.contains("/promotions/")) {
            Map<String, Object> promotion = Map.of("name", "Isolation " + UUID.randomUUID(), "kind", "BONUS",
                    "value_type", "FIXED", "value", 100, "currency", "UAH", "conditions", Map.of("city_id", home));
            Map<String, Object> created = postJson("/api/admin/v1/promotions", admin,
                    Map.of("command_id", UUID.randomUUID(), "promotion", promotion, "reason", "Fixture"));
            ids.put("promotion_id", created.get("id"));
            values.put("expected_version", created.get("version"));
            values.put("promotion", promotion);
        } else if (path.contains("/safety-contacts/")) {
            values.put("expected_version", getJson("/api/admin/v1/settings/safety-contacts/" + city, admin)
                    .get("version"));
            values.put("emergency_number", "112");
        } else if (path.contains("/call-lines/")) {
            ids.put("number", "+48" + (500_000_000 + SPARE.incrementAndGet() * 7919L % 400_000_000));
            values.put("expected_version", 0L);
            values.put("city_id", city);
        } else if (path.contains("/calls/{call_id}")) {
            UUID call = UUID.randomUUID();
            boolean recording = path.endsWith("/recording");
            jdbc.sql("""
                            insert into call (id, channel_id, caller_phone, called_number, city_id, state, started_at,
                                              ended_at)
                            values (:id, :channel, '+380501112233', '+380441110000', :city, :state, now(),
                                    case when :ended then now() end)""")
                    .param("id", call).param("channel", "isolation-" + call).param("city", city)
                    .param("state", recording ? "ENDED" : "RINGING").param("ended", recording).update();
            if (recording) {
                byte[] wav = taxi.blizz.telephony.internal.TestRecordings.tone(1);
                var stored = files.storeSystemFile(FilePurpose.CALL_RECORDING, "audio/wav",
                        new ByteArrayInputStream(wav), wav.length);
                new org.springframework.transaction.support.TransactionTemplate(transactions).executeWithoutResult(
                        status -> files.markAttached(Actor.system(), stored.fileId(), FilePurpose.CALL_RECORDING));
                jdbc.sql("""
                                insert into call_recording (call_id, state, file_id, duration_seconds, next_attempt_at,
                                                            created_at, stored_at)
                                values (:call, 'STORED', :file, 1, now(), now(), now())""")
                        .param("call", call).param("file", stored.fileId()).update();
            }
            ids.put("call_id", call);
        }
        return new Fixture(ids, values, owner, home);
    }

    /** A driver online near the pickup and admitted only in {@code cityId}. */
    private UUID driverOnlyIn(UUID cityId) {
        UUID driver = rides.driverNear(PICKUP).actor().id();
        jdbc.sql("delete from driver_admission_city where driver_id = :d and city_id <> :c")
                .param("d", driver).param("c", cityId).update();
        jdbc.sql("""
                        insert into driver_admission_city (driver_id, city_id, granted_at) values (:d, :c, now())
                        on conflict do nothing""")
                .param("d", driver).param("c", cityId).update();
        return driver;
    }

    /** A city of its own, drawn by staff of every city; published unless {@code published} is false. */
    @SuppressWarnings("unchecked")
    private Map<String, Object> spareCity(boolean published) throws Exception {
        String token = token(staff(null, EVERY_RIGHT), ApiAudience.ADMIN);
        int n = SPARE.incrementAndGet();
        double lon = 100 + n * 1.5;
        Map<String, Object> created = postJson("/api/admin/v1/cities", token, Map.of("command_id", UUID.randomUUID(),
                "code", "isolation-spare-" + UUID.randomUUID().toString().substring(0, 8), "name", "Isolation spare",
                "currency", "UAH", "timezone", "UTC", "polygon", square(lon, 60, 1), "priority", 5,
                "reason", "Fixture"));
        created.put("lon", lon);
        if (!published) {
            return created;
        }
        Map<String, Object> done = postJson("/api/admin/v1/cities/" + created.get("id") + "/publish", token,
                Map.of("command_id", UUID.randomUUID(), "expected_version", created.get("version"),
                        "reason", "Fixture"));
        done.put("lon", lon);
        return done;
    }

    private static double sparePolygonLon(Map<String, Object> spareCity) {
        return spareCity == null ? 0 : ((Number) spareCity.get("lon")).doubleValue();
    }

    private static Map<String, Object> square(double lon, double lat, double size) {
        return Map.of("type", "Polygon", "coordinates", List.of(List.of(List.of(lon, lat), List.of(lon + size, lat),
                List.of(lon + size, lat + size), List.of(lon, lat + size), List.of(lon, lat))));
    }

    /** The city's merchant, made on first use. */
    private UUID merchantOf(UUID cityId) {
        return jdbc.sql("select merchant_id from payment_merchant_city where city_id = :c").param("c", cityId)
                .query(UUID.class).optional().orElseGet(() -> {
                    UUID id = UUID.randomUUID();
                    jdbc.sql("""
                                    insert into payment_merchant (id, provider, account, domain, secret_ref, currency,
                                                                  created_at)
                                    values (:id, 'FAKE', :account, 'test.blizz.invalid', 'test', 'UAH', now())""")
                            .param("id", id).param("account", "staff_isolation_" + id).update();
                    jdbc.sql("insert into payment_merchant_city (city_id, merchant_id) values (:c, :m)")
                            .param("c", cityId).param("m", id).update();
                    return id;
                });
    }

    @SuppressWarnings("unchecked")
    private Map<String, Object> getJson(String path, String token) throws Exception {
        MvcResult result = perform(get(path), token);
        assertThat(result.getResponse().getStatus()).as(path + " " + result.getResponse().getContentAsString())
                .isEqualTo(200);
        return json.readValue(result.getResponse().getContentAsString(), Map.class);
    }

    /** A fixture of its own: earlier orders and drivers of the city must not take this one's place. */
    private void freeCity() {
        jdbc.sql("update work_session set state = 'CLOSED', closed_at = now() where city_id = :c and state <> 'CLOSED'")
                .param("c", city).update();
        jdbc.sql("""
                        update dispatch_attempt set phase = 'STOPPED', next_action_at = null
                        where phase in ('PERSONAL', 'BROADCAST')
                          and order_id in (select id from ride_order where city_id = :c)""")
                .param("c", city).update();
    }

    /** A finished card ride of the city, paid from the hold. */
    private TestRides.Ride cardRide() {
        UUID merchant = merchantOf(city);
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
                        values (:id, :login, 'Staff isolation', 'ADMIN', :permissions, :all, :scope, 'ACTIVE',
                                :hash, now(), now())""")
                .param("id", id).param("login", "staff-isolation-" + id).param("permissions", permissions)
                .param("all", scope == null)
                .param("scope", scope == null ? new UUID[0] : new UUID[] {scope})
                .param("hash", new BCryptPasswordEncoder(4).encode(PASSWORD))
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
                .isBetween(200, 202);
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
