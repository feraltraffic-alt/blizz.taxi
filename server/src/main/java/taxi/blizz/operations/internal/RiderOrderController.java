package taxi.blizz.operations.internal;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.UUID;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.operations.OrderView;
import taxi.blizz.operations.Orders;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;

/**
 * The rider's active order and cancellation — packages/contracts/openapi/rider.v1.yaml. Order
 * creation over HTTP arrives with quotes (pricing), since an order needs a consumed quote.
 */
@RestController
@RequestMapping("/api/rider/v1/orders")
class RiderOrderController {

    private final Orders orders;

    RiderOrderController(Orders orders) {
        this.orders = orders;
    }

    record CancelRequest(@NotNull UUID commandId, @NotNull @Min(0) Long expectedVersion, @NotBlank String reasonCode) {
    }

    @GetMapping("/active")
    ResponseEntity<OrderView> active(AccessClaims claims) {
        return orders.active(claims.actor().id()).map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.noContent().build());
    }

    @GetMapping("/{orderId}")
    OrderView get(AccessClaims claims, @PathVariable UUID orderId) {
        OrderView order = orders.get(orderId);
        if (!claims.actor().id().equals(order.payerClientId())) {
            throw new DomainException(ErrorCode.NOT_FOUND, "Order not found");
        }
        return order;
    }

    @PostMapping("/{orderId}/cancel")
    OrderView cancel(AccessClaims claims, @PathVariable UUID orderId, @Valid @RequestBody CancelRequest body) {
        return orders.cancel(claims.actor(), body.commandId(), orderId, body.expectedVersion(), body.reasonCode());
    }
}
