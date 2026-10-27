package taxi.blizz.operations.internal;

import java.sql.ResultSet;
import java.sql.SQLException;
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
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.operations.AssignmentView;
import taxi.blizz.operations.DriverAvailability;
import taxi.blizz.operations.OrderView;
import taxi.blizz.operations.Orders;
import taxi.blizz.operations.PaymentMethod;
import taxi.blizz.operations.Preorders;
import taxi.blizz.operations.WorkSessions;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;

/** Reservations of pre-orders by drivers (ADR 0006). Locks: order → driver capacity → reservation. */
@Service
class JdbcPreorders implements Preorders {

    private static final String ORDER_COLUMNS = """
            o.id, o.short_number, o.pickup_at, o.vehicle_class, ST_Y(o.pickup) as pickup_lat, ST_X(o.pickup) as pickup_lon,
            o.pickup_label, o.dropoff_label, o.price_minor, o.currency, o.payment_method""";

    private final JdbcClient jdbc;
    private final IdempotentCommands commands;
    private final OrderCore core;
    private final AssignmentCommitter committer;
    private final WorkSessions sessions;
    private final ServiceSettings settings;
    private final CancelReasons reasons;
    private final StaffAccess staff;
    private final AuditLog audit;

    JdbcPreorders(JdbcClient jdbc, IdempotentCommands commands, OrderCore core, AssignmentCommitter committer,
                  WorkSessions sessions, ServiceSettings settings, CancelReasons reasons, StaffAccess staff,
                  AuditLog audit) {
        this.jdbc = jdbc;
        this.commands = commands;
        this.core = core;
        this.committer = committer;
        this.sessions = sessions;
        this.settings = settings;
        this.reasons = reasons;
        this.staff = staff;
        this.audit = audit;
    }

    // ---------------------------------------------------------------- reads

    @Override
    @Transactional(readOnly = true)
    public List<Available> available(Actor driver) {
        requireDriver(driver);
        if (rules().dispatch() != ServiceSettings.PreorderDispatch.RESERVATION) {
            return List.of();
        }
        DriverAvailability availability = mayReserve(driver);
        return jdbc.sql("select " + ORDER_COLUMNS + """
                         from ride_order o
                        where o.status = 'SCHEDULED' and o.city_id = :city and o.pickup_at > :now
                          and exists (select 1 from vehicle v
                                      where v.id = :vehicle and o.vehicle_class = any(v.class_approvals))
                          and (o.payment_method <> 'TERMINAL'
                               or exists (select 1 from driver d where d.id = :driver and d.has_payment_terminal))
                          and not exists (select 1 from preorder_reservation r
                                          where r.order_id = o.id and r.state = 'RESERVED')
                          and not exists (select 1 from preorder_reservation r
                                          where r.order_id = o.id and r.driver_id = :driver)
                        order by o.pickup_at limit 50""")
                .param("city", availability.cityId()).param("vehicle", availability.vehicleId())
                .param("driver", driver.id()).param("now", core.now())
                .query((rs, i) -> available(rs)).list();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Reservation> mine(Actor driver) {
        requireDriver(driver);
        return jdbc.sql("select r.id as reservation_id, r.state, r.reserved_at, " + ORDER_COLUMNS + """
                         from preorder_reservation r join ride_order o on o.id = r.order_id
                        where r.driver_id = :driver and r.state = 'RESERVED'
                        order by o.pickup_at""")
                .param("driver", driver.id())
                .query((rs, i) -> reservation(rs)).list();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Holder> holder(UUID orderId) {
        return jdbc.sql("""
                        select r.id, r.driver_id, d.name, r.reserved_at
                        from preorder_reservation r join driver d on d.id = r.driver_id
                        where r.order_id = :order and r.state = 'RESERVED'""")
                .param("order", orderId)
                .query((rs, i) -> new Holder(rs.getObject(1, UUID.class), rs.getObject(2, UUID.class), rs.getString(3),
                        rs.getObject(4, OffsetDateTime.class)))
                .optional();
    }

    // ---------------------------------------------------------------- driver commands

    record OrderRequest(UUID orderId) {
    }

    @Override
    public Reservation reserve(Actor driver, UUID commandId, UUID orderId) {
        requireDriver(driver);
        return commands.execute(new CommandKey(driver, "preorder.reserve", commandId), new OrderRequest(orderId),
                Reservation.class, () -> {
                    if (rules().dispatch() != ServiceSettings.PreorderDispatch.RESERVATION) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT,
                                "Pre-orders are released into the search, not reserved");
                    }
                    OrderCore.LockedOrder order = core.lockOrder(orderId);
                    core.lockCapacity(driver.id());
                    DriverAvailability availability = mayReserve(driver);
                    if (!"SCHEDULED".equals(order.status())) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT, "The order is not waiting for its time");
                    }
                    boolean fits = jdbc.sql("""
                                    select count(*) from vehicle v, ride_order o
                                    where v.id = :vehicle and o.id = :order and o.vehicle_class = any(v.class_approvals)
                                      and o.city_id = :city and o.pickup_at > :now
                                      and (o.payment_method <> 'TERMINAL' or exists (
                                            select 1 from driver d where d.id = :driver and d.has_payment_terminal))""")
                            .param("driver", driver.id())
                            .param("vehicle", availability.vehicleId()).param("order", orderId)
                            .param("city", availability.cityId()).param("now", core.now())
                            .query(Integer.class).single() == 1;
                    if (!fits) {
                        throw new DomainException(ErrorCode.DRIVER_NOT_ELIGIBLE,
                                "Class, city, time or payment terminal does not match");
                    }
                    long earlier = jdbc.sql("""
                                    select count(*) from preorder_reservation where order_id = :order and driver_id = :driver""")
                            .param("order", orderId).param("driver", driver.id()).query(Long.class).single();
                    if (earlier > 0) {
                        throw new DomainException(ErrorCode.DRIVER_NOT_ELIGIBLE, "This driver already held this order");
                    }
                    long held = jdbc.sql("""
                                    select count(*) from preorder_reservation where driver_id = :driver and state = 'RESERVED'""")
                            .param("driver", driver.id()).query(Long.class).single();
                    if (held >= MAX_RESERVATIONS_PER_DRIVER) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT,
                                "At most " + MAX_RESERVATIONS_PER_DRIVER + " reservations at a time");
                    }
                    UUID id = UUID.randomUUID();
                    try {
                        jdbc.sql("""
                                        insert into preorder_reservation (id, order_id, driver_id, state, reserved_at)
                                        values (:id, :order, :driver, 'RESERVED', :now)""")
                                .param("id", id).param("order", orderId).param("driver", driver.id())
                                .param("now", core.now()).update();
                    } catch (DuplicateKeyException e) {
                        throw new DomainException(ErrorCode.ORDER_ALREADY_ASSIGNED, "Another driver reserved the order");
                    }
                    event(orderId, "PreorderReserved", driver, null, Map.of("reservation_id", id.toString(),
                            "driver_id", driver.id().toString()));
                    return read(id);
                });
    }

    record DropRequest(UUID reservationId, String reasonCode) {
    }

    @Override
    public Reservation drop(Actor driver, UUID commandId, UUID reservationId, String reasonCode) {
        requireDriver(driver);
        if (reasonCode == null || reasonCode.isBlank()) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "A reason is required");
        }
        return commands.execute(new CommandKey(driver, "preorder.drop", commandId),
                new DropRequest(reservationId, reasonCode), Reservation.class, () -> {
                    CancelReasons.Reason reason = reasons.require(CancelReasons.Audience.DRIVER, reasonCode.trim());
                    Locked r = lock(reservationId, driver);
                    OffsetDateTime dropUntil = r.pickupAt().minusMinutes(rules().driverCancelUntilMinutesBefore());
                    if (!core.now().isBefore(dropUntil)) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT,
                                "Too close to the pickup; only a dispatcher can take the order off you now");
                    }
                    close(r, "DROPPED", reason.code());
                    event(r.orderId(), "PreorderReservationDropped", driver, reason.code(), Map.of(
                            "reservation_id", reservationId.toString(), "driver_id", driver.id().toString(),
                            "reason_code", reason.code(), "reason_labels", reason.labels()));
                    return read(reservationId);
                });
    }

    record ConfirmRequest(UUID reservationId) {
    }

    @Override
    public AssignmentView confirm(Actor driver, UUID commandId, UUID reservationId) {
        requireDriver(driver);
        return commands.execute(new CommandKey(driver, "preorder.confirm", commandId),
                new ConfirmRequest(reservationId), AssignmentView.class, () -> {
                    Locked r = lock(reservationId, driver);
                    ServiceSettings.Preorders rules = rules();
                    OffsetDateTime now = core.now();
                    if (now.isBefore(confirmFrom(r.pickupAt(), rules))) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT,
                                "\"On my way\" opens " + rules.confirmMinutesBefore() + " minutes before the pickup");
                    }
                    if (!now.isBefore(confirmUntil(r.pickupAt(), rules))) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT, "The confirmation time is over");
                    }
                    if (!"SCHEDULED".equals(r.order().status())) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT, "The order is not waiting for its time");
                    }
                    if (!"FREE".equals(r.capacity().occupancy())) {
                        throw new DomainException(ErrorCode.DRIVER_BUSY, "Finish the current order first");
                    }
                    DriverAvailability availability = sessions.availability(driver.id());
                    if (!availability.ineligibleReasons().isEmpty()) {
                        throw new DomainException(ErrorCode.DRIVER_NOT_ELIGIBLE,
                                String.join(", ", availability.ineligibleReasons()));
                    }
                    close(r, "CONFIRMED", null);
                    return committer.commit(r.order(), driver, availability.vehicleId(), "RESERVATION", null);
                });
    }

    // ---------------------------------------------------------------- dispatcher

    record RemoveRequest(UUID orderId, String reason) {
    }

    @Override
    public OrderView removeReservation(Actor actor, UUID commandId, UUID orderId, String reason) {
        if (reason == null || reason.isBlank()) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "A reason is required");
        }
        UUID cityId = jdbc.sql("select city_id from ride_order where id = :id").param("id", orderId)
                .query(UUID.class).optional()
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Order not found"));
        staff.require(actor, Orders.REASSIGN_PERMISSION, cityId);
        return commands.execute(new CommandKey(actor, "preorder.remove_reservation", commandId),
                new RemoveRequest(orderId, reason), OrderView.class, () -> {
                    core.lockOrder(orderId);
                    UUID reservationId = jdbc.sql("""
                                    select id from preorder_reservation
                                    where order_id = :order and state = 'RESERVED' for update""")
                            .param("order", orderId).query(UUID.class).optional()
                            .orElseThrow(() -> new DomainException(ErrorCode.STATE_CONFLICT, "Nobody holds this order"));
                    UUID driverId = jdbc.sql("select driver_id from preorder_reservation where id = :id")
                            .param("id", reservationId).query(UUID.class).single();
                    jdbc.sql("""
                                    update preorder_reservation set state = 'REMOVED', closed_at = :now,
                                           close_reason = :reason, version = version + 1
                                    where id = :id""")
                            .param("now", core.now()).param("reason", reason.strip()).param("id", reservationId).update();
                    event(orderId, "PreorderReservationRemoved", actor, reason.strip(), Map.of(
                            "reservation_id", reservationId.toString(), "driver_id", driverId.toString()));
                    audit.record(new AuditEntry(actor, "preorder.remove_reservation", "ride_order", orderId.toString(),
                            reason.strip(), Map.of("driver_id", driverId.toString()), Map.of()));
                    return core.view(orderId);
                });
    }

    // ---------------------------------------------------------------- helpers

    static OffsetDateTime confirmFrom(OffsetDateTime pickupAt, ServiceSettings.Preorders rules) {
        return pickupAt.minusMinutes(rules.confirmMinutesBefore());
    }

    static OffsetDateTime confirmUntil(OffsetDateTime pickupAt, ServiceSettings.Preorders rules) {
        return confirmFrom(pickupAt, rules).plusMinutes(rules.confirmWindowMinutes());
    }

    private record Locked(UUID id, UUID orderId, OffsetDateTime pickupAt, OrderCore.LockedOrder order,
                          OrderCore.Capacity capacity) {
    }

    /** order → capacity → reservation; only the driver's own open reservation. */
    private Locked lock(UUID reservationId, Actor driver) {
        UUID orderId = jdbc.sql("select order_id from preorder_reservation where id = :id and driver_id = :driver")
                .param("id", reservationId).param("driver", driver.id()).query(UUID.class).optional()
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Reservation not found"));
        OrderCore.LockedOrder order = core.lockOrder(orderId);
        OrderCore.Capacity capacity = core.lockCapacity(driver.id());
        String state = jdbc.sql("select state from preorder_reservation where id = :id for update")
                .param("id", reservationId).query(String.class).single();
        if (!"RESERVED".equals(state)) {
            throw new DomainException(ErrorCode.STATE_CONFLICT, "The reservation is no longer open");
        }
        OffsetDateTime pickupAt = jdbc.sql("select pickup_at from ride_order where id = :id").param("id", orderId)
                .query(OffsetDateTime.class).single();
        return new Locked(reservationId, orderId, pickupAt, order, capacity);
    }

    private void close(Locked r, String state, String reason) {
        jdbc.sql("""
                        update preorder_reservation set state = :state, closed_at = :now, close_reason = :reason,
                               version = version + 1
                        where id = :id""")
                .param("state", state).param("now", core.now()).param("reason", reason).param("id", r.id()).update();
    }

    private void event(UUID orderId, String type, Actor actor, String reason, Map<String, Object> payload) {
        core.recordEvent(orderId, core.touch(orderId), type, actor, reason, payload);
    }

    /** Online with an approved vehicle and an account in order; busy with another ride or paused is fine. */
    private DriverAvailability mayReserve(Actor driver) {
        DriverAvailability availability = sessions.availability(driver.id());
        List<String> blocking = availability.ineligibleReasons().stream()
                .filter(r -> !r.startsWith("OCCUPANCY_") && !r.startsWith("INTENT_") && !r.startsWith("CONNECTION_")
                        && !r.startsWith("LOCATION_"))
                .toList();
        if (!blocking.isEmpty() || availability.cityId() == null || availability.vehicleId() == null) {
            throw new DomainException(ErrorCode.DRIVER_NOT_ELIGIBLE,
                    blocking.isEmpty() ? "Open a work session first" : String.join(", ", blocking));
        }
        return availability;
    }

    private ServiceSettings.Preorders rules() {
        return settings.current().settings().preorders();
    }

    private Reservation read(UUID reservationId) {
        return jdbc.sql("select r.id as reservation_id, r.state, r.reserved_at, " + ORDER_COLUMNS + """
                         from preorder_reservation r join ride_order o on o.id = r.order_id
                        where r.id = :id""")
                .param("id", reservationId).query((rs, i) -> reservation(rs)).single();
    }

    private Reservation reservation(ResultSet rs) throws SQLException {
        Available order = available(rs);
        ServiceSettings.Preorders rules = rules();
        return new Reservation(rs.getObject("reservation_id", UUID.class), rs.getString("state"), order,
                rs.getObject("reserved_at", OffsetDateTime.class), confirmFrom(order.pickupAt(), rules),
                confirmUntil(order.pickupAt(), rules),
                order.pickupAt().minusMinutes(rules.driverCancelUntilMinutesBefore()));
    }

    private static Available available(ResultSet rs) throws SQLException {
        return new Available(rs.getObject("id", UUID.class), rs.getLong("short_number"),
                rs.getObject("pickup_at", OffsetDateTime.class), rs.getString("vehicle_class"),
                new GeoPoint(rs.getDouble("pickup_lat"), rs.getDouble("pickup_lon")), rs.getString("pickup_label"),
                rs.getString("dropoff_label"), (Long) rs.getObject("price_minor"), rs.getString("currency"),
                PaymentMethod.valueOf(rs.getString("payment_method")));
    }

    private static void requireDriver(Actor actor) {
        if (!OrderCore.isDriver(actor)) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Only drivers can do this");
        }
    }
}
