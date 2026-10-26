package taxi.blizz.audit;

import java.util.Objects;
import taxi.blizz.platform.Actor;

/**
 * One audited action. {@code before} and {@code after} are snapshots serialized to JSON; callers
 * must leave out secrets, tokens and card data (REQ-SEC-08).
 */
public record AuditEntry(
        Actor actor,
        String action,
        String resourceType,
        String resourceId,
        String reason,
        Object before,
        Object after) {

    public AuditEntry {
        Objects.requireNonNull(actor, "actor");
        Objects.requireNonNull(action, "action");
        Objects.requireNonNull(resourceType, "resourceType");
    }
}
