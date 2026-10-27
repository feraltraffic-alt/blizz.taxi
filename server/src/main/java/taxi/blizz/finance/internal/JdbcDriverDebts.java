package taxi.blizz.finance.internal;

import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.audit.AuditEntry;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.finance.DriverDebts;
import taxi.blizz.finance.Ledger;
import taxi.blizz.finance.Ledger.Account;
import taxi.blizz.finance.Ledger.Line;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;
import taxi.blizz.platform.Outbox;
import taxi.blizz.platform.OutboxEvent;

@Service
class JdbcDriverDebts implements DriverDebts {

    static final String STATUS_CHANGED = "DriverDebtStatusChanged";

    private final JdbcClient jdbc;
    private final StaffAccess staff;
    private final IdempotentCommands commands;
    private final Ledger ledger;
    private final Outbox outbox;
    private final AuditLog audit;
    private final Clock clock;

    JdbcDriverDebts(JdbcClient jdbc, StaffAccess staff, IdempotentCommands commands, Ledger ledger, Outbox outbox,
                    AuditLog audit, Clock clock) {
        this.jdbc = jdbc;
        this.staff = staff;
        this.commands = commands;
        this.ledger = ledger;
        this.outbox = outbox;
        this.audit = audit;
        this.clock = clock;
    }

    // ---------------------------------------------------------------- limit

    record LimitRequest(String currency, Long limitMinor, long expectedVersion, String reason) {
    }

    @Override
    public Limit setLimit(Actor actor, UUID commandId, String currency, Long limitMinor, long expectedVersion,
                          String reason) {
        staff.require(actor, MANAGE_PERMISSION);
        currency(currency);
        text(reason);
        if (limitMinor != null && limitMinor < 0) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "The limit cannot be negative");
        }
        return commands.execute(new CommandKey(actor, "driverDebt.setLimit", commandId),
                new LimitRequest(currency, limitMinor, expectedVersion, reason), Limit.class, () -> {
                    jdbc.sql("""
                                    insert into driver_debt_limit (currency, limit_minor, version, updated_at)
                                    values (:currency, null, 0, :now) on conflict (currency) do nothing""")
                            .param("currency", currency).param("now", now()).update();
                    Limit before = jdbc.sql("""
                                    select currency, limit_minor, version from driver_debt_limit
                                    where currency = :currency for update""")
                            .param("currency", currency)
                            .query((rs, i) -> new Limit(rs.getString(1), (Long) rs.getObject(2), rs.getLong(3)))
                            .single();
                    long current = before.version();
                    if (current != expectedVersion) {
                        throw new DomainException(ErrorCode.VERSION_CONFLICT, "The limit changed");
                    }
                    long version = current + 1;
                    jdbc.sql("""
                                    update driver_debt_limit set limit_minor = :limit, version = :version,
                                                                 updated_at = :now
                                    where currency = :currency""")
                            .param("limit", limitMinor).param("version", version).param("now", now())
                            .param("currency", currency).update();
                    Limit after = new Limit(currency, limitMinor, version);
                    audit.record(new AuditEntry(actor, "driverDebt.setLimit", "driver_debt_limit", currency, reason,
                            current == 0 ? null : before, after));
                    for (UUID driverId : driversWithBalance(currency)) {
                        refresh(driverId, currency);
                    }
                    return after;
                });
    }

    @Override
    @Transactional(readOnly = true)
    public Limit limit(String currency) {
        return jdbc.sql("select currency, limit_minor, version from driver_debt_limit where currency = :currency")
                .param("currency", currency)
                .query((rs, i) -> new Limit(rs.getString(1), (Long) rs.getObject(2), rs.getLong(3)))
                .optional()
                .orElse(new Limit(currency, null, 0));
    }

    // ---------------------------------------------------------------- payments

    record PaymentRequest(UUID driverId, String currency, long amountMinor, String reference, String reason) {
    }

    @Override
    public Status recordPayment(Actor actor, UUID commandId, UUID driverId, String currency, long amountMinor,
                                String reference, String reason) {
        staff.require(actor, MANAGE_PERMISSION);
        currency(currency);
        text(reference);
        text(reason);
        if (driverId == null || amountMinor <= 0) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "A driver and a positive amount are required");
        }
        return commands.execute(new CommandKey(actor, "driverDebt.recordPayment", commandId),
                new PaymentRequest(driverId, currency, amountMinor, reference, reason), Status.class, () -> {
                    ledger.post(new Ledger.Posting("driver-payment:" + commandId, "DRIVER_PAYMENT", driverId, currency,
                            reason + " (ref " + reference + ")",
                            List.of(Line.debit(Account.SERVICE_FUNDS, null, amountMinor),
                                    Line.credit(Account.DRIVER_PAYABLE, driverId, amountMinor))));
                    Status status = refresh(driverId, currency);
                    audit.record(new AuditEntry(actor, "driverDebt.recordPayment", "driver", driverId.toString(),
                            reason, null, new PaymentRequest(driverId, currency, amountMinor, reference, reason)));
                    return status;
                });
    }

    // ---------------------------------------------------------------- status

    private record Row(long owed, Long limit, boolean blocked, long version) {
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Status refresh(UUID driverId, String currency) {
        jdbc.sql("""
                        insert into driver_debt_status (driver_id, currency, owed_minor, limit_minor, blocked, version,
                                                        updated_at)
                        values (:driver, :currency, 0, null, false, 1, :now)
                        on conflict (driver_id, currency) do nothing""")
                .param("driver", driverId).param("currency", currency).param("now", now()).update();
        Row before = jdbc.sql("""
                        select owed_minor, limit_minor, blocked, version from driver_debt_status
                        where driver_id = :driver and currency = :currency for update""")
                .param("driver", driverId).param("currency", currency)
                .query((rs, i) -> new Row(rs.getLong(1), (Long) rs.getObject(2), rs.getBoolean(3), rs.getLong(4)))
                .single();
        long owed = ledger.balances(Account.DRIVER_PAYABLE, driverId).stream()
                .filter(b -> b.currency().equals(currency))
                .mapToLong(b -> b.debitMinor() - b.creditMinor())
                .sum();
        Long limit = limit(currency).limitMinor();
        boolean blocked = limit != null && owed > limit;
        if (owed == before.owed() && java.util.Objects.equals(limit, before.limit()) && blocked == before.blocked()) {
            return new Status(driverId, currency, owed, limit, blocked);
        }
        long version = before.version() + 1;
        jdbc.sql("""
                        update driver_debt_status set owed_minor = :owed, limit_minor = :limit, blocked = :blocked,
                                                      version = :version, updated_at = :now
                        where driver_id = :driver and currency = :currency""")
                .param("owed", owed).param("limit", limit).param("blocked", blocked).param("version", version)
                .param("now", now()).param("driver", driverId).param("currency", currency).update();
        if (blocked != before.blocked()) {
            Map<String, Object> payload = new LinkedHashMap<>();
            payload.put("driver_id", driverId.toString());
            payload.put("currency", currency);
            payload.put("blocked", blocked);
            payload.put("owed_minor", owed);
            payload.put("limit_minor", limit);
            payload.put("status_version", version);
            outbox.publish(new OutboxEvent(STATUS_CHANGED, 1, "DriverDebt", driverId, version, payload));
        }
        return new Status(driverId, currency, owed, limit, blocked);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Status> statusOf(UUID driverId) {
        return jdbc.sql("""
                        select currency, owed_minor, limit_minor, blocked from driver_debt_status
                        where driver_id = :driver order by currency""")
                .param("driver", driverId)
                .query((rs, i) -> new Status(driverId, rs.getString(1), rs.getLong(2), (Long) rs.getObject(3),
                        rs.getBoolean(4)))
                .list();
    }

    private List<UUID> driversWithBalance(String currency) {
        return jdbc.sql("""
                        select party_id from (
                            select l.party_id from journal_line l join journal_transaction t on t.id = l.transaction_id
                            where l.account = 'DRIVER_PAYABLE' and t.currency = :currency and l.party_id is not null
                            union
                            select driver_id from driver_debt_status where currency = :currency) drivers
                        order by party_id""")
                .param("currency", currency).query(UUID.class).list();
    }

    private static void currency(String currency) {
        if (currency == null || !currency.matches("[A-Z]{3}")) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "Invalid currency");
        }
    }

    private static void text(String value) {
        if (value == null || value.isBlank()) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "A reason and a reference are required");
        }
    }

    private OffsetDateTime now() {
        return clock.instant().atOffset(ZoneOffset.UTC);
    }
}
