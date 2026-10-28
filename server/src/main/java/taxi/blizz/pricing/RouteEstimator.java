package taxi.blizz.pricing;

import taxi.blizz.geo.GeoPoint;

/** Routing adapter boundary. No real provider is configured by this slice. */
public interface RouteEstimator {
    Estimate estimate(GeoPoint pickup, GeoPoint dropOff);

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
