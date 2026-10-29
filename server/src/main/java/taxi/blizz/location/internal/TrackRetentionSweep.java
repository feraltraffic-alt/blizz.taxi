package taxi.blizz.location.internal;

import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.location.TrackRetention;

/**
 * Deletes GPS track points after their retention (REQ-PRV-02, issue #81), in batches and safe on several instances
 * ({@code SKIP LOCKED}).
 * <ol>
 *   <li>Points outside a trip older than {@code off-trip}: a point that turns out to lie inside a trip window gets
 *       the trip's order and stays for {@code trip}; the rest are deleted.</li>
 *   <li>Points of a trip older than {@code trip}: when the order is disputed (an open support case, a risk flag) the
 *       points are marked kept — evidence, never deleted; the rest are deleted.</li>
 * </ol>
 * The rate-limit rows of location batches older than a day go too.
 *
 * <p>The age of a point is counted from when the server received it, never from the phone's clock (audit 29.10.2026,
 * #112): a point dated 2099 was never deleted, and a phone two days behind lost its trip points within minutes. The
 * phone's time still decides which trip a point belongs to.
 */
@Service
class TrackRetentionSweep {

    private static final Logger log = LoggerFactory.getLogger(TrackRetentionSweep.class);

    private final JdbcClient jdbc;
    private final TransactionTemplate tx;
    private final List<TrackRetention> sources;
    private final TrackRetentionProperties properties;
    private final Clock clock;

    TrackRetentionSweep(JdbcClient jdbc, TransactionTemplate tx, List<TrackRetention> sources,
                        TrackRetentionProperties properties, Clock clock) {
        this.jdbc = jdbc;
        this.tx = tx;
        this.sources = sources;
        this.properties = properties;
        this.clock = clock;
    }

    record Result(int tagged, int kept, int deleted) {
        Result plus(Result other) {
            return new Result(tagged + other.tagged, kept + other.kept, deleted + other.deleted);
        }
    }

    private record Point(UUID id, UUID driverId, OffsetDateTime recordedAt, UUID orderId) {
    }

    /** Runs both steps until nothing is due, at most {@code maxBatches} batches each. */
    Result run(int maxBatches) {
        Result total = new Result(0, 0, 0);
        for (int i = 0; i < maxBatches; i++) {
            Result step = offTripBatch();
            total = total.plus(step);
            if (step.tagged() + step.deleted() < properties.batch()) {
                break;
            }
        }
        for (int i = 0; i < maxBatches; i++) {
            Result step = tripBatch();
            total = total.plus(step);
            if (step.kept() + step.deleted() < properties.batch()) {
                break;
            }
        }
        int requests = jdbc.sql("delete from location_batch_request where requested_at < :before")
                .param("before", now().minusDays(1)).update();
        if (total.deleted() > 0 || total.kept() > 0 || requests > 0) {
            log.info("Track retention: {} points deleted, {} moved to their trip, {} kept as evidence, "
                    + "{} batch records removed", total.deleted(), total.tagged(), total.kept(), requests);
        }
        return total;
    }

    /** Step 1, one batch in one transaction. */
    Result offTripBatch() {
        return tx.execute(status -> {
            OffsetDateTime before = now().minus(properties.offTrip());
            List<Point> points = jdbc.sql("""
                            select id, driver_id, recorded_at from track_point
                            where order_id is null and received_at < :before
                            order by received_at limit :limit
                            for update skip locked""")
                    .param("before", before).param("limit", properties.batch())
                    .query((rs, i) -> new Point(rs.getObject(1, UUID.class), rs.getObject(2, UUID.class),
                            rs.getObject(3, OffsetDateTime.class), null))
                    .list();
            if (points.isEmpty()) {
                return new Result(0, 0, 0);
            }
            Set<UUID> drivers = new HashSet<>();
            OffsetDateTime from = points.getFirst().recordedAt();
            OffsetDateTime to = from;
            for (Point p : points) {
                drivers.add(p.driverId());
                from = p.recordedAt().isBefore(from) ? p.recordedAt() : from;
                to = p.recordedAt().isAfter(to) ? p.recordedAt() : to;
            }
            List<TrackRetention.TripWindow> windows = new ArrayList<>();
            for (TrackRetention source : sources) {
                windows.addAll(source.trips(drivers, from, to));
            }
            List<UUID> delete = new ArrayList<>();
            java.util.Map<UUID, List<UUID>> byOrder = new java.util.HashMap<>();
            for (Point p : points) {
                UUID order = windows.stream()
                        .filter(w -> w.driverId().equals(p.driverId()) && !p.recordedAt().isBefore(w.from())
                                && (w.to() == null || !p.recordedAt().isAfter(w.to())))
                        .map(TrackRetention.TripWindow::orderId).findFirst().orElse(null);
                if (order == null) {
                    delete.add(p.id());
                } else {
                    byOrder.computeIfAbsent(order, o -> new ArrayList<>()).add(p.id());
                }
            }
            int tagged = 0;
            for (var entry : byOrder.entrySet()) {
                tagged += jdbc.sql("update track_point set order_id = :order where id = any(cast(:ids as uuid[]))")
                        .param("order", entry.getKey()).param("ids", entry.getValue().toArray(UUID[]::new)).update();
            }
            return new Result(tagged, 0, delete(delete));
        });
    }

    /** Step 2, one batch in one transaction. */
    Result tripBatch() {
        return tx.execute(status -> {
            OffsetDateTime before = now().minus(properties.trip());
            List<Point> points = jdbc.sql("""
                            select id, driver_id, recorded_at, order_id from track_point
                            where order_id is not null and not kept and received_at < :before
                            order by received_at limit :limit
                            for update skip locked""")
                    .param("before", before).param("limit", properties.batch())
                    .query((rs, i) -> new Point(rs.getObject(1, UUID.class), rs.getObject(2, UUID.class),
                            rs.getObject(3, OffsetDateTime.class), rs.getObject(4, UUID.class)))
                    .list();
            if (points.isEmpty()) {
                return new Result(0, 0, 0);
            }
            Set<UUID> orders = new HashSet<>();
            points.forEach(p -> orders.add(p.orderId()));
            Set<UUID> held = new HashSet<>();
            for (TrackRetention source : sources) {
                held.addAll(source.held(orders));
            }
            List<UUID> delete = new ArrayList<>();
            List<UUID> keep = new ArrayList<>();
            for (Point p : points) {
                (held.contains(p.orderId()) ? keep : delete).add(p.id());
            }
            if (!keep.isEmpty()) {
                jdbc.sql("update track_point set kept = true where id = any(cast(:ids as uuid[]))")
                        .param("ids", keep.toArray(UUID[]::new)).update();
            }
            return new Result(0, keep.size(), delete(delete));
        });
    }

    private int delete(List<UUID> ids) {
        if (ids.isEmpty()) {
            return 0;
        }
        return jdbc.sql("delete from track_point where id = any(cast(:ids as uuid[]))")
                .param("ids", ids.toArray(UUID[]::new)).update();
    }

    private OffsetDateTime now() {
        return OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
    }
}
