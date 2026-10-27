package taxi.blizz.finance;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import taxi.blizz.platform.Actor;

/**
 * The rider's virtual account (ADR 0009): bonuses and top-ups in the service's currency, 1 bonus = 1 unit. It never
 * expires, is never paid out and never goes below zero. Every movement is a journal posting on {@code RIDER_WALLET}
 * and an entry of the rider's history with who and why.
 */
public interface RiderWallets {

    String MANAGE_PERMISSION = "wallets.manage";

    /** {@code reservedMinor}: set aside for orders not finished yet; {@code availableMinor} may be spent now. */
    record Balance(String currency, long balanceMinor, long reservedMinor, long availableMinor) {
    }

    /**
     * One movement: {@code amountMinor} positive in, negative out. {@code kind}: STAFF_TOP_UP, CARD_TOP_UP,
     * PROMOTION, TRIP_PAYMENT, …; {@code staffId} for a top-up by staff; {@code orderId} for trips and promotions.
     */
    record Entry(UUID id, OffsetDateTime at, String kind, String currency, long amountMinor, String reason,
                 UUID staffId, UUID orderId) {
    }

    record Wallet(UUID clientId, List<Balance> balances, List<Entry> entries) {
    }

    /** The rider's own account with the latest movements. */
    Wallet mine(Actor rider, int limit);

    /** For staff: the account of a rider, found by id. */
    Wallet of(Actor staff, UUID clientId, int limit);

    /** For staff: the client id behind a phone number, to open the account. */
    UUID clientByPhone(Actor staff, String phone);

    /** A top-up by staff with a reason (ADR 0009 p. 1); audited. */
    Wallet topUp(Actor staff, UUID commandId, UUID clientId, String currency, long amountMinor, String reason);

    /**
     * Sets bonuses aside for an order, in the caller's transaction (the order is created in it). Fails with
     * {@code WALLET_INSUFFICIENT} when fewer are available. After the trip the account takes at most the final fare
     * and lets the rest go; a cancelled or unfulfilled order lets everything go.
     */
    void reserve(UUID clientId, UUID orderId, String currency, long amountMinor);

    /**
     * A tip paid with bonuses (ADR 0012), in the caller's transaction: the rider's available bonuses go to the
     * driver's balance at once. Fails with {@code WALLET_INSUFFICIENT} when fewer are available; once per tip.
     */
    void payTip(UUID clientId, UUID driverId, UUID orderId, UUID tipId, String currency, long amountMinor);

    /** What the rider may spend now in {@code currency}: the balance less what orders set aside. */
    long available(UUID clientId, String currency);

    /**
     * Bonuses of a promotion for a trip (ADR 0009), in the caller's transaction; the service's expense. Once per order
     * and promotion: returns {@code false} when already credited.
     */
    boolean creditPromotion(UUID clientId, UUID orderId, UUID promotionId, String currency, long amountMinor,
                            String promotionName);
}
