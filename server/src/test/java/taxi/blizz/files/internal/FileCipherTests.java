package taxi.blizz.files.internal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Random;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/** Files encrypted at rest (issue #60): whole round trips across segment edges, and every kind of tampering fails. */
class FileCipherTests {

    static final String KEY = "OvNcyb/UEGrsbxNURayDR7cukvqN5pG5gLYhC2py82Q=";
    static final String OTHER_KEY = "BTafAxut8u7D3rruCvQv3xUre9M69sCDmY0XHITZGJA=";
    static final String STORAGE_KEY = "call_recording/2026-10/0b7e1c1e-0000-4000-8000-000000000060";

    final FileCipher cipher = FileCipher.fromMasterKey(KEY).orElseThrow();

    @TempDir
    Path dir;

    private Path encrypted(byte[] plain) throws IOException {
        Path source = Files.write(dir.resolve("plain-" + plain.length), plain);
        Path target = dir.resolve("sealed-" + plain.length);
        cipher.encrypt(source, target, STORAGE_KEY);
        return target;
    }

    private byte[] decrypt(FileCipher with, Path file, String storageKey) throws IOException {
        try (var in = with.decrypt(Files.newInputStream(file), storageKey)) {
            return in.readAllBytes();
        }
    }

    @Test
    void roundTripsAcrossSegmentEdges() throws IOException {
        Random random = new Random(60);
        int segment = FileCipher.SEGMENT;
        for (int length : new int[]{0, 1, segment - 1, segment, segment + 1, 2 * segment, 3 * segment + 17}) {
            byte[] plain = new byte[length];
            random.nextBytes(plain);
            Path file = encrypted(plain);
            assertThat(decrypt(cipher, file, STORAGE_KEY)).as("length " + length).isEqualTo(plain);
            byte[] stored = Files.readAllBytes(file);
            if (length >= 16) {
                assertThat(Arrays.equals(Arrays.copyOfRange(stored, 11, 27), Arrays.copyOf(plain, 16)))
                        .as("not in plain text").isFalse();
            }
        }
    }

    @Test
    void aFileUnderAnotherKeyCutShortOrChangedDoesNotDecrypt() throws IOException {
        byte[] plain = new byte[2 * FileCipher.SEGMENT + 100];
        new Random(61).nextBytes(plain);
        Path file = encrypted(plain);
        byte[] stored = Files.readAllBytes(file);

        assertThatThrownBy(() -> decrypt(cipher, file, "call_recording/2026-10/another"))
                .as("moved under another storage key").isInstanceOf(IOException.class);
        assertThatThrownBy(() -> decrypt(FileCipher.fromMasterKey(OTHER_KEY).orElseThrow(), file, STORAGE_KEY))
                .as("another instance's master key").isInstanceOf(IOException.class);

        Path cut = Files.write(dir.resolve("cut"), Arrays.copyOf(stored, 11 + FileCipher.SEGMENT + 16));
        assertThatThrownBy(() -> decrypt(cipher, cut, STORAGE_KEY)).as("cut at a segment edge")
                .isInstanceOf(IOException.class);

        byte[] flipped = stored.clone();
        flipped[11 + FileCipher.SEGMENT + 20] ^= 1;
        Path changed = Files.write(dir.resolve("changed"), flipped);
        assertThatThrownBy(() -> decrypt(cipher, changed, STORAGE_KEY)).as("one bit changed")
                .isInstanceOf(IOException.class);

        Path notOurs = Files.write(dir.resolve("plain-file"), "RIFF....WAVE".getBytes());
        assertThatThrownBy(() -> decrypt(cipher, notOurs, STORAGE_KEY)).isInstanceOf(IOException.class);
    }

    @Test
    void noMasterKeyMeansNoCipherAndABadOneStopsTheStart() {
        assertThat(FileCipher.fromMasterKey("")).isEmpty();
        assertThat(FileCipher.fromMasterKey(null)).isEmpty();
        assertThatThrownBy(() -> FileCipher.fromMasterKey("c2hvcnQ=")).isInstanceOf(IllegalStateException.class);
    }
    @Test void reservedEncryptionNeverRecreatesAnOutputRemovedByCleanup() throws IOException {
        byte[] bytes={1,2,3};Path plain=Files.write(dir.resolve("reserved-plain"),bytes);
        Path sealed=Files.createFile(dir.resolve("reserved-sealed"));
        cipher.encryptReserved(plain,sealed,STORAGE_KEY);
        assertThat(decrypt(cipher,sealed,STORAGE_KEY)).isEqualTo(bytes);
        Files.delete(sealed);
        assertThatThrownBy(()->cipher.encryptReserved(plain,sealed,STORAGE_KEY)).isInstanceOf(java.nio.file.NoSuchFileException.class);
        assertThat(Files.exists(sealed)).isFalse();
    }

}
