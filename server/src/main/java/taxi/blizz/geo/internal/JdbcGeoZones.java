package taxi.blizz.geo.internal;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.geo.GeoZones;

@Service
class JdbcGeoZones implements GeoZones {

    private static final String LIMITS = """
            select ST_Union(polygon) from zone
            where city_id = :city and type = 'CITY_LIMITS' and state = 'PUBLISHED'
            """;

    private final JdbcClient jdbc;

    JdbcGeoZones(JdbcClient jdbc) {
        this.jdbc = jdbc;
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<ZoneRef> zone(UUID zoneId) {
        return jdbc.sql("select id, city_id, type, state from zone where id = :id").param("id", zoneId)
                .query((rs, i) -> new ZoneRef(rs.getObject(1, UUID.class), rs.getObject(2, UUID.class),
                        rs.getString(3), rs.getString(4)))
                .optional();
    }

    @Override
    @Transactional(readOnly = true)
    public List<UUID> zonesAt(UUID cityId, GeoPoint point) {
        return jdbc.sql("""
                        select id from zone
                        where city_id = :city and state = 'PUBLISHED' and type <> 'CITY_LIMITS'
                          and ST_Covers(polygon, ST_SetSRID(ST_MakePoint(:lon, :lat), 4326))
                        order by priority desc, id""")
                .param("city", cityId).param("lon", point.lon()).param("lat", point.lat())
                .query(UUID.class).list();
    }

    @Override
    @Transactional(readOnly = true)
    public boolean insideCityLimits(UUID cityId, GeoPoint point) {
        return jdbc.sql("with limits as (" + LIMITS + ") select g is null or "
                        + "ST_Covers(g, ST_SetSRID(ST_MakePoint(:lon, :lat), 4326)) from limits l(g)")
                .param("city", cityId).param("lon", point.lon()).param("lat", point.lat())
                .query(Boolean.class).single();
    }

    @Override
    @Transactional(readOnly = true)
    public Split splitByCityLimits(UUID cityId, GeoPoint a, GeoPoint b) {
        return jdbc.sql("""
                        with limits as (%s),
                             line as (select ST_MakeLine(ST_SetSRID(ST_MakePoint(:aLon, :aLat), 4326),
                                                         ST_SetSRID(ST_MakePoint(:bLon, :bLat), 4326)) l)
                        select round(ST_Length(l::geography))::bigint,
                               case when g is null then round(ST_Length(l::geography))::bigint
                                    else round(ST_Length(ST_Intersection(l, g)::geography))::bigint end
                        from line, limits lim(g)""".formatted(LIMITS))
                .param("city", cityId).param("aLon", a.lon()).param("aLat", a.lat())
                .param("bLon", b.lon()).param("bLat", b.lat())
                .query((rs, i) -> {
                    long total = rs.getLong(1);
                    long inside = Math.min(total, rs.getLong(2));
                    return new Split(inside, total - inside);
                })
                .single();
    }
}
