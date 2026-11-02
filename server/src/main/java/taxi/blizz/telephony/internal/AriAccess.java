package taxi.blizz.telephony.internal;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Optional;
import java.util.UUID;
import taxi.blizz.configuration.Integrations;

/**
 * A taxi service's ARI address and credentials (ADR 0016, owner decision 02.11.2026: each service its own exchange),
 * read again at every use.
 */
final class AriAccess {

    private AriAccess() {
    }

    /** http(s)://host:port without a trailing slash, or empty when not configured. */
    static Optional<String> baseUrl(Integrations integrations, UUID serviceId) {
        return integrations.value(serviceId, Integrations.OTP_ASTERISK_ARI_URL).map(url -> url.replaceAll("/+$", ""));
    }

    /** A Basic Authorization header value — the password never goes into an address. */
    static Optional<String> authorization(Integrations integrations, UUID serviceId) {
        String user = integrations.value(serviceId, Integrations.OTP_ASTERISK_ARI_USER).orElse(null);
        String password = integrations.value(serviceId, Integrations.OTP_ASTERISK_ARI_PASSWORD).orElse(null);
        if (user == null || password == null) {
            return Optional.empty();
        }
        return Optional.of("Basic " + Base64.getEncoder()
                .encodeToString((user + ":" + password).getBytes(StandardCharsets.UTF_8)));
    }
}
