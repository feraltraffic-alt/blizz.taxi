package taxi.blizz.identity.internal;

import java.util.Optional;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import taxi.blizz.identity.Services;
import taxi.blizz.platform.Actor;

/** See {@link Services}. */
@Service
class JdbcServices implements Services {

    private final JdbcClient jdbc;

    JdbcServices(JdbcClient jdbc) {
        this.jdbc = jdbc;
    }

    @Override
    public Optional<UUID> active(String code) {
        if (code == null || code.isBlank()) {
            return Optional.empty();
        }
        return jdbc.sql("select id from service where code = :code and state = 'ACTIVE'")
                .param("code", code.strip()).query(UUID.class).optional();
    }

    @Override
    public Optional<UUID> of(Actor subject) {
        if (subject == null || subject.id() == null) {
            return Optional.empty();
        }
        String table = switch (subject.type()) {
            case CLIENT -> "client";
            case DRIVER -> "driver";
            case STAFF -> "staff_user";
            default -> null;
        };
        if (table == null) {
            return Optional.empty();
        }
        return jdbc.sql("select service_id from " + table + " where id = :id").param("id", subject.id())
                .query(UUID.class).optional();
    }
}
