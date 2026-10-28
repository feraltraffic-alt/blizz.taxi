package taxi.blizz.identity.internal;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.identity.ChallengeIssued;
import taxi.blizz.identity.PersonalDataExports;

/** A rider's copy of their personal data — rider.v1.yaml and admin.v1.yaml (REQ-PRV-07, issue #68). */
@RestController
class PersonalDataExportController {

    private final PersonalDataExports exports;

    PersonalDataExportController(PersonalDataExports exports) {
        this.exports = exports;
    }

    record CodeResponse(UUID challengeId, OffsetDateTime expiresAt, OffsetDateTime resendAvailableAt) {
    }

    record RequestExport(@NotNull UUID commandId, @NotNull UUID challengeId,
                         @NotNull @Pattern(regexp = "^[0-9]{4,8}$") String otpCode) {
    }

    record ExportList(List<PersonalDataExports.Export> exports) {
    }

    @PostMapping("/api/rider/v1/me/data-exports/challenge")
    @ResponseStatus(HttpStatus.CREATED)
    CodeResponse code(AccessClaims claims, HttpServletRequest request) {
        ChallengeIssued issued = exports.requestCode(claims.actor(), null, request.getRemoteAddr());
        return new CodeResponse(issued.challengeId(), issued.expiresAt(), issued.resendAvailableAt());
    }

    @PostMapping("/api/rider/v1/me/data-exports")
    ResponseEntity<PersonalDataExports.Export> request(AccessClaims claims, @Valid @RequestBody RequestExport body) {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(exports.request(claims.actor(), body.commandId(),
                body.challengeId(), body.otpCode()));
    }

    @GetMapping("/api/rider/v1/me/data-exports")
    ExportList mine(AccessClaims claims) {
        return new ExportList(exports.mine(claims.actor()));
    }

    @GetMapping("/api/rider/v1/me/data-exports/{exportId}")
    PersonalDataExports.Export get(AccessClaims claims, @PathVariable UUID exportId) {
        return exports.get(claims.actor(), exportId);
    }

    @GetMapping("/api/rider/v1/me/data-exports/{exportId}/file")
    ResponseEntity<byte[]> file(AccessClaims claims, @PathVariable UUID exportId) {
        PersonalDataExports.File file = exports.download(claims.actor(), exportId);
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON)
                .header(HttpHeaders.CONTENT_DISPOSITION,
                        ContentDisposition.attachment().filename(file.name()).build().toString())
                .header(HttpHeaders.CACHE_CONTROL, "no-store")
                .body(file.content());
    }

    @GetMapping("/api/admin/v1/clients/{clientId}/data-exports")
    ExportList ofClient(AccessClaims claims, @PathVariable UUID clientId) {
        return new ExportList(exports.ofClient(claims.actor(), clientId));
    }
}
