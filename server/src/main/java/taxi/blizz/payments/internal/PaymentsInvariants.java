package taxi.blizz.payments.internal;

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
class PaymentsInvariants extends InvariantChecks {
    private final boolean enabled;
    PaymentsInvariants(JdbcClient jdbc, DataSource dataSource, InvariantReports reports, ObjectProvider<MeterRegistry> meters,
                       Clock clock, @Value("${blizz.payments.invariants.enabled:true}") boolean enabled) {
        super(dataSource, reports, meters, clock);
        this.enabled = enabled;
        check(Check.I4, ObjectType.PAYMENT_INTENT, () -> jdbc.sql("""
                with amounts as (
                    select o.intent_id,
                        coalesce(sum(o.amount_minor) filter(where o.state='SUCCEEDED' and o.type in ('SETTLE','CHARGE')),0) as paid,
                        coalesce(sum(o.amount_minor) filter(where o.state='SUCCEEDED' and o.type='SETTLE'),0) as settled,
                        max(o.updated_at) as changed_at,
                        bool_or(o.state='SUCCEEDED' and o.type='SETTLE' and not exists (
                            select 1 from payment_operation a where a.intent_id=o.intent_id and a.type='AUTH'
                              and a.state='SUCCEEDED' and a.reference=o.target and a.amount_minor>=o.amount_minor)) as bad_auth
                    from payment_operation o where o.type in ('AUTH','SETTLE','CHARGE','REFUND') group by o.intent_id
                ), facts as (
                    select i.id,
                        i.state='PAID' and ((i.capture_minor is null and i.hold_minor>0)
                            or coalesce(a.paid,0)<>coalesce(i.capture_minor,0)) as bad_paid,
                        coalesce(a.settled,0)>i.hold_minor or coalesce(a.bad_auth,false) as bad_hold
                    from payment_intent i left join amounts a on a.intent_id=i.id
                    where greatest(i.updated_at,coalesce(a.changed_at,i.updated_at)) < :cutoff
                )
                select id,concat_ws(';',case when bad_paid then 'PAID_CAPTURE_MISMATCH' end,
                    case when bad_hold then 'SETTLE_EXCEEDS_AUTH' end) as detail
                from facts where bad_paid or bad_hold
                """).param("cutoff", cutoff()).query((rs, i) -> new Violation(rs.getObject("id", UUID.class), rs.getString("detail"))).list());
    }
    @Scheduled(fixedDelayString = "${blizz.payments.invariants.interval:PT10M}",
            initialDelayString = "${blizz.payments.invariants.interval:PT10M}")
    void scheduled() { if (enabled) runChecks(); }
}
