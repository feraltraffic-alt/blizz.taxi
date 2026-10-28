package taxi.blizz.platform.internal;

import java.time.Clock;
import java.time.Duration;
import java.time.OffsetDateTime;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.platform.DatabaseGauges;

/**
 * The outbox (REQ-OBS-02/03: oldest waiting event, alert over 60 s) and the clock (REQ-OPSINF-11): how far this
 * instance's clock is from the database's — deadlines and tokens break when they drift apart.
 */
@Component
class PlatformGauges extends DatabaseGauges {

    PlatformGauges(JdbcClient jdbc, Clock clock) {
        gauge("blizz.outbox.pending", "Events waiting to be delivered",
                () -> jdbc.sql("select count(*) from outbox where state = 'PENDING'").query(Long.class).single());
        gauge("blizz.outbox.failed", "Events that could not be delivered",
                () -> jdbc.sql("select count(*) from outbox where state = 'FAILED'").query(Long.class).single());
        gauge("blizz.outbox.oldest.seconds", "Age of the oldest event waiting to be delivered",
                () -> jdbc.sql("""
                                select coalesce(extract(epoch from (now() - min(occurred_at))), 0)
                                from outbox where state = 'PENDING'""").query(Double.class).single());
        gauge("blizz.clock.skew.seconds", "This instance's clock minus the database's",
                () -> {
                    OffsetDateTime db = jdbc.sql("select now()").query(OffsetDateTime.class).single();
                    return Duration.between(db.toInstant(), clock.instant()).toMillis() / 1000.0;
                });
    }
}
