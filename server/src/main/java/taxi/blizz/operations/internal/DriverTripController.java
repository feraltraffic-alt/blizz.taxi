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
import taxi.blizz.platform.Page;
import taxi.blizz.platform.PageCursor;

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

    record CancelCommand(@NotNull UUID commandId, @NotNull @Min(0) Long expectedVersion,
                         @NotBlank @Size(max = 40) String reasonCode) {
    }

    record VersionCommand(@NotNull UUID commandId, @NotNull @Min(0) Long expectedVersion) {
    }

    record CompleteCommand(@NotNull UUID commandId, @NotNull @Min(0) Long expectedVersion,
                           @NotNull OffsetDateTime reportedAt, Boolean cashReceived) {
    }

    /** {@code before} is the deprecated cursor of the first version: kept until the apps use {@code cursor}. */
    @GetMapping
    Page<Trips.HistoryItem> history(AccessClaims claims, @RequestParam(required = false) String cursor,
                                    @RequestParam(required = false) OffsetDateTime before,
                                    @RequestParam(required = false) Integer limit) {
        int size = PageCursor.limit(limit);
        return Page.of(trips.history(claims.actor(), PageCursor.read(Trips.DRIVER_TRIPS, cursor, before), size + 1),
                size, Trips::position);
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

    /** The driver cancels with a reason from the drivers' list; the reason decides what happens to the order. */
    @PostMapping("/{tripId}/cancel")
    TripView cancel(AccessClaims claims, @PathVariable UUID tripId, @Valid @RequestBody CancelCommand body) {
        return trips.cancel(claims.actor(), body.commandId(), tripId, body.expectedVersion(), body.reasonCode());
    }

    @PostMapping("/{tripId}/no-show")
    TripView noShow(AccessClaims claims, @PathVariable UUID tripId, @Valid @RequestBody VersionCommand body) {
        return trips.reportNoShow(claims.actor(), body.commandId(), tripId, body.expectedVersion());
    }
}
