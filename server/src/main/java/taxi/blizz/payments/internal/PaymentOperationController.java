package taxi.blizz.payments.internal;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.payments.PaymentOperations;

/** An order's card operations and a manual retry of a declined charge (REQ-PAY-14) — admin.v1.yaml. */
@RestController
class PaymentOperationController {

    private final PaymentOperations operations;

    PaymentOperationController(PaymentOperations operations) {
        this.operations = operations;
    }

    record Operations(List<PaymentOperations.Operation> operations) {
    }

    record Retry(@NotNull UUID commandId, @NotBlank String reason) {
    }

    @GetMapping("/api/admin/v1/orders/{orderId}/payment-operations")
    Operations ofOrder(AccessClaims claims, @PathVariable UUID orderId) {
        return new Operations(operations.ofOrder(claims.actor(), orderId));
    }

    @PostMapping("/api/admin/v1/payment-operations/{operationId}/retry")
    @ResponseStatus(HttpStatus.CREATED)
    PaymentOperations.Operation retry(AccessClaims claims, @PathVariable UUID operationId,
                                      @Valid @RequestBody Retry body) {
        return operations.retry(claims.actor(), body.commandId(), operationId, body.reason());
    }
}
