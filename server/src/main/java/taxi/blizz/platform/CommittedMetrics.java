package taxi.blizz.platform;

import io.micrometer.core.instrument.MeterRegistry;
import java.time.Duration;
import java.util.function.Consumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionSynchronization;
import org.springframework.transaction.support.TransactionSynchronizationManager;

/** Transactional observations: command replay does not reach these calls; rollback discards them. */
@Component
public class CommittedMetrics {
    private static final Logger log = LoggerFactory.getLogger(CommittedMetrics.class);
    private final ObjectProvider<MeterRegistry> meters;

    CommittedMetrics(ObjectProvider<MeterRegistry> meters) { this.meters = meters; }

    public void counter(String name, String... tags) {
        observe(name, m -> m.counter(name, tags).increment());
    }

    public void timer(String name, Duration elapsed, String... tags) {
        observe(name, m -> m.timer(name, tags).record(elapsed.isNegative() ? Duration.ZERO : elapsed));
    }

    private void observe(String name, Consumer<MeterRegistry> observation) {
        if (!TransactionSynchronizationManager.isActualTransactionActive()
                || !TransactionSynchronizationManager.isSynchronizationActive()) {
            log.warn("Metric {} skipped without a business transaction", name);
            return;
        }
        TransactionSynchronizationManager.registerSynchronization(new TransactionSynchronization() {
            @Override
            public void afterCommit() {
                try {
                    meters.ifAvailable(observation);
                } catch (RuntimeException e) {
                    log.warn("Metric {} failed after commit ({})", name, e.getClass().getSimpleName());
                }
            }
        });
    }
}
