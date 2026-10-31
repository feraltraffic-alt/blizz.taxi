package taxi.blizz.files;

import java.io.InputStream;
import java.util.UUID;
import taxi.blizz.platform.Actor;

/**
 * Private file uploads (REQ-SEC-06, REQ-SEC-07). A file belongs to the subject that opened the
 * upload session; the client-supplied file name is never used. Only files that passed the checks
 * (SAFE) can be attached to business records or downloaded.
 */
public interface FileService {

    /** Opens an upload session for one file; repeating the command returns the same session. */
    UploadSession openUpload(Actor owner, UUID commandId, FilePurpose purpose, String contentType, long sizeBytes);

    /**
     * Stores the body, checks it and returns the outcome. A file that fails a check is REJECTED and
     * its content deleted; the response says why without exposing internals.
     */
    StoredFile upload(Actor owner, UUID fileId, String contentType, long contentLength, InputStream body);

    /** Returns the SAFE file metadata or throws unless it belongs to {@code owner} and has {@code purpose}. */
    StoredFile requireAttachable(Actor owner, UUID fileId, FilePurpose purpose);

    /** Marks a reference in the caller's business transaction, excluding a simultaneous retention claim. */
    void markAttached(Actor owner, UUID fileId, FilePurpose purpose);

    /** Removes a system recording's bytes before its metadata. No open transaction; retry-safe if already absent. */
    RecordingDeletion deleteRecording(UUID fileId);

    /**
     * The owning record asked for these files to go: a deleted rider's support attachments (issue #144). In the
     * caller's transaction (MANDATORY); the erasure sweep deletes the bytes, then the rows. Unknown ids are ignored, a
     * repeat changes nothing.
     */
    void requestErasure(java.util.Collection<UUID> fileIds);

    /** A remaining fenced file may have lost bytes and must keep its owning recording fenced too. */
    record RecordingDeletion(boolean gone, boolean fenced) {
    }

    /** Opens a SAFE file for its owner; anyone else gets NOT_FOUND (no hint that it exists). */
    FileContent open(Actor requester, UUID fileId);

    /**
     * Stores a file the server itself produced or fetched (no uploading subject), for {@link FilePurpose#CALL_RECORDING}
     * only: the real type must be {@code contentType}, and the bytes are encrypted at rest. SAFE, or REJECTED with the
     * reason (nothing is kept then). The file is reachable only through {@link #openAttached}. Never in a transaction:
     * the body is read and written here.
     */
    StoredFile storeSystemFile(FilePurpose purpose, String contentType, InputStream body, long maxBytes);

    /** Opens a SAFE file after another module has already authorized access to a record that owns it. */
    FileContent openAttached(UUID fileId, FilePurpose purpose);

    /**
     * Other SAFE files of {@code purpose} with exactly the same content (SHA-256) as {@code fileId}, oldest first, at
     * most 50; empty when there are none or the file is not SAFE. For spotting one document photo used by two drivers
     * (issue #105): the caller maps the ids to its own records, nobody reads {@code file_object} but this module.
     */
    java.util.List<UUID> sameContent(UUID fileId, FilePurpose purpose);
}
