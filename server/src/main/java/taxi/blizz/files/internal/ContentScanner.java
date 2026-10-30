package taxi.blizz.files.internal;

import java.nio.file.Path;
import java.util.Optional;

/**
 * The antivirus step of an upload (issue #105, threat model D1), after the structural {@link FileScanner}: empty for
 * a clean file, the threat's name for an infected one, and {@link Unavailable} when the engine cannot tell — never
 * "clean" for an answer it does not understand. Which engine runs is settled once at start-up
 * ({@code FilesConfiguration}): ClamAV when {@code blizz.files.clamav.address} is set, the EICAR-only fake in the
 * dev and sandbox profiles, otherwise {@link #OFF}.
 */
interface ContentScanner {

    /** No antivirus configured: the upload is checked structurally only, and the start-up log says so. */
    ContentScanner OFF = new ContentScanner() {
        @Override
        public String engine() {
            return "";
        }

        @Override
        public Optional<String> scan(Path file) {
            return Optional.empty();
        }
    };

    /** Recorded in {@code file_object.scan_engine} after the structural engine; empty when off. */
    String engine();

    Optional<String> scan(Path file) throws Unavailable;

    /** The engine did not give a verdict: not reachable, timed out, or answered something else than OK or FOUND. */
    final class Unavailable extends Exception {
        Unavailable(String message) {
            super(message);
        }

        Unavailable(String message, Throwable cause) {
            super(message, cause);
        }
    }
}
