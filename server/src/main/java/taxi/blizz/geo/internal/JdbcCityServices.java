package taxi.blizz.geo.internal;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.identity.CityServices;

/** See {@link CityServices}: {@code city.service_id}. */
@Component
class JdbcCityServices implements CityServices {

    private final JdbcClient jdbc;

    JdbcCityServices(JdbcClient jdbc) {
        this.jdbc = jdbc;
    }

    @Override
    public Map<UUID, UUID> servicesOf(Collection<UUID> cityIds) {
        Map<UUID, UUID> result = new HashMap<>();
        if (cityIds == null || cityIds.isEmpty()) {
            return result;
        }
        jdbc.sql("select id, service_id from city where id = any(cast(:ids as uuid[]))")
                .param("ids", cityIds.toArray(UUID[]::new))
                .query((rs, i) -> result.put(rs.getObject(1, UUID.class), rs.getObject(2, UUID.class))).list();
        return result;
    }

    @Override
    public Set<UUID> citiesOf(UUID serviceId) {
        return Set.copyOf(jdbc.sql("select id from city where service_id = :service").param("service", serviceId)
                .query(UUID.class).list());
    }
}
