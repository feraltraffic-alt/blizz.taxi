package taxi.blizz.platform;

/**
 * Budgets per rider or driver for actions a bot or a broken app could repeat without end (REQ-SEC-03): quotes,
 * orders, accepting offers, uploads, claiming and listing the ALL tab. Counted per account, never per IP address, so one NAT never blocks a fleet;
 * staff are not limited here (an operator places many phone orders). Each bucket's budget is
 * {@code blizz.rate-limits.buckets.<bucket>.max} actions per {@code .window}; over it, {@code RATE_LIMITED} with Retry-After.
 */
public interface RateLimits {

    String QUOTE = "quote";
    String ORDER = "order";
    String OFFER_ACCEPT = "offer-accept";
    String FILE_UPLOAD = "file-upload";
    /** Claims of orders in the ALL tab (issue #102, B1). */
    String BROADCAST_CLAIM = "broadcast-claim";
    /** Reads of the ALL tab: the app polls it (issue #102, B1). */
    String BROADCAST_LIST = "broadcast-list";

    /** Counts one action of the subject in the bucket, or throws {@link RateLimitedException} when over budget. */
    void acquire(String bucket, Actor subject);
}
