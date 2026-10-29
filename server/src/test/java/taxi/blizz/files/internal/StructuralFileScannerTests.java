package taxi.blizz.files.internal;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.zip.Deflater;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/** Audit 29.10.2026: active content hidden by name escapes or inside compressed streams is found. */
class StructuralFileScannerTests {

    @TempDir
    Path dir;

    final StructuralFileScanner scanner = new StructuralFileScanner();

    private Path pdf(byte[]... parts) throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write("%PDF-1.7\n1 0 obj\n<< /Type /Catalog >>\nendobj\n".getBytes(StandardCharsets.ISO_8859_1));
        for (byte[] part : parts) {
            out.write(part);
        }
        out.write("%%EOF\n".getBytes(StandardCharsets.ISO_8859_1));
        Path file = Files.createTempFile(dir, "scan", ".pdf");
        Files.write(file, out.toByteArray());
        return file;
    }

    private static byte[] stream(String content) {
        Deflater deflater = new Deflater();
        deflater.setInput(content.getBytes(StandardCharsets.ISO_8859_1));
        deflater.finish();
        byte[] buffer = new byte[4096];
        int n = deflater.deflate(buffer);
        deflater.end();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.writeBytes("2 0 obj\n<< /Type /ObjStm /Filter /FlateDecode >>\nstream\n".getBytes(StandardCharsets.ISO_8859_1));
        out.write(buffer, 0, n);
        out.writeBytes("\nendstream\nendobj\n".getBytes(StandardCharsets.ISO_8859_1));
        return out.toByteArray();
    }

    @Test
    void escapedNamesAndCompressedActionsAreRefusedAndAPlainScanPasses() throws Exception {
        assertThat(scanner.scan(pdf("<< /OpenAction 3 0 R >>\n".getBytes(StandardCharsets.ISO_8859_1)),
                "application/pdf")).isPresent();
        assertThat(scanner.scan(pdf("<< /Open#41ction << /S /J#61vaScript >> >>\n"
                .getBytes(StandardCharsets.ISO_8859_1)), "application/pdf")).as("name escapes").isPresent();
        assertThat(scanner.scan(pdf(stream("<< /S /JavaScript /JS (app.alert(1)) >>")), "application/pdf"))
                .as("inside an object stream").isPresent();
        assertThat(scanner.scan(pdf(stream("<< /Type /Page /MediaBox [0 0 595 842] >>")), "application/pdf"))
                .as("a plain compressed page").isEmpty();
        assertThat(scanner.scan(pdf("<< /Type /Page >>\n".getBytes(StandardCharsets.ISO_8859_1)), "application/pdf"))
                .isEmpty();
    }
}
