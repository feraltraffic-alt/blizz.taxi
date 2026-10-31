package taxi.blizz.platform;

import java.util.List;
import java.util.Map;

/** Technical-data policy (Q-19); providers persist the versioned settings, owners delete their own data. */
public interface RetentionPolicy {

    List<String> KINDS = List.of("sessions", "sign_in_codes", "code_deliveries", "delivered_events",
            "consumer_receipts", "command_receipts", "upload_sessions", "quarantined_files", "call_recordings");

    /** Whole days by kind; zero means keep forever. */
    Map<String, Integer> days();
}
