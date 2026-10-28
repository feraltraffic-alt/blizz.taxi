package taxi.blizz.finance.internal;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.platform.PersonalData;

/**
 * The rider's money with the service for the copy of their data (REQ-PRV-07): every movement of the bonus account
 * ({@code BONUS_ACCOUNT}, plus — money in) and of what the rider owes ({@code DEBT}, plus — the debt grew).
 */
@Component
class LedgerPersonalData implements PersonalData {

    private final JdbcClient jdbc;

    LedgerPersonalData(JdbcClient jdbc) {
        this.jdbc = jdbc;
    }

    record Movement(String account, String currency, long amountMinor, String basis, UUID basisId,
                    OffsetDateTime at) {
    }

    @Override
    public String section() {
        return "money";
    }

    @Override
    public Object of(Subject subject) {
        return jdbc.sql("""
                        select case l.account when 'RIDER_WALLET' then 'BONUS_ACCOUNT' else 'DEBT' end as account,
                               t.currency,
                               case l.account when 'RIDER_WALLET' then l.credit_minor - l.debit_minor
                                              else l.debit_minor - l.credit_minor end as amount,
                               t.basis_type, t.basis_id, t.occurred_at
                        from journal_line l join journal_transaction t on t.id = l.transaction_id
                        where l.party_id = :id and l.account in ('RIDER_WALLET', 'RIDER_RECEIVABLE')
                        order by t.occurred_at, t.id, l.line_no""")
                .param("id", subject.clientId())
                .query((rs, i) -> new Movement(rs.getString("account"), rs.getString("currency"),
                        rs.getLong("amount"), rs.getString("basis_type"), rs.getObject("basis_id", UUID.class),
                        rs.getObject("occurred_at", OffsetDateTime.class)))
                .list();
    }
}
