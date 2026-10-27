package taxi.blizz.files.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Base64;
import java.util.Optional;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * Encryption of file bytes at rest (issue #60): AES-256-GCM in segments of 64 KiB, so a long recording never sits in
 * memory whole. Each segment's nonce is a random per-file prefix, the segment's number and a last-segment flag, and the
 * storage key is authenticated with every segment — a file cut short, reordered or moved under another key does not
 * decrypt. The key is derived (HKDF-SHA256, info {@value #INFO}) from the instance's master key
 * ({@code SECRETS_MASTER_KEY}), so a copy of the file store, with or without the database, reveals nothing.
 */
final class FileCipher {

    /** Stored in {@code file_object.encryption}. */
    static final String SCHEME = "AES256GCM-STREAM-1";
    static final int SEGMENT = 64 * 1024;

    private static final String INFO = "blizz/files/v1";
    private static final byte[] MAGIC = {'B', 'Z', 'F', '1'};
    private static final int PREFIX = 7;
    private static final int TAG = 16;

    private final SecretKeySpec key;
    private final SecureRandom random = new SecureRandom();

    private FileCipher(byte[] key) {
        this.key = new SecretKeySpec(key, "AES");
    }

    /** Empty without a master key: files that must be encrypted cannot be stored then. */
    static Optional<FileCipher> fromMasterKey(String masterKey) {
        if (masterKey == null || masterKey.isBlank()) {
            return Optional.empty();
        }
        byte[] master;
        try {
            master = Base64.getDecoder().decode(masterKey.strip());
        } catch (IllegalArgumentException e) {
            throw new IllegalStateException("blizz.secrets.master-key must be Base64", e);
        }
        if (master.length != 32) {
            throw new IllegalStateException("blizz.secrets.master-key must be 32 bytes (256 bits) in Base64");
        }
        return Optional.of(new FileCipher(hkdf(master, INFO.getBytes(StandardCharsets.UTF_8))));
    }

    /** Writes the encrypted form of {@code plain} to {@code target}; {@code storageKey} is bound to it. */
    void encrypt(Path plain, Path target, String storageKey) throws IOException {
        byte[] prefix = new byte[PREFIX];
        random.nextBytes(prefix);
        byte[] aad = storageKey.getBytes(StandardCharsets.UTF_8);
        try (InputStream in = Files.newInputStream(plain); OutputStream out = Files.newOutputStream(target)) {
            out.write(MAGIC);
            out.write(prefix);
            byte[] current = in.readNBytes(SEGMENT);
            for (int counter = 0; ; counter++) {
                byte[] next = current.length == SEGMENT ? in.readNBytes(SEGMENT) : new byte[0];
                boolean last = next.length == 0;
                out.write(cipher(Cipher.ENCRYPT_MODE, prefix, counter, last, aad).doFinal(current));
                if (last) {
                    return;
                }
                if (counter == Integer.MAX_VALUE) {
                    throw new IOException("File too large to encrypt");
                }
                current = next;
            }
        } catch (GeneralSecurityException e) {
            throw new IOException("Cannot encrypt the file", e);
        }
    }

    /** The plain bytes of an encrypted file; a damaged or foreign file fails with an IOException while read. */
    InputStream decrypt(InputStream encrypted, String storageKey) throws IOException {
        byte[] header = encrypted.readNBytes(MAGIC.length + PREFIX);
        if (header.length != MAGIC.length + PREFIX || !Arrays.equals(Arrays.copyOf(header, MAGIC.length), MAGIC)) {
            encrypted.close();
            throw new IOException("Not an encrypted file");
        }
        return new Decrypting(encrypted, Arrays.copyOfRange(header, MAGIC.length, header.length),
                storageKey.getBytes(StandardCharsets.UTF_8));
    }

    private Cipher cipher(int mode, byte[] prefix, int counter, boolean last, byte[] aad)
            throws GeneralSecurityException {
        byte[] nonce = ByteBuffer.allocate(12).put(prefix).putInt(counter).put((byte) (last ? 1 : 0)).array();
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(mode, key, new GCMParameterSpec(TAG * 8, nonce));
        cipher.updateAAD(aad);
        return cipher;
    }

    /** RFC 5869 with a zero salt, one block of output (32 bytes). */
    private static byte[] hkdf(byte[] inputKey, byte[] info) {
        try {
            Mac extract = Mac.getInstance("HmacSHA256");
            extract.init(new SecretKeySpec(new byte[32], "HmacSHA256"));
            byte[] prk = extract.doFinal(inputKey);
            Mac expand = Mac.getInstance("HmacSHA256");
            expand.init(new SecretKeySpec(prk, "HmacSHA256"));
            expand.update(info);
            expand.update((byte) 1);
            return expand.doFinal();
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("HMAC-SHA256 is not available", e);
        }
    }

    /** Reads one segment ahead of what it hands out; the end of the stream tells which segment is the last. */
    private final class Decrypting extends InputStream {

        private final InputStream in;
        private final byte[] prefix;
        private final byte[] aad;
        private final byte[] chunk = new byte[SEGMENT + TAG];
        private int counter;
        private int lookahead = -1;
        private boolean done;
        private byte[] plain = new byte[0];
        private int position;

        Decrypting(InputStream in, byte[] prefix, byte[] aad) {
            this.in = in;
            this.prefix = prefix;
            this.aad = aad;
        }

        @Override
        public int read() throws IOException {
            if (!available0()) {
                return -1;
            }
            return plain[position++] & 0xFF;
        }

        @Override
        public int read(byte[] target, int offset, int length) throws IOException {
            if (length == 0) {
                return 0;
            }
            if (!available0()) {
                return -1;
            }
            int n = Math.min(length, plain.length - position);
            System.arraycopy(plain, position, target, offset, n);
            position += n;
            return n;
        }

        @Override
        public void close() throws IOException {
            in.close();
        }

        private boolean available0() throws IOException {
            while (position >= plain.length) {
                if (done) {
                    return false;
                }
                next();
            }
            return true;
        }

        private void next() throws IOException {
            int n = 0;
            if (lookahead >= 0) {
                chunk[n++] = (byte) lookahead;
                lookahead = -1;
            }
            n += in.readNBytes(chunk, n, chunk.length - n);
            boolean last;
            if (n < chunk.length) {
                last = true;
            } else {
                int b = in.read();
                last = b < 0;
                lookahead = b;
            }
            if (n < TAG) {
                throw new IOException("The encrypted file is cut short");
            }
            try {
                plain = cipher(Cipher.DECRYPT_MODE, prefix, counter++, last, aad).doFinal(chunk, 0, n);
            } catch (AEADBadTagException e) {
                throw new IOException("The encrypted file is damaged or was encrypted with another key", e);
            } catch (GeneralSecurityException e) {
                throw new IOException("Cannot decrypt the file", e);
            }
            position = 0;
            done = last;
        }
    }
}
