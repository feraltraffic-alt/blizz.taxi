package taxi.blizz.finance.internal;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.finance.Ledger;
import taxi.blizz.identity.AccessClaims;

/** The driver's settlement balance with the service — packages/contracts/openapi/driver.v1.yaml. */
@RestController
class DriverBalanceController {

    private final Ledger ledger;

    DriverBalanceController(Ledger ledger) {
        this.ledger = ledger;
    }

    /** Positive: the service owes the driver; negative: the driver owes the service (e.g. cash commission). */
    record CurrencyBalance(String currency, long balanceMinor) {
    }

    record DriverBalance(List<CurrencyBalance> balances) {
    }

    @GetMapping("/api/driver/v1/balance")
    DriverBalance balance(AccessClaims claims) {
        return new DriverBalance(ledger.balances(Ledger.Account.DRIVER_PAYABLE, claims.actor().id()).stream()
                .map(b -> new CurrencyBalance(b.currency(), b.creditMinor() - b.debitMinor()))
                .toList());
    }
}
