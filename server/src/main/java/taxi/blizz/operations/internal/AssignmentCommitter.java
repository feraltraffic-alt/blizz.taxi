package taxi.blizz.operations.internal;

import java.time.OffsetDateTime;
import java.util.Map;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.operations.AssignmentView;
import taxi.blizz.platform.Actor;

/** Creates the assignment; the caller holds the order lock, then the driver's capacity lock (REQ-ASG-08). */
@Component
class AssignmentCommitter {

    private final JdbcClient jdbc;
    private final OrderCore core;
    private final DispatchEngine engine;

    AssignmentCommitter(JdbcClient jdbc, OrderCore core, DispatchEngine engine) {
        this.jdbc = jdbc;
        this.core = core;
        this.engine = engine;
    }

    /**
     * SEARCHING (or a confirmed pre-order, SCHEDULED) → ASSIGNED in one transaction: assignment COMMITTED, trip
     * TO_PICKUP, capacity TO_PICKUP, search stopped, other offers revoked (REQ-ASG-01, REQ-ASG-03).
     */
    AssignmentView commit(OrderCore.LockedOrder order, Actor driver, UUID vehicleId, String source, UUID offerId) {
        UUID assignmentId = UUID.randomUUID();
        UUID tripId = UUID.randomUUID();
        OffsetDateTime now = core.now();
        jdbc.sql("""
                        insert into assignment (id, order_id, driver_id, vehicle_id, source, state, created_at)
                        values (:id, :orderId, :driverId, :vehicleId, :source, 'COMMITTED', :now)""")
                .param("id", assignmentId)
                .param("orderId", order.id())
                .param("driverId", driver.id())
                .param("vehicleId", vehicleId)
                .param("source", source)
                .param("now", now)
                .update();
        jdbc.sql("""
                        insert into trip (id, assignment_id, order_id, phase, created_at)
                        values (:id, :assignmentId, :orderId, 'TO_PICKUP', :now)""")
                .param("id", tripId)
                .param("assignmentId", assignmentId)
                .param("orderId", order.id())
                .param("now", now)
                .update();
        core.setOccupancy(driver.id(), "TO_PICKUP", assignmentId);
        engine.stop(order.id(), "STOPPED");
        core.closeOpenOffers(order.id(), "REVOKED");
        core.changeStatus(order, "ASSIGNED", null, "AssignmentCommitted", driver, Map.of(
                "assignment_id", assignmentId.toString(), "driver_id", driver.id().toString(), "source", source,
                "offer_id", offerId == null ? "" : offerId.toString()));
        return new AssignmentView(assignmentId, order.id(), driver.id(), vehicleId, source, "COMMITTED", tripId,
                "TO_PICKUP");
    }
}
