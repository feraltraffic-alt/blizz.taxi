package taxi.blizz.backoffice.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.audit.AuditEntry;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.backoffice.DriverDeletionReview;
import taxi.blizz.driver.DriverDeletions;
import taxi.blizz.finance.CashDisputes;
import taxi.blizz.finance.Ledger;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.operations.Dispatch;
import taxi.blizz.operations.Preorders;
import taxi.blizz.operations.Trips;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;
import taxi.blizz.platform.PageCursor;
import taxi.blizz.platform.SubjectType;

@Service
class JdbcDriverDeletionReview implements DriverDeletionReview {

    private static final int REASON_MAX = 500;

    private final IdempotentCommands commands;
    private final StaffAccess staff;
    private final AuditLog audit;
    private final DriverDeletions deletions;
    private final Trips trips;
    private final Dispatch dispatch;
    private final Preorders preorders;
    private final Ledger ledger;
    private final CashDisputes disputes;

    JdbcDriverDeletionReview(IdempotentCommands commands, StaffAccess staff, AuditLog audit, DriverDeletions deletions,
                             Trips trips, Dispatch dispatch, Preorders preorders, Ledger ledger,
                             CashDisputes disputes) {
        this.commands = commands;
        this.staff = staff;
        this.audit = audit;
        this.deletions = deletions;
        this.trips = trips;
        this.dispatch = dispatch;
        this.preorders = preorders;
        this.ledger = ledger;
        this.disputes = disputes;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Request> pending(Actor actor, PageCursor after, int limit) {
        staff.require(actor, DELETE_PERMISSION);
        return deletions.pending(after, limit).stream()
                .map(p -> new Request(p.driverId(), p.previousState(), p.requestedAt(), blockers(p.driverId())))
                .toList();
    }

    record DecisionRequest(UUID driverId, String reason) {
    }

    @Override
    public Decision complete(Actor actor, UUID commandId, UUID driverId, String reason) {
        staff.requireForDriver(actor, DELETE_PERMISSION, driverId);
        String why = reason(reason);
        return commands.execute(new CommandKey(actor, "driver_deletion.complete", commandId),
                new DecisionRequest(driverId, why), Decision.class, () -> {
                    DriverDeletions.Pending pending = requirePending(driverId);
                    Blockers blockers = blockers(driverId);
                    if (!blockers.activeWork().isEmpty()) {
                        throw new DomainException(ErrorCode.DRIVER_HAS_ACTIVE_WORK,
                                "The driver still has " + blockers.activeWork());
                    }
                    if (!blockers.debt().isEmpty()) {
                        throw new DomainException(ErrorCode.DRIVER_HAS_DEBT, "The driver owes the service money");
                    }
                    if (blockers.openCashDisputes() > 0) {
                        throw new DomainException(ErrorCode.DRIVER_HAS_DISPUTE,
                                blockers.openCashDisputes() + " cash dispute(s) not decided");
                    }
                    deletions.anonymize(driverId);
                    audit.record(new AuditEntry(actor, "driver_deletion.complete", "driver", driverId.toString(), why,
                            Map.of("account_state", "DELETION_PENDING", "previous_state", pending.previousState()),
                            Map.of("account_state", "ANONYMIZED")));
                    return new Decision(driverId, "ANONYMIZED");
                });
    }

    @Override
    public Decision reject(Actor actor, UUID commandId, UUID driverId, String reason) {
        staff.requireForDriver(actor, DELETE_PERMISSION, driverId);
        String why = reason(reason);
        return commands.execute(new CommandKey(actor, "driver_deletion.reject", commandId),
                new DecisionRequest(driverId, why), Decision.class, () -> {
                    DriverDeletions.Pending pending = requirePending(driverId);
                    deletions.restore(driverId);
                    audit.record(new AuditEntry(actor, "driver_deletion.reject", "driver", driverId.toString(), why,
                            Map.of("account_state", "DELETION_PENDING"),
                            Map.of("account_state", pending.previousState())));
                    return new Decision(driverId, pending.previousState());
                });
    }

    // ---------------------------------------------------------------- helpers

    private DriverDeletions.Pending requirePending(UUID driverId) {
        return deletions.pending(driverId).orElseThrow(() -> new DomainException(ErrorCode.STATE_CONFLICT,
                "The driver has no pending deletion request"));
    }

    Blockers blockers(UUID driverId) {
        Actor driver = new Actor(SubjectType.DRIVER, driverId);
        List<Work> work = new ArrayList<>();
        if (trips.current(driver).isPresent()) {
            work.add(Work.TRIP);
        }
        if (!dispatch.offers(driver).isEmpty()) {
            work.add(Work.OFFER);
        }
        if (!preorders.mine(driver).isEmpty()) {
            work.add(Work.RESERVATION);
        }
        // DRIVER_PAYABLE is what the service owes the driver: more debit than credit is a debt.
        List<Amount> debt = ledger.balances(Ledger.Account.DRIVER_PAYABLE, driverId).stream()
                .filter(b -> b.debitMinor() - b.creditMinor() > 0)
                .map(b -> new Amount(b.currency(), b.debitMinor() - b.creditMinor())).toList();
        int open = disputes.openOf(driverId);
        return new Blockers(work, debt, open, !work.isEmpty() || !debt.isEmpty() || open > 0);
    }

    private static String reason(String reason) {
        String why = reason == null ? "" : reason.strip();
        if (why.isEmpty() || why.length() > REASON_MAX) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "A reason of at most 500 characters is required");
        }
        return why;
    }
}
