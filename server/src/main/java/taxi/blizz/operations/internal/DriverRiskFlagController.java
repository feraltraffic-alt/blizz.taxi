package taxi.blizz.operations.internal;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.operations.DriverRiskFlags;
import taxi.blizz.platform.Page;
import taxi.blizz.platform.PageCursor;

/** Driver risk flags in the admin panel — admin.v1.yaml (issue #71). */
@RestController
@RequestMapping("/api/admin/v1/driver-risk-flags")
class DriverRiskFlagController {

    private final DriverRiskFlags flags;

    DriverRiskFlagController(DriverRiskFlags flags) {
        this.flags = flags;
    }

    /** A page of flags (REQ-API-09); {@code page} is new and optional for older clients. */
    record FlagList(List<DriverRiskFlags.Flag> flags, Page.Info page) {
    }

    record Raise(@NotNull UUID commandId, @NotNull UUID driverId, @NotNull UUID cityId, @NotBlank String reason) {
    }

    record Review(@NotNull UUID commandId, @NotNull @Min(1) Long expectedVersion, @NotBlank String reason) {
    }

    @GetMapping
    FlagList list(AccessClaims claims, @RequestParam(name = "city_id", required = false) UUID cityId,
                  @RequestParam(required = false) DriverRiskFlags.State state,
                  @RequestParam(name = "driver_id", required = false) UUID driverId,
                  @RequestParam(required = false) String cursor,
                  @RequestParam(required = false) OffsetDateTime before,
                  @RequestParam(required = false) Integer limit) {
        int size = PageCursor.limit(limit);
        PageCursor after = PageCursor.read(DriverRiskFlags.FLAGS, cursor, before);
        Page<DriverRiskFlags.Flag> page = Page.of(flags.list(claims.actor(), cityId, state, driverId, after,
                size + 1), size, DriverRiskFlags::position);
        return new FlagList(page.items(), page.page());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    DriverRiskFlags.Flag raise(AccessClaims claims, @Valid @RequestBody Raise body) {
        return flags.raise(claims.actor(), body.commandId(), body.driverId(), body.cityId(), body.reason());
    }

    @GetMapping("/{flagId}")
    DriverRiskFlags.Flag get(AccessClaims claims, @PathVariable UUID flagId) {
        return flags.get(claims.actor(), flagId);
    }

    @PostMapping("/{flagId}/confirm")
    DriverRiskFlags.Flag confirm(AccessClaims claims, @PathVariable UUID flagId, @Valid @RequestBody Review body) {
        return flags.review(claims.actor(), body.commandId(), flagId, body.expectedVersion(), true, body.reason());
    }

    @PostMapping("/{flagId}/dismiss")
    DriverRiskFlags.Flag dismiss(AccessClaims claims, @PathVariable UUID flagId, @Valid @RequestBody Review body) {
        return flags.review(claims.actor(), body.commandId(), flagId, body.expectedVersion(), false, body.reason());
    }
}
