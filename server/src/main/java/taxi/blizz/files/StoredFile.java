package taxi.blizz.files;

import java.util.UUID;

/** Result of an upload after the checks; {@code rejectReason} is set only for REJECTED. */
public record StoredFile(UUID fileId, FileState state, String contentType, long sizeBytes, String rejectReason) {
}
