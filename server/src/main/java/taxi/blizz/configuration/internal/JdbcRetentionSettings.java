package taxi.blizz.configuration.internal;

import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.audit.AuditEntry;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.configuration.RetentionSettings;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.ConflictException;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;
import tools.jackson.databind.json.JsonMapper;

@Service
class JdbcRetentionSettings implements RetentionSettings {

    /** ADR 0015's terms of a service's own kinds, until its super admin sets them. */
    static final Map<String, Integer> DEFAULTS = Map.of("sessions", 30, "sign_in_codes", 90, "code_deliveries", 90,
            "upload_sessions", 7, "quarantined_files", 30, "call_recordings", 0);

    private final JdbcClient jdbc;
    private final StaffAccess staff;
    private final IdempotentCommands commands;
    private final AuditLog audit;
    private final JsonMapper json;
    private final Clock clock;
    private final taxi.blizz.identity.Services services;

    JdbcRetentionSettings(JdbcClient jdbc, StaffAccess staff, IdempotentCommands commands, AuditLog audit,
            JsonMapper json, taxi.blizz.identity.Services services, Clock clock) {
        this.services = services;
        this.jdbc = jdbc;
        this.staff = staff;
        this.commands = commands;
        this.audit = audit;
        this.json = json;
        this.clock = clock;
    }

    @Override
    @Transactional(readOnly = true)
    public Version current(UUID serviceId) {
        return jdbc.sql("""
                        select version, days::text, changed_by, reason, changed_at
                        from retention_settings where service_id = :service order by version desc limit 1""")
                .param("service", serviceId)
                .query((rs, i) -> new Version(rs.getLong(1), readDays(rs.getString(2)), rs.getObject(3, UUID.class),
                        rs.getString(4), rs.getObject(5, OffsetDateTime.class)))
                .optional().orElse(new Version(0, DEFAULTS, null, null, null));
    }

    /** A service's own kinds only: a version stored before #276 also held the kinds now fixed. */
    @SuppressWarnings("unchecked")
    private Map<String, Integer> readDays(String value) {
        Map<String, Integer> stored = new TreeMap<>((Map<String, Integer>) json.readValue(value, Map.class));
        stored.keySet().retainAll(SERVICE_KINDS);
        return stored;
    }

    @Override
    public Map<UUID, Map<String, Integer>> byService() {
        Map<UUID, Map<String, Integer>> terms = new java.util.LinkedHashMap<>();
        for (UUID service : services.activeIds()) {
            terms.put(service, current(service).days());
        }
        return terms;
    }

    record Change(long expectedVersion, Map<String, Integer> days, String reason) {
    }

    @Override
    public Version change(Actor actor, UUID commandId, long expectedVersion, Map<String, Integer> days,
            String reason) {
        require(staff, actor);
        // The actor's own service's terms only (ADR 0016, #276).
        UUID service = services.of(actor).orElseThrow(() -> new DomainException(ErrorCode.ACCESS_DENIED,
                "Not a staff member"));
        if (days == null || !days.keySet().equals(java.util.Set.copyOf(SERVICE_KINDS))
                || days.values().stream().anyMatch(n -> n == null || n < 0)
                || reason == null || reason.isBlank() || expectedVersion < 0) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "Invalid retention settings");
        }
        Map<String, Integer> clean = Collections.unmodifiableMap(new TreeMap<>(days));
        return commands.execute(new CommandKey(actor, "retention.change", commandId),
                new Change(expectedVersion, clean, reason), Version.class, () -> {
                    jdbc.sql("select pg_advisory_xact_lock(hashtext('retention-settings-' || :service))")
                            .param("service", service.toString()).query().singleRow();
                    Version before = current(service);
                    if (before.version() != expectedVersion) {
                        throw ConflictException.version(before.version(), "Retention settings changed");
                    }
                    Version after = new Version(before.version() + 1, clean, actor.id(), reason,
                            OffsetDateTime.ofInstant(clock.instant(), ZoneOffset.UTC));
                    jdbc.sql("""
                                    insert into retention_settings (service_id, version, days, changed_by, reason,
                                                                    changed_at)
                                    values (:service, :v, cast(:days as jsonb), :by, :reason, :at)""")
                            .param("service", service).param("v", after.version())
                            .param("days", json.writeValueAsString(clean))
                            .param("by", actor.id()).param("reason", reason).param("at", after.changedAt()).update();
                    audit.record(new AuditEntry(actor, "retention.change", "retention_settings",
                            service + ":" + after.version(), reason, before.days(), clean));
                    return after;
                });
    }

    static void require(StaffAccess staff, Actor actor) {
        staff.require(actor, MANAGE_PERMISSION);
        if (!staff.scope(actor, MANAGE_PERMISSION).allCities()) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Retention settings require all-city scope");
        }
    }
}
