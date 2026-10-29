package taxi.blizz.payments.internal;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
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
                where not partial and ((state='FAILED' and attempts<:max and (next_attempt_at is null or next_attempt_at<=:now))
                    or (state='RUNNING' and lease_until<=:now))
                order by updated_at limit 100
                """).param("now",OffsetDateTime.now(clock)).param("max",ReconciliationStore.MAX_ATTEMPTS).query((rs,n)->
                new Due(rs.getObject("merchant_id",UUID.class),rs.getObject("day",LocalDate.class))).list();
        for (Due row:due) if (attempted.add(row)) safely(row.merchant(),row.day());
    }
    private record Due(UUID merchant,LocalDate day) { }
    private void latestDay(java.util.Set<Due> attempted) {
        LocalDate day=latestCompletedDay(clock.instant());
        // Current merchant configuration is bounded; completed run identity prevents repeat provider calls.
        for (UUID merchant:jdbc.sql("select id from payment_merchant order by id").query(UUID.class).list()) {
            for (LocalDate missed:daysToRun(merchant,day)) {
                if (attempted.add(new Due(merchant,missed))) safely(merchant,missed);
            }
        }
    }

    /**
     * Every day since the merchant's last full run up to {@code latest}, so days the service was down are reconciled
     * too (review of PR #109, B1); a merchant without runs starts at {@code latest}. At most LOOKBACK_DAYS: older days
     * cannot be asked for any more and are reported in the log and the failure counter.
     */
    List<LocalDate> daysToRun(UUID merchant,LocalDate latest) {
        LocalDate last=jdbc.sql("select max(day) from payment_reconciliation where merchant_id=:merchant and not partial")
                .param("merchant",merchant).query((rs,n)->rs.getObject(1,LocalDate.class)).list().getFirst();
        LocalDate from=last==null?latest:last.plusDays(1);
        LocalDate floor=latest.minusDays(LOOKBACK_DAYS-1);
        if (from.isBefore(floor)) {
            metrics.failure();
            log.warn("Card reconciliation: days before {} are beyond the {}-day lookback and were not reconciled",floor,
                    LOOKBACK_DAYS);
            from=floor;
        }
        List<LocalDate> days=new java.util.ArrayList<>();
        for (LocalDate d=from;!d.isAfter(latest);d=d.plusDays(1)) days.add(d);
        return days;
    }
    static final int LOOKBACK_DAYS=30;
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
