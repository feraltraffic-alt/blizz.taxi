package taxi.blizz.operations.internal;

import java.util.UUID;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.operations.OrderCalls;

@RestController
class OrderCallController {

    private final OrderCalls calls;

    OrderCallController(OrderCalls calls) {
        this.calls = calls;
    }

    @GetMapping("/api/rider/v1/orders/{orderId}/call")
    OrderCalls.CallTarget rider(AccessClaims claims, @PathVariable UUID orderId) {
        return calls.forRider(claims.actor(), orderId);
    }

    @GetMapping("/api/driver/v1/trips/{tripId}/call")
    OrderCalls.CallTarget driver(AccessClaims claims, @PathVariable UUID tripId) {
        return calls.forDriver(claims.actor(), tripId);
    }
}
