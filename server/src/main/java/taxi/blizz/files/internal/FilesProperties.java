package taxi.blizz.files.internal;

import java.nio.file.Path;
import java.time.Duration;
import java.util.List;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

/**
 * @param localDir     directory of the local storage (single-server profile, section 26.1); needs an external backup
 * @param maxBytes     largest accepted file
 * @param uploadTtl    how long an upload session stays open
 * @param allowedTypes content types accepted for documents
 * @param callRecordingsDir where call recordings are kept when not blank, instead of below {@code localDir} — a
 *                     disk with its own backup and access rights; they are encrypted wherever they are
 * @param clamav       the antivirus daemon uploads are scanned with (issue #105); off when the address is blank
 * @param rescan       how files kept in quarantine while the antivirus could not answer are scanned again
 */
@ConfigurationProperties("blizz.files")
public record FilesProperties(
        @DefaultValue("./var/files") Path localDir,
        @DefaultValue("10485760") long maxBytes,
        @DefaultValue("PT15M") Duration uploadTtl,
        @DefaultValue({"image/jpeg", "image/png", "application/pdf"}) List<String> allowedTypes,
        String callRecordingsDir,
        @DefaultValue Clamav clamav,
        @DefaultValue Rescan rescan) {

    /**
     * @param address        {@code host:port} of clamd; installation configuration (environment), not editable by staff
     * @param connectTimeout how long to wait for the connection
     * @param readTimeout    how long to wait for the verdict of one file
     */
    public record Clamav(String address, @DefaultValue("PT3S") Duration connectTimeout,
                         @DefaultValue("PT60S") Duration readTimeout) {
    }

    /**
     * @param interval     how often the job looks for files due again
     * @param firstRetry   the wait after the first failed scan, doubled after each one
     * @param longestRetry the longest wait between two attempts; a file is never released without a verdict
     */
    public record Rescan(@DefaultValue("PT30S") Duration interval, @DefaultValue("PT30S") Duration firstRetry,
                         @DefaultValue("PT1H") Duration longestRetry) {
    }
}
