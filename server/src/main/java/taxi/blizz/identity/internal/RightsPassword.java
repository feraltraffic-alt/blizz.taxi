package taxi.blizz.identity.internal;

import java.util.Map;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.support.TransactionTemplate;
import taxi.blizz.audit.AuditEntry;
import taxi.blizz.audit.AuditLog;
import taxi.blizz.identity.StaffSignIn;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;

/**
 * Changes of staff rights, and a reset of another member's password, which hands the account over (#173), ask
 * for the acting staff member's own password (REQ-ADM-10, issue #142), as merchant and integration changes do. A
 * missing or wrong password is counted like a failed sign-in ({@link StaffSignIn}) and the refused attempt is audited as {@code <action>.denied} in a transaction of its own, so the refusal keeps the trace.
 * Call before the command's own transaction.
 */
@Component
class RightsPassword {

    private final StaffSignIn signIn;
    private final AuditLog audit;
    private final TransactionTemplate separate;

    RightsPassword(StaffSignIn signIn, AuditLog audit, PlatformTransactionManager transactions) {
        this.signIn = signIn;
        this.audit = audit;
        this.separate = new TransactionTemplate(transactions);
        this.separate.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW);
    }

    /** {@code attempted}: what the refused change would have set, for the audit; never the password. */
    void confirm(Actor actor, String password, String action, String resourceType, String resourceId, String reason,
                 Map<String, Object> attempted) {
        try {
            signIn.confirmPassword(actor, password);
        } catch (DomainException refused) {
            separate.executeWithoutResult(status -> audit.record(new AuditEntry(actor, action + ".denied", resourceType,
                    resourceId, password == null || password.isEmpty() ? "No password" : "Wrong password", null,
                    Map.of("attempted", attempted, "reason", reason == null ? "" : reason))));
            throw refused;
        }
    }
}
