package taxi.blizz.payments.internal;

import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.binder.MeterBinder;
import java.time.Clock;
import java.time.OffsetDateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.payments.PaymentReconciliations.Kind;

/** DB-derived gauges survive restarts and reflect decisions made on another instance. */
@Component
class ReconciliationMetrics implements MeterBinder {
    private static final Logger log=LoggerFactory.getLogger(ReconciliationMetrics.class);
    private static final String LAST_SUCCESS_SQL = """
                    select coalesce(max(greatest(0,extract(epoch from (:now-last_success)))),0)
                    from (select m.id,coalesce(r.finished_at,m.created_at) last_success
                        from payment_merchant m left join lateral (
                            select finished_at from payment_reconciliation where merchant_id=m.id
                                and state in ('CLEAN','OPEN','RESOLVED') and not partial and finished_at is not null
                            order by finished_at desc limit 1
                        ) r on true) merchants
                    """;
    private final JdbcClient jdbc;
    private final Clock clock;
    private MeterRegistry registry;
    ReconciliationMetrics(JdbcClient jdbc,Clock clock) { this.jdbc=jdbc; this.clock=clock; }

    @Override public void bindTo(MeterRegistry registry) {
        this.registry=registry;
        for (Kind kind:Kind.values()) {
            io.micrometer.core.instrument.Gauge.builder("blizz.payments.reconciliation.items",this,
                    metrics->metrics.open(kind)).tag("kind",kind.name()).register(registry);
        }
        io.micrometer.core.instrument.Gauge.builder("blizz.payments.reconciliation.oldest.success.age",this,
                ReconciliationMetrics::oldestSuccessAge).baseUnit("seconds").register(registry);
        io.micrometer.core.instrument.Gauge.builder("blizz.payments.reconciliation.failed",this,
                ReconciliationMetrics::failed).register(registry);
        registry.counter("blizz.payments.reconciliation.failures");
    }
    void failure() {
        try { if (registry!=null) registry.counter("blizz.payments.reconciliation.failures").increment(); }
        catch (RuntimeException ignored) { log.warn("Reconciliation failure metric could not be recorded"); }
    }
    private double open(Kind kind) {
        try {
            return jdbc.sql("select count(*) from payment_reconciliation_item where state='OPEN' and kind=:kind")
                    .param("kind",kind.name()).query(Long.class).single();
        } catch (RuntimeException ignored) { return Double.NaN; }
    }
    private double failed() {
        try { return jdbc.sql("select count(*) from payment_reconciliation where state='FAILED' and not partial").query(Long.class).single(); }
        catch (RuntimeException ignored) { return Double.NaN; }
    }
    private double oldestSuccessAge() {
        try {
            return jdbc.sql(LAST_SUCCESS_SQL).param("now",OffsetDateTime.now(clock)).query(Double.class).single();
        } catch (RuntimeException ignored) { return Double.NaN; }
    }
}
