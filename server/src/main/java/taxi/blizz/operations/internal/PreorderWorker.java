package taxi.blizz.operations.internal;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.configuration.ServiceSettings;

/**
 * Releases pre-orders into the search when their time comes (ADR 0006): a SCHEDULED order whose
 * {@code release_at} has passed and that no driver holds starts the ordinary search; a reservation not confirmed in
 * the window expires and its order goes to the search. Safe on several replicas: due orders are picked with
 * {@code SKIP LOCKED} and each is re-checked under the order lock.
 */
@Component
public class PreorderWorker {

    private static final Logger log = LoggerFactory.getLogger(PreorderWorker.class);
    private static final int BATCH = 50;

    private final JdbcClient jdbc;
    private final TransactionTemplate tx;
    private final OrderCore core;
    private final DispatchEngine engine;
    private final ServiceSettings settings;

    PreorderWorker(JdbcClient jdbc, TransactionTemplate tx, OrderCore core, DispatchEngine engine,
                   ServiceSettings settings) {
        this.settings = settings;
        this.jdbc = jdbc;
        this.tx = tx;
        this.core = core;
        this.engine = engine;
    }

    /** Releases the pre-orders that are due; returns how many were released. */
    public int runOnce() {
        OffsetDateTime now = core.now();
        List<UUID> due = tx.execute(status -> jdbc.sql("""
                        select id from ride_order
                        where status = 'SCHEDULED' and release_at <= :now
                          -- A reserved one waits for its driver; it must not fill the batch and hold back the rest
                          -- (audit 29.10.2026).
                          and not exists (select 1 from preorder_reservation r
                                          where r.order_id = ride_order.id and r.state = 'RESERVED')
                        order by release_at limit :limit
                        for update skip locked""")
                .param("now", now).param("limit", BATCH).query(UUID.class).list());
        int released = 0;
        for (UUID orderId : due == null ? List.<UUID>of() : due) {
            try {
                Boolean done = tx.execute(status -> release(orderId));
                if (Boolean.TRUE.equals(done)) {
                    released++;
                }
            } catch (RuntimeException e) {
                log.error("Releasing pre-order {} failed; it will be retried", orderId, e);
            }
        }
        return released;
    }

    private boolean release(UUID orderId) {
        OrderCore.LockedOrder order = core.lockOrder(orderId);
        if (!"SCHEDULED".equals(order.status())) {
            return false;
        }
        OffsetDateTime releaseAt = jdbc.sql("select release_at from ride_order where id = :id").param("id", orderId)
                .query(OffsetDateTime.class).single();
        if (releaseAt.isAfter(core.now()) || reserved(orderId)) {
            return false;
        }
        engine.startSearch(order);
        return true;
    }

    private boolean reserved(UUID orderId) {
        return jdbc.sql("select count(*) from preorder_reservation where order_id = :id and state = 'RESERVED'")
                .param("id", orderId).query(Long.class).single() > 0;
    }

    /**
     * A reserved pre-order whose driver did not confirm "On my way" in the window goes to the search at once
     * (ADR 0006); returns how many reservations expired.
     */
    public int expireReservations() {
        ServiceSettings.Preorders rules = settings.current().settings().preorders();
        OffsetDateTime now = core.now();
        // confirm_until = pickup − confirm_minutes_before + confirm_window_minutes
        long untilMinutes = (long) rules.confirmMinutesBefore() - rules.confirmWindowMinutes();
        List<UUID> due = tx.execute(status -> jdbc.sql("""
                        select r.order_id from preorder_reservation r join ride_order o on o.id = r.order_id
                        where r.state = 'RESERVED' and o.pickup_at - make_interval(mins => :minutes) <= :now
                        order by o.pickup_at limit :limit
                        for update of r skip locked""")
                .param("minutes", (int) untilMinutes).param("now", now).param("limit", BATCH)
                .query(UUID.class).list());
        int expired = 0;
        for (UUID orderId : due == null ? List.<UUID>of() : due) {
            try {
                Boolean done = tx.execute(status -> expire(orderId, untilMinutes));
                if (Boolean.TRUE.equals(done)) {
                    expired++;
                }
            } catch (RuntimeException e) {
                log.error("Expiring the reservation of pre-order {} failed; it will be retried", orderId, e);
            }
        }
        return expired;
    }

    private boolean expire(UUID orderId, long untilMinutes) {
        OrderCore.LockedOrder order = core.lockOrder(orderId);
        record Open(UUID id, UUID driverId, OffsetDateTime pickupAt) {
        }
        Optional<Open> open = jdbc.sql("""
                        select r.id, r.driver_id, o.pickup_at from preorder_reservation r
                        join ride_order o on o.id = r.order_id
                        where r.order_id = :id and r.state = 'RESERVED' for update of r""")
                .param("id", orderId)
                .query((rs, i) -> new Open(rs.getObject(1, UUID.class), rs.getObject(2, UUID.class),
                        rs.getObject(3, OffsetDateTime.class)))
                .optional();
        if (open.isEmpty() || open.get().pickupAt().minusMinutes(untilMinutes).isAfter(core.now())) {
            return false;
        }
        jdbc.sql("""
                        update preorder_reservation set state = 'EXPIRED', closed_at = :now,
                               close_reason = 'NOT_CONFIRMED', version = version + 1
                        where id = :id""")
                .param("now", core.now()).param("id", open.get().id()).update();
        core.recordEvent(orderId, core.touch(orderId), "PreorderReservationExpired", OrderCore.system(),
                "NOT_CONFIRMED", Map.of("reservation_id", open.get().id().toString(),
                        "driver_id", open.get().driverId().toString()));
        if ("SCHEDULED".equals(order.status())) {
            engine.startSearch(order);
        }
        return true;
    }
}
