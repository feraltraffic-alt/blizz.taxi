package taxi.blizz.operations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
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
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.SessionService;
import taxi.blizz.identity.VerifiedSubject;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.pricing.QuoteService;
import tools.jackson.databind.json.JsonMapper;

@SpringBootTest
@Import(TestcontainersConfiguration.class)
class OrderHistoryApiTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, 120.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 120.55);
    static final GeoPoint OTHER_PICKUP = new GeoPoint(-39.5, 130.5);
    static final GeoPoint OTHER_DROPOFF = new GeoPoint(-39.45, 130.55);

    @Autowired Orders orders;
    @Autowired Dispatch dispatch;
    @Autowired Trips trips;
    @Autowired WorkSessions workSessions;
    @Autowired SessionService auth;
    @Autowired QuoteService quoteService;
    @Autowired JdbcClient jdbc;
    @Autowired WebApplicationContext context;
    @Autowired JsonMapper json;

    MockMvc mvc;
    TestRides rides;
    UUID city;

    @BeforeEach
    void setUp() {
        List<Filter> filters = new ArrayList<>(context.getBeansOfType(Filter.class).values());
        AnnotationAwareOrderComparator.sort(filters);
        mvc = MockMvcBuilders.webAppContextSetup(context).addFilters(filters.toArray(Filter[]::new)).build();
        rides = new TestRides(jdbc, orders, dispatch, trips, workSessions, auth, quoteService);
        city = rides.city("history-" + UUID.randomUUID().toString().substring(0, 8), "UAH", 120.0);
    }

    @Test
    @SuppressWarnings("unchecked")
    void historiesAreOwnedPagedAndUseTheLastAssignmentForChat() throws Exception {
        Actor payer = rides.client();
        Actor stranger = rides.client();
        TestRides.Driver driver = rides.driverNear(PICKUP);
        jdbc.sql("update driver set name = 'History Driver' where id = :id")
                .param("id", driver.actor().id()).update();

        Assigned completed = assign(payer, driver, PICKUP, DROPOFF);
        rides.moveTo(driver, TestRides.north(PICKUP, 30));
        TripView waiting = trips.arrive(driver.actor(), UUID.randomUUID(), completed.trip().id(),
                completed.trip().version(), null);
        TripView started = trips.start(driver.actor(), UUID.randomUUID(), waiting.id(), waiting.version(), null);
        TripView completedTrip = trips.complete(driver.actor(), UUID.randomUUID(), started.id(), started.version(),
                OffsetDateTime.now(), true);

        Assigned cancelledWithDriver = assign(payer, driver, PICKUP, DROPOFF);
        OrderView cancelledAssigned = orders.cancel(payer, UUID.randomUUID(), cancelledWithDriver.order().id(),
                orders.get(cancelledWithDriver.order().id()).version(), "RIDER_CANCELLED");
        assertThat(cancelledAssigned.status()).isEqualTo("CANCELLED");

        OrderView beforeAssignment = rides.order(payer, city, PICKUP, DROPOFF);
        OrderView cancelledBefore = orders.cancel(payer, UUID.randomUUID(), beforeAssignment.id(),
                orders.get(beforeAssignment.id()).version(), "RIDER_CANCELLED");
        assertThat(cancelledBefore.status()).isEqualTo("CANCELLED");

        Assigned withdrawn = assign(payer, driver, PICKUP, DROPOFF);
        TripView aborted = trips.withdraw(driver.actor(), UUID.randomUUID(), withdrawn.trip().id(),
                withdrawn.trip().version(), "Cannot continue");
        assertThat(aborted.phase()).isEqualTo("ABORTED");
        orders.cancel(payer, UUID.randomUUID(), withdrawn.order().id(), orders.get(withdrawn.order().id()).version(),
                "RIDER_CANCELLED");

        OffsetDateTime base = OffsetDateTime.now().minusHours(1);
        setOrderCreated(completed.order().id(), base.plusMinutes(1));
        setOrderCreated(cancelledWithDriver.order().id(), base.plusMinutes(2));
        setOrderCreated(beforeAssignment.id(), base.plusMinutes(3));
        setOrderCreated(withdrawn.order().id(), base.plusMinutes(4));
        setTripCreated(completedTrip.id(), base.plusMinutes(1));
        setTripCreated(cancelledWithDriver.trip().id(), base.plusMinutes(2));
        setTripCreated(aborted.id(), base.plusMinutes(4));

        String riderToken = token(payer);
        MvcResult riderResult = getAuth("/api/rider/v1/orders", riderToken);
        assertThat(riderResult.getResponse().getStatus()).isEqualTo(200);
        List<Map<String, Object>> riderHistory = array(riderResult);
        assertThat(riderHistory).extracting(item -> item.get("id")).containsExactly(
                withdrawn.order().id().toString(), beforeAssignment.id().toString(),
                cancelledWithDriver.order().id().toString(), completed.order().id().toString());

        Map<String, Object> withdrawnItem = byId(riderHistory, withdrawn.order().id());
        assertThat(withdrawnItem).containsEntry("chat_available", false);
        assertThat((Map<String, Object>) withdrawnItem.get("driver"))
                .containsEntry("name", "History Driver");
        assertThat((Map<String, Object>) ((Map<String, Object>) withdrawnItem.get("driver")).get("vehicle"))
                .containsEntry("make", "Skoda").containsEntry("model", "Octavia")
                .containsEntry("registration_number", "AA4000AA");

        assertThat(byId(riderHistory, cancelledWithDriver.order().id())).containsEntry("chat_available", true);
        assertThat(byId(riderHistory, beforeAssignment.id())).containsEntry("chat_available", false)
                .containsEntry("driver", null);
        assertThat(byId(riderHistory, completed.order().id())).containsEntry("chat_available", true)
                .containsEntry("final_price_minor", completedFare(completed.order().id()));

        OffsetDateTime cursor = jdbc.sql("select created_at from ride_order where id = :id")
                .param("id", beforeAssignment.id()).query(OffsetDateTime.class).single();
        MvcResult page = mvc.perform(get("/api/rider/v1/orders")
                        .header(HttpHeaders.AUTHORIZATION, "Bearer " + riderToken)
                        .param("before", cursor.toString()).param("limit", "50"))
                .andReturn();
        assertThat(array(page)).extracting(item -> item.get("id")).containsExactly(
                cancelledWithDriver.order().id().toString(), completed.order().id().toString());

        assertThat(array(getAuth("/api/rider/v1/orders", token(stranger)))).isEmpty();

        UUID otherCity = rides.city("history-other-" + UUID.randomUUID().toString().substring(0, 8), "UAH", 130.0);
        TestRides.Driver otherDriver = rides.driverNear(OTHER_PICKUP);
        TestRides.Ride otherRide = rides.started(otherCity, otherDriver, OTHER_PICKUP, OTHER_DROPOFF);
        TripView otherCompleted = rides.complete(otherRide, true);
        assertThat(otherCompleted.phase()).isEqualTo("COMPLETED");

        MvcResult driverResult = getAuth("/api/driver/v1/trips", token(driver.actor()));
        assertThat(driverResult.getResponse().getStatus()).isEqualTo(200);
        List<Map<String, Object>> driverHistory = array(driverResult);
        assertThat(driverHistory).extracting(item -> item.get("id"))
                .contains(completedTrip.id().toString(), cancelledWithDriver.trip().id().toString(), aborted.id().toString())
                .doesNotContain(otherCompleted.id().toString());
        assertThat(byId(driverHistory, aborted.id())).containsEntry("phase", "ABORTED")
                .containsEntry("order_short_number", shortNumber(withdrawn.order().id()));
    }

    @Test
    void nonStaffCallerContactIsRejectedBeforeAReceipt() {
        Actor payer = rides.client();
        UUID quote = new TestQuotes(jdbc, quoteService).quote(payer, city, "STANDARD", PICKUP, DROPOFF).id();
        UUID command = UUID.randomUUID();
        CreateOrder request = new CreateOrder(payer.id(), "STANDARD", PICKUP, "Home", DROPOFF, "Work",
                PaymentMethod.CASH, quote, OrderChannel.APP, null, new CallerContact("Caller", "+48512345678"));

        assertThatThrownBy(() -> orders.create(payer, command, request))
                .isInstanceOfSatisfying(DomainException.class,
                        ex -> assertThat(ex.code()).isEqualTo(ErrorCode.VALIDATION_FAILED));
        assertThat(jdbc.sql("select count(*) from command_receipt where command_id = :id")
                .param("id", command).query(Long.class).single()).isZero();
    }

    private Assigned assign(Actor payer, TestRides.Driver driver, GeoPoint pickup, GeoPoint dropoff) {
        rides.moveTo(driver, TestRides.north(pickup, 1000));
        OrderView order = rides.order(payer, city, pickup, dropoff);
        OfferView offer = dispatch.offers(driver.actor()).getFirst();
        dispatch.accept(driver.actor(), UUID.randomUUID(), offer.id());
        return new Assigned(order, trips.current(driver.actor()).orElseThrow());
    }

    private String token(Actor actor) {
        return auth.open(new VerifiedSubject(actor, "ACTIVE", false), "history-api-test").accessToken();
    }

    private void setOrderCreated(UUID order, OffsetDateTime at) {
        jdbc.sql("update ride_order set created_at = :at where id = :id").param("at", at).param("id", order).update();
    }

    private void setTripCreated(UUID trip, OffsetDateTime at) {
        jdbc.sql("update trip set created_at = :at where id = :id").param("at", at).param("id", trip).update();
    }

    private Long completedFare(UUID order) {
        return jdbc.sql("select final_price_minor from ride_order where id = :id")
                .param("id", order).query(Long.class).single();
    }

    private long shortNumber(UUID order) {
        return jdbc.sql("select short_number from ride_order where id = :id")
                .param("id", order).query(Long.class).single();
    }

    private MvcResult getAuth(String path, String token) throws Exception {
        return mvc.perform(get(path).header(HttpHeaders.AUTHORIZATION, "Bearer " + token)).andReturn();
    }

    @SuppressWarnings("unchecked")
    private List<Map<String, Object>> array(MvcResult result) throws Exception {
        return json.readValue(result.getResponse().getContentAsString(), List.class);
    }

    private static Map<String, Object> byId(List<Map<String, Object>> values, UUID id) {
        return values.stream().filter(item -> id.toString().equals(item.get("id"))).findFirst().orElseThrow();
    }

    private record Assigned(OrderView order, TripView trip) {
    }
}
