package taxi.blizz.platform;

/**
 * Domain error codes with their usual HTTP status (section 22.4). Must stay identical to the
 * {@code ErrorCode} enum in packages/contracts/openapi/common.yaml; a test enforces this.
 */
public enum ErrorCode {
    VALIDATION_FAILED(400),
    QUOTE_EXPIRED(409),
    QUOTE_MISMATCH(409),
    ORDER_ALREADY_ACTIVE(409),
    OFFER_EXPIRED(409),
    OFFER_REVOKED(409),
    ORDER_ALREADY_ASSIGNED(409),
    DRIVER_BUSY(409),
    DRIVER_NOT_ELIGIBLE(409),
    STATE_CONFLICT(409),
    VERSION_CONFLICT(409),
    IDEMPOTENCY_CONFLICT(409),
    PAYMENT_PENDING(202),
    PAYMENT_UNKNOWN(202),
    PAYMENT_DECLINED(422),
    OUTSIDE_SERVICE_AREA(422),
    LOCATION_NOT_FRESH(422),
    RATE_LIMITED(429),
    ACCESS_DENIED(403),
    NOT_FOUND(404),
    PROVIDER_UNAVAILABLE(503),
    /** Wrong, expired, used or exhausted one-time code; deliberately not more specific. */
    OTP_INVALID(422),
    INTERNAL_ERROR(500);

    private final int httpStatus;

    ErrorCode(int httpStatus) {
        this.httpStatus = httpStatus;
    }

    public int httpStatus() {
        return httpStatus;
    }
}
