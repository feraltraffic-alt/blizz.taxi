package taxi.blizz.operations.internal;

import io.micrometer.core.instrument.MeterRegistry;
import java.time.Clock;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.sql.DataSource;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import taxi.blizz.payments.CardPayments;
import taxi.blizz.platform.InvariantChecks;
import taxi.blizz.platform.InvariantReports;

@Configuration(proxyBeanMethods = false)
@EnableScheduling
class OperationsInvariants extends InvariantChecks {
    private static final String ORDER_ASSIGNMENTS_SQL = """
                with candidates as materialized (
                    select id from ride_order where status in ('ASSIGNED','IN_SERVICE')
                    union select order_id from assignment where state='COMMITTED'
                )
                select o.id,'ORDER_ASSIGNMENT_MISMATCH' as detail
                from candidates c join ride_order o on o.id=c.id
                left join assignment a on a.order_id=o.id and a.state='COMMITTED'
                group by o.id,o.status,o.updated_at
                having greatest(o.updated_at,coalesce(max(a.created_at),o.updated_at)) < :cutoff
                   and ((o.status in ('ASSIGNED','IN_SERVICE') and count(a.id)<>1)
                     or (o.status not in ('ASSIGNED','IN_SERVICE') and count(a.id)<>0))
                """;
    private static final String TERMINAL_HOLDS_SQL = """
                    select id from ride_order where id in (:orders)
                      and status in ('FULFILLED','CANCELLED','UNFULFILLED') and updated_at<:terminalBefore
                    """;
    private static final int HOLD_ORDER_BATCH = 256;
    private final boolean enabled;
    OperationsInvariants(JdbcClient jdbc, CardPayments cards, DataSource dataSource, InvariantReports reports, ObjectProvider<MeterRegistry> meters,
                         Clock clock, @Value("${blizz.operations.invariants.enabled:true}") boolean enabled) {
        super(dataSource, reports, meters, clock);
        this.enabled = enabled;
        check(Check.I2, ObjectType.DRIVER_CAPACITY, () -> jdbc.sql("""
                with assignments as (
                    select driver_id,count(*) filter(where state='COMMITTED') as committed,
                        count(*) filter(where state='RESERVED') as reserved,
                        max(id::text) filter(where state='COMMITTED') as committed_id,
                        max(id::text) filter(where state='RESERVED') as reserved_id,
                        max(greatest(created_at,coalesce(closed_at,created_at))) as changed_at
                    from assignment where state in ('COMMITTED','RESERVED') group by driver_id
                )
                select coalesce(c.driver_id,a.driver_id) as driver_id
                from driver_capacity c full join assignments a on a.driver_id=c.driver_id
                where greatest(c.updated_at,coalesce(a.changed_at,c.updated_at))<:cutoff
                  and (c.driver_id is not null or a.committed>0 or a.reserved>0)
                  and not coalesce((
                    (c.occupancy='FREE' and coalesce(a.committed,0)=0 and c.assignment_id is null)
                    or (c.occupancy='OFFERED' and coalesce(a.committed,0)=0 and c.assignment_id is null
                        and exists(select 1 from offer o where o.driver_id=c.driver_id and o.state='OPEN'))
                    or (c.occupancy='RESERVED' and coalesce(a.committed,0)=0 and a.reserved=1
                        and c.assignment_id::text=a.reserved_id)
                    or (c.occupancy in ('TO_PICKUP','WAITING','ON_TRIP') and a.committed=1
                        and c.assignment_id::text=a.committed_id)),false)
                """).param("cutoff", cutoff()).query((rs, i) -> new Violation(rs.getObject("driver_id", UUID.class),
                        "CAPACITY_ASSIGNMENT_MISMATCH")).list());
        check(Check.I3, ObjectType.ORDER, () -> jdbc.sql(ORDER_ASSIGNMENTS_SQL).param("cutoff", cutoff())
                .query((rs, i) -> new Violation(rs.getObject("id", UUID.class), rs.getString("detail"))).list());
        check(Check.I5, ObjectType.PAYMENT_INTENT, () -> {
            // Payments classifies its own AUTH/SETTLE/REFUND rows. Operations reads only its terminal orders.
            var holds = cards.standingHoldsOlderThan(cutoff());
            if (holds.isEmpty()) return List.of();
            List<Violation> violations = new ArrayList<>();
            for (int start = 0; start < holds.size(); start += HOLD_ORDER_BATCH) {
                // Bound bind parameters without truncating the eligible AUTH set; the last page is checked too.
                var intentByOrder = holds.subList(start, Math.min(start + HOLD_ORDER_BATCH, holds.size())).stream()
                        .collect(Collectors.toMap(CardPayments.StandingHold::orderId, CardPayments.StandingHold::intentId));
                violations.addAll(jdbc.sql(TERMINAL_HOLDS_SQL).param("orders", intentByOrder.keySet())
                        .param("terminalBefore", OffsetDateTime.now(clock).minusHours(1))
                        .query((rs, i) -> new Violation(intentByOrder.get(rs.getObject("id", UUID.class)),
                                "TERMINAL_ORDER_STANDING_HOLD")).list());
            }
            return violations;
        });
    }
    @Scheduled(fixedDelayString = "${blizz.operations.invariants.interval:PT10M}",
            initialDelayString = "${blizz.operations.invariants.interval:PT10M}")
    void scheduled() { if (enabled) runChecks(); }
}
