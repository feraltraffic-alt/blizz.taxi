package taxi.blizz.payments.internal;

import java.util.Optional;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

/** Merchants with their secret from the environment; a merchant without a secret is not usable. */
@Component
class Merchants {

    private static final String SELECT = "select id, provider, account, domain, secret_ref, currency from payment_merchant";

    private final JdbcClient jdbc;
    private final PaymentsProperties properties;

    Merchants(JdbcClient jdbc, PaymentsProperties properties) {
        this.jdbc = jdbc;
        this.properties = properties;
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
        return jdbc.sql("select secret_ref from payment_merchant where account = :account").param("account", account)
                .query(String.class).optional().map(ref -> properties.secrets().get(ref)).orElse("");
    }

    private Merchant merchant(java.sql.ResultSet rs) throws java.sql.SQLException {
        String secret = properties.secrets().get(rs.getString("secret_ref"));
        if (secret == null || secret.isBlank()) {
            return null;
        }
        return new Merchant(rs.getObject("id", UUID.class), rs.getString("provider"), rs.getString("account"),
                rs.getString("domain"), secret, rs.getString("currency"));
    }
}
