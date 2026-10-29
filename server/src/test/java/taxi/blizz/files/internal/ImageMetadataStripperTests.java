package taxi.blizz.files.internal;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.zip.CRC32;
import org.junit.jupiter.api.Test;

/** PNG and WebP lose their metadata (REQ-SEC-07, audit 29.10.2026: only JPEG was stripped). */
public class ImageMetadataStripperTests {

    /** A real 1×1 PNG: IHDR, IDAT, IEND. */
    static final byte[] PNG = Base64.getDecoder().decode(
            "iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAQAAAC1HAwCAAAAC0lEQVR42mNk+A8AAQUBAScY42YAAAAASUVORK5CYII=");
    private static final int AFTER_IHDR = 8 + 12 + 13;

    private static void chunk(ByteArrayOutputStream out, String type, String data) {
        byte[] t = type.getBytes(StandardCharsets.ISO_8859_1);
        byte[] d = data.getBytes(StandardCharsets.ISO_8859_1);
        int n = d.length;
        out.writeBytes(new byte[] {(byte) (n >>> 24), (byte) (n >> 16), (byte) (n >> 8), (byte) n});
        out.writeBytes(t);
        out.writeBytes(d);
        CRC32 crc = new CRC32();
        crc.update(t);
        crc.update(d);
        long v = crc.getValue();
        out.writeBytes(new byte[] {(byte) (v >>> 24), (byte) (v >> 16), (byte) (v >> 8), (byte) v});
    }

    /** The 1×1 PNG with EXIF and text after its IHDR. */
    public static byte[] pngWithMetadata() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write(PNG, 0, AFTER_IHDR);
        chunk(out, "tEXt", "Comment\0camera owner");
        chunk(out, "iTXt", "XML:com.adobe.xmp\0\0\0\0\0<x:xmpmeta/>");
        chunk(out, "eXIf", "MM\0*GPSLatitude=50.45");
        chunk(out, "tIME", "\7\352\12\35\1\2\3");
        out.write(PNG, AFTER_IHDR, PNG.length - AFTER_IHDR);
        return out.toByteArray();
    }

    private static void riffChunk(ByteArrayOutputStream out, String fourCc, byte[] data) {
        out.writeBytes(fourCc.getBytes(StandardCharsets.ISO_8859_1));
        int n = data.length;
        out.writeBytes(new byte[] {(byte) n, (byte) (n >> 8), (byte) (n >> 16), (byte) (n >> 24)});
        out.writeBytes(data);
        if ((n & 1) == 1) {
            out.write(0);
        }
    }

    static byte[] webpWithMetadata() {
        ByteArrayOutputStream body = new ByteArrayOutputStream();
        body.writeBytes("WEBP".getBytes(StandardCharsets.ISO_8859_1));
        riffChunk(body, "VP8X", new byte[] {0x0C, 0, 0, 0, 0, 0, 0, 0, 0, 0}); // EXIF and XMP announced
        riffChunk(body, "VP8 ", "image-bytes".getBytes(StandardCharsets.ISO_8859_1));
        riffChunk(body, "EXIF", "GPSLatitude=50.45".getBytes(StandardCharsets.ISO_8859_1));
        riffChunk(body, "XMP ", "<x:xmpmeta/>".getBytes(StandardCharsets.ISO_8859_1));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.writeBytes("RIFF".getBytes(StandardCharsets.ISO_8859_1));
        int n = body.size();
        out.writeBytes(new byte[] {(byte) n, (byte) (n >> 8), (byte) (n >> 16), (byte) (n >> 24)});
        out.writeBytes(body.toByteArray());
        return out.toByteArray();
    }

    @Test
    void pngLosesExifTextAndTimeAndKeepsTheImage() {
        assertThat(ImageMetadataStripper.png(pngWithMetadata())).isEqualTo(PNG);
        assertThat(ImageMetadataStripper.png(PNG)).as("nothing to remove").isEqualTo(PNG);
    }

    @Test
    void webpLosesExifAndXmpAndNoLongerAnnouncesThem() {
        byte[] stripped = ImageMetadataStripper.webp(webpWithMetadata());
        String text = new String(stripped, StandardCharsets.ISO_8859_1);
        assertThat(text).doesNotContain("GPSLatitude").doesNotContain("xmpmeta").contains("image-bytes");
        assertThat(stripped[20] & 0x0C).as("VP8X flags").isZero();
        int riffSize = (stripped[4] & 0xFF) | (stripped[5] & 0xFF) << 8 | (stripped[6] & 0xFF) << 16
                | (stripped[7] & 0xFF) << 24;
        assertThat(riffSize).isEqualTo(stripped.length - 8);
    }

    /** A chunk that cannot be read might hide what is to be removed: the file is refused. */
    @Test
    void aStructureThatCannotBeReadIsRefused() {
        assertThat(ImageMetadataStripper.png(Arrays.copyOf(PNG, 16))).as("cut inside IHDR").isNull();
        assertThat(ImageMetadataStripper.png(Arrays.copyOf(PNG, PNG.length - 12))).as("no IEND").isNull();
        byte[] notIhdrFirst = PNG.clone();
        notIhdrFirst[12] = 'X';
        assertThat(ImageMetadataStripper.png(notIhdrFirst)).isNull();
        byte[] webp = webpWithMetadata();
        assertThat(ImageMetadataStripper.webp(Arrays.copyOf(webp, webp.length - 3))).as("shorter than RIFF says")
                .isNull();
        byte[] oversized = webp.clone();
        oversized[16] = (byte) 0xFF; // the VP8X chunk claims more than the file has
        assertThat(ImageMetadataStripper.webp(oversized)).isNull();
    }
}
