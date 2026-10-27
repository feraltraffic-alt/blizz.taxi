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

/** Riders' deletion requests in the admin panel — admin.v1.yaml (REQ-RID-10, issue #56). */
@RestController
class ClientDeletionController {

    private final ClientDeletionReview review;

    ClientDeletionController(ClientDeletionReview review) {
        this.review = review;
    }

    record Command(@NotNull UUID commandId, @NotBlank String reason) {
    }

    record RequestList(List<ClientDeletionReview.Request> requests) {
    }

    @GetMapping("/api/admin/v1/client-deletions")
    RequestList pending(AccessClaims claims,
                        @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
                        OffsetDateTime after,
                        @RequestParam(defaultValue = "50") int limit) {
        return new RequestList(review.pending(claims.actor(), after, limit));
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
