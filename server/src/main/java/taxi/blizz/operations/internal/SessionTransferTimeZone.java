package taxi.blizz.operations.internal;

import java.time.ZoneId;
import java.util.Optional;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.finance.DriverTransferTimeZone;
import taxi.blizz.geo.CityCatalog;

/** Supplies session context to finance without making finance depend on operations. */
@Service
class SessionTransferTimeZone implements DriverTransferTimeZone {

    private final JdbcClient jdbc;
    private final CityCatalog cities;

    SessionTransferTimeZone(JdbcClient jdbc, CityCatalog cities) {
        this.jdbc = jdbc;
        this.cities = cities;
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<ZoneId> zone(UUID driverId) {
        return jdbc.sql("""
                        select city_id from work_session where driver_id = :driver
                        order by case when state in ('OPEN', 'CLOSING') then 0 else 1 end,
                                 opened_at desc, id desc limit 1""")
                .param("driver", driverId).query(UUID.class).optional().flatMap(cities::timezone).map(ZoneId::of);
    }
}
