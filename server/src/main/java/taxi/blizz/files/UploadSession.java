package taxi.blizz.files;

import java.time.OffsetDateTime;
import java.util.UUID;

/** A short-lived permission to upload exactly one file of the declared type and size. */
public record UploadSession(UUID fileId, String uploadPath, OffsetDateTime expiresAt, long maxBytes) {
}
