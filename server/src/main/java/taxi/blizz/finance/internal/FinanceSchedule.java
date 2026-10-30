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
    private final DriverDebtRefreshJob debtRefresh;

    FinanceSchedule(JdbcCashDisputes disputes, DriverDebtRefreshJob debtRefresh) {
        this.disputes = disputes;
        this.debtRefresh = debtRefresh;
    }

    @Scheduled(fixedDelayString = "${blizz.finance.debt-refresh-interval:PT1S}")
    void refreshDebtLimits() {
        debtRefresh.runOnce();
    }

    /** Cash disputes past their deadline become urgent tasks (owner decision 28.10.2026). */
    @Scheduled(fixedDelayString = "PT10M", initialDelayString = "PT1M")
    void reportOverdueDisputes() {
        disputes.reportOverdue();
    }
}
