package taxi.blizz.geo.internal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import jakarta.servlet.Filter;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
import org.junit.jupiter.api.AfterEach;
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
import taxi.blizz.TestQuotes;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.configuration.ServiceSettings;
import taxi.blizz.geo.CityOperations;
import taxi.blizz.geo.CityOperations.Hours;
import taxi.blizz.geo.CityOperations.Settings;
import taxi.blizz.geo.GeoConfiguration;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.ApiAudience;
import taxi.blizz.identity.SessionService;
import taxi.blizz.identity.VerifiedSubject;
import taxi.blizz.operations.CreateOrder;
import taxi.blizz.operations.Dispatch;
import taxi.blizz.operations.OrderView;
import taxi.blizz.operations.Orders;
import taxi.blizz.operations.PaymentMethod;
import taxi.blizz.operations.Trips;
import taxi.blizz.operations.WorkSessions;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.pricing.QuoteService;
import tools.jackson.databind.json.JsonMapper;

/** Working hours, payment methods and the pause of new orders of a city (REQ-TEN-03/06). */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class CityOperationsTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, -114.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, -114.45);

    @Autowired
    CityOperations operations;
    @Autowired
    Orders orders;
    @Autowired
    Dispatch dispatch;
    @Autowired
    Trips trips;
    @Autowired
    WorkSessions sessions;
    @Autowired
    SessionService auth;
    @Autowired
    QuoteService quotes;
    @Autowired
    ServiceSettings settings;
    @Autowired
    JdbcClient jdbc;
    @Autowired
    WebApplicationContext context;
    @Autowired
    JsonMapper json;

    TestRides rides;
    UUID cityId;
    Actor admin;

    @BeforeEach
    void setUp() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        cityId = rides.city("test-city-operations", "UAH", -115);
        admin = staff(null);
    }

    @AfterEach
    void reopen() {
        jdbc.sql("delete from city_operations where city_id = :city").param("city", cityId).update();
    }

    private Actor staff(UUID city) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, all_cities, city_scope, state,
                                                created_at, updated_at)
                        values (:id, :login, 'City ops', 'ADMIN', :permissions, :all, :scope, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "city-ops-" + id)
                .param("permissions", new String[] {GeoConfiguration.MANAGE_PERMISSION})
                .param("all", city == null).param("scope", city == null ? new UUID[0] : new UUID[] {city}).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private static void assertCode(ThrowingCallable call, ErrorCode code) {
        assertThatThrownBy(call).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }

    private static Set<Integer> everyDay() {
        return Set.of(1, 2, 3, 4, 5, 6, 7);
    }

    private OrderView order(Actor payer, PaymentMethod method, Instant pickupAt) {
        TestQuotes q = new TestQuotes(jdbc, quotes);
        UUID quote = pickupAt == null ? q.quote(payer, cityId, "STANDARD", PICKUP, DROPOFF).id()
                : q.quote(payer, cityId, "STANDARD", PICKUP, DROPOFF, pickupAt).id();
        return orders.create(payer, UUID.randomUUID(), new CreateOrder(payer.id(), "STANDARD", PICKUP, "Home", DROPOFF,
                "Work", method, quote, null, null, null, pickupAt));
    }

    @Test
    void aCityNeverChangedIsOpenAroundTheClockWithEveryMethod() {
        CityOperations.State state = operations.get(admin, cityId);
        assertThat(state.version()).isZero();
        assertThat(state.workingHours()).isEmpty();
        assertThat(state.paymentMethods()).containsExactlyInAnyOrder("CASH", "CARD", "TERMINAL");
        assertThat(state.ordersPaused()).isFalse();
        assertThat(order(rides.client(), PaymentMethod.CASH, null).status()).isEqualTo("SEARCHING");
    }

    @Test
    void aPauseRefusesNewOrdersButTheTripUnderWayFinishes() {
        TestRides.Ride ride = rides.started(cityId, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        CityOperations.State paused = operations.pause(admin, UUID.randomUUID(), cityId, 0, "Storm warning");
        assertThat(paused.ordersPaused()).isTrue();
        assertThat(paused.pauseReason()).isEqualTo("Storm warning");
        assertThat(paused.pausedAt()).isNotNull();
        assertCode(() -> operations.pause(admin, UUID.randomUUID(), cityId, 1, "again"), ErrorCode.STATE_CONFLICT);

        assertCode(() -> order(rides.client(), PaymentMethod.CASH, null), ErrorCode.CITY_PAUSED);
        assertThat(rides.complete(ride, true).phase()).as("REQ-TEN-06: trips under way go on").isEqualTo("COMPLETED");

        CityOperations.State resumed = operations.resume(admin, UUID.randomUUID(), cityId, 1, "Storm over");
        assertThat(resumed.ordersPaused()).isFalse();
        assertThat(resumed.pausedAt()).isNull();
        assertThat(resumed.version()).isEqualTo(2);
        assertThat(jdbc.sql("""
                        select count(*) from audit_log where resource_type = 'city' and resource_id = :city
                          and actor_id = :admin and action in ('city.operations.pause', 'city.operations.resume')""")
                .param("city", cityId.toString()).param("admin", admin.id()).query(Long.class).single())
                .as("other tests of this class pause the same city with their own staff").isEqualTo(2);
    }

    @Test
    void outsideTheHoursAnOrderForNowIsRefusedAndOneForLaterInsideThemIsTaken() {
        long threshold = settings.current().settings().preorders().thresholdMinutes();
        ZonedDateTime opens = Instant.now().plus(threshold + 60, ChronoUnit.MINUTES).truncatedTo(ChronoUnit.HOURS)
                .plus(1, ChronoUnit.HOURS).atZone(ZoneOffset.UTC);
        LocalTime from = opens.toLocalTime();
        operations.change(admin, UUID.randomUUID(), cityId, 0,
                new Settings(List.of(new Hours(everyDay(), from, from.plusHours(3))), CityOperations.METHODS),
                "Night service only");

        assertCode(() -> order(rides.client(), PaymentMethod.CASH, null), ErrorCode.CITY_CLOSED);
        OrderView later = order(rides.client(), PaymentMethod.CASH, opens.plusMinutes(30).toInstant());
        assertThat(later.status()).isEqualTo("SCHEDULED");
        assertCode(() -> order(rides.client(), PaymentMethod.CASH, opens.plusHours(4).toInstant()),
                ErrorCode.CITY_CLOSED);
    }

    @Test
    void aMethodTheCityDoesNotOfferIsRefused() {
        operations.change(admin, UUID.randomUUID(), cityId, 0, new Settings(List.of(), Set.of("CARD")),
                "Card only for now");
        assertCode(() -> order(rides.client(), PaymentMethod.CASH, null), ErrorCode.PAYMENT_METHOD_NOT_OFFERED);
        assertCode(() -> operations.change(admin, UUID.randomUUID(), cityId, 1, new Settings(List.of(), Set.of()), "x"),
                ErrorCode.VALIDATION_FAILED);
        assertCode(() -> operations.change(admin, UUID.randomUUID(), cityId, 1,
                new Settings(List.of(), Set.of("SERVICE")), "x"), ErrorCode.VALIDATION_FAILED);
        assertCode(() -> operations.change(admin, UUID.randomUUID(), cityId, 1,
                new Settings(List.of(new Hours(Set.of(8), LocalTime.of(6, 0), LocalTime.of(7, 0))),
                        CityOperations.METHODS), "x"), ErrorCode.VALIDATION_FAILED);
    }

    @Test
    void onlyStaffOfTheCityChangeItAndAStaleVersionIsRefused() {
        Actor elsewhere = staff(UUID.randomUUID());
        Actor here = staff(cityId);
        assertCode(() -> operations.get(elsewhere, cityId), ErrorCode.ACCESS_DENIED);
        assertCode(() -> operations.pause(elsewhere, UUID.randomUUID(), cityId, 0, "x"), ErrorCode.ACCESS_DENIED);
        operations.pause(here, UUID.randomUUID(), cityId, 0, "Local event");
        assertCode(() -> operations.resume(here, UUID.randomUUID(), cityId, 0, "stale"), ErrorCode.VERSION_CONFLICT);
        assertCode(() -> operations.get(admin, UUID.randomUUID()), ErrorCode.NOT_FOUND);
    }

    /** Two admins saving at once: one wins, the other gets a version conflict, never a server error. */
    @Test
    void twoChangesAtOnceGiveOneWinnerAndOneVersionConflict() throws Exception {
        CountDownLatch start = new CountDownLatch(1);
        List<CompletableFuture<Object>> results = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            String why = "parallel " + i;
            results.add(CompletableFuture.supplyAsync(() -> {
                try {
                    start.await(5, TimeUnit.SECONDS);
                    return operations.pause(admin, UUID.randomUUID(), cityId, 0, why);
                } catch (DomainException e) {
                    return e.code();
                } catch (InterruptedException e) {
                    throw new IllegalStateException(e);
                }
            }));
        }
        start.countDown();
        List<Object> outcomes = new ArrayList<>();
        for (CompletableFuture<Object> r : results) {
            outcomes.add(r.get(20, TimeUnit.SECONDS));
        }
        assertThat(outcomes).filteredOn(o -> o instanceof CityOperations.State).hasSize(1);
        assertThat(outcomes).filteredOn(o -> o == ErrorCode.VERSION_CONFLICT).hasSize(1);
    }

    @Test
    void hoursPastMidnightAndAroundTheClock() {
        List<Hours> night = List.of(new Hours(Set.of(5), LocalTime.of(22, 0), LocalTime.of(2, 0))); // Friday night
        // 2026-10-30 is a Friday.
        assertThat(JdbcCityOperations.open(night, at("2026-10-30T23:30"))).isTrue();
        assertThat(JdbcCityOperations.open(night, at("2026-10-31T01:59"))).as("Saturday morning, Friday's interval")
                .isTrue();
        assertThat(JdbcCityOperations.open(night, at("2026-10-31T02:00"))).isFalse();
        assertThat(JdbcCityOperations.open(night, at("2026-10-30T21:59"))).isFalse();
        assertThat(JdbcCityOperations.open(night, at("2026-10-30T01:00"))).as("Friday morning is Thursday's").isFalse();
        List<Hours> sunday = List.of(new Hours(Set.of(7), LocalTime.of(20, 0), LocalTime.of(6, 0)));
        assertThat(JdbcCityOperations.open(sunday, at("2026-11-02T05:00"))).as("Monday morning, Sunday's interval")
                .isTrue();
        List<Hours> fullDay = List.of(new Hours(Set.of(1), LocalTime.of(6, 0), LocalTime.of(6, 0)));
        assertThat(JdbcCityOperations.open(fullDay, at("2026-11-03T05:59"))).as("24 h from Monday 06:00").isTrue();
        assertThat(JdbcCityOperations.open(fullDay, at("2026-11-03T06:00"))).isFalse();
        assertThat(JdbcCityOperations.open(List.of(), at("2026-11-03T03:00"))).isTrue();
    }

    private static ZonedDateTime at(String local) {
        return LocalDateTime.parse(local).atZone(ZoneOffset.UTC);
    }

    @Test
    @SuppressWarnings("unchecked")
    void theAdminPanelChangesItAndTheAppsSeeItInTheBootstrap() throws Exception {
        List<Filter> filters = new ArrayList<>(context.getBeansOfType(Filter.class).values());
        AnnotationAwareOrderComparator.sort(filters);
        MockMvc mvc = MockMvcBuilders.webAppContextSetup(context).addFilters(filters.toArray(Filter[]::new)).build();
        String token = auth.openStaff(new VerifiedSubject(admin, "ACTIVE", false), ApiAudience.ADMIN, null)
                .accessToken();
        String path = "/api/admin/v1/cities/" + cityId + "/operations";

        MvcResult changed = mvc.perform(post(path).header(HttpHeaders.AUTHORIZATION, "Bearer " + token)
                .contentType(MediaType.APPLICATION_JSON).content(json.writeValueAsString(Map.of(
                        "command_id", UUID.randomUUID(), "expected_version", 0,
                        "working_hours", List.of(Map.of("days_of_week", List.of(1, 2, 3, 4, 5), "from", "06:00",
                                "to", "02:00")),
                        "payment_methods", List.of("CASH", "TERMINAL"), "reason", "Weekdays, no cards yet"))))
                .andReturn();
        assertThat(changed.getResponse().getStatus()).isEqualTo(200);
        Map<String, Object> state = json.readValue(changed.getResponse().getContentAsString(), Map.class);
        assertThat(state).containsEntry("version", 1).containsEntry("orders_paused", false);
        assertThat((List<Map<String, Object>>) state.get("working_hours")).singleElement()
                .satisfies(h -> assertThat(h).containsEntry("from", "06:00").containsEntry("to", "02:00"));

        MvcResult bad = mvc.perform(post(path).header(HttpHeaders.AUTHORIZATION, "Bearer " + token)
                .contentType(MediaType.APPLICATION_JSON).content(json.writeValueAsString(Map.of(
                        "command_id", UUID.randomUUID(), "expected_version", 1,
                        "working_hours", List.of(Map.of("days_of_week", List.of(1), "from", "6:00", "to", "25:00")),
                        "payment_methods", List.of("CASH"), "reason", "typo")))).andReturn();
        assertThat(bad.getResponse().getStatus()).isEqualTo(400);

        mvc.perform(post(path + "/pause").header(HttpHeaders.AUTHORIZATION, "Bearer " + token)
                .contentType(MediaType.APPLICATION_JSON).content(json.writeValueAsString(Map.of(
                        "command_id", UUID.randomUUID(), "expected_version", 1, "reason", "Flood"))));

        MvcResult boot = mvc.perform(get("/api/config/v1/bootstrap")).andReturn();
        List<Map<String, Object>> cities = (List<Map<String, Object>>) json.readValue(
                boot.getResponse().getContentAsString(), Map.class).get("cities");
        assertThat(cities).filteredOn(c -> cityId.toString().equals(c.get("id"))).singleElement().satisfies(c -> {
            assertThat(c).containsEntry("orders_paused", true);
            assertThat((List<String>) c.get("payment_methods")).containsExactly("CASH", "TERMINAL");
            assertThat((List<Object>) c.get("working_hours")).hasSize(1);
        });
    }
}
