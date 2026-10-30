package taxi.blizz.files.internal;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;

/**
 * The antivirus of the dev and sandbox profiles (issue #105): finds only the EICAR test string, anywhere in the file,
 * so the malware path can be tried by hand without a ClamAV daemon. Never chosen in production.
 */
final class FakeContentScanner implements ContentScanner {

    /** Built from two parts so that no source file holds the whole test string. */
    private static final String EICAR = "X5O!P%@AP[4\\PZX54(P^)7CC)7}$" + "EICAR-STANDARD-ANTIVIRUS-TEST-FILE!$H+H*";

    @Override
    public String engine() {
        return "fake";
    }

    @Override
    public Optional<String> scan(Path file) throws Unavailable {
        try {
            String content = new String(Files.readAllBytes(file), StandardCharsets.ISO_8859_1);
            return content.contains(EICAR) ? Optional.of("Eicar-Test-Signature") : Optional.empty();
        } catch (IOException e) {
            throw new Unavailable("The file could not be read for the fake scan", e);
        }
    }
}
