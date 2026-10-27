package taxi.blizz.operations.internal;

import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.audit.AuditEntry;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.geo.City;
import taxi.blizz.geo.CityResolver;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.operations.AssignmentView;
import taxi.blizz.operations.CreateOrder;
import taxi.blizz.operations.OrderChannel;
import taxi.blizz.operations.OrderView;
import taxi.blizz.operations.Orders;
import taxi.blizz.operations.PaymentMethod;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;
import taxi.blizz.platform.SubjectType;
import taxi.blizz.pricing.QuoteService;
import taxi.blizz.pricing.VehicleClasses;

/** Order creation and cancellation before the trip starts (sections 9, 13). */
@Service
class JdbcOrders implements Orders {

    private final JdbcClient jdbc;
    private final StaffAccess staff;
    private final AuditLog audit;
    private final IdempotentCommands commands;
    private final CityResolver cities;
    private final OrderCore core;
    private final DispatchEngine engine;
    private final VehicleClasses classes;
    private final QuoteService quotes;

    JdbcOrders(JdbcClient jdbc, IdempotentCommands commands, CityResolver cities, OrderCore core,
               DispatchEngine engine, VehicleClasses classes, QuoteService quotes, StaffAccess staff,
               AuditLog audit) {
        this.staff = staff;
        this.audit = audit;
        this.jdbc = jdbc;
        this.commands = commands;
        this.cities = cities;
        this.core = core;
        this.engine = engine;
        this.classes = classes;
        this.quotes = quotes;
    }

    @Override
    public OrderView create(Actor actor, UUID commandId, CreateOrder order) {
        City city = cities.resolve(order.pickup())
                .orElseThrow(() -> new DomainException(ErrorCode.OUTSIDE_SERVICE_AREA, "Pickup is outside every service area"));
        String channel = authorizeCreate(actor, order, city);
        if (order.paymentMethod() == PaymentMethod.CARD) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "Card payment is not available yet");
        }
        if (order.quoteId() == null) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "An order needs a quote");
        }
        VehicleClasses.VehicleClass vehicleClass = classes.active(city.id(), order.vehicleClass())
                .orElseThrow(() -> new DomainException(ErrorCode.VALIDATION_FAILED, "This class is not offered here"));
        String fingerprint = new QuoteService.Request(city.id(), vehicleClass.id(), order.pickup(), order.dropoff(),
                actor).fingerprint();
        return commands.execute(new CommandKey(actor, "order.create", commandId), order, OrderView.class, () -> {
            QuoteService.Quote quote = quotes.consume(order.quoteId(), actor, fingerprint);
            UUID id = UUID.randomUUID();
            try {
                jdbc.sql("""
                                insert into ride_order (id, channel, payer_client_id, created_by_type, created_by_id,
                                                        city_id, vehicle_class, pickup, pickup_label, dropoff,
                                                        dropoff_label, payment_method, payment_state, price_minor, currency,
                                                        quote_id, source_ref, status, created_at, updated_at)
                                values (:id, :channel, :payer, :createdByType, :createdById, :cityId, :class,
                                        ST_SetSRID(ST_MakePoint(:pickupLon, :pickupLat), 4326), :pickupLabel,
                                        ST_SetSRID(ST_MakePoint(:dropoffLon, :dropoffLat), 4326), :dropoffLabel,
                                        :payment, :paymentState, :price, :currency, :quoteId, :sourceRef, 'READY', :now, :now)""")
                        .param("id", id)
                        .param("channel", channel)
                        .param("payer", order.payerClientId())
                        .param("createdByType", actor.type().name())
                        .param("createdById", actor.id())
                        .param("cityId", city.id())
                        .param("class", vehicleClass.code())
                        .param("pickupLon", order.pickup().lon())
                        .param("pickupLat", order.pickup().lat())
                        .param("pickupLabel", label(order.pickupLabel()))
                        .param("dropoffLon", order.dropoff().lon())
                        .param("dropoffLat", order.dropoff().lat())
                        .param("dropoffLabel", label(order.dropoffLabel()))
                        .param("payment", order.paymentMethod().name())
                        .param("paymentState", order.paymentMethod() == PaymentMethod.CASH ? "CASH_EXPECTED" : null)
                        .param("price", quote.amountMinor())
                        .param("currency", quote.currency())
                        .param("quoteId", quote.id())
                        .param("sourceRef", order.sourceRef())
                        .param("now", core.now())
                        .update();
            } catch (DuplicateKeyException e) {
                throw new DomainException(ErrorCode.ORDER_ALREADY_ACTIVE, "The payer already has an active order");
            }
            if (actor.type() == SubjectType.STAFF) {
                audit.record(new AuditEntry(actor, "order.create", "ride_order", id.toString(), "Phone order",
                        null, Map.of("channel", channel, "city_id", city.id().toString())));
            }
            core.recordEvent(id, 0, "OrderCreated", actor, null, Map.of("channel", channel,
                    "city_id", city.id().toString(), "payment_method", order.paymentMethod().name(),
                    "quote_id", quote.id().toString(), "price_minor", quote.amountMinor()));
            engine.startSearch(core.lockOrder(id));
            return core.view(id);
        });
    }

    /** Decides the channel from who is asking; the requested channel is accepted only where it fits. */
    private String authorizeCreate(Actor actor, CreateOrder order, City city) {
        OrderChannel requested = order.channel();
        switch (actor.type()) {
            case CLIENT -> {
                if (!actor.id().equals(order.payerClientId())) {
                    throw new DomainException(ErrorCode.ACCESS_DENIED, "A client orders only for itself");
                }
                if (requested != null && requested != OrderChannel.APP && requested != OrderChannel.WEB) {
                    throw new DomainException(ErrorCode.VALIDATION_FAILED, "A client orders from the app or the website");
                }
                return (requested == null ? OrderChannel.APP : requested).name();
            }
            case STAFF -> {
                if (requested != null && requested != OrderChannel.PHONE) {
                    throw new DomainException(ErrorCode.VALIDATION_FAILED, "Staff orders are phone orders");
                }
                requireStaff(actor, CREATE_PERMISSION, city.id());
                return OrderChannel.PHONE.name();
            }
            case PARTNER -> throw new DomainException(ErrorCode.ACCESS_DENIED,
                    "Partner orders arrive through the exchange protocol (M2)");
            default -> throw new DomainException(ErrorCode.ACCESS_DENIED, "Not allowed to create orders");
        }
    }

    record CancelRequest(UUID orderId, long expectedVersion, String reasonCode) {
    }

    @Override
    public OrderView cancel(Actor actor, UUID commandId, UUID orderId, long expectedVersion, String reasonCode) {
        if (reasonCode == null || reasonCode.isBlank()) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "A reason code is required");
        }
        if (actor.type() == SubjectType.STAFF) {
            UUID cityId = jdbc.sql("select city_id from ride_order where id = :id").param("id", orderId)
                    .query(UUID.class).optional()
                    .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Order not found"));
            requireStaff(actor, CANCEL_PERMISSION, cityId);
        } else if (actor.type() != SubjectType.CLIENT) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Not allowed to cancel orders");
        }
        return commands.execute(new CommandKey(actor, "order.cancel", commandId),
                new CancelRequest(orderId, expectedVersion, reasonCode), OrderView.class, () -> {
                    OrderCore.LockedOrder order = core.lockOrder(orderId);
                    if (actor.type() == SubjectType.CLIENT && !actor.id().equals(order.payerClientId())) {
                        throw new DomainException(ErrorCode.NOT_FOUND, "Order not found");
                    }
                    if (order.version() != expectedVersion) {
                        throw new DomainException(ErrorCode.VERSION_CONFLICT, "The order changed");
                    }
                    switch (order.status()) {
                        case "AWAITING_PAYMENT", "READY", "SEARCHING" -> {
                            engine.stop(orderId, "STOPPED");
                            core.closeOpenOffers(orderId, "REVOKED");
                        }
                        case "ASSIGNED" -> releaseAssignment(orderId, reasonCode);
                        default -> throw new DomainException(ErrorCode.STATE_CONFLICT,
                                "An order in " + order.status() + " cannot be cancelled this way");
                    }
                    core.changeStatus(order, "CANCELLED", reasonCode, "OrderCancelled", actor, Map.of());
                    if (actor.type() == SubjectType.STAFF) {
                        audit.record(new AuditEntry(actor, "order.cancel", "ride_order", orderId.toString(), reasonCode,
                                Map.of("status", order.status()), Map.of("status", "CANCELLED")));
                    }
                    return core.view(orderId);
                });
    }

    /** Before the start: assignment RELEASED, trip ABORTED, driver free again (REQ-ASG-04). */
    private void releaseAssignment(UUID orderId, String reason) {
        AssignmentView assignment = core.assignmentOfOrder(orderId)
                .filter(a -> "COMMITTED".equals(a.state()))
                .orElseThrow(() -> new DomainException(ErrorCode.STATE_CONFLICT, "No active assignment"));
        core.endAssignmentBeforeStart(assignment, "RELEASED", reason);
    }

    record RevokeRequest(UUID orderId, long expectedVersion, String reason) {
    }

    @Override
    public OrderView revokeAssignment(Actor staff, UUID commandId, UUID orderId, long expectedVersion, String reason) {
        if (staff.type() != SubjectType.STAFF) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Only staff can take a driver off an order");
        }
        if (reason == null || reason.isBlank()) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "A reason is required");
        }
        UUID cityId = jdbc.sql("select city_id from ride_order where id = :id").param("id", orderId)
                .query(UUID.class).optional()
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Order not found"));
        requireStaff(staff, REASSIGN_PERMISSION, cityId);
        return commands.execute(new CommandKey(staff, "order.assignment.revoke", commandId),
                new RevokeRequest(orderId, expectedVersion, reason), OrderView.class, () -> {
                    OrderCore.LockedOrder order = core.lockOrder(orderId);
                    if (order.version() != expectedVersion) {
                        throw new DomainException(ErrorCode.VERSION_CONFLICT, "The order changed");
                    }
                    if (!"ASSIGNED".equals(order.status())) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT, "Only an assigned order before the start");
                    }
                    AssignmentView assignment = core.assignmentOfOrder(orderId)
                            .filter(a -> "COMMITTED".equals(a.state()))
                            .orElseThrow(() -> new DomainException(ErrorCode.STATE_CONFLICT, "No active assignment"));
                    core.endAssignmentBeforeStart(assignment, "REVOKED", reason);
                    audit.record(new AuditEntry(staff, "order.revokeAssignment", "ride_order", orderId.toString(),
                            reason, Map.of("driver_id", assignment.driverId().toString()), null));
                    core.recordEvent(orderId, core.touch(orderId), "AssignmentRevoked", staff, reason,
                            Map.<String, Object>of("assignment_id", assignment.id().toString(),
                                    "driver_id", assignment.driverId().toString()));
                    engine.resumeSearch(core.lockOrder(orderId));
                    return core.view(orderId);
                });
    }

    @Override
    @Transactional(readOnly = true)
    public OrderView get(UUID orderId) {
        return core.view(orderId);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<OrderView> active(UUID payerClientId) {
        return jdbc.sql("""
                        select id from ride_order where payer_client_id = :payer
                          and status in ('AWAITING_PAYMENT', 'READY', 'SEARCHING', 'ASSIGNED', 'IN_SERVICE')""")
                .param("payer", payerClientId)
                .query(UUID.class)
                .optional()
                .map(core::view);
    }

    private void requireStaff(Actor actor, String permission, UUID cityId) {
        staff.require(actor, permission, cityId);
    }

    private static String label(String value) {
        return value == null || value.isBlank() ? "" : value.strip();
    }
}
