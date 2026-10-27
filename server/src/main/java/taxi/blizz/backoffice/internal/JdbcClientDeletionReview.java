package taxi.blizz.backoffice.internal;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.audit.AuditEntry;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.backoffice.ClientDeletionReview;
import taxi.blizz.finance.Ledger;
import taxi.blizz.identity.ClientDeletions;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.operations.OrderView;
import taxi.blizz.operations.Orders;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;

@Service
class JdbcClientDeletionReview implements ClientDeletionReview {

    private static final int REASON_MAX = 500;

    private final JdbcClient jdbc;
    private final IdempotentCommands commands;
    private final StaffAccess staff;
    private final AuditLog audit;
    private final ClientDeletions deletions;
    private final Orders orders;
    private final Ledger ledger;

    JdbcClientDeletionReview(JdbcClient jdbc, IdempotentCommands commands, StaffAccess staff, AuditLog audit,
                             ClientDeletions deletions, Orders orders, Ledger ledger) {
        this.jdbc = jdbc;
        this.commands = commands;
        this.staff = staff;
        this.audit = audit;
        this.deletions = deletions;
        this.orders = orders;
        this.ledger = ledger;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Request> pending(Actor actor, OffsetDateTime after, int limit) {
        staff.require(actor, DELETE_PERMISSION);
        return deletions.pending(after, limit).stream()
                .map(p -> new Request(p.clientId(), p.previousState(), p.requestedAt(), blockers(p.clientId())))
                .toList();
    }

    record DecisionRequest(UUID clientId, String reason) {
    }

    @Override
    public Decision complete(Actor actor, UUID commandId, UUID clientId, String reason) {
        staff.require(actor, DELETE_PERMISSION);
        String why = reason(reason);
        return commands.execute(new CommandKey(actor, "client_deletion.complete", commandId),
                new DecisionRequest(clientId, why), Decision.class, () -> {
                    ClientDeletions.Pending pending = requirePending(clientId);
                    Blockers blockers = blockers(clientId);
                    if (blockers.blocked()) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT, "The request cannot be completed yet: "
                                + describe(blockers));
                    }
                    deletions.anonymize(clientId);
                    audit.record(new AuditEntry(actor, "client_deletion.complete", "client", clientId.toString(), why,
                            Map.of("account_state", "DELETION_PENDING", "previous_state", pending.previousState()),
                            Map.of("account_state", "ANONYMIZED", "bonuses_burnt", blockers.bonusesToBurn())));
                    return new Decision(clientId, "ANONYMIZED");
                });
    }

    @Override
    public Decision reject(Actor actor, UUID commandId, UUID clientId, String reason) {
        staff.require(actor, DELETE_PERMISSION);
        String why = reason(reason);
        return commands.execute(new CommandKey(actor, "client_deletion.reject", commandId),
                new DecisionRequest(clientId, why), Decision.class, () -> {
                    ClientDeletions.Pending pending = requirePending(clientId);
                    deletions.restore(clientId);
                    audit.record(new AuditEntry(actor, "client_deletion.reject", "client", clientId.toString(), why,
                            Map.of("account_state", "DELETION_PENDING"),
                            Map.of("account_state", pending.previousState())));
                    return new Decision(clientId, pending.previousState());
                });
    }

    // ---------------------------------------------------------------- helpers

    private ClientDeletions.Pending requirePending(UUID clientId) {
        return deletions.pending(clientId).orElseThrow(() -> new DomainException(ErrorCode.STATE_CONFLICT,
                "The client has no pending deletion request"));
    }

    Blockers blockers(UUID clientId) {
        // Any open order blocks, a scheduled pre-order included (orders.active() leaves those out).
        UUID activeOrder = orders.current(clientId).stream().map(OrderView::id).findFirst().orElse(null);
        List<Amount> debt = ledger.balances(Ledger.Account.RIDER_RECEIVABLE, clientId).stream()
                .filter(b -> b.debitMinor() - b.creditMinor() > 0)
                .map(b -> new Amount(b.currency(), b.debitMinor() - b.creditMinor())).toList();
        int openCases = jdbc.sql("""
                        select count(*) from support_case
                        where requester_type = 'CLIENT' and requester_id = :client
                          and state not in ('RESOLVED', 'CLOSED')""")
                .param("client", clientId).query(Integer.class).single();
        List<Amount> bonuses = ledger.balances(Ledger.Account.RIDER_WALLET, clientId).stream()
                .filter(b -> b.creditMinor() - b.debitMinor() > 0)
                .map(b -> new Amount(b.currency(), b.creditMinor() - b.debitMinor())).toList();
        return new Blockers(activeOrder, debt, openCases, bonuses,
                activeOrder != null || !debt.isEmpty() || openCases > 0);
    }

    private static String describe(Blockers b) {
        StringBuilder text = new StringBuilder();
        if (b.activeOrderId() != null) {
            text.append("an active order; ");
        }
        if (!b.debt().isEmpty()) {
            text.append("an unpaid debt; ");
        }
        if (b.openSupportCases() > 0) {
            text.append(b.openSupportCases()).append(" open support case(s); ");
        }
        return text.toString().replaceAll("; $", "");
    }

    private static String reason(String reason) {
        String why = reason == null ? "" : reason.strip();
        if (why.isEmpty() || why.length() > REASON_MAX) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "A reason of at most 500 characters is required");
        }
        return why;
    }
}
