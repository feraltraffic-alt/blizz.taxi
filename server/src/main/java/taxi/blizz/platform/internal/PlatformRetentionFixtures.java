package taxi.blizz.platform.internal;

import java.nio.charset.StandardCharsets;
import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.UUID;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.platform.SandboxRetentionData;

@Component
@Profile("sandbox")
class PlatformRetentionFixtures implements SandboxRetentionData {

    private final JdbcClient jdbc;
    private final Clock clock;

    PlatformRetentionFixtures(JdbcClient jdbc, Clock clock) {
        this.jdbc = jdbc;
        this.clock = clock;
    }

    @Override
    @Transactional
    public Counts create(UUID fixture) {
        OffsetDateTime now = OffsetDateTime.ofInstant(clock.instant(), ZoneOffset.UTC);
        for (String kind : new String[] {"old", "recent", "failed"}) {
            UUID id = UUID.nameUUIDFromBytes((fixture + ":" + kind).getBytes(StandardCharsets.UTF_8));
            OffsetDateTime at = kind.equals("recent") ? now : now.minusDays(400);
            jdbc.sql("""
                            insert into outbox(event_id,event_type,schema_version,aggregate_type,aggregate_id,
                              aggregate_version,payload,correlation_id,occurred_at,state,next_attempt_at,completed_at)
                            values(:id,'RetentionSandboxFixture',1,'RetentionSandbox',:fixture,0,'{}',:fixture,:at,
                              :state,:at,:at)
                            on conflict(event_id) do nothing
                            """)
                    .param("id", id).param("fixture", fixture).param("at", at)
                    .param("state", kind.equals("failed") ? "FAILED" : "DONE").update();
        }
        return counts(fixture);
    }

    @Override
    public Counts counts(UUID fixture) {
        return jdbc.sql("""
                        select count(*) filter(where state='DONE' and completed_at<:old),
                          count(*) filter(where state='DONE' and completed_at>=:old),
                          count(*) filter(where state='FAILED')
                        from outbox where event_type='RetentionSandboxFixture' and aggregate_id=:fixture
                        """)
                .param("fixture", fixture)
                .param("old", OffsetDateTime.ofInstant(clock.instant(), ZoneOffset.UTC).minusDays(200))
                .query((rs, i) -> new Counts(rs.getLong(1), rs.getLong(2), rs.getLong(3))).single();
    }

    @Override
    public void remove(UUID fixture) {
        jdbc.sql("delete from outbox where event_type='RetentionSandboxFixture' and aggregate_id=:fixture")
                .param("fixture", fixture).update();
    }
}
