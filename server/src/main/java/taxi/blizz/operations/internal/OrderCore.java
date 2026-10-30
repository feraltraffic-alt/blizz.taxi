package taxi.blizz.operations.internal;

import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.configuration.CancelReasons;
import taxi.blizz.payments.CardPayments;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.operations.AssignmentView;
import taxi.blizz.operations.OrderView;
import taxi.blizz.operations.PaymentMethod;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.Outbox;
import taxi.blizz.platform.OutboxEvent;
import taxi.blizz.platform.SubjectType;
import tools.jackson.databind.json.JsonMapper;

/**
 * Shared building blocks of the order core. All methods expect the caller's transaction and, for
 * changes, the order row already locked. Lock order everywhere: order → driver capacity →
 * assignment / offer → attempt (REQ-ASG-08).
 */
@Component
class OrderCore {

    private final JdbcClient jdbc;
    private final Outbox outbox;
    private final JsonMapper json;
    private final DispatchProperties properties;
    private final PresenceProperties presence;
    private final Clock clock;
    private final CardPayments payments;
    private final OrderMetrics metrics;

    OrderCore(JdbcClient jdbc, Outbox outbox, JsonMapper json, DispatchProperties properties,
              PresenceProperties presence, Clock clock, CardPayments payments, OrderMetrics metrics) {
        this.metrics = metrics;
        this.payments = payments;
        this.jdbc = jdbc;
        this.outbox = outbox;
        this.json = json;
        this.properties = properties;
        this.presence = presence;
        this.clock = clock;
    }

    OffsetDateTime now() {
        return OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
    }

    // ---------------------------------------------------------------- orders

    record LockedOrder(UUID id, String status, long version, UUID payerClientId, UUID cityId, String vehicleClass) {
    }

    LockedOrder lockOrder(UUID orderId) {
        return jdbc.sql("""
                        select id, status, version, payer_client_id, city_id, vehicle_class
                        from ride_order where id = :id for update""")
                .param("id", orderId)
                .query((rs, i) -> new LockedOrder(rs.getObject("id", UUID.class), rs.getString("status"),
                        rs.getLong("version"), rs.getObject("payer_client_id", UUID.class),
                        rs.getObject("city_id", UUID.class), rs.getString("vehicle_class")))
                .optional()
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Order not found"));
    }

    /** Changes the status, bumps the version and writes the history row and the outbox event. */
    void setPaymentState(UUID orderId, String state) {
        jdbc.sql("update ride_order set payment_state = :state where id = :id")
                .param("state", state).param("id", orderId).update();
    }

    String paymentState(UUID orderId) {
        return jdbc.sql("select payment_state from ride_order where id = :id").param("id", orderId)
                .query(String.class).optional().orElse(null);
    }

    boolean isPreorder(UUID orderId) {
        return jdbc.sql("select preorder from ride_order where id = :id").param("id", orderId)
                .query(Boolean.class).single();
    }

    /** The order ended without a ride: a card hold is released (REQ-PAY-06). */
    void releaseCardHold(UUID orderId, String reason) {
        payments.releaseHold(orderId, reason);
    }

    long changeStatus(LockedOrder order, String status, String reason, String eventType, Actor actor,
                      Map<String, Object> payload) {
        long version = jdbc.sql("""
                        update ride_order set status = :status, status_reason = :reason, updated_at = :now,
                                              version = version + 1
                        where id = :id returning version""")
                .param("status", status)
                .param("reason", reason)
                .param("now", now())
                .param("id", order.id())
                .query(Long.class)
                .single();
        recordEvent(order.id(), version, eventType, actor, reason, payload);
        return version;
    }

    /** Appends to the order history and publishes the event (REQ-ADM-02, REQ-NTF-04). */
    void recordEvent(UUID orderId, long version, String type, Actor actor, String reason, Map<String, Object> payload) {
        Map<String, Object> body = new LinkedHashMap<>(payload);
        body.put("order_id", orderId.toString());
        jdbc.sql("""
                        insert into order_event (order_id, sequence, type, actor_type, actor_id, reason, payload,
                                                 occurred_at, correlation_id)
                        values (:orderId, :sequence, :type, :actorType, :actorId, :reason, cast(:payload as jsonb), :now,
                                :correlation)""")
                .param("orderId", orderId)
                .param("sequence", version)
                .param("type", type)
                .param("actorType", actor.type().name())
                .param("actorId", actor.id())
                .param("reason", reason)
                .param("payload", json.writeValueAsString(body))
                .param("now", now())
                .param("correlation", taxi.blizz.platform.CorrelationId.currentOrNew())
                .update();
        outbox.publish(new OutboxEvent(type, 1, "Order", orderId, version, body));
        metrics.event(orderId, type, payload);
    }

    /** Bumps the order version for a change that keeps the status (e.g. a new offer). */
    long touch(UUID orderId) {
        return jdbc.sql("update ride_order set updated_at = :now, version = version + 1 where id = :id returning version")
                .param("now", now())
                .param("id", orderId)
                .query(Long.class)
                .single();
    }

    // ---------------------------------------------------------------- driver capacity

    record Capacity(String occupancy, UUID assignmentId) {
    }

    Capacity lockCapacity(UUID driverId) {
        jdbc.sql("insert into driver_capacity (driver_id, updated_at) values (:id, :now) on conflict do nothing")
                .param("id", driverId)
                .param("now", now())
                .update();
        return jdbc.sql("select occupancy, assignment_id from driver_capacity where driver_id = :id for update")
                .param("id", driverId)
                .query((rs, i) -> new Capacity(rs.getString(1), rs.getObject(2, UUID.class)))
                .single();
    }

    void setOccupancy(UUID driverId, String occupancy, UUID assignmentId) {
        jdbc.sql("""
                        update driver_capacity set occupancy = :occupancy, assignment_id = :assignment,
                                                   updated_at = :now, version = version + 1
                        where driver_id = :id""")
                .param("occupancy", occupancy)
                .param("assignment", assignmentId)
                .param("now", now())
                .param("id", driverId)
                .update();
    }

    /**
     * Frees the driver after an assignment ends. A session waiting to close is closed and a pause
     * requested during the trip takes effect (REQ-DRV-13).
     */
    void releaseDriver(UUID driverId) {
        setOccupancy(driverId, "FREE", null);
        OffsetDateTime now = now();
        jdbc.sql("""
                        update work_session set state = 'CLOSED', closed_at = :now, version = version + 1
                        where driver_id = :id and state = 'CLOSING'""")
                .param("now", now)
                .param("id", driverId)
                .update();
        jdbc.sql("""
                        update work_session set intent = 'NOT_ACCEPTING', version = version + 1
                        where driver_id = :id and state = 'OPEN' and intent = 'PAUSE_AFTER_CURRENT'""")
                .param("id", driverId)
                .update();
    }

    /**
     * Ends an assignment before the trip started: assignment RELEASED or REVOKED with a reason, trip
     * ABORTED, driver free again (REQ-ASG-04). The caller holds the order lock.
     */
    void endAssignmentBeforeStart(AssignmentView assignment, String state, String reason) {
        if (!"TO_PICKUP".equals(assignment.tripPhase()) && !"WAITING".equals(assignment.tripPhase())) {
            throw new DomainException(ErrorCode.STATE_CONFLICT, "The trip has already started");
        }
        lockCapacity(assignment.driverId());
        jdbc.sql("""
                        update assignment set state = :state, closed_at = :now, close_reason = :reason,
                                              version = version + 1
                        where id = :id and state = 'COMMITTED'""")
                .param("state", state)
                .param("now", now())
                .param("reason", reason)
                .param("id", assignment.id())
                .update();
        jdbc.sql("update trip set phase = 'ABORTED', version = version + 1 where id = :id")
                .param("id", assignment.tripId())
                .update();
        releaseDriver(assignment.driverId());
    }

    // ---------------------------------------------------------------- offers

    /** Closes every open offer of the order and frees the offered drivers. */
    void closeOpenOffers(UUID orderId, String state) {
        List<UUID> drivers = jdbc.sql("""
                        update offer set state = :state, closed_at = :now
                        where order_id = :orderId and state = 'OPEN'
                        returning driver_id""")
                .param("state", state)
                .param("now", now())
                .param("orderId", orderId)
                .query(UUID.class)
                .list();
        for (UUID driverId : drivers) {
            metrics.offer(state);
            lockCapacity(driverId);
            jdbc.sql("""
                            update driver_capacity set occupancy = 'FREE', updated_at = :now, version = version + 1
                            where driver_id = :id and occupancy = 'OFFERED'""")
                    .param("now", now())
                    .param("id", driverId)
                    .update();
        }
    }

    // ---------------------------------------------------------------- views

    OrderView view(UUID orderId) {
        return jdbc.sql("""
                        select o.id, o.short_number, o.status, o.status_reason, o.version, o.channel,
                               o.payer_client_id, o.city_id, o.vehicle_class, ST_Y(o.pickup) as pickup_lat,
                               ST_X(o.pickup) as pickup_lon, o.pickup_label, ST_Y(o.dropoff) as dropoff_lat,
                               ST_X(o.dropoff) as dropoff_lon, o.dropoff_label, o.payment_method, o.payment_state, o.price_minor,
                               o.final_price_minor, o.currency, o.created_at, o.cancelled_by, o.cancel_reason_code,
                               o.cancel_reason_labels::text as cancel_reason_labels, o.pickup_at, o.preorder, o.related_order_id,
                               o.wallet_minor, o.discount_minor,
                               (select phase from dispatch_attempt a where a.order_id = o.id
                                order by generation desc limit 1) as search_phase
                        from ride_order o where o.id = :id""")
                .param("id", orderId)
                .query((rs, i) -> new OrderView(rs.getObject("id", UUID.class), rs.getLong("short_number"),
                        rs.getString("status"), rs.getString("status_reason"), rs.getLong("version"),
                        rs.getString("channel"), rs.getObject("payer_client_id", UUID.class),
                        rs.getObject("city_id", UUID.class), rs.getString("vehicle_class"),
                        new GeoPoint(rs.getDouble("pickup_lat"), rs.getDouble("pickup_lon")), rs.getString("pickup_label"),
                        new GeoPoint(rs.getDouble("dropoff_lat"), rs.getDouble("dropoff_lon")),
                        rs.getString("dropoff_label"), PaymentMethod.valueOf(rs.getString("payment_method")),
                        rs.getString("payment_state"), (Long) rs.getObject("price_minor"),
                        (Long) rs.getObject("final_price_minor"), rs.getString("currency"), rs.getString("search_phase"),
                        null, rs.getObject("created_at", OffsetDateTime.class), cancellation(rs),
                        rs.getObject("pickup_at", OffsetDateTime.class), rs.getBoolean("preorder"),
                        rs.getObject("related_order_id", UUID.class), rs.getLong("wallet_minor"),
                        rs.getLong("discount_minor")))
                .optional()
                .map(order -> withAssignment(order, assignmentOfOrder(order.id())))
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Order not found"));
    }

    private static OrderView withAssignment(OrderView o, Optional<AssignmentView> assignment) {
        return new OrderView(o.id(), o.shortNumber(), o.status(), o.statusReason(), o.version(), o.channel(),
                o.payerClientId(), o.cityId(), o.vehicleClass(), o.pickup(), o.pickupLabel(), o.dropoff(),
                o.dropoffLabel(), o.paymentMethod(), o.paymentState(), o.priceMinor(), o.finalPriceMinor(), o.currency(),
                o.searchPhase(),
                assignment.orElse(null), o.createdAt(), o.cancellation(), o.pickupAt(), o.preorder(),
                o.relatedOrderId(), o.walletMinor(), o.discountMinor());
    }

    @SuppressWarnings("unchecked")
    private OrderView.Cancellation cancellation(java.sql.ResultSet rs) throws java.sql.SQLException {
        String by = rs.getString("cancelled_by");
        if (by == null) {
            return null;
        }
        String labels = rs.getString("cancel_reason_labels");
        return new OrderView.Cancellation(by, rs.getString("cancel_reason_code"),
                labels == null ? Map.of() : json.readValue(labels, Map.class));
    }

    /**
     * Cancels the order on behalf of a person (RIDER, STAFF or DRIVER) with a reason from the catalog: the status,
     * who cancelled, the reason and its labels as they are now, and one history entry that says all of it.
     */
    long cancel(LockedOrder order, String by, CancelReasons.Reason reason, String eventType, Actor actor,
                Map<String, Object> payload) {
        Map<String, Object> body = new LinkedHashMap<>(payload);
        body.put("cancelled_by", by);
        body.put("reason_code", reason.code());
        body.put("reason_labels", reason.labels());
        long version = changeStatus(order, "CANCELLED", reason.code(), eventType, actor, body);
        // A card hold is released with the order (REQ-PAY-06); no fee until the cancellation policy exists (Q-07).
        payments.releaseHold(order.id(), "Order cancelled: " + reason.code());
        jdbc.sql("""
                        update ride_order set cancelled_by = :by, cancel_reason_code = :code,
                                              cancel_reason_labels = cast(:labels as jsonb)
                        where id = :id""")
                .param("by", by).param("code", reason.code())
                .param("labels", json.writeValueAsString(reason.labels())).param("id", order.id()).update();
        metrics.cancelled(by, reason.code());
        return version;
    }

    /** The current or last assignment of the order. */
    Optional<AssignmentView> assignmentOfOrder(UUID orderId) {
        return jdbc.sql("""
                        select a.id, a.order_id, a.driver_id, a.vehicle_id, a.source, a.state, t.id as trip_id, t.phase
                        from assignment a left join trip t on t.assignment_id = a.id
                        where a.order_id = :id order by a.created_at desc limit 1""")
                .param("id", orderId)
                .query((rs, i) -> assignment(rs))
                .optional();
    }

    Optional<AssignmentView> activeAssignmentOfDriver(UUID driverId) {
        return jdbc.sql("""
                        select a.id, a.order_id, a.driver_id, a.vehicle_id, a.source, a.state, t.id as trip_id, t.phase
                        from assignment a left join trip t on t.assignment_id = a.id
                        where a.driver_id = :id and a.state in ('RESERVED', 'COMMITTED')""")
                .param("id", driverId)
                .query((rs, i) -> assignment(rs))
                .optional();
    }

    private static AssignmentView assignment(java.sql.ResultSet rs) throws java.sql.SQLException {
        return new AssignmentView(rs.getObject("id", UUID.class), rs.getObject("order_id", UUID.class),
                rs.getObject("driver_id", UUID.class), rs.getObject("vehicle_id", UUID.class), rs.getString("source"),
                rs.getString("state"), rs.getObject("trip_id", UUID.class), rs.getString("phase"));
    }

    // ---------------------------------------------------------------- eligibility

    /**
     * Drivers that may get this order now, nearest first, within {@code radius} metres: open
     * accepting session in the order's city with a fresh heartbeat and location, active account,
     * admission, an approved vehicle with the class, free capacity, and no earlier offer for this
     * order (REQ-DSP-01); for payment at the terminal only drivers with one (personal offers never fall back to cash).
     * The final check repeats under locks when the offer is made.
     */
    List<Candidate> candidates(UUID orderId, int radius, Integer limit, boolean includeOffered) {
        OffsetDateTime now = now();
        return jdbc.sql("""
                        select ws.driver_id, ws.vehicle_id,
                               cast(ST_Distance(ws.last_location::geography, o.pickup::geography) as int) as distance_m
                        from ride_order o
                        join work_session ws on ws.city_id = o.city_id and ws.state = 'OPEN' and ws.intent = 'ACCEPTING'
                        join driver d on d.id = ws.driver_id
                        join vehicle v on v.id = ws.vehicle_id
                        left join driver_capacity c on c.driver_id = ws.driver_id
                        where o.id = :orderId
                          and ws.last_heartbeat_at > :heartbeatSince
                          and ws.last_location_at > :locationSince
                          and ws.location_refused_at is null
                          and d.account_state = 'ACTIVE'
                          and d.review_status = 'APPROVED'
                          and v.state = 'APPROVED'
                          and o.vehicle_class = any(v.class_approvals)
                          and (o.payment_method <> 'TERMINAL' or d.has_payment_terminal)
                          and (coalesce(c.occupancy, 'FREE') = 'FREE'
                               or (:includeOffered and c.occupancy = 'OFFERED'))
                          and ST_DWithin(ws.last_location::geography, o.pickup::geography, :radius)
                          and (:includeOffered or not exists (
                                select 1 from offer f where f.order_id = o.id and f.driver_id = ws.driver_id))
                          and not exists (
                                select 1 from assignment x
                                where x.order_id in (o.id, o.related_order_id) and x.driver_id = ws.driver_id)
                          and not exists (
                                select 1 from driver_restriction r where r.driver_id = ws.driver_id and r.active)
                        order by distance_m, ws.driver_id
                        limit :limit""")
                .param("orderId", orderId)
                .param("heartbeatSince", now.minus(presence.stale()))
                .param("locationSince", now.minus(presence.gpsMaxAge()))
                .param("includeOffered", includeOffered)
                .param("radius", radius)
                .param("limit", limit == null ? properties.candidateLimit() : limit)
                .query((rs, i) -> new Candidate(rs.getObject("driver_id", UUID.class),
                        rs.getObject("vehicle_id", UUID.class), rs.getInt("distance_m")))
                .list();
    }

    record Candidate(UUID driverId, UUID vehicleId, int distanceM) {
    }

    /** A driver considered for an order and the first check that left him out (null: he qualified). */
    record Considered(UUID driverId, Integer distanceM, String reason) {
    }

    /**
     * For the dispatch journal (REQ-DSP-12, issue #71): the drivers with an open shift in the order's city, nearest
     * first, at most {@code limit}, each with the first of the checks of {@link #candidates} that fails, in the same
     * order of importance — or null when he qualifies within {@code radius}. Ids and distances only.
     */
    List<Considered> explain(UUID orderId, int radius, int limit) {
        OffsetDateTime now = now();
        return jdbc.sql("""
                        select ws.driver_id,
                               cast(ST_Distance(ws.last_location::geography, o.pickup::geography) as int) as distance_m,
                               case
                                 when ws.last_heartbeat_at is null or ws.last_heartbeat_at <= :heartbeatSince
                                      or ws.last_location_at is null or ws.last_location_at <= :locationSince
                                      or ws.last_location is null or ws.location_refused_at is not null
                                      then 'STALE_LOCATION'
                                 when ws.intent <> 'ACCEPTING' then 'PAUSED'
                                 when d.account_state <> 'ACTIVE' or d.review_status <> 'APPROVED'
                                      or v.state <> 'APPROVED' then 'NOT_ADMITTED'
                                 when not (o.vehicle_class = any(v.class_approvals)) then 'CLASS'
                                 when o.payment_method = 'TERMINAL' and not d.has_payment_terminal then 'PAYMENT'
                                 when exists (select 1 from driver_restriction r
                                              where r.driver_id = ws.driver_id and r.active) then 'RESTRICTED'
                                 when exists (select 1 from assignment x
                                              where x.order_id in (o.id, o.related_order_id)
                                                and x.driver_id = ws.driver_id) then 'PREVIOUS_DRIVER'
                                 when exists (select 1 from offer f
                                              where f.order_id = o.id and f.driver_id = ws.driver_id) then 'ALREADY_OFFERED'
                                 when coalesce(c.occupancy, 'FREE') <> 'FREE' then 'BUSY'
                                 when not ST_DWithin(ws.last_location::geography, o.pickup::geography, :radius)
                                      then 'TOO_FAR'
                               end as reason
                        from ride_order o
                        join work_session ws on ws.city_id = o.city_id and ws.state = 'OPEN'
                        join driver d on d.id = ws.driver_id
                        join vehicle v on v.id = ws.vehicle_id
                        left join driver_capacity c on c.driver_id = ws.driver_id
                        where o.id = :orderId
                        order by distance_m nulls last, ws.driver_id
                        limit :limit""")
                .param("orderId", orderId)
                .param("heartbeatSince", now.minus(presence.stale()))
                .param("locationSince", now.minus(presence.gpsMaxAge()))
                .param("radius", radius)
                .param("limit", limit)
                .query((rs, i) -> new Considered(rs.getObject("driver_id", UUID.class),
                        (Integer) rs.getObject("distance_m"), rs.getString("reason")))
                .list();
    }

    static Actor system() {
        return Actor.system();
    }

    static boolean isDriver(Actor actor) {
        return actor != null && actor.type() == SubjectType.DRIVER;
    }
}
