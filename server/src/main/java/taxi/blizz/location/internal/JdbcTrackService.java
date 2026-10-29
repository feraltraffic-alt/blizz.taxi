package taxi.blizz.location.internal;

import java.sql.Array;
import java.sql.SQLException;
import java.time.Clock;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import taxi.blizz.location.TrackService;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;
import taxi.blizz.platform.Outbox;
import taxi.blizz.platform.OutboxEvent;
import taxi.blizz.platform.SubjectType;

@Service
class JdbcTrackService implements TrackService {

    private static final double EARTH_RADIUS_M = 6_371_000.0;

    private final JdbcClient jdbc;
    private final IdempotentCommands commands;
    private final LocationBatchRateLimiter rateLimiter;
    private final LocationProperties properties;
    private final Outbox outbox;
    private final Clock clock;

    JdbcTrackService(JdbcClient jdbc, IdempotentCommands commands, LocationBatchRateLimiter rateLimiter,
                     LocationProperties properties, Outbox outbox, Clock clock) {
        this.jdbc = jdbc;
        this.commands = commands;
        this.rateLimiter = rateLimiter;
        this.properties = properties;
        this.outbox = outbox;
        this.clock = clock;
    }

    private record StoreRequest(UUID deviceSessionId, List<InputPoint> points) {
        StoreRequest {
            points = List.copyOf(points);
        }
    }

    private record Previous(OffsetDateTime recordedAt, double lat, double lon, boolean good) {
    }

    /** A move between two points of good accuracy and no future time faster than the jump limit (issue #71). */
    private record Jump(int distanceM, double seconds, int kph) {
    }

    private record Checked(Set<Flag> flags, Jump jump) {
    }

    @Override
    public BatchResult store(Actor driver, UUID deviceSessionId, UUID commandId, List<InputPoint> points) {
        if (driver == null || driver.type() != SubjectType.DRIVER || driver.id() == null) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Only a driver uploads a track");
        }
        if (deviceSessionId == null || commandId == null || points == null || points.isEmpty() || points.size() > 100) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "A batch has 1 to 100 points");
        }
        StoreRequest request = new StoreRequest(deviceSessionId, points);
        return commands.execute(new CommandKey(driver, "location.store-batch", commandId), request, BatchResult.class,
                () -> storeNew(driver.id(), deviceSessionId, points));
    }

    private BatchResult storeNew(UUID driverId, UUID deviceSessionId, List<InputPoint> input) {
        rateLimiter.acquire(driverId);
        OffsetDateTime receivedAt = OffsetDateTime.ofInstant(clock.instant(), ZoneOffset.UTC);
        List<InputPoint> ordered = new ArrayList<>(input);
        ordered.sort(Comparator.comparing(InputPoint::recordedAt).thenComparingLong(InputPoint::sequence));

        int accepted = 0;
        int duplicates = 0;
        int flagged = 0;
        for (InputPoint point : ordered) {
            Checked checked = flagsFor(deviceSessionId, point, receivedAt);
            Set<Flag> flags = checked.flags();
            UUID pointId = UUID.randomUUID();
            int inserted = jdbc.sql("""
                    insert into track_point(id, driver_id, device_session_id, sequence, recorded_at, received_at,
                                            point, accuracy_m, speed_mps, heading_deg, flags)
                    values (:id, :driver, :session, :sequence, :recorded, :received,
                            ST_SetSRID(ST_MakePoint(:lon, :lat), 4326), :accuracy, :speed, :heading,
                            case when :flags = '' then ARRAY[]::text[] else string_to_array(:flags, ',') end)
                    on conflict (device_session_id, sequence) do nothing
                    """)
                    .param("id", pointId)
                    .param("driver", driverId)
                    .param("session", deviceSessionId)
                    .param("sequence", point.sequence())
                    .param("recorded", point.recordedAt())
                    .param("received", receivedAt)
                    .param("lon", point.lon())
                    .param("lat", point.lat())
                    .param("accuracy", point.accuracyM())
                    .param("speed", point.speedMps())
                    .param("heading", point.headingDeg())
                    .param("flags", flags.stream().map(Enum::name).sorted().reduce((a, b) -> a + "," + b).orElse(""))
                    .update();
            if (inserted == 0) {
                duplicates++;
            } else {
                accepted++;
                if (!flags.isEmpty()) flagged++;
                if (checked.jump() != null) {
                    jumped(driverId, deviceSessionId, pointId, point, checked.jump());
                }
            }
        }
        return new BatchResult(accepted, duplicates, flagged);
    }

    /**
     * For the risk flags (REQ-DS-08, issue #71): ids and numbers only — never the coordinates. operations decides
     * whether it is an impossible movement; nothing else happens to the driver here.
     */
    private void jumped(UUID driverId, UUID deviceSessionId, UUID pointId, InputPoint point, Jump jump) {
        Map<String, Object> payload = new LinkedHashMap<>();
        payload.put("driver_id", driverId.toString());
        payload.put("device_session_id", deviceSessionId.toString());
        payload.put("track_point_id", pointId.toString());
        payload.put("distance_m", jump.distanceM());
        payload.put("seconds", jump.seconds());
        payload.put("speed_kph", jump.kph());
        payload.put("recorded_at", point.recordedAt().withOffsetSameInstant(ZoneOffset.UTC).toString());
        outbox.publish(new OutboxEvent("DriverPositionJumped", 1, "Driver", driverId, 0, payload));
    }

    private Checked flagsFor(UUID deviceSessionId, InputPoint point, OffsetDateTime receivedAt) {
        EnumSet<Flag> flags = EnumSet.noneOf(Flag.class);
        if (point.recordedAt().isAfter(receivedAt.plus(properties.futureTolerance()))) {
            flags.add(Flag.FUTURE);
        }
        if (point.accuracyM() > properties.poorAccuracyMeters()) {
            flags.add(Flag.POOR_ACCURACY);
        }
        Jump[] jump = new Jump[1];
        jdbc.sql("""
                select recorded_at, ST_Y(point) as lat, ST_X(point) as lon,
                       not (flags && ARRAY['POOR_ACCURACY', 'FUTURE']::text[]) as good
                from track_point
                where device_session_id = :session
                  and (recorded_at < :recorded or (recorded_at = :recorded and sequence < :sequence))
                order by recorded_at desc, sequence desc
                limit 1
                """)
                .param("session", deviceSessionId)
                .param("recorded", point.recordedAt())
                .param("sequence", point.sequence())
                .query((rs, i) -> new Previous(rs.getObject("recorded_at", OffsetDateTime.class),
                        rs.getDouble("lat"), rs.getDouble("lon"), rs.getBoolean("good")))
                .optional()
                .ifPresent(previous -> {
                    double seconds = Duration.between(previous.recordedAt(), point.recordedAt()).toMillis() / 1000.0;
                    if (seconds > 0) {
                        double meters = haversineMeters(previous.lat(), previous.lon(), point.lat(), point.lon());
                        double kph = meters / seconds * 3.6;
                        if (kph > properties.jumpKph()) {
                            flags.add(Flag.JUMP);
                            if (previous.good() && !flags.contains(Flag.POOR_ACCURACY)
                                    && !flags.contains(Flag.FUTURE)) {
                                jump[0] = new Jump((int) Math.round(meters), seconds, (int) Math.round(kph));
                            }
                        }
                    }
                });
        return new Checked(flags, jump[0]);
    }

    @Override
    public List<TrackPoint> points(UUID driverId, OffsetDateTime from, OffsetDateTime to) {
        return jdbc.sql("""
                select driver_id, device_session_id, sequence, recorded_at, received_at,
                       ST_Y(point) as lat, ST_X(point) as lon, accuracy_m, speed_mps, heading_deg, flags
                from track_point
                where driver_id = :driver and recorded_at >= :from and recorded_at <= :to
                order by recorded_at, sequence
                """)
                .param("driver", driverId)
                .param("from", from)
                .param("to", to)
                .query((rs, i) -> new TrackPoint(
                        rs.getObject("driver_id", UUID.class),
                        rs.getObject("device_session_id", UUID.class),
                        rs.getLong("sequence"), rs.getDouble("lat"), rs.getDouble("lon"),
                        rs.getDouble("accuracy_m"), (Double) rs.getObject("speed_mps"),
                        (Double) rs.getObject("heading_deg"),
                        rs.getObject("recorded_at", OffsetDateTime.class),
                        rs.getObject("received_at", OffsetDateTime.class), flags(rs.getArray("flags"))))
                .list();
    }

    @Override
    public Summary summary(UUID driverId, OffsetDateTime from, OffsetDateTime to) {
        return jdbc.sql("""
                        select count(*) as points,
                               count(*) filter (where cardinality(flags) > 0) as flagged,
                               min(recorded_at) as first, max(recorded_at) as last,
                               coalesce(round(ST_Length(ST_MakeLine(point order by recorded_at, sequence)
                                   filter (where not flags && array['JUMP', 'FUTURE']::text[])::geography)), 0)
                                   as length
                        from track_point
                        where driver_id = :driver and recorded_at >= :from and recorded_at <= :to""")
                .param("driver", driverId).param("from", from).param("to", to)
                .query((rs, i) -> new Summary(rs.getLong("points"), rs.getLong("flagged"),
                        rs.getObject("first", OffsetDateTime.class), rs.getObject("last", OffsetDateTime.class),
                        rs.getLong("length")))
                .single();
    }

    private static Set<Flag> flags(Array array) throws SQLException {
        EnumSet<Flag> result = EnumSet.noneOf(Flag.class);
        if (array == null) return result;
        for (String value : (String[]) array.getArray()) result.add(Flag.valueOf(value));
        return result;
    }

    private static double haversineMeters(double lat1, double lon1, double lat2, double lon2) {
        double p1 = Math.toRadians(lat1);
        double p2 = Math.toRadians(lat2);
        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2)
                + Math.cos(p1) * Math.cos(p2) * Math.sin(dLon / 2) * Math.sin(dLon / 2);
        return 2 * EARTH_RADIUS_M * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
    }
}
