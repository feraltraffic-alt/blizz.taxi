package taxi.blizz.platform.internal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import io.micrometer.core.instrument.simple.SimpleMeterRegistry;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.junit.jupiter.api.Test;
import taxi.blizz.platform.ProviderBreakers.Provider;
import taxi.blizz.platform.ProviderBreakers.State;

/** Circuit breakers of the outside providers (REQ-ENG-07, T-36, issue #98): every kind of error E1–E6. */
class ProviderBreakersTests {

    /** A clock the test moves by hand. */
    static final class Hand extends Clock {
        Instant now = Instant.parse("2026-10-29T10:00:00Z");

        @Override
        public ZoneOffset getZone() {
            return ZoneOffset.UTC;
        }

        @Override
        public Clock withZone(java.time.ZoneId zone) {
            return this;
        }

        @Override
        public Instant instant() {
            return now;
        }
    }

    final Hand clock = new Hand();
    final InMemoryProviderBreakers breakers = new InMemoryProviderBreakers(new BreakerProperties(Map.of(
            "turbosms", new BreakerProperties.Settings(3, Duration.ofSeconds(30)))), clock);
    final AtomicInteger calls = new AtomicInteger();

    private String fail(Provider provider, Exception error) {
        return breakers.call(provider, () -> {
            calls.incrementAndGet();
            throw error;
        }, r -> false, e -> "error", () -> "open");
    }

    private String answer(Provider provider, String result, boolean failure) {
        return breakers.call(provider, () -> {
            calls.incrementAndGet();
            return result;
        }, r -> failure, e -> "error", () -> "open");
    }

    /** E1: timeouts in a row open it; then the provider is not called at all. E2: refused connections count too. */
    @Test
    void failuresInARowOpenTheBreakerAndThenNoCallIsMade() {
        assertThat(fail(Provider.TURBOSMS, new SocketTimeoutException())).isEqualTo("error");
        assertThat(fail(Provider.TURBOSMS, new java.net.ConnectException("refused"))).isEqualTo("error");
        assertThat(breakers.state(Provider.TURBOSMS)).isEqualTo(State.CLOSED);
        assertThat(answer(Provider.TURBOSMS, "HTTP 503", true)).as("a 5xx the caller marks").isEqualTo("HTTP 503");
        assertThat(breakers.state(Provider.TURBOSMS)).isEqualTo(State.OPEN);

        int before = calls.get();
        for (int i = 0; i < 10; i++) {
            assertThat(answer(Provider.TURBOSMS, "sent", false)).isEqualTo("open");
        }
        assertThat(calls.get()).as("no call while open").isEqualTo(before);
        assertThat(breakers.state(Provider.GRAPHHOPPER)).as("one provider's outage is its own")
                .isEqualTo(State.CLOSED);
    }

    /** E3: a business "no" (no route, a wrong number) never opens it. A success resets the count. */
    @Test
    void businessAnswersAndSuccessesKeepItClosed() {
        for (int i = 0; i < 20; i++) {
            assertThat(answer(Provider.TURBOSMS, "wrong number", false)).isEqualTo("wrong number");
        }
        fail(Provider.TURBOSMS, new IOException());
        fail(Provider.TURBOSMS, new IOException());
        answer(Provider.TURBOSMS, "sent", false);
        fail(Provider.TURBOSMS, new IOException());
        fail(Provider.TURBOSMS, new IOException());
        assertThat(breakers.state(Provider.TURBOSMS)).as("not three in a row").isEqualTo(State.CLOSED);
    }

    /** E5: after open-for one probe; its failure opens it for a full period again, its success closes it. */
    @Test
    void theProbeDecides() {
        for (int i = 0; i < 3; i++) {
            fail(Provider.TURBOSMS, new IOException());
        }
        clock.now = clock.now.plusSeconds(29);
        assertThat(answer(Provider.TURBOSMS, "sent", false)).as("still open").isEqualTo("open");
        clock.now = clock.now.plusSeconds(1);
        assertThat(fail(Provider.TURBOSMS, new IOException())).as("the probe ran and failed").isEqualTo("error");
        assertThat(breakers.state(Provider.TURBOSMS)).isEqualTo(State.OPEN);
        clock.now = clock.now.plusSeconds(29);
        assertThat(answer(Provider.TURBOSMS, "sent", false)).as("a full period again").isEqualTo("open");
        clock.now = clock.now.plusSeconds(1);
        assertThat(answer(Provider.TURBOSMS, "sent", false)).isEqualTo("sent");
        assertThat(breakers.state(Provider.TURBOSMS)).isEqualTo(State.CLOSED);
        fail(Provider.TURBOSMS, new IOException());
        fail(Provider.TURBOSMS, new IOException());
        assertThat(breakers.state(Provider.TURBOSMS)).as("the count started again").isEqualTo(State.CLOSED);
    }

    /** E4: after open-for, ten callers at once: exactly one reaches the provider, the others get the degradation. */
    @Test
    void exactlyOneCallerProbes() throws Exception {
        for (int i = 0; i < 3; i++) {
            fail(Provider.TURBOSMS, new IOException());
        }
        clock.now = clock.now.plusSeconds(31);
        CountDownLatch start = new CountDownLatch(1);
        CountDownLatch others = new CountDownLatch(9);
        AtomicInteger probes = new AtomicInteger();
        var pool = Executors.newFixedThreadPool(10);
        try {
            List<Future<String>> results = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                results.add(pool.submit(() -> {
                    start.await();
                    String r = breakers.call(Provider.TURBOSMS, () -> {
                        probes.incrementAndGet();
                        others.await(5, TimeUnit.SECONDS); // the probe is slow: everybody else asks meanwhile
                        return "sent";
                    }, x -> false, e -> "error", () -> "open");
                    if ("open".equals(r)) {
                        others.countDown();
                    }
                    return r;
                }));
            }
            start.countDown();
            List<String> answers = new ArrayList<>();
            for (Future<String> f : results) {
                answers.add(f.get(10, TimeUnit.SECONDS));
            }
            assertThat(probes.get()).isEqualTo(1);
            assertThat(answers).filteredOn("sent"::equals).hasSize(1);
            assertThat(answers).filteredOn("open"::equals).hasSize(9);
            assertThat(breakers.state(Provider.TURBOSMS)).isEqualTo(State.CLOSED);
        } finally {
            pool.shutdownNow();
        }
    }

    /** E6: a misspelt provider in the settings stops the start, naming it; nonsense values too. */
    @Test
    void unknownProvidersAndBadValuesStopTheStart() {
        assertThatThrownBy(() -> new BreakerProperties(Map.of("turbo-sms", new BreakerProperties.Settings(3, null))))
                .isInstanceOf(IllegalStateException.class).hasMessageContaining("turbo-sms").hasMessageContaining("turbosms");
        assertThatThrownBy(() -> new BreakerProperties(Map.of("fcm", new BreakerProperties.Settings(0, null))))
                .isInstanceOf(IllegalStateException.class);
        assertThatThrownBy(() -> new BreakerProperties(Map.of("fcm", new BreakerProperties.Settings(1, Duration.ZERO))))
                .isInstanceOf(IllegalStateException.class);
        BreakerProperties defaults = new BreakerProperties(null);
        assertThat(defaults.threshold(Provider.FCM)).isEqualTo(5);
        assertThat(defaults.openFor(Provider.FCM)).isEqualTo(Duration.ofSeconds(30));
    }

    @Test
    void theStateIsAMetricPerProvider() {
        SimpleMeterRegistry registry = new SimpleMeterRegistry();
        breakers.bindTo(registry);
        for (int i = 0; i < 3; i++) {
            fail(Provider.TURBOSMS, new IOException());
        }
        assertThat(registry.get("blizz.provider.breaker.state").tag("provider", "turbosms").gauge().value())
                .isEqualTo(2.0);
        assertThat(registry.get("blizz.provider.breaker.state").tag("provider", "graphhopper").gauge().value())
                .isEqualTo(0.0);
    }
}
