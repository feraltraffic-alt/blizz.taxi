package taxi.blizz.location.internal;

import java.time.Clock;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import taxi.blizz.platform.RateLimitedException;

@Service
class LocationBatchRateLimiter {

    private final JdbcClient jdbc;
    private final LocationProperties properties;
    private final Clock clock;

    LocationBatchRateLimiter(JdbcClient jdbc, LocationProperties properties, Clock clock) {
        this.jdbc = jdbc;
        this.properties = properties;
        this.clock = clock;
    }

    void acquire(UUID driverId) {
        OffsetDateTime now = OffsetDateTime.ofInstant(clock.instant(), ZoneOffset.UTC);
        OffsetDateTime since = now.minus(properties.batchWindow());
        jdbc.sql("select pg_advisory_xact_lock(hashtext(:key))")
                .param("key", "location:batch:" + driverId)
                .query().singleRow();
        jdbc.sql("delete from location_batch_request where driver_id = :driver and requested_at <= :since")
                .param("driver", driverId)
                .param("since", since)
                .update();
        int used = jdbc.sql("select count(*) from location_batch_request where driver_id = :driver")
                .param("driver", driverId)
                .query(Integer.class)
                .single();
        if (used >= properties.maxBatches()) {
            OffsetDateTime oldest = jdbc.sql("select min(requested_at) from location_batch_request where driver_id = :driver")
                    .param("driver", driverId)
                    .query((rs, i) -> rs.getObject(1, OffsetDateTime.class))
                    .single();
            Duration retryAfter = Duration.between(now, oldest.plus(properties.batchWindow()));
            throw new RateLimitedException("Too many location batches", retryAfter);
        }
        jdbc.sql("insert into location_batch_request(driver_id, requested_at) values (:driver, :now)")
                .param("driver", driverId)
                .param("now", now)
                .update();
    }
}
