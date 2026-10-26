package taxi.blizz.operations.internal;

import jakarta.validation.Valid;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.operations.DriverAvailability;
import taxi.blizz.operations.LocationFix;
import taxi.blizz.operations.WorkSessions;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;

/**
 * Going online — packages/contracts/openapi/driver.v1.yaml. The controlling device is the auth
 * session of the access token, so a second phone is a different device (REQ-DRV-03).
 */
@RestController
@RequestMapping("/api/driver/v1/work-sessions")
class WorkSessionController {

    private final WorkSessions sessions;

    WorkSessionController(WorkSessions sessions) {
        this.sessions = sessions;
    }

    record Location(@NotNull @DecimalMin("-90") @DecimalMax("90") Double lat,
                    @NotNull @DecimalMin("-180") @DecimalMax("180") Double lon,
                    @DecimalMin("0") Double accuracyM, @NotNull OffsetDateTime recordedAt, @Min(0) long sequence) {

        LocationFix toFix() {
            return new LocationFix(new GeoPoint(lat, lon), accuracyM, recordedAt, sequence);
        }
    }

    record OpenRequest(@NotNull UUID commandId, @NotNull UUID vehicleId, @NotNull @Valid Location location) {
    }

    record CommandRequest(@NotNull UUID commandId, @NotNull @Min(0) Long expectedVersion) {
    }

    record HeartbeatRequest(@Valid Location location) {
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    DriverAvailability open(AccessClaims claims, @Valid @RequestBody OpenRequest body) {
        return sessions.open(claims.actor(), body.commandId(), claims.sessionId(), body.vehicleId(),
                body.location().toFix());
    }

    @GetMapping("/current")
    DriverAvailability current(AccessClaims claims) {
        return sessions.availability(claims.actor().id());
    }

    @PostMapping("/{id}/handover")
    DriverAvailability handover(AccessClaims claims, @PathVariable UUID id, @Valid @RequestBody CommandRequest body) {
        requireCurrent(claims, id);
        return sessions.handover(claims.actor(), body.commandId(), claims.sessionId(), body.expectedVersion());
    }

    @PostMapping("/{id}/pause")
    DriverAvailability pause(AccessClaims claims, @PathVariable UUID id, @Valid @RequestBody CommandRequest body) {
        requireCurrent(claims, id);
        return sessions.pause(claims.actor(), body.commandId(), claims.sessionId(), body.expectedVersion());
    }

    @PostMapping("/{id}/resume")
    DriverAvailability resume(AccessClaims claims, @PathVariable UUID id, @Valid @RequestBody CommandRequest body) {
        requireCurrent(claims, id);
        return sessions.resume(claims.actor(), body.commandId(), claims.sessionId(), body.expectedVersion());
    }

    @PostMapping("/{id}/close")
    DriverAvailability close(AccessClaims claims, @PathVariable UUID id, @Valid @RequestBody CommandRequest body) {
        requireCurrent(claims, id);
        return sessions.close(claims.actor(), body.commandId(), claims.sessionId(), body.expectedVersion());
    }

    @PostMapping("/{id}/heartbeat")
    DriverAvailability heartbeat(AccessClaims claims, @PathVariable UUID id, @Valid @RequestBody HeartbeatRequest body) {
        requireCurrent(claims, id);
        return sessions.heartbeat(claims.actor(), claims.sessionId(),
                body.location() == null ? null : body.location().toFix());
    }

    private void requireCurrent(AccessClaims claims, UUID id) {
        if (!id.equals(sessions.availability(claims.actor().id()).sessionId())) {
            throw new DomainException(ErrorCode.NOT_FOUND, "Work session not found");
        }
    }
}
