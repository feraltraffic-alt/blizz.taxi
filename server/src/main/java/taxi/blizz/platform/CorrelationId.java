package taxi.blizz.platform;

import java.util.Optional;
import java.util.UUID;
import org.slf4j.MDC;

/**
 * Correlation id of the current unit of work, propagated through HTTP, events, workers and
 * provider calls (REQ-OBS-01). Set by the web filter for requests and by the outbox relay
 * while delivering an event.
 */
public final class CorrelationId {

    public static final String HEADER = "X-Correlation-Id";
    public static final String MDC_KEY = "correlation_id";

    private static final ThreadLocal<UUID> CURRENT = new ThreadLocal<>();

    private CorrelationId() {
    }

    public static Optional<UUID> current() {
        return Optional.ofNullable(CURRENT.get());
    }

    /** The current id, or a fresh one when the work did not start from a request or event. */
    public static UUID currentOrNew() {
        UUID id = CURRENT.get();
        return id != null ? id : UUID.randomUUID();
    }

    /** Binds {@code id} to the current thread until the returned scope is closed. */
    public static Scope open(UUID id) {
        UUID previous = CURRENT.get();
        CURRENT.set(id);
        MDC.put(MDC_KEY, id.toString());
        return () -> {
            if (previous == null) {
                CURRENT.remove();
                MDC.remove(MDC_KEY);
            } else {
                CURRENT.set(previous);
                MDC.put(MDC_KEY, previous.toString());
            }
        };
    }

    @FunctionalInterface
    public interface Scope extends AutoCloseable {
        @Override
        void close();
    }
}
