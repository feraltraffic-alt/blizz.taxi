package taxi.blizz.operations.internal;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taxi.blizz.audit.AuditEntry;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.driver.DriverRiskFlagCheck;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.operations.DriverRiskFlags;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.ConflictException;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;
import tools.jackson.databind.json.JsonMapper;

/**
 * Driver risk flags (REQ-DS-08, REQ-SEC-11, issue #71): raised automatically ({@link #raiseAutomatic}) or by staff,
 * reviewed once by a person. Nothing here blocks a driver, ends a trip or charges anything.
 */
@Service
class JdbcDriverRiskFlags implements DriverRiskFlags, DriverRiskFlagCheck {

    private static final String SELECT = """
            select id, driver_id, city_id, kind, state, evidence::text as evidence, raised_by, raised_at, reason,
                   reviewed_by, reviewed_at, review_reason, version
            from driver_risk_flag""";

    private final JdbcClient jdbc;
    private final IdempotentCommands commands;
    private final StaffAccess staff;
    private final AuditLog audit;
    private final JsonMapper json;
    private final Clock clock;

    JdbcDriverRiskFlags(JdbcClient jdbc, IdempotentCommands commands, StaffAccess staff, AuditLog audit,
                        JsonMapper json, Clock clock) {
        this.jdbc = jdbc;
        this.commands = commands;
        this.staff = staff;
        this.audit = audit;
        this.json = json;
        this.clock = clock;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Flag> list(Actor actor, UUID cityId, State state, UUID driverId, OffsetDateTime before, int limit) {
        StaffAccess.Scope scope = staff.scope(actor, RISK_PERMISSION);
        if (!scope.allCities() && scope.cityIds().isEmpty()) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Missing permission " + RISK_PERMISSION);
        }
        if (cityId != null) {
            staff.require(actor, RISK_PERMISSION, cityId);
        }
        Set<UUID> cities = new HashSet<>(scope.cityIds());
        return jdbc.sql(SELECT + """
                         where (:all or city_id = any(cast(:cities as uuid[])))
                          and (cast(:city as uuid) is null or city_id = :city)
                          and (cast(:state as text) is null or state = :state)
                          and (cast(:driver as uuid) is null or driver_id = :driver)
                          and (cast(:before as timestamptz) is null or raised_at < :before)
                        order by raised_at desc, id limit :limit""")
                .param("all", scope.allCities()).param("cities", cities.toArray(UUID[]::new))
                .param("city", cityId).param("state", state == null ? null : state.name())
                .param("driver", driverId).param("before", before)
                .param("limit", Math.max(1, Math.min(limit, 100)))
                .query((rs, i) -> map(rs)).list();
    }

    @Override
    @Transactional(readOnly = true)
    public Flag get(Actor actor, UUID flagId) {
        Flag flag = find(flagId, false).orElseThrow(JdbcDriverRiskFlags::notFound);
        requireFor(actor, flag.cityId());
        return flag;
    }

    record RaiseRequest(UUID driverId, UUID cityId, String reason) {
    }

    @Override
    public Flag raise(Actor actor, UUID commandId, UUID driverId, UUID cityId, String reason) {
        String why = reason(reason);
        if (driverId == null || cityId == null) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "driver_id and city_id are required");
        }
        staff.require(actor, RISK_PERMISSION, cityId);
        if (jdbc.sql("select count(*) from driver where id = :id").param("id", driverId).query(Long.class).single()
                == 0) {
            throw new DomainException(ErrorCode.NOT_FOUND, "Driver not found");
        }
        return commands.execute(new CommandKey(actor, "driver_risk_flag.raise", commandId),
                new RaiseRequest(driverId, cityId, why), Flag.class, () -> {
                    UUID id = UUID.randomUUID();
                    jdbc.sql("""
                                    insert into driver_risk_flag (id, driver_id, city_id, kind, raised_by, raised_at,
                                                                  reason)
                                    values (:id, :driver, :city, 'MANUAL', :staff, :now, :reason)""")
                            .param("id", id).param("driver", driverId).param("city", cityId)
                            .param("staff", actor.id()).param("now", now()).param("reason", why).update();
                    audit.record(new AuditEntry(actor, "driver_risk_flag.raise", "driver_risk_flag", id.toString(),
                            why, null, Map.of("driver_id", driverId.toString(), "city_id", cityId.toString(),
                            "kind", Kind.MANUAL.name())));
                    return find(id, false).orElseThrow();
                });
    }

    record ReviewRequest(UUID flagId, long expectedVersion, boolean confirm, String reason) {
    }

    @Override
    public Flag review(Actor actor, UUID commandId, UUID flagId, long expectedVersion, boolean confirm,
                       String reason) {
        String why = reason(reason);
        Flag before = find(flagId, false).orElseThrow(JdbcDriverRiskFlags::notFound);
        requireFor(actor, before.cityId());
        return commands.execute(new CommandKey(actor, "driver_risk_flag.review", commandId),
                new ReviewRequest(flagId, expectedVersion, confirm, why), Flag.class, () -> {
                    Flag locked = find(flagId, true).orElseThrow(JdbcDriverRiskFlags::notFound);
                    if (locked.version() != expectedVersion) {
                        throw ConflictException.version(locked.version(), "The flag changed: expected version "
                                + expectedVersion + ", current " + locked.version());
                    }
                    if (locked.state() != State.OPEN) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT, "The flag was already reviewed");
                    }
                    State to = confirm ? State.CONFIRMED : State.DISMISSED;
                    jdbc.sql("""
                                    update driver_risk_flag
                                    set state = :state, reviewed_by = :staff, reviewed_at = :now,
                                        review_reason = :reason, version = version + 1
                                    where id = :id""")
                            .param("state", to.name()).param("staff", actor.id()).param("now", now())
                            .param("reason", why).param("id", flagId).update();
                    audit.record(new AuditEntry(actor, confirm ? "driver_risk_flag.confirm" : "driver_risk_flag.dismiss",
                            "driver_risk_flag", flagId.toString(), why, Map.of("state", State.OPEN.name()),
                            Map.of("state", to.name(), "driver_id", locked.driverId().toString())));
                    return find(flagId, false).orElseThrow();
                });
    }

    /** The flag's city; a flag of no city (DUPLICATE_DOCUMENT) needs all cities (AGENTS.md). */
    private void requireFor(Actor actor, UUID cityId) {
        if (cityId != null) {
            staff.require(actor, RISK_PERMISSION, cityId);
        } else if (!staff.scope(actor, RISK_PERMISSION).allCities()) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "A flag of no city needs all cities");
        }
    }

    /**
     * An automatic flag, in the caller's transaction; a second one with the same {@code dedupeKey} (one per work
     * session and hour) is not raised. Returns whether a flag was raised.
     */
    boolean raiseAutomatic(UUID driverId, UUID cityId, Kind kind, Map<String, Object> evidence, String dedupeKey,
                           OffsetDateTime at) {
        UUID id = UUID.randomUUID();
        int raised = jdbc.sql("""
                        insert into driver_risk_flag (id, driver_id, city_id, kind, evidence, dedupe_key, raised_at)
                        values (:id, :driver, :city, :kind, cast(:evidence as jsonb), :key, :at)
                        on conflict (dedupe_key) do nothing""")
                .param("id", id).param("driver", driverId).param("city", cityId).param("kind", kind.name())
                .param("evidence", json.writeValueAsString(evidence)).param("key", dedupeKey).param("at", at)
                .update();
        if (raised == 1) {
            Map<String, Object> after = new LinkedHashMap<>();
            after.put("driver_id", driverId.toString());
            if (cityId != null) {
                after.put("city_id", cityId.toString());
            }
            after.put("kind", kind.name());
            audit.record(new AuditEntry(Actor.system(), "driver_risk_flag.raise", "driver_risk_flag", id.toString(),
                    null, null, after));
        }
        return raised == 1;
    }

    @Override
    @Transactional(readOnly = true)
    public boolean concerns(UUID flagId, UUID driverId) {
        return flagId != null && driverId != null && jdbc.sql(
                        "select count(*) from driver_risk_flag where id = :id and driver_id = :driver")
                .param("id", flagId).param("driver", driverId).query(Long.class).single() > 0;
    }

    private Optional<Flag> find(UUID flagId, boolean lock) {
        return jdbc.sql(SELECT + " where id = :id" + (lock ? " for update" : "")).param("id", flagId)
                .query((rs, i) -> map(rs)).optional();
    }

    @SuppressWarnings("unchecked")
    private Flag map(ResultSet rs) throws SQLException {
        return new Flag(rs.getObject("id", UUID.class), rs.getObject("driver_id", UUID.class),
                rs.getObject("city_id", UUID.class), Kind.valueOf(rs.getString("kind")),
                State.valueOf(rs.getString("state")), json.readValue(rs.getString("evidence"), Map.class),
                rs.getObject("raised_by", UUID.class), rs.getObject("raised_at", OffsetDateTime.class),
                rs.getString("reason"), rs.getObject("reviewed_by", UUID.class),
                rs.getObject("reviewed_at", OffsetDateTime.class), rs.getString("review_reason"),
                rs.getLong("version"));
    }

    private static String reason(String reason) {
        String why = reason == null ? "" : reason.strip();
        if (why.isEmpty() || why.length() > 1000) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "A reason of at most 1000 characters is required");
        }
        return why;
    }

    private static DomainException notFound() {
        return new DomainException(ErrorCode.NOT_FOUND, "Risk flag not found");
    }

    private OffsetDateTime now() {
        return OffsetDateTime.now(clock).withOffsetSameInstant(ZoneOffset.UTC);
    }
}
