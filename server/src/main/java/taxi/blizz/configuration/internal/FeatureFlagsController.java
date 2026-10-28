package taxi.blizz.configuration.internal;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.configuration.FeatureFlags;
import taxi.blizz.identity.AccessClaims;

/** Feature flags in the admin panel (REQ-ENG-14) — admin.v1.yaml. */
@RestController
class FeatureFlagsController {

    private final FeatureFlags flags;

    FeatureFlagsController(FeatureFlags flags) {
        this.flags = flags;
    }

    record Item(String key, String description, String owner, LocalDate reviewBy, boolean defaultEnabled,
                boolean enabled, long version, UUID changedBy, String reason, OffsetDateTime changedAt) {
    }

    record ItemList(List<Item> flags) {
    }

    record Change(@NotNull UUID commandId, @NotNull @Min(0) Long expectedVersion, @NotNull Boolean enabled,
                  @NotBlank String reason) {
    }

    static String description(FeatureFlags.Flag flag) {
        return switch (flag) {
            case CARD_PAYMENTS -> "New orders paid by a saved card. Off: new card orders are refused; "
                    + "orders already made are still paid as begun.";
        };
    }

    private static Item item(FeatureFlags.State s) {
        FeatureFlags.Flag f = s.flag();
        return new Item(f.key(), description(f), f.owner(), f.reviewBy(), f.defaultEnabled(), s.enabled(),
                s.version(), s.changedBy(), s.reason(), s.changedAt());
    }

    @GetMapping("/api/admin/v1/feature-flags")
    ItemList all(AccessClaims claims) {
        return new ItemList(flags.all(claims.actor()).stream().map(FeatureFlagsController::item).toList());
    }

    @PostMapping("/api/admin/v1/feature-flags/{key}/change")
    Item change(AccessClaims claims, @PathVariable String key, @Valid @RequestBody Change body) {
        return item(flags.change(claims.actor(), body.commandId(), key, body.expectedVersion(), body.enabled(),
                body.reason()));
    }
}
