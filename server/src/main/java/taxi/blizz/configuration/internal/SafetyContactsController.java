package taxi.blizz.configuration.internal;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.configuration.SafetyContacts;
import taxi.blizz.identity.AccessClaims;

/** The safety contacts of a city in the admin panel — admin.v1.yaml (REQ-RID-09). */
@RestController
class SafetyContactsController {

    private final SafetyContacts contacts;

    SafetyContactsController(SafetyContacts contacts) {
        this.contacts = contacts;
    }

    record Change(@NotNull UUID commandId, @NotNull @Min(0) Long expectedVersion, @NotBlank String emergencyNumber,
                  String supportPhone, List<SafetyContacts.Extra> extra, @NotBlank String reason) {
    }

    @GetMapping("/api/admin/v1/settings/safety-contacts/{cityId}")
    SafetyContacts.Version current(AccessClaims claims, @PathVariable UUID cityId) {
        return contacts.current(claims.actor(), cityId);
    }

    @PostMapping("/api/admin/v1/settings/safety-contacts/{cityId}")
    SafetyContacts.Version change(AccessClaims claims, @PathVariable UUID cityId, @Valid @RequestBody Change body) {
        return contacts.change(claims.actor(), body.commandId(), cityId, body.expectedVersion(),
                new SafetyContacts.Contacts(body.emergencyNumber(), body.supportPhone(), body.extra()),
                body.reason());
    }
}
