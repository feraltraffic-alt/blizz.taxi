package taxi.blizz.geo.internal;

import java.util.Optional;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import taxi.blizz.geo.City;
import taxi.blizz.geo.CityResolver;
import taxi.blizz.geo.GeoPoint;

@Service
class JdbcCityResolver implements CityResolver {
    private final JdbcClient jdbc;

    JdbcCityResolver(JdbcClient jdbc) {
        this.jdbc = jdbc;
    }

    @Override
    public Optional<City> resolve(GeoPoint point) {
        return jdbc.sql("""
                select id, code, name, currency, timezone, priority, version
                from city where state = 'PUBLISHED'
                and ST_Covers(polygon, ST_SetSRID(ST_MakePoint(:lon, :lat), 4326))
                order by priority desc, code asc limit 1
                """).param("lat", point.lat()).param("lon", point.lon())
                .query((rs, n) -> new City(rs.getObject("id", java.util.UUID.class), rs.getString("code"),
                        rs.getString("name"), rs.getString("currency"), rs.getString("timezone"),
                        rs.getInt("priority"), rs.getLong("version"))).optional();
    }
}
