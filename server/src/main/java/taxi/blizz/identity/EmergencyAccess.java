package taxi.blizz.identity;

import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import taxi.blizz.platform.Actor;

/**
 * Emergency access (REQ-SEC-10): a super admin gives another staff member extra permissions — from the catalog —
 * for at most {@link #LONGEST} with a reason; {@link StaffAccess} counts them while the grant lasts. A grant ends by
 * itself or is revoked earlier, is audited and never changes otherwise; what the staff member did meanwhile is the
 * staff activity log of that window. Nobody grants to themselves. This is not how permissions are given normally —
 * the staff directory is.
 */
public interface EmergencyAccess {

    Duration LONGEST = Duration.ofHours(8);

    /** {@code active}: not revoked and not expired at the moment it was read. */
    record Grant(UUID id, UUID staffId, Set<String> permissions, boolean allCities, Set<UUID> cityIds, String reason,
                 UUID grantedBy, OffsetDateTime grantedAt, OffsetDateTime expiresAt, OffsetDateTime revokedAt,
                 UUID revokedBy, String revokeReason, boolean active) {
    }

    /** One request the staff member made while the grant lasted (from the staff activity log). */
    record Activity(OffsetDateTime at, String method, String path, Integer status, String outcome) {
    }

    Grant grant(Actor superAdmin, UUID commandId, UUID staffId, Set<String> permissions, boolean allCities,
                Set<UUID> cityIds, Duration duration, String reason);

    Grant revoke(Actor superAdmin, UUID commandId, UUID grantId, String reason);

    /** For super admins: the latest grants, active ones first. */
    List<Grant> list(Actor superAdmin, boolean activeOnly);

    /** For super admins: what the staff member did during the grant. */
    List<Activity> activity(Actor superAdmin, UUID grantId);

    /** The staff member's own active grants: what they hold and until when. */
    List<Grant> mine(Actor staff);
}
