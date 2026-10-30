package taxi.blizz.backoffice.internal;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.backoffice.ClientDeletionReview;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.platform.Page;
import taxi.blizz.platform.PageCursor;

/** Riders' deletion requests in the admin panel — admin.v1.yaml (REQ-RID-10, issue #56). */
@RestController
class ClientDeletionController {

    private final ClientDeletionReview review;

    ClientDeletionController(ClientDeletionReview review) {
        this.review = review;
    }

    record Command(@NotNull UUID commandId, @NotBlank String reason) {
    }

    /** A page of requests (REQ-API-09); {@code page} is new and optional for older clients. */
    record RequestList(List<ClientDeletionReview.Request> requests, Page.Info page) {
    }

    @GetMapping("/api/admin/v1/client-deletions")
    RequestList pending(AccessClaims claims, @RequestParam(required = false) String cursor,
                        @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
                        OffsetDateTime after,
                        @RequestParam(required = false) Integer limit) {
        int size = PageCursor.limit(limit);
        PageCursor position = cursor != null ? PageCursor.decode(ClientDeletionReview.PENDING, cursor)
                : PageCursor.after(ClientDeletionReview.PENDING, after);
        Page<ClientDeletionReview.Request> page = Page.of(review.pending(claims.actor(), position, size + 1), size,
                ClientDeletionReview::position);
        return new RequestList(page.items(), page.page());
    }

    @PostMapping("/api/admin/v1/client-deletions/{clientId}/complete")
    ClientDeletionReview.Decision complete(AccessClaims claims, @PathVariable UUID clientId,
                                           @Valid @RequestBody Command body) {
        return review.complete(claims.actor(), body.commandId(), clientId, body.reason());
    }

    @PostMapping("/api/admin/v1/client-deletions/{clientId}/reject")
    ClientDeletionReview.Decision reject(AccessClaims claims, @PathVariable UUID clientId,
                                         @Valid @RequestBody Command body) {
        return review.reject(claims.actor(), body.commandId(), clientId, body.reason());
    }
}
