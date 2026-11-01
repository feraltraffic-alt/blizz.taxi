package taxi.blizz.geo.internal;

import java.util.List;
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
    public List<City> published(UUID serviceId) {
        return jdbc.sql("""
                        select id, code, name, currency, timezone, priority, version from city
                        where state = 'PUBLISHED' and service_id = :service order by name, code""")
                .param("service", serviceId)
                .query((rs, i) -> new City(rs.getObject(1, UUID.class), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getInt(6), rs.getLong(7)))
                .list();
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

    @Override
    @Transactional(readOnly = true)
    public java.util.Optional<String> timezone(java.util.UUID cityId) {
        return jdbc.sql("select timezone from city where id = :id")
                .param("id", cityId).query(String.class).optional();
    }
}
