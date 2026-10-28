package taxi.blizz.operations.internal;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.geo.GeoPoint;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.identity.PhoneNumber;
import taxi.blizz.operations.CallerContact;
import taxi.blizz.operations.CreateOrder;
import taxi.blizz.operations.OrderChannel;
import taxi.blizz.operations.OrderView;
import taxi.blizz.operations.Orders;
import taxi.blizz.operations.PaymentMethod;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;

/**
 * The rider's orders — packages/contracts/openapi/rider.v1.yaml. An order is created from a quote
 * the rider received for the same class and points (REQ-PRC-06).
 */
@RestController
@RequestMapping("/api/rider/v1/orders")
class RiderOrderController {

    private final Orders orders;
    private final PickupEtas etas;

    RiderOrderController(Orders orders, PickupEtas etas) {
        this.orders = orders;
        this.etas = etas;
    }

    record CancelRequest(@NotNull UUID commandId, @NotNull @Min(0) Long expectedVersion, @NotBlank String reasonCode) {
    }

    record CreateRequest(@NotNull UUID commandId, @NotNull UUID quoteId, @NotBlank @Size(max = 64) String vehicleClass,
                         @NotNull GeoPoint pickup, @Size(max = 300) String pickupLabel,
                         @NotNull GeoPoint dropoff, @Size(max = 300) String dropoffLabel,
                         @NotNull PaymentMethod paymentMethod, OrderChannel channel, java.time.Instant pickupAt,
                         @Min(0) Long walletMinor, @Valid Recipient recipient) {
    }

    /** The person the taxi is for, when it is not the rider (ADR 0012 Q-03); the rider still pays. */
    record Recipient(@Size(max = 120) String name, @NotBlank String phone) {
    }

    record CurrentOrders(List<OrderView> orders) {
    }

    @GetMapping
    List<Orders.HistoryItem> history(AccessClaims claims,
                                     @RequestParam(required = false) OffsetDateTime before,
                                     @RequestParam(defaultValue = "20") int limit) {
        return orders.history(claims.actor(), before, limit);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    OrderView create(AccessClaims claims, @Valid @RequestBody CreateRequest body) {
        return orders.create(claims.actor(), body.commandId(), new CreateOrder(claims.actor().id(),
                body.vehicleClass(), body.pickup(), body.pickupLabel(), body.dropoff(), body.dropoffLabel(),
                body.paymentMethod(), body.quoteId(), body.channel(), null, recipient(body.recipient()),
                body.pickupAt(), false, body.walletMinor()));
    }

    private static CallerContact recipient(Recipient recipient) {
        if (recipient == null) {
            return null;
        }
        String name = recipient.name() == null || recipient.name().isBlank() ? null : recipient.name().strip();
        return new CallerContact(name, PhoneNumber.parse(recipient.phone()).e164());
    }

    /** Every order of the rider not yet finished, pre-orders included, newest first (ADR 0012 Q-03). */
    @GetMapping("/current")
    CurrentOrders current(AccessClaims claims) {
        return new CurrentOrders(orders.current(claims.actor().id()).stream().map(etas::with).toList());
    }

    @GetMapping("/active")
    ResponseEntity<OrderView> active(AccessClaims claims) {
        return orders.active(claims.actor().id()).map(etas::with).map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.noContent().build());
    }

    @GetMapping("/{orderId}")
    OrderView get(AccessClaims claims, @PathVariable UUID orderId) {
        OrderView order = orders.get(orderId);
        if (!claims.actor().id().equals(order.payerClientId())) {
            throw new DomainException(ErrorCode.NOT_FOUND, "Order not found");
        }
        return etas.with(order);
    }

    record SwitchToCashRequest(@NotNull UUID commandId, @NotNull @Min(0) Long expectedVersion) {
    }

    @PostMapping("/{orderId}/switch-to-cash")
    OrderView switchToCash(AccessClaims claims, @PathVariable UUID orderId,
                           @Valid @RequestBody SwitchToCashRequest body) {
        return etas.with(orders.switchToCash(claims.actor(), body.commandId(), orderId, body.expectedVersion(), null));
    }

    @PostMapping("/{orderId}/cancel")
    OrderView cancel(AccessClaims claims, @PathVariable UUID orderId, @Valid @RequestBody CancelRequest body) {
        return orders.cancel(claims.actor(), body.commandId(), orderId, body.expectedVersion(), body.reasonCode());
    }
}
