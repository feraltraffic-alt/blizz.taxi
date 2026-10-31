package taxi.blizz.identity.internal;

import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.HexFormat;
import java.util.regex.Pattern;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.identity.ClientLookup;
import taxi.blizz.identity.PhoneNumber;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;

/**
 * See {@link ClientLookup}. The phone is taken exactly as sent: no separators stripped and no "00" turned into "+",
 * so only a full number written as E.164 can match. Its digest is keyed with the server secret, separated from the
 * one-time codes' use of it, so the audit cannot be reversed by hashing every number.
 */
@Service
class JdbcClientLookup implements ClientLookup {

    private static final Pattern E164 = Pattern.compile("^\\+[1-9][0-9]{7,14}$");

    private final JdbcClient jdbc;
    private final OtpProperties phones;
    private final SecretKeySpec key;

    JdbcClientLookup(JdbcClient jdbc, OtpProperties phones) {
        this.jdbc = jdbc;
        this.phones = phones;
        this.key = new SecretKeySpec(("customer-lookup|" + phones.secret()).getBytes(StandardCharsets.UTF_8),
                "HmacSHA256");
    }

    @Override
    @Transactional(readOnly = true)
    public Lookup byPhone(String phone) {
        if (phone == null || !E164.matcher(phone).matches()) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "The phone must be a full number in E.164");
        }
        PhoneNumber number = new PhoneNumber(phone);
        String country = phones.countryOf(number).orElseThrow(() -> new DomainException(
                ErrorCode.VALIDATION_FAILED, "The phone is not of a served country"));
        if (!OtpProperties.fullNumber(number, country)) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "Not a full phone number of this country");
        }
        Client client = jdbc.sql("""
                        select id, name, account_state from client
                        where phone_normalized = :phone and account_state not in ('ANONYMIZED', 'DELETION_PENDING')""")
                .param("phone", number.e164())
                .query((rs, i) -> new Client(rs.getObject(1, java.util.UUID.class), rs.getString(2), rs.getString(3)))
                .optional().orElse(null);
        return new Lookup(digest(number.e164()), client);
    }

    private String digest(String phone) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(key);
            return HexFormat.of().formatHex(mac.doFinal(phone.getBytes(StandardCharsets.UTF_8)));
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            throw new IllegalStateException("HMAC-SHA256 is not available", e);
        }
    }
}
