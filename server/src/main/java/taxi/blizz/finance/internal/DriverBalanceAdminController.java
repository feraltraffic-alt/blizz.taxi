package taxi.blizz.finance.internal;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
import taxi.blizz.finance.DriverBalances;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.platform.Page;
import taxi.blizz.platform.PageCursor;

/** The driver's balance: history, transfers (driver.v1.yaml) and top-ups, transfer rules (admin.v1.yaml), ADR 0010. */
@RestController
class DriverBalanceAdminController {

    private final DriverBalances balances;
    private final StaffAccess staff;

    DriverBalanceAdminController(DriverBalances balances, StaffAccess staff) {
        this.balances = balances;
        this.staff = staff;
    }

    record TopUp(@NotNull UUID commandId, @NotBlank String currency, @NotNull @Min(1) Long amountMinor,
                 @NotNull DriverBalances.TopUpKind kind, String reference, @NotBlank String reason) {
    }

    record TransferCommand(@NotNull UUID commandId, @NotBlank String toPhone, @NotBlank String currency,
                           @NotNull @Min(1) Long amountMinor, String comment) {
    }

    record Rules(List<DriverBalances.TransferRule> rules) {
    }

    record RuleChange(@NotNull UUID commandId, @NotNull @Min(0) Long expectedVersion, @NotNull Boolean enabled,
                      @NotNull Long maxPerTransferMinor, @NotNull Long maxPerDayMinor,
                      @NotNull Long minBalanceAfterMinor, @NotBlank String reason) {
    }

    /** The balances with one page of movements (REQ-API-09); {@code page} is new and optional for older clients. */
    record StatementPage(UUID driverId, List<DriverBalances.Balance> balances, List<DriverBalances.Entry> entries,
                         Page.Info page) {

        static StatementPage of(DriverBalances.Statement statement, int size) {
            Page<DriverBalances.Entry> page = Page.of(statement.entries(), size, DriverBalances::position);
            return new StatementPage(statement.driverId(), statement.balances(), page.items(), page.page());
        }
    }

    @GetMapping("/api/driver/v1/balance/history")
    StatementPage mine(AccessClaims claims, @RequestParam(required = false) String cursor,
                       @RequestParam(required = false) Integer limit) {
        int size = PageCursor.limit(limit);
        return StatementPage.of(balances.mine(claims.actor(), PageCursor.decode(DriverBalances.MOVEMENTS, cursor),
                size + 1), size);
    }

    @PostMapping("/api/driver/v1/transfers")
    @ResponseStatus(HttpStatus.CREATED)
    DriverBalances.Transfer transfer(AccessClaims claims, @Valid @RequestBody TransferCommand body) {
        return balances.transfer(claims.actor(), body.commandId(), body.toPhone(), body.currency(), body.amountMinor(),
                body.comment());
    }

    @GetMapping("/api/driver/v1/transfer-rules")
    Rules driverRules() {
        return new Rules(balances.transferRules());
    }

    @GetMapping("/api/admin/v1/drivers/{driverId}/balance")
    StatementPage of(AccessClaims claims, @PathVariable UUID driverId, @RequestParam(required = false) String cursor,
                     @RequestParam(required = false) Integer limit) {
        int size = PageCursor.limit(limit);
        return StatementPage.of(balances.of(claims.actor(), driverId,
                PageCursor.decode(DriverBalances.MOVEMENTS, cursor), size + 1), size);
    }

    @PostMapping("/api/admin/v1/drivers/{driverId}/balance/top-ups")
    @ResponseStatus(HttpStatus.CREATED)
    DriverBalances.Statement topUp(AccessClaims claims, @PathVariable UUID driverId, @Valid @RequestBody TopUp body) {
        return balances.topUp(claims.actor(), body.commandId(), driverId, body.currency(), body.amountMinor(),
                body.kind(), body.reference(), body.reason());
    }

    @GetMapping("/api/admin/v1/settings/driver-transfers")
    Rules adminRules(AccessClaims claims) {
        staff.require(claims.actor(), DriverBalances.MANAGE_PERMISSION);
        return new Rules(balances.transferRules());
    }

    @PostMapping("/api/admin/v1/settings/driver-transfers/{currency}")
    DriverBalances.TransferRule setRule(AccessClaims claims, @PathVariable String currency,
                                        @Valid @RequestBody RuleChange body) {
        return balances.setTransferRule(claims.actor(), body.commandId(), new DriverBalances.TransferRule(currency,
                body.enabled(), body.maxPerTransferMinor(), body.maxPerDayMinor(), body.minBalanceAfterMinor(), 0),
                body.expectedVersion(), body.reason());
    }
}
