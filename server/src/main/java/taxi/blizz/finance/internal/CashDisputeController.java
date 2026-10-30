package taxi.blizz.finance.internal;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.finance.CashDisputes;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.platform.Page;
import taxi.blizz.platform.PageCursor;

/** Cash disputes in the admin panel (owner decision 28.10.2026) — admin.v1.yaml. */
@RestController
class CashDisputeController {

    private final CashDisputes disputes;

    CashDisputeController(CashDisputes disputes) {
        this.disputes = disputes;
    }

    /** A page of disputes (REQ-API-09); {@code page} is new and optional for older clients. */
    record DisputeList(List<CashDisputes.Dispute> disputes, Page.Info page) {
    }

    record Decide(@NotNull UUID commandId, @NotNull @Min(0) Long expectedVersion,
                  @NotNull CashDisputes.Decision decision, @NotBlank String reason) {
    }

    @GetMapping("/api/admin/v1/cash-disputes")
    DisputeList open(AccessClaims claims, @RequestParam(required = false) String cursor,
                     @RequestParam(required = false) Integer limit) {
        int size = PageCursor.limit(limit);
        Page<CashDisputes.Dispute> page = Page.of(disputes.open(claims.actor(),
                PageCursor.decode(CashDisputes.OPEN, cursor), size + 1), size, CashDisputes::position);
        return new DisputeList(page.items(), page.page());
    }

    @GetMapping("/api/admin/v1/orders/{orderId}/cash-dispute")
    CashDisputes.Dispute get(AccessClaims claims, @PathVariable UUID orderId) {
        return disputes.get(claims.actor(), orderId);
    }

    @PostMapping("/api/admin/v1/orders/{orderId}/cash-dispute/decide")
    CashDisputes.Dispute decide(AccessClaims claims, @PathVariable UUID orderId, @Valid @RequestBody Decide body) {
        return disputes.decide(claims.actor(), body.commandId(), orderId, body.expectedVersion(), body.decision(),
                body.reason());
    }
}
