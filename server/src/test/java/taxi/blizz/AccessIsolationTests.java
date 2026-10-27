package taxi.blizz;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;

import jakarta.servlet.Filter;
import java.io.ByteArrayInputStream;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;
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
import org.yaml.snakeyaml.Yaml;
import taxi.blizz.files.FilePurpose;
import taxi.blizz.files.FileService;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.SessionService;
import taxi.blizz.identity.VerifiedSubject;
import taxi.blizz.operations.Dispatch;
import taxi.blizz.operations.OrderView;
import taxi.blizz.operations.Orders;
import taxi.blizz.operations.Trips;
import taxi.blizz.operations.WorkSessions;
import taxi.blizz.payments.CardTopUps;
import taxi.blizz.platform.Actor;
import taxi.blizz.pricing.QuoteService;
import tools.jackson.databind.json.JsonMapper;

/**
 * T-37: another person's order, trip, file, case, card, device, top-up or work session is never shown or changed.
 * Every path of rider.v1.yaml and driver.v1.yaml with an id in it is called with a stranger's token and the owner's
 * ids: a read answers 403 or 404, a command is refused before it looks at the object (400, 403 or 404 — never
 * 2xx, never a 409 or 422 that would confirm the object exists). A new path with an id the test has no object for
 * fails the test, so it grows with the API.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class AccessIsolationTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, 155.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 155.55);
    static final byte[] PNG = {(byte) 0x89, 'P', 'N', 'G', '\r', '\n', 0x1A, '\n', 0, 0, 0, 13, 'I', 'H', 'D', 'R'};
    static final Pattern PARAM = Pattern.compile("\\{([a-z_]+)}");

    @Autowired Orders orders;
    @Autowired Dispatch dispatch;
    @Autowired Trips trips;
    @Autowired WorkSessions sessions;
    @Autowired SessionService auth;
    @Autowired QuoteService quotes;
    @Autowired FileService files;
    @Autowired CardTopUps topUps;
    @Autowired JdbcClient jdbc;
    @Autowired JsonMapper json;
    @Autowired WebApplicationContext context;

    MockMvc mvc;

    record Call(String method, String path) {
    }

    @Test
    void strangersGetNothingOfAnotherPersonsObjects() throws Exception {
        List<Filter> filters = new ArrayList<>(context.getBeansOfType(Filter.class).values());
        AnnotationAwareOrderComparator.sort(filters);
        mvc = MockMvcBuilders.webAppContextSetup(context).addFilters(filters.toArray(Filter[]::new)).build();
        TestRides rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        UUID city = rides.city("test-isolation", "UAH", 155);
        merchant(city);

        // ---------------------------------------------------------------- the owners' objects
        TestRides.Driver driver = rides.driverNear(PICKUP);
        TestRides.Ride ride = rides.started(city, driver, PICKUP, DROPOFF);
        rides.complete(ride, true);
        Actor rider = ride.payer();
        String riderToken = token(rider);
        String driverToken = token(driver.actor());

        // A pending order with an offer to the driver, a reservation of it, and the driver's work session.
        Actor other = rides.client();
        OrderView waiting = rides.order(other, city, PICKUP, DROPOFF);
        UUID offer = dispatch.offers(driver.actor()).getFirst().id();
        UUID reservation = UUID.randomUUID();
        jdbc.sql("""
                        insert into preorder_reservation (id, order_id, driver_id, state, reserved_at)
                        values (:id, :order, :driver, 'RESERVED', now())""")
                .param("id", reservation).param("order", waiting.id()).param("driver", driver.actor().id()).update();
        UUID workSession = sessions.availability(driver.actor().id()).sessionId();

        UUID riderFile = safeFile(rider, FilePurpose.SUPPORT_ATTACHMENT);
        UUID riderCase = id(postJson("/api/rider/v1/support/cases", riderToken, Map.of("command_id", UUID.randomUUID(),
                "category", "LOST_ITEM", "order_id", ride.order().id(), "subject", "Umbrella",
                "message", "Left it in the car", "attachment_ids", List.of(riderFile))), "id");
        UUID driverSupportFile = safeFile(driver.actor(), FilePurpose.SUPPORT_ATTACHMENT);
        UUID driverCase = id(postJson("/api/driver/v1/support/cases", driverToken, Map.of("command_id",
                UUID.randomUUID(), "category", "APP_PROBLEM", "subject", "Map", "message", "The map froze",
                "attachment_ids", List.of(driverSupportFile))), "id");
        UUID driverDocument = safeFile(driver.actor(), FilePurpose.DRIVER_DOCUMENT);
        UUID riderDevice = id(postJson("/api/rider/v1/push-devices", riderToken, Map.of("command_id",
                UUID.randomUUID(), "platform", "ANDROID", "token", "rider-token-" + UUID.randomUUID())), "id");
        UUID driverDevice = id(postJson("/api/driver/v1/push-devices", driverToken, Map.of("command_id",
                UUID.randomUUID(), "platform", "ANDROID", "token", "driver-token-" + UUID.randomUUID())), "id");
        UUID binding = id(postJson("/api/rider/v1/card-bindings", riderToken,
                Map.of("command_id", UUID.randomUUID(), "city_id", city)), "id");
        UUID card = UUID.randomUUID();
        jdbc.sql("""
                        insert into payment_card (id, client_id, merchant_id, token, masked_pan, card_type, state,
                                                  created_at)
                        select :id, :client, merchant_id, 'tok-isolation', '41****1111', 'Visa', 'ACTIVE', now()
                        from payment_merchant_city where city_id = :city""")
                .param("id", card).param("client", rider.id()).param("city", city).update();
        UUID riderTopUp = topUps.start(rider, UUID.randomUUID(), city, 10_000).id();
        UUID driverTopUp = topUps.start(driver.actor(), UUID.randomUUID(), city, 10_000).id();

        Map<String, UUID> riderIds = Map.of("order_id", ride.order().id(), "binding_id", binding, "card_id", card,
                "device_id", riderDevice, "case_id", riderCase, "file_id", riderFile, "top_up_id", riderTopUp);
        Map<String, UUID> driverIds = new LinkedHashMap<>();
        driverIds.put("trip_id", ride.trip().id());
        driverIds.put("offer_id", offer);
        driverIds.put("reservation_id", reservation);
        driverIds.put("id", workSession);
        driverIds.put("case_id", driverCase);
        driverIds.put("device_id", driverDevice);
        driverIds.put("top_up_id", driverTopUp);
        driverIds.put("order_id", ride.order().id());
        driverIds.put("file_id", driverDocument);

        // ---------------------------------------------------------------- the strangers
        String strangerRider = token(rides.client());
        String strangerDriver = token(rides.driverNear(new GeoPoint(-39.9, 155.9)).actor());

        List<String> problems = new ArrayList<>();
        int checked = 0;
        for (Call call : calls("rider.v1.yaml")) {
            checked += check(call, riderIds, riderToken, strangerRider, problems);
        }
        for (Call call : calls("driver.v1.yaml")) {
            Map<String, UUID> ids = new LinkedHashMap<>(driverIds);
            if (call.path().contains("/support/")) {
                ids.put("file_id", driverSupportFile);
            }
            if (call.path().contains("/preorders/") || call.path().endsWith("/claim")) {
                ids.put("order_id", waiting.id());
            }
            checked += check(call, ids, driverToken, strangerDriver, problems);
        }
        // On one line: CI shows the first line of a failure only.
        assertThat(problems).as("calls with another person's ids: " + String.join(" | ", problems)
                .replace('\n', ' ')).isEmpty();
        assertThat(checked).as("paths checked").isGreaterThan(40);
    }

    /** One path: the owner reaches the object (the fixture is real), the stranger does not. Returns 1. */
    private int check(Call call, Map<String, UUID> ids, String ownerToken, String strangerToken, List<String> problems)
            throws Exception {
        Matcher m = PARAM.matcher(call.path());
        StringBuilder path = new StringBuilder();
        while (m.find()) {
            UUID id = ids.get(m.group(1));
            if (id == null) {
                problems.add(call + ": no object for {" + m.group(1) + "} — add one to the test");
                return 1;
            }
            m.appendReplacement(path, id.toString());
        }
        m.appendTail(path);
        String url = path.toString();
        if (call.method().equals("get")) {
            int owner = perform(request(call.method(), url), ownerToken).getResponse().getStatus();
            if (owner == 403 || owner == 404) {
                problems.add(call + ": the owner gets " + owner + " — the fixture is wrong");
            }
        }
        MvcResult result = perform(request(call.method(), url), strangerToken);
        int status = result.getResponse().getStatus();
        Set<Integer> allowed = call.method().equals("get") ? Set.of(403, 404) : Set.of(400, 403, 404);
        if (!allowed.contains(status)) {
            problems.add(call + ": a stranger gets " + status + " " + abbreviate(result.getResponse()
                    .getContentAsString()));
        }
        return 1;
    }

    private MockHttpServletRequestBuilder request(String method, String url) throws Exception {
        return switch (method) {
            case "get" -> get(url);
            case "put" -> put(url).contentType(MediaType.IMAGE_PNG).content(PNG);
            default -> post(url).contentType(MediaType.APPLICATION_JSON).content(json.writeValueAsString(body()));
        };
    }

    /** One body for every command: whatever the command needs is there, so validation does not stop it first. */
    private static Map<String, Object> body() {
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("command_id", UUID.randomUUID());
        body.put("expected_version", 0);
        body.put("reason_code", "CHANGED_MIND");
        body.put("score", 5);
        body.put("amount_minor", 100);
        body.put("body", "Hello");
        body.put("cash_received", true);
        body.put("reported_at", OffsetDateTime.now(ZoneOffset.UTC).toString());
        body.put("location", Map.of("lat", -39.5, "lon", 155.5, "accuracy_m", 5,
                "recorded_at", OffsetDateTime.now(ZoneOffset.UTC).toString(), "sequence", System.nanoTime()));
        return body;
    }

    @SuppressWarnings("unchecked")
    private static List<Call> calls(String contract) throws Exception {
        Map<String, Object> document;
        try (Reader reader = Files.newBufferedReader(Path.of("..", "packages", "contracts", "openapi", contract))) {
            document = new Yaml().load(reader);
        }
        List<Call> calls = new ArrayList<>();
        ((Map<String, Map<String, Object>>) document.get("paths")).forEach((path, item) -> {
            if (path.contains("{")) {
                for (String method : List.of("get", "post", "put", "delete")) {
                    if (item.containsKey(method)) {
                        calls.add(new Call(method, path));
                    }
                }
            }
        });
        return calls;
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
