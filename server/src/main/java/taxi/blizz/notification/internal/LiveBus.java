package taxi.blizz.notification.internal;

import java.sql.Connection;
import java.sql.Statement;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.sql.DataSource;
import org.postgresql.PGConnection;
import org.postgresql.PGNotification;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.SmartLifecycle;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import tools.jackson.databind.json.JsonMapper;

/**
 * Carries live messages to every instance (several replicas behind a load balancer): published with PostgreSQL
 * NOTIFY in the transaction of the event, so a message exists only if the change was committed; each instance
 * LISTENs on its own connection and hands the message to its local connections.
 */
@Component
class LiveBus implements SmartLifecycle {

    static final String CHANNEL = "blizz_live";
    private static final Logger log = LoggerFactory.getLogger(LiveBus.class);

    record Delivery(List<UUID> to, Map<String, Object> envelope) {
    }

    private final JdbcClient jdbc;
    private final DataSource dataSource;
    private final LiveSessions sessions;
    private final JsonMapper json;
    private final AtomicBoolean running = new AtomicBoolean();
    private Thread listener;

    LiveBus(JdbcClient jdbc, DataSource dataSource, LiveSessions sessions, JsonMapper json) {
        this.jdbc = jdbc;
        this.dataSource = dataSource;
        this.sessions = sessions;
        this.json = json;
    }

    /** Within the caller's transaction; the message leaves at commit. */
    void publish(Set<UUID> to, Map<String, Object> envelope) {
        if (to.isEmpty()) {
            return;
        }
        String payload = json.writeValueAsString(new Delivery(List.copyOf(to), envelope));
        jdbc.sql("select pg_notify(:channel, :payload)").param("channel", CHANNEL).param("payload", payload)
                .query().singleRow();
    }

    @Override
    public void start() {
        if (running.compareAndSet(false, true)) {
            listener = Thread.ofVirtual().name("live-bus").start(this::listen);
        }
    }

    @Override
    public void stop() {
        running.set(false);
        if (listener != null) {
            listener.interrupt();
        }
    }

    @Override
    public boolean isRunning() {
        return running.get();
    }

    private void listen() {
        while (running.get()) {
            try (Connection connection = dataSource.getConnection(); Statement statement = connection.createStatement()) {
                connection.setAutoCommit(true);
                statement.execute("LISTEN " + CHANNEL);
                PGConnection pg = connection.unwrap(PGConnection.class);
                while (running.get()) {
                    PGNotification[] notifications = pg.getNotifications(5_000);
                    if (notifications == null) {
                        continue;
                    }
                    for (PGNotification n : notifications) {
                        deliver(n.getParameter());
                    }
                }
            } catch (Exception e) {
                if (!running.get()) {
                    return;
                }
                log.warn("Live bus connection lost, reconnecting: {}", e.toString());
                try {
                    Thread.sleep(2_000);
                } catch (InterruptedException interrupted) {
                    return;
                }
            }
        }
    }

    void deliver(String payload) {
        try {
            Delivery delivery = json.readValue(payload, Delivery.class);
            sessions.send(new HashSet<>(delivery.to()), json.writeValueAsString(delivery.envelope()));
        } catch (RuntimeException e) {
            log.warn("Could not deliver a live message: {}", e.toString());
        }
    }
}
