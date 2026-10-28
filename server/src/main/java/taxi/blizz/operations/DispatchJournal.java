package taxi.blizz.operations;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import taxi.blizz.platform.Actor;

/**
 * Why a driver did or did not get an order (REQ-DSP-12, issue #71): the order's search attempts, their offers and the
 * rounds of choosing the next driver, with every candidate's outcome and the reason he was left out. Driver ids and
 * distances only — no positions, phones or names (REQ-PRV-02). Rounds are kept for {@code journal-retention}.
 */
public interface DispatchJournal {

    record Journal(List<Attempt> attempts) {
    }

    /** {@code outcome}: SEARCHING, ASSIGNED, EXHAUSTED or STOPPED. */
    record Attempt(UUID attemptId, int generation, OffsetDateTime startedAt, OffsetDateTime firstOfferAt,
                   OffsetDateTime broadcastAt, OffsetDateTime assignedAt, OffsetDateTime endedAt, String outcome,
                   List<Offer> offers, List<Round> rounds) {
    }

    /** {@code result}: OPEN, ACCEPTED, DECLINED, EXPIRED or REVOKED. */
    record Offer(UUID offerId, UUID driverId, Integer distanceM, String result, OffsetDateTime offeredAt,
                 OffsetDateTime closedAt) {
    }

    record Round(OffsetDateTime at, String phase, int radiusM, List<Candidate> candidates) {
    }

    /** {@code outcome}: OFFERED, ELIGIBLE or EXCLUDED with {@code reason}. */
    record Candidate(UUID driverId, Integer distanceM, String outcome, String reason) {
    }

    /** Needs {@link Orders#VIEW_PERMISSION} for the order's city. */
    Journal of(Actor staff, UUID orderId);
}
