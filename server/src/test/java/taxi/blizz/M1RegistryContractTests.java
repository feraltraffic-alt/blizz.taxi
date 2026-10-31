package taxi.blizz;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.request;

import jakarta.servlet.Filter;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.core.annotation.AnnotationAwareOrderComparator;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.yaml.snakeyaml.Yaml;
import taxi.blizz.identity.ApiAudience;
import taxi.blizz.identity.SessionService;
import taxi.blizz.identity.VerifiedSubject;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.SubjectType;
import tools.jackson.databind.json.JsonMapper;

/**
 * AC-21 (issue #146 part 4): the M1 operation registry of the specification (22.2) against the contracts and the
 * running server.
 * <ul>
 * <li>{@code packages/contracts/m1-registry.yaml} names every row of the spec's table, in order. Each row's operations
 * exist in the contracts; what is not built yet is listed with an owner question or an issue.</li>
 * <li>Scope: every operation of the rider, driver, operator and admin contracts refuses a request without a token and
 * one with another audience's token with 401 {@code UNAUTHENTICATED} in the Problem shape. A 404, 405 or 415 would
 * be a contract operation the server does not serve.</li>
 * <li>Idempotency: every registry command carries a {@code command_id}; {@code POST /orders} repeated after a lost
 * answer returns the original order, and the same key with another body is refused.</li>
 * </ul>
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class M1RegistryContractTests {

    private static final Path SPEC = Path.of("..", "docs", "spec", "Taxi_Platform_Detailed_Specification_v0.2.md");
    private static final Path REGISTRY = Path.of("..", "packages", "contracts", "m1-registry.yaml");
    private static final Pattern REF = Pattern.compile("Q-\\d{2}|#\\d+");
    private static final List<String> AUDIENCES = List.of("rider", "driver", "operator", "admin");

    /**
     * Registry commands without a {@code command_id}, and why: each is idempotent by its own key or is a sign-in step.
     * An entry that no longer matches a registry command fails the test, so the list cannot go stale.
     */
    private static final Map<String, String> WITHOUT_COMMAND_ID = Map.of();

    @Autowired WebApplicationContext context;
    @Autowired SessionService sessions;
    @Autowired JdbcClient jdbc;
    @Autowired JsonMapper json;

    MockMvc mvc;
    final Map<String, String> tokens = new LinkedHashMap<>();

    @BeforeAll
    void setUp() {
        List<Filter> filters = new ArrayList<>(context.getBeansOfType(Filter.class).values());
        AnnotationAwareOrderComparator.sort(filters);
        mvc = MockMvcBuilders.webAppContextSetup(context).addFilters(filters.toArray(Filter[]::new)).build();
        UUID client = UUID.randomUUID();
        jdbc.sql("""
                        insert into client (id, phone_normalized, account_state, has_app, created_at, updated_at)
                        values (:id, :phone, 'ACTIVE', true, now(), now())""")
                .param("id", client).param("phone", TestPhones.unique("+48", 9)).update();
        tokens.put("rider", sessions.open(new VerifiedSubject(new Actor(SubjectType.CLIENT, client), "ACTIVE", false),
                "m1-registry").accessToken());
        UUID driver = UUID.randomUUID();
        jdbc.sql("""
                        insert into driver (id, phone_normalized, account_state, review_status, created_at, updated_at)
                        values (:id, :phone, 'ACTIVE', 'APPROVED', now(), now())""")
                .param("id", driver).param("phone", TestPhones.unique("+38093", 7)).update();
        tokens.put("driver", sessions.open(new VerifiedSubject(new Actor(SubjectType.DRIVER, driver), "ACTIVE", false),
                "m1-registry").accessToken());
        for (String audience : List.of("operator", "admin")) {
            UUID staff = UUID.randomUUID();
            jdbc.sql("""
                            insert into staff_user (id, login, name, role, permissions, all_cities, state, created_at,
                                                    updated_at)
                            values (:id, :login, 'Registry', 'ADMIN', '{}', true, 'ACTIVE', now(), now())""")
                    .param("id", staff).param("login", "m1-registry-" + staff).update();
            tokens.put(audience, sessions.openStaff(new VerifiedSubject(new Actor(SubjectType.STAFF, staff), "ACTIVE",
                    false), ApiAudience.fromValue(audience), "m1-registry").accessToken());
        }
    }

    // ------------------------------------------------------------------ the registry against the spec and contracts

    record Row(String row, List<Map<String, Object>> operations, List<Map<String, Object>> missing) {
    }

    @SuppressWarnings("unchecked")
    static List<Row> registry() throws Exception {
        try (Reader reader = Files.newBufferedReader(REGISTRY)) {
            Map<String, Object> document = new Yaml().load(reader);
            return ((List<Map<String, Object>>) document.get("rows")).stream()
                    .map(r -> new Row((String) r.get("row"),
                            (List<Map<String, Object>>) r.getOrDefault("operations", List.of()),
                            (List<Map<String, Object>>) r.getOrDefault("missing", List.of())))
                    .toList();
        }
    }

    /** The first two cells of every row of the spec's table 22.2, joined by " | ". */
    static List<String> specRows() throws Exception {
        List<String> rows = new ArrayList<>();
        boolean inside = false;
        for (String line : Files.readAllLines(SPEC)) {
            if (line.startsWith("### 22.2 ")) {
                inside = true;
                continue;
            }
            if (inside && line.startsWith("#")) {
                break;
            }
            if (inside && line.startsWith("| ") && !line.startsWith("| ---") && !line.startsWith("| Аудитория")) {
                String[] cells = line.split("\\|");
                rows.add(cells[1].strip() + " | " + cells[2].strip());
            }
        }
        return rows;
    }

    @Test
    void theRegistryNamesEverySpecRowAndEachOperationIsInTheContracts() throws Exception {
        List<String> spec = specRows();
        assertThat(spec).as("rows of the spec's table 22.2").hasSizeGreaterThan(40);
        List<Row> registry = registry();
        assertThat(registry.stream().map(Row::row).toList()).as("registry rows, in the spec's order")
                .containsExactlyElementsOf(spec);
        for (Row row : registry) {
            assertThat(row.operations().size() + row.missing().size()).as(row.row() + ": operations or missing")
                    .isPositive();
            for (Map<String, Object> op : row.operations()) {
                assertThat(IsolationContract.exists((String) op.get("contract"), (String) op.get("method"),
                        (String) op.get("path"))).as(row.row() + ": " + op + " is in the contract").isTrue();
            }
            for (Map<String, Object> gap : row.missing()) {
                assertThat((String) gap.get("what")).as(row.row() + ": what is missing").isNotBlank();
                assertThat((String) gap.get("reason")).as(row.row() + ": why").isNotBlank();
                assertThat((String) gap.get("ref")).as(row.row() + ": an owner question or an issue").matches(REF);
            }
        }
    }

    // ------------------------------------------------------------------ scope

    static Stream<IsolationContract.Operation> apiOperations() {
        List<IsolationContract.Operation> all = new ArrayList<>();
        for (String audience : AUDIENCES) {
            IsolationContract.allOperations(audience + ".v1.yaml").stream()
                    .filter(op -> op.path().startsWith("/api/" + audience + "/v1/"))
                    .forEach(all::add);
        }
        return all.stream();
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("apiOperations")
    void withoutATokenOrWithAnotherAudiencesTokenTheAnswerIs401(IsolationContract.Operation operation)
            throws Exception {
        String audience = operation.path().split("/")[2];
        String other = switch (audience) {
            case "rider" -> "driver";
            case "driver" -> "rider";
            case "operator" -> "admin";
            default -> "operator";
        };
        for (String token : new String[] {null, tokens.get(other)}) {
            MvcResult result = mvc.perform(call(operation, token)).andReturn();
            String label = operation + (token == null ? " without a token" : " with a " + other + " token");
            assertThat(result.getResponse().getStatus()).as(label + ": " + result.getResponse().getContentAsString())
                    .isEqualTo(401);
            @SuppressWarnings("unchecked")
            Map<String, Object> problem = json.readValue(result.getResponse().getContentAsString(), Map.class);
            assertThat(problem).as(label).containsEntry("code", "UNAUTHENTICATED").containsEntry("status", 401)
                    .containsKeys("type", "title", "correlation_id");
        }
    }

    private static MockHttpServletRequestBuilder call(IsolationContract.Operation operation, String token) {
        String path = operation.path().replaceAll("\\{[^}]+}", UUID.randomUUID().toString());
        MockHttpServletRequestBuilder builder = request(HttpMethod.valueOf(operation.method().toUpperCase()), path);
        if (!List.of("get", "delete").contains(operation.method())) {
            String media = mediaOf(operation);
            builder.contentType(media).content(media.equals(MediaType.APPLICATION_JSON_VALUE) ? "{}" : "");
        }
        if (token != null) {
            builder.header(HttpHeaders.AUTHORIZATION, "Bearer " + token);
        }
        return builder;
    }

    @SuppressWarnings("unchecked")
    private static String mediaOf(IsolationContract.Operation operation) {
        Object body = operation.definition().get("requestBody");
        if (body instanceof Map<?, ?> map && map.get("content") instanceof Map<?, ?> content && !content.isEmpty()) {
            return (String) ((Map<String, Object>) content).keySet().iterator().next();
        }
        return MediaType.APPLICATION_JSON_VALUE;
    }

    // ------------------------------------------------------------------ idempotency

    @Test
    void everyRegistryCommandCarriesACommandId() throws Exception {
        List<String> without = new ArrayList<>();
        List<String> commands = new ArrayList<>();
        for (Row row : registry()) {
            for (Map<String, Object> op : row.operations()) {
                String contract = (String) op.get("contract");
                String method = (String) op.get("method");
                String path = (String) op.get("path");
                if (List.of("get").contains(method) || !path.startsWith("/api/")) {
                    continue; // reads; sign-in and provider webhooks have their own keys (challenge, inbox)
                }
                String key = method.toUpperCase() + " " + path;
                commands.add(key);
                var operation = IsolationContract.operation(contract, method, path);
                if (!IsolationContract.requiredBody(operation).contains("command_id")
                        && !WITHOUT_COMMAND_ID.containsKey(key)) {
                    without.add(key);
                }
            }
        }
        assertThat(commands).as("registry commands").isNotEmpty();
        assertThat(without).as("registry commands whose request does not require command_id").isEmpty();
        assertThat(commands).as("exceptions that still name a registry command")
                .containsAll(WITHOUT_COMMAND_ID.keySet());
    }

    @Test
    void anOrderRepeatedAfterALostAnswerIsTheSameOrderAndTheSameKeyWithAnotherBodyIsRefused() throws Exception {
        TestRides rides = new TestRides(jdbc, null, null, null, null, sessions, null);
        UUID city = rides.city("test-m1-registry", "UAH", -142);
        new TestQuotes(jdbc, null).ensureClass(city, "STANDARD");
        String rider = tokens.get("rider");
        Map<String, Object> pickup = Map.of("lat", -39.5, "lon", -141.5);
        Map<String, Object> dropoff = Map.of("lat", -39.45, "lon", -141.45);
        MvcResult quote = mvc.perform(withJson(request(HttpMethod.POST, "/api/rider/v1/quotes"), rider,
                Map.of("command_id", UUID.randomUUID(), "vehicle_class", "STANDARD", "pickup", pickup,
                        "dropoff", dropoff))).andReturn();
        assertThat(quote.getResponse().getStatus()).as(quote.getResponse().getContentAsString()).isEqualTo(201);
        UUID command = UUID.randomUUID();
        Map<String, Object> body = new LinkedHashMap<>(Map.of("command_id", command, "quote_id",
                json.readValue(quote.getResponse().getContentAsString(), Map.class).get("id"),
                "vehicle_class", "STANDARD", "pickup", pickup, "pickup_label", "Registry pickup", "dropoff", dropoff,
                "dropoff_label", "Registry drop-off", "payment_method", "CASH"));

        MvcResult first = mvc.perform(withJson(request(HttpMethod.POST, "/api/rider/v1/orders"), rider, body))
                .andReturn();
        assertThat(first.getResponse().getStatus()).as(first.getResponse().getContentAsString()).isEqualTo(201);
        Object order = json.readValue(first.getResponse().getContentAsString(), Map.class).get("id");

        // The answer was lost (a timeout): the app sends the same request again.
        MvcResult again = mvc.perform(withJson(request(HttpMethod.POST, "/api/rider/v1/orders"), rider, body))
                .andReturn();
        assertThat(again.getResponse().getStatus()).as(again.getResponse().getContentAsString()).isEqualTo(201);
        assertThat(json.readValue(again.getResponse().getContentAsString(), Map.class).get("id"))
                .as("the original order_id").isEqualTo(order);
        assertThat(jdbc.sql("select count(*) from ride_order where city_id = :city and quote_id = :quote")
                .param("city", city).param("quote", UUID.fromString((String) body.get("quote_id")))
                .query(Long.class).single()).as("one order for the quote").isOne();

        body.put("dropoff_label", "Somewhere else");
        MvcResult changed = mvc.perform(withJson(request(HttpMethod.POST, "/api/rider/v1/orders"), rider, body))
                .andReturn();
        assertThat(changed.getResponse().getStatus()).as(changed.getResponse().getContentAsString()).isEqualTo(409);
        assertThat(json.readValue(changed.getResponse().getContentAsString(), Map.class))
                .containsEntry("code", "IDEMPOTENCY_CONFLICT");
    }

    private MockHttpServletRequestBuilder withJson(MockHttpServletRequestBuilder builder, String token,
                                               Map<String, Object> body) {
        return builder.header(HttpHeaders.AUTHORIZATION, "Bearer " + token).contentType(MediaType.APPLICATION_JSON)
                .content(json.writeValueAsString(body));
    }
}
