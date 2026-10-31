package taxi.blizz.driver.internal;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.driver.DriverDeletions;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.identity.ChallengeIssued;

/** The driver asks to delete the account, or withdraws the request — driver.v1.yaml (issue #144). */
@RestController
class DriverDeletionController {

    private final DriverDeletions deletions;

    DriverDeletionController(DriverDeletions deletions) {
        this.deletions = deletions;
    }

    record CodeResponse(UUID challengeId, OffsetDateTime expiresAt, OffsetDateTime resendAvailableAt) {
    }

    record RequestBodyIn(@NotNull UUID commandId, @NotNull UUID challengeId,
                         @NotNull @Pattern(regexp = "^[0-9]{4,8}$") String otpCode) {
    }

    record CancelBody(@NotNull UUID commandId) {
    }

    @PostMapping("/api/driver/v1/me/deletion-request/challenge")
    @ResponseStatus(HttpStatus.CREATED)
    CodeResponse code(AccessClaims claims, HttpServletRequest request) {
        ChallengeIssued issued = deletions.requestCode(claims.actor(), null, request.getRemoteAddr());
        return new CodeResponse(issued.challengeId(), issued.expiresAt(), issued.resendAvailableAt());
    }

    @PostMapping("/api/driver/v1/me/deletion-request")
    DriverDeletions.Status request(AccessClaims claims, @Valid @RequestBody RequestBodyIn body) {
        return deletions.request(claims.actor(), claims.sessionId(), body.commandId(), body.challengeId(),
                body.otpCode());
    }

    @PostMapping("/api/driver/v1/me/deletion-request/cancel")
    DriverDeletions.Status cancel(AccessClaims claims, @Valid @RequestBody CancelBody body) {
        return deletions.cancel(claims.actor(), body.commandId());
    }
}
