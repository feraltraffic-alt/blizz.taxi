package taxi.blizz.identity.internal;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.identity.EmergencyAccess;

/** Emergency access in the admin panel (admin.v1.yaml, REQ-SEC-10). */
@RestController
class EmergencyAccessController {

    private final EmergencyAccess emergency;

    EmergencyAccessController(EmergencyAccess emergency) {
        this.emergency = emergency;
    }

    record GrantBody(@NotNull UUID commandId, @NotNull Set<String> permissions, @NotNull Boolean allCities,
                     Set<UUID> cityIds, @NotNull @Min(5) @Max(480) Integer minutes, @NotBlank String reason) {
    }

    record RevokeBody(@NotNull UUID commandId, @NotBlank String reason) {
    }

    record GrantList(List<EmergencyAccess.Grant> grants) {
    }

    record ActivityList(List<EmergencyAccess.Activity> activity) {
    }

    @PostMapping("/api/admin/v1/staff/{staffId}/emergency-grants")
    ResponseEntity<EmergencyAccess.Grant> grant(AccessClaims claims, @PathVariable UUID staffId,
                                                @Valid @RequestBody GrantBody body) {
        return ResponseEntity.status(HttpStatus.CREATED).body(emergency.grant(claims.actor(), body.commandId(),
                staffId, body.permissions(), body.allCities(), body.cityIds(), Duration.ofMinutes(body.minutes()),
                body.reason()));
    }

    @PostMapping("/api/admin/v1/emergency-grants/{grantId}/revoke")
    EmergencyAccess.Grant revoke(AccessClaims claims, @PathVariable UUID grantId, @Valid @RequestBody RevokeBody body) {
        return emergency.revoke(claims.actor(), body.commandId(), grantId, body.reason());
    }

    @GetMapping("/api/admin/v1/emergency-grants")
    GrantList list(AccessClaims claims, @RequestParam(defaultValue = "false") boolean active) {
        return new GrantList(emergency.list(claims.actor(), active));
    }

    @GetMapping("/api/admin/v1/emergency-grants/{grantId}/activity")
    ActivityList activity(AccessClaims claims, @PathVariable UUID grantId) {
        return new ActivityList(emergency.activity(claims.actor(), grantId));
    }

    @GetMapping({"/api/admin/v1/me/emergency-grants", "/api/operator/v1/me/emergency-grants"})
    GrantList mine(AccessClaims claims) {
        return new GrantList(emergency.mine(claims.actor()));
    }
}
