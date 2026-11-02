package taxi.blizz.finance;

import java.util.List;
import java.util.UUID;
import taxi.blizz.platform.Actor;

/**
 * What a driver owes the service — mostly the commission of cash trips — and the admin's debt limit
 * (REQ-PAY-16). Over the limit the driver gets no new orders; a trip in progress is never interrupted.
 * The status follows every journal change and is published as {@code DriverDebtStatusChanged}.
 */
public interface DriverDebts {

    String MANAGE_PERMISSION = "finance.manage";

    /**
     * {@code owedMinor} > 0: the driver owes the service. {@code limitMinor} null: no limit for the
     * currency. {@code blocked}: owed above the limit.
     */
    record Status(UUID driverId, String currency, long owedMinor, Long limitMinor, boolean blocked) {
    }

    record Limit(String currency, Long limitMinor, long version) {
    }

    /**
     * Sets the debt limit of the staff member's taxi service for a currency (ADR 0016); {@code limitMinor} null
     * removes it. Every driver's status in that currency is recomputed in durable background batches after this
     * command commits. {@code expectedVersion} is 0 for a currency without a limit yet in that service.
     */
    Limit setLimit(Actor staff, UUID commandId, String currency, Long limitMinor, long expectedVersion, String reason);

    /** The limit of the service {@code within} (a driver or a staff member) belongs to. */
    Limit limit(Actor within, String currency);

    /**
     * Records money the driver paid in to the service (cash at the office, a transfer), with the
     * external reference; posts it to the journal and recomputes the status.
     */
    Status recordPayment(Actor staff, UUID commandId, UUID driverId, String currency, long amountMinor,
                         String reference, String reason);

    /** Recomputes the driver's status after a journal change; joins the caller's transaction. */
    Status refresh(UUID driverId, String currency);

    List<Status> statusOf(UUID driverId);
}
