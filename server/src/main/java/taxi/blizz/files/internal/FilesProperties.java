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
 */
@ConfigurationProperties("blizz.files")
public record FilesProperties(
        @DefaultValue("./var/files") Path localDir,
        @DefaultValue("10485760") long maxBytes,
        @DefaultValue("PT15M") Duration uploadTtl,
        @DefaultValue({"image/jpeg", "image/png", "application/pdf"}) List<String> allowedTypes) {
}
