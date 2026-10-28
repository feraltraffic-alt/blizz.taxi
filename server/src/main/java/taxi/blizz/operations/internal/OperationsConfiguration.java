package taxi.blizz.operations.internal;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration(proxyBeanMethods = false)
@EnableConfigurationProperties({PresenceProperties.class, DispatchProperties.class, RiskProperties.class})
class OperationsConfiguration {

    /** Runs the dispatch deadline worker; switched off with {@code blizz.dispatch.worker-enabled=false}. */
    @Configuration(proxyBeanMethods = false)
    @EnableScheduling
    @ConditionalOnProperty(prefix = "blizz.dispatch", name = "worker-enabled", havingValue = "true",
            matchIfMissing = true)
    static class DeadlineScheduler {

        private final DispatchWorker worker;
        private final PreorderWorker preorders;

        DeadlineScheduler(DispatchWorker worker, PreorderWorker preorders) {
            this.worker = worker;
            this.preorders = preorders;
        }

        @Scheduled(fixedDelayString = "${blizz.dispatch.poll-interval:PT1S}")
        void poll() {
            worker.runOnce();
        }

        /** Pre-orders due for the search (ADR 0006). */
        @Scheduled(fixedDelayString = "${blizz.preorders.poll-interval:PT15S}")
        void releasePreorders() {
            preorders.expireReservations();
            preorders.runOnce();
        }
    }

    /** Purges the dispatch journal's rounds after their retention (issue #71); safe on several instances. */
    @Configuration(proxyBeanMethods = false)
    @EnableScheduling
    @ConditionalOnProperty(prefix = "blizz.dispatch", name = "journal-purge-enabled", havingValue = "true",
            matchIfMissing = true)
    static class DispatchJournalPurge {

        private final JdbcDispatchJournal journal;

        DispatchJournalPurge(JdbcDispatchJournal journal) {
            this.journal = journal;
        }

        @Scheduled(fixedDelayString = "PT1H", initialDelayString = "PT5M")
        void purge() {
            journal.purge();
        }
    }
}
