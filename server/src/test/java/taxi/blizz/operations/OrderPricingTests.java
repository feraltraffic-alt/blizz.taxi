package taxi.blizz.operations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import jakarta.servlet.Filter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
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
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import taxi.blizz.TestQuotes;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.IssuedSession;
import taxi.blizz.identity.SessionService;
import taxi.blizz.identity.VerifiedSubject;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.pricing.QuoteService;
import tools.jackson.databind.json.JsonMapper;

/** An order consumes a quote: REQ-PRC-05, REQ-PRC-06, REQ-PRC-07; rider POST /quotes and POST /orders. */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class OrderPricingTests {

    static final String AREA = "SRID=4326;MULTIPOLYGON(((130 -40,131 -40,131 -39,130 -39,130 -40)))";
    static final GeoPoint PICKUP = new GeoPoint(-39.5, 130.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 130.55);

    @Autowired
    Orders orders;
    @Autowired
    QuoteService quoteService;
    @Autowired
    SessionService sessions;
    @Autowired
    WebApplicationContext context;
    @Autowired
    JsonMapper json;
    @Autowired
    JdbcClient jdbc;

    UUID cityId;
    TestQuotes quotes;

    @BeforeEach
    void city() {
        cityId = jdbc.sql("select id from city where code = 'test-order-pricing'").query(UUID.class).optional()
                .orElseGet(() -> {
                    UUID id = UUID.randomUUID();
                    jdbc.sql("""
                                    insert into city (id, code, name, currency, timezone, polygon, priority, state,
                                                      created_at, updated_at)
                                    values (:id, 'test-order-pricing', 'Pricing', 'PLN', 'Europe/Warsaw',
                                            ST_GeomFromEWKT(:area), 7780, 'PUBLISHED', now(), now())""")
                            .param("id", id).param("area", AREA).update();
                    return id;
                });
        quotes = new TestQuotes(jdbc, quoteService);
        quotes.ensureClass(cityId, "STANDARD");
        quotes.ensureClass(cityId, "COMFORT");
    }

    private Actor client() {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into client (id, phone_normalized, account_state, has_app, created_at, updated_at)
                        values (:id, :phone, 'ACTIVE', true, now(), now())""")
                .param("id", id)
                .param("phone", "+48" + String.format("%09d", Math.floorMod(id.hashCode(), 1_000_000_000)))
                .update();
        return new Actor(SubjectType.CLIENT, id);
    }

    private QuoteService.Quote quote(Actor payer, String vehicleClass) {
        return quotes.quote(payer, cityId, vehicleClass, PICKUP, DROPOFF);
    }

    private OrderView order(Actor payer, UUID commandId, String vehicleClass, GeoPoint dropoff, UUID quoteId) {
        return orders.create(payer, commandId, new CreateOrder(payer.id(), vehicleClass, PICKUP, "Home", dropoff,
                "Work", PaymentMethod.CASH, quoteId));
    }

    private static void assertCode(ThrowingCallable call, ErrorCode code) {
        assertThatThrownBy(call).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }

    @Test
    void theOrderTakesThePriceOfItsQuote() {
        Actor payer = client();
        QuoteService.Quote quote = quote(payer, "STANDARD");

        OrderView order = order(payer, UUID.randomUUID(), "STANDARD", DROPOFF, quote.id());

        assertThat(quote.amountMinor()).isPositive();
        assertThat(order.priceMinor()).isEqualTo(quote.amountMinor());
        assertThat(order.currency()).isEqualTo("PLN");
        assertThat(order.vehicleClass()).isEqualTo("STANDARD");
        assertThat(jdbc.sql("select quote_id from ride_order where id = :id").param("id", order.id())
                .query(UUID.class).single()).isEqualTo(quote.id());
    }

    @Test
    void aQuoteServesOneOrderAndARepeatReturnsThatOrder() {
        Actor payer = client();
        UUID quoteId = quote(payer, "STANDARD").id();
        UUID command = UUID.randomUUID();

        OrderView first = order(payer, command, "STANDARD", DROPOFF, quoteId);
        OrderView repeat = order(payer, command, "STANDARD", DROPOFF, quoteId);
        assertThat(repeat.id()).isEqualTo(first.id());

        orders.cancel(payer, UUID.randomUUID(), first.id(), orders.get(first.id()).version(), "CHANGED_MIND");
        assertCode(() -> order(payer, UUID.randomUUID(), "STANDARD", DROPOFF, quoteId), ErrorCode.QUOTE_EXPIRED);
    }

    @Test
    void theQuoteMustMatchTheOrder() {
        Actor payer = client();
        Actor stranger = client();
        UUID quoteId = quote(payer, "STANDARD").id();

        assertCode(() -> order(payer, UUID.randomUUID(), "STANDARD", new GeoPoint(-39.4, 130.6), quoteId),
                ErrorCode.QUOTE_MISMATCH);
        assertCode(() -> order(payer, UUID.randomUUID(), "COMFORT", DROPOFF, quoteId), ErrorCode.QUOTE_MISMATCH);
        assertCode(() -> order(stranger, UUID.randomUUID(), "STANDARD", DROPOFF, quoteId), ErrorCode.QUOTE_MISMATCH);
        assertCode(() -> order(payer, UUID.randomUUID(), "STANDARD", DROPOFF, UUID.randomUUID()),
                ErrorCode.QUOTE_MISMATCH);
        assertCode(() -> order(payer, UUID.randomUUID(), "STANDARD", DROPOFF, null), ErrorCode.VALIDATION_FAILED);
        assertCode(() -> order(payer, UUID.randomUUID(), "LIMO", DROPOFF, quoteId), ErrorCode.VALIDATION_FAILED);

        assertThat(order(payer, UUID.randomUUID(), "STANDARD", DROPOFF, quoteId).status()).isEqualTo("SEARCHING");
    }

    @Test
    void anExpiredQuoteIsRefused() {
        Actor payer = client();
        UUID quoteId = quote(payer, "STANDARD").id();
        jdbc.sql("""
                        update quote set created_at = now() - interval '10 minutes',
                                         expires_at = now() - interval '5 minutes' where id = :id""")
                .param("id", quoteId).update();

        assertCode(() -> order(payer, UUID.randomUUID(), "STANDARD", DROPOFF, quoteId), ErrorCode.QUOTE_EXPIRED);
    }

    // ------------------------------------------------------------ rider HTTP

    @Test
    @SuppressWarnings("unchecked")
    void riderGetsClassesThenAQuoteThenAnOrder() throws Exception {
        List<Filter> filters = new ArrayList<>(context.getBeansOfType(Filter.class).values());
        AnnotationAwareOrderComparator.sort(filters);
        MockMvc mvc = MockMvcBuilders.webAppContextSetup(context).addFilters(filters.toArray(Filter[]::new)).build();
        Actor rider = client();
        IssuedSession session = sessions.open(new VerifiedSubject(rider, "ACTIVE", false), "phone");
        String bearer = "Bearer " + session.accessToken();
        Map<String, Object> pickup = Map.of("lat", PICKUP.lat(), "lon", PICKUP.lon());
        Map<String, Object> dropoff = Map.of("lat", DROPOFF.lat(), "lon", DROPOFF.lon());

        MvcResult classes = mvc.perform(get("/api/rider/v1/vehicle-classes")
                .param("lat", String.valueOf(PICKUP.lat())).param("lon", String.valueOf(PICKUP.lon()))
                .header(HttpHeaders.AUTHORIZATION, bearer)).andReturn();
        assertThat(classes.getResponse().getStatus()).isEqualTo(200);
        List<Map<String, Object>> options = json.readValue(classes.getResponse().getContentAsString(), List.class);
        assertThat(options).extracting(o -> o.get("code")).contains("COMFORT", "STANDARD");

        MvcResult quoted = mvc.perform(MockMvcRequestBuilders.post("/api/rider/v1/quotes")
                .header(HttpHeaders.AUTHORIZATION, bearer).contentType(MediaType.APPLICATION_JSON)
                .content(json.writeValueAsString(Map.of("command_id", UUID.randomUUID(), "vehicle_class", "STANDARD",
                        "pickup", pickup, "dropoff", dropoff)))).andReturn();
        assertThat(quoted.getResponse().getStatus()).isEqualTo(201);
        Map<String, Object> quote = json.readValue(quoted.getResponse().getContentAsString(), Map.class);
        assertThat(quote).containsEntry("currency", "PLN").containsKeys("id", "amount_minor", "expires_at");

        MvcResult created = mvc.perform(MockMvcRequestBuilders.post("/api/rider/v1/orders")
                .header(HttpHeaders.AUTHORIZATION, bearer).contentType(MediaType.APPLICATION_JSON)
                .content(json.writeValueAsString(Map.of("command_id", UUID.randomUUID(), "quote_id", quote.get("id"),
                        "vehicle_class", "STANDARD", "pickup", pickup, "pickup_label", "Home",
                        "dropoff", dropoff, "dropoff_label", "Work", "payment_method", "CASH")))).andReturn();
        assertThat(created.getResponse().getStatus()).isEqualTo(201);
        Map<String, Object> order = json.readValue(created.getResponse().getContentAsString(), Map.class);
        assertThat(order).containsEntry("channel", "APP").containsEntry("currency", "PLN");
        assertThat(((Number) order.get("price_minor")).longValue())
                .isEqualTo(((Number) quote.get("amount_minor")).longValue());

        MvcResult outside = mvc.perform(MockMvcRequestBuilders.post("/api/rider/v1/quotes")
                .header(HttpHeaders.AUTHORIZATION, bearer).contentType(MediaType.APPLICATION_JSON)
                .content(json.writeValueAsString(Map.of("command_id", UUID.randomUUID(), "vehicle_class", "STANDARD",
                        "pickup", Map.of("lat", 10, "lon", 10), "dropoff", dropoff)))).andReturn();
        assertThat(outside.getResponse().getStatus()).isEqualTo(422);
    }
}
