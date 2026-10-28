package taxi.blizz.operations;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import taxi.blizz.platform.Actor;

/**
 * Tips after a fulfilled trip (ADR 0012, Q-04). The rider picks 10, 15, 20 or 25 % of the trip's cost, each rounded
 * up to a whole unit of the currency, or any amount from one unit to the cost rounded up; within the window of the
 * service settings after the trip; once per order. The tip is paid the way the order was: by card — a separate charge
 * of the same card; in cash or at the driver's terminal — handed over and only recorded; an order paid wholly with
 * bonuses — from the bonus account when it has enough, otherwise the order's own method. All of it goes to the
 * driver. {@link #PAID} is published with {@code tip_id}, {@code order_id}, {@code driver_id},
 * {@code payer_client_id}, {@code amount_minor}, {@code currency} and {@code method} once the tip is paid or
 * recorded.
 */
public interface Tips {

    String PAID = "TipPaid";

    record Preset(int percent, long amountMinor) {
    }

    /**
     * {@code state}: PENDING (a card charge on its way), PAID, FAILED (the card declined; another tip may be left),
     * RECORDED (cash or terminal).
     */
    record Tip(UUID id, UUID orderId, long amountMinor, String currency, String method, String state,
               String failureReason, OffsetDateTime createdAt) {
    }

    /**
     * What the tip screen shows: the presets, the bounds of an own amount, how it would be paid and until when;
     * {@code tip} — the one already left, if any. A SERVICE order is closed with a null method.
     */
    record Options(UUID orderId, String currency, long tripCostMinor, List<Preset> presets, long minMinor,
                   long maxMinor, String method, OffsetDateTime availableUntil, boolean open, Tip tip) {
    }

    Options options(Actor rider, UUID orderId);

    Tip leave(Actor rider, UUID commandId, UUID orderId, long amountMinor);
}
