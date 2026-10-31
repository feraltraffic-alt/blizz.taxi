package taxi.blizz.operations;

import java.util.List;
import java.util.UUID;
import taxi.blizz.platform.Actor;
import taxi.blizz.pricing.FinalFares;

/**
 * Correcting a fulfilled order's final fare after the fact (REQ-ADM-03, REQ-PRC-10, issue #142): a new version with
 * the reason and the author, the difference posted to the journal once, the order's price and history updated. The
 * staff member needs {@link #CORRECT_PERMISSION} in the order's city and gives the password again (REQ-ADM-10).
 */
public interface FareCorrections {

    String CORRECT_PERMISSION = "fares.correct";

    /** {@code refundState}: NONE, or WAITING_FOR_REFUND_FLOW while a refund obligation waits for #140. */
    record View(UUID orderId, String currency, int currentVersion, List<FinalFares.Version> versions,
                long refundObligationMinor, String refundState) {
    }

    /** The order's fare for the admin card; {@code Orders.VIEW_PERMISSION} in its city. */
    View fare(Actor staff, UUID orderId);

    /**
     * A command. ACCESS_DENIED without the permission or with a wrong password; VALIDATION_FAILED for a bad reason or
     * amount; VERSION_CONFLICT (with the current version) for a stale {@code expectedVersion}; STATE_CONFLICT for an
     * order not FULFILLED or the same amount; PAYMENT_PENDING while a payment of the order is in progress.
     */
    View correct(Actor staff, UUID commandId, UUID orderId, int expectedVersion, long amountMinor, String reason,
                 String password);
}
