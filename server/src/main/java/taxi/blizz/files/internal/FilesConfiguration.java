package taxi.blizz.files.internal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration(proxyBeanMethods = false)
@EnableConfigurationProperties(FilesProperties.class)
class FilesConfiguration {

    private static final Logger log = LoggerFactory.getLogger(FilesConfiguration.class);

    /** The antivirus of uploads, settled once and logged, so "off" is never a silent default (issue #105). */
    @Bean
    ContentScanner contentScanner(FilesProperties properties, Environment environment) {
        FilesProperties.Clamav clamav = properties.clamav();
        if (clamav.address() != null && !clamav.address().isBlank()) {
            log.info("Uploads are scanned by ClamAV at {}", clamav.address());
            return new ClamAvScanner(clamav.address(), clamav.connectTimeout(), clamav.readTimeout(),
                    clamav.totalTimeout());
        }
        if (environment.acceptsProfiles(Profiles.of("dev", "sandbox"))) {
            log.info("Uploads are scanned by the FAKE antivirus (EICAR test string only): dev or sandbox profile");
            return new FakeContentScanner();
        }
        log.warn("No antivirus: blizz.files.clamav.address is empty, uploads get the structural checks only");
        return ContentScanner.OFF;
    }

    /** Re-encrypts the driver documents stored in the clear before issue #135; safe on several instances. */
    @Configuration(proxyBeanMethods = false)
    @EnableScheduling
    @ConditionalOnProperty(prefix = "blizz.files.document-encryption", name = "enabled", havingValue = "true",
            matchIfMissing = true)
    static class DocumentEncryptionSweep {

        private final DocumentEncryption documents;

        DocumentEncryptionSweep(DocumentEncryption documents) {
            this.documents = documents;
        }

        @Scheduled(fixedDelayString = "${blizz.files.document-encryption.interval:PT30S}",
                initialDelayString = "${blizz.files.document-encryption.interval:PT30S}")
        void run() {
            documents.encryptDue();
        }
    }

    /** Scans again the files kept in quarantine while the antivirus could not answer; safe on several instances. */
    @Configuration(proxyBeanMethods = false)
    @EnableScheduling
    @ConditionalOnProperty(prefix = "blizz.files.rescan", name = "enabled", havingValue = "true", matchIfMissing = true)
    static class RescanSweep {

        private final QuarantineRescan rescan;

        RescanSweep(QuarantineRescan rescan) {
            this.rescan = rescan;
        }

        @Scheduled(fixedDelayString = "${blizz.files.rescan.interval:PT30S}",
                initialDelayString = "${blizz.files.rescan.interval:PT30S}")
        void run() {
            rescan.rescanDue();
        }
    }
}
