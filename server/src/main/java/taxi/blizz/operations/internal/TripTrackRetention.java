package taxi.blizz.operations.internal;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.location.TrackRetention;

/**
 * For the GPS track clean-up (REQ-PRV-02, issue #81): a trip runs from the assignment to its end (completion, release
 * or revocation); a trip whose driver got a risk flag (open or confirmed) during it keeps its track as evidence.
 */
@Component
class TripTrackRetention implements TrackRetention {

    private final JdbcClient jdbc;

    TripTrackRetention(JdbcClient jdbc) {
        this.jdbc = jdbc;
    }

    @Override
    public List<TripWindow> trips(Set<UUID> driverIds, OffsetDateTime from, OffsetDateTime to) {
        if (driverIds.isEmpty()) {
            return List.of();
        }
        return jdbc.sql("""
                        select a.driver_id, a.order_id, a.created_at,
                               case when a.state in ('RESERVED', 'COMMITTED') then null
                                    else coalesce(a.closed_at, t.completed_at, a.created_at) end as ended_at
                        from assignment a left join trip t on t.assignment_id = a.id
                        where a.driver_id = any(cast(:drivers as uuid[]))
                          and a.created_at <= :to
                          and (a.state in ('RESERVED', 'COMMITTED') or coalesce(a.closed_at, t.completed_at) >= :from)""")
                .param("drivers", driverIds.toArray(UUID[]::new)).param("from", from).param("to", to)
                .query((rs, i) -> new TripWindow(rs.getObject(1, UUID.class), rs.getObject(2, UUID.class),
                        rs.getObject(3, OffsetDateTime.class), rs.getObject(4, OffsetDateTime.class)))
                .list();
    }

    @Override
    public Set<UUID> held(Set<UUID> orderIds) {
        if (orderIds.isEmpty()) {
            return Set.of();
        }
        return Set.copyOf(jdbc.sql("""
                        select distinct a.order_id
                        from assignment a left join trip t on t.assignment_id = a.id
                        join driver_risk_flag f on f.driver_id = a.driver_id
                        where a.order_id = any(cast(:orders as uuid[]))
                          and f.state in ('OPEN', 'CONFIRMED')
                          and f.raised_at >= a.created_at
                          and f.raised_at <= coalesce(a.closed_at, t.completed_at, now()) + interval '1 hour'""")
                .param("orders", orderIds.toArray(UUID[]::new)).query(UUID.class).list());
    }
}
