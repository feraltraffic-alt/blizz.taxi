package taxi.blizz.backoffice;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.PageCursor;

/**
 * Staff check and complete drivers' deletion requests (issue #144, REQ-PRV-04), as {@link ClientDeletionReview} does
 * for riders. Completion is refused while something blocks it, with its own code: a trip, an open offer or a pre-order
 * reservation ({@code DRIVER_HAS_ACTIVE_WORK}), money the driver owes the service ({@code DRIVER_HAS_DEBT}), a cash
 * dispute not yet decided ({@code DRIVER_HAS_DISPUTE}). Needs {@link #DELETE_PERMISSION}; every decision is audited.
 */
public interface DriverDeletionReview {

    String DELETE_PERMISSION = "drivers.delete";

    enum Work { TRIP, OFFER, RESERVATION }

    record Amount(String currency, long amountMinor) {
    }

    /** {@code blocked} when any of the three is there. */
    record Blockers(List<Work> activeWork, List<Amount> debt, int openCashDisputes, boolean blocked) {
        public Blockers {
            activeWork = activeWork == null ? List.of() : List.copyOf(activeWork);
            debt = debt == null ? List.of() : List.copyOf(debt);
        }
    }

    record Request(UUID driverId, String previousState, OffsetDateTime requestedAt, Blockers blockers) {
    }

    /** What a decision left the account in: ANONYMIZED, or the state it went back to. */
    record Decision(UUID driverId, String accountState) {
    }

    String PENDING = "driver-deletions";

    static PageCursor position(Request request) {
        return PageCursor.of(PENDING, request.requestedAt(), request.driverId());
    }

    /** Pending requests, oldest first (requested_at, then driver id), after {@code after} (REQ-API-09). */
    List<Request> pending(Actor staff, PageCursor after, int limit);

    /** Anonymizes the driver; a blocker's code (409) or {@code STATE_CONFLICT} without a pending request. */
    Decision complete(Actor staff, UUID commandId, UUID driverId, String reason);

    /** Returns the account to the state it had before the request. */
    Decision reject(Actor staff, UUID commandId, UUID driverId, String reason);
}
