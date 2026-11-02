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
