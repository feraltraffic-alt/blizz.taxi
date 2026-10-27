package taxi.blizz.operations.internal;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.List;
import java.util.UUID;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.operations.OrderChat;

/** Rider and driver chat of an order — rider.v1.yaml and driver.v1.yaml. */
@RestController
class OrderChatController {

    private final OrderChat chat;

    OrderChatController(OrderChat chat) {
        this.chat = chat;
    }

    record PostMessage(@NotNull UUID commandId, @NotNull @Size(min = 1, max = 1000) String body) {
    }

    record Messages(List<OrderChat.Message> messages) {
    }

    @GetMapping("/api/rider/v1/orders/{orderId}/messages")
    Messages riderMessages(AccessClaims claims, @PathVariable UUID orderId,
                           @RequestParam(defaultValue = "0") long after, @RequestParam(defaultValue = "50") int limit) {
        return new Messages(chat.messages(claims.actor(), orderId, after, limit));
    }

    @PostMapping("/api/rider/v1/orders/{orderId}/messages")
    @ResponseStatus(HttpStatus.CREATED)
    OrderChat.Message riderPost(AccessClaims claims, @PathVariable UUID orderId, @Valid @RequestBody PostMessage body) {
        return chat.post(claims.actor(), body.commandId(), orderId, body.body());
    }

    @GetMapping("/api/driver/v1/trips/{tripId}/messages")
    Messages driverMessages(AccessClaims claims, @PathVariable UUID tripId,
                            @RequestParam(defaultValue = "0") long after, @RequestParam(defaultValue = "50") int limit) {
        return new Messages(chat.messages(claims.actor(), chat.orderOfTrip(claims.actor(), tripId), after, limit));
    }

    @PostMapping("/api/driver/v1/trips/{tripId}/messages")
    @ResponseStatus(HttpStatus.CREATED)
    OrderChat.Message driverPost(AccessClaims claims, @PathVariable UUID tripId, @Valid @RequestBody PostMessage body) {
        return chat.post(claims.actor(), body.commandId(), chat.orderOfTrip(claims.actor(), tripId), body.body());
    }
}
