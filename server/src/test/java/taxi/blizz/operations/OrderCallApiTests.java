package taxi.blizz.operations;

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
import org.springframework.http.HttpHeaders;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import taxi.blizz.TestQuotes;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.configuration.ServiceSettings;
import taxi.blizz.configuration.ServiceSettings.CallMode;
import taxi.blizz.configuration.ServiceSettings.Calls;
import taxi.blizz.configuration.ServiceSettings.Settings;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.SessionService;
import taxi.blizz.identity.VerifiedSubject;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.pricing.QuoteService;
import tools.jackson.databind.json.JsonMapper;

@SpringBootTest
@Import(TestcontainersConfiguration.class)
class OrderCallApiTests {

    private static final GeoPoint PICKUP = new GeoPoint(-39.5, 70.5);
    private static final GeoPoint DROPOFF = new GeoPoint(-39.45, 70.55);
    private static final String SERVICE_PHONE = "+380440000038";
    private static final String CALLER_PHONE = "+48512345038";

    @Autowired Orders orders;
    @Autowired Dispatch dispatch;
    @Autowired Trips trips;
    @Autowired WorkSessions workSessions;
    @Autowired SessionService auth;
    @Autowired QuoteService quoteService;
    @Autowired ServiceSettings settings;
    @Autowired JdbcClient jdbc;
    @Autowired WebApplicationContext context;
    @Autowired JsonMapper json;

    MockMvc mvc;
    TestRides rides;
    UUID city;
    Actor admin;

    @BeforeEach
    void setUp() {
        List<Filter> filters = new ArrayList<>(context.getBeansOfType(Filter.class).values());
        AnnotationAwareOrderComparator.sort(filters);
        mvc = MockMvcBuilders.webAppContextSetup(context).addFilters(filters.toArray(Filter[]::new)).build();
        rides = new TestRides(jdbc, orders, dispatch, trips, workSessions, auth, quoteService);
        city = rides.city("test-order-calls", "UAH", 70.0);
        admin = superAdmin();
    }

    @Test
    @SuppressWarnings("unchecked")
    void callsFollowSettingsOwnershipAndTheActiveAssignment() throws Exception {
        setCalls(CallMode.DIRECT, null, "order calls test starts direct");
        try {
            TestRides.Driver driver = rides.driverNear(PICKUP);
            TestRides.Ride direct = rides.assigned(city, driver, PICKUP, DROPOFF);
            String riderPhone = phone("client", direct.payer().id());
            String driverPhone = phone("driver", driver.actor().id());

            Map<String, Object> riderDirect = body(getAuth(
                    "/api/rider/v1/orders/" + direct.order().id() + "/call", token(direct.payer())));
            assertThat(riderDirect).containsEntry("mode", "DIRECT").containsEntry("phone", driverPhone);

            Map<String, Object> driverDirect = body(getAuth(
                    "/api/driver/v1/trips/" + direct.trip().id() + "/call", token(driver.actor())));
            assertThat(driverDirect).containsEntry("mode", "DIRECT").containsEntry("phone", riderPhone);

            Actor stranger = rides.client();
            assertStatus("/api/rider/v1/orders/" + direct.order().id() + "/call", token(stranger), 404);

            orders.cancel(direct.payer(), UUID.randomUUID(), direct.order().id(),
                    orders.get(direct.order().id()).version(), "CHANGED_MIND");
            assertStatus("/api/rider/v1/orders/" + direct.order().id() + "/call", token(direct.payer()), 409);

            TestRides.Ride viaService = rides.assigned(city, driver, PICKUP, DROPOFF);
            String secondRiderPhone = phone("client", viaService.payer().id());
            setCalls(CallMode.VIA_SERVICE_NUMBERS, SERVICE_PHONE, "route calls through service number");

            MvcResult riderServiceResult = getAuth(
                    "/api/rider/v1/orders/" + viaService.order().id() + "/call", token(viaService.payer()));
            Map<String, Object> riderService = body(riderServiceResult);
            assertThat(riderService).containsEntry("mode", "VIA_SERVICE_NUMBERS").containsEntry("phone", SERVICE_PHONE);
            assertThat(riderServiceResult.getResponse().getContentAsString()).doesNotContain(driverPhone);

            MvcResult driverServiceResult = getAuth(
                    "/api/driver/v1/trips/" + viaService.trip().id() + "/call", token(driver.actor()));
            Map<String, Object> driverService = body(driverServiceResult);
            assertThat(driverService).containsEntry("mode", "VIA_SERVICE_NUMBERS").containsEntry("phone", SERVICE_PHONE);
            assertThat(driverServiceResult.getResponse().getContentAsString()).doesNotContain(secondRiderPhone);

            orders.cancel(viaService.payer(), UUID.randomUUID(), viaService.order().id(),
                    orders.get(viaService.order().id()).version(), "CHANGED_MIND");
            setCalls(CallMode.DIRECT, null, "direct calls for remaining cases");

            Actor beforePayer = rides.client();
            OrderView beforeAssignment = rides.order(beforePayer, city, PICKUP, DROPOFF);
            assertStatus("/api/rider/v1/orders/" + beforeAssignment.id() + "/call", token(beforePayer), 409);
            orders.cancel(beforePayer, UUID.randomUUID(), beforeAssignment.id(),
                    orders.get(beforeAssignment.id()).version(), "CHANGED_MIND");

            TestRides.Ride withdrawn = rides.assigned(city, driver, PICKUP, DROPOFF);
            trips.withdraw(driver.actor(), UUID.randomUUID(), withdrawn.trip().id(), withdrawn.trip().version(),
                    "Cannot continue");
            assertStatus("/api/driver/v1/trips/" + withdrawn.trip().id() + "/call", token(driver.actor()), 404);
            assertStatus("/api/rider/v1/orders/" + withdrawn.order().id() + "/call", token(withdrawn.payer()), 409);
            orders.cancel(withdrawn.payer(), UUID.randomUUID(), withdrawn.order().id(),
                    orders.get(withdrawn.order().id()).version(), "CHANGED_MIND");

            TestRides.Ride completed = rides.started(city, driver, PICKUP, DROPOFF);
            TripView finished = trips.complete(driver.actor(), UUID.randomUUID(), completed.trip().id(),
                    completed.trip().version(), OffsetDateTime.now(), true);
            assertThat(finished.phase()).isEqualTo("COMPLETED");
            assertStatus("/api/rider/v1/orders/" + completed.order().id() + "/call", token(completed.payer()), 409);
            assertStatus("/api/driver/v1/trips/" + completed.trip().id() + "/call", token(driver.actor()), 409);

            OrderView phoneOrder = phoneOrder(admin);
            OfferView phoneOffer = dispatch.offers(driver.actor()).getFirst();
            dispatch.accept(driver.actor(), driver.device(), UUID.randomUUID(), phoneOffer.id());
            TripView phoneTrip = trips.current(driver.actor()).orElseThrow();
            Map<String, Object> phoneTarget = body(getAuth(
                    "/api/driver/v1/trips/" + phoneTrip.id() + "/call", token(driver.actor())));
            assertThat(phoneTarget).containsEntry("mode", "DIRECT").containsEntry("phone", CALLER_PHONE);
            assertThat(phoneTrip.orderId()).isEqualTo(phoneOrder.id());
        } finally {
            setCalls(CallMode.DIRECT, null, "restore direct calls after order calls test");
        }
    }

    private OrderView phoneOrder(Actor staff) {
        UUID quote = new TestQuotes(jdbc, quoteService).quote(staff, city, "STANDARD", PICKUP, DROPOFF).id();
        return orders.create(staff, UUID.randomUUID(), new CreateOrder(null, "STANDARD", PICKUP, "Phone pickup",
                DROPOFF, "Phone dropoff", PaymentMethod.CASH, quote, OrderChannel.PHONE, "call-38",
                new CallerContact("Caller", CALLER_PHONE)));
    }

    private Actor superAdmin() {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, state, created_at, updated_at)
                        values (:id, :login, 'Order Calls', 'SUPER_ADMIN', 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "order-calls-" + id).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private void setCalls(CallMode mode, String servicePhone, String reason) {
        ServiceSettings.Version current = settings.current();
        Settings before = current.settings();
        settings.change(admin, UUID.randomUUID(), current.version(),
                new Settings(before.brand(), before.languages(), new Calls(mode, servicePhone), before.preorders()), reason);
    }

    private String phone(String table, UUID id) {
        if (!table.equals("client") && !table.equals("driver")) {
            throw new IllegalArgumentException(table);
        }
        return jdbc.sql("select phone_normalized from " + table + " where id = :id")
                .param("id", id).query(String.class).single();
    }

    private String token(Actor actor) {
        return auth.open(new VerifiedSubject(actor, "ACTIVE", false), "order-call-api-test").accessToken();
    }

    private MvcResult getAuth(String path, String token) throws Exception {
        return mvc.perform(get(path).header(HttpHeaders.AUTHORIZATION, "Bearer " + token)).andReturn();
    }

    private void assertStatus(String path, String token, int status) throws Exception {
        assertThat(getAuth(path, token).getResponse().getStatus()).isEqualTo(status);
    }

    private Map<String, Object> body(MvcResult result) throws Exception {
        assertThat(result.getResponse().getStatus()).isEqualTo(200);
        return json.readValue(result.getResponse().getContentAsString(), Map.class);
    }
}
