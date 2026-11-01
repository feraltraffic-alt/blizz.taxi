package taxi.blizz.pricing;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.TestQuotes;
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.configuration.FeatureFlags;
import taxi.blizz.geo.CityOperations;
import taxi.blizz.geo.GeoConfiguration;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.SessionService;
import taxi.blizz.operations.CallerContact;
import taxi.blizz.operations.CreateOrder;
import taxi.blizz.operations.Dispatch;
import taxi.blizz.operations.OrderChannel;
import taxi.blizz.operations.Orders;
import taxi.blizz.operations.PaymentMethod;
import taxi.blizz.operations.Trips;
import taxi.blizz.operations.WorkSessions;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.platform.internal.OutboxRelay;
import taxi.blizz.promotions.RiderPromotions;

/**
 * Issue #140, REQ-PRC-05: a quote says how its payer may pay an order made from it and what a card order would hold.
 * A rider pays in cash or by card, an operator's phone order in cash or at the driver's terminal, both only with the
 * methods the city offers; CARD only while card payments are switched on. Its own city at longitude 17.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class QuotePaymentTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, 17.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 17.55);

    @Autowired QuoteService quotes;
    @Autowired CityOperations operations;
    @Autowired FeatureFlags flags;
    @Autowired RiderPromotions promotions;
    @Autowired Orders orders;
    @Autowired Dispatch dispatch;
    @Autowired Trips trips;
    @Autowired WorkSessions sessions;
    @Autowired SessionService auth;
    @Autowired OutboxRelay relay;
    @Autowired JdbcClient jdbc;

    TestRides rides;
    UUID city;
    Actor manager;
    Actor operator;

    @BeforeEach
    void setUp() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        city = rides.city("test-quote-payment", "UAH", 17);
        manager = staff(GeoConfiguration.MANAGE_PERMISSION, FeatureFlags.MANAGE_PERMISSION,
                RiderPromotions.MANAGE_PERMISSION);
        operator = staff(Orders.CREATE_PERMISSION, Orders.VIEW_PERMISSION, Orders.CANCEL_PERMISSION);
        if (jdbc.sql("select count(*) from payment_merchant_city where city_id = :city").param("city", city)
                .query(Long.class).single() == 0) {
            UUID merchant = UUID.randomUUID();
            jdbc.sql("""
                            insert into payment_merchant (id, provider, account, domain, secret_ref, currency,
                                                          created_at)
                            values (:id, 'FAKE', :account, 'test.blizz.invalid', 'test', 'UAH', now())""")
                    .param("id", merchant).param("account", "quote_payment_" + merchant).update();
            jdbc.sql("insert into payment_merchant_city (city_id, merchant_id) values (:city, :merchant)")
                    .param("city", city).param("merchant", merchant).update();
        }
    }

    /**
     * Back to every method, no promotion of the city, card payments on; a card hold left to nobody, so no other
     * class's payment worker takes it (events are delivered first, or a hold they ask for comes after this).
     */
    @AfterEach
    void cleanUp() {
        jdbc.sql("delete from city_operations where city_id = :city").param("city", city).update();
        for (RiderPromotions.Promotion p : promotions.list(manager, false)) {
            if (city.equals(p.conditions().cityId())) {
                promotions.archive(manager, UUID.randomUUID(), p.id(), p.version(), "test clean-up");
            }
        }
        cards(true);
        while (relay.runOnce() > 0) {
            // drain
        }
        jdbc.sql("""
                        update payment_operation set state = 'CANCELLED'
                        where intent_id in (select id from payment_intent where city_id = :c)
                          and state in ('CREATED', 'SENDING', 'PENDING', 'UNKNOWN')""")
                .param("c", city).update();
    }

    @Test
    void aRiderMayPayCashOrCardAndTheCardHoldIsThePriceLessTheDiscount() {
        promotions.create(manager, UUID.randomUUID(), new RiderPromotions.Draft("Minus 10 %",
                RiderPromotions.Kind.DISCOUNT, RiderPromotions.ValueType.PERCENT, 1_000, null,
                new RiderPromotions.Conditions(city, null, null, null, null, null, null, null, null, null)), "test");
        QuoteService.Quote quote = quote(rides.client());
        assertThat(quote.discountMinor()).isPositive();
        assertThat(quote.paymentMethods()).containsExactly("CARD", "CASH");
        assertThat(quote.cardHoldMinor()).isEqualTo(quote.toPayMinor()).isLessThan(quote.amountMinor());
        assertThat(jdbc.sql("""
                        select snapshot -> 'payment_methods' ->> 0 || ',' || (snapshot ->> 'card_hold_minor')
                        from quote where id = :id""")
                .param("id", quote.id()).query(String.class).single())
                .as("in the snapshot too").isEqualTo("CARD," + quote.toPayMinor());
    }

    @Test
    void anOperatorMayPayCashOrAtTheTerminalAndHasNoCardHold() {
        QuoteService.Quote quote = quote(operator);
        assertThat(quote.paymentMethods()).containsExactly("CASH", "TERMINAL");
        assertThat(quote.cardHoldMinor()).isNull();
    }

    @Test
    void theCitysMethodsAndTheCardSwitchNarrowTheList() {
        offer("CASH", "TERMINAL");
        assertThat(quote(rides.client())).satisfies(q -> {
            assertThat(q.paymentMethods()).containsExactly("CASH");
            assertThat(q.cardHoldMinor()).isNull();
        });
        assertThat(quote(operator).paymentMethods()).containsExactly("CASH", "TERMINAL");

        offer("CARD");
        assertThat(quote(rides.client()).paymentMethods()).containsExactly("CARD");
        assertThat(quote(operator).paymentMethods()).as("nothing an operator can take").isEmpty();

        offer("CASH", "CARD", "TERMINAL");
        cards(false);
        assertThat(quote(rides.client())).satisfies(q -> {
            assertThat(q.paymentMethods()).containsExactly("CASH");
            assertThat(q.cardHoldMinor()).isNull();
        });
    }

    /** The list is what an order accepts: every listed method is taken, every other one refused. */
    @Test
    void everyListedMethodIsAcceptedByTheOrderAndNoOtherOne() {
        Actor rider = riderWithCard();
        Actor[] payers = {rider, operator};
        for (Actor payer : payers) {
            List<String> listed = quote(payer).paymentMethods();
            for (PaymentMethod method : List.of(PaymentMethod.CASH, PaymentMethod.CARD, PaymentMethod.TERMINAL)) {
                UUID quoteId = quote(payer).id();
                if (listed.contains(method.name())) {
                    var order = order(payer, method, quoteId);
                    orders.cancel(payer, UUID.randomUUID(), order.id(), orders.get(order.id()).version(),
                            payer == rider ? "CHANGED_MIND" : "NO_CARS");
                } else {
                    assertThatThrownBy(() -> order(payer, method, quoteId)).as(payer.type() + " " + method)
                            .isInstanceOf(DomainException.class);
                }
            }
        }
    }

    // ---------------------------------------------------------------- fixtures

    private QuoteService.Quote quote(Actor payer) {
        return new TestQuotes(jdbc, quotes).quote(payer, city, "STANDARD", PICKUP, DROPOFF);
    }

    private taxi.blizz.operations.OrderView order(Actor payer, PaymentMethod method, UUID quoteId) {
        if (payer.type() == SubjectType.STAFF) {
            return orders.create(payer, UUID.randomUUID(), new CreateOrder(null, "STANDARD", PICKUP, "Home",
                    DROPOFF, "Work", method, quoteId, OrderChannel.PHONE, null,
                    new CallerContact("Olena", "+380671112233"), null, false));
        }
        return orders.create(payer, UUID.randomUUID(), new CreateOrder(payer.id(), "STANDARD", PICKUP, "Home",
                DROPOFF, "Work", method, quoteId));
    }

    private void offer(String... methods) {
        CityOperations.State state = operations.get(manager, city);
        operations.change(manager, UUID.randomUUID(), city, state.version(),
                new CityOperations.Settings(List.of(), Set.of(methods)), "Test methods");
    }

    private void cards(boolean on) {
        var card = FeatureFlags.Flag.CARD_PAYMENTS;
        var now = flags.all(manager).stream().filter(s -> s.flag() == card).findFirst().orElseThrow();
        if (now.enabled() != on) {
            flags.change(manager, UUID.randomUUID(), card.key(), now.version(), on, "Test switch");
        }
    }

    private Actor riderWithCard() {
        Actor rider = rides.client();
        UUID merchant = jdbc.sql("select merchant_id from payment_merchant_city where city_id = :city")
                .param("city", city).query(UUID.class).single();
        jdbc.sql("""
                        insert into payment_card (id, client_id, merchant_id, token, masked_pan, card_type, state,
                                                  created_at)
                        values (:id, :client, :merchant, :token, '41****1111', 'Visa', 'ACTIVE', now())""")
                .param("id", UUID.randomUUID()).param("client", rider.id()).param("merchant", merchant)
                .param("token", "tok-" + rider.id()).update();
        return rider;
    }

    private Actor staff(String... permissions) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, all_cities, state, created_at,
                                                updated_at)
                        values (:id, :login, 'Quote payment', 'ADMIN', :permissions, true, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "quote-payment-" + id).param("permissions", permissions).update();
        return new Actor(SubjectType.STAFF, id);
    }
}
