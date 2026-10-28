package taxi.blizz.location.internal;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.platform.DatabaseGauges;

/**
 * GPS track retention (REQ-PRV-02, issue #81, runbook docs/runbooks/orders-and-gps.md): the age of the oldest point
 * outside a trip — well above {@code blizz.location.retention.off-trip} means the clean-up stopped.
 */
@Component
class TrackGauges extends DatabaseGauges {

    TrackGauges(JdbcClient jdbc) {
        gauge("blizz.location.oldest_off_trip.seconds", "Age of the oldest GPS point outside a trip",
                () -> jdbc.sql("""
                                select coalesce(extract(epoch from now() - min(recorded_at)), 0)
                                from track_point where order_id is null""").query(Double.class).single());
    }
}
