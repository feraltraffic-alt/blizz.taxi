package taxi.blizz.backoffice.internal;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.backoffice.DriverDeletionReview;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.platform.Page;
import taxi.blizz.platform.PageCursor;

/** Drivers' deletion requests in the admin panel — admin.v1.yaml (issue #144). */
@RestController
class AdminDriverDeletionController {

    private final DriverDeletionReview review;

    AdminDriverDeletionController(DriverDeletionReview review) {
        this.review = review;
    }

    record Command(@NotNull UUID commandId, @NotBlank String reason) {
    }

    /** A page of requests (REQ-API-09); {@code page} is new and optional for older clients. */
    record RequestList(List<DriverDeletionReview.Request> requests, Page.Info page) {
    }

    @GetMapping("/api/admin/v1/driver-deletions")
    RequestList pending(AccessClaims claims, @RequestParam(required = false) String cursor,
                        @RequestParam(required = false) Integer limit) {
        int size = PageCursor.limit(limit);
        PageCursor position = cursor == null ? null : PageCursor.decode(DriverDeletionReview.PENDING, cursor);
        Page<DriverDeletionReview.Request> page = Page.of(review.pending(claims.actor(), position, size + 1), size,
                DriverDeletionReview::position);
        return new RequestList(page.items(), page.page());
    }

    @PostMapping("/api/admin/v1/driver-deletions/{driverId}/complete")
    DriverDeletionReview.Decision complete(AccessClaims claims, @PathVariable UUID driverId,
                                           @Valid @RequestBody Command body) {
        return review.complete(claims.actor(), body.commandId(), driverId, body.reason());
    }

    @PostMapping("/api/admin/v1/driver-deletions/{driverId}/reject")
    DriverDeletionReview.Decision reject(AccessClaims claims, @PathVariable UUID driverId,
                                         @Valid @RequestBody Command body) {
        return review.reject(claims.actor(), body.commandId(), driverId, body.reason());
    }
}
