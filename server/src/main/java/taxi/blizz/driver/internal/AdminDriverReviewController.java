package taxi.blizz.driver.internal;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import org.springframework.core.io.InputStreamResource;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.CacheControl;
import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.driver.DriverAdmission;
import taxi.blizz.driver.DriverProfile;
import taxi.blizz.driver.ReviewDecision;
import taxi.blizz.driver.ReviewStatus;
import taxi.blizz.files.FileContent;
import taxi.blizz.identity.AccessClaims;

/** Driver review in the admin panel (section 6), with {@code driver.review} — admin.v1.yaml. */
@RestController
@RequestMapping("/api/admin/v1/drivers")
class AdminDriverReviewController {

    private final DriverAdmission admission;

    AdminDriverReviewController(DriverAdmission admission) {
        this.admission = admission;
    }

    record Queue(List<DriverAdmission.ReviewItem> drivers) {
    }

    record Decision(@NotNull UUID commandId, @NotNull @Min(0) Long expectedVersion, @NotNull ReviewDecision decision,
                    @NotBlank @Size(max = 1000) String reason, List<String> vehicleClasses,
                    List<UUID> rejectedDocuments) {
    }

    record Change(@NotNull UUID commandId, @NotNull @Min(0) Long expectedVersion,
                  @NotBlank @Size(max = 1000) String reason) {
    }

    @GetMapping
    Queue queue(AccessClaims claims, @RequestParam(required = false) ReviewStatus status,
                @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) OffsetDateTime after,
                @RequestParam(defaultValue = "50") int limit) {
        return new Queue(admission.reviewQueue(claims.actor(), status, after, limit));
    }

    @GetMapping("/{driverId}")
    DriverAdmission.ReviewCase reviewCase(AccessClaims claims, @PathVariable UUID driverId) {
        return admission.reviewCase(claims.actor(), driverId);
    }

    @GetMapping("/{driverId}/documents/{documentId}/file")
    ResponseEntity<InputStreamResource> documentFile(AccessClaims claims, @PathVariable UUID driverId,
                                                     @PathVariable UUID documentId) {
        FileContent content = admission.documentFile(claims.actor(), driverId, documentId);
        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(content.contentType()))
                .contentLength(content.sizeBytes())
                .cacheControl(CacheControl.noStore().cachePrivate())
                .header("X-Content-Type-Options", "nosniff")
                .header(HttpHeaders.CONTENT_DISPOSITION, ContentDisposition.inline().build().toString())
                .body(new InputStreamResource(content.stream()));
    }

    @PostMapping("/{driverId}/decision")
    DriverProfile decide(AccessClaims claims, @PathVariable UUID driverId, @Valid @RequestBody Decision body) {
        return admission.decide(claims.actor(), body.commandId(), driverId, body.expectedVersion(), body.decision(),
                body.reason(), body.vehicleClasses() == null ? List.of() : body.vehicleClasses(),
                body.rejectedDocuments() == null ? List.of() : body.rejectedDocuments());
    }

    @PostMapping("/{driverId}/suspend")
    DriverProfile suspend(AccessClaims claims, @PathVariable UUID driverId, @Valid @RequestBody Change body) {
        return admission.suspend(claims.actor(), body.commandId(), driverId, body.expectedVersion(), body.reason());
    }

    @PostMapping("/{driverId}/reinstate")
    DriverProfile reinstate(AccessClaims claims, @PathVariable UUID driverId, @Valid @RequestBody Change body) {
        return admission.reinstate(claims.actor(), body.commandId(), driverId, body.expectedVersion(), body.reason());
    }
}
