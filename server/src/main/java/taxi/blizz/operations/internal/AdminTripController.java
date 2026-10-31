package taxi.blizz.operations.internal;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.operations.TripCorrections;

/** A trip's facts and their corrections in the admin panel — admin.v1.yaml (issue #142). */
@RestController
class AdminTripController {

    private final TripCorrections corrections;

    AdminTripController(TripCorrections corrections) {
        this.corrections = corrections;
    }

    record Correction(@NotNull UUID commandId, @NotNull @Min(0) Long expectedVersion, Boolean startedByMistake,
                      OffsetDateTime startedAt, OffsetDateTime completedAt,
                      @NotBlank @Size(max = 500) String reason) {
    }

    record Review(@NotNull UUID commandId, @NotBlank @Size(max = 500) String reason) {
    }

    @GetMapping("/api/admin/v1/orders/{orderId}/trip-facts")
    TripCorrections.Facts facts(AccessClaims claims, @PathVariable UUID orderId) {
        return corrections.facts(claims.actor(), orderId);
    }

    @PostMapping("/api/admin/v1/orders/{orderId}/trip-corrections")
    TripCorrections.Facts correct(AccessClaims claims, @PathVariable UUID orderId,
                                  @Valid @RequestBody Correction body) {
        return corrections.correct(claims.actor(), body.commandId(), orderId, body.expectedVersion(),
                new TripCorrections.Change(Boolean.TRUE.equals(body.startedByMistake()), body.startedAt(),
                        body.completedAt()), body.reason());
    }

    @PostMapping("/api/admin/v1/orders/{orderId}/trip-corrections/review")
    TripCorrections.Facts review(AccessClaims claims, @PathVariable UUID orderId, @Valid @RequestBody Review body) {
        return corrections.review(claims.actor(), body.commandId(), orderId, body.reason());
    }
}
