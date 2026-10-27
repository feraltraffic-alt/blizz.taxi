package taxi.blizz.payments.internal;

import java.time.Clock;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.payments.CardPayments;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.Outbox;
import taxi.blizz.platform.OutboxEvent;

/**
 * Intents and operations (ADR 0008). Every external operation is a row with its own reference; the worker sends it
 * once and afterwards only asks the provider about it (REQ-PAY-10). Results — from the provider's answer, a status
 * check or a notification — go through {@link #apply}, which never moves a final operation back.
 */
@Service
class JdbcCardPayments implements CardPayments {

    private final JdbcClient jdbc;
    private final Merchants merchants;
    private final Outbox outbox;
    private final Clock clock;
    private final PaymentWorker worker;

    JdbcCardPayments(JdbcClient jdbc, Merchants merchants, Outbox outbox, Clock clock, @Lazy PaymentWorker worker) {
        this.jdbc = jdbc;
        this.merchants = merchants;
        this.outbox = outbox;
        this.clock = clock;
        this.worker = worker;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public UUID requestHold(UUID orderId, UUID clientId, UUID cityId, long amountMinor, String currency,
                            OffsetDateTime holdUntil) {
        Merchant merchant = merchants.forCity(cityId)
                .orElseThrow(() -> invalid("Card payment is not available in this city"));
        if (!merchant.currency().equals(currency)) {
            throw invalid("The city's card merchant takes " + merchant.currency());
        }
        UUID cardId = jdbc.sql("""
                        select id from payment_card
                        where client_id = :client and merchant_id = :merchant and state = 'ACTIVE'
                        order by created_at desc limit 1""")
                .param("client", clientId).param("merchant", merchant.id()).query(UUID.class).optional()
                .orElseThrow(() -> invalid("Add a card first"));
        UUID intentId = UUID.randomUUID();
        OffsetDateTime now = now();
        jdbc.sql("""
                        insert into payment_intent (id, order_id, client_id, merchant_id, card_id, currency, hold_minor,
                                                    hold_until, state, created_at, updated_at)
                        values (:id, :order, :client, :merchant, :card, :currency, :amount, :until, 'AUTH_PENDING',
                                :now, :now)""")
                .param("id", intentId).param("order", orderId).param("client", clientId)
                .param("merchant", merchant.id()).param("card", cardId).param("currency", currency)
                .param("amount", amountMinor).param("until", holdUntil).param("now", now).update();
        UUID operationId = UUID.randomUUID();
        createOperation(operationId, intentId, "AUTH", "auth-" + operationId, null, amountMinor);
        return intentId;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public void releaseHold(UUID orderId, String reason) {
        record Locked(UUID id, String state, long hold) {
        }
        Optional<Locked> intent = jdbc.sql("""
                        select id, state, hold_minor from payment_intent where order_id = :order for update""")
                .param("order", orderId)
                .query((rs, i) -> new Locked(rs.getObject(1, UUID.class), rs.getString(2), rs.getLong(3))).optional();
        if (intent.isEmpty()) {
            return;
        }
        Locked i = intent.get();
        switch (i.state()) {
            case "AUTH_PENDING", "UNKNOWN" -> {
                int cancelled = jdbc.sql("""
                                update payment_operation set state = 'CANCELLED', updated_at = :now
                                where intent_id = :intent and type = 'AUTH' and state = 'CREATED'""")
                        .param("now", now()).param("intent", i.id()).update();
                if (cancelled == 1) {
                    intentState(i.id(), "VOIDED");
                } else {
                    // Already sent: whatever the provider decides, a success is released at once (T-23).
                    jdbc.sql("update payment_intent set void_requested = true, updated_at = :now, version = version + 1 "
                            + "where id = :id").param("now", now()).param("id", i.id()).update();
                }
            }
            case "AUTHORIZED" -> requestVoid(i.id(), i.hold(), reason);
            default -> {
                // DECLINED, VOID_PENDING, VOIDED: nothing held; captures are handled after the trip (part C).
            }
        }
    }

    @Override
    public void processNow(UUID orderId) {
        worker.processOrder(orderId);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Intent> intent(UUID orderId) {
        return jdbc.sql("""
                        select i.id, i.order_id, i.state, i.hold_minor, i.currency, c.masked_pan
                        from payment_intent i join payment_card c on c.id = i.card_id where i.order_id = :order""")
                .param("order", orderId)
                .query((rs, n) -> new Intent(rs.getObject(1, UUID.class), rs.getObject(2, UUID.class),
                        rs.getString(3), rs.getLong(4), rs.getString(5), rs.getString(6)))
                .optional();
    }

    // ---------------------------------------------------------------- shared with the worker and notifications

    void createOperation(UUID id, UUID intentId, String type, String reference, String target, long amountMinor) {
        OffsetDateTime now = now();
        jdbc.sql("""
                        insert into payment_operation (id, intent_id, type, reference, target, amount_minor, state,
                                                       next_check_at, created_at, updated_at)
                        values (:id, :intent, :type, :reference, :target, :amount, 'CREATED', :now, :now, :now)""")
                .param("id", id).param("intent", intentId).param("type", type).param("reference", reference)
                .param("target", target == null ? reference : target).param("amount", amountMinor).param("now", now)
                .update();
    }

    private void requestVoid(UUID intentId, long amountMinor, String reason) {
        String authReference = jdbc.sql("""
                        select reference from payment_operation
                        where intent_id = :intent and type = 'AUTH' and state = 'SUCCEEDED'""")
                .param("intent", intentId).query(String.class).single();
        UUID id = UUID.randomUUID();
        createOperation(id, intentId, "REFUND", "void-" + id, authReference, amountMinor);
        intentState(intentId, "VOID_PENDING");
    }

    /**
     * One result for one operation, in a transaction: the operation's state, then the intent's, then the event the
     * order module waits for. A final operation (SUCCEEDED, DECLINED, CANCELLED) is never changed again.
     */
    @Transactional
    public void apply(UUID operationId, PaymentProvider.Outcome outcome, String providerStatus, String reasonCode,
               String reason) {
        record Op(UUID intentId, String type, String state, int attempts) {
        }
        Op op = jdbc.sql("select intent_id, type, state, attempts from payment_operation where id = :id for update")
                .param("id", operationId)
                .query((rs, i) -> new Op(rs.getObject(1, UUID.class), rs.getString(2), rs.getString(3), rs.getInt(4)))
                .single();
        if (java.util.Set.of("SUCCEEDED", "DECLINED", "CANCELLED").contains(op.state())) {
            return;
        }
        String state = switch (outcome) {
            case SUCCEEDED -> "SUCCEEDED";
            case DECLINED -> "DECLINED";
            case PENDING -> "PENDING";
            case UNKNOWN -> "UNKNOWN";
        };
        OffsetDateTime now = now();
        // Unknown and pending results are asked about again, less often each time (at most every 10 minutes).
        OffsetDateTime nextCheck = "PENDING".equals(state) || "UNKNOWN".equals(state)
                ? now.plus(backoff(op.attempts())) : null;
        jdbc.sql("""
                        update payment_operation set state = :state, provider_status = coalesce(:status, provider_status),
                               reason_code = :code, reason = :reason, lease_until = null, next_check_at = :next,
                               updated_at = :now
                        where id = :id""")
                .param("state", state).param("status", providerStatus).param("code", reasonCode)
                .param("reason", reason).param("next", nextCheck).param("now", now).param("id", operationId).update();
        record Intent(UUID id, UUID orderId, String state, boolean voidRequested, long hold) {
        }
        Intent intent = jdbc.sql("""
                        select id, order_id, state, void_requested, hold_minor from payment_intent
                        where id = :id for update""")
                .param("id", op.intentId())
                .query((rs, i) -> new Intent(rs.getObject(1, UUID.class), rs.getObject(2, UUID.class),
                        rs.getString(3), rs.getBoolean(4), rs.getLong(5)))
                .single();
        switch (op.type()) {
            case "AUTH" -> {
                if ("SUCCEEDED".equals(state)) {
                    if (intent.voidRequested()) {
                        intentState(intent.id(), "AUTHORIZED");
                        requestVoid(intent.id(), intent.hold(), "Order cancelled while the hold was asked for");
                    } else {
                        intentState(intent.id(), "AUTHORIZED");
                        publish(HOLD_AUTHORIZED, intent.orderId(), intent.id(), Map.of());
                    }
                } else if ("DECLINED".equals(state)) {
                    intentState(intent.id(), "DECLINED");
                    if (!intent.voidRequested()) {
                        publish(HOLD_DECLINED, intent.orderId(), intent.id(),
                                Map.of("reason", reason == null ? "Declined" : reason));
                    }
                } else if ("UNKNOWN".equals(state)) {
                    intentState(intent.id(), "UNKNOWN");
                }
            }
            case "REFUND" -> {
                if ("SUCCEEDED".equals(state)) {
                    intentState(intent.id(), "VOIDED");
                }
            }
            default -> {
                // SETTLE and CHARGE: part C.
            }
        }
    }

    private void intentState(UUID intentId, String state) {
        jdbc.sql("update payment_intent set state = :state, updated_at = :now, version = version + 1 where id = :id")
                .param("state", state).param("now", now()).param("id", intentId).update();
    }

    private void publish(String type, UUID orderId, UUID intentId, Map<String, Object> extra) {
        Map<String, Object> payload = new java.util.LinkedHashMap<>(extra);
        payload.put("order_id", orderId.toString());
        payload.put("intent_id", intentId.toString());
        outbox.publish(new OutboxEvent(type, 1, "PaymentIntent", intentId, 0, payload));
    }

    static Duration backoff(int attempts) {
        long seconds = Math.min(600, 10L << Math.min(attempts, 6));
        return Duration.ofSeconds(seconds);
    }

    private OffsetDateTime now() {
        return clock.instant().truncatedTo(ChronoUnit.MICROS).atOffset(ZoneOffset.UTC);
    }

    private static DomainException invalid(String message) {
        return new DomainException(ErrorCode.VALIDATION_FAILED, message);
    }
}
