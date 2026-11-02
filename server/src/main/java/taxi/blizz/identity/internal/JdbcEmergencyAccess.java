package taxi.blizz.identity.internal;

import java.time.Clock;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.audit.AuditEntry;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.identity.EmergencyAccess;
import taxi.blizz.identity.StaffPermissions;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;
import taxi.blizz.platform.SubjectType;

/** See {@link EmergencyAccess}. {@link JdbcStaffAccess} reads the active grants. */
@Service
class JdbcEmergencyAccess implements EmergencyAccess {

    private final JdbcClient jdbc;
    private final IdempotentCommands commands;
    private final AuditLog audit;
    private final Clock clock;

    private final RightsPassword rightsPassword;

    JdbcEmergencyAccess(JdbcClient jdbc, IdempotentCommands commands, AuditLog audit, Clock clock,
                        RightsPassword rightsPassword) {
        this.rightsPassword = rightsPassword;
        this.jdbc = jdbc;
        this.commands = commands;
        this.audit = audit;
        this.clock = clock;
    }

    private static final String SELECT = """
            select id, staff_id, permissions, all_cities, city_scope, reason, granted_by, granted_at, expires_at,
                   revoked_at, revoked_by, revoke_reason, revoked_at is null and expires_at > :now as active
            from staff_emergency_grant
            """;

    record GrantRequest(UUID staffId, Set<String> permissions, boolean allCities, Set<UUID> cityIds, long minutes,
                        String reason) {
    }

    @Override
    public Grant grant(Actor actor, UUID commandId, UUID staffId, Set<String> permissions, boolean allCities,
                       Set<UUID> cityIds, Duration duration, String reason, String password) {
        requireSuperAdmin(actor);
        requireOwnService(actor, staffId);
        Set<String> wanted = permissions == null ? Set.of() : new TreeSet<>(permissions);
        Set<UUID> cities = allCities || cityIds == null ? Set.of() : new TreeSet<>(cityIds);
        if (wanted.isEmpty() || !StaffPermissions.CODES.containsAll(wanted)) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "Permissions from the catalog are required");
        }
        if (!allCities && cities.isEmpty()) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "Cities, or all cities, are required");
        }
        if (duration == null || duration.compareTo(Duration.ofMinutes(5)) < 0 || duration.compareTo(LONGEST) > 0) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "From 5 minutes to " + LONGEST.toHours() + " hours");
        }
        String why = reason == null ? "" : reason.strip();
        if (why.length() < 10 || why.length() > 500) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "A reason of 10 to 500 characters is required");
        }
        if (actor.id().equals(staffId)) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "Nobody grants emergency access to themselves");
        }
        rightsPassword.confirm(actor, password, "staff.emergency_grant", "staff_user", staffId.toString(), why,
                java.util.Map.of("permissions", wanted, "all_cities", allCities, "city_ids", cities,
                        "minutes", duration.toMinutes()));
        return commands.execute(new CommandKey(actor, "staff.emergency_grant", commandId),
                new GrantRequest(staffId, wanted, allCities, cities, duration.toMinutes(), why), Grant.class, () -> {
                    String state = jdbc.sql("select state from staff_user where id = :id for update")
                            .param("id", staffId).query(String.class).optional()
                            .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Staff member not found"));
                    if (!"ACTIVE".equals(state)) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT, "The staff member is " + state);
                    }
                    OffsetDateTime now = now();
                    UUID id = UUID.randomUUID();
                    jdbc.sql("""
                                    insert into staff_emergency_grant (id, staff_id, permissions, all_cities,
                                        city_scope, reason, granted_by, granted_at, expires_at)
                                    values (:id, :staff, :permissions, :all, :cities, :reason, :by, :now, :until)""")
                            .param("id", id).param("staff", staffId).param("permissions", wanted.toArray(String[]::new))
                            .param("all", allCities).param("cities", cities.toArray(UUID[]::new))
                            .param("reason", why).param("by", actor.id()).param("now", now)
                            .param("until", now.plus(duration)).update();
                    Grant grant = find(id);
                    audit.record(new AuditEntry(actor, "staff.emergency_grant", "staff_user", staffId.toString(), why,
                            null, details(grant)));
                    return grant;
                });
    }

    record RevokeRequest(UUID grantId, String reason) {
    }

    @Override
    public Grant revoke(Actor actor, UUID commandId, UUID grantId, String reason) {
        requireSuperAdmin(actor);
        requireOwnService(actor, find(grantId).staffId());
        String why = reason == null ? "" : reason.strip();
        if (why.isEmpty() || why.length() > 500) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "A reason of at most 500 characters is required");
        }
        return commands.execute(new CommandKey(actor, "staff.emergency_revoke", commandId),
                new RevokeRequest(grantId, why), Grant.class, () -> {
                    jdbc.sql("select id from staff_emergency_grant where id = :id for update").param("id", grantId)
                            .query(UUID.class).optional()
                            .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Grant not found"));
                    Grant before = find(grantId);
                    if (!before.active()) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT, "The grant has already ended");
                    }
                    jdbc.sql("""
                                    update staff_emergency_grant set revoked_at = :now, revoked_by = :by,
                                                                     revoke_reason = :reason
                                    where id = :id""")
                            .param("now", now()).param("by", actor.id()).param("reason", why).param("id", grantId)
                            .update();
                    Grant after = find(grantId);
                    audit.record(new AuditEntry(actor, "staff.emergency_revoke", "staff_user",
                            after.staffId().toString(), why, details(before), details(after)));
                    return after;
                });
    }

    @Override
    @Transactional(readOnly = true)
    public List<Grant> list(Actor actor, boolean activeOnly) {
        requireSuperAdmin(actor);
        // The grants of the super admin's own taxi service (ADR 0016).
        return jdbc.sql(SELECT + "where staff_id in (select id from staff_user where service_id = "
                        + "(select service_id from staff_user where id = :actor))\n"
                        + (activeOnly ? "and revoked_at is null and expires_at > :now\n" : "")
                        + "order by (revoked_at is null and expires_at > :now) desc, granted_at desc limit 100")
                .param("actor", actor.id()).param("now", now()).query((rs, i) -> grant(rs)).list();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Activity> activity(Actor actor, UUID grantId) {
        requireSuperAdmin(actor);
        Grant grant = find(grantId);
        requireOwnService(actor, grant.staffId());
        OffsetDateTime end = grant.revokedAt() != null && grant.revokedAt().isBefore(grant.expiresAt())
                ? grant.revokedAt() : grant.expiresAt();
        return jdbc.sql("""
                        select occurred_at, method, path, status, outcome from staff_activity
                        where staff_id = :staff and kind = 'REQUEST' and occurred_at >= :from and occurred_at < :to
                        order by occurred_at, id limit 1000""")
                .param("staff", grant.staffId()).param("from", grant.grantedAt()).param("to", end)
                .query((rs, i) -> new Activity(rs.getObject("occurred_at", OffsetDateTime.class),
                        rs.getString("method"), rs.getString("path"), (Integer) rs.getObject("status"),
                        rs.getString("outcome")))
                .list();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Grant> mine(Actor actor) {
        if (actor == null || actor.type() != SubjectType.STAFF) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Staff only");
        }
        return jdbc.sql(SELECT + "where staff_id = :staff and revoked_at is null and expires_at > :now "
                        + "order by expires_at")
                .param("staff", actor.id()).param("now", now()).query((rs, i) -> grant(rs)).list();
    }

    // ---------------------------------------------------------------- helpers

    private void requireSuperAdmin(Actor actor) {
        boolean allowed = actor != null && actor.type() == SubjectType.STAFF && jdbc.sql("""
                        select exists(select 1 from staff_user where id = :id and role = 'SUPER_ADMIN'
                                        and state = 'ACTIVE' and not must_change_password)""")
                .param("id", actor.id()).query(Boolean.class).single();
        if (!allowed) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Only a super admin manages emergency access");
        }
    }

    /** A member of another taxi service does not exist for this super admin (ADR 0016). */
    private void requireOwnService(Actor actor, UUID staffId) {
        if (jdbc.sql("""
                        select exists(select 1 from staff_user
                                      where id = :staff
                                        and service_id <> (select service_id from staff_user where id = :actor))""")
                .param("staff", staffId).param("actor", actor.id()).query(Boolean.class).single()) {
            throw new DomainException(ErrorCode.NOT_FOUND, "Staff member not found");
        }
    }

    private Grant find(UUID id) {
        return jdbc.sql(SELECT + "where id = :id").param("id", id).param("now", now()).query((rs, i) -> grant(rs))
                .optional().orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Grant not found"));
    }

    private static Grant grant(java.sql.ResultSet rs) throws java.sql.SQLException {
        return new Grant(rs.getObject("id", UUID.class), rs.getObject("staff_id", UUID.class),
                new TreeSet<>(Arrays.asList((String[]) rs.getArray("permissions").getArray())),
                rs.getBoolean("all_cities"),
                new TreeSet<>(Arrays.asList((UUID[]) rs.getArray("city_scope").getArray())), rs.getString("reason"),
                rs.getObject("granted_by", UUID.class), rs.getObject("granted_at", OffsetDateTime.class),
                rs.getObject("expires_at", OffsetDateTime.class), rs.getObject("revoked_at", OffsetDateTime.class),
                rs.getObject("revoked_by", UUID.class), rs.getString("revoke_reason"), rs.getBoolean("active"));
    }

    private static Map<String, Object> details(Grant grant) {
        Map<String, Object> out = new LinkedHashMap<>();
        out.put("grant_id", grant.id().toString());
        out.put("permissions", List.copyOf(grant.permissions()));
        out.put("all_cities", grant.allCities());
        out.put("city_ids", grant.cityIds().stream().map(UUID::toString).toList());
        out.put("expires_at", grant.expiresAt().toString());
        out.put("revoked_at", grant.revokedAt() == null ? "" : grant.revokedAt().toString());
        return out;
    }

    private OffsetDateTime now() {
        return clock.instant().truncatedTo(ChronoUnit.MICROS).atOffset(ZoneOffset.UTC);
    }
}
