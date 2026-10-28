package taxi.blizz.finance.internal;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.platform.DatabaseGauges;

/** Journal transactions of the last day whose debits and credits differ: always 0, or the ledger is broken. */
@Component
class LedgerGauges extends DatabaseGauges {

    LedgerGauges(JdbcClient jdbc) {
        gauge("blizz.ledger.unbalanced", "Journal transactions of the last 24 hours that do not balance",
                () -> jdbc.sql("""
                                select count(*) from (
                                    select l.transaction_id from journal_line l
                                    join journal_transaction t on t.id = l.transaction_id
                                    where t.occurred_at > now() - interval '24 hours'
                                    group by l.transaction_id
                                    having sum(l.debit_minor) <> sum(l.credit_minor)) unbalanced""")
                        .query(Long.class).single());
    }
}
