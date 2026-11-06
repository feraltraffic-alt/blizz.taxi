package taxi.blizz.refunds.internal;

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
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.refunds.Refunds;

/** Staff refunds to riders in the admin panel (ADR 0018 part A, issue #512). */
@RestController
class RefundController {

    private final Refunds refunds;
    private final CancelReasons reasons;
    private final StaffAccess staff;

    RefundController(Refunds refunds, CancelReasons reasons, StaffAccess staff) {
        this.refunds = refunds;
        this.reasons = reasons;
        this.staff = staff;
    }

    record OrderRefunds(Refunds.Refundable refundable, List<Refunds.Refund> refunds) {
    }

    record CreateRequest(@NotNull UUID commandId, @NotNull @Min(1) Long amountMinor, @NotBlank String destination,
                         Boolean riderAgreed, @NotBlank @Size(max = 40) String reasonCode, @Size(max = 20) String fault,
                         @Size(max = 500) String comment) {
    }

    record DecisionRequest(@NotNull UUID commandId, @NotNull @Min(0) Long expectedVersion,
                           @Size(max = 500) String reason) {
    }

    record RefundList(List<Refunds.Refund> refunds) {
    }

    record LimitRequest(@NotNull UUID commandId, @NotBlank String currency, @NotNull @Min(1) Long perRefundMinor,
                        @NotNull @Min(1) Long dailyMinor, @NotNull @Min(0) Long expectedVersion,
                        @NotBlank @Size(max = 500) String reason) {
    }

    record LimitList(List<Refunds.Limit> limits) {
    }

    record Reason(String code, Map<String, String> labels, String fault) {
    }

    record ReasonList(List<Reason> reasons) {
    }

    @GetMapping("/api/admin/v1/orders/{orderId}/refunds")
    OrderRefunds ofOrder(AccessClaims claims, @PathVariable UUID orderId) {
        return new OrderRefunds(refunds.refundable(claims.actor(), orderId), refunds.ofOrder(claims.actor(), orderId));
    }

    @PostMapping("/api/admin/v1/orders/{orderId}/refunds")
    @ResponseStatus(HttpStatus.CREATED)
    Refunds.Requested request(AccessClaims claims, @PathVariable UUID orderId, @Valid @RequestBody CreateRequest body) {
        return refunds.request(claims.actor(), body.commandId(), new Refunds.Request(orderId, body.amountMinor(),
                body.destination(), Boolean.TRUE.equals(body.riderAgreed()), body.reasonCode(), body.fault(),
                body.comment()));
    }

    @PostMapping("/api/admin/v1/refunds/{refundId}/confirm")
    Refunds.Refund confirm(AccessClaims claims, @PathVariable UUID refundId, @Valid @RequestBody DecisionRequest body) {
        return refunds.confirm(claims.actor(), body.commandId(), refundId, body.expectedVersion());
    }

    @PostMapping("/api/admin/v1/refunds/{refundId}/reject")
    Refunds.Refund reject(AccessClaims claims, @PathVariable UUID refundId, @Valid @RequestBody DecisionRequest body) {
        return refunds.reject(claims.actor(), body.commandId(), refundId, body.expectedVersion(), body.reason());
    }

    @GetMapping("/api/admin/v1/refunds/waiting")
    RefundList waiting(AccessClaims claims) {
        return new RefundList(refunds.waiting(claims.actor()));
    }

    @GetMapping("/api/admin/v1/staff/{staffId}/refund-limits")
    LimitList limits(AccessClaims claims, @PathVariable UUID staffId) {
        return new LimitList(refunds.limits(claims.actor(), staffId));
    }

    @PostMapping("/api/admin/v1/staff/{staffId}/refund-limits")
    Refunds.Limit setLimit(AccessClaims claims, @PathVariable UUID staffId, @Valid @RequestBody LimitRequest body) {
        return refunds.setLimit(claims.actor(), body.commandId(), staffId, body.currency(), body.perRefundMinor(),
                body.dailyMinor(), body.expectedVersion(), body.reason());
    }

    /** The refund reasons of the staff member's service with their fault (A9), for whoever may request refunds. */
    @GetMapping("/api/admin/v1/refund-reasons")
    ReasonList reasons(AccessClaims claims) {
        staff.require(claims.actor(), Refunds.CREATE_PERMISSION);
        return new ReasonList(reasons.active(claims.actor(), CancelReasons.Audience.REFUND).stream()
                .map(r -> new Reason(r.code(), r.labels(), r.fault() == null ? null : r.fault().name())).toList());
    }
}
