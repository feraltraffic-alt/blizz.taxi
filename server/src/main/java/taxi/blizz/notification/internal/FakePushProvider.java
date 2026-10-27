package taxi.blizz.notification.internal;

import java.time.Clock;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** For tests, the sandbox and development: keeps what would be sent and logs it. */
class FakePushProvider implements PushProvider {

    private static final Logger log = LoggerFactory.getLogger(FakePushProvider.class);

    /** {@code at}: when it was handed over, in UTC (read in the sandbox at {@code /sandbox/v1/pushes}). */
    record Sent(String token, String title, String body, Map<String, String> data, Duration ttl,
                OffsetDateTime at) {
    }

    /** A long-running sandbox keeps only the most recent pushes. */
    static final int KEEP = 10_000;

    private final List<Sent> sent = new ArrayList<>();
    private final Deque<Outcome> script = new ArrayDeque<>();
    private final Clock clock;

    FakePushProvider(Clock clock) {
        this.clock = clock;
    }

    @Override
    public synchronized Result send(String token, String platform, String title, String body,
                                    Map<String, String> data, Duration ttl) {
        Outcome outcome = script.isEmpty() ? Outcome.SENT : script.poll();
        if (outcome == Outcome.SENT) {
            if (sent.size() >= KEEP) {
                sent.removeFirst();
            }
            sent.add(new Sent(token, title, body, Map.copyOf(data), ttl,
                    OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC)));
            log.info("[push] {} — {}: {}", data.get("type"), title, body);
        }
        return new Result(outcome, outcome == Outcome.SENT ? null : "fake " + outcome);
    }

    synchronized void next(Outcome... outcomes) {
        script.addAll(List.of(outcomes));
    }

    synchronized List<Sent> sent() {
        return List.copyOf(sent);
    }

    synchronized void reset() {
        sent.clear();
        script.clear();
    }
}
