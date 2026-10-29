package taxi.blizz.finance.internal;

import java.util.List;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.finance.DriverDebts;

/** One committed batch per invocation; membership/progress survive a process restart. */
@Component
class DriverDebtRefreshJob {
    private static final int BATCH_SIZE=200;
    static final String NEXT_MEMBERS_SQL = """
            select driver_id from driver_debt_refresh_member
            where currency=:currency and applied_version<:version
            order by applied_version,driver_id limit %d for update skip locked
            """.formatted(BATCH_SIZE);
    private final JdbcClient jdbc;
    private final DriverDebts debts;
    private final TransactionTemplate batch;

    DriverDebtRefreshJob(JdbcClient jdbc, DriverDebts debts, PlatformTransactionManager transactions) {
        this.jdbc=jdbc;
        this.debts=debts;
        this.batch=new TransactionTemplate(transactions);
        this.batch.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW);
    }

    private record Target(String currency,long version) {
    }

    int runOnce() {
        return batch.execute(status->{
            Target target=jdbc.sql("""
                    select currency,target_version from driver_debt_refresh
                    order by last_attempt_at nulls first,currency limit 1 for update skip locked""")
                    .query((rs,i)->new Target(rs.getString(1),rs.getLong(2))).optional().orElse(null);
            if(target==null)return 0;
            List<UUID> drivers=jdbc.sql(NEXT_MEMBERS_SQL)
                    .param("currency",target.currency()).param("version",target.version())
                    .query(UUID.class).list();
            // Registry before projection is the same lock order used by every normal refresh.
            for(UUID driver:drivers)debts.refresh(driver,target.currency());
            boolean pending=jdbc.sql("""
                    select exists(select 1 from driver_debt_refresh_member
                    where currency=:currency and applied_version<:version)""")
                    .param("currency",target.currency()).param("version",target.version()).query(Boolean.class).single();
            if(pending) {
                // A locked member is still pending; do not lose it or starve other currencies.
                jdbc.sql("update driver_debt_refresh set last_attempt_at=now() where currency=:currency")
                        .param("currency",target.currency()).update();
            } else {
                jdbc.sql("delete from driver_debt_refresh where currency=:currency and target_version=:version")
                        .param("currency",target.currency()).param("version",target.version()).update();
            }
            return drivers.size();
        });
    }
}
