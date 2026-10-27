package taxi.blizz.configuration.internal;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.configuration.Integrations;
import taxi.blizz.identity.AccessClaims;

/** Keys and settings of integrations in the admin panel (admin.v1.yaml, REQ-ADM-10). */
@RestController
class IntegrationsController {

    private final Integrations integrations;

    IntegrationsController(Integrations integrations) {
        this.integrations = integrations;
    }

    record FieldList(List<Integrations.FieldState> fields) {
    }

    record Change(@NotNull UUID commandId, @NotBlank String password,
                  @NotEmpty List<@Valid Integrations.Change> changes, @NotBlank String reason) {

        @Override
        public String toString() {
            return "Change[commandId=" + commandId + ", changes=" + (changes == null ? 0 : changes.size()) + "]";
        }
    }

    @GetMapping("/api/admin/v1/integrations")
    FieldList list(AccessClaims claims) {
        return new FieldList(integrations.list(claims.actor()));
    }

    @PostMapping("/api/admin/v1/integrations")
    FieldList change(AccessClaims claims, @Valid @RequestBody Change body) {
        return new FieldList(integrations.change(claims.actor(), body.commandId(), body.password(), body.changes(),
                body.reason()));
    }

    @PostMapping("/api/admin/v1/integrations/{group}/check")
    Integrations.Check check(AccessClaims claims, @PathVariable String group) {
        return integrations.check(claims.actor(), group);
    }
}
