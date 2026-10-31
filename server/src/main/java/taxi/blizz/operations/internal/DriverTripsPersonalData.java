package taxi.blizz.operations.internal;

import java.time.OffsetDateTime;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.platform.DriverPersonalData;

/**
 * The driver's trips for the copy of their data (issue #144): the order's number, city, class, prices and payment
 * method, and the trip's times. Nothing of the rider: no name, phone, points, labels, note, entrance or messages.
 */
@Component
class DriverTripsPersonalData implements DriverPersonalData {

    private final JdbcClient jdbc;

    DriverTripsPersonalData(JdbcClient jdbc) {
        this.jdbc = jdbc;
    }

    record Trip(UUID tripId, long orderNumber, UUID cityId, String vehicleClass, String phase,
                OffsetDateTime acceptedAt, OffsetDateTime arrivedAt, OffsetDateTime startedAt,
                OffsetDateTime completedAt, Long priceMinor, Long finalPriceMinor, String currency,
                String paymentMethod) {
    }

    @Override
    public String section() {
        return "trips";
    }

    @Override
    public Object of(Subject subject) {
        return jdbc.sql("""
                        select t.id, o.short_number, o.city_id, o.vehicle_class, t.phase, a.created_at, t.arrived_at,
                               t.started_at, t.completed_at, o.price_minor, o.final_price_minor, o.currency,
                               o.payment_method
                        from assignment a
                        join trip t on t.assignment_id = a.id
                        join ride_order o on o.id = a.order_id
                        where a.driver_id = :id
                        order by a.created_at, t.id""")
                .param("id", subject.driverId())
                .query((rs, i) -> new Trip(rs.getObject(1, UUID.class), rs.getLong(2), rs.getObject(3, UUID.class),
                        rs.getString(4), rs.getString(5), rs.getObject(6, OffsetDateTime.class),
                        rs.getObject(7, OffsetDateTime.class), rs.getObject(8, OffsetDateTime.class),
                        rs.getObject(9, OffsetDateTime.class), (Long) rs.getObject(10), (Long) rs.getObject(11),
                        rs.getString(12), rs.getString(13)))
                .list();
    }
}
