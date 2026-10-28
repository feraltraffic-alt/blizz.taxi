package taxi.blizz.geo.internal;

import java.time.ZoneId;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.geo.City;
import taxi.blizz.geo.CityCatalog;

@Service
class JdbcCityCatalog implements CityCatalog {

    private final JdbcClient jdbc;

    JdbcCityCatalog(JdbcClient jdbc) {
        this.jdbc = jdbc;
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<ZoneId> timezone(UUID cityId) {
        return jdbc.sql("select timezone from city where id = :id").param("id", cityId)
                .query(String.class).optional().map(ZoneId::of);
    }

    @Override
    @Transactional(readOnly = true)
    public List<City> published() {
        return jdbc.sql("""
                        select id, code, name, currency, timezone, priority, version from city
                        where state = 'PUBLISHED' order by name, code""")
                .query((rs, i) -> new City(rs.getObject(1, UUID.class), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getInt(6), rs.getLong(7)))
                .list();
    }
}
