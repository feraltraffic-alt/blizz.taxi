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

    /** Opens a SAFE file for its owner; anyone else gets NOT_FOUND (no hint that it exists). */
    FileContent open(Actor requester, UUID fileId);

    /** Opens a SAFE file after another module has already authorized access to a record that owns it. */
    FileContent openAttached(UUID fileId, FilePurpose purpose);
}
