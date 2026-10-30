package taxi.blizz.platform;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * A circuit breaker per outside provider (REQ-ENG-07, T-36). While a provider keeps failing, callers get their
 * documented degradation at once instead of waiting out a timeout each: a route estimate without the router, an
 * address from the built-in book, a code by call instead of SMS, a push left for later.
 *
 * <p>CLOSED until {@code failure-threshold} failures in a row; then OPEN for {@code open-for}, when no call is made;
 * then exactly one caller probes (HALF_OPEN) while the others are refused: a success closes it, a failure opens it
 * again. A failure is an exception (a timeout, a refused connection) or a result the caller marks as one (an HTTP
 * 5xx); a business "no" (no route, a wrong number) is not. Settings per provider: {@code blizz.providers.<name>.*}.
 * Never holds a database transaction or connection.
 */
public interface ProviderBreakers {

    enum Provider {
        GRAPHHOPPER, GEOCODING, TURBOSMS, FCM, WAYFORPAY, ASTERISK
    }

    enum State {
        CLOSED, HALF_OPEN, OPEN
    }

    @FunctionalInterface
    interface Action<T> {
        T run() throws Exception;
    }

    /**
     * Runs {@code action} unless the provider's breaker is open. A thrown exception goes to {@code onError} (and
     * counts as a failure, except an interruption); a result {@code failed} accepts counts as a failure but is still
     * returned. While open, or while the provider already has its {@code max-concurrent} callers (the bulkhead),
     * {@code whenOpen} answers at once and the provider is not called.
     */
    <T> T call(Provider provider, Action<T> action, Predicate<T> failed, Function<Exception, T> onError,
               Supplier<T> whenOpen);

    State state(Provider provider);

    /**
     * Whether a retry of an earlier failed call may go to the provider now (REQ-ENG-07): retries spend a budget that
     * the provider's calls refill, so they never pile onto a provider that is struggling. A caller refused here
     * tries later, as if the provider had not answered. A first attempt never asks.
     */
    boolean mayRetry(Provider provider);

    /** How long one call to the provider may take: {@code blizz.providers.<name>.timeout}. */
    java.time.Duration timeout(Provider provider);

    /** Real breakers with the same settings for every provider, for code built outside Spring (tests). */
    static ProviderBreakers of(int failureThreshold, java.time.Duration openFor, java.time.Clock clock) {
        return new taxi.blizz.platform.internal.InMemoryProviderBreakers(failureThreshold, openFor, clock);
    }

    /** Calls straight through: for code built outside Spring, e.g. tests of one provider client. */
    static ProviderBreakers none() {
        return new ProviderBreakers() {
            @Override
            public <T> T call(Provider provider, Action<T> action, Predicate<T> failed,
                              Function<Exception, T> onError, Supplier<T> whenOpen) {
                try {
                    return action.run();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return onError.apply(e);
                } catch (Exception e) {
                    return onError.apply(e);
                }
            }

            @Override
            public State state(Provider provider) {
                return State.CLOSED;
            }

            @Override
            public boolean mayRetry(Provider provider) {
                return true;
            }

            @Override
            public java.time.Duration timeout(Provider provider) {
                return java.time.Duration.ofSeconds(10);
            }
        };
    }
}
