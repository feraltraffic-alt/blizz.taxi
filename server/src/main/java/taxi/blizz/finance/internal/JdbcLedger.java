package taxi.blizz.finance.internal;

import java.time.Clock;
import java.time.ZoneOffset;
import java.util.List;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.finance.Ledger;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;

@Service
class JdbcLedger implements Ledger {

    private final JdbcClient jdbc;
    private final Clock clock;

    JdbcLedger(JdbcClient jdbc, Clock clock) {
        this.jdbc = jdbc;
        this.clock = clock;
    }

    @Override
    @Transactional
    public boolean post(Posting posting) {
        validate(posting);
        UUID id = UUID.randomUUID();
        int inserted = jdbc.sql("""
                        insert into journal_transaction (id, business_key, basis_type, basis_id, currency, reason,
                                                         occurred_at)
                        values (:id, :key, :basisType, :basisId, :currency, :reason, :now)
                        on conflict (business_key) do nothing""")
                .param("id", id)
                .param("key", posting.businessKey())
                .param("basisType", posting.basisType())
                .param("basisId", posting.basisId())
                .param("currency", posting.currency())
                .param("reason", posting.reason())
                .param("now", clock.instant().atOffset(ZoneOffset.UTC))
                .update();
        if (inserted == 0) {
            return false;
        }
        int lineNo = 0;
        for (Line line : posting.lines()) {
            jdbc.sql("""
                            insert into journal_line (transaction_id, line_no, account, party_id, debit_minor, credit_minor)
                            values (:tx, :no, :account, :party, :debit, :credit)""")
                    .param("tx", id)
                    .param("no", ++lineNo)
                    .param("account", line.account().name())
                    .param("party", line.partyId())
                    .param("debit", line.debitMinor())
                    .param("credit", line.creditMinor())
                    .update();
        }
        return true;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Balance> balances(Account account, UUID partyId) {
        return jdbc.sql("""
                        select t.currency, coalesce(sum(l.debit_minor), 0), coalesce(sum(l.credit_minor), 0)
                        from journal_line l join journal_transaction t on t.id = l.transaction_id
                        where l.account = :account and l.party_id is not distinct from :party
                        group by t.currency order by t.currency""")
                .param("account", account.name())
                .param("party", partyId)
                .query((rs, i) -> new Balance(rs.getString(1), rs.getLong(2), rs.getLong(3)))
                .list();
    }

    private static void validate(Posting p) {
        if (p == null || blank(p.businessKey()) || blank(p.basisType()) || p.basisId() == null || blank(p.reason())
                || p.currency() == null || !p.currency().matches("[A-Z]{3}") || p.lines().size() < 2) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "Incomplete journal posting");
        }
        long debit = 0;
        long credit = 0;
        for (Line line : p.lines()) {
            debit = Math.addExact(debit, line.debitMinor());
            credit = Math.addExact(credit, line.creditMinor());
        }
        if (debit != credit) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "Debit and credit differ: " + debit + " / " + credit);
        }
    }

    private static boolean blank(String value) {
        return value == null || value.isBlank();
    }
}
