package taxi.blizz.backoffice.internal;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.operations.Orders;
import taxi.blizz.payments.Chargebacks;
import taxi.blizz.payments.PaymentOperations;
import taxi.blizz.platform.Actor;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;

/**
 * Chargebacks of an order in the admin panel (REQ-PAY-23): here because only operations knows the order's city,
 * which payments needs for the staff member's access and cannot ask for itself.
 */
@RestController
class ChargebackController {

    private final Chargebacks chargebacks;
    private final Orders orders;
    private final StaffAccess staff;

    ChargebackController(Chargebacks chargebacks, Orders orders, StaffAccess staff) {
        this.chargebacks = chargebacks;
        this.orders = orders;
        this.staff = staff;
    }

    record RecordRequest(UUID commandId, Long amountMinor, String currency, String bankReason, LocalDate receivedOn) {
    }

    record ResolveRequest(UUID commandId, Long expectedVersion, Chargebacks.Outcome outcome, String reason) {
    }

    record ChargebackList(List<Chargebacks.Chargeback> chargebacks) {
    }

    /** Nobody without the permission learns whether the order exists; then its city decides. */
    private UUID cityOf(Actor actor, UUID orderId) {
        staff.require(actor, PaymentOperations.RETRY_PERMISSION);
        return orders.get(orderId).cityId();
    }

    @GetMapping("/api/admin/v1/orders/{orderId}/chargebacks")
    ChargebackList list(AccessClaims claims, @PathVariable UUID orderId) {
        return new ChargebackList(chargebacks.ofOrder(claims.actor(), orderId, cityOf(claims.actor(), orderId)));
    }

    @PostMapping("/api/admin/v1/orders/{orderId}/chargebacks")
    @ResponseStatus(HttpStatus.CREATED)
    Chargebacks.Chargeback record(AccessClaims claims, @PathVariable UUID orderId, @RequestBody RecordRequest body) {
        if (body.commandId() == null || body.amountMinor() == null) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "command_id and amount_minor are required");
        }
        return chargebacks.record(claims.actor(), body.commandId(), orderId, cityOf(claims.actor(), orderId),
                new Chargebacks.NewChargeback(body.amountMinor(), body.currency(), body.bankReason(),
                        body.receivedOn()));
    }

    @PostMapping("/api/admin/v1/orders/{orderId}/chargebacks/{chargebackId}/resolve")
    Chargebacks.Chargeback resolve(AccessClaims claims, @PathVariable UUID orderId, @PathVariable UUID chargebackId,
                                   @RequestBody ResolveRequest body) {
        if (body.commandId() == null || body.expectedVersion() == null) {
            throw new DomainException(ErrorCode.VALIDATION_FAILED, "command_id and expected_version are required");
        }
        return chargebacks.resolve(claims.actor(), body.commandId(), orderId, cityOf(claims.actor(), orderId),
                chargebackId, body.expectedVersion(), body.outcome(), body.reason());
    }
}
