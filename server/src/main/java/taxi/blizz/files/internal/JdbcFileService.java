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
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
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
 * Upload pipeline: claim the session → stage with a size limit → detect the real type → strip image
 * metadata → structural scan → antivirus → store under a random key → SAFE. Any failed check makes the file REJECTED
 * and removes its bytes. When the antivirus cannot answer, the bytes are stored but the file stays in QUARANTINE until
 * {@link QuarantineRescan} gets a verdict (issue #105). The database only records state; long I/O never runs inside a
 * transaction.
 */
@Service
class JdbcFileService implements FileService {

    private final taxi.blizz.platform.RateLimits rateLimits;

    private static final Logger log = LoggerFactory.getLogger(JdbcFileService.class);
    private static final DateTimeFormatter MONTH = DateTimeFormatter.ofPattern("yyyy-MM");
    /** What the uploader is told; the signature's name stays in the log. */
    static final String MALWARE = "The file did not pass the malware check";

    private final JdbcClient jdbc;
    private final TransactionTemplate tx;
    private final IdempotentCommands commands;
    private final FileStorage storage;
    private final FileScanner scanner;
    private final ContentScanner antivirus;
    private final FilesProperties properties;
    private final FileEncryption encryption;
    private final Clock clock;
    private final FileRetirement retirement;

    JdbcFileService(JdbcClient jdbc, TransactionTemplate tx, IdempotentCommands commands, FileStorage storage,
                    FileScanner scanner, ContentScanner antivirus, FilesProperties properties, FileEncryption encryption, Clock clock,
                    taxi.blizz.platform.RateLimits rateLimits, FileRetirement retirement) {

        this.retirement = retirement;
        this.rateLimits = rateLimits;
        this.jdbc = jdbc;
        this.tx = tx;
        this.commands = commands;
        this.storage = storage;
        this.scanner = scanner;
        this.antivirus = antivirus;
        this.properties = properties;
        this.encryption = encryption;
        this.clock = clock;
    }

    record OpenRequest(FilePurpose purpose, String contentType, long sizeBytes) {
    }

    @Override
    public UploadSession openUpload(Actor owner, UUID commandId, FilePurpose purpose, String contentType,
                                    long sizeBytes) {
        rateLimits.acquire(taxi.blizz.platform.RateLimits.FILE_UPLOAD, owner);
        String type = normalize(contentType);
        if (purpose == null || !allowedFor(purpose, type)) {
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

    private record Claimed(FilePurpose purpose, String declaredType, long declaredSize, String key) {
    }

    @Override
    public StoredFile upload(Actor owner, UUID fileId, String contentType, long contentLength, InputStream body) {
        Claimed claimed = tx.execute(status -> claim(owner, fileId, normalize(contentType), contentLength));
        Path staged = null;
        Path sealed = null;
        try {
            try {
                staged = storage.stage(body, claimed.declaredSize(), claimed.key());
            } catch (FileStorage.TooLargeException e) {
                return reject(fileId, null, "The file is larger than declared");
            }
            Optional<String> detected = ContentSniffer.detect(staged);
            if (detected.isEmpty() || !detected.get().equals(claimed.declaredType())) {
                return reject(fileId, staged, "The content does not match the declared type");
            }
            boolean structureValid = "image/jpeg".equals(detected.get()) ? JpegMetadataStripper.strip(staged)
                    : ImageMetadataStripper.strip(staged, detected.get());
            if (!structureValid) {
                return reject(fileId, staged, "The image structure is not valid");
            }
            Optional<String> finding = scanner.scan(staged, detected.get());
            if (finding.isPresent()) {
                return reject(fileId, staged, finding.get());
            }
            Optional<String> malware;
            boolean verdict = true;
            try {
                malware = antivirus.scan(staged);
            } catch (ContentScanner.Unavailable e) {
                log.warn("No antivirus verdict for file {}, kept in quarantine: {}", fileId, e.getMessage());
                malware = Optional.empty();
                verdict = false;
            }
            if (malware.isPresent()) {
                log.warn("File {} rejected by {}: {}", fileId, antivirus.engine(), malware.get());
                return reject(fileId, staged, MALWARE, engine());
            }
            long size = Files.size(staged);
            byte[] hash = sha256(staged);
            String key = claimed.key();
            String scheme = null;
            Path toStore = staged;
            if (encryptedAtRest(claimed.purpose())) {
                // Scanned and hashed in the clear above; only the encrypted form reaches storage (issue #135).
                Optional<FileCipher> cipher = encryption.cipher();
                if (cipher.isEmpty()) {
                    log.warn("No master key (SECRETS_MASTER_KEY): document {} is refused rather than kept in the clear",
                            fileId);
                    return reject(fileId, staged, "The file could not be stored");
                }
                sealed = staged.resolveSibling(staged.getFileName() + ".sealed");
                cipher.get().encryptReserved(staged, sealed, key);
                toStore = sealed;
                scheme = FileCipher.SCHEME;
            }
            StoredFile result = completeUpload(fileId, toStore, key, detected.get(), size, hash, scheme, verdict,
                    engine());
            if (toStore == staged) {
                staged = null;
            } else {
                sealed = null;
            }
            return result;
        } catch (IOException e) {
            log.warn("Upload of file {} failed", fileId, e);
            return reject(fileId, staged, "The upload could not be completed");
        } finally {
            deleteQuietly(staged);
            deleteQuietly(sealed);
            clearStageQuietly(claimed.key());
        }
    }

    /** Driver documents (passports, licences, vehicle papers) are kept encrypted at rest (issue #135, REQ-SEC-01). */
    static boolean encryptedAtRest(FilePurpose purpose) {
        return purpose == FilePurpose.DRIVER_DOCUMENT;
    }

    /** The body and scanner have finished; serialize only the bounded local move/finalization with cleanup. */
    private StoredFile completeUpload(UUID fileId, Path staged, String key, String type, long size, byte[] hash,
                                      String encryptionScheme) throws IOException {
        return completeUpload(fileId, staged, key, type, size, hash, encryptionScheme, true, "content-type");
    }

    /** {@code engine}: what the file passed, recorded with a verdict (e.g. {@code structural+clamav}). */
    private StoredFile completeUpload(UUID fileId, Path staged, String key, String type, long size, byte[] hash,
                                      String encryptionScheme, boolean verdict, String engine) throws IOException {
        try {
            return tx.execute(status -> {
                boolean available = jdbc.sql("select id from file_object where id=:id and state='QUARANTINE' and retention_claim is null for update")
                        .param("id", fileId).query(UUID.class).optional().isPresent();
                if (!available) throw new DomainException(ErrorCode.STATE_CONFLICT, "The file is being retired");
                try { storage.store(staged, key); }
                catch (IOException ex) { throw new UncheckedIOException(ex); }
                OffsetDateTime now = now();
                jdbc.sql("""
                        update file_object
                        set state = case when :verdict then 'SAFE' else 'QUARANTINE' end,
                            detected_content_type=:type,size_bytes=:size,sha256=:hash,storage_key=:key,uploaded_at=:now,
                            scanned_at=case when :verdict then cast(:now as timestamptz) end,
                            scan_engine=case when :verdict then :engine end,encryption=:encryption,
                            scan_attempts=1,
                            next_scan_at=case when :verdict then null else cast(:now as timestamptz)+cast(:retry as interval) end,
                            declared_size_bytes=case when owner_type='SYSTEM' then greatest(:size,1) else declared_size_bytes end,
                            version=version+1
                        where id=:id
                        """).param("verdict",verdict).param("type",type).param("size",size).param("hash",hash).param("key",key)
                        .param("now",now).param("engine",engine)
                        .param("retry",properties.rescan().firstRetry().toSeconds()+" seconds")
                        .param("encryption",encryptionScheme).param("id",fileId).update();
                return new StoredFile(fileId,verdict?FileState.SAFE:FileState.QUARANTINE,type,size,null);
            });
        } catch (UncheckedIOException ex) { throw ex.getCause(); }
    }

    /** The engines a SAFE upload passed; server-owned recordings only pass their content-type check. */
    String engine() {
        return antivirus.engine().isEmpty() ? scanner.engine() : scanner.engine() + "+" + antivirus.engine();
    }

    private Claimed claim(Actor owner, UUID fileId, String contentType, long contentLength) {
        record Row(UUID ownerId, String ownerType, String purpose, String type, long size, String state,
                   OffsetDateTime expiresAt) {
        }
        Row row = jdbc.sql("""
                        select owner_id, owner_type, purpose, declared_content_type, declared_size_bytes, state,
                               upload_expires_at
                        from file_object where id = :id and retention_claim is null for update""")
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
        String key=row.purpose().toLowerCase(Locale.ROOT)+"/"+MONTH.format(now())+"/"+fileId;
        reserveStage(key);
        jdbc.sql("update file_object set state='QUARANTINE',quarantine_at=:now,staging_key=:key,version=version+1 where id=:id")
                .param("now",now()).param("key",key).param("id",fileId).update();
        return new Claimed(FilePurpose.valueOf(row.purpose()),row.type(),row.size(),key);
    }

    private StoredFile reject(UUID fileId, Path staged, String reason) {
        return reject(fileId, staged, reason, null);
    }

    /** {@code engine}: the engines that found it, when an antivirus did; null for a structural refusal. */
    private StoredFile reject(UUID fileId, Path staged, String reason, String engine) {
        deleteQuietly(staged);
        jdbc.sql("""
                        update file_object set state = 'REJECTED', reject_reason = :reason, scanned_at = :now,
                                               scan_engine = coalesce(:engine, scan_engine), version = version + 1
                        where id = :id and state = 'QUARANTINE' and retention_claim is null""")
                .param("engine", engine)
                .param("reason", reason)
                .param("now", now())
                .param("id", fileId)
                .update();
        return new StoredFile(fileId, FileState.REJECTED, null, 0, reason);
    }

    @Override
    public StoredFile storeSystemFile(FilePurpose purpose, String contentType, InputStream body, long maxBytes) {
        if (purpose != FilePurpose.CALL_RECORDING) {
            throw new IllegalArgumentException("Only call recordings are stored by the server itself");
        }
        FileCipher cipher = encryption.cipher().orElseThrow(() -> new IllegalStateException(
                "No master key (SECRETS_MASTER_KEY): a call recording cannot be stored encrypted"));
        String type = normalize(contentType);
        UUID fileId = UUID.randomUUID();
        String key=purpose.name().toLowerCase(Locale.ROOT)+"/"+MONTH.format(now())+"/"+fileId;
        tx.executeWithoutResult(status->{
            OffsetDateTime at=now();
            jdbc.sql("""
                insert into file_object(id,owner_type,purpose,declared_content_type,declared_size_bytes,state,
                  staging_key,upload_expires_at,created_at,quarantine_at)
                values(:id,'SYSTEM',:purpose,:type,:size,'QUARANTINE',:key,:now,:now,:now)
                """).param("id",fileId).param("purpose",purpose.name()).param("type",type.isEmpty()?"-":type)
                .param("size",Math.max(maxBytes,1)).param("key",key).param("now",at).update();
            reserveStage(key);
        });
        Path staged=null,sealed=null;
        try {
            try {staged=storage.stage(body,maxBytes,key);}
            catch(FileStorage.TooLargeException ex){return systemRejected(fileId,"The file is larger than allowed");}
            Optional<String> detected=ContentSniffer.detect(staged);
            if(detected.isEmpty()||!detected.get().equals(type))return systemRejected(fileId,"The content does not match the declared type");
            long size=Files.size(staged);byte[] hash=sha256(staged);
            sealed=staged.resolveSibling(staged.getFileName()+".sealed");
            cipher.encryptReserved(staged,sealed,key);
            return completeUpload(fileId,sealed,key,type,size,hash,FileCipher.SCHEME);
        } catch(IOException ex){throw new UncheckedIOException(new IOException("A "+purpose+" file could not be stored",ex));}
        finally {deleteQuietly(staged);deleteQuietly(sealed);clearStageQuietly(key);}
    }

    private void reserveStage(String key) {
        try {storage.reserve(key);}
        catch(IOException ex){throw new UncheckedIOException(ex);}
    }

    private void clearStageQuietly(String key) {
        try {storage.clearStage(key);}
        catch(IOException|RuntimeException ex){log.warn("Could not clear reserved file stage ({})",ex.getClass().getSimpleName());}
    }

    /** The reserved staging key remains available to retention even when immediate cleanup fails. */
    private StoredFile systemRejected(UUID fileId,String reason) {
        jdbc.sql("""
            update file_object set state='REJECTED',reject_reason=:reason,scan_engine='content-type',scanned_at=:now,
              declared_size_bytes=1,version=version+1 where id=:id and state='QUARANTINE' and retention_claim is null
            """).param("reason",reason).param("now",now()).param("id",fileId).update();
        return new StoredFile(fileId,FileState.REJECTED,null,0,reason);
    }

    @Override
    public StoredFile requireAttachable(Actor owner, UUID fileId, FilePurpose purpose) {
        record Row(String ownerType, UUID ownerId, String purpose, String state, String type, Long size) {
        }
        Row row = jdbc.sql("""
                        select owner_type, owner_id, purpose, state, detected_content_type, size_bytes
                        from file_object where id = :id and retention_claim is null""")
                .param("id", fileId)
                .query((rs, i) -> new Row(rs.getString(1), rs.getObject(2, UUID.class), rs.getString(3),
                        rs.getString(4), rs.getString(5), (Long) rs.getObject(6)))
                .optional()
                .filter(r -> r.ownerType().equals(owner.type().name()) && r.ownerId().equals(owner.id()))
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "File not found"));
        if (!purpose.name().equals(row.purpose())) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "The file was uploaded for another purpose");
        }
        if (!FileState.SAFE.name().equals(row.state())) {
            throw new DomainException(ErrorCode.STATE_CONFLICT, "The file has not passed the checks");
        }
        return new StoredFile(fileId, FileState.SAFE, row.type(), row.size() == null ? 0 : row.size(), null);
    }

    @Override
    @org.springframework.transaction.annotation.Transactional(propagation=org.springframework.transaction.annotation.Propagation.MANDATORY)
    public void markAttached(Actor owner, UUID fileId, FilePurpose purpose) {
        int updated=jdbc.sql("""
                update file_object set attached_at=coalesce(attached_at,:now)
                where id=:id and purpose=:purpose and state='SAFE' and retention_claim is null
                  and owner_type=:owner and owner_id is not distinct from cast(:ownerId as uuid)
                """).param("now",now()).param("id",fileId).param("purpose",purpose.name())
                .param("owner",owner.type().name()).param("ownerId",owner.id()).update();
        if(updated!=1)throw new DomainException(ErrorCode.STATE_CONFLICT,"The file is not available for attachment");
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public void requestErasure(java.util.Collection<UUID> fileIds) {
        if (fileIds.isEmpty()) {
            return;
        }
        jdbc.sql("update file_object set erase_requested_at = :now where id in (:ids) and erase_requested_at is null")
                .param("now", now()).param("ids", java.util.List.copyOf(fileIds)).update();
    }

    @Override
    public RecordingDeletion deleteRecording(UUID fileId) {
        if(org.springframework.transaction.support.TransactionSynchronizationManager.isActualTransactionActive())
            throw new IllegalStateException("Recording deletion must run outside a database transaction");
        return retirement.recording(fileId);
    }

    @Override
    public FileContent open(Actor requester, UUID fileId) {
        record Row(String ownerType, UUID ownerId, String type, long size, String key, String encryption) {
        }
        Row row = jdbc.sql("""
                        select owner_type, owner_id, detected_content_type, size_bytes, storage_key, encryption
                        from file_object where id = :id and state = 'SAFE' and retention_claim is null""")
                .param("id", fileId)
                .query((rs, i) -> new Row(rs.getString(1), rs.getObject(2, UUID.class), rs.getString(3),
                        rs.getLong(4), rs.getString(5), rs.getString(6)))
                .optional()
                .filter(r -> r.ownerType().equals(requester.type().name()) && requester.id().equals(r.ownerId()))
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "File not found"));
        return content(fileId, row.type(), row.size(), row.key(), row.encryption());
    }

    @Override
    public FileContent openAttached(UUID fileId, FilePurpose purpose) {
        record Row(String type, long size, String key, String encryption) {
        }
        Row row = jdbc.sql("""
                        select detected_content_type, size_bytes, storage_key, encryption
                        from file_object where id = :id and purpose = :purpose and state = 'SAFE'""")
                .param("id", fileId)
                .param("purpose", purpose.name())
                .query((rs, i) -> new Row(rs.getString(1), rs.getLong(2), rs.getString(3), rs.getString(4)))
                .optional()
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "File not found"));
        return content(fileId, row.type(), row.size(), row.key(), row.encryption());
    }

    @Override
    public List<UUID> sameContent(UUID fileId, FilePurpose purpose) {
        return jdbc.sql("""
                        select o.id from file_object f
                        join file_object o on o.purpose = f.purpose and o.state = 'SAFE' and o.sha256 = f.sha256
                                          and o.id <> f.id
                        where f.id = :id and f.purpose = :purpose and f.state = 'SAFE'
                        order by o.created_at, o.id
                        limit 50""")
                .param("id", fileId)
                .param("purpose", purpose.name())
                .query(UUID.class)
                .list();
    }

    /** The plain bytes; an encrypted file is decrypted while it is read. */
    private FileContent content(UUID fileId, String type, long size, String key, String scheme) {
        try {
            return new FileContent(fileId, type, size, openStored(key, scheme));
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    /**
     * The plain bytes of a stored file, by the scheme its row records: every reader of stored bytes (downloads, the
     * rescan, re-encryption) goes through here, so none assumes plain bytes on disk (issue #135).
     */
    InputStream openStored(String key, String scheme) throws IOException {
        if (scheme == null) {
            return storage.open(key);
        }
        if (!FileCipher.SCHEME.equals(scheme)) {
            throw new IllegalStateException("Unknown file encryption " + scheme);
        }
        FileCipher cipher = encryption.cipher().orElseThrow(() -> new IllegalStateException(
                "No master key (SECRETS_MASTER_KEY): an encrypted file cannot be opened"));
        return cipher.decrypt(storage.open(key), key);
    }

    private boolean allowedFor(FilePurpose purpose, String type) {
        if (purpose == FilePurpose.SUPPORT_ATTACHMENT && "image/webp".equals(type)) {
            return true;
        }
        return properties.allowedTypes().contains(type);
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
