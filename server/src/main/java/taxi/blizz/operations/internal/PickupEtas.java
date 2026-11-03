package taxi.blizz.operations.internal;

import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.operations.AssignmentView;
import taxi.blizz.operations.OrderView;
import taxi.blizz.pricing.RouteEstimator;

/**
 * The pickup ETA a rider sees while the driver is on the way (REQ-RID-04): from the driver's last position on the
 * server to the pickup, by the route estimator. A position seen before is not routed again: riders poll, and the
 * router is a paid service. Nothing here writes; a failed estimate leaves the order without an ETA.
 */
@Component
class PickupEtas {

    private static final Logger log = LoggerFactory.getLogger(PickupEtas.class);
    /** Bounds the memory of positions already routed; cleared as a whole when full. */
    static final int MAX_REMEMBERED = 10_000;

    private final JdbcClient jdbc;
    private final RouteEstimator routes;
    private final PresenceProperties presence;
    private final Clock clock;
    private final Map<Key, RouteEstimator.Estimate> remembered = new ConcurrentHashMap<>();

    private final taxi.blizz.geo.CityCatalog cities;

    PickupEtas(JdbcClient jdbc, RouteEstimator routes, PresenceProperties presence, Clock clock,
               taxi.blizz.geo.CityCatalog cities) {
        this.cities = cities;
        this.jdbc = jdbc;
        this.routes = routes;
        this.presence = presence;
        this.clock = clock;
    }

    private record Key(UUID assignmentId, OffsetDateTime locationAt) {
    }

    private record Position(GeoPoint point, OffsetDateTime at) {
    }

    /** The trip's phases in which the rider sees where the driver is (ADR 0017, issue #479). */
    private static final java.util.Set<String> LOCATED = java.util.Set.of("TO_PICKUP", "WAITING", "IN_PROGRESS", "COMPLETED");

    /**
     * The order as the rider reads it: with the driver's location while the trip is on the way, waiting or under way,
     * and with the pickup ETA while on the way; unchanged otherwise, and both left out without a known position.
     */
    OrderView with(OrderView order) {
        AssignmentView assignment = order.assignment();
        if (assignment == null || !LOCATED.contains(assignment.tripPhase())) {
            return order;
        }
        Optional<Position> position = position(assignment.driverId());
        if (position.isEmpty()) {
            return order; // no position, no ETA and no location: never a made-up one
        }
        Position p = position.get();
        boolean stale = p.at().isBefore(now().minus(presence.gpsMaxAge()));
        OrderView located = order.withDriverLocation(new OrderView.DriverLocation(p.point().lat(), p.point().lon(),
                p.at(), stale && !stale));
        if (!"TO_PICKUP".equals(assignment.tripPhase())) {
            return located;
        }
        Key key = new Key(assignment.id(), p.at());
        RouteEstimator.Estimate estimate = remembered.get(key);
        if (estimate == null) {
            try {
                estimate = routes.estimate(cities.serviceOf(order.cityId()).orElse(null), p.point(),
                        order.pickup());
            } catch (RuntimeException failed) {
                log.warn("No pickup ETA for assignment {}: {}", assignment.id(), failed.getClass().getSimpleName());
                return located;
            }
            if (remembered.size() >= MAX_REMEMBERED) {
                remembered.clear();
            }
            remembered.put(key, estimate);
        }
        return located.withPickupEta(new OrderView.PickupEta(estimate.durationSeconds(), estimate.distanceMetres(),
                estimate.source().name(), p.at(), stale));
    }

    /** The driver's last position in the current work session. */
    private Optional<Position> position(UUID driverId) {
        return jdbc.sql("""
                        select ST_Y(last_location) as lat, ST_X(last_location) as lon, last_location_at
                        from work_session
                        where driver_id = :driver and state in ('OPEN', 'CLOSING') and last_location is not null
                          and last_location_at is not null
                        order by opened_at desc limit 1""")
                .param("driver", driverId)
                .query((rs, i) -> new Position(new GeoPoint(rs.getDouble("lat"), rs.getDouble("lon")),
                        rs.getObject("last_location_at", OffsetDateTime.class)))
                .optional();
    }

    private OffsetDateTime now() {
        return OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
    }
}
