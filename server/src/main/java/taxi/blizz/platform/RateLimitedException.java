package taxi.blizz.platform;

import java.time.Duration;

/** A rate limit or sending budget was exceeded; carries when a retry makes sense (REQ-API-08). */
public class RateLimitedException extends DomainException {

    private final Duration retryAfter;

    public RateLimitedException(String message, Duration retryAfter) {
        super(ErrorCode.RATE_LIMITED, message);
        this.retryAfter = retryAfter.isNegative() ? Duration.ZERO : retryAfter;
    }

    public Duration retryAfter() {
        return retryAfter;
    }
}
