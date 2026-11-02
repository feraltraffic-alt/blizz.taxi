package taxi.blizz.finance.internal;

import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;

/** Durable finance-owned membership and progress; the journal remains the source of balances. */
final class DebtRefreshWork {
    private DebtRefreshWork() {
    }

    static void enqueue(JdbcClient jdbc, String currency, long version) {
        jdbc.sql("""
                insert into driver_debt_refresh(currency,target_version,updated_at)
                values (:currency,:version,now())
                on conflict(currency) do update
                set target_version=greatest(driver_debt_refresh.target_version,excluded.target_version),
                    updated_at=excluded.updated_at""")
                .param("currency",currency).param("version",version).update();
    }

    static void enroll(JdbcClient jdbc, UUID driver, String currency) {
        int fresh=jdbc.sql("""
                insert into driver_debt_refresh_member(currency,driver_id,applied_version)
                values (:currency,:driver,0) on conflict(currency,driver_id) do nothing""")
                .param("currency",currency).param("driver",driver).update();
        if(fresh==1) {
            // A first posting after a completed sweep must also see the currently configured limit.
            jdbc.sql("""
                    insert into driver_debt_refresh(currency,target_version,updated_at)
                    select currency,max(sweep_version),now() from driver_debt_limit
                    where currency=:currency and sweep_version>0 group by currency
                    on conflict(currency) do update
                    set target_version=greatest(driver_debt_refresh.target_version,excluded.target_version),
                        updated_at=excluded.updated_at""").param("currency",currency).update();
        }
    }

    static void lock(JdbcClient jdbc, UUID driver, String currency) {
        enroll(jdbc,driver,currency);
        jdbc.sql("""
                select applied_version from driver_debt_refresh_member
                where currency=:currency and driver_id=:driver for update""")
                .param("currency",currency).param("driver",driver).query(Long.class).single();
    }

    static void applied(JdbcClient jdbc, UUID driver, String currency, long version) {
        jdbc.sql("""
                update driver_debt_refresh_member set applied_version=greatest(applied_version,:version)
                where currency=:currency and driver_id=:driver and applied_version<:version""")
                .param("currency",currency).param("driver",driver).param("version",version).update();
    }
}
