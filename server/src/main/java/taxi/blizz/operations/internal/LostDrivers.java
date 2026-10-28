package taxi.blizz.operations.internal;

import java.time.OffsetDateTime;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * A driver on an order — on the way, waiting or driving — who stopped sending positions (REQ-OPS-06): the order
 * records {@code DriverLostDuringOrder} once per assignment, and the problem queue gets a task. Nothing else
 * changes: the trip goes on when the driver is back; taking the order off the driver is a staff decision.
 */
@Component
class LostDrivers {

    private final JdbcClient jdbc;
    private final OrderCore core;
    private final DispatchProperties properties;

    LostDrivers(JdbcClient jdbc, OrderCore core, DispatchProperties properties) {
        this.jdbc = jdbc;
        this.core = core;
        this.properties = properties;
    }

    private record Lost(UUID assignmentId, UUID orderId, UUID driverId, String phase, OffsetDateTime lastSeenAt) {
    }

    /** Reports what is new; safe on several instances (a marked assignment is not reported twice). */
    @Transactional
    public int report() {
        OffsetDateTime now = core.now();
        List<Lost> lost = jdbc.sql("""
                        select a.id, a.order_id, a.driver_id, t.phase, ws.last_location_at
                        from assignment a
                        join trip t on t.assignment_id = a.id
                        left join work_session ws on ws.driver_id = a.driver_id and ws.state in ('OPEN', 'CLOSING')
                        where a.state = 'COMMITTED' and a.lost_reported_at is null
                          and t.phase in ('TO_PICKUP', 'WAITING', 'IN_PROGRESS')
                          and (ws.last_location_at is null or ws.last_location_at < :since)
                        order by a.id limit 100""")
                .param("since", now.minus(properties.lostDriverAfter()))
                .query((rs, i) -> new Lost(rs.getObject(1, UUID.class), rs.getObject(2, UUID.class),
                        rs.getObject(3, UUID.class), rs.getString(4), rs.getObject(5, OffsetDateTime.class)))
                .list();
        int reported = 0;
        for (Lost l : lost) {
            // The order first, then its assignment: the order every command locks in (AGENTS.md).
            OrderCore.LockedOrder order = core.lockOrder(l.orderId());
            int marked = jdbc.sql("""
                            update assignment set lost_reported_at = :now
                            where id = :id and state = 'COMMITTED' and lost_reported_at is null""")
                    .param("now", now).param("id", l.assignmentId()).update();
            if (marked == 0) {
                continue; // another instance reported it, or the assignment ended meanwhile
            }
            reported++;
            Map<String, Object> payload = new LinkedHashMap<>();
            payload.put("assignment_id", l.assignmentId().toString());
            payload.put("driver_id", l.driverId().toString());
            payload.put("phase", l.phase());
            payload.put("last_seen_at", l.lastSeenAt() == null ? null : l.lastSeenAt().toString());
            core.recordEvent(order.id(), core.touch(order.id()), "DriverLostDuringOrder", OrderCore.system(), null,
                    payload);
        }
        return reported;
    }
}
