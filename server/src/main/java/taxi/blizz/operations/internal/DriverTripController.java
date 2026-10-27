package taxi.blizz.operations.internal;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.operations.TripView;
import taxi.blizz.operations.Trips;

/** Trip commands of the assigned driver — packages/contracts/openapi/driver.v1.yaml. */
@RestController
@RequestMapping("/api/driver/v1/trips")
class DriverTripController {

    private final Trips trips;

    DriverTripController(Trips trips) {
        this.trips = trips;
    }

    record PhaseCommand(@NotNull UUID commandId, @NotNull @Min(0) Long expectedVersion,
                        @Size(max = 500) String exceptionReason) {
    }

    record WithdrawCommand(@NotNull UUID commandId, @NotNull @Min(0) Long expectedVersion,
                           @NotBlank @Size(max = 500) String reason) {
    }

    record VersionCommand(@NotNull UUID commandId, @NotNull @Min(0) Long expectedVersion) {
    }

    record CompleteCommand(@NotNull UUID commandId, @NotNull @Min(0) Long expectedVersion,
                           @NotNull OffsetDateTime reportedAt, Boolean cashReceived) {
    }

    @GetMapping
    List<Trips.HistoryItem> history(AccessClaims claims,
                                    @RequestParam(required = false) OffsetDateTime before,
                                    @RequestParam(defaultValue = "20") int limit) {
        return trips.history(claims.actor(), before, limit);
    }

    @GetMapping("/current")
    ResponseEntity<TripView> current(AccessClaims claims) {
        return trips.current(claims.actor()).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.noContent().build());
    }

    @PostMapping("/{tripId}/arrive")
    TripView arrive(AccessClaims claims, @PathVariable UUID tripId, @Valid @RequestBody PhaseCommand body) {
        return trips.arrive(claims.actor(), body.commandId(), tripId, body.expectedVersion(), body.exceptionReason());
    }

    @PostMapping("/{tripId}/start")
    TripView start(AccessClaims claims, @PathVariable UUID tripId, @Valid @RequestBody PhaseCommand body) {
        return trips.start(claims.actor(), body.commandId(), tripId, body.expectedVersion(), body.exceptionReason());
    }

    @PostMapping("/{tripId}/complete")
    TripView complete(AccessClaims claims, @PathVariable UUID tripId, @Valid @RequestBody CompleteCommand body) {
        return trips.complete(claims.actor(), body.commandId(), tripId, body.expectedVersion(), body.reportedAt(),
                body.cashReceived());
    }

    @PostMapping("/{tripId}/withdraw")
    TripView withdraw(AccessClaims claims, @PathVariable UUID tripId, @Valid @RequestBody WithdrawCommand body) {
        return trips.withdraw(claims.actor(), body.commandId(), tripId, body.expectedVersion(), body.reason());
    }

    @PostMapping("/{tripId}/no-show")
    TripView noShow(AccessClaims claims, @PathVariable UUID tripId, @Valid @RequestBody VersionCommand body) {
        return trips.reportNoShow(claims.actor(), body.commandId(), tripId, body.expectedVersion());
    }
}
