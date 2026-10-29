package taxi.blizz.configuration.internal;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * AES-256-GCM with the instance's master key ({@code SECRETS_MASTER_KEY}, 32 bytes in Base64, from the environment
 * only). The name of the value is authenticated with it, so a stored secret cannot be moved to another name. A dump of
 * the database alone reveals no key.
 */
final class SecretCipher {

    static final int KEY_VERSION = 1;
    private static final int NONCE = 12;
    private static final int TAG_BITS = 128;

    private final SecretKeySpec key;
    private final SecretKeySpec macKey;
    private final SecureRandom random = new SecureRandom();

    private SecretCipher(byte[] key) {
        this.key = new SecretKeySpec(key, "AES");
        this.macKey = new SecretKeySpec(hmac(new SecretKeySpec(key, "HmacSHA256"),
                "blizz.integrations.fingerprint".getBytes(StandardCharsets.UTF_8)), "HmacSHA256");
    }

    /**
     * HMAC-SHA256 with a key derived from the master key (audit 29.10.2026): a fingerprint of a secret that a database
     * dump shows cannot be checked against guessed passwords without the master key.
     */
    byte[] fingerprint(byte[] data) {
        return hmac(macKey, data);
    }

    private static byte[] hmac(SecretKeySpec key, byte[] data) {
        try {
            javax.crypto.Mac mac = javax.crypto.Mac.getInstance("HmacSHA256");
            mac.init(key);
            return mac.doFinal(data);
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("HmacSHA256 unavailable", e);
        }
    }

    /** Null when no master key is configured: secrets cannot be stored then. */
    static SecretCipher of(String masterKey) {
        if (masterKey == null || masterKey.isBlank()) {
            return null;
        }
        byte[] key;
        try {
            key = Base64.getDecoder().decode(masterKey.strip());
        } catch (IllegalArgumentException e) {
            throw new IllegalStateException("blizz.secrets.master-key must be Base64", e);
        }
        if (key.length != 32) {
            throw new IllegalStateException("blizz.secrets.master-key must be 32 bytes (256 bits) in Base64");
        }
        return new SecretCipher(key);
    }

    byte[] encrypt(String name, String value) {
        byte[] nonce = new byte[NONCE];
        random.nextBytes(nonce);
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(Cipher.ENCRYPT_MODE, key, new GCMParameterSpec(TAG_BITS, nonce));
            cipher.updateAAD(name.getBytes(StandardCharsets.UTF_8));
            byte[] sealed = cipher.doFinal(value.getBytes(StandardCharsets.UTF_8));
            return ByteBuffer.allocate(NONCE + sealed.length).put(nonce).put(sealed).array();
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("Cannot encrypt " + name, e);
        }
    }

    String decrypt(String name, byte[] stored) {
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(Cipher.DECRYPT_MODE, key, new GCMParameterSpec(TAG_BITS, stored, 0, NONCE));
            cipher.updateAAD(name.getBytes(StandardCharsets.UTF_8));
            return new String(cipher.doFinal(stored, NONCE, stored.length - NONCE), StandardCharsets.UTF_8);
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("Cannot decrypt " + name + " (another master key?)", e);
        }
    }
}
