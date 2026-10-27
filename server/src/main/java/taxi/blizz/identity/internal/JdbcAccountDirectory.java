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

    @Override
    public Optional<String> phone(Actor subject) {
        String sql = switch (subject.type()) {
            case CLIENT -> "select phone_normalized from client where id = :id";
            case DRIVER -> "select phone_normalized from driver where id = :id";
            case STAFF, PARTNER, SYSTEM -> null;
        };
        if (sql == null) {
            return Optional.empty();
        }
        return jdbc.sql(sql).param("id", subject.id()).query(String.class).optional();
    }

    @Override
    public Optional<String> language(Actor subject) {
        String sql = switch (subject.type()) {
            case CLIENT -> "select language from client where id = :id";
            case DRIVER -> "select language from driver where id = :id";
            case STAFF, PARTNER, SYSTEM -> null;
        };
        if (sql == null) {
            return Optional.empty();
        }
        return jdbc.sql(sql).param("id", subject.id()).query(String.class).optional().filter(l -> !l.isBlank());
    }

    @Override
    public Optional<java.util.UUID> clientByPhone(taxi.blizz.identity.PhoneNumber phone) {
        return jdbc.sql("select id from client where phone_normalized = :phone and account_state <> 'ANONYMIZED'")
                .param("phone", phone.e164()).query(java.util.UUID.class).optional();
    }

    @Override
    public Optional<java.util.UUID> driverByPhone(taxi.blizz.identity.PhoneNumber phone) {
        return jdbc.sql("select id from driver where phone_normalized = :phone and account_state <> 'ANONYMIZED'")
                .param("phone", phone.e164()).query(java.util.UUID.class).optional();
    }
}
