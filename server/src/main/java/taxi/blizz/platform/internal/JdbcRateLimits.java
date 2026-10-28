package taxi.blizz.platform.internal;

import java.time.Clock;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.RateLimitedException;
import taxi.blizz.platform.RateLimits;
import taxi.blizz.platform.SubjectType;

/** See {@link RateLimits}: a sliding window in PostgreSQL, serialized per subject and bucket. */
@Service
@EnableConfigurationProperties(RateLimitProperties.class)
class JdbcRateLimits implements RateLimits {

    private final JdbcClient jdbc;
    private final TransactionTemplate tx;
    private final RateLimitProperties properties;
    private final Clock clock;

    JdbcRateLimits(JdbcClient jdbc, TransactionTemplate tx, RateLimitProperties properties, Clock clock) {
        this.jdbc = jdbc;
        this.tx = tx;
        this.properties = properties;
        this.clock = clock;
    }

    @Override
    public void acquire(String bucket, Actor subject) {
        if (subject == null || (subject.type() != SubjectType.CLIENT && subject.type() != SubjectType.DRIVER)) {
            return;
        }
        RateLimitProperties.Limit limit = properties.of(bucket);
        tx.executeWithoutResult(status -> {
            OffsetDateTime now = clock.instant().truncatedTo(ChronoUnit.MICROS).atOffset(ZoneOffset.UTC);
            OffsetDateTime since = now.minus(limit.window());
            jdbc.sql("select pg_advisory_xact_lock(hashtext(:key))")
                    .param("key", "rate-limit:" + bucket + ":" + subject.id()).query().singleRow();
            jdbc.sql("delete from rate_limit_hit where bucket = :bucket and subject_id = :subject and at <= :since")
                    .param("bucket", bucket).param("subject", subject.id()).param("since", since).update();
            int used = jdbc.sql("select count(*) from rate_limit_hit where bucket = :bucket and subject_id = :subject")
                    .param("bucket", bucket).param("subject", subject.id()).query(Integer.class).single();
            if (used >= limit.max()) {
                OffsetDateTime oldest = jdbc.sql("""
                                select min(at) from rate_limit_hit where bucket = :bucket and subject_id = :subject""")
                        .param("bucket", bucket).param("subject", subject.id())
                        .query((rs, i) -> rs.getObject(1, OffsetDateTime.class)).single();
                throw new RateLimitedException("Too many requests of this kind; try again later",
                        Duration.between(now, oldest.plus(limit.window())));
            }
            jdbc.sql("insert into rate_limit_hit (bucket, subject_id, at) values (:bucket, :subject, :now)")
                    .param("bucket", bucket).param("subject", subject.id()).param("now", now).update();
        });
    }
}
