package taxi.blizz.telephony.internal;

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
import taxi.blizz.identity.AccessClaims;

/** The staff's extensions in the admin panel — admin.v1.yaml (issue #67). */
@RestController
class StaffExtensionController {

    private final StaffExtensions extensions;

    StaffExtensionController(StaffExtensions extensions) {
        this.extensions = extensions;
    }

    record ExtensionList(List<StaffExtensions.Extension> extensions) {
    }

    record ChangeBody(@NotNull UUID commandId, @NotNull @Min(0) Long expectedVersion, String extension,
                      @NotBlank String reason) {
    }

    @GetMapping("/api/admin/v1/staff-extensions")
    ExtensionList list(AccessClaims claims) {
        return new ExtensionList(extensions.list(claims.actor()));
    }

    @PostMapping("/api/admin/v1/staff-extensions/{staffId}")
    StaffExtensions.Extension change(AccessClaims claims, @PathVariable UUID staffId,
                                     @Valid @RequestBody ChangeBody body) {
        return extensions.change(claims.actor(), body.commandId(), staffId, body.expectedVersion(),
                body.extension(), body.reason());
    }
}
