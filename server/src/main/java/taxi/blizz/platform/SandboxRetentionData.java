package taxi.blizz.platform;

import java.util.UUID;

/** Synthetic platform-owned fixtures, implemented only in the sandbox profile. */
public interface SandboxRetentionData {

    record Counts(long oldDone, long recentDone, long failed) {
    }

    Counts create(UUID fixture);

    Counts counts(UUID fixture);

    void remove(UUID fixture);
}
