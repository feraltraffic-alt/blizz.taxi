package taxi.blizz.payments.internal;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.HexFormat;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tools.jackson.databind.json.JsonMapper;

/**
 * Notifications from providers (serviceUrl; REQ-PAY-11…13): the signature, merchant and amount are checked first;
 * a trusted notification is stored in the inbox once (by fingerprint), then applied. A result already reached is
 * never rolled back by a later or older notification.
 */
@Service
class PaymentNotifications {

    private static final Logger log = LoggerFactory.getLogger(PaymentNotifications.class);

    /** What the controller answers: the acknowledgement, or empty when the notification is not trusted. */
    record Answer(boolean trusted, Map<String, Object> body) {
    }

    private final JdbcClient jdbc;
    private final Merchants merchants;
    private final Providers providers;
    private final JsonMapper json;
    private final Clock clock;
    private final JdbcCardPayments payments;
    private final JdbcCardTopUps topUps;

    PaymentNotifications(JdbcClient jdbc, Merchants merchants, Providers providers, JsonMapper json, Clock clock,
                         JdbcCardPayments payments, JdbcCardTopUps topUps) {
        this.payments = payments;
        this.topUps = topUps;
        this.jdbc = jdbc;
        this.merchants = merchants;
        this.providers = providers;
        this.json = json;
        this.clock = clock;
    }

    @Transactional
    public Answer receive(UUID merchantId, Map<String, Object> body) {
        Optional<Merchant> found = merchants.byId(merchantId);
        if (found.isEmpty()) {
            return new Answer(false, Map.of());
        }
        Merchant merchant = found.get();
        PaymentProvider provider = providers.of(merchant);
        Optional<PaymentProvider.Notification> read = provider.readNotification(merchant, body);
        boolean previousKey = false;
        if (read.isEmpty()) {
            // REQ-SEC-09: right after a key change the provider may still sign with the old one.
            read = merchants.withPreviousKey(merchant, now()).flatMap(old -> provider.readNotification(old, body));
            previousKey = read.isPresent();
            if (previousKey) {
                log.warn("A notification for merchant {} was signed with the previous key", merchant.id());
            }
        }
        if (read.isEmpty()) {
            log.warn("Rejected a provider notification for merchant {}: signature or account does not match",
                    merchant.id());
            return new Answer(false, Map.of());
        }
        PaymentProvider.Notification n = read.get();
        String fingerprint = fingerprint(merchant.id() + "|" + n.reference() + "|" + n.status() + "|" + n.amountMinor()
                + "|" + n.currency() + "|" + n.token() + "|" + n.reasonCode());
        UUID eventId = UUID.randomUUID();
        int inserted = jdbc.sql("""
                        insert into payment_event (id, merchant_id, reference, status, fingerprint, payload, received_at)
                        values (:id, :merchant, :reference, :status, :fingerprint, cast(:payload as jsonb), :now)
                        on conflict (fingerprint) do nothing""")
                .param("id", eventId).param("merchant", merchant.id()).param("reference", n.reference())
                .param("status", n.status()).param("fingerprint", fingerprint)
                .param("payload", json.writeValueAsString(redacted(body))).param("now", now()).update();
        if (inserted == 1) {
            String outcome = apply(merchant, n) + (previousKey ? " (previous key)" : "");
            if (previousKey) {
                // Checked again with the provider under the current key: the old one is about to go.
                jdbc.sql("""
                                update payment_operation set next_check_at = :now
                                where reference = :reference and state in ('CREATED', 'SENDING', 'PENDING', 'UNKNOWN')""")
                        .param("now", now()).param("reference", n.reference()).update();
            }
            jdbc.sql("update payment_event set outcome = :outcome where id = :id")
                    .param("outcome", outcome).param("id", eventId).update();
        }
        return new Answer(true, provider.acknowledge(merchant, n.reference()));
    }

    /** A hold or charge of ours (by its own reference), a top-up, else a card binding. */
    private String apply(Merchant merchant, PaymentProvider.Notification n) {
        Optional<UUID> operation = jdbc.sql("""
                        select o.id from payment_operation o join payment_intent i on i.id = o.intent_id
                        where o.reference = :reference and i.merchant_id = :merchant and o.type in ('AUTH', 'CHARGE', 'TIP')""")
                .param("reference", n.reference()).param("merchant", merchant.id()).query(UUID.class).optional();
        if (operation.isPresent()) {
            payments.apply(operation.get(), n.outcome(), n.status(), n.reasonCode(), n.reason());
            return "OPERATION_" + n.outcome();
        }
        Optional<String> topUp = topUps.apply(merchant.id(), n.reference(), n.outcome(), n.amountMinor(),
                n.currency(), n.maskedPan(), n.reason());
        if (topUp.isPresent()) {
            return topUp.get();
        }
        record Pending(UUID id, UUID clientId, String state) {
        }
        Optional<Pending> binding = jdbc.sql("""
                        select id, client_id, state from card_binding
                        where reference = :reference and merchant_id = :merchant for update""")
                .param("reference", n.reference()).param("merchant", merchant.id())
                .query((rs, i) -> new Pending(rs.getObject(1, UUID.class), rs.getObject(2, UUID.class), rs.getString(3)))
                .optional();
        if (binding.isEmpty()) {
            return "UNKNOWN_REFERENCE";
        }
        if (!"PENDING".equals(binding.get().state())) {
            return "ALREADY_" + binding.get().state();
        }
        switch (n.outcome()) {
            case SUCCEEDED -> {
                if (n.token() == null || n.maskedPan() == null) {
                    return fail(binding.get().id(), "The provider sent no card token");
                }
                UUID cardId = jdbc.sql("""
                                select id from payment_card
                                where merchant_id = :merchant and token = :token and client_id = :client
                                  and state = 'ACTIVE'""")
                        .param("merchant", merchant.id()).param("token", n.token())
                        .param("client", binding.get().clientId()).query(UUID.class).optional()
                        .orElseGet(() -> {
                            UUID id = UUID.randomUUID();
                            jdbc.sql("""
                                            insert into payment_card (id, client_id, merchant_id, token, masked_pan,
                                                                      card_type, state, created_at)
                                            values (:id, :client, :merchant, :token, :pan, :type, 'ACTIVE', :now)""")
                                    .param("id", id).param("client", binding.get().clientId())
                                    .param("merchant", merchant.id()).param("token", n.token())
                                    .param("pan", n.maskedPan()).param("type", n.cardType()).param("now", now())
                                    .update();
                            return id;
                        });
                jdbc.sql("""
                                update card_binding set state = 'COMPLETED', card_id = :card, completed_at = :now
                                where id = :id""")
                        .param("card", cardId).param("now", now()).param("id", binding.get().id()).update();
                return "CARD_ADDED";
            }
            case DECLINED -> {
                return fail(binding.get().id(), n.reason() == null ? "Declined" : n.reason());
            }
            default -> {
                return "WAITING";
            }
        }
    }

    private String fail(UUID bindingId, String reason) {
        jdbc.sql("""
                        update card_binding set state = 'FAILED', failure_reason = :reason, completed_at = :now
                        where id = :id""")
                .param("reason", reason).param("now", now()).param("id", bindingId).update();
        return "BINDING_FAILED";
    }

    /** The token is a payment credential: the inbox keeps everything else (REQ-PAY-08). */
    private static Map<String, Object> redacted(Map<String, Object> body) {
        Map<String, Object> copy = new java.util.LinkedHashMap<>(body);
        if (copy.containsKey("recToken")) {
            copy.put("recToken", "***");
        }
        return copy;
    }

    private static String fingerprint(String value) {
        try {
            return HexFormat.of().formatHex(MessageDigest.getInstance("SHA-256")
                    .digest(value.getBytes(StandardCharsets.UTF_8)));
        } catch (java.security.NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }

    private OffsetDateTime now() {
        return clock.instant().atOffset(ZoneOffset.UTC);
    }
}
