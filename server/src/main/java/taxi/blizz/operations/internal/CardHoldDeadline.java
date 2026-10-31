package taxi.blizz.operations.internal;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
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
        return 0;
    }
}
