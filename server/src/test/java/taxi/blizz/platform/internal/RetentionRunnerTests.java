package taxi.blizz.platform.internal;

import static org.assertj.core.api.Assertions.assertThat;

import io.micrometer.core.instrument.simple.SimpleMeterRegistry;
import java.time.Clock;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import taxi.blizz.platform.RetentionPolicy;
import taxi.blizz.platform.RetentionWork;

/** A failed source batch may already have committed items; it cannot donate that budget to orphan cleanup. */
class RetentionRunnerTests {

    @ParameterizedTest
    @ValueSource(booleans = {false, true})
    void recordingWorkSharesOneBudgetEvenIfTheFirstPartThrowsAfterWork(boolean failedSource) {
        var allocated = new AtomicInteger();
        var work = new ArrayList<RetentionWork>();
        for (String kind : RetentionPolicy.KINDS) {
            work.add(part(kind, kind.equals("call_recordings") && failedSource, allocated));
        }
        work.add(part("call_recordings", false, allocated));
        RetentionPolicy policy = () -> RetentionPolicy.KINDS.stream().collect(Collectors.toMap(k -> k, k -> 1));
        var metrics = new SimpleMeterRegistry();
        try {
            var runner = new RetentionRunner(policy, work, metrics, Clock.systemUTC());
            var result = runner.runKindAt("call_recordings", OffsetDateTime.now());
            assertThat(allocated.get()).as("all source/orphan batches combined").isEqualTo(1000);
            assertThat(result.examined()).isEqualTo(1000);
            assertThat(result.failures()).isEqualTo(failedSource ? 1 : 0);
            assertThat(result.deleted()).isEqualTo(failedSource ? 500 : 1000);
            assertThat(metrics.find("blizz.retention.failures").tag("kind", "call_recordings").counter().count())
                    .isEqualTo(failedSource ? 1 : 0);
        } finally {
            metrics.close();
        }
    }

    @org.junit.jupiter.api.Test
    void policyReadFailureIsReportedForTheAffectedKind() {
        var allocated = new AtomicInteger();
        var work = RetentionPolicy.KINDS.stream().map(k -> part(k, false, allocated)).toList();
        var metrics = new SimpleMeterRegistry();
        try {
            var runner = new RetentionRunner(() -> { throw new IllegalStateException("Policy unavailable"); },
                    work, metrics, Clock.systemUTC());
            assertThat(runner.runKindAt("sessions", OffsetDateTime.now()).failures()).isEqualTo(1);
            assertThat(allocated).hasValue(0);
            assertThat(metrics.find("blizz.retention.failures").tag("kind", "sessions").counter().count())
                    .isEqualTo(1);
        } finally {
            metrics.close();
        }
    }

    RetentionWork part(String kind, boolean fails, AtomicInteger allocated) {
        return new RetentionWork() {
            public String kind() {
                return kind;
            }

            public String selectionSql(int limit) {
                throw new AssertionError("Coordinator must not read module SQL");
            }

            public Result run(OffsetDateTime cutoff, OffsetDateTime now, int limit) {
                allocated.addAndGet(limit);
                if (fails) {
                    throw new IllegalStateException("Batch result lost after partial work");
                }
                return new Result(limit, 0, limit);
            }
        };
    }
}
