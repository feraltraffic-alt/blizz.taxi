package taxi.blizz.sandbox;

import java.util.Map;
import java.util.UUID;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import taxi.blizz.configuration.RetentionSettings;
import taxi.blizz.identity.ApiAudience;
import taxi.blizz.identity.SessionService;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.platform.*;

/** Sandbox-only fixture/trigger; every entry point verifies an ADMIN bearer and the service-wide permission. */
@RestController
@Profile("sandbox")
class SandboxRetentionController {

    private final RetentionRuns runs;
    private final SandboxRetentionData fixtures;
    private final SessionService sessions;
    private final StaffAccess staff;

    SandboxRetentionController(RetentionRuns runs, SandboxRetentionData fixtures, SessionService sessions,
            StaffAccess staff) {
        this.runs = runs;
        this.fixtures = fixtures;
        this.sessions = sessions;
        this.staff = staff;
    }

    @PostMapping("/sandbox/v1/retention/run")
    Map<String, RetentionWork.Result> run(
            @RequestHeader(name = "Authorization", required = false) String authorization) {
        require(authorization);
        return runs.runOnce();
    }

    @PostMapping("/sandbox/v1/retention/fixtures/{fixture}")
    SandboxRetentionData.Counts create(@RequestHeader(name = "Authorization", required = false) String authorization,
            @PathVariable UUID fixture) {
        require(authorization);
        return fixtures.create(fixture);
    }

    @GetMapping("/sandbox/v1/retention/fixtures/{fixture}")
    SandboxRetentionData.Counts counts(@RequestHeader(name = "Authorization", required = false) String authorization,
            @PathVariable UUID fixture) {
        require(authorization);
        return fixtures.counts(fixture);
    }

    @DeleteMapping("/sandbox/v1/retention/fixtures/{fixture}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void remove(@RequestHeader(name = "Authorization", required = false) String authorization,
            @PathVariable UUID fixture) {
        require(authorization);
        fixtures.remove(fixture);
    }

    private void require(String authorization) {
        var claims = authorization != null && authorization.startsWith("Bearer ")
                ? sessions.verifyAccess(authorization.substring(7).strip(), ApiAudience.ADMIN).orElse(null)
                : null;
        if (claims == null) {
            throw new DomainException(ErrorCode.UNAUTHENTICATED, "A valid admin access token is required");
        }
        staff.require(claims.actor(), RetentionSettings.MANAGE_PERMISSION);
        if (!staff.scope(claims.actor(), RetentionSettings.MANAGE_PERMISSION).allCities()) {
            throw new DomainException(ErrorCode.ACCESS_DENIED, "Retention requires all-city scope");
        }
    }
}
