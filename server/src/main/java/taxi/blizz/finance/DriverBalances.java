package taxi.blizz.finance;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import taxi.blizz.platform.Actor;

/**
 * The driver's balance with the service (ADR 0010, journal DRIVER_PAYABLE): its history, top-ups by staff and
 * transfers between drivers within the limits set in the admin panel. Positive — the service owes the driver.
 */
public interface DriverBalances {

    /** Same right as the debt limits (finance.manage). */
    String MANAGE_PERMISSION = DriverDebts.MANAGE_PERMISSION;

    /** DEPOSIT: money the driver paid in (cash at the office, a transfer); BONUS: a gift of the service. */
    enum TopUpKind { DEPOSIT, BONUS }

    record Balance(String currency, long balanceMinor) {
    }

    /**
     * One movement: {@code amountMinor} positive in, negative out. {@code kind}: TRIP_FARE, CASH_COLLECTED, DEPOSIT,
     * BONUS, CARD_TOP_UP, TRANSFER_IN, TRANSFER_OUT, PROMOTION, … {@code counterpartId}: the other driver of a
     * transfer.
     */
    record Entry(UUID id, OffsetDateTime at, String kind, String currency, long amountMinor, String reason,
                 UUID orderId, UUID counterpartId) {
    }

    record Statement(UUID driverId, List<Balance> balances, List<Entry> entries) {
    }

    /** Per currency; {@code enabled} false or no rule: transfers are off. */
    record TransferRule(String currency, boolean enabled, long maxPerTransferMinor, long maxPerDayMinor,
                        long minBalanceAfterMinor, long version) {
    }

    record Transfer(UUID id, UUID fromDriverId, UUID toDriverId, String currency, long amountMinor, String comment,
                    OffsetDateTime at) {
    }

    Statement mine(Actor driver, int limit);

    Statement of(Actor staff, UUID driverId, int limit);

    Statement topUp(Actor staff, UUID commandId, UUID driverId, String currency, long amountMinor, TopUpKind kind,
                    String reference, String reason);

    /** A part of the balance to another driver, found by phone (ADR 0010 p. 2). */
    Transfer transfer(Actor driver, UUID commandId, String toPhone, String currency, long amountMinor, String comment);

    List<TransferRule> transferRules();

    TransferRule setTransferRule(Actor staff, UUID commandId, TransferRule rule, long expectedVersion, String reason);

    /**
     * The reward of a drivers' promotion (ADR 0010 p. 5), in the caller's transaction; the service's expense. Once per
     * promotion, driver and period: {@code false} when already credited.
     */
    boolean creditPromotion(UUID driverId, UUID promotionId, int periodIndex, String currency, long amountMinor,
                            String promotionName);
}
