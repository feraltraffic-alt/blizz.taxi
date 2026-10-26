package taxi.blizz.files;

import java.io.InputStream;
import java.util.UUID;

/** An open, already authorized file; the caller must close the stream. */
public record FileContent(UUID fileId, String contentType, long sizeBytes, InputStream stream) {
}
