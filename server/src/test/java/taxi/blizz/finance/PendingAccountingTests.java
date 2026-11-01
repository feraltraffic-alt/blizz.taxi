package taxi.blizz.finance;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import io.micrometer.core.instrument.MeterRegistry;
import java.time.LocalDate;
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
import taxi.blizz.TestRides;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.SessionService;
import taxi.blizz.operations.Dispatch;
import taxi.blizz.operations.FareCorrections;
import taxi.blizz.operations.Orders;
import taxi.blizz.operations.Trips;
import taxi.blizz.operations.WorkSessions;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DatabaseGauges;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.platform.internal.OutboxRelay;
import taxi.blizz.pricing.QuoteService;

/**
 * Issue #140 E4, REQ-LED-05: a completed trip whose fare posting fails is "pending accounting" in the admin fare view,
 * the order search, the list of pending postings and the driver's earnings, and the gauge counts it; once the retry
 * posts it, it is POSTED everywhere and the gauge lets go. The posting fails for real: a trigger on
 * journal_transaction refuses the trip's fare, as a broken ledger would. Its own city at longitude 18.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class PendingAccountingTests {

    static final GeoPoint PICKUP = new GeoPoint(-39.5, 18.5);
    static final GeoPoint DROPOFF = new GeoPoint(-39.45, 18.55);
    static final String GAUGE = "blizz.finance.postings.pending.oldest.seconds";

    @Autowired Orders orders;
    @Autowired Dispatch dispatch;
    @Autowired Trips trips;
    @Autowired WorkSessions sessions;
    @Autowired SessionService auth;
    @Autowired QuoteService quotes;
    @Autowired FareCorrections fares;
    @Autowired FareAccounting accounting;
    @Autowired DriverEarnings earnings;
    @Autowired OutboxRelay relay;
    @Autowired List<DatabaseGauges> gauges;
    @Autowired MeterRegistry meters;
    @Autowired JdbcClient jdbc;

    TestRides rides;
    UUID city;
    Actor staff;

    @BeforeEach
    void setUp() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        city = rides.city("test-pending-accounting", "UAH", 18);
        staff = staff(city, Orders.VIEW_PERMISSION, DriverBalances.MANAGE_PERMISSION);
        deliverEvents();
        jdbc.sql("create table if not exists test_failing_fare (order_id uuid primary key)").update();
        jdbc.sql("""
                        create or replace function test_fail_fare() returns trigger language plpgsql as $$
                        begin
                            if new.basis_type = 'TRIP_FARE'
                               and exists (select 1 from test_failing_fare where order_id = new.basis_id) then
                                raise exception 'test: the ledger refuses the fare of %', new.basis_id;
                            end if;
                            return new;
                        end $$""").update();
        jdbc.sql("drop trigger if exists test_fail_fare on journal_transaction").update();
        jdbc.sql("""
                        create trigger test_fail_fare before insert on journal_transaction
                            for each row execute function test_fail_fare()""").update();
    }

    @AfterEach
    void cleanUp() {
        jdbc.sql("drop trigger if exists test_fail_fare on journal_transaction").update();
        jdbc.sql("delete from test_failing_fare").update();
        deliverEvents();
    }

    @Test
    void aTripWhosePostingFailsIsPendingEverywhereUntilTheRetryPostsIt() {
        TestRides.Ride ride = rides.started(city, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        UUID order = ride.order().id();
        UUID driver = ride.driver().actor().id();
        jdbc.sql("insert into test_failing_fare (order_id) values (:id)").param("id", order).update();
        rides.complete(ride, true);
        deliverEvents();
        long fare = orders.get(order).finalPriceMinor();
        assertThat(fare).isPositive();
        assertThat(accounting.posted(List.of(order))).isEmpty();

        assertThat(fares.fare(staff, order).accounting()).isEqualTo("PENDING");
        assertThat(found(order).accounting()).isEqualTo("PENDING");
        FareAccounting.PendingList pending = accounting.pending(staff, city);
        assertThat(pending.cityId()).isEqualTo(city);
        assertThat(pending.trips()).singleElement().satisfies(t -> {
            assertThat(t.orderId()).isEqualTo(order);
            assertThat(t.driverId()).isEqualTo(driver);
            assertThat(t.fareMinor()).isEqualTo(fare);
            assertThat(t.currency()).isEqualTo("UAH");
            assertThat(t.waitingSeconds()).isNotNegative();
        });
        FareAccounting.Pending mine = earnings.mine(ride.driver().actor(), city, LocalDate.now().minusDays(1),
                LocalDate.now().plusDays(1)).pending();
        assertThat(mine).isEqualTo(new FareAccounting.Pending(1, fare));

        // The gauge counts trips older than a minute: the event is made six days old (inside the list's window).
        jdbc.sql("""
                        update outbox set occurred_at = now() - interval '6 days'
                        where event_type = 'TripCompleted' and payload ->> 'order_id' = :id""")
                .param("id", order.toString()).update();
        refreshGauges();
        double late = meters.get(GAUGE).gauge().value();
        assertThat(late).isGreaterThan(6 * 86_400 - 120);

        // The ledger works again; the retry posts the fare.
        jdbc.sql("delete from test_failing_fare").update();
        jdbc.sql("""
                        update outbox set next_attempt_at = now()
                        where event_type = 'TripCompleted' and payload ->> 'order_id' = :id""")
                .param("id", order.toString()).update();
        deliverEvents();
        assertThat(accounting.posted(List.of(order))).containsExactly(order);
        assertThat(fares.fare(staff, order).accounting()).isEqualTo("POSTED");
        assertThat(found(order).accounting()).isEqualTo("POSTED");
        assertThat(accounting.pending(staff, city).trips()).isEmpty();
        assertThat(earnings.mine(ride.driver().actor(), city, LocalDate.now().minusDays(1),
                LocalDate.now().plusDays(1)).pending()).isEqualTo(new FareAccounting.Pending(0, 0));
        refreshGauges();
        assertThat(meters.get(GAUGE).gauge().value()).isLessThan(late);
    }

    @Test
    void anOrderWithoutAFareToPostIsNeitherPostedNorPending() {
        TestRides.Ride ride = rides.started(city, rides.driverNear(PICKUP), PICKUP, DROPOFF);
        UUID cancelled = rides.order(rides.client(), city, PICKUP, DROPOFF).id();
        orders.cancel(staff(city, Orders.CANCEL_PERMISSION, Orders.VIEW_PERMISSION), UUID.randomUUID(), cancelled,
                orders.get(cancelled).version(), "NO_CARS");
        assertThat(found(cancelled).accounting()).isNull();
        assertThat(found(ride.order().id()).accounting()).as("not completed yet").isNull();

        // A TripCompleted without a fare (amount 0) owes nothing, even if finance never handled it.
        UUID free = UUID.randomUUID();
        jdbc.sql("""
                        insert into outbox (event_id, event_type, schema_version, aggregate_type, aggregate_id,
                                            aggregate_version, payload, correlation_id, occurred_at, state,
                                            next_attempt_at)
                        values (:id, 'TripCompleted', 1, 'Order', :order, 1, cast(:payload as jsonb), :id,
                                now() - interval '1 hour', 'FAILED', now())""")
                .param("id", UUID.randomUUID()).param("order", free)
                .param("payload", """
                        {"order_id": "%s", "driver_id": "%s", "city_id": "%s", "final_fare_id": "%s",
                         "amount_minor": 0, "currency": "UAH"}""".formatted(free, UUID.randomUUID(), city,
                        UUID.randomUUID()))
                .update();
        try {
            assertThat(accounting.pending(staff, city).trips()).extracting(FareAccounting.PendingTrip::orderId)
                    .doesNotContain(free);
        } finally {
            jdbc.sql("delete from outbox where aggregate_id = :order").param("order", free).update();
        }
    }

    @Test
    void theListNeedsFinanceRightsForTheCity() {
        Actor viewer = staff(city, Orders.VIEW_PERMISSION);
        Actor elsewhere = staff(UUID.randomUUID(), DriverBalances.MANAGE_PERMISSION);
        for (Actor actor : new Actor[]{viewer, elsewhere}) {
            assertThatThrownBy(() -> accounting.pending(actor, city)).isInstanceOf(DomainException.class)
                    .extracting(e -> ((DomainException) e).code()).isEqualTo(ErrorCode.ACCESS_DENIED);
        }
        assertThat(accounting.pending(staff, city).more()).isFalse();
    }

    // ---------------------------------------------------------------- fixtures

    private Orders.Found found(UUID order) {
        return orders.search(staff, new Orders.Search(city, Set.of(), null, null, null, null,
                        orders.get(order).shortNumber()), null, 10).stream()
                .filter(f -> f.id().equals(order)).findFirst().orElseThrow();
    }

    private void deliverEvents() {
        while (relay.runOnce() > 0) {
            // drain
        }
    }

    private void refreshGauges() {
        gauges.forEach(DatabaseGauges::refresh);
    }

    private Actor staff(UUID scope, String... permissions) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, all_cities, city_scope, state,
                                                created_at, updated_at)
                        values (:id, :login, 'Accounting', 'ADMIN', :permissions, false, :scope, 'ACTIVE', now(),
                                now())""")
                .param("id", id).param("login", "accounting-" + id).param("permissions", permissions)
                .param("scope", new UUID[]{scope}).update();
        return new Actor(SubjectType.STAFF, id);
    }
}
