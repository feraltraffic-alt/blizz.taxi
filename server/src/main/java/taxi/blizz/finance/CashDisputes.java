package taxi.blizz.finance;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import taxi.blizz.platform.Actor;

/**
 * A trip the driver reports as not paid in cash or at the driver's terminal (owner decision 28.10.2026). The rider owes
 * the fare; the part of the driver's share the service setting does not credit is held. Support decides, within
 * {@link #DECIDE_WITHIN_DAYS} days, once:
 * <ul>
 *   <li>{@link Decision#RIDER_PAID} — the rider had paid the driver: the rider's debt goes, the driver holds the cash
 *       (owes the commission as on any cash trip), the held part is released, and the driver gets a risk flag;</li>
 *   <li>{@link Decision#PAY_DRIVER} — the rider did not pay; the service releases the held part to the driver and the
 *       rider's debt stays;</li>
 *   <li>{@link Decision#KEEP_HELD} — the rider did not pay; the held part stays held until the rider pays the debt
 *       (Q-10), and the rider's debt stays.</li>
 * </ul>
 * Nothing moves by itself: a dispute not decided by its deadline becomes an urgent task for a manager
 * ({@link #OVERDUE}, owner decision 28.10.2026).
 */
public interface CashDisputes {

    String MANAGE_PERMISSION = DriverDebts.MANAGE_PERMISSION;
    int DECIDE_WITHIN_DAYS = 14;
    String DECIDED = "CashDisputeDecided";
    String OVERDUE = "CashDisputeOverdue";

    enum Decision {
        RIDER_PAID, PAY_DRIVER, KEEP_HELD
    }

    record Dispute(UUID orderId, UUID driverId, UUID payerClientId, String currency, long heldMinor,
                   long riderDebtMinor, OffsetDateTime openedAt, OffsetDateTime decideBy, Decision decision,
                   UUID decidedBy, String reason, OffsetDateTime decidedAt, long version) {
    }

    Dispute get(Actor staff, UUID orderId);

    /** Undecided ones, the soonest deadline first. */
    List<Dispute> open(Actor staff, int limit);

    Dispute decide(Actor staff, UUID commandId, UUID orderId, long expectedVersion, Decision decision, String reason);
}
