package taxi.blizz.platform;

import static org.assertj.core.api.Assertions.assertThatCode;

import io.micrometer.core.instrument.MeterRegistry;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.transaction.support.TransactionSynchronizationManager;

class CommittedMetricsTests {
    @AfterEach
    void clearTransaction() {
        if (TransactionSynchronizationManager.isSynchronizationActive()) TransactionSynchronizationManager.clearSynchronization();
        TransactionSynchronizationManager.setActualTransactionActive(false);
    }

    @Test
    void brokenMetricBackendDoesNotEscapeAfterCommit() {
        MeterRegistry registry = Mockito.mock(MeterRegistry.class);
        Mockito.when(registry.counter("blizz.metrics_failure")).thenThrow(new IllegalStateException("backend failed"));
        DefaultListableBeanFactory beans = new DefaultListableBeanFactory();
        beans.registerSingleton("registry", registry);
        CommittedMetrics metrics = new CommittedMetrics(beans.getBeanProvider(MeterRegistry.class));
        TransactionSynchronizationManager.setActualTransactionActive(true);
        TransactionSynchronizationManager.initSynchronization();
        metrics.counter("blizz.metrics_failure");
        assertThatCode(() -> TransactionSynchronizationManager.getSynchronizations().forEach(s -> s.afterCommit()))
                .doesNotThrowAnyException();
    }

    @Test
    void missingTransactionWarnsWithoutFailingTheCaller() {
        DefaultListableBeanFactory beans = new DefaultListableBeanFactory();
        CommittedMetrics metrics = new CommittedMetrics(beans.getBeanProvider(MeterRegistry.class));
        assertThatCode(() -> metrics.counter("blizz.metrics_missing_transaction")).doesNotThrowAnyException();
    }
}
