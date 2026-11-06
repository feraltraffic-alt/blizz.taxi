package taxi.blizz.refunds;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import taxi.blizz.platform.Actor;

/**
 * Staff refunds to riders (ADR 0018 part A, issue #512). States (REQ-ADM-05): REQUESTED → APPROVED → PROCESSING →
 * SUCCEEDED / FAILED / UNKNOWN; a request may also end REJECTED by a confirmer or NOT_REVIEWED. The server checks
 * every rule, so a direct API call cannot pass one (AC-07).
 */
public interface Refunds {

    /** "Refunds to riders" (A1): request refunds within one's own limits, in one's cities. */
    String CREATE_PERMISSION = "refunds.create";
    /** "Confirm refunds" (A3): confirm or reject the requests of others. */
    String CONFIRM_PERMISSION = "refunds.confirm";

    /**
     * {@code destination}: CARD or BONUSES; bonuses instead of money need {@code riderAgreed}. {@code fault}: null
     * for the reason's (or, for a cancelled order, the order's); another one, or the reason OTHER, needs a comment.
     */
    record Request(UUID orderId, long amountMinor, String destination, boolean riderAgreed, String reasonCode,
                   String fault, String comment) {
    }

    /**
     * {@code cardMinor} + {@code bonusMinor} = {@code amountMinor}: where it goes; {@code paidBonusMinor}: the part of
     * it that was paid with bonuses.
     */
    record Refund(UUID id, UUID orderId, UUID cityId, UUID clientId, UUID driverId, String currency, long amountMinor,
                  long cardMinor, long bonusMinor, long paidBonusMinor, boolean riderAgreed, String reasonCode,
                  Map<String, String> reasonLabels, String fault, String comment, String state, UUID requestedBy,
                  OffsetDateTime requestedAt, UUID decidedBy, OffsetDateTime decidedAt, String decisionReason,
                  OffsetDateTime endedAt, long version) {
        public Refund {
            reasonLabels = reasonLabels == null ? Map.of() : Map.copyOf(reasonLabels);
        }
    }

    /** The refund, and whether the rider already had {@code riderRefunds} refunds in the warning window (A2). */
    record Requested(Refund refund, boolean riderWarning, int riderRefunds) {
    }

    /**
     * What the order allows now: paid with money ({@code moneyMinor}, card or cash) and with bonuses, what is taken by
     * refunds already, what is {@code leftMinor}, the minimum, whether money can go back to a card, and until when
     * this staff member may refund it; with the rider warning (A2).
     */
    record Refundable(UUID orderId, String currency, long moneyMinor, long bonusMinor, long refundedMinor,
                      long leftMinor, long minimumMinor, boolean toCard, OffsetDateTime until, String defaultFault,
                      boolean riderWarning, int riderRefunds) {
    }

    /** A staff member's limits in a currency (A2) and what they took in the last 24 hours. */
    record Limit(UUID staffId, String currency, long perRefundMinor, long dailyMinor, long usedMinor, long version) {
    }

    Refundable refundable(Actor staff, UUID orderId);

    Requested request(Actor staff, UUID commandId, Request request);

    Refund confirm(Actor staff, UUID commandId, UUID refundId, long expectedVersion);

    Refund reject(Actor staff, UUID commandId, UUID refundId, long expectedVersion, String reason);

    List<Refund> ofOrder(Actor staff, UUID orderId);

    /** The requests waiting for a confirmation in the cities where {@code staff} may confirm, oldest first. */
    List<Refund> waiting(Actor staff);

    /** A staff member's limits: for the super admin, or for the staff member themselves. */
    List<Limit> limits(Actor staff, UUID staffId);

    /** The super admin sets a staff member's limits in a currency; {@code expectedVersion} 0 for a new one. */
    Limit setLimit(Actor superAdmin, UUID commandId, UUID staffId, String currency, long perRefundMinor,
                   long dailyMinor, long expectedVersion, String reason);
}
