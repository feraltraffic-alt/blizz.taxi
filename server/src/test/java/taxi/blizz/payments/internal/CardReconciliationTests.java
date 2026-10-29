package taxi.blizz.payments.internal;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.test.util.ReflectionTestUtils;
import taxi.blizz.TestQuotes;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.SessionService;
import taxi.blizz.operations.CreateOrder;
import taxi.blizz.operations.Dispatch;
import taxi.blizz.operations.Orders;
import taxi.blizz.operations.PaymentMethod;
import taxi.blizz.operations.Trips;
import taxi.blizz.operations.WorkSessions;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.internal.OutboxRelay;
import taxi.blizz.pricing.QuoteService;

/** Deliberate statement errors against real holds, without changing money through reconciliation. */
@SpringBootTest(properties = "blizz.payments.reconciliation.enabled=false")
@Import(TestcontainersConfiguration.class)
class CardReconciliationTests {
    static final GeoPoint PICKUP = new GeoPoint(-39.5, -119.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, -119.45);
    @Autowired JdbcClient jdbc;
    @Autowired Orders orders;
    @Autowired Dispatch dispatch;
    @Autowired Trips trips;
    @Autowired WorkSessions sessions;
    @Autowired SessionService auth;
    @Autowired QuoteService quotes;
    @Autowired FakeProvider.Gateway gateway;
    @Autowired ApplicationContext context;
    @Autowired OutboxRelay relay;
    TestRides rides;
    UUID city;
    UUID merchant;
    UUID operation;
    String account;
    Map<String, Object> statement;

    @BeforeEach
    void heldCardOrder() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        city = rides.city("test-card-reconciliation", "UAH", -120);
        merchant = UUID.randomUUID();
        account = "reconciliation_" + merchant;
        jdbc.sql("""
                insert into payment_merchant(id,provider,account,domain,secret_ref,currency,created_at)
                values (:id,'FAKE',:account,'example.test','test','UAH',now())
                """).param("id", merchant).param("account", account).update();
        jdbc.sql("""
                insert into payment_merchant_city(city_id,merchant_id) values (:city,:merchant)
                on conflict (city_id) do update set merchant_id=excluded.merchant_id
                """).param("city", city).param("merchant", merchant).update();
        Actor rider = rides.client();
        jdbc.sql("""
                insert into payment_card(id,client_id,merchant_id,token,masked_pan,card_type,state,created_at)
                values (:id,:client,:merchant,:token,'41****1111','Visa','ACTIVE',now())
                """).param("id", UUID.randomUUID()).param("client", rider.id()).param("merchant", merchant)
                .param("token", "tok-" + rider.id()).update();
        UUID quote = new TestQuotes(jdbc, quotes).quote(rider, city, "STANDARD", PICKUP, DROPOFF).id();
        UUID order = orders.create(rider, UUID.randomUUID(), new CreateOrder(rider.id(), "STANDARD", PICKUP,
                "Home", DROPOFF, "Work", PaymentMethod.CARD, quote)).id();
        Map<String, Object> op = jdbc.sql("""
                select o.id,o.reference,o.amount_minor,o.state from payment_operation o
                join payment_intent i on i.id=o.intent_id where i.order_id=:order and o.type='AUTH'
                """).param("order", order).query().singleRow();
        assertThat(op.get("state")).isEqualTo("SUCCEEDED");
        operation = (UUID) op.get("id");
        statement = new LinkedHashMap<>(Map.of("orderReference", op.get("reference"), "transactionType", "PURCHASE",
                "transactionStatus", "WaitingAuthComplete", "amount", WayForPayProvider.amount(((Number) op.get("amount_minor")).longValue()),
                "currency", "UAH", "createdDate", OffsetDateTime.now().toEpochSecond(),
                "processingDate", OffsetDateTime.now().toEpochSecond(), "fee", "1.23"));
    }

    @Test void amountMismatchIsExactlyOneItem() { statement.put("amount", "0.01"); difference("AMOUNT"); }
    @Test void currencyMismatchIsExactlyOneItem() { statement.put("currency", "PLN"); difference("CURRENCY"); }
    @Test void stateMismatchIsExactlyOneItem() { statement.put("transactionStatus", "Declined"); difference("STATE"); }
    @Test void absentProviderRowIsExactlyOneItem() { override(List.of()); differenceAlreadyOverridden("MISSING_AT_PROVIDER"); }
    @Test void absentLocalRowIsExactlyOneItem() {
        Map<String,Object> extra = new LinkedHashMap<>(statement);
        extra.put("orderReference", "unrecorded-bank-charge");
        extra.put("transactionStatus", "Approved");
        override(List.of(statement, extra));
        differenceAlreadyOverridden("MISSING_LOCALLY");
    }
    @Test void aFinalProviderAnswerDoesNotApplyAnUnknownLocalOperation() {
        jdbc.sql("update payment_operation set state='UNKNOWN' where id=:id").param("id", operation).update();
        difference("UNKNOWN_STILL");
    }

    @Test
    void cleanDayAndThreeRerunsKeepOneImmutableSnapshot() {
        override(List.of(statement));
        UUID first = run();
        assertThat(run()).isEqualTo(first);
        assertThat(run()).isEqualTo(first);
        assertThat(jdbc.sql("select state from payment_reconciliation where id=:id").param("id", first)
                .query(String.class).single()).isEqualTo("CLEAN");
        assertThat(jdbc.sql("select count(*) from payment_reconciliation_item where run_id=:id").param("id", first)
                .query(Long.class).single()).isZero();
    }

    @Test
    void providerFailureIsFailedWithUnknownCountsAndRetryReusesTheRun() {
        override(Map.of("reasonCode", 1113, "transactionList", List.of()));
        UUID first = run();
        Map<String,Object> failed = jdbc.sql("select * from payment_reconciliation where id=:id")
                .param("id", first).query().singleRow();
        assertThat(failed.get("state")).isEqualTo("FAILED");
        assertThat(failed.get("provider_count")).isNull();
        assertThat(failed.get("item_count")).isNull();
        assertThat(failed.get("failure_code")).isEqualTo("RECONCILIATION_INVALID_RESPONSE");
        override(List.of(statement));
        assertThat(run()).isEqualTo(first);
        assertThat(jdbc.sql("select state from payment_reconciliation where id=:id").param("id", first)
                .query(String.class).single()).isEqualTo("CLEAN");
    }

    private void difference(String kind) { override(List.of(statement)); differenceAlreadyOverridden(kind); }

    private void differenceAlreadyOverridden(String kind) {
        String before = moneySnapshot();
        UUID id = run();
        assertThat(run()).isEqualTo(id);
        assertThat(jdbc.sql("select kind from payment_reconciliation_item where run_id=:id")
                .param("id", id).query(String.class).list()).containsExactly(kind);
        assertThat(jdbc.sql("select state from payment_reconciliation where id=:id").param("id", id)
                .query(String.class).single()).isEqualTo("OPEN");
        assertThat(moneySnapshot()).isEqualTo(before);
        while (relay.runOnce() > 0) { /* actual event consumer */ }
        assertThat(jdbc.sql("select count(*) from support_case where source_key=:source")
                .param("source", "reconciliation:" + id).query(Long.class).single()).isEqualTo(1);
        String persisted = jdbc.sql("select coalesce(jsonb_agg(to_jsonb(i))::text,'[]') from payment_reconciliation_item i where run_id=:id")
                .param("id", id).query(String.class).single();
        assertThat(persisted).doesNotContain("41****1111", "fixture-customer", "fixture-token");
    }

    private String moneySnapshot() {
        return jdbc.sql("""
                select jsonb_build_object(
                  'operations',(select jsonb_agg(to_jsonb(o) order by o.id) from payment_operation o join payment_intent i on i.id=o.intent_id where i.merchant_id=:merchant),
                  'intents',(select jsonb_agg(to_jsonb(i) order by i.id) from payment_intent i where i.merchant_id=:merchant),
                  'journal',(select count(*) from journal_line))::text
                """).param("merchant", merchant).query(String.class).single();
    }

    private void override(List<Map<String,Object>> rows) {
        override(Map.of("reasonCode", 1100, "transactionList", rows));
    }
    private void override(Map<String,Object> response) {
        ReflectionTestUtils.invokeMethod(gateway, "reconciliationList", account, response);
    }
    private UUID run() {
        Object result = ReflectionTestUtils.invokeMethod(context.getBean("cardReconciliation"), "run", merchant,
                LocalDate.now(ZoneOffset.UTC), true);
        return ReflectionTestUtils.invokeMethod(result, "id");
    }
}
