package taxi.blizz.files.internal;

import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Deletes the files their owner asked to erase ({@code FileService.requestErasure}, issue #144): bytes first, then the
 * row, whatever the retention terms. Safe on several instances: each file is claimed as by the retention job, and a
 * storage failure keeps the row for a later run.
 */
@Component
class ErasedFiles {

    private final FileRetirement retirement;
    private final Clock clock;

    ErasedFiles(FileRetirement retirement, Clock clock) {
        this.retirement = retirement;
        this.clock = clock;
    }

    /** One batch; returns how many files were deleted. */
    int runOnce() {
        return retirement.erased(OffsetDateTime.ofInstant(clock.instant(), ZoneOffset.UTC), 100).deleted();
    }

    @Component
    @ConditionalOnProperty(name = "blizz.retention.enabled", havingValue = "true", matchIfMissing = true)
    static class Schedule {

        private final ErasedFiles files;

        Schedule(ErasedFiles files) {
            this.files = files;
        }

        @Scheduled(fixedDelayString = "${blizz.retention.interval:PT1M}")
        void run() {
            files.runOnce();
        }
    }
}
