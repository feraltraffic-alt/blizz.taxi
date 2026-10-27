package taxi.blizz.identity.internal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.platform.OutboxHandler;
import taxi.blizz.platform.OutboxMessage;
import tools.jackson.databind.json.JsonMapper;

/**
 * Deletions survive a restore (REQ-PRV-05, T-39). Every ClientAnonymized is written to the {@link ErasureJournal}
 * after its transaction committed (as an outbox consumer, so a failed write is retried and a rolled-back
 * anonymization is never journaled). At start-up every client the journal lists but the database holds with
 * personal data again — a backup older than the deletion was restored — is anonymized again, which tells the other
 * modules once more (their consumers are idempotent).
 */
@Component
class ErasureReplay implements OutboxHandler {

    private static final Logger log = LoggerFactory.getLogger(ErasureReplay.class);
    static final String CLIENT = "CLIENT";

    private final ErasureJournal journal;
    private final JdbcClientDeletions deletions;
    private final TransactionTemplate tx;
    private final JsonMapper json;

    ErasureReplay(ErasureJournal journal, JdbcClientDeletions deletions, TransactionTemplate tx, JsonMapper json) {
        this.journal = journal;
        this.deletions = deletions;
        this.tx = tx;
        this.json = json;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    record Anonymized(UUID clientId) {
    }

    @Override
    public String consumerId() {
        return "identity.erasure-journal";
    }

    @Override
    public boolean supports(String eventType) {
        return "ClientAnonymized".equals(eventType);
    }

    @Override
    public void handle(OutboxMessage message) {
        UUID client = json.readValue(message.payload(), Anonymized.class).clientId();
        OffsetDateTime at = message.occurredAt() == null ? OffsetDateTime.now(ZoneOffset.UTC) : message.occurredAt();
        journal.record(CLIENT, client, at.toString());
    }

    @EventListener(ApplicationReadyEvent.class)
    void onStart() {
        try {
            int reapplied = replay();
            if (reapplied > 0) {
                log.warn("Re-applied {} anonymizations from the erasure journal: the database was older than them",
                        reapplied);
            }
        } catch (RuntimeException e) {
            // Never block the start; the next start tries again.
            log.error("The erasure journal could not be replayed", e);
        }
    }

    /** Anonymizes again every journaled client that is not anonymized here; returns how many. */
    int replay() {
        int reapplied = 0;
        for (UUID client : journal.subjects(CLIENT)) {
            Boolean done = tx.execute(status -> deletions.reapply(client));
            if (Boolean.TRUE.equals(done)) {
                reapplied++;
            }
        }
        return reapplied;
    }
}
