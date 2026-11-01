package taxi.blizz.operations.internal;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * REQ-PAY-02 (issue #140): a card order waits for its hold at most {@code blizz.orders.card-hold-deadline}. Past it,
 * with the bank still silent, the order ends UNFULFILLED (PAYMENT_TIMEOUT), the rider is told as for a declined hold,
 * and the hold is released: a success that comes later is voided, never captured.
 */
@Component
class CardHoldDeadline {

    private static final Logger log = LoggerFactory.getLogger(CardHoldDeadline.class);

    private final JdbcClient jdbc;
    private final TransactionTemplate tx;
    private final OrderCore core;
    private final Clock clock;
    private final Duration deadline;

    CardHoldDeadline(JdbcClient jdbc, TransactionTemplate tx, OrderCore core, Clock clock,
                     @Value("${blizz.orders.card-hold-deadline:PT3M}") Duration deadline) {
        this.jdbc = jdbc;
        this.tx = tx;
        this.core = core;
        this.clock = clock;
        this.deadline = deadline;
    }

    /** Every few seconds, by the service clock. */
    @Scheduled(fixedDelayString = "${blizz.orders.card-hold-check:PT15S}", initialDelayString = "PT30S")
    void run() {
        expire(clock.instant());
    }

    /** Ends every card order that has waited for its hold longer than the deadline at {@code now}; how many. */
    int expire(Instant now) {
        List<UUID> due = jdbc.sql("""
                        select id from ride_order
                        where status = 'AWAITING_PAYMENT' and created_at < :before
                        order by created_at limit 200""")
                .param("before", OffsetDateTime.ofInstant(now.minus(deadline), ZoneOffset.UTC))
                .query(UUID.class).list();
        int ended = 0;
        for (UUID orderId : due) {
            try {
                if (Boolean.TRUE.equals(tx.execute(status -> end(orderId)))) {
                    ended++;
                }
            } catch (RuntimeException e) {
                log.error("Card order {} could not be ended at its hold deadline", orderId, e);
            }
        }
        return ended;
    }

    /** Under the order's lock, as the hold's outcome takes it: whichever comes first decides, the other sees it. */
    private boolean end(UUID orderId) {
        OrderCore.LockedOrder order = core.lockOrder(orderId);
        if (!"AWAITING_PAYMENT".equals(order.status())) {
            return false;
        }
        core.releaseCardHold(orderId, "The bank did not answer before the hold deadline");
        core.setPaymentState(orderId, "HOLD_RELEASED");
        core.changeStatus(order, "UNFULFILLED", "PAYMENT_TIMEOUT", "CardHoldDeclined", OrderCore.system(),
                Map.of("reason", "PAYMENT_TIMEOUT"));
        log.warn("Card order {} ended: no answer from the bank within {}", orderId, deadline);
        return true;
    }
}
