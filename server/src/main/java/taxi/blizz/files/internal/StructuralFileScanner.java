package taxi.blizz.files.internal;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.springframework.stereotype.Component;

/**
 * Structural checks without an antivirus engine: PDFs with active content (JavaScript, launch or
 * embedded-file actions) are rejected, since a document photo or scan never needs them.
 *
 * <p>Names are read as a PDF reader reads them: {@code /J#61vaScript} is {@code /JavaScript}, and names inside
 * compressed streams (object streams of PDF 1.5) are looked at too (audit 29.10.2026: both slipped through). A file
 * whose streams unpack to more than {@link #MAX_INFLATED} is refused rather than half read.
 */
@Component
class StructuralFileScanner implements FileScanner {

    private static final String[] PDF_ACTIVE = {"/JavaScript", "/JS", "/Launch", "/EmbeddedFile", "/OpenAction"};
    private static final Pattern NAME_ESCAPE = Pattern.compile("#([0-9A-Fa-f]{2})");
    private static final Pattern STREAM = Pattern.compile("stream\\r?\\n");
    static final int MAX_INFLATED = 64 * 1024 * 1024;

    @Override
    public String engine() {
        return "structural";
    }

    @Override
    public Optional<String> scan(Path file, String contentType) throws IOException {
        if ("application/pdf".equals(contentType)) {
            byte[] bytes = Files.readAllBytes(file);
            StringBuilder content = new StringBuilder(new String(bytes, StandardCharsets.ISO_8859_1));
            String raw = content.toString();
            long inflated = 0;
            Matcher start = STREAM.matcher(raw);
            while (start.find()) {
                int from = start.end();
                int to = raw.indexOf("endstream", from);
                if (to < 0) {
                    break;
                }
                byte[] unpacked = inflate(bytes, from, to - from, MAX_INFLATED - inflated);
                if (unpacked == null) {
                    return Optional.of("PDF too large to check");
                }
                inflated += unpacked.length;
                content.append('\n').append(new String(unpacked, StandardCharsets.ISO_8859_1));
            }
            String text = decodeNames(content.toString());
            for (String marker : PDF_ACTIVE) {
                if (text.contains(marker)) {
                    return Optional.of("PDF with active content is not accepted");
                }
            }
        }
        return Optional.empty();
    }

    /** {@code #xx} in names stands for a byte: a reader sees {@code /J#61vaScript} as {@code /JavaScript}. */
    static String decodeNames(String text) {
        return NAME_ESCAPE.matcher(text).replaceAll(m -> Matcher.quoteReplacement(
                String.valueOf((char) Integer.parseInt(m.group(1), 16))));
    }

    /** The stream unpacked when it is Flate data; empty when it is not; null past {@code budget} bytes. */
    private static byte[] inflate(byte[] bytes, int offset, int length, long budget) {
        Inflater inflater = new Inflater();
        try {
            inflater.setInput(bytes, offset, length);
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] buffer = new byte[8192];
            while (!inflater.finished()) {
                int n = inflater.inflate(buffer);
                if (n == 0 && (inflater.needsInput() || inflater.needsDictionary())) {
                    break;
                }
                out.write(buffer, 0, n);
                if (out.size() > budget) {
                    return null;
                }
            }
            return out.toByteArray();
        } catch (DataFormatException notFlate) {
            return new byte[0];
        } finally {
            inflater.end();
        }
    }
}
