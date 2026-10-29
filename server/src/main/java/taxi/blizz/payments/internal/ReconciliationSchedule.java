package taxi.blizz.payments.internal;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/** The 02:15 UTC job, restart catch-up and bounded retry of failed/expired attempts. */
@Component
@EnableScheduling
@ConditionalOnProperty(prefix="blizz.payments.reconciliation",name="enabled",havingValue="true",matchIfMissing=true)
class ReconciliationSchedule {
    private static final Logger log=LoggerFactory.getLogger(ReconciliationSchedule.class);
    private final JdbcClient jdbc;
    private final CardReconciliation reconciliation;
    private final ReconciliationMetrics metrics;
    private final Clock clock;
    ReconciliationSchedule(JdbcClient jdbc,CardReconciliation reconciliation,ReconciliationMetrics metrics,Clock clock) {
        this.jdbc=jdbc;this.reconciliation=reconciliation;this.metrics=metrics;this.clock=clock;
    }
    @Scheduled(cron="${blizz.payments.reconciliation.daily-cron:0 15 2 * * *}",zone="UTC")
    void daily() { latestDay(new java.util.HashSet<>()); }

    @Scheduled(fixedDelayString="${blizz.payments.reconciliation.retry-interval:PT15M}",
            initialDelayString="${blizz.payments.reconciliation.initial-delay:PT30S}")
    void retry() {
        java.util.Set<Due> attempted=new java.util.HashSet<>();
        latestDay(attempted);
        var due=jdbc.sql("""
                select merchant_id,day from payment_reconciliation
                where not partial and (state='FAILED' or (state='RUNNING' and lease_until<=:now))
                order by updated_at limit 100
                """).param("now",OffsetDateTime.now(clock)).query((rs,n)->
                new Due(rs.getObject("merchant_id",UUID.class),rs.getObject("day",LocalDate.class))).list();
        for (Due row:due) if (attempted.add(row)) safely(row.merchant(),row.day());
    }
    private record Due(UUID merchant,LocalDate day) { }
    private void latestDay(java.util.Set<Due> attempted) {
        LocalDate day=latestCompletedDay(clock.instant());
        // Current merchant configuration is bounded; completed run identity prevents repeat provider calls.
        for (UUID merchant:jdbc.sql("select id from payment_merchant order by id").query(UUID.class).list()) {
            if (attempted.add(new Due(merchant,day))) safely(merchant,day);
        }
    }
    private void safely(UUID merchant,LocalDate day) {
        try { reconciliation.run(merchant,day,false); }
        catch (RuntimeException ignored) {
            metrics.failure();
            log.warn("Daily card reconciliation could not start; check database availability");
        }
    }
    static LocalDate latestCompletedDay(Instant now) {
        return now.atOffset(ZoneOffset.UTC).minusHours(2).minusMinutes(15).toLocalDate().minusDays(1);
    }
}
