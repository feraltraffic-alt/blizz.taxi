package taxi.blizz.finance;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import jakarta.servlet.Filter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.OffsetDateTime;
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
import org.springframework.transaction.support.TransactionTemplate;
import org.springframework.web.context.WebApplicationContext;
import taxi.blizz.TestQuotes;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.finance.Ledger.Account;
import taxi.blizz.finance.Ledger.Line;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.IssuedSession;
import taxi.blizz.identity.SessionService;
import taxi.blizz.identity.VerifiedSubject;
import taxi.blizz.operations.CreateOrder;
import taxi.blizz.operations.Dispatch;
import taxi.blizz.operations.LocationFix;
import taxi.blizz.operations.OrderView;
import taxi.blizz.operations.Orders;
import taxi.blizz.operations.PaymentMethod;
import taxi.blizz.operations.TripView;
import taxi.blizz.operations.Trips;
import taxi.blizz.operations.WorkSessions;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.OutboxHandler;
import taxi.blizz.platform.OutboxMessage;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.platform.internal.OutboxRelay;
import taxi.blizz.pricing.QuoteService;
import tools.jackson.databind.json.JsonMapper;

/** Final fare and journal: REQ-PRC-10/12, REQ-LED-01/02/05, REQ-PAY-15/16, AC-14, AC-16. */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class FareLedgerTests {

    static final String AREA = "SRID=4326;MULTIPOLYGON(((140 -40,141 -40,141 -39,140 -39,140 -40)))";
    static final GeoPoint PICKUP = new GeoPoint(-39.5, 140.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 140.55);

    @Autowired
    Orders orders;
    @Autowired
    Dispatch dispatch;
    @Autowired
    Trips trips;
    @Autowired
    WorkSessions sessions;
    @Autowired
    SessionService authSessions;
    @Autowired
    QuoteService quoteService;
    @Autowired
    Ledger ledger;
    @Autowired
    OutboxRelay relay;
    @Autowired
    List<OutboxHandler> handlers;
    @Autowired
    JdbcClient jdbc;
    @Autowired
    TransactionTemplate tx;
    @Autowired
    WebApplicationContext context;
    @Autowired
    JsonMapper json;
    @Autowired
    taxi.blizz.configuration.ServiceSettings settings;

    UUID cityId;

    @BeforeEach
    void city() {
        cityId = jdbc.sql("select id from city where code = 'test-fare-ledger'").query(UUID.class).optional()
                .orElseGet(() -> {
                    UUID id = UUID.randomUUID();
                    jdbc.sql("""
                                    insert into city (id, code, name, currency, timezone, polygon, priority, state,
                                                      created_at, updated_at)
                                    values (:id, 'test-fare-ledger', 'Ledger', 'UAH', 'Europe/Kyiv',
                                            ST_GeomFromEWKT(:area), 7781, 'PUBLISHED', now(), now())""")
                            .param("id", id).param("area", AREA).update();
                    return id;
                });
        jdbc.sql("update work_session set state = 'CLOSED', closed_at = now() where city_id = :c and state <> 'CLOSED'")
                .param("c", cityId).update();
    }

    // ------------------------------------------------------------ fixtures

    record Ride(Actor payer, Actor driver, UUID device, OrderView order, TripView trip) {
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

    private long sequence = 10;

    /** A started cash ride: ordered, accepted, arrived and started. */
    private Ride started() {
        Actor payer = client();
        UUID driverId = UUID.randomUUID();
        jdbc.sql("""
                        insert into driver (id, phone_normalized, account_state, review_status, created_at, updated_at)
                        values (:id, :phone, 'ACTIVE', 'APPROVED', now(), now())""")
                .param("id", driverId)
                .param("phone", "+38097" + String.format("%07d", Math.floorMod(driverId.hashCode(), 10_000_000)))
                .update();
        UUID vehicle = UUID.randomUUID();
        jdbc.sql("""
                        insert into vehicle (id, driver_id, registration_number, make, model, color, production_year,
                                             state, class_approvals, created_at, updated_at)
                        values (:id, :driver, 'AA3000AA', 'Skoda', 'Octavia', 'blue', 2021, 'APPROVED', '{STANDARD}',
                                now(), now())""")
                .param("id", vehicle).param("driver", driverId).update();
        Actor driver = new Actor(SubjectType.DRIVER, driverId);
        IssuedSession device = authSessions.open(new VerifiedSubject(driver, "ACTIVE", false), "phone");
        sessions.open(driver, UUID.randomUUID(), device.sessionId(), vehicle,
                new LocationFix(new GeoPoint(PICKUP.lat() + 0.009, PICKUP.lon()), 5.0, OffsetDateTime.now(), 1));
        UUID quote = new TestQuotes(jdbc, quoteService).quote(payer, cityId, "STANDARD", PICKUP, DROPOFF).id();
        OrderView order = orders.create(payer, UUID.randomUUID(), new CreateOrder(payer.id(), "STANDARD", PICKUP,
                "Home", DROPOFF, "Work", PaymentMethod.CASH, quote));
        dispatch.accept(driver, device.sessionId(), UUID.randomUUID(), dispatch.offers(driver).getFirst().id());
        sessions.heartbeat(driver, device.sessionId(),
                new LocationFix(new GeoPoint(PICKUP.lat() + 0.0003, PICKUP.lon()), 5.0, OffsetDateTime.now(), sequence++));
        TripView trip = trips.current(driver).orElseThrow();
        TripView waiting = trips.arrive(driver, UUID.randomUUID(), trip.id(), trip.version(), null);
        TripView inProgress = trips.start(driver, UUID.randomUUID(), waiting.id(), waiting.version(), null);
        return new Ride(payer, driver, device.sessionId(), order, inProgress);
    }

    private TripView complete(Ride ride, Boolean cashReceived) {
        return trips.complete(ride.driver(), UUID.randomUUID(), ride.trip().id(), ride.trip().version(),
                OffsetDateTime.now(), cashReceived);
    }

    private void deliverEvents() {
        while (relay.runOnce() > 0) {
            // drain
        }
    }

    private long net(Account account, UUID party) {
        return ledger.balances(account, party).stream()
                .filter(b -> b.currency().equals("UAH")).mapToLong(b -> b.debitMinor() - b.creditMinor()).sum();
    }

    record Fare(long amount, BigDecimal rate, long commission, long share) {
    }

    private Fare fare(UUID orderId) {
        return jdbc.sql("""
                        select amount_minor, commission_rate, commission_minor, driver_share_minor
                        from final_fare where order_id = :id""")
                .param("id", orderId)
                .query((rs, i) -> new Fare(rs.getLong(1), rs.getBigDecimal(2), rs.getLong(3), rs.getLong(4)))
                .single();
    }

    // ------------------------------------------------------------ final fare (AC-14)

    @Test
    void theFinalFareIsTheAgreedPriceWithTheQuotedCommissionEvenAfterATariffChange() {
        Ride ride = started();
        // The tariff changes while the trip is running: archive it and publish one with a different commission.
        jdbc.sql("""
                        update tariff_version set state = 'ARCHIVED', version = version + 1, updated_at = now()
                        where city_id = :city and state = 'PUBLISHED'""")
                .param("city", cityId).update();
        jdbc.sql("""
                        insert into tariff_version (id, city_id, class_id, currency, effective_from, state,
                                                    pickup_minor, per_km_minor, per_minute_minor, minimum_minor,
                                                    free_waiting_minutes, waiting_per_minute_minor,
                                                    cancellation_fee_minor, commission_rate, waiting_step_seconds,
                                                        waiting_rounding, pickup_outside_minor,
                                                        per_km_outside_minor, zone_surcharges, created_at, updated_at)
                        select :id, city_id, id, 'UAH', now(), 'PUBLISHED', 9000, 9000, 900, 90000, 1, 900, 0, 0.5,
                               60, 'UP', 9000, 9000, '[]', now(), now()
                        from vehicle_class where city_id = :city and code = 'STANDARD'""")
                .param("id", UUID.randomUUID()).param("city", cityId).update();

        UUID command = UUID.randomUUID();
        OffsetDateTime reportedAt = OffsetDateTime.now();
        TripView done = trips.complete(ride.driver(), command, ride.trip().id(), ride.trip().version(),
                reportedAt, true);
        TripView repeat = trips.complete(ride.driver(), command, ride.trip().id(), ride.trip().version(),
                reportedAt, true);

        assertThat(repeat).isEqualTo(done);
        OrderView order = orders.get(ride.order().id());
        Fare fare = fare(order.id());
        assertThat(order.finalPriceMinor()).isEqualTo(order.priceMinor()).isEqualTo(fare.amount());
        assertThat(fare.rate()).isEqualByComparingTo("0.15");
        assertThat(fare.commission()).isEqualTo(BigDecimal.valueOf(fare.amount()).multiply(new BigDecimal("0.15"))
                .setScale(0, RoundingMode.HALF_UP).longValueExact());
        assertThat(fare.commission() + fare.share()).isEqualTo(fare.amount());
        assertThatThrownBy(() -> jdbc.sql("update final_fare set amount_minor = 1 where order_id = :id")
                .param("id", order.id()).update()).rootCause().hasMessageContaining("immutable");
    }

    record WaitingRule(long freeMinutes, BigDecimal perMinute, long step, String rounding) {
    }

    private WaitingRule rule(UUID orderId) {
        return jdbc.sql("""
                        select (q.snapshot -> 'terms' ->> 'free_waiting_minutes')::bigint,
                               (q.snapshot -> 'terms' ->> 'waiting_per_minute_minor')::numeric,
                               (q.snapshot -> 'terms' ->> 'waiting_step_seconds')::bigint,
                               q.snapshot -> 'terms' ->> 'waiting_rounding'
                        from ride_order o join quote q on q.id = o.quote_id where o.id = :id""")
                .param("id", orderId)
                .query((rs, i) -> new WaitingRule(rs.getLong(1), rs.getBigDecimal(2), rs.getLong(3), rs.getString(4)))
                .single();
    }

    private void waitedMinutes(Ride ride, int minutes) {
        jdbc.sql("update trip set arrived_at = started_at - make_interval(mins => :m) where id = :id")
                .param("m", minutes).param("id", ride.trip().id()).update();
    }

    @Test
    void paidWaitingFollowsTheTariffRuleAndCarriesCommission() {
        Ride ride = started();
        waitedMinutes(ride, 10);
        complete(ride, true);

        OrderView order = orders.get(ride.order().id());
        WaitingRule rule = rule(order.id());
        assertThat(rule.rounding()).isEqualTo("UP");
        long billable = Math.max(0, 600 - rule.freeMinutes() * 60);
        long charged = Math.ceilDiv(billable, rule.step()) * rule.step();
        long waiting = rule.perMinute().multiply(BigDecimal.valueOf(charged))
                .divide(BigDecimal.valueOf(60), 0, RoundingMode.HALF_UP).longValueExact();
        Fare fare = fare(order.id());
        assertThat(waiting).isPositive();
        assertThat(fare.amount()).isEqualTo(order.priceMinor() + waiting).isEqualTo(order.finalPriceMinor());
        assertThat(fare.commission()).isEqualTo(BigDecimal.valueOf(fare.amount()).multiply(fare.rate())
                .setScale(0, RoundingMode.HALF_UP).longValueExact());
        assertThat(jdbc.sql("select policy from final_fare where order_id = :id").param("id", order.id())
                .query(String.class).single()).isEqualTo("M1_AGREED_PLUS_WAITING");
    }

    @Test
    void noAutomaticWaitingChargeAfterAnArrivalConfirmedWithAnException() {
        Ride ride = started();
        waitedMinutes(ride, 10);
        jdbc.sql("update trip set arrival_exception = 'Passenger asked to wait around the corner' where id = :id")
                .param("id", ride.trip().id()).update();
        complete(ride, true);

        OrderView order = orders.get(ride.order().id());
        assertThat(order.finalPriceMinor()).isEqualTo(order.priceMinor());
    }

    // ------------------------------------------------------------ journal (AC-16)

    @Test
    void aCashTripLeavesTheDriverOwingTheCommissionAndPaysNothingOut() {
        Ride ride = started();
        complete(ride, true);

        deliverEvents();
        deliverEvents();

        Fare fare = fare(ride.order().id());
        assertThat(net(Account.DRIVER_PAYABLE, ride.driver().id())).as("driver owes the commission")
                .isEqualTo(fare.commission());
        assertThat(net(Account.RIDER_RECEIVABLE, ride.payer().id())).as("passenger paid in cash").isZero();
        assertThat(jdbc.sql("select count(*) from journal_transaction where basis_id = :id")
                .param("id", ride.order().id()).query(Long.class).single()).isEqualTo(2);
        assertThat(jdbc.sql("""
                        select count(*) from (
                            select l.transaction_id from journal_line l join journal_transaction t on t.id = l.transaction_id
                            where t.basis_id = :id
                            group by l.transaction_id having sum(l.debit_minor) <> sum(l.credit_minor)) unbalanced""")
                .param("id", ride.order().id()).query(Long.class).single()).isZero();
    }

    @Test
    void redeliveryOfTheEventDoesNotPostTwice() {
        Ride ride = started();
        complete(ride, true);
        deliverEvents();
        long before = jdbc.sql("select count(*) from journal_transaction where basis_id = :id")
                .param("id", ride.order().id()).query(Long.class).single();

        // A second consumer run of the same event (e.g. after a lost inbox row) must not post again.
        String payload = jdbc.sql("""
                        select payload::text from outbox where aggregate_id = :id and event_type = 'TripCompleted'""")
                .param("id", ride.order().id()).query(String.class).single();
        OutboxHandler posting = handlers.stream()
                .filter(h -> h.consumerId().equals("finance.trip-fare-posting")).findFirst().orElseThrow();
        tx.executeWithoutResult(s -> posting.handle(new OutboxMessage(UUID.randomUUID(), "TripCompleted", 1, "Order",
                        ride.order().id(), 99, payload, UUID.randomUUID(), OffsetDateTime.now(), 0)));

        assertThat(jdbc.sql("select count(*) from journal_transaction where basis_id = :id")
                .param("id", ride.order().id()).query(Long.class).single()).isEqualTo(before);
        assertThat(net(Account.DRIVER_PAYABLE, ride.driver().id())).isEqualTo(fare(ride.order().id()).commission());
    }

    @Test
    void cashNotReceivedLeavesThePassengerOwingAndTheDriverTheShare() {
        Ride ride = started();
        complete(ride, false);
        deliverEvents();

        Fare fare = fare(ride.order().id());
        assertThat(net(Account.RIDER_RECEIVABLE, ride.payer().id())).isEqualTo(fare.amount());
        assertThat(net(Account.DRIVER_PAYABLE, ride.driver().id())).isEqualTo(-fare.share());
    }

    private Actor settingsAdmin() {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, all_cities, state, created_at, updated_at)
                        values (:id, :login, 'Admin', 'ADMIN', '{settings.manage}', true, 'ACTIVE', now(), now())""")
                .param("id", id).param("login", "cash-rule-" + id).update();
        return new Actor(taxi.blizz.platform.SubjectType.STAFF, id);
    }

    /** Ends the free driver's shift, so the next ride of this test gets its own driver (the offer goes to the nearest). */
    private void offline(Ride ride) {
        long version = jdbc.sql("select version from work_session where driver_id = :d and state = 'OPEN'")
                .param("d", ride.driver().id()).query(Long.class).single();
        sessions.close(ride.driver(), UUID.randomUUID(), ride.device(), version);
    }

    /** Sets the cash-not-received rule and returns the version to restore from. */
    private taxi.blizz.configuration.ServiceSettings.Version cashRule(Actor admin, boolean credit, int percent) {
        var now = settings.current();
        var s = now.settings();
        return settings.change(admin, UUID.randomUUID(), now.version(), new taxi.blizz.configuration.ServiceSettings.Settings(
                s.brand(), s.languages(), s.calls(), s.preorders(), s.ratings(), s.tips(), s.orders(),
                new taxi.blizz.configuration.ServiceSettings.CashNotReceived(credit, percent)), "Cash rule test");
    }

    /** Owner decision 28.10.2026: what the driver gets for an unpaid cash trip is the service's setting. */
    @Test
    void cashNotReceivedCreditsTheDriverOnlyThePartTheSettingAllowsAndHoldsTheRest() {
        Actor admin = settingsAdmin();
        try {
            cashRule(admin, true, 50);
            Ride half = started();
            complete(half, false);
            offline(half);
            deliverEvents();
            Fare halfFare = fare(half.order().id());
            long credited = halfFare.share() * 50 / 100;
            assertThat(net(Account.DRIVER_PAYABLE, half.driver().id())).isEqualTo(-credited);
            assertThat(net(Account.SUSPENSE, half.driver().id())).as("held for support")
                    .isEqualTo(-(halfFare.share() - credited));
            assertThat(net(Account.RIDER_RECEIVABLE, half.payer().id())).isEqualTo(halfFare.amount());

            cashRule(admin, false, 70);
            assertThat(settings.current().settings().cashNotReceived().driverSharePercent())
                    .as("ignored when the driver is not credited").isZero();
            Ride none = started();
            complete(none, false);
            offline(none);
            deliverEvents();
            Fare noneFare = fare(none.order().id());
            assertThat(net(Account.DRIVER_PAYABLE, none.driver().id())).isZero();
            assertThat(net(Account.SUSPENSE, none.driver().id())).isEqualTo(-noneFare.share());

            // A trip paid in cash as reported is not touched by the rule.
            Ride paid = started();
            complete(paid, true);
            offline(paid);
            deliverEvents();
            assertThat(net(Account.DRIVER_PAYABLE, paid.driver().id())).isEqualTo(fare(paid.order().id()).commission());
            assertThat(net(Account.SUSPENSE, paid.driver().id())).isZero();

            assertThatThrownBy(() -> cashRule(admin, true, 101)).isInstanceOf(DomainException.class)
                    .extracting(e -> ((DomainException) e).code()).isEqualTo(ErrorCode.VALIDATION_FAILED);
        } finally {
            cashRule(admin, true, 100);
        }
    }

    @Test
    void theJournalIsBalancedAndAppendOnly() {
        UUID basis = UUID.randomUUID();
        assertThatThrownBy(() -> ledger.post(new Ledger.Posting("test-unbalanced:" + basis, "TEST", basis, "UAH",
                "unbalanced", List.of(Line.debit(Account.SUSPENSE, null, 100), Line.credit(Account.SUSPENSE, null, 99)))))
                .isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(ErrorCode.VALIDATION_FAILED);
        assertThatThrownBy(() -> tx.executeWithoutResult(s -> {
            UUID id = UUID.randomUUID();
            jdbc.sql("""
                            insert into journal_transaction (id, business_key, basis_type, basis_id, currency, reason,
                                                             occurred_at)
                            values (:id, :key, 'TEST', :basis, 'UAH', 'raw', now())""")
                    .param("id", id).param("key", "test-raw:" + id).param("basis", basis).update();
            jdbc.sql("insert into journal_line values (:id, 1, 'SUSPENSE', null, 100, 0)").param("id", id).update();
            jdbc.sql("insert into journal_line values (:id, 2, 'SUSPENSE', null, 0, 50)").param("id", id).update();
        })).rootCause().hasMessageContaining("does not balance");

        assertThat(ledger.post(new Ledger.Posting("test-ok:" + basis, "TEST", basis, "UAH", "balanced",
                List.of(Line.debit(Account.SUSPENSE, null, 100), Line.credit(Account.SUSPENSE, null, 100))))).isTrue();
        assertThat(ledger.post(new Ledger.Posting("test-ok:" + basis, "TEST", basis, "UAH", "balanced",
                List.of(Line.debit(Account.SUSPENSE, null, 100), Line.credit(Account.SUSPENSE, null, 100))))).isFalse();
        assertThatThrownBy(() -> jdbc.sql("""
                        update journal_line set debit_minor = 1 where transaction_id =
                            (select id from journal_transaction where business_key = :key) and line_no = 1""")
                .param("key", "test-ok:" + basis).update()).rootCause().hasMessageContaining("append-only");
        assertThatThrownBy(() -> jdbc.sql("delete from journal_transaction where business_key = :key")
                .param("key", "test-ok:" + basis).update()).rootCause().hasMessageContaining("append-only");
    }

    // ------------------------------------------------------------ driver HTTP

    @Test
    @SuppressWarnings("unchecked")
    void theDriverSeesWhatHeOwes() throws Exception {
        Ride ride = started();
        complete(ride, true);
        deliverEvents();
        List<Filter> filters = new ArrayList<>(context.getBeansOfType(Filter.class).values());
        AnnotationAwareOrderComparator.sort(filters);
        MockMvc mvc = MockMvcBuilders.webAppContextSetup(context).addFilters(filters.toArray(Filter[]::new)).build();
        IssuedSession token = authSessions.open(new VerifiedSubject(ride.driver(), "ACTIVE", false), "tablet");

        MvcResult result = mvc.perform(get("/api/driver/v1/balance")
                .header(HttpHeaders.AUTHORIZATION, "Bearer " + token.accessToken())).andReturn();

        assertThat(result.getResponse().getStatus()).isEqualTo(200);
        Map<String, Object> body = json.readValue(result.getResponse().getContentAsString(), Map.class);
        assertThat((List<Map<String, Object>>) body.get("balances")).singleElement().satisfies(b -> {
            assertThat(b).containsEntry("currency", "UAH");
            assertThat(((Number) b.get("balance_minor")).longValue()).isEqualTo(-fare(ride.order().id()).commission());
        });
    }
}
