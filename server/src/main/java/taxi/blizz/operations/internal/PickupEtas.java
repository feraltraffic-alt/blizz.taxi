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

    PickupEtas(JdbcClient jdbc, RouteEstimator routes, PresenceProperties presence, Clock clock) {
        this.jdbc = jdbc;
        this.routes = routes;
        this.presence = presence;
        this.clock = clock;
    }

    private record Key(UUID assignmentId, OffsetDateTime locationAt) {
    }

    private record Position(GeoPoint point, OffsetDateTime at) {
    }

    /** The order with its pickup ETA when the driver is on the way to the pickup; unchanged otherwise. */
    OrderView with(OrderView order) {
        AssignmentView assignment = order.assignment();
        if (assignment == null || !"TO_PICKUP".equals(assignment.tripPhase())) {
            return order;
        }
        Optional<Position> position = position(assignment.driverId());
        if (position.isEmpty()) {
            return order; // no position, no ETA: never a made-up one
        }
        Position p = position.get();
        Key key = new Key(assignment.id(), p.at());
        RouteEstimator.Estimate estimate = remembered.get(key);
        if (estimate == null) {
            try {
                estimate = routes.estimate(p.point(), order.pickup());
            } catch (RuntimeException failed) {
                log.warn("No pickup ETA for assignment {}: {}", assignment.id(), failed.getClass().getSimpleName());
                return order;
            }
            if (remembered.size() >= MAX_REMEMBERED) {
                remembered.clear();
            }
            remembered.put(key, estimate);
        }
        boolean stale = p.at().isBefore(now().minus(presence.gpsMaxAge()));
        return order.withPickupEta(new OrderView.PickupEta(estimate.durationSeconds(), estimate.distanceMetres(),
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
