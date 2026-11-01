package taxi.blizz.platform.internal;

import java.util.List;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import taxi.blizz.platform.OutboxBacklog;

/** See {@link OutboxBacklog}. */
@Component
class JdbcOutboxBacklog implements OutboxBacklog {

    private final JdbcClient jdbc;

    JdbcOutboxBacklog(JdbcClient jdbc) {
        this.jdbc = jdbc;
    }

    @Override
    public List<Waiting> waiting(String eventType, String consumerId, int limit) {
        return List.of();
    }
}
