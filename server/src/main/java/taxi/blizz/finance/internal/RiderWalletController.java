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
import taxi.blizz.finance.RiderWallets;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.platform.Page;
import taxi.blizz.platform.PageCursor;

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

    /** The account with one page of its movements (REQ-API-09); {@code page} is new and optional for older clients. */
    record WalletPage(UUID clientId, List<RiderWallets.Balance> balances, List<RiderWallets.Entry> entries,
                      Page.Info page) {

        static WalletPage of(RiderWallets.Wallet wallet, int size) {
            Page<RiderWallets.Entry> page = Page.of(wallet.entries(), size, RiderWallets::position);
            return new WalletPage(wallet.clientId(), wallet.balances(), page.items(), page.page());
        }
    }

    @GetMapping("/api/rider/v1/wallet")
    WalletPage mine(AccessClaims claims, @RequestParam(required = false) String cursor,
                    @RequestParam(required = false) Integer limit) {
        int size = PageCursor.limit(limit);
        return WalletPage.of(wallets.mine(claims.actor(), PageCursor.decode(RiderWallets.MOVEMENTS, cursor),
                size + 1), size);
    }

    @GetMapping("/api/admin/v1/rider-wallets")
    Found find(AccessClaims claims, @RequestParam String phone) {
        return new Found(wallets.clientByPhone(claims.actor(), phone));
    }

    @GetMapping("/api/admin/v1/rider-wallets/{clientId}")
    WalletPage of(AccessClaims claims, @PathVariable UUID clientId, @RequestParam(required = false) String cursor,
                  @RequestParam(required = false) Integer limit) {
        int size = PageCursor.limit(limit);
        return WalletPage.of(wallets.of(claims.actor(), clientId, PageCursor.decode(RiderWallets.MOVEMENTS, cursor),
                size + 1), size);
    }

    @PostMapping("/api/admin/v1/rider-wallets/{clientId}/top-ups")
    @ResponseStatus(HttpStatus.CREATED)
    RiderWallets.Wallet topUp(AccessClaims claims, @PathVariable UUID clientId, @Valid @RequestBody TopUp body) {
        return wallets.topUp(claims.actor(), body.commandId(), clientId, body.currency(), body.amountMinor(),
                body.reason());
    }
}
