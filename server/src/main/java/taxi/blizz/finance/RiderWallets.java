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

    record Balance(String currency, long balanceMinor) {
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
}
