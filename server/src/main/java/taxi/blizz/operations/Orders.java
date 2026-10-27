package taxi.blizz.operations;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.SubjectType;

/** Order lifecycle commands (section 9). Every change is a named command with a command id. */
public interface Orders {

    String CREATE_PERMISSION = "orders.create";
    String VIEW_PERMISSION = "orders.view";
    String CANCEL_PERMISSION = "orders.cancel";
    String REASSIGN_PERMISSION = "orders.reassign";

    record HistoryVehicle(String make, String model, String color, String registrationNumber) {
    }

    record HistoryDriver(String name, HistoryVehicle vehicle) {
    }

    record HistoryItem(UUID id, long shortNumber, String status, OffsetDateTime createdAt, String pickupLabel,
                       String dropoffLabel, String vehicleClass, Long priceMinor, Long finalPriceMinor,
                       String currency, PaymentMethod paymentMethod, HistoryDriver driver, boolean chatAvailable,
                       OrderView.Cancellation cancellation, OffsetDateTime pickupAt) {
    }

    /**
     * Creates the order and starts the search. A client creates orders it pays for; staff need
     * {@link #CREATE_PERMISSION} and the pickup city in their scope (REQ-OPS-03).
     */
    OrderView create(Actor actor, UUID commandId, CreateOrder order);

    /**
     * A phone order made during an incoming call (issue #64): created as {@link #create} and linked to the call in the
     * same transaction. Ending the call never cancels the order (REQ-OPS-10). The staff member also needs
     * {@code telephony.Calls.ANSWER_PERMISSION} for the call's city; a call that already has an order takes another
     * one only with {@code linkAgain} (the first link stays), otherwise {@code STATE_CONFLICT}.
     */
    OrderView createDuringCall(Actor staff, UUID commandId, CreateOrder order, UUID callId, boolean linkAgain);

    /**
     * Cancels before the trip starts: by the paying client or by staff with {@link #CANCEL_PERMISSION}.
     * Releases an assignment and the driver; no fee until the cancellation policy exists (Q-07).
     */
    OrderView cancel(Actor actor, UUID commandId, UUID orderId, long expectedVersion, String reasonCode);

    /**
     * Takes the driver off an assigned order before the start, with a reason, and searches again
     * (REQ-OPS-05). Staff with {@link #REASSIGN_PERMISSION} for the order's city.
     */
    OrderView revokeAssignment(Actor staff, UUID commandId, UUID orderId, long expectedVersion, String reason);

    OrderView get(UUID orderId);

    /** Orders of one city visible to staff, newest first; limit is capped at 100 (REQ-OPS-01). */
    List<OrderView> inCity(Actor staff, UUID cityId, boolean activeOnly, OffsetDateTime before, int limit);

    /** The signed-in payer's orders, newest first; the limit is capped at 50 (REQ-RID-*). */
    List<HistoryItem> history(Actor payer, OffsetDateTime before, int limit);

    /**
     * Who did what with the order, oldest first, for the order card in the operator and admin panels: the actor's
     * type, name and current role, the reason and the event's details (for a cancellation {@code cancelled_by},
     * {@code reason_code}, {@code reason_labels}). Needs {@link #VIEW_PERMISSION} for the order's city.
     */
    List<TimelineEntry> timeline(Actor staff, UUID orderId);

    /** {@code name} and {@code role} are filled for staff and drivers. */
    record TimelineActor(String type, UUID id, String name, String role) {
    }

    record TimelineEntry(long sequence, String type, OffsetDateTime occurredAt, TimelineActor actor, String reason,
                         java.util.Map<String, Object> details) {
    }

    String INTERRUPT_PERMISSION = "orders.interrupt";

    /**
     * {@code pickup}: where the follow-up picks the rider up; null — the driver's last position.
     * {@code pickupLabel}: what the new driver sees; null — "where the previous car stopped".
     */
    record Interruption(String reasonCode, String comment, boolean followUp, taxi.blizz.geo.GeoPoint pickup,
                        String pickupLabel) {
    }

    record Interrupted(OrderView order, OrderView followUp) {
    }

    /**
     * A trip in progress cannot go on (T-22, REQ-OPS-05; owner decision 27.10.2026): staff with
     * {@link #INTERRUPT_PERMISSION} cancel it with a staff reason; the trip is ABORTED where the car stopped, the part
     * driven is free and the driver is released. With {@code followUp}, a new order linked to this one takes the rider
     * from that point to the original destination; the rider pays nothing and the service pays its driver by the
     * tariff (payment method SERVICE). The interrupted driver is not offered the follow-up.
     */
    Interrupted interrupt(Actor staff, UUID commandId, UUID orderId, long expectedVersion, Interruption interruption);

    /** Who takes part in an order now: the paying rider and the driver of the current or last assignment. */
    record Participants(UUID payerClientId, UUID driverId) {
    }

    /** For live updates (section 20); empty when the order does not exist. */
    java.util.Optional<Participants> participants(UUID orderId);

    /**
     * The payer's most recent order that is not yet finished, if any (an order for now before an order for later);
     * kept for the clients that know one active order. A rider may now hold several: {@link #current}.
     */
    Optional<OrderView> active(UUID payerClientId);

    /** Every order of the payer not in a final state, pre-orders included, newest first (ADR 0012 Q-03). */
    List<OrderView> current(UUID payerClientId);

    /** Order creation facts exposed to other modules without leaking the operations tables (ADR 0004). */
    record Origin(UUID orderId, OrderChannel channel, SubjectType createdByType, UUID createdById,
                  UUID cityId, OffsetDateTime createdAt) {
    }

    /** Empty when the order does not exist. */
    Optional<Origin> origin(UUID orderId);
}
