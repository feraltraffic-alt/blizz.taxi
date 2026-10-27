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

    OrderView create(Actor actor, UUID commandId, CreateOrder order);

    OrderView cancel(Actor actor, UUID commandId, UUID orderId, long expectedVersion, String reasonCode);

    OrderView revokeAssignment(Actor staff, UUID commandId, UUID orderId, long expectedVersion, String reason);

    OrderView get(UUID orderId);

    List<OrderView> inCity(Actor staff, UUID cityId, boolean activeOnly, OffsetDateTime before, int limit);

    List<HistoryItem> history(Actor payer, OffsetDateTime before, int limit);

    List<TimelineEntry> timeline(Actor staff, UUID orderId);

    record TimelineActor(String type, UUID id, String name, String role) {
    }

    record TimelineEntry(long sequence, String type, OffsetDateTime occurredAt, TimelineActor actor, String reason,
                         java.util.Map<String, Object> details) {
    }

    String INTERRUPT_PERMISSION = "orders.interrupt";

    record Interruption(String reasonCode, String comment, boolean followUp, taxi.blizz.geo.GeoPoint pickup,
                        String pickupLabel) {
    }

    record Interrupted(OrderView order, OrderView followUp) {
    }

    Interrupted interrupt(Actor staff, UUID commandId, UUID orderId, long expectedVersion, Interruption interruption);

    record Participants(UUID payerClientId, UUID driverId) {
    }

    java.util.Optional<Participants> participants(UUID orderId);

    Optional<OrderView> active(UUID payerClientId);

    /**
     * Stable read model for cross-module consumers that need who created an order without reading operations tables.
     * Only operations implements this SQL (ADR 0004).
     */
    record Origin(UUID orderId, OrderChannel channel, SubjectType createdByType, UUID createdById,
                  UUID cityId, OffsetDateTime createdAt) {
    }

    /** Empty when the order does not exist. Implementations predating this read API may keep the default. */
    default Optional<Origin> origin(UUID orderId) {
        return Optional.empty();
    }
}
