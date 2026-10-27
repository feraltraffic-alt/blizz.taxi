package taxi.blizz.operations.internal;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * Releases pre-orders into the search when their time comes (ADR 0006): a SCHEDULED order whose
 * {@code release_at} has passed starts the ordinary search. Safe on several replicas: due orders are picked with
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

    PreorderWorker(JdbcClient jdbc, TransactionTemplate tx, OrderCore core, DispatchEngine engine) {
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
        if (releaseAt.isAfter(core.now())) {
            return false;
        }
        engine.startSearch(order);
        return true;
    }
}
