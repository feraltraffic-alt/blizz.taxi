package taxi.blizz.operations.internal;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.audit.AuditEntry;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.operations.DriverRiskFlags;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.CommandKey;
import taxi.blizz.platform.ConflictException;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;
import taxi.blizz.platform.IdempotentCommands;

/**
 * Pauses of a driver's new orders for cancellations (ADR 0018 B6–B8) in the admin panel — admin.v1.yaml. Seeing and
 * lifting one needs {@code drivers.risk} for the pause's city (a super admin has it); a lift needs a reason and is
 * audited. Lifting ends the pause at once; the cancellations stay counted.
 */
@RestController
@RequestMapping("/api/admin/v1/driver-pauses")
class DriverPauseController {

    private final JdbcClient jdbc;
    private final IdempotentCommands commands;
    private final StaffAccess staff;
    private final AuditLog audit;
    private final Clock clock;

    DriverPauseController(JdbcClient jdbc, IdempotentCommands commands, StaffAccess staff, AuditLog audit,
                          Clock clock) {
        this.jdbc = jdbc;
        this.commands = commands;
        this.staff = staff;
        this.audit = audit;
        this.clock = clock;
    }

    record PauseView(UUID id, UUID driverId, UUID cityId, String kind, int level, OffsetDateTime startsAt,
                     OffsetDateTime endsAt, boolean active, OffsetDateTime liftedAt, UUID liftedBy, String liftReason,
                     long version) {
    }

    record PauseList(List<PauseView> pauses) {
    }

    record Lift(@NotNull UUID commandId, @NotNull @Min(1) Long expectedVersion,
                @NotBlank @Size(max = 1000) String reason) {
    }

    record LiftRequest(UUID pauseId, long expectedVersion, String reason) {
    }

    private static final String SELECT = """
            select id, driver_id, city_id, kind, level, starts_at, ends_at, lifted_at, lifted_by, lift_reason, version
            from driver_pause""";

    /** The driver's pauses, newest first, in the staff member's cities. */
    @GetMapping
    @Transactional(readOnly = true)
    PauseList list(AccessClaims claims, @RequestParam(name = "driver_id") UUID driverId) {
        Actor actor = claims.actor();
        StaffAccess.Scope scope = staff.scope(actor, DriverRiskFlags.RISK_PERMISSION);
        if (!scope.allCities() && scope.cityIds().isEmpty()) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Missing permission " + DriverRiskFlags.RISK_PERMISSION);
        }
        List<PauseView> all = jdbc.sql(SELECT + " where driver_id = :driver order by starts_at desc limit 100")
                .param("driver", driverId).query((rs, i) -> map(rs)).list();
        return new PauseList(all.stream().filter(p -> allowed(actor, p.cityId())).toList());
    }

    @PostMapping("/{pauseId}/lift")
    PauseView lift(AccessClaims claims, @PathVariable UUID pauseId, @Valid @RequestBody Lift body) {
        Actor actor = claims.actor();
        PauseView before = find(pauseId, false);
        staff.require(actor, DriverRiskFlags.RISK_PERMISSION, before.cityId());
        String why = body.reason().strip();
        return commands.execute(new CommandKey(actor, "driver_pause.lift", body.commandId()),
                new LiftRequest(pauseId, body.expectedVersion(), why), PauseView.class, () -> {
                    PauseView locked = find(pauseId, true);
                    if (locked.version() != body.expectedVersion()) {
                        throw ConflictException.version(locked.version(), "The pause changed");
                    }
                    if (!locked.active()) {
                        throw new DomainException(ErrorCode.STATE_CONFLICT, "The pause is already over");
                    }
                    jdbc.sql("""
                                    update driver_pause set lifted_at = :now, lifted_by = :staff, lift_reason = :reason,
                                                            version = version + 1
                                    where id = :id""")
                            .param("now", now()).param("staff", actor.id()).param("reason", why).param("id", pauseId)
                            .update();
                    PauseView after = find(pauseId, false);
                    audit.record(new AuditEntry(actor, "driver_pause.lift", "driver_pause", pauseId.toString(), why,
                            Map.of("ends_at", locked.endsAt().toString()),
                            Map.of("lifted_at", after.liftedAt().toString(), "driver_id", after.driverId().toString())));
                    return after;
                });
    }

    private boolean allowed(Actor actor, UUID cityId) {
        try {
            staff.require(actor, DriverRiskFlags.RISK_PERMISSION, cityId);
            return true;
        } catch (DomainException e) {
            return false;
        }
    }

    private PauseView find(UUID pauseId, boolean lock) {
        return jdbc.sql(SELECT + " where id = :id" + (lock ? " for update" : "")).param("id", pauseId)
                .query((rs, i) -> map(rs)).optional()
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "Pause not found"));
    }

    private PauseView map(java.sql.ResultSet rs) throws java.sql.SQLException {
        OffsetDateTime endsAt = rs.getObject("ends_at", OffsetDateTime.class);
        OffsetDateTime liftedAt = rs.getObject("lifted_at", OffsetDateTime.class);
        return new PauseView(rs.getObject("id", UUID.class), rs.getObject("driver_id", UUID.class),
                rs.getObject("city_id", UUID.class), rs.getString("kind"), rs.getInt("level"),
                rs.getObject("starts_at", OffsetDateTime.class), endsAt, liftedAt == null && endsAt.isAfter(now()),
                liftedAt, rs.getObject("lifted_by", UUID.class), rs.getString("lift_reason"), rs.getLong("version"));
    }

    private OffsetDateTime now() {
        return clock.instant().atOffset(ZoneOffset.UTC);
    }
}
