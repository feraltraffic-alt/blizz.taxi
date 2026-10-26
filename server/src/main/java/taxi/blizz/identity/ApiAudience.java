package taxi.blizz.identity;

import taxi.blizz.platform.SubjectType;

/**
 * API audience a token is issued for ({@code /api/{audience}/v1}, REQ-API-02). A token of one
 * audience is rejected by the others (REQ-USR-08).
 */
public enum ApiAudience {
    RIDER("rider"),
    DRIVER("driver"),
    OPERATOR("operator"),
    ADMIN("admin");

    private final String value;

    ApiAudience(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    public static ApiAudience fromValue(String value) {
        for (ApiAudience audience : values()) {
            if (audience.value.equals(value)) {
                return audience;
            }
        }
        throw new IllegalArgumentException("Unknown audience: " + value);
    }

    /** Audience of a phone sign-in; staff audiences come from staff sign-in instead. */
    public static ApiAudience forPhoneSignIn(SubjectType type) {
        return switch (type) {
            case CLIENT -> RIDER;
            case DRIVER -> DRIVER;
            default -> throw new IllegalArgumentException("No phone sign-in for " + type);
        };
    }
}
