package taxi.blizz.operations.internal;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration(proxyBeanMethods = false)
@EnableConfigurationProperties({PresenceProperties.class, DispatchProperties.class})
class OperationsConfiguration {

    /** Runs the dispatch deadline worker; switched off with {@code blizz.dispatch.worker-enabled=false}. */
    @Configuration(proxyBeanMethods = false)
    @EnableScheduling
    @ConditionalOnProperty(prefix = "blizz.dispatch", name = "worker-enabled", havingValue = "true",
            matchIfMissing = true)
    static class DeadlineScheduler {

        private final DispatchWorker worker;

        DeadlineScheduler(DispatchWorker worker) {
            this.worker = worker;
        }

        @Scheduled(fixedDelayString = "${blizz.dispatch.poll-interval:PT1S}")
        void poll() {
            worker.runOnce();
        }
    }
}
