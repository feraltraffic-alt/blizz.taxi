package taxi.blizz.pricing.internal;

import java.time.Clock;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.pricing.VehicleClasses;

@Service
class JdbcVehicleClasses implements VehicleClasses {

    private final JdbcClient jdbc;
    private final Clock clock;

    JdbcVehicleClasses(JdbcClient jdbc, Clock clock) {
        this.jdbc = jdbc;
        this.clock = clock;
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<VehicleClass> active(UUID cityId, String code) {
        if (cityId == null || code == null || code.isBlank()) {
            return Optional.empty();
        }
        return jdbc.sql("""
                        select id, city_id, code, name from vehicle_class
                        where city_id = :city and code = :code and active""")
                .param("city", cityId)
                .param("code", code.strip())
                .query((rs, i) -> new VehicleClass(rs.getObject(1, UUID.class), rs.getObject(2, UUID.class),
                        rs.getString(3), rs.getString(4)))
                .optional();
    }

    @Override
    @Transactional(readOnly = true)
    public List<VehicleClass> orderable(UUID cityId) {
        return jdbc.sql("""
                        select vc.id, vc.city_id, vc.code, vc.name from vehicle_class vc
                        join city on city.id = vc.city_id
                        where vc.city_id = :city and vc.active
                          and exists (select 1 from tariff_version t
                                      where t.city_id = vc.city_id and t.class_id = vc.id and t.state = 'PUBLISHED'
                                        and t.currency = city.currency and t.effective_from <= :now
                                        and (t.effective_to is null or t.effective_to > :now))
                        order by vc.code""")
                .param("city", cityId)
                .param("now", clock.instant().atOffset(ZoneOffset.UTC))
                .query((rs, i) -> new VehicleClass(rs.getObject(1, UUID.class), rs.getObject(2, UUID.class),
                        rs.getString(3), rs.getString(4)))
                .list();
    }
}
