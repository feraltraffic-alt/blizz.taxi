package taxi.blizz.platform.internal;

import io.micrometer.core.instrument.MeterRegistry;
import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import taxi.blizz.platform.RetentionPolicy;
import taxi.blizz.platform.RetentionWork;

/** Stateless coordination: every invocation reads current policy and leaves transaction ownership to the module. */
@Component
class RetentionRunner implements taxi.blizz.platform.RetentionRuns {

    private static final Logger log = LoggerFactory.getLogger(RetentionRunner.class);
    private final RetentionPolicy policy;
    private final List<RetentionWork> work;
    private final MeterRegistry metrics;
    private final Clock clock;

    RetentionRunner(RetentionPolicy policy, List<RetentionWork> work, MeterRegistry metrics, Clock clock) {
        this.policy = policy;
        this.work = List.copyOf(work);
        this.metrics = metrics;
        this.clock = clock;
        for (String kind : RetentionPolicy.KINDS) {
            if (work.stream().noneMatch(w -> w.kind().equals(kind))) {
                throw new IllegalStateException("Missing retention work: " + kind);
            }
        }
        for (RetentionWork item : work) {
            if (!RetentionPolicy.KINDS.contains(item.kind())) {
                throw new IllegalStateException("Unknown retention work: " + item.kind());
            }
        }
    }

    @Override
    public Map<String, RetentionWork.Result> runOnce() {
        Map<String, RetentionWork.Result> result = new LinkedHashMap<>();
        OffsetDateTime now = OffsetDateTime.ofInstant(clock.instant(), ZoneOffset.UTC);
        for (String kind : RetentionPolicy.KINDS) {
            result.put(kind, runKindAt(kind, now));
        }
        return result;
    }

    RetentionWork.Result runKind(String kind) {
        return runKindAt(kind, OffsetDateTime.ofInstant(clock.instant(), ZoneOffset.UTC));
    }

    RetentionWork.Result runKindAt(String kind, OffsetDateTime now) {
        if (!RetentionPolicy.KINDS.contains(kind)) {
            throw new IllegalArgumentException("Unknown retention kind");
        }
        List<RetentionWork> own = work.stream().filter(item -> item.kind().equals(kind)).toList();
        RetentionWork.Result total;
        if (RetentionPolicy.FIXED_KINDS.contains(kind)) {
            // Rows of no service: exactly 30 days, whatever any service sets (owner answer 02.11.2026, #276).
            total = runWorks(kind, own, null, RetentionPolicy.FIXED_DAYS, now);
        } else {
            Map<java.util.UUID, Map<String, Integer>> terms;
            try {
                terms = policy.byService();
                for (Map<String, Integer> days : terms.values()) {
                    Integer value = days.get(kind);
                    if (value == null || value < 0) {
                        throw new IllegalStateException("Invalid retention policy: " + kind);
                    }
                }
            } catch (RuntimeException ex) {
                log.warn("Retention policy read failed for {} ({})", kind, ex.getClass().getSimpleName());
                count("blizz.retention.failures", kind, 1);
                return new RetentionWork.Result(0, 1, 0);
            }
            total = new RetentionWork.Result(0, 0);
            // Rows that carry their service go by that service's term (#276).
            List<RetentionWork> perService = own.stream().filter(RetentionWork::perService).toList();
            for (var entry : terms.entrySet()) {
                total = total.plus(runWorks(kind, perService, entry.getKey(),
                        terms.values().iterator().next().get(kind), now));
            }
            // A work whose rows do not carry a service yet follows the first service's term (#276, until they do).
            List<RetentionWork> shared = own.stream().filter(w -> !w.perService()).toList();
            if (!shared.isEmpty() && !terms.isEmpty()) {
                total = total.plus(runWorks(kind, shared, null, terms.values().iterator().next().get(kind), now));
            }
        }
        count("blizz.retention.deleted", kind, total.deleted());
        count("blizz.retention.failures", kind, total.failures());
        return total;
    }

    /** One bounded batch of the works, for one service ({@code serviceId}) or for rows of none (null). */
    private RetentionWork.Result runWorks(String kind, List<RetentionWork> works, java.util.UUID serviceId, int days,
                                          OffsetDateTime now) {
        RetentionWork.Result total = new RetentionWork.Result(0, 0);
        if (days == 0) {
            return total;
        }
        for (int i = 0; i < works.size(); i++) {
            int remaining = 1000 - total.examined();
            if (remaining <= 0) {
                break;
            }
            // Share the budget so failed source copies cannot starve unlinked recording files.
            int budget = Math.max(1, remaining / (works.size() - i));
            try {
                RetentionWork item = works.get(i);
                total = total.plus(serviceId == null ? item.run(cutoff(now, days), now, budget)
                        : item.run(serviceId, cutoff(now, days), now, budget));
            } catch (RuntimeException ex) {
                // An unexpected failure may follow committed items: reserve its entire allocation.
                total = total.plus(new RetentionWork.Result(0, 1, budget));
                log.warn("Retention batch failed for {} ({})", kind, ex.getClass().getSimpleName());
            }
        }
        return total;
    }

    private static OffsetDateTime cutoff(OffsetDateTime now, int days) {
        OffsetDateTime value = now.minusDays(days);
        // PostgreSQL encodes this JDBC sentinel as -infinity, for policies longer than its finite date range.
        return value.getYear() < -4712 ? OffsetDateTime.MIN : value;
    }

    private void count(String name, String kind, int amount) {
        try {
            metrics.counter(name, "kind", kind).increment(amount);
        } catch (RuntimeException ex) {
            log.warn("Could not record retention metric for {} ({})", kind, ex.getClass().getSimpleName());
        }
    }
}
