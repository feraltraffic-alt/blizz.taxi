package taxi.blizz.files.internal;

import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/** The cipher of files kept encrypted at rest, from the instance's master key; absent without one. */
@Component
class FileEncryption {

    private static final Logger log = LoggerFactory.getLogger(FileEncryption.class);

    private final Optional<FileCipher> cipher;

    FileEncryption(@Value("${blizz.secrets.master-key:}") String masterKey) {
        this.cipher = FileCipher.fromMasterKey(masterKey);
        if (cipher.isEmpty()) {
            log.warn("No master key (SECRETS_MASTER_KEY): call recordings cannot be stored");
        }
    }

    Optional<FileCipher> cipher() {
        return cipher;
    }
}
