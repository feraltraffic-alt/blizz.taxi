package taxi.blizz.files.internal;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.files.FileContent;
import taxi.blizz.files.FilePurpose;
import taxi.blizz.files.FileService;
import taxi.blizz.files.StoredFile;
import taxi.blizz.files.UploadSession;
import taxi.blizz.identity.AccessClaims;

/** Document file uploads for the driver app — packages/contracts/openapi/driver.v1.yaml. */
@RestController
@RequestMapping("/api/driver/v1")
class DriverFilesController {

    private final FileService files;

    DriverFilesController(FileService files) {
        this.files = files;
    }

    record OpenUploadRequest(@NotNull UUID commandId, @NotBlank String contentType, @Min(1) long sizeBytes) {
    }

    @PostMapping("/documents/upload-sessions")
    @ResponseStatus(HttpStatus.CREATED)
    UploadSession open(AccessClaims claims, @Valid @RequestBody OpenUploadRequest body) {
        return files.openUpload(claims.actor(), body.commandId(), FilePurpose.DRIVER_DOCUMENT, body.contentType(),
                body.sizeBytes());
    }

    @PutMapping(path = "/uploads/{fileId}", consumes = MediaType.ALL_VALUE)
    StoredFile upload(AccessClaims claims, @PathVariable UUID fileId, HttpServletRequest request) throws IOException {
        return files.upload(claims.actor(), fileId, request.getContentType(), request.getContentLengthLong(),
                request.getInputStream());
    }

    @GetMapping("/files/{fileId}")
    ResponseEntity<InputStreamResource> download(AccessClaims claims, @PathVariable UUID fileId) {
        FileContent content = files.open(claims.actor(), fileId);
        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(content.contentType()))
                .contentLength(content.sizeBytes())
                .cacheControl(CacheControl.noStore().cachePrivate())
                .header("X-Content-Type-Options", "nosniff")
                .header(HttpHeaders.CONTENT_DISPOSITION, ContentDisposition.attachment()
                        .filename(fileId + extension(content.contentType())).build().toString())
                .body(new InputStreamResource(content.stream()));
    }

    private static String extension(String contentType) {
        return switch (contentType) {
            case "image/jpeg" -> ".jpg";
            case "image/png" -> ".png";
            case "application/pdf" -> ".pdf";
            default -> "";
        };
    }
}
