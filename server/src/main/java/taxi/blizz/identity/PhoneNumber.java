package taxi.blizz.identity;

import java.util.regex.Pattern;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;

/**
 * Phone number normalized to E.164 (REQ-AUTH-03). Accepts international input only ("+" or "00"
 * prefix); separators are ignored. Country-specific validation is a later step (a numbering
 * library), so this checks the E.164 shape, not that the number exists.
 */
public record PhoneNumber(String e164) {

    private static final Pattern E164 = Pattern.compile("^\\+[1-9]\\d{7,14}$");
    private static final Pattern SEPARATORS = Pattern.compile("[\\s\\-().]");

    public PhoneNumber {
        if (e164 == null || !E164.matcher(e164).matches()) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "Phone number must be in international format");
        }
    }

    public static PhoneNumber parse(String raw) {
        if (raw == null) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "Phone number is required");
        }
        String value = SEPARATORS.matcher(raw.strip()).replaceAll("");
        if (value.startsWith("00")) {
            value = "+" + value.substring(2);
        }
        return new PhoneNumber(value);
    }

    /** For logs and support screens: keeps the country code and the last two digits. */
    public String masked() {
        return e164.substring(0, Math.min(4, e164.length())) + "*****" + e164.substring(e164.length() - 2);
    }

    @Override
    public String toString() {
        return masked();
    }
}
