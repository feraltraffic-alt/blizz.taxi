package taxi.blizz.files.internal;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Clock;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Optional;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * Files kept in QUARANTINE because the antivirus could not answer at upload (issue #105) are scanned again until it
 * gives a verdict: SAFE, or REJECTED with the stored bytes deleted. Never released without one, however long the
 * antivirus is down; the wait doubles from {@code blizz.files.rescan.first-retry} up to {@code longest-retry}.
 * Each file is claimed just before it is scanned, for a lease far longer than one scan with its timeouts, so two
 * instances never scan it at the same time.
 */
@Service
class QuarantineRescan {

    /** Longer than one scan of the largest file: connect and read timeouts are seconds, not minutes. */
    static final Duration LEASE = Duration.ofMinutes(10);
    private static final int PER_RUN = 20;

    private static final Logger log = LoggerFactory.getLogger(QuarantineRescan.class);

    private final JdbcClient jdbc;
    private final TransactionTemplate tx;
    private final FileStorage storage;
    private final ContentScanner antivirus;
    private final JdbcFileService files;
    private final FilesProperties properties;
    private final Clock clock;

    QuarantineRescan(JdbcClient jdbc, TransactionTemplate tx, FileStorage storage, ContentScanner antivirus,
                     JdbcFileService files, FilesProperties properties, Clock clock) {
        this.jdbc = jdbc;
        this.tx = tx;
        this.storage = storage;
        this.antivirus = antivirus;
        this.files = files;
        this.properties = properties;
        this.clock = clock;
    }

    private record Due(UUID fileId, String key, int attempts) {
    }

    /** Scans the files that are due, at most {@value #PER_RUN}; returns how many got a verdict. */
    int rescanDue() {
        int settled = 0;
        for (int i = 0; i < PER_RUN; i++) {
            Optional<Due> due = claim();
            if (due.isEmpty()) {
                break;
            }
            if (rescan(due.get())) {
                settled++;
            }
        }
        return settled;
    }

    private Optional<Due> claim() {
        OffsetDateTime now = now();
        return tx.execute(status -> jdbc.sql("""
                        update file_object
                        set scan_attempts = scan_attempts + 1, next_scan_at = :lease, version = version + 1
                        where id = (select id from file_object
                                    where state = 'QUARANTINE' and next_scan_at <= :now
                                    order by next_scan_at, id
                                    limit 1 for update skip locked)
                        returning id, storage_key, scan_attempts""")
                .param("now", now).param("lease", now.plus(LEASE))
                .query((rs, i) -> new Due(rs.getObject(1, UUID.class), rs.getString(2), rs.getInt(3)))
                .optional());
    }

    /** True when the file got a verdict; false when it waits for another attempt. */
    private boolean rescan(Due due) {
        Path copy = null;
        try {
            try (InputStream in = storage.open(due.key())) {
                copy = storage.stage(in, properties.maxBytes());
            }
            Optional<String> malware = antivirus.scan(copy);
            OffsetDateTime now = now();
            if (malware.isEmpty()) {
                jdbc.sql("""
                                update file_object
                                set state = 'SAFE', scanned_at = :now, scan_engine = :engine, next_scan_at = null,
                                    version = version + 1
                                where id = :id and state = 'QUARANTINE'""")
                        .param("now", now).param("engine", files.engine()).param("id", due.fileId()).update();
                log.info("File {} is SAFE after {} attempts", due.fileId(), due.attempts());
                return true;
            }
            log.warn("File {} rejected by {} on attempt {}: {}", due.fileId(), antivirus.engine(), due.attempts(),
                    malware.get());
            storage.delete(due.key());
            jdbc.sql("""
                            update file_object
                            set state = 'REJECTED', reject_reason = :reason, scanned_at = :now, storage_key = null,
                                next_scan_at = null, version = version + 1
                            where id = :id and state = 'QUARANTINE'""")
                    .param("reason", JdbcFileService.MALWARE).param("now", now).param("id", due.fileId()).update();
            return true;
        } catch (ContentScanner.Unavailable | IOException | FileStorage.TooLargeException e) {
            Duration wait = wait(due.attempts());
            log.warn("No antivirus verdict for file {} on attempt {} ({}); next try in {}", due.fileId(),
                    due.attempts(), e.getMessage(), wait);
            jdbc.sql("update file_object set next_scan_at = :next where id = :id and state = 'QUARANTINE'")
                    .param("next", now().plus(wait)).param("id", due.fileId()).update();
            return false;
        } finally {
            if (copy != null) {
                try {
                    Files.deleteIfExists(copy);
                } catch (IOException ignored) {
                    // a temporary copy
                }
            }
        }
    }

    /** First retry, doubled after each failed attempt, at most the longest. */
    Duration wait(int attempts) {
        Duration wait = properties.rescan().firstRetry();
        for (int i = 1; i < attempts && wait.compareTo(properties.rescan().longestRetry()) < 0; i++) {
            wait = wait.multipliedBy(2);
        }
        return wait.compareTo(properties.rescan().longestRetry()) > 0 ? properties.rescan().longestRetry() : wait;
    }

    private OffsetDateTime now() {
        return OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
    }
}
