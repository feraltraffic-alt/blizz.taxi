package taxi.blizz.identity.internal;

import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.List;
import java.util.regex.Pattern;
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
 * @param allowedCountryCodes country calling codes whose numbers get codes (Poland, Ukraine); any other number is
 *                          refused, against expensive international routes (SMS pumping, IRSF, issue #101)
 * @param maxPerIpAndPhonePerHour codes per client IP and phone per hour, so rotating device refs does not help
 * @param maxCallsPerPhonePerHour codes by a call per phone per hour, riders and drivers together
 * @param hourlyAlarm       codes sent in an hour above which the SMS-pumping alert fires (exported as a gauge)
 * @param maxPerRangePerHour codes per hour to the numbers of one range, the country code and the first two national
 *                          digits (an operator's prefix such as +38067), below the global budget so invented numbers
 *                          of one prefix cannot use all of it (audit 29.10.2026)
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
        @DefaultValue("10") int maxPerDevicePerHour,
        // One value per code: a single "48,380" would bind as one element.
        @DefaultValue({"48", "380"}) List<String> allowedCountryCodes,
        @DefaultValue("5") int maxPerIpAndPhonePerHour,
        @DefaultValue("2") int maxCallsPerPhonePerHour,
        @DefaultValue("500") int hourlyAlarm,
        @DefaultValue("500") int maxPerRangePerHour) {

    private static final Pattern COUNTRY_CODE = Pattern.compile("^[1-9][0-9]{0,2}$");

    public OtpProperties {
        if (secret == null || secret.getBytes(StandardCharsets.UTF_8).length < 32) {
            throw new IllegalStateException("blizz.otp.secret must be set and at least 32 bytes long");
        }
        if (codeLength < 4 || codeLength > 8) {
            throw new IllegalStateException("blizz.otp.code-length must be between 4 and 8");
        }
        if (allowedCountryCodes == null || allowedCountryCodes.isEmpty()) {
            throw new IllegalStateException("blizz.otp.allowed-country-codes must list at least one country code");
        }
        allowedCountryCodes = allowedCountryCodes.stream().map(c -> c == null ? "" : c.strip()).toList();
        for (String code : allowedCountryCodes) {
            if (!COUNTRY_CODE.matcher(code).matches()) {
                throw new IllegalStateException("blizz.otp.allowed-country-codes must be country calling codes of "
                        + "1 to 3 digits without '+', e.g. 48,380; got '" + code + "'");
            }
        }
        if (maxCallsPerPhonePerHour < 0 || maxPerIpAndPhonePerHour < 1 || hourlyAlarm < 1) {
            throw new IllegalStateException("blizz.otp.max-calls-per-phone-per-hour must not be negative, "
                    + "blizz.otp.max-per-ip-and-phone-per-hour and blizz.otp.hourly-alarm must be positive");
        }
        if (maxPerRangePerHour < 1) {
            throw new IllegalStateException("blizz.otp.max-per-range-per-hour must be positive");
        }
    }

    /** National significant digits of the markets' numbers (Poland, Ukraine); other codes are not length-checked. */
    private static final java.util.Map<String, Integer> NATIONAL_DIGITS = java.util.Map.of("48", 9, "380", 9);

    /**
     * Whether {@code phone} has as many digits as a number of {@code country} has (audit 29.10.2026: invented
     * numbers of any length after +48/+380 ran up the code budget).
     */
    static boolean fullNumber(taxi.blizz.identity.PhoneNumber phone, String country) {
        Integer national = NATIONAL_DIGITS.get(country);
        return national == null || phone.e164().length() - 1 == country.length() + national;
    }

    /** National digits that, after the country code, make a number's range (an operator's prefix). */
    private static final int RANGE_DIGITS = 2;

    /** The range of a full number of {@code country}: e.g. +38067 for +380671234567. */
    static String rangeOf(taxi.blizz.identity.PhoneNumber phone, String country) {
        return phone.e164().substring(0, Math.min(phone.e164().length(), 1 + country.length() + RANGE_DIGITS));
    }

    /** The allowed country code {@code phone} belongs to, or empty: the longest code that prefixes its digits. */
    java.util.Optional<String> countryOf(taxi.blizz.identity.PhoneNumber phone) {
        String digits = phone.e164().substring(1);
        return allowedCountryCodes.stream().filter(digits::startsWith)
                .max(java.util.Comparator.comparingInt(String::length));
    }
}
