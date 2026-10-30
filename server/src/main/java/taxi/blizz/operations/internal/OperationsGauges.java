package taxi.blizz.operations.internal;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.platform.DatabaseGauges;

/**
 * The state of the line (REQ-OBS-02): orders looking for a car, trips under way, drivers on the line and how fresh
 * their positions are. Totals over all cities: per-city figures are the owner's reports, not monitoring.
 */
@Component
class OperationsGauges extends DatabaseGauges {

    OperationsGauges(JdbcClient jdbc, PresenceProperties presence) {
        gauge("blizz.orders.searching", "Orders looking for a driver",
                () -> jdbc.sql("select count(*) from ride_order where status = 'SEARCHING'").query(Long.class)
                        .single());
        gauge("blizz.orders.searching.oldest.seconds", "How long the oldest order has been looking for a driver",
                () -> jdbc.sql("""
                                select coalesce(extract(epoch from (now() - min(created_at))), 0)
                                from ride_order where status = 'SEARCHING'""").query(Double.class).single());
        gauge("blizz.assignments.active", "Orders with a driver assigned or on the trip",
                () -> jdbc.sql("select count(*) from ride_order where status in ('ASSIGNED', 'IN_SERVICE')")
                        .query(Long.class).single());
        gauge("blizz.drivers.online", "Drivers with an open or closing work session",
                () -> jdbc.sql("select count(*) from work_session where state in ('OPEN', 'CLOSING')")
                        .query(Long.class).single());
        long freshSeconds = presence.gpsMaxAge().toSeconds();
        gauge("blizz.drivers.online.stale_location", "Drivers on the line whose last position is not fresh",
                () -> jdbc.sql("""
                                select count(*) from work_session
                                where state in ('OPEN', 'CLOSING')
                                  and (last_location_at is null or location_refused_at is not null
                                       or last_location_at < now() - make_interval(secs => :fresh))""")
                        .param("fresh", freshSeconds).query(Long.class).single());
    }
}
