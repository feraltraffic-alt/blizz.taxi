package taxi.blizz.platform;

import io.micrometer.core.instrument.Gauge;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.binder.MeterBinder;
import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import javax.sql.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.jdbc.support.JdbcTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.support.TransactionSynchronizationManager;
import org.springframework.transaction.support.TransactionTemplate;

/** Module-owned SELECTs, isolated reads, durable reporting and last-run diagnostics. Never repairs business data. */
public abstract class InvariantChecks implements MeterBinder {
    public enum Check { I1, I2, I3, I4, I5 }
    public enum ObjectType {
        JOURNAL_TRANSACTION("JournalTransaction"), DRIVER_CAPACITY("DriverCapacity"), ORDER("Order"), PAYMENT_INTENT("PaymentIntent");
        private final String wireName;
        ObjectType(String wireName) { this.wireName = wireName; }
        public String wireName() { return wireName; }
    }
    public record Violation(UUID objectId, String detail) { }

    private static final Logger log = LoggerFactory.getLogger(InvariantChecks.class);
    private final Map<Check, Supplier<List<Violation>>> checks = new EnumMap<>(Check.class);
    private final Map<Check, ObjectType> types = new EnumMap<>(Check.class);
    private final Map<Check, AtomicReference<Double>> counts = new EnumMap<>(Check.class);
    private final Map<Check, AtomicReference<Double>> lastSuccess = new EnumMap<>(Check.class);
    private final TransactionTemplate read;
    private final InvariantReports reports;
    private final ObjectProvider<MeterRegistry> meters;
    protected final Clock clock;

    protected InvariantChecks(DataSource dataSource, InvariantReports reports, ObjectProvider<MeterRegistry> meters,
                              Clock clock) {
        this.reports = reports;
        this.meters = meters;
        this.clock = clock;
        // Keep explicit PostgreSQL READ ONLY enforcement instead of depending on the default manager's read-only hint.
        JdbcTransactionManager manager = new JdbcTransactionManager(dataSource);
        manager.setEnforceReadOnly(true);
        read = new TransactionTemplate(manager);
        read.setReadOnly(true);
        read.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW);
        read.setTimeout(5);
    }

    protected void check(Check check, ObjectType type, Supplier<List<Violation>> query) {
        checks.put(check, query);
        types.put(check, type);
        counts.put(check, new AtomicReference<>(Double.NaN));
        lastSuccess.put(check, new AtomicReference<>(Double.NaN));
    }

    protected OffsetDateTime cutoff() { return OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC).minusMinutes(2); }

    public void runChecks() {
        for (var entry : checks.entrySet()) {
            Check check = entry.getKey();
            try {
                if (TransactionSynchronizationManager.isActualTransactionActive()) {
                    throw new IllegalStateException("Invariant scans cannot run inside business transactions");
                }
                List<Violation> rows = read.execute(status -> entry.getValue().get());
                if (rows == null) throw new IllegalStateException("No invariant result");
                // The read transaction is closed before publishing, and touches no business rows afterwards.
                for (Violation row : rows) reports.reportOnce(check, types.get(check), row.objectId(), row.detail());
                counts.get(check).set((double) rows.size());
                lastSuccess.get(check).set(clock.instant().toEpochMilli() / 1000.0);
            } catch (RuntimeException e) {
                counts.get(check).set(Double.NaN);
                log.warn("Invariant {} failed ({})", check, e.getClass().getSimpleName());
                try {
                    meters.ifAvailable(m -> m.counter("blizz.invariant.failures", "check", check.name()).increment());
                } catch (RuntimeException meterFailure) {
                    log.warn("Invariant {} failure metric unavailable ({})", check, meterFailure.getClass().getSimpleName());
                }
            }
        }
    }

    @Override
    public void bindTo(MeterRegistry registry) {
        counts.forEach((check, value) -> {
            try {
                Gauge.builder("blizz.invariant.violations", value, AtomicReference::get).tag("check", check.name())
                        .description("Violating objects in the last invariant run; NaN means no successful result")
                        .register(registry);
                Gauge.builder("blizz.invariant.last.success", lastSuccess.get(check), AtomicReference::get)
                        .tag("check", check.name()).description("Unix seconds of the last successful invariant run").register(registry);
                registry.counter("blizz.invariant.failures", "check", check.name());
            } catch (RuntimeException e) {
                log.warn("Invariant {} metrics unavailable ({})", check, e.getClass().getSimpleName());
            }
        });
    }
}
