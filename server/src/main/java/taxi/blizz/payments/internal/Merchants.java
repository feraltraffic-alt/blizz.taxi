package taxi.blizz.payments.internal;

import java.util.Optional;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.configuration.Integrations;

/**
 * Merchants with their secret: the one entered in the admin panel, else the environment's by {@code secret_ref}. A
 * merchant without a secret is not usable.
 */
@Component
class Merchants {

    private static final String SELECT = "select id, provider, account, domain, secret_ref, currency from payment_merchant";

    private final JdbcClient jdbc;
    private final PaymentsProperties properties;
    private final Integrations integrations;

    Merchants(JdbcClient jdbc, PaymentsProperties properties, Integrations integrations) {
        this.jdbc = jdbc;
        this.properties = properties;
        this.integrations = integrations;
    }

    /** Where the panel keeps a merchant's secret. */
    static String secretName(UUID merchantId) {
        return "payments.merchant." + merchantId + ".secret";
    }

    /** Where the panel keeps the key a merchant had before the last change (REQ-SEC-09). */
    static String previousSecretName(UUID merchantId) {
        return "payments.merchant." + merchantId + ".previous-secret";
    }

    /**
     * The merchant as it was signed with its previous key, while that key is still accepted for notifications
     * (REQ-SEC-09); empty when there is none or its window has passed. Never used for requests to the provider.
     */
    Optional<Merchant> withPreviousKey(Merchant merchant, java.time.OffsetDateTime now) {
        boolean open = jdbc.sql("select previous_secret_until from payment_merchant where id = :id")
                .param("id", merchant.id()).query(java.time.OffsetDateTime.class).optional()
                .filter(until -> until != null && now.isBefore(until)).isPresent();
        if (!open) {
            return Optional.empty();
        }
        return integrations.value(previousSecretName(merchant.id())).filter(s -> !s.isBlank())
                .map(previous -> new Merchant(merchant.id(), merchant.provider(), merchant.account(),
                        merchant.domain(), previous, merchant.currency()));
    }

    /** PANEL, ENVIRONMENT or NONE. */
    String secretSource(UUID merchantId, String secretRef) {
        if (integrations.secretHint(secretName(merchantId)).isPresent()) {
            return "PANEL";
        }
        String env = properties.secrets().get(secretRef);
        return env == null || env.isBlank() ? "NONE" : "ENVIRONMENT";
    }

    private String secret(UUID merchantId, String secretRef) {
        try {
            Optional<String> panel = integrations.value(secretName(merchantId));
            if (panel.isPresent()) {
                return panel.get();
            }
        } catch (RuntimeException e) {
            // A stored secret that cannot be decrypted (no master key): the environment's, if any.
        }
        return properties.secrets().get(secretRef);
    }

    Optional<Merchant> forCity(UUID cityId) {
        return jdbc.sql(SELECT + " m join payment_merchant_city c on c.merchant_id = m.id where c.city_id = :city")
                .param("city", cityId).query((rs, i) -> Optional.ofNullable(merchant(rs))).optional()
                .flatMap(m -> m);
    }

    Optional<Merchant> byId(UUID merchantId) {
        return jdbc.sql(SELECT + " where id = :id").param("id", merchantId)
                .query((rs, i) -> Optional.ofNullable(merchant(rs))).optional().flatMap(m -> m);
    }

    Optional<Merchant> byAccount(String provider, String account) {
        return jdbc.sql(SELECT + " where provider = :provider and account = :account")
                .param("provider", provider).param("account", account)
                .query((rs, i) -> Optional.ofNullable(merchant(rs))).optional().flatMap(m -> m);
    }

    String secretOfAccount(String account) {
        record Ref(UUID id, String secretRef) {
        }
        return jdbc.sql("select id, secret_ref from payment_merchant where account = :account")
                .param("account", account)
                .query((rs, i) -> new Ref(rs.getObject(1, UUID.class), rs.getString(2))).optional()
                .map(ref -> secret(ref.id(), ref.secretRef())).orElse("");
    }

    private Merchant merchant(java.sql.ResultSet rs) throws java.sql.SQLException {
        String secret = secret(rs.getObject("id", UUID.class), rs.getString("secret_ref"));
        if (secret == null || secret.isBlank()) {
            return null;
        }
        return new Merchant(rs.getObject("id", UUID.class), rs.getString("provider"), rs.getString("account"),
                rs.getString("domain"), secret, rs.getString("currency"));
    }
}
