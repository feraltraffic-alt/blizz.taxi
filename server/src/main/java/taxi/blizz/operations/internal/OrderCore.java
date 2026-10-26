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

    OrderCore(JdbcClient jdbc, Outbox outbox, JsonMapper json, DispatchProperties properties,
              PresenceProperties presence, Clock clock) {
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
                                                 occurred_at)
                        values (:orderId, :sequence, :type, :actorType, :actorId, :reason, cast(:payload as jsonb), :now)""")
                .param("orderId", orderId)
                .param("sequence", version)
                .param("type", type)
                .param("actorType", actor.type().name())
                .param("actorId", actor.id())
                .param("reason", reason)
                .param("payload", json.writeValueAsString(body))
                .param("now", now())
                .update();
        outbox.publish(new OutboxEvent(type, 1, "Order", orderId, version, body));
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
                               ST_X(o.dropoff) as dropoff_lon, o.dropoff_label, o.payment_method, o.price_minor,
                               o.currency, o.created_at,
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
                        (Long) rs.getObject("price_minor"), rs.getString("currency"), rs.getString("search_phase"),
                        null, rs.getObject("created_at", OffsetDateTime.class)))
                .optional()
                .map(order -> withAssignment(order, assignmentOfOrder(order.id())))
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Order not found"));
    }

    private static OrderView withAssignment(OrderView o, Optional<AssignmentView> assignment) {
        return new OrderView(o.id(), o.shortNumber(), o.status(), o.statusReason(), o.version(), o.channel(),
                o.payerClientId(), o.cityId(), o.vehicleClass(), o.pickup(), o.pickupLabel(), o.dropoff(),
                o.dropoffLabel(), o.paymentMethod(), o.priceMinor(), o.currency(), o.searchPhase(),
                assignment.orElse(null), o.createdAt());
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
     * order (REQ-DSP-01). The final check repeats under locks when the offer is made.
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
                          and d.account_state = 'ACTIVE'
                          and d.review_status = 'APPROVED'
                          and v.state = 'APPROVED'
                          and o.vehicle_class = any(v.class_approvals)
                          and (coalesce(c.occupancy, 'FREE') = 'FREE'
                               or (:includeOffered and c.occupancy = 'OFFERED'))
                          and ST_DWithin(ws.last_location::geography, o.pickup::geography, :radius)
                          and (:includeOffered or not exists (
                                select 1 from offer f where f.order_id = o.id and f.driver_id = ws.driver_id))
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

    static Actor system() {
        return Actor.system();
    }

    static boolean isDriver(Actor actor) {
        return actor != null && actor.type() == SubjectType.DRIVER;
    }
}
