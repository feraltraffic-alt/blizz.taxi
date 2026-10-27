package taxi.blizz.promotions.internal;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.promotions.RiderPromotions;

/** Promotions for riders in the admin panel (admin.v1.yaml, ADR 0009). */
@RestController
class PromotionController {

    private final RiderPromotions promotions;

    PromotionController(RiderPromotions promotions) {
        this.promotions = promotions;
    }

    record PromotionList(List<RiderPromotions.Promotion> promotions) {
    }

    record Create(@NotNull UUID commandId, @NotNull RiderPromotions.Draft promotion, @NotBlank String reason) {
    }

    record Change(@NotNull UUID commandId, @NotNull @Min(1) Long expectedVersion,
                  @NotNull RiderPromotions.Draft promotion, @NotBlank String reason) {
    }

    record Archive(@NotNull UUID commandId, @NotNull @Min(1) Long expectedVersion, @NotBlank String reason) {
    }

    @GetMapping("/api/admin/v1/promotions")
    PromotionList list(AccessClaims claims, @RequestParam(defaultValue = "false") boolean includeArchived) {
        return new PromotionList(promotions.list(claims.actor(), includeArchived));
    }

    @PostMapping("/api/admin/v1/promotions")
    @ResponseStatus(HttpStatus.CREATED)
    RiderPromotions.Promotion create(AccessClaims claims, @Valid @RequestBody Create body) {
        return promotions.create(claims.actor(), body.commandId(), body.promotion(), body.reason());
    }

    @PostMapping("/api/admin/v1/promotions/{promotionId}/change")
    RiderPromotions.Promotion change(AccessClaims claims, @PathVariable UUID promotionId,
                                     @Valid @RequestBody Change body) {
        return promotions.change(claims.actor(), body.commandId(), promotionId, body.expectedVersion(),
                body.promotion(), body.reason());
    }

    @PostMapping("/api/admin/v1/promotions/{promotionId}/archive")
    RiderPromotions.Promotion archive(AccessClaims claims, @PathVariable UUID promotionId,
                                      @Valid @RequestBody Archive body) {
        return promotions.archive(claims.actor(), body.commandId(), promotionId, body.expectedVersion(),
                body.reason());
    }
}
