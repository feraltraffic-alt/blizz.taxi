package taxi.blizz.operations.internal;

import java.time.Instant;
import org.springframework.stereotype.Component;

/**
 * A capture held by a trip-facts correction must not outlive the card hold (review of #169): a held card trip whose
 * hold expires within {@code blizz.trips.held-capture-margin} is captured with the order's current fare without
 * waiting for the review, which still happens. Its gauges show how many captures are held and how soon the first
 * hold expires.
 */
@Component
class HeldCaptureDeadline {

    /** Every few minutes, by the service clock. */
    void run() {
        throw new UnsupportedOperationException("issue #142, review of #169");
    }

    /** Releases every held capture whose hold expires within the margin of {@code now}; how many it released. */
    int releaseExpiring(Instant now) {
        throw new UnsupportedOperationException("issue #142, review of #169");
    }
}
