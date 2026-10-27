package taxi.blizz.operations.internal;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.List;
import java.util.UUID;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.operations.AssignmentView;
import taxi.blizz.operations.OrderView;
import taxi.blizz.operations.Preorders;

/** Pre-order reservations: driver.v1 (see, reserve, drop, "On my way") and operator.v1 (take a driver off). */
@RestController
class PreorderController {

    private final Preorders preorders;

    PreorderController(Preorders preorders) {
        this.preorders = preorders;
    }

    record AvailableList(List<Preorders.Available> preorders) {
    }

    record ReservationList(List<Preorders.Reservation> reservations) {
    }

    record Command(@NotNull UUID commandId) {
    }

    record DropCommand(@NotNull UUID commandId, @NotBlank @Size(max = 40) String reasonCode) {
    }

    record RemoveCommand(@NotNull UUID commandId, @NotBlank @Size(max = 500) String reason) {
    }

    @GetMapping("/api/driver/v1/preorders")
    AvailableList available(AccessClaims claims) {
        return new AvailableList(preorders.available(claims.actor()));
    }

    @GetMapping("/api/driver/v1/preorders/reservations")
    ReservationList mine(AccessClaims claims) {
        return new ReservationList(preorders.mine(claims.actor()));
    }

    @PostMapping("/api/driver/v1/preorders/{orderId}/reserve")
    Preorders.Reservation reserve(AccessClaims claims, @PathVariable UUID orderId, @Valid @RequestBody Command body) {
        return preorders.reserve(claims.actor(), body.commandId(), orderId);
    }

    @PostMapping("/api/driver/v1/preorders/reservations/{reservationId}/drop")
    Preorders.Reservation drop(AccessClaims claims, @PathVariable UUID reservationId,
                               @Valid @RequestBody DropCommand body) {
        return preorders.drop(claims.actor(), body.commandId(), reservationId, body.reasonCode());
    }

    @PostMapping("/api/driver/v1/preorders/reservations/{reservationId}/confirm")
    AssignmentView confirm(AccessClaims claims, @PathVariable UUID reservationId, @Valid @RequestBody Command body) {
        return preorders.confirm(claims.actor(), body.commandId(), reservationId);
    }

    @PostMapping("/api/operator/v1/orders/{orderId}/remove-reservation")
    OrderView remove(AccessClaims claims, @PathVariable UUID orderId, @Valid @RequestBody RemoveCommand body) {
        return preorders.removeReservation(claims.actor(), body.commandId(), orderId, body.reason());
    }
}
