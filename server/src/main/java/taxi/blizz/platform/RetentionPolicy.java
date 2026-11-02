package taxi.blizz.platform;

import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Technical-data policy (Q-19, ADR 0015) per taxi service (ADR 0016, owner decisions 02.11.2026, issue #276): each
 * service's super admin sets the terms of its {@link #SERVICE_KINDS}; the rows that belong to no service
 * ({@link #FIXED_KINDS}) are kept exactly {@link #FIXED_DAYS} days. Providers persist the settings, owners delete their
 * own data.
 */
public interface RetentionPolicy {

    List<String> KINDS = List.of("sessions", "sign_in_codes", "code_deliveries", "delivered_events",
            "consumer_receipts", "command_receipts", "upload_sessions", "quarantined_files", "call_recordings");

    /** The kinds each service sets for its own rows. */
    List<String> SERVICE_KINDS = List.of("sessions", "sign_in_codes", "code_deliveries", "upload_sessions",
            "quarantined_files", "call_recordings");

    /** Rows of no service: the server's delivered events and receipts. */
    List<String> FIXED_KINDS = List.of("delivered_events", "consumer_receipts", "command_receipts");

    /** How long {@link #FIXED_KINDS} are kept: the owner's answer of 02.11.2026. */
    int FIXED_DAYS = 30;

    /**
     * Whole days by service kind, for each active service, the first service first; zero means keep forever. Read
     * again at every cleanup run.
     */
    Map<UUID, Map<String, Integer>> byService();
}
