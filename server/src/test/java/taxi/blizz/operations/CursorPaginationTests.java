package taxi.blizz.operations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import jakarta.servlet.Filter;
import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;
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
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.SessionService;
import taxi.blizz.identity.VerifiedSubject;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.PageCursor;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.pricing.QuoteService;
import tools.jackson.databind.json.JsonMapper;

/**
 * REQ-API-09: a list is read page by page with a cursor of {@code created_at + id}, so rows created in the same
 * microsecond are each returned once. The first version's {@code before} cut every row at the boundary time: of
 * five orders made at once, a page of two followed by {@code before} = the second one's time returned nothing more.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class CursorPaginationTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, 62.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 62.55);

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
        city = rides.city("test-cursor-pages", "UAH", 62.0);
    }

    /** Five cancelled orders of one rider, all created in the same microsecond. */
    private List<UUID> fiveOrdersAtOnce(Actor payer, OffsetDateTime at) {
        List<UUID> ids = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            OrderView order = rides.order(payer, city, PICKUP, DROPOFF);
            orders.cancel(payer, UUID.randomUUID(), order.id(), orders.get(order.id()).version(), "CHANGED_MIND");
            ids.add(order.id());
        }
        jdbc.sql("update ride_order set created_at = :at where id in (:ids)").param("at", at).param("ids", ids)
                .update();
        return ids;
    }

    @Test
    @SuppressWarnings("unchecked")
    void riderHistoryPagesThroughRowsOfTheSameTimeEachOnce() throws Exception {
        Actor payer = rides.client();
        OffsetDateTime at = OffsetDateTime.now().minusHours(1).truncatedTo(ChronoUnit.MICROS);
        List<UUID> ids = fiveOrdersAtOnce(payer, at);
        String token = token(payer);

        List<Object> seen = new ArrayList<>();
        String cursor = null;
        int pages = 0;
        do {
            MockHttpServletRequestBuilder request = get("/api/rider/v1/orders").param("limit", "2");
            if (cursor != null) {
                request.param("cursor", cursor);
            }
            Map<String, Object> body = object(mvc.perform(auth(request, token)).andReturn());
            List<Map<String, Object>> items = (List<Map<String, Object>>) body.get("items");
            Map<String, Object> page = (Map<String, Object>) body.get("page");
            items.forEach(item -> seen.add(item.get("id")));
            cursor = (String) page.get("next_cursor");
            assertThat(page.get("has_more")).isEqualTo(cursor != null);
            pages++;
        } while (cursor != null && pages < 10);

        assertThat(pages).isEqualTo(3);
        assertThat(seen).as("each order once, newest first, ties by id").hasSize(5).doesNotHaveDuplicates()
                .containsExactlyElementsOf(ids.stream().sorted((a, b) -> b.compareTo(a)).map(UUID::toString)
                        .toList());

        // The deprecated before still works: every order created strictly before it.
        Map<String, Object> older = object(mvc.perform(auth(get("/api/rider/v1/orders")
                .param("before", at.plusNanos(1000).toString()), token)).andReturn());
        assertThat((List<?>) older.get("items")).hasSize(5);
        Map<String, Object> none = object(mvc.perform(auth(get("/api/rider/v1/orders")
                .param("before", at.toString()), token)).andReturn());
        assertThat((List<?>) none.get("items")).isEmpty();
        assertThat((Map<String, Object>) none.get("page")).containsEntry("has_more", false)
                .containsEntry("next_cursor", null);
    }

    @Test
    void limitsAreFiftyByDefaultAndAtMostAHundredAndACursorBelongsToItsList() throws Exception {
        Actor payer = rides.client();
        String token = token(payer);
        for (String wrong : new String[] {"0", "101", "-1"}) {
            assertThat(status(get("/api/rider/v1/orders").param("limit", wrong), token)).as(wrong).isEqualTo(400);
        }
        assertThat(status(get("/api/rider/v1/orders").param("limit", "100"), token)).isEqualTo(200);

        String tripsCursor = PageCursor.of(Trips.DRIVER_TRIPS, OffsetDateTime.now(), UUID.randomUUID()).encode();
        assertThat(status(get("/api/rider/v1/orders").param("cursor", tripsCursor), token))
                .as("a driver-trips cursor on the rider's orders").isEqualTo(400);
        for (String garbage : new String[] {"not-base64!", "MXxyaWRlci1vcmRlcnM=", "", "MnxyaWRlci1vcmRlcnN8MXwy"}) {
            assertThat(status(get("/api/rider/v1/orders").param("cursor", garbage), token)).as(garbage)
                    .isEqualTo(400);
        }
        assertThat(PageCursor.limit(null)).isEqualTo(50);
    }

    @Test
    void staffCityOrdersPageThroughTiesEachOnce() {
        Actor payer = rides.client();
        OffsetDateTime at = OffsetDateTime.now().minusMinutes(30).truncatedTo(ChronoUnit.MICROS);
        List<UUID> ids = fiveOrdersAtOnce(payer, at);
        Actor staff = staffOf(Orders.VIEW_PERMISSION);

        List<UUID> seen = new ArrayList<>();
        PageCursor after = null;
        for (int page = 0; page < 10; page++) {
            List<OrderView> rows = orders.inCity(staff, city, false, after, 3);
            List<OrderView> items = rows.subList(0, Math.min(2, rows.size()));
            items.forEach(order -> seen.add(order.id()));
            if (rows.size() <= 2) {
                break;
            }
            after = Orders.position(items.getLast());
        }
        assertThat(seen).filteredOn(ids::contains).hasSize(5).doesNotHaveDuplicates();
    }

    @Test
    @SuppressWarnings("unchecked")
    void driverTripsPageThroughTiesEachOnce() throws Exception {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        List<UUID> tripIds = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            rides.moveTo(driver, PICKUP);
            TestRides.Ride ride = rides.started(city, driver, PICKUP, DROPOFF);
            tripIds.add(rides.complete(ride, true).id());
        }
        jdbc.sql("update trip set created_at = :at where id in (:ids)")
                .param("at", OffsetDateTime.now().minusMinutes(5).truncatedTo(ChronoUnit.MICROS))
                .param("ids", tripIds).update();
        String token = token(driver.actor());

        List<Object> seen = new ArrayList<>();
        String cursor = null;
        for (int page = 0; page < 10; page++) {
            MockHttpServletRequestBuilder request = get("/api/driver/v1/trips").param("limit", "1");
            if (cursor != null) {
                request.param("cursor", cursor);
            }
            Map<String, Object> body = object(mvc.perform(auth(request, token)).andReturn());
            ((List<Map<String, Object>>) body.get("items")).forEach(item -> seen.add(item.get("id")));
            cursor = (String) ((Map<String, Object>) body.get("page")).get("next_cursor");
            if (cursor == null) {
                break;
            }
        }
        assertThat(seen).hasSize(3).doesNotHaveDuplicates()
                .containsExactlyInAnyOrderElementsOf(tripIds.stream().map(UUID::toString).toList());
    }

    private Actor staffOf(String... permissions) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, all_cities, state, created_at,
                                                updated_at)
                        values (:id, :login, 'Pages', 'OPERATOR', :permissions, true, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "pages-" + id).param("permissions", permissions).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private String token(Actor actor) {
        return auth.open(new VerifiedSubject(actor, "ACTIVE", false), "cursor-pages-test").accessToken();
    }

    private static MockHttpServletRequestBuilder auth(MockHttpServletRequestBuilder request, String token) {
        return request.header(HttpHeaders.AUTHORIZATION, "Bearer " + token);
    }

    private int status(MockHttpServletRequestBuilder request, String token) throws Exception {
        return mvc.perform(auth(request, token)).andReturn().getResponse().getStatus();
    }

    @SuppressWarnings("unchecked")
    private Map<String, Object> object(MvcResult result) throws Exception {
        assertThat(result.getResponse().getStatus()).as(result.getResponse().getContentAsString()).isEqualTo(200);
        return json.readValue(result.getResponse().getContentAsString(), Map.class);
    }
}
