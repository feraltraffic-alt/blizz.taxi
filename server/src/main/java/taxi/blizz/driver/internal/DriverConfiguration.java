package taxi.blizz.driver.internal;

import java.time.Clock;
import java.time.LocalDate;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import taxi.blizz.driver.DriverAdmission;

@Configuration(proxyBeanMethods = false)
@EnableConfigurationProperties(DriverProperties.class)
class DriverConfiguration {

    /** Moves drivers with an expired required document to EXPIRED every hour (REQ-DRV-05). */
    @Configuration(proxyBeanMethods = false)
    @EnableScheduling
    @ConditionalOnProperty(prefix = "blizz.driver", name = "expiry-check-enabled", havingValue = "true",
            matchIfMissing = true)
    static class ExpiryCheck {

        private final DriverAdmission admission;
        private final DriverProperties properties;
        private final Clock clock;

        ExpiryCheck(DriverAdmission admission, DriverProperties properties, Clock clock) {
            this.admission = admission;
            this.properties = properties;
            this.clock = clock;
        }

        @Scheduled(cron = "0 5 * * * *")
        void run() {
            admission.expireDocuments(LocalDate.now(clock.withZone(properties.marketTimeZone())));
        }
    }
}
