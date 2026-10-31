package taxi.blizz.platform;

import java.util.Map;

/** Explicit invocation of the same one-batch-per-kind work as the scheduled coordinator. */
public interface RetentionRuns {

    Map<String, RetentionWork.Result> runOnce();
}
