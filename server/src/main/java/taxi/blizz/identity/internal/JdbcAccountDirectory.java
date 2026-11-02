package taxi.blizz.identity.internal;

import java.util.Optional;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import taxi.blizz.identity.AccountDirectory;
import taxi.blizz.platform.Actor;

@Service
class JdbcAccountDirectory implements AccountDirectory {

    private final JdbcClient jdbc;
    private final taxi.blizz.identity.Services services;

    JdbcAccountDirectory(JdbcClient jdbc, taxi.blizz.identity.Services services) {
        this.services = services;
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
    public Optional<String> name(Actor subject) {
        String sql = switch (subject.type()) {
            case CLIENT -> "select name from client where id = :id";
            case DRIVER -> "select name from driver where id = :id";
            case STAFF, PARTNER, SYSTEM -> null;
        };
        if (sql == null) {
            return Optional.empty();
        }
        return jdbc.sql(sql).param("id", subject.id()).query(String.class).optional().filter(n -> !n.isBlank());
    }

    @Override
    public Optional<java.util.UUID> clientByPhone(java.util.UUID serviceId, taxi.blizz.identity.PhoneNumber phone) {
        return jdbc.sql("""
                        select id from client
                        where service_id = :service and phone_normalized = :phone and account_state <> 'ANONYMIZED'""")
                .param("service", serviceId).param("phone", phone.e164()).query(java.util.UUID.class).optional();
    }

    @Override
    public Optional<java.util.UUID> driverByPhone(java.util.UUID serviceId, taxi.blizz.identity.PhoneNumber phone) {
        return jdbc.sql("""
                        select id from driver
                        where service_id = :service and phone_normalized = :phone and account_state <> 'ANONYMIZED'""")
                .param("service", serviceId).param("phone", phone.e164()).query(java.util.UUID.class).optional();
    }

    @Override
    public Optional<java.util.UUID> clientByPhone(Actor within, taxi.blizz.identity.PhoneNumber phone) {
        return services.of(within).flatMap(service -> clientByPhone(service, phone));
    }

    @Override
    public Optional<java.util.UUID> driverByPhone(Actor within, taxi.blizz.identity.PhoneNumber phone) {
        return services.of(within).flatMap(service -> driverByPhone(service, phone));
    }
}
