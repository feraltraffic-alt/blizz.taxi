package taxi.blizz.operations.internal;

import java.time.Clock;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.UUID;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.operations.Orders;

/**
 * The call centre's map of the cars on the line (REQ-OPS-01, operator.v1.yaml): every driver with an open or closing
 * work session in the city, with the car, what the driver is doing and the last known position. The panel polls it;
 * positions are shown, not stored anew (REQ-PRV-02). A phone number is not shown: the operator calls through the
 * order. Reads {@code driver} and {@code vehicle} as ADR 0004 allows for operations.
 */
@RestController
class LiveDriverBoard {

    private final JdbcClient jdbc;
    private final StaffAccess staff;
    private final PresenceProperties presence;
    private final Clock clock;

    LiveDriverBoard(JdbcClient jdbc, StaffAccess staff, PresenceProperties presence, Clock clock) {
        this.jdbc = jdbc;
        this.staff = staff;
        this.presence = presence;
        this.clock = clock;
    }

    record Car(String registrationNumber, String make, String model, String color, List<String> classes) {
    }

    record Point(double lat, double lon) {
    }

    /**
     * {@code status}: FREE (may get an order now), ON_ORDER, PAUSED (not accepting), CLOSING (finishing the last
     * order), NO_SIGNAL (connection or position lost). {@code connection} and {@code geolocation} as in the driver's
     * own state (section 12.1).
     */
    record LiveDriver(UUID driverId, String name, Car car, boolean hasPaymentTerminal, String status,
                      String occupancy, String connection, String geolocation, Point location,
                      OffsetDateTime lastLocationAt, UUID orderId) {
    }

    record Board(UUID cityId, OffsetDateTime at, List<LiveDriver> drivers) {
    }

    @GetMapping("/api/operator/v1/drivers/live")
    ResponseEntity<Board> board(AccessClaims claims, @RequestParam("city_id") UUID cityId) {
        staff.require(claims.actor(), Orders.VIEW_PERMISSION, cityId);
        OffsetDateTime now = clock.instant().atOffset(ZoneOffset.UTC);
        List<LiveDriver> drivers = jdbc.sql("""
                        select ws.driver_id, d.name, d.has_payment_terminal, v.registration_number, v.make, v.model,
                               v.color, v.class_approvals, ws.state, ws.intent, ws.last_heartbeat_at,
                               ws.last_location_at, ST_Y(ws.last_location) as lat, ST_X(ws.last_location) as lon,
                               coalesce(c.occupancy, 'FREE') as occupancy,
                               (select a.order_id from assignment a
                                where a.driver_id = ws.driver_id and a.state in ('RESERVED', 'COMMITTED')
                                limit 1) as order_id
                        from work_session ws
                        join driver d on d.id = ws.driver_id
                        left join vehicle v on v.id = ws.vehicle_id
                        left join driver_capacity c on c.driver_id = ws.driver_id
                        where ws.city_id = :city and ws.state in ('OPEN', 'CLOSING')
                        order by d.name nulls last, ws.driver_id""")
                .param("city", cityId)
                .query((rs, i) -> {
                    OffsetDateTime heartbeat = rs.getObject("last_heartbeat_at", OffsetDateTime.class);
                    OffsetDateTime located = rs.getObject("last_location_at", OffsetDateTime.class);
                    String connection = connection(heartbeat, now);
                    String geolocation = located == null ? "UNAVAILABLE"
                            : Duration.between(located, now).compareTo(presence.gpsMaxAge()) <= 0 ? "FRESH" : "STALE";
                    String occupancy = rs.getString("occupancy");
                    java.sql.Array classes = rs.getArray("class_approvals");
                    Car car = rs.getString("registration_number") == null ? null
                            : new Car(rs.getString("registration_number"), rs.getString("make"), rs.getString("model"),
                            rs.getString("color"), classes == null ? List.of()
                            : List.of((String[]) classes.getArray()));
                    Point point = rs.getObject("lat") == null ? null : new Point(rs.getDouble("lat"), rs.getDouble("lon"));
                    return new LiveDriver(rs.getObject("driver_id", UUID.class), rs.getString("name"), car,
                            rs.getBoolean("has_payment_terminal"),
                            status(rs.getString("state"), rs.getString("intent"), occupancy, connection, geolocation),
                            occupancy, connection, geolocation, point, located, rs.getObject("order_id", UUID.class));
                })
                .list();
        return ResponseEntity.ok(new Board(cityId, now, drivers));
    }

    private String connection(OffsetDateTime heartbeat, OffsetDateTime now) {
        if (heartbeat == null) {
            return "DISCONNECTED";
        }
        Duration age = Duration.between(heartbeat, now);
        return age.compareTo(presence.stale()) <= 0 ? "CONNECTED"
                : age.compareTo(presence.disconnected()) <= 0 ? "STALE" : "DISCONNECTED";
    }

    private static String status(String state, String intent, String occupancy, String connection,
                                 String geolocation) {
        if (!"FREE".equals(occupancy)) {
            return "ON_ORDER";
        }
        if ("CLOSING".equals(state)) {
            return "CLOSING";
        }
        if (!"CONNECTED".equals(connection) || !"FRESH".equals(geolocation)) {
            return "NO_SIGNAL";
        }
        return "ACCEPTING".equals(intent) ? "FREE" : "PAUSED";
    }
}
