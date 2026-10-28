package taxi.blizz.identity.internal;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.identity.StaffDirectory;
import taxi.blizz.identity.StaffPermissions;
import taxi.blizz.platform.CorrelationTrail;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;

/**
 * The logs of all staff, filterable by role and member (owner decision 27.10.2026): what each one did in the
 * admin panel and operator workstation, and what each change was. Needs {@code audit.view} (super admin has it).
 */
@RestController
class StaffLogsController {

    private final StaffAccess access;
    private final StaffActivityLog activity;
    private final AuditLog audit;
    private final List<CorrelationTrail> trails;

    StaffLogsController(StaffAccess access, StaffActivityLog activity, AuditLog audit, List<CorrelationTrail> trails) {
        this.access = access;
        this.activity = activity;
        this.audit = audit;
        this.trails = trails;
    }

    record Trail(List<CorrelationTrail.Found> found) {
    }

    /** What one request or job touched (REQ-OBS-01/04, issue #81): types and ids only, oldest first, at most 200. */
    @GetMapping("/api/admin/v1/logs/correlation/{correlationId}")
    Trail correlation(AccessClaims claims, @PathVariable UUID correlationId) {
        access.require(claims.actor(), StaffPermissions.AUDIT_VIEW);
        return new Trail(trails.stream().flatMap(t -> t.find(correlationId, LIMIT).stream())
                .sorted(java.util.Comparator.comparing(CorrelationTrail.Found::at)
                        .thenComparing(CorrelationTrail.Found::type).thenComparing(CorrelationTrail.Found::id))
                .limit(LIMIT).toList());
    }

    private static final int LIMIT = 200;

    record ActivityPage(List<StaffActivityLog.Entry> entries) {
    }

    record ChangesPage(List<AuditLog.Record> changes) {
    }

    @GetMapping("/api/admin/v1/logs/activity")
    ActivityPage activity(AccessClaims claims,
                          @RequestParam(required = false) StaffDirectory.Role role,
                          @RequestParam(name = "staff_id", required = false) UUID staffId,
                          @RequestParam(required = false) String kind,
                          @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) OffsetDateTime from,
                          @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) OffsetDateTime to,
                          @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) OffsetDateTime before,
                          @RequestParam(defaultValue = "50") int limit) {
        access.require(claims.actor(), StaffPermissions.AUDIT_VIEW);
        if (kind != null && !kind.equals("REQUEST") && !kind.equals("SIGN_IN")) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "kind is REQUEST or SIGN_IN");
        }
        return new ActivityPage(activity.find(new StaffActivityLog.Query(role == null ? null : role.name(), staffId,
                kind, from, to, before, limit)));
    }

    @GetMapping("/api/admin/v1/logs/changes")
    ChangesPage changes(AccessClaims claims,
                        @RequestParam(required = false) StaffDirectory.Role role,
                        @RequestParam(name = "staff_id", required = false) UUID staffId,
                        @RequestParam(required = false) String action,
                        @RequestParam(name = "resource_type", required = false) String resourceType,
                        @RequestParam(name = "resource_id", required = false) String resourceId,
                        @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) OffsetDateTime from,
                        @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) OffsetDateTime to,
                        @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) OffsetDateTime before,
                        @RequestParam(defaultValue = "50") int limit) {
        access.require(claims.actor(), StaffPermissions.AUDIT_VIEW);
        return new ChangesPage(audit.find(new AuditLog.Query("STAFF", staffId, role == null ? null : role.name(),
                action, resourceType, resourceId, from, to, before, limit)));
    }
}
