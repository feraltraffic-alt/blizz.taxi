package taxi.blizz.identity.internal;

import java.nio.file.Path;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @param erasureJournalDir where the erasure journal lives (REQ-PRV-05): outside the database and outside its
 *                          backups, on durable storage of its own, so a restored database can be brought back in
 *                          line with every deletion made after the backup. The default (a temporary directory) is for
 *                          development only.
 */
@ConfigurationProperties("blizz.privacy")
record PrivacyProperties(Path erasureJournalDir) {

    PrivacyProperties {
        if (erasureJournalDir == null) {
            erasureJournalDir = Path.of(System.getProperty("java.io.tmpdir"), "blizz-erasure-journal");
        }
    }
}
