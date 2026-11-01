package taxi.blizz.operations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CountDownLatch;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.finance.FareDeltas;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.SessionService;
import taxi.blizz.payments.CardTopUps;
import taxi.blizz.payments.internal.TestPayments;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.internal.OutboxRelay;
import taxi.blizz.pricing.QuoteService;

/**
 * REQ-PAY-18, E2 of #140: a rider's debt on an order is an obligation they see and pay by card. One page at a time
 * per obligation, a repayment posted once however often the bank reports it, a partial repayment leaves the rest.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class RiderObligationTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, -145.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, -145.45);
    static final long DEBT = 4_200;

    @Autowired Orders orders;
    @Autowired Dispatch dispatch;
    @Autowired Trips trips;
    @Autowired WorkSessions sessions;
    @Autowired SessionService auth;
    @Autowired QuoteService quotes;
    @Autowired RiderObligations obligations;
    @Autowired FareDeltas fareDeltas;
    @Autowired OutboxRelay relay;
    @Autowired JdbcClient jdbc;
    @Autowired ApplicationContext context;
    @Autowired org.springframework.transaction.support.TransactionTemplate tx;

    TestRides rides;
    TestPayments payments;
    UUID cityId;

    @BeforeEach
    void setUp() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        payments = new TestPayments(context);
        cityId = rides.city("test-rider-obligations", "UAH", -146);
        if (jdbc.sql("select count(*) from payment_merchant_city where city_id = :city").param("city", cityId)
                .query(Long.class).single() == 0) {
            UUID id = UUID.randomUUID();
            jdbc.sql("""
                            insert into payment_merchant (id, provider, account, domain, secret_ref, currency,
                                                          created_at)
                            values (:id, 'FAKE', :account, 'test.blizz.invalid', 'test', 'UAH', now())""")
                    .param("id", id).param("account", "obligations_" + id).update();
            jdbc.sql("insert into payment_merchant_city (city_id, merchant_id) values (:city, :merchant)")
                    .param("city", cityId).param("merchant", id).update();
        }
        payments.resetGateway();
    }

    @AfterEach
    void cleanUp() {
        drain();
        payments.resetGateway();
    }

    private void drain() {
        while (relay.runOnce() > 0) {
            // drain
        }
    }

    /** A cash ride paid in full, then a final-fare correction that raises it by {@link #DEBT}: the rider owes it. */
    private TestRides.Ride owing() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        TestRides.Ride ride = rides.started(cityId, driver, PICKUP, DROPOFF);
        rides.complete(ride, true);
        drain();
        tx.executeWithoutResult(status -> fareDeltas.post(new FareDeltas.Delta(ride.order().id(), UUID.randomUUID(),
                ride.payer().id(), driver.actor().id(), false, "UAH", DEBT, 630, DEBT - 630)));
        return ride;
    }

    private RiderObligations.Obligation obligation(Actor rider, UUID orderId) {
        return obligations.list(rider).stream().filter(o -> o.orderId().equals(orderId)).findFirst().orElse(null);
    }

    private long repaymentPostings(UUID orderId) {
        return jdbc.sql("""
                        select count(*) from journal_transaction
                        where basis_id = :order and business_key like 'debt-repayment:%'""")
                .param("order", orderId).query(Long.class).single();
    }

    @Test
    void aDebtIsListedPaidByCardOnceAndThenGone() {
        TestRides.Ride ride = owing();
        Actor rider = ride.payer();
        RiderObligations.Obligation owed = obligation(rider, ride.order().id());
        assertThat(owed).as("listed").isNotNull();
        assertThat(owed.remainderMinor()).isEqualTo(DEBT);
        assertThat(owed.owedMinor() - owed.paidMinor()).isEqualTo(DEBT);
        assertThat(owed.currency()).isEqualTo("UAH");

        CardTopUps.TopUp page = obligations.startRepayment(rider, UUID.randomUUID(), ride.order().id(), null);
        assertThat(page.amountMinor()).as("the whole remainder").isEqualTo(DEBT);
        assertThat(page.state()).isEqualTo("PENDING");
        assertThat(page.url()).endsWith("/payments/v1/fake/pay");

        assertThat(payments.payOnFakePage(page.fields())).isEqualTo(303);
        payments.payOnFakePage(page.fields()); // the provider repeats its notification
        drain();
        assertThat(obligations.payment(rider, page.id()).state()).isEqualTo("COMPLETED");
        assertThat(repaymentPostings(ride.order().id())).as("posted once").isOne();
        assertThat(obligation(rider, ride.order().id())).as("nothing owed any more").isNull();
        assertThat(jdbc.sql("""
                        select coalesce(sum(l.credit_minor), 0) from journal_line l
                        join journal_transaction t on t.id = l.transaction_id
                        where t.business_key like 'debt-repayment:%' and t.basis_id = :order
                          and l.account = 'RIDER_RECEIVABLE' and l.party_id = :rider""")
                .param("order", ride.order().id()).param("rider", rider.id()).query(Long.class).single())
                .as("the rider's receivable paid by the repayment").isEqualTo(DEBT);
        assertThat(jdbc.sql("""
                        select count(*) from journal_line l join journal_transaction t on t.id = l.transaction_id
                        where t.business_key like 'card-top-up:%' and l.party_id = :rider""")
                .param("rider", rider.id()).query(Long.class).single())
                .as("not credited to the bonus account").isZero();
    }

    @Test
    void aPartialRepaymentLeavesTheRest() {
        TestRides.Ride ride = owing();
        Actor rider = ride.payer();
        CardTopUps.TopUp page = obligations.startRepayment(rider, UUID.randomUUID(), ride.order().id(), 1_200L);
        payments.payOnFakePage(page.fields());
        drain();
        RiderObligations.Obligation rest = obligation(rider, ride.order().id());
        assertThat(rest.remainderMinor()).isEqualTo(DEBT - 1_200);
        assertThat(rest.repayments()).singleElement().satisfies(r -> {
            assertThat(r.id()).isEqualTo(page.id());
            assertThat(r.state()).isEqualTo("COMPLETED");
            assertThat(r.url()).as("no form in the list").isNull();
        });
    }

    @Test
    void onePageAtATimeAndTwoAtOnceGiveOne() throws Exception {
        TestRides.Ride ride = owing();
        Actor rider = ride.payer();
        UUID order = ride.order().id();

        CountDownLatch start = new CountDownLatch(1);
        List<CompletableFuture<Object>> both = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            both.add(CompletableFuture.supplyAsync(() -> {
                try {
                    start.await();
                    return obligations.startRepayment(rider, UUID.randomUUID(), order, null);
                } catch (DomainException e) {
                    return e.code();
                } catch (InterruptedException e) {
                    throw new IllegalStateException(e);
                }
            }));
        }
        start.countDown();
        List<Object> results = new ArrayList<>();
        for (CompletableFuture<Object> f : both) {
            results.add(f.get());
        }
        assertThat(results).filteredOn(r -> r instanceof CardTopUps.TopUp).as("one page").hasSize(1);
        assertThat(results).filteredOn(r -> r == ErrorCode.STATE_CONFLICT).as("the other refused").hasSize(1);

        assertThatThrownBy(() -> obligations.startRepayment(rider, UUID.randomUUID(), order, null))
                .as("while the page is open").isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(ErrorCode.STATE_CONFLICT);
        jdbc.sql("update card_top_up set expires_at = now() - interval '1 minute' where obligation_order_id = :o")
                .param("o", order).update();
        assertThat(obligations.startRepayment(rider, UUID.randomUUID(), order, null).state())
                .as("a page that closed does not block a new one").isEqualTo("PENDING");
    }

    @Test
    void onlyTheRidersOwnDebtAndNeverMoreThanTheRemainder() {
        TestRides.Ride ride = owing();
        Actor rider = ride.payer();
        UUID order = ride.order().id();
        Actor stranger = rides.client();
        assertThatThrownBy(() -> obligations.startRepayment(stranger, UUID.randomUUID(), order, null))
                .isInstanceOf(DomainException.class).extracting(e -> ((DomainException) e).code())
                .isEqualTo(ErrorCode.NOT_FOUND);
        assertThat(obligations.list(stranger)).isEmpty();
        assertThatThrownBy(() -> obligations.startRepayment(rider, UUID.randomUUID(), order, DEBT + 1))
                .isInstanceOf(DomainException.class).extracting(e -> ((DomainException) e).code())
                .isEqualTo(ErrorCode.VALIDATION_FAILED);

        CardTopUps.TopUp page = obligations.startRepayment(rider, UUID.randomUUID(), order, null);
        assertThatThrownBy(() -> obligations.payment(stranger, page.id())).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(ErrorCode.NOT_FOUND);

        // A cash ride paid in full owes nothing: not listed, no page.
        TestRides.Driver driver = rides.driverNear(PICKUP);
        TestRides.Ride paid = rides.started(cityId, driver, PICKUP, DROPOFF);
        rides.complete(paid, true);
        drain();
        assertThat(obligation(paid.payer(), paid.order().id())).isNull();
        assertThatThrownBy(() -> obligations.startRepayment(paid.payer(), UUID.randomUUID(), paid.order().id(), null))
                .isInstanceOf(DomainException.class).extracting(e -> ((DomainException) e).code())
                .isEqualTo(ErrorCode.NOT_FOUND);
    }

    @Test
    void aTripStillBeingPaidIsNotAnObligation() {
        TestRides.Driver driver = rides.driverNear(PICKUP);
        TestRides.Ride ride = rides.started(cityId, driver, PICKUP, DROPOFF);
        assertThat(obligation(ride.payer(), ride.order().id())).as("in progress").isNull();
        rides.complete(ride, true);
        drain();
    }
}
