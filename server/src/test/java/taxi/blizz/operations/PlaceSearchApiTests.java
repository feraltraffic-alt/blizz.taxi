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
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.geo.AddressBook;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.ApiAudience;
import taxi.blizz.identity.SessionService;
import taxi.blizz.identity.VerifiedSubject;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.SubjectType;
import tools.jackson.databind.json.JsonMapper;

/**
 * The address field (ADR 0012, Q-08): the rider's past places first, then own addresses, then the provider (FAKE in
 * tests); nothing from the provider is stored.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class PlaceSearchApiTests {

    /** Longitude 145…146: no other test city is there. */
    private static final String AREA = "SRID=4326;MULTIPOLYGON(((145 -40,146 -40,146 -39,145 -39,145 -40)))";
    private static final GeoPoint CENTRE = new GeoPoint(-39.5, 145.5);

    @Autowired SessionService auth;
    @Autowired AddressBook addresses;
    @Autowired JdbcClient jdbc;
    @Autowired WebApplicationContext context;
    @Autowired JsonMapper json;

    MockMvc mvc;
    UUID city;
    Actor rider;
    String phone;

    @BeforeEach
    void setUp() {
        List<Filter> filters = new ArrayList<>(context.getBeansOfType(Filter.class).values());
        AnnotationAwareOrderComparator.sort(filters);
        mvc = MockMvcBuilders.webAppContextSetup(context).addFilters(filters.toArray(Filter[]::new)).build();
        city = jdbc.sql("select id from city where code = 'test-places'").query(UUID.class).optional()
                .orElseGet(() -> {
                    UUID id = UUID.randomUUID();
                    jdbc.sql("""
                                    insert into city (id, code, name, currency, timezone, polygon, priority, state,
                                                      created_at, updated_at)
                                    values (:id, 'test-places', 'Places test', 'UAH', 'UTC', ST_GeomFromEWKT(:area),
                                            7651, 'PUBLISHED', now(), now())""")
                            .param("id", id).param("area", AREA).update();
                    Actor manager = staffActor("SUPER_ADMIN", new String[0]);
                    addresses.create(new AddressBook.Create(UUID.randomUUID(), manager, 0, new AddressBook.Data(id,
                            AddressBook.Kind.HOUSE, "Хрещатик 1", "uk", "Хрещатик", "1", null,
                            new GeoPoint(-39.5, 145.5), "Біля арки", null), "Test own address"));
                    return id;
                });
        UUID clientId = UUID.randomUUID();
        phone = "+48" + String.format("%09d", Math.floorMod(clientId.hashCode(), 1_000_000_000));
        jdbc.sql("""
                        insert into client (id, phone_normalized, account_state, has_app, created_at, updated_at)
                        values (:id, :phone, 'ACTIVE', true, now(), now())""")
                .param("id", clientId).param("phone", phone).update();
        rider = new Actor(SubjectType.CLIENT, clientId);
        pastOrder(rider.id(), "Хрещатик 1", "Вокзал", 3);   // the same label as the own address: once, as HISTORY
        pastOrder(rider.id(), "Хрещатик 22", "Аеропорт", 1);
    }

    @Test
    @SuppressWarnings("unchecked")
    void historyComesFirstThenOwnAddressesThenTheProvider() throws Exception {
        Map<String, Object> body = body(getAuth("/api/rider/v1/places?query=Хрещ&lat=-39.5&lon=145.5&limit=6",
                token(rider)));
        assertThat(body.get("provider")).isEqualTo("FAKE");
        List<Map<String, Object>> places = (List<Map<String, Object>>) body.get("places");
        assertThat(places).extracting(p -> p.get("source") + ":" + p.get("label")).containsExactly(
                "HISTORY:Хрещатик 22", "HISTORY:Хрещатик 1", "FAKE:Хрещ, 1", "FAKE:Хрещ, 2", "FAKE:Хрещ, 3");
        assertThat(jdbc.sql("select count(*) from address where label like 'Хрещ, %'").query(Long.class).single())
                .as("nothing of the provider is stored").isZero();

        // Without a query: the latest places of the history only, no provider call.
        List<Map<String, Object>> recent = (List<Map<String, Object>>) body(getAuth(
                "/api/rider/v1/places?lat=-39.5&lon=145.5", token(rider))).get("places");
        assertThat(recent).extracting(p -> p.get("label")).containsExactly("Хрещатик 22", "Аеропорт", "Хрещатик 1",
                "Вокзал");
        assertThat(recent).allSatisfy(p -> assertThat(p.get("source")).isEqualTo("HISTORY"));
    }

    @Test
    @SuppressWarnings("unchecked")
    void anotherRiderSeesNoneOfThisHistoryAndAFailingProviderLeavesOwnAddresses() throws Exception {
        Actor other = new Actor(SubjectType.CLIENT, UUID.randomUUID());
        jdbc.sql("""
                        insert into client (id, phone_normalized, account_state, has_app, created_at, updated_at)
                        values (:id, :phone, 'ACTIVE', true, now(), now())""")
                .param("id", other.id())
                .param("phone", "+48" + String.format("%09d", Math.floorMod(other.id().hashCode(), 1_000_000_000)))
                .update();
        List<Map<String, Object>> places = (List<Map<String, Object>>) body(getAuth(
                "/api/rider/v1/places?query=Хрещатик&lat=-39.5&lon=145.5", token(other))).get("places");
        assertThat(places).extracting(p -> p.get("source")).doesNotContain("HISTORY");
        assertThat(places.getFirst()).containsEntry("source", "OWN").containsEntry("label", "Хрещатик 1")
                .containsEntry("instructions", "Біля арки");

        List<Map<String, Object>> failing = (List<Map<String, Object>>) body(getAuth(
                "/api/rider/v1/places?query=fail&lat=-39.5&lon=145.5", token(other))).get("places");
        assertThat(failing).isEmpty();
        assertThat(getAuth("/api/rider/v1/places?query=x&lat=50&lon=10", token(other)).getResponse().getStatus())
                .as("outside the service area").isEqualTo(422);
    }

    @Test
    @SuppressWarnings("unchecked")
    void reverseFindsAnOwnAddressNearbyElseTheProvidersOne() throws Exception {
        Map<String, Object> own = body(getAuth("/api/rider/v1/places/reverse?lat=-39.5003&lon=145.5", token(rider)));
        assertThat(own).containsEntry("source", "OWN").containsEntry("label", "Хрещатик 1");
        Map<String, Object> far = body(getAuth("/api/rider/v1/places/reverse?lat=-39.3&lon=145.2", token(rider)));
        assertThat(far).containsEntry("source", "FAKE").containsEntry("label", "Fake street 1");
    }

    @Test
    @SuppressWarnings("unchecked")
    void theOperatorGetsTheCallersHistoryAndNeedsTheRightForTheCity() throws Exception {
        String operator = staffToken(new String[]{Orders.CREATE_PERMISSION}, city);
        List<Map<String, Object>> places = (List<Map<String, Object>>) body(mvc.perform(
                get("/api/operator/v1/places").param("query", "Аеро").param("lat", "-39.5").param("lon", "145.5")
                        .param("caller_phone", phone).header(HttpHeaders.AUTHORIZATION, "Bearer " + operator))
                .andReturn()).get("places");
        assertThat(places.getFirst()).containsEntry("source", "HISTORY").containsEntry("label", "Аеропорт");

        List<Map<String, Object>> stranger = (List<Map<String, Object>>) body(getAuth(
                "/api/operator/v1/places?query=Аеро&lat=-39.5&lon=145.5", operator)).get("places");
        assertThat(stranger).extracting(p -> p.get("source")).doesNotContain("HISTORY");

        String otherCity = staffToken(new String[]{Orders.CREATE_PERMISSION}, UUID.randomUUID());
        assertThat(getAuth("/api/operator/v1/places?query=Аеро&lat=-39.5&lon=145.5", otherCity).getResponse()
                .getStatus()).isEqualTo(403);
    }

    // ---------------------------------------------------------------- fixtures

    /** A fulfilled order of the rider, {@code daysAgo} days ago. */
    private void pastOrder(UUID payer, String pickupLabel, String dropoffLabel, int daysAgo) {
        jdbc.sql("""
                        insert into ride_order (id, channel, created_by_type, created_by_id, payer_client_id, city_id,
                            vehicle_class, pickup, pickup_label, dropoff, dropoff_label, payment_method, status,
                            created_at, updated_at, version)
                        values (:id, 'APP', 'CLIENT', :payer, :payer, :city, 'STANDARD',
                            ST_SetSRID(ST_MakePoint(145.5, -39.5), 4326), :pickup,
                            ST_SetSRID(ST_MakePoint(145.6, -39.6), 4326), :dropoff, 'CASH', 'FULFILLED',
                            now() - make_interval(days => :days), now(), 1)""")
                .param("id", UUID.randomUUID()).param("payer", payer).param("city", city)
                .param("pickup", pickupLabel).param("dropoff", dropoffLabel).param("days", daysAgo).update();
    }

    private Actor staffActor(String role, String[] permissions, UUID... cities) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, city_scope, state, created_at,
                                                updated_at)
                        values (:id, :login, 'Places', :role, :permissions, :scope, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "places-" + id).param("role", role)
                .param("permissions", permissions).param("scope", cities).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private String staffToken(String[] permissions, UUID... cities) {
        return auth.openStaff(new VerifiedSubject(staffActor("OPERATOR", permissions, cities), "ACTIVE", false),
                ApiAudience.OPERATOR, null).accessToken();
    }

    private String token(Actor actor) {
        return auth.open(new VerifiedSubject(actor, "ACTIVE", false), "places-test").accessToken();
    }

    private MvcResult getAuth(String path, String token) throws Exception {
        return mvc.perform(get(path).header(HttpHeaders.AUTHORIZATION, "Bearer " + token)).andReturn();
    }

    @SuppressWarnings("unchecked")
    private Map<String, Object> body(MvcResult result) throws Exception {
        assertThat(result.getResponse().getStatus()).as(result.getResponse().getContentAsString()).isEqualTo(200);
        return json.readValue(result.getResponse().getContentAsString(), Map.class);
    }
}
