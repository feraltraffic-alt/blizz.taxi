package taxi.blizz.operations.internal;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.UUID;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.operations.Tips;

/** Tips after a fulfilled trip (rider.v1.yaml, ADR 0012). */
@RestController
class TipController {

    private final Tips tips;

    TipController(Tips tips) {
        this.tips = tips;
    }

    record Leave(@NotNull UUID commandId, @NotNull Long amountMinor) {
    }

    @GetMapping("/api/rider/v1/orders/{orderId}/tip")
    Tips.Options options(AccessClaims claims, @PathVariable UUID orderId) {
        return tips.options(claims.actor(), orderId);
    }

    @PostMapping("/api/rider/v1/orders/{orderId}/tip")
    @ResponseStatus(HttpStatus.CREATED)
    Tips.Tip leave(AccessClaims claims, @PathVariable UUID orderId, @Valid @RequestBody Leave body) {
        return tips.leave(claims.actor(), body.commandId(), orderId, body.amountMinor());
    }
}
