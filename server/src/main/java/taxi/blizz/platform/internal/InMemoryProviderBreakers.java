package taxi.blizz.platform.internal;

import io.micrometer.core.instrument.FunctionCounter;
import io.micrometer.core.instrument.Gauge;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.binder.MeterBinder;
import java.time.Clock;
import java.time.Instant;
import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.LongAdder;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import taxi.blizz.platform.ProviderBreakers;

/**
 * One breaker per provider in this instance's memory: each instance learns of an outage by itself within a few calls,
 * which is enough, and nothing shared can fail with it. Own code rather than a library: the state machine is small,
 * and the owner of each call decides what a failure is (see {@link ProviderBreakers}).
 */
public class InMemoryProviderBreakers implements ProviderBreakers, MeterBinder {

    private static final Logger log = LoggerFactory.getLogger(InMemoryProviderBreakers.class);

    private final BreakerProperties properties;
    private final Clock clock;
    private final Map<Provider, Breaker> breakers = new EnumMap<>(Provider.class);
    private final Map<Provider, Semaphore> bulkheads = new EnumMap<>(Provider.class);
    private final Map<Provider, RetryBudget> budgets = new EnumMap<>(Provider.class);
    private final Map<Provider, LongAdder> fullBulkhead = new EnumMap<>(Provider.class);
    private final Map<Provider, LongAdder> spentBudget = new EnumMap<>(Provider.class);

    /** The same settings for every provider: for one provider client's tests (through {@link ProviderBreakers#of}). */
    public InMemoryProviderBreakers(int failureThreshold, java.time.Duration openFor, Clock clock) {
        this(new BreakerProperties(java.util.Arrays.stream(Provider.values()).collect(java.util.stream.Collectors.toMap(
                BreakerProperties::key, p -> new BreakerProperties.Settings(failureThreshold, openFor)))), clock);
    }

    InMemoryProviderBreakers(BreakerProperties properties, Clock clock) {
        this.properties = properties;
        this.clock = clock;
        for (Provider p : Provider.values()) {
            breakers.put(p, new Breaker(p));
            bulkheads.put(p, new Semaphore(properties.maxConcurrent(p)));
            budgets.put(p, new RetryBudget(properties.retryRatio(p), properties.retryBurst(p)));
            fullBulkhead.put(p, new LongAdder());
            spentBudget.put(p, new LongAdder());
        }
    }

    /** Retries earned by calls, {@code ratio} per call, saved up to {@code burst}; it starts full. */
    private static final class RetryBudget {
        final double ratio;
        final int burst;
        double tokens;

        RetryBudget(double ratio, int burst) {
            this.ratio = ratio;
            this.burst = burst;
            this.tokens = burst;
        }

        synchronized void earn() {
            tokens = Math.min(burst, tokens + ratio);
        }

        synchronized boolean spend() {
            if (tokens < 1) {
                return false;
            }
            tokens -= 1;
            return true;
        }
    }

    private final class Breaker {
        final Provider provider;
        State state = State.CLOSED;
        int failures;
        Instant openedAt;

        Breaker(Provider provider) {
            this.provider = provider;
        }

        /** Whether this caller may call the provider now; at most one probe at a time after OPEN. */
        synchronized boolean admit() {
            switch (state) {
                case CLOSED -> {
                    return true;
                }
                case OPEN -> {
                    if (clock.instant().isBefore(openedAt.plus(properties.openFor(provider)))) {
                        return false;
                    }
                    move(State.HALF_OPEN);
                    return true; // this caller is the probe
                }
                default -> {
                    return false; // a probe is under way
                }
            }
        }

        synchronized void success() {
            failures = 0;
            if (state != State.CLOSED) {
                move(State.CLOSED);
            }
        }

        synchronized void failure() {
            if (state == State.HALF_OPEN) {
                openedAt = clock.instant();
                move(State.OPEN);
                return;
            }
            failures++;
            if (state == State.CLOSED && failures >= properties.threshold(provider)) {
                failures = 0;
                openedAt = clock.instant();
                move(State.OPEN);
            }
        }

        /** A probe that ended without an answer either way (an interruption): let the next caller probe. */
        synchronized void abandoned() {
            if (state == State.HALF_OPEN) {
                openedAt = Instant.MIN.plusSeconds(1);
                move(State.OPEN);
            }
        }

        private void move(State next) {
            log.warn("Provider {} breaker {} -> {}", provider, state, next);
            state = next;
        }

        synchronized State state() {
            return state;
        }
    }

    @Override
    public <T> T call(Provider provider, Action<T> action, Predicate<T> failed, Function<Exception, T> onError,
                      Supplier<T> whenOpen) {
        // The bulkhead first: a caller turned away by it never becomes a breaker's probe.
        Semaphore bulkhead = bulkheads.get(provider);
        if (!bulkhead.tryAcquire()) {
            fullBulkhead.get(provider).increment();
            return whenOpen.get();
        }
        try {
            Breaker breaker = breakers.get(provider);
            if (!breaker.admit()) {
                return whenOpen.get();
            }
            budgets.get(provider).earn();
            T result;
            try {
                result = action.run();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                breaker.abandoned();
                return onError.apply(e);
            } catch (Exception e) {
                breaker.failure();
                return onError.apply(e);
            }
            if (failed.test(result)) {
                breaker.failure();
            } else {
                breaker.success();
            }
            return result;
        } finally {
            bulkhead.release();
        }
    }

    @Override
    public State state(Provider provider) {
        return breakers.get(provider).state();
    }

    @Override
    public boolean mayRetry(Provider provider) {
        if (budgets.get(provider).spend()) {
            return true;
        }
        spentBudget.get(provider).increment();
        return false;
    }

    @Override
    public java.time.Duration timeout(Provider provider) {
        return properties.timeout(provider);
    }

    @Override
    public void bindTo(MeterRegistry registry) {
        for (Provider p : Provider.values()) {
            Gauge.builder("blizz.provider.breaker.state", this, b -> b.state(p).ordinal())
                    .description("0 closed, 1 half-open, 2 open").tag("provider", BreakerProperties.key(p))
                    .register(registry);
            FunctionCounter.builder("blizz.provider.rejected", fullBulkhead.get(p), LongAdder::sum)
                    .description("Calls not made: the provider already had max-concurrent callers")
                    .tag("provider", BreakerProperties.key(p)).tag("reason", "bulkhead").register(registry);
            FunctionCounter.builder("blizz.provider.rejected", spentBudget.get(p), LongAdder::sum)
                    .description("Retries not made: the provider's retry budget was spent")
                    .tag("provider", BreakerProperties.key(p)).tag("reason", "retry_budget").register(registry);
        }
    }
}
