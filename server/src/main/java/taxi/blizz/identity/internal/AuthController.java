package taxi.blizz.identity.internal;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.identity.ChallengeIssued;
import taxi.blizz.identity.ApiAudience;
import taxi.blizz.identity.IssuedSession;
import taxi.blizz.identity.StaffSignIn;
import taxi.blizz.identity.OtpAudience;
import taxi.blizz.identity.OtpChannel;
import taxi.blizz.identity.OtpService;
import taxi.blizz.identity.SessionService;
import taxi.blizz.identity.VerifiedSubject;

/** {@code /auth/v1} — packages/contracts/openapi/auth.v1.yaml. */
@RestController
@RequestMapping("/auth/v1")
class AuthController {

    private final OtpService otp;
    private final SessionService sessions;
    private final StaffSignIn staffSignIn;

    private final taxi.blizz.identity.Services services;

    AuthController(OtpService otp, SessionService sessions, StaffSignIn staffSignIn,
                   taxi.blizz.identity.Services services) {
        this.services = services;
        this.otp = otp;
        this.sessions = sessions;
        this.staffSignIn = staffSignIn;
    }

    /** {@code service}: the code of the app's taxi service (ADR 0016); absent — the first service. */
    record ChallengeRequest(@NotNull OtpAudience audience, @NotBlank String phone, @Size(max = 128) String deviceRef,
                            OtpChannel channel, @Size(max = 40) String service) {
    }

    record ChallengeResponse(UUID challengeId, OffsetDateTime expiresAt, OffsetDateTime resendAvailableAt,
                             taxi.blizz.identity.OtpChannel channel) {
    }

    record VerifyRequest(@NotNull UUID challengeId, @NotBlank @Pattern(regexp = "^[0-9]{4,8}$") String code,
                         @Size(max = 128) String deviceRef) {
    }

    record RefreshRequest(@NotBlank String refreshToken) {
    }

    record Subject(String type, UUID id) {
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    record SessionResponse(UUID sessionId, Subject subject, String audience, String accessToken,
                           OffsetDateTime accessExpiresAt, String refreshToken, OffsetDateTime refreshExpiresAt,
                           Boolean accountCreated, Boolean passwordChangeRequired) {

        static SessionResponse of(IssuedSession session, Boolean accountCreated) {
            return of(session, accountCreated, null);
        }

        static SessionResponse of(IssuedSession session, Boolean accountCreated, Boolean passwordChangeRequired) {
            return new SessionResponse(session.sessionId(),
                    new Subject(session.actor().type().name(), session.actor().id()),
                    session.audience().value(), session.accessToken(), session.accessExpiresAt(),
                    session.refreshToken(), session.refreshExpiresAt(), accountCreated, passwordChangeRequired);
        }
    }

    record StaffSignInRequest(@NotBlank @Size(max = 64) String login, @NotBlank @Size(max = 128) String password,
                              @NotNull ApiAudience audience, @Size(max = 128) String deviceRef) {
    }

    @PostMapping("/otp/challenges")
    @ResponseStatus(HttpStatus.CREATED)
    ChallengeResponse requestChallenge(@Valid @RequestBody ChallengeRequest body, HttpServletRequest request) {
        java.util.UUID service = body.service() == null ? taxi.blizz.identity.Services.DEFAULT_ID
                : services.active(body.service()).orElseThrow(() -> new taxi.blizz.platform.DomainException(
                        taxi.blizz.platform.ErrorCode.VALIDATION_FAILED, "Unknown taxi service"));
        ChallengeIssued issued = otp.requestChallenge(service, body.audience(), body.phone(), body.deviceRef(),
                request.getRemoteAddr(), body.channel());
        return new ChallengeResponse(issued.challengeId(), issued.expiresAt(), issued.resendAvailableAt(),
                issued.channel());
    }

    @PostMapping("/otp/verify")
    SessionResponse verify(@Valid @RequestBody VerifyRequest body) {
        VerifiedSubject subject = otp.verify(body.challengeId(), body.code());
        return SessionResponse.of(sessions.open(subject, body.deviceRef()), subject.created());
    }

    /** Staff sign in by login and password (owner decision 27.10.2026). */
    @PostMapping("/staff/sign-in")
    SessionResponse staffSignIn(@Valid @RequestBody StaffSignInRequest body, HttpServletRequest request) {
        StaffSignIn.Result result = staffSignIn.signIn(body.login(), body.password(), body.audience(), body.deviceRef(),
                request.getRemoteAddr());
        return SessionResponse.of(result.session(), null, result.passwordChangeRequired());
    }

    @PostMapping("/token/refresh")
    SessionResponse refresh(@Valid @RequestBody RefreshRequest body) {
        return SessionResponse.of(sessions.refresh(body.refreshToken()), null);
    }

    @PostMapping("/logout")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void logout(@Valid @RequestBody RefreshRequest body) {
        sessions.logout(body.refreshToken());
    }
}
