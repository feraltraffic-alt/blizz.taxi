package taxi.blizz.files.internal;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;

/** Raw byte storage under opaque keys. Local disk now; object storage is another implementation. */
interface FileStorage {

    /** Reserve empty raw/encrypted staging paths while the metadata row is locked; no body I/O here. */
    Path reserve(String key) throws IOException;

    /** Writes only to the reserved path; never recreates a path that cleanup already removed. */
    Path stage(InputStream body, long maxBytes, String key) throws IOException, TooLargeException;

    /** Removes raw/encrypted/partial staging bytes but preserves a successfully stored final object. */
    void clearStage(String key) throws IOException;

    void store(Path staged, String key) throws IOException;

    InputStream open(String key) throws IOException;

    void delete(String key) throws IOException;

    final class TooLargeException extends Exception {
        TooLargeException() {
            super("Body exceeds the declared size");
        }
    }
}
