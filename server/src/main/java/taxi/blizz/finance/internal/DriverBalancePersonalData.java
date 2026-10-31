package taxi.blizz.finance.internal;

import java.time.OffsetDateTime;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.platform.DriverPersonalData;

/**
 * The driver's money with the service for the copy of their data (issue #144): every movement of the balance
 * ({@code DRIVER_PAYABLE}; plus — the service owes more, minus — the driver owes more), with its kind and basis.
 * Staff's reasons are left out.
 */
@Component
class DriverBalancePersonalData implements DriverPersonalData {

    private final JdbcClient jdbc;

    DriverBalancePersonalData(JdbcClient jdbc) {
        this.jdbc = jdbc;
    }

    record Movement(String currency, long amountMinor, String basis, UUID basisId, OffsetDateTime at) {
    }

    @Override
    public String section() {
        return "balance";
    }

    @Override
    public Object of(Subject subject) {
        return jdbc.sql("""
                        select t.currency, l.credit_minor - l.debit_minor as amount, t.basis_type, t.basis_id,
                               t.occurred_at
                        from journal_line l join journal_transaction t on t.id = l.transaction_id
                        where l.party_id = :id and l.account = 'DRIVER_PAYABLE'
                        order by t.occurred_at, t.id, l.line_no""")
                .param("id", subject.driverId())
                .query((rs, i) -> new Movement(rs.getString(1), rs.getLong(2), rs.getString(3),
                        rs.getObject(4, UUID.class), rs.getObject(5, OffsetDateTime.class)))
                .list();
    }
}
