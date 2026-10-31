package taxi.blizz.operations.internal;

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
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.operations.FareCorrections;

/** A fulfilled order's final fare and its corrections in the admin panel — admin.v1.yaml (issue #142). */
@RestController
class AdminFareController {

    private final FareCorrections corrections;

    AdminFareController(FareCorrections corrections) {
        this.corrections = corrections;
    }

    record Correction(@NotNull UUID commandId, @NotNull @Min(1) Integer expectedVersion,
                      @NotNull @Min(0) Long amountMinor, @NotBlank @Size(max = 500) String reason,
                      @NotBlank String password) {
    }

    @GetMapping("/api/admin/v1/orders/{orderId}/fare")
    FareCorrections.View fare(AccessClaims claims, @PathVariable UUID orderId) {
        return corrections.fare(claims.actor(), orderId);
    }

    @PostMapping("/api/admin/v1/orders/{orderId}/fare-corrections")
    FareCorrections.View correct(AccessClaims claims, @PathVariable UUID orderId,
                                 @Valid @RequestBody Correction body) {
        return corrections.correct(claims.actor(), body.commandId(), orderId, body.expectedVersion(),
                body.amountMinor(), body.reason(), body.password());
    }
}
