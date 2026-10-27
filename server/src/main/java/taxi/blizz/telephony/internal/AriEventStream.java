package taxi.blizz.telephony.internal;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.WebSocket;
import java.time.Duration;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.atomic.AtomicBoolean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;
import taxi.blizz.configuration.Integrations;

/**
 * Listens to Asterisk: the ARI events WebSocket of the app {@value #APP} with {@code subscribeAll}, so the server sees
 * every channel without taking control of it — the dialplan keeps routing calls to the operators' phones. A lost or
 * refused connection is retried with a growing pause (1 s up to 30 s) and never touches the rest of the server: while
 * Asterisk is down calls are simply not logged, and phone orders keep working (REQ-OPS-07, T-36). The ARI address,
 * user and password are those of the admin panel (Integrations, otp), read again before every attempt.
 */
@Component
class AriEventStream implements SmartLifecycle {

    static final String APP = "blizz-calls";
    static final Duration FIRST_PAUSE = Duration.ofSeconds(1);
    static final Duration LONGEST_PAUSE = Duration.ofSeconds(30);

    private static final Logger log = LoggerFactory.getLogger(AriEventStream.class);

    private final Integrations integrations;
    private final TelephonyProperties properties;
    private final AriCallEvents events;
    private final AtomicBoolean running = new AtomicBoolean();
    private final AtomicBoolean connected = new AtomicBoolean();
    private Thread worker;

    AriEventStream(Integrations integrations, TelephonyProperties properties, AriCallEvents events) {
        this.integrations = integrations;
        this.properties = properties;
        this.events = events;
    }

    @Override
    public void start() {
        if (!properties.callsEnabled() || properties.fake()) {
            return; // tests and the sandbox drive FakeCallEvents
        }
        if (running.compareAndSet(false, true)) {
            worker = Thread.ofVirtual().name("ari-events").start(this::run);
        }
    }

    @Override
    public void stop() {
        running.set(false);
        if (worker != null) {
            worker.interrupt();
        }
    }

    @Override
    public boolean isRunning() {
        return running.get();
    }

    boolean connected() {
        return connected.get();
    }

    private void run() {
        Duration pause = FIRST_PAUSE;
        while (running.get()) {
            Optional<URI> address = address();
            Optional<String> authorization = authorization();
            if (address.isEmpty() || authorization.isEmpty()) {
                sleep(LONGEST_PAUSE); // not configured yet: look again later
                continue;
            }
            CompletableFuture<Void> closed = new CompletableFuture<>();
            try {
                WebSocket socket = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(5)).build()
                        .newWebSocketBuilder().header("Authorization", authorization.get())
                        .buildAsync(address.get(), new Listener(closed)).join();
                connected.set(true);
                pause = FIRST_PAUSE;
                log.info("Listening to Asterisk's calls");
                waitUntilClosed(closed);
                socket.abort();
            } catch (RuntimeException e) {
                log.warn("Asterisk's events are not reachable ({}); calls are not logged until they are",
                        e.getClass().getSimpleName());
            } finally {
                connected.set(false);
            }
            sleep(pause);
            pause = pause.multipliedBy(2).compareTo(LONGEST_PAUSE) > 0 ? LONGEST_PAUSE : pause.multipliedBy(2);
        }
    }

    /** ws(s)://…/ari/events?app=blizz-calls&subscribeAll=true, or empty when not configured. No key in the address. */
    Optional<URI> address() {
        return AriAccess.baseUrl(integrations).map(url -> URI.create(
                url.replaceFirst("^http", "ws") + "/ari/events?app=" + APP + "&subscribeAll=true"));
    }

    private Optional<String> authorization() {
        return AriAccess.authorization(integrations);
    }

    /** Until Asterisk closes the stream or the server stops. */
    private void waitUntilClosed(CompletableFuture<Void> closed) {
        while (running.get() && !closed.isDone()) {
            try {
                closed.get(1, java.util.concurrent.TimeUnit.SECONDS);
            } catch (java.util.concurrent.TimeoutException stillOpen) {
                // keep listening
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            } catch (java.util.concurrent.ExecutionException e) {
                return;
            }
        }
    }

    private void sleep(Duration pause) {
        try {
            Thread.sleep(pause);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            running.set(false);
        }
    }

    /** Collects the parts of a text message and hands every whole event over. */
    private final class Listener implements WebSocket.Listener {

        private final CompletableFuture<Void> closed;
        private final StringBuilder text = new StringBuilder();

        Listener(CompletableFuture<Void> closed) {
            this.closed = closed;
        }

        @Override
        public CompletionStage<?> onText(WebSocket socket, CharSequence data, boolean last) {
            text.append(data);
            if (last) {
                String event = text.toString();
                text.setLength(0);
                events.handle(event);
            }
            socket.request(1);
            return null;
        }

        @Override
        public CompletionStage<?> onClose(WebSocket socket, int status, String reason) {
            closed.complete(null);
            return null;
        }

        @Override
        public void onError(WebSocket socket, Throwable error) {
            closed.complete(null);
        }
    }
}
