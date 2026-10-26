package taxi.blizz.files.internal;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Optional;

/** Detects the real type from the first bytes; the declared Content-Type is not trusted. */
final class ContentSniffer {

    private static final byte[] JPEG = {(byte) 0xFF, (byte) 0xD8, (byte) 0xFF};
    private static final byte[] PNG = {(byte) 0x89, 'P', 'N', 'G', '\r', '\n', 0x1A, '\n'};
    private static final byte[] PDF = {'%', 'P', 'D', 'F', '-'};

    private ContentSniffer() {
    }

    static Optional<String> detect(Path file) throws IOException {
        byte[] head = new byte[8];
        int read;
        try (InputStream in = Files.newInputStream(file)) {
            read = in.readNBytes(head, 0, head.length);
        }
        if (startsWith(head, read, JPEG)) {
            return Optional.of("image/jpeg");
        }
        if (startsWith(head, read, PNG)) {
            return Optional.of("image/png");
        }
        if (startsWith(head, read, PDF)) {
            return Optional.of("application/pdf");
        }
        return Optional.empty();
    }

    private static boolean startsWith(byte[] head, int read, byte[] magic) {
        return read >= magic.length && Arrays.equals(Arrays.copyOf(head, magic.length), magic);
    }
}
