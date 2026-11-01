package taxi.blizz.finance.internal;

import java.time.Duration;
import org.springframework.stereotype.Component;
import taxi.blizz.platform.DatabaseGauges;

/**
 * "Pending accounting" (REQ-LED-05, issue #140): how long the oldest completed trip has waited for its fare posting,
 * counting only trips completed more than {@link #GRACE} ago; the alert TripPostingLate fires past 10 minutes.
 */
@Component
class PendingPostingGauges extends DatabaseGauges {

    /** A posting normally comes within seconds; younger trips are not counted. */
    static final Duration GRACE = Duration.ofMinutes(1);

    PendingPostingGauges(JdbcFareAccounting accounting) {
        gauge("blizz.finance.postings.pending.oldest.seconds",
                "Seconds the oldest completed trip has waited for its fare posting (trips older than a minute)",
                accounting::oldestWaitingSeconds);
    }
}
