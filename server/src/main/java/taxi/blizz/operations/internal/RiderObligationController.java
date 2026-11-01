package taxi.blizz.operations.internal;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
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
import taxi.blizz.operations.RiderObligations;
import taxi.blizz.payments.CardTopUps;

/** The rider's obligations and their repayment (REQ-PAY-18) — packages/contracts/openapi/rider.v1.yaml. */
@RestController
class RiderObligationController {

    private final RiderObligations obligations;

    RiderObligationController(RiderObligations obligations) {
        this.obligations = obligations;
    }

    record ObligationList(List<RiderObligations.Obligation> items) {
    }

    record StartRepayment(@NotNull UUID commandId, @Min(1) Long amountMinor) {
    }

    @GetMapping("/api/rider/v1/obligations")
    ObligationList list(AccessClaims claims) {
        return new ObligationList(obligations.list(claims.actor()));
    }

    @PostMapping("/api/rider/v1/obligations/{orderId}/payment-sessions")
    @ResponseStatus(HttpStatus.CREATED)
    CardTopUps.TopUp start(AccessClaims claims, @PathVariable UUID orderId, @Valid @RequestBody StartRepayment body) {
        return obligations.startRepayment(claims.actor(), body.commandId(), orderId, body.amountMinor());
    }

    @GetMapping("/api/rider/v1/payments/{paymentId}")
    CardTopUps.TopUp payment(AccessClaims claims, @PathVariable UUID paymentId) {
        return obligations.payment(claims.actor(), paymentId);
    }
}
