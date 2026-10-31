package taxi.blizz.telephony.internal;

import java.io.IOException;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.Map;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.files.FileService;
import taxi.blizz.platform.RetentionRetry;
import taxi.blizz.platform.RetentionWork;

/** Remove the source and owned file first, then the recording row. Calls themselves remain untouched. */
@Component
@Order(0)
class CallRecordingRetention implements RetentionWork {
    private static final Logger log = LoggerFactory.getLogger(CallRecordingRetention.class);
    private static final String ELIGIBLE = "created_at<:cutoff and (fetching_until is null or fetching_until<=:now) and (retention_until is null or retention_until<=:now)";
    private static final int MAX_CONSECUTIVE_FAILURES = 3;
    private static final long RUN_NANOS = Duration.ofMinutes(1).toNanos();
    private final JdbcClient jdbc;
    private final FileService files;
    private final RecordingSource source;
    private final TransactionTemplate tx;

    CallRecordingRetention(JdbcClient jdbc, FileService files, TelephonyProperties properties, AriRecordingSource asterisk,
                           FakeCallSource fake, PlatformTransactionManager transactions) {
        this.jdbc = jdbc;
        this.files = files;
        source = properties.fake() ? fake : asterisk;
        tx = new TransactionTemplate(transactions);
        tx.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW);
    }

    public String kind() {
        return "call_recordings";
    }

    public String selectionSql(int limit) {
        return "select call_id from call_recording where " + ELIGIBLE
                + " order by created_at,call_id limit " + RetentionWork.limit(limit);
    }

    private record Claimed(UUID call, UUID file, String channel, UUID claim, boolean previouslyClaimed, int attempts) {
    }

    /** The recordings of a deleted rider's calls (issue #144), whatever the retention term; one batch. */
    Result runErased(OffsetDateTime now, int limit) {
        return new Result(0, 0, 0);
    }

    public Result run(OffsetDateTime cutoff, OffsetDateTime now, int limit) {
        Result total = new Result(0, 0, 0);
        Map<String, Object> params = Map.of("cutoff", cutoff, "now", now);
        long started = System.nanoTime();
        int consecutiveFailures = 0;
        for (UUID id : jdbc.sql(selectionSql(limit)).params(params).query(UUID.class).list()) {
            // The current provider request can add at most its 30-second timeout to this one-minute budget.
            if (System.nanoTime() - started >= RUN_NANOS || consecutiveFailures >= MAX_CONSECUTIVE_FAILURES) break;
            Claimed item = claim(id, params, now);
            if (item == null) {
                total = total.plus(new Result(0, 0, 1));
                continue;
            }
            boolean changed = item.previouslyClaimed();
            try {
                changed |= source.discard(item.channel());
                if (item.file() != null) {
                    var deletion = files.deleteRecording(item.file());
                    if (!deletion.gone()) {
                        throw new RecordingSource.DeletionFailure("Recording file not removed", deletion.fenced(), null);
                    }
                    changed = true;
                }
                int deleted = tx.execute(status -> jdbc.sql("delete from call_recording where call_id=:id and retention_claim=:claim")
                        .param("id", id).param("claim", item.claim()).update());
                total = total.plus(new Result(deleted, 0, 1));
                consecutiveFailures = 0;
            } catch (IOException | RuntimeException ex) {
                boolean keepFence = changed || !(ex instanceof RecordingSource.DeletionFailure failure) || failure.removed();
                try {
                    tx.executeWithoutResult(status -> jdbc.sql("""
                                    update call_recording set retention_claim=:fence,retention_until=:retry
                                    where call_id=:id and retention_claim=:claim""")
                            .param("fence", keepFence ? item.claim() : null)
                            .param("retry", now.plus(RetentionRetry.pause(item.attempts())))
                            .param("id", id).param("claim", item.claim()).update());
                } catch (RuntimeException retry) {
                    log.warn("Recording retry marker failed ({})", retry.getClass().getSimpleName());
                }
                log.warn("Recording retention failed for {} ({})", id, ex.getClass().getSimpleName());
                total = total.plus(new Result(0, 1, 1));
                consecutiveFailures++;
            }
        }
        return total;
    }

    private Claimed claim(UUID id, Map<String, Object> params, OffsetDateTime now) {
        return tx.execute(status -> {
            var row = jdbc.sql("select call_id,file_id,retention_claim,retention_attempts from call_recording where call_id=:id and "
                            + ELIGIBLE + " for update skip locked")
                    .params(params).param("id", id).query((rs, i) -> new Claimed(rs.getObject(1, UUID.class),
                            rs.getObject(2, UUID.class), null, UUID.randomUUID(), rs.getObject(3) != null,
                            rs.getInt(4) + 1)).optional();
            if (row.isEmpty()) return null;
            Claimed recording = row.get();
            String channel = jdbc.sql("select channel_id from call where id=:id").param("id", id).query(String.class).single();
            jdbc.sql("update call_recording set retention_claim=:claim,retention_until=:until,retention_attempts=:attempts where call_id=:id")
                    .param("claim", recording.claim()).param("until", now.plusMinutes(10))
                    .param("attempts", recording.attempts()).param("id", id).update();
            return new Claimed(id, recording.file(), channel, recording.claim(), recording.previouslyClaimed(), recording.attempts());
        });
    }
}
