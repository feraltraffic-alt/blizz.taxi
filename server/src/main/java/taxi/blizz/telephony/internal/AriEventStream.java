package taxi.blizz.telephony.internal;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.WebSocket;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Supplier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;
import taxi.blizz.configuration.Integrations;
import taxi.blizz.identity.Services;

/**
 * Listens to each taxi service's Asterisk (ADR 0016, owner decision 02.11.2026, issue #275): one ARI events WebSocket
 * of the app {@value #APP} with {@code subscribeAll} per service whose exchange is set, so the server sees every
 * channel without taking control of it — the dialplan keeps routing calls to the operators' phones. Every
 * {@link #REFRESH} the services and their settings are read again: a new exchange is listened to, a removed one is
 * dropped, a changed one reconnects. A lost or refused connection is retried with a growing pause (1 s up to 30 s) and
 * never touches the rest of the server or another service: while an exchange is down its calls are simply not logged,
 * and phone orders keep working (REQ-OPS-07, T-36). An event is handled as its service's only.
 */
@Component
class AriEventStream implements SmartLifecycle {

    static final String APP = "blizz-calls";
    static final Duration FIRST_PAUSE = Duration.ofSeconds(1);
    static final Duration LONGEST_PAUSE = Duration.ofSeconds(30);
    static final Duration REFRESH = Duration.ofSeconds(30);

    private static final Logger log = LoggerFactory.getLogger(AriEventStream.class);

    private final Integrations integrations;
    private final TelephonyProperties properties;
    private final AriCallEvents events;
    private final CallReconciliation reconciliation;
    private final Supplier<List<UUID>> services;
    private final Map<UUID, Listener> listeners = new ConcurrentHashMap<>();
    private final AtomicBoolean running = new AtomicBoolean();
    private Thread supervisor;

    @Autowired
    AriEventStream(Integrations integrations, TelephonyProperties properties, AriCallEvents events,
                   CallReconciliation reconciliation, Services services) {
        this(integrations, properties, events, reconciliation, services::activeIds);
    }

    /** The first service only. */
    AriEventStream(Integrations integrations, TelephonyProperties properties, AriCallEvents events,
                   CallReconciliation reconciliation) {
        this(integrations, properties, events, reconciliation, () -> List.of(Services.DEFAULT_ID));
    }

    AriEventStream(Integrations integrations, TelephonyProperties properties, AriCallEvents events,
                   CallReconciliation reconciliation, Supplier<List<UUID>> services) {
        this.integrations = integrations;
        this.properties = properties;
        this.events = events;
        this.reconciliation = reconciliation;
        this.services = services;
    }

    @Override
    public void start() {
        if (!properties.callsEnabled() || properties.fake()) {
            return; // tests and the sandbox drive FakeCallEvents
        }
        if (running.compareAndSet(false, true)) {
            supervisor = Thread.ofVirtual().name("ari-services").start(() -> {
                while (running.get()) {
                    refresh();
                    pause(REFRESH, running);
                }
            });
        }
    }

    @Override
    public void stop() {
        running.set(false);
        if (supervisor != null) {
            supervisor.interrupt();
        }
        listeners.values().forEach(Listener::stop);
        listeners.clear();
    }

    @Override
    public boolean isRunning() {
        return running.get();
    }

    /** Whether any service's exchange is connected now. */
    boolean connected() {
        return listeners.values().stream().anyMatch(l -> l.connected.get());
    }

    /** The services listened to now: those with an exchange set at the last {@link #refresh}. */
    Set<UUID> listening() {
        return Set.copyOf(listeners.keySet());
    }

    /** Listens to each service whose exchange is set, with its current settings; stops the others. */
    synchronized void refresh() {
        Map<UUID, String> wanted = new java.util.HashMap<>();
        List<UUID> ids;
        try {
            ids = services.get();
        } catch (RuntimeException e) {
            log.warn("The taxi services could not be read ({}); the exchanges are left as they are",
                    e.getClass().getSimpleName());
            return;
        }
        for (UUID id : ids) {
            Optional<URI> address = address(id);
            Optional<String> authorization = AriAccess.authorization(integrations, id);
            if (address.isPresent() && authorization.isPresent()) {
                // A change of address, user or password reconnects; nothing of it is kept but this hash.
                wanted.put(id, Integer.toHexString(Objects.hash(address.get(), authorization.get())));
            }
        }
        listeners.entrySet().removeIf(entry -> {
            boolean keep = entry.getValue().fingerprint.equals(wanted.get(entry.getKey()));
            if (!keep) {
                entry.getValue().stop();
            }
            return !keep;
        });
        wanted.forEach((id, fingerprint) -> listeners.computeIfAbsent(id, key -> new Listener(key, fingerprint)));
    }

    /** ws(s)://…/ari/events?app=blizz-calls&subscribeAll=true of the service, or empty when not set. No key in it. */
    Optional<URI> address(UUID serviceId) {
        return AriAccess.baseUrl(integrations, serviceId).map(url -> URI.create(
                url.replaceFirst("^http", "ws") + "/ari/events?app=" + APP + "&subscribeAll=true"));
    }

    private static void pause(Duration pause, AtomicBoolean until) {
        try {
            Thread.sleep(pause);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            until.set(false);
        }
    }

    /** One service's events stream, reconnecting until it is stopped. */
    private final class Listener {

        final UUID serviceId;
        final String fingerprint;
        final AtomicBoolean active = new AtomicBoolean(true);
        final AtomicBoolean connected = new AtomicBoolean();
        final Thread worker;

        Listener(UUID serviceId, String fingerprint) {
            this.serviceId = serviceId;
            this.fingerprint = fingerprint;
            this.worker = Thread.ofVirtual().name("ari-events-" + serviceId).start(this::run);
        }

        void stop() {
            active.set(false);
            worker.interrupt();
        }

        private void run() {
            Duration pause = FIRST_PAUSE;
            while (active.get()) {
                Optional<URI> address = address(serviceId);
                Optional<String> authorization = AriAccess.authorization(integrations, serviceId);
                if (address.isEmpty() || authorization.isEmpty()) {
                    return; // the exchange was removed: the next refresh drops this listener
                }
                CompletableFuture<Void> closed = new CompletableFuture<>();
                try {
                    WebSocket socket = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(5)).build()
                            .newWebSocketBuilder().header("Authorization", authorization.get())
                            .buildAsync(address.get(), new Messages(closed)).join();
                    connected.set(true);
                    pause = FIRST_PAUSE;
                    log.info("Listening to the calls of service {}'s Asterisk", serviceId);
                    if (reconciliation != null) {
                        reconciliation.afterConnect(serviceId); // calls that ended while nobody listened
                    }
                    waitUntilClosed(closed);
                    socket.abort();
                } catch (RuntimeException e) {
                    log.warn("Service {}'s Asterisk events are not reachable ({}); its calls are not logged until"
                            + " they are", serviceId, e.getClass().getSimpleName());
                } finally {
                    connected.set(false);
                }
                pause(pause, active);
                pause = pause.multipliedBy(2).compareTo(LONGEST_PAUSE) > 0 ? LONGEST_PAUSE : pause.multipliedBy(2);
            }
        }

        /** Until Asterisk closes the stream or the listener stops. */
        private void waitUntilClosed(CompletableFuture<Void> closed) {
            while (active.get() && !closed.isDone()) {
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

        /** Collects the parts of a text message and hands every whole event over, as this service's. */
        private final class Messages implements WebSocket.Listener {

            private final CompletableFuture<Void> closed;
            private final StringBuilder text = new StringBuilder();

            Messages(CompletableFuture<Void> closed) {
                this.closed = closed;
            }

            @Override
            public CompletionStage<?> onText(WebSocket socket, CharSequence data, boolean last) {
                text.append(data);
                if (last) {
                    String event = text.toString();
                    text.setLength(0);
                    if (events != null) {
                        events.handle(serviceId, event);
                    }
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
}
