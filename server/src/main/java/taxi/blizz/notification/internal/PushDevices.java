package taxi.blizz.notification.internal;

import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;
import taxi.blizz.platform.SubjectType;

/**
 * The phones that receive pushes (REQ-NTF-02). A device belongs to the app session that registered it: after a
 * logout or a revoked session nothing more is sent to it. A token is active for one person at a time — when another
 * person signs in on the same phone, the token moves to them.
 */
@Service
class PushDevices {

    static final Set<String> PLATFORMS = Set.of("ANDROID", "IOS", "WEB");
    static final int MAX_TOKEN_LENGTH = 1024;
    /** Active devices one person keeps; FCM tokens are about 160 characters, APNs 64. */
    static final int MAX_DEVICES = 5;

    private final JdbcClient jdbc;
    private final IdempotentCommands commands;
    private final Clock clock;

    PushDevices(JdbcClient jdbc, IdempotentCommands commands, Clock clock) {
        this.jdbc = jdbc;
        this.commands = commands;
        this.clock = clock;
    }

    record Device(UUID id, String platform, String locale, String state, OffsetDateTime createdAt) {
    }

    record Registration(String platform, String token, String locale) {
    }

    record Removal(UUID deviceId) {
    }

    record Target(UUID id, UUID sessionId, String platform, String token) {
    }

    Device register(Actor subject, UUID sessionId, UUID commandId, Registration registration) {
        requireAppUser(subject);
        String platform = registration.platform() == null ? null : registration.platform().toUpperCase(Locale.ROOT);
        if (!PLATFORMS.contains(platform)) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "platform must be one of " + PLATFORMS);
        }
        String token = registration.token() == null ? "" : registration.token().strip();
        if (token.isEmpty() || token.length() > MAX_TOKEN_LENGTH) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "token is required (at most " + MAX_TOKEN_LENGTH + " characters)");
        }
        String locale = registration.locale() == null || registration.locale().isBlank() ? null
                : registration.locale().strip();
        Registration normalized = new Registration(platform, token, locale);
        return commands.execute(new CommandKey(subject, "push-device.register", commandId), normalized, Device.class,
                () -> {
                    OffsetDateTime now = now();
                    // The same token for the same person again (a new session, a new locale): refreshed in place.
                    List<UUID> own = jdbc.sql("""
                                    update push_device set device_session_id = :session, platform = :platform,
                                                           locale = :locale, updated_at = :now
                                    where token = :token and state = 'ACTIVE' and subject_type = :type
                                      and subject_id = :subject
                                    returning id""")
                            .param("session", sessionId).param("platform", platform).param("locale", locale)
                            .param("now", now).param("token", token).param("type", subject.type().name())
                            .param("subject", subject.id()).query(UUID.class).list();
                    if (!own.isEmpty()) {
                        return device(own.getFirst());
                    }
                    jdbc.sql("""
                                    update push_device set state = 'REVOKED', updated_at = :now
                                    where token = :token and state = 'ACTIVE'""")
                            .param("now", now).param("token", token).update();
                    UUID id = UUID.randomUUID();
                    jdbc.sql("""
                                    insert into push_device (id, subject_type, subject_id, device_session_id, platform,
                                                             token, locale, state, created_at, updated_at)
                                    values (:id, :type, :subject, :session, :platform, :token, :locale, 'ACTIVE',
                                            :now, :now)""")
                            .param("id", id).param("type", subject.type().name()).param("subject", subject.id())
                            .param("session", sessionId).param("platform", platform).param("token", token)
                            .param("locale", locale).param("now", now).update();
                    // A person has a few phones, not thousands: past MAX_DEVICES the longest unused go, so one
                    // account cannot make every push fan out to invented tokens (audit 29.10.2026).
                    jdbc.sql("""
                                    update push_device set state = 'REVOKED', updated_at = :now
                                    where id in (select id from push_device
                                                 where subject_type = :type and subject_id = :subject
                                                   and state = 'ACTIVE'
                                                 order by updated_at desc, id desc offset :keep)""")
                            .param("now", now).param("type", subject.type().name()).param("subject", subject.id())
                            .param("keep", MAX_DEVICES).update();
                    return device(id);
                });
    }

    void remove(Actor subject, UUID commandId, UUID deviceId) {
        requireAppUser(subject);
        commands.execute(new CommandKey(subject, "push-device.remove", commandId), new Removal(deviceId),
                Boolean.class, () -> {
                    int found = jdbc.sql("""
                                    select count(*) from push_device
                                    where id = :id and subject_type = :type and subject_id = :subject""")
                            .param("id", deviceId).param("type", subject.type().name()).param("subject", subject.id())
                            .query(Integer.class).single();
                    if (found == 0) {
                        throw new DomainException(ErrorCode.NOT_FOUND, "Device not found");
                    }
                    revoke(deviceId);
                    return Boolean.TRUE;
                });
    }

    @Transactional(readOnly = true)
    List<Device> devices(Actor subject) {
        requireAppUser(subject);
        return jdbc.sql("""
                        select id, platform, locale, state, created_at from push_device
                        where subject_type = :type and subject_id = :subject and state = 'ACTIVE'
                        order by created_at""")
                .param("type", subject.type().name()).param("subject", subject.id())
                .query((rs, i) -> new Device(rs.getObject(1, UUID.class), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getObject(5, OffsetDateTime.class)))
                .list();
    }

    /** The active devices of a person, for the sender. */
    List<Target> targets(String subjectType, UUID subjectId) {
        return jdbc.sql("""
                        select id, device_session_id, platform, token from push_device
                        where subject_type = :type and subject_id = :subject and state = 'ACTIVE'
                        order by updated_at desc""")
                .param("type", subjectType).param("subject", subjectId)
                .query((rs, i) -> new Target(rs.getObject(1, UUID.class), rs.getObject(2, UUID.class),
                        rs.getString(3), rs.getString(4)))
                .list();
    }

    void revoke(UUID deviceId) {
        jdbc.sql("update push_device set state = 'REVOKED', updated_at = :now where id = :id and state = 'ACTIVE'")
                .param("now", now()).param("id", deviceId).update();
    }

    private Device device(UUID id) {
        return jdbc.sql("select id, platform, locale, state, created_at from push_device where id = :id")
                .param("id", id)
                .query((rs, i) -> new Device(rs.getObject(1, UUID.class), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getObject(5, OffsetDateTime.class)))
                .single();
    }

    private static void requireAppUser(Actor subject) {
        if (subject.type() != SubjectType.CLIENT && subject.type() != SubjectType.DRIVER) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Only riders and drivers register devices");
        }
    }

    private OffsetDateTime now() {
        return OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
    }
}
