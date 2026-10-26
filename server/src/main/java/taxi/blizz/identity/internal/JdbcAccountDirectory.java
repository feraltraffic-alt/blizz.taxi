package taxi.blizz.identity.internal;

import java.util.Optional;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import taxi.blizz.identity.AccountDirectory;
import taxi.blizz.platform.Actor;

@Service
class JdbcAccountDirectory implements AccountDirectory {

    private final JdbcClient jdbc;

    JdbcAccountDirectory(JdbcClient jdbc) {
        this.jdbc = jdbc;
    }

    @Override
    public Optional<String> accountState(Actor subject) {
        String sql = switch (subject.type()) {
            case CLIENT -> "select account_state from client where id = :id";
            case DRIVER -> "select account_state from driver where id = :id";
            case STAFF -> "select state from staff_user where id = :id";
            case PARTNER -> "select state from partner where id = :id";
            case SYSTEM -> null;
        };
        if (sql == null) {
            return Optional.of("ACTIVE");
        }
        return jdbc.sql(sql).param("id", subject.id()).query(String.class).optional();
    }
}
