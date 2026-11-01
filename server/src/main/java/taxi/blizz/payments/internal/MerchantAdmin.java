package taxi.blizz.payments.internal;

import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Pattern;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.audit.AuditEntry;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.configuration.Integrations;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.identity.StaffSignIn;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;

/**
 * Payment merchants in the admin panel (REQ-ADM-10): the account, its secret key (write-only, stored encrypted) and
 * the cities it takes cards in. Every change asks for the password again and goes to the audit without the key.
 */
@Service
class MerchantAdmin {

    private static final Pattern ACCOUNT = Pattern.compile("^[A-Za-z0-9_.-]{1,100}$");
    private static final Pattern DOMAIN = Pattern.compile("^[A-Za-z0-9.-]{1,253}$");
    private static final Pattern CURRENCY = Pattern.compile("^[A-Z]{3}$");

    private final JdbcClient jdbc;
    private final Merchants merchants;
    private final Providers providers;
    private final PaymentsProperties properties;
    private final Integrations integrations;
    private final StaffAccess staff;
    private final StaffSignIn signIn;
    private final IdempotentCommands commands;
    private final AuditLog audit;
    private final Clock clock;

    MerchantAdmin(JdbcClient jdbc, Merchants merchants, Providers providers, PaymentsProperties properties,
                  Integrations integrations, StaffAccess staff, StaffSignIn signIn, IdempotentCommands commands,
                  AuditLog audit, Clock clock) {
        this.jdbc = jdbc;
        this.merchants = merchants;
        this.providers = providers;
        this.properties = properties;
        this.integrations = integrations;
        this.staff = staff;
        this.signIn = signIn;
        this.commands = commands;
        this.audit = audit;
        this.clock = clock;
    }

    /** {@code secretSource}: PANEL, ENVIRONMENT or NONE (not usable). */
    record MerchantView(UUID id, String provider, String account, String domain, String currency,
                        List<UUID> cityIds, String secretSource, String secretHint, OffsetDateTime createdAt) {
    }

    record NewMerchant(String provider, String account, String domain, String currency, String secret,
                       List<UUID> cityIds) {

        @Override
        public String toString() {
            return "NewMerchant[" + provider + ", " + account + "]";
        }
    }

    /** Null fields stay as they are. */
    record MerchantChange(String domain, String secret, List<UUID> cityIds) {

        @Override
        public String toString() {
            return "MerchantChange[domain=" + domain + ", secret=" + (secret == null ? "unchanged" : "new") + "]";
        }
    }

    /** What the idempotency receipt keeps: never the secret in the clear. */
    record Request(UUID merchantId, String provider, String account, String domain, String currency,
                   String secretFingerprint, List<UUID> cityIds, String reason) {
    }

    @Transactional(readOnly = true)
    List<MerchantView> list(Actor actor) {
        staff.require(actor, Integrations.MANAGE_PERMISSION);
        return jdbc.sql("select id from payment_merchant order by created_at").query(UUID.class).list().stream()
                .map(this::view).toList();
    }

    MerchantView create(Actor actor, UUID commandId, String password, NewMerchant body, String reason) {
        // A merchant serves several cities with the service's keys: staff of every city (owner decision 01.11.2026).
        staff.requireEveryCity(actor, Integrations.MANAGE_PERMISSION);
        String provider = body.provider() == null ? "" : body.provider().toUpperCase(Locale.ROOT);
        if (!provider.equals("WAYFORPAY") && !(provider.equals("FAKE") && properties.fakeMerchantsAllowed())) {
            throw invalid("provider must be WAYFORPAY");
        }
        String account = require(body.account(), ACCOUNT, "account");
        String domain = require(body.domain(), DOMAIN, "domain");
        String currency = require(body.currency(), CURRENCY, "currency (three capital letters)");
        String secret = secret(body.secret(), true);
        List<UUID> cities = cities(body.cityIds());
        String why = reason(reason);
        signIn.confirmPassword(actor, password);
        return commands.execute(new CommandKey(actor, "payments.merchant.create", commandId),
                new Request(null, provider, account, domain, currency, fingerprint(secret), cities, why),
                MerchantView.class, () -> {
                    int taken = jdbc.sql("select count(*) from payment_merchant where provider = :p and account = :a")
                            .param("p", provider).param("a", account).query(Integer.class).single();
                    if (taken > 0) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT, "This account is already added");
                    }
                    UUID id = UUID.randomUUID();
                    jdbc.sql("""
                                    insert into payment_merchant (id, provider, account, domain, secret_ref, currency,
                                                                  created_at)
                                    values (:id, :provider, :account, :domain, 'panel', :currency, :now)""")
                            .param("id", id).param("provider", provider).param("account", account)
                            .param("domain", domain).param("currency", currency).param("now", now()).update();
                    integrations.putSecret(actor, Merchants.secretName(id), secret);
                    assignCities(id, cities);
                    MerchantView view = view(id);
                    audit.record(new AuditEntry(actor, "payments.merchant.create", "payment_merchant",
                            id.toString(), why, null, auditable(view)));
                    return view;
                });
    }

    MerchantView change(Actor actor, UUID commandId, String password, UUID merchantId, MerchantChange body,
                        String reason) {
        staff.requireEveryCity(actor, Integrations.MANAGE_PERMISSION);
        String domain = body.domain() == null ? null : require(body.domain(), DOMAIN, "domain");
        String secret = secret(body.secret(), false);
        List<UUID> cities = body.cityIds() == null ? null : cities(body.cityIds());
        if (domain == null && secret == null && cities == null) {
            throw invalid("Nothing to change");
        }
        String why = reason(reason);
        signIn.confirmPassword(actor, password);
        return commands.execute(new CommandKey(actor, "payments.merchant.change", commandId),
                new Request(merchantId, null, null, domain, null, fingerprint(secret), cities, why),
                MerchantView.class, () -> {
                    boolean found = jdbc.sql("select id from payment_merchant where id = :id for update")
                            .param("id", merchantId).query(UUID.class).optional().isPresent();
                    if (!found) {
                        throw new DomainException(ErrorCode.NOT_FOUND, "Merchant not found");
                    }
                    MerchantView before = view(merchantId);
                    if (domain != null) {
                        jdbc.sql("update payment_merchant set domain = :d where id = :id").param("d", domain)
                                .param("id", merchantId).update();
                    }
                    if (secret != null) {
                        // REQ-SEC-09: the provider may still sign notifications of payments under way with the old
                        // key for a while; it is kept, encrypted, and accepted until previous_secret_until.
                        merchants.byId(merchantId).map(Merchant::secret).filter(old -> !old.equals(secret))
                                .ifPresent(old -> {
                                    integrations.putSecret(actor, Merchants.previousSecretName(merchantId), old);
                                    jdbc.sql("""
                                                    update payment_merchant set previous_secret_until = :until
                                                    where id = :id""")
                                            .param("until", OffsetDateTime.now(clock).plus(properties.previousKeyWindow()))
                                            .param("id", merchantId).update();
                                });
                        integrations.putSecret(actor, Merchants.secretName(merchantId), secret);
                    }
                    if (cities != null) {
                        jdbc.sql("delete from payment_merchant_city where merchant_id = :id").param("id", merchantId)
                                .update();
                        assignCities(merchantId, cities);
                    }
                    MerchantView after = view(merchantId);
                    audit.record(new AuditEntry(actor, "payments.merchant.change", "payment_merchant",
                            merchantId.toString(), why, auditable(before), auditable(after)));
                    return after;
                });
    }

    /**
     * Asks the provider about an order that does not exist: an answer about the order means the account and the key
     * are accepted; a complaint about the signature or the merchant means they are not. Nothing is charged.
     */
    Integrations.Check check(Actor actor, UUID merchantId) {
        staff.requireEveryCity(actor, Integrations.MANAGE_PERMISSION);
        String group = "payments";
        Merchant merchant = merchants.byId(merchantId).orElse(null);
        if (merchant == null) {
            return new Integrations.Check(group, false, "The merchant has no secret key (or does not exist)");
        }
        PaymentProvider.Result result;
        try {
            result = providers.of(merchant).checkStatus(merchant, "check-" + UUID.randomUUID());
        } catch (RuntimeException e) {
            return new Integrations.Check(group, false, "No answer: " + e.getClass().getSimpleName());
        }
        String answer = (result.reason() == null ? "" : result.reason())
                + (result.reasonCode() == null ? "" : " (" + result.reasonCode() + ")");
        if (result.outcome() == PaymentProvider.Outcome.UNKNOWN && result.reasonCode() == null) {
            return new Integrations.Check(group, false, "No answer from " + merchant.provider() + ": " + answer);
        }
        String lower = answer.toLowerCase(Locale.ROOT);
        boolean refused = lower.contains("signature") || lower.contains("merchant");
        return new Integrations.Check(group, !refused, merchant.provider() + " answered: " + answer.strip());
    }

    private void assignCities(UUID merchantId, List<UUID> cities) {
        for (UUID city : cities) {
            // One merchant per city: a city moves to this merchant.
            jdbc.sql("""
                            insert into payment_merchant_city (city_id, merchant_id) values (:city, :merchant)
                            on conflict (city_id) do update set merchant_id = excluded.merchant_id""")
                    .param("city", city).param("merchant", merchantId).update();
        }
    }

    private MerchantView view(UUID id) {
        record Row(String provider, String account, String domain, String currency, String secretRef,
                   OffsetDateTime createdAt) {
        }
        Row row = jdbc.sql("""
                        select provider, account, domain, currency, secret_ref, created_at from payment_merchant
                        where id = :id""")
                .param("id", id)
                .query((rs, i) -> new Row(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getObject(6, OffsetDateTime.class)))
                .single();
        List<UUID> cities = jdbc.sql("select city_id from payment_merchant_city where merchant_id = :id order by city_id")
                .param("id", id).query(UUID.class).list();
        String source = merchants.secretSource(id, row.secretRef());
        return new MerchantView(id, row.provider(), row.account(), row.domain(), row.currency(), cities, source,
                "PANEL".equals(source) ? integrations.secretHint(Merchants.secretName(id)).orElse(null) : null,
                row.createdAt());
    }

    private static Map<String, Object> auditable(MerchantView view) {
        Map<String, Object> m = new LinkedHashMap<>();
        m.put("provider", view.provider());
        m.put("account", view.account());
        m.put("domain", view.domain());
        m.put("currency", view.currency());
        m.put("city_ids", view.cityIds());
        m.put("secret_source", view.secretSource());
        m.put("secret_hint", view.secretHint());
        return m;
    }

    private static String secret(String raw, boolean required) {
        if (raw == null || raw.isBlank()) {
            if (required) {
                throw invalid("The secret key is required");
            }
            return null;
        }
        String secret = raw.strip();
        if (secret.length() > 512 || secret.chars().anyMatch(Character::isWhitespace)) {
            throw invalid("The secret key is one word of at most 512 characters");
        }
        return secret;
    }

    private static List<UUID> cities(List<UUID> raw) {
        if (raw == null) {
            return List.of();
        }
        Set<UUID> unique = new LinkedHashSet<>();
        for (UUID city : raw) {
            if (city == null) {
                throw invalid("city_ids must not contain null");
            }
            unique.add(city);
        }
        List<UUID> sorted = new ArrayList<>(unique);
        sorted.sort(null);
        return List.copyOf(sorted);
    }

    private static String require(String raw, Pattern pattern, String what) {
        String value = raw == null ? "" : raw.strip();
        if (!pattern.matcher(value).matches()) {
            throw invalid(what + " is not valid");
        }
        return value;
    }

    private static String reason(String reason) {
        if (reason == null || reason.isBlank()) {
            throw invalid("A reason is required");
        }
        return reason.strip();
    }

    private static String fingerprint(String secret) {
        if (secret == null) {
            return null;
        }
        try {
            byte[] digest = java.security.MessageDigest.getInstance("SHA-256")
                    .digest(secret.getBytes(java.nio.charset.StandardCharsets.UTF_8));
            return java.util.HexFormat.of().formatHex(digest);
        } catch (java.security.NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }

    private static DomainException invalid(String message) {
        return new DomainException(ErrorCode.VALIDATION_FAILED, message);
    }

    private OffsetDateTime now() {
        return OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
    }
}
