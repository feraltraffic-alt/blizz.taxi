package taxi.blizz.operations.internal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.operations.DriverRiskFlags;
import taxi.blizz.platform.OutboxHandler;
import taxi.blizz.platform.OutboxMessage;
import tools.jackson.databind.json.JsonMapper;

/**
 * The first automatic risk source (REQ-DS-08, issue #71): {@code DriverPositionJumped} from location, and a heartbeat
 * refused as an impossible movement (issue #102, {@link #raise}), becomes an
 * IMPOSSIBLE_MOVEMENT flag when the speed is above {@code blizz.risk.impossible-speed-kph} over more than
 * {@code min-distance-m}, in the driver's work session at that moment — at most one flag per work session and hour.
 * A jump outside any work session is not a case. Nothing happens to the trip or the driver.
 */
@Component
class ImpossibleMovementFlags implements OutboxHandler {

    private static final Logger log = LoggerFactory.getLogger(ImpossibleMovementFlags.class);
    /** A phone's clock is not the server's: a point stamped just before the shift opened still belongs to it. */
    private static final String SKEW = "2 minutes";

    private final JdbcClient jdbc;
    private final JdbcDriverRiskFlags flags;
    private final RiskProperties properties;
    private final JsonMapper json;

    ImpossibleMovementFlags(JdbcClient jdbc, JdbcDriverRiskFlags flags, RiskProperties properties, JsonMapper json) {
        this.jdbc = jdbc;
        this.flags = flags;
        this.properties = properties;
        this.json = json;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    record Jumped(UUID driverId, UUID deviceSessionId, UUID trackPointId, int distanceM, double seconds, int speedKph,
                  OffsetDateTime recordedAt) {
    }

    private record Shift(UUID id, UUID cityId) {
    }

    @Override
    public String consumerId() {
        return "operations.impossible-movement-flags";
    }

    @Override
    public boolean supports(String eventType) {
        return "DriverPositionJumped".equals(eventType);
    }

    @Override
    public void handle(OutboxMessage message) {
        Jumped jump = json.readValue(message.payload(), Jumped.class);
        if (!impossible(jump.distanceM(), jump.speedKph())) {
            return; // fast, but possible — a highway
        }
        Optional<Shift> shift = jdbc.sql("""
                        select id, city_id from work_session
                        where driver_id = :driver
                          and opened_at <= cast(:at as timestamptz) + cast(:skew as interval)
                          and (closed_at is null or closed_at >= cast(:at as timestamptz) - cast(:skew as interval))
                        order by (device_session_id = :device) desc, opened_at desc
                        limit 1""")
                .param("driver", jump.driverId()).param("at", jump.recordedAt()).param("skew", SKEW)
                .param("device", jump.deviceSessionId())
                .query((rs, i) -> new Shift(rs.getObject(1, UUID.class), rs.getObject(2, UUID.class)))
                .optional();
        if (shift.isEmpty()) {
            log.info("A position jump of driver {} outside a work session is not flagged", jump.driverId());
            return;
        }
        raise(jump.driverId(), shift.get().id(), shift.get().cityId(), jump.distanceM(), jump.seconds(),
                jump.speedKph(), jump.recordedAt(), Map.of("track_point_id", jump.trackPointId().toString()));
    }

    /** Above the speed over more than the distance: a short GPS glitch or a highway is not a case. */
    boolean impossible(int distanceM, int speedKph) {
        return speedKph > properties.impossibleSpeedKph() && distanceM > properties.minDistanceMeters();
    }

    /**
     * The flag for a movement in a shift, from the track or from the heartbeat (issue #102): at most one per shift and
     * hour whatever reported it. {@code source} names what reported it — ids only, never the coordinates.
     */
    void raise(UUID driverId, UUID shiftId, UUID cityId, int distanceM, double seconds, int speedKph,
               OffsetDateTime at, Map<String, Object> source) {
        if (!impossible(distanceM, speedKph)) {
            return;
        }
        OffsetDateTime hour = at.withOffsetSameInstant(ZoneOffset.UTC).truncatedTo(ChronoUnit.HOURS);
        Map<String, Object> evidence = new LinkedHashMap<>();
        evidence.put("work_session_id", shiftId.toString());
        evidence.putAll(source);
        evidence.put("distance_m", distanceM);
        evidence.put("seconds", seconds);
        evidence.put("speed_kph", speedKph);
        evidence.put("recorded_at", at.withOffsetSameInstant(ZoneOffset.UTC).toString());
        flags.raiseAutomatic(driverId, cityId, DriverRiskFlags.Kind.IMPOSSIBLE_MOVEMENT, evidence,
                "IMPOSSIBLE_MOVEMENT:" + shiftId + ":" + hour, at);
    }
}
