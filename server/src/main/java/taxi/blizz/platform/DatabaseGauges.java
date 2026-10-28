package taxi.blizz.platform;

import io.micrometer.core.instrument.Gauge;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.binder.MeterBinder;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Gauges a module reads from its own tables (REQ-OBS-02), refreshed every {@code blizz.metrics.refresh} (30 s) rather
 * than on every scrape, so monitoring never adds load in proportion to how often it looks. A query that fails leaves
 * the gauge at NaN — visible as missing data — and is logged. Subclasses register their gauges with {@link #gauge}.
 */
public abstract class DatabaseGauges implements MeterBinder {

    private static final Logger log = LoggerFactory.getLogger(DatabaseGauges.class);

    private record Entry(String description, Supplier<Number> query, AtomicReference<Double> value) {
    }

    private final Map<String, Entry> gauges = new LinkedHashMap<>();

    /** Declares a gauge; call from the constructor. Tags are fixed per gauge. */
    protected final void gauge(String name, String description, Supplier<Number> query) {
        gauges.put(name, new Entry(description, query, new AtomicReference<>(Double.NaN)));
    }

    @Override
    public final void bindTo(MeterRegistry registry) {
        gauges.forEach((name, e) -> Gauge.builder(name, e.value(), AtomicReference::get)
                .description(e.description()).register(registry));
        refresh();
    }

    @Scheduled(fixedDelayString = "${blizz.metrics.refresh:PT30S}", initialDelayString = "${blizz.metrics.refresh:PT30S}")
    public void refresh() {
        gauges.forEach((name, e) -> {
            try {
                Number n = e.query().get();
                e.value().set(n == null ? 0.0 : n.doubleValue());
            } catch (RuntimeException ex) {
                e.value().set(Double.NaN);
                log.warn("Metric {} could not be read: {}", name, ex.getClass().getSimpleName());
            }
        });
    }
}
