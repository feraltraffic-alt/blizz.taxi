package taxi.blizz.backoffice.internal;

import java.util.UUID;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.identity.AccessClaims;

/** The evidence of an order for a chargeback (REQ-PAY-23); see {@link OrderEvidence}. */
@RestController
class OrderEvidenceController {

    private final OrderEvidence evidence;

    OrderEvidenceController(OrderEvidence evidence) {
        this.evidence = evidence;
    }

    @GetMapping("/api/admin/v1/orders/{orderId}/evidence")
    OrderEvidence.Evidence evidence(AccessClaims claims, @PathVariable UUID orderId,
                                    @RequestParam(required = false) String reason) {
        return evidence.of(claims.actor(), orderId, reason);
    }
}
