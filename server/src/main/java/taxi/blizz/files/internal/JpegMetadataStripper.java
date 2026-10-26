package taxi.blizz.files.internal;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Removes EXIF/XMP (APP1), IPTC (APP13) and comment segments from a JPEG without re-encoding the
 * image (REQ-SEC-07: location and camera data are not needed to verify a document). Returns false
 * for a structure it does not understand, which the caller treats as a rejected file.
 */
final class JpegMetadataStripper {

    private static final int APP1 = 0xE1;
    private static final int APP13 = 0xED;
    private static final int COMMENT = 0xFE;
    private static final int START_OF_SCAN = 0xDA;

    private JpegMetadataStripper() {
    }

    static boolean strip(Path file) throws IOException {
        byte[] in = Files.readAllBytes(file);
        if (in.length < 4 || (in[0] & 0xFF) != 0xFF || (in[1] & 0xFF) != 0xD8) {
            return false;
        }
        ByteArrayOutputStream out = new ByteArrayOutputStream(in.length);
        out.write(in, 0, 2);
        int pos = 2;
        while (pos < in.length) {
            if ((in[pos] & 0xFF) != 0xFF || pos + 1 >= in.length) {
                return false;
            }
            int marker = in[pos + 1] & 0xFF;
            if (marker == 0xFF) {
                pos++;
                continue;
            }
            if (marker == 0xD8 || marker == 0x01 || (marker >= 0xD0 && marker <= 0xD7)) {
                out.write(in, pos, 2);
                pos += 2;
                continue;
            }
            if (marker == 0xD9) {
                out.write(in, pos, 2);
                pos += 2;
                break;
            }
            if (pos + 3 >= in.length) {
                return false;
            }
            int length = ((in[pos + 2] & 0xFF) << 8) | (in[pos + 3] & 0xFF);
            if (length < 2 || pos + 2 + length > in.length) {
                return false;
            }
            if (marker == START_OF_SCAN) {
                out.write(in, pos, in.length - pos);
                pos = in.length;
                break;
            }
            if (marker != APP1 && marker != APP13 && marker != COMMENT) {
                out.write(in, pos, 2 + length);
            }
            pos += 2 + length;
        }
        Files.write(file, out.toByteArray());
        return true;
    }
}
