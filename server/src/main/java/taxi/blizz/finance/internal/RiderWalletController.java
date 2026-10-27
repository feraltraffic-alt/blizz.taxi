package taxi.blizz.finance.internal;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.UUID;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.finance.RiderWallets;
import taxi.blizz.identity.AccessClaims;

/** The rider's virtual account (ADR 0009) — rider.v1.yaml and admin.v1.yaml. */
@RestController
class RiderWalletController {

    private final RiderWallets wallets;

    RiderWalletController(RiderWallets wallets) {
        this.wallets = wallets;
    }

    record TopUp(@NotNull UUID commandId, @NotBlank String currency, @NotNull @Min(1) Long amountMinor,
                 @NotBlank String reason) {
    }

    record Found(UUID clientId) {
    }

    @GetMapping("/api/rider/v1/wallet")
    RiderWallets.Wallet mine(AccessClaims claims, @RequestParam(defaultValue = "50") int limit) {
        return wallets.mine(claims.actor(), limit);
    }

    @GetMapping("/api/admin/v1/rider-wallets")
    Found find(AccessClaims claims, @RequestParam String phone) {
        return new Found(wallets.clientByPhone(claims.actor(), phone));
    }

    @GetMapping("/api/admin/v1/rider-wallets/{clientId}")
    RiderWallets.Wallet of(AccessClaims claims, @PathVariable UUID clientId,
                           @RequestParam(defaultValue = "50") int limit) {
        return wallets.of(claims.actor(), clientId, limit);
    }

    @PostMapping("/api/admin/v1/rider-wallets/{clientId}/top-ups")
    @ResponseStatus(HttpStatus.CREATED)
    RiderWallets.Wallet topUp(AccessClaims claims, @PathVariable UUID clientId, @Valid @RequestBody TopUp body) {
        return wallets.topUp(claims.actor(), body.commandId(), clientId, body.currency(), body.amountMinor(),
                body.reason());
    }
}
