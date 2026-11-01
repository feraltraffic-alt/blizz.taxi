package taxi.blizz.platform.internal;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.TestcontainersConfiguration;

/**
 * Review of #194: the backlog is read on every gauge refresh and list call, while DONE events are kept for weeks; the
 * read must go through the partial indexes on PENDING and FAILED events, never scan the whole outbox.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
class OutboxBacklogPlanTests {

    @Autowired JdbcClient jdbc;
    @Autowired TransactionTemplate tx;

    @Test
    void theWaitingEventsAreReadThroughAnIndexNotByScanningTheOutbox() {
        // Many DONE events, as weeks of traffic leave, in a transaction that is rolled back.
        List<String> plan = tx.execute(status -> {
            status.setRollbackOnly();
            jdbc.sql("""
                            insert into outbox (event_id, event_type, schema_version, aggregate_type, aggregate_id,
                                                aggregate_version, payload, correlation_id, occurred_at, state,
                                                next_attempt_at, completed_at)
                            select gen_random_uuid(), 'TripCompleted', 1, 'Order', gen_random_uuid(), 1, '{}',
                                   gen_random_uuid(), now() - interval '1 day', 'DONE', now(), now()
                            from generate_series(1, 50000)""").update();
            jdbc.sql("analyze outbox").update();
            return jdbc.sql("explain " + JdbcOutboxBacklog.WAITING)
                    .param("type", "TripCompleted").param("consumer", "finance.trip-fare-posting")
                    .param("limit", 10_000).query(String.class).list();
        });
        assertThat(String.join("\n", plan)).as(String.join("\n", plan))
                .doesNotContain("Seq Scan on outbox").containsAnyOf("outbox_pending_idx", "outbox_failed_idx");
    }
}
