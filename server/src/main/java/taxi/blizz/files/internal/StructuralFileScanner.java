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
 * whose streams unpack to more than {@link #MAX_INFLATED} is refused rather than half read. An object stream is read
 * only when it is plain or exactly {@code /FlateDecode} without parameters and unpacks to its end; any other is
 * refused, since what it holds cannot be checked (issue #105). Streams are found from their object's dictionary,
 * read with its strings, and the search goes on after {@code endstream}, so neither the end of one stream nor a
 * string in a dictionary is taken for the start of another.
 */
@Component
class StructuralFileScanner implements FileScanner {

    private static final String[] PDF_ACTIVE = {"/JavaScript", "/JS", "/Launch", "/EmbeddedFile", "/OpenAction"};
    private static final Pattern NAME_ESCAPE = Pattern.compile("#([0-9A-Fa-f]{2})");
    /** An object header {@code N G obj}. */
    private static final Pattern OBJECT = Pattern.compile("\\b\\d+\\s+\\d+\\s+obj\\b");
    /** The {@code stream} keyword right after a stream's dictionary. */
    private static final Pattern STREAM = Pattern.compile("stream\\r?\\n");
    /** Any {@code stream} keyword that is not the end of {@code endstream}. */
    private static final Pattern LOOSE_STREAM = Pattern.compile("(?<!end)stream\\r?\\n");
    private static final Pattern OBJECT_STREAM = Pattern.compile("/Type\\s*/ObjStm\\b");
    private static final Pattern FILTER = Pattern.compile("/Filter\\s*(\\[[^\\]]*\\]|/[^\\s/\\[\\]<>()]+)");
    static final int MAX_INFLATED = 64 * 1024 * 1024;

    @Override
    public String engine() {
        return "structural";
    }

    @Override
    public Optional<String> scan(Path file, String contentType) throws IOException {
        if ("application/pdf".equals(contentType)) {
            byte[] bytes = Files.readAllBytes(file);
            String raw = new String(bytes, StandardCharsets.ISO_8859_1);
            StringBuilder content = new StringBuilder(raw);
            long inflated = 0;
            java.util.Set<Integer> read = new java.util.HashSet<>();
            Matcher header = OBJECT.matcher(raw);
            int at = 0;
            while (header.find(at)) {
                at = header.end();
                int open = skipSpace(raw, header.end());
                if (!raw.startsWith("<<", open)) {
                    continue;
                }
                int close = dictionaryEnd(raw, open);
                if (close < 0) {
                    continue;
                }
                at = close;
                Matcher keyword = STREAM.matcher(raw).region(skipSpace(raw, close), raw.length());
                if (!keyword.lookingAt()) {
                    continue;
                }
                int from = keyword.end();
                int to = raw.indexOf("endstream", from);
                if (to < 0) {
                    to = raw.length();
                }
                // The next object starts after this stream: nothing inside its bytes is read as a header.
                at = to;
                read.add(from);
                String dictionary = decodeNames(raw.substring(open, close));
                Inflated unpacked = inflate(bytes, from, to - from, MAX_INFLATED - inflated);
                if (unpacked == null) {
                    return Optional.of("PDF too large to check");
                }
                if (OBJECT_STREAM.matcher(dictionary).find()) {
                    Optional<byte[]> objects = objectStream(dictionary, bytes, from, to, unpacked);
                    if (objects.isEmpty()) {
                        return Optional.of("PDF with an object stream that cannot be checked");
                    }
                    content.append('\n').append(new String(objects.get(), StandardCharsets.ISO_8859_1));
                    inflated += unpacked.bytes().length;
                    continue;
                }
                inflated += unpacked.bytes().length;
                content.append('\n').append(new String(unpacked.bytes(), StandardCharsets.ISO_8859_1));
            }
            // Any other stream keyword (not the end of "endstream"), e.g. in a damaged file a reader would repair: its
            // Flate content is read for active content too, as before.
            Matcher loose = LOOSE_STREAM.matcher(raw);
            while (loose.find()) {
                int from = loose.end();
                if (read.contains(from)) {
                    continue;
                }
                int to = raw.indexOf("endstream", from);
                Inflated unpacked = inflate(bytes, from, (to < 0 ? raw.length() : to) - from, MAX_INFLATED - inflated);
                if (unpacked == null) {
                    return Optional.of("PDF too large to check");
                }
                inflated += unpacked.bytes().length;
                content.append('\n').append(new String(unpacked.bytes(), StandardCharsets.ISO_8859_1));
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

    /**
     * The objects of an object stream when they can be read whole: no filter (plain text), or exactly
     * {@code /FlateDecode} without {@code /DecodeParms} that unpacks to its end. Anything else (another filter, a
     * chain, predictors, damaged or cut data) cannot be checked: empty (issue #105).
     */
    private static Optional<byte[]> objectStream(String dictionary, byte[] bytes, int from, int to,
                                                 Inflated unpacked) {
        if (dictionary.contains("/DecodeParms")) {
            return Optional.empty();
        }
        Matcher filter = FILTER.matcher(dictionary);
        if (!filter.find()) {
            return Optional.of(java.util.Arrays.copyOfRange(bytes, from, to));
        }
        String value = filter.group(1).replaceAll("[\\[\\]\\s]", "");
        if (!"/FlateDecode".equals(value) || !unpacked.finished()) {
            return Optional.empty();
        }
        return Optional.of(unpacked.bytes());
    }

    private static int skipSpace(String raw, int at) {
        while (at < raw.length() && Character.isWhitespace(raw.charAt(at))) {
            at++;
        }
        return at;
    }

    /**
     * The index just after the {@code >>} that closes the dictionary opened at {@code open}, reading literal strings
     * {@code (…)} (nested, with escapes), hex strings {@code <…>} and comments as a PDF reader does, so a {@code >>} or
     * an {@code obj} inside a string does not end it; -1 when it never closes.
     */
    static int dictionaryEnd(String raw, int open) {
        int depth = 0;
        int i = open;
        while (i < raw.length()) {
            char c = raw.charAt(i);
            if (c == '(') {
                int nesting = 0;
                for (; i < raw.length(); i++) {
                    char s = raw.charAt(i);
                    if (s == '\\') {
                        i++;
                    } else if (s == '(') {
                        nesting++;
                    } else if (s == ')' && --nesting == 0) {
                        break;
                    }
                }
                i++;
            } else if (c == '%') {
                while (i < raw.length() && raw.charAt(i) != '\n' && raw.charAt(i) != '\r') {
                    i++;
                }
            } else if (raw.startsWith("<<", i)) {
                depth++;
                i += 2;
            } else if (raw.startsWith(">>", i)) {
                depth--;
                i += 2;
                if (depth == 0) {
                    return i;
                }
            } else if (c == '<') {
                int closeHex = raw.indexOf('>', i);
                if (closeHex < 0) {
                    return -1;
                }
                i = closeHex + 1;
            } else {
                i++;
            }
        }
        return -1;
    }

    /** {@code #xx} in names stands for a byte: a reader sees {@code /J#61vaScript} as {@code /JavaScript}. */
    static String decodeNames(String text) {
        return NAME_ESCAPE.matcher(text).replaceAll(m -> Matcher.quoteReplacement(
                String.valueOf((char) Integer.parseInt(m.group(1), 16))));
    }

    /** A stream's Flate content and whether it unpacked to its end. */
    record Inflated(byte[] bytes, boolean finished) {
    }

    /** The stream unpacked when it is Flate data; empty when it is not; null past {@code budget} bytes. */
    private static Inflated inflate(byte[] bytes, int offset, int length, long budget) {
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
            return new Inflated(out.toByteArray(), inflater.finished());
        } catch (DataFormatException notFlate) {
            return new Inflated(new byte[0], false);
        } finally {
            inflater.end();
        }
    }
}
