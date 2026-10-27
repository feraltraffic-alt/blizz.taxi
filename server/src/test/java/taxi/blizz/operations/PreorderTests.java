package taxi.blizz.operations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;
import java.util.UUID;
import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.TestQuotes;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.configuration.ServiceSettings;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.SessionService;
import taxi.blizz.operations.internal.PreorderWorker;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.pricing.QuoteService;

/** Orders for a set time: pre-orders wait as SCHEDULED and are released into the search (ADR 0006). */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class PreorderTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, -79.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, -79.45);

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
    PreorderWorker worker;
    @Autowired
    JdbcClient jdbc;

    TestRides rides;
    UUID cityId;

    @BeforeEach
    void setUp() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        cityId = rides.city("test-preorders", "UAH", -80);
    }

    private static void assertCode(ThrowingCallable call, ErrorCode code) {
        assertThatThrownBy(call).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }

    private ServiceSettings.Preorders rules() {
        return settings.current().settings().preorders();
    }

    private OrderView order(Actor payer, Instant pickupAt) {
        UUID quote = new TestQuotes(jdbc, quotes).quote(payer, cityId, "STANDARD", PICKUP, DROPOFF, pickupAt).id();
        return orders.create(payer, UUID.randomUUID(), new CreateOrder(payer.id(), "STANDARD", PICKUP, "Home", DROPOFF,
                "Airport", PaymentMethod.CASH, quote, null, null, null, pickupAt));
    }

    private long attempts(UUID orderId) {
        return jdbc.sql("select count(*) from dispatch_attempt where order_id = :id").param("id", orderId)
                .query(Long.class).single();
    }

    @Test
    void aPreorderWaitsUntilItsReleaseTimeAndThenSearches() {
        Actor payer = rides.client();
        Instant pickupAt = Instant.now().plus(rules().thresholdMinutes() + 120L, ChronoUnit.MINUTES);
        OrderView scheduled = order(payer, pickupAt);

        assertThat(scheduled.status()).isEqualTo("SCHEDULED");
        assertThat(scheduled.preorder()).isTrue();
        assertThat(scheduled.pickupAt().toInstant()).isCloseTo(pickupAt, org.assertj.core.api.Assertions.within(1,
                ChronoUnit.MILLIS));
        assertThat(attempts(scheduled.id())).isZero();
        OffsetDateTime releaseAt = jdbc.sql("select release_at from ride_order where id = :id")
                .param("id", scheduled.id()).query(OffsetDateTime.class).single();
        assertThat(releaseAt.toInstant()).isCloseTo(pickupAt.minus(rules().releaseMinutesBefore(), ChronoUnit.MINUTES),
                org.assertj.core.api.Assertions.within(1, ChronoUnit.SECONDS));
        assertThat(jdbc.sql("select type from order_event where order_id = :id and sequence = 0")
                .param("id", scheduled.id()).query(String.class).single()).isEqualTo("OrderScheduled");

        // A pre-order does not block a ride now (REQ-RID-03 counts orders for now only).
        OrderView now = rides.order(payer, cityId, PICKUP, DROPOFF);
        assertThat(now.status()).isEqualTo("SEARCHING");
        assertThat(orders.active(payer.id())).map(OrderView::id).contains(now.id());

        worker.runOnce();
        assertThat(orders.get(scheduled.id()).status()).as("not due yet").isEqualTo("SCHEDULED");

        jdbc.sql("update ride_order set release_at = now() - interval '1 second' where id = :id")
                .param("id", scheduled.id()).update();
        assertThat(worker.runOnce()).isGreaterThanOrEqualTo(1);
        assertThat(orders.get(scheduled.id()).status()).isEqualTo("SEARCHING");
        assertThat(attempts(scheduled.id())).isEqualTo(1);
        worker.runOnce();
        assertThat(attempts(scheduled.id())).as("released once").isEqualTo(1);

        orders.cancel(payer, UUID.randomUUID(), now.id(), orders.get(now.id()).version(), "CHANGED_MIND");
        orders.cancel(payer, UUID.randomUUID(), scheduled.id(), orders.get(scheduled.id()).version(), "CHANGED_MIND");
    }

    @Test
    void aTimeNearerThanTheThresholdIsAnOrdinaryOrder() {
        Actor payer = rides.client();
        Instant soon = Instant.now().plus(Math.max(1, rules().thresholdMinutes() - 20L), ChronoUnit.MINUTES);
        OrderView order = order(payer, soon);
        assertThat(order.status()).isEqualTo("SEARCHING");
        assertThat(order.preorder()).isFalse();
        assertThat(order.pickupAt()).isNotNull();
        orders.cancel(payer, UUID.randomUUID(), order.id(), orders.get(order.id()).version(), "CHANGED_MIND");
    }

    @Test
    void theOrderMustAskForTheQuotedTimeAndRespectTheLimits() {
        Actor payer = rides.client();
        Instant pickupAt = Instant.now().plus(rules().thresholdMinutes() + 60L, ChronoUnit.MINUTES);
        UUID quote = new TestQuotes(jdbc, quotes).quote(payer, cityId, "STANDARD", PICKUP, DROPOFF, pickupAt).id();
        assertCode(() -> orders.create(payer, UUID.randomUUID(), new CreateOrder(payer.id(), "STANDARD", PICKUP, "Home",
                DROPOFF, "Airport", PaymentMethod.CASH, quote, null, null, null, pickupAt.plusSeconds(600))),
                ErrorCode.QUOTE_MISMATCH);
        assertCode(() -> new TestQuotes(jdbc, quotes).quote(payer, cityId, "STANDARD", PICKUP, DROPOFF,
                Instant.now().minusSeconds(60)), ErrorCode.VALIDATION_FAILED);
        assertCode(() -> new TestQuotes(jdbc, quotes).quote(payer, cityId, "STANDARD", PICKUP, DROPOFF,
                Instant.now().plus(rules().maxDaysAhead() + 1L, ChronoUnit.DAYS)), ErrorCode.VALIDATION_FAILED);

        // Pre-orders count toward the payer's limit of active orders (ADR 0012 Q-03).
        Actor busy = rides.client();
        int limit = settings.current().settings().orders().activePerPayer();
        for (int i = 0; i < limit; i++) {
            order(busy, pickupAt.plus(i, ChronoUnit.HOURS));
        }
        assertCode(() -> order(busy, pickupAt.plus(limit + 1L, ChronoUnit.HOURS)), ErrorCode.ACTIVE_ORDER_LIMIT);

        OrderView first = orders.history(busy, null, 10).stream()
                .filter(item -> "SCHEDULED".equals(item.status())).findFirst()
                .map(item -> orders.get(item.id())).orElseThrow();
        OrderView cancelled = orders.cancel(busy, UUID.randomUUID(), first.id(), first.version(), "CHANGED_MIND");
        assertThat(cancelled.status()).isEqualTo("CANCELLED");
        assertThat(cancelled.cancellation().by()).isEqualTo("RIDER");
        assertThat(attempts(first.id())).isZero();
        jdbc.sql("update ride_order set release_at = now() - interval '1 second' where id = :id")
                .param("id", first.id()).update();
        worker.runOnce();
        assertThat(orders.get(first.id()).status()).as("a cancelled pre-order is never released")
                .isEqualTo("CANCELLED");
        jdbc.sql("update ride_order set status = 'CANCELLED', cancelled_by = 'RIDER', cancel_reason_code = 'X' "
                + "where payer_client_id = :p and status = 'SCHEDULED'").param("p", busy.id()).update();
    }
}
