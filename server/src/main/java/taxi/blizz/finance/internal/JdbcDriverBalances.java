package taxi.blizz.finance.internal;

import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Stream;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.audit.AuditEntry;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.finance.DriverBalances;
import taxi.blizz.finance.DriverDebts;
import taxi.blizz.finance.DriverTransferTimeZone;
import taxi.blizz.finance.Ledger;
import taxi.blizz.finance.Ledger.Account;
import taxi.blizz.finance.Ledger.Line;
import taxi.blizz.geo.CityCatalog;
import taxi.blizz.identity.AccountDirectory;
import taxi.blizz.identity.PhoneNumber;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;
import taxi.blizz.platform.SubjectType;

@Service
class JdbcDriverBalances implements DriverBalances {

    static final long MAX_TOP_UP_MINOR = 10_000_000;

    private final JdbcClient jdbc;
    private final Ledger ledger;
    private final DriverDebts debts;
    private final IdempotentCommands commands;
    private final StaffAccess staff;
    private final AccountDirectory accounts;
    private final CityCatalog cities;
    private final AuditLog audit;
    private final Clock clock;
    private final DriverTransferTimeZone transferTimeZone;

    JdbcDriverBalances(JdbcClient jdbc, Ledger ledger, DriverDebts debts, IdempotentCommands commands,
                       StaffAccess staff, AccountDirectory accounts, CityCatalog cities, AuditLog audit, Clock clock,
                       DriverTransferTimeZone transferTimeZone) {
        this.jdbc = jdbc;
        this.ledger = ledger;
        this.debts = debts;
        this.commands = commands;
        this.staff = staff;
        this.accounts = accounts;
        this.cities = cities;
        this.audit = audit;
        this.clock = clock;
        this.transferTimeZone = transferTimeZone;
    }

    // ---------------------------------------------------------------- statements

    @Override
    @Transactional(readOnly = true)
    public Statement mine(Actor driver, int limit) {
        requireDriver(driver);
        return statement(driver.id(), limit);
    }

    @Override
    @Transactional(readOnly = true)
    public Statement of(Actor actor, UUID driverId, int limit) {
        staff.require(actor, MANAGE_PERMISSION);
        requireExists(driverId);
        return statement(driverId, limit);
    }

    private Statement statement(UUID driverId, int limit) {
        List<Balance> balances = ledger.balances(Account.DRIVER_PAYABLE, driverId).stream()
                .map(b -> new Balance(b.currency(), b.creditMinor() - b.debitMinor())).toList();
        List<Entry> entries = jdbc.sql("""
                        select t.id, t.occurred_at, t.basis_type, t.basis_id, t.currency, t.reason,
                               l.credit_minor - l.debit_minor as amount, u.kind as top_up_kind,
                               case when x.from_driver = :driver then x.to_driver else x.from_driver end as counterpart
                        from journal_line l
                        join journal_transaction t on t.id = l.transaction_id
                        left join driver_balance_top_up u on t.basis_type = 'DRIVER_TOP_UP' and u.id = t.basis_id
                        left join driver_transfer x on t.basis_type = 'DRIVER_TRANSFER' and x.id = t.basis_id
                        where l.account = 'DRIVER_PAYABLE' and l.party_id = :driver
                        order by t.occurred_at desc, t.id
                        limit :limit""")
                .param("driver", driverId).param("limit", Math.max(1, Math.min(limit, 200)))
                .query((rs, i) -> {
                    String basis = rs.getString("basis_type");
                    long amount = rs.getLong("amount");
                    String kind = switch (basis) {
                        case "DRIVER_TOP_UP" -> rs.getString("top_up_kind");
                        case "DRIVER_TRANSFER" -> amount < 0 ? "TRANSFER_OUT" : "TRANSFER_IN";
                        case "DRIVER_PAYMENT" -> "DEPOSIT";
                        case "DRIVER_PROMOTION" -> "PROMOTION";
                        case "DRIVER_CARD_TOP_UP" -> "CARD_TOP_UP";
                        default -> basis;
                    };
                    boolean ownBasis = Stream.of("DRIVER_TOP_UP", "DRIVER_TRANSFER", "DRIVER_PAYMENT", "DRIVER_PROMOTION",
                            "DRIVER_CARD_TOP_UP")
                            .anyMatch(basis::equals);
                    return new Entry(rs.getObject("id", UUID.class), rs.getObject("occurred_at", OffsetDateTime.class),
                            kind, rs.getString("currency"), amount, rs.getString("reason"),
                            ownBasis ? null : rs.getObject("basis_id", UUID.class),
                            rs.getObject("counterpart", UUID.class));
                })
                .list();
        return new Statement(driverId, balances, entries);
    }

    // ---------------------------------------------------------------- top-ups by staff

    record TopUpRequest(UUID driverId, String currency, long amountMinor, TopUpKind kind, String reference,
                        String reason) {
    }

    @Override
    public Statement topUp(Actor actor, UUID commandId, UUID driverId, String currency, long amountMinor,
                           TopUpKind kind, String reference, String reason) {
        staff.require(actor, MANAGE_PERMISSION);
        String why = text(reason, 500, "A reason");
        String ref = reference == null || reference.isBlank() ? null : reference.strip();
        if (kind == null) {
            throw invalid("The kind of the top-up is required (DEPOSIT or BONUS)");
        }
        if (amountMinor <= 0 || amountMinor > MAX_TOP_UP_MINOR) {
            throw invalid("The amount must be positive and at most " + MAX_TOP_UP_MINOR + " minor units");
        }
        requireCurrency(currency);
        requireExists(driverId);
        return commands.execute(new CommandKey(actor, "driverBalance.topUp", commandId),
                new TopUpRequest(driverId, currency, amountMinor, kind, ref, why), Statement.class, () -> {
                    UUID id = UUID.randomUUID();
                    jdbc.sql("""
                                    insert into driver_balance_top_up (id, driver_id, currency, amount_minor, kind,
                                                                       reference, reason, staff_id, created_at)
                                    values (:id, :driver, :currency, :amount, :kind, :ref, :reason, :staff, :now)""")
                            .param("id", id).param("driver", driverId).param("currency", currency)
                            .param("amount", amountMinor).param("kind", kind.name()).param("ref", ref)
                            .param("reason", why).param("staff", actor.id()).param("now", now()).update();
                    // Money paid in is the service's; a bonus is its expense (ADR 0010 p. 1, p. 5).
                    Account from = kind == TopUpKind.DEPOSIT ? Account.SERVICE_FUNDS : Account.PROMO_EXPENSE;
                    ledger.post(new Ledger.Posting("driver-top-up:" + id, "DRIVER_TOP_UP", id, currency,
                            ref == null ? why : why + " (ref " + ref + ")",
                            List.of(Line.debit(from, null, amountMinor),
                                    Line.credit(Account.DRIVER_PAYABLE, driverId, amountMinor))));
                    debts.refresh(driverId, currency);
                    audit.record(new AuditEntry(actor, "driverBalance.topUp", "driver", driverId.toString(), why,
                            null, Map.of("currency", currency, "amount_minor", amountMinor, "kind", kind.name(),
                                    "top_up_id", id.toString())));
                    return statement(driverId, 20);
                });
    }

    // ---------------------------------------------------------------- transfers

    record TransferRequest(String toPhone, String currency, long amountMinor, String comment) {
    }

    @Override
    public Transfer transfer(Actor driver, UUID commandId, String toPhone, String currency, long amountMinor,
                             String comment) {
        requireDriver(driver);
        PhoneNumber phone;
        try {
            phone = PhoneNumber.parse(toPhone);
        } catch (RuntimeException e) {
            throw invalid("Not a phone number");
        }
        String note = comment == null || comment.isBlank() ? null : comment.strip();
        if (note != null && note.length() > 200) {
            throw invalid("The comment is at most 200 characters");
        }
        if (amountMinor <= 0) {
            throw invalid("The amount must be positive");
        }
        UUID recipient = accounts.driverByPhone(phone)
                .filter(id -> accounts.accountState(new Actor(SubjectType.DRIVER, id)).map("ACTIVE"::equals)
                        .orElse(false))
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "No active driver with this phone"));
        if (recipient.equals(driver.id())) {
            throw invalid("A transfer to oneself is not possible");
        }
        return commands.execute(new CommandKey(driver, "driverBalance.transfer", commandId),
                new TransferRequest(phone.e164(), currency, amountMinor, note), Transfer.class, () -> {
                    TransferRule rule = transferRules().stream().filter(r -> r.currency().equals(currency))
                            .findFirst().filter(TransferRule::enabled)
                            .orElseThrow(() -> new DomainException(ErrorCode.STATE_CONFLICT,
                                    "Transfers between drivers are off for " + currency));
                    if (amountMinor > rule.maxPerTransferMinor()) {
                        throw invalid("At most " + rule.maxPerTransferMinor() + " in one transfer");
                    }
                    // Both balances under lock, in one order on every path: the smaller id first.
                    UUID first = driver.id().compareTo(recipient) < 0 ? driver.id() : recipient;
                    UUID second = first.equals(driver.id()) ? recipient : driver.id();
                    lock(first);
                    lock(second);
                    OffsetDateTime now = now();
                    ZoneId zone = transferTimeZone.zone(driver.id()).orElseThrow(() ->
                            new DomainException(ErrorCode.STATE_CONFLICT, "No work-session city for the daily limit"));
                    OffsetDateTime since = now.atZoneSameInstant(zone).toLocalDate().atStartOfDay(zone)
                            .toOffsetDateTime();
                    long today = jdbc.sql("""
                                    select coalesce(sum(amount_minor), 0) from driver_transfer
                                    where from_driver = :driver and currency = :currency and created_at >= :since""")
                            .param("driver", driver.id()).param("currency", currency)
                            .param("since", since)
                            .query(Long.class).single();
                    if (today + amountMinor > rule.maxPerDayMinor()) {
                        throw invalid("At most " + rule.maxPerDayMinor() + " a day; " + today + " sent today");
                    }
                    long balance = ledger.balances(Account.DRIVER_PAYABLE, driver.id()).stream()
                            .filter(b -> b.currency().equals(currency))
                            .mapToLong(b -> b.creditMinor() - b.debitMinor()).sum();
                    if (balance - amountMinor < rule.minBalanceAfterMinor()) {
                        throw new DomainException(ErrorCode.WALLET_INSUFFICIENT, "The balance after the transfer must"
                                + " stay at least " + rule.minBalanceAfterMinor() + " (now " + balance + ")");
                    }
                    UUID id = UUID.randomUUID();
                    jdbc.sql("""
                                    insert into driver_transfer (id, from_driver, to_driver, currency, amount_minor,
                                                                 comment, created_at)
                                    values (:id, :from, :to, :currency, :amount, :comment, :now)""")
                            .param("id", id).param("from", driver.id()).param("to", recipient)
                            .param("currency", currency).param("amount", amountMinor).param("comment", note)
                            .param("now", now).update();
                    ledger.post(new Ledger.Posting("driver-transfer:" + id, "DRIVER_TRANSFER", id, currency,
                            note == null ? "Transfer between drivers" : note,
                            List.of(Line.debit(Account.DRIVER_PAYABLE, driver.id(), amountMinor),
                                    Line.credit(Account.DRIVER_PAYABLE, recipient, amountMinor))));
                    debts.refresh(first, currency);
                    debts.refresh(second, currency);
                    audit.record(new AuditEntry(driver, "driverBalance.transfer", "driver", recipient.toString(),
                            note, null, Map.of("currency", currency, "amount_minor", amountMinor,
                                    "transfer_id", id.toString())));
                    return new Transfer(id, driver.id(), recipient, currency, amountMinor, note, now);
                });
    }

    @Override
    @Transactional(propagation = org.springframework.transaction.annotation.Propagation.MANDATORY)
    public boolean creditPromotion(UUID driverId, UUID promotionId, int periodIndex, String currency,
                                   long amountMinor, String promotionName) {
        if (amountMinor <= 0) {
            return false;
        }
        boolean posted = ledger.post(new Ledger.Posting("driver-promotion:" + promotionId + ":" + driverId + ":"
                + periodIndex, "DRIVER_PROMOTION", promotionId, currency, promotionName,
                List.of(Line.debit(Account.PROMO_EXPENSE, null, amountMinor),
                        Line.credit(Account.DRIVER_PAYABLE, driverId, amountMinor))));
        if (posted) {
            debts.refresh(driverId, currency);
        }
        return posted;
    }

    /**
     * Money the driver paid by card on the provider's page (ADR 0010 p. 1), in the caller's transaction: what the
     * provider now holds for the service goes to the driver's balance. Once per top-up.
     */
    boolean creditCardTopUp(UUID driverId, UUID topUpId, String currency, long amountMinor) {
        boolean posted = ledger.post(new Ledger.Posting("driver-card-top-up:" + topUpId, "DRIVER_CARD_TOP_UP",
                topUpId, currency, "Top-up by card", List.of(Line.debit(Account.PROVIDER_CLEARING, null, amountMinor),
                        Line.credit(Account.DRIVER_PAYABLE, driverId, amountMinor))));
        if (posted) {
            debts.refresh(driverId, currency);
        }
        return posted;
    }

    private void lock(UUID driverId) {
        jdbc.sql("select pg_advisory_xact_lock(hashtextextended('driver-balance:' || :id, 0))")
                .param("id", driverId.toString()).query().singleRow();
    }

    // ---------------------------------------------------------------- rules

    @Override
    @Transactional(readOnly = true)
    public List<TransferRule> transferRules() {
        return jdbc.sql("""
                        select currency, enabled, max_per_transfer_minor, max_per_day_minor, min_balance_after_minor,
                               version
                        from driver_transfer_rule order by currency""")
                .query((rs, i) -> new TransferRule(rs.getString(1), rs.getBoolean(2), rs.getLong(3), rs.getLong(4),
                        rs.getLong(5), rs.getLong(6)))
                .list();
    }

    record RuleRequest(TransferRule rule, long expectedVersion, String reason) {
    }

    @Override
    public TransferRule setTransferRule(Actor actor, UUID commandId, TransferRule rule, long expectedVersion,
                                       String reason) {
        staff.require(actor, MANAGE_PERMISSION);
        String why = text(reason, 500, "A reason");
        if (rule == null) {
            throw invalid("The rule is required");
        }
        requireCurrency(rule.currency());
        if (rule.maxPerTransferMinor() <= 0 || rule.maxPerDayMinor() < rule.maxPerTransferMinor()) {
            throw invalid("Limits must be positive, and the day's at least one transfer's");
        }
        return commands.execute(new CommandKey(actor, "driverBalance.transferRule", commandId),
                new RuleRequest(rule, expectedVersion, why), TransferRule.class, () -> {
                    TransferRule before = jdbc.sql("""
                                    select currency, enabled, max_per_transfer_minor, max_per_day_minor,
                                           min_balance_after_minor, version
                                    from driver_transfer_rule where currency = :currency for update""")
                            .param("currency", rule.currency())
                            .query((rs, i) -> new TransferRule(rs.getString(1), rs.getBoolean(2), rs.getLong(3),
                                    rs.getLong(4), rs.getLong(5), rs.getLong(6)))
                            .optional().orElse(null);
                    long current = before == null ? 0 : before.version();
                    if (current != expectedVersion) {
                        throw new DomainException(ErrorCode.VERSION_CONFLICT, "The rule changed");
                    }
                    jdbc.sql("""
                                    insert into driver_transfer_rule (currency, enabled, max_per_transfer_minor,
                                        max_per_day_minor, min_balance_after_minor, version, changed_by, changed_at)
                                    values (:currency, :enabled, :perTransfer, :perDay, :min, :version, :by, :now)
                                    on conflict (currency) do update set enabled = excluded.enabled,
                                        max_per_transfer_minor = excluded.max_per_transfer_minor,
                                        max_per_day_minor = excluded.max_per_day_minor,
                                        min_balance_after_minor = excluded.min_balance_after_minor,
                                        version = excluded.version, changed_by = excluded.changed_by,
                                        changed_at = excluded.changed_at""")
                            .param("currency", rule.currency()).param("enabled", rule.enabled())
                            .param("perTransfer", rule.maxPerTransferMinor()).param("perDay", rule.maxPerDayMinor())
                            .param("min", rule.minBalanceAfterMinor()).param("version", current + 1)
                            .param("by", actor.id()).param("now", now()).update();
                    TransferRule after = new TransferRule(rule.currency(), rule.enabled(), rule.maxPerTransferMinor(),
                            rule.maxPerDayMinor(), rule.minBalanceAfterMinor(), current + 1);
                    audit.record(new AuditEntry(actor, "driverBalance.transferRule", "driver_transfer_rule",
                            rule.currency(), why, before, after));
                    return after;
                });
    }

    // ---------------------------------------------------------------- helpers

    private void requireDriver(Actor driver) {
        if (driver == null || driver.type() != SubjectType.DRIVER) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Drivers only");
        }
    }

    private void requireExists(UUID driverId) {
        if (driverId == null || accounts.accountState(new Actor(SubjectType.DRIVER, driverId)).isEmpty()) {
            throw new DomainException(ErrorCode.NOT_FOUND, "Driver not found");
        }
    }

    private void requireCurrency(String currency) {
        if (currency == null || cities.published().stream().noneMatch(c -> currency.equals(c.currency()))) {
            throw invalid("The service has no city with this currency");
        }
    }

    private static String text(String value, int max, String what) {
        String v = value == null ? "" : value.strip();
        if (v.isEmpty() || v.length() > max) {
            throw invalid(what + " is required (at most " + max + " characters)");
        }
        return v;
    }

    private static DomainException invalid(String message) {
        return new DomainException(ErrorCode.VALIDATION_FAILED, message);
    }

    private OffsetDateTime now() {
        return OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
    }
}
