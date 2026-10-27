package taxi.blizz.payments.internal;

import java.time.Clock;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.identity.AccountDirectory;
import taxi.blizz.payments.CardTopUps;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;
import taxi.blizz.platform.Outbox;
import taxi.blizz.platform.OutboxEvent;
import taxi.blizz.platform.SubjectType;

/**
 * Card top-ups on the provider's payment page (ADR 0009, ADR 0010). The result comes from the provider's notification
 * ({@link #apply}); when none came by the time the page closed, {@link #reconcile} asks with CHECK_STATUS. Money the
 * provider took always ends COMPLETED, also after FAILED or EXPIRED: a late or reconciled approval is credited once.
 */
@Service
class JdbcCardTopUps implements CardTopUps {

    private static final Logger log = LoggerFactory.getLogger(JdbcCardTopUps.class);
    /** How long a top-up whose result is still unknown keeps being asked about after its page closed. */
    static final Duration RECONCILE_FOR = Duration.ofDays(2);
    private static final Duration CHECK_EVERY = Duration.ofMinutes(5);

    private final JdbcClient jdbc;
    private final TransactionTemplate tx;
    private final IdempotentCommands commands;
    private final Merchants merchants;
    private final Providers providers;
    private final PaymentsProperties properties;
    private final AccountDirectory accounts;
    private final Outbox outbox;
    private final Clock clock;

    JdbcCardTopUps(JdbcClient jdbc, TransactionTemplate tx, IdempotentCommands commands, Merchants merchants,
                   Providers providers, PaymentsProperties properties, AccountDirectory accounts, Outbox outbox,
                   Clock clock) {
        this.jdbc = jdbc;
        this.tx = tx;
        this.commands = commands;
        this.merchants = merchants;
        this.providers = providers;
        this.properties = properties;
        this.accounts = accounts;
        this.outbox = outbox;
        this.clock = clock;
    }

    record StartRequest(UUID cityId, long amountMinor) {
    }

    @Override
    public TopUp start(Actor payer, UUID commandId, UUID cityId, long amountMinor) {
        requirePayer(payer);
        if (cityId == null) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "The city is required");
        }
        if (amountMinor < properties.topUpMinMinor() || amountMinor > properties.topUpMaxMinor()) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "A top-up is from " + properties.topUpMinMinor()
                    + " to " + properties.topUpMaxMinor() + " minor units");
        }
        Merchant merchant = merchants.forCity(cityId)
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Cards are not accepted in this city"));
        return commands.execute(new CommandKey(payer, "card.top-up", commandId), new StartRequest(cityId, amountMinor),
                TopUp.class, () -> {
                    UUID id = UUID.randomUUID();
                    String reference = "topup-" + id;
                    OffsetDateTime now = now();
                    OffsetDateTime expiresAt = now.plus(properties.bindingTtl());
                    jdbc.sql("""
                                    insert into card_top_up (id, account_type, account_id, merchant_id, reference,
                                                             amount_minor, currency, state, created_at, expires_at,
                                                             next_check_at)
                                    values (:id, :type, :account, :merchant, :reference, :amount, :currency,
                                            'PENDING', :now, :expires, :expires)""")
                            .param("id", id).param("type", payer.type().name()).param("account", payer.id())
                            .param("merchant", merchant.id()).param("reference", reference)
                            .param("amount", amountMinor).param("currency", merchant.currency())
                            .param("now", now).param("expires", expiresAt).update();
                    String returnUrl = properties.publicBaseUrl() + "/payments/v1/return?top_up=" + id;
                    PaymentProvider.Form form = providers.of(merchant).purchaseForm(merchant, reference, amountMinor,
                            payer.type() == SubjectType.DRIVER ? "Driver balance top-up" : "Bonus account top-up",
                            returnUrl, properties.publicBaseUrl() + "/payments/v1/callbacks/" + merchant.id(),
                            accounts.phone(payer).orElse(null), accounts.language(payer).orElse(null),
                            properties.bindingTtl().toSeconds());
                    return new TopUp(id, "PENDING", amountMinor, merchant.currency(), form.url(), form.fields(),
                            returnUrl, now, expiresAt, null, null, null);
                });
    }

    @Override
    @Transactional(readOnly = true)
    public TopUp topUp(Actor payer, UUID topUpId) {
        requirePayer(payer);
        return jdbc.sql("""
                        select id, state, amount_minor, currency, created_at, expires_at, completed_at, masked_pan,
                               failure_reason
                        from card_top_up where id = :id and account_type = :type and account_id = :account""")
                .param("id", topUpId).param("type", payer.type().name()).param("account", payer.id())
                .query((rs, i) -> {
                    String state = rs.getString("state");
                    OffsetDateTime expiresAt = rs.getObject("expires_at", OffsetDateTime.class);
                    return new TopUp(rs.getObject("id", UUID.class), state, rs.getLong("amount_minor"),
                            rs.getString("currency"), null, null, null,
                            rs.getObject("created_at", OffsetDateTime.class), expiresAt,
                            rs.getObject("completed_at", OffsetDateTime.class), rs.getString("masked_pan"),
                            rs.getString("failure_reason"));
                })
                .optional().orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Top-up not found"));
    }

    // ---------------------------------------------------------------- results

    private record Locked(UUID id, String accountType, UUID accountId, long amountMinor, String currency,
                          String state) {
    }

    /**
     * The provider's word about a top-up of {@code merchantId} by its reference, in the caller's transaction. Empty
     * when the reference is not a top-up; otherwise what was done, for the notification inbox.
     */
    Optional<String> apply(UUID merchantId, String reference, PaymentProvider.Outcome outcome, Long amountMinor,
                           String currency, String maskedPan, String reason) {
        Optional<Locked> found = jdbc.sql("""
                        select id, account_type, account_id, amount_minor, currency, state from card_top_up
                        where reference = :reference and merchant_id = :merchant for update""")
                .param("reference", reference).param("merchant", merchantId)
                .query((rs, i) -> new Locked(rs.getObject(1, UUID.class), rs.getString(2), rs.getObject(3, UUID.class),
                        rs.getLong(4), rs.getString(5), rs.getString(6)))
                .optional();
        if (found.isEmpty()) {
            return Optional.empty();
        }
        Locked t = found.get();
        if ("COMPLETED".equals(t.state())) {
            return Optional.of("ALREADY_COMPLETED");
        }
        if (amountMinor != null && (amountMinor != t.amountMinor() || !t.currency().equals(currency))) {
            // Not what was asked for: never credit a different sum; left for staff with the inbox record.
            log.error("Top-up {} reported {} {} instead of {} {}", t.id(), amountMinor, currency, t.amountMinor(),
                    t.currency());
            return Optional.of("TOP_UP_AMOUNT_MISMATCH");
        }
        switch (outcome) {
            case SUCCEEDED -> {
                jdbc.sql("""
                                update card_top_up set state = 'COMPLETED', completed_at = :now,
                                    masked_pan = coalesce(:pan, masked_pan), failure_reason = null,
                                    next_check_at = null
                                where id = :id""")
                        .param("now", now()).param("pan", maskedPan).param("id", t.id()).update();
                Map<String, Object> payload = new LinkedHashMap<>();
                payload.put("top_up_id", t.id().toString());
                payload.put("account_type", t.accountType());
                payload.put("account_id", t.accountId().toString());
                payload.put("amount_minor", t.amountMinor());
                payload.put("currency", t.currency());
                outbox.publish(new OutboxEvent(COMPLETED, 1, "CardTopUp", t.id(), 1, payload));
                return Optional.of("TOP_UP_COMPLETED");
            }
            case DECLINED -> {
                if (!"PENDING".equals(t.state())) {
                    return Optional.of("ALREADY_" + t.state());
                }
                jdbc.sql("""
                                update card_top_up set state = 'FAILED', completed_at = :now, next_check_at = null,
                                    failure_reason = :reason
                                where id = :id""")
                        .param("now", now()).param("reason", reason == null ? "Declined" : reason)
                        .param("id", t.id()).update();
                return Optional.of("TOP_UP_FAILED");
            }
            default -> {
                return Optional.of("TOP_UP_WAITING");
            }
        }
    }

    // ---------------------------------------------------------------- reconciliation

    private record Due(UUID id, UUID merchantId, String reference, OffsetDateTime expiresAt) {
    }

    /**
     * Asks the provider about top-ups whose page closed without a result (REQ-PAY-10): approved is credited, declined
     * or unknown to the provider fails, anything else is asked again later and EXPIRED after {@link #RECONCILE_FOR}.
     * Called by the payment worker outside any transaction; returns how many were asked about.
     */
    int reconcile() {
        OffsetDateTime now = now();
        List<Due> due = tx.execute(status -> jdbc.sql("""
                        with due as (
                            select id from card_top_up
                            where state = 'PENDING' and next_check_at <= :now
                            order by next_check_at limit 20
                            for update skip locked)
                        update card_top_up t set next_check_at = :next
                        from due where t.id = due.id
                        returning t.id, t.merchant_id, t.reference, t.expires_at""")
                .param("now", now).param("next", now.plus(CHECK_EVERY))
                .query((rs, i) -> new Due(rs.getObject(1, UUID.class), rs.getObject(2, UUID.class), rs.getString(3),
                        rs.getObject(4, OffsetDateTime.class)))
                .list());
        if (due == null) {
            return 0;
        }
        for (Due d : due) {
            try {
                Merchant merchant = merchants.byId(d.merchantId())
                        .orElseThrow(() -> new IllegalStateException("Merchant " + d.merchantId() + " has no secret"));
                PaymentProvider.Result result = providers.of(merchant).checkStatus(merchant, d.reference());
                tx.executeWithoutResult(status -> {
                    if (result.outcome() == PaymentProvider.Outcome.SUCCEEDED
                            || result.outcome() == PaymentProvider.Outcome.DECLINED) {
                        apply(d.merchantId(), d.reference(), result.outcome(), null, null, null, result.reason());
                    } else if (!now().isBefore(d.expiresAt().plus(RECONCILE_FOR))) {
                        jdbc.sql("""
                                        update card_top_up set state = 'EXPIRED', next_check_at = null
                                        where id = :id and state = 'PENDING'""")
                                .param("id", d.id()).update();
                    }
                });
            } catch (RuntimeException e) {
                log.warn("Top-up {} will be asked about again: {}", d.id(), e.toString());
            }
        }
        return due.size();
    }

    private OffsetDateTime now() {
        return clock.instant().truncatedTo(ChronoUnit.MICROS).atOffset(ZoneOffset.UTC);
    }

    private static void requirePayer(Actor actor) {
        if (actor == null || (actor.type() != SubjectType.CLIENT && actor.type() != SubjectType.DRIVER)) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Only riders and drivers top up by card");
        }
    }
}
