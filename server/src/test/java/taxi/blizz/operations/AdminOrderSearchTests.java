package taxi.blizz.operations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
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
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.PageCursor;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.pricing.QuoteService;

/**
 * Issue #142, part A (REQ-ADM-01): staff find orders after the fact — by city, status, period, rider or driver phone
 * and short number, a page at a time — see a city's day by status and an order's history. E1: staff of one city see,
 * filter and read nothing of another city's orders. Cities at longitudes 114 and 109.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class AdminOrderSearchTests {

    static final GeoPoint PICKUP_A = new GeoPoint(-39.5, 114.5);
    static final GeoPoint DROPOFF_A = new GeoPoint(-39.45, 114.55);
    static final GeoPoint PICKUP_B = new GeoPoint(-39.5, 109.5);
    static final GeoPoint DROPOFF_B = new GeoPoint(-39.45, 109.55);

    @Autowired Orders orders;
    @Autowired Dispatch dispatch;
    @Autowired Trips trips;
    @Autowired WorkSessions sessions;
    @Autowired SessionService auth;
    @Autowired QuoteService quotes;
    @Autowired JdbcClient jdbc;

    TestRides rides;
    UUID cityA;
    UUID cityB;

    @BeforeEach
    void cities() {
        rides = new TestRides(jdbc, orders, dispatch, trips, sessions, auth, quotes);
        cityA = rides.city("test-admin-orders-a", "UAH", 114);
        cityB = rides.city("test-admin-orders-b", "UAH", 109);
        for (UUID city : List.of(cityA, cityB)) {
            jdbc.sql("""
                            update ride_order set status = 'UNFULFILLED'
                            where city_id = :c and status in ('READY', 'SEARCHING', 'ASSIGNED', 'IN_SERVICE')""")
                    .param("c", city).update();
        }
    }

    private Actor staff(boolean allCities, UUID... cities) {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into staff_user (id, login, name, role, permissions, all_cities, city_scope, state,
                                                created_at, updated_at)
                        values (:id, :login, 'Support', 'OPERATOR', :permissions, :all, :cities, 'ACTIVE', now(),
                                now())""")
                .param("id", id).param("login", "admin-orders-" + id)
                .param("permissions", new String[] {Orders.VIEW_PERMISSION}).param("all", allCities)
                .param("cities", cities).update();
        return new Actor(SubjectType.STAFF, id);
    }

    private String phone(String table, UUID id) {
        return jdbc.sql("select phone_normalized from " + table + " where id = :id").param("id", id)
                .query(String.class).single();
    }

    private static List<UUID> ids(List<Orders.Found> found) {
        return found.stream().map(Orders.Found::id).toList();
    }

    private static void assertCode(ThrowingCallable call, ErrorCode code) {
        assertThatThrownBy(call).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }

    private static Orders.Search in(UUID city) {
        return new Orders.Search(city, null, null, null, null, null, null);
    }

    @Test
    void staffOfOneCitySeeFilterAndReadNothingOfAnother() {
        TestRides.Driver driverA = rides.driverNear(PICKUP_A);
        TestRides.Ride rideA = rides.assigned(cityA, driverA, PICKUP_A, DROPOFF_A);
        TestRides.Driver driverB = rides.driverNear(PICKUP_B);
        TestRides.Ride rideB = rides.assigned(cityB, driverB, PICKUP_B, DROPOFF_B);
        Actor ofA = staff(false, cityA);

        List<UUID> visible = ids(orders.search(ofA, new Orders.Search(null, null, OffsetDateTime.now().minusMinutes(5),
                null, null, null, null), null, 100));
        assertThat(visible).contains(rideA.order().id()).doesNotContain(rideB.order().id());
        assertCode(() -> orders.search(ofA, in(cityB), null, 10), ErrorCode.ACCESS_DENIED);
        // Filters never reach another city: the rider's phone, the driver's phone, the short number.
        assertThat(orders.search(ofA, new Orders.Search(null, null, null, null,
                phone("client", rideB.payer().id()), null, null), null, 10)).isEmpty();
        assertThat(orders.search(ofA, new Orders.Search(null, null, null, null, null,
                phone("driver", driverB.actor().id()), null), null, 10)).isEmpty();
        assertThat(orders.search(ofA, new Orders.Search(null, null, null, null, null, null,
                rideB.order().shortNumber()), null, 10)).isEmpty();
        assertCode(() -> orders.timeline(ofA, rideB.order().id()), ErrorCode.ACCESS_DENIED);
        assertCode(() -> orders.overview(ofA, cityB, LocalDate.now(ZoneOffset.UTC)), ErrorCode.ACCESS_DENIED);
        assertThat(orders.timeline(ofA, rideA.order().id())).isNotEmpty();

        // Staff of every city see both; staff without the permission see nothing.
        assertThat(ids(orders.search(staff(true), new Orders.Search(null, null, OffsetDateTime.now().minusMinutes(5),
                null, null, null, null), null, 100))).contains(rideA.order().id(), rideB.order().id());
        Actor none = new Actor(SubjectType.STAFF, UUID.randomUUID());
        assertCode(() -> orders.search(none, in(null), null, 10), ErrorCode.ACCESS_DENIED);
    }

    @Test
    void eachFilterFindsItsOrdersAndPagesNeitherRepeatNorSkip() {
        Actor all = staff(false, cityA);
        TestRides.Driver driver = rides.driverNear(PICKUP_A);
        TestRides.Ride driven = rides.assigned(cityA, driver, PICKUP_A, DROPOFF_A);
        Actor rider = rides.client();
        OrderView first = rides.order(rider, cityA, PICKUP_A, DROPOFF_A);
        orders.cancel(rider, UUID.randomUUID(), first.id(), orders.get(first.id()).version(), "CHANGED_MIND");
        OrderView second = rides.order(rider, cityA, PICKUP_A, DROPOFF_A);
        orders.cancel(rider, UUID.randomUUID(), second.id(), orders.get(second.id()).version(), "CHANGED_MIND");
        OffsetDateTime since = OffsetDateTime.now().minusMinutes(5);

        assertThat(ids(orders.search(all, new Orders.Search(cityA, Set.of("CANCELLED"), since, null,
                phone("client", rider.id()), null, null), null, 10))).containsExactly(second.id(), first.id());
        assertThat(ids(orders.search(all, new Orders.Search(cityA, null, null, null, null,
                phone("driver", driver.actor().id()), null), null, 10))).containsExactly(driven.order().id());
        assertThat(ids(orders.search(all, new Orders.Search(cityA, null, null, null, null, null,
                first.shortNumber()), null, 10))).containsExactly(first.id());
        assertThat(orders.search(all, new Orders.Search(cityA, Set.of("ASSIGNED"), since, null, null, null, null),
                null, 10)).extracting(Orders.Found::driverId).contains(driver.actor().id());
        assertThat(orders.search(all, new Orders.Search(cityA, null, null, since, null, null, null), null, 10))
                .as("to is before every one of them").isEmpty();
        assertThat(orders.search(all, new Orders.Search(cityA, null, null, null, "+48000000000", null, null),
                null, 10)).as("an unknown phone finds nothing").isEmpty();
        assertCode(() -> orders.search(all, new Orders.Search(cityA, null, null, null, "0501234567", null, null),
                null, 10), ErrorCode.VALIDATION_FAILED);
        assertCode(() -> orders.search(all, new Orders.Search(cityA, Set.of("LOST"), null, null, null, null, null),
                null, 10), ErrorCode.VALIDATION_FAILED);

        // Pages of one: newest first, each once.
        Orders.Search recent = new Orders.Search(cityA, null, since, null, null, null, null);
        List<UUID> all3 = ids(orders.search(all, recent, null, 100));
        List<UUID> paged = new ArrayList<>();
        PageCursor after = null;
        for (int i = 0; i < 10; i++) {
            List<Orders.Found> page = orders.search(all, recent, after, 1);
            if (page.isEmpty()) {
                break;
            }
            paged.add(page.getFirst().id());
            after = Orders.position(page.getFirst());
        }
        assertThat(paged).isEqualTo(all3).hasSize(3);
    }

    @Test
    void theOverviewCountsTheCitysLocalDay() {
        jdbc.sql("update city set timezone = 'Asia/Kolkata' where id = :id").param("id", cityA).update();
        Actor rider = rides.client();
        LocalDate day = LocalDate.of(2026, 10, 20);
        // 23:50 UTC on the 19th is 05:20 on the 20th in Kolkata; 19:00 UTC on the 20th is 00:30 on the 21st.
        OffsetDateTime[] created = {OffsetDateTime.parse("2026-10-19T23:50:00Z"),
                OffsetDateTime.parse("2026-10-20T10:00:00Z"), OffsetDateTime.parse("2026-10-20T19:00:00Z")};
        String[] statuses = {"FULFILLED", "CANCELLED", "FULFILLED"};
        for (int i = 0; i < created.length; i++) {
            OrderView order = rides.order(rider, cityA, PICKUP_A, DROPOFF_A);
            orders.cancel(rider, UUID.randomUUID(), order.id(), orders.get(order.id()).version(), "CHANGED_MIND");
            if ("FULFILLED".equals(statuses[i])) {
                jdbc.sql("""
                                update ride_order set status = 'FULFILLED', cancelled_by = null,
                                                      cancel_reason_code = null, cancel_reason_labels = null
                                where id = :id""")
                        .param("id", order.id()).update();
            }
            jdbc.sql("update ride_order set created_at = :at where id = :id").param("at", created[i])
                    .param("id", order.id()).update();
        }
        Orders.Overview overview = orders.overview(staff(false, cityA), cityA, day);
        assertThat(overview.timeZone()).isEqualTo("Asia/Kolkata");
        assertThat(overview.byStatus()).containsExactlyInAnyOrder(new Orders.StatusCount("FULFILLED", 1),
                new Orders.StatusCount("CANCELLED", 1));
        assertThat(overview.total()).isEqualTo(2);
        assertThat(overview.date()).isEqualTo(day);
    }
}
