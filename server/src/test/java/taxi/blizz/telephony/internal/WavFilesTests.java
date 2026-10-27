package taxi.blizz.telephony.internal;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/** The length of a recording from its WAV header, including the header Asterisk leaves unfinished. */
class WavFilesTests {

    @TempDir
    Path dir;

    @Test
    void secondsFromTheHeader() throws IOException {
        assertThat(WavFiles.seconds(Files.write(dir.resolve("tone.wav"), WavFiles.tone(3)))).isEqualTo(3);

        byte[] unfinished = WavFiles.tone(4);
        ByteBuffer.wrap(unfinished).order(ByteOrder.LITTLE_ENDIAN).putInt(40, 0); // data size never written
        assertThat(WavFiles.seconds(Files.write(dir.resolve("open.wav"), unfinished))).isEqualTo(4);

        assertThat(WavFiles.seconds(Files.write(dir.resolve("not.wav"), "not a wav at all".getBytes()))).isNull();
        assertThat(WavFiles.seconds(Files.write(dir.resolve("empty.wav"), new byte[0]))).isNull();
    }
}
