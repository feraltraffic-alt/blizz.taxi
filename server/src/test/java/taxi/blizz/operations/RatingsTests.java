package taxi.blizz.operations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.time.OffsetDateTime;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import taxi.blizz.TestcontainersConfiguration;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.SubjectType;

@SpringBootTest
@Import(TestcontainersConfiguration.class)
class RatingsTests {

    private static final String AREA = "SRID=4326;MULTIPOLYGON(((-30 10,-29 10,-29 11,-30 11,-30 10)))";

    @Autowired Ratings ratings;
    @Autowired JdbcClient jdbc;

    record Ride(UUID orderId, Actor rider, Actor driver) {
    }

    @Test
    void bothSidesRateAndDriverAverageHasNoComments() {
        Ride ride = fulfilledRide();

        Ratings.Rating fromRider = ratings.submit(ride.rider(), UUID.randomUUID(), ride.orderId(), 5, " excellent ");
        ratings.submit(ride.driver(), UUID.randomUUID(), ride.orderId(), 4, "kind rider");

        assertThat(fromRider.score()).isEqualTo(5);
        assertThat(ratings.mine(ride.rider(), ride.orderId()).score()).isEqualTo(5);
        assertThat(ratings.driverSummary(ride.driver())).isEqualTo(new Ratings.DriverSummary(5, 1, 500));
        assertThat(jdbc.sql("select comment from rating where order_id = :id and author_type = 'RIDER' and superseded_at is null")
                .param("id", ride.orderId()).query(String.class).single()).isEqualTo("excellent");
        String payload = jdbc.sql("select payload::text from outbox where event_type = 'RatingSubmitted' order by occurred_at desc limit 1")
                .query(String.class).single();
        assertThat(payload).contains("score").doesNotContain("excellent").doesNotContain("comment");
    }

    @Test
    void editSupersedesPreviousRatingAndClosedWindowRejectsChange() {
        Ride ride = fulfilledRide();
        ratings.submit(ride.rider(), UUID.randomUUID(), ride.orderId(), 3, "first");
        ratings.submit(ride.rider(), UUID.randomUUID(), ride.orderId(), 5, "second");

        assertThat(ratings.mine(ride.rider(), ride.orderId()).score()).isEqualTo(5);
        assertThat(jdbc.sql("select count(*) from rating where order_id = :id")
                .param("id", ride.orderId()).query(Long.class).single()).isEqualTo(2);
        assertThat(jdbc.sql("select count(*) from rating where order_id = :id and superseded_at is null")
                .param("id", ride.orderId()).query(Long.class).single()).isEqualTo(1);

        jdbc.sql("update trip set completed_at = now() - interval '25 hours' where order_id = :id")
                .param("id", ride.orderId()).update();
        assertCode(() -> ratings.submit(ride.rider(), UUID.randomUUID(), ride.orderId(), 4, null), ErrorCode.STATE_CONFLICT);
    }

    @Test
    void commandReceiptIncludesEveryRatingInput() {
        Ride ride = fulfilledRide();
        UUID commandId = UUID.randomUUID();
        Ratings.Rating first = ratings.submit(ride.rider(), commandId, ride.orderId(), 5, "same");
        Ratings.Rating repeated = ratings.submit(ride.rider(), commandId, ride.orderId(), 5, "same");
        assertThat(repeated).isEqualTo(first);

        assertCode(() -> ratings.submit(ride.rider(), commandId, ride.orderId(), 4, "same"),
                ErrorCode.IDEMPOTENCY_CONFLICT);
        assertCode(() -> ratings.submit(ride.rider(), commandId, ride.orderId(), 5, "different"),
                ErrorCode.IDEMPOTENCY_CONFLICT);
    }

    @Test
    void rejectsInvalidScoreStrangersAndNonFulfilledOrdersWithoutLeakingThem() {
        Ride ride = fulfilledRide();
        Actor strangerRider = client();
        Actor strangerDriver = driver();

        assertCode(() -> ratings.submit(ride.rider(), UUID.randomUUID(), ride.orderId(), 0, null),
                ErrorCode.VALIDATION_FAILED);
        assertCode(() -> ratings.submit(ride.rider(), UUID.randomUUID(), ride.orderId(), 6, null),
                ErrorCode.VALIDATION_FAILED);
        assertCode(() -> ratings.submit(strangerRider, UUID.randomUUID(), ride.orderId(), 5, null), ErrorCode.NOT_FOUND);
        assertCode(() -> ratings.submit(strangerDriver, UUID.randomUUID(), ride.orderId(), 5, null), ErrorCode.NOT_FOUND);

        jdbc.sql("update ride_order set status = 'IN_SERVICE' where id = :id").param("id", ride.orderId()).update();
        assertCode(() -> ratings.submit(ride.rider(), UUID.randomUUID(), ride.orderId(), 5, null), ErrorCode.NOT_FOUND);
    }

    @Test
    void staffWithoutOrdersViewForCityCannotReadComments() {
        Ride ride = fulfilledRide();
        ratings.submit(ride.rider(), UUID.randomUUID(), ride.orderId(), 5, "staff only");
        Actor unauthorizedStaff = new Actor(SubjectType.STAFF, UUID.randomUUID());

        assertCode(() -> ratings.forStaff(unauthorizedStaff, ride.orderId()), ErrorCode.ACCESS_DENIED);
    }

    private Ride fulfilledRide() {
        UUID city = UUID.randomUUID();
        jdbc.sql("""
                insert into city (id, code, name, currency, timezone, polygon, priority, state, created_at, updated_at)
                values (:id, :code, 'Ratings', 'UAH', 'Europe/Kyiv', ST_GeomFromEWKT(:area), 1, 'PUBLISHED', now(), now())
                """).param("id", city).param("code", "ratings-" + city.toString().substring(0, 8))
                .param("area", AREA).update();
        Actor rider = client();
        Actor driver = driver();
        UUID vehicle = UUID.randomUUID();
        jdbc.sql("""
                insert into vehicle (id, driver_id, registration_number, make, model, color, production_year,
                                     state, class_approvals, created_at, updated_at)
                values (:id, :driver, :reg, 'VW', 'Passat', 'black', 2021, 'APPROVED', '{STANDARD}', now(), now())
                """).param("id", vehicle).param("driver", driver.id())
                .param("reg", "RT" + Math.floorMod(vehicle.hashCode(), 1_000_000)).update();

        UUID order = UUID.randomUUID();
        jdbc.sql("""
                insert into ride_order (id, channel, payer_client_id, created_by_type, created_by_id, city_id,
                    vehicle_class, pickup, pickup_label, dropoff, dropoff_label, payment_method, status,
                    created_at, updated_at, version)
                values (:id, 'APP', :rider, 'CLIENT', :rider, :city, 'STANDARD',
                    ST_SetSRID(ST_MakePoint(-29.8, 10.2), 4326), 'A',
                    ST_SetSRID(ST_MakePoint(-29.7, 10.3), 4326), 'B', 'CASH', 'FULFILLED', now(), now(), 7)
                """).param("id", order).param("rider", rider.id()).param("city", city).update();
        UUID assignment = UUID.randomUUID();
        jdbc.sql("""
                insert into assignment (id, order_id, driver_id, vehicle_id, source, state, created_at, closed_at, version)
                values (:id, :orderId, :driver, :vehicle, 'OFFER', 'COMPLETED', now() - interval '1 hour', now(), 1)
                """).param("id", assignment).param("orderId", order).param("driver", driver.id())
                .param("vehicle", vehicle).update();
        jdbc.sql("""
                insert into trip (id, assignment_id, order_id, phase, arrived_at, started_at, completed_at, created_at, version)
                values (:id, :assignment, :orderId, 'COMPLETED', now() - interval '40 minutes',
                        now() - interval '30 minutes', now() - interval '5 minutes', now() - interval '1 hour', 3)
                """).param("id", UUID.randomUUID()).param("assignment", assignment).param("orderId", order).update();
        return new Ride(order, rider, driver);
    }

    private Actor client() {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                insert into client (id, phone_normalized, account_state, has_app, created_at, updated_at)
                values (:id, :phone, 'ACTIVE', true, now(), now())
                """).param("id", id).param("phone", "+48" + String.format("%09d", Math.floorMod(id.hashCode(), 1_000_000_000)))
                .update();
        return new Actor(SubjectType.CLIENT, id);
    }

    private Actor driver() {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                insert into driver (id, phone_normalized, account_state, review_status, created_at, updated_at)
                values (:id, :phone, 'ACTIVE', 'APPROVED', now(), now())
                """).param("id", id).param("phone", "+38093" + String.format("%07d", Math.floorMod(id.hashCode(), 10_000_000)))
                .update();
        return new Actor(SubjectType.DRIVER, id);
    }

    private static void assertCode(org.assertj.core.api.ThrowableAssert.ThrowingCallable call, ErrorCode code) {
        assertThatThrownBy(call).isInstanceOf(DomainException.class)
                .extracting(e -> ((DomainException) e).code()).isEqualTo(code);
    }
}