package taxi.blizz.operations.internal;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

/**
 * Search state machine of one order (section 11): PERSONAL offers one driver at a time, then
 * BROADCAST to the "ALL" tab, until an assignment or the total deadline. Deadlines live in the
 * database ({@code next_action_at}), so a restart loses nothing (REQ-DSP-09, T-11). Every method
 * runs in the caller's transaction with the order row locked.
 */
@Component
class DispatchEngine {

    private final JdbcClient jdbc;
    private final OrderCore core;
    private final DispatchProperties properties;
    private final JdbcDispatchJournal journal;

    DispatchEngine(JdbcClient jdbc, OrderCore core, DispatchProperties properties, JdbcDispatchJournal journal) {
        this.jdbc = jdbc;
        this.core = core;
        this.properties = properties;
        this.journal = journal;
    }

    record Attempt(UUID id, UUID orderId, int generation, String phase, OffsetDateTime phaseDeadline,
                   OffsetDateTime totalDeadline) {
    }

    /** READY → SEARCHING with a new attempt, and the first offer if a driver is available. */
    void startSearch(OrderCore.LockedOrder order) {
        search(order, properties.totalDeadline(), "OrderSearchStarted");
    }

    /**
     * ASSIGNED → SEARCHING again after the driver was released before the start. The passenger's
     * search time continues: only what is left of the total search time is used, but at least one
     * personal phase, since the release was not the passenger's doing (REQ-CAN-05).
     */
    void resumeSearch(OrderCore.LockedOrder order) {
        java.time.Duration searched = jdbc.sql("""
                        select coalesce(sum(extract(epoch from coalesce(stopped_at, :now) - created_at)), 0)
                        from dispatch_attempt where order_id = :id""")
                .param("now", core.now())
                .param("id", order.id())
                .query((rs, i) -> java.time.Duration.ofMillis(Math.round(rs.getDouble(1) * 1000)))
                .single();
        java.time.Duration left = properties.totalDeadline().minus(searched);
        if (left.compareTo(properties.personalPhaseMax()) < 0) {
            left = properties.personalPhaseMax();
        }
        search(order, left, "OrderSearchResumed");
    }

    private void search(OrderCore.LockedOrder order, java.time.Duration budget, String eventType) {
        OffsetDateTime now = core.now();
        int generation = jdbc.sql("select coalesce(max(generation), 0) + 1 from dispatch_attempt where order_id = :id")
                .param("id", order.id())
                .query(Integer.class)
                .single();
        UUID attemptId = UUID.randomUUID();
        jdbc.sql("""
                        insert into dispatch_attempt (id, order_id, generation, phase, phase_deadline, total_deadline,
                                                      next_action_at, created_at)
                        values (:id, :orderId, :generation, 'PERSONAL', :phaseDeadline, :totalDeadline, :now, :now)""")
                .param("id", attemptId)
                .param("orderId", order.id())
                .param("generation", generation)
                .param("phaseDeadline", now.plus(earliestOf(properties.personalPhaseMax(), budget)))
                .param("totalDeadline", now.plus(budget))
                .param("now", now)
                .update();
        core.changeStatus(order, "SEARCHING", null, eventType, OrderCore.system(),
                Map.of("attempt_id", attemptId.toString(), "generation", generation,
                        "search_seconds", budget.toSeconds()));
        advance(liveAttempt(order.id()).orElseThrow());
    }

    Optional<Attempt> liveAttempt(UUID orderId) {
        return jdbc.sql("""
                        select id, order_id, generation, phase, phase_deadline, total_deadline
                        from dispatch_attempt where order_id = :id and phase in ('PERSONAL', 'BROADCAST')
                        for update""")
                .param("id", orderId)
                .query((rs, i) -> new Attempt(rs.getObject("id", UUID.class), rs.getObject("order_id", UUID.class),
                        rs.getInt("generation"), rs.getString("phase"),
                        rs.getObject("phase_deadline", OffsetDateTime.class),
                        rs.getObject("total_deadline", OffsetDateTime.class)))
                .optional();
    }

    /**
     * Brings the attempt up to date: expires a lapsed offer, ends the search at the total deadline,
     * moves to BROADCAST after the personal phase or when nobody is near, otherwise offers the order to
     * the next nearest driver. Safe to call any number of times.
     */
    void advance(Attempt attempt) {
        OffsetDateTime now = core.now();
        Optional<OpenOffer> open = openOffer(attempt.orderId());
        if (open.isPresent() && !now.isBefore(open.get().expiresAt())) {
            core.closeOpenOffers(attempt.orderId(), "EXPIRED");
            core.recordEvent(attempt.orderId(), core.touch(attempt.orderId()), "OfferExpired", OrderCore.system(),
                    null, Map.of("offer_id", open.get().id().toString(), "driver_id", open.get().driverId().toString()));
            open = Optional.empty();
        }
        if (!now.isBefore(attempt.totalDeadline())) {
            exhaust(attempt);
            return;
        }
        if ("BROADCAST".equals(attempt.phase())) {
            schedule(attempt, attempt.totalDeadline());
            return;
        }
        if (open.isPresent()) {
            schedule(attempt, earliest(open.get().expiresAt(), attempt.totalDeadline()));
            return;
        }
        if (!now.isBefore(attempt.phaseDeadline()) || !offerToNextDriver(attempt, now)) {
            toBroadcast(attempt);
        }
    }

    private boolean offerToNextDriver(Attempt attempt, OffsetDateTime now) {
        int widest = properties.radiiMeters().stream().mapToInt(Integer::intValue).max().orElse(0);
        // Considered before the offer, so the chosen driver is not shown as busy with it (REQ-DSP-12).
        List<OrderCore.Considered> considered = core.explain(attempt.orderId(), widest,
                properties.journalCandidates());
        for (int radius : properties.radiiMeters()) {
            for (OrderCore.Candidate candidate : core.candidates(attempt.orderId(), radius, null, false)) {
                OrderCore.Capacity capacity = core.lockCapacity(candidate.driverId());
                if (!"FREE".equals(capacity.occupancy())) {
                    continue;
                }
                OffsetDateTime expiresAt = earliest(now.plus(properties.personalOfferTtl()), attempt.totalDeadline());
                UUID offerId = UUID.randomUUID();
                jdbc.sql("""
                                insert into offer (id, order_id, attempt_id, driver_id, state, distance_m, expires_at,
                                                   created_at)
                                values (:id, :orderId, :attemptId, :driverId, 'OPEN', :distance, :expiresAt, :now)""")
                        .param("id", offerId)
                        .param("orderId", attempt.orderId())
                        .param("attemptId", attempt.id())
                        .param("driverId", candidate.driverId())
                        .param("distance", candidate.distanceM())
                        .param("expiresAt", expiresAt)
                        .param("now", now)
                        .update();
                core.setOccupancy(candidate.driverId(), "OFFERED", null);
                core.recordEvent(attempt.orderId(), core.touch(attempt.orderId()), "OfferMade", OrderCore.system(),
                        null, Map.of("offer_id", offerId.toString(), "driver_id", candidate.driverId().toString(),
                                "distance_m", candidate.distanceM()));
                schedule(attempt, expiresAt);
                journal.round(attempt, widest, considered, candidate.driverId(), now);
                return true;
            }
        }
        journal.round(attempt, widest, considered, null, now);
        return false;
    }

    /** PERSONAL → BROADCAST; an open personal offer is revoked in the same transaction (REQ-DSP-06). */
    void toBroadcast(Attempt attempt) {
        core.closeOpenOffers(attempt.orderId(), "REVOKED");
        jdbc.sql("""
                        update dispatch_attempt set phase = 'BROADCAST', next_action_at = :at, version = version + 1
                        where id = :id""")
                .param("at", attempt.totalDeadline())
                .param("id", attempt.id())
                .update();
        core.recordEvent(attempt.orderId(), core.touch(attempt.orderId()), "OrderBroadcast", OrderCore.system(), null,
                Map.of("attempt_id", attempt.id().toString()));
    }

    /** Total deadline passed without an assignment: SEARCHING → UNFULFILLED (section 9). */
    private void exhaust(Attempt attempt) {
        core.closeOpenOffers(attempt.orderId(), "REVOKED");
        stop(attempt.orderId(), "EXHAUSTED");
        OrderCore.LockedOrder order = core.lockOrder(attempt.orderId());
        core.changeStatus(order, "UNFULFILLED", "NO_DRIVER", "OrderUnfulfilled", OrderCore.system(), Map.of());
        core.releaseCardHold(order.id(), "No driver found");
    }

    /** Ends the live attempt of the order, if any; stale worker tasks then find nothing to do. */
    void stop(UUID orderId, String phase) {
        jdbc.sql("""
                        update dispatch_attempt set phase = :phase, next_action_at = null, stopped_at = :now,
                                                    version = version + 1
                        where order_id = :orderId and phase in ('PERSONAL', 'BROADCAST')""")
                .param("phase", phase)
                .param("now", core.now())
                .param("orderId", orderId)
                .update();
    }

    private void schedule(Attempt attempt, OffsetDateTime at) {
        jdbc.sql("update dispatch_attempt set next_action_at = :at where id = :id")
                .param("at", at)
                .param("id", attempt.id())
                .update();
    }

    record OpenOffer(UUID id, UUID driverId, OffsetDateTime expiresAt) {
    }

    private Optional<OpenOffer> openOffer(UUID orderId) {
        List<OpenOffer> offers = jdbc.sql("""
                        select id, driver_id, expires_at from offer where order_id = :id and state = 'OPEN'""")
                .param("id", orderId)
                .query((rs, i) -> new OpenOffer(rs.getObject(1, UUID.class), rs.getObject(2, UUID.class),
                        rs.getObject(3, OffsetDateTime.class)))
                .list();
        return offers.stream().findFirst();
    }

    private static java.time.Duration earliestOf(java.time.Duration a, java.time.Duration b) {
        return a.compareTo(b) <= 0 ? a : b;
    }

    private static OffsetDateTime earliest(OffsetDateTime a, OffsetDateTime b) {
        return a.isBefore(b) ? a : b;
    }
}
