package taxi.blizz.backoffice.internal;

import java.util.Set;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.location.TrackRetention;

/**
 * For the GPS track clean-up (REQ-PRV-02, issue #81): an order with a support case that is not resolved or closed
 * keeps its trip's track — it may be what the case is about.
 */
@Component
class SupportTrackHolds implements TrackRetention {

    private final JdbcClient jdbc;

    SupportTrackHolds(JdbcClient jdbc) {
        this.jdbc = jdbc;
    }

    @Override
    public Set<UUID> held(Set<UUID> orderIds) {
        if (orderIds.isEmpty()) {
            return Set.of();
        }
        return Set.copyOf(jdbc.sql("""
                        select distinct order_id from support_case
                        where order_id = any(cast(:orders as uuid[])) and state not in ('RESOLVED', 'CLOSED')""")
                .param("orders", orderIds.toArray(UUID[]::new)).query(UUID.class).list());
    }
}
