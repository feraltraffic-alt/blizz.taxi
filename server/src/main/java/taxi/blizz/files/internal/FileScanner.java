package taxi.blizz.files.internal;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;

/**
 * Checks file content before it leaves quarantine. Returns a reason to reject, or empty for a clean
 * file. The default implementation only performs structural checks; an antivirus engine (e.g.
 * ClamAV) is another implementation of this interface, configured per installation.
 */
interface FileScanner {

    String engine();

    Optional<String> scan(Path file, String contentType) throws IOException;
}
