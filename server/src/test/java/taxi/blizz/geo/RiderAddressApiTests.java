package taxi.blizz.geo;

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
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.identity.IssuedSession;
import taxi.blizz.identity.SessionService;
import taxi.blizz.identity.VerifiedSubject;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.SubjectType;
import tools.jackson.databind.json.JsonMapper;

/** rider.v1.yaml address search against real PostgreSQL/PostGIS. */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class RiderAddressApiTests {

    private static final double LAT = 50.4501;
    private static final double LON = 30.5234;
    private static final String AREA = "SRID=4326;POLYGON((30.40 50.30,30.70 50.30,30.70 50.60,30.40 50.60,30.40 50.30))";

    @Autowired WebApplicationContext context;
    @Autowired SessionService sessions;
    @Autowired JdbcClient jdbc;
    @Autowired JsonMapper json;

    MockMvc mvc;
    UUID cityId;

    @BeforeEach
    void setUp() {
        List<Filter> filters = new ArrayList<>(context.getBeansOfType(Filter.class).values());
        AnnotationAwareOrderComparator.sort(filters);
        mvc = MockMvcBuilders.webAppContextSetup(context).addFilters(filters.toArray(Filter[]::new)).build();
        cityId = jdbc.sql("select id from city where code = 'rider-address-api-test'")
                .query(UUID.class).optional().orElseGet(this::createCity);
        jdbc.sql("delete from address_search_request").update();
        if (jdbc.sql("select count(*) from address where city_id = :city")
                .param("city", cityId).query(Integer.class).single() == 0) seedAddresses();
    }

    @Test
    void searchFindsExactHouseNotTwentySixAndHidesHiddenRecords() throws Exception {
        IssuedSession rider = riderSession();
        MvcResult result = search(rider, "Хрещатик 2", 10);
        assertThat(result.getResponse().getStatus()).isEqualTo(200);
        List<Map<String, Object>> items = list(result);
        assertThat(items).extracting(item -> item.get("house")).contains("2").doesNotContain("26");
        assertThat(items).allSatisfy(item -> assertThat(item)
                .containsKeys("id", "kind", "label", "street", "house", "pickup", "instructions")
                .doesNotContainKeys("version", "visibility", "aliases", "override"));
        assertThat(list(search(rider, "Секретна 7", 10))).isEmpty();
    }

    @Test
    void validatesAreaQueryAndCapsResultsAtTwenty() throws Exception {
        IssuedSession rider = riderSession();
        MvcResult outside = mvc.perform(get("/api/rider/v1/addresses")
                .header(HttpHeaders.AUTHORIZATION, bearer(rider)).param("query", "Хрещатик")
                .param("lat", "0").param("lon", "0")).andReturn();
        assertThat(outside.getResponse().getStatus()).isEqualTo(422);
        assertThat(body(outside)).containsEntry("code", "OUTSIDE_SERVICE_AREA");

        MvcResult shortQuery = search(rider, "Хр", 10);
        assertThat(shortQuery.getResponse().getStatus()).isEqualTo(400);
        assertThat(body(shortQuery)).containsEntry("code", "VALIDATION_FAILED");

        for (int i = 0; i < 25; i++) insertAddress("Test place " + i, "Broadway", "", LON + i * 0.00001, LAT, "ACTIVE");
        MvcResult capped = search(rider, "Broadway", 99);
        assertThat(capped.getResponse().getStatus()).isEqualTo(200);
        assertThat(list(capped)).hasSize(20);
    }

    @Test
    void nearestReturnsAddressOrNoContent() throws Exception {
        IssuedSession rider = riderSession();
        MvcResult found = mvc.perform(get("/api/rider/v1/addresses/nearest")
                .header(HttpHeaders.AUTHORIZATION, bearer(rider))
                .param("lat", Double.toString(LAT)).param("lon", Double.toString(LON))).andReturn();
        assertThat(found.getResponse().getStatus()).isEqualTo(200);
        assertThat(body(found)).containsEntry("house", "2");

        MvcResult none = mvc.perform(get("/api/rider/v1/addresses/nearest")
                .header(HttpHeaders.AUTHORIZATION, bearer(rider))
                .param("lat", "50.55").param("lon", "30.65")).andReturn();
        assertThat(none.getResponse().getStatus()).isEqualTo(204);
    }

    @Test
    void driverTokenIsRejectedForRiderEndpoint() throws Exception {
        UUID driver = UUID.randomUUID();
        jdbc.sql("insert into driver(id, phone_normalized, account_state, created_at, updated_at) values (:id,:phone,'ACTIVE',now(),now())")
                .param("id", driver).param("phone", taxi.blizz.TestPhones.unique("+38067", 7)).update();
        IssuedSession token = sessions.open(new VerifiedSubject(new Actor(SubjectType.DRIVER, driver), "ACTIVE", false), "driver-test");
        MvcResult result = mvc.perform(get("/api/rider/v1/addresses")
                .header(HttpHeaders.AUTHORIZATION, bearer(token)).param("query", "Хрещатик")
                .param("lat", Double.toString(LAT)).param("lon", Double.toString(LON))).andReturn();
        assertThat(result.getResponse().getStatus()).isIn(401, 403);
    }

    @Test
    void sixtyFirstSearchIsRateLimitedWithRetryAfter() throws Exception {
        IssuedSession rider = riderSession();
        for (int i = 0; i < 60; i++) assertThat(search(rider, "Хрещатик", 10).getResponse().getStatus()).isEqualTo(200);
        MvcResult limited = search(rider, "Хрещатик", 10);
        assertThat(limited.getResponse().getStatus()).isEqualTo(429);
        assertThat(limited.getResponse().getHeader(HttpHeaders.RETRY_AFTER)).isNotBlank();
        assertThat(body(limited)).containsEntry("code", "RATE_LIMITED");
    }

    private MvcResult search(IssuedSession rider, String query, int limit) throws Exception {
        return mvc.perform(get("/api/rider/v1/addresses").header(HttpHeaders.AUTHORIZATION, bearer(rider))
                .param("query", query).param("lat", Double.toString(LAT)).param("lon", Double.toString(LON))
                .param("language", "uk").param("limit", Integer.toString(limit))).andReturn();
    }

    private UUID createCity() {
        UUID id = UUID.randomUUID();
        jdbc.sql("insert into city(id,code,name,currency,timezone,polygon,priority,state,created_at,updated_at) values (:id,'rider-address-api-test','Test','UAH','Europe/Kyiv',ST_GeomFromEWKT(:area),9999,'PUBLISHED',now(),now())")
                .param("id", id).param("area", AREA).update();
        return id;
    }

    private void seedAddresses() {
        insertAddress("Хрещатик 2", "Хрещатик", "2", LON, LAT, "ACTIVE");
        insertAddress("Хрещатик 26", "Хрещатик", "26", LON + 0.0001, LAT, "ACTIVE");
        insertAddress("Секретна 7", "Секретна", "7", LON + 0.0002, LAT, "HIDDEN");
    }

    private void insertAddress(String label, String street, String house, double lon, double lat, String visibility) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                insert into address(id, city_id, type, label, language, street, street_normalized, house_raw,
                  house_number, house_suffix, building_normalized, house_normalized, pickup_point, source,
                  visibility, search_text, created_at, updated_at)
                values(:id,:city,'HOUSE',:label,'uk',:street,lower(:street),:house,:house,'','',:house,
                  ST_SetSRID(ST_MakePoint(:lon,:lat),4326),'OWN',:visibility,lower(:label || ' ' || :street || ' ' || :house),now(),now())
                """).param("id", id).param("city", cityId).param("label", label).param("street", street)
                .param("house", house).param("lon", lon).param("lat", lat).param("visibility", visibility).update();
    }

    private IssuedSession riderSession() {
        UUID rider = UUID.randomUUID();
        jdbc.sql("insert into client(id, phone_normalized, account_state, has_app, created_at, updated_at) values (:id,:phone,'ACTIVE',true,now(),now())")
                .param("id", rider).param("phone", taxi.blizz.TestPhones.unique("+38068", 7)).update();
        return sessions.open(new VerifiedSubject(new Actor(SubjectType.CLIENT, rider), "ACTIVE", false), "rider-test");
    }

    private String bearer(IssuedSession session) { return "Bearer " + session.accessToken(); }

    @SuppressWarnings("unchecked")
    private Map<String, Object> body(MvcResult result) throws Exception {
        return json.readValue(result.getResponse().getContentAsString(), Map.class);
    }

    @SuppressWarnings("unchecked")
    private List<Map<String, Object>> list(MvcResult result) throws Exception {
        return json.readValue(result.getResponse().getContentAsString(), List.class);
    }
}
