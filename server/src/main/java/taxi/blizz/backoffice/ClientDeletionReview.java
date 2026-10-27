package taxi.blizz.backoffice;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import taxi.blizz.platform.Actor;

/**
 * Staff check and complete riders' deletion requests (REQ-RID-10, REQ-PRV-04, issue #56). Completion is refused while
 * something blocks it: an active order, an unpaid debt (RIDER_RECEIVABLE) or an open support case of the rider. The
 * bonus balance is shown for information: it burns on completion (owner decision 27.10.2026). Completion is a manual
 * action; retention timers are Q-19. Needs {@link #DELETE_PERMISSION}; every decision is audited.
 */
public interface ClientDeletionReview {

    String DELETE_PERMISSION = "clients.delete";

    record Amount(String currency, long amountMinor) {
    }

    /** {@code blocked} when any of the first three is there; {@code bonusesToBurn} never blocks. */
    record Blockers(UUID activeOrderId, List<Amount> debt, int openSupportCases, List<Amount> bonusesToBurn,
                    boolean blocked) {
        public Blockers {
            debt = debt == null ? List.of() : List.copyOf(debt);
            bonusesToBurn = bonusesToBurn == null ? List.of() : List.copyOf(bonusesToBurn);
        }
    }

    record Request(UUID clientId, String previousState, OffsetDateTime requestedAt, Blockers blockers) {
    }

    /** What a decision left the account in: ANONYMIZED, or the state it went back to. */
    record Decision(UUID clientId, String accountState) {
    }

    /** Pending requests, oldest first, after {@code after} (exclusive); at most 100. */
    List<Request> pending(Actor staff, OffsetDateTime after, int limit);

    /** Anonymizes the client; {@code STATE_CONFLICT} while a blocker exists or without a pending request. */
    Decision complete(Actor staff, UUID commandId, UUID clientId, String reason);

    /** Returns the account to the state it had before the request. */
    Decision reject(Actor staff, UUID commandId, UUID clientId, String reason);
}
