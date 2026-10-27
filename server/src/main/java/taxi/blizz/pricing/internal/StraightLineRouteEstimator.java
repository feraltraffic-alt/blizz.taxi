package taxi.blizz.pricing.internal;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.pricing.RouteEstimator;

/**
 * Default estimate without a routing provider: the geodesic distance (PostGIS) times a detour
 * factor, at an average city speed. Good enough for a price the rider confirms before ordering. Used through
 * {@link ConfiguredRouteEstimator}, which switches to GraphHopper when it is on.
 */
@Component
@org.springframework.context.annotation.Fallback
@EnableConfigurationProperties(RouteProperties.class)
class StraightLineRouteEstimator implements RouteEstimator {

    private final JdbcClient jdbc;
    private final RouteProperties properties;

    StraightLineRouteEstimator(JdbcClient jdbc, RouteProperties properties) {
        this.jdbc = jdbc;
        this.properties = properties;
    }

    @Override
    public Estimate estimate(GeoPoint pickup, GeoPoint dropOff) {
        return jdbc.sql("""
                        with route as (
                            select ST_Distance(ST_SetSRID(ST_MakePoint(:aLon, :aLat), 4326)::geography,
                                               ST_SetSRID(ST_MakePoint(:bLon, :bLat), 4326)::geography)::numeric
                                   * :detour as metres)
                        select round(metres)::bigint, round(metres * 3.6 / :speed)::bigint from route""")
                .param("aLon", pickup.lon())
                .param("aLat", pickup.lat())
                .param("bLon", dropOff.lon())
                .param("bLat", dropOff.lat())
                .param("detour", properties.detourFactor())
                .param("speed", properties.averageSpeedKmh())
                .query((rs, i) -> new Estimate(rs.getLong(1), rs.getLong(2)))
                .single();
    }
}
