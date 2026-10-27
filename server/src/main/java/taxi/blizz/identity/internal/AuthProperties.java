package taxi.blizz.identity.internal;

import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.UUID;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

/**
 * Session settings (section 30: access.ttl).
 *
 * @param instanceId         immutable id of this installation (REQ-TEN-02), the token issuer
 * @param accessTokenSecret  HMAC key for access tokens; at least 32 bytes, unique per instance and environment
 * @param accessTtl          access token lifetime, at most 15 minutes (REQ-AUTH-06)
 * @param refreshTtl         lifetime of one refresh token
 * @param maxSessionAge      a session ends after this time even if it keeps refreshing
 * @param staffSessionAge    the same for staff sessions (admin panel, operator workstation)
 */
@ConfigurationProperties("blizz.auth")
public record AuthProperties(
        UUID instanceId,
        String accessTokenSecret,
        @DefaultValue("PT15M") Duration accessTtl,
        @DefaultValue("P30D") Duration refreshTtl,
        @DefaultValue("P180D") Duration maxSessionAge,
        @DefaultValue("PT12H") Duration staffSessionAge) {

    public AuthProperties {
        if (instanceId == null) {
            throw new IllegalStateException("blizz.auth.instance-id must be set");
        }
        if (accessTokenSecret == null || accessTokenSecret.getBytes(StandardCharsets.UTF_8).length < 32) {
            throw new IllegalStateException("blizz.auth.access-token-secret must be set and at least 32 bytes long");
        }
        if (accessTtl.compareTo(Duration.ofMinutes(15)) > 0) {
            throw new IllegalStateException("blizz.auth.access-ttl must not exceed 15 minutes");
        }
    }
}
