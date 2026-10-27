package taxi.blizz.payments;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

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
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.identity.SessionService;
import taxi.blizz.identity.VerifiedSubject;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;
import tools.jackson.databind.json.JsonMapper;

/** Adding a card on the provider's page and the provider's notification (ADR 0008, REQ-PAY-08, REQ-PAY-11). */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class CardBindingTests {

    @Autowired
    PaymentCards cards;
    @Autowired
    JdbcClient jdbc;
    @Autowired
    SessionService auth;
    @Autowired
    WebApplicationContext context;
    @Autowired
    JsonMapper json;

    MockMvc mvc;
    UUID cityId;
    UUID merchantId;

    @BeforeEach
    void setUp() {
        List<Filter> filters = new ArrayList<>(context.getBeansOfType(Filter.class).values());
        AnnotationAwareOrderComparator.sort(filters);
        mvc = MockMvcBuilders.webAppContextSetup(context).addFilters(filters.toArray(Filter[]::new)).build();
        cityId = UUID.randomUUID();
        merchantId = UUID.randomUUID();
        jdbc.sql("""
                        insert into payment_merchant (id, provider, account, domain, secret_ref, currency, created_at)
                        values (:id, 'FAKE', :account, 'test.blizz.invalid', 'test', 'UAH', now())""")
                .param("id", merchantId).param("account", "test_" + merchantId).update();
        jdbc.sql("insert into payment_merchant_city (city_id, merchant_id) values (:city, :merchant)")
                .param("city", cityId).param("merchant", merchantId).update();
    }

    private Actor rider() {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into client (id, phone_normalized, account_state, has_app, created_at, updated_at)
                        values (:id, :phone, 'ACTIVE', true, now(), now())""")
                .param("id", id).param("phone", "+48" + String.format("%09d", Math.floorMod(id.hashCode(), 1_000_000_000)))
                .update();
        return new Actor(SubjectType.CLIENT, id);
    }

    private static void assertCode(ThrowingCallable call, ErrorCode code) {
        assertThatThrownBy(call).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }

    /** What the rider's web view does: post the form fields to the provider page. */
    private MvcResult submit(PaymentCards.Binding binding, String... extra) throws Exception {
        assertThat(binding.url()).isEqualTo("http://blizz.test/payments/v1/fake/verify");
        MockHttpServletRequestBuilder request = post("/payments/v1/fake/verify")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED);
        binding.fields().forEach(request::param);
        for (String field : extra) {
            request.param(field, "1");
        }
        return mvc.perform(request).andReturn();
    }

    @Test
    void theRiderAddsACardAndOnlyTheTokenIsKept() throws Exception {
        Actor rider = rider();
        UUID command = UUID.randomUUID();
        PaymentCards.Binding started = cards.startBinding(rider, command, cityId);
        assertThat(cards.startBinding(rider, command, cityId)).isEqualTo(started);
        assertThat(started.state()).isEqualTo("PENDING");
        assertThat(started.fields()).containsEntry("amount", "0").containsEntry("paymentSystem", "lookupCard")
                .containsEntry("serviceUrl", "http://blizz.test/payments/v1/callbacks/" + merchantId)
                .containsKey("merchantSignature");

        MvcResult page = submit(started);
        assertThat(page.getResponse().getStatus()).isEqualTo(303);
        assertThat(page.getResponse().getHeader("Location")).isEqualTo(started.returnUrl());

        PaymentCards.Binding done = cards.binding(rider, started.id());
        assertThat(done.state()).isEqualTo("COMPLETED");
        assertThat(done.card().maskedPan()).startsWith("41****");
        assertThat(cards.cards(rider)).extracting(PaymentCards.Card::id).containsExactly(done.card().id());
        assertThat(cards.cardFor(rider.id(), cityId)).map(PaymentCards.Card::id).contains(done.card().id());
        assertThat(cards.cardFor(rider.id(), UUID.randomUUID())).isEmpty();

        String token = auth.open(new VerifiedSubject(rider, "ACTIVE", false), "cards-test").accessToken();
        MvcResult listed = mvc.perform(get("/api/rider/v1/cards").header(HttpHeaders.AUTHORIZATION, "Bearer " + token))
                .andReturn();
        assertThat(listed.getResponse().getStatus()).isEqualTo(200);
        assertThat(listed.getResponse().getContentAsString()).contains("41****").doesNotContain("fake-");
        assertThat(jdbc.sql("select payload::text from payment_event where reference = :ref")
                .param("ref", "card-" + started.id()).query(String.class).single()).doesNotContain("fake-");

        assertCode(() -> cards.binding(rider(), started.id()), ErrorCode.NOT_FOUND);
        cards.remove(rider, UUID.randomUUID(), done.card().id());
        assertThat(cards.cards(rider)).isEmpty();
        assertCode(() -> cards.remove(rider, UUID.randomUUID(), done.card().id()), ErrorCode.NOT_FOUND);
    }

    @Test
    void forgedRepeatedAndDeclinedNotifications() throws Exception {
        Actor rider = rider();
        PaymentCards.Binding declined = cards.startBinding(rider, UUID.randomUUID(), cityId);
        submit(declined, "fake_decline");
        PaymentCards.Binding failed = cards.binding(rider, declined.id());
        assertThat(failed.state()).isEqualTo("FAILED");
        assertThat(failed.failureReason()).isEqualTo("Card declined");
        assertThat(cards.cards(rider)).isEmpty();

        // A forged notification (wrong signature) changes nothing and is answered 400.
        PaymentCards.Binding open = cards.startBinding(rider, UUID.randomUUID(), cityId);
        Map<String, Object> forged = Map.of("merchantAccount", "test_" + merchantId, "orderReference",
                "card-" + open.id(), "amount", 0, "currency", "UAH", "cardPan", "41****0000", "recToken", "stolen",
                "transactionStatus", "Approved", "reasonCode", 1100, "merchantSignature", "0".repeat(32));
        MvcResult rejected = mvc.perform(post("/payments/v1/callbacks/" + merchantId)
                .contentType(MediaType.APPLICATION_JSON).content(json.writeValueAsString(forged))).andReturn();
        assertThat(rejected.getResponse().getStatus()).isEqualTo(400);
        assertThat(cards.binding(rider, open.id()).state()).isEqualTo("PENDING");

        // The real notification is accepted; a late "Declined" for the same binding does not undo the card.
        submit(open);
        assertThat(cards.binding(rider, open.id()).state()).isEqualTo("COMPLETED");
        submit(open, "fake_decline");
        assertThat(cards.binding(rider, open.id()).state()).isEqualTo("COMPLETED");
        assertThat(cards.cards(rider)).hasSize(1);
        assertThat(jdbc.sql("select count(*) from payment_event where reference = :ref")
                .param("ref", "card-" + open.id()).query(Long.class).single()).isEqualTo(2);

        assertCode(() -> cards.startBinding(rider, UUID.randomUUID(), UUID.randomUUID()), ErrorCode.NOT_FOUND);
        assertCode(() -> cards.cards(new Actor(SubjectType.DRIVER, UUID.randomUUID())), ErrorCode.ACCESS_DENIED);
    }
}
