package taxi.blizz.payments.internal;

import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;

/** An open reconciliation run of a merchant with one open item, for tests outside this package. */
public final class TestReconciliations {

    public record Run(UUID runId, UUID itemId) {
    }

    private TestReconciliations() {
    }

    /** {@code daysAgo} keeps runs of one merchant on different days. */
    public static Run open(JdbcClient jdbc, UUID merchant, int daysAgo) {
        UUID run = UUID.randomUUID();
        UUID item = UUID.randomUUID();
        jdbc.sql("""
                        insert into payment_reconciliation (id, merchant_id, day, period_from, period_to, state,
                            local_count, provider_count, item_count, open_count, created_at, updated_at)
                        values (:id, :merchant, current_date - :days, now() - interval '2 days',
                                now() - interval '1 day', 'OPEN', 1, 1, 1, 1, now(), now())""")
                .param("id", run).param("merchant", merchant).param("days", daysAgo).update();
        jdbc.sql("""
                        insert into payment_reconciliation_item (id, run_id, kind, reference_fingerprint)
                        values (:id, :run, 'AMOUNT', :fingerprint)""")
                .param("id", item).param("run", run)
                .param("fingerprint", ReconciliationStore.fingerprint(merchant, item.toString())).update();
        return new Run(run, item);
    }
}
