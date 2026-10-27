package taxi.blizz.platform;

/**
 * Domain error codes with their usual HTTP status (section 22.4). Must stay identical to the
 * {@code ErrorCode} enum in packages/contracts/openapi/common.yaml; a test enforces this.
 */
public enum ErrorCode {
    VALIDATION_FAILED(400),
    QUOTE_EXPIRED(409),
    QUOTE_MISMATCH(409),
    /** No longer returned: a rider may hold several orders (ADR 0012); kept in the contract for old clients. */
    ORDER_ALREADY_ACTIVE(409),
    /** The payer already has active_orders_per_payer orders not in a final state (ADR 0012 Q-03, issue #57). */
    ACTIVE_ORDER_LIMIT(409),
    OFFER_EXPIRED(409),
    OFFER_REVOKED(409),
    ORDER_ALREADY_ASSIGNED(409),
    DRIVER_BUSY(409),
    DRIVER_NOT_ELIGIBLE(409),
    STATE_CONFLICT(409),
    VERSION_CONFLICT(409),
    IDEMPOTENCY_CONFLICT(409),
    /**
     * As an error: the action conflicts with a payment that is still in progress. A command whose
     * own payment is pending returns 202 with an AcceptedOperation instead (section 22.4, 22.1).
     */
    PAYMENT_PENDING(409),
    /** As an error: the action conflicts with a payment whose outcome is not yet known; never pay again. */
    PAYMENT_UNKNOWN(409),
    PAYMENT_DECLINED(422),
    /** Fewer bonuses on the rider's account than asked for (ADR 0009). */
    WALLET_INSUFFICIENT(422),
    OUTSIDE_SERVICE_AREA(422),
    LOCATION_NOT_FRESH(422),
    /** Arrival reported far from the pickup point; can be confirmed with an exception reason (REQ-ASG-06). */
    PICKUP_TOO_FAR(422),
    RATE_LIMITED(429),
    /** Missing, expired, revoked or reused credentials. */
    UNAUTHENTICATED(401),
    ACCESS_DENIED(403),
    /** A new order for a rider whose account is not ACTIVE, e.g. with a pending deletion request (issue #56). */
    ACCOUNT_NOT_ACTIVE(403),
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
