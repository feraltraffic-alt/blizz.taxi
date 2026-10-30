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

    /** Issue #105: an object stream whose content cannot be read cannot be checked, so it is refused. */
    @Test
    void anObjectStreamThatCannotBeUnpackedIsRefused() throws Exception {
        byte[] junk = "2 0 obj\n<< /Type /ObjStm /Filter /FlateDecode >>\nstream\nnot deflate data at all\nendstream\nendobj\n"
                .getBytes(StandardCharsets.ISO_8859_1);
        assertThat(scanner.scan(pdf(junk), "application/pdf")).as("corrupt Flate").isPresent();
        byte[] lzw = "2 0 obj\n<< /Type /ObjStm /Filter /LZWDecode >>\nstream\n\u0080\u000b\u0060\u0050\nendstream\nendobj\n"
                .getBytes(StandardCharsets.ISO_8859_1);
        assertThat(scanner.scan(pdf(lzw), "application/pdf")).as("a filter it does not unpack").isPresent();
        byte[] escaped = "2 0 obj\n<< /Type /Obj#53tm /Filter /Flate#44ecode >>\nstream\nraw\nendstream\nendobj\n"
                .getBytes(StandardCharsets.ISO_8859_1);
        assertThat(scanner.scan(pdf(escaped), "application/pdf")).as("the name escaped").isPresent();
        assertThat(scanner.scan(pdf(stream("<< /Type /Page /MediaBox [0 0 595 842] >>")), "application/pdf"))
                .as("a Flate object stream that unpacks").isEmpty();
        byte[] image = "3 0 obj\n<< /Type /XObject /Subtype /Image /Filter /DCTDecode >>\nstream\n\u00ff\u00d8raw\nendstream\nendobj\n"
                .getBytes(StandardCharsets.ISO_8859_1);
        assertThat(scanner.scan(pdf(image), "application/pdf")).as("an image stream is not an object stream").isEmpty();
    }

    // ------------------------------------------------------------ review of #131: more than one stream per file

    private static byte[] deflate(String content, boolean cut) {
        Deflater deflater = new Deflater();
        deflater.setInput(content.getBytes(StandardCharsets.ISO_8859_1));
        deflater.finish();
        byte[] buffer = new byte[8192];
        int n = deflater.deflate(buffer);
        deflater.end();
        return java.util.Arrays.copyOf(buffer, cut ? n / 2 : n);
    }

    /** {@code N 0 obj DICTIONARY stream … endstream endobj}. */
    private static byte[] object(int number, String dictionary, byte[] data) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.writeBytes((number + " 0 obj\n" + dictionary + "\nstream\n").getBytes(StandardCharsets.ISO_8859_1));
        out.writeBytes(data);
        out.writeBytes("\nendstream\nendobj\n".getBytes(StandardCharsets.ISO_8859_1));
        return out.toByteArray();
    }

    private static final String PAGE = "<< /Type /Page /MediaBox [0 0 595 842] >>";
    private static final String SCRIPT = "<< /S /JavaScript /JS (app.alert(1)) >>";

    private byte[] objStm(String content) {
        return object(2, "<< /Type /ObjStm /N 1 /First 4 /Filter /FlateDecode >>", deflate(content, false));
    }

    private byte[] xref() {
        return object(3, "<< /Type /XRef /Size 4 /W [1 2 1] /Filter /FlateDecode >>", deflate("\0\0\0\1", false));
    }

    private static byte[] image() {
        return object(4, "<< /Type /XObject /Subtype /Image /Filter /DCTDecode /Length 6 >>",
                new byte[] {(byte) 0xFF, (byte) 0xD8, 1, 2, (byte) 0xFF, (byte) 0xD9});
    }

    @Test
    void realPdfsWithAnObjectStreamFollowedByOtherStreamsPass() throws Exception {
        assertThat(scanner.scan(pdf(objStm(PAGE)), "application/pdf")).as("object stream alone").isEmpty();
        assertThat(scanner.scan(pdf(objStm(PAGE), xref()), "application/pdf")).as("+ an XRef stream").isEmpty();
        assertThat(scanner.scan(pdf(objStm(PAGE), image()), "application/pdf")).as("+ an image").isEmpty();
        assertThat(scanner.scan(pdf(objStm(PAGE), xref(), image(), objStm(PAGE)), "application/pdf"))
                .as("two object streams, an XRef and an image").isEmpty();
        byte[] plain = object(2, "<< /Type /ObjStm /N 1 /First 4 >>", PAGE.getBytes(StandardCharsets.ISO_8859_1));
        assertThat(scanner.scan(pdf(plain, xref()), "application/pdf")).as("an uncompressed object stream").isEmpty();
    }

    @Test
    void activeContentAfterOtherStreamsIsStillFound() throws Exception {
        assertThat(scanner.scan(pdf(image(), xref(), objStm(SCRIPT)), "application/pdf")).isPresent();
        byte[] plain = object(2, "<< /Type /ObjStm /N 1 /First 4 >>", SCRIPT.getBytes(StandardCharsets.ISO_8859_1));
        assertThat(scanner.scan(pdf(xref(), plain), "application/pdf")).as("in a plain object stream").isPresent();
    }

    @Test
    void anObjectStreamThatCannotBeReadWholeIsRefusedHoweverItHides() throws Exception {
        byte[] stringInDictionary = object(2, "<< /Type /ObjStm /X (obj) /Y (>>) /Filter /FlateDecode >>",
                "not deflate data".getBytes(StandardCharsets.ISO_8859_1));
        assertThat(scanner.scan(pdf(stringInDictionary), "application/pdf"))
                .as("damaged, with 'obj' and '>>' in strings of its dictionary").isPresent();
        String hex = java.util.HexFormat.of().formatHex(deflate(SCRIPT, false)) + ">";
        byte[] chain = object(2, "<< /Type /ObjStm /Filter [/ASCIIHexDecode /FlateDecode] >>",
                hex.getBytes(StandardCharsets.ISO_8859_1));
        assertThat(scanner.scan(pdf(chain), "application/pdf")).as("a filter chain").isPresent();
        byte[] cut = object(2, "<< /Type /ObjStm /Filter /FlateDecode >>",
                deflate("<< /Type /Page >> " + "x".repeat(4000) + SCRIPT, true));
        assertThat(scanner.scan(pdf(cut), "application/pdf")).as("cut Flate data").isPresent();
        byte[] parameters = object(2, "<< /Type /ObjStm /Filter /FlateDecode /DecodeParms << /Predictor 12 >> >>",
                deflate(PAGE, false));
        assertThat(scanner.scan(pdf(parameters), "application/pdf")).as("with predictors").isPresent();
        byte[] array = object(2, "<< /Type /ObjStm /Filter [/FlateDecode] >>", deflate(PAGE, false));
        assertThat(scanner.scan(pdf(array), "application/pdf")).as("Flate written as a one-element array").isEmpty();
    }
}
