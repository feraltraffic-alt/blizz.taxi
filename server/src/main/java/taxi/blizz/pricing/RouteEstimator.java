package taxi.blizz.pricing;

import taxi.blizz.geo.GeoPoint;

/** Routing adapter boundary. No real provider is configured by this slice. */
public interface RouteEstimator {
    Estimate estimate(GeoPoint pickup, GeoPoint dropOff);

    record Estimate(long distanceMetres, long durationSeconds) {
        public Estimate {
            if (distanceMetres < 0 || durationSeconds < 0) {
                throw new IllegalArgumentException("Route measurements must not be negative");
            }
        }
    }
}
