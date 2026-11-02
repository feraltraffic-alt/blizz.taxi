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

    private final taxi.blizz.identity.Services services;

    JdbcLedger(JdbcClient jdbc, Clock clock, taxi.blizz.identity.Services services) {
        this.jdbc = jdbc;
        this.clock = clock;
        this.services = services;
    }

    /**
     * The one taxi service of the posting (ADR 0016): every driver and rider in it is of that service, and a service
     * named by the caller is theirs too. Money of two services never meets in one transaction.
     */
    private UUID serviceOf(Posting posting) {
        java.util.Set<UUID> found = new java.util.LinkedHashSet<>();
        if (posting.serviceId() != null) {
            found.add(posting.serviceId());
        }
        for (Line line : posting.lines()) {
            if (line.partyId() == null) {
                continue;
            }
            UUID party = line.partyId();
            UUID service = services.of(new taxi.blizz.platform.Actor(taxi.blizz.platform.SubjectType.DRIVER, party))
                    .or(() -> services.of(new taxi.blizz.platform.Actor(taxi.blizz.platform.SubjectType.CLIENT,
                            party)))
                    .orElseThrow(() -> new DomainException(ErrorCode.VALIDATION_FAILED,
                            "A journal party is neither a driver nor a rider of any taxi service"));
            found.add(service);
        }
        if (found.size() != 1) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, found.isEmpty()
                    ? "A journal posting with no driver or rider names its taxi service"
                    : "A journal posting mixes the money of two taxi services");
        }
        return found.iterator().next();
    }

    @Override
    @Transactional
    public boolean post(Posting posting) {
        validate(posting);
        UUID service = serviceOf(posting);
        UUID id = UUID.randomUUID();
        int inserted = jdbc.sql("""
                        insert into journal_transaction (id, business_key, basis_type, basis_id, currency, reason,
                                                         occurred_at, service_id)
                        values (:id, :key, :basisType, :basisId, :currency, :reason, :now, :service)
                        on conflict (business_key) do nothing""")
                .param("id", id).param("service", service)
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
        posting.lines().stream().filter(line -> line.account() == Account.DRIVER_PAYABLE)
                .map(Line::partyId).filter(java.util.Objects::nonNull).distinct().sorted()
                .forEach(driver -> DebtRefreshWork.enroll(jdbc, driver, posting.currency()));
        return true;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Balance> balances(Account account, UUID partyId) {
        // A debt-refresh batch must use (account, party_id), not scan every driver's journal lines.
        String party = partyId == null ? "l.party_id is null" : "l.party_id = :party";
        var query = jdbc.sql("""
                        select t.currency, coalesce(sum(l.debit_minor), 0), coalesce(sum(l.credit_minor), 0)
                        from journal_line l join journal_transaction t on t.id = l.transaction_id
                        where l.account = :account""" + " and " + party + " group by t.currency order by t.currency")
                .param("account", account.name());
        if (partyId != null) query = query.param("party", partyId);
        return query.query((rs, i) -> new Balance(rs.getString(1), rs.getLong(2), rs.getLong(3))).list();
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
