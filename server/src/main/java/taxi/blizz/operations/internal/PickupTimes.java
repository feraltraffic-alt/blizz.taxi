package taxi.blizz.operations.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.geo.CityCatalog;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.pricing.RouteEstimator;

/**
 * The pickup time of each candidate (owner decision 05.11.2026, ADR 0020): from the driver's last position to the
 * pickup by the router of the order's taxi service, the calls in parallel; a candidate the router gave no time for
 * (no router switched on, a failure, an open breaker, no route) gets the straight-line estimate, so the threshold still
 * applies. Nothing here writes or locks.
 */
@Component
class PickupTimes {

    private static final Logger log = LoggerFactory.getLogger(PickupTimes.class);
    /** A bound above the router's own timeout: a call still running then counts as a failure. */
    static final long WAIT_SECONDS = 10;

    private final JdbcClient jdbc;
    private final RouteEstimator routes;
    private final CityCatalog cities;
    private final ExecutorService calls = Executors.newVirtualThreadPerTaskExecutor();

    PickupTimes(JdbcClient jdbc, RouteEstimator routes, CityCatalog cities) {
        this.jdbc = jdbc;
        this.routes = routes;
        this.cities = cities;
    }

    /** {@code source}: ROUTER or STRAIGHT_LINE. */
    record Timed(OrderCore.Candidate candidate, int seconds, String source) {
    }

    /** The candidates with their pickup times, in the order given. */
    List<Timed> of(UUID orderId, List<OrderCore.Candidate> candidates) {
        if (candidates.isEmpty()) {
            return List.of();
        }
        record Order(UUID cityId, GeoPoint pickup) {
        }
        Order order = jdbc.sql("select city_id, ST_Y(pickup), ST_X(pickup) from ride_order where id = :id")
                .param("id", orderId)
                .query((rs, i) -> new Order(rs.getObject(1, UUID.class), new GeoPoint(rs.getDouble(2),
                        rs.getDouble(3))))
                .single();
        UUID service = cities.serviceOf(order.cityId()).orElse(null);
        List<Timed> timed = new ArrayList<>(candidates.size());
        // The first on this thread: the router's settings are read (and cached) in this transaction, so the parallel
        // calls after it do not each take a connection to read them.
        timed.add(timed(candidates.getFirst(), road(service, candidates.getFirst(), order.pickup())));
        List<Future<Optional<RouteEstimator.Estimate>>> rest = new ArrayList<>();
        for (OrderCore.Candidate c : candidates.subList(1, candidates.size())) {
            rest.add(calls.submit(() -> road(service, c, order.pickup())));
        }
        for (int i = 0; i < rest.size(); i++) {
            timed.add(timed(candidates.get(i + 1), await(rest.get(i))));
        }
        return timed;
    }

    private Optional<RouteEstimator.Estimate> road(UUID service, OrderCore.Candidate c, GeoPoint pickup) {
        try {
            return routes.road(service, c.location(), pickup);
        } catch (RuntimeException e) {
            log.warn("No road pickup time for driver {}: {}", c.driverId(), e.getClass().getSimpleName());
            return Optional.empty();
        }
    }

    private static Optional<RouteEstimator.Estimate> await(Future<Optional<RouteEstimator.Estimate>> call) {
        try {
            return call.get(WAIT_SECONDS, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            call.cancel(true);
            return Optional.empty();
        } catch (ExecutionException | TimeoutException e) {
            call.cancel(true);
            return Optional.empty();
        }
    }

    private Timed timed(OrderCore.Candidate c, Optional<RouteEstimator.Estimate> road) {
        RouteEstimator.Estimate estimate = road.orElseGet(() -> routes.straightLine(c.distanceM()));
        return new Timed(c, (int) Math.min(Integer.MAX_VALUE, estimate.durationSeconds()),
                road.isPresent() ? "ROUTER" : "STRAIGHT_LINE");
    }
}
