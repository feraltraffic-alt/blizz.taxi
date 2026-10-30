package taxi.blizz.files.internal;

import java.io.IOException;
import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Map;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.platform.RetentionRetry;
import taxi.blizz.platform.RetentionWork;

/** Claims fence attachment/upload, including after a crash; bytes are removed with no open DB transaction. */
@Component
class FileRetirement {
    private static final Logger log = LoggerFactory.getLogger(FileRetirement.class);
    private static final String AVAILABLE = "(retention_until is null or retention_until<=:now)";
    private final JdbcClient jdbc;
    private final FileStorage storage;
    private final TransactionTemplate tx;
    private final Clock clock;

    FileRetirement(JdbcClient jdbc, FileStorage storage, PlatformTransactionManager transactions, Clock clock) {
        this.jdbc = jdbc;
        this.storage = storage;
        this.clock = clock;
        tx = new TransactionTemplate(transactions);
        tx.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW);
    }

    static String eligibility(String kind) {
        return switch (kind) {
            case "upload_sessions" -> "attached_at is null and purpose<>'CALL_RECORDING' and state in ('AWAITING_UPLOAD','SAFE','REJECTED') and coalesce(uploaded_at,scanned_at,upload_expires_at)<:cutoff";
            case "quarantined_files" -> "attached_at is null and purpose<>'CALL_RECORDING' and state='QUARANTINE' and coalesce(quarantine_at,uploaded_at,created_at)<:cutoff";
            case "call_recordings" -> "attached_at is null and purpose='CALL_RECORDING' and coalesce(uploaded_at,scanned_at,created_at)<:cutoff";
            default -> throw new IllegalArgumentException("Unknown file retention kind");
        };
    }

    static String age(String kind) {
        return switch (kind) {
            case "upload_sessions" -> "coalesce(uploaded_at,scanned_at,upload_expires_at)";
            case "quarantined_files" -> "coalesce(quarantine_at,uploaded_at,created_at)";
            case "call_recordings" -> "coalesce(uploaded_at,scanned_at,created_at)";
            default -> throw new IllegalArgumentException("Unknown file retention kind");
        };
    }

    String selection(String kind, int limit) {
        return "select id from file_object where " + eligibility(kind) + " and " + AVAILABLE
                + " order by " + age(kind) + ",id limit " + RetentionWork.limit(limit);
    }

    /** {@code plainKey}: a document's plain copy still waiting for its delete after re-encryption (issue #135). */
    private record Claimed(UUID id, String key, String stagingKey, String plainKey, String state, UUID claim,
                           boolean previouslyClaimed, int attempts) {
    }

    private record Attempt(boolean gone, int deleted, int failures, boolean fenced) {
    }

    RetentionWork.Result run(String kind, OffsetDateTime cutoff, OffsetDateTime now, int limit) {
        RetentionWork.Result total = new RetentionWork.Result(0, 0, 0);
        for (UUID id : jdbc.sql(selection(kind, limit)).params(Map.of("cutoff", cutoff, "now", now)).query(UUID.class).list()) {
            Attempt attempt = retire(id, eligibility(kind), Map.of("cutoff", cutoff, "now", now), now);
            total = total.plus(new RetentionWork.Result(attempt.deleted(), attempt.failures(), 1));
        }
        return total;
    }

    taxi.blizz.files.FileService.RecordingDeletion recording(UUID id) {
        OffsetDateTime now = OffsetDateTime.ofInstant(clock.instant(), ZoneOffset.UTC);
        Attempt attempt = retire(id, "purpose='CALL_RECORDING'", Map.of("now", now), now);
        return new taxi.blizz.files.FileService.RecordingDeletion(attempt.gone(), attempt.fenced());
    }

    private Attempt retire(UUID id, String eligibility, Map<String, Object> params, OffsetDateTime now) {
        Claimed claimed = tx.execute(status -> {
            var row = jdbc.sql("select id,storage_key,staging_key,plain_key_pending_delete,state,retention_claim,retention_attempts from file_object where id=:id and "
                            + eligibility + " and " + AVAILABLE + " for update skip locked")
                    .params(params).param("id", id).query((rs, i) -> new Claimed(rs.getObject(1, UUID.class),
                            rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), UUID.randomUUID(),
                            rs.getObject(6) != null, rs.getInt(7) + 1)).optional();
            if (row.isEmpty()) return null;
            Claimed item = row.get();
            jdbc.sql("update file_object set retention_claim=:claim,retention_until=:until,retention_attempts=:attempts where id=:id")
                    .param("claim", item.claim()).param("until", now.plusMinutes(10))
                    .param("attempts", item.attempts()).param("id", id).update();
            return item;
        });
        if (claimed == null) {
            var fenced = jdbc.sql("select retention_claim is not null from file_object where id=:id")
                    .param("id", id).query(Boolean.class).optional();
            // A retry deadline on an intact file is not a visibility fence, even if its parent is due first.
            return new Attempt(fenced.isEmpty(), 0, 0, fenced.orElse(false));
        }
        // A previous worker may have crashed after deleting bytes. Only proven untouched files become visible again.
        boolean changed = claimed.previouslyClaimed();
        try {
            if (claimed.key() == null && claimed.stagingKey() == null
                    && ("QUARANTINE".equals(claimed.state()) || "SAFE".equals(claimed.state()))) {
                log.warn("Cannot classify legacy file bytes for file {}; metadata retained for repair", id);
                throw new FileStorage.DeletionFailure("Legacy file has no known storage key", false, null);
            }
            if (claimed.stagingKey() != null) changed |= storage.delete(claimed.stagingKey());
            if (claimed.key() != null && !claimed.key().equals(claimed.stagingKey())) changed |= storage.delete(claimed.key());
            // A re-encrypted document's plain copy must not outlive its row (issue #135).
            if (claimed.plainKey() != null) changed |= storage.delete(claimed.plainKey());
            int deleted = tx.execute(status -> jdbc.sql("delete from file_object where id=:id and retention_claim=:claim")
                    .param("id", id).param("claim", claimed.claim()).update());
            return new Attempt(deleted == 1, deleted, 0, deleted != 1);
        } catch (IOException | RuntimeException ex) {
            boolean keepFence = changed || !(ex instanceof FileStorage.DeletionFailure failure) || failure.removed();
            try {
                tx.executeWithoutResult(status -> jdbc.sql("""
                                update file_object set retention_claim=:fence,retention_until=:retry
                                where id=:id and retention_claim=:claim""")
                        .param("fence", keepFence ? claimed.claim() : null)
                        .param("retry", now.plus(RetentionRetry.pause(claimed.attempts())))
                        .param("id", id).param("claim", claimed.claim()).update());
            } catch (RuntimeException retry) {
                log.warn("File retention retry marker failed ({})", retry.getClass().getSimpleName());
            }
            log.warn("File retention failed for {} ({})", id, ex.getClass().getSimpleName());
            return new Attempt(false, 0, 1, keepFence);
        }
    }
}
