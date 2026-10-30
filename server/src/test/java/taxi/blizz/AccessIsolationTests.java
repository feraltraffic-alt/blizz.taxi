package taxi.blizz;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;

import jakarta.servlet.Filter;
import java.io.ByteArrayInputStream;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.core.annotation.AnnotationAwareOrderComparator;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import taxi.blizz.configuration.ServiceSettings;
import taxi.blizz.files.FilePurpose;
import taxi.blizz.files.FileService;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.IssuedSession;
import taxi.blizz.identity.SessionService;
import taxi.blizz.identity.VerifiedSubject;
import taxi.blizz.operations.CreateOrder;
import taxi.blizz.operations.Dispatch;
import taxi.blizz.operations.OrderView;
import taxi.blizz.operations.Orders;
import taxi.blizz.operations.PaymentMethod;
import taxi.blizz.operations.Preorders;
import taxi.blizz.operations.Trips;
import taxi.blizz.operations.WorkSessions;
import taxi.blizz.payments.CardTopUps;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.pricing.QuoteService;
import tools.jackson.databind.json.JsonMapper;

/** T-37: valid requests reach ownership checks, and the identical owner request proves the fixture usable. */
@SpringBootTest(properties = "blizz.files.local-dir=${java.io.tmpdir}/blizz-isolation-124")
@Import(AccessIsolationTests.Database.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class AccessIsolationTests {
    @org.springframework.boot.test.context.TestConfiguration(proxyBeanMethods = false)
    static class Database {
        @org.springframework.context.annotation.Bean
        @org.springframework.boot.testcontainers.service.connection.ServiceConnection
        org.testcontainers.postgresql.PostgreSQLContainer isolationSweepPostgres() {
            return new org.testcontainers.postgresql.PostgreSQLContainer(org.testcontainers.utility.DockerImageName
                    .parse("postgis/postgis:18-3.6").asCompatibleSubstituteFor("postgres"));
        }
    }

    static final GeoPoint PICKUP = new GeoPoint(-39.5, 155.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 155.55);
    static final byte[] PNG = java.util.Base64.getDecoder().decode(
            "iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAQAAAC1HAwCAAAAC0lEQVR42mNk+A8AAQUBAScY42YAAAAASUVORK5CYII=");
    private static final String CLAIM = "POST /api/driver/v1/orders/{order_id}/claim";
    private static final String RESERVE = "POST /api/driver/v1/preorders/{order_id}/reserve";
    private static final Map<String, String> POLICY_EXCEPTIONS = Map.of(
            CLAIM, "Shared ALL pool before assignment; eligibility rather than ownership (issue #102).",
            RESERVE, "Shared pre-order pool before reservation; eligibility rather than ownership (ADR 0006).");

    @Autowired Orders orders;
    @Autowired Dispatch dispatch;
    @Autowired Trips trips;
    @Autowired WorkSessions sessions;
    @Autowired SessionService auth;
    @Autowired QuoteService quotes;
    @Autowired FileService files;
    @Autowired CardTopUps topUps;
    @Autowired Preorders preorders;
    @Autowired taxi.blizz.geo.CityOperations cityOperations;
    @Autowired taxi.blizz.geo.GeoConfiguration geography;
    @Autowired taxi.blizz.identity.EmergencyAccess emergency;
    @org.springframework.test.context.bean.override.mockito.MockitoSpyBean
    taxi.blizz.backoffice.SupportCases supportCases;
    @Autowired ServiceSettings settings;
    @Autowired JdbcClient jdbc;
    @Autowired JsonMapper json;
    @Autowired WebApplicationContext context;
    MockMvc mvc;
    TestRides rides;
    UUID city;
    String strangerRider;
    String strangerDriver;
    UUID foreignCity;

    @BeforeEach
    void setUp() {
        List<Filter> filters = new ArrayList<>(context.getBeansOfType(Filter.class).values());
        AnnotationAwareOrderComparator.sort(filters);
        mvc = MockMvcBuilders.webAppContextSetup(context).addFilters(filters.toArray(Filter[]::new)).build();
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        city = rides.city("test-isolation", "UAH", 155);
        foreignCity = rides.city("test-isolation-foreign", "UAH", 156);
        merchant(city);
        strangerRider = token(rides.client());
        strangerDriver = driverSession(new GeoPoint(-39.5, 156.5)).device().accessToken();
        if (settings.current().settings().preorders().dispatch() != ServiceSettings.PreorderDispatch.RESERVATION) {
            Actor admin = staff("settings.manage");
            var before = settings.current().settings();
            settings.change(admin, UUID.randomUUID(), settings.current().version(), new ServiceSettings.Settings(
                    before.brand(), before.languages(), before.calls(),
                    new ServiceSettings.Preorders(60, 7, ServiceSettings.PreorderDispatch.RESERVATION, 30, 30, 10, 60)),
                    "Isolation fixture preorder mode");
        }
    }

    static Stream<IsolationContract.Operation> contractOperations() {
        var selected = new ArrayList<>(IsolationContract.operations("rider.v1.yaml"));
        selected.addAll(IsolationContract.operations("driver.v1.yaml"));
        assertThat(selected.size()).as("contract-selected operations; additions require usable fixtures")
                .isGreaterThanOrEqualTo(48);
        validatePolicyExceptions(selected, POLICY_EXCEPTIONS);
        System.out.println("ISOLATION SELECTED " + selected.size() + " " + selected);
        System.out.println("ISOLATION POLICY EXCEPTIONS " + POLICY_EXCEPTIONS);
        System.out.println("ISOLATION STRICT " + (selected.size() - POLICY_EXCEPTIONS.size()));
        return selected.stream();
    }

    private static void validatePolicyExceptions(List<IsolationContract.Operation> selected,
                                                 Map<String, String> exceptions) {
        exceptions.forEach((operation, reason) -> assertThat(reason)
                .as(operation + " explicit exception reason").isNotBlank());
        assertThat(selected.stream().map(Object::toString).toList()).as("no stale policy exception")
                .containsAll(exceptions.keySet());
        assertThat(exceptions.keySet()).as("only the two approved shared pools")
                .containsExactlyInAnyOrder(CLAIM, RESERVE);
    }

    @org.junit.jupiter.api.Test
    void policyExceptionManifestRejectsStaleUnreasonedAndUnapprovedEntries() {
        var selected = new ArrayList<>(IsolationContract.operations("rider.v1.yaml"));
        selected.addAll(IsolationContract.operations("driver.v1.yaml"));
        validatePolicyExceptions(selected, POLICY_EXCEPTIONS);
        var stale = new LinkedHashMap<>(POLICY_EXCEPTIONS);
        stale.put("POST /api/driver/v1/removed/{id}", "Deliberate stale exception");
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> validatePolicyExceptions(selected, stale))
                .isInstanceOf(AssertionError.class).hasMessageContaining("no stale policy exception");
        String extra = "GET /api/rider/v1/orders/{order_id}";
        var unreasoned = new LinkedHashMap<>(POLICY_EXCEPTIONS);
        unreasoned.put(extra, " ");
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> validatePolicyExceptions(selected, unreasoned))
                .isInstanceOf(AssertionError.class).hasMessageContaining("explicit exception reason");
        var unapproved = new LinkedHashMap<>(POLICY_EXCEPTIONS);
        unapproved.put(extra, "A reason alone does not approve another policy exception");
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> validatePolicyExceptions(selected, unapproved))
                .isInstanceOf(AssertionError.class).hasMessageContaining("only the two approved shared pools");
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("contractOperations")
    void strangersGetNothingOfAnotherPersonsObjects(IsolationContract.Operation operation) throws Exception {
        if (POLICY_EXCEPTIONS.containsKey(operation.toString())) {
            verifySharedPool(operation, fixture(operation));
        } else {
            verify(operation, fixture(operation));
        }
    }

    private void verifySharedPool(IsolationContract.Operation operation, IsolationFixture fixture) throws Exception {
        UUID orderId = fixture.ids().get("order_id");
        String path = operation.path().replace("{order_id}", orderId.toString());
        String payload = json.writeValueAsString(operation.body(fixture.values()));
        boolean reservation = RESERVE.equals(operation.toString());
        String table = reservation ? "preorder_reservation" : "assignment";
        var before = poolState(orderId, table);
        assertThat(before.get("holders")).as(operation + " starts unassigned").isEqualTo(List.of());
        var beforeStranger = sideEffects();
        var foreign = perform(request(operation, path, payload), fixture.stranger());
        assertThat(sideEffects()).as(operation + " stranger must not write outbox/audit/command receipts")
                .isEqualTo(beforeStranger);
        assertThat(foreign.getResponse().getStatus()).as(operation + " foreign-city eligibility").isEqualTo(409);
        assertThat(problemCode(foreign)).as(operation + " foreign-city eligibility code")
                .isEqualTo("DRIVER_NOT_ELIGIBLE");
        assertThat(poolState(orderId, table)).as(operation + " rejected eligibility changes nothing").isEqualTo(before);

        var owner = perform(request(operation, path, payload), fixture.owner());
        assertThat(owner.getResponse().getStatus()).as(operation + " eligible driver takes pool item").isEqualTo(200);
        Actor first = auth.verifyAccess(fixture.owner(), taxi.blizz.identity.ApiAudience.DRIVER).orElseThrow().actor();
        assertThat(jdbc.sql("select driver_id from " + table + " where order_id=:id")
                .param("id", orderId).query(UUID.class).list())
                .as(operation + " first driver owns it").containsExactly(first.id());
        var taken = poolState(orderId, table);
        DriverSession second = driverSession(PICKUP);
        var refused = perform(request(operation, path, payload), second.device().accessToken());
        assertThat(refused.getResponse().getStatus()).as(operation + " second eligible driver is refused")
                .isEqualTo(409);
        assertThat(problemCode(refused)).as(operation + " already taken code").isEqualTo("ORDER_ALREADY_ASSIGNED");
        assertThat(poolState(orderId, table)).as(operation + " first driver keeps it").isEqualTo(taken);
        System.out.println("ISOLATION REACHED " + operation
                + " POLICY exception foreign=409/DRIVER_NOT_ELIGIBLE owner=200 second=409/ORDER_ALREADY_ASSIGNED");
    }

    private Map<String, Object> poolState(UUID orderId, String table) {
        var order = jdbc.sql("select status, version from ride_order where id=:id")
                .param("id", orderId).query().singleRow();
        var holders = jdbc.sql("select id, driver_id, state from " + table + " where order_id=:id order by id")
                .param("id", orderId).query().listOfRows();
        return Map.of("order", order, "holders", holders);
    }

    private void verify(IsolationContract.Operation operation, IsolationFixture fixture) throws Exception {
        String path = operation.path();
        for (var entry : fixture.ids().entrySet()) {
            path = path.replace("{" + entry.getKey() + "}", entry.getValue().toString());
        }
        assertThat(path).as(operation + " every path parameter has a fixture").doesNotContain("{");
        String payload = json.writeValueAsString(operation.body(fixture.values()));
        var beforeStranger = sideEffects();
        var stranger = perform(request(operation, path, payload), fixture.stranger());
        assertThat(sideEffects()).as(operation + " stranger must not write outbox/audit/command receipts")
                .isEqualTo(beforeStranger);
        var owner = perform(request(operation, path, payload), fixture.owner());
        List<String> problems = new ArrayList<>();
        int foreignStatus = stranger.getResponse().getStatus();
        if (!operation.denials().contains(foreignStatus)) {
            problems.add(operation + ": stranger " + foreignStatus + " " + problemCode(stranger));
        }
        int ownerStatus = owner.getResponse().getStatus();
        if (fixture.ownerConflict() != null) {
            if (ownerStatus != 409 || !"STATE_CONFLICT".equals(problemCode(owner))) {
                problems.add(operation + ": owner " + ownerStatus + " " + problemCode(owner)
                        + "; expected documented 409 STATE_CONFLICT: " + fixture.ownerConflict());
            }
        } else if (ownerStatus < 200 || ownerStatus >= 300
                || !((Map<?, ?>) operation.definition().get("responses")).containsKey(String.valueOf(ownerStatus))) {
            problems.add(operation + ": owner " + ownerStatus + " " + problemCode(owner));
        }
        System.out.println("ISOLATION REACHED " + operation + " stranger=" + foreignStatus + " owner=" + ownerStatus);
        assertThat(problems).as(String.join(" | ", problems)).isEmpty();
    }

    private Map<String, Object> sideEffects() {
        // staff_activity deliberately records every staff request and is not a business side effect.
        return jdbc.sql("""
                select (select count(*) from outbox) as outbox,
                       (select count(*) from audit_log) as audit_log,
                       (select count(*) from command_receipt) as command_receipt
                """).query().singleRow();
    }

    @ParameterizedTest
    @org.junit.jupiter.params.provider.EnumSource(value = taxi.blizz.platform.ErrorCode.class,
            names = {"VALIDATION_FAILED", "STATE_CONFLICT", "PICKUP_TOO_FAR", "INTERNAL_ERROR"})
    void eachForbiddenStrangerStatusFailsTheActualHttpProbe(taxi.blizz.platform.ErrorCode code) throws Exception {
        var operation = IsolationContract.operation("rider.v1.yaml", "get", "/api/rider/v1/support/cases/{case_id}");
        var fixture = fixture(operation);
        Actor actor = auth.verifyAccess(fixture.stranger(), taxi.blizz.identity.ApiAudience.RIDER)
                .orElseThrow().actor();
        org.mockito.Mockito.doThrow(new taxi.blizz.platform.DomainException(code, "Deliberate status control"))
                .when(supportCases).mineOne(actor, fixture.ids().get("case_id"));
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> verify(operation, fixture))
                .isInstanceOf(AssertionError.class).hasMessageContaining(operation.toString())
                .hasMessageContaining("stranger " + code.httpStatus());
        System.out.println("ISOLATION STATUS CONTROL rejected stranger=" + code.httpStatus() + " " + operation);
    }

    @org.junit.jupiter.api.Test
    void anOwner500FailsTheActualHttpProbe() throws Exception {
        var operation = IsolationContract.operation("rider.v1.yaml", "get", "/api/rider/v1/support/cases/{case_id}");
        var fixture = fixture(operation);
        Actor actor = auth.verifyAccess(fixture.owner(), taxi.blizz.identity.ApiAudience.RIDER).orElseThrow().actor();
        org.mockito.Mockito.doThrow(new taxi.blizz.platform.DomainException(
                taxi.blizz.platform.ErrorCode.INTERNAL_ERROR, "Deliberate owner failure control"))
                .when(supportCases).mineOne(actor, fixture.ids().get("case_id"));
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> verify(operation, fixture))
                .isInstanceOf(AssertionError.class).hasMessageContaining(operation.toString())
                .hasMessageContaining("owner 500");
        System.out.println("ISOLATION STATUS CONTROL rejected owner=500 " + operation);
    }

    @org.junit.jupiter.api.Test
    void cityReadsAndValidWriteBodiesRejectOtherCityStaffAndMissingPermission() throws Exception {
        Actor owner = scopedStaff(city, "geo.manage");
        Actor otherCity = scopedStaff(foreignCity, "geo.manage");
        Actor noPermission = scopedStaff(city);
        var read = IsolationContract.operation("admin.v1.yaml", "get", "/api/admin/v1/cities/{city_id}/zones");
        var ids = Map.of("city_id", city);
        verify(read, staffFixture(ids, Map.of(), owner, otherCity));
        verify(read, staffFixture(ids, Map.of(), owner, noPermission));
        var create = IsolationContract.operation("admin.v1.yaml", "post", "/api/admin/v1/cities/{city_id}/zones");
        Map<String, Object> data = Map.of("type", "AIRPORT", "polygon", square(), "priority", 10,
                "reason", "Isolation scope probe");
        verify(create, staffFixture(ids, data, owner, otherCity));
        verify(create, staffFixture(ids, data, owner, noPermission));
        Map<String, Object> zone = postJson("/api/admin/v1/cities/" + city + "/zones", staffToken(owner),
                create.body(data));
        var publish = IsolationContract.operation("admin.v1.yaml", "post", "/api/admin/v1/zones/{zone_id}/publish");
        UUID zoneId = UUID.fromString(zone.get("id").toString());
        try {
            verify(publish, staffFixture(Map.of("zone_id", zoneId),
                    Map.of("expected_version", zone.get("version"), "reason", "Isolation publish probe"),
                    owner, otherCity));
        } finally {
            String state = jdbc.sql("select state from zone where id=:id")
                    .param("id", zoneId).query(String.class).single();
            if (state.equals("PUBLISHED")) {
                long version = jdbc.sql("select version from zone where id=:id")
                        .param("id", zoneId).query(Long.class).single();
                geography.archiveZone(new taxi.blizz.geo.GeoConfiguration.Change(UUID.randomUUID(), owner, zoneId,
                        version, "Isolation zone cleanup"));
            }
        }
    }

    @org.junit.jupiter.api.Test
    void cityOperationsHaveTheSameScopeGuardForReadAndValidPauseCommand() throws Exception {
        Actor owner = scopedStaff(city, "geo.manage"), otherCity = scopedStaff(foreignCity, "geo.manage");
        var read = IsolationContract.operation("admin.v1.yaml", "get", "/api/admin/v1/cities/{city_id}/operations");
        verify(read, staffFixture(Map.of("city_id", city), Map.of(), owner, otherCity));
        var before = perform(get("/api/admin/v1/cities/" + city + "/operations"), staffToken(owner));
        long version = json.readTree(before.getResponse().getContentAsString()).path("version").asLong();
        var pause = IsolationContract.operation("admin.v1.yaml", "post",
                "/api/admin/v1/cities/{city_id}/operations/pause");
        try {
            verify(pause, staffFixture(Map.of("city_id", city), Map.of("expected_version", version,
                    "reason", "Isolation pause probe"), owner, otherCity));
        } finally {
            var current = cityOperations.get(owner, city);
            if (current.ordersPaused()) {
                cityOperations.resume(owner, UUID.randomUUID(), city, current.version(), "Isolation pause cleanup");
            }
        }
    }

    @org.junit.jupiter.api.Test
    void supportCaseCityPermissionAndRevokedEmergencyGrantReachTheSameReader() throws Exception {
        var riderRead = IsolationContract.operation("rider.v1.yaml", "get", "/api/rider/v1/support/cases/{case_id}");
        var rider = fixture(riderRead);
        var read = IsolationContract.operation("admin.v1.yaml", "get", "/api/admin/v1/support/cases/{case_id}");
        Actor owner = scopedStaff(city, "support.manage");
        Actor otherCity = scopedStaff(foreignCity, "support.manage"), missing = scopedStaff(city);
        var ids = Map.of("case_id", rider.ids().get("case_id"));
        verify(read, staffFixture(ids, Map.of(), owner, otherCity));
        verify(read, staffFixture(ids, Map.of(), owner, missing));
        Actor boss = staff();
        jdbc.sql("update staff_user set role='SUPER_ADMIN' where id=:id").param("id", boss.id()).update();
        var grant = emergency.grant(boss, UUID.randomUUID(), missing.id(), java.util.Set.of("support.manage"), false,
                java.util.Set.of(city), java.time.Duration.ofMinutes(30), "Isolation emergency access control");
        String temporary = staffToken(missing);
        String path = read.path().replace("{case_id}", ids.get("case_id").toString());
        assertThat(perform(get(path), temporary).getResponse().getStatus())
                .as("active grant reaches reader").isEqualTo(200);
        emergency.revoke(boss, UUID.randomUUID(), grant.id(), "Isolation emergency access revoked");
        verify(read, new IsolationFixture(ids, Map.of(), staffToken(owner), temporary, null));
    }

    @org.junit.jupiter.api.Test
    void merchantIdRequiresPermissionEvenWithAValidSharedReauthenticationPassword() throws Exception {
        Actor owner = staff("integrations.manage"), stranger = staff();
        setPassword(owner);
        setPassword(stranger);
        UUID merchant = jdbc.sql("select merchant_id from payment_merchant_city where city_id=:city")
                .param("city", city).query(UUID.class).single();
        var change = IsolationContract.operation("admin.v1.yaml", "post",
                "/api/admin/v1/payment-merchants/{merchant_id}/change");
        verify(change, staffFixture(Map.of("merchant_id", merchant), Map.of("password", STAFF_PASSWORD,
                "domain", "scope.blizz.invalid", "reason", "Isolation merchant permission control"), owner, stranger));
    }

    private static final String STAFF_PASSWORD = "Isolation-Admin-Test-2026";

    private void setPassword(Actor actor) {
        String hash = new org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder(4).encode(STAFF_PASSWORD);
        jdbc.sql("update staff_user set password_hash=:hash where id=:id")
                .param("hash", hash)
                .param("id", actor.id()).update();
    }

    private Actor scopedStaff(UUID scope, String... permissions) {
        Actor actor = staff(permissions);
        jdbc.sql("update staff_user set all_cities=false,city_scope=:scope where id=:id")
                .param("scope", new UUID[]{scope}).param("id", actor.id()).update();
        return actor;
    }

    private String staffToken(Actor actor) {
        return auth.openStaff(new VerifiedSubject(actor, "ACTIVE", false), taxi.blizz.identity.ApiAudience.ADMIN,
                "isolation-staff").accessToken();
    }

    private IsolationFixture staffFixture(Map<String, UUID> ids, Map<String, Object> values,
                                          Actor owner, Actor stranger) {
        return new IsolationFixture(ids, values, staffToken(owner), staffToken(stranger), null);
    }

    private static Map<String, Object> square() {
        return Map.of("type", "Polygon", "coordinates", List.of(List.of(List.of(155.4, -39.6), List.of(155.6, -39.6),
                List.of(155.6, -39.4), List.of(155.4, -39.4), List.of(155.4, -39.6))));
    }

    private record IsolationFixture(Map<String, UUID> ids, Map<String, Object> values,
                                    String owner, String stranger, String ownerConflict) {
    }

    private record DriverSession(TestRides.Driver driver, IssuedSession device) {
    }

    private DriverSession driverSession(GeoPoint pickup) {
        TestRides.Driver driver = rides.driverNear(pickup);
        IssuedSession issued = auth.open(new VerifiedSubject(driver.actor(), "ACTIVE", false),
                "isolation-bound-device");
        sessions.handover(driver.actor(), UUID.randomUUID(), issued.sessionId(),
                sessions.availability(driver.actor().id()).sessionVersion());
        return new DriverSession(new TestRides.Driver(driver.actor(), issued.sessionId(), driver.vehicle()), issued);
    }

    private IsolationFixture fixture(IsolationContract.Operation operation) throws Exception {
        String path = operation.path();
        boolean driverApi = path.startsWith("/api/driver/");
        Actor rider = rides.client();
        String riderToken = token(rider);
        DriverSession ownerDriver;
        Map<String, UUID> ids = new LinkedHashMap<>();
        Map<String, Object> values = new LinkedHashMap<>();
        String conflict = null;
        if (path.contains("/work-sessions/")) {
            ownerDriver = driverSession(PICKUP);
            if (path.endsWith("/resume")) {
                sessions.pause(ownerDriver.driver().actor(), UUID.randomUUID(), ownerDriver.driver().device(),
                        sessions.availability(ownerDriver.driver().actor().id()).sessionVersion());
            }
            var shift = sessions.availability(ownerDriver.driver().actor().id());
            ids.put("id", shift.sessionId());
            values.put("expected_version", shift.sessionVersion());
        } else if (path.contains("/preorders/")) {
            Instant pickupAt = Instant.now().plus(3, ChronoUnit.HOURS);
            UUID quote = new TestQuotes(jdbc, quotes).quote(rider, city, "STANDARD", PICKUP, DROPOFF, pickupAt).id();
            OrderView order = orders.create(rider, UUID.randomUUID(), new CreateOrder(rider.id(), "STANDARD", PICKUP,
                    "Home", DROPOFF, "Airport", PaymentMethod.CASH, quote, null, null, null, pickupAt));
            ownerDriver = driverSession(PICKUP);
            ids.put("order_id", order.id());
            if (!path.endsWith("/reserve")) {
                var reservation = preorders.reserve(ownerDriver.driver().actor(), UUID.randomUUID(), order.id());
                ids.put("reservation_id", reservation.id());
                if (path.endsWith("/confirm")) {
                    jdbc.sql("update ride_order set pickup_at=now()+interval '25 minutes' where id=:id")
                            .param("id", order.id()).update();
                }
            }
            values.put("reason_code", "CANNOT_REACH");
        } else if (path.contains("/offers/") || path.endsWith("/claim")) {
            OrderView order;
            if (path.endsWith("/claim")) {
                order = rides.order(rider, city, PICKUP, DROPOFF);
                assertThat(order.searchPhase()).isEqualTo("BROADCAST");
                ownerDriver = driverSession(PICKUP);
            } else {
                ownerDriver = driverSession(PICKUP);
                order = rides.order(rider, city, PICKUP, DROPOFF);
                ids.put("offer_id", dispatch.offers(ownerDriver.driver().actor()).getFirst().id());
            }
            ids.put("order_id", order.id());
        } else {
            ownerDriver = driverSession(PICKUP);
            boolean tripCommand = driverApi && path.contains("/trips/") && operation.method().equals("post")
                    && !path.endsWith("/messages");
            TestRides.Ride ride;
            if (tripCommand && !path.endsWith("/complete")) {
                ride = rides.assigned(city, ownerDriver.driver(), PICKUP, DROPOFF);
                rides.moveTo(ownerDriver.driver(), TestRides.north(PICKUP, 30));
                if (path.endsWith("/start") || path.endsWith("/no-show")) {
                    trips.arrive(ownerDriver.driver().actor(), UUID.randomUUID(), ride.trip().id(),
                            ride.trip().version(), null);
                    if (path.endsWith("/no-show")) {
                        jdbc.sql("update trip set arrived_at=arrived_at-interval '6 minutes' where id=:id")
                                .param("id", ride.trip().id()).update();
                    }
                }
            } else {
                ride = rides.started(city, ownerDriver.driver(), PICKUP, DROPOFF);
                if (!tripCommand) {
                    rides.complete(ride, true);
                }
            }
            rider = ride.payer();
            riderToken = token(rider);
            ids.put("order_id", ride.order().id());
            ids.put("trip_id", ride.trip().id());
            values.put("expected_version", jdbc.sql("select version from trip where id=:id")
                    .param("id", ride.trip().id()).query(Long.class).single());
            values.put("reason_code", "CANNOT_REACH");
            values.put("cash_received", true);
            if (path.endsWith("/cancel") && !driverApi || path.endsWith("/switch-to-cash")) {
                OrderView pending = rides.order(rider, city, PICKUP, DROPOFF);
                ids.put("order_id", pending.id());
                values.put("expected_version", pending.version());
                values.put("reason_code", "CHANGED_MIND");
                if (path.endsWith("/switch-to-cash")) {
                    conflict = "The fixture is a CASH order; only CARD can switch to cash";
                }
            }
            if (path.endsWith("/call")) {
                conflict = "The fixture's fulfilled trip is no longer callable";
            }
        }
        Actor owner = driverApi ? ownerDriver.driver().actor() : rider;
        String ownerToken = driverApi ? ownerDriver.device().accessToken() : riderToken;
        String strangerToken = driverApi ? strangerDriver : strangerRider;
        if (path.contains("/uploads/")) {
            ids.put("file_id", files.openUpload(owner, UUID.randomUUID(),
                    driverApi ? FilePurpose.DRIVER_DOCUMENT : FilePurpose.SUPPORT_ATTACHMENT,
                    "image/png", PNG.length).fileId());
        } else if (path.contains("/files/")) {
            ids.put("file_id", safeFile(owner, FilePurpose.DRIVER_DOCUMENT));
        }
        if (path.contains("/support/")) {
            UUID attachment = safeFile(owner, FilePurpose.SUPPORT_ATTACHMENT);
            var creation = new LinkedHashMap<String, Object>();
            creation.put("command_id", UUID.randomUUID());
            creation.put("category", driverApi ? "APP_PROBLEM" : "LOST_ITEM");
            creation.put("subject", "Isolation fixture");
            creation.put("message", "Isolation attachment");
            creation.put("attachment_ids", List.of(attachment));
            if (!driverApi) {
                creation.put("order_id", ids.get("order_id"));
            }
            String root = driverApi ? "/api/driver/v1" : "/api/rider/v1";
            ids.put("case_id", id(postJson(root + "/support/cases", ownerToken, creation), "id"));
            ids.put("file_id", attachment);
        }
        if (path.contains("/push-devices/")) {
            String root = driverApi ? "/api/driver/v1" : "/api/rider/v1";
            ids.put("device_id", id(postJson(root + "/push-devices", ownerToken,
                    Map.of("command_id", UUID.randomUUID(), "platform", "ANDROID",
                            "token", "isolation-" + UUID.randomUUID())), "id"));
        }
        if (path.contains("/card-bindings/")) {
            ids.put("binding_id", id(postJson("/api/rider/v1/card-bindings", ownerToken,
                    Map.of("command_id", UUID.randomUUID(), "city_id", city)), "id"));
        }
        if (path.contains("/cards/")) {
            UUID card = UUID.randomUUID();
            jdbc.sql("""
                insert into payment_card(id,client_id,merchant_id,token,masked_pan,card_type,state,created_at)
                select :id,:client,merchant_id,:token,'41****1111','Visa','ACTIVE',now()
                from payment_merchant_city where city_id=:city
                """).param("id", card).param("client", owner.id())
                    .param("token", "isolation-" + card).param("city", city).update();
            ids.put("card_id", card);
        }
        if (path.contains("card-top-ups/")) {
            ids.put("top_up_id", topUps.start(owner, UUID.randomUUID(), city, 10_000).id());
        }
        if (path.contains("/data-exports/")) {
            UUID export = UUID.randomUUID();
            jdbc.sql("""
                insert into personal_data_export(id,client_id,state,content,size_bytes,created_at,ready_at,expires_at)
                values(:id,:client,'READY','{}'::bytea,2,now(),now(),now()+interval '7 days')
                """).param("id", export).param("client", owner.id()).update();
            ids.put("export_id", export);
        }
        if (path.endsWith("/rating") && operation.method().equals("get")) {
            postJson(path.replace("{order_id}", ids.get("order_id").toString()), ownerToken,
                    Map.of("command_id", UUID.randomUUID(), "score", 5));
        }
        return new IsolationFixture(ids, values, ownerToken, strangerToken, conflict);
    }

    private MockHttpServletRequestBuilder request(IsolationContract.Operation operation, String path, String payload) {
        return switch (operation.method()) {
            case "get" -> get(path);
            case "put" -> {
                assertThat(operation.binary()).as(operation + " explicit binary request").isTrue();
                yield put(path).contentType(MediaType.IMAGE_PNG).content(PNG);
            }
            case "post" -> post(path).contentType(MediaType.APPLICATION_JSON).content(payload);
            default -> throw new AssertionError("Unsupported request method: " + operation);
        };
    }

    private String problemCode(MvcResult result) throws Exception {
        if (result.getResponse().getStatus() >= 200 && result.getResponse().getStatus() < 300) {
            return "success";
        }
        return json.readTree(result.getResponse().getContentAsString()).path("code").asText("MISSING_CODE");
    }

    private Actor staff(String... permissions) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
            insert into staff_user(id,login,name,role,permissions,all_cities,state,created_at,updated_at)
            values(:id,:login,'Isolation admin','ADMIN',:permissions,true,'ACTIVE',now(),now())
            """).param("id", id).param("login", "isolation-" + id).param("permissions", permissions).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private UUID safeFile(Actor owner, FilePurpose purpose) {
        UUID fileId = files.openUpload(owner, UUID.randomUUID(), purpose, "image/png", PNG.length).fileId();
        files.upload(owner, fileId, "image/png", PNG.length, new ByteArrayInputStream(PNG));
        return fileId;
    }

    private void merchant(UUID city) {
        if (jdbc.sql("select count(*) from payment_merchant_city where city_id = :city").param("city", city)
                .query(Long.class).single() > 0) {
            return;
        }
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into payment_merchant (id, provider, account, domain, secret_ref, currency, created_at)
                        values (:id, 'FAKE', :account, 'test.blizz.invalid', 'test', 'UAH', now())""")
                .param("id", id).param("account", "isolation_" + id).update();
        jdbc.sql("insert into payment_merchant_city (city_id, merchant_id) values (:city, :merchant)")
                .param("city", city).param("merchant", id).update();
    }

    @SuppressWarnings("unchecked")
    private Map<String, Object> postJson(String path, String token, Map<String, Object> body) throws Exception {
        MvcResult result = perform(post(path).contentType(MediaType.APPLICATION_JSON)
                .content(json.writeValueAsString(body)), token);
        assertThat(result.getResponse().getStatus()).as(path + " " + result.getResponse().getContentAsString())
                .isBetween(200, 201);
        return json.readValue(result.getResponse().getContentAsString(), Map.class);
    }

    private static UUID id(Map<String, Object> body, String field) {
        return UUID.fromString(String.valueOf(body.get(field)));
    }

    private MvcResult perform(MockHttpServletRequestBuilder request, String token) throws Exception {
        return mvc.perform(request.header(HttpHeaders.AUTHORIZATION, "Bearer " + token)).andReturn();
    }

    private String token(Actor actor) {
        return auth.open(new VerifiedSubject(actor, "ACTIVE", false), "isolation-test").accessToken();
    }

    private static String abbreviate(String text) {
        String flat = text.replace('\n', ' ');
        return flat.length() > 160 ? flat.substring(0, 160) + "…" : flat;
    }
}
