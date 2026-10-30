package taxi.blizz.platform;

import java.time.Duration;

/** Failed cleanup yields to untouched items: one minute, doubling, at most one day. */
public final class RetentionRetry {
    private RetentionRetry() {
    }

    public static Duration pause(int attempts) {
        return Duration.ofMinutes(Math.min(1440, 1L << Math.max(0, Math.min(11, attempts - 1))));
    }
}
