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
 * Processes due search deadlines (offer expiry, end of the personal phase, total deadline).
 *
 * <p>Several replicas may run it: due attempts are claimed with {@code FOR UPDATE SKIP LOCKED} and a
 * lease; a crashed worker's lease expires and another picks the attempt up (REQ-DSP-09). Each task
 * remembers the attempt generation; a task for a stopped or replaced attempt does nothing, so a late
 * worker never cancels an order that was already accepted (AC-10).
 */
@Component
public class DispatchWorker {

    private static final Logger log = LoggerFactory.getLogger(DispatchWorker.class);

    private final JdbcClient jdbc;
    private final TransactionTemplate tx;
    private final OrderCore core;
    private final DispatchEngine engine;
    private final DispatchProperties properties;
    private final String owner = "dispatch-" + UUID.randomUUID();

    DispatchWorker(JdbcClient jdbc, TransactionTemplate tx, OrderCore core, DispatchEngine engine,
                   DispatchProperties properties) {
        this.jdbc = jdbc;
        this.tx = tx;
        this.core = core;
        this.engine = engine;
        this.properties = properties;
    }

    /** {@code priority} and {@code dueAt} order the claimed batch: UPDATE … RETURNING keeps no order of its own. */
    private record Due(UUID attemptId, UUID orderId, int generation, boolean priority, OffsetDateTime dueAt) {
    }

    /** Claims and processes one batch of due attempts; returns how many were claimed. */
    public int runOnce() {
        OffsetDateTime now = core.now();
        List<Due> due = tx.execute(status -> jdbc.sql("""
                        update dispatch_attempt a set lease_owner = :owner, lease_until = :leaseUntil
                        where a.id in (
                            select id from dispatch_attempt
                            where phase in ('PERSONAL', 'BROADCAST') and next_action_at <= :now
                              and (lease_until is null or lease_until < :now)
                            order by priority desc, next_action_at
                            limit :limit
                            for update skip locked)
                        returning a.id, a.order_id, a.generation, a.priority, a.next_action_at""")
                .param("owner", owner)
                .param("leaseUntil", now.plus(properties.lease()))
                .param("now", now)
                .param("limit", properties.batchSize())
                .query((rs, i) -> new Due(rs.getObject(1, UUID.class), rs.getObject(2, UUID.class), rs.getInt(3),
                        rs.getBoolean(4), rs.getObject(5, OffsetDateTime.class)))
                .list());
        if (due == null) {
            return 0;
        }
        // An order a driver gave back first (ADR 0018 P1), then the longest due.
        List<Due> ordered = due.stream().sorted(java.util.Comparator.comparing(Due::priority).reversed()
                .thenComparing(Due::dueAt)).toList();
        for (Due task : ordered) {
            try {
                tx.executeWithoutResult(status -> process(task));
            } catch (RuntimeException e) {
                log.error("Dispatch deadline for order {} failed; it will be retried after the lease", task.orderId(), e);
            }
        }
        return due.size();
    }

    private void process(Due task) {
        core.lockOrder(task.orderId());
        engine.liveAttempt(task.orderId())
                .filter(attempt -> attempt.id().equals(task.attemptId()) && attempt.generation() == task.generation())
                .ifPresent(engine::advance);
        jdbc.sql("update dispatch_attempt set lease_owner = null, lease_until = null where id = :id and lease_owner = :owner")
                .param("id", task.attemptId())
                .param("owner", owner)
                .update();
    }
}
