package taxi.blizz.payments.internal;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.platform.DatabaseGauges;

/** Card operations whose outcome the provider has not told yet (REQ-OBS-02/03: UNKNOWN for more than 5 minutes). */
@Component
class PaymentGauges extends DatabaseGauges {

    PaymentGauges(JdbcClient jdbc) {
        gauge("blizz.payments.unknown", "Card operations with an outcome not known yet",
                () -> jdbc.sql("select count(*) from payment_operation where state = 'UNKNOWN'")
                        .query(Long.class).single());
        gauge("blizz.payments.unknown.oldest.seconds", "Age of the oldest card operation with an unknown outcome",
                () -> jdbc.sql("""
                                select coalesce(extract(epoch from (now() - min(updated_at))), 0)
                                from payment_operation where state = 'UNKNOWN'""").query(Double.class).single());
        gauge("blizz.payments.declined.last_hour", "Card operations declined in the last hour",
                () -> jdbc.sql("""
                                select count(*) from payment_operation
                                where state = 'DECLINED' and updated_at > now() - interval '1 hour'""")
                        .query(Long.class).single());
    }
}
