package taxi.blizz.pricing;

import taxi.blizz.geo.GeoPoint;

/** Routing adapter boundary. No real provider is configured by this slice. */
public interface RouteEstimator {

    /** The route by the router of no particular service: the panel's estimator gives the straight line here. */
    Estimate estimate(GeoPoint pickup, GeoPoint dropOff);

    /**
     * The route by the router the taxi service set (ADR 0016, issue #215): its own GraphHopper settings and key. A
     * router of no service (the straight line, a test's fake) gives the same answer for every service.
     */
    default Estimate estimate(java.util.UUID serviceId, GeoPoint pickup, GeoPoint dropOff) {
        return estimate(pickup, dropOff);
    }

    /**
     * The road route by the router the taxi service set, and only that: empty when the service has no router switched
     * on, the router failed, its circuit breaker is open or it found no route. Never the straight line, so a caller
     * that asks for many routes at once can tell them apart and compute the straight line itself
     * ({@link #straightLine}) without a query each (ADR 0020).
     */
    default java.util.Optional<Estimate> road(java.util.UUID serviceId, GeoPoint from, GeoPoint to) {
        return java.util.Optional.empty();
    }

    /**
     * The straight-line estimate for a straight distance of {@code straightMetres} (REQ-GEO-08): the detour factor and
     * the average city speed, without asking anyone. This default uses the starting values (1.3 and 25 km/h); the
     * configured estimator uses the deployment's.
     */
    default Estimate straightLine(long straightMetres) {
        long metres = Math.round(Math.max(0, straightMetres) * 1.3);
        return new Estimate(metres, Math.round(metres * 3.6 / 25), Source.STRAIGHT_LINE);
    }

    /**
     * {@code source}: ROUTER — a route on the roads; STRAIGHT_LINE — an estimate from the straight line, when no router
     * is configured or it failed. A quote shows which, so a straight-line price is never passed off as an exact one
     * (REQ-GEO-08).
     */
    record Estimate(long distanceMetres, long durationSeconds, Source source) {
        public Estimate {
            if (distanceMetres < 0 || durationSeconds < 0) {
                throw new IllegalArgumentException("Route measurements must not be negative");
            }
            source = source == null ? Source.ROUTER : source;
        }

        public Estimate(long distanceMetres, long durationSeconds) {
            this(distanceMetres, durationSeconds, Source.ROUTER);
        }
    }

    enum Source { ROUTER, STRAIGHT_LINE }
}
