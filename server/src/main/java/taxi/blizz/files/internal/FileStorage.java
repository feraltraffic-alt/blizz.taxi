package taxi.blizz.files.internal;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;

/** Raw byte storage under opaque keys. Local disk now; object storage is another implementation. */
interface FileStorage {

    /** Writes the stream to a temporary location and returns its path for checking. */
    Path stage(InputStream body, long maxBytes) throws IOException, TooLargeException;

    void store(Path staged, String key) throws IOException;

    InputStream open(String key) throws IOException;

    void delete(String key) throws IOException;

    final class TooLargeException extends Exception {
        TooLargeException() {
            super("Body exceeds the declared size");
        }
    }
}
