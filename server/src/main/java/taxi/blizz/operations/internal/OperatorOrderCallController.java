package taxi.blizz.operations.internal;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.UUID;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.telephony.Calls;

/** Click-to-call from an order in the operator workstation — operator.v1.yaml (issue #67). */
@RestController
class OperatorOrderCallController {

    private final OperatorOrderCalls calls;

    OperatorOrderCallController(OperatorOrderCalls calls) {
        this.calls = calls;
    }

    record PlaceCall(@NotNull UUID commandId, @NotNull Calls.Party to) {
    }

    @PostMapping("/api/operator/v1/orders/{orderId}/calls")
    @ResponseStatus(HttpStatus.CREATED)
    Calls.Call place(AccessClaims claims, @PathVariable UUID orderId, @Valid @RequestBody PlaceCall body) {
        return calls.place(claims.actor(), body.commandId(), orderId, body.to());
    }
}
