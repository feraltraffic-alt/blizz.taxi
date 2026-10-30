package taxi.blizz.finance.internal;

import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.audit.AuditEntry;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.finance.DriverDebts;
import taxi.blizz.finance.Ledger;
import taxi.blizz.finance.Ledger.Account;
import taxi.blizz.finance.Ledger.Line;
import taxi.blizz.finance.RiderWallets;
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
class JdbcRiderWallets implements RiderWallets {

    /** At most this much in one top-up by staff (a typo guard, not a business limit). */
    static final long MAX_STAFF_TOP_UP_MINOR = 10_000_000;

    private final JdbcClient jdbc;
    private final Ledger ledger;
    private final IdempotentCommands commands;
    private final StaffAccess staff;
    private final AccountDirectory accounts;
    private final CityCatalog cities;
    private final AuditLog audit;
    private final DriverDebts debts;
    private final Clock clock;
    private final StaffTopUpLimit topUpLimit;

    JdbcRiderWallets(JdbcClient jdbc, Ledger ledger, IdempotentCommands commands, StaffAccess staff,
                     AccountDirectory accounts, CityCatalog cities, AuditLog audit, DriverDebts debts, Clock clock,
                     StaffTopUpLimit topUpLimit) {
        this.jdbc = jdbc;
        this.ledger = ledger;
        this.commands = commands;
        this.staff = staff;
        this.accounts = accounts;
        this.cities = cities;
        this.audit = audit;
        this.debts = debts;
        this.clock = clock;
        this.topUpLimit = topUpLimit;
    }

    @Override
    @Transactional(readOnly = true)
    public Wallet mine(Actor rider, int limit) {
        if (rider == null || rider.type() != SubjectType.CLIENT) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Riders only");
        }
        return wallet(rider.id(), limit);
    }

    @Override
    @Transactional(readOnly = true)
    public Wallet of(Actor actor, UUID clientId, int limit) {
        staff.require(actor, MANAGE_PERMISSION);
        requireClient(clientId);
        return wallet(clientId, limit);
    }

    @Override
    @Transactional(readOnly = true)
    public UUID clientByPhone(Actor actor, String phone) {
        staff.require(actor, MANAGE_PERMISSION);
        PhoneNumber number;
        try {
            number = PhoneNumber.parse(phone);
        } catch (RuntimeException e) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "Not a phone number");
        }
        return accounts.clientByPhone(number)
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "No rider with this phone"));
    }

    record TopUpRequest(UUID clientId, String currency, long amountMinor, String reason) {
    }

    @Override
    public Wallet topUp(Actor actor, UUID commandId, UUID clientId, String currency, long amountMinor,
                        String reason) {
        staff.require(actor, MANAGE_PERMISSION);
        String why = reason == null ? "" : reason.strip();
        if (why.isEmpty() || why.length() > 500) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "A reason (at most 500 characters) is required");
        }
        if (amountMinor <= 0 || amountMinor > MAX_STAFF_TOP_UP_MINOR) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "The amount must be positive and at most "
                    + MAX_STAFF_TOP_UP_MINOR + " minor units");
        }
        requireCurrency(currency);
        requireClient(clientId);
        return commands.execute(new CommandKey(actor, "wallet.topUp", commandId),
                new TopUpRequest(clientId, currency, amountMinor, why), Wallet.class, () -> {
                    OffsetDateTime now = now();
                    topUpLimit.check(actor, currency, amountMinor, now);
                    ensureAccount(clientId, currency, now);
                    UUID id = UUID.randomUUID();
                    jdbc.sql("""
                                    insert into rider_wallet_top_up (id, client_id, currency, amount_minor, source,
                                                                     staff_id, reason, state, created_at, completed_at)
                                    values (:id, :client, :currency, :amount, 'STAFF', :staff, :reason, 'COMPLETED',
                                            :now, :now)""")
                            .param("id", id).param("client", clientId).param("currency", currency)
                            .param("amount", amountMinor).param("staff", actor.id()).param("reason", why)
                            .param("now", now).update();
                    // A goodwill top-up is the service's expense (ADR 0009).
                    ledger.post(new Ledger.Posting("wallet-top-up:" + id, "WALLET_TOP_UP", id, currency, why,
                            List.of(Line.debit(Account.PROMO_EXPENSE, null, amountMinor),
                                    Line.credit(Account.RIDER_WALLET, clientId, amountMinor))));
                    audit.record(new AuditEntry(actor, "wallet.topUp", "client", clientId.toString(), why, null,
                            Map.of("currency", currency, "amount_minor", amountMinor, "top_up_id", id.toString())));
                    return wallet(clientId, 20);
                });
    }

    @Override
    @Transactional(propagation = org.springframework.transaction.annotation.Propagation.MANDATORY)
    public void reserve(UUID clientId, UUID orderId, String currency, long amountMinor) {
        if (amountMinor <= 0) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "The bonuses to use must be positive");
        }
        OffsetDateTime now = now();
        ensureAccount(clientId, currency, now);
        jdbc.sql("select 1 from rider_wallet where client_id = :client and currency = :currency for update")
                .param("client", clientId).param("currency", currency).query(Integer.class).single();
        long balance = ledger.balances(Account.RIDER_WALLET, clientId).stream()
                .filter(b -> b.currency().equals(currency)).mapToLong(b -> b.creditMinor() - b.debitMinor()).sum();
        long available = balance - reserved(clientId, currency);
        if (amountMinor > available) {
            throw new DomainException(ErrorCode.WALLET_INSUFFICIENT,
                    "Not enough on the balance (" + available + " available); choose another way to pay");
        }
        jdbc.sql("""
                        insert into rider_wallet_hold (order_id, client_id, currency, amount_minor, state, created_at)
                        values (:order, :client, :currency, :amount, 'RESERVED', :now)""")
                .param("order", orderId).param("client", clientId).param("currency", currency)
                .param("amount", amountMinor).param("now", now).update();
    }

    @Override
    @Transactional(propagation = org.springframework.transaction.annotation.Propagation.MANDATORY)
    public void payTip(UUID clientId, UUID driverId, UUID orderId, UUID tipId, String currency, long amountMinor) {
        if (amountMinor <= 0) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "The tip must be positive");
        }
        ensureAccount(clientId, currency, now());
        jdbc.sql("select 1 from rider_wallet where client_id = :client and currency = :currency for update")
                .param("client", clientId).param("currency", currency).query(Integer.class).single();
        long available = available(clientId, currency);
        if (amountMinor > available) {
            throw new DomainException(ErrorCode.WALLET_INSUFFICIENT,
                    "Not enough on the balance (" + available + " available); choose another way to pay");
        }
        if (ledger.post(new Ledger.Posting("tip:" + tipId, "TIP", orderId, currency, "Tip for the driver",
                List.of(Line.debit(Account.RIDER_WALLET, clientId, amountMinor),
                        Line.credit(Account.DRIVER_PAYABLE, driverId, amountMinor))))) {
            debts.refresh(driverId, currency);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public long available(UUID clientId, String currency) {
        long balance = ledger.balances(Account.RIDER_WALLET, clientId).stream()
                .filter(b -> b.currency().equals(currency)).mapToLong(b -> b.creditMinor() - b.debitMinor()).sum();
        return Math.max(0, balance - reserved(clientId, currency));
    }

    @Override
    @Transactional(propagation = org.springframework.transaction.annotation.Propagation.MANDATORY)
    public boolean creditPromotion(UUID clientId, UUID orderId, UUID promotionId, String currency, long amountMinor,
                                   String promotionName) {
        if (amountMinor <= 0) {
            return false;
        }
        ensureAccount(clientId, currency, now());
        return ledger.post(new Ledger.Posting("promotion:" + orderId + ":" + promotionId, "PROMOTION", orderId,
                currency, promotionName, List.of(Line.debit(Account.PROMO_EXPENSE, null, amountMinor),
                        Line.credit(Account.RIDER_WALLET, clientId, amountMinor))));
    }

    /**
     * Money the rider paid by card on the provider's page (ADR 0009 p. 1), in the caller's transaction: what the
     * provider now holds for the service is owed to the rider as bonuses. Once per top-up.
     */
    boolean creditCardTopUp(UUID clientId, UUID topUpId, String currency, long amountMinor) {
        ensureAccount(clientId, currency, now());
        return ledger.post(new Ledger.Posting("card-top-up:" + topUpId, "CARD_TOP_UP", topUpId, currency,
                "Top-up by card", List.of(Line.debit(Account.PROVIDER_CLEARING, null, amountMinor),
                        Line.credit(Account.RIDER_WALLET, clientId, amountMinor))));
    }

    /**
     * The rider deleted the account (owner decision 27.10.2026, issue #56): the bonuses burn — the rest of the account
     * in each currency goes to WALLET_FORFEITED, in the caller's transaction. Once per rider and currency; returns
     * how many currencies had something to burn.
     */
    int forfeitAll(UUID clientId) {
        List<String> currencies = jdbc.sql(
                        "select currency from rider_wallet where client_id = :client order by currency for update")
                .param("client", clientId).query(String.class).list();
        int forfeited = 0;
        for (String currency : currencies) {
            long balance = ledger.balances(Account.RIDER_WALLET, clientId).stream()
                    .filter(b -> b.currency().equals(currency)).mapToLong(b -> b.creditMinor() - b.debitMinor())
                    .sum();
            if (balance > 0 && ledger.post(new Ledger.Posting("wallet-forfeit:" + clientId + ":" + currency,
                    "WALLET_FORFEIT", clientId, currency, "The rider deleted the account",
                    List.of(Line.debit(Account.RIDER_WALLET, clientId, balance),
                            Line.credit(Account.WALLET_FORFEITED, null, balance))))) {
                forfeited++;
            }
        }
        return forfeited;
    }

    private long reserved(UUID clientId, String currency) {
        return jdbc.sql("""
                        select coalesce(sum(amount_minor), 0) from rider_wallet_hold
                        where client_id = :client and currency = :currency and state = 'RESERVED'""")
                .param("client", clientId).param("currency", currency).query(Long.class).single();
    }

    /** The lock row of a rider's account in a currency; spending locks it (ADR 0009). */
    private void ensureAccount(UUID clientId, String currency, OffsetDateTime now) {
        jdbc.sql("""
                        insert into rider_wallet (client_id, currency, created_at) values (:client, :currency, :now)
                        on conflict do nothing""")
                .param("client", clientId).param("currency", currency).param("now", now).update();
    }

    private Wallet wallet(UUID clientId, int limit) {
        List<Balance> balances = ledger.balances(Account.RIDER_WALLET, clientId).stream()
                .map(b -> {
                    long balance = b.creditMinor() - b.debitMinor();
                    long reserved = reserved(clientId, b.currency());
                    return new Balance(b.currency(), balance, reserved, Math.max(0, balance - reserved));
                }).toList();
        List<Entry> entries = jdbc.sql("""
                        select t.id, t.occurred_at, t.basis_type, t.basis_id, t.currency, t.reason,
                               l.credit_minor - l.debit_minor as amount, u.source, u.staff_id
                        from journal_line l
                        join journal_transaction t on t.id = l.transaction_id
                        left join rider_wallet_top_up u on t.basis_type = 'WALLET_TOP_UP' and u.id = t.basis_id
                        where l.account = 'RIDER_WALLET' and l.party_id = :client
                        order by t.occurred_at desc, t.id
                        limit :limit""")
                .param("client", clientId).param("limit", Math.max(1, Math.min(limit, 200)))
                .query((rs, i) -> {
                    String basis = rs.getString("basis_type");
                    String kind = "WALLET_TOP_UP".equals(basis) ? rs.getString("source") + "_TOP_UP" : basis;
                    UUID basisId = rs.getObject("basis_id", UUID.class);
                    return new Entry(rs.getObject("id", UUID.class), rs.getObject("occurred_at", OffsetDateTime.class),
                            kind, rs.getString("currency"), rs.getLong("amount"), rs.getString("reason"),
                            rs.getObject("staff_id", UUID.class),
                            "WALLET_TOP_UP".equals(basis) || "CARD_TOP_UP".equals(basis) ? null : basisId);
                })
                .list();
        return new Wallet(clientId, balances, entries);
    }

    private void requireClient(UUID clientId) {
        if (clientId == null || accounts.accountState(new Actor(SubjectType.CLIENT, clientId)).isEmpty()) {
            throw new DomainException(ErrorCode.NOT_FOUND, "Rider not found");
        }
    }

    /** Only a currency some city of the service uses. */
    private void requireCurrency(String currency) {
        if (currency == null || cities.published().stream().noneMatch(c -> currency.equals(c.currency()))) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "The service has no city with this currency");
        }
    }

    private OffsetDateTime now() {
        return OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
    }
}
