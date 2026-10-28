package taxi.blizz.identity.internal;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.identity.ChallengeIssued;
import taxi.blizz.identity.PhoneChanges;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.SubjectType;

/** A rider's or driver's phone change, and support's when the old phone is lost (REQ-AUTH-08). */
@RestController
class PhoneChangeController {

    private final PhoneChanges phones;

    PhoneChangeController(PhoneChanges phones) {
        this.phones = phones;
    }

    record CodeResponse(UUID challengeId, OffsetDateTime expiresAt, OffsetDateTime resendAvailableAt) {
        static CodeResponse of(ChallengeIssued issued) {
            return new CodeResponse(issued.challengeId(), issued.expiresAt(), issued.resendAvailableAt());
        }
    }

    record NewPhone(@NotBlank String phone) {
    }

    record Change(@NotNull UUID commandId, @NotNull UUID currentChallengeId,
                  @NotNull @Pattern(regexp = "^[0-9]{4,8}$") String currentCode, @NotNull UUID newChallengeId,
                  @NotNull @Pattern(regexp = "^[0-9]{4,8}$") String newCode) {
    }

    record SupportChange(@NotNull UUID commandId, @NotNull @Min(0) Long expectedVersion,
                         @NotNull UUID newChallengeId, @NotNull @Pattern(regexp = "^[0-9]{4,8}$") String newCode,
                         @NotBlank String reason) {
    }

    @PostMapping({"/api/rider/v1/me/phone-change/current-code", "/api/driver/v1/me/phone-change/current-code"})
    @ResponseStatus(HttpStatus.CREATED)
    CodeResponse current(AccessClaims claims, HttpServletRequest request) {
        return CodeResponse.of(phones.codeToCurrent(claims.actor(), null, request.getRemoteAddr()));
    }

    @PostMapping({"/api/rider/v1/me/phone-change/new-code", "/api/driver/v1/me/phone-change/new-code"})
    @ResponseStatus(HttpStatus.CREATED)
    CodeResponse fresh(AccessClaims claims, @Valid @RequestBody NewPhone body, HttpServletRequest request) {
        return CodeResponse.of(phones.codeToNew(claims.actor(), body.phone(), null, request.getRemoteAddr()));
    }

    @PostMapping({"/api/rider/v1/me/phone-change", "/api/driver/v1/me/phone-change"})
    PhoneChanges.Changed change(AccessClaims claims, @Valid @RequestBody Change body) {
        return phones.change(claims.actor(), body.commandId(), claims.sessionId(), body.currentChallengeId(),
                body.currentCode(), body.newChallengeId(), body.newCode());
    }

    @PostMapping("/api/admin/v1/clients/{clientId}/phone/new-code")
    @ResponseStatus(HttpStatus.CREATED)
    CodeResponse clientCode(AccessClaims claims, @PathVariable UUID clientId, @Valid @RequestBody NewPhone body,
                            HttpServletRequest request) {
        return CodeResponse.of(phones.codeToNewBySupport(claims.actor(), new Actor(SubjectType.CLIENT, clientId),
                body.phone(), request.getRemoteAddr()));
    }

    @PostMapping("/api/admin/v1/drivers/{driverId}/phone/new-code")
    @ResponseStatus(HttpStatus.CREATED)
    CodeResponse driverCode(AccessClaims claims, @PathVariable UUID driverId, @Valid @RequestBody NewPhone body,
                            HttpServletRequest request) {
        return CodeResponse.of(phones.codeToNewBySupport(claims.actor(), new Actor(SubjectType.DRIVER, driverId),
                body.phone(), request.getRemoteAddr()));
    }

    @PostMapping("/api/admin/v1/clients/{clientId}/phone")
    PhoneChanges.Changed client(AccessClaims claims, @PathVariable UUID clientId,
                                @Valid @RequestBody SupportChange body) {
        return phones.changeBySupport(claims.actor(), body.commandId(), new Actor(SubjectType.CLIENT, clientId),
                body.expectedVersion(), body.newChallengeId(), body.newCode(), body.reason());
    }

    @PostMapping("/api/admin/v1/drivers/{driverId}/phone")
    PhoneChanges.Changed driver(AccessClaims claims, @PathVariable UUID driverId,
                                @Valid @RequestBody SupportChange body) {
        return phones.changeBySupport(claims.actor(), body.commandId(), new Actor(SubjectType.DRIVER, driverId),
                body.expectedVersion(), body.newChallengeId(), body.newCode(), body.reason());
    }
}
