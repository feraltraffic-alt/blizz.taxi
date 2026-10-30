package taxi.blizz;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.jdbc.core.simple.JdbcClient;
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
import taxi.blizz.platform.SubjectType;
import taxi.blizz.pricing.QuoteService;

/**
 * Test fixture: synthetic city, riders, online drivers and rides driven through the real services up
 * to a started trip. Each test class passes its own city so classes never meet each other's drivers.
 */
public final class TestRides {

    public record Driver(Actor actor, UUID device, UUID vehicle) {
    }

    public record Ride(Actor payer, Driver driver, OrderView order, TripView trip) {
    }

    private static final AtomicLong SEQUENCE = new AtomicLong(10);

    private final JdbcClient jdbc;
    private final Orders orders;
    private final Dispatch dispatch;
    private final Trips trips;
    private final WorkSessions sessions;
    private final SessionService auth;
    private final QuoteService quotes;

    public TestRides(JdbcClient jdbc, Orders orders, Dispatch dispatch, Trips trips, WorkSessions sessions,
                     SessionService auth, QuoteService quotes) {
        this.jdbc = jdbc;
        this.orders = orders;
        this.dispatch = dispatch;
        this.trips = trips;
        this.sessions = sessions;
        this.auth = auth;
        this.quotes = quotes;
    }

    /** The city id, created on first use; open sessions in it are closed so no stale driver is offered. */
    public UUID city(String code, String currency, double lon) {
        UUID id = jdbc.sql("select id from city where code = :code").param("code", code).query(UUID.class)
                .optional().orElseGet(() -> {
                    // Another test class's city under the same pickups makes orders resolve to the wrong city
                    // depending on the test order; fail at once instead (AGENTS.md, test cities).
                    List<String> overlapping = jdbc.sql("""
                                    select code from city where state = 'PUBLISHED' and ST_Intersects(polygon,
                                        ST_GeomFromEWKT(:area))""")
                            .param("area", "SRID=4326;MULTIPOLYGON(((%1$s -40,%2$s -40,%2$s -39,%1$s -39,%1$s -40)))"
                                    .formatted(lon + 0.000001, lon + 0.999999))
                            .query(String.class).list();
                    if (!overlapping.isEmpty()) {
                        throw new IllegalStateException("Test city " + code + " at longitude " + lon
                                + " overlaps " + overlapping + "; pick a free longitude");
                    }
                    UUID created = UUID.randomUUID();
                    jdbc.sql("""
                                    insert into city (id, code, name, currency, timezone, polygon, priority, state,
                                                      created_at, updated_at)
                                    values (:id, :code, :code, :currency, 'UTC', ST_GeomFromEWKT(:area),
                                            7700 + (abs(hashtext(:code)) % 200), 'PUBLISHED', now(), now())""")
                            .param("id", created).param("code", code).param("currency", currency)
                            .param("area", "SRID=4326;MULTIPOLYGON(((%1$s -40,%2$s -40,%2$s -39,%1$s -39,%1$s -40)))"
                                    .formatted(lon, lon + 1))
                            .update();
                    return created;
                });
        jdbc.sql("update work_session set state = 'CLOSED', closed_at = now() where city_id = :c and state <> 'CLOSED'")
                .param("c", id).update();
        return id;
    }

    public Actor client() {
        UUID id = UUID.randomUUID();
        jdbc.sql("""
                        insert into client (id, phone_normalized, account_state, has_app, created_at, updated_at)
                        values (:id, :phone, 'ACTIVE', true, now(), now())""")
                .param("id", id)
                .param("phone", "+48" + String.format("%09d", Math.floorMod(id.hashCode(), 1_000_000_000)))
                .update();
        return new Actor(SubjectType.CLIENT, id);
    }

    /** An approved driver online about 1 km north of {@code pickup}. */
    public Driver driverNear(GeoPoint pickup) {
        UUID driverId = UUID.randomUUID();
        jdbc.sql("""
                        insert into driver (id, phone_normalized, account_state, review_status, created_at, updated_at)
                        values (:id, :phone, 'ACTIVE', 'APPROVED', now(), now())""")
                .param("id", driverId)
                .param("phone", "+38099" + String.format("%07d", Math.floorMod(driverId.hashCode(), 10_000_000)))
                .update();
        taxi.blizz.TestAdmission.inEveryCity(jdbc, driverId);
        UUID vehicle = UUID.randomUUID();
        jdbc.sql("""
                        insert into vehicle (id, driver_id, registration_number, make, model, color, production_year,
                                             state, class_approvals, created_at, updated_at)
                        values (:id, :driver, 'AA4000AA', 'Skoda', 'Octavia', 'blue', 2021, 'APPROVED', '{STANDARD}',
                                now(), now())""")
                .param("id", vehicle).param("driver", driverId).update();
        Actor actor = new Actor(SubjectType.DRIVER, driverId);
        IssuedSession device = auth.open(new VerifiedSubject(actor, "ACTIVE", false), "phone");
        sessions.open(actor, UUID.randomUUID(), device.sessionId(), vehicle,
                new LocationFix(north(pickup, 1000), 5.0, OffsetDateTime.now(), 1));
        return new Driver(actor, device.sessionId(), vehicle);
    }

    /** Another signed-in phone of the driver, which does not control the shift. */
    public UUID newDevice(Driver driver) {
        return auth.open(new VerifiedSubject(driver.actor(), "ACTIVE", false), "phone").sessionId();
    }

    /** A heartbeat at {@code point}, as if the time to drive there had passed ({@link #timePassed}). */
    public void moveTo(Driver driver, GeoPoint point) {
        timePassed(jdbc, driver.actor().id());
        sessions.heartbeat(driver.actor(), driver.device(),
                new LocationFix(point, 5.0, OffsetDateTime.now(), SEQUENCE.incrementAndGet()));
    }

    public OrderView order(Actor payer, UUID cityId, GeoPoint pickup, GeoPoint dropoff) {
        UUID quote = new TestQuotes(jdbc, quotes).quote(payer, cityId, "STANDARD", pickup, dropoff).id();
        return orders.create(payer, UUID.randomUUID(), new CreateOrder(payer.id(), "STANDARD", pickup, "Home",
                dropoff, "Work", PaymentMethod.CASH, quote));
    }

    /** A cash order accepted by {@code driver} (trip TO_PICKUP); the driver must be the only free one near. */
    public Ride assigned(UUID cityId, Driver driver, GeoPoint pickup, GeoPoint dropoff) {
        Actor payer = client();
        moveTo(driver, north(pickup, 1000));
        OrderView order = order(payer, cityId, pickup, dropoff);
        dispatch.accept(driver.actor(), driver.device(), UUID.randomUUID(), dispatch.offers(driver.actor()).getFirst().id());
        return new Ride(payer, driver, order, trips.current(driver.actor()).orElseThrow());
    }

    /** A cash ride of {@code driver} up to IN_PROGRESS; the driver must be the only free one near the pickup. */
    public Ride started(UUID cityId, Driver driver, GeoPoint pickup, GeoPoint dropoff) {
        Ride ride = assigned(cityId, driver, pickup, dropoff);
        moveTo(driver, north(pickup, 30));
        TripView trip = ride.trip();
        TripView waiting = trips.arrive(driver.actor(), UUID.randomUUID(), trip.id(), trip.version(), null);
        TripView inProgress = trips.start(driver.actor(), UUID.randomUUID(), waiting.id(), waiting.version(), null);
        return new Ride(ride.payer(), driver, ride.order(), inProgress);
    }

    public TripView complete(Ride ride, Boolean cashReceived) {
        return trips.complete(ride.driver().actor(), UUID.randomUUID(), ride.trip().id(), ride.trip().version(),
                OffsetDateTime.now(), cashReceived);
    }

    /**
     * Ages the driver's last accepted position out of the 30-minute baseline, as if an hour had passed since it: the
     * next heartbeat may be anywhere without being refused as an impossible movement (issue #102). For tests that move
     * a driver further than 250 km/h allows within the test's milliseconds.
     */
    public static void timePassed(JdbcClient jdbc, UUID driverId) {
        jdbc.sql("update driver_last_position set accepted_at = accepted_at - interval '1 hour' where driver_id = :d")
                .param("d", driverId).update();
    }

    public static GeoPoint north(GeoPoint point, int metres) {
        return new GeoPoint(point.lat() + metres / 111_000.0, point.lon());
    }
}
