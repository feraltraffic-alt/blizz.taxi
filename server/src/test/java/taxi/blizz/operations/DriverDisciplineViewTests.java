package taxi.blizz.operations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

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
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.configuration.ServiceSettings;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.ApiAudience;
import taxi.blizz.identity.SessionService;
import taxi.blizz.identity.VerifiedSubject;
import taxi.blizz.operations.internal.DispatchWorker;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.pricing.QuoteService;
import tools.jackson.databind.json.JsonMapper;

/**
 * Issue #487, cases 10 and 11 (ADR 0018 B10, B11, P1–P3): what the driver and staff see, the report of the highest
 * rates, and the rider an accepted order was given back to — searched again first, never offered to the same driver,
 * told why. Its own city at longitude 169.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class DriverDisciplineViewTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, 169.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 169.55);

    @Autowired Orders orders;
    @Autowired Dispatch dispatch;
    @Autowired Trips trips;
    @Autowired WorkSessions sessions;
    @Autowired SessionService auth;
    @Autowired QuoteService quotes;
    @Autowired ServiceSettings settings;
    @Autowired DispatchWorker worker;
    @Autowired JdbcClient jdbc;
    @Autowired WebApplicationContext context;
    @Autowired JsonMapper json;

    TestRides rides;
    UUID city;
    MockMvc mvc;

    @BeforeEach
    void city() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        city = rides.city("test-discipline-views", "UAH", 169);
        stopSearches();
        List<Filter> filters = new ArrayList<>(context.getBeansOfType(Filter.class).values());
        AnnotationAwareOrderComparator.sort(filters);
        mvc = MockMvcBuilders.webAppContextSetup(context).addFilters(filters.toArray(Filter[]::new)).build();
    }

    // ------------------------------------------------------------ case 10: the driver and the card

    @Test
    @SuppressWarnings("unchecked")
    void case10_theDriverSeesTheCountsAndThePauseAndStaffTheCard() throws Exception {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        String driverToken = auth.open(new VerifiedSubject(driver.actor(), "ACTIVE", false), "phone").accessToken();
        for (int i = 0; i < 3; i++) {
            withdraw(driver);
        }
        Map<String, Object> mine = getJson("/api/driver/v1/discipline", driverToken);
        Map<String, Object> cancellations = (Map<String, Object>) mine.get("cancellations");
        assertThat(cancellations).containsEntry("last24h", 3).containsEntry("until_pause", 2)
                .containsEntry("pause_after", 5).containsEntry("accepted30d", 3).containsEntry("cancelled30d", 3)
                .containsEntry("rate30d_percent", 100);
        Map<String, Object> acceptance = (Map<String, Object>) mine.get("acceptance");
        assertThat(acceptance).containsEntry("offers7d", 3).containsEntry("accepted7d", 3)
                .containsEntry("percent7d", null).containsEntry("min_offers", 20);
        assertThat(mine.get("pause")).isNull();

        withdraw(driver);
        withdraw(driver);
        Map<String, Object> paused = getJson("/api/driver/v1/discipline", driverToken);
        assertThat(((Map<String, Object>) paused.get("cancellations"))).containsEntry("until_pause", 0);
        assertThat((Map<String, Object>) paused.get("pause")).containsEntry("kind", "CANCELLATIONS")
                .containsEntry("level", 1).containsKey("ends_at");

        String path = "/api/admin/v1/drivers/" + driver.actor().id() + "/discipline";
        Map<String, Object> card = getJson(path, token(staff("drivers.risk", true)));
        assertThat((List<Map<String, Object>>) card.get("recent")).hasSize(5)
                .allSatisfy(r -> assertThat(r).containsEntry("reason_code", "VEHICLE_PROBLEM")
                        .containsEntry("counted", true));
        assertThat(status(path, token(staff("orders.view", true)))).isEqualTo(403);
        UUID other = rides.city("test-discipline-views-other", "UAH", 170);
        Map<String, Object> elsewhere = getJson(path, token(staff("drivers.risk", false, other)));
        assertThat((List<?>) elsewhere.get("recent")).as("another city's staff see no rows").isEmpty();
    }

    // ------------------------------------------------------------ case 11: the report

    @Test
    @SuppressWarnings("unchecked")
    void case11_theReportListsTheHighestRatesFromTheMinimumOfAcceptedOrders() throws Exception {
        withDiscipline(new ServiceSettings.DriverDiscipline(true, 30, 9, 10, 30, 120, 7, 20, 2, 5, 7), () -> {
            TestRides.Driver high = rides.driverNear(PICKUP);
            withdraw(high);
            withdraw(high);
            offLine(high);
            TestRides.Driver half = rides.driverNear(PICKUP);
            rides.complete(rides.started(city, half, PICKUP, DROPOFF), true);
            stopSearches();
            withdraw(half);
            offLine(half);
            TestRides.Driver once = rides.driverNear(PICKUP);
            withdraw(once);
            offLine(once);
            try {
                String report = "/api/admin/v1/reports/driver-cancellations?city_id=" + city;
                Map<String, Object> body = getJson(report, token(staff("drivers.risk", true)));
                assertThat(body).containsEntry("min_accepted", 2).containsEntry("days", 30);
                List<String> ours = List.of(high.actor().id().toString(), half.actor().id().toString(),
                        once.actor().id().toString());
                assertThat(((List<Map<String, Object>>) body.get("drivers")).stream()
                        .filter(d -> ours.contains(d.get("driver_id"))).toList())
                        .extracting(d -> d.get("driver_id"), d -> d.get("rate_percent"))
                        .containsExactly(org.assertj.core.groups.Tuple.tuple(high.actor().id().toString(), 100),
                                org.assertj.core.groups.Tuple.tuple(half.actor().id().toString(), 50));
                assertThat(status(report, token(staff("orders.view", true)))).isEqualTo(403);
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        });
    }

    // ------------------------------------------------------------ case 11: the rider (P1–P3)

    @Test
    void case11_anOrderGivenBackSearchesFirstNeverGoesToTheSameDriverAndTheRiderIsTold() {
        TestRides.Driver gaveUp = rides.driverNear(PICKUP);
        OrderView waiting = rides.order(rides.client(), city, TestRides.north(PICKUP, 300), DROPOFF);
        jdbc.sql("update offer set state = 'REVOKED', closed_at = now() where order_id = :o and state = 'OPEN'")
                .param("o", waiting.id()).update();
        jdbc.sql("update driver_capacity set occupancy = 'FREE' where driver_id = :d")
                .param("d", gaveUp.actor().id()).update();
        TestRides.Ride ride = rides.assigned(city, gaveUp, PICKUP, DROPOFF);
        jdbc.sql("update assignment set created_at = created_at - interval '1 minute' where order_id = :o")
                .param("o", ride.order().id()).update();
        trips.withdraw(gaveUp.actor(), UUID.randomUUID(), ride.trip().id(), ride.trip().version(), "VEHICLE_PROBLEM",
                null);

        // P2: not offered again to the driver who gave it back, though free and nearest.
        assertThat(dispatch.offers(gaveUp.actor())).extracting(OfferView::orderId).doesNotContain(ride.order().id());
        assertThat(jdbc.sql("""
                        select priority from dispatch_attempt
                        where order_id = :o and phase in ('PERSONAL', 'BROADCAST')""")
                .param("o", ride.order().id()).query(Boolean.class).single()).as("P1").isTrue();
        assertThat(jdbc.sql("""
                        select priority from dispatch_attempt
                        where order_id = :o and phase in ('PERSONAL', 'BROADCAST')""")
                .param("o", waiting.id()).query(Boolean.class).single()).isFalse();

        // P1: a driver free for both goes to the rider who was left, though the other order waited longer.
        offLine(gaveUp);
        // Online far away first, so going on line offers it nothing; then moved near both orders without a heartbeat.
        TestRides.Driver next = rides.driverNear(TestRides.north(PICKUP, 40_000));
        GeoPoint near = TestRides.north(PICKUP, 1000);
        jdbc.sql("""
                        update work_session set last_location = ST_SetSRID(ST_MakePoint(:lon, :lat), 4326)
                        where driver_id = :d and state = 'OPEN'""")
                .param("lon", near.lon()).param("lat", near.lat()).param("d", next.actor().id()).update();
        assertThat(dispatch.offers(next.actor())).as("nothing offered while far").isEmpty();
        jdbc.sql("""
                        update dispatch_attempt set phase = 'PERSONAL', phase_deadline = now() + interval '1 minute',
                            next_action_at = case when order_id = :waiting
                                then now() - interval '10 seconds' else now() - interval '1 second' end
                        where order_id in (:waiting, :given) and phase in ('PERSONAL', 'BROADCAST')""")
                .param("waiting", waiting.id()).param("given", ride.order().id()).update();
        worker.runOnce();
        assertThat(dispatch.offers(next.actor())).extracting(OfferView::orderId).containsExactly(ride.order().id());

        // P3: the rider is told the driver gave the order up, without the driver's name or reason.
        OrderView seen = orders.get(ride.order().id());
        assertThat(seen.status()).isEqualTo("SEARCHING");
        assertThat(seen.driverChange().reasonCode()).isEqualTo("DRIVER_CANCELLED");
        stopSearches();
    }

    // ------------------------------------------------------------ helpers

    private void withdraw(TestRides.Driver driver) {
        TestRides.Ride ride = rides.assigned(city, driver, PICKUP, DROPOFF);
        jdbc.sql("update assignment set created_at = created_at - interval '1 minute' where order_id = :o")
                .param("o", ride.order().id()).update();
        trips.withdraw(driver.actor(), UUID.randomUUID(), ride.trip().id(), ride.trip().version(), "VEHICLE_PROBLEM",
                null);
        stopSearches();
    }

    private void offLine(TestRides.Driver driver) {
        jdbc.sql("update work_session set state = 'CLOSED', closed_at = now() where driver_id = :d and state <> 'CLOSED'")
                .param("d", driver.actor().id()).update();
    }

    private void stopSearches() {
        jdbc.sql("""
                        update dispatch_attempt set phase = 'STOPPED', next_action_at = null
                        where phase in ('PERSONAL', 'BROADCAST')
                          and order_id in (select id from ride_order where city_id = :c)""")
                .param("c", city).update();
        jdbc.sql("update offer set state = 'REVOKED', closed_at = now() where state = 'OPEN' and order_id in "
                + "(select id from ride_order where city_id = :c)").param("c", city).update();
        jdbc.sql("""
                        update driver_capacity set occupancy = 'FREE' where occupancy = 'OFFERED'
                          and driver_id in (select driver_id from work_session where city_id = :c and state = 'OPEN')""")
                .param("c", city).update();
        jdbc.sql("""
                        update ride_order set status = 'UNFULFILLED'
                        where city_id = :c and status in ('READY', 'SEARCHING')""")
                .param("c", city).update();
    }

    private void withDiscipline(ServiceSettings.DriverDiscipline discipline, Runnable body) {
        Actor admin = staff(ServiceSettings.MANAGE_PERMISSION, true);
        ServiceSettings.Version before = settings.current();
        ServiceSettings.Settings s = before.settings();
        ServiceSettings.Version changed = settings.change(admin, UUID.randomUUID(), before.version(),
                new ServiceSettings.Settings(s.brand(), s.languages(), s.calls(), s.preorders(), s.ratings(), s.tips(),
                        s.orders(), s.cashNotReceived(), s.appVersions(), s.staffTopUps(), s.riderDebts(), discipline,
                        s.offerDiscipline()), "Test of ADR 0018 B11");
        try {
            body.run();
        } finally {
            settings.change(admin, UUID.randomUUID(), changed.version(), s, "Back after the test");
        }
    }

    private Actor staff(String permission, boolean allCities, UUID... cities) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, all_cities, city_scope, state,
                                                created_at, updated_at)
                        values (:id, :login, 'Views', 'ADMIN', :permissions, :all, :cities, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "discipline-" + id).param("permissions", new String[] {permission})
                .param("all", allCities).param("cities", cities).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private String token(Actor staff) {
        return auth.openStaff(new VerifiedSubject(staff, "ACTIVE", false), ApiAudience.ADMIN, "discipline")
                .accessToken();
    }

    private int status(String path, String token) throws Exception {
        return mvc.perform(get(path).header(HttpHeaders.AUTHORIZATION, "Bearer " + token)).andReturn().getResponse()
                .getStatus();
    }

    @SuppressWarnings("unchecked")
    private Map<String, Object> getJson(String path, String token) throws Exception {
        MvcResult result = mvc.perform(get(path).header(HttpHeaders.AUTHORIZATION, "Bearer " + token)).andReturn();
        assertThat(result.getResponse().getStatus()).as(path + " " + result.getResponse().getContentAsString())
                .isEqualTo(200);
        return json.readValue(result.getResponse().getContentAsString(), Map.class);
    }
}
