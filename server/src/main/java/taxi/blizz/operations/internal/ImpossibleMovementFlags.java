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
 * The first automatic risk source (REQ-DS-08, issue #71): {@code DriverPositionJumped} from location becomes an
 * IMPOSSIBLE_MOVEMENT flag when the speed is above {@code blizz.risk.impossible-speed-kph} over more than
 * {@code min-distance-m}, in the driver's work session at that moment — at most one flag per work session and hour.
 * A jump outside any work session is not a case. Nothing happens to the trip or the driver.
 */
@Component
class ImpossibleMovementFlags implements OutboxHandler {

    private static final Logger log = LoggerFactory.getLogger(ImpossibleMovementFlags.class);

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
        if (jump.speedKph() <= properties.impossibleSpeedKph() || jump.distanceM() <= properties.minDistanceMeters()) {
            return; // fast, but possible — a highway
        }
        Optional<Shift> shift = jdbc.sql("""
                        select id, city_id from work_session
                        where driver_id = :driver and opened_at <= :at and (closed_at is null or closed_at >= :at)
                        order by (device_session_id = :device) desc, opened_at desc
                        limit 1""")
                .param("driver", jump.driverId()).param("at", jump.recordedAt())
                .param("device", jump.deviceSessionId())
                .query((rs, i) -> new Shift(rs.getObject(1, UUID.class), rs.getObject(2, UUID.class)))
                .optional();
        if (shift.isEmpty()) {
            log.info("A position jump of driver {} outside a work session is not flagged", jump.driverId());
            return;
        }
        OffsetDateTime hour = jump.recordedAt().withOffsetSameInstant(ZoneOffset.UTC).truncatedTo(ChronoUnit.HOURS);
        Map<String, Object> evidence = new LinkedHashMap<>();
        evidence.put("work_session_id", shift.get().id().toString());
        evidence.put("track_point_id", jump.trackPointId().toString());
        evidence.put("distance_m", jump.distanceM());
        evidence.put("seconds", jump.seconds());
        evidence.put("speed_kph", jump.speedKph());
        evidence.put("recorded_at", jump.recordedAt().withOffsetSameInstant(ZoneOffset.UTC).toString());
        flags.raiseAutomatic(jump.driverId(), shift.get().cityId(), DriverRiskFlags.Kind.IMPOSSIBLE_MOVEMENT, evidence,
                "IMPOSSIBLE_MOVEMENT:" + shift.get().id() + ":" + hour, jump.recordedAt());
    }
}
