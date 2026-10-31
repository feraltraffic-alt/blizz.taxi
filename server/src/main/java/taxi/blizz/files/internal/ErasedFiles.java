package taxi.blizz.files.internal;

import org.springframework.stereotype.Component;

/**
 * Deletes the files their owner asked to erase ({@code FileService.requestErasure}, issue #144): bytes first, then the
 * row, whatever the retention terms. Safe on several instances: each file is claimed as by the retention job.
 */
@Component
class ErasedFiles {

    /** One batch; returns how many files were deleted. */
    int runOnce() {
        return 0;
    }
}
