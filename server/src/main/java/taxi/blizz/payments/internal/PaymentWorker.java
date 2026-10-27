package taxi.blizz.payments.internal;

import java.time.Clock;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.identity.AccountDirectory;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.SubjectType;

/**
 * Talks to providers outside any transaction (REQ-PAY-01). An operation is claimed with a lease
 * ({@code SKIP LOCKED}), so several replicas never send it twice. A CREATED operation is sent once; any other —
 * UNKNOWN, PENDING, or SENDING whose lease ran out (a crash mid-call) — is only asked about with CHECK_STATUS,
 * never sent again (REQ-PAY-10).
 */
@Component
public class PaymentWorker {

    private static final Logger log = LoggerFactory.getLogger(PaymentWorker.class);
    private static final Duration LEASE = Duration.ofMinutes(2);
    private static final int BATCH = 20;

    private final JdbcClient jdbc;
    private final TransactionTemplate tx;
    private final Merchants merchants;
    private final Providers providers;
    private final JdbcCardPayments payments;
    private final AccountDirectory accounts;
    private final PaymentsProperties properties;
    private final Clock clock;

    PaymentWorker(JdbcClient jdbc, TransactionTemplate tx, Merchants merchants, Providers providers,
                  JdbcCardPayments payments, AccountDirectory accounts, PaymentsProperties properties, Clock clock) {
        this.jdbc = jdbc;
        this.tx = tx;
        this.merchants = merchants;
        this.providers = providers;
        this.payments = payments;
        this.accounts = accounts;
        this.properties = properties;
        this.clock = clock;
    }

    private record Claimed(UUID id, UUID intentId, String type, String reference, String target, long amount,
                           String previous) {
    }

    /** Processes the due operations; returns how many were handled. */
    public int runOnce() {
        return handle(claim(null));
    }

    /** The order's due operations right away (after the order was created or cancelled). */
    void processOrder(UUID orderId) {
        try {
            handle(claim(orderId));
        } catch (RuntimeException e) {
            log.warn("Payment for order {} will be retried by the worker: {}", orderId, e.toString());
        }
    }

    private List<Claimed> claim(UUID orderId) {
        OffsetDateTime now = now();
        String scope = orderId == null ? ""
                : " and intent_id = (select id from payment_intent where order_id = :order)";
        List<Claimed> claimed = tx.execute(status -> {
            var query = jdbc.sql("""
                            with due as (
                                select id, state as previous from payment_operation
                                where (state = 'CREATED'
                                       or (state in ('PENDING', 'UNKNOWN') and next_check_at <= :now)
                                       or (state = 'SENDING' and lease_until < :now))""" + scope + """

                                order by created_at limit :limit
                                for update skip locked)
                            update payment_operation o
                            set state = 'SENDING', lease_until = :lease, attempts = o.attempts + 1, updated_at = :now
                            from due where o.id = due.id
                            returning o.id, o.intent_id, o.type, o.reference, o.target, o.amount_minor, due.previous""")
                    .param("now", now).param("lease", now.plus(LEASE)).param("limit", BATCH);
            if (orderId != null) {
                query = query.param("order", orderId);
            }
            return query.query((rs, i) -> new Claimed(rs.getObject(1, UUID.class), rs.getObject(2, UUID.class),
                    rs.getString(3), rs.getString(4), rs.getString(5), rs.getLong(6), rs.getString(7))).list();
        });
        return claimed == null ? List.of() : claimed;
    }

    private int handle(List<Claimed> claimed) {
        for (Claimed op : claimed) {
            try {
                PaymentProvider.Result result = "CREATED".equals(op.previous()) ? send(op) : check(op);
                payments.apply(op.id(), result.outcome(), result.providerStatus(), result.reasonCode(),
                        result.reason());
            } catch (RuntimeException e) {
                // Leave it SENDING: when the lease runs out the next round asks the provider, it does not resend.
                log.error("Payment operation {} ({}) failed locally", op.id(), op.type(), e);
            }
        }
        return claimed.size();
    }

    private record Context(Merchant merchant, String token, UUID clientId, OffsetDateTime holdUntil) {
    }

    private Context context(UUID intentId) {
        record Row(UUID merchantId, String token, UUID clientId, OffsetDateTime holdUntil) {
        }
        Row row = jdbc.sql("""
                        select i.merchant_id, c.token, i.client_id, i.hold_until
                        from payment_intent i join payment_card c on c.id = i.card_id where i.id = :id""")
                .param("id", intentId)
                .query((rs, i) -> new Row(rs.getObject(1, UUID.class), rs.getString(2), rs.getObject(3, UUID.class),
                        rs.getObject(4, OffsetDateTime.class)))
                .single();
        Merchant merchant = merchants.byId(row.merchantId())
                .orElseThrow(() -> new IllegalStateException("Merchant " + row.merchantId() + " has no secret"));
        return new Context(merchant, row.token(), row.clientId(), row.holdUntil());
    }

    private PaymentProvider.Result send(Claimed op) {
        Context c = context(op.intentId());
        PaymentProvider provider = providers.of(c.merchant());
        String serviceUrl = properties.publicBaseUrl() + "/payments/v1/callbacks/" + c.merchant().id();
        PaymentProvider.Customer customer = new PaymentProvider.Customer(
                accounts.phone(new Actor(SubjectType.CLIENT, c.clientId())).orElse(null), null, null, null, null);
        return switch (op.type()) {
            case "AUTH" -> provider.authorize(c.merchant(), op.reference(), c.token(), op.amount(), customer,
                    "Taxi ride", holdSeconds(c.holdUntil()), serviceUrl);
            case "CHARGE" -> provider.charge(c.merchant(), op.reference(), c.token(), op.amount(), customer,
                    "Taxi ride, the rest of the fare", serviceUrl);
            case "SETTLE" -> provider.settle(c.merchant(), op.target(), op.amount());
            case "REFUND" -> provider.refund(c.merchant(), op.target(), op.amount(), "Hold released");
            default -> throw new IllegalStateException("Unknown operation " + op.type());
        };
    }

    /** What the provider says now about the transaction the operation acted on, read for that operation. */
    private PaymentProvider.Result check(Claimed op) {
        Context c = context(op.intentId());
        PaymentProvider.Result status = providers.of(c.merchant()).checkStatus(c.merchant(), op.target());
        if (status.providerStatus() == null) {
            return status.outcome() == PaymentProvider.Outcome.DECLINED && !"AUTH".equals(op.type())
                    && !"CHARGE".equals(op.type())
                    ? PaymentProvider.Result.unknown("The provider does not know the transaction") : status;
        }
        String s = status.providerStatus().toLowerCase(java.util.Locale.ROOT);
        PaymentProvider.Outcome outcome = switch (op.type()) {
            case "AUTH" -> switch (s) {
                case "waitingauthcomplete", "approved", "voided", "refunded" -> PaymentProvider.Outcome.SUCCEEDED;
                case "declined", "expired" -> PaymentProvider.Outcome.DECLINED;
                case "inprocessing", "pending", "created" -> PaymentProvider.Outcome.PENDING;
                default -> PaymentProvider.Outcome.UNKNOWN;
            };
            case "CHARGE", "SETTLE" -> switch (s) {
                case "approved", "refunded", "voided" -> PaymentProvider.Outcome.SUCCEEDED;
                case "declined", "expired" -> PaymentProvider.Outcome.DECLINED;
                default -> PaymentProvider.Outcome.PENDING;
            };
            case "REFUND" -> switch (s) {
                case "voided", "refunded" -> PaymentProvider.Outcome.SUCCEEDED;
                case "refundinprocessing" -> PaymentProvider.Outcome.PENDING;
                default -> PaymentProvider.Outcome.UNKNOWN;
            };
            default -> PaymentProvider.Outcome.UNKNOWN;
        };
        return new PaymentProvider.Result(outcome, status.providerStatus(), status.reasonCode(), status.reason());
    }

    /** Until the pre-order's pickup plus a day, or the provider's default; WayForPay keeps a hold up to 20 days. */
    private long holdSeconds(OffsetDateTime holdUntil) {
        if (holdUntil == null) {
            return properties.holdTimeoutSeconds();
        }
        return Math.max(properties.holdTimeoutSeconds(), Duration.between(now(), holdUntil).toSeconds());
    }

    private OffsetDateTime now() {
        return clock.instant().atOffset(ZoneOffset.UTC);
    }
}
