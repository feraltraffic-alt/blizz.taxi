package taxi.blizz.operations.internal;

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
class OperationsInvariants extends InvariantChecks {
    private final boolean enabled;
    OperationsInvariants(JdbcClient jdbc, DataSource dataSource, InvariantReports reports, ObjectProvider<MeterRegistry> meters,
                         Clock clock, @Value("${blizz.operations.invariants.enabled:true}") boolean enabled) {
        super(dataSource, reports, meters, clock);
        this.enabled = enabled;
        check(Check.I3, ObjectType.ORDER, () -> jdbc.sql("""
                select o.id,
                    case when o.status not in ('SCHEDULED','AWAITING_PAYMENT','READY','SEARCHING','ASSIGNED','IN_SERVICE',
                                                'FULFILLED','CANCELLED','UNFULFILLED')
                         then 'ORDER_STATUS_UNSUPPORTED' else 'ORDER_ASSIGNMENT_MISMATCH' end as detail
                from ride_order o left join assignment a on a.order_id=o.id and a.state='COMMITTED'
                group by o.id,o.status,o.updated_at
                having greatest(o.updated_at,coalesce(max(a.created_at),o.updated_at)) < :cutoff
                   and (o.status not in ('SCHEDULED','AWAITING_PAYMENT','READY','SEARCHING','ASSIGNED','IN_SERVICE',
                                         'FULFILLED','CANCELLED','UNFULFILLED')
                     or (o.status in ('ASSIGNED','IN_SERVICE') and count(a.id)<>1)
                     or (o.status not in ('ASSIGNED','IN_SERVICE') and count(a.id)<>0))
                """).param("cutoff", cutoff()).query((rs, i) -> new Violation(rs.getObject("id", UUID.class), rs.getString("detail"))).list());
    }
    @Scheduled(fixedDelayString = "${blizz.operations.invariants.interval:PT10M}",
            initialDelayString = "${blizz.operations.invariants.interval:PT10M}")
    void scheduled() { if (enabled) runChecks(); }
}
