package taxi.blizz.files.internal;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Set;

/**
 * Removes metadata from PNG and WebP images without re-encoding them (REQ-SEC-07, audit 29.10.2026: only JPEG was
 * stripped): location, camera and free text are not needed to verify a document or read a support photo. Returns
 * false for a structure it does not understand, which the caller treats as a rejected file — a chunk that cannot be
 * read could hide what this is meant to remove.
 */
final class ImageMetadataStripper {

    private static final byte[] PNG_SIGNATURE = {(byte) 0x89, 'P', 'N', 'G', '\r', '\n', 0x1A, '\n'};
    /** EXIF, text of every kind and the last-modified time. */
    private static final Set<String> PNG_METADATA = Set.of("eXIf", "tEXt", "zTXt", "iTXt", "tIME");
    private static final Set<String> WEBP_METADATA = Set.of("EXIF", "XMP ");
    /** The flags of a VP8X chunk that announce EXIF (bit 3) and XMP (bit 2). */
    private static final int VP8X_EXIF_AND_XMP = 0x08 | 0x04;

    private ImageMetadataStripper() {
    }

    static boolean strip(Path file, String contentType) throws IOException {
        byte[] in = Files.readAllBytes(file);
        byte[] out = switch (contentType) {
            case "image/png" -> png(in);
            case "image/webp" -> webp(in);
            default -> in;
        };
        if (out == null) {
            return false;
        }
        if (out != in) {
            Files.write(file,out,java.nio.file.StandardOpenOption.WRITE,java.nio.file.StandardOpenOption.TRUNCATE_EXISTING);
        }
        return true;
    }

    /** Chunks are length (4, big-endian), type (4), data, CRC (4); IHDR comes first and IEND last. */
    static byte[] png(byte[] in) {
        if (in.length < PNG_SIGNATURE.length || !java.util.Arrays.equals(in, 0, 8, PNG_SIGNATURE, 0, 8)) {
            return null;
        }
        ByteArrayOutputStream out = new ByteArrayOutputStream(in.length);
        out.write(in, 0, 8);
        int pos = 8;
        boolean first = true;
        while (true) {
            if (pos + 12 > in.length) {
                return null; // no IEND
            }
            long length = ((in[pos] & 0xFFL) << 24) | ((in[pos + 1] & 0xFF) << 16) | ((in[pos + 2] & 0xFF) << 8)
                    | (in[pos + 3] & 0xFF);
            if (length > in.length - pos - 12L) {
                return null;
            }
            String type = new String(in, pos + 4, 4, StandardCharsets.ISO_8859_1);
            if (first && !"IHDR".equals(type)) {
                return null;
            }
            first = false;
            int size = 12 + (int) length;
            if (!PNG_METADATA.contains(type)) {
                out.write(in, pos, size);
            }
            pos += size;
            if ("IEND".equals(type)) {
                return out.toByteArray(); // anything after IEND is dropped too
            }
        }
    }

    /** RIFF, size (4, little-endian), WEBP, then chunks: FourCC, size (4, little-endian), data padded to even. */
    static byte[] webp(byte[] in) {
        if (in.length < 12 || !"RIFF".equals(new String(in, 0, 4, StandardCharsets.ISO_8859_1))
                || !"WEBP".equals(new String(in, 8, 4, StandardCharsets.ISO_8859_1))) {
            return null;
        }
        long riffSize = littleEndian(in, 4);
        if (riffSize < 4 || riffSize + 8 > in.length) {
            return null;
        }
        int end = (int) (riffSize + 8);
        ByteArrayOutputStream out = new ByteArrayOutputStream(in.length);
        out.write(in, 0, 12);
        int pos = 12;
        int vp8xFlags = -1;
        while (pos < end) {
            if (pos + 8 > end) {
                return null;
            }
            String fourCc = new String(in, pos, 4, StandardCharsets.ISO_8859_1);
            long size = littleEndian(in, pos + 4);
            long padded = size + (size & 1);
            if (padded > end - pos - 8L) {
                return null;
            }
            int total = 8 + (int) padded;
            if (!WEBP_METADATA.contains(fourCc)) {
                if ("VP8X".equals(fourCc) && size >= 1) {
                    vp8xFlags = out.size() + 8;
                }
                out.write(in, pos, total);
            }
            pos += total;
        }
        byte[] result = out.toByteArray();
        if (vp8xFlags >= 0) {
            result[vp8xFlags] = (byte) (result[vp8xFlags] & ~VP8X_EXIF_AND_XMP);
        }
        int newSize = result.length - 8;
        result[4] = (byte) newSize;
        result[5] = (byte) (newSize >> 8);
        result[6] = (byte) (newSize >> 16);
        result[7] = (byte) (newSize >> 24);
        return result;
    }

    private static long littleEndian(byte[] in, int at) {
        return (in[at] & 0xFFL) | ((in[at + 1] & 0xFFL) << 8) | ((in[at + 2] & 0xFFL) << 16)
                | ((in[at + 3] & 0xFFL) << 24);
    }
}
