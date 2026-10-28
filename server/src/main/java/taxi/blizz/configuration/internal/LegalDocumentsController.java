package taxi.blizz.configuration.internal;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.configuration.LegalDocuments;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;

/** Legal texts: admin, the apps and the public text before sign-in (REQ-PRV-08, issue #69). */
@RestController
class LegalDocumentsController {

    private final LegalDocuments legal;

    LegalDocumentsController(LegalDocuments legal) {
        this.legal = legal;
    }

    record CreateDraft(@NotNull UUID commandId, @NotNull LegalDocuments.Audience audience,
                       @NotNull LegalDocuments.Kind kind, @NotNull Map<String, String> texts,
                       @NotNull Boolean acceptanceRequired, @NotNull OffsetDateTime effectiveFrom) {
    }

    record UpdateDraft(@NotNull UUID commandId, @NotNull @Min(0) Long expectedVersion,
                       @NotNull Map<String, String> texts, @NotNull Boolean acceptanceRequired,
                       @NotNull OffsetDateTime effectiveFrom) {
    }

    record Publish(@NotNull UUID commandId, @NotNull @Min(0) Long expectedVersion) {
    }

    record Accept(@NotNull UUID commandId, @NotNull UUID versionId, @NotNull String language) {
    }

    record VersionList(List<LegalDocuments.Version> versions) {
    }

    record InForceList(List<LegalDocuments.InForce> documents) {
    }

    // ---------------------------------------------------------------- admin

    @PostMapping("/api/admin/v1/legal-documents")
    ResponseEntity<LegalDocuments.Version> create(AccessClaims claims, @Valid @RequestBody CreateDraft body) {
        return ResponseEntity.status(HttpStatus.CREATED).body(legal.createDraft(claims.actor(), body.commandId(),
                body.audience(), body.kind(), new LegalDocuments.Draft(body.texts(), body.acceptanceRequired(),
                        body.effectiveFrom())));
    }

    @GetMapping("/api/admin/v1/legal-documents")
    VersionList versions(AccessClaims claims, @RequestParam(required = false) LegalDocuments.Audience audience,
                         @RequestParam(required = false) LegalDocuments.Kind kind) {
        return new VersionList(legal.versions(claims.actor(), audience, kind));
    }

    @PostMapping("/api/admin/v1/legal-documents/{versionId}")
    LegalDocuments.Version update(AccessClaims claims, @PathVariable UUID versionId,
                                  @Valid @RequestBody UpdateDraft body) {
        return legal.updateDraft(claims.actor(), body.commandId(), versionId, body.expectedVersion(),
                new LegalDocuments.Draft(body.texts(), body.acceptanceRequired(), body.effectiveFrom()));
    }

    @PostMapping("/api/admin/v1/legal-documents/{versionId}/publish")
    LegalDocuments.Version publish(AccessClaims claims, @PathVariable UUID versionId,
                                   @Valid @RequestBody Publish body) {
        return legal.publish(claims.actor(), body.commandId(), versionId, body.expectedVersion());
    }

    // ---------------------------------------------------------------- the apps

    @GetMapping({"/api/rider/v1/legal", "/api/driver/v1/legal"})
    InForceList inForce(AccessClaims claims) {
        return new InForceList(legal.inForce(claims.actor()));
    }

    @PostMapping({"/api/rider/v1/legal/acceptances", "/api/driver/v1/legal/acceptances"})
    LegalDocuments.Acceptance accept(AccessClaims claims, @Valid @RequestBody Accept body) {
        return legal.accept(claims.actor(), body.commandId(), body.versionId(), body.language(), claims.sessionId());
    }

    /** Public: what the apps show before sign-in. */
    @GetMapping("/api/config/v1/legal/{audience}/{kind}")
    LegalDocuments.Text text(@PathVariable String audience, @PathVariable String kind,
                             @RequestParam(defaultValue = "en") String language) {
        LegalDocuments.Audience a;
        LegalDocuments.Kind k;
        try {
            a = LegalDocuments.Audience.valueOf(audience.toUpperCase(java.util.Locale.ROOT));
            k = LegalDocuments.Kind.valueOf(kind.toUpperCase(java.util.Locale.ROOT));
        } catch (IllegalArgumentException e) {
            throw new DomainException(ErrorCode.NOT_FOUND, "No such legal text");
        }
        return legal.text(a, k, language)
                .orElseThrow(() -> new DomainException(ErrorCode.NOT_FOUND, "No version in force"));
    }
}
