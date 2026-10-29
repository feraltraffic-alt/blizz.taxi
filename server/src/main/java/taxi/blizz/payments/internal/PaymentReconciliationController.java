package taxi.blizz.payments.internal;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.UUID;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.payments.PaymentReconciliations;

@RestController
class PaymentReconciliationController {
    private final PaymentReconciliations reconciliations;
    PaymentReconciliationController(PaymentReconciliations reconciliations) { this.reconciliations = reconciliations; }

    record Resolve(@NotNull UUID commandId, @NotNull @Min(0) Long expectedVersion,
                   @NotNull PaymentReconciliations.Decision decision, @NotBlank @Size(max=500) String reason) { }

    @GetMapping("/api/admin/v1/payment-reconciliations")
    PaymentReconciliations.Runs list(AccessClaims claims, @RequestParam(name="merchant_id", required=false) UUID merchantId,
                                    @RequestParam(required=false) String cursor,
                                    @RequestParam(defaultValue="50") int limit) {
        return reconciliations.list(claims.actor(), merchantId, cursor, limit);
    }
    @GetMapping("/api/admin/v1/payment-reconciliations/{id}")
    PaymentReconciliations.Detail get(AccessClaims claims, @PathVariable UUID id,
                                     @RequestParam(required=false) UUID after,
                                     @RequestParam(defaultValue="100") int limit) {
        return reconciliations.get(claims.actor(), id, after, limit);
    }
    @PostMapping("/api/admin/v1/payment-reconciliations/items/{id}/resolve")
    PaymentReconciliations.Item resolve(AccessClaims claims, @PathVariable UUID id, @Valid @RequestBody Resolve body) {
        return reconciliations.resolve(claims.actor(), body.commandId(), id, body.expectedVersion(), body.decision(), body.reason());
    }
}
