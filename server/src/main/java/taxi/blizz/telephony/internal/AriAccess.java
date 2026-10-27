package taxi.blizz.telephony.internal;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Optional;
import taxi.blizz.configuration.Integrations;

/** The ARI address and credentials of the admin panel (Integrations, otp), read again at every use. */
final class AriAccess {

    private AriAccess() {
    }

    /** http(s)://host:port without a trailing slash, or empty when not configured. */
    static Optional<String> baseUrl(Integrations integrations) {
        return integrations.value(Integrations.OTP_ASTERISK_ARI_URL).map(url -> url.replaceAll("/+$", ""));
    }

    /** A Basic Authorization header value — the password never goes into an address. */
    static Optional<String> authorization(Integrations integrations) {
        String user = integrations.value(Integrations.OTP_ASTERISK_ARI_USER).orElse(null);
        String password = integrations.value(Integrations.OTP_ASTERISK_ARI_PASSWORD).orElse(null);
        if (user == null || password == null) {
            return Optional.empty();
        }
        return Optional.of("Basic " + Base64.getEncoder()
                .encodeToString((user + ":" + password).getBytes(StandardCharsets.UTF_8)));
    }
}
