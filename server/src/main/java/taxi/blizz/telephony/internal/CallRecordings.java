package taxi.blizz.telephony.internal;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Clock;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.audit.AuditEntry;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.files.FileContent;
import taxi.blizz.files.FilePurpose;
import taxi.blizz.files.FileService;
import taxi.blizz.files.FileState;
import taxi.blizz.files.StoredFile;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.telephony.Calls;

/**
 * Call recordings (issue #60, ADR 0012 Q-18 p. 5). A taken call that ended has a PENDING recording
 * ({@link JdbcCalls#ended}); {@link #fetchDue} brings it from Asterisk into the files module, encrypted at rest, and
 * then removes Asterisk's copy. Asterisk still without a file after {@code recordingGiveUpAfter} means there is none
 * (NONE); an unreachable Asterisk is retried with a growing pause. Listening needs {@link Calls#LISTEN_PERMISSION} for
 * the call's city and is audited every time; there is no public link. The Q-19 recording policy defaults to forever;
 * deleting a client's account (#56) leaves the recordings of their calls as they are.
 */
@Service
class CallRecordings {

    static final Duration FIRST_RETRY = Duration.ofSeconds(30);
    static final Duration LONGEST_RETRY = Duration.ofMinutes(30);
    /** A claimed recording whose worker died is tried again after this. */
    static final Duration LEASE = Duration.ofMinutes(10);
    private static final int PER_RUN = 50;

    private static final Logger log = LoggerFactory.getLogger(CallRecordings.class);

    private final JdbcClient jdbc;
    private final TransactionTemplate tx;
    private final FileService files;
    private final StaffAccess staff;
    private final AuditLog audit;
    private final Calls calls;
    private final TelephonyProperties properties;
    private final RecordingSource source;
    private final Clock clock;

    CallRecordings(JdbcClient jdbc, TransactionTemplate tx, FileService files, StaffAccess staff, AuditLog audit,
                   Calls calls, TelephonyProperties properties, AriRecordingSource asterisk, FakeCallSource fake,
                   Clock clock) {
        this.jdbc = jdbc;
        this.tx = tx;
        this.files = files;
        this.staff = staff;
        this.audit = audit;
        this.calls = calls;
        this.properties = properties;
        this.source = properties.fake() ? fake : asterisk;
        this.clock = clock;
    }

    record Due(UUID callId, String channelId, int attempts, OffsetDateTime createdAt) {
    }

    /** Fetches the recordings that are due, at most {@value #PER_RUN}; returns how many were settled. */
    int fetchDue() {
        int settled = 0;
        for (int i = 0; i < PER_RUN; i++) {
            Optional<Due> due = claim();
            if (due.isEmpty()) {
                break;
            }
            if (fetch(due.get())) {
                settled++;
            }
        }
        return settled;
    }

    /** Takes the next due recording for {@link #LEASE}, so another instance does not fetch it at the same time. */
    private Optional<Due> claim() {
        OffsetDateTime now = now();
        return tx.execute(status -> jdbc.sql("""
                        update call_recording r
                        set attempts = r.attempts + 1, next_attempt_at = :lease, fetching_until = :lease, version = r.version + 1
                        from call c
                        where c.id = r.call_id
                          and r.call_id = (select call_id from call_recording
                                           where state = 'PENDING' and retention_claim is null
                                             and erase_requested_at is null and next_attempt_at <= :now
                                           order by next_attempt_at, call_id
                                           limit 1 for update skip locked)
                        returning r.call_id, c.channel_id, r.attempts, r.created_at""")
                .param("now", now).param("lease", now.plus(LEASE))
                .query((rs, i) -> new Due(rs.getObject(1, UUID.class), rs.getString(2), rs.getInt(3),
                        rs.getObject(4, OffsetDateTime.class)))
                .optional());
    }

    /** True when the recording is settled (STORED or NONE); false when it will be tried again. */
    private boolean fetch(Due due) {
        Path file = null;
        try {
            Optional<Path> fetched = source.fetch(due.channelId());
            if (fetched.isEmpty()) {
                if (now().isBefore(due.createdAt().plus(properties.recordingGiveUpAfter()))) {
                    retry(due);
                    return false;
                }
                none(due);
                log.warn("Asterisk has no recording of call {}", due.callId());
                return true;
            }
            file = fetched.get();
            Integer seconds = WavFiles.seconds(file);
            StoredFile stored;
            try (InputStream in = Files.newInputStream(file)) {
                stored = files.storeSystemFile(FilePurpose.CALL_RECORDING, "audio/wav", in,
                        properties.recordingMaxBytes());
            }
            if (stored.state() != FileState.SAFE) {
                none(due);
                log.warn("The recording of call {} was not accepted ({}); Asterisk's copy is kept", due.callId(),
                        stored.rejectReason());
                return true;
            }
            int updated = tx.execute(status -> {
                int changed = jdbc.sql("""
                            update call_recording
                            set state = 'STORED', file_id = :file, duration_seconds = :seconds, stored_at = :now,
                                version = version + 1, fetching_until = null
                            where call_id = :call and state = 'PENDING' and retention_claim is null""")
                    .param("file", stored.fileId()).param("seconds", seconds).param("now", now())
                    .param("call", due.callId()).update();
                if (changed == 1) files.markAttached(Actor.system(), stored.fileId(), FilePurpose.CALL_RECORDING);
                return changed;
            });
            if (updated == 0) {
                log.warn("The recording of call {} was settled meanwhile; file {} is not linked", due.callId(),
                        stored.fileId());
                return true;
            }
            try {
                source.discard(due.channelId());
            } catch (IOException | RuntimeException e) {
                log.warn("Asterisk's copy of the recording of call {} was not removed ({})", due.callId(),
                        e.getClass().getSimpleName());
            }
            return true;
        } catch (IOException | RuntimeException e) {
            log.warn("The recording of call {} could not be fetched ({}: {}); trying again later", due.callId(),
                    e.getClass().getSimpleName(), e.getMessage());
            retry(due);
            return false;
        } finally {
            if (file != null) {
                try {
                    Files.deleteIfExists(file);
                } catch (IOException e) {
                    log.warn("Could not delete the downloaded recording {}", file, e);
                }
            }
        }
    }

    private void retry(Due due) {
        jdbc.sql("update call_recording set next_attempt_at = :at, fetching_until = null where call_id = :call and state = 'PENDING' and retention_claim is null")
                .param("at", now().plus(pause(due.attempts()))).param("call", due.callId()).update();
    }

    private void none(Due due) {
        jdbc.sql("""
                        update call_recording set state = 'NONE', version = version + 1, fetching_until = null
                        where call_id = :call and state = 'PENDING' and retention_claim is null""")
                .param("call", due.callId()).update();
    }

    /** 30 s after the first attempt, doubling, at most 30 min. */
    static Duration pause(int attempts) {
        int doublings = Math.max(0, Math.min(attempts - 1, 6));
        Duration pause = FIRST_RETRY.multipliedBy(1L << doublings);
        return pause.compareTo(LONGEST_RETRY) > 0 ? LONGEST_RETRY : pause;
    }

    /**
     * The recording for listening: {@link Calls#LISTEN_PERMISSION} for the call's city, recorded in the audit with the
     * call's orders — in the same transaction, so there is no listening without its record.
     */
    @Transactional
    FileContent listen(Actor actor, UUID callId) {
        Calls.Call call = calls.find(callId)
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Call not found"));
        staff.require(actor, Calls.LISTEN_PERMISSION, call.cityId());
        UUID fileId = jdbc.sql("select file_id from call_recording where call_id = :call and state = 'STORED' and retention_claim is null")
                .param("call", callId).query(UUID.class).optional()
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "The call has no recording"));
        Map<String, Object> details = new LinkedHashMap<>();
        details.put("file_id", fileId);
        details.put("order_ids", call.orderIds());
        audit.record(new AuditEntry(actor, "call_recording.listen", "call", callId.toString(), null, null, details));
        return files.openAttached(fileId, FilePurpose.CALL_RECORDING);
    }

    private OffsetDateTime now() {
        return OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
    }
}
