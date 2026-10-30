package taxi.blizz.operations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import jakarta.servlet.Filter;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.junit.jupiter.api.BeforeEach;
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
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.IssuedSession;
import taxi.blizz.identity.SessionService;
import taxi.blizz.identity.VerifiedSubject;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.pricing.QuoteService;
import tools.jackson.databind.json.JsonMapper;

/**
 * Bots on the ALL tab (issue #102, threat model B1–B3) over HTTP, as a phone calls it: a claim from outside the
 * broadcast radius is refused (E3), claims and polling have per-driver budgets (E4), accept and claim work only from
 * the device that holds the open shift (E5), and two drivers claiming one order get one assignment, never a 500 (E6).
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class BroadcastAbuseTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, 64.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 64.55);

    @Autowired WebApplicationContext context;
    @Autowired SessionService auth;
    @Autowired WorkSessions sessions;
    @Autowired Orders orders;
    @Autowired Dispatch dispatch;
    @Autowired Trips trips;
    @Autowired QuoteService quotes;
    @Autowired JsonMapper json;
    @Autowired JdbcClient jdbc;

    MockMvc mvc;
    TestRides rides;
    UUID city;

    @BeforeEach
    void setUp() {
        List<Filter> filters = new ArrayList<>(context.getBeansOfType(Filter.class).values());
        AnnotationAwareOrderComparator.sort(filters);
        mvc = MockMvcBuilders.webAppContextSetup(context).addFilters(filters.toArray(Filter[]::new)).build();
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        city = rides.city("test-broadcast-abuse", "UAH", 64);
    }

    // ------------------------------------------------------------ fixtures

    /** A driver signed in on two devices; nothing is open yet. */
    record Driver(Actor actor, UUID vehicle, IssuedSession phone, IssuedSession tablet) {
    }

    private Driver driver() {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into driver (id, phone_normalized, account_state, review_status, created_at, updated_at)
                        values (:id, :phone, 'ACTIVE', 'APPROVED', now(), now())""")
                .param("id", id)
                .param("phone", "+38073" + String.format("%07d", Math.floorMod(id.hashCode(), 10_000_000)))
                .update();
        UUID vehicle = UUID.randomUUID();
        jdbc.sql("""
                        insert into vehicle (id, driver_id, registration_number, make, model, color, production_year,
                                             state, class_approvals, created_at, updated_at)
                        values (:id, :driver, 'AA6400AA', 'Kia', 'Rio', 'white', 2021, 'APPROVED', '{STANDARD}',
                                now(), now())""")
                .param("id", vehicle).param("driver", id).update();
        Actor actor = new Actor(SubjectType.DRIVER, id);
        VerifiedSubject subject = new VerifiedSubject(actor, "ACTIVE", false);
        return new Driver(actor, vehicle, auth.open(subject, "phone"), auth.open(subject, "tablet"));
    }

    private static long sequence = 1;

    /** Opens the shift from the phone at {@code metres} north of the pickup. */
    private Driver online(int metres) throws Exception {
        Driver driver = driver();
        GeoPoint at = TestRides.north(PICKUP, metres);
        MvcResult opened = send(post("/api/driver/v1/work-sessions"), driver.phone(), Map.of(
                "command_id", UUID.randomUUID(), "vehicle_id", driver.vehicle(),
                "location", Map.of("lat", at.lat(), "lon", at.lon(), "accuracy_m", 5,
                        "recorded_at", OffsetDateTime.now().toString(), "sequence", sequence++)));
        assertThat(opened.getResponse().getStatus()).as(opened.getResponse().getContentAsString()).isEqualTo(201);
        return driver;
    }

    private MvcResult send(org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder request,
                           IssuedSession device, Object body) throws Exception {
        request.header(HttpHeaders.AUTHORIZATION, "Bearer " + device.accessToken());
        if (body != null) {
            request.contentType(MediaType.APPLICATION_JSON).content(json.writeValueAsString(body));
        }
        return mvc.perform(request).andReturn();
    }

    private MvcResult claim(IssuedSession device, UUID orderId) throws Exception {
        return send(post("/api/driver/v1/orders/" + orderId + "/claim"), device, Map.of("command_id", UUID.randomUUID()));
    }

    private MvcResult accept(IssuedSession device, UUID offerId) throws Exception {
        return send(post("/api/driver/v1/offers/" + offerId + "/accept"), device, Map.of("command_id", UUID.randomUUID()));
    }

    private MvcResult list(IssuedSession device) throws Exception {
        return send(get("/api/driver/v1/broadcast-orders"), device, null);
    }

    @SuppressWarnings("unchecked")
    private Map<String, Object> body(MvcResult result) throws Exception {
        return json.readValue(result.getResponse().getContentAsString(), Map.class);
    }

    private void assertProblem(MvcResult result, int status, String code) throws Exception {
        assertThat(result.getResponse().getStatus()).as(result.getResponse().getContentAsString()).isEqualTo(status);
        assertThat(body(result)).containsEntry("code", code);
    }

    /** An order nobody was near when it was placed: it is in the ALL tab. */
    private OrderView broadcastOrder() {
        OrderView order = rides.order(rides.client(), city, PICKUP, DROPOFF);
        assertThat(orders.get(order.id()).searchPhase()).isEqualTo("BROADCAST");
        return order;
    }

    private int assignments(UUID orderId) {
        return jdbc.sql("select count(*) from assignment where order_id = :o and state in ('RESERVED', 'COMMITTED')")
                .param("o", orderId).query(Integer.class).single();
    }

    // ------------------------------------------------------------ E3: radius

    @Test
    void aClaimFromOutsideTheRadiusIsRefusedAndTheOrderStaysInAll() throws Exception {
        OrderView order = broadcastOrder();
        Driver far = online(8000);   // the ALL tab's radius is 5 km

        assertProblem(claim(far.phone(), order.id()), 422, "PICKUP_TOO_FAR");
        OrderView after = orders.get(order.id());
        assertThat(after.status()).isEqualTo("SEARCHING");
        assertThat(after.searchPhase()).isEqualTo("BROADCAST");
        assertThat(assignments(order.id())).isZero();

        Driver near = online(1000);
        MvcResult claimed = claim(near.phone(), order.id());
        assertThat(claimed.getResponse().getStatus()).as(claimed.getResponse().getContentAsString()).isEqualTo(200);
        assertThat(body(claimed)).containsEntry("driver_id", near.actor().id().toString());
        assertThat(orders.get(order.id()).status()).isEqualTo("ASSIGNED");
    }

    // ------------------------------------------------------------ E4: budgets

    @Test
    void theThirtyFirstClaimInTenMinutesIsRefusedButAnotherDriverIsNot() throws Exception {
        OrderView order = broadcastOrder();
        Driver bot = online(1000);
        for (int i = 0; i < 30; i++) {
            // A script probing order ids: every attempt counts, whatever its answer.
            assertThat(claim(bot.phone(), UUID.randomUUID()).getResponse().getStatus()).isNotEqualTo(429);
        }
        MvcResult limited = claim(bot.phone(), UUID.randomUUID());
        assertProblem(limited, 429, "RATE_LIMITED");
        assertThat(limited.getResponse().getHeader(HttpHeaders.RETRY_AFTER)).isNotBlank();

        // Even a real order: still over the budget, and the order stays for others.
        assertProblem(claim(bot.phone(), order.id()), 429, "RATE_LIMITED");
        Driver other = online(1200);
        assertThat(claim(other.phone(), order.id()).getResponse().getStatus()).isEqualTo(200);
    }

    @Test
    void pollingTheAllTabOverItsBudgetIsRefusedButAnotherDriverIsNot() throws Exception {
        Driver bot = online(1000);
        for (int i = 0; i < 120; i++) {
            assertThat(list(bot.phone()).getResponse().getStatus()).isEqualTo(200);
        }
        MvcResult limited = list(bot.phone());
        assertProblem(limited, 429, "RATE_LIMITED");
        assertThat(limited.getResponse().getHeader(HttpHeaders.RETRY_AFTER)).isNotBlank();

        Driver other = online(1200);
        assertThat(list(other.phone()).getResponse().getStatus()).isEqualTo(200);
    }

    // ------------------------------------------------------------ E5: the device of the shift

    @Test
    void acceptAndClaimWorkOnlyFromTheDeviceThatHoldsTheShift() throws Exception {
        // Accept: the offer goes to the driver whose shift is open on the phone.
        Driver driver = online(300);
        OrderView offered = rides.order(rides.client(), city, PICKUP, DROPOFF);
        UUID offerId = dispatch.offers(driver.actor()).getFirst().id();

        assertProblem(accept(driver.tablet(), offerId), 409, "STATE_CONFLICT");
        assertThat(jdbc.sql("select state from offer where id = :id").param("id", offerId).query(String.class).single())
                .isEqualTo("OPEN");
        assertThat(assignments(offered.id())).isZero();
        MvcResult accepted = accept(driver.phone(), offerId);
        assertThat(accepted.getResponse().getStatus()).as(accepted.getResponse().getContentAsString()).isEqualTo(200);

        // Claim: the same rule in the ALL tab.
        OrderView order = broadcastOrder();
        Driver claimer = online(1000);
        assertProblem(claim(claimer.tablet(), order.id()), 409, "STATE_CONFLICT");
        assertThat(assignments(order.id())).isZero();
        MvcResult claimed = claim(claimer.phone(), order.id());
        assertThat(claimed.getResponse().getStatus()).as(claimed.getResponse().getContentAsString()).isEqualTo(200);
    }

    // ------------------------------------------------------------ E6: two claims at once

    @Test
    void twoDriversClaimingOneOrderAtOnceGetOneAssignmentAndNever500() throws Exception {
        ExecutorService pool = Executors.newFixedThreadPool(2);
        try {
            for (int round = 0; round < 5; round++) {
                OrderView order = broadcastOrder();
                Driver first = online(1000 + round);
                Driver second = online(1100 + round);
                CountDownLatch start = new CountDownLatch(1);
                List<Callable<MvcResult>> claims = List.of(
                        () -> { start.await(); return claim(first.phone(), order.id()); },
                        () -> { start.await(); return claim(second.phone(), order.id()); });
                List<Future<MvcResult>> futures = new ArrayList<>();
                for (Callable<MvcResult> call : claims) {
                    futures.add(pool.submit(call));
                }
                start.countDown();
                List<Integer> statuses = new ArrayList<>();
                List<String> codes = new ArrayList<>();
                for (Future<MvcResult> future : futures) {
                    MvcResult result = future.get();
                    statuses.add(result.getResponse().getStatus());
                    if (result.getResponse().getStatus() != 200) {
                        codes.add((String) body(result).get("code"));
                    }
                }
                assertThat(statuses).containsExactlyInAnyOrder(200, 409);
                assertThat(codes).containsExactly("ORDER_ALREADY_ASSIGNED");
                assertThat(assignments(order.id())).isEqualTo(1);
                // Off the line, so the next round's order finds nobody near and goes to the ALL tab.
                jdbc.sql("update work_session set state = 'CLOSED', closed_at = now() where city_id = :c and state <> 'CLOSED'")
                        .param("c", city).update();
            }
        } finally {
            pool.shutdownNow();
        }
    }
}
