package taxi.blizz.operations.internal;

import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.configuration.CancelReasons;
import taxi.blizz.configuration.ServiceSettings;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.operations.PaymentMethod;
import taxi.blizz.operations.TripView;
import taxi.blizz.operations.Trips;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.ConflictException;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;
import taxi.blizz.platform.PageCursor;
import taxi.blizz.pricing.FinalFares;

/**
 * Trip phase commands. Each locks the order, then the driver's capacity, then the trip, checks that
 * the caller is the driver of the active assignment and the expected trip version, and records the
 * server time of every fact (REQ-ASG-07: one source of time for everybody).
 */
@Service
class JdbcTrips implements Trips {

    private final JdbcClient jdbc;
    private final ServiceSettings settings;
    private final IdempotentCommands commands;
    private final OrderCore core;
    private final DispatchEngine engine;
    private final FinalFares fares;
    private final DispatchProperties properties;
    private final PresenceProperties presence;
    private final CancelReasons reasons;

    JdbcTrips(JdbcClient jdbc, IdempotentCommands commands, OrderCore core, DispatchEngine engine,
              DispatchProperties properties, PresenceProperties presence, FinalFares fares, CancelReasons reasons,
              ServiceSettings settings) {
        this.settings = settings;
        this.reasons = reasons;
        this.fares = fares;
        this.jdbc = jdbc;
        this.commands = commands;
        this.core = core;
        this.engine = engine;
        this.properties = properties;
        this.presence = presence;
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<TripView> current(Actor driver) {
        requireDriver(driver);
        return jdbc.sql("""
                        select t.id from trip t join assignment a on a.id = t.assignment_id
                        where a.driver_id = :driver and a.state = 'COMMITTED'
                          and t.phase in ('TO_PICKUP', 'WAITING', 'IN_PROGRESS')""")
                .param("driver", driver.id())
                .query(UUID.class)
                .optional()
                .map(this::view);
    }

    @Override
    @Transactional(readOnly = true)
    public List<HistoryItem> history(Actor driver, PageCursor after, int limit) {
        requireDriver(driver);
        int size = Math.max(1, Math.min(limit, PageCursor.MAX_FETCH));
        String cursor = after == null ? "" : " and t.created_at < :afterAt";
        JdbcClient.StatementSpec query = jdbc.sql("""
                        select t.id, t.order_id, o.short_number, t.created_at, o.pickup_label, o.dropoff_label,
                               o.final_price_minor, o.currency, o.payment_method, t.phase
                        from trip t
                        join assignment a on a.id = t.assignment_id
                        join ride_order o on o.id = t.order_id
                        where a.driver_id = :driver and t.phase in ('COMPLETED', 'ABORTED')
                        """ + cursor + " order by t.created_at desc, t.id desc limit :limit")
                .param("driver", driver.id()).param("limit", size);
        if (after != null) {
            query = query.param("afterAt", after.time(0));
        }
        return query.query((rs, i) -> new HistoryItem(rs.getObject("id", UUID.class),
                        rs.getObject("order_id", UUID.class), rs.getLong("short_number"),
                        rs.getObject("created_at", OffsetDateTime.class), rs.getString("pickup_label"),
                        rs.getString("dropoff_label"), (Long) rs.getObject("final_price_minor"),
                        rs.getString("currency"), PaymentMethod.valueOf(rs.getString("payment_method")),
                        rs.getString("phase")))
                .list();
    }

    record PhaseRequest(UUID tripId, long expectedVersion, String exceptionReason) {
    }

    @Override
    public TripView arrive(Actor driver, UUID commandId, UUID tripId, long expectedVersion, String exceptionReason) {
        requireDriver(driver);
        return commands.execute(new CommandKey(driver, "trip.arrive", commandId),
                new PhaseRequest(tripId, expectedVersion, exceptionReason), TripView.class, () -> {
                    Locked trip = lock(driver, tripId, expectedVersion);
                    if (!"TO_PICKUP".equals(trip.phase())) {
                        throw ConflictException.state(expectedVersion, "Arrival is only possible on the way to the pickup");
                    }
                    Arrival check = arrivalCheck(driver, trip.orderId());
                    String exception = blankToNull(exceptionReason);
                    if (exception == null && check.problem() != null) {
                        throw new DomainException(check.problem(), check.message());
                    }
                    OffsetDateTime now = core.now();
                    jdbc.sql("""
                                    update trip set phase = 'WAITING', arrived_at = :now, arrival_distance_m = :distance,
                                                    arrival_exception = :exception,
                                                    needs_review = needs_review or :review, version = version + 1
                                    where id = :id""")
                            .param("now", now)
                            .param("distance", check.distanceM())
                            .param("exception", exception)
                            .param("review", exception != null)
                            .param("id", tripId)
                            .update();
                    core.setOccupancy(driver.id(), "WAITING", trip.assignmentId());
                    event(trip, "DriverArrived", driver, exception, Map.<String, Object>of("distance_m",
                            check.distanceM() == null ? "unknown" : check.distanceM()));
                    return view(tripId);
                });
    }

    @Override
    public TripView start(Actor driver, UUID commandId, UUID tripId, long expectedVersion, String exceptionReason) {
        requireDriver(driver);
        return commands.execute(new CommandKey(driver, "trip.start", commandId),
                new PhaseRequest(tripId, expectedVersion, exceptionReason), TripView.class, () -> {
                    Locked trip = lock(driver, tripId, expectedVersion);
                    String exception = blankToNull(exceptionReason);
                    if ("TO_PICKUP".equals(trip.phase())) {
                        if (exception == null) {
                            throw ConflictException.state(expectedVersion,
                                    "Confirm the arrival first, or start with an exception reason");
                        }
                    } else if (!"WAITING".equals(trip.phase())) {
                        throw ConflictException.state(expectedVersion, "The trip cannot start now");
                    }
                    OffsetDateTime now = core.now();
                    jdbc.sql("""
                                    update trip set phase = 'IN_PROGRESS', started_at = :now,
                                                    arrived_at = coalesce(arrived_at, :now), start_exception = :exception,
                                                    needs_review = needs_review or :review, version = version + 1
                                    where id = :id""")
                            .param("now", now)
                            .param("exception", exception)
                            .param("review", exception != null)
                            .param("id", tripId)
                            .update();
                    core.setOccupancy(driver.id(), "ON_TRIP", trip.assignmentId());
                    core.changeStatus(trip.order(), "IN_SERVICE", null, "TripStarted", driver,
                            exception == null ? Map.<String, Object>of("trip_id", tripId.toString())
                                    : Map.<String, Object>of("trip_id", tripId.toString(), "exception", exception));
                    return view(tripId);
                });
    }

    @Override
    public TripView withdraw(Actor driver, UUID commandId, UUID tripId, long expectedVersion, String reason) {
        requireDriver(driver);
        String why = blankToNull(reason);
        if (why == null) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "A reason is required");
        }
        return commands.execute(new CommandKey(driver, "trip.withdraw", commandId),
                new PhaseRequest(tripId, expectedVersion, why), TripView.class, () -> {
                    Locked trip = lock(driver, tripId, expectedVersion);
                    giveUp(trip, driver, why, Map.<String, Object>of());
                    return view(tripId);
                });
    }

    /** The driver drops the order before the start; it goes back to the search with the remaining budget. */
    private void giveUp(Locked trip, Actor driver, String why, Map<String, Object> details) {
        taxi.blizz.operations.AssignmentView assignment = core.assignmentOfOrder(trip.orderId()).orElseThrow();
        core.endAssignmentBeforeStart(assignment, "RELEASED", "DRIVER_WITHDREW: " + why);
        Map<String, Object> payload = new LinkedHashMap<>(details);
        payload.put("driver_id", driver.id().toString());
        event(trip, "AssignmentWithdrawn", driver, why, payload);
        engine.resumeSearch(core.lockOrder(trip.orderId()));
    }

    @Override
    public TripView cancel(Actor driver, UUID commandId, UUID tripId, long expectedVersion, String reasonCode) {
        requireDriver(driver);
        String code = blankToNull(reasonCode);
        if (code == null) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "A reason is required");
        }
        return commands.execute(new CommandKey(driver, "trip.cancel", commandId),
                new PhaseRequest(tripId, expectedVersion, code), TripView.class, () -> {
                    CancelReasons.Reason reason = reasons.require(CancelReasons.Audience.DRIVER, code);
                    Locked trip = lock(driver, tripId, expectedVersion);
                    if (CancelReasons.NO_SHOW.equals(reason.code())) {
                        noShow(trip, driver, reason);
                    } else if (reason.driverOutcome() == CancelReasons.DriverOutcome.RETURN_TO_SEARCH) {
                        giveUp(trip, driver, reason.code(), Map.of("reason_code", reason.code(),
                                "reason_labels", reason.labels()));
                    } else {
                        if (!"TO_PICKUP".equals(trip.phase()) && !"WAITING".equals(trip.phase())) {
                            throw new DomainException(ErrorCode.STATE_CONFLICT,
                                    "Only an order the trip has not started for can be cancelled");
                        }
                        taxi.blizz.operations.AssignmentView assignment =
                                core.assignmentOfOrder(trip.orderId()).orElseThrow();
                        core.endAssignmentBeforeStart(assignment, "RELEASED", "DRIVER_CANCELLED: " + reason.code());
                        core.cancel(trip.order(), "DRIVER", reason, "OrderCancelled", driver,
                                Map.of("trip_id", tripId.toString()));
                    }
                    return view(tripId);
                });
    }

    @Override
    public TripView reportNoShow(Actor driver, UUID commandId, UUID tripId, long expectedVersion) {
        requireDriver(driver);
        return commands.execute(new CommandKey(driver, "trip.no_show", commandId),
                new PhaseRequest(tripId, expectedVersion, null), TripView.class, () -> {
                    Locked trip = lock(driver, tripId, expectedVersion);
                    // The no-show is a driver's cancellation with the NO_SHOW reason, even if the admin hid it from
                    // the list: the waiting rule, not the list, decides when it is allowed.
                    noShow(trip, driver, reasons.find(CancelReasons.Audience.DRIVER, CancelReasons.NO_SHOW)
                            .orElse(new CancelReasons.Reason(null, CancelReasons.Audience.DRIVER, CancelReasons.NO_SHOW,
                                    Map.of(), CancelReasons.DriverOutcome.CANCEL_ORDER, false, 0, 0)));
                    return view(tripId);
                });
    }

    private void noShow(Locked trip, Actor driver, CancelReasons.Reason reason) {
        if (!"WAITING".equals(trip.phase())) {
            throw new DomainException(ErrorCode.STATE_CONFLICT, "A no-show needs a confirmed arrival");
        }
        OffsetDateTime arrivedAt = jdbc.sql("select arrived_at from trip where id = :id")
                .param("id", trip.id()).query(OffsetDateTime.class).single();
        Duration waited = Duration.between(arrivedAt, core.now());
        if (waited.compareTo(properties.noShowMinimumWait()) < 0) {
            throw new DomainException(ErrorCode.STATE_CONFLICT, "Wait at least "
                    + properties.noShowMinimumWait().toMinutes() + " minutes before reporting a no-show");
        }
        taxi.blizz.operations.AssignmentView assignment = core.assignmentOfOrder(trip.orderId()).orElseThrow();
        core.endAssignmentBeforeStart(assignment, "RELEASED", "NO_SHOW");
        core.cancel(trip.order(), "DRIVER", reason, "PassengerNoShow", driver,
                Map.<String, Object>of("trip_id", trip.id().toString(), "waited_seconds", waited.toSeconds()));
    }

    record CompleteRequest(UUID tripId, long expectedVersion, OffsetDateTime reportedAt, Boolean cashReceived) {
    }

    @Override
    public TripView complete(Actor driver, UUID commandId, UUID tripId, long expectedVersion,
                             OffsetDateTime reportedAt, Boolean cashReceived) {
        requireDriver(driver);
        if (reportedAt == null) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "The device time of completion is required");
        }
        return commands.execute(new CommandKey(driver, "trip.complete", commandId),
                new CompleteRequest(tripId, expectedVersion, reportedAt, cashReceived), TripView.class, () -> {
                    Locked trip = lock(driver, tripId, expectedVersion);
                    if (!"IN_PROGRESS".equals(trip.phase())) {
                        throw ConflictException.state(expectedVersion, "Only a started trip can be completed");
                    }
                    record OrderFacts(PaymentMethod payment, UUID quoteId, UUID payerClientId) {
                    }
                    OrderFacts facts = jdbc.sql("select payment_method, quote_id, payer_client_id from ride_order where id = :id")
                            .param("id", trip.orderId())
                            .query((rs, i) -> new OrderFacts(PaymentMethod.valueOf(rs.getString(1)),
                                    rs.getObject(2, UUID.class), rs.getObject(3, UUID.class)))
                            .single();
                    PaymentMethod payment = facts.payment();
                    // At the driver's own terminal the money reaches the driver just like cash (owner decision 27.10.2026).
                    boolean collectedByDriver = payment == PaymentMethod.CASH || payment == PaymentMethod.TERMINAL;
                    if (collectedByDriver && cashReceived == null) {
                        throw new DomainException(ErrorCode.VALIDATION_FAILED, payment == PaymentMethod.CASH
                                ? "State whether the cash was received" : "State whether the terminal payment went through");
                    }
                    OffsetDateTime now = core.now();
                    boolean suspiciousTime = Duration.between(reportedAt, now).abs()
                            .compareTo(properties.reportedTimeTolerance()) > 0;
                    jdbc.sql("""
                                    update trip set phase = 'COMPLETED', completed_at = :now,
                                                    completion_reported_at = :reported,
                                                    needs_review = needs_review or :review, version = version + 1
                                    where id = :id""")
                            .param("now", now)
                            .param("reported", reportedAt)
                            .param("review", suspiciousTime)
                            .param("id", tripId)
                            .update();
                    jdbc.sql("""
                                    update assignment set state = 'COMPLETED', closed_at = :now, version = version + 1
                                    where id = :id""")
                            .param("now", now)
                            .param("id", trip.assignmentId())
                            .update();
                    if (collectedByDriver) {
                        String prefix = payment == PaymentMethod.CASH ? "CASH" : "TERMINAL";
                        jdbc.sql("update ride_order set payment_state = :state where id = :id")
                                .param("state", prefix + (Boolean.TRUE.equals(cashReceived) ? "_REPORTED" : "_NOT_RECEIVED"))
                                .param("id", trip.orderId())
                                .update();
                    } else if (payment == PaymentMethod.CARD) {
                        // The driver is free now; the bank takes the money afterwards (REQ-PAY-04).
                        jdbc.sql("update ride_order set payment_state = 'CAPTURE_PENDING' where id = :id")
                                .param("id", trip.orderId()).update();
                    }
                    // The fare is fixed together with the fact of completion; posting follows from the event (REQ-LED-05).
                    // Waiting is charged only after an arrival that passed the normal check; an arrival or start
                    // confirmed with an exception goes to review instead of an automatic surcharge (REQ-PRC-08).
                    long waited = jdbc.sql("""
                                    select case when arrival_exception is null and start_exception is null
                                                then coalesce(floor(extract(epoch from started_at - arrived_at)), 0)
                                                else 0 end::bigint
                                    from trip where id = :id""")
                            .param("id", tripId).query(Long.class).single();
                    FinalFares.FinalFare fare = fares.finalizeFare(
                            new FinalFares.Facts(trip.orderId(), facts.quoteId(), Math.max(0, waited)));
                    jdbc.sql("update ride_order set final_fare_id = :fare, final_price_minor = :price where id = :id")
                            .param("fare", fare.id())
                            .param("price", fare.amountMinor())
                            .param("id", trip.orderId())
                            .update();
                    // Free in the same transaction as the fact of completion (REQ-ASG-04, REQ-PAY-04).
                    core.releaseDriver(driver.id());
                    Map<String, Object> payload = new LinkedHashMap<>();
                    payload.put("trip_id", tripId.toString());
                    payload.put("payment_method", payment.name());
                    if (collectedByDriver) {
                        payload.put("cash_received", cashReceived); // for TERMINAL: the card payment went through
                    }
                    payload.put("reported_at", reportedAt.toString());
                    // Any reason: an arrival or start with an exception earlier, or the completion time now.
                    payload.put("needs_review", jdbc.sql("select needs_review from trip where id = :id")
                            .param("id", tripId).query(Boolean.class).single());
                    payload.put("driver_id", driver.id().toString());
                    payload.put("payer_client_id", facts.payerClientId() == null ? null : facts.payerClientId().toString());
                    payload.put("final_fare_id", fare.id().toString());
                    payload.put("final_fare_version", fare.version());
                    payload.put("amount_minor", fare.amountMinor());
                    // The discount of promotions and the bonuses pay their part of the final fare; the driver or the
                    // card take the rest (ADR 0009).
                    record Reductions(long discount, long wallet) {
                    }
                    Reductions cut = jdbc.sql("select discount_minor, wallet_minor from ride_order where id = :id")
                            .param("id", trip.orderId())
                            .query((rs, i) -> new Reductions(rs.getLong(1), rs.getLong(2))).single();
                    long discount = Math.min(cut.discount(), fare.amountMinor());
                    payload.put("discount_minor", discount);
                    payload.put("wallet_minor", Math.min(cut.wallet(), fare.amountMinor() - discount));
                    payload.put("quote_id", facts.quoteId() == null ? null : facts.quoteId().toString());
                    payload.put("commission_minor", fare.commissionMinor());
                    payload.put("driver_share_minor", fare.driverShareMinor());
                    payload.put("currency", fare.currency());
                    // For promotions of drivers (ADR 0010): the city and when the driver took the order.
                    payload.put("city_id", jdbc.sql("select city_id from ride_order where id = :id")
                            .param("id", trip.orderId()).query(UUID.class).single().toString());
                    payload.put("accepted_at", jdbc.sql("select created_at from assignment where id = :id")
                            .param("id", trip.assignmentId()).query(OffsetDateTime.class).single().toString());
                    core.changeStatus(trip.order(), "FULFILLED", null, "TripCompleted", driver, payload);
                    return view(tripId);
                });
    }

    // ---------------------------------------------------------------- helpers

    private record Locked(UUID id, UUID orderId, UUID assignmentId, String phase, OrderCore.LockedOrder order) {
    }

    /** order → capacity → trip, and only the driver of the active assignment (REQ-DRV-09). */
    private Locked lock(Actor driver, UUID tripId, long expectedVersion) {
        UUID orderId = jdbc.sql("""
                        select t.order_id from trip t join assignment a on a.id = t.assignment_id
                        where t.id = :id and a.driver_id = :driver""")
                .param("id", tripId)
                .param("driver", driver.id())
                .query(UUID.class)
                .optional()
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Trip not found"));
        OrderCore.LockedOrder order = core.lockOrder(orderId);
        core.lockCapacity(driver.id());
        record Row(UUID assignmentId, String assignmentState, String phase, long version) {
        }
        Row row = jdbc.sql("""
                        select t.assignment_id, a.state, t.phase, t.version
                        from trip t join assignment a on a.id = t.assignment_id
                        where t.id = :id for update of t""")
                .param("id", tripId)
                .query((rs, i) -> new Row(rs.getObject(1, UUID.class), rs.getString(2), rs.getString(3), rs.getLong(4)))
                .single();
        if (!"COMMITTED".equals(row.assignmentState())) {
            throw ConflictException.state(row.version(), "The assignment is no longer active");
        }
        if (row.version() != expectedVersion) {
            throw ConflictException.version(row.version(), "The trip changed");
        }
        return new Locked(tripId, orderId, row.assignmentId(), row.phase(), order);
    }

    private record Arrival(Integer distanceM, ErrorCode problem, String message) {
    }

    /** Distance from the driver's last server-side position to the pickup, and whether it is acceptable. */
    private Arrival arrivalCheck(Actor driver, UUID orderId) {
        record Row(Integer distance, OffsetDateTime locationAt, Float accuracy, boolean refused) {
        }
        Optional<Row> row = jdbc.sql("""
                        select cast(ST_Distance(ws.last_location::geography, o.pickup::geography) as int) as distance,
                               ws.last_location_at, ws.last_location_accuracy,
                               ws.location_refused_at is not null as refused
                        from work_session ws, ride_order o
                        where ws.driver_id = :driver and ws.state in ('OPEN', 'CLOSING') and o.id = :order
                          and ws.last_location is not null""")
                .param("driver", driver.id())
                .param("order", orderId)
                .query((rs, i) -> new Row((Integer) rs.getObject(1), rs.getObject(2, OffsetDateTime.class),
                        (Float) rs.getObject(3), rs.getBoolean(4)))
                .optional();
        if (row.isEmpty() || row.get().locationAt() == null || row.get().refused()
                || row.get().locationAt().isBefore(core.now().minus(presence.gpsMaxAge()))) {
            return new Arrival(row.map(Row::distance).orElse(null), ErrorCode.LOCATION_NOT_FRESH,
                    "No current location; confirm with a reason");
        }
        if (row.get().accuracy() != null && row.get().accuracy() > properties.arrivalAccuracyMeters()) {
            return new Arrival(row.get().distance(), ErrorCode.LOCATION_NOT_FRESH,
                    "The location is not accurate enough; confirm with a reason");
        }
        if (row.get().distance() > properties.arrivalRadiusMeters()) {
            return new Arrival(row.get().distance(), ErrorCode.PICKUP_TOO_FAR,
                    "Too far from the pickup point; confirm with a reason");
        }
        return new Arrival(row.get().distance(), null, null);
    }

    private void event(Locked trip, String type, Actor driver, String reason, Map<String, Object> payload) {
        Map<String, Object> body = new LinkedHashMap<>(payload);
        body.put("trip_id", trip.id().toString());
        core.recordEvent(trip.orderId(), core.touch(trip.orderId()), type, driver, reason, body);
    }

    private TripView view(UUID tripId) {
        return jdbc.sql("""
                        select t.id, t.order_id, t.assignment_id, t.phase, t.version, ST_Y(o.pickup) as plat,
                               ST_X(o.pickup) as plon, o.pickup_label, ST_Y(o.dropoff) as dlat, ST_X(o.dropoff) as dlon,
                               o.dropoff_label, o.payment_method, o.price_minor, o.currency, t.arrived_at, t.started_at,
                               t.completed_at, t.needs_review, o.wallet_minor, o.discount_minor,
                               c.name as contact_name, c.phone as contact_phone
                        from trip t join ride_order o on o.id = t.order_id
                        left join order_contact c on c.order_id = o.id
                        where t.id = :id""")
                .param("id", tripId)
                .query((rs, i) -> new TripView(rs.getObject("id", UUID.class), rs.getObject("order_id", UUID.class),
                        rs.getObject("assignment_id", UUID.class), rs.getString("phase"), rs.getLong("version"),
                        new GeoPoint(rs.getDouble("plat"), rs.getDouble("plon")), rs.getString("pickup_label"),
                        new GeoPoint(rs.getDouble("dlat"), rs.getDouble("dlon")), rs.getString("dropoff_label"),
                        PaymentMethod.valueOf(rs.getString("payment_method")), (Long) rs.getObject("price_minor"),
                        rs.getString("currency"), rs.getObject("arrived_at", OffsetDateTime.class),
                        rs.getObject("started_at", OffsetDateTime.class),
                        rs.getObject("completed_at", OffsetDateTime.class), rs.getBoolean("needs_review"),
                        rs.getLong("wallet_minor"), rs.getLong("discount_minor"),
                        recipient(rs.getString("contact_name"), rs.getString("contact_phone"),
                                rs.getObject("completed_at", OffsetDateTime.class))))
                .single();
    }

    /** Shown while the trip is on; the phone only when the call mode lets the driver dial it directly. */
    private TripView.Recipient recipient(String name, String phone, OffsetDateTime completedAt) {
        if (phone == null || completedAt != null) {
            return null;
        }
        boolean direct = settings.current().settings().calls().mode() == ServiceSettings.CallMode.DIRECT;
        return new TripView.Recipient(name, direct ? phone : null);
    }

    private static String blankToNull(String value) {
        return value == null || value.isBlank() ? null : value.strip();
    }

    private static void requireDriver(Actor actor) {
        if (!OrderCore.isDriver(actor)) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Only the assigned driver can do this");
        }
    }
}
