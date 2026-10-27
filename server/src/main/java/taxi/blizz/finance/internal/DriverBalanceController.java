package taxi.blizz.finance.internal;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.finance.DriverDebts;
import taxi.blizz.finance.Ledger;
import taxi.blizz.identity.AccessClaims;

/** The driver's settlement balance with the service — packages/contracts/openapi/driver.v1.yaml. */
@RestController
class DriverBalanceController {

    private final Ledger ledger;
    private final DriverDebts debts;

    DriverBalanceController(Ledger ledger, DriverDebts debts) {
        this.ledger = ledger;
        this.debts = debts;
    }

    /**
     * {@code balanceMinor} positive: the service owes the driver; negative: the driver owes the service (e.g.
     * cash commission). {@code debtLimitMinor}: the admin's limit for the currency, null when none;
     * {@code blocked}: the debt is above it and new orders are not offered (REQ-PAY-16).
     */
    record CurrencyBalance(String currency, long balanceMinor, Long debtLimitMinor, boolean blocked) {
    }

    record DriverBalance(List<CurrencyBalance> balances) {
    }

    @GetMapping("/api/driver/v1/balance")
    DriverBalance balance(AccessClaims claims) {
        return new DriverBalance(ledger.balances(Ledger.Account.DRIVER_PAYABLE, claims.actor().id()).stream()
                .map(b -> {
                    DriverDebts.Status status = debts.statusOf(claims.actor().id()).stream()
                            .filter(st -> st.currency().equals(b.currency())).findFirst().orElse(null);
                    return new CurrencyBalance(b.currency(), b.creditMinor() - b.debitMinor(),
                            status == null ? debts.limit(b.currency()).limitMinor() : status.limitMinor(),
                            status != null && status.blocked());
                })
                .toList());
    }
}
