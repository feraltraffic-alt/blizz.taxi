package taxi.blizz.backoffice.internal;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.backoffice.ReportExports;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.platform.Page;
import taxi.blizz.platform.PageCursor;

/** Report exports in the admin panel (admin.v1.yaml, REQ-ADM-07). */
@RestController
class ReportExportController {

    private final ReportExports exports;

    ReportExportController(ReportExports exports) {
        this.exports = exports;
    }

    record RequestExport(@NotNull UUID commandId, @NotNull ReportExports.Kind kind, @NotNull UUID cityId,
                         @NotNull LocalDate from, @NotNull LocalDate to) {
    }

    /** A page of exports (REQ-API-09); {@code page} is new and optional for older clients. */
    record ExportList(List<ReportExports.Export> exports, Page.Info page) {
    }

    @PostMapping("/api/admin/v1/reports/exports")
    ResponseEntity<ReportExports.Export> request(AccessClaims claims, @Valid @RequestBody RequestExport body) {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(exports.request(claims.actor(), body.commandId(),
                body.kind(), body.cityId(), body.from(), body.to()));
    }

    @GetMapping("/api/admin/v1/reports/exports")
    ExportList mine(AccessClaims claims, @RequestParam(required = false) String cursor,
                    @RequestParam(required = false) Integer limit) {
        int size = PageCursor.limit(limit);
        Page<ReportExports.Export> page = Page.of(exports.mine(claims.actor(),
                PageCursor.decode(ReportExports.MINE, cursor), size + 1), size, ReportExports::position);
        return new ExportList(page.items(), page.page());
    }

    @GetMapping("/api/admin/v1/reports/exports/{exportId}")
    ReportExports.Export get(AccessClaims claims, @PathVariable UUID exportId) {
        return exports.get(claims.actor(), exportId);
    }

    @GetMapping("/api/admin/v1/reports/exports/{exportId}/file")
    ResponseEntity<byte[]> file(AccessClaims claims, @PathVariable UUID exportId) {
        ReportExports.File file = exports.download(claims.actor(), exportId);
        return ResponseEntity.ok()
                .contentType(new MediaType("text", "csv", java.nio.charset.StandardCharsets.UTF_8))
                .header(HttpHeaders.CONTENT_DISPOSITION,
                        ContentDisposition.attachment().filename(file.name()).build().toString())
                .header(HttpHeaders.CACHE_CONTROL, "no-store")
                .body(file.content());
    }
}
