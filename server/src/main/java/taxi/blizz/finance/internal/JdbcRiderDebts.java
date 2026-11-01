package taxi.blizz.finance.internal;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.finance.RiderDebts;

/** See {@link RiderDebts}. */
@Service
class JdbcRiderDebts implements RiderDebts {

    private static final String BALANCES = """
            select t.basis_id, t.currency, sum(l.debit_minor) as owed, sum(l.credit_minor) as paid,
                   max(t.occurred_at) as last_at
            from journal_line l join journal_transaction t on t.id = l.transaction_id
            where l.account = 'RIDER_RECEIVABLE' and l.party_id = :payer and t.basis_id is not null""";

    private final JdbcClient jdbc;

    JdbcRiderDebts(JdbcClient jdbc) {
        this.jdbc = jdbc;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Balance> owedBy(UUID payerClientId) {
        return List.of();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Balance> of(UUID payerClientId, UUID orderId) {
        return Optional.empty();
    }
}
