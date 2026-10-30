package taxi.blizz.files.internal;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.time.Clock;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * Re-encrypts the SAFE driver documents stored in the clear before issue #135, one file at a time, on any number of
 * instances (a QUARANTINE one waits until the rescan makes it SAFE: the rescan owns it meanwhile). For each file: claim
 * it for {@link #LEASE}; write the encrypted copy under a new key; switch the row to it, keeping the old key in
 * {@code plain_key_pending_delete}; a later run deletes the plain file once {@link #GRACE} has passed since the switch,
 * so a download that read the row just before the switch can still open it. A crash at any point leaves a readable
 * file: before the switch the row still points at the plain file (the next run writes the copy again), after it the
 * plain file waits in {@code plain_key_pending_delete}. A plain file that is missing or unreadable is retried
 * with back-off and counted ({@code blizz.files.documents.encryption_failing}); it is never marked encrypted and never
 * deleted. No transaction is held during file I/O.
 */
@Service
class DocumentEncryption {

    /** Far longer than encrypting the largest document (10 MB, well under a second). */
    static final Duration LEASE = Duration.ofMinutes(10);
    static final Duration FIRST_RETRY = Duration.ofSeconds(30);
    static final Duration LONGEST_RETRY = Duration.ofHours(1);
    /** How long a plain file stays after its row switched, for readers that read the row before the switch. */
    static final Duration GRACE = Duration.ofMinutes(1);
    private static final int PER_RUN = 20;
    /** Suffix of the encrypted copy's key; the storage accepts only {@code [a-z0-9-]} in a key's parts. */
    static final String SUFFIX = "-e1";

    private static final Logger log = LoggerFactory.getLogger(DocumentEncryption.class);

    /** Where a test stops the work to simulate a crash: after "written" (the copy) or "switched" (the row). */
    interface Steps {
        void after(String step);
    }

    private final JdbcClient jdbc;
    private final TransactionTemplate tx;
    private final FileStorage storage;
    private final FileEncryption encryption;
    private final FilesProperties properties;
    private final Clock clock;
    private volatile Steps steps = step -> { };

    DocumentEncryption(JdbcClient jdbc, TransactionTemplate tx, FileStorage storage, FileEncryption encryption,
                       FilesProperties properties, Clock clock) {
        this.jdbc = jdbc;
        this.tx = tx;
        this.storage = storage;
        this.encryption = encryption;
        this.properties = properties;
        this.clock = clock;
    }

    void steps(Steps value) {
        steps = value == null ? step -> { } : value;
    }

    private record Due(UUID fileId, String key, String stagingKey, int attempts) {
    }

    private record Leftover(UUID fileId, String key) {
    }

    /** Deletes plain files switched more than {@link #GRACE} ago, then encrypts at most {@value #PER_RUN} due files; returns how many it switched. */
    int encryptDue() {
        Optional<FileCipher> cipher = encryption.cipher();
        if (cipher.isEmpty()) {
            return 0; // FileEncryption already warned at start-up; nothing can be encrypted without the key
        }
        deleteLeftovers();
        int switched = 0;
        for (int i = 0; i < PER_RUN; i++) {
            Optional<Due> due = claim();
            if (due.isEmpty()) {
                break;
            }
            if (encrypt(due.get(), cipher.get())) {
                switched++;
            }
        }
        return switched;
    }

    private void deleteLeftovers() {
        List<Leftover> leftovers = jdbc.sql("""
                        select id, plain_key_pending_delete from file_object
                        where plain_key_pending_delete is not null and plain_pending_since <= :since
                        order by id limit :limit""")
                .param("since", now().minus(GRACE))
                .param("limit", PER_RUN)
                .query((rs, i) -> new Leftover(rs.getObject(1, UUID.class), rs.getString(2))).list();
        for (Leftover leftover : leftovers) {
            try {
                storage.delete(leftover.key());
                jdbc.sql("""
                                update file_object set plain_key_pending_delete = null, plain_pending_since = null
                                where id = :id and plain_key_pending_delete = :key""")
                        .param("id", leftover.fileId()).param("key", leftover.key()).update();
            } catch (IOException | RuntimeException e) {
                log.warn("The plain copy of document {} could not be deleted yet: {}", leftover.fileId(),
                        e.getClass().getSimpleName());
            }
        }
    }

    /**
     * Claims one due file and reserves its staging paths while the row is locked (the storage writes only to reserved
     * paths, and retention cleans a row's {@code staging_key}); file I/O follows the commit.
     */
    private Optional<Due> claim() {
        OffsetDateTime now = now();
        return tx.execute(status -> {
            Optional<Due> row = jdbc.sql("""
                            select id, storage_key, staging_key, encrypt_attempts from file_object
                            where purpose = 'DRIVER_DOCUMENT' and state = 'SAFE' and encryption is null
                              and storage_key is not null and retention_claim is null
                              and (next_encrypt_at is null or next_encrypt_at <= :now)
                            order by next_encrypt_at nulls first, id
                            limit 1 for update skip locked""")
                    .param("now", now)
                    .query((rs, i) -> new Due(rs.getObject(1, UUID.class), rs.getString(2), rs.getString(3),
                            rs.getInt(4) + 1))
                    .optional();
            if (row.isEmpty()) {
                return Optional.<Due>empty();
            }
            Due previous = row.get();
            String stage = "document_encryption/" + previous.fileId() + "/" + previous.attempts();
            try {
                if (previous.stagingKey() != null) {
                    storage.clearStage(previous.stagingKey());
                }
                storage.clearStage(stage);
                storage.reserve(stage);
            } catch (IOException e) {
                jdbc.sql("update file_object set encrypt_attempts = :attempts, next_encrypt_at = :next where id = :id")
                        .param("attempts", previous.attempts()).param("next", now.plus(wait(previous.attempts())))
                        .param("id", previous.fileId()).update();
                log.warn("Cannot reserve the encryption stage of document {} ({})", previous.fileId(),
                        e.getClass().getSimpleName());
                return Optional.<Due>empty();
            }
            jdbc.sql("""
                            update file_object set encrypt_attempts = :attempts, next_encrypt_at = :lease,
                                                   staging_key = :stage
                            where id = :id""")
                    .param("attempts", previous.attempts()).param("lease", now.plus(LEASE)).param("stage", stage)
                    .param("id", previous.fileId()).update();
            return Optional.of(new Due(previous.fileId(), previous.key(), stage, previous.attempts()));
        });
    }

    /** True when the row was switched to the encrypted copy. */
    private boolean encrypt(Due due, FileCipher cipher) {
        String target = due.key() + SUFFIX;
        try {
            Path plain;
            try (InputStream in = storage.open(due.key())) {
                plain = storage.stage(in, properties.maxBytes(), due.stagingKey());
            }
            Path sealed = plain.resolveSibling(plain.getFileName() + ".sealed");
            cipher.encryptReserved(plain, sealed, target);
            storage.delete(target); // a copy left by an earlier, interrupted run
            storage.store(sealed, target);
            steps.after("written");
            int switched = jdbc.sql("""
                            update file_object
                            set storage_key = :target, encryption = :scheme, plain_key_pending_delete = :plain,
                                plain_pending_since = :now, next_encrypt_at = null, staging_key = null
                            where id = :id and storage_key = :plain and encryption is null and state = 'SAFE'
                              and retention_claim is null""")
                    .param("target", target).param("scheme", FileCipher.SCHEME).param("plain", due.key())
                    .param("now", now())
                    .param("id", due.fileId()).update();
            if (switched == 0) {
                // Changed meanwhile (retired, or switched by another run): the copy is not ours to keep.
                storage.delete(target);
                return false;
            }
            steps.after("switched");
            // The plain file is deleted by a later run, after GRACE (deleteLeftovers), not now.
            return true;
        } catch (IOException | FileStorage.TooLargeException e) {
            Duration wait = wait(due.attempts());
            log.warn("Document {} could not be encrypted on attempt {} ({}); next try in {}", due.fileId(),
                    due.attempts(), e.getClass().getSimpleName(), wait);
            jdbc.sql("update file_object set next_encrypt_at = :next where id = :id and encryption is null")
                    .param("next", now().plus(wait)).param("id", due.fileId()).update();
            return false;
        } finally {
            try {
                storage.clearStage(due.stagingKey());
            } catch (IOException | RuntimeException e) {
                log.warn("The encryption stage of document {} could not be cleared ({}); retention removes it",
                        due.fileId(), e.getClass().getSimpleName());
            }
        }
    }

    static Duration wait(int attempts) {
        Duration wait = FIRST_RETRY;
        for (int i = 1; i < attempts && wait.compareTo(LONGEST_RETRY) < 0; i++) {
            wait = wait.multipliedBy(2);
        }
        return wait.compareTo(LONGEST_RETRY) > 0 ? LONGEST_RETRY : wait;
    }

    private OffsetDateTime now() {
        return OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
    }
}
