package taxi.blizz.geo.internal;

import java.time.Clock;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.platform.RateLimitedException;

/** PostgreSQL-backed per-rider sliding window budget; no Redis in S-04 (REQ-SEC-03). */
@Service
class AddressSearchRateLimiter {

    private final JdbcClient jdbc;
    private final TransactionTemplate tx;
    private final AddressSearchProperties properties;
    private final Clock clock;

    AddressSearchRateLimiter(JdbcClient jdbc, TransactionTemplate tx, AddressSearchProperties properties, Clock clock) {
        this.jdbc = jdbc;
        this.tx = tx;
        this.properties = properties;
        this.clock = clock;
    }

    void acquire(UUID riderId) {
        tx.executeWithoutResult(status -> acquireLocked(riderId));
    }

    private void acquireLocked(UUID riderId) {
        OffsetDateTime now = OffsetDateTime.ofInstant(clock.instant(), ZoneOffset.UTC);
        OffsetDateTime since = now.minus(properties.window());
        jdbc.sql("select pg_advisory_xact_lock(hashtext(:key))")
                .param("key", "geo:address-search:" + riderId)
                .query().singleRow();
        jdbc.sql("delete from address_search_request where rider_id = :rider and requested_at <= :since")
                .param("rider", riderId)
                .param("since", since)
                .update();
        int used = jdbc.sql("select count(*) from address_search_request where rider_id = :rider")
                .param("rider", riderId)
                .query(Integer.class)
                .single();
        if (used >= properties.maxRequests()) {
            OffsetDateTime oldest = jdbc.sql("""
                            select min(requested_at) from address_search_request where rider_id = :rider
                            """)
                    .param("rider", riderId)
                    .query((rs, i) -> rs.getObject(1, OffsetDateTime.class))
                    .single();
            OffsetDateTime allowedAt = oldest.plus(properties.window());
            Duration retryAfter = Duration.between(now, allowedAt);
            throw new RateLimitedException("Too many address searches", retryAfter);
        }
        jdbc.sql("insert into address_search_request(rider_id, requested_at) values (:rider, :now)")
                .param("rider", riderId)
                .param("now", now)
                .update();
    }
}
