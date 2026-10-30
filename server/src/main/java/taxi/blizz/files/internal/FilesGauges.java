package taxi.blizz.files.internal;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.platform.DatabaseGauges;

/**
 * Files waiting for a verdict (issue #105, REQ-OBS-02): a file the antivirus cannot or will not scan stays in
 * QUARANTINE for ever by design, so its age is watched (alert FileQuarantineStuck, runbook docs/runbooks/providers.md).
 */
@Component
class FilesGauges extends DatabaseGauges {

    FilesGauges(JdbcClient jdbc) {
        gauge("blizz.files.quarantine.oldest.seconds", "Age of the oldest file still waiting for its checks",
                () -> jdbc.sql("""
                                select coalesce(extract(epoch from (now() - min(coalesce(uploaded_at, created_at)))), 0)
                                from file_object where state = 'QUARANTINE'""").query(Double.class).single());
    }
}
