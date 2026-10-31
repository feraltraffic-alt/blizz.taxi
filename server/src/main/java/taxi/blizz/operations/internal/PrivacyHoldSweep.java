package taxi.blizz.operations.internal;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.payments.Chargebacks;

/**
 * Releases the privacy holds whose basis has ended (issue #144): once an order's chargeback is decided, the deleted
 * rider's data the hold kept on it is anonymized like the rest. Each hold is released in its own short transaction,
 * claimed with {@code skip locked}, so several instances share the work.
 */
@Component
class PrivacyHoldSweep {

    private final JdbcClient jdbc;
    private final OrderErasure erasure;
    private final Chargebacks chargebacks;
    private final TransactionTemplate tx;

    PrivacyHoldSweep(JdbcClient jdbc, OrderErasure erasure, Chargebacks chargebacks, TransactionTemplate tx) {
        this.jdbc = jdbc;
        this.erasure = erasure;
        this.chargebacks = chargebacks;
        this.tx = tx;
    }

    private static final int PAGE = 100;

    record Hold(UUID id, UUID subjectId, String objectType, UUID orderId, OffsetDateTime createdAt) {
    }

    /** Every open hold, a page at a time; returns how many were released. */
    int runOnce() {
        int released = 0;
        Hold last = null;
        while (true) {
            var query = jdbc.sql("""
                            select h.id, h.subject_id, h.object_type, h.object_id, h.created_at from privacy_hold h
                            where h.released_at is null"""
                            + (last == null ? "" : " and (h.created_at, h.id) > (:at, :id)")
                            + " order by h.created_at, h.id limit " + PAGE);
            if (last != null) {
                query = query.param("at", last.createdAt()).param("id", last.id());
            }
            List<Hold> page = query.query((rs, i) -> new Hold(rs.getObject(1, UUID.class), rs.getObject(2, UUID.class),
                            rs.getString(3), rs.getObject(4, UUID.class), rs.getObject(5, OffsetDateTime.class)))
                    .list();
            Set<UUID> disputed = chargebacks.disputed(page.stream().map(Hold::orderId).toList());
            for (Hold hold : page) {
                if (!disputed.contains(hold.orderId()) && Boolean.TRUE.equals(tx.execute(s -> release(hold)))) {
                    released++;
                }
            }
            if (page.size() < PAGE) {
                return released;
            }
            last = page.getLast();
        }
    }

    private boolean release(Hold hold) {
        boolean claimed = jdbc.sql("""
                        select id from privacy_hold where id = :id and released_at is null for update skip locked""")
                .param("id", hold.id()).query(UUID.class).optional().isPresent();
        // Checked again under the lock: a chargeback recorded since the batch was read keeps the hold.
        if (!claimed || !chargebacks.disputed(List.of(hold.orderId())).isEmpty()) {
            return false;
        }
        if ("ORDER".equals(hold.objectType())) {
            erasure.anonymize(List.of(hold.orderId()), hold.subjectId());
        } else {
            erasure.removeContacts(List.of(hold.orderId()));
        }
        jdbc.sql("update privacy_hold set released_at = :now where id = :id").param("now", erasure.now())
                .param("id", hold.id()).update();
        return true;
    }

    @Component
    @ConditionalOnProperty(name = "blizz.retention.enabled", havingValue = "true", matchIfMissing = true)
    static class Schedule {

        private final PrivacyHoldSweep sweep;

        Schedule(PrivacyHoldSweep sweep) {
            this.sweep = sweep;
        }

        @Scheduled(fixedDelayString = "${blizz.privacy.hold-sweep-interval:PT10M}",
                initialDelayString = "${blizz.privacy.hold-sweep-interval:PT10M}")
        void run() {
            sweep.runOnce();
        }
    }
}
