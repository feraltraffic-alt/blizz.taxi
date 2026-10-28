package taxi.blizz.location.internal;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration(proxyBeanMethods = false)
@EnableConfigurationProperties({LocationProperties.class, TrackRetentionProperties.class})
class LocationConfiguration {

    /** The GPS track clean-up (issue #81), every 10 minutes; switched off with {@code retention.sweep-enabled}. */
    @Configuration(proxyBeanMethods = false)
    @EnableScheduling
    @ConditionalOnProperty(prefix = "blizz.location.retention", name = "sweep-enabled", havingValue = "true",
            matchIfMissing = true)
    static class RetentionSchedule {

        private final TrackRetentionSweep sweep;

        RetentionSchedule(TrackRetentionSweep sweep) {
            this.sweep = sweep;
        }

        @Scheduled(fixedDelayString = "PT10M", initialDelayString = "PT2M")
        void run() {
            sweep.run(20);
        }
    }
}
