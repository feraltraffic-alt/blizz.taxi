package taxi.blizz.backoffice.internal;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.io.IOException;
import java.util.UUID;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.CacheControl;
import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.backoffice.SupportCases;
import taxi.blizz.files.FileContent;
import taxi.blizz.files.FilePurpose;
import taxi.blizz.files.FileService;
import taxi.blizz.files.StoredFile;
import taxi.blizz.files.UploadSession;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.identity.StaffAccess;

@RestController
class SupportFilesController {

    private final FileService files;
    private final StaffAccess staff;
    private final SupportAttachments attachments;

    SupportFilesController(FileService files, StaffAccess staff, SupportAttachments attachments) {
        this.files = files;
        this.staff = staff;
        this.attachments = attachments;
    }

    record OpenUpload(@NotNull UUID commandId, @NotBlank String contentType, @Min(1) long sizeBytes) {
    }

    @PostMapping({"/api/rider/v1/support/uploads", "/api/driver/v1/support/uploads"})
    @ResponseStatus(HttpStatus.CREATED)
    UploadSession openRequester(AccessClaims claims, @Valid @RequestBody OpenUpload body) {
        return files.openUpload(claims.actor(), body.commandId(), FilePurpose.SUPPORT_ATTACHMENT, body.contentType(),
                body.sizeBytes());
    }

    @PostMapping({"/api/admin/v1/support/uploads", "/api/operator/v1/support/uploads"})
    @ResponseStatus(HttpStatus.CREATED)
    UploadSession openStaff(AccessClaims claims, @Valid @RequestBody OpenUpload body, HttpServletRequest request) {
        staff.require(claims.actor(), SupportCases.MANAGE_PERMISSION);
        UploadSession session = files.openUpload(claims.actor(), body.commandId(), FilePurpose.SUPPORT_ATTACHMENT,
                body.contentType(), body.sizeBytes());
        String audience = request.getRequestURI().startsWith("/api/admin/") ? "admin" : "operator";
        return new UploadSession(session.fileId(), "/api/" + audience + "/v1/uploads/" + session.fileId(),
                session.expiresAt(), session.maxBytes());
    }

    @PutMapping(path = "/api/rider/v1/uploads/{fileId}", consumes = MediaType.ALL_VALUE)
    StoredFile uploadRider(AccessClaims claims, @PathVariable UUID fileId, HttpServletRequest request) throws IOException {
        return upload(claims, fileId, request);
    }

    @PutMapping(path = {"/api/admin/v1/uploads/{fileId}", "/api/operator/v1/uploads/{fileId}"},
            consumes = MediaType.ALL_VALUE)
    StoredFile uploadStaff(AccessClaims claims, @PathVariable UUID fileId, HttpServletRequest request) throws IOException {
        staff.require(claims.actor(), SupportCases.MANAGE_PERMISSION);
        return upload(claims, fileId, request);
    }

    @GetMapping({"/api/rider/v1/support/cases/{caseId}/attachments/{fileId}",
                 "/api/driver/v1/support/cases/{caseId}/attachments/{fileId}"})
    ResponseEntity<InputStreamResource> downloadRequester(AccessClaims claims, @PathVariable UUID caseId,
                                                           @PathVariable UUID fileId) {
        return response(attachments.openForRequester(claims.actor(), caseId, fileId));
    }

    @GetMapping({"/api/admin/v1/support/cases/{caseId}/attachments/{fileId}",
                 "/api/operator/v1/support/cases/{caseId}/attachments/{fileId}"})
    ResponseEntity<InputStreamResource> downloadStaff(AccessClaims claims, @PathVariable UUID caseId,
                                                       @PathVariable UUID fileId) {
        return response(attachments.openForStaff(claims.actor(), caseId, fileId));
    }

    private StoredFile upload(AccessClaims claims, UUID fileId, HttpServletRequest request) throws IOException {
        return files.upload(claims.actor(), fileId, request.getContentType(), request.getContentLengthLong(),
                request.getInputStream());
    }

    private static ResponseEntity<InputStreamResource> response(FileContent content) {
        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(content.contentType()))
                .contentLength(content.sizeBytes())
                .cacheControl(CacheControl.noStore().cachePrivate())
                .header("X-Content-Type-Options", "nosniff")
                .header(HttpHeaders.CONTENT_DISPOSITION, ContentDisposition.attachment()
                        .filename(content.fileId() + extension(content.contentType())).build().toString())
                .body(new InputStreamResource(content.stream()));
    }

    private static String extension(String contentType) {
        return switch (contentType) {
            case "image/jpeg" -> ".jpg";
            case "image/png" -> ".png";
            case "image/webp" -> ".webp";
            case "application/pdf" -> ".pdf";
            default -> "";
        };
    }
}
