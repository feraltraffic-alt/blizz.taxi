package taxi.blizz.operations.internal;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
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
import taxi.blizz.operations.AssignmentView;
import taxi.blizz.operations.BroadcastOrderView;
import taxi.blizz.operations.Dispatch;
import taxi.blizz.operations.OfferView;

/** Offers, the "ALL" tab and the current assignment — packages/contracts/openapi/driver.v1.yaml. */
@RestController
@RequestMapping("/api/driver/v1")
class DriverDispatchController {

    private final Dispatch dispatch;

    DriverDispatchController(Dispatch dispatch) {
        this.dispatch = dispatch;
    }

    record Command(@NotNull UUID commandId) {
    }

    @GetMapping("/offers")
    List<OfferView> offers(AccessClaims claims) {
        return dispatch.offers(claims.actor());
    }

    @PostMapping("/offers/{offerId}/accept")
    AssignmentView accept(AccessClaims claims, @PathVariable UUID offerId, @Valid @RequestBody Command body) {
        return dispatch.accept(claims.actor(), claims.sessionId(), body.commandId(), offerId);
    }

    @PostMapping("/offers/{offerId}/reject")
    ResponseEntity<Void> reject(AccessClaims claims, @PathVariable UUID offerId, @Valid @RequestBody Command body) {
        dispatch.reject(claims.actor(), body.commandId(), offerId);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/broadcast-orders")
    List<BroadcastOrderView> broadcast(AccessClaims claims,
                                       @RequestParam(name = "zone_id", required = false) UUID zoneId) {
        return dispatch.broadcast(claims.actor(), zoneId);
    }

    @PostMapping("/orders/{orderId}/claim")
    AssignmentView claim(AccessClaims claims, @PathVariable UUID orderId, @Valid @RequestBody Command body) {
        return dispatch.claim(claims.actor(), claims.sessionId(), body.commandId(), orderId);
    }

    @GetMapping("/assignments/current")
    ResponseEntity<AssignmentView> current(AccessClaims claims) {
        return dispatch.currentAssignment(claims.actor()).map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.noContent().build());
    }
}
