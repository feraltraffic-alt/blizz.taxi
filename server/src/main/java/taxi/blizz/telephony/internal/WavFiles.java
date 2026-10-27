package taxi.blizz.telephony.internal;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.file.Files;
import java.nio.file.Path;

/** The little of WAV the call recordings need: the length of one, and a test tone. */
final class WavFiles {

    private static final int RATE = 8000;

    private WavFiles() {
    }

    /**
     * Whole seconds of sound from the RIFF chunks (the {@code fmt } byte rate and the {@code data} size); null when the
     * file is not a readable WAV. A {@code data} size Asterisk never filled in counts as the rest of the file.
     */
    static Integer seconds(Path file) throws IOException {
        long size = Files.size(file);
        try (InputStream in = Files.newInputStream(file)) {
            byte[] riff = in.readNBytes(12);
            if (riff.length < 12 || riff[0] != 'R' || riff[8] != 'W') {
                return null;
            }
            long position = 12;
            long byteRate = 0;
            while (true) {
                byte[] header = in.readNBytes(8);
                if (header.length < 8) {
                    return null;
                }
                String id = new String(header, 0, 4, java.nio.charset.StandardCharsets.US_ASCII);
                long length = ByteBuffer.wrap(header, 4, 4).order(ByteOrder.LITTLE_ENDIAN).getInt() & 0xFFFFFFFFL;
                position += 8;
                if (id.equals("fmt ")) {
                    byte[] format = in.readNBytes((int) Math.min(length, 64));
                    if (format.length < 12) {
                        return null;
                    }
                    byteRate = ByteBuffer.wrap(format, 8, 4).order(ByteOrder.LITTLE_ENDIAN).getInt() & 0xFFFFFFFFL;
                    in.skipNBytes(length - format.length + (length & 1));
                } else if (id.equals("data")) {
                    if (byteRate == 0) {
                        return null;
                    }
                    long data = length == 0 || length == 0xFFFFFFFFL || position + length > size
                            ? size - position : length;
                    return (int) Math.round(data / (double) byteRate);
                } else {
                    in.skipNBytes(length + (length & 1));
                }
                position += length + (length & 1);
            }
        } catch (java.io.EOFException e) {
            return null;
        }
    }

    /** {@code seconds} of a 440 Hz tone, 8 kHz 16-bit mono — the fake recording. */
    static byte[] tone(int seconds) {
        int samples = RATE * seconds;
        ByteBuffer wav = ByteBuffer.allocate(44 + samples * 2).order(ByteOrder.LITTLE_ENDIAN);
        wav.put("RIFF".getBytes()).putInt(36 + samples * 2).put("WAVE".getBytes());
        wav.put("fmt ".getBytes()).putInt(16).putShort((short) 1).putShort((short) 1).putInt(RATE).putInt(RATE * 2)
                .putShort((short) 2).putShort((short) 16);
        wav.put("data".getBytes()).putInt(samples * 2);
        for (int i = 0; i < samples; i++) {
            wav.putShort((short) (Math.sin(2 * Math.PI * 440 * i / RATE) * 8000));
        }
        return wav.array();
    }
}
