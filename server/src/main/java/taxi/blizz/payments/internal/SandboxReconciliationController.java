package taxi.blizz.payments.internal;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import java.util.UUID;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.identity.StaffAccess;
import taxi.blizz.payments.PaymentReconciliations;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;

/** Independent bank-only fixtures, never local payment commands. */
@RestController
@Profile("sandbox")
class SandboxReconciliationController {
    private final FakeProvider.Gateway gateway;
    private final Merchants merchants;
    private final JdbcPaymentReconciliations views;
    private final StaffAccess staff;
    private final CardReconciliation reconciliation;
    SandboxReconciliationController(FakeProvider.Gateway gateway,Merchants merchants,JdbcPaymentReconciliations views,
                                    StaffAccess staff,CardReconciliation reconciliation) {
        this.gateway=gateway;this.merchants=merchants;this.views=views;this.staff=staff;this.reconciliation=reconciliation;
    }
    record Injection(@NotNull @Min(1) Long amountMinor,@NotNull @Pattern(regexp="[A-Z]{3}") String currency) { }

    record RunRequest(@NotNull UUID merchantId,@NotNull java.time.LocalDate day) { }
    @PostMapping("/sandbox/v1/payment-reconciliations/run")
    PaymentReconciliations.Run run(AccessClaims claims,@Valid @RequestBody RunRequest body) {
        Merchant merchant=allowed(claims,body.merchantId());
        return reconciliation.run(merchant.id(),body.day(),true);
    }

    @PostMapping("/sandbox/v1/payment-reconciliations/merchants/{merchant}/transactions/{fixture}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void inject(AccessClaims claims,@PathVariable UUID merchant,@PathVariable UUID fixture,
                @Valid @RequestBody Injection body) {
        Merchant bank=allowed(claims,merchant);
        try { gateway.injectReconciliationTransaction(bank.account(),fixture,body.amountMinor(),body.currency()); }
        catch (IllegalArgumentException ignored) { throw new DomainException(ErrorCode.STATE_CONFLICT,"Fixture already exists with different fields"); }
    }
    @DeleteMapping("/sandbox/v1/payment-reconciliations/merchants/{merchant}/transactions/{fixture}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void remove(AccessClaims claims,@PathVariable UUID merchant,@PathVariable UUID fixture) {
        gateway.removeReconciliationTransaction(allowed(claims,merchant).account(),fixture);
    }
    private Merchant allowed(AccessClaims claims,UUID id) {
        staff.require(claims.actor(),PaymentReconciliations.RESOLVE_PERMISSION);
        views.requireMerchant(claims.actor(),id);
        Merchant merchant=merchants.byId(id).orElseThrow(()->new DomainException(ErrorCode.NOT_FOUND,"Merchant not found"));
        if (!"FAKE".equals(merchant.provider())) throw new DomainException(ErrorCode.ACCESS_DENIED,"FAKE merchant required");
        return merchant;
    }
}
