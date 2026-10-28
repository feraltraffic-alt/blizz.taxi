package taxi.blizz.operations.internal;

import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.operations.DispatchJournal;
import taxi.blizz.operations.Orders;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import tools.jackson.databind.json.JsonMapper;

/**
 * The dispatch journal (REQ-DSP-12, issue #71). {@link #round} is written by {@link DispatchEngine} in its own
 * transaction each time it picks the next driver; offers and attempts come from the order's own tables. Rounds older
 * than the retention are purged ({@link #purge}).
 */
@Service
class JdbcDispatchJournal implements DispatchJournal {

    private static final Logger log = LoggerFactory.getLogger(JdbcDispatchJournal.class);

    private final JdbcClient jdbc;
    private final StaffAccess staff;
    private final DispatchProperties properties;
    private final JsonMapper json;
    private final Clock clock;

    JdbcDispatchJournal(JdbcClient jdbc, StaffAccess staff, DispatchProperties properties, JsonMapper json,
                        Clock clock) {
        this.jdbc = jdbc;
        this.staff = staff;
        this.properties = properties;
        this.json = json;
        this.clock = clock;
    }

    /** One round: who was considered, who got the offer ({@code offered}, null when nobody did). */
    void round(DispatchEngine.Attempt attempt, int radius, List<OrderCore.Considered> considered, UUID offered,
               OffsetDateTime at) {
        List<Map<String, Object>> candidates = new ArrayList<>();
        for (OrderCore.Considered c : considered) {
            Map<String, Object> candidate = new LinkedHashMap<>();
            candidate.put("driver_id", c.driverId().toString());
            candidate.put("distance_m", c.distanceM());
            candidate.put("outcome", c.reason() != null ? "EXCLUDED"
                    : c.driverId().equals(offered) ? "OFFERED" : "ELIGIBLE");
            candidate.put("reason", c.reason());
            candidates.add(candidate);
        }
        jdbc.sql("""
                        insert into dispatch_round (id, order_id, attempt_id, phase, radius_m, at, candidates)
                        values (:id, :order, :attempt, :phase, :radius, :at, cast(:candidates as jsonb))""")
                .param("id", UUID.randomUUID()).param("order", attempt.orderId()).param("attempt", attempt.id())
                .param("phase", attempt.phase()).param("radius", radius).param("at", at)
                .param("candidates", json.writeValueAsString(candidates)).update();
    }

    /** Removes the rounds older than the retention; returns how many. */
    @Transactional
    int purge() {
        int purged = jdbc.sql("delete from dispatch_round where at < :before")
                .param("before", now().minus(properties.journalRetention())).update();
        if (purged > 0) {
            log.info("Purged {} dispatch journal rounds older than {}", purged, properties.journalRetention());
        }
        return purged;
    }

    @Override
    @Transactional(readOnly = true)
    public Journal of(Actor actor, UUID orderId) {
        UUID cityId = jdbc.sql("select city_id from ride_order where id = :id").param("id", orderId)
                .query(UUID.class).optional()
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Order not found"));
        staff.require(actor, Orders.VIEW_PERMISSION, cityId);
        record Row(UUID id, int generation, String phase, OffsetDateTime createdAt, OffsetDateTime stoppedAt) {
        }
        List<Row> attempts = jdbc.sql("""
                        select id, generation, phase, created_at, stopped_at from dispatch_attempt
                        where order_id = :id order by generation""")
                .param("id", orderId)
                .query((rs, i) -> new Row(rs.getObject(1, UUID.class), rs.getInt(2), rs.getString(3),
                        rs.getObject(4, OffsetDateTime.class), rs.getObject(5, OffsetDateTime.class)))
                .list();
        List<Attempt> result = new ArrayList<>();
        for (int i = 0; i < attempts.size(); i++) {
            Row a = attempts.get(i);
            OffsetDateTime until = i + 1 < attempts.size() ? attempts.get(i + 1).createdAt() : null;
            List<Offer> offers = jdbc.sql("""
                            select id, driver_id, distance_m, state, created_at, closed_at from offer
                            where attempt_id = :attempt order by created_at, id""")
                    .param("attempt", a.id())
                    .query((rs, n) -> new Offer(rs.getObject(1, UUID.class), rs.getObject(2, UUID.class),
                            (Integer) rs.getObject(3), "REJECTED".equals(rs.getString(4)) ? "DECLINED" : rs.getString(4),
                            rs.getObject(5, OffsetDateTime.class), rs.getObject(6, OffsetDateTime.class)))
                    .list();
            OffsetDateTime broadcastAt = jdbc.sql("""
                            select occurred_at from order_event
                            where order_id = :order and type = 'OrderBroadcast' and payload ->> 'attempt_id' = :attempt
                            order by occurred_at limit 1""")
                    .param("order", orderId).param("attempt", a.id().toString())
                    .query(OffsetDateTime.class).optional().orElse(null);
            OffsetDateTime assignedAt = jdbc.sql("""
                            select created_at from assignment
                            where order_id = :order and created_at >= :from
                              and (cast(:until as timestamptz) is null or created_at < :until)
                            order by created_at limit 1""")
                    .param("order", orderId).param("from", a.createdAt()).param("until", until)
                    .query(OffsetDateTime.class).optional().orElse(null);
            List<Round> rounds = jdbc.sql("""
                            select at, phase, radius_m, candidates::text from dispatch_round
                            where attempt_id = :attempt order by at, id""")
                    .param("attempt", a.id())
                    .query((rs, n) -> new Round(rs.getObject(1, OffsetDateTime.class), rs.getString(2), rs.getInt(3),
                            candidates(rs.getString(4))))
                    .list();
            String outcome = switch (a.phase()) {
                case "PERSONAL", "BROADCAST" -> "SEARCHING";
                case "EXHAUSTED" -> "EXHAUSTED";
                default -> assignedAt != null ? "ASSIGNED" : "STOPPED";
            };
            result.add(new Attempt(a.id(), a.generation(), a.createdAt(),
                    offers.isEmpty() ? null : offers.getFirst().offeredAt(), broadcastAt, assignedAt, a.stoppedAt(),
                    outcome, offers, rounds));
        }
        return new Journal(result);
    }

    @SuppressWarnings("unchecked")
    private List<Candidate> candidates(String text) {
        List<Candidate> list = new ArrayList<>();
        for (Object item : json.readValue(text, List.class)) {
            Map<String, Object> c = (Map<String, Object>) item;
            list.add(new Candidate(UUID.fromString((String) c.get("driver_id")),
                    c.get("distance_m") == null ? null : ((Number) c.get("distance_m")).intValue(),
                    (String) c.get("outcome"), (String) c.get("reason")));
        }
        return list;
    }

    private OffsetDateTime now() {
        return OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
    }
}
