package taxi.blizz.files.internal;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;
import org.springframework.stereotype.Component;

/**
 * Structural checks without an antivirus engine: PDFs with active content (JavaScript, launch or
 * embedded-file actions) are rejected, since a document photo or scan never needs them.
 */
@Component
class StructuralFileScanner implements FileScanner {

    private static final String[] PDF_ACTIVE = {"/JavaScript", "/JS", "/Launch", "/EmbeddedFile", "/OpenAction"};

    @Override
    public String engine() {
        return "structural";
    }

    @Override
    public Optional<String> scan(Path file, String contentType) throws IOException {
        if ("application/pdf".equals(contentType)) {
            String content = new String(Files.readAllBytes(file), StandardCharsets.ISO_8859_1);
            for (String marker : PDF_ACTIVE) {
                if (content.contains(marker)) {
                    return Optional.of("PDF with active content is not accepted");
                }
            }
        }
        return Optional.empty();
    }
}
