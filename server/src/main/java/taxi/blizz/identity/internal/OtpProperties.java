package taxi.blizz.identity.internal;

import java.nio.charset.StandardCharsets;
import java.time.Duration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

/**
 * One-time code settings (section 30: otp.ttl / max_attempts / resend_after).
 *
 * @param secret            server secret for HMAC of codes; at least 32 bytes, different per instance and environment
 * @param ttl               code lifetime
 * @param maxAttempts       wrong attempts allowed per challenge
 * @param resendAfter       minimum delay between codes for the same phone and audience
 * @param codeLength        digits in a code
 * @param maxPerPhonePerHour codes per phone and audience per hour
 * @param maxGlobalPerHour  overall sending budget per hour for the instance (SMS pumping protection)
 * @param maxPerIpPerHour   codes per client IP per hour; generous because a fleet may share one NAT address
 * @param maxPerDevicePerHour codes per app installation per hour
 */
@ConfigurationProperties("blizz.otp")
public record OtpProperties(
        String secret,
        @DefaultValue("PT5M") Duration ttl,
        @DefaultValue("5") int maxAttempts,
        @DefaultValue("PT60S") Duration resendAfter,
        @DefaultValue("6") int codeLength,
        @DefaultValue("5") int maxPerPhonePerHour,
        @DefaultValue("2000") int maxGlobalPerHour,
        @DefaultValue("30") int maxPerIpPerHour,
        @DefaultValue("10") int maxPerDevicePerHour) {

    public OtpProperties {
        if (secret == null || secret.getBytes(StandardCharsets.UTF_8).length < 32) {
            throw new IllegalStateException("blizz.otp.secret must be set and at least 32 bytes long");
        }
        if (codeLength < 4 || codeLength > 8) {
            throw new IllegalStateException("blizz.otp.code-length must be between 4 and 8");
        }
    }
}
