package taxi.blizz.configuration.internal;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.configuration.CancelReasons;
import taxi.blizz.configuration.CancelReasons.Audience;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.identity.StaffAccess;

/**
 * The lists of cancellation reasons: each app reads its own side's active reasons; the admin panel manages all of
 * them (rider.v1, driver.v1, operator.v1, admin.v1).
 */
@RestController
class CancelReasonsController {

    /** The operator's list is for those who may cancel; the operations constant is not visible from here. */
    private static final String STAFF_CANCEL_PERMISSION = "orders.cancel";

    private final CancelReasons reasons;
    private final StaffAccess staff;

    CancelReasonsController(CancelReasons reasons, StaffAccess staff) {
        this.reasons = reasons;
        this.staff = staff;
    }

    /** What an app shows: the code, the labels by language and, for drivers, what the reason does. */
    record Item(String code, Map<String, String> labels, CancelReasons.DriverOutcome driverOutcome) {
    }

    record Items(List<Item> reasons) {
    }

    record Catalog(List<CancelReasons.Reason> reasons) {
    }

    record Create(@NotNull UUID commandId, @NotNull Audience audience, @NotBlank @Size(max = 40) String code,
                  @NotNull Map<String, String> labels, CancelReasons.DriverOutcome driverOutcome,
                  Boolean operatorFault, @NotNull Boolean active, @NotNull @Min(0) Integer sortOrder,
                  @NotBlank @Size(max = 500) String reason) {
    }

    record Update(@NotNull UUID commandId, @NotNull @Min(0) Long expectedVersion,
                  @NotNull Map<String, String> labels, CancelReasons.DriverOutcome driverOutcome,
                  Boolean operatorFault, @NotNull Boolean active, @NotNull @Min(0) Integer sortOrder,
                  @NotBlank @Size(max = 500) String reason) {
    }

    @GetMapping("/api/rider/v1/cancel-reasons")
    Items rider(AccessClaims claims) {
        return items(Audience.RIDER);
    }

    @GetMapping("/api/driver/v1/cancel-reasons")
    Items driver(AccessClaims claims) {
        return items(Audience.DRIVER);
    }

    @GetMapping("/api/operator/v1/cancel-reasons")
    Items operator(AccessClaims claims) {
        staff.require(claims.actor(), STAFF_CANCEL_PERMISSION);
        return items(Audience.STAFF);
    }

    /** The reasons for taking a driver off an order (REQ-CAN-01, issue #143); the right of revoke-assignment. */
    @GetMapping("/api/operator/v1/reassign-reasons")
    Items reassign(AccessClaims claims) {
        staff.require(claims.actor(), "orders.reassign");
        return items(Audience.REASSIGN);
    }

    @GetMapping("/api/admin/v1/settings/cancel-reasons")
    Catalog all(AccessClaims claims) {
        return new Catalog(reasons.all(claims.actor()));
    }

    @PostMapping("/api/admin/v1/settings/cancel-reasons")
    @ResponseStatus(HttpStatus.CREATED)
    CancelReasons.Reason create(AccessClaims claims, @Valid @RequestBody Create body) {
        return reasons.create(claims.actor(), body.commandId(), new CancelReasons.Draft(body.audience(), body.code(),
                body.labels(), body.driverOutcome(), Boolean.TRUE.equals(body.operatorFault()), body.active(),
                body.sortOrder()), body.reason());
    }

    @PostMapping("/api/admin/v1/settings/cancel-reasons/{reasonId}")
    CancelReasons.Reason update(AccessClaims claims, @PathVariable UUID reasonId, @Valid @RequestBody Update body) {
        return reasons.update(claims.actor(), body.commandId(), reasonId, body.expectedVersion(),
                new CancelReasons.Draft(null, null, body.labels(), body.driverOutcome(),
                        Boolean.TRUE.equals(body.operatorFault()),
                        body.active(), body.sortOrder()), body.reason());
    }

    private Items items(Audience audience) {
        return new Items(reasons.active(audience).stream()
                .map(r -> new Item(r.code(), r.labels(), r.driverOutcome())).toList());
    }
}
