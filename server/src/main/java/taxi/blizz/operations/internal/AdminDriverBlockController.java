package taxi.blizz.operations.internal;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.UUID;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.driver.DriverProfile;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.operations.DriverBlocks;

/** Blocking and unblocking a driver account in the admin panel (admin.v1.yaml, issue #141). */
@RestController
@RequestMapping("/api/admin/v1/drivers/{driverId}")
class AdminDriverBlockController {

    private final DriverBlocks blocks;

    AdminDriverBlockController(DriverBlocks blocks) {
        this.blocks = blocks;
    }

    record Change(@NotNull UUID commandId, @NotNull @Min(0) Long expectedVersion,
                  @NotBlank @Size(max = 1000) String reason) {
    }

    @PostMapping("/block")
    DriverProfile block(AccessClaims claims, @PathVariable UUID driverId, @Valid @RequestBody Change body) {
        return blocks.block(claims.actor(), body.commandId(), driverId, body.expectedVersion(), body.reason());
    }

    @PostMapping("/unblock")
    DriverProfile unblock(AccessClaims claims, @PathVariable UUID driverId, @Valid @RequestBody Change body) {
        return blocks.unblock(claims.actor(), body.commandId(), driverId, body.expectedVersion(), body.reason());
    }
}
