package taxi.blizz.finance.internal;

import io.micrometer.core.instrument.MeterRegistry;
import java.time.Clock;
import java.util.UUID;
import javax.sql.DataSource;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import taxi.blizz.platform.InvariantChecks;
import taxi.blizz.platform.InvariantReports;

@Configuration(proxyBeanMethods = false)
@EnableScheduling
class FinanceInvariants extends InvariantChecks {
    private final boolean enabled;
    FinanceInvariants(JdbcClient jdbc, DataSource dataSource, InvariantReports reports, ObjectProvider<MeterRegistry> meters,
                      Clock clock, @Value("${blizz.finance.invariants.enabled:true}") boolean enabled) {
        super(dataSource, reports, meters, clock);
        this.enabled = enabled;
        check(Check.I1, ObjectType.JOURNAL_TRANSACTION, () -> jdbc.sql("""
                select t.id from journal_transaction t left join journal_line l on l.transaction_id=t.id
                where t.occurred_at < :cutoff
                group by t.id,t.currency
                having count(l.line_no)<2 or coalesce(sum(l.debit_minor),0)<>coalesce(sum(l.credit_minor),0)
                """).param("cutoff", cutoff()).query((rs, i) -> new Violation(rs.getObject("id", UUID.class), "UNBALANCED_POSTING")).list());
    }
    @Scheduled(fixedDelayString = "${blizz.finance.invariants.interval:PT10M}",
            initialDelayString = "${blizz.finance.invariants.interval:PT10M}")
    void scheduled() { if (enabled) runChecks(); }
}
