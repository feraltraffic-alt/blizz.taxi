package taxi.blizz.platform;

import io.micrometer.core.instrument.MeterRegistry;
import java.time.Duration;
import java.util.function.Consumer;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionSynchronization;
import org.springframework.transaction.support.TransactionSynchronizationManager;

/** Transactional observations: command replay does not reach these calls; rollback discards them. */
@Component
public class CommittedMetrics {
    private final ObjectProvider<MeterRegistry> meters;

    CommittedMetrics(ObjectProvider<MeterRegistry> meters) { this.meters = meters; }

    public void counter(String name, String... tags) {
        observe(m -> m.counter(name, tags).increment());
    }

    public void timer(String name, Duration elapsed, String... tags) {
        observe(m -> m.timer(name, tags).record(elapsed.isNegative() ? Duration.ZERO : elapsed));
    }

    private void observe(Consumer<MeterRegistry> observation) {
        if (!TransactionSynchronizationManager.isActualTransactionActive()
                || !TransactionSynchronizationManager.isSynchronizationActive()) {
            throw new IllegalStateException("A metric requires the business transaction");
        }
        TransactionSynchronizationManager.registerSynchronization(new TransactionSynchronization() {
            @Override
            public void afterCommit() { meters.ifAvailable(observation); }
        });
    }
}
