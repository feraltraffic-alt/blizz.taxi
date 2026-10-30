package taxi.blizz.payments.internal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
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
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.internal.OutboxRelay;
import taxi.blizz.pricing.QuoteService;

/** The card hold before the search (ADR 0008, REQ-PAY-01/02/06, T-23). */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class CardHoldTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, 20.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 20.55);

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
    CardPayments payments;
    @Autowired
    PaymentWorker worker;
    @Autowired
    FakeProvider.Gateway gateway;
    @Autowired
    OutboxRelay relay;
    @Autowired
    JdbcClient jdbc;

    TestRides rides;
    UUID cityId;
    UUID merchantId;

    @BeforeEach
    void setUp() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        cityId = rides.city("test-card-holds", "UAH", 20);
        merchantId = jdbc.sql("select merchant_id from payment_merchant_city where city_id = :city")
                .param("city", cityId).query(UUID.class).optional().orElseGet(() -> {
                    UUID id = UUID.randomUUID();
                    jdbc.sql("""
                                    insert into payment_merchant (id, provider, account, domain, secret_ref, currency,
                                                                  created_at)
                                    values (:id, 'FAKE', :account, 'test.blizz.invalid', 'test', 'UAH', now())""")
                            .param("id", id).param("account", "holds_" + id).update();
                    jdbc.sql("insert into payment_merchant_city (city_id, merchant_id) values (:city, :merchant)")
                            .param("city", cityId).param("merchant", id).update();
                    return id;
                });
        gateway.reset();
    }

    private Actor riderWithCard() {
        Actor rider = rides.client();
        jdbc.sql("""
                        insert into payment_card (id, client_id, merchant_id, token, masked_pan, card_type, state, created_at)
                        values (:id, :client, :merchant, :token, '41****1111', 'Visa', 'ACTIVE', now())""")
                .param("id", UUID.randomUUID()).param("client", rider.id()).param("merchant", merchantId)
                .param("token", "tok-" + rider.id()).update();
        return rider;
    }

    private OrderView cardOrder(Actor rider, Instant pickupAt) {
        UUID quote = new TestQuotes(jdbc, quotes).quote(rider, cityId, "STANDARD", PICKUP, DROPOFF, pickupAt).id();
        return orders.create(rider, UUID.randomUUID(), new CreateOrder(rider.id(), "STANDARD", PICKUP, "Home",
                DROPOFF, "Work", PaymentMethod.CARD, quote, null, null, null, pickupAt));
    }

    private void deliverEvents() {
        while (relay.runOnce() > 0) {
            // drain
        }
    }

    /** Runs the worker until nothing is due, with unknown results due at once. */
    private void settlePayments() {
        for (int i = 0; i < 5; i++) {
            jdbc.sql("update payment_operation set next_check_at = now() - interval '1 second' "
                    + "where state in ('PENDING', 'UNKNOWN')").update();
            jdbc.sql("update payment_operation set lease_until = now() - interval '1 second' where state = 'SENDING'")
                    .update();
            worker.runOnce();
        }
        deliverEvents();
    }

    private String intentState(UUID orderId) {
        return payments.intent(orderId).map(CardPayments.Intent::state).orElse(null);
    }

    @Test
    void theSearchStartsOnlyAfterTheHold() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        Actor rider = riderWithCard();
        OrderView order = cardOrder(rider, null);
        assertThat(order.status()).isEqualTo("AWAITING_PAYMENT");
        assertThat(order.paymentState()).isEqualTo("AUTH_PENDING");
        assertThat(dispatch.offers(driver.actor())).as("no search before the hold").isEmpty();

        // processNow already asked the bank; the order moves when the event is delivered.
        assertThat(gateway.requests()).singleElement().satisfies(request -> {
            assertThat(request).containsEntry("transactionType", "CHARGE").containsEntry("merchantTransactionType",
                    "AUTH").containsEntry("recToken", "tok-" + rider.id());
            assertThat(WayForPayProvider.minor((String) request.get("amount"))).isEqualTo(order.priceMinor());
        });
        assertThat(intentState(order.id())).isEqualTo("AUTHORIZED");
        deliverEvents();
        OrderView searching = orders.get(order.id());
        assertThat(searching.status()).isEqualTo("SEARCHING");
        assertThat(searching.paymentState()).isEqualTo("AUTHORIZED");
        assertThat(dispatch.offers(driver.actor())).hasSize(1);

        // Cancelled while searching: the hold is released.
        orders.cancel(rider, UUID.randomUUID(), order.id(), orders.get(order.id()).version(), "CHANGED_MIND");
        assertThat(intentState(order.id())).isEqualTo("VOID_PENDING");
        settlePayments();
        assertThat(intentState(order.id())).isEqualTo("VOIDED");
        assertThat(gateway.requests()).extracting(r -> r.get("transactionType")).containsExactly("CHARGE", "REFUND");
    }

    @Test
    void aDeclinedHoldEndsTheOrderAndNoCardMeansNoOrder() {
        Actor rider = riderWithCard();
        gateway.next("Declined");
        OrderView order = cardOrder(rider, null);
        deliverEvents();
        OrderView declined = orders.get(order.id());
        assertThat(declined.status()).isEqualTo("UNFULFILLED");
        assertThat(declined.statusReason()).isEqualTo("PAYMENT_DECLINED");
        assertThat(declined.paymentState()).isEqualTo("PAYMENT_DECLINED");
        assertThat(intentState(order.id())).isEqualTo("DECLINED");
        assertThat(jdbc.sql("""
                        select distinct aggregate_type from outbox
                        where (aggregate_id = :order or payload ->> 'order_id' = :orderText)
                          and event_type = 'CardHoldDeclined'""")
                .param("order", order.id()).param("orderText", order.id().toString()).query(String.class).list())
                .containsExactlyInAnyOrder("PaymentIntent", "Order");
        taxi.blizz.EventContracts.assertOrderEventsConform(jdbc, order.id(), "CardHoldDeclined");

        Actor noCard = rides.client();
        assertThatThrownBy(() -> cardOrder(noCard, null)).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(ErrorCode.VALIDATION_FAILED);
        assertThat(orders.active(noCard.id())).isEmpty();
    }

    @Test
    void anUnknownHoldIsReconciledAndALateSuccessAfterCancellationIsReleased() {
        Actor rider = riderWithCard();
        gateway.next("LOST_ANSWER");
        OrderView order = cardOrder(rider, null);
        assertThat(intentState(order.id())).as("a lost answer is not a decline").isEqualTo("UNKNOWN");
        deliverEvents();
        assertThat(orders.get(order.id()).status()).isEqualTo("AWAITING_PAYMENT");

        // The rider gives up; the bank did take the hold (T-23): it is released, no search starts.
        orders.cancel(rider, UUID.randomUUID(), order.id(), orders.get(order.id()).version(), "CHANGED_MIND");
        settlePayments();
        assertThat(gateway.requests()).extracting(r -> r.get("transactionType"))
                .containsExactly("CHARGE", "CHECK_STATUS", "REFUND");
        assertThat(intentState(order.id())).isEqualTo("VOIDED");
        assertThat(orders.get(order.id()).status()).isEqualTo("CANCELLED");
        assertThat(jdbc.sql("select count(*) from dispatch_attempt where order_id = :id").param("id", order.id())
                .query(Long.class).single()).isZero();

        // A hold that never reached the bank: the check finds nothing and the order ends unfulfilled.
        Actor other = riderWithCard();
        gateway.next("TIMEOUT");
        OrderView lost = cardOrder(other, null);
        assertThat(intentState(lost.id())).isEqualTo("UNKNOWN");
        settlePayments();
        assertThat(orders.get(lost.id()).status()).isEqualTo("UNFULFILLED");
    }

    @Test
    void aCardPreorderWaitsScheduledWithAHoldLongEnough() {
        Actor rider = riderWithCard();
        Instant pickupAt = Instant.now().plus(3, ChronoUnit.DAYS);
        OrderView order = cardOrder(rider, pickupAt);
        assertThat(order.status()).isEqualTo("AWAITING_PAYMENT");
        deliverEvents();
        assertThat(orders.get(order.id()).status()).isEqualTo("SCHEDULED");
        long holdTimeout = ((Number) gateway.requests().getFirst().get("holdTimeout")).longValue();
        assertThat(holdTimeout).as("kept past the pickup").isGreaterThan(3L * 24 * 3600);
        orders.cancel(rider, UUID.randomUUID(), order.id(), orders.get(order.id()).version(), "CHANGED_MIND");
        settlePayments();
        assertThat(intentState(order.id())).isEqualTo("VOIDED");
    }
}
