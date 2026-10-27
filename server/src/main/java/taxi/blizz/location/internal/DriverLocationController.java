package taxi.blizz.location.internal;

import jakarta.validation.Valid;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.location.TrackService;

/** packages/contracts/openapi/driver.v1.yaml — T-14. */
@RestController
@RequestMapping("/api/driver/v1/location-batches")
class DriverLocationController {

    private final TrackService tracks;

    DriverLocationController(TrackService tracks) {
        this.tracks = tracks;
    }

    record Point(
            @PositiveOrZero long sequence,
            @DecimalMin("-90") @DecimalMax("90") double lat,
            @DecimalMin("-180") @DecimalMax("180") double lon,
            @PositiveOrZero double accuracyM,
            @PositiveOrZero Double speedMps,
            @DecimalMin("0") @DecimalMax(value = "360", inclusive = false) Double headingDeg,
            @NotNull OffsetDateTime recordedAt) {
        TrackService.InputPoint toInput() {
            return new TrackService.InputPoint(sequence, lat, lon, accuracyM, speedMps, headingDeg, recordedAt);
        }
    }

    record Batch(@NotNull UUID commandId, @NotNull @Size(min = 1, max = 100) List<@Valid Point> points) {
    }

    @PostMapping
    TrackService.BatchResult store(AccessClaims claims, @Valid @RequestBody Batch batch) {
        return tracks.store(claims.actor(), claims.sessionId(), batch.commandId(),
                batch.points().stream().map(Point::toInput).toList());
    }
}
