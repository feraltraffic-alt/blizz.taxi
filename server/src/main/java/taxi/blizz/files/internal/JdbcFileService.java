package taxi.blizz.files.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Optional;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.files.FileContent;
import taxi.blizz.files.FilePurpose;
import taxi.blizz.files.FileService;
import taxi.blizz.files.FileState;
import taxi.blizz.files.StoredFile;
import taxi.blizz.files.UploadSession;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;

/**
 * Upload pipeline: claim the session → stage with a size limit → detect the real type → strip JPEG
 * metadata → scan → store under a random key → SAFE. Any failed check makes the file REJECTED and
 * removes its bytes. The database only records state; long I/O never runs inside a transaction.
 */
@Service
class JdbcFileService implements FileService {

    private static final Logger log = LoggerFactory.getLogger(JdbcFileService.class);
    private static final DateTimeFormatter MONTH = DateTimeFormatter.ofPattern("yyyy-MM");

    private final JdbcClient jdbc;
    private final TransactionTemplate tx;
    private final IdempotentCommands commands;
    private final FileStorage storage;
    private final FileScanner scanner;
    private final FilesProperties properties;
    private final Clock clock;

    JdbcFileService(JdbcClient jdbc, TransactionTemplate tx, IdempotentCommands commands, FileStorage storage,
                    FileScanner scanner, FilesProperties properties, Clock clock) {
        this.jdbc = jdbc;
        this.tx = tx;
        this.commands = commands;
        this.storage = storage;
        this.scanner = scanner;
        this.properties = properties;
        this.clock = clock;
    }

    record OpenRequest(FilePurpose purpose, String contentType, long sizeBytes) {
    }

    @Override
    public UploadSession openUpload(Actor owner, UUID commandId, FilePurpose purpose, String contentType,
                                    long sizeBytes) {
        String type = normalize(contentType);
        if (purpose == null || !properties.allowedTypes().contains(type)) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "Unsupported file type");
        }
        if (sizeBytes <= 0 || sizeBytes > properties.maxBytes()) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "File size must be between 1 byte and "
                    + properties.maxBytes() + " bytes");
        }
        return commands.execute(new CommandKey(owner, "file.upload.open", commandId),
                new OpenRequest(purpose, type, sizeBytes), UploadSession.class, () -> {
                    UUID id = UUID.randomUUID();
                    OffsetDateTime now = now();
                    OffsetDateTime expiresAt = now.plus(properties.uploadTtl());
                    jdbc.sql("""
                                    insert into file_object (id, owner_type, owner_id, purpose, declared_content_type,
                                                             declared_size_bytes, upload_expires_at, created_at)
                                    values (:id, :ownerType, :ownerId, :purpose, :type, :size, :expiresAt, :now)""")
                            .param("id", id)
                            .param("ownerType", owner.type().name())
                            .param("ownerId", owner.id())
                            .param("purpose", purpose.name())
                            .param("type", type)
                            .param("size", sizeBytes)
                            .param("expiresAt", expiresAt)
                            .param("now", now)
                            .update();
                    return new UploadSession(id, uploadPath(owner, id), expiresAt, sizeBytes);
                });
    }

    private record Claimed(FilePurpose purpose, String declaredType, long declaredSize) {
    }

    @Override
    public StoredFile upload(Actor owner, UUID fileId, String contentType, long contentLength, InputStream body) {
        Claimed claimed = tx.execute(status -> claim(owner, fileId, normalize(contentType), contentLength));
        Path staged = null;
        try {
            try {
                staged = storage.stage(body, claimed.declaredSize());
            } catch (FileStorage.TooLargeException e) {
                return reject(fileId, null, "The file is larger than declared");
            }
            Optional<String> detected = ContentSniffer.detect(staged);
            if (detected.isEmpty() || !detected.get().equals(claimed.declaredType())) {
                return reject(fileId, staged, "The content does not match the declared type");
            }
            if ("image/jpeg".equals(detected.get()) && !JpegMetadataStripper.strip(staged)) {
                return reject(fileId, staged, "The image structure is not valid");
            }
            Optional<String> finding = scanner.scan(staged, detected.get());
            if (finding.isPresent()) {
                return reject(fileId, staged, finding.get());
            }
            long size = Files.size(staged);
            byte[] hash = sha256(staged);
            String key = claimed.purpose().name().toLowerCase(Locale.ROOT) + "/" + MONTH.format(now()) + "/" + fileId;
            storage.store(staged, key);
            staged = null;
            OffsetDateTime now = now();
            jdbc.sql("""
                            update file_object
                            set state = 'SAFE', detected_content_type = :type, size_bytes = :size, sha256 = :hash,
                                storage_key = :key, uploaded_at = :now, scanned_at = :now, scan_engine = :engine,
                                version = version + 1
                            where id = :id and state = 'QUARANTINE'""")
                    .param("type", detected.get())
                    .param("size", size)
                    .param("hash", hash)
                    .param("key", key)
                    .param("now", now)
                    .param("engine", scanner.engine())
                    .param("id", fileId)
                    .update();
            return new StoredFile(fileId, FileState.SAFE, detected.get(), size, null);
        } catch (IOException e) {
            log.warn("Upload of file {} failed", fileId, e);
            return reject(fileId, staged, "The upload could not be completed");
        } finally {
            deleteQuietly(staged);
        }
    }

    private Claimed claim(Actor owner, UUID fileId, String contentType, long contentLength) {
        record Row(UUID ownerId, String ownerType, String purpose, String type, long size, String state,
                   OffsetDateTime expiresAt) {
        }
        Row row = jdbc.sql("""
                        select owner_id, owner_type, purpose, declared_content_type, declared_size_bytes, state,
                               upload_expires_at
                        from file_object where id = :id for update""")
                .param("id", fileId)
                .query((rs, i) -> new Row(rs.getObject("owner_id", UUID.class), rs.getString("owner_type"),
                        rs.getString("purpose"), rs.getString("declared_content_type"),
                        rs.getLong("declared_size_bytes"), rs.getString("state"),
                        rs.getObject("upload_expires_at", OffsetDateTime.class)))
                .optional()
                .filter(r -> r.ownerType().equals(owner.type().name()) && r.ownerId().equals(owner.id()))
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "File not found"));
        if (!FileState.AWAITING_UPLOAD.name().equals(row.state())) {
            throw new DomainException(ErrorCode.STATE_CONFLICT, "This upload session was already used");
        }
        if (!now().isBefore(row.expiresAt())) {
            throw new DomainException(ErrorCode.STATE_CONFLICT, "The upload session has expired");
        }
        if (!row.type().equals(contentType)) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "Content-Type differs from the upload session");
        }
        if (contentLength > row.size()) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "The file is larger than declared");
        }
        jdbc.sql("update file_object set state = 'QUARANTINE', version = version + 1 where id = :id")
                .param("id", fileId)
                .update();
        return new Claimed(FilePurpose.valueOf(row.purpose()), row.type(), row.size());
    }

    private StoredFile reject(UUID fileId, Path staged, String reason) {
        deleteQuietly(staged);
        jdbc.sql("""
                        update file_object set state = 'REJECTED', reject_reason = :reason, scanned_at = :now,
                                               version = version + 1
                        where id = :id and state = 'QUARANTINE'""")
                .param("reason", reason)
                .param("now", now())
                .param("id", fileId)
                .update();
        return new StoredFile(fileId, FileState.REJECTED, null, 0, reason);
    }

    @Override
    public void requireAttachable(Actor owner, UUID fileId, FilePurpose purpose) {
        record Row(String ownerType, UUID ownerId, String purpose, String state) {
        }
        Row row = jdbc.sql("select owner_type, owner_id, purpose, state from file_object where id = :id")
                .param("id", fileId)
                .query((rs, i) -> new Row(rs.getString(1), rs.getObject(2, UUID.class), rs.getString(3),
                        rs.getString(4)))
                .optional()
                .filter(r -> r.ownerType().equals(owner.type().name()) && r.ownerId().equals(owner.id()))
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "File not found"));
        if (!purpose.name().equals(row.purpose())) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "The file was uploaded for another purpose");
        }
        if (!FileState.SAFE.name().equals(row.state())) {
            throw new DomainException(ErrorCode.STATE_CONFLICT, "The file has not passed the checks");
        }
    }

    @Override
    public FileContent open(Actor requester, UUID fileId) {
        record Row(String ownerType, UUID ownerId, String type, long size, String key) {
        }
        Row row = jdbc.sql("""
                        select owner_type, owner_id, detected_content_type, size_bytes, storage_key
                        from file_object where id = :id and state = 'SAFE'""")
                .param("id", fileId)
                .query((rs, i) -> new Row(rs.getString(1), rs.getObject(2, UUID.class), rs.getString(3),
                        rs.getLong(4), rs.getString(5)))
                .optional()
                .filter(r -> r.ownerType().equals(requester.type().name()) && r.ownerId().equals(requester.id()))
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "File not found"));
        try {
            return new FileContent(fileId, row.type(), row.size(), storage.open(row.key()));
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    private static String uploadPath(Actor owner, UUID fileId) {
        return "/api/" + owner.type().name().toLowerCase(Locale.ROOT).replace("client", "rider") + "/v1/uploads/" + fileId;
    }

    private static String normalize(String contentType) {
        if (contentType == null) {
            return "";
        }
        int semicolon = contentType.indexOf(';');
        return (semicolon < 0 ? contentType : contentType.substring(0, semicolon)).strip().toLowerCase(Locale.ROOT);
    }

    private static byte[] sha256(Path file) throws IOException {
        try (DigestInputStream in = new DigestInputStream(Files.newInputStream(file),
                MessageDigest.getInstance("SHA-256"))) {
            in.transferTo(java.io.OutputStream.nullOutputStream());
            return in.getMessageDigest().digest();
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("SHA-256 is not available", e);
        }
    }

    private static void deleteQuietly(Path path) {
        if (path != null) {
            try {
                Files.deleteIfExists(path);
            } catch (IOException e) {
                log.warn("Could not delete staged upload {}", path, e);
            }
        }
    }

    private OffsetDateTime now() {
        return OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
    }
}
