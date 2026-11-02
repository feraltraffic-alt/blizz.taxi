package taxi.blizz.configuration.internal;

import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.audit.AuditEntry;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.configuration.FeatureFlags;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.ConflictException;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;

@Service
class JdbcFeatureFlags implements FeatureFlags {

    private final JdbcClient jdbc;
    private final IdempotentCommands commands;
    private final StaffAccess staff;
    private final AuditLog audit;
    private final Clock clock;

    private final taxi.blizz.identity.Services services;
    private final taxi.blizz.geo.CityCatalog cities;

    JdbcFeatureFlags(JdbcClient jdbc, IdempotentCommands commands, StaffAccess staff, AuditLog audit, Clock clock,
                     taxi.blizz.identity.Services services, taxi.blizz.geo.CityCatalog cities) {
        this.services = services;
        this.cities = cities;
        this.jdbc = jdbc;
        this.commands = commands;
        this.staff = staff;
        this.audit = audit;
        this.clock = clock;
    }

    @Override
    @Transactional(readOnly = true)
    public boolean enabled(UUID serviceId, Flag flag) {
        return state(serviceId, flag, false).enabled();
    }

    @Override
    @Transactional(readOnly = true)
    public boolean enabledInCity(UUID cityId, Flag flag) {
        return enabled(cities.serviceOf(cityId).orElse(taxi.blizz.identity.Services.DEFAULT_ID), flag);
    }

    private UUID serviceOf(Actor staffMember) {
        return services.of(staffMember)
                .orElseThrow(() -> new DomainException(ErrorCode.ACCESS_DENIED, "Not staff of a taxi service"));
    }

    @Override
    @Transactional(readOnly = true)
    public List<State> all(Actor actor) {
        staff.require(actor, MANAGE_PERMISSION);
        UUID service = serviceOf(actor);
        return Arrays.stream(Flag.values()).map(f -> state(service, f, false)).toList();
    }

    record ChangeRequest(String key, long expectedVersion, boolean enabled, String reason) {
    }

    @Override
    public State change(Actor actor, UUID commandId, String key, long expectedVersion, boolean enabled,
                        String reason) {
        staff.require(actor, MANAGE_PERMISSION);
        Flag flag = Arrays.stream(Flag.values()).filter(f -> f.key().equals(key)).findFirst()
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "No such feature flag"));
        if (reason == null || reason.isBlank()) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "A reason is required");
        }
        String why = reason.strip();
        return commands.execute(new CommandKey(actor, "feature-flag.change", commandId),
                new ChangeRequest(key, expectedVersion, enabled, why), State.class, () -> {
                    UUID service = serviceOf(actor);
                    State before = state(service, flag, true);
                    if (before.version() != expectedVersion) {
                        throw ConflictException.version(before.version(),
                                "The flag was changed meanwhile; reload it");
                    }
                    OffsetDateTime now = OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
                    jdbc.sql("""
                                    insert into feature_flag (key, enabled, version, changed_by, reason, changed_at,
                                                              service_id)
                                    values (:key, :enabled, :version, :by, :reason, :now, :service)
                                    on conflict (service_id, key) do update set enabled = excluded.enabled,
                                        version = excluded.version, changed_by = excluded.changed_by,
                                        reason = excluded.reason, changed_at = excluded.changed_at""")
                            .param("service", service).param("key", key).param("enabled", enabled)
                            .param("version", before.version() + 1)
                            .param("by", actor.id()).param("reason", why).param("now", now).update();
                    audit.record(new AuditEntry(actor, "feature-flag.change", "feature_flag", key, why,
                            Map.of("enabled", before.enabled(), "version", before.version()),
                            Map.of("enabled", enabled, "version", before.version() + 1)));
                    return state(service, flag, false);
                });
    }

    /** The stored state, or the default as version 0; {@code lock} serializes changes of one flag. */
    private State state(UUID service, Flag flag, boolean lock) {
        if (lock) {
            // A row may not exist yet: lock on the key itself, so two first changes do not both insert version 1.
            jdbc.sql("select pg_advisory_xact_lock(hashtextextended('feature-flag:' || :key, 0))")
                    .param("key", service + ":" + flag.key()).query().singleRow();
        }
        return jdbc.sql("""
                        select enabled, version, changed_by, reason, changed_at from feature_flag
                        where service_id = :service and key = :key""")
                .param("service", service).param("key", flag.key())
                .query((rs, i) -> new State(flag, rs.getBoolean(1), rs.getLong(2), rs.getObject(3, UUID.class),
                        rs.getString(4), rs.getObject(5, OffsetDateTime.class)))
                .optional()
                .orElse(new State(flag, flag.defaultEnabled(), 0, null, null, null));
    }
}
