package taxi.blizz.finance.internal;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/** Finance's own background work; switched off in tests ({@code blizz.finance.worker-enabled}). */
@Configuration(proxyBeanMethods = false)
@EnableScheduling
@ConditionalOnProperty(prefix = "blizz.finance", name = "worker-enabled", havingValue = "true", matchIfMissing = true)
class FinanceSchedule {

    private final JdbcCashDisputes disputes;

    FinanceSchedule(JdbcCashDisputes disputes) {
        this.disputes = disputes;
    }

    /** Cash disputes past their deadline become urgent tasks (owner decision 28.10.2026). */
    @Scheduled(fixedDelayString = "PT10M", initialDelayString = "PT1M")
    void reportOverdueDisputes() {
        disputes.reportOverdue();
    }
}
