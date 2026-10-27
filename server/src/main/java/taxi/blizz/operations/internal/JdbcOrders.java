package taxi.blizz.operations.internal;

import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.audit.AuditEntry;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.configuration.CancelReasons;
import taxi.blizz.configuration.ServiceSettings;
import taxi.blizz.payments.CardPayments;
import taxi.blizz.geo.City;
import taxi.blizz.geo.CityResolver;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.identity.StaffDirectory;
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
import tools.jackson.databind.json.JsonMapper;

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
    private final CancelReasons reasons;
    private final StaffDirectory directory;
    private final JsonMapper json;
    private final ServiceSettings settings;
    private final CardPayments cardPayments;

    /** Pre-orders a rider may have waiting at a time; keeps a single account from booking the fleet. */
    static final int MAX_SCHEDULED_PER_PAYER = 5;

    JdbcOrders(JdbcClient jdbc, IdempotentCommands commands, CityResolver cities, OrderCore core,
               DispatchEngine engine, VehicleClasses classes, QuoteService quotes, StaffAccess staff,
               AuditLog audit, CancelReasons reasons, StaffDirectory directory, JsonMapper json,
               ServiceSettings settings, CardPayments cardPayments) {
        this.cardPayments = cardPayments;
        this.settings = settings;
        this.reasons = reasons;
        this.directory = directory;
        this.json = json;
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
        if (order.caller() != null && actor.type() != SubjectType.STAFF) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "Caller contact is only valid for a staff phone order");
        }
        String channel = authorizeCreate(actor, order, city);
        if (order.paymentMethod() == PaymentMethod.SERVICE) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "SERVICE is set only for a follow-up order");
        }
        boolean card = order.paymentMethod() == PaymentMethod.CARD;
        if (card && (actor.type() != SubjectType.CLIENT || order.payerClientId() == null)) {
            // A phone order is paid in cash or by a payment link (REQ-PAY-17, later).
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "Only a rider pays by a saved card");
        }
        if (order.quoteId() == null) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "An order needs a quote");
        }
        VehicleClasses.VehicleClass vehicleClass = classes.active(city.id(), order.vehicleClass())
                .orElseThrow(() -> new DomainException(ErrorCode.VALIDATION_FAILED, "This class is not offered here"));
        String fingerprint = new QuoteService.Request(city.id(), vehicleClass.id(), order.pickup(), order.dropoff(),
                actor, order.pickupAt()).fingerprint();
        OrderView result = commands.execute(new CommandKey(actor, "order.create", commandId), order, OrderView.class,
                () -> {
            QuoteService.Quote quote = quotes.consume(order.quoteId(), actor, fingerprint);
            UUID id = UUID.randomUUID();
            OffsetDateTime now = core.now();
            // The quote decided whether this is a pre-order, with the settings in force then (ADR 0006).
            boolean preorder = quote.breakdown().preorder();
            OffsetDateTime pickupAt = order.pickupAt() == null ? null : order.pickupAt().atOffset(java.time.ZoneOffset.UTC);
            OffsetDateTime releaseAt = null;
            if (preorder) {
                if (!pickupAt.isAfter(now)) {
                    throw new DomainException(ErrorCode.VALIDATION_FAILED, "The pickup time is in the past");
                }
                if (order.payerClientId() != null && jdbc.sql("""
                                select count(*) from ride_order
                                where payer_client_id = :payer and status = 'SCHEDULED'""")
                        .param("payer", order.payerClientId()).query(Long.class).single() >= MAX_SCHEDULED_PER_PAYER) {
                    throw new DomainException(ErrorCode.VALIDATION_FAILED,
                            "At most " + MAX_SCHEDULED_PER_PAYER + " orders for later at a time");
                }
                OffsetDateTime release = pickupAt.minusMinutes(
                        settings.current().settings().preorders().releaseMinutesBefore());
                releaseAt = release.isBefore(now) ? now : release;
            }
            try {
                jdbc.sql("""
                                insert into ride_order (id, channel, payer_client_id, created_by_type, created_by_id,
                                                        city_id, vehicle_class, pickup, pickup_label, dropoff,
                                                        dropoff_label, payment_method, payment_state, price_minor, currency,
                                                        quote_id, source_ref, status, pickup_at, preorder, release_at,
                                                        created_at, updated_at)
                                values (:id, :channel, :payer, :createdByType, :createdById, :cityId, :class,
                                        ST_SetSRID(ST_MakePoint(:pickupLon, :pickupLat), 4326), :pickupLabel,
                                        ST_SetSRID(ST_MakePoint(:dropoffLon, :dropoffLat), 4326), :dropoffLabel,
                                        :payment, :paymentState, :price, :currency, :quoteId, :sourceRef, :status, :pickupAt, :preorder,
                                        :releaseAt, :now, :now)""")
                        // A card order waits for the hold before anything else (REQ-PAY-01, ADR 0008).
                        .param("status", card ? "AWAITING_PAYMENT" : preorder ? "SCHEDULED" : "READY")
                        .param("pickupAt", pickupAt)
                        .param("preorder", preorder)
                        .param("releaseAt", releaseAt)
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
                        .param("paymentState", card ? "AUTH_PENDING" : "CASH_EXPECTED")
                        .param("price", quote.amountMinor())
                        .param("currency", quote.currency())
                        .param("quoteId", quote.id())
                        .param("sourceRef", order.sourceRef())
                        .param("now", now)
                        .update();
            } catch (DuplicateKeyException e) {
                throw new DomainException(ErrorCode.ORDER_ALREADY_ACTIVE, "The payer already has an active order");
            }
            if (order.caller() != null) {
                jdbc.sql("""
                                insert into order_contact (order_id, name, phone, created_by, created_at)
                                values (:order, :name, :phone, :createdBy, :now)""")
                        .param("order", id)
                        .param("name", order.caller().name())
                        .param("phone", order.caller().phone())
                        .param("createdBy", actor.id())
                        .param("now", now)
                        .update();
            }
            if (actor.type() == SubjectType.STAFF) {
                audit.record(new AuditEntry(actor, "order.create", "ride_order", id.toString(), "Phone order",
                        null, Map.of("channel", channel, "city_id", city.id().toString())));
            }
            Map<String, Object> created = new java.util.LinkedHashMap<>(Map.of("channel", channel,
                    "city_id", city.id().toString(), "payment_method", order.paymentMethod().name(),
                    "quote_id", quote.id().toString(), "price_minor", quote.amountMinor()));
            if (pickupAt != null) {
                created.put("pickup_at", pickupAt.toString());
                created.put("preorder", preorder);
            }
            core.recordEvent(id, 0, preorder ? "OrderScheduled" : "OrderCreated", actor, null, created);
            if (card) {
                cardPayments.requestHold(id, order.payerClientId(), city.id(), quote.amountMinor(), quote.currency(),
                        preorder ? pickupAt.plusDays(1) : null);
            } else if (!preorder) {
                engine.startSearch(core.lockOrder(id));
            }
            return core.view(id);
        });
        if (card) {
            // The hold is asked for outside the transaction; the worker retries if this attempt fails.
            cardPayments.processNow(result.id());
        }
        return result;
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
                    // Rider and staff each choose from their own list (owner decision 27.10.2026).
                    String by = actor.type() == SubjectType.STAFF ? "STAFF" : "RIDER";
                    CancelReasons.Reason reason = reasons.require(actor.type() == SubjectType.STAFF
                            ? CancelReasons.Audience.STAFF : CancelReasons.Audience.RIDER, reasonCode);
                    switch (order.status()) {
                        case "SCHEDULED", "AWAITING_PAYMENT", "READY", "SEARCHING" -> {
                            // A driver holding the pre-order loses it with the order.
                            jdbc.sql("""
                                            update preorder_reservation set state = 'CANCELLED', closed_at = :now,
                                                   close_reason = 'ORDER_CANCELLED', version = version + 1
                                            where order_id = :id and state = 'RESERVED'""")
                                    .param("now", core.now()).param("id", orderId).update();
                            engine.stop(orderId, "STOPPED");
                            core.closeOpenOffers(orderId, "REVOKED");
                        }
                        case "ASSIGNED" -> releaseAssignment(orderId, by + "_CANCELLED: " + reason.code());
                        default -> throw new DomainException(ErrorCode.STATE_CONFLICT,
                                "An order in " + order.status() + " cannot be cancelled this way");
                    }
                    core.cancel(order, by, reason, "OrderCancelled", actor, Map.of());
                    if (actor.type() == SubjectType.STAFF) {
                        audit.record(new AuditEntry(actor, "order.cancel", "ride_order", orderId.toString(), reason.code(),
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
    public OrderView revokeAssignment(Actor staffActor, UUID commandId, UUID orderId, long expectedVersion, String reason) {
        if (staffActor.type() != SubjectType.STAFF) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Only staff can take a driver off an order");
        }
        if (reason == null || reason.isBlank()) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "A reason is required");
        }
        UUID cityId = jdbc.sql("select city_id from ride_order where id = :id").param("id", orderId)
                .query(UUID.class).optional()
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Order not found"));
        requireStaff(staffActor, REASSIGN_PERMISSION, cityId);
        return commands.execute(new CommandKey(staffActor, "order.assignment.revoke", commandId),
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
                    audit.record(new AuditEntry(staffActor, "order.revokeAssignment", "ride_order", orderId.toString(),
                            reason, Map.of("driver_id", assignment.driverId().toString()), null));
                    core.recordEvent(orderId, core.touch(orderId), "AssignmentRevoked", staffActor, reason,
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
    public List<OrderView> inCity(Actor staffActor, UUID cityId, boolean activeOnly, OffsetDateTime before, int limit) {
        requireStaff(staffActor, VIEW_PERMISSION, cityId);
        int size = Math.max(1, Math.min(limit, 100));
        String active = activeOnly
                ? " and status in ('SCHEDULED', 'AWAITING_PAYMENT', 'READY', 'SEARCHING', 'ASSIGNED', 'IN_SERVICE')"
                : "";
        String cursor = before == null ? "" : " and created_at < :before";
        JdbcClient.StatementSpec query = jdbc.sql("select id from ride_order where city_id = :city" + active + cursor
                        + " order by created_at desc, id desc limit :limit")
                .param("city", cityId)
                .param("limit", size);
        if (before != null) {
            query = query.param("before", before);
        }
        return query.query(UUID.class).list().stream().map(core::view).toList();
    }

    @Override
    @Transactional(readOnly = true)
    public List<HistoryItem> history(Actor payer, OffsetDateTime before, int limit) {
        if (payer.type() != SubjectType.CLIENT) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Only a rider can read rider order history");
        }
        int size = Math.max(1, Math.min(limit, 50));
        String cursor = before == null ? "" : " and o.created_at < :before";
        JdbcClient.StatementSpec query = jdbc.sql("""
                        select o.id, o.short_number, o.status, o.created_at, o.pickup_label, o.dropoff_label,
                               o.vehicle_class, o.price_minor, o.final_price_minor, o.currency, o.payment_method,
                               a.id as assignment_id, a.state as assignment_state, a.close_reason,
                               o.cancelled_by, o.cancel_reason_code, o.cancel_reason_labels::text as cancel_reason_labels,
                               o.pickup_at,
                               d.name as driver_name, v.make, v.model, v.color, v.registration_number
                        from ride_order o
                        left join lateral (
                            select id, driver_id, vehicle_id, state, close_reason
                            from assignment where order_id = o.id
                            order by created_at desc, id desc limit 1
                        ) a on true
                        left join driver d on d.id = a.driver_id
                        left join vehicle v on v.id = a.vehicle_id
                        where o.payer_client_id = :payer
                        """ + cursor + " order by o.created_at desc, o.id desc limit :limit")
                .param("payer", payer.id()).param("limit", size);
        if (before != null) {
            query = query.param("before", before);
        }
        return query.query((rs, i) -> {
            UUID assignmentId = rs.getObject("assignment_id", UUID.class);
            String state = rs.getString("assignment_state");
            String closeReason = rs.getString("close_reason");
            boolean driverLeft = "REVOKED".equals(state)
                    || (closeReason != null && closeReason.startsWith("DRIVER_WITHDREW"));
            HistoryDriver driver = assignmentId == null ? null : new HistoryDriver(rs.getString("driver_name"),
                    new HistoryVehicle(rs.getString("make"), rs.getString("model"), rs.getString("color"),
                            rs.getString("registration_number")));
            return new HistoryItem(rs.getObject("id", UUID.class), rs.getLong("short_number"), rs.getString("status"),
                    rs.getObject("created_at", OffsetDateTime.class), rs.getString("pickup_label"),
                    rs.getString("dropoff_label"), rs.getString("vehicle_class"),
                    (Long) rs.getObject("price_minor"), (Long) rs.getObject("final_price_minor"),
                    rs.getString("currency"), PaymentMethod.valueOf(rs.getString("payment_method")), driver,
                    assignmentId != null && !driverLeft, cancellation(rs.getString("cancelled_by"),
                            rs.getString("cancel_reason_code"), rs.getString("cancel_reason_labels")),
                    rs.getObject("pickup_at", OffsetDateTime.class));
        }).list();
    }

    record InterruptRequest(UUID orderId, long expectedVersion, Interruption interruption) {
    }

    @Override
    public Interrupted interrupt(Actor actor, UUID commandId, UUID orderId, long expectedVersion,
                                 Interruption interruption) {
        if (interruption == null || interruption.reasonCode() == null || interruption.reasonCode().isBlank()) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "A reason is required");
        }
        if (interruption.comment() != null && interruption.comment().length() > 500) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "The comment has at most 500 characters");
        }
        record Facts(UUID cityId, String vehicleClass, GeoPoint dropoff) {
        }
        Facts facts = jdbc.sql("""
                        select city_id, vehicle_class, ST_Y(dropoff) as lat, ST_X(dropoff) as lon
                        from ride_order where id = :id""")
                .param("id", orderId)
                .query((rs, i) -> new Facts(rs.getObject("city_id", UUID.class), rs.getString("vehicle_class"),
                        new GeoPoint(rs.getDouble("lat"), rs.getDouble("lon"))))
                .optional().orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Order not found"));
        requireStaff(actor, INTERRUPT_PERMISSION, facts.cityId());
        // The follow-up's price comes from an ordinary quote, made outside the transaction like every quote and
        // keyed by the command, so a repeated command reuses it.
        QuoteService.Quote quote = null;
        GeoPoint followUpPickup = null;
        if (interruption.followUp()) {
            followUpPickup = interruption.pickup() != null ? interruption.pickup() : stopPoint(orderId)
                    .orElseThrow(() -> new DomainException(ErrorCode.VALIDATION_FAILED,
                            "The driver's position is unknown; give the follow-up pickup point"));
            VehicleClasses.VehicleClass vehicleClass = classes.active(facts.cityId(), facts.vehicleClass())
                    .orElseThrow(() -> new DomainException(ErrorCode.VALIDATION_FAILED, "The class is no longer offered"));
            quote = quotes.create(UUID.nameUUIDFromBytes(("follow-up:" + commandId).getBytes(StandardCharsets.UTF_8)),
                    new QuoteService.Request(facts.cityId(), vehicleClass.id(), followUpPickup, facts.dropoff(), actor));
        }
        QuoteService.Quote followUpQuote = quote;
        GeoPoint pickup = followUpPickup;
        return commands.execute(new CommandKey(actor, "order.interrupt", commandId),
                new InterruptRequest(orderId, expectedVersion, interruption), Interrupted.class, () -> {
                    OrderCore.LockedOrder order = core.lockOrder(orderId);
                    if (order.version() != expectedVersion) {
                        throw new DomainException(ErrorCode.VERSION_CONFLICT, "The order changed");
                    }
                    if (!"IN_SERVICE".equals(order.status())) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT,
                                "Only a trip in progress is interrupted; before the start cancel or reassign");
                    }
                    CancelReasons.Reason reason = reasons.require(CancelReasons.Audience.STAFF,
                            interruption.reasonCode().trim());
                    AssignmentView assignment = core.assignmentOfOrder(orderId)
                            .filter(a -> "COMMITTED".equals(a.state()) && "IN_PROGRESS".equals(a.tripPhase()))
                            .orElseThrow(() -> new DomainException(ErrorCode.STATE_CONFLICT, "No trip in progress"));
                    core.lockCapacity(assignment.driverId());
                    OffsetDateTime now = core.now();
                    Optional<GeoPoint> stoppedAt = stopPoint(orderId);
                    jdbc.sql("""
                                    update trip set phase = 'ABORTED', interrupted_at = :now,
                                           interrupted_at_point = case when cast(:lat as double precision) is null
                                               then null else ST_SetSRID(ST_MakePoint(cast(:lon as double precision),
                                                   cast(:lat as double precision)), 4326) end,
                                           version = version + 1
                                    where id = :id and phase = 'IN_PROGRESS'""")
                            .param("now", now).param("id", assignment.tripId())
                            .param("lat", stoppedAt.map(GeoPoint::lat).orElse(null))
                            .param("lon", stoppedAt.map(GeoPoint::lon).orElse(null))
                            .update();
                    jdbc.sql("""
                                    update assignment set state = 'RELEASED', closed_at = :now, close_reason = :reason,
                                           version = version + 1
                                    where id = :id and state = 'COMMITTED'""")
                            .param("now", now).param("reason", "INTERRUPTED: " + reason.code())
                            .param("id", assignment.id()).update();
                    core.setOccupancy(assignment.driverId(), "FREE", null);
                    UUID followUpId = interruption.followUp() ? UUID.randomUUID() : null;
                    Map<String, Object> details = new java.util.LinkedHashMap<>();
                    details.put("trip_id", assignment.tripId().toString());
                    details.put("driver_id", assignment.driverId().toString());
                    details.put("partial_fare", "FREE");
                    if (interruption.comment() != null && !interruption.comment().isBlank()) {
                        details.put("comment", interruption.comment().strip());
                    }
                    if (followUpId != null) {
                        details.put("follow_up_order_id", followUpId.toString());
                    }
                    // The rider's one active order is now the follow-up, so the interrupted one is closed first.
                    core.cancel(order, "STAFF", reason, "TripInterrupted", actor, details);
                    audit.record(new AuditEntry(actor, "order.interrupt", "ride_order", orderId.toString(),
                            reason.code(), Map.of("status", "IN_SERVICE"), Map.of("status", "CANCELLED",
                            "follow_up_order_id", followUpId == null ? "" : followUpId.toString())));
                    if (followUpId == null) {
                        return new Interrupted(core.view(orderId), null);
                    }
                    QuoteService.Quote consumed = quotes.consume(followUpQuote.id(), actor, followUpQuote.fingerprint());
                    jdbc.sql("""
                                    insert into ride_order (id, channel, payer_client_id, created_by_type, created_by_id,
                                                            city_id, vehicle_class, pickup, pickup_label, dropoff,
                                                            dropoff_label, payment_method, price_minor, currency,
                                                            quote_id, source_ref, status, related_order_id,
                                                            created_at, updated_at)
                                    select :id, channel, payer_client_id, 'STAFF', :staff, city_id, vehicle_class,
                                           ST_SetSRID(ST_MakePoint(:lon, :lat), 4326), :label, dropoff, dropoff_label,
                                           'SERVICE', :price, :currency, :quote, source_ref, 'READY', id, :now, :now
                                    from ride_order where id = :original""")
                            .param("id", followUpId).param("staff", actor.id())
                            .param("lon", pickup.lon()).param("lat", pickup.lat())
                            .param("label", interruption.pickupLabel() == null || interruption.pickupLabel().isBlank()
                                    ? "Where the previous car stopped" : label(interruption.pickupLabel()))
                            .param("price", consumed.amountMinor()).param("currency", consumed.currency())
                            .param("quote", consumed.id()).param("now", now).param("original", orderId).update();
                    jdbc.sql("""
                                    insert into order_contact (order_id, name, phone, created_by, created_at)
                                    select :id, name, phone, :staff, :now from order_contact where order_id = :original""")
                            .param("id", followUpId).param("staff", actor.id()).param("now", now)
                            .param("original", orderId).update();
                    core.recordEvent(followUpId, 0, "OrderCreated", actor, null, Map.of(
                            "related_order_id", orderId.toString(), "payment_method", "SERVICE",
                            "quote_id", consumed.id().toString(), "price_minor", consumed.amountMinor()));
                    engine.startSearch(core.lockOrder(followUpId));
                    return new Interrupted(core.view(orderId), core.view(followUpId));
                });
    }

    /** Where the car of the order's active assignment is now: its driver's open work session. */
    private Optional<GeoPoint> stopPoint(UUID orderId) {
        return jdbc.sql("""
                        select ST_Y(ws.last_location) as lat, ST_X(ws.last_location) as lon
                        from assignment a join work_session ws on ws.driver_id = a.driver_id
                        where a.order_id = :id and ws.state <> 'CLOSED' and ws.last_location is not null
                        order by a.created_at desc, ws.opened_at desc limit 1""")
                .param("id", orderId)
                .query((rs, i) -> new GeoPoint(rs.getDouble("lat"), rs.getDouble("lon")))
                .optional();
    }

    @SuppressWarnings("unchecked")
    private OrderView.Cancellation cancellation(String by, String code, String labels) {
        return by == null ? null
                : new OrderView.Cancellation(by, code, labels == null ? Map.of() : json.readValue(labels, Map.class));
    }

    @Override
    @Transactional(readOnly = true)
    public List<TimelineEntry> timeline(Actor actor, UUID orderId) {
        UUID cityId = jdbc.sql("select city_id from ride_order where id = :id").param("id", orderId)
                .query(UUID.class).optional()
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Order not found"));
        requireStaff(actor, VIEW_PERMISSION, cityId);
        record Row(long sequence, String type, String actorType, UUID actorId, String reason, String payload,
                   OffsetDateTime occurredAt) {
        }
        List<Row> rows = jdbc.sql("""
                        select sequence, type, actor_type, actor_id, reason, payload::text as payload, occurred_at
                        from order_event where order_id = :id order by sequence""")
                .param("id", orderId)
                .query((rs, i) -> new Row(rs.getLong("sequence"), rs.getString("type"), rs.getString("actor_type"),
                        rs.getObject("actor_id", UUID.class), rs.getString("reason"), rs.getString("payload"),
                        rs.getObject("occurred_at", OffsetDateTime.class)))
                .list();
        java.util.Set<UUID> staffIds = new java.util.HashSet<>();
        java.util.Set<UUID> driverIds = new java.util.HashSet<>();
        for (Row row : rows) {
            if (row.actorId() != null && "STAFF".equals(row.actorType())) {
                staffIds.add(row.actorId());
            } else if (row.actorId() != null && "DRIVER".equals(row.actorType())) {
                driverIds.add(row.actorId());
            }
        }
        Map<UUID, StaffDirectory.Name> staffNames = directory.names(staffIds);
        Map<UUID, String> driverNames = new java.util.HashMap<>();
        if (!driverIds.isEmpty()) {
            jdbc.sql("select id, name from driver where id = any(:ids)").param("ids", driverIds.toArray(UUID[]::new))
                    .query((rs, i) -> driverNames.put(rs.getObject("id", UUID.class), rs.getString("name"))).list();
        }
        return rows.stream().map(row -> {
            String name = null;
            String role = null;
            if ("STAFF".equals(row.actorType()) && staffNames.containsKey(row.actorId())) {
                StaffDirectory.Name staffName = staffNames.get(row.actorId());
                name = (staffName.firstName() + " " + staffName.lastName()).strip();
                role = staffName.role().name();
            } else if ("DRIVER".equals(row.actorType())) {
                name = driverNames.get(row.actorId());
            }
            @SuppressWarnings("unchecked")
            Map<String, Object> payload = row.payload() == null ? Map.of() : json.readValue(row.payload(), Map.class);
            return new TimelineEntry(row.sequence(), row.type(), row.occurredAt(),
                    new TimelineActor(row.actorType(), row.actorId(), name, role), row.reason(), payload);
        }).toList();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Participants> participants(UUID orderId) {
        return jdbc.sql("""
                        select o.payer_client_id,
                               (select a.driver_id from assignment a where a.order_id = o.id
                                order by a.created_at desc limit 1) as driver_id
                        from ride_order o where o.id = :id""")
                .param("id", orderId)
                .query((rs, i) -> new Participants(rs.getObject(1, UUID.class), rs.getObject(2, UUID.class)))
                .optional();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<OrderView> active(UUID payerClientId) {
        return jdbc.sql("""
                        select id from ride_order where payer_client_id = :payer
                          and status in ('AWAITING_PAYMENT', 'READY', 'SEARCHING', 'ASSIGNED', 'IN_SERVICE')
                        order by preorder, coalesce(pickup_at, created_at) limit 1""")
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
