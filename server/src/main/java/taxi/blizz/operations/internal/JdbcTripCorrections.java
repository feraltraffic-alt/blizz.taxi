package taxi.blizz.operations.internal;

import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.audit.AuditEntry;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.operations.Orders;
import taxi.blizz.operations.TripCorrections;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.ConflictException;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;
import taxi.blizz.platform.Outbox;
import taxi.blizz.platform.OutboxEvent;

/**
 * See {@link TripCorrections}. The order's latest trip is locked for a command. A correction never touches the trip's
 * own times: it adds rows to {@code trip_correction}, marks the trip for review and bumps its version. A card trip's
 * capture is held by {@code JdbcTrips.complete} while a holding correction is open, and released here by the review
 * ({@code TripCaptureReleased}, at the order's current final fare).
 */
@Service
class JdbcTripCorrections implements TripCorrections {

    private static final int REASON_MAX = 500;

    private final JdbcClient jdbc;
    private final StaffAccess staff;
    private final IdempotentCommands commands;
    private final AuditLog audit;
    private final OrderCore core;
    private final Outbox outbox;
    private final Clock clock;

    JdbcTripCorrections(JdbcClient jdbc, StaffAccess staff, IdempotentCommands commands, AuditLog audit,
                        OrderCore core, Outbox outbox, Clock clock) {
        this.jdbc = jdbc;
        this.staff = staff;
        this.commands = commands;
        this.audit = audit;
        this.core = core;
        this.outbox = outbox;
        this.clock = clock;
    }

    private record Trip(UUID id, String phase, long version, OffsetDateTime arrivedAt, OffsetDateTime startedAt,
                        OffsetDateTime completedAt, boolean needsReview) {
    }

    @Override
    @Transactional(readOnly = true)
    public Facts facts(Actor actor, UUID orderId) {
        staff.require(actor, Orders.VIEW_PERMISSION, cityOf(orderId));
        return view(orderId, trip(orderId, false));
    }

    record CorrectRequest(UUID orderId, long expectedVersion, Change change, String reason) {
    }

    @Override
    public Facts correct(Actor actor, UUID commandId, UUID orderId, long expectedVersion, Change change,
                         String reason) {
        staff.require(actor, CORRECT_PERMISSION, cityOf(orderId));
        String why = reason(reason);
        Change asked = change == null ? new Change(false, null, null) : change;
        if (!asked.startedByMistake() && asked.startedAt() == null && asked.completedAt() == null) {
            throw new DomainException(ErrorCode.STATE_CONFLICT, "Nothing to correct");
        }
        if (asked.startedByMistake() && asked.startedAt() != null) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED,
                    "A start pressed by mistake has no corrected start time");
        }
        return commands.execute(new CommandKey(actor, "trip.correct", commandId),
                new CorrectRequest(orderId, expectedVersion, asked, why), Facts.class, () -> {
                    Trip trip = trip(orderId, true);
                    if (trip.startedAt() == null) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT, "The trip has not started");
                    }
                    if (trip.version() != expectedVersion) {
                        throw ConflictException.version(trip.version(), "The trip is at version " + trip.version());
                    }
                    OffsetDateTime now = now();
                    Facts current = view(orderId, trip);
                    OffsetDateTime start = asked.startedAt() != null ? asked.startedAt()
                            : current.correctedStartedAt() != null ? current.correctedStartedAt() : trip.startedAt();
                    if (asked.startedAt() != null) {
                        requirePast(asked.startedAt(), now, "The start");
                        if (trip.arrivedAt() != null && asked.startedAt().isBefore(trip.arrivedAt())) {
                            throw new DomainException(ErrorCode.VALIDATION_FAILED,
                                    "The start cannot be before the arrival at " + trip.arrivedAt());
                        }
                    }
                    if (asked.completedAt() != null) {
                        if (trip.completedAt() == null) {
                            throw new DomainException(ErrorCode.VALIDATION_FAILED, "The trip has not completed");
                        }
                        requirePast(asked.completedAt(), now, "The completion");
                        if (!asked.completedAt().isAfter(start)) {
                            throw new DomainException(ErrorCode.VALIDATION_FAILED,
                                    "The completion must come after the start at " + start);
                        }
                    }
                    boolean holds = trip.completedAt() == null && "CARD".equals(paymentMethod(orderId));
                    List<Map<String, Object>> added = new ArrayList<>();
                    if (asked.startedByMistake()) {
                        added.add(insert(trip, orderId, "START_VOID", trip.startedAt(), null, why, actor, now,
                                holds));
                    }
                    if (asked.startedAt() != null) {
                        added.add(insert(trip, orderId, "STARTED_AT", trip.startedAt(), asked.startedAt(), why,
                                actor, now, holds));
                    }
                    if (asked.completedAt() != null) {
                        added.add(insert(trip, orderId, "COMPLETED_AT", trip.completedAt(), asked.completedAt(),
                                why, actor, now, holds));
                    }
                    jdbc.sql("update trip set needs_review = true, version = version + 1 where id = :id")
                            .param("id", trip.id()).update();
                    Map<String, Object> details = new LinkedHashMap<>();
                    details.put("trip_id", trip.id().toString());
                    details.put("corrections", added);
                    details.put("holds_capture", holds);
                    core.recordEvent(orderId, core.touch(orderId), "TripFactsCorrected", actor, why, details);
                    audit.record(new AuditEntry(actor, "trip.correct", "ride_order", orderId.toString(), why,
                            Map.of("started_at", String.valueOf(trip.startedAt()),
                                    "completed_at", String.valueOf(trip.completedAt())),
                            Map.of("corrections", added, "holds_capture", holds)));
                    return view(orderId, trip(orderId, false));
                });
    }

    record ReviewRequest(UUID orderId, String reason) {
    }

    @Override
    public Facts review(Actor actor, UUID commandId, UUID orderId, String reason) {
        staff.require(actor, CORRECT_PERMISSION, cityOf(orderId));
        String why = reason(reason);
        return commands.execute(new CommandKey(actor, "trip.review", commandId), new ReviewRequest(orderId, why),
                Facts.class, () -> {
                    Trip trip = trip(orderId, true);
                    List<Boolean> open = jdbc.sql("""
                                    select holds_capture from trip_correction
                                    where trip_id = :trip and reviewed_at is null""")
                            .param("trip", trip.id()).query(Boolean.class).list();
                    if (open.isEmpty()) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT, "No correction waits for review");
                    }
                    OffsetDateTime now = now();
                    jdbc.sql("""
                                    update trip_correction set reviewed_at = :now, reviewed_by = :by,
                                                               review_reason = :reason
                                    where trip_id = :trip and reviewed_at is null""")
                            .param("now", now).param("by", actor.id()).param("reason", why)
                            .param("trip", trip.id()).update();
                    jdbc.sql("update trip set version = version + 1 where id = :id").param("id", trip.id()).update();
                    boolean released = open.contains(Boolean.TRUE) && trip.completedAt() != null
                            && releaseCapture(orderId);
                    core.recordEvent(orderId, core.touch(orderId), "TripCorrectionsReviewed", actor, why,
                            Map.of("trip_id", trip.id().toString(), "capture_released", released));
                    audit.record(new AuditEntry(actor, "trip.review", "ride_order", orderId.toString(), why, null,
                            Map.of("capture_released", released)));
                    return view(orderId, trip(orderId, false));
                });
    }

    /**
     * The capture the completion skipped starts now with the order's current final fare, less the bonuses and the
     * discount as at completion. Only for a card order whose payment still waits (AUTHORIZED).
     */
    private boolean releaseCapture(UUID orderId) {
        record Order(String method, String paymentState, UUID fareId, Long amount, long wallet, long discount,
                     String currency) {
        }
        Order o = jdbc.sql("""
                        select payment_method, payment_state, final_fare_id, final_price_minor, wallet_minor,
                               discount_minor, currency
                        from ride_order where id = :id""")
                .param("id", orderId)
                .query((rs, i) -> new Order(rs.getString(1), rs.getString(2), rs.getObject(3, UUID.class),
                        (Long) rs.getObject(4), rs.getLong(5), rs.getLong(6), rs.getString(7)))
                .single();
        if (!"CARD".equals(o.method()) || !"AUTHORIZED".equals(o.paymentState()) || o.amount() == null) {
            return false;
        }
        long discount = Math.min(o.discount(), o.amount());
        long version = jdbc.sql("""
                        update ride_order set payment_state = 'CAPTURE_PENDING', updated_at = :now,
                                              version = version + 1
                        where id = :id returning version""")
                .param("now", now()).param("id", orderId).query(Long.class).single();
        Map<String, Object> payload = new LinkedHashMap<>();
        payload.put("order_id", orderId.toString());
        payload.put("payment_method", "CARD");
        payload.put("final_fare_id", o.fareId().toString());
        payload.put("amount_minor", o.amount());
        payload.put("wallet_minor", Math.min(o.wallet(), o.amount() - discount));
        payload.put("discount_minor", discount);
        payload.put("currency", o.currency().strip());
        outbox.publish(new OutboxEvent("TripCaptureReleased", 1, "Order", orderId, version, payload));
        return true;
    }

    private Map<String, Object> insert(Trip trip, UUID orderId, String kind, OffsetDateTime recorded,
                                       OffsetDateTime corrected, String reason, Actor actor, OffsetDateTime now,
                                       boolean holds) {
        jdbc.sql("""
                        insert into trip_correction (id, trip_id, order_id, kind, recorded_value, corrected_value,
                                                     reason, created_by, created_at, holds_capture)
                        values (:id, :trip, :order, :kind, :recorded, :corrected, :reason, :by, :now, :holds)""")
                .param("id", UUID.randomUUID()).param("trip", trip.id()).param("order", orderId).param("kind", kind)
                .param("recorded", utc(recorded)).param("corrected", utc(corrected)).param("reason", reason)
                .param("by", actor.id()).param("now", now).param("holds", holds).update();
        Map<String, Object> row = new LinkedHashMap<>();
        row.put("kind", kind);
        row.put("recorded_value", recorded == null ? null : recorded.toString());
        row.put("corrected_value", corrected == null ? null : corrected.toString());
        return row;
    }

    private Facts view(UUID orderId, Trip trip) {
        List<Correction> list = jdbc.sql("""
                        select id, kind, recorded_value, corrected_value, reason, created_by, created_at,
                               holds_capture, reviewed_at, reviewed_by
                        from trip_correction where trip_id = :trip order by created_at, id""")
                .param("trip", trip.id())
                .query((rs, i) -> new Correction(rs.getObject(1, UUID.class), rs.getString(2),
                        rs.getObject(3, OffsetDateTime.class), rs.getObject(4, OffsetDateTime.class), rs.getString(5),
                        rs.getObject(6, UUID.class), rs.getObject(7, OffsetDateTime.class), rs.getBoolean(8),
                        rs.getObject(9, OffsetDateTime.class), rs.getObject(10, UUID.class)))
                .list();
        OffsetDateTime start = null;
        OffsetDateTime end = null;
        boolean startVoid = false;
        boolean held = false;
        for (Correction c : list) {
            switch (c.kind()) {
                case "STARTED_AT" -> start = c.correctedValue();
                case "COMPLETED_AT" -> end = c.correctedValue();
                default -> startVoid = true;
            }
            held |= c.holdsCapture() && c.reviewedAt() == null;
        }
        return new Facts(orderId, trip.id(), trip.version(), trip.phase(), trip.arrivedAt(), trip.startedAt(),
                trip.completedAt(), start, end, startVoid, trip.needsReview(), held, list);
    }

    private Trip trip(UUID orderId, boolean lock) {
        return jdbc.sql("""
                        select id, phase, version, arrived_at, started_at, completed_at, needs_review
                        from trip where order_id = :order order by created_at desc limit 1"""
                        + (lock ? " for update" : ""))
                .param("order", orderId)
                .query((rs, i) -> new Trip(rs.getObject(1, UUID.class), rs.getString(2), rs.getLong(3),
                        rs.getObject(4, OffsetDateTime.class), rs.getObject(5, OffsetDateTime.class),
                        rs.getObject(6, OffsetDateTime.class), rs.getBoolean(7)))
                .optional()
                .orElseThrow(() -> new DomainException(ErrorCode.STATE_CONFLICT, "The order has no trip"));
    }

    private String paymentMethod(UUID orderId) {
        return jdbc.sql("select payment_method from ride_order where id = :id").param("id", orderId)
                .query(String.class).single();
    }

    private UUID cityOf(UUID orderId) {
        return jdbc.sql("select city_id from ride_order where id = :id").param("id", orderId).query(UUID.class)
                .optional().orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Order not found"));
    }

    private static String reason(String reason) {
        String why = reason == null ? "" : reason.strip();
        if (why.isEmpty() || why.length() > REASON_MAX) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "A reason of at most 500 characters is required");
        }
        return why;
    }

    private static void requirePast(OffsetDateTime at, OffsetDateTime now, String what) {
        if (at.isAfter(now)) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, what + " cannot be in the future");
        }
    }

    /** As a UTC instant: another offset would be dropped on the way to the database (see #167). */
    private static OffsetDateTime utc(OffsetDateTime at) {
        return at == null ? null : at.withOffsetSameInstant(ZoneOffset.UTC);
    }

    private OffsetDateTime now() {
        return OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
    }
}
