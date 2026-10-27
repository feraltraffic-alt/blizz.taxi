package taxi.blizz.operatorbonus.internal;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.List;
import java.util.UUID;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.operatorbonus.OperatorBonuses;

@RestController
class OperatorBonusController {

    private final OperatorBonuses bonuses;

    OperatorBonusController(OperatorBonuses bonuses) {
        this.bonuses = bonuses;
    }

    record Accounts(List<OperatorBonuses.Account> accounts) {}
    record Entries(List<OperatorBonuses.Entry> entries) {}
    record Periods(List<OperatorBonuses.ClosedPeriod> periods) {}

    record Change(@NotNull UUID commandId, @NotNull @Min(0) Long expectedVersion,
                  @NotNull OperatorBonuses.Settings settings,
                  @NotBlank @Size(max = 500) String reason) {}

    @GetMapping("/api/operator/v1/me/bonus")
    OperatorBonuses.Account mine(AccessClaims claims, @RequestParam(defaultValue = "20") int limit) {
        return bonuses.mine(claims.actor(), limit);
    }

    @GetMapping("/api/admin/v1/operator-bonuses")
    Accounts accounts(AccessClaims claims) {
        return new Accounts(bonuses.accounts(claims.actor()));
    }

    @GetMapping("/api/admin/v1/operator-bonuses/{staffId}/history")
    Entries history(AccessClaims claims, @PathVariable UUID staffId,
                    @RequestParam(defaultValue = "50") int limit) {
        return new Entries(bonuses.history(claims.actor(), staffId, limit));
    }

    @GetMapping("/api/admin/v1/operator-bonuses/periods")
    Periods periods(AccessClaims claims, @RequestParam(defaultValue = "50") int limit) {
        return new Periods(bonuses.periods(claims.actor(), limit));
    }

    @GetMapping("/api/admin/v1/settings/operator-bonuses")
    OperatorBonuses.SettingsVersion settings(AccessClaims claims) {
        return bonuses.currentSettings(claims.actor());
    }

    @PostMapping("/api/admin/v1/settings/operator-bonuses")
    OperatorBonuses.SettingsVersion change(AccessClaims claims, @Valid @RequestBody Change body) {
        return bonuses.changeSettings(claims.actor(), body.commandId(), body.expectedVersion(), body.settings(), body.reason());
    }
}
