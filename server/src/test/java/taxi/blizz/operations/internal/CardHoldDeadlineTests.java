package taxi.blizz.operations.internal;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.scheduling.annotation.Scheduled;
import taxi.blizz.TestQuotes;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.SessionService;
import taxi.blizz.operations.CreateOrder;
import taxi.blizz.operations.Dispatch;
import taxi.blizz.operations.OrderView;
import taxi.blizz.operations.Orders;
import taxi.blizz.operations.PaymentMethod;
import taxi.blizz.operations.Trips;
import taxi.blizz.operations.WorkSessions;
import taxi.blizz.payments.CardPayments;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.internal.OutboxRelay;
import taxi.blizz.pricing.QuoteService;

/**
 * REQ-PAY-02, E1 of #140: a card order waits for its hold at most the deadline (3 minutes by default). Past it, with
 * the bank silent, the order ends UNFULFILLED with PAYMENT_TIMEOUT, the rider is told, and the hold is released: the
 * late success is voided, nothing is captured and nothing is posted.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class CardHoldDeadlineTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, -143.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, -143.45);
    static final Duration DEADLINE = Duration.ofMinutes(3);

    @Autowired Orders orders;
    @Autowired Dispatch dispatch;
    @Autowired Trips trips;
    @Autowired WorkSessions sessions;
    @Autowired SessionService auth;
    @Autowired QuoteService quotes;
    @Autowired CardPayments payments;
    @Autowired org.springframework.context.ApplicationContext context;
    @Autowired OutboxRelay relay;
    @Autowired CardHoldDeadline deadline;
    @Autowired JdbcClient jdbc;

    taxi.blizz.payments.internal.TestPayments testPayments;
    TestRides rides;
    UUID cityId;
    UUID merchantId;

    @BeforeEach
    void setUp() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        testPayments = new taxi.blizz.payments.internal.TestPayments(context);
        cityId = rides.city("test-card-hold-deadline", "UAH", -144);
        merchantId = jdbc.sql("select merchant_id from payment_merchant_city where city_id = :city")
                .param("city", cityId).query(UUID.class).optional().orElseGet(() -> {
                    UUID id = UUID.randomUUID();
                    jdbc.sql("""
                                    insert into payment_merchant (id, provider, account, domain, secret_ref, currency,
                                                                  created_at)
                                    values (:id, 'FAKE', :account, 'test.blizz.invalid', 'test', 'UAH', now())""")
                            .param("id", id).param("account", "deadline_" + id).update();
                    jdbc.sql("insert into payment_merchant_city (city_id, merchant_id) values (:city, :merchant)")
                            .param("city", cityId).param("merchant", id).update();
                    return id;
                });
        testPayments.resetGateway();
    }

    /**
     * Payment operations of this class's city that are still open would be picked up by the worker of the next test
     * class and take its scripted answers: settle them, then cancel what is left, and clear the script.
     */
    @org.junit.jupiter.api.AfterEach
    void cleanUp() {
        testPayments.settle();
        jdbc.sql("""
                        update payment_operation set state = 'CANCELLED', updated_at = now()
                        where state in ('CREATED', 'SENDING', 'PENDING', 'UNKNOWN')
                          and intent_id in (select i.id from payment_intent i join ride_order o on o.id = i.order_id
                                            where o.city_id = :city)""")
                .param("city", cityId).update();
        testPayments.resetGateway();
    }

    private Actor riderWithCard() {
        Actor rider = rides.client();
        jdbc.sql("""
                        insert into payment_card (id, client_id, merchant_id, token, masked_pan, card_type, state,
                                                  created_at)
                        values (:id, :client, :merchant, :token, '41****1111', 'Visa', 'ACTIVE', now())""")
                .param("id", UUID.randomUUID()).param("client", rider.id()).param("merchant", merchantId)
                .param("token", "tok-" + rider.id()).update();
        return rider;
    }

    private OrderView cardOrder(Actor rider) {
        UUID quote = new TestQuotes(jdbc, quotes).quote(rider, cityId, "STANDARD", PICKUP, DROPOFF, null).id();
        return orders.create(rider, UUID.randomUUID(), new CreateOrder(rider.id(), "STANDARD", PICKUP, "Home",
                DROPOFF, "Work", PaymentMethod.CARD, quote, null, null, null, null));
    }

    private void deliverEvents() {
        while (relay.runOnce() > 0) {
            // drain
        }
    }

    private String intentState(UUID orderId) {
        return payments.intent(orderId).map(CardPayments.Intent::state).orElse(null);
    }

    private Instant createdAt(UUID orderId) {
        return jdbc.sql("select created_at from ride_order where id = :id").param("id", orderId)
                .query(java.time.OffsetDateTime.class).single().toInstant();
    }

    private List<String> requests() {
        return testPayments.requests().stream().map(r -> (String) r.get("transactionType")).toList();
    }

    @Test
    void aHoldTheBankNeverAnswersEndsTheOrderAtTheDeadlineAndTheLateSuccessIsVoided() {
        Actor rider = riderWithCard();
        testPayments.next("LOST_ANSWER"); // the bank holds the money, its answer never comes
        OrderView order = cardOrder(rider);
        deliverEvents();
        assertThat(orders.get(order.id()).status()).isEqualTo("AWAITING_PAYMENT");
        assertThat(intentState(order.id())).isEqualTo("UNKNOWN");
        Instant created = createdAt(order.id());

        assertThat(deadline.expire(created.plus(DEADLINE).minusSeconds(1))).as("before the deadline").isZero();
        assertThat(orders.get(order.id()).status()).isEqualTo("AWAITING_PAYMENT");

        assertThat(deadline.expire(created.plus(DEADLINE).plusSeconds(1))).isGreaterThanOrEqualTo(1);
        deliverEvents();
        OrderView ended = orders.get(order.id());
        assertThat(ended.status()).isEqualTo("UNFULFILLED");
        assertThat(ended.statusReason()).isEqualTo("PAYMENT_TIMEOUT");
        assertThat(ended.paymentState()).isEqualTo("HOLD_RELEASED");
        assertThat(jdbc.sql("""
                        select payload ->> 'reason' from outbox
                        where aggregate_id = :order and aggregate_type = 'Order' and event_type = 'CardHoldDeclined'""")
                .param("order", order.id()).query(String.class).list()).containsExactly("PAYMENT_TIMEOUT");
        taxi.blizz.EventContracts.assertOrderEventsConform(jdbc, order.id(), "CardHoldDeclined");
        assertThat(jdbc.sql("""
                        select template from notification
                        where recipient_id = :rider and data ->> 'order_id' = :order""")
                .param("rider", rider.id()).param("order", order.id().toString()).query(String.class).list())
                .as("the rider is told").containsExactly("rider.payment-declined");
        assertThat(deadline.expire(created.plus(DEADLINE).plusSeconds(60))).as("ended once").isZero();

        // The bank answers at last: it had the hold. The success is voided, never captured, never posted.
        testPayments.settle();
        assertThat(intentState(order.id())).isEqualTo("VOIDED");
        assertThat(requests()).contains("REFUND").doesNotContain("SETTLE");
        assertThat(orders.get(order.id()).status()).isEqualTo("UNFULFILLED");
        assertThat(jdbc.sql("select count(*) from dispatch_attempt where order_id = :id").param("id", order.id())
                .query(Long.class).single()).as("no search").isZero();
        assertThat(jdbc.sql("select count(*) from journal_transaction where business_key like :key")
                .param("key", "%" + order.id() + "%").query(Long.class).single()).as("nothing posted").isZero();
    }

    @Test
    void aHoldThatNeverReachedTheBankEndsTheSameWayAndItsLateDeclineChangesNothing() {
        Actor rider = riderWithCard();
        testPayments.next("TIMEOUT"); // the request never arrives
        OrderView order = cardOrder(rider);
        Instant created = createdAt(order.id());
        assertThat(deadline.expire(created.plus(DEADLINE).plusSeconds(1))).isGreaterThanOrEqualTo(1);
        deliverEvents();
        assertThat(orders.get(order.id()).statusReason()).isEqualTo("PAYMENT_TIMEOUT");

        testPayments.settle(); // the check finds nothing: declined
        assertThat(orders.get(order.id()).status()).isEqualTo("UNFULFILLED");
        assertThat(orders.get(order.id()).statusReason()).as("not overwritten").isEqualTo("PAYMENT_TIMEOUT");
        assertThat(requests()).doesNotContain("SETTLE");
    }

    @Test
    void aHeldOrderAndACancelledOneAreNotTouched() {
        Actor rider = riderWithCard();
        OrderView held = cardOrder(rider); // the fake bank approves at once
        deliverEvents();
        assertThat(orders.get(held.id()).status()).isEqualTo("SEARCHING");
        Actor other = riderWithCard();
        testPayments.next("LOST_ANSWER");
        OrderView cancelled = cardOrder(other);
        orders.cancel(other, UUID.randomUUID(), cancelled.id(), orders.get(cancelled.id()).version(), "CHANGED_MIND");

        deadline.expire(Instant.now().plus(Duration.ofHours(1)));
        deliverEvents();
        assertThat(orders.get(held.id()).status()).isEqualTo("SEARCHING");
        assertThat(orders.get(cancelled.id()).status()).isEqualTo("CANCELLED");
        assertThat(orders.get(cancelled.id()).statusReason()).isNotEqualTo("PAYMENT_TIMEOUT");
        orders.cancel(rider, UUID.randomUUID(), held.id(), orders.get(held.id()).version(), "CHANGED_MIND");
    }

    @Test
    void theDeadlineRunsByItself() throws Exception {
        var run = CardHoldDeadline.class.getDeclaredMethod("run");
        assertThat(run.getAnnotation(Scheduled.class)).as("a scheduled job").isNotNull();
        Actor rider = riderWithCard();
        testPayments.next("LOST_ANSWER");
        OrderView order = cardOrder(rider);
        jdbc.sql("update ride_order set created_at = created_at - interval '10 minutes' where id = :id")
                .param("id", order.id()).update();
        run.setAccessible(true);
        run.invoke(deadline);
        deliverEvents();
        assertThat(orders.get(order.id()).statusReason()).isEqualTo("PAYMENT_TIMEOUT");
    }
}
