package taxi.blizz.pricing.internal;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.pricing.RouteEstimator;

/**
 * Default estimate without a routing provider: great-circle distance times a detour factor, at an
 * average city speed. Good enough for a price the rider confirms before ordering; a provider bean
 * marked {@code @Primary} replaces it.
 */
@Component
@EnableConfigurationProperties(RouteProperties.class)
class StraightLineRouteEstimator implements RouteEstimator {

    private static final double EARTH_RADIUS_M = 6_371_008.8;

    private final RouteProperties properties;

    StraightLineRouteEstimator(RouteProperties properties) {
        this.properties = properties;
    }

    @Override
    public Estimate estimate(GeoPoint pickup, GeoPoint dropOff) {
        double metres = greatCircle(pickup, dropOff) * properties.detourFactor();
        double seconds = metres / (properties.averageSpeedKmh() / 3.6);
        return new Estimate(Math.round(metres), Math.round(seconds));
    }

    static double greatCircle(GeoPoint a, GeoPoint b) {
        double lat1 = Math.toRadians(a.lat());
        double lat2 = Math.toRadians(b.lat());
        double dLat = lat2 - lat1;
        double dLon = Math.toRadians(b.lon() - a.lon());
        double h = Math.sin(dLat / 2) * Math.sin(dLat / 2)
                + Math.cos(lat1) * Math.cos(lat2) * Math.sin(dLon / 2) * Math.sin(dLon / 2);
        return 2 * EARTH_RADIUS_M * Math.asin(Math.min(1, Math.sqrt(h)));
    }
}
